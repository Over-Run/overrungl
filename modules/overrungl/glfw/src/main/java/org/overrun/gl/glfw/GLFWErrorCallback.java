/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
 */

package org.overrun.gl.glfw;

import org.overrun.gl.RuntimeHelper;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * The {@linkplain IGLFWErrorFun GLFW error callback} creator.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWErrorCallback {
    private GLFWErrorCallback() {
        //no instance
    }

    /**
     * {@return a {@link IGLFWErrorFun} instance that throws an {@link IllegalStateException} when an error occurs}
     */
    public static IGLFWErrorFun createThrow() {
        return (errorCode, description) -> {
            throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", errorCode, description));
        };
    }

    /**
     * {@return a {@link IGLFWErrorFun} instance that logs a message when an error occurs}
     *
     * @param logger the logger function.
     */
    public static IGLFWErrorFun createLog(Consumer<String> logger) {
        return (errorCode, description) -> {
            var sb = new StringBuilder(512);
            sb.append("[OverrunGL] GLFW ")
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
     * {@return a {@link IGLFWErrorFun} instance that prints a message when an error occurs}
     *
     * @param stream the logger stream.
     * @see #createPrint()
     */
    public static IGLFWErrorFun createPrint(PrintStream stream) {
        return createLog(stream::println);
    }

    /**
     * {@return a {@link IGLFWErrorFun} instance that prints a message to
     * {@link RuntimeHelper#apiLogger() default library logger} when an error occurs}
     *
     * @see #createPrint(PrintStream)
     */
    public static IGLFWErrorFun createPrint() {
        return createLog(RuntimeHelper.apiLogger());
    }
}
