// this file is auto-generated. DO NOT EDIT!
package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.*;
import org.overrun.glib.gl.*;
import java.lang.foreign.MemorySegment;
import static org.overrun.glib.FunctionDescriptors.*;

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
