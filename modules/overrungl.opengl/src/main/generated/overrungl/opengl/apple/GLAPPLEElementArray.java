// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_element_array`
public final class GLAPPLEElementArray {
    public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
    public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
    public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glElementPointerAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDrawElementArrayAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawRangeElementArrayAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementArrayAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawRangeElementArrayAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glElementPointerAPPLE;
        public final MemorySegment PFN_glDrawElementArrayAPPLE;
        public final MemorySegment PFN_glDrawRangeElementArrayAPPLE;
        public final MemorySegment PFN_glMultiDrawElementArrayAPPLE;
        public final MemorySegment PFN_glMultiDrawRangeElementArrayAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glElementPointerAPPLE = func.invoke("glElementPointerAPPLE");
            PFN_glDrawElementArrayAPPLE = func.invoke("glDrawElementArrayAPPLE");
            PFN_glDrawRangeElementArrayAPPLE = func.invoke("glDrawRangeElementArrayAPPLE");
            PFN_glMultiDrawElementArrayAPPLE = func.invoke("glMultiDrawElementArrayAPPLE");
            PFN_glMultiDrawRangeElementArrayAPPLE = func.invoke("glMultiDrawRangeElementArrayAPPLE");
        }
    }

    public GLAPPLEElementArray(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glElementPointerAPPLE`.
    /// ```
    /// void glElementPointerAPPLE((unsigned int) GLenum type, const void* pointer);
    /// ```
    public void ElementPointerAPPLE(int type, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glElementPointerAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glElementPointerAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glElementPointerAPPLE", type, pointer); }
        Handles.MH_glElementPointerAPPLE.invokeExact(handles.PFN_glElementPointerAPPLE, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ElementPointerAPPLE", e); }
    }

    /// Invokes `glDrawElementArrayAPPLE`.
    /// ```
    /// void glDrawElementArrayAPPLE((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawElementArrayAPPLE(int mode, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementArrayAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementArrayAPPLE", mode, first, count); }
        Handles.MH_glDrawElementArrayAPPLE.invokeExact(handles.PFN_glDrawElementArrayAPPLE, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementArrayAPPLE", e); }
    }

    /// Invokes `glDrawRangeElementArrayAPPLE`.
    /// ```
    /// void glDrawRangeElementArrayAPPLE((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawRangeElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDrawRangeElementArrayAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawRangeElementArrayAPPLE", mode, start, end, first, count); }
        Handles.MH_glDrawRangeElementArrayAPPLE.invokeExact(handles.PFN_glDrawRangeElementArrayAPPLE, mode, start, end, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawRangeElementArrayAPPLE", e); }
    }

    /// Invokes `glMultiDrawElementArrayAPPLE`.
    /// ```
    /// void glMultiDrawElementArrayAPPLE((unsigned int) GLenum mode, const GLint* first, const GLsizei* count, (int) GLsizei primcount);
    /// ```
    public void MultiDrawElementArrayAPPLE(int mode, @NonNull MemorySegment first, @NonNull MemorySegment count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementArrayAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementArrayAPPLE", mode, first, count, primcount); }
        Handles.MH_glMultiDrawElementArrayAPPLE.invokeExact(handles.PFN_glMultiDrawElementArrayAPPLE, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementArrayAPPLE", e); }
    }

    /// Invokes `glMultiDrawRangeElementArrayAPPLE`.
    /// ```
    /// void glMultiDrawRangeElementArrayAPPLE((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, const GLint* first, const GLsizei* count, (int) GLsizei primcount);
    /// ```
    public void MultiDrawRangeElementArrayAPPLE(int mode, int start, int end, @NonNull MemorySegment first, @NonNull MemorySegment count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawRangeElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawRangeElementArrayAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawRangeElementArrayAPPLE", mode, start, end, first, count, primcount); }
        Handles.MH_glMultiDrawRangeElementArrayAPPLE.invokeExact(handles.PFN_glMultiDrawRangeElementArrayAPPLE, mode, start, end, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawRangeElementArrayAPPLE", e); }
    }

}
