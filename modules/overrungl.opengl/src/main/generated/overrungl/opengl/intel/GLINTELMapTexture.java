// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.intel;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_INTEL_map_texture`
public final class GLINTELMapTexture {
    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;
    public static final int GL_LAYOUT_DEFAULT_INTEL = 0;
    public static final int GL_LAYOUT_LINEAR_INTEL = 1;
    public static final int GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glSyncTextureINTEL = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glUnmapTexture2DINTEL = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glMapTexture2DINTEL = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glSyncTextureINTEL;
        public final MemorySegment PFN_glUnmapTexture2DINTEL;
        public final MemorySegment PFN_glMapTexture2DINTEL;
        private Handles(GLLoadFunc func) {
            PFN_glSyncTextureINTEL = func.invoke("glSyncTextureINTEL");
            PFN_glUnmapTexture2DINTEL = func.invoke("glUnmapTexture2DINTEL");
            PFN_glMapTexture2DINTEL = func.invoke("glMapTexture2DINTEL");
        }
    }

    public GLINTELMapTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSyncTextureINTEL`.
    /// ```
    /// void glSyncTextureINTEL((unsigned int) GLuint texture);
    /// ```
    public void SyncTextureINTEL(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSyncTextureINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glSyncTextureINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSyncTextureINTEL", texture); }
        Handles.MH_glSyncTextureINTEL.get().invokeExact(handles.PFN_glSyncTextureINTEL, texture); }
        catch (Throwable e) { throw new RuntimeException("error in SyncTextureINTEL", e); }
    }

    /// Invokes `glUnmapTexture2DINTEL`.
    /// ```
    /// void glUnmapTexture2DINTEL((unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void UnmapTexture2DINTEL(int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapTexture2DINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glUnmapTexture2DINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUnmapTexture2DINTEL", texture, level); }
        Handles.MH_glUnmapTexture2DINTEL.get().invokeExact(handles.PFN_glUnmapTexture2DINTEL, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapTexture2DINTEL", e); }
    }

    /// Invokes `glMapTexture2DINTEL`.
    /// ```
    /// void* glMapTexture2DINTEL((unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLbitfield access, GLint* stride, GLenum* layout);
    /// ```
    public @NonNull MemorySegment MapTexture2DINTEL(int texture, int level, int access, @NonNull MemorySegment stride, @NonNull MemorySegment layout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapTexture2DINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glMapTexture2DINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapTexture2DINTEL", texture, level, access, stride, layout); }
        return (MemorySegment) Handles.MH_glMapTexture2DINTEL.get().invokeExact(handles.PFN_glMapTexture2DINTEL, texture, level, access, stride, layout); }
        catch (Throwable e) { throw new RuntimeException("error in MapTexture2DINTEL", e); }
    }

}
