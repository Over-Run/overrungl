// this file is auto-generated. DO NOT EDIT!
package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.*;
import org.overrun.glib.gl.*;
import java.lang.foreign.MemorySegment;
import static org.overrun.glib.FunctionDescriptors.*;

/**
 * {@code GL_ARB_shading_language_include}
 */
public final class GLARBShadingLanguageInclude {
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_shading_language_include) return;
        ext.glNamedStringARB = load.invoke("glNamedStringARB", IIPIPV);
        ext.glDeleteNamedStringARB = load.invoke("glDeleteNamedStringARB", IPV);
        ext.glCompileShaderIncludeARB = load.invoke("glCompileShaderIncludeARB", IIPPV);
        ext.glIsNamedStringARB = load.invoke("glIsNamedStringARB", IPZ);
        ext.glGetNamedStringARB = load.invoke("glGetNamedStringARB", IPIPPV);
        ext.glGetNamedStringivARB = load.invoke("glGetNamedStringivARB", IPIPV);
    }

    public static void glNamedStringARB(int type, int nameLen, MemorySegment name, int stringLen, MemorySegment string) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNamedStringARB).invokeExact(type, nameLen, name, stringLen, string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glDeleteNamedStringARB(int nameLen, MemorySegment name) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeleteNamedStringARB).invokeExact(nameLen, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glCompileShaderIncludeARB(int shader, int count, MemorySegment path, MemorySegment length) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glCompileShaderIncludeARB).invokeExact(shader, count, path, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static byte glIsNamedStringARB(int nameLen, MemorySegment name) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (byte) GLLoader.check(ext.glIsNamedStringARB).invokeExact(nameLen, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetNamedStringARB(int nameLen, MemorySegment name, int bufSize, MemorySegment stringLen, MemorySegment string) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetNamedStringARB).invokeExact(nameLen, name, bufSize, stringLen, string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetNamedStringivARB(int nameLen, MemorySegment name, int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetNamedStringivARB).invokeExact(nameLen, name, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
