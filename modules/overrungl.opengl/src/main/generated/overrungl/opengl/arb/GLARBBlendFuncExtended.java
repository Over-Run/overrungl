// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_blend_func_extended`
public final class GLARBBlendFuncExtended {
    public static final int GL_SRC1_COLOR = 0x88F9;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBindFragDataLocationIndexed = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetFragDataIndex = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glBindFragDataLocationIndexed;
        public final MemorySegment PFN_glGetFragDataIndex;
        private Handles(GLLoadFunc func) {
            PFN_glBindFragDataLocationIndexed = func.invoke("glBindFragDataLocationIndexed");
            PFN_glGetFragDataIndex = func.invoke("glGetFragDataIndex");
        }
    }

    public GLARBBlendFuncExtended(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBindFragDataLocationIndexed`.
    /// ```
    /// void glBindFragDataLocationIndexed((unsigned int) GLuint program, (unsigned int) GLuint colorNumber, (unsigned int) GLuint index, const GLchar* name);
    /// ```
    public void BindFragDataLocationIndexed(int program, int colorNumber, int index, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFragDataLocationIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glBindFragDataLocationIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindFragDataLocationIndexed", program, colorNumber, index, name); }
        Handles.MH_glBindFragDataLocationIndexed.get().invokeExact(handles.PFN_glBindFragDataLocationIndexed, program, colorNumber, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in BindFragDataLocationIndexed", e); }
    }

    /// Invokes `glGetFragDataIndex`.
    /// ```
    /// (int) GLint glGetFragDataIndex((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public int GetFragDataIndex(int program, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragDataIndex)) throw new GLSymbolNotFoundError("Symbol not found: glGetFragDataIndex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFragDataIndex", program, name); }
        return (int) Handles.MH_glGetFragDataIndex.get().invokeExact(handles.PFN_glGetFragDataIndex, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragDataIndex", e); }
    }

}
