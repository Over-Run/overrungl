/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_histogram}
 */
public interface GLEXTHistogram extends overrun.marshal.DirectAccess {
    int GL_HISTOGRAM_EXT = 0x8024;
    int GL_PROXY_HISTOGRAM_EXT = 0x8025;
    int GL_HISTOGRAM_WIDTH_EXT = 0x8026;
    int GL_HISTOGRAM_FORMAT_EXT = 0x8027;
    int GL_HISTOGRAM_RED_SIZE_EXT = 0x8028;
    int GL_HISTOGRAM_GREEN_SIZE_EXT = 0x8029;
    int GL_HISTOGRAM_BLUE_SIZE_EXT = 0x802A;
    int GL_HISTOGRAM_ALPHA_SIZE_EXT = 0x802B;
    int GL_HISTOGRAM_LUMINANCE_SIZE_EXT = 0x802C;
    int GL_HISTOGRAM_SINK_EXT = 0x802D;
    int GL_MINMAX_EXT = 0x802E;
    int GL_MINMAX_FORMAT_EXT = 0x802F;
    int GL_MINMAX_SINK_EXT = 0x8030;
    int GL_TABLE_TOO_LARGE_EXT = 0x8031;

    default void glGetHistogramEXT(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetHistogramParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetHistogramParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMinmaxEXT(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetMinmaxParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMinmaxParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glHistogramEXT(int target, int width, int internalformat, boolean sink) {
        throw new ContextException();
    }

    default void glMinmaxEXT(int target, int internalformat, boolean sink) {
        throw new ContextException();
    }

    default void glResetHistogramEXT(int target) {
        throw new ContextException();
    }

    default void glResetMinmaxEXT(int target) {
        throw new ContextException();
    }

}
