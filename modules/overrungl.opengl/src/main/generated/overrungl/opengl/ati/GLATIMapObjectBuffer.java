// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_map_object_buffer`
public final class GLATIMapObjectBuffer {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMapObjectBufferATI = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapObjectBufferATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMapObjectBufferATI;
        public final MemorySegment PFN_glUnmapObjectBufferATI;
        private Handles(GLLoadFunc func) {
            PFN_glMapObjectBufferATI = func.invoke("glMapObjectBufferATI");
            PFN_glUnmapObjectBufferATI = func.invoke("glUnmapObjectBufferATI");
        }
    }

    public GLATIMapObjectBuffer(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMapObjectBufferATI`.
    /// ```
    /// void* glMapObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public @NonNull MemorySegment MapObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glMapObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapObjectBufferATI", buffer); }
        return (MemorySegment) Handles.MH_glMapObjectBufferATI.invokeExact(handles.PFN_glMapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in MapObjectBufferATI", e); }
    }

    /// Invokes `glUnmapObjectBufferATI`.
    /// ```
    /// void glUnmapObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public void UnmapObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glUnmapObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUnmapObjectBufferATI", buffer); }
        Handles.MH_glUnmapObjectBufferATI.invokeExact(handles.PFN_glUnmapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapObjectBufferATI", e); }
    }

}
