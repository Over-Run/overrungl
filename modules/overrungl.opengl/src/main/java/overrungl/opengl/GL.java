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

/**
 * The latest OpenGL functions in core profile.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GL extends GL46 {
    /// Creates an instance of OpenGL functions.
    ///
    /// @param function a function that returns the address of specific OpenGL function
    public GL(GLLoadFunc function) {
        super(function);
    }
}
