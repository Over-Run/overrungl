// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_copy_image`
public final class GLNVCopyImage {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCopyImageSubDataNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glCopyImageSubDataNV;
        private Handles(GLLoadFunc func) {
            PFN_glCopyImageSubDataNV = func.invoke("glCopyImageSubDataNV");
        }
    }

    public GLNVCopyImage(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCopyImageSubDataNV`.
    /// ```
    /// void glCopyImageSubDataNV((unsigned int) GLuint srcName, (unsigned int) GLenum srcTarget, (int) GLint srcLevel, (int) GLint srcX, (int) GLint srcY, (int) GLint srcZ, (unsigned int) GLuint dstName, (unsigned int) GLenum dstTarget, (int) GLint dstLevel, (int) GLint dstX, (int) GLint dstY, (int) GLint dstZ, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void CopyImageSubDataNV(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyImageSubDataNV)) throw new GLSymbolNotFoundError("Symbol not found: glCopyImageSubDataNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyImageSubDataNV", srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth); }
        Handles.MH_glCopyImageSubDataNV.invokeExact(handles.PFN_glCopyImageSubDataNV, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in CopyImageSubDataNV", e); }
    }

}
