// "Add non-null asserted (list!!) call" "true"
// WITH_STDLIB

class C {
    val list: List<String>? = null
}

// Test for KTIJ-10052
fun C.test() {
    for (s in <caret>list) {}
}

// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix
// FUS_K2_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.AddExclExclCallFix