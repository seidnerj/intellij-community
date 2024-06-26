// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.lang;

import com.intellij.openapi.project.PossiblyDumbAware;
import com.intellij.openapi.util.NlsContexts.HintText;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @see com.intellij.codeInsight.hint.actions.ShowExpressionTypeAction
 *
 * @author gregsh
 */
public abstract class ExpressionTypeProvider<T extends PsiElement> implements PossiblyDumbAware {
  /**
   * Returns HTML string for type info hint.
   * @see com.intellij.openapi.util.text.StringUtil#escapeXmlEntities(String)
   */
  public abstract @NotNull @HintText String getInformationHint(@NotNull T element);

  /**
   * Returns HTML string if no target found at position.
   */
  public abstract @NotNull @HintText String getErrorHint();

  /**
   * Returns the list of all possible targets at specified position.
   */
  public abstract @NotNull List<T> getExpressionsAt(@NotNull PsiElement elementAt);

  /**
   * @return true if this type provider can provide more useful information (e.g. value range, nullability, etc.)
   * on elements via {@link #getAdvancedInformationHint(PsiElement)}.
   */
  public boolean hasAdvancedInformation() {
    return false;
  }

  /**
   * Returns HTML string containing advanced type information hint (e.g. nullability, values range, etc.)
   *
   * @param element an element to provide information about
   * @return an advanced information hint. Should return the same result as {@link #getInformationHint(PsiElement)}
   * if no additional information is available for given element.
   * @throws UnsupportedOperationException if this provider does not provide any advanced information
   *                                       (in this case {@link #hasAdvancedInformation()} method must return false).
   */
  public @NotNull @HintText String getAdvancedInformationHint(@NotNull T element) {
    throw new UnsupportedOperationException();
  }
}
