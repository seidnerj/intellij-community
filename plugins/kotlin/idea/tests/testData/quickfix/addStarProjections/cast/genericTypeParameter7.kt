// "Change type arguments to <*>" "true"
fun <T> test7(list: List<*>) {
    val a = list as List<T><caret>
}
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.k2.codeinsight.fixes.ChangeToStarProjectionFixFactory$ChangeToStarProjectionFix