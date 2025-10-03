// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_geometry_shader4`
public final class GLARBGeometryShader4 {
    public static final int GL_LINES_ADJACENCY_ARB = 0x000A;
    public static final int GL_LINE_STRIP_ADJACENCY_ARB = 0x000B;
    public static final int GL_TRIANGLES_ADJACENCY_ARB = 0x000C;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY_ARB = 0x000D;
    public static final int GL_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS_ARB = 0x8C29;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED_ARB = 0x8DA7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS_ARB = 0x8DA8;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_COUNT_ARB = 0x8DA9;
    public static final int GL_GEOMETRY_SHADER_ARB = 0x8DD9;
    public static final int GL_GEOMETRY_VERTICES_OUT_ARB = 0x8DDA;
    public static final int GL_GEOMETRY_INPUT_TYPE_ARB = 0x8DDB;
    public static final int GL_GEOMETRY_OUTPUT_TYPE_ARB = 0x8DDC;
    public static final int GL_MAX_GEOMETRY_VARYING_COMPONENTS_ARB = 0x8DDD;
    public static final int GL_MAX_VERTEX_VARYING_COMPONENTS_ARB = 0x8DDE;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS_ARB = 0x8DDF;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES_ARB = 0x8DE0;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_ARB = 0x8DE1;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glProgramParameteriARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFramebufferTextureARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFramebufferTextureLayerARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glFramebufferTextureFaceARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glProgramParameteriARB;
        public final MemorySegment PFN_glFramebufferTextureARB;
        public final MemorySegment PFN_glFramebufferTextureLayerARB;
        public final MemorySegment PFN_glFramebufferTextureFaceARB;
        private Handles(GLLoadFunc func) {
            PFN_glProgramParameteriARB = func.invoke("glProgramParameteriARB", "glProgramParameteri");
            PFN_glFramebufferTextureARB = func.invoke("glFramebufferTextureARB", "glFramebufferTexture");
            PFN_glFramebufferTextureLayerARB = func.invoke("glFramebufferTextureLayerARB", "glFramebufferTextureLayer");
            PFN_glFramebufferTextureFaceARB = func.invoke("glFramebufferTextureFaceARB");
        }
    }

    public GLARBGeometryShader4(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProgramParameteriARB`.
    /// ```
    /// void glProgramParameteriARB((unsigned int) GLuint program, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void ProgramParameteriARB(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteriARB)) throw new GLSymbolNotFoundError("Symbol not found: glProgramParameteriARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramParameteriARB", program, pname, value); }
        Handles.MH_glProgramParameteriARB.get().invokeExact(handles.PFN_glProgramParameteriARB, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteriARB", e); }
    }

    /// Invokes `glFramebufferTextureARB`.
    /// ```
    /// void glFramebufferTextureARB((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTextureARB(int target, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureARB)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureARB", target, attachment, texture, level); }
        Handles.MH_glFramebufferTextureARB.get().invokeExact(handles.PFN_glFramebufferTextureARB, target, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureARB", e); }
    }

    /// Invokes `glFramebufferTextureLayerARB`.
    /// ```
    /// void glFramebufferTextureLayerARB((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void FramebufferTextureLayerARB(int target, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureLayerARB)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureLayerARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureLayerARB", target, attachment, texture, level, layer); }
        Handles.MH_glFramebufferTextureLayerARB.get().invokeExact(handles.PFN_glFramebufferTextureLayerARB, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureLayerARB", e); }
    }

    /// Invokes `glFramebufferTextureFaceARB`.
    /// ```
    /// void glFramebufferTextureFaceARB((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum face);
    /// ```
    public void FramebufferTextureFaceARB(int target, int attachment, int texture, int level, int face) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureFaceARB)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureFaceARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureFaceARB", target, attachment, texture, level, face); }
        Handles.MH_glFramebufferTextureFaceARB.get().invokeExact(handles.PFN_glFramebufferTextureFaceARB, target, attachment, texture, level, face); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureFaceARB", e); }
    }

}
