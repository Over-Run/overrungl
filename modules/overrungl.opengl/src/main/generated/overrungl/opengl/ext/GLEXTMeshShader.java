// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_mesh_shader`
public final class GLEXTMeshShader {
    public static final int GL_MESH_SHADER_EXT = 0x9559;
    public static final int GL_TASK_SHADER_EXT = 0x955A;
    public static final int GL_MAX_MESH_UNIFORM_BLOCKS_EXT = 0x8E60;
    public static final int GL_MAX_MESH_TEXTURE_IMAGE_UNITS_EXT = 0x8E61;
    public static final int GL_MAX_MESH_IMAGE_UNIFORMS_EXT = 0x8E62;
    public static final int GL_MAX_MESH_UNIFORM_COMPONENTS_EXT = 0x8E63;
    public static final int GL_MAX_MESH_ATOMIC_COUNTER_BUFFERS_EXT = 0x8E64;
    public static final int GL_MAX_MESH_ATOMIC_COUNTERS_EXT = 0x8E65;
    public static final int GL_MAX_MESH_SHADER_STORAGE_BLOCKS_EXT = 0x8E66;
    public static final int GL_MAX_COMBINED_MESH_UNIFORM_COMPONENTS_EXT = 0x8E67;
    public static final int GL_MAX_TASK_UNIFORM_BLOCKS_EXT = 0x8E68;
    public static final int GL_MAX_TASK_TEXTURE_IMAGE_UNITS_EXT = 0x8E69;
    public static final int GL_MAX_TASK_IMAGE_UNIFORMS_EXT = 0x8E6A;
    public static final int GL_MAX_TASK_UNIFORM_COMPONENTS_EXT = 0x8E6B;
    public static final int GL_MAX_TASK_ATOMIC_COUNTER_BUFFERS_EXT = 0x8E6C;
    public static final int GL_MAX_TASK_ATOMIC_COUNTERS_EXT = 0x8E6D;
    public static final int GL_MAX_TASK_SHADER_STORAGE_BLOCKS_EXT = 0x8E6E;
    public static final int GL_MAX_COMBINED_TASK_UNIFORM_COMPONENTS_EXT = 0x8E6F;
    public static final int GL_MAX_TASK_WORK_GROUP_TOTAL_COUNT_EXT = 0x9740;
    public static final int GL_MAX_MESH_WORK_GROUP_TOTAL_COUNT_EXT = 0x9741;
    public static final int GL_MAX_MESH_WORK_GROUP_INVOCATIONS_EXT = 0x9757;
    public static final int GL_MAX_TASK_WORK_GROUP_INVOCATIONS_EXT = 0x9759;
    public static final int GL_MAX_TASK_PAYLOAD_SIZE_EXT = 0x9742;
    public static final int GL_MAX_TASK_SHARED_MEMORY_SIZE_EXT = 0x9743;
    public static final int GL_MAX_MESH_SHARED_MEMORY_SIZE_EXT = 0x9744;
    public static final int GL_MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_EXT = 0x9745;
    public static final int GL_MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_EXT = 0x9746;
    public static final int GL_MAX_MESH_OUTPUT_MEMORY_SIZE_EXT = 0x9747;
    public static final int GL_MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_EXT = 0x9748;
    public static final int GL_MAX_MESH_OUTPUT_VERTICES_EXT = 0x9538;
    public static final int GL_MAX_MESH_OUTPUT_PRIMITIVES_EXT = 0x9756;
    public static final int GL_MAX_MESH_OUTPUT_COMPONENTS_EXT = 0x9749;
    public static final int GL_MAX_MESH_OUTPUT_LAYERS_EXT = 0x974A;
    public static final int GL_MAX_MESH_MULTIVIEW_VIEW_COUNT_EXT = 0x9557;
    public static final int GL_MESH_OUTPUT_PER_VERTEX_GRANULARITY_EXT = 0x92DF;
    public static final int GL_MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_EXT = 0x9543;
    public static final int GL_MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_EXT = 0x974B;
    public static final int GL_MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_EXT = 0x974C;
    public static final int GL_MESH_PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_EXT = 0x974D;
    public static final int GL_MESH_PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_EXT = 0x974E;
    public static final int GL_MESH_PREFERS_COMPACT_VERTEX_OUTPUT_EXT = 0x974F;
    public static final int GL_MESH_PREFERS_COMPACT_PRIMITIVE_OUTPUT_EXT = 0x9750;
    public static final int GL_MAX_TASK_WORK_GROUP_COUNT_EXT = 0x9751;
    public static final int GL_MAX_MESH_WORK_GROUP_COUNT_EXT = 0x9752;
    public static final int GL_MAX_MESH_WORK_GROUP_SIZE_EXT = 0x9758;
    public static final int GL_MAX_TASK_WORK_GROUP_SIZE_EXT = 0x975A;
    public static final int GL_MESH_WORK_GROUP_SIZE_EXT = 0x953E;
    public static final int GL_TASK_WORK_GROUP_SIZE_EXT = 0x953F;
    public static final int GL_MESH_VERTICES_OUT_EXT = 0x9579;
    public static final int GL_MESH_PRIMITIVES_OUT_EXT = 0x957A;
    public static final int GL_MESH_OUTPUT_TYPE_EXT = 0x957B;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_MESH_SHADER_EXT = 0x959C;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TASK_SHADER_EXT = 0x959D;
    public static final int GL_REFERENCED_BY_MESH_SHADER_EXT = 0x95A0;
    public static final int GL_REFERENCED_BY_TASK_SHADER_EXT = 0x95A1;
    public static final int GL_TASK_SHADER_INVOCATIONS_EXT = 0x9753;
    public static final int GL_MESH_SHADER_INVOCATIONS_EXT = 0x9754;
    public static final int GL_MESH_PRIMITIVES_GENERATED_EXT = 0x9755;
    public static final int GL_MESH_SHADER_BIT_EXT = 0x00000040;
    public static final int GL_TASK_SHADER_BIT_EXT = 0x00000080;
    public static final int GL_MESH_SUBROUTINE_EXT = 0x957C;
    public static final int GL_TASK_SUBROUTINE_EXT = 0x957D;
    public static final int GL_MESH_SUBROUTINE_UNIFORM_EXT = 0x957E;
    public static final int GL_TASK_SUBROUTINE_UNIFORM_EXT = 0x957F;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_MESH_SHADER_EXT = 0x959E;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TASK_SHADER_EXT = 0x959F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawMeshTasksEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawMeshTasksIndirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glMultiDrawMeshTasksIndirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawMeshTasksIndirectCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawMeshTasksEXT;
        public final MemorySegment PFN_glDrawMeshTasksIndirectEXT;
        public final MemorySegment PFN_glMultiDrawMeshTasksIndirectEXT;
        public final MemorySegment PFN_glMultiDrawMeshTasksIndirectCountEXT;
        private Handles(GLLoadFunc func) {
            PFN_glDrawMeshTasksEXT = func.invoke("glDrawMeshTasksEXT");
            PFN_glDrawMeshTasksIndirectEXT = func.invoke("glDrawMeshTasksIndirectEXT");
            PFN_glMultiDrawMeshTasksIndirectEXT = func.invoke("glMultiDrawMeshTasksIndirectEXT");
            PFN_glMultiDrawMeshTasksIndirectCountEXT = func.invoke("glMultiDrawMeshTasksIndirectCountEXT");
        }
    }

    public GLEXTMeshShader(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawMeshTasksEXT`.
    /// ```
    /// void glDrawMeshTasksEXT((unsigned int) GLuint num_groups_x, (unsigned int) GLuint num_groups_y, (unsigned int) GLuint num_groups_z);
    /// ```
    public void DrawMeshTasksEXT(int num_groups_x, int num_groups_y, int num_groups_z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawMeshTasksEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDrawMeshTasksEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawMeshTasksEXT", num_groups_x, num_groups_y, num_groups_z); }
        Handles.MH_glDrawMeshTasksEXT.invokeExact(handles.PFN_glDrawMeshTasksEXT, num_groups_x, num_groups_y, num_groups_z); }
        catch (Throwable e) { throw new RuntimeException("error in DrawMeshTasksEXT", e); }
    }

    /// Invokes `glDrawMeshTasksIndirectEXT`.
    /// ```
    /// void glDrawMeshTasksIndirectEXT(((signed long long) khronos_intptr_t) GLintptr indirect);
    /// ```
    public void DrawMeshTasksIndirectEXT(long indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawMeshTasksIndirectEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDrawMeshTasksIndirectEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawMeshTasksIndirectEXT", indirect); }
        Handles.MH_glDrawMeshTasksIndirectEXT.invokeExact(handles.PFN_glDrawMeshTasksIndirectEXT, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DrawMeshTasksIndirectEXT", e); }
    }

    /// Invokes `glMultiDrawMeshTasksIndirectEXT`.
    /// ```
    /// void glMultiDrawMeshTasksIndirectEXT(((signed long long) khronos_intptr_t) GLintptr indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawMeshTasksIndirectEXT(long indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawMeshTasksIndirectEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawMeshTasksIndirectEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawMeshTasksIndirectEXT", indirect, drawcount, stride); }
        Handles.MH_glMultiDrawMeshTasksIndirectEXT.invokeExact(handles.PFN_glMultiDrawMeshTasksIndirectEXT, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawMeshTasksIndirectEXT", e); }
    }

    /// Invokes `glMultiDrawMeshTasksIndirectCountEXT`.
    /// ```
    /// void glMultiDrawMeshTasksIndirectCountEXT(((signed long long) khronos_intptr_t) GLintptr indirect, ((signed long long) khronos_intptr_t) GLintptr drawcount, (int) GLsizei maxdrawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawMeshTasksIndirectCountEXT(long indirect, long drawcount, int maxdrawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawMeshTasksIndirectCountEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawMeshTasksIndirectCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawMeshTasksIndirectCountEXT", indirect, drawcount, maxdrawcount, stride); }
        Handles.MH_glMultiDrawMeshTasksIndirectCountEXT.invokeExact(handles.PFN_glMultiDrawMeshTasksIndirectCountEXT, indirect, drawcount, maxdrawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawMeshTasksIndirectCountEXT", e); }
    }

}
