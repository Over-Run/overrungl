// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_index_material`
public final class GLEXTIndexMaterial {
    public static final int GL_INDEX_MATERIAL_EXT = 0x81B8;
    public static final int GL_INDEX_MATERIAL_PARAMETER_EXT = 0x81B9;
    public static final int GL_INDEX_MATERIAL_FACE_EXT = 0x81BA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glIndexMaterialEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glIndexMaterialEXT;
        private Handles(GLLoadFunc func) {
            PFN_glIndexMaterialEXT = func.invoke("glIndexMaterialEXT");
        }
    }

    public GLEXTIndexMaterial(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glIndexMaterialEXT`.
    /// ```
    /// void glIndexMaterialEXT((unsigned int) GLenum face, (unsigned int) GLenum mode);
    /// ```
    public void IndexMaterialEXT(int face, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexMaterialEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIndexMaterialEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexMaterialEXT", face, mode); }
        Handles.MH_glIndexMaterialEXT.invokeExact(handles.PFN_glIndexMaterialEXT, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in IndexMaterialEXT", e); }
    }

}
