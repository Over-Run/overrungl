// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_draw_buffers2`
public final class GLEXTDrawBuffers2 {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glColorMaskIndexedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glGetBooleanIndexedvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetIntegerIndexedvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glEnableIndexedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glDisableIndexedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glIsEnabledIndexedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glColorMaskIndexedEXT;
        public final MemorySegment PFN_glGetBooleanIndexedvEXT;
        public final MemorySegment PFN_glGetIntegerIndexedvEXT;
        public final MemorySegment PFN_glEnableIndexedEXT;
        public final MemorySegment PFN_glDisableIndexedEXT;
        public final MemorySegment PFN_glIsEnabledIndexedEXT;
        private Handles(GLLoadFunc func) {
            PFN_glColorMaskIndexedEXT = func.invoke("glColorMaskIndexedEXT", "glColorMaski");
            PFN_glGetBooleanIndexedvEXT = func.invoke("glGetBooleanIndexedvEXT", "glGetBooleani_v");
            PFN_glGetIntegerIndexedvEXT = func.invoke("glGetIntegerIndexedvEXT", "glGetIntegeri_v");
            PFN_glEnableIndexedEXT = func.invoke("glEnableIndexedEXT", "glEnablei");
            PFN_glDisableIndexedEXT = func.invoke("glDisableIndexedEXT", "glDisablei");
            PFN_glIsEnabledIndexedEXT = func.invoke("glIsEnabledIndexedEXT", "glIsEnabledi");
        }
    }

    public GLEXTDrawBuffers2(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glColorMaskIndexedEXT`.
    /// ```
    /// void glColorMaskIndexedEXT((unsigned int) GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a);
    /// ```
    public void ColorMaskIndexedEXT(int index, boolean r, boolean g, boolean b, boolean a) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorMaskIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glColorMaskIndexedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorMaskIndexedEXT", index, r, g, b, a); }
        Handles.MH_glColorMaskIndexedEXT.get().invokeExact(handles.PFN_glColorMaskIndexedEXT, index, ((r) ? (byte)1 : (byte)0), ((g) ? (byte)1 : (byte)0), ((b) ? (byte)1 : (byte)0), ((a) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in ColorMaskIndexedEXT", e); }
    }

    /// Invokes `glGetBooleanIndexedvEXT`.
    /// ```
    /// void glGetBooleanIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLboolean* data);
    /// ```
    public void GetBooleanIndexedvEXT(int target, int index, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBooleanIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetBooleanIndexedvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBooleanIndexedvEXT", target, index, data); }
        Handles.MH_glGetBooleanIndexedvEXT.get().invokeExact(handles.PFN_glGetBooleanIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBooleanIndexedvEXT", e); }
    }

    /// Invokes `glGetIntegerIndexedvEXT`.
    /// ```
    /// void glGetIntegerIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLint* data);
    /// ```
    public void GetIntegerIndexedvEXT(int target, int index, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegerIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegerIndexedvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetIntegerIndexedvEXT", target, index, data); }
        Handles.MH_glGetIntegerIndexedvEXT.get().invokeExact(handles.PFN_glGetIntegerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegerIndexedvEXT", e); }
    }

    /// Invokes `glEnableIndexedEXT`.
    /// ```
    /// void glEnableIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void EnableIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableIndexedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableIndexedEXT", target, index); }
        Handles.MH_glEnableIndexedEXT.get().invokeExact(handles.PFN_glEnableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableIndexedEXT", e); }
    }

    /// Invokes `glDisableIndexedEXT`.
    /// ```
    /// void glDisableIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void DisableIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableIndexedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableIndexedEXT", target, index); }
        Handles.MH_glDisableIndexedEXT.get().invokeExact(handles.PFN_glDisableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableIndexedEXT", e); }
    }

    /// Invokes `glIsEnabledIndexedEXT`.
    /// ```
    /// GLboolean glIsEnabledIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public boolean IsEnabledIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsEnabledIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsEnabledIndexedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsEnabledIndexedEXT", target, index); }
        return (((byte) Handles.MH_glIsEnabledIndexedEXT.get().invokeExact(handles.PFN_glIsEnabledIndexedEXT, target, index)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsEnabledIndexedEXT", e); }
    }

}
