// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_transpose_matrix`
public final class GLARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glLoadTransposeMatrixfARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLoadTransposeMatrixdARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultTransposeMatrixfARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultTransposeMatrixdARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glLoadTransposeMatrixfARB;
        public final MemorySegment PFN_glLoadTransposeMatrixdARB;
        public final MemorySegment PFN_glMultTransposeMatrixfARB;
        public final MemorySegment PFN_glMultTransposeMatrixdARB;
        private Handles(GLLoadFunc func) {
            PFN_glLoadTransposeMatrixfARB = func.invoke("glLoadTransposeMatrixfARB", "glLoadTransposeMatrixf");
            PFN_glLoadTransposeMatrixdARB = func.invoke("glLoadTransposeMatrixdARB", "glLoadTransposeMatrixd");
            PFN_glMultTransposeMatrixfARB = func.invoke("glMultTransposeMatrixfARB", "glMultTransposeMatrixf");
            PFN_glMultTransposeMatrixdARB = func.invoke("glMultTransposeMatrixdARB", "glMultTransposeMatrixd");
        }
    }

    public GLARBTransposeMatrix(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glLoadTransposeMatrixfARB`.
    /// ```
    /// void glLoadTransposeMatrixfARB(const GLfloat* m);
    /// ```
    public void LoadTransposeMatrixfARB(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadTransposeMatrixfARB)) throw new GLSymbolNotFoundError("Symbol not found: glLoadTransposeMatrixfARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadTransposeMatrixfARB", m); }
        Handles.MH_glLoadTransposeMatrixfARB.invokeExact(handles.PFN_glLoadTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadTransposeMatrixfARB", e); }
    }

    /// Invokes `glLoadTransposeMatrixdARB`.
    /// ```
    /// void glLoadTransposeMatrixdARB(const GLdouble* m);
    /// ```
    public void LoadTransposeMatrixdARB(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadTransposeMatrixdARB)) throw new GLSymbolNotFoundError("Symbol not found: glLoadTransposeMatrixdARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadTransposeMatrixdARB", m); }
        Handles.MH_glLoadTransposeMatrixdARB.invokeExact(handles.PFN_glLoadTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadTransposeMatrixdARB", e); }
    }

    /// Invokes `glMultTransposeMatrixfARB`.
    /// ```
    /// void glMultTransposeMatrixfARB(const GLfloat* m);
    /// ```
    public void MultTransposeMatrixfARB(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultTransposeMatrixfARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultTransposeMatrixfARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultTransposeMatrixfARB", m); }
        Handles.MH_glMultTransposeMatrixfARB.invokeExact(handles.PFN_glMultTransposeMatrixfARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultTransposeMatrixfARB", e); }
    }

    /// Invokes `glMultTransposeMatrixdARB`.
    /// ```
    /// void glMultTransposeMatrixdARB(const GLdouble* m);
    /// ```
    public void MultTransposeMatrixdARB(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultTransposeMatrixdARB)) throw new GLSymbolNotFoundError("Symbol not found: glMultTransposeMatrixdARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultTransposeMatrixdARB", m); }
        Handles.MH_glMultTransposeMatrixdARB.invokeExact(handles.PFN_glMultTransposeMatrixdARB, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultTransposeMatrixdARB", e); }
    }

}
