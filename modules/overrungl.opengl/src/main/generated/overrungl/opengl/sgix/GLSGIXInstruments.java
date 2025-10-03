// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_instruments`
public final class GLSGIXInstruments {
    public static final int GL_INSTRUMENT_BUFFER_POINTER_SGIX = 0x8180;
    public static final int GL_INSTRUMENT_MEASUREMENTS_SGIX = 0x8181;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetInstrumentsSGIX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInstrumentsBufferSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPollInstrumentsSGIX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReadInstrumentsSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStartInstrumentsSGIX = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glStopInstrumentsSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetInstrumentsSGIX;
        public final MemorySegment PFN_glInstrumentsBufferSGIX;
        public final MemorySegment PFN_glPollInstrumentsSGIX;
        public final MemorySegment PFN_glReadInstrumentsSGIX;
        public final MemorySegment PFN_glStartInstrumentsSGIX;
        public final MemorySegment PFN_glStopInstrumentsSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glGetInstrumentsSGIX = func.invoke("glGetInstrumentsSGIX");
            PFN_glInstrumentsBufferSGIX = func.invoke("glInstrumentsBufferSGIX");
            PFN_glPollInstrumentsSGIX = func.invoke("glPollInstrumentsSGIX");
            PFN_glReadInstrumentsSGIX = func.invoke("glReadInstrumentsSGIX");
            PFN_glStartInstrumentsSGIX = func.invoke("glStartInstrumentsSGIX");
            PFN_glStopInstrumentsSGIX = func.invoke("glStopInstrumentsSGIX");
        }
    }

    public GLSGIXInstruments(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetInstrumentsSGIX`.
    /// ```
    /// (int) GLint glGetInstrumentsSGIX();
    /// ```
    public int GetInstrumentsSGIX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glGetInstrumentsSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInstrumentsSGIX"); }
        return (int) Handles.MH_glGetInstrumentsSGIX.invokeExact(handles.PFN_glGetInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in GetInstrumentsSGIX", e); }
    }

    /// Invokes `glInstrumentsBufferSGIX`.
    /// ```
    /// void glInstrumentsBufferSGIX((int) GLsizei size, GLint* buffer);
    /// ```
    public void InstrumentsBufferSGIX(int size, @NonNull MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInstrumentsBufferSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glInstrumentsBufferSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInstrumentsBufferSGIX", size, buffer); }
        Handles.MH_glInstrumentsBufferSGIX.invokeExact(handles.PFN_glInstrumentsBufferSGIX, size, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in InstrumentsBufferSGIX", e); }
    }

    /// Invokes `glPollInstrumentsSGIX`.
    /// ```
    /// (int) GLint glPollInstrumentsSGIX(GLint* marker_p);
    /// ```
    public int PollInstrumentsSGIX(@NonNull MemorySegment marker_p) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPollInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glPollInstrumentsSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPollInstrumentsSGIX", marker_p); }
        return (int) Handles.MH_glPollInstrumentsSGIX.invokeExact(handles.PFN_glPollInstrumentsSGIX, marker_p); }
        catch (Throwable e) { throw new RuntimeException("error in PollInstrumentsSGIX", e); }
    }

    /// Invokes `glReadInstrumentsSGIX`.
    /// ```
    /// void glReadInstrumentsSGIX((int) GLint marker);
    /// ```
    public void ReadInstrumentsSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReadInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glReadInstrumentsSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReadInstrumentsSGIX", marker); }
        Handles.MH_glReadInstrumentsSGIX.invokeExact(handles.PFN_glReadInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in ReadInstrumentsSGIX", e); }
    }

    /// Invokes `glStartInstrumentsSGIX`.
    /// ```
    /// void glStartInstrumentsSGIX();
    /// ```
    public void StartInstrumentsSGIX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glStartInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glStartInstrumentsSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStartInstrumentsSGIX"); }
        Handles.MH_glStartInstrumentsSGIX.invokeExact(handles.PFN_glStartInstrumentsSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in StartInstrumentsSGIX", e); }
    }

    /// Invokes `glStopInstrumentsSGIX`.
    /// ```
    /// void glStopInstrumentsSGIX((int) GLint marker);
    /// ```
    public void StopInstrumentsSGIX(int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStopInstrumentsSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glStopInstrumentsSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStopInstrumentsSGIX", marker); }
        Handles.MH_glStopInstrumentsSGIX.invokeExact(handles.PFN_glStopInstrumentsSGIX, marker); }
        catch (Throwable e) { throw new RuntimeException("error in StopInstrumentsSGIX", e); }
    }

}
