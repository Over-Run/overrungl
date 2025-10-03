// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_compiled_vertex_array`
public final class GLEXTCompiledVertexArray {
    public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8;
    public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glLockArraysEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glUnlockArraysEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glLockArraysEXT;
        public final MemorySegment PFN_glUnlockArraysEXT;
        private Handles(GLLoadFunc func) {
            PFN_glLockArraysEXT = func.invoke("glLockArraysEXT");
            PFN_glUnlockArraysEXT = func.invoke("glUnlockArraysEXT");
        }
    }

    public GLEXTCompiledVertexArray(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glLockArraysEXT`.
    /// ```
    /// void glLockArraysEXT((int) GLint first, (int) GLsizei count);
    /// ```
    public void LockArraysEXT(int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLockArraysEXT)) throw new GLSymbolNotFoundError("Symbol not found: glLockArraysEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLockArraysEXT", first, count); }
        Handles.MH_glLockArraysEXT.get().invokeExact(handles.PFN_glLockArraysEXT, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in LockArraysEXT", e); }
    }

    /// Invokes `glUnlockArraysEXT`.
    /// ```
    /// void glUnlockArraysEXT();
    /// ```
    public void UnlockArraysEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnlockArraysEXT)) throw new GLSymbolNotFoundError("Symbol not found: glUnlockArraysEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUnlockArraysEXT"); }
        Handles.MH_glUnlockArraysEXT.get().invokeExact(handles.PFN_glUnlockArraysEXT); }
        catch (Throwable e) { throw new RuntimeException("error in UnlockArraysEXT", e); }
    }

}
