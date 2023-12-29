/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_bindable_uniform}
 */
public final class GLEXTBindableUniform {
    public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 0x8DE2;
    public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3;
    public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4;
    public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 0x8DED;
    public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;
    public static final int GL_UNIFORM_BUFFER_BINDING_EXT = 0x8DEF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_bindable_uniform) return;
        ext.glUniformBufferEXT = load.invoke("glUniformBufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetUniformBufferSizeEXT = load.invoke("glGetUniformBufferSizeEXT", of(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetUniformOffsetEXT = load.invoke("glGetUniformOffsetEXT", of(JAVA_LONG, JAVA_INT, JAVA_INT));
    }

    public static void glUniformBufferEXT(int program, int location, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformBufferEXT).invokeExact(program, location, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetUniformBufferSizeEXT(int program, int location) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetUniformBufferSizeEXT).invokeExact(program, location);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glGetUniformOffsetEXT(int program, int location) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetUniformOffsetEXT).invokeExact(program, location);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
