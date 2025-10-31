// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_KHR_debug`
public final class GLKHRDebug {
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int GL_DEBUG_SOURCE_API = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int GL_BUFFER = 0x82E0;
    public static final int GL_SHADER = 0x82E1;
    public static final int GL_PROGRAM = 0x82E2;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_QUERY = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE = 0x82E4;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
    public static final int GL_DEBUG_OUTPUT = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int GL_STACK_OVERFLOW = 0x0503;
    public static final int GL_STACK_UNDERFLOW = 0x0504;
    public static final int GL_DISPLAY_LIST = 0x82E7;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDebugMessageControl = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glDebugMessageInsert = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallback = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLog = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPushDebugGroup = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPopDebugGroup = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glObjectLabel = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectLabel = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glObjectPtrLabel = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectPtrLabel = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointerv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDebugMessageControl;
        public final MemorySegment PFN_glDebugMessageInsert;
        public final MemorySegment PFN_glDebugMessageCallback;
        public final MemorySegment PFN_glGetDebugMessageLog;
        public final MemorySegment PFN_glPushDebugGroup;
        public final MemorySegment PFN_glPopDebugGroup;
        public final MemorySegment PFN_glObjectLabel;
        public final MemorySegment PFN_glGetObjectLabel;
        public final MemorySegment PFN_glObjectPtrLabel;
        public final MemorySegment PFN_glGetObjectPtrLabel;
        public final MemorySegment PFN_glGetPointerv;
        private Handles(GLLoadFunc func) {
            PFN_glDebugMessageControl = func.invoke("glDebugMessageControl", "glDebugMessageControlARB", "glDebugMessageControlKHR");
            PFN_glDebugMessageInsert = func.invoke("glDebugMessageInsert", "glDebugMessageInsertARB", "glDebugMessageInsertKHR");
            PFN_glDebugMessageCallback = func.invoke("glDebugMessageCallback", "glDebugMessageCallbackARB", "glDebugMessageCallbackKHR");
            PFN_glGetDebugMessageLog = func.invoke("glGetDebugMessageLog", "glGetDebugMessageLogARB", "glGetDebugMessageLogKHR");
            PFN_glPushDebugGroup = func.invoke("glPushDebugGroup", "glPushDebugGroupKHR");
            PFN_glPopDebugGroup = func.invoke("glPopDebugGroup", "glPopDebugGroupKHR");
            PFN_glObjectLabel = func.invoke("glObjectLabel", "glObjectLabelKHR");
            PFN_glGetObjectLabel = func.invoke("glGetObjectLabel", "glGetObjectLabelKHR");
            PFN_glObjectPtrLabel = func.invoke("glObjectPtrLabel", "glObjectPtrLabelKHR");
            PFN_glGetObjectPtrLabel = func.invoke("glGetObjectPtrLabel", "glGetObjectPtrLabelKHR");
            PFN_glGetPointerv = func.invoke("glGetPointerv", "glGetPointervEXT", "glGetPointervKHR");
        }
    }

    public GLKHRDebug(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDebugMessageControl`.
    /// ```
    /// void glDebugMessageControl((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLenum severity, (int) GLsizei count, const GLuint* ids, GLboolean enabled);
    /// ```
    public void DebugMessageControl(int source, int type, int severity, int count, @NonNull MemorySegment ids, boolean enabled) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageControl)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageControl");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageControl", source, type, severity, count, ids, enabled); }
        Handles.MH_glDebugMessageControl.invokeExact(handles.PFN_glDebugMessageControl, source, type, severity, count, ids, ((enabled) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageControl", e); }
    }

    /// Invokes `glDebugMessageInsert`.
    /// ```
    /// void glDebugMessageInsert((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* buf);
    /// ```
    public void DebugMessageInsert(int source, int type, int id, int severity, int length, @NonNull MemorySegment buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageInsert)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageInsert");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageInsert", source, type, id, severity, length, buf); }
        Handles.MH_glDebugMessageInsert.invokeExact(handles.PFN_glDebugMessageInsert, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageInsert", e); }
    }

    /// Invokes `glDebugMessageCallback`.
    /// ```
    /// void glDebugMessageCallback((void (*GLDebugProc)((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* message, const void* userParam)) GLDEBUGPROC callback, const void* userParam);
    /// ```
    public void DebugMessageCallback(@NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageCallback)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageCallback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageCallback", callback, userParam); }
        Handles.MH_glDebugMessageCallback.invokeExact(handles.PFN_glDebugMessageCallback, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageCallback", e); }
    }

    /// Invokes `glGetDebugMessageLog`.
    /// ```
    /// (unsigned int) GLuint glGetDebugMessageLog((unsigned int) GLuint count, (int) GLsizei bufSize, GLenum* sources, GLenum* types, GLuint* ids, GLenum* severities, GLsizei* lengths, GLchar* messageLog);
    /// ```
    public int GetDebugMessageLog(int count, int bufSize, @NonNull MemorySegment sources, @NonNull MemorySegment types, @NonNull MemorySegment ids, @NonNull MemorySegment severities, @NonNull MemorySegment lengths, @NonNull MemorySegment messageLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDebugMessageLog)) throw new GLSymbolNotFoundError("Symbol not found: glGetDebugMessageLog");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetDebugMessageLog", count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        return (int) Handles.MH_glGetDebugMessageLog.invokeExact(handles.PFN_glGetDebugMessageLog, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetDebugMessageLog", e); }
    }

    /// Invokes `glPushDebugGroup`.
    /// ```
    /// void glPushDebugGroup((unsigned int) GLenum source, (unsigned int) GLuint id, (int) GLsizei length, const GLchar* message);
    /// ```
    public void PushDebugGroup(int source, int id, int length, @NonNull MemorySegment message) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushDebugGroup)) throw new GLSymbolNotFoundError("Symbol not found: glPushDebugGroup");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPushDebugGroup", source, id, length, message); }
        Handles.MH_glPushDebugGroup.invokeExact(handles.PFN_glPushDebugGroup, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in PushDebugGroup", e); }
    }

    /// Invokes `glPopDebugGroup`.
    /// ```
    /// void glPopDebugGroup();
    /// ```
    public void PopDebugGroup() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPopDebugGroup)) throw new GLSymbolNotFoundError("Symbol not found: glPopDebugGroup");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPopDebugGroup"); }
        Handles.MH_glPopDebugGroup.invokeExact(handles.PFN_glPopDebugGroup); }
        catch (Throwable e) { throw new RuntimeException("error in PopDebugGroup", e); }
    }

    /// Invokes `glObjectLabel`.
    /// ```
    /// void glObjectLabel((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectLabel(int identifier, int name, int length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectLabel)) throw new GLSymbolNotFoundError("Symbol not found: glObjectLabel");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glObjectLabel", identifier, name, length, label); }
        Handles.MH_glObjectLabel.invokeExact(handles.PFN_glObjectLabel, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectLabel", e); }
    }

    /// Invokes `glGetObjectLabel`.
    /// ```
    /// void glGetObjectLabel((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectLabel(int identifier, int name, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectLabel)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectLabel");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectLabel", identifier, name, bufSize, length, label); }
        Handles.MH_glGetObjectLabel.invokeExact(handles.PFN_glGetObjectLabel, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectLabel", e); }
    }

    /// Invokes `glObjectPtrLabel`.
    /// ```
    /// void glObjectPtrLabel(const void* ptr, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectPtrLabel(@NonNull MemorySegment ptr, int length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPtrLabel)) throw new GLSymbolNotFoundError("Symbol not found: glObjectPtrLabel");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glObjectPtrLabel", ptr, length, label); }
        Handles.MH_glObjectPtrLabel.invokeExact(handles.PFN_glObjectPtrLabel, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPtrLabel", e); }
    }

    /// Invokes `glGetObjectPtrLabel`.
    /// ```
    /// void glGetObjectPtrLabel(const void* ptr, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectPtrLabel(@NonNull MemorySegment ptr, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectPtrLabel)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectPtrLabel");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectPtrLabel", ptr, bufSize, length, label); }
        Handles.MH_glGetObjectPtrLabel.invokeExact(handles.PFN_glGetObjectPtrLabel, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectPtrLabel", e); }
    }

    /// Invokes `glGetPointerv`.
    /// ```
    /// void glGetPointerv((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointerv(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointerv)) throw new GLSymbolNotFoundError("Symbol not found: glGetPointerv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPointerv", pname, params); }
        Handles.MH_glGetPointerv.invokeExact(handles.PFN_glGetPointerv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointerv", e); }
    }

}
