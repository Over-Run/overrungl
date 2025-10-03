// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_color_subtable`
public final class GLEXTColorSubtable {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glColorSubTableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glCopyColorSubTableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glColorSubTableEXT;
        public final MemorySegment PFN_glCopyColorSubTableEXT;
        private Handles(GLLoadFunc func) {
            PFN_glColorSubTableEXT = func.invoke("glColorSubTableEXT", "glColorSubTable");
            PFN_glCopyColorSubTableEXT = func.invoke("glCopyColorSubTableEXT", "glCopyColorSubTable");
        }
    }

    public GLEXTColorSubtable(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glColorSubTableEXT`.
    /// ```
    /// void glColorSubTableEXT((unsigned int) GLenum target, (int) GLsizei start, (int) GLsizei count, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ColorSubTableEXT(int target, int start, int count, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorSubTableEXT)) throw new GLSymbolNotFoundError("Symbol not found: glColorSubTableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorSubTableEXT", target, start, count, format, type, data); }
        Handles.MH_glColorSubTableEXT.get().invokeExact(handles.PFN_glColorSubTableEXT, target, start, count, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ColorSubTableEXT", e); }
    }

    /// Invokes `glCopyColorSubTableEXT`.
    /// ```
    /// void glCopyColorSubTableEXT((unsigned int) GLenum target, (int) GLsizei start, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyColorSubTableEXT(int target, int start, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyColorSubTableEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyColorSubTableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyColorSubTableEXT", target, start, x, y, width); }
        Handles.MH_glCopyColorSubTableEXT.get().invokeExact(handles.PFN_glCopyColorSubTableEXT, target, start, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyColorSubTableEXT", e); }
    }

}
