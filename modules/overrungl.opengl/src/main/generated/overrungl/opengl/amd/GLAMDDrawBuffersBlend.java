// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_draw_buffers_blend`
public final class GLAMDDrawBuffersBlend {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBlendFuncIndexedAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBlendFuncSeparateIndexedAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBlendEquationIndexedAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBlendEquationSeparateIndexedAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glBlendFuncIndexedAMD;
        public final MemorySegment PFN_glBlendFuncSeparateIndexedAMD;
        public final MemorySegment PFN_glBlendEquationIndexedAMD;
        public final MemorySegment PFN_glBlendEquationSeparateIndexedAMD;
        private Handles(GLLoadFunc func) {
            PFN_glBlendFuncIndexedAMD = func.invoke("glBlendFuncIndexedAMD", "glBlendFunci");
            PFN_glBlendFuncSeparateIndexedAMD = func.invoke("glBlendFuncSeparateIndexedAMD", "glBlendFuncSeparatei");
            PFN_glBlendEquationIndexedAMD = func.invoke("glBlendEquationIndexedAMD", "glBlendEquationi");
            PFN_glBlendEquationSeparateIndexedAMD = func.invoke("glBlendEquationSeparateIndexedAMD", "glBlendEquationSeparatei");
        }
    }

    public GLAMDDrawBuffersBlend(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendFuncIndexedAMD`.
    /// ```
    /// void glBlendFuncIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum src, (unsigned int) GLenum dst);
    /// ```
    public void BlendFuncIndexedAMD(int buf, int src, int dst) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncIndexedAMD)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncIndexedAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFuncIndexedAMD", buf, src, dst); }
        Handles.MH_glBlendFuncIndexedAMD.get().invokeExact(handles.PFN_glBlendFuncIndexedAMD, buf, src, dst); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncIndexedAMD", e); }
    }

    /// Invokes `glBlendFuncSeparateIndexedAMD`.
    /// ```
    /// void glBlendFuncSeparateIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum srcRGB, (unsigned int) GLenum dstRGB, (unsigned int) GLenum srcAlpha, (unsigned int) GLenum dstAlpha);
    /// ```
    public void BlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparateIndexedAMD)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncSeparateIndexedAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFuncSeparateIndexedAMD", buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        Handles.MH_glBlendFuncSeparateIndexedAMD.get().invokeExact(handles.PFN_glBlendFuncSeparateIndexedAMD, buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparateIndexedAMD", e); }
    }

    /// Invokes `glBlendEquationIndexedAMD`.
    /// ```
    /// void glBlendEquationIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum mode);
    /// ```
    public void BlendEquationIndexedAMD(int buf, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationIndexedAMD)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationIndexedAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationIndexedAMD", buf, mode); }
        Handles.MH_glBlendEquationIndexedAMD.get().invokeExact(handles.PFN_glBlendEquationIndexedAMD, buf, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationIndexedAMD", e); }
    }

    /// Invokes `glBlendEquationSeparateIndexedAMD`.
    /// ```
    /// void glBlendEquationSeparateIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum modeRGB, (unsigned int) GLenum modeAlpha);
    /// ```
    public void BlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationSeparateIndexedAMD)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationSeparateIndexedAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationSeparateIndexedAMD", buf, modeRGB, modeAlpha); }
        Handles.MH_glBlendEquationSeparateIndexedAMD.get().invokeExact(handles.PFN_glBlendEquationSeparateIndexedAMD, buf, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationSeparateIndexedAMD", e); }
    }

}
