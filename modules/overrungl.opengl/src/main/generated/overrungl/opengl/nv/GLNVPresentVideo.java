// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_present_video`
public final class GLNVPresentVideo {
    public static final int GL_FRAME_NV = 0x8E26;
    public static final int GL_FIELDS_NV = 0x8E27;
    public static final int GL_CURRENT_TIME_NV = 0x8E28;
    public static final int GL_NUM_FILL_STREAMS_NV = 0x8E29;
    public static final int GL_PRESENT_TIME_NV = 0x8E2A;
    public static final int GL_PRESENT_DURATION_NV = 0x8E2B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPresentFrameKeyedNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPresentFrameDualFillNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVideoivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVideouivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVideoi64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVideoui64vNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPresentFrameKeyedNV;
        public final MemorySegment PFN_glPresentFrameDualFillNV;
        public final MemorySegment PFN_glGetVideoivNV;
        public final MemorySegment PFN_glGetVideouivNV;
        public final MemorySegment PFN_glGetVideoi64vNV;
        public final MemorySegment PFN_glGetVideoui64vNV;
        private Handles(GLLoadFunc func) {
            PFN_glPresentFrameKeyedNV = func.invoke("glPresentFrameKeyedNV");
            PFN_glPresentFrameDualFillNV = func.invoke("glPresentFrameDualFillNV");
            PFN_glGetVideoivNV = func.invoke("glGetVideoivNV");
            PFN_glGetVideouivNV = func.invoke("glGetVideouivNV");
            PFN_glGetVideoi64vNV = func.invoke("glGetVideoi64vNV");
            PFN_glGetVideoui64vNV = func.invoke("glGetVideoui64vNV");
        }
    }

    public GLNVPresentVideo(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPresentFrameKeyedNV`.
    /// ```
    /// void glPresentFrameKeyedNV((unsigned int) GLuint video_slot, ((uint64_t) khronos_uint64_t) GLuint64EXT minPresentTime, (unsigned int) GLuint beginPresentTimeId, (unsigned int) GLuint presentDurationId, (unsigned int) GLenum type, (unsigned int) GLenum target0, (unsigned int) GLuint fill0, (unsigned int) GLuint key0, (unsigned int) GLenum target1, (unsigned int) GLuint fill1, (unsigned int) GLuint key1);
    /// ```
    public void PresentFrameKeyedNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int key0, int target1, int fill1, int key1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPresentFrameKeyedNV)) throw new GLSymbolNotFoundError("Symbol not found: glPresentFrameKeyedNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPresentFrameKeyedNV", video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, key0, target1, fill1, key1); }
        Handles.MH_glPresentFrameKeyedNV.invokeExact(handles.PFN_glPresentFrameKeyedNV, video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, key0, target1, fill1, key1); }
        catch (Throwable e) { throw new RuntimeException("error in PresentFrameKeyedNV", e); }
    }

    /// Invokes `glPresentFrameDualFillNV`.
    /// ```
    /// void glPresentFrameDualFillNV((unsigned int) GLuint video_slot, ((uint64_t) khronos_uint64_t) GLuint64EXT minPresentTime, (unsigned int) GLuint beginPresentTimeId, (unsigned int) GLuint presentDurationId, (unsigned int) GLenum type, (unsigned int) GLenum target0, (unsigned int) GLuint fill0, (unsigned int) GLenum target1, (unsigned int) GLuint fill1, (unsigned int) GLenum target2, (unsigned int) GLuint fill2, (unsigned int) GLenum target3, (unsigned int) GLuint fill3);
    /// ```
    public void PresentFrameDualFillNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int target1, int fill1, int target2, int fill2, int target3, int fill3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPresentFrameDualFillNV)) throw new GLSymbolNotFoundError("Symbol not found: glPresentFrameDualFillNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPresentFrameDualFillNV", video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, target1, fill1, target2, fill2, target3, fill3); }
        Handles.MH_glPresentFrameDualFillNV.invokeExact(handles.PFN_glPresentFrameDualFillNV, video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, target1, fill1, target2, fill2, target3, fill3); }
        catch (Throwable e) { throw new RuntimeException("error in PresentFrameDualFillNV", e); }
    }

    /// Invokes `glGetVideoivNV`.
    /// ```
    /// void glGetVideoivNV((unsigned int) GLuint video_slot, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVideoivNV(int video_slot, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoivNV", video_slot, pname, params); }
        Handles.MH_glGetVideoivNV.invokeExact(handles.PFN_glGetVideoivNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoivNV", e); }
    }

    /// Invokes `glGetVideouivNV`.
    /// ```
    /// void glGetVideouivNV((unsigned int) GLuint video_slot, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetVideouivNV(int video_slot, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideouivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideouivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideouivNV", video_slot, pname, params); }
        Handles.MH_glGetVideouivNV.invokeExact(handles.PFN_glGetVideouivNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideouivNV", e); }
    }

    /// Invokes `glGetVideoi64vNV`.
    /// ```
    /// void glGetVideoi64vNV((unsigned int) GLuint video_slot, (unsigned int) GLenum pname, GLint64EXT* params);
    /// ```
    public void GetVideoi64vNV(int video_slot, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoi64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoi64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoi64vNV", video_slot, pname, params); }
        Handles.MH_glGetVideoi64vNV.invokeExact(handles.PFN_glGetVideoi64vNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoi64vNV", e); }
    }

    /// Invokes `glGetVideoui64vNV`.
    /// ```
    /// void glGetVideoui64vNV((unsigned int) GLuint video_slot, (unsigned int) GLenum pname, GLuint64EXT* params);
    /// ```
    public void GetVideoui64vNV(int video_slot, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoui64vNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoui64vNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoui64vNV", video_slot, pname, params); }
        Handles.MH_glGetVideoui64vNV.invokeExact(handles.PFN_glGetVideoui64vNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoui64vNV", e); }
    }

}
