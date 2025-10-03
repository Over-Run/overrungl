// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_sample_locations`
public final class GLNVSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 0x9340;
    public static final int GL_SAMPLE_LOCATION_NV = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV = 0x9343;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glFramebufferSampleLocationsfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glNamedFramebufferSampleLocationsfvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glResolveDepthValuesNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid()));
        public final MemorySegment PFN_glFramebufferSampleLocationsfvNV;
        public final MemorySegment PFN_glNamedFramebufferSampleLocationsfvNV;
        public final MemorySegment PFN_glResolveDepthValuesNV;
        private Handles(GLLoadFunc func) {
            PFN_glFramebufferSampleLocationsfvNV = func.invoke("glFramebufferSampleLocationsfvNV");
            PFN_glNamedFramebufferSampleLocationsfvNV = func.invoke("glNamedFramebufferSampleLocationsfvNV");
            PFN_glResolveDepthValuesNV = func.invoke("glResolveDepthValuesNV");
        }
    }

    public GLNVSampleLocations(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFramebufferSampleLocationsfvNV`.
    /// ```
    /// void glFramebufferSampleLocationsfvNV((unsigned int) GLenum target, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void FramebufferSampleLocationsfvNV(int target, int start, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferSampleLocationsfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferSampleLocationsfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferSampleLocationsfvNV", target, start, count, v); }
        Handles.MH_glFramebufferSampleLocationsfvNV.get().invokeExact(handles.PFN_glFramebufferSampleLocationsfvNV, target, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferSampleLocationsfvNV", e); }
    }

    /// Invokes `glNamedFramebufferSampleLocationsfvNV`.
    /// ```
    /// void glNamedFramebufferSampleLocationsfvNV((unsigned int) GLuint framebuffer, (unsigned int) GLuint start, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void NamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferSampleLocationsfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferSampleLocationsfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferSampleLocationsfvNV", framebuffer, start, count, v); }
        Handles.MH_glNamedFramebufferSampleLocationsfvNV.get().invokeExact(handles.PFN_glNamedFramebufferSampleLocationsfvNV, framebuffer, start, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferSampleLocationsfvNV", e); }
    }

    /// Invokes `glResolveDepthValuesNV`.
    /// ```
    /// void glResolveDepthValuesNV();
    /// ```
    public void ResolveDepthValuesNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResolveDepthValuesNV)) throw new GLSymbolNotFoundError("Symbol not found: glResolveDepthValuesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResolveDepthValuesNV"); }
        Handles.MH_glResolveDepthValuesNV.get().invokeExact(handles.PFN_glResolveDepthValuesNV); }
        catch (Throwable e) { throw new RuntimeException("error in ResolveDepthValuesNV", e); }
    }

}
