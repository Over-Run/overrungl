// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_video_capture`
public final class GLNVVideoCapture {
    public static final int GL_VIDEO_BUFFER_NV = 0x9020;
    public static final int GL_VIDEO_BUFFER_BINDING_NV = 0x9021;
    public static final int GL_FIELD_UPPER_NV = 0x9022;
    public static final int GL_FIELD_LOWER_NV = 0x9023;
    public static final int GL_NUM_VIDEO_CAPTURE_STREAMS_NV = 0x9024;
    public static final int GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV = 0x9025;
    public static final int GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV = 0x9026;
    public static final int GL_LAST_VIDEO_CAPTURE_STATUS_NV = 0x9027;
    public static final int GL_VIDEO_BUFFER_PITCH_NV = 0x9028;
    public static final int GL_VIDEO_COLOR_CONVERSION_MATRIX_NV = 0x9029;
    public static final int GL_VIDEO_COLOR_CONVERSION_MAX_NV = 0x902A;
    public static final int GL_VIDEO_COLOR_CONVERSION_MIN_NV = 0x902B;
    public static final int GL_VIDEO_COLOR_CONVERSION_OFFSET_NV = 0x902C;
    public static final int GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV = 0x902D;
    public static final int GL_PARTIAL_SUCCESS_NV = 0x902E;
    public static final int GL_SUCCESS_NV = 0x902F;
    public static final int GL_FAILURE_NV = 0x9030;
    public static final int GL_YCBYCR8_422_NV = 0x9031;
    public static final int GL_YCBAYCR8A_4224_NV = 0x9032;
    public static final int GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV = 0x9033;
    public static final int GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV = 0x9034;
    public static final int GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV = 0x9035;
    public static final int GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV = 0x9036;
    public static final int GL_Z4Y12Z4CB12Z4CR12_444_NV = 0x9037;
    public static final int GL_VIDEO_CAPTURE_FRAME_WIDTH_NV = 0x9038;
    public static final int GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV = 0x9039;
    public static final int GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV = 0x903A;
    public static final int GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV = 0x903B;
    public static final int GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV = 0x903C;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glBeginVideoCaptureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glBindVideoCaptureStreamBufferNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_glBindVideoCaptureStreamTextureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glEndVideoCaptureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetVideoCaptureivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVideoCaptureStreamivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVideoCaptureStreamfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetVideoCaptureStreamdvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVideoCaptureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVideoCaptureStreamParameterivNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVideoCaptureStreamParameterfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVideoCaptureStreamParameterdvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glBeginVideoCaptureNV;
        public final MemorySegment PFN_glBindVideoCaptureStreamBufferNV;
        public final MemorySegment PFN_glBindVideoCaptureStreamTextureNV;
        public final MemorySegment PFN_glEndVideoCaptureNV;
        public final MemorySegment PFN_glGetVideoCaptureivNV;
        public final MemorySegment PFN_glGetVideoCaptureStreamivNV;
        public final MemorySegment PFN_glGetVideoCaptureStreamfvNV;
        public final MemorySegment PFN_glGetVideoCaptureStreamdvNV;
        public final MemorySegment PFN_glVideoCaptureNV;
        public final MemorySegment PFN_glVideoCaptureStreamParameterivNV;
        public final MemorySegment PFN_glVideoCaptureStreamParameterfvNV;
        public final MemorySegment PFN_glVideoCaptureStreamParameterdvNV;
        private Handles(GLLoadFunc func) {
            PFN_glBeginVideoCaptureNV = func.invoke("glBeginVideoCaptureNV");
            PFN_glBindVideoCaptureStreamBufferNV = func.invoke("glBindVideoCaptureStreamBufferNV");
            PFN_glBindVideoCaptureStreamTextureNV = func.invoke("glBindVideoCaptureStreamTextureNV");
            PFN_glEndVideoCaptureNV = func.invoke("glEndVideoCaptureNV");
            PFN_glGetVideoCaptureivNV = func.invoke("glGetVideoCaptureivNV");
            PFN_glGetVideoCaptureStreamivNV = func.invoke("glGetVideoCaptureStreamivNV");
            PFN_glGetVideoCaptureStreamfvNV = func.invoke("glGetVideoCaptureStreamfvNV");
            PFN_glGetVideoCaptureStreamdvNV = func.invoke("glGetVideoCaptureStreamdvNV");
            PFN_glVideoCaptureNV = func.invoke("glVideoCaptureNV");
            PFN_glVideoCaptureStreamParameterivNV = func.invoke("glVideoCaptureStreamParameterivNV");
            PFN_glVideoCaptureStreamParameterfvNV = func.invoke("glVideoCaptureStreamParameterfvNV");
            PFN_glVideoCaptureStreamParameterdvNV = func.invoke("glVideoCaptureStreamParameterdvNV");
        }
    }

    public GLNVVideoCapture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBeginVideoCaptureNV`.
    /// ```
    /// void glBeginVideoCaptureNV((unsigned int) GLuint video_capture_slot);
    /// ```
    public void BeginVideoCaptureNV(int video_capture_slot) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginVideoCaptureNV)) throw new GLSymbolNotFoundError("Symbol not found: glBeginVideoCaptureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginVideoCaptureNV", video_capture_slot); }
        Handles.MH_glBeginVideoCaptureNV.get().invokeExact(handles.PFN_glBeginVideoCaptureNV, video_capture_slot); }
        catch (Throwable e) { throw new RuntimeException("error in BeginVideoCaptureNV", e); }
    }

    /// Invokes `glBindVideoCaptureStreamBufferNV`.
    /// ```
    /// void glBindVideoCaptureStreamBufferNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum frame_region, ((signed long long) khronos_intptr_t) GLintptrARB offset);
    /// ```
    public void BindVideoCaptureStreamBufferNV(int video_capture_slot, int stream, int frame_region, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVideoCaptureStreamBufferNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindVideoCaptureStreamBufferNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVideoCaptureStreamBufferNV", video_capture_slot, stream, frame_region, offset); }
        Handles.MH_glBindVideoCaptureStreamBufferNV.get().invokeExact(handles.PFN_glBindVideoCaptureStreamBufferNV, video_capture_slot, stream, frame_region, offset); }
        catch (Throwable e) { throw new RuntimeException("error in BindVideoCaptureStreamBufferNV", e); }
    }

    /// Invokes `glBindVideoCaptureStreamTextureNV`.
    /// ```
    /// void glBindVideoCaptureStreamTextureNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum frame_region, (unsigned int) GLenum target, (unsigned int) GLuint texture);
    /// ```
    public void BindVideoCaptureStreamTextureNV(int video_capture_slot, int stream, int frame_region, int target, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVideoCaptureStreamTextureNV)) throw new GLSymbolNotFoundError("Symbol not found: glBindVideoCaptureStreamTextureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVideoCaptureStreamTextureNV", video_capture_slot, stream, frame_region, target, texture); }
        Handles.MH_glBindVideoCaptureStreamTextureNV.get().invokeExact(handles.PFN_glBindVideoCaptureStreamTextureNV, video_capture_slot, stream, frame_region, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindVideoCaptureStreamTextureNV", e); }
    }

    /// Invokes `glEndVideoCaptureNV`.
    /// ```
    /// void glEndVideoCaptureNV((unsigned int) GLuint video_capture_slot);
    /// ```
    public void EndVideoCaptureNV(int video_capture_slot) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndVideoCaptureNV)) throw new GLSymbolNotFoundError("Symbol not found: glEndVideoCaptureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndVideoCaptureNV", video_capture_slot); }
        Handles.MH_glEndVideoCaptureNV.get().invokeExact(handles.PFN_glEndVideoCaptureNV, video_capture_slot); }
        catch (Throwable e) { throw new RuntimeException("error in EndVideoCaptureNV", e); }
    }

    /// Invokes `glGetVideoCaptureivNV`.
    /// ```
    /// void glGetVideoCaptureivNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVideoCaptureivNV(int video_capture_slot, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoCaptureivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoCaptureivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoCaptureivNV", video_capture_slot, pname, params); }
        Handles.MH_glGetVideoCaptureivNV.get().invokeExact(handles.PFN_glGetVideoCaptureivNV, video_capture_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoCaptureivNV", e); }
    }

    /// Invokes `glGetVideoCaptureStreamivNV`.
    /// ```
    /// void glGetVideoCaptureStreamivNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVideoCaptureStreamivNV(int video_capture_slot, int stream, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoCaptureStreamivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoCaptureStreamivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoCaptureStreamivNV", video_capture_slot, stream, pname, params); }
        Handles.MH_glGetVideoCaptureStreamivNV.get().invokeExact(handles.PFN_glGetVideoCaptureStreamivNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoCaptureStreamivNV", e); }
    }

    /// Invokes `glGetVideoCaptureStreamfvNV`.
    /// ```
    /// void glGetVideoCaptureStreamfvNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVideoCaptureStreamfvNV(int video_capture_slot, int stream, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoCaptureStreamfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoCaptureStreamfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoCaptureStreamfvNV", video_capture_slot, stream, pname, params); }
        Handles.MH_glGetVideoCaptureStreamfvNV.get().invokeExact(handles.PFN_glGetVideoCaptureStreamfvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoCaptureStreamfvNV", e); }
    }

    /// Invokes `glGetVideoCaptureStreamdvNV`.
    /// ```
    /// void glGetVideoCaptureStreamdvNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVideoCaptureStreamdvNV(int video_capture_slot, int stream, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoCaptureStreamdvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetVideoCaptureStreamdvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVideoCaptureStreamdvNV", video_capture_slot, stream, pname, params); }
        Handles.MH_glGetVideoCaptureStreamdvNV.get().invokeExact(handles.PFN_glGetVideoCaptureStreamdvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoCaptureStreamdvNV", e); }
    }

    /// Invokes `glVideoCaptureNV`.
    /// ```
    /// (unsigned int) GLenum glVideoCaptureNV((unsigned int) GLuint video_capture_slot, GLuint* sequence_num, GLuint64EXT* capture_time);
    /// ```
    public int VideoCaptureNV(int video_capture_slot, @NonNull MemorySegment sequence_num, @NonNull MemorySegment capture_time) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVideoCaptureNV)) throw new GLSymbolNotFoundError("Symbol not found: glVideoCaptureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVideoCaptureNV", video_capture_slot, sequence_num, capture_time); }
        return (int) Handles.MH_glVideoCaptureNV.get().invokeExact(handles.PFN_glVideoCaptureNV, video_capture_slot, sequence_num, capture_time); }
        catch (Throwable e) { throw new RuntimeException("error in VideoCaptureNV", e); }
    }

    /// Invokes `glVideoCaptureStreamParameterivNV`.
    /// ```
    /// void glVideoCaptureStreamParameterivNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void VideoCaptureStreamParameterivNV(int video_capture_slot, int stream, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVideoCaptureStreamParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glVideoCaptureStreamParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVideoCaptureStreamParameterivNV", video_capture_slot, stream, pname, params); }
        Handles.MH_glVideoCaptureStreamParameterivNV.get().invokeExact(handles.PFN_glVideoCaptureStreamParameterivNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in VideoCaptureStreamParameterivNV", e); }
    }

    /// Invokes `glVideoCaptureStreamParameterfvNV`.
    /// ```
    /// void glVideoCaptureStreamParameterfvNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void VideoCaptureStreamParameterfvNV(int video_capture_slot, int stream, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVideoCaptureStreamParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVideoCaptureStreamParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVideoCaptureStreamParameterfvNV", video_capture_slot, stream, pname, params); }
        Handles.MH_glVideoCaptureStreamParameterfvNV.get().invokeExact(handles.PFN_glVideoCaptureStreamParameterfvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in VideoCaptureStreamParameterfvNV", e); }
    }

    /// Invokes `glVideoCaptureStreamParameterdvNV`.
    /// ```
    /// void glVideoCaptureStreamParameterdvNV((unsigned int) GLuint video_capture_slot, (unsigned int) GLuint stream, (unsigned int) GLenum pname, const GLdouble* params);
    /// ```
    public void VideoCaptureStreamParameterdvNV(int video_capture_slot, int stream, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVideoCaptureStreamParameterdvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVideoCaptureStreamParameterdvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVideoCaptureStreamParameterdvNV", video_capture_slot, stream, pname, params); }
        Handles.MH_glVideoCaptureStreamParameterdvNV.get().invokeExact(handles.PFN_glVideoCaptureStreamParameterdvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in VideoCaptureStreamParameterdvNV", e); }
    }

}
