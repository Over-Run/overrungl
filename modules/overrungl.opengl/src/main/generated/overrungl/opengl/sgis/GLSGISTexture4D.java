// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_texture4D`
public final class GLSGISTexture4D {
    public static final int GL_PACK_SKIP_VOLUMES_SGIS = 0x8130;
    public static final int GL_PACK_IMAGE_DEPTH_SGIS = 0x8131;
    public static final int GL_UNPACK_SKIP_VOLUMES_SGIS = 0x8132;
    public static final int GL_UNPACK_IMAGE_DEPTH_SGIS = 0x8133;
    public static final int GL_TEXTURE_4D_SGIS = 0x8134;
    public static final int GL_PROXY_TEXTURE_4D_SGIS = 0x8135;
    public static final int GL_TEXTURE_4DSIZE_SGIS = 0x8136;
    public static final int GL_TEXTURE_WRAP_Q_SGIS = 0x8137;
    public static final int GL_MAX_4D_TEXTURE_SIZE_SGIS = 0x8138;
    public static final int GL_TEXTURE_4D_BINDING_SGIS = 0x814F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexImage4DSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexSubImage4DSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glTexImage4DSGIS;
        public final MemorySegment PFN_glTexSubImage4DSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glTexImage4DSGIS = func.invoke("glTexImage4DSGIS");
            PFN_glTexSubImage4DSGIS = func.invoke("glTexSubImage4DSGIS");
        }
    }

    public GLSGISTexture4D(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexImage4DSGIS`.
    /// ```
    /// void glTexImage4DSGIS((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLsizei size4d, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexImage4DSGIS(int target, int level, int internalformat, int width, int height, int depth, int size4d, int border, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexImage4DSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glTexImage4DSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexImage4DSGIS", target, level, internalformat, width, height, depth, size4d, border, format, type, pixels); }
        Handles.MH_glTexImage4DSGIS.invokeExact(handles.PFN_glTexImage4DSGIS, target, level, internalformat, width, height, depth, size4d, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexImage4DSGIS", e); }
    }

    /// Invokes `glTexSubImage4DSGIS`.
    /// ```
    /// void glTexSubImage4DSGIS((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLint woffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLsizei size4d, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexSubImage4DSGIS(int target, int level, int xoffset, int yoffset, int zoffset, int woffset, int width, int height, int depth, int size4d, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexSubImage4DSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glTexSubImage4DSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexSubImage4DSGIS", target, level, xoffset, yoffset, zoffset, woffset, width, height, depth, size4d, format, type, pixels); }
        Handles.MH_glTexSubImage4DSGIS.invokeExact(handles.PFN_glTexSubImage4DSGIS, target, level, xoffset, yoffset, zoffset, woffset, width, height, depth, size4d, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexSubImage4DSGIS", e); }
    }

}
