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

package overrungl.opengl;

import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemorySegment;

/**
 * The OpenGL loading function.
 * <h2>Example</h2>
 * {@snippet lang = java:
 * // loads OpenGL forward-compatible profile
 * gl = new GL(GLFW::glfwGetProcAddress);
 *}
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLLoadFunc {
    /**
     * Gets the function pointer of the given GL function.
     *
     * @param name the name of the function.
     * @return the function pointer.
     */
    MemorySegment invoke(MemorySegment name);

    /**
     * Gets the function pointer of the given GL function.
     *
     * @param name the name of the function.
     * @return the function pointer.
     */
    default MemorySegment invoke(String name) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.allocString(stack, name);
        }
    }

    /**
     * Gets the function pointer of the given GL function.
     *
     * @param name    the name of the function.
     * @param aliases the aliases to be used
     * @return the function pointer.
     */
    default MemorySegment invoke(String name, String... aliases) {
        MemorySegment p = invoke(name);
        if (!MemoryUtil.isNullPointer(p)) return p;
        for (String alias : aliases) {
            MemorySegment p1 = invoke(alias);
            if (!MemoryUtil.isNullPointer(p1)) return p1;
            break;
        }
        return MemorySegment.NULL;
    }
}
