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
package overrungl.opengl.ext.ati;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ATI_envmap_bumpmap}
 */
public final class GLATIEnvmapBumpmap {
    public static final int GL_BUMP_ROT_MATRIX_ATI = 0x8775;
    public static final int GL_BUMP_ROT_MATRIX_SIZE_ATI = 0x8776;
    public static final int GL_BUMP_NUM_TEX_UNITS_ATI = 0x8777;
    public static final int GL_BUMP_TEX_UNITS_ATI = 0x8778;
    public static final int GL_DUDV_ATI = 0x8779;
    public static final int GL_DU8DV8_ATI = 0x877A;
    public static final int GL_BUMP_ENVMAP_ATI = 0x877B;
    public static final int GL_BUMP_TARGET_ATI = 0x877C;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_envmap_bumpmap) return;
        ext.glTexBumpParameterivATI = load.invoke("glTexBumpParameterivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glTexBumpParameterfvATI = load.invoke("glTexBumpParameterfvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetTexBumpParameterivATI = load.invoke("glGetTexBumpParameterivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetTexBumpParameterfvATI = load.invoke("glGetTexBumpParameterfvATI", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glTexBumpParameterivATI(int pname, @NativeType("const GLint *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexBumpParameterivATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexBumpParameterfvATI(int pname, @NativeType("const GLfloat *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexBumpParameterfvATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexBumpParameterivATI(int pname, @NativeType("GLint *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexBumpParameterivATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexBumpParameterfvATI(int pname, @NativeType("GLfloat *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexBumpParameterfvATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
