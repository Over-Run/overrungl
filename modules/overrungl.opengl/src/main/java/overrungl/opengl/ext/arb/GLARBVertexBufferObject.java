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
  * {@code GL_ARB_vertex_buffer_object}
  */
public final class GLARBVertexBufferObject {
    public static final int GL_BUFFER_SIZE_ARB = 0x8764;
    public static final int GL_BUFFER_USAGE_ARB = 0x8765;
    public static final int GL_ARRAY_BUFFER_ARB = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER_ARB = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING_ARB = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING_ARB = 0x8895;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING_ARB = 0x8896;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING_ARB = 0x8897;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x8898;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING_ARB = 0x8899;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB = 0x889A;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB = 0x889B;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB = 0x889C;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB = 0x889D;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING_ARB = 0x889E;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB = 0x889F;
    public static final int GL_READ_ONLY_ARB = 0x88B8;
    public static final int GL_WRITE_ONLY_ARB = 0x88B9;
    public static final int GL_READ_WRITE_ARB = 0x88BA;
    public static final int GL_BUFFER_ACCESS_ARB = 0x88BB;
    public static final int GL_BUFFER_MAPPED_ARB = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER_ARB = 0x88BD;
    public static final int GL_STREAM_DRAW_ARB = 0x88E0;
    public static final int GL_STREAM_READ_ARB = 0x88E1;
    public static final int GL_STREAM_COPY_ARB = 0x88E2;
    public static final int GL_STATIC_DRAW_ARB = 0x88E4;
    public static final int GL_STATIC_READ_ARB = 0x88E5;
    public static final int GL_STATIC_COPY_ARB = 0x88E6;
    public static final int GL_DYNAMIC_DRAW_ARB = 0x88E8;
    public static final int GL_DYNAMIC_READ_ARB = 0x88E9;
    public static final int GL_DYNAMIC_COPY_ARB = 0x88EA;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_vertex_buffer_object) return;
        ext.glBindBufferARB = load.invoke("glBindBufferARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteBuffersARB = load.invoke("glDeleteBuffersARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenBuffersARB = load.invoke("glGenBuffersARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsBufferARB = load.invoke("glIsBufferARB", of(JAVA_BYTE, JAVA_INT));
        ext.glBufferDataARB = load.invoke("glBufferDataARB", ofVoid(JAVA_INT, JAVA_LONG, ADDRESS, JAVA_INT));
        ext.glBufferSubDataARB = load.invoke("glBufferSubDataARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
        ext.glGetBufferSubDataARB = load.invoke("glGetBufferSubDataARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
        ext.glMapBufferARB = load.invoke("glMapBufferARB", of(ADDRESS, JAVA_INT, JAVA_INT));
        ext.glUnmapBufferARB = load.invoke("glUnmapBufferARB", of(JAVA_BYTE, JAVA_INT));
        ext.glGetBufferParameterivARB = load.invoke("glGetBufferParameterivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetBufferPointervARB = load.invoke("glGetBufferPointervARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glBindBufferARB(int target, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindBufferARB).invokeExact(target, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteBuffersARB(int n, @NativeType("const GLuint*") MemorySegment buffers) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteBuffersARB).invokeExact(n, buffers);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenBuffersARB(int n, @NativeType("GLuint*") MemorySegment buffers) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenBuffersARB).invokeExact(n, buffers);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsBufferARB(int buffer) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsBufferARB).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBufferDataARB(int target, long size, @NativeType("const void*") MemorySegment data, int usage) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferDataARB).invokeExact(target, size, data, usage);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBufferSubDataARB(int target, long offset, long size, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferSubDataARB).invokeExact(target, offset, size, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetBufferSubDataARB(int target, long offset, long size, @NativeType("void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetBufferSubDataARB).invokeExact(target, offset, size, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static @NativeType("void*") MemorySegment glMapBufferARB(int target, int access) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glMapBufferARB).invokeExact(target, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glUnmapBufferARB(int target) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glUnmapBufferARB).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetBufferParameterivARB(int target, int pname, @NativeType("GLint*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetBufferParameterivARB).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetBufferPointervARB(int target, int pname, @NativeType("void**") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetBufferPointervARB).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
