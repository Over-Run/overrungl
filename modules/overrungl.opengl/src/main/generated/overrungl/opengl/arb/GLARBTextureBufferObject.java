// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_texture_buffer_object`
public final class GLARBTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_ARB = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER_ARB = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D;
    public static final int GL_TEXTURE_BUFFER_FORMAT_ARB = 0x8C2E;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTexBufferARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glTexBufferARB;
        private Handles(GLLoadFunc func) {
            PFN_glTexBufferARB = func.invoke("glTexBufferARB", "glTexBuffer");
        }
    }

    public GLARBTextureBufferObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexBufferARB`.
    /// ```
    /// void glTexBufferARB((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer);
    /// ```
    public void TexBufferARB(int target, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBufferARB)) throw new GLSymbolNotFoundError("Symbol not found: glTexBufferARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexBufferARB", target, internalformat, buffer); }
        Handles.MH_glTexBufferARB.get().invokeExact(handles.PFN_glTexBufferARB, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TexBufferARB", e); }
    }

}
