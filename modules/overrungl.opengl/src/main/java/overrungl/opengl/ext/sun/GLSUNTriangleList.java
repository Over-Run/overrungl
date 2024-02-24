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
package overrungl.opengl.ext.sun;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SUN_triangle_list}
 */
public interface GLSUNTriangleList extends overrun.marshal.DirectAccess {
    int GL_RESTART_SUN = 0x0001;
    int GL_REPLACE_MIDDLE_SUN = 0x0002;
    int GL_REPLACE_OLDEST_SUN = 0x0003;
    int GL_TRIANGLE_LIST_SUN = 0x81D7;
    int GL_REPLACEMENT_CODE_SUN = 0x81D8;
    int GL_REPLACEMENT_CODE_ARRAY_SUN = 0x85C0;
    int GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN = 0x85C1;
    int GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN = 0x85C2;
    int GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN = 0x85C3;
    int GL_R1UI_V3F_SUN = 0x85C4;
    int GL_R1UI_C4UB_V3F_SUN = 0x85C5;
    int GL_R1UI_C3F_V3F_SUN = 0x85C6;
    int GL_R1UI_N3F_V3F_SUN = 0x85C7;
    int GL_R1UI_C4F_N3F_V3F_SUN = 0x85C8;
    int GL_R1UI_T2F_V3F_SUN = 0x85C9;
    int GL_R1UI_T2F_N3F_V3F_SUN = 0x85CA;
    int GL_R1UI_T2F_C4F_N3F_V3F_SUN = 0x85CB;

    default void glReplacementCodeuiSUN(int code) {
        throw new ContextException();
    }

    default void glReplacementCodeusSUN(short code) {
        throw new ContextException();
    }

    default void glReplacementCodeubSUN(byte code) {
        throw new ContextException();
    }

    default void glReplacementCodeuivSUN(@NativeType("const GLuint *") MemorySegment code) {
        throw new ContextException();
    }

    default void glReplacementCodeusvSUN(@NativeType("const GLushort *") MemorySegment code) {
        throw new ContextException();
    }

    default void glReplacementCodeubvSUN(@NativeType("const GLubyte *") MemorySegment code) {
        throw new ContextException();
    }

    default void glReplacementCodePointerSUN(int type, int stride, @NativeType("const void **") MemorySegment pointer) {
        throw new ContextException();
    }

}
