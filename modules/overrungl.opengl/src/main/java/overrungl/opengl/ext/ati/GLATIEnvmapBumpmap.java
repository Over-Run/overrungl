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
package overrungl.opengl.ext.ati;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ATI_envmap_bumpmap}
 */
public interface GLATIEnvmapBumpmap extends overrun.marshal.DirectAccess {
    int GL_BUMP_ROT_MATRIX_ATI = 0x8775;
    int GL_BUMP_ROT_MATRIX_SIZE_ATI = 0x8776;
    int GL_BUMP_NUM_TEX_UNITS_ATI = 0x8777;
    int GL_BUMP_TEX_UNITS_ATI = 0x8778;
    int GL_DUDV_ATI = 0x8779;
    int GL_DU8DV8_ATI = 0x877A;
    int GL_BUMP_ENVMAP_ATI = 0x877B;
    int GL_BUMP_TARGET_ATI = 0x877C;

    default void glTexBumpParameterivATI(int pname, @NativeType("const GLint *") MemorySegment param) {
        throw new ContextException();
    }

    default void glTexBumpParameterfvATI(int pname, @NativeType("const GLfloat *") MemorySegment param) {
        throw new ContextException();
    }

    default void glGetTexBumpParameterivATI(int pname, @NativeType("GLint *") MemorySegment param) {
        throw new ContextException();
    }

    default void glGetTexBumpParameterfvATI(int pname, @NativeType("GLfloat *") MemorySegment param) {
        throw new ContextException();
    }

}
