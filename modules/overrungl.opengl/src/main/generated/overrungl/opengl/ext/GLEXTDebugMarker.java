// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_debug_marker`
public final class GLEXTDebugMarker {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glInsertEventMarkerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glPushGroupMarkerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glPopGroupMarkerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glInsertEventMarkerEXT;
        public final MemorySegment PFN_glPushGroupMarkerEXT;
        public final MemorySegment PFN_glPopGroupMarkerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glInsertEventMarkerEXT = func.invoke("glInsertEventMarkerEXT");
            PFN_glPushGroupMarkerEXT = func.invoke("glPushGroupMarkerEXT");
            PFN_glPopGroupMarkerEXT = func.invoke("glPopGroupMarkerEXT");
        }
    }

    public GLEXTDebugMarker(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glInsertEventMarkerEXT`.
    /// ```
    /// void glInsertEventMarkerEXT((int) GLsizei length, const GLchar* marker);
    /// ```
    public void InsertEventMarkerEXT(int length, @NonNull MemorySegment marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInsertEventMarkerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glInsertEventMarkerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInsertEventMarkerEXT", length, marker); }
        Handles.MH_glInsertEventMarkerEXT.get().invokeExact(handles.PFN_glInsertEventMarkerEXT, length, marker); }
        catch (Throwable e) { throw new RuntimeException("error in InsertEventMarkerEXT", e); }
    }

    /// Invokes `glPushGroupMarkerEXT`.
    /// ```
    /// void glPushGroupMarkerEXT((int) GLsizei length, const GLchar* marker);
    /// ```
    public void PushGroupMarkerEXT(int length, @NonNull MemorySegment marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushGroupMarkerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPushGroupMarkerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPushGroupMarkerEXT", length, marker); }
        Handles.MH_glPushGroupMarkerEXT.get().invokeExact(handles.PFN_glPushGroupMarkerEXT, length, marker); }
        catch (Throwable e) { throw new RuntimeException("error in PushGroupMarkerEXT", e); }
    }

    /// Invokes `glPopGroupMarkerEXT`.
    /// ```
    /// void glPopGroupMarkerEXT();
    /// ```
    public void PopGroupMarkerEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPopGroupMarkerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPopGroupMarkerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPopGroupMarkerEXT"); }
        Handles.MH_glPopGroupMarkerEXT.get().invokeExact(handles.PFN_glPopGroupMarkerEXT); }
        catch (Throwable e) { throw new RuntimeException("error in PopGroupMarkerEXT", e); }
    }

}
