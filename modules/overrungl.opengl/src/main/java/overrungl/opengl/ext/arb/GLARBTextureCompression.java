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
  * {@code GL_ARB_texture_compression}
  */
public final class GLARBTextureCompression {
    public static final int GL_COMPRESSED_ALPHA_ARB = 0x84E9;
    public static final int GL_COMPRESSED_LUMINANCE_ARB = 0x84EA;
    public static final int GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 0x84EB;
    public static final int GL_COMPRESSED_INTENSITY_ARB = 0x84EC;
    public static final int GL_COMPRESSED_RGB_ARB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA_ARB = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT_ARB = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED_ARB = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A3;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_texture_compression) return;
        ext.glCompressedTexImage3DARB = load.invoke("glCompressedTexImage3DARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTexImage2DARB = load.invoke("glCompressedTexImage2DARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTexImage1DARB = load.invoke("glCompressedTexImage1DARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTexSubImage3DARB = load.invoke("glCompressedTexSubImage3DARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTexSubImage2DARB = load.invoke("glCompressedTexSubImage2DARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTexSubImage1DARB = load.invoke("glCompressedTexSubImage1DARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCompressedTexImageARB = load.invoke("glGetCompressedTexImageARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glCompressedTexImage3DARB(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTexImage3DARB).invokeExact(target, level, internalFormat, width, height, depth, border, imageSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTexImage2DARB(int target, int level, int internalFormat, int width, int height, int border, int imageSize, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTexImage2DARB).invokeExact(target, level, internalFormat, width, height, border, imageSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTexImage1DARB(int target, int level, int internalFormat, int width, int border, int imageSize, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTexImage1DARB).invokeExact(target, level, internalFormat, width, border, imageSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTexSubImage3DARB).invokeExact(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTexSubImage2DARB).invokeExact(target, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, @NativeType("const void*") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTexSubImage1DARB).invokeExact(target, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCompressedTexImageARB(int target, int level, @NativeType("void*") MemorySegment img) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCompressedTexImageARB).invokeExact(target, level, img);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
