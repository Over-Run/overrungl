// this file is auto-generated. DO NOT EDIT!
package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.*;
import org.overrun.glib.gl.*;
import java.lang.foreign.MemorySegment;
import static org.overrun.glib.FunctionDescriptors.*;

/**
 * {@code GL_ARB_texture_buffer_object}
 */
public final class GLARBTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 0x8C2E;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 0x8C2B;
    public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;
    public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_texture_buffer_object) return;
        ext.glTexBufferARB = load.invoke("glTexBufferARB", IIIV);
    }

    public static void glTexBufferARB(int target, int internalFormat, int buffer) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTexBufferARB).invokeExact(target, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
