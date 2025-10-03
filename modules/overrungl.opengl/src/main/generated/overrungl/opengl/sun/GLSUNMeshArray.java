// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sun;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SUN_mesh_array`
public final class GLSUNMeshArray {
    public static final int GL_QUAD_MESH_SUN = 0x8614;
    public static final int GL_TRIANGLE_MESH_SUN = 0x8615;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDrawMeshArraysSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glDrawMeshArraysSUN;
        private Handles(GLLoadFunc func) {
            PFN_glDrawMeshArraysSUN = func.invoke("glDrawMeshArraysSUN");
        }
    }

    public GLSUNMeshArray(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawMeshArraysSUN`.
    /// ```
    /// void glDrawMeshArraysSUN((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count, (int) GLsizei width);
    /// ```
    public void DrawMeshArraysSUN(int mode, int first, int count, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawMeshArraysSUN)) throw new GLSymbolNotFoundError("Symbol not found: glDrawMeshArraysSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawMeshArraysSUN", mode, first, count, width); }
        Handles.MH_glDrawMeshArraysSUN.get().invokeExact(handles.PFN_glDrawMeshArraysSUN, mode, first, count, width); }
        catch (Throwable e) { throw new RuntimeException("error in DrawMeshArraysSUN", e); }
    }

}
