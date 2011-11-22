/*
 * Copyright 2000-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.groovy.lang.completion.weighers;

import com.intellij.openapi.util.Condition;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.ProximityLocation;
import com.intellij.psi.util.proximity.ReferenceListWeigher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.groovy.lang.psi.api.statements.typedef.GrReferenceList;
import org.jetbrains.plugins.groovy.lang.psi.api.statements.typedef.GrTypeDefinition;
import org.jetbrains.plugins.groovy.lang.psi.api.statements.typedef.members.GrMethod;
import org.jetbrains.plugins.groovy.lang.psi.api.types.GrCodeReferenceElement;

/**
 * @author peter
 */
public class GrReferenceListWeigher extends ReferenceListWeigher {
  @Override
  protected Condition<PsiClass> getPreferredCondition(@NotNull ProximityLocation location) {
    PsiElement position = location.getPosition();
    if (PlatformPatterns.psiElement().withParents(GrCodeReferenceElement.class, GrReferenceList.class).accepts(position)) {
      assert position != null;
      GrReferenceList list = (GrReferenceList)position.getParent().getParent();
      PsiElement parent = list.getParent();
      if (parent instanceof GrTypeDefinition) {
        GrTypeDefinition cls = (GrTypeDefinition)parent;
        if (cls.isInterface() && list == cls.getExtendsClause() || list == cls.getImplementsClause()) {
          return PREFER_INTERFACES;
        }
        if (list == cls.getExtendsClause()) {
          return PREFER_CLASSES;
        }
      }
      if (parent instanceof GrMethod && ((GrMethod)parent).getThrowsList() == list) {
        return PREFER_EXCEPTIONS;
      }
    }

    return null;
  }
}
