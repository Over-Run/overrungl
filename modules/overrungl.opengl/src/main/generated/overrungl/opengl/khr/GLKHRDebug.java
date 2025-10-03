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
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION_KHR = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM_KHR = 0x8245;
    public static final int GL_DEBUG_SOURCE_API_KHR = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER_KHR = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY_KHR = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION_KHR = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER_KHR = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR_KHR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY_KHR = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE_KHR = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER_KHR = 0x8251;
    public static final int GL_DEBUG_TYPE_MARKER_KHR = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP_KHR = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP_KHR = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION_KHR = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH_KHR = 0x826D;
    public static final int GL_BUFFER_KHR = 0x82E0;
    public static final int GL_SHADER_KHR = 0x82E1;
    public static final int GL_PROGRAM_KHR = 0x82E2;
    public static final int GL_VERTEX_ARRAY_KHR = 0x8074;
    public static final int GL_QUERY_KHR = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE_KHR = 0x82E4;
    public static final int GL_SAMPLER_KHR = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH_KHR = 0x82E8;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH_KHR = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES_KHR = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES_KHR = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH_KHR = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM_KHR = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW_KHR = 0x9148;
    public static final int GL_DEBUG_OUTPUT_KHR = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT_KHR = 0x00000002;
    public static final int GL_STACK_OVERFLOW_KHR = 0x0503;
    public static final int GL_STACK_UNDERFLOW_KHR = 0x0504;
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
        public static final MethodHandle MH_glDebugMessageControlKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glDebugMessageInsertKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallbackKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLogKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPushDebugGroupKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPopDebugGroupKHR = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glObjectLabelKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectLabelKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glObjectPtrLabelKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectPtrLabelKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointervKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
        public final MemorySegment PFN_glDebugMessageControlKHR;
        public final MemorySegment PFN_glDebugMessageInsertKHR;
        public final MemorySegment PFN_glDebugMessageCallbackKHR;
        public final MemorySegment PFN_glGetDebugMessageLogKHR;
        public final MemorySegment PFN_glPushDebugGroupKHR;
        public final MemorySegment PFN_glPopDebugGroupKHR;
        public final MemorySegment PFN_glObjectLabelKHR;
        public final MemorySegment PFN_glGetObjectLabelKHR;
        public final MemorySegment PFN_glObjectPtrLabelKHR;
        public final MemorySegment PFN_glGetObjectPtrLabelKHR;
        public final MemorySegment PFN_glGetPointervKHR;
        private Handles(GLLoadFunc func) {
            PFN_glDebugMessageControl = func.invoke("glDebugMessageControl");
            PFN_glDebugMessageInsert = func.invoke("glDebugMessageInsert");
            PFN_glDebugMessageCallback = func.invoke("glDebugMessageCallback");
            PFN_glGetDebugMessageLog = func.invoke("glGetDebugMessageLog");
            PFN_glPushDebugGroup = func.invoke("glPushDebugGroup");
            PFN_glPopDebugGroup = func.invoke("glPopDebugGroup");
            PFN_glObjectLabel = func.invoke("glObjectLabel");
            PFN_glGetObjectLabel = func.invoke("glGetObjectLabel");
            PFN_glObjectPtrLabel = func.invoke("glObjectPtrLabel");
            PFN_glGetObjectPtrLabel = func.invoke("glGetObjectPtrLabel");
            PFN_glGetPointerv = func.invoke("glGetPointerv");PFN_glDebugMessageControlKHR = func.invoke("glDebugMessageControlKHR", "glDebugMessageControl");
            PFN_glDebugMessageInsertKHR = func.invoke("glDebugMessageInsertKHR", "glDebugMessageInsert");
            PFN_glDebugMessageCallbackKHR = func.invoke("glDebugMessageCallbackKHR", "glDebugMessageCallback");
            PFN_glGetDebugMessageLogKHR = func.invoke("glGetDebugMessageLogKHR", "glGetDebugMessageLog");
            PFN_glPushDebugGroupKHR = func.invoke("glPushDebugGroupKHR", "glPushDebugGroup");
            PFN_glPopDebugGroupKHR = func.invoke("glPopDebugGroupKHR", "glPopDebugGroup");
            PFN_glObjectLabelKHR = func.invoke("glObjectLabelKHR", "glObjectLabel");
            PFN_glGetObjectLabelKHR = func.invoke("glGetObjectLabelKHR", "glGetObjectLabel");
            PFN_glObjectPtrLabelKHR = func.invoke("glObjectPtrLabelKHR", "glObjectPtrLabel");
            PFN_glGetObjectPtrLabelKHR = func.invoke("glGetObjectPtrLabelKHR", "glGetObjectPtrLabel");
            PFN_glGetPointervKHR = func.invoke("glGetPointervKHR", "glGetPointerv");
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

    /// Invokes `glDebugMessageControlKHR`.
    /// ```
    /// void glDebugMessageControlKHR((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLenum severity, (int) GLsizei count, const GLuint* ids, GLboolean enabled);
    /// ```
    public void DebugMessageControlKHR(int source, int type, int severity, int count, @NonNull MemorySegment ids, boolean enabled) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageControlKHR)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageControlKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageControlKHR", source, type, severity, count, ids, enabled); }
        Handles.MH_glDebugMessageControlKHR.invokeExact(handles.PFN_glDebugMessageControlKHR, source, type, severity, count, ids, ((enabled) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageControlKHR", e); }
    }

    /// Invokes `glDebugMessageInsertKHR`.
    /// ```
    /// void glDebugMessageInsertKHR((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* buf);
    /// ```
    public void DebugMessageInsertKHR(int source, int type, int id, int severity, int length, @NonNull MemorySegment buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageInsertKHR)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageInsertKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageInsertKHR", source, type, id, severity, length, buf); }
        Handles.MH_glDebugMessageInsertKHR.invokeExact(handles.PFN_glDebugMessageInsertKHR, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageInsertKHR", e); }
    }

    /// Invokes `glDebugMessageCallbackKHR`.
    /// ```
    /// void glDebugMessageCallbackKHR(((void (*GLDebugProc)((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* message, const void* userParam)) GLDEBUGPROC) GLDEBUGPROCKHR callback, const void* userParam);
    /// ```
    public void DebugMessageCallbackKHR(@NonNull MemorySegment callback, @NonNull MemorySegment userParam) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageCallbackKHR)) throw new GLSymbolNotFoundError("Symbol not found: glDebugMessageCallbackKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDebugMessageCallbackKHR", callback, userParam); }
        Handles.MH_glDebugMessageCallbackKHR.invokeExact(handles.PFN_glDebugMessageCallbackKHR, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageCallbackKHR", e); }
    }

    /// Invokes `glGetDebugMessageLogKHR`.
    /// ```
    /// (unsigned int) GLuint glGetDebugMessageLogKHR((unsigned int) GLuint count, (int) GLsizei bufSize, GLenum* sources, GLenum* types, GLuint* ids, GLenum* severities, GLsizei* lengths, GLchar* messageLog);
    /// ```
    public int GetDebugMessageLogKHR(int count, int bufSize, @NonNull MemorySegment sources, @NonNull MemorySegment types, @NonNull MemorySegment ids, @NonNull MemorySegment severities, @NonNull MemorySegment lengths, @NonNull MemorySegment messageLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDebugMessageLogKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetDebugMessageLogKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetDebugMessageLogKHR", count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        return (int) Handles.MH_glGetDebugMessageLogKHR.invokeExact(handles.PFN_glGetDebugMessageLogKHR, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetDebugMessageLogKHR", e); }
    }

    /// Invokes `glPushDebugGroupKHR`.
    /// ```
    /// void glPushDebugGroupKHR((unsigned int) GLenum source, (unsigned int) GLuint id, (int) GLsizei length, const GLchar* message);
    /// ```
    public void PushDebugGroupKHR(int source, int id, int length, @NonNull MemorySegment message) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushDebugGroupKHR)) throw new GLSymbolNotFoundError("Symbol not found: glPushDebugGroupKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPushDebugGroupKHR", source, id, length, message); }
        Handles.MH_glPushDebugGroupKHR.invokeExact(handles.PFN_glPushDebugGroupKHR, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in PushDebugGroupKHR", e); }
    }

    /// Invokes `glPopDebugGroupKHR`.
    /// ```
    /// void glPopDebugGroupKHR();
    /// ```
    public void PopDebugGroupKHR() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPopDebugGroupKHR)) throw new GLSymbolNotFoundError("Symbol not found: glPopDebugGroupKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPopDebugGroupKHR"); }
        Handles.MH_glPopDebugGroupKHR.invokeExact(handles.PFN_glPopDebugGroupKHR); }
        catch (Throwable e) { throw new RuntimeException("error in PopDebugGroupKHR", e); }
    }

    /// Invokes `glObjectLabelKHR`.
    /// ```
    /// void glObjectLabelKHR((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectLabelKHR(int identifier, int name, int length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectLabelKHR)) throw new GLSymbolNotFoundError("Symbol not found: glObjectLabelKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glObjectLabelKHR", identifier, name, length, label); }
        Handles.MH_glObjectLabelKHR.invokeExact(handles.PFN_glObjectLabelKHR, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectLabelKHR", e); }
    }

    /// Invokes `glGetObjectLabelKHR`.
    /// ```
    /// void glGetObjectLabelKHR((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectLabelKHR(int identifier, int name, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectLabelKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectLabelKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectLabelKHR", identifier, name, bufSize, length, label); }
        Handles.MH_glGetObjectLabelKHR.invokeExact(handles.PFN_glGetObjectLabelKHR, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectLabelKHR", e); }
    }

    /// Invokes `glObjectPtrLabelKHR`.
    /// ```
    /// void glObjectPtrLabelKHR(const void* ptr, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectPtrLabelKHR(@NonNull MemorySegment ptr, int length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPtrLabelKHR)) throw new GLSymbolNotFoundError("Symbol not found: glObjectPtrLabelKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glObjectPtrLabelKHR", ptr, length, label); }
        Handles.MH_glObjectPtrLabelKHR.invokeExact(handles.PFN_glObjectPtrLabelKHR, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPtrLabelKHR", e); }
    }

    /// Invokes `glGetObjectPtrLabelKHR`.
    /// ```
    /// void glGetObjectPtrLabelKHR(const void* ptr, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectPtrLabelKHR(@NonNull MemorySegment ptr, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectPtrLabelKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectPtrLabelKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectPtrLabelKHR", ptr, bufSize, length, label); }
        Handles.MH_glGetObjectPtrLabelKHR.invokeExact(handles.PFN_glGetObjectPtrLabelKHR, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectPtrLabelKHR", e); }
    }

    /// Invokes `glGetPointervKHR`.
    /// ```
    /// void glGetPointervKHR((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointervKHR(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointervKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetPointervKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPointervKHR", pname, params); }
        Handles.MH_glGetPointervKHR.invokeExact(handles.PFN_glGetPointervKHR, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointervKHR", e); }
    }

}
