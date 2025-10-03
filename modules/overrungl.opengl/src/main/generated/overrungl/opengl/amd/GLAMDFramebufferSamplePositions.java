// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_framebuffer_sample_positions`
public final class GLAMDFramebufferSamplePositions {
    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_X_AMD = 0x91AE;
    public static final int GL_PIXELS_PER_SAMPLE_PATTERN_Y_AMD = 0x91AF;
    public static final int GL_ALL_PIXELS_AMD = 0xFFFFFFFF;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFramebufferSamplePositionsfvAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glNamedFramebufferSamplePositionsfvAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetFramebufferParameterfvAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetNamedFramebufferParameterfvAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glFramebufferSamplePositionsfvAMD;
        public final MemorySegment PFN_glNamedFramebufferSamplePositionsfvAMD;
        public final MemorySegment PFN_glGetFramebufferParameterfvAMD;
        public final MemorySegment PFN_glGetNamedFramebufferParameterfvAMD;
        private Handles(GLLoadFunc func) {
            PFN_glFramebufferSamplePositionsfvAMD = func.invoke("glFramebufferSamplePositionsfvAMD");
            PFN_glNamedFramebufferSamplePositionsfvAMD = func.invoke("glNamedFramebufferSamplePositionsfvAMD");
            PFN_glGetFramebufferParameterfvAMD = func.invoke("glGetFramebufferParameterfvAMD");
            PFN_glGetNamedFramebufferParameterfvAMD = func.invoke("glGetNamedFramebufferParameterfvAMD");
        }
    }

    public GLAMDFramebufferSamplePositions(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFramebufferSamplePositionsfvAMD`.
    /// ```
    /// void glFramebufferSamplePositionsfvAMD((unsigned int) GLenum target, (unsigned int) GLuint numsamples, (unsigned int) GLuint pixelindex, const GLfloat* values);
    /// ```
    public void FramebufferSamplePositionsfvAMD(int target, int numsamples, int pixelindex, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferSamplePositionsfvAMD)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferSamplePositionsfvAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferSamplePositionsfvAMD", target, numsamples, pixelindex, values); }
        Handles.MH_glFramebufferSamplePositionsfvAMD.get().invokeExact(handles.PFN_glFramebufferSamplePositionsfvAMD, target, numsamples, pixelindex, values); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferSamplePositionsfvAMD", e); }
    }

    /// Invokes `glNamedFramebufferSamplePositionsfvAMD`.
    /// ```
    /// void glNamedFramebufferSamplePositionsfvAMD((unsigned int) GLuint framebuffer, (unsigned int) GLuint numsamples, (unsigned int) GLuint pixelindex, const GLfloat* values);
    /// ```
    public void NamedFramebufferSamplePositionsfvAMD(int framebuffer, int numsamples, int pixelindex, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferSamplePositionsfvAMD)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferSamplePositionsfvAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferSamplePositionsfvAMD", framebuffer, numsamples, pixelindex, values); }
        Handles.MH_glNamedFramebufferSamplePositionsfvAMD.get().invokeExact(handles.PFN_glNamedFramebufferSamplePositionsfvAMD, framebuffer, numsamples, pixelindex, values); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferSamplePositionsfvAMD", e); }
    }

    /// Invokes `glGetFramebufferParameterfvAMD`.
    /// ```
    /// void glGetFramebufferParameterfvAMD((unsigned int) GLenum target, (unsigned int) GLenum pname, (unsigned int) GLuint numsamples, (unsigned int) GLuint pixelindex, (int) GLsizei size, GLfloat* values);
    /// ```
    public void GetFramebufferParameterfvAMD(int target, int pname, int numsamples, int pixelindex, int size, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameterfvAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferParameterfvAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFramebufferParameterfvAMD", target, pname, numsamples, pixelindex, size, values); }
        Handles.MH_glGetFramebufferParameterfvAMD.get().invokeExact(handles.PFN_glGetFramebufferParameterfvAMD, target, pname, numsamples, pixelindex, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameterfvAMD", e); }
    }

    /// Invokes `glGetNamedFramebufferParameterfvAMD`.
    /// ```
    /// void glGetNamedFramebufferParameterfvAMD((unsigned int) GLuint framebuffer, (unsigned int) GLenum pname, (unsigned int) GLuint numsamples, (unsigned int) GLuint pixelindex, (int) GLsizei size, GLfloat* values);
    /// ```
    public void GetNamedFramebufferParameterfvAMD(int framebuffer, int pname, int numsamples, int pixelindex, int size, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferParameterfvAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameterfvAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedFramebufferParameterfvAMD", framebuffer, pname, numsamples, pixelindex, size, values); }
        Handles.MH_glGetNamedFramebufferParameterfvAMD.get().invokeExact(handles.PFN_glGetNamedFramebufferParameterfvAMD, framebuffer, pname, numsamples, pixelindex, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferParameterfvAMD", e); }
    }

}
