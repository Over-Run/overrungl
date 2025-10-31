// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_texture_storage`
public final class GLARBTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexStorage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexStorage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexStorage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTexStorage1D;
        public final MemorySegment PFN_glTexStorage2D;
        public final MemorySegment PFN_glTexStorage3D;
        private Handles(GLLoadFunc func) {
            PFN_glTexStorage1D = func.invoke("glTexStorage1D", "glTexStorage1DEXT");
            PFN_glTexStorage2D = func.invoke("glTexStorage2D", "glTexStorage2DEXT");
            PFN_glTexStorage3D = func.invoke("glTexStorage3D", "glTexStorage3DEXT");
        }
    }

    public GLARBTextureStorage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexStorage1D`.
    /// ```
    /// void glTexStorage1D((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width);
    /// ```
    public void TexStorage1D(int target, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage1D)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage1D", target, levels, internalformat, width); }
        Handles.MH_glTexStorage1D.invokeExact(handles.PFN_glTexStorage1D, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage1D", e); }
    }

    /// Invokes `glTexStorage2D`.
    /// ```
    /// void glTexStorage2D((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void TexStorage2D(int target, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage2D)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage2D", target, levels, internalformat, width, height); }
        Handles.MH_glTexStorage2D.invokeExact(handles.PFN_glTexStorage2D, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage2D", e); }
    }

    /// Invokes `glTexStorage3D`.
    /// ```
    /// void glTexStorage3D((unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void TexStorage3D(int target, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage3D)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage3D", target, levels, internalformat, width, height, depth); }
        Handles.MH_glTexStorage3D.invokeExact(handles.PFN_glTexStorage3D, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage3D", e); }
    }

}
