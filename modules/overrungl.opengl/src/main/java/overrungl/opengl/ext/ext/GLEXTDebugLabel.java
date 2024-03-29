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
 * {@code GL_EXT_debug_label}
 */
public interface GLEXTDebugLabel extends overrun.marshal.DirectAccess {
    int GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;
    int GL_PROGRAM_OBJECT_EXT = 0x8B40;
    int GL_SHADER_OBJECT_EXT = 0x8B48;
    int GL_BUFFER_OBJECT_EXT = 0x9151;
    int GL_QUERY_OBJECT_EXT = 0x9153;
    int GL_VERTEX_ARRAY_OBJECT_EXT = 0x9154;

    default void glLabelObjectEXT(int type, int object, int length, @NativeType("const GLchar *") MemorySegment label) {
        throw new ContextException();
    }

    default void glGetObjectLabelEXT(int type, int object, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLchar *") MemorySegment label) {
        throw new ContextException();
    }

}
