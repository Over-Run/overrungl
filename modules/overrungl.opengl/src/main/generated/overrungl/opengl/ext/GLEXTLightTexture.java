// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_light_texture`
public final class GLEXTLightTexture {
    public static final int GL_FRAGMENT_MATERIAL_EXT = 0x8349;
    public static final int GL_FRAGMENT_NORMAL_EXT = 0x834A;
    public static final int GL_FRAGMENT_COLOR_EXT = 0x834C;
    public static final int GL_ATTENUATION_EXT = 0x834D;
    public static final int GL_SHADOW_ATTENUATION_EXT = 0x834E;
    public static final int GL_TEXTURE_APPLICATION_MODE_EXT = 0x834F;
    public static final int GL_TEXTURE_LIGHT_EXT = 0x8350;
    public static final int GL_TEXTURE_MATERIAL_FACE_EXT = 0x8351;
    public static final int GL_TEXTURE_MATERIAL_PARAMETER_EXT = 0x8352;
    public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glApplyTextureEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTextureLightEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTextureMaterialEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glApplyTextureEXT;
        public final MemorySegment PFN_glTextureLightEXT;
        public final MemorySegment PFN_glTextureMaterialEXT;
        private Handles(GLLoadFunc func) {
            PFN_glApplyTextureEXT = func.invoke("glApplyTextureEXT");
            PFN_glTextureLightEXT = func.invoke("glTextureLightEXT");
            PFN_glTextureMaterialEXT = func.invoke("glTextureMaterialEXT");
        }
    }

    public GLEXTLightTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glApplyTextureEXT`.
    /// ```
    /// void glApplyTextureEXT((unsigned int) GLenum mode);
    /// ```
    public void ApplyTextureEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glApplyTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glApplyTextureEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glApplyTextureEXT", mode); }
        Handles.MH_glApplyTextureEXT.get().invokeExact(handles.PFN_glApplyTextureEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in ApplyTextureEXT", e); }
    }

    /// Invokes `glTextureLightEXT`.
    /// ```
    /// void glTextureLightEXT((unsigned int) GLenum pname);
    /// ```
    public void TextureLightEXT(int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureLightEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureLightEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureLightEXT", pname); }
        Handles.MH_glTextureLightEXT.get().invokeExact(handles.PFN_glTextureLightEXT, pname); }
        catch (Throwable e) { throw new RuntimeException("error in TextureLightEXT", e); }
    }

    /// Invokes `glTextureMaterialEXT`.
    /// ```
    /// void glTextureMaterialEXT((unsigned int) GLenum face, (unsigned int) GLenum mode);
    /// ```
    public void TextureMaterialEXT(int face, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureMaterialEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureMaterialEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureMaterialEXT", face, mode); }
        Handles.MH_glTextureMaterialEXT.get().invokeExact(handles.PFN_glTextureMaterialEXT, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in TextureMaterialEXT", e); }
    }

}
