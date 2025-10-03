// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_AMD_interleaved_elements`
public final class GLAMDInterleavedElements {
    public static final int GL_VERTEX_ELEMENT_SWIZZLE_AMD = 0x91A4;
    public static final int GL_VERTEX_ID_SWIZZLE_AMD = 0x91A5;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RGBA8UI = 0x8D7C;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glVertexAttribParameteriAMD = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glVertexAttribParameteriAMD;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttribParameteriAMD = func.invoke("glVertexAttribParameteriAMD");
        }
    }

    public GLAMDInterleavedElements(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttribParameteriAMD`.
    /// ```
    /// void glVertexAttribParameteriAMD((unsigned int) GLuint index, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void VertexAttribParameteriAMD(int index, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribParameteriAMD)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribParameteriAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribParameteriAMD", index, pname, param); }
        Handles.MH_glVertexAttribParameteriAMD.get().invokeExact(handles.PFN_glVertexAttribParameteriAMD, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribParameteriAMD", e); }
    }

}
