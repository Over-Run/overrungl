// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_shader_storage_buffer_object`
public final class GLARBShaderStorageBufferObject {
    public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;
    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
    public static final int GL_SHADER_STORAGE_BUFFER_START = 0x90D4;
    public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
    public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
    public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
    public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
    public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
    public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
    public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
    public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x00002000;
    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
    public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glShaderStorageBlockBinding = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glShaderStorageBlockBinding;
        private Handles(GLLoadFunc func) {
            PFN_glShaderStorageBlockBinding = func.invoke("glShaderStorageBlockBinding");
        }
    }

    public GLARBShaderStorageBufferObject(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glShaderStorageBlockBinding`.
    /// ```
    /// void glShaderStorageBlockBinding((unsigned int) GLuint program, (unsigned int) GLuint storageBlockIndex, (unsigned int) GLuint storageBlockBinding);
    /// ```
    public void ShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderStorageBlockBinding)) throw new GLSymbolNotFoundError("Symbol not found: glShaderStorageBlockBinding");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderStorageBlockBinding", program, storageBlockIndex, storageBlockBinding); }
        Handles.MH_glShaderStorageBlockBinding.get().invokeExact(handles.PFN_glShaderStorageBlockBinding, program, storageBlockIndex, storageBlockBinding); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderStorageBlockBinding", e); }
    }

}
