/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

package overrungl.glfw;

import org.jspecify.annotations.NonNull;
import overrungl.OverrunGL;
import overrungl.util.MemoryUtil;

import java.io.PrintStream;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The {@linkplain GLFWErrorFun GLFW error callback} creator.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWErrorCallback {
    private GLFWErrorCallback() {
        //no instance
    }

    /**
     * {@return a {@link GLFWErrorFun} instance that throws an {@link IllegalStateException} when an error occurs}
     */
    public static @NonNull GLFWErrorFun createThrow() {
        return (errorCode, description) -> {
            throw new IllegalStateException("GLFW " + GLFW.glfwGetErrorString(errorCode) + " error [0x" + Integer.toHexString(errorCode) + "]: " + MemoryUtil.nativeString(description));
        };
    }

    /**
     * {@return a {@link GLFWErrorFun} instance that logs a message when an error occurs}
     *
     * @param logger the logger function.
     */
    public static @NonNull GLFWErrorFun createLog(@NonNull Consumer<String> logger) {
        Objects.requireNonNull(logger);
        return (errorCode, description) -> {
            var sb = new StringBuilder(512);
            sb.append("[OverrunGL] GLFW ")
                .append(GLFW.glfwGetErrorString(errorCode))
                .append(" error [0x")
                .append(Integer.toHexString(errorCode))
                .append("]: ")
                .append(MemoryUtil.nativeString(description)).append("\n");
            var stack = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : stack) {
                sb.append("    at ").append(element).append("\n");
            }
            logger.accept(sb.toString());
        };
    }

    /**
     * {@return a {@link GLFWErrorFun} instance that prints a message when an error occurs}
     *
     * @param stream the logger stream.
     * @see #createPrint()
     */
    public static @NonNull GLFWErrorFun createPrint(@NonNull PrintStream stream) {
        return createLog(stream::println);
    }

    /**
     * {@return a {@link GLFWErrorFun} instance that prints a message to
     * {@link OverrunGL#apiLogger() default library logger} when an error occurs}
     *
     * @see #createPrint(PrintStream)
     */
    public static @NonNull GLFWErrorFun createPrint() {
        return createLog(OverrunGL.apiLogger());
    }
}
