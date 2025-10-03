// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_texture_buffer_object`
public final class GLEXTTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_EXT = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 0x8C2D;
    public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = 0x8C2E;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTexBufferEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glTexBufferEXT;
        private Handles(GLLoadFunc func) {
            PFN_glTexBufferEXT = func.invoke("glTexBufferEXT", "glTexBuffer");
        }
    }

    public GLEXTTextureBufferObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexBufferEXT`.
    /// ```
    /// void glTexBufferEXT((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer);
    /// ```
    public void TexBufferEXT(int target, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexBufferEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexBufferEXT", target, internalformat, buffer); }
        Handles.MH_glTexBufferEXT.get().invokeExact(handles.PFN_glTexBufferEXT, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TexBufferEXT", e); }
    }

}
