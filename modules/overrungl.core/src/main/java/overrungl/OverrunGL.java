/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Constants of OverrunGL.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class OverrunGL {
    /**
     * The version of OverrunGL.
     */
    public static final String VERSION = "0.1.0";
    /**
     * The version of GLFW native libraries.
     */
    public static final String GLFW_VERSION = "3.4.0.0";
    /**
     * The version of NFD native libraries.
     */
    public static final String NFD_VERSION = "0.1.0.0";
    /**
     * The version of STB native libraries.
     */
    public static final String STB_VERSION = "0.1.0.3";
    private static final Consumer<String> DEFAULT_LOGGER = System.err::println;
    private static Consumer<String> apiLogger = DEFAULT_LOGGER;

    private OverrunGL() {
        //no instance
    }

    /**
     * Sets the API logger.
     *
     * @param logger the logger. pass {@code null} to reset to the default logger.
     */
    public static void setApiLogger(Consumer<String> logger) {
        apiLogger = Objects.requireNonNullElse(logger, DEFAULT_LOGGER);
    }

    /**
     * {@return the API logger} Defaults to {@link System#err}.
     */
    public static Consumer<String> apiLogger() {
        return apiLogger;
    }

    /**
     * Logs a message with the current {@linkplain #apiLogger() API logger}.
     *
     * @param message the message to be logged.
     */
    public static void apiLog(String message) {
        apiLogger.accept(message);
    }
}
