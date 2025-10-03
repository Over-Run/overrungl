// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_texture_array`
public final class GLEXTTextureArray {
    public static final int GL_TEXTURE_1D_ARRAY_EXT = 0x8C18;
    public static final int GL_PROXY_TEXTURE_1D_ARRAY_EXT = 0x8C19;
    public static final int GL_TEXTURE_2D_ARRAY_EXT = 0x8C1A;
    public static final int GL_PROXY_TEXTURE_2D_ARRAY_EXT = 0x8C1B;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY_EXT = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY_EXT = 0x8C1D;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS_EXT = 0x88FF;
    public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE_EXT = 0x884E;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_EXT = 0x8CD4;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferTextureLayerEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glFramebufferTextureLayerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glFramebufferTextureLayerEXT = func.invoke("glFramebufferTextureLayerEXT", "glFramebufferTextureLayer");
        }
    }

    public GLEXTTextureArray(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFramebufferTextureLayerEXT`.
    /// ```
    /// void glFramebufferTextureLayerEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void FramebufferTextureLayerEXT(int target, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureLayerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureLayerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureLayerEXT", target, attachment, texture, level, layer); }
        Handles.MH_glFramebufferTextureLayerEXT.invokeExact(handles.PFN_glFramebufferTextureLayerEXT, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureLayerEXT", e); }
    }

}
