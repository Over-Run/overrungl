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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_memory_object_sparse}
 */
public final class GLNVMemoryObjectSparse {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_memory_object_sparse) return;
        ext.glBufferPageCommitmentMemNV = load.invoke("glBufferPageCommitmentMemNV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_LONG, JAVA_BYTE));
        ext.glTexPageCommitmentMemNV = load.invoke("glTexPageCommitmentMemNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_BYTE));
        ext.glNamedBufferPageCommitmentMemNV = load.invoke("glNamedBufferPageCommitmentMemNV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_LONG, JAVA_BYTE));
        ext.glTexturePageCommitmentMemNV = load.invoke("glTexturePageCommitmentMemNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_BYTE));
    }

    public static void glBufferPageCommitmentMemNV(int target, long offset, long size, int memory, long memOffset, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferPageCommitmentMemNV).invokeExact(target, offset, size, memory, memOffset, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexPageCommitmentMemNV(int target, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexPageCommitmentMemNV).invokeExact(target, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferPageCommitmentMemNV(int buffer, long offset, long size, int memory, long memOffset, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferPageCommitmentMemNV).invokeExact(buffer, offset, size, memory, memOffset, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexturePageCommitmentMemNV(int texture, int layer, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int memory, long offset, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexturePageCommitmentMemNV).invokeExact(texture, layer, level, xoffset, yoffset, zoffset, width, height, depth, memory, offset, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
