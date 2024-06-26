// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.psi.impl.compiled;

import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.tree.TreeElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

class ClsPrefixExpressionImpl extends ClsElementImpl implements PsiPrefixExpression {
  private final ClsElementImpl myParent;
  private final PsiJavaToken myOperator;
  private final PsiExpression myOperand;

  ClsPrefixExpressionImpl(ClsElementImpl parent, PsiJavaToken sign, PsiExpression operand) {
    myParent = parent;
    myOperator = new ClsJavaTokenImpl(this, sign.getTokenType(), sign.getText());
    myOperand = ClsParsingUtil.psiToClsExpression(operand, this);
  }

  @Override
  public @NotNull PsiExpression getOperand() {
    return myOperand;
  }

  @Override
  public @NotNull PsiJavaToken getOperationSign() {
    return myOperator;
  }

  @Override
  public @NotNull IElementType getOperationTokenType() {
    return myOperator.getTokenType();
  }

  @Override
  public PsiType getType() {
    return myOperand.getType();
  }

  @Override
  public PsiElement getParent() {
    return myParent;
  }

  @Override
  public PsiElement @NotNull [] getChildren() {
    return new PsiElement[]{myOperator, myOperand};
  }

  @Override
  public String getText() {
    return StringUtil.join(myOperator.getText(), myOperand.getText());
  }

  @Override
  public void appendMirrorText(int indentLevel, @NotNull StringBuilder buffer) {
    buffer.append(getText());
  }

  @Override
  protected void setMirror(@NotNull TreeElement element) throws InvalidMirrorException {
    setMirrorCheckingType(element, null);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JavaElementVisitor) {
      ((JavaElementVisitor)visitor).visitPrefixExpression(this);
    }
    else {
      visitor.visitElement(this);
    }
  }

  @Override
  public String toString() {
    return "PsiPrefixExpression:" + getText();
  }
}
