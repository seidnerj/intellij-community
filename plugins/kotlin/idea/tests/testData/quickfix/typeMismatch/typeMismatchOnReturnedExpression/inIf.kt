// "Change return type of enclosing function 'test' to 'Any'" "true"
class O
class P

fun test(b: Boolean): O = if (b) O() else P()<caret>

// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.ChangeCallableReturnTypeFix$ForEnclosing
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.k2.codeinsight.fixes.ChangeTypeQuickFixFactories$UpdateTypeQuickFix