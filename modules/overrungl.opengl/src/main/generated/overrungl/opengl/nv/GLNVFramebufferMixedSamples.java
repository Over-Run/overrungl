// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_framebuffer_mixed_samples`
public final class GLNVFramebufferMixedSamples {
    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;
    public static final int GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;
    public static final int GL_RASTER_SAMPLES_EXT = 0x9328;
    public static final int GL_MAX_RASTER_SAMPLES_EXT = 0x9329;
    public static final int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 0x932A;
    public static final int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B;
    public static final int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 0x932C;
    public static final int GL_COLOR_SAMPLES_NV = 0x8E20;
    public static final int GL_DEPTH_SAMPLES_NV = 0x932D;
    public static final int GL_STENCIL_SAMPLES_NV = 0x932E;
    public static final int GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV = 0x932F;
    public static final int GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV = 0x9330;
    public static final int GL_COVERAGE_MODULATION_NV = 0x9332;
    public static final int GL_COVERAGE_MODULATION_TABLE_SIZE_NV = 0x9333;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glRasterSamplesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glCoverageModulationTableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetCoverageModulationTableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glCoverageModulationNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glRasterSamplesEXT;
        public final MemorySegment PFN_glCoverageModulationTableNV;
        public final MemorySegment PFN_glGetCoverageModulationTableNV;
        public final MemorySegment PFN_glCoverageModulationNV;
        private Handles(GLLoadFunc func) {
            PFN_glRasterSamplesEXT = func.invoke("glRasterSamplesEXT");
            PFN_glCoverageModulationTableNV = func.invoke("glCoverageModulationTableNV");
            PFN_glGetCoverageModulationTableNV = func.invoke("glGetCoverageModulationTableNV");
            PFN_glCoverageModulationNV = func.invoke("glCoverageModulationNV");
        }
    }

    public GLNVFramebufferMixedSamples(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glRasterSamplesEXT`.
    /// ```
    /// void glRasterSamplesEXT((unsigned int) GLuint samples, GLboolean fixedsamplelocations);
    /// ```
    public void RasterSamplesEXT(int samples, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterSamplesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glRasterSamplesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterSamplesEXT", samples, fixedsamplelocations); }
        Handles.MH_glRasterSamplesEXT.get().invokeExact(handles.PFN_glRasterSamplesEXT, samples, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in RasterSamplesEXT", e); }
    }

    /// Invokes `glCoverageModulationTableNV`.
    /// ```
    /// void glCoverageModulationTableNV((int) GLsizei n, const GLfloat* v);
    /// ```
    public void CoverageModulationTableNV(int n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCoverageModulationTableNV)) throw new GLSymbolNotFoundError("Symbol not found: glCoverageModulationTableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCoverageModulationTableNV", n, v); }
        Handles.MH_glCoverageModulationTableNV.get().invokeExact(handles.PFN_glCoverageModulationTableNV, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in CoverageModulationTableNV", e); }
    }

    /// Invokes `glGetCoverageModulationTableNV`.
    /// ```
    /// void glGetCoverageModulationTableNV((int) GLsizei bufSize, GLfloat* v);
    /// ```
    public void GetCoverageModulationTableNV(int bufSize, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCoverageModulationTableNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCoverageModulationTableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCoverageModulationTableNV", bufSize, v); }
        Handles.MH_glGetCoverageModulationTableNV.get().invokeExact(handles.PFN_glGetCoverageModulationTableNV, bufSize, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetCoverageModulationTableNV", e); }
    }

    /// Invokes `glCoverageModulationNV`.
    /// ```
    /// void glCoverageModulationNV((unsigned int) GLenum components);
    /// ```
    public void CoverageModulationNV(int components) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCoverageModulationNV)) throw new GLSymbolNotFoundError("Symbol not found: glCoverageModulationNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCoverageModulationNV", components); }
        Handles.MH_glCoverageModulationNV.get().invokeExact(handles.PFN_glCoverageModulationNV, components); }
        catch (Throwable e) { throw new RuntimeException("error in CoverageModulationNV", e); }
    }

}
