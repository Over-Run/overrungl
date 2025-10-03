// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_point_sprite`
public final class GLNVPointSprite {
    public static final int GL_POINT_SPRITE_NV = 0x8861;
    public static final int GL_COORD_REPLACE_NV = 0x8862;
    public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPointParameteriNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glPointParameterivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glPointParameteriNV;
        public final MemorySegment PFN_glPointParameterivNV;
        private Handles(GLLoadFunc func) {
            PFN_glPointParameteriNV = func.invoke("glPointParameteriNV", "glPointParameteri");
            PFN_glPointParameterivNV = func.invoke("glPointParameterivNV", "glPointParameteriv");
        }
    }

    public GLNVPointSprite(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPointParameteriNV`.
    /// ```
    /// void glPointParameteriNV((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void PointParameteriNV(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameteriNV)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameteriNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameteriNV", pname, param); }
        Handles.MH_glPointParameteriNV.get().invokeExact(handles.PFN_glPointParameteriNV, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameteriNV", e); }
    }

    /// Invokes `glPointParameterivNV`.
    /// ```
    /// void glPointParameterivNV((unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void PointParameterivNV(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterivNV", pname, params); }
        Handles.MH_glPointParameterivNV.get().invokeExact(handles.PFN_glPointParameterivNV, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterivNV", e); }
    }

}
