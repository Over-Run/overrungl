// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_texture_range`
public final class GLAPPLETextureRange {
    public static final int GL_TEXTURE_RANGE_LENGTH_APPLE = 0x85B7;
    public static final int GL_TEXTURE_RANGE_POINTER_APPLE = 0x85B8;
    public static final int GL_TEXTURE_STORAGE_HINT_APPLE = 0x85BC;
    public static final int GL_STORAGE_PRIVATE_APPLE = 0x85BD;
    public static final int GL_STORAGE_CACHED_APPLE = 0x85BE;
    public static final int GL_STORAGE_SHARED_APPLE = 0x85BF;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTextureRangeAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetTexParameterPointervAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glTextureRangeAPPLE;
        public final MemorySegment PFN_glGetTexParameterPointervAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glTextureRangeAPPLE = func.invoke("glTextureRangeAPPLE");
            PFN_glGetTexParameterPointervAPPLE = func.invoke("glGetTexParameterPointervAPPLE");
        }
    }

    public GLAPPLETextureRange(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTextureRangeAPPLE`.
    /// ```
    /// void glTextureRangeAPPLE((unsigned int) GLenum target, (int) GLsizei length, const void* pointer);
    /// ```
    public void TextureRangeAPPLE(int target, int length, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureRangeAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glTextureRangeAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureRangeAPPLE", target, length, pointer); }
        Handles.MH_glTextureRangeAPPLE.get().invokeExact(handles.PFN_glTextureRangeAPPLE, target, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in TextureRangeAPPLE", e); }
    }

    /// Invokes `glGetTexParameterPointervAPPLE`.
    /// ```
    /// void glGetTexParameterPointervAPPLE((unsigned int) GLenum target, (unsigned int) GLenum pname, void** params);
    /// ```
    public void GetTexParameterPointervAPPLE(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterPointervAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterPointervAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexParameterPointervAPPLE", target, pname, params); }
        Handles.MH_glGetTexParameterPointervAPPLE.get().invokeExact(handles.PFN_glGetTexParameterPointervAPPLE, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterPointervAPPLE", e); }
    }

}
