// IGNORE_K2
val a: Function2<Any, Int, String> = { a, b -> "" }
val b: kotlin.Function2<kotlin.Any, kotlin.Int, kotlin.String> = { a, b -> "" }
val c: <selection>(Any, Int) -> String</selection> = { a, b -> "" }
val d: (a: Any, n: Int) -> kotlin.String = { a, b -> "" }
val e: (String) -> Int = { 0 }
val f: () -> Int = { 0 }
val g: Any.(Int) -> String = { "" }
val h: Int.(Any) -> String = { "" }
val i: @ExtensionFunctionType Function3<Any, Any, Int, String> = { a, b -> "" }
val j: (t: Any, u: Int) -> kotlin.String = { a, b ->  "" }
val k: @ExtensionFunctionType Function2<Any, Int, String> = { "" }
