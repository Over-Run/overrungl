// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_scissor_exclusive`
public final class GLNVScissorExclusive {
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glScissorExclusiveNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glScissorExclusiveArrayvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glScissorExclusiveNV;
        public final MemorySegment PFN_glScissorExclusiveArrayvNV;
        private Handles(GLLoadFunc func) {
            PFN_glScissorExclusiveNV = func.invoke("glScissorExclusiveNV");
            PFN_glScissorExclusiveArrayvNV = func.invoke("glScissorExclusiveArrayvNV");
        }
    }

    public GLNVScissorExclusive(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glScissorExclusiveNV`.
    /// ```
    /// void glScissorExclusiveNV((int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void ScissorExclusiveNV(int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorExclusiveNV)) throw new GLSymbolNotFoundError("Symbol not found: glScissorExclusiveNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glScissorExclusiveNV", x, y, width, height); }
        Handles.MH_glScissorExclusiveNV.get().invokeExact(handles.PFN_glScissorExclusiveNV, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorExclusiveNV", e); }
    }

    /// Invokes `glScissorExclusiveArrayvNV`.
    /// ```
    /// void glScissorExclusiveArrayvNV((unsigned int) GLuint first, (int) GLsizei count, const GLint* v);
    /// ```
    public void ScissorExclusiveArrayvNV(int first, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorExclusiveArrayvNV)) throw new GLSymbolNotFoundError("Symbol not found: glScissorExclusiveArrayvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glScissorExclusiveArrayvNV", first, count, v); }
        Handles.MH_glScissorExclusiveArrayvNV.get().invokeExact(handles.PFN_glScissorExclusiveArrayvNV, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorExclusiveArrayvNV", e); }
    }

}
