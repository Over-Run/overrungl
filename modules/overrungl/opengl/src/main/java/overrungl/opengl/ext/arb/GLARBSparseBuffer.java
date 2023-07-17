/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

// this file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;

import static overrungl.FunctionDescriptors.IJJZV;

/**
 * {@code GL_ARB_sparse_buffer}
 */
public final class GLARBSparseBuffer {
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_sparse_buffer) return;
        ext.glBufferPageCommitmentARB = load.invoke("glBufferPageCommitmentARB", IJJZV);
        ext.glNamedBufferPageCommitmentEXT = load.invoke("glNamedBufferPageCommitmentEXT", IJJZV);
        ext.glNamedBufferPageCommitmentARB = load.invoke("glNamedBufferPageCommitmentARB", IJJZV);
    }

    public static void glBufferPageCommitmentARB(int target, long offset, long size, byte commit) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glBufferPageCommitmentARB).invokeExact(target, offset, size, commit);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glNamedBufferPageCommitmentEXT(int buffer, long offset, long size, byte commit) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNamedBufferPageCommitmentEXT).invokeExact(buffer, offset, size, commit);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glNamedBufferPageCommitmentARB(int buffer, long offset, long size, byte commit) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNamedBufferPageCommitmentARB).invokeExact(buffer, offset, size, commit);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
