// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_framebuffer_multisample_advanced`
public final class GLAMDFramebufferMultisampleAdvanced {
    public static final int GL_RENDERBUFFER_STORAGE_SAMPLES_AMD = 0x91B2;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD = 0x91B3;
    public static final int GL_MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD = 0x91B4;
    public static final int GL_MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD = 0x91B5;
    public static final int GL_NUM_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B6;
    public static final int GL_SUPPORTED_MULTISAMPLE_MODES_AMD = 0x91B7;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRenderbufferStorageMultisampleAdvancedAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleAdvancedAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glRenderbufferStorageMultisampleAdvancedAMD;
        public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD;
        private Handles(GLLoadFunc func) {
            PFN_glRenderbufferStorageMultisampleAdvancedAMD = func.invoke("glRenderbufferStorageMultisampleAdvancedAMD");
            PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD = func.invoke("glNamedRenderbufferStorageMultisampleAdvancedAMD");
        }
    }

    public GLAMDFramebufferMultisampleAdvanced(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glRenderbufferStorageMultisampleAdvancedAMD`.
    /// ```
    /// void glRenderbufferStorageMultisampleAdvancedAMD((unsigned int) GLenum target, (int) GLsizei samples, (int) GLsizei storageSamples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorageMultisampleAdvancedAMD(int target, int samples, int storageSamples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorageMultisampleAdvancedAMD)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleAdvancedAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorageMultisampleAdvancedAMD", target, samples, storageSamples, internalformat, width, height); }
        Handles.MH_glRenderbufferStorageMultisampleAdvancedAMD.invokeExact(handles.PFN_glRenderbufferStorageMultisampleAdvancedAMD, target, samples, storageSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorageMultisampleAdvancedAMD", e); }
    }

    /// Invokes `glNamedRenderbufferStorageMultisampleAdvancedAMD`.
    /// ```
    /// void glNamedRenderbufferStorageMultisampleAdvancedAMD((unsigned int) GLuint renderbuffer, (int) GLsizei samples, (int) GLsizei storageSamples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void NamedRenderbufferStorageMultisampleAdvancedAMD(int renderbuffer, int samples, int storageSamples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD)) throw new GLSymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleAdvancedAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedRenderbufferStorageMultisampleAdvancedAMD", renderbuffer, samples, storageSamples, internalformat, width, height); }
        Handles.MH_glNamedRenderbufferStorageMultisampleAdvancedAMD.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisampleAdvancedAMD, renderbuffer, samples, storageSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorageMultisampleAdvancedAMD", e); }
    }

}
