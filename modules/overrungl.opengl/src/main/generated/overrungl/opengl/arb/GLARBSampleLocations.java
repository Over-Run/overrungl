// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_sample_locations`
public final class GLARBSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;
    public static final int GL_SAMPLE_LOCATION_ARB = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB = 0x9343;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFramebufferSampleLocationsfvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glNamedFramebufferSampleLocationsfvARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glEvaluateDepthValuesARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glFramebufferSampleLocationsfvARB;
        public final MemorySegment PFN_glNamedFramebufferSampleLocationsfvARB;
        public final MemorySegment PFN_glEvaluateDepthValuesARB;
        private Handles(GLLoadFunc func) {
            PFN_glFramebufferSampleLocationsfvARB = func.invoke("glFramebufferSampleLocationsfvARB");
            PFN_glNamedFramebufferSampleLocationsfvARB = func.invoke("glNamedFramebufferSampleLocationsfvARB");
            PFN_glEvaluateDepthValuesARB = func.invoke("glEvaluateDepthValuesARB");
        }
    }

    public GLARBSampleLocations(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFramebufferSampleLocationsfvARB`.
    /// ```
    /// void glFramebufferSampleLocationsfvARB((unsigned int) GLenum target, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void FramebufferSampleLocationsfvARB(int target, int start, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferSampleLocationsfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferSampleLocationsfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferSampleLocationsfvARB", target, start, count, v); }
        Handles.MH_glFramebufferSampleLocationsfvARB.get().invokeExact(handles.PFN_glFramebufferSampleLocationsfvARB, target, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferSampleLocationsfvARB", e); }
    }

    /// Invokes `glNamedFramebufferSampleLocationsfvARB`.
    /// ```
    /// void glNamedFramebufferSampleLocationsfvARB((unsigned int) GLuint framebuffer, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void NamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferSampleLocationsfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferSampleLocationsfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferSampleLocationsfvARB", framebuffer, start, count, v); }
        Handles.MH_glNamedFramebufferSampleLocationsfvARB.get().invokeExact(handles.PFN_glNamedFramebufferSampleLocationsfvARB, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferSampleLocationsfvARB", e); }
    }

    /// Invokes `glEvaluateDepthValuesARB`.
    /// ```
    /// void glEvaluateDepthValuesARB();
    /// ```
    public void EvaluateDepthValuesARB() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvaluateDepthValuesARB)) throw new GLSymbolNotFoundError("Symbol not found: glEvaluateDepthValuesARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEvaluateDepthValuesARB"); }
        Handles.MH_glEvaluateDepthValuesARB.get().invokeExact(handles.PFN_glEvaluateDepthValuesARB); }
        catch (Throwable e) { throw new RuntimeException("error in EvaluateDepthValuesARB", e); }
    }

}
