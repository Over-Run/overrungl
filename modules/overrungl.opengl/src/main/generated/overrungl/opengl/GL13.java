// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// Constants and functions of OpenGL 1.3.
public class GL13 extends GL12 {
    public static final int GL_TEXTURE0 = 0x84C0;
    public static final int GL_TEXTURE1 = 0x84C1;
    public static final int GL_TEXTURE2 = 0x84C2;
    public static final int GL_TEXTURE3 = 0x84C3;
    public static final int GL_TEXTURE4 = 0x84C4;
    public static final int GL_TEXTURE5 = 0x84C5;
    public static final int GL_TEXTURE6 = 0x84C6;
    public static final int GL_TEXTURE7 = 0x84C7;
    public static final int GL_TEXTURE8 = 0x84C8;
    public static final int GL_TEXTURE9 = 0x84C9;
    public static final int GL_TEXTURE10 = 0x84CA;
    public static final int GL_TEXTURE11 = 0x84CB;
    public static final int GL_TEXTURE12 = 0x84CC;
    public static final int GL_TEXTURE13 = 0x84CD;
    public static final int GL_TEXTURE14 = 0x84CE;
    public static final int GL_TEXTURE15 = 0x84CF;
    public static final int GL_TEXTURE16 = 0x84D0;
    public static final int GL_TEXTURE17 = 0x84D1;
    public static final int GL_TEXTURE18 = 0x84D2;
    public static final int GL_TEXTURE19 = 0x84D3;
    public static final int GL_TEXTURE20 = 0x84D4;
    public static final int GL_TEXTURE21 = 0x84D5;
    public static final int GL_TEXTURE22 = 0x84D6;
    public static final int GL_TEXTURE23 = 0x84D7;
    public static final int GL_TEXTURE24 = 0x84D8;
    public static final int GL_TEXTURE25 = 0x84D9;
    public static final int GL_TEXTURE26 = 0x84DA;
    public static final int GL_TEXTURE27 = 0x84DB;
    public static final int GL_TEXTURE28 = 0x84DC;
    public static final int GL_TEXTURE29 = 0x84DD;
    public static final int GL_TEXTURE30 = 0x84DE;
    public static final int GL_TEXTURE31 = 0x84DF;
    public static final int GL_ACTIVE_TEXTURE = 0x84E0;
    public static final int GL_MULTISAMPLE = 0x809D;
    public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int GL_SAMPLE_COVERAGE = 0x80A0;
    public static final int GL_SAMPLE_BUFFERS = 0x80A8;
    public static final int GL_SAMPLES = 0x80A9;
    public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int GL_COMPRESSED_RGB = 0x84ED;
    public static final int GL_COMPRESSED_RGBA = 0x84EE;
    public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
    public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int GL_CLAMP_TO_BORDER = 0x812D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glActiveTexture = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSampleCoverage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glCompressedTexImage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexImage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexImage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexSubImage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexSubImage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTexSubImage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedTexImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glActiveTexture;
        public final MemorySegment PFN_glSampleCoverage;
        public final MemorySegment PFN_glCompressedTexImage3D;
        public final MemorySegment PFN_glCompressedTexImage2D;
        public final MemorySegment PFN_glCompressedTexImage1D;
        public final MemorySegment PFN_glCompressedTexSubImage3D;
        public final MemorySegment PFN_glCompressedTexSubImage2D;
        public final MemorySegment PFN_glCompressedTexSubImage1D;
        public final MemorySegment PFN_glGetCompressedTexImage;
        private Handles(GLLoadFunc func) {
            PFN_glActiveTexture = func.invoke("glActiveTexture", "glActiveTextureARB");
            PFN_glSampleCoverage = func.invoke("glSampleCoverage", "glSampleCoverageARB");
            PFN_glCompressedTexImage3D = func.invoke("glCompressedTexImage3D", "glCompressedTexImage3DARB");
            PFN_glCompressedTexImage2D = func.invoke("glCompressedTexImage2D", "glCompressedTexImage2DARB");
            PFN_glCompressedTexImage1D = func.invoke("glCompressedTexImage1D", "glCompressedTexImage1DARB");
            PFN_glCompressedTexSubImage3D = func.invoke("glCompressedTexSubImage3D", "glCompressedTexSubImage3DARB");
            PFN_glCompressedTexSubImage2D = func.invoke("glCompressedTexSubImage2D", "glCompressedTexSubImage2DARB");
            PFN_glCompressedTexSubImage1D = func.invoke("glCompressedTexSubImage1D", "glCompressedTexSubImage1DARB");
            PFN_glGetCompressedTexImage = func.invoke("glGetCompressedTexImage", "glGetCompressedTexImageARB");
        }
    }

    public GL13(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// Invokes `glActiveTexture`.
    /// ```
    /// void glActiveTexture((unsigned int) GLenum texture);
    /// ```
    public void ActiveTexture(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveTexture)) throw new GLSymbolNotFoundError("Symbol not found: glActiveTexture");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glActiveTexture", texture); }
        Handles.MH_glActiveTexture.invokeExact(handles.PFN_glActiveTexture, texture); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveTexture", e); }
    }

    /// Invokes `glSampleCoverage`.
    /// ```
    /// void glSampleCoverage(((float) khronos_float_t) GLfloat value, GLboolean invert);
    /// ```
    public void SampleCoverage(float value, boolean invert) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSampleCoverage)) throw new GLSymbolNotFoundError("Symbol not found: glSampleCoverage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSampleCoverage", value, invert); }
        Handles.MH_glSampleCoverage.invokeExact(handles.PFN_glSampleCoverage, value, ((invert) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in SampleCoverage", e); }
    }

    /// Invokes `glCompressedTexImage3D`.
    /// ```
    /// void glCompressedTexImage3D((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexImage3D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexImage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexImage3D", target, level, internalformat, width, height, depth, border, imageSize, data); }
        Handles.MH_glCompressedTexImage3D.invokeExact(handles.PFN_glCompressedTexImage3D, target, level, internalformat, width, height, depth, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexImage3D", e); }
    }

    /// Invokes `glCompressedTexImage2D`.
    /// ```
    /// void glCompressedTexImage2D((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLint border, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexImage2D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexImage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexImage2D", target, level, internalformat, width, height, border, imageSize, data); }
        Handles.MH_glCompressedTexImage2D.invokeExact(handles.PFN_glCompressedTexImage2D, target, level, internalformat, width, height, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexImage2D", e); }
    }

    /// Invokes `glCompressedTexImage1D`.
    /// ```
    /// void glCompressedTexImage1D((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLint border, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexImage1D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexImage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexImage1D", target, level, internalformat, width, border, imageSize, data); }
        Handles.MH_glCompressedTexImage1D.invokeExact(handles.PFN_glCompressedTexImage1D, target, level, internalformat, width, border, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexImage1D", e); }
    }

    /// Invokes `glCompressedTexSubImage3D`.
    /// ```
    /// void glCompressedTexSubImage3D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexSubImage3D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexSubImage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexSubImage3D", target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        Handles.MH_glCompressedTexSubImage3D.invokeExact(handles.PFN_glCompressedTexSubImage3D, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexSubImage3D", e); }
    }

    /// Invokes `glCompressedTexSubImage2D`.
    /// ```
    /// void glCompressedTexSubImage2D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexSubImage2D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexSubImage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexSubImage2D", target, level, xoffset, yoffset, width, height, format, imageSize, data); }
        Handles.MH_glCompressedTexSubImage2D.invokeExact(handles.PFN_glCompressedTexSubImage2D, target, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexSubImage2D", e); }
    }

    /// Invokes `glCompressedTexSubImage1D`.
    /// ```
    /// void glCompressedTexSubImage1D((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTexSubImage1D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTexSubImage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTexSubImage1D", target, level, xoffset, width, format, imageSize, data); }
        Handles.MH_glCompressedTexSubImage1D.invokeExact(handles.PFN_glCompressedTexSubImage1D, target, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTexSubImage1D", e); }
    }

    /// Invokes `glGetCompressedTexImage`.
    /// ```
    /// void glGetCompressedTexImage((unsigned int) GLenum target, (int) GLint level, void* img);
    /// ```
    public void GetCompressedTexImage(int target, int level, @NonNull MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedTexImage)) throw new GLSymbolNotFoundError("Symbol not found: glGetCompressedTexImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCompressedTexImage", target, level, img); }
        Handles.MH_glGetCompressedTexImage.invokeExact(handles.PFN_glGetCompressedTexImage, target, level, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedTexImage", e); }
    }

}
