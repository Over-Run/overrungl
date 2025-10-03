// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.mesa;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_MESA_framebuffer_flip_y`
public final class GLMESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFramebufferParameteriMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetFramebufferParameterivMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glFramebufferParameteriMESA;
        public final MemorySegment PFN_glGetFramebufferParameterivMESA;
        private Handles(GLLoadFunc func) {
            PFN_glFramebufferParameteriMESA = func.invoke("glFramebufferParameteriMESA");
            PFN_glGetFramebufferParameterivMESA = func.invoke("glGetFramebufferParameterivMESA");
        }
    }

    public GLMESAFramebufferFlipY(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFramebufferParameteriMESA`.
    /// ```
    /// void glFramebufferParameteriMESA((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FramebufferParameteriMESA(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferParameteriMESA)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferParameteriMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferParameteriMESA", target, pname, param); }
        Handles.MH_glFramebufferParameteriMESA.get().invokeExact(handles.PFN_glFramebufferParameteriMESA, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferParameteriMESA", e); }
    }

    /// Invokes `glGetFramebufferParameterivMESA`.
    /// ```
    /// void glGetFramebufferParameterivMESA((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferParameterivMESA(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameterivMESA)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferParameterivMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFramebufferParameterivMESA", target, pname, params); }
        Handles.MH_glGetFramebufferParameterivMESA.get().invokeExact(handles.PFN_glGetFramebufferParameterivMESA, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameterivMESA", e); }
    }

}
