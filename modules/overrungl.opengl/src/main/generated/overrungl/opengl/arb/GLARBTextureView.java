// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_texture_view`
public final class GLARBTextureView {
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 0x82DD;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTextureView = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTextureView;
        private Handles(GLLoadFunc func) {
            PFN_glTextureView = func.invoke("glTextureView", "glTextureViewEXT", "glTextureViewOES");
        }
    }

    public GLARBTextureView(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTextureView`.
    /// ```
    /// void glTextureView((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLuint origtexture, (unsigned int) GLenum internalformat, (unsigned int) GLuint minlevel, (unsigned int) GLuint numlevels, (unsigned int) GLuint minlayer, (unsigned int) GLuint numlayers);
    /// ```
    public void TextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureView)) throw new GLSymbolNotFoundError("Symbol not found: glTextureView");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureView", texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers); }
        Handles.MH_glTextureView.invokeExact(handles.PFN_glTextureView, texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers); }
        catch (Throwable e) { throw new RuntimeException("error in TextureView", e); }
    }

}
