/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.opengl;

import overrungl.util.SymbolNotFoundError;

/// Similar to [SymbolNotFoundError], but prints a helpful message.
///
/// @since 0.1.0
public class GLSymbolNotFoundError extends SymbolNotFoundError {
    /**
     * Constructs a new error with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public GLSymbolNotFoundError(String message) {
        super(message + "\nThe OpenGL context couldn't get the address of the required function. Maybe the function is not supported by the graphics driver");
    }
}
