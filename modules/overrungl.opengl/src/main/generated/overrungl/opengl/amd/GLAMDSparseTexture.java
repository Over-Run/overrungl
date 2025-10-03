// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_sparse_texture`
public final class GLAMDSparseTexture {
    public static final int GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_AMD = 0x9198;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD = 0x9199;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;
    public static final int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;
    public static final int GL_MIN_LOD_WARNING_AMD = 0x919C;
    public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x00000001;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTexStorageSparseAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glTextureStorageSparseAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glTexStorageSparseAMD;
        public final MemorySegment PFN_glTextureStorageSparseAMD;
        private Handles(GLLoadFunc func) {
            PFN_glTexStorageSparseAMD = func.invoke("glTexStorageSparseAMD");
            PFN_glTextureStorageSparseAMD = func.invoke("glTextureStorageSparseAMD");
        }
    }

    public GLAMDSparseTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexStorageSparseAMD`.
    /// ```
    /// void glTexStorageSparseAMD((unsigned int) GLenum target, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLsizei layers, (unsigned int) GLbitfield flags);
    /// ```
    public void TexStorageSparseAMD(int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorageSparseAMD)) throw new GLSymbolNotFoundError("Symbol not found: glTexStorageSparseAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexStorageSparseAMD", target, internalFormat, width, height, depth, layers, flags); }
        Handles.MH_glTexStorageSparseAMD.get().invokeExact(handles.PFN_glTexStorageSparseAMD, target, internalFormat, width, height, depth, layers, flags); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorageSparseAMD", e); }
    }

    /// Invokes `glTextureStorageSparseAMD`.
    /// ```
    /// void glTextureStorageSparseAMD((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum internalFormat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLsizei layers, (unsigned int) GLbitfield flags);
    /// ```
    public void TextureStorageSparseAMD(int texture, int target, int internalFormat, int width, int height, int depth, int layers, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorageSparseAMD)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorageSparseAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorageSparseAMD", texture, target, internalFormat, width, height, depth, layers, flags); }
        Handles.MH_glTextureStorageSparseAMD.get().invokeExact(handles.PFN_glTextureStorageSparseAMD, texture, target, internalFormat, width, height, depth, layers, flags); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorageSparseAMD", e); }
    }

}
