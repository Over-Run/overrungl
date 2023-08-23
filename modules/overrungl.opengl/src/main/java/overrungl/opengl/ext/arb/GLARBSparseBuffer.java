// this file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.FunctionDescriptor.ofVoid;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ARB_sparse_buffer}
  */
public final class GLARBSparseBuffer {
    public static final int GL_SPARSE_STORAGE_BIT_ARB = 0x0400;
    public static final int GL_SPARSE_BUFFER_PAGE_SIZE_ARB = 0x82F8;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_sparse_buffer) return;
        ext.glBufferPageCommitmentARB = load.invoke("glBufferPageCommitmentARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
        ext.glNamedBufferPageCommitmentEXT = load.invoke("glNamedBufferPageCommitmentEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
        ext.glNamedBufferPageCommitmentARB = load.invoke("glNamedBufferPageCommitmentARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_BYTE));
    }

    public static void glBufferPageCommitmentARB(int target, long offset, long size, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferPageCommitmentARB).invokeExact(target, offset, size, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferPageCommitmentEXT(int buffer, long offset, long size, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferPageCommitmentEXT).invokeExact(buffer, offset, size, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferPageCommitmentARB(int buffer, long offset, long size, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferPageCommitmentARB).invokeExact(buffer, offset, size, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
