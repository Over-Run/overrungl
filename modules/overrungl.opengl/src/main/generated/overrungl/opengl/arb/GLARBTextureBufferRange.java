// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_texture_buffer_range`
public final class GLARBTextureBufferRange {
    public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
    public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glTexBufferRange;
        private Handles(GLLoadFunc func) {
            PFN_glTexBufferRange = func.invoke("glTexBufferRange");
        }
    }

    public GLARBTextureBufferRange(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexBufferRange`.
    /// ```
    /// void glTexBufferRange((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void TexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glTexBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexBufferRange", target, internalformat, buffer, offset, size); }
        Handles.MH_glTexBufferRange.invokeExact(handles.PFN_glTexBufferRange, target, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TexBufferRange", e); }
    }

}
