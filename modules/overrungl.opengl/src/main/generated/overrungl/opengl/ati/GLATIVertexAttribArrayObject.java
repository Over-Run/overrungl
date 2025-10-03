// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_vertex_attrib_array_object`
public final class GLATIVertexAttribArrayObject {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribArrayObjectATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVertexAttribArrayObjectfvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribArrayObjectivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexAttribArrayObjectATI;
        public final MemorySegment PFN_glGetVertexAttribArrayObjectfvATI;
        public final MemorySegment PFN_glGetVertexAttribArrayObjectivATI;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttribArrayObjectATI = func.invoke("glVertexAttribArrayObjectATI");
            PFN_glGetVertexAttribArrayObjectfvATI = func.invoke("glGetVertexAttribArrayObjectfvATI");
            PFN_glGetVertexAttribArrayObjectivATI = func.invoke("glGetVertexAttribArrayObjectivATI");
        }
    }

    public GLATIVertexAttribArrayObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttribArrayObjectATI`.
    /// ```
    /// void glVertexAttribArrayObjectATI((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride, (unsigned int) GLuint buffer, (unsigned int) GLuint offset);
    /// ```
    public void VertexAttribArrayObjectATI(int index, int size, int type, boolean normalized, int stride, int buffer, int offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribArrayObjectATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribArrayObjectATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribArrayObjectATI", index, size, type, normalized, stride, buffer, offset); }
        Handles.MH_glVertexAttribArrayObjectATI.invokeExact(handles.PFN_glVertexAttribArrayObjectATI, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribArrayObjectATI", e); }
    }

    /// Invokes `glGetVertexAttribArrayObjectfvATI`.
    /// ```
    /// void glGetVertexAttribArrayObjectfvATI((unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribArrayObjectfvATI(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribArrayObjectfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribArrayObjectfvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribArrayObjectfvATI", index, pname, params); }
        Handles.MH_glGetVertexAttribArrayObjectfvATI.invokeExact(handles.PFN_glGetVertexAttribArrayObjectfvATI, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribArrayObjectfvATI", e); }
    }

    /// Invokes `glGetVertexAttribArrayObjectivATI`.
    /// ```
    /// void glGetVertexAttribArrayObjectivATI((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribArrayObjectivATI(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribArrayObjectivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribArrayObjectivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribArrayObjectivATI", index, pname, params); }
        Handles.MH_glGetVertexAttribArrayObjectivATI.invokeExact(handles.PFN_glGetVertexAttribArrayObjectivATI, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribArrayObjectivATI", e); }
    }

}
