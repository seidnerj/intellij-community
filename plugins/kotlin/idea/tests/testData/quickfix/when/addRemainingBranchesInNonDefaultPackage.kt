// "Add remaining branches" "true"
// ERROR: Unresolved reference: TODO
// ERROR: Unresolved reference: TODO
package test
enum class Color { R, G, B }
fun test(c: Color) = wh<caret>en(c) {
    Color.B -> 0xff
}

// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.k2.codeinsight.fixes.AddWhenRemainingBranchFixFactories$AddRemainingWhenBranchesQuickFix