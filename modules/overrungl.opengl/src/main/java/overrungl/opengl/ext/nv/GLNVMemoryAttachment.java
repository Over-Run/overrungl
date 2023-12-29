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
 * {@code GL_NV_memory_attachment}
 */
public final class GLNVMemoryAttachment {
    public static final int GL_ATTACHED_MEMORY_OBJECT_NV = 0x95A4;
    public static final int GL_ATTACHED_MEMORY_OFFSET_NV = 0x95A5;
    public static final int GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 0x95A6;
    public static final int GL_MEMORY_ATTACHABLE_SIZE_NV = 0x95A7;
    public static final int GL_MEMORY_ATTACHABLE_NV = 0x95A8;
    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 0x95A9;
    public static final int GL_DETACHED_TEXTURES_NV = 0x95AA;
    public static final int GL_DETACHED_BUFFERS_NV = 0x95AB;
    public static final int GL_MAX_DETACHED_TEXTURES_NV = 0x95AC;
    public static final int GL_MAX_DETACHED_BUFFERS_NV = 0x95AD;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_memory_attachment) return;
        ext.glGetMemoryObjectDetachedResourcesuivNV = load.invoke("glGetMemoryObjectDetachedResourcesuivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glResetMemoryObjectParameterNV = load.invoke("glResetMemoryObjectParameterNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glTexAttachMemoryNV = load.invoke("glTexAttachMemoryNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glBufferAttachMemoryNV = load.invoke("glBufferAttachMemoryNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTextureAttachMemoryNV = load.invoke("glTextureAttachMemoryNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glNamedBufferAttachMemoryNV = load.invoke("glNamedBufferAttachMemoryNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
    }

    public static void glGetMemoryObjectDetachedResourcesuivNV(int memory, int pname, int first, int count, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMemoryObjectDetachedResourcesuivNV).invokeExact(memory, pname, first, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glResetMemoryObjectParameterNV(int memory, int pname) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResetMemoryObjectParameterNV).invokeExact(memory, pname);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexAttachMemoryNV(int target, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexAttachMemoryNV).invokeExact(target, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBufferAttachMemoryNV(int target, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferAttachMemoryNV).invokeExact(target, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureAttachMemoryNV(int texture, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureAttachMemoryNV).invokeExact(texture, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferAttachMemoryNV(int buffer, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferAttachMemoryNV).invokeExact(buffer, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
