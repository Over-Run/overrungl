tasks.withType<Javadoc> {
    options {
        if (this is StandardJavadocDocletOptions) {
            tags(
                "glfw.errors:m:Errors:",
                "glfw.remark:m:Remarks:",
                "glfw.thread_safety:m:\"Thread safety:\"",
                "glfw.warning:m:Warning:",
                "glfw.reentrancy:m:Reentrancy:",
                "glfw.pointer_lifetime:m:\"Pointer lifetime:\"",
                "glfw.callback_signature:m:\"Callback signature:\"",
                "glfw.note:m:Note:"
            )
        }
    }
}
