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
  * {@code GL_ARB_window_pos}
  */
public final class GLARBWindowPos {

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_window_pos) return;
        ext.glWindowPos2dARB = load.invoke("glWindowPos2dARB", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glWindowPos2dvARB = load.invoke("glWindowPos2dvARB", ofVoid(ADDRESS));
        ext.glWindowPos2fARB = load.invoke("glWindowPos2fARB", ofVoid(JAVA_FLOAT, JAVA_FLOAT));
        ext.glWindowPos2fvARB = load.invoke("glWindowPos2fvARB", ofVoid(ADDRESS));
        ext.glWindowPos2iARB = load.invoke("glWindowPos2iARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glWindowPos2ivARB = load.invoke("glWindowPos2ivARB", ofVoid(ADDRESS));
        ext.glWindowPos2sARB = load.invoke("glWindowPos2sARB", ofVoid(JAVA_SHORT, JAVA_SHORT));
        ext.glWindowPos2svARB = load.invoke("glWindowPos2svARB", ofVoid(ADDRESS));
        ext.glWindowPos3dARB = load.invoke("glWindowPos3dARB", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glWindowPos3dvARB = load.invoke("glWindowPos3dvARB", ofVoid(ADDRESS));
        ext.glWindowPos3fARB = load.invoke("glWindowPos3fARB", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glWindowPos3fvARB = load.invoke("glWindowPos3fvARB", ofVoid(ADDRESS));
        ext.glWindowPos3iARB = load.invoke("glWindowPos3iARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glWindowPos3ivARB = load.invoke("glWindowPos3ivARB", ofVoid(ADDRESS));
        ext.glWindowPos3sARB = load.invoke("glWindowPos3sARB", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glWindowPos3svARB = load.invoke("glWindowPos3svARB", ofVoid(ADDRESS));
    }

    public static void glWindowPos2dARB(double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2dARB).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2dvARB(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2dvARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2fARB(float x, float y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2fARB).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2fvARB(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2fvARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2iARB(int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2iARB).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2ivARB(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2ivARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2sARB(short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2sARB).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2svARB(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2svARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3dARB(double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3dARB).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3dvARB(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3dvARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3fARB(float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3fARB).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3fvARB(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3fvARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3iARB(int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3iARB).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3ivARB(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3ivARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3sARB(short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3sARB).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3svARB(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3svARB).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
