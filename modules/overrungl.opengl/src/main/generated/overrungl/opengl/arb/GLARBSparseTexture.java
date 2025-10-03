// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_sparse_texture`
public final class GLARBSparseTexture {
    public static final int GL_TEXTURE_SPARSE_ARB = 0x91A6;
    public static final int GL_VIRTUAL_PAGE_SIZE_INDEX_ARB = 0x91A7;
    public static final int GL_NUM_SPARSE_LEVELS_ARB = 0x91AA;
    public static final int GL_NUM_VIRTUAL_PAGE_SIZES_ARB = 0x91A8;
    public static final int GL_VIRTUAL_PAGE_SIZE_X_ARB = 0x9195;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_ARB = 0x9196;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_ARB = 0x9197;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_ARB = 0x9198;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_ARB = 0x9199;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS_ARB = 0x919A;
    public static final int GL_SPARSE_TEXTURE_FULL_ARRAY_CUBE_MIPMAPS_ARB = 0x91A9;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexPageCommitmentARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public final MemorySegment PFN_glTexPageCommitmentARB;
        private Handles(GLLoadFunc func) {
            PFN_glTexPageCommitmentARB = func.invoke("glTexPageCommitmentARB");
        }
    }

    public GLARBSparseTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexPageCommitmentARB`.
    /// ```
    /// void glTexPageCommitmentARB((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean commit);
    /// ```
    public void TexPageCommitmentARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexPageCommitmentARB)) throw new GLSymbolNotFoundError("Symbol not found: glTexPageCommitmentARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexPageCommitmentARB", target, level, xoffset, yoffset, zoffset, width, height, depth, commit); }
        Handles.MH_glTexPageCommitmentARB.invokeExact(handles.PFN_glTexPageCommitmentARB, target, level, xoffset, yoffset, zoffset, width, height, depth, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexPageCommitmentARB", e); }
    }

}
