// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.apple;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_APPLE_object_purgeable`
public final class GLAPPLEObjectPurgeable {
    public static final int GL_BUFFER_OBJECT_APPLE = 0x85B3;
    public static final int GL_RELEASED_APPLE = 0x8A19;
    public static final int GL_VOLATILE_APPLE = 0x8A1A;
    public static final int GL_RETAINED_APPLE = 0x8A1B;
    public static final int GL_UNDEFINED_APPLE = 0x8A1C;
    public static final int GL_PURGEABLE_APPLE = 0x8A1D;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glObjectPurgeableAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glObjectUnpurgeableAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glGetObjectParameterivAPPLE = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glObjectPurgeableAPPLE;
        public final MemorySegment PFN_glObjectUnpurgeableAPPLE;
        public final MemorySegment PFN_glGetObjectParameterivAPPLE;
        private Handles(GLLoadFunc func) {
            PFN_glObjectPurgeableAPPLE = func.invoke("glObjectPurgeableAPPLE");
            PFN_glObjectUnpurgeableAPPLE = func.invoke("glObjectUnpurgeableAPPLE");
            PFN_glGetObjectParameterivAPPLE = func.invoke("glGetObjectParameterivAPPLE");
        }
    }

    public GLAPPLEObjectPurgeable(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glObjectPurgeableAPPLE`.
    /// ```
    /// (unsigned int) GLenum glObjectPurgeableAPPLE((unsigned int) GLenum objectType, (unsigned int) GLuint name, (unsigned int) GLenum option);
    /// ```
    public int ObjectPurgeableAPPLE(int objectType, int name, int option) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPurgeableAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glObjectPurgeableAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glObjectPurgeableAPPLE", objectType, name, option); }
        return (int) Handles.MH_glObjectPurgeableAPPLE.get().invokeExact(handles.PFN_glObjectPurgeableAPPLE, objectType, name, option); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPurgeableAPPLE", e); }
    }

    /// Invokes `glObjectUnpurgeableAPPLE`.
    /// ```
    /// (unsigned int) GLenum glObjectUnpurgeableAPPLE((unsigned int) GLenum objectType, (unsigned int) GLuint name, (unsigned int) GLenum option);
    /// ```
    public int ObjectUnpurgeableAPPLE(int objectType, int name, int option) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectUnpurgeableAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glObjectUnpurgeableAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glObjectUnpurgeableAPPLE", objectType, name, option); }
        return (int) Handles.MH_glObjectUnpurgeableAPPLE.get().invokeExact(handles.PFN_glObjectUnpurgeableAPPLE, objectType, name, option); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectUnpurgeableAPPLE", e); }
    }

    /// Invokes `glGetObjectParameterivAPPLE`.
    /// ```
    /// void glGetObjectParameterivAPPLE((unsigned int) GLenum objectType, (unsigned int) GLuint name, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetObjectParameterivAPPLE(int objectType, int name, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectParameterivAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectParameterivAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectParameterivAPPLE", objectType, name, pname, params); }
        Handles.MH_glGetObjectParameterivAPPLE.get().invokeExact(handles.PFN_glGetObjectParameterivAPPLE, objectType, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectParameterivAPPLE", e); }
    }

}
