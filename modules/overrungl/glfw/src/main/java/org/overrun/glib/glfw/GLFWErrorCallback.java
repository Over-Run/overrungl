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

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * The GLFW error callback.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLFWErrorCallback {
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
     * @return the {@code GLFWerrorCallback}
     */
    public static IGLFWErrorFun createLog(Consumer<String> logger) {
        return (errorCode, description) -> {
            logger.accept("[OverrunGL] GLFW Error " + errorCode + " (" + GLFW.getErrorString(errorCode) + ")");
            logger.accept("\tDescription: " + description);
        };
    }

    /**
     * Returns a {@link IGLFWErrorFun} instance that prints a message when an error occurs.
     *
     * @return the {@code GLFWerrorCallback}
     * @see #createPrint()
     */
    public static IGLFWErrorFun createPrint(PrintStream stream) {
        return createLog(stream::println);
    }

    /**
     * Returns a {@link IGLFWErrorFun} instance that prints a message to standard error
     * when an error occurs.
     *
     * @return the {@code GLFWerrorCallback}
     * @see #createPrint(PrintStream)
     */
    public static IGLFWErrorFun createPrint() {
        return createPrint(System.err);
    }
}
