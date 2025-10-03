// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_texture_storage`
public final class GLEXTTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 0x912F;
    public static final int GL_ALPHA8_EXT = 0x803C;
    public static final int GL_LUMINANCE8_EXT = 0x8040;
    public static final int GL_LUMINANCE8_ALPHA8_EXT = 0x8045;
    public static final int GL_RGBA32F_EXT = 0x8814;
    public static final int GL_RGB32F_EXT = 0x8815;
    public static final int GL_ALPHA32F_EXT = 0x8816;
    public static final int GL_LUMINANCE32F_EXT = 0x8818;
    public static final int GL_LUMINANCE_ALPHA32F_EXT = 0x8819;
    public static final int GL_RGBA16F_EXT = 0x881A;
    public static final int GL_RGB16F_EXT = 0x881B;
    public static final int GL_ALPHA16F_EXT = 0x881C;
    public static final int GL_LUMINANCE16F_EXT = 0x881E;
    public static final int GL_LUMINANCE_ALPHA16F_EXT = 0x881F;
    public static final int GL_RGB10_A2_EXT = 0x8059;
    public static final int GL_RGB10_EXT = 0x8052;
    public static final int GL_BGRA8_EXT = 0x93A1;
    public static final int GL_R8_EXT = 0x8229;
    public static final int GL_RG8_EXT = 0x822B;
    public static final int GL_R32F_EXT = 0x822E;
    public static final int GL_RG32F_EXT = 0x8230;
    public static final int GL_R16F_EXT = 0x822D;
    public static final int GL_RG16F_EXT = 0x822F;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTexStorage1DEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTexStorage2DEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTexStorage3DEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTextureStorage1DEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTextureStorage2DEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTextureStorage3DEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glTexStorage1DEXT;
        public final MemorySegment PFN_glTexStorage2DEXT;
        public final MemorySegment PFN_glTexStorage3DEXT;
        public final MemorySegment PFN_glTextureStorage1DEXT;
        public final MemorySegment PFN_glTextureStorage2DEXT;
        public final MemorySegment PFN_glTextureStorage3DEXT;
        private Handles(GLLoadFunc func) {
            PFN_glTexStorage1DEXT = func.invoke("glTexStorage1DEXT", "glTexStorage1D");
            PFN_glTexStorage2DEXT = func.invoke("glTexStorage2DEXT", "glTexStorage2D");
            PFN_glTexStorage3DEXT = func.invoke("glTexStorage3DEXT", "glTexStorage3D");PFN_glTextureStorage1DEXT = func.invoke("glTextureStorage1DEXT");
            PFN_glTextureStorage2DEXT = func.invoke("glTextureStorage2DEXT");
            PFN_glTextureStorage3DEXT = func.invoke("glTextureStorage3DEXT");
        }
    }

    public GLEXTTextureStorage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexStorage1DEXT`.
    /// ```
    /// void glTexStorage1DEXT((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width);
    /// ```
    public void TexStorage1DEXT(int target, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage1DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage1DEXT", target, levels, internalformat, width); }
        Handles.MH_glTexStorage1DEXT.get().invokeExact(handles.PFN_glTexStorage1DEXT, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage1DEXT", e); }
    }

    /// Invokes `glTexStorage2DEXT`.
    /// ```
    /// void glTexStorage2DEXT((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void TexStorage2DEXT(int target, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage2DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage2DEXT", target, levels, internalformat, width, height); }
        Handles.MH_glTexStorage2DEXT.get().invokeExact(handles.PFN_glTexStorage2DEXT, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage2DEXT", e); }
    }

    /// Invokes `glTexStorage3DEXT`.
    /// ```
    /// void glTexStorage3DEXT((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void TexStorage3DEXT(int target, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage3DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage3DEXT", target, levels, internalformat, width, height, depth); }
        Handles.MH_glTexStorage3DEXT.get().invokeExact(handles.PFN_glTexStorage3DEXT, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage3DEXT", e); }
    }

    /// Invokes `glTextureStorage1DEXT`.
    /// ```
    /// void glTextureStorage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width);
    /// ```
    public void TextureStorage1DEXT(int texture, int target, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage1DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage1DEXT", texture, target, levels, internalformat, width); }
        Handles.MH_glTextureStorage1DEXT.get().invokeExact(handles.PFN_glTextureStorage1DEXT, texture, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage1DEXT", e); }
    }

    /// Invokes `glTextureStorage2DEXT`.
    /// ```
    /// void glTextureStorage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void TextureStorage2DEXT(int texture, int target, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage2DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage2DEXT", texture, target, levels, internalformat, width, height); }
        Handles.MH_glTextureStorage2DEXT.get().invokeExact(handles.PFN_glTextureStorage2DEXT, texture, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2DEXT", e); }
    }

    /// Invokes `glTextureStorage3DEXT`.
    /// ```
    /// void glTextureStorage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void TextureStorage3DEXT(int texture, int target, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage3DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage3DEXT", texture, target, levels, internalformat, width, height, depth); }
        Handles.MH_glTextureStorage3DEXT.get().invokeExact(handles.PFN_glTextureStorage3DEXT, texture, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3DEXT", e); }
    }

}
