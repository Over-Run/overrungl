// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_EGL_image_storage`
public final class GLEXTEGLImageStorage {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glEGLImageTargetTexStorageEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEGLImageTargetTextureStorageEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glEGLImageTargetTexStorageEXT;
        public final MemorySegment PFN_glEGLImageTargetTextureStorageEXT;
        private Handles(GLLoadFunc func) {
            PFN_glEGLImageTargetTexStorageEXT = func.invoke("glEGLImageTargetTexStorageEXT");PFN_glEGLImageTargetTextureStorageEXT = func.invoke("glEGLImageTargetTextureStorageEXT");
        }
    }

    public GLEXTEGLImageStorage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glEGLImageTargetTexStorageEXT`.
    /// ```
    /// void glEGLImageTargetTexStorageEXT((unsigned int) GLenum target, (void*) GLeglImageOES image, const GLint* attrib_list);
    /// ```
    public void EGLImageTargetTexStorageEXT(int target, @NonNull MemorySegment image, @NonNull MemorySegment attrib_list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEGLImageTargetTexStorageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEGLImageTargetTexStorageEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEGLImageTargetTexStorageEXT", target, image, attrib_list); }
        Handles.MH_glEGLImageTargetTexStorageEXT.invokeExact(handles.PFN_glEGLImageTargetTexStorageEXT, target, image, attrib_list); }
        catch (Throwable e) { throw new RuntimeException("error in EGLImageTargetTexStorageEXT", e); }
    }

    /// Invokes `glEGLImageTargetTextureStorageEXT`.
    /// ```
    /// void glEGLImageTargetTextureStorageEXT((unsigned int) GLuint texture, (void*) GLeglImageOES image, const GLint* attrib_list);
    /// ```
    public void EGLImageTargetTextureStorageEXT(int texture, @NonNull MemorySegment image, @NonNull MemorySegment attrib_list) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEGLImageTargetTextureStorageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEGLImageTargetTextureStorageEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEGLImageTargetTextureStorageEXT", texture, image, attrib_list); }
        Handles.MH_glEGLImageTargetTextureStorageEXT.invokeExact(handles.PFN_glEGLImageTargetTextureStorageEXT, texture, image, attrib_list); }
        catch (Throwable e) { throw new RuntimeException("error in EGLImageTargetTextureStorageEXT", e); }
    }

}
