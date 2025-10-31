// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_texture_storage_multisample`
public final class GLARBTextureStorageMultisample {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexStorage2DMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexStorage3DMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public final MemorySegment PFN_glTexStorage2DMultisample;
        public final MemorySegment PFN_glTexStorage3DMultisample;
        private Handles(GLLoadFunc func) {
            PFN_glTexStorage2DMultisample = func.invoke("glTexStorage2DMultisample");
            PFN_glTexStorage3DMultisample = func.invoke("glTexStorage3DMultisample", "glTexStorage3DMultisampleOES");
        }
    }

    public GLARBTextureStorageMultisample(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexStorage2DMultisample`.
    /// ```
    /// void glTexStorage2DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage2DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage2DMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage2DMultisample", target, samples, internalformat, width, height, fixedsamplelocations); }
        Handles.MH_glTexStorage2DMultisample.invokeExact(handles.PFN_glTexStorage2DMultisample, target, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage2DMultisample", e); }
    }

    /// Invokes `glTexStorage3DMultisample`.
    /// ```
    /// void glTexStorage3DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage3DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorage3DMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorage3DMultisample", target, samples, internalformat, width, height, depth, fixedsamplelocations); }
        Handles.MH_glTexStorage3DMultisample.invokeExact(handles.PFN_glTexStorage3DMultisample, target, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage3DMultisample", e); }
    }

}
