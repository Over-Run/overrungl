// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_vertex_weighting`
public final class GLEXTVertexWeighting {
    public static final int GL_MODELVIEW0_STACK_DEPTH_EXT = 0x0BA3;
    public static final int GL_MODELVIEW1_STACK_DEPTH_EXT = 0x8502;
    public static final int GL_MODELVIEW0_MATRIX_EXT = 0x0BA6;
    public static final int GL_MODELVIEW1_MATRIX_EXT = 0x8506;
    public static final int GL_VERTEX_WEIGHTING_EXT = 0x8509;
    public static final int GL_MODELVIEW0_EXT = 0x1700;
    public static final int GL_MODELVIEW1_EXT = 0x850A;
    public static final int GL_CURRENT_VERTEX_WEIGHT_EXT = 0x850B;
    public static final int GL_VERTEX_WEIGHT_ARRAY_EXT = 0x850C;
    public static final int GL_VERTEX_WEIGHT_ARRAY_SIZE_EXT = 0x850D;
    public static final int GL_VERTEX_WEIGHT_ARRAY_TYPE_EXT = 0x850E;
    public static final int GL_VERTEX_WEIGHT_ARRAY_STRIDE_EXT = 0x850F;
    public static final int GL_VERTEX_WEIGHT_ARRAY_POINTER_EXT = 0x8510;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glVertexWeightfEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glVertexWeightfvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexWeightPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glVertexWeightfEXT;
        public final MemorySegment PFN_glVertexWeightfvEXT;
        public final MemorySegment PFN_glVertexWeightPointerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glVertexWeightfEXT = func.invoke("glVertexWeightfEXT");
            PFN_glVertexWeightfvEXT = func.invoke("glVertexWeightfvEXT");
            PFN_glVertexWeightPointerEXT = func.invoke("glVertexWeightPointerEXT");
        }
    }

    public GLEXTVertexWeighting(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexWeightfEXT`.
    /// ```
    /// void glVertexWeightfEXT(((float) khronos_float_t) GLfloat weight);
    /// ```
    public void VertexWeightfEXT(float weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeightfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexWeightfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexWeightfEXT", weight); }
        Handles.MH_glVertexWeightfEXT.get().invokeExact(handles.PFN_glVertexWeightfEXT, weight); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeightfEXT", e); }
    }

    /// Invokes `glVertexWeightfvEXT`.
    /// ```
    /// void glVertexWeightfvEXT(const GLfloat* weight);
    /// ```
    public void VertexWeightfvEXT(@NonNull MemorySegment weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeightfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexWeightfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexWeightfvEXT", weight); }
        Handles.MH_glVertexWeightfvEXT.get().invokeExact(handles.PFN_glVertexWeightfvEXT, weight); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeightfvEXT", e); }
    }

    /// Invokes `glVertexWeightPointerEXT`.
    /// ```
    /// void glVertexWeightPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexWeightPointerEXT(int size, int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeightPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexWeightPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexWeightPointerEXT", size, type, stride, pointer); }
        Handles.MH_glVertexWeightPointerEXT.get().invokeExact(handles.PFN_glVertexWeightPointerEXT, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeightPointerEXT", e); }
    }

}
