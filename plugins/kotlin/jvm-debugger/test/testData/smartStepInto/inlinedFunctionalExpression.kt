fun foo() {
    <caret>f1(fun () { })
}

inline fun f1(f: () -> Unit) {}

// EXISTS: f1(() -> Unit), f1: f.invoke()
