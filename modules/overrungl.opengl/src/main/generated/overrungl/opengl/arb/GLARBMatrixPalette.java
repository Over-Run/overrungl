// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_matrix_palette`
public final class GLARBMatrixPalette {
    public static final int GL_MATRIX_PALETTE_ARB = 0x8840;
    public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841;
    public static final int GL_MAX_PALETTE_MATRICES_ARB = 0x8842;
    public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 0x8843;
    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;
    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;
    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 0x8846;
    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 0x8847;
    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glCurrentPaletteMatrixARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glMatrixIndexubvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMatrixIndexusvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMatrixIndexuivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMatrixIndexPointerARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glCurrentPaletteMatrixARB;
        public final MemorySegment PFN_glMatrixIndexubvARB;
        public final MemorySegment PFN_glMatrixIndexusvARB;
        public final MemorySegment PFN_glMatrixIndexuivARB;
        public final MemorySegment PFN_glMatrixIndexPointerARB;
        private Handles(GLLoadFunc func) {
            PFN_glCurrentPaletteMatrixARB = func.invoke("glCurrentPaletteMatrixARB");
            PFN_glMatrixIndexubvARB = func.invoke("glMatrixIndexubvARB");
            PFN_glMatrixIndexusvARB = func.invoke("glMatrixIndexusvARB");
            PFN_glMatrixIndexuivARB = func.invoke("glMatrixIndexuivARB");
            PFN_glMatrixIndexPointerARB = func.invoke("glMatrixIndexPointerARB");
        }
    }

    public GLARBMatrixPalette(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCurrentPaletteMatrixARB`.
    /// ```
    /// void glCurrentPaletteMatrixARB((int) GLint index);
    /// ```
    public void CurrentPaletteMatrixARB(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCurrentPaletteMatrixARB)) throw new GLSymbolNotFoundError("Symbol not found: glCurrentPaletteMatrixARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCurrentPaletteMatrixARB", index); }
        Handles.MH_glCurrentPaletteMatrixARB.get().invokeExact(handles.PFN_glCurrentPaletteMatrixARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in CurrentPaletteMatrixARB", e); }
    }

    /// Invokes `glMatrixIndexubvARB`.
    /// ```
    /// void glMatrixIndexubvARB((int) GLint size, const GLubyte* indices);
    /// ```
    public void MatrixIndexubvARB(int size, @NonNull MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexubvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixIndexubvARB", size, indices); }
        Handles.MH_glMatrixIndexubvARB.get().invokeExact(handles.PFN_glMatrixIndexubvARB, size, indices); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexubvARB", e); }
    }

    /// Invokes `glMatrixIndexusvARB`.
    /// ```
    /// void glMatrixIndexusvARB((int) GLint size, const GLushort* indices);
    /// ```
    public void MatrixIndexusvARB(int size, @NonNull MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexusvARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexusvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixIndexusvARB", size, indices); }
        Handles.MH_glMatrixIndexusvARB.get().invokeExact(handles.PFN_glMatrixIndexusvARB, size, indices); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexusvARB", e); }
    }

    /// Invokes `glMatrixIndexuivARB`.
    /// ```
    /// void glMatrixIndexuivARB((int) GLint size, const GLuint* indices);
    /// ```
    public void MatrixIndexuivARB(int size, @NonNull MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixIndexuivARB", size, indices); }
        Handles.MH_glMatrixIndexuivARB.get().invokeExact(handles.PFN_glMatrixIndexuivARB, size, indices); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexuivARB", e); }
    }

    /// Invokes `glMatrixIndexPointerARB`.
    /// ```
    /// void glMatrixIndexPointerARB((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void MatrixIndexPointerARB(int size, int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixIndexPointerARB)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixIndexPointerARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMatrixIndexPointerARB", size, type, stride, pointer); }
        Handles.MH_glMatrixIndexPointerARB.get().invokeExact(handles.PFN_glMatrixIndexPointerARB, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixIndexPointerARB", e); }
    }

}
