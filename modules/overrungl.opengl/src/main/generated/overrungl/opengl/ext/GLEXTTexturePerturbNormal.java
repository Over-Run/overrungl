// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_texture_perturb_normal`
public final class GLEXTTexturePerturbNormal {
    public static final int GL_PERTURB_EXT = 0x85AE;
    public static final int GL_TEXTURE_NORMAL_EXT = 0x85AF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTextureNormalEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glTextureNormalEXT;
        private Handles(GLLoadFunc func) {
            PFN_glTextureNormalEXT = func.invoke("glTextureNormalEXT");
        }
    }

    public GLEXTTexturePerturbNormal(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTextureNormalEXT`.
    /// ```
    /// void glTextureNormalEXT((unsigned int) GLenum mode);
    /// ```
    public void TextureNormalEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureNormalEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureNormalEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureNormalEXT", mode); }
        Handles.MH_glTextureNormalEXT.invokeExact(handles.PFN_glTextureNormalEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in TextureNormalEXT", e); }
    }

}
