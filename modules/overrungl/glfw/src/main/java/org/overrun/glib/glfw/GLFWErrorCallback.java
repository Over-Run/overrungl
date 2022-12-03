/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.glfw;

import org.overrun.glib.RuntimeHelper;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * The GLFW error callback.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWErrorCallback {
    /**
     * Returns a {@link IGLFWErrorFun} instance that throws an {@link IllegalStateException} when an error occurs.
     *
     * @return the {@code GLFWerrorCallback}
     */
    public static IGLFWErrorFun createThrow() {
        return (errorCode, description) -> {
            throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", errorCode, description));
        };
    }

    /**
     * Returns a {@link IGLFWErrorFun} instance that logs a message when an error occurs.
     *
     * @param logger the logger function
     * @return the {@code GLFWerrorCallback}
     */
    public static IGLFWErrorFun createLog(Consumer<String> logger) {
        return (errorCode, description) -> {
            var sb = new StringBuilder(512);
            sb.append("[OverrunGL] GLFW_")
                    .append(GLFW.getErrorString(errorCode))
                    .append(" error: ")
                    .append(description)
                    .append("\n");
            var stack = Thread.currentThread().getStackTrace();
            for (int i = 3; i < stack.length; i++) {
                sb.append("    at ")
                        .append(stack[i])
                        .append("\n");
            }
            logger.accept(sb.toString());
        };
    }

    /**
     * Returns a {@link IGLFWErrorFun} instance that prints a message when an error occurs.
     *
     * @param stream the logger stream
     * @return the {@code GLFWerrorCallback}
     * @see #createPrint()
     */
    public static IGLFWErrorFun createPrint(PrintStream stream) {
        return createLog(stream::println);
    }

    /**
     * Returns a {@link IGLFWErrorFun} instance that prints a message to
     * {@link RuntimeHelper#apiLogger() default library logger} when an error occurs.
     *
     * @return the {@code GLFWerrorCallback}
     * @see #createPrint(PrintStream)
     */
    public static IGLFWErrorFun createPrint() {
        return createLog(RuntimeHelper.apiLogger());
    }
}
