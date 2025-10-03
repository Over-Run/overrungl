// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_depth_bounds_test`
public final class GLEXTDepthBoundsTest {
    public static final int GL_DEPTH_BOUNDS_TEST_EXT = 0x8890;
    public static final int GL_DEPTH_BOUNDS_EXT = 0x8891;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glDepthBoundsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public final MemorySegment PFN_glDepthBoundsEXT;
        private Handles(GLLoadFunc func) {
            PFN_glDepthBoundsEXT = func.invoke("glDepthBoundsEXT");
        }
    }

    public GLEXTDepthBoundsTest(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDepthBoundsEXT`.
    /// ```
    /// void glDepthBoundsEXT((double) GLclampd zmin, (double) GLclampd zmax);
    /// ```
    public void DepthBoundsEXT(double zmin, double zmax) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthBoundsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDepthBoundsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthBoundsEXT", zmin, zmax); }
        Handles.MH_glDepthBoundsEXT.get().invokeExact(handles.PFN_glDepthBoundsEXT, zmin, zmax); }
        catch (Throwable e) { throw new RuntimeException("error in DepthBoundsEXT", e); }
    }

}
