// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_performance_monitor`
public final class GLAMDPerformanceMonitor {
    public static final int GL_COUNTER_TYPE_AMD = 0x8BC0;
    public static final int GL_COUNTER_RANGE_AMD = 0x8BC1;
    public static final int GL_UNSIGNED_INT64_AMD = 0x8BC2;
    public static final int GL_PERCENTAGE_AMD = 0x8BC3;
    public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
    public static final int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
    public static final int GL_PERFMON_RESULT_AMD = 0x8BC6;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glGetPerfMonitorGroupsAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPerfMonitorCountersAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPerfMonitorGroupStringAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPerfMonitorCounterStringAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetPerfMonitorCounterInfoAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGenPerfMonitorsAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeletePerfMonitorsAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSelectPerfMonitorCountersAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glBeginPerfMonitorAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEndPerfMonitorAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetPerfMonitorCounterDataAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glGetPerfMonitorGroupsAMD;
        public final MemorySegment PFN_glGetPerfMonitorCountersAMD;
        public final MemorySegment PFN_glGetPerfMonitorGroupStringAMD;
        public final MemorySegment PFN_glGetPerfMonitorCounterStringAMD;
        public final MemorySegment PFN_glGetPerfMonitorCounterInfoAMD;
        public final MemorySegment PFN_glGenPerfMonitorsAMD;
        public final MemorySegment PFN_glDeletePerfMonitorsAMD;
        public final MemorySegment PFN_glSelectPerfMonitorCountersAMD;
        public final MemorySegment PFN_glBeginPerfMonitorAMD;
        public final MemorySegment PFN_glEndPerfMonitorAMD;
        public final MemorySegment PFN_glGetPerfMonitorCounterDataAMD;
        private Handles(GLLoadFunc func) {
            PFN_glGetPerfMonitorGroupsAMD = func.invoke("glGetPerfMonitorGroupsAMD");
            PFN_glGetPerfMonitorCountersAMD = func.invoke("glGetPerfMonitorCountersAMD");
            PFN_glGetPerfMonitorGroupStringAMD = func.invoke("glGetPerfMonitorGroupStringAMD");
            PFN_glGetPerfMonitorCounterStringAMD = func.invoke("glGetPerfMonitorCounterStringAMD");
            PFN_glGetPerfMonitorCounterInfoAMD = func.invoke("glGetPerfMonitorCounterInfoAMD");
            PFN_glGenPerfMonitorsAMD = func.invoke("glGenPerfMonitorsAMD");
            PFN_glDeletePerfMonitorsAMD = func.invoke("glDeletePerfMonitorsAMD");
            PFN_glSelectPerfMonitorCountersAMD = func.invoke("glSelectPerfMonitorCountersAMD");
            PFN_glBeginPerfMonitorAMD = func.invoke("glBeginPerfMonitorAMD");
            PFN_glEndPerfMonitorAMD = func.invoke("glEndPerfMonitorAMD");
            PFN_glGetPerfMonitorCounterDataAMD = func.invoke("glGetPerfMonitorCounterDataAMD");
        }
    }

    public GLAMDPerformanceMonitor(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetPerfMonitorGroupsAMD`.
    /// ```
    /// void glGetPerfMonitorGroupsAMD(GLint* numGroups, (int) GLsizei groupsSize, GLuint* groups);
    /// ```
    public void GetPerfMonitorGroupsAMD(@NonNull MemorySegment numGroups, int groupsSize, @NonNull MemorySegment groups) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorGroupsAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupsAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorGroupsAMD", numGroups, groupsSize, groups); }
        Handles.MH_glGetPerfMonitorGroupsAMD.get().invokeExact(handles.PFN_glGetPerfMonitorGroupsAMD, numGroups, groupsSize, groups); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorGroupsAMD", e); }
    }

    /// Invokes `glGetPerfMonitorCountersAMD`.
    /// ```
    /// void glGetPerfMonitorCountersAMD((unsigned int) GLuint group, GLint* numCounters, GLint* maxActiveCounters, (int) GLsizei counterSize, GLuint* counters);
    /// ```
    public void GetPerfMonitorCountersAMD(int group, @NonNull MemorySegment numCounters, @NonNull MemorySegment maxActiveCounters, int counterSize, @NonNull MemorySegment counters) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCountersAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCountersAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCountersAMD", group, numCounters, maxActiveCounters, counterSize, counters); }
        Handles.MH_glGetPerfMonitorCountersAMD.get().invokeExact(handles.PFN_glGetPerfMonitorCountersAMD, group, numCounters, maxActiveCounters, counterSize, counters); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCountersAMD", e); }
    }

    /// Invokes `glGetPerfMonitorGroupStringAMD`.
    /// ```
    /// void glGetPerfMonitorGroupStringAMD((unsigned int) GLuint group, (int) GLsizei bufSize, GLsizei* length, GLchar* groupString);
    /// ```
    public void GetPerfMonitorGroupStringAMD(int group, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment groupString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorGroupStringAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupStringAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorGroupStringAMD", group, bufSize, length, groupString); }
        Handles.MH_glGetPerfMonitorGroupStringAMD.get().invokeExact(handles.PFN_glGetPerfMonitorGroupStringAMD, group, bufSize, length, groupString); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorGroupStringAMD", e); }
    }

    /// Invokes `glGetPerfMonitorCounterStringAMD`.
    /// ```
    /// void glGetPerfMonitorCounterStringAMD((unsigned int) GLuint group, (unsigned int) GLuint counter, (int) GLsizei bufSize, GLsizei* length, GLchar* counterString);
    /// ```
    public void GetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment counterString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCounterStringAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterStringAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCounterStringAMD", group, counter, bufSize, length, counterString); }
        Handles.MH_glGetPerfMonitorCounterStringAMD.get().invokeExact(handles.PFN_glGetPerfMonitorCounterStringAMD, group, counter, bufSize, length, counterString); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCounterStringAMD", e); }
    }

    /// Invokes `glGetPerfMonitorCounterInfoAMD`.
    /// ```
    /// void glGetPerfMonitorCounterInfoAMD((unsigned int) GLuint group, (unsigned int) GLuint counter, (unsigned int) GLenum pname, void* data);
    /// ```
    public void GetPerfMonitorCounterInfoAMD(int group, int counter, int pname, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCounterInfoAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterInfoAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCounterInfoAMD", group, counter, pname, data); }
        Handles.MH_glGetPerfMonitorCounterInfoAMD.get().invokeExact(handles.PFN_glGetPerfMonitorCounterInfoAMD, group, counter, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCounterInfoAMD", e); }
    }

    /// Invokes `glGenPerfMonitorsAMD`.
    /// ```
    /// void glGenPerfMonitorsAMD((int) GLsizei n, GLuint* monitors);
    /// ```
    public void GenPerfMonitorsAMD(int n, @NonNull MemorySegment monitors) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenPerfMonitorsAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGenPerfMonitorsAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenPerfMonitorsAMD", n, monitors); }
        Handles.MH_glGenPerfMonitorsAMD.get().invokeExact(handles.PFN_glGenPerfMonitorsAMD, n, monitors); }
        catch (Throwable e) { throw new RuntimeException("error in GenPerfMonitorsAMD", e); }
    }

    /// Invokes `glDeletePerfMonitorsAMD`.
    /// ```
    /// void glDeletePerfMonitorsAMD((int) GLsizei n, GLuint* monitors);
    /// ```
    public void DeletePerfMonitorsAMD(int n, @NonNull MemorySegment monitors) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeletePerfMonitorsAMD)) throw new GLSymbolNotFoundError("Symbol not found: glDeletePerfMonitorsAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeletePerfMonitorsAMD", n, monitors); }
        Handles.MH_glDeletePerfMonitorsAMD.get().invokeExact(handles.PFN_glDeletePerfMonitorsAMD, n, monitors); }
        catch (Throwable e) { throw new RuntimeException("error in DeletePerfMonitorsAMD", e); }
    }

    /// Invokes `glSelectPerfMonitorCountersAMD`.
    /// ```
    /// void glSelectPerfMonitorCountersAMD((unsigned int) GLuint monitor, GLboolean enable, (unsigned int) GLuint group, (int) GLint numCounters, GLuint* counterList);
    /// ```
    public void SelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, @NonNull MemorySegment counterList) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSelectPerfMonitorCountersAMD)) throw new GLSymbolNotFoundError("Symbol not found: glSelectPerfMonitorCountersAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSelectPerfMonitorCountersAMD", monitor, enable, group, numCounters, counterList); }
        Handles.MH_glSelectPerfMonitorCountersAMD.get().invokeExact(handles.PFN_glSelectPerfMonitorCountersAMD, monitor, ((enable) ? (byte)1 : (byte)0), group, numCounters, counterList); }
        catch (Throwable e) { throw new RuntimeException("error in SelectPerfMonitorCountersAMD", e); }
    }

    /// Invokes `glBeginPerfMonitorAMD`.
    /// ```
    /// void glBeginPerfMonitorAMD((unsigned int) GLuint monitor);
    /// ```
    public void BeginPerfMonitorAMD(int monitor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginPerfMonitorAMD)) throw new GLSymbolNotFoundError("Symbol not found: glBeginPerfMonitorAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginPerfMonitorAMD", monitor); }
        Handles.MH_glBeginPerfMonitorAMD.get().invokeExact(handles.PFN_glBeginPerfMonitorAMD, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in BeginPerfMonitorAMD", e); }
    }

    /// Invokes `glEndPerfMonitorAMD`.
    /// ```
    /// void glEndPerfMonitorAMD((unsigned int) GLuint monitor);
    /// ```
    public void EndPerfMonitorAMD(int monitor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndPerfMonitorAMD)) throw new GLSymbolNotFoundError("Symbol not found: glEndPerfMonitorAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndPerfMonitorAMD", monitor); }
        Handles.MH_glEndPerfMonitorAMD.get().invokeExact(handles.PFN_glEndPerfMonitorAMD, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in EndPerfMonitorAMD", e); }
    }

    /// Invokes `glGetPerfMonitorCounterDataAMD`.
    /// ```
    /// void glGetPerfMonitorCounterDataAMD((unsigned int) GLuint monitor, (unsigned int) GLenum pname, (int) GLsizei dataSize, GLuint* data, GLint* bytesWritten);
    /// ```
    public void GetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, @NonNull MemorySegment data, @NonNull MemorySegment bytesWritten) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCounterDataAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterDataAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCounterDataAMD", monitor, pname, dataSize, data, bytesWritten); }
        Handles.MH_glGetPerfMonitorCounterDataAMD.get().invokeExact(handles.PFN_glGetPerfMonitorCounterDataAMD, monitor, pname, dataSize, data, bytesWritten); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCounterDataAMD", e); }
    }

}
