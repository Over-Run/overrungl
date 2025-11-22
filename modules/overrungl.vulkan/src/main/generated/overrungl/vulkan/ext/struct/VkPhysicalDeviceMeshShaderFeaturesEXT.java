// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMeshShaderFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 taskShader;
///     VkBool32 meshShader;
///     VkBool32 multiviewMeshShader;
///     VkBool32 primitiveFragmentShadingRateMeshShader;
///     VkBool32 meshShaderQueries;
/// }
/// ```
public final class VkPhysicalDeviceMeshShaderFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader"),
        ValueLayout.JAVA_INT.withName("multiviewMeshShader"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateMeshShader"),
        ValueLayout.JAVA_INT.withName("meshShaderQueries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_taskShader = LAYOUT.byteOffset(PathElement.groupElement("taskShader"));
    public static final long OFFSET_meshShader = LAYOUT.byteOffset(PathElement.groupElement("meshShader"));
    public static final long OFFSET_multiviewMeshShader = LAYOUT.byteOffset(PathElement.groupElement("multiviewMeshShader"));
    public static final long OFFSET_primitiveFragmentShadingRateMeshShader = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    public static final long OFFSET_meshShaderQueries = LAYOUT.byteOffset(PathElement.groupElement("meshShaderQueries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_taskShader = LAYOUT.select(PathElement.groupElement("taskShader"));
    public static final MemoryLayout LAYOUT_meshShader = LAYOUT.select(PathElement.groupElement("meshShader"));
    public static final MemoryLayout LAYOUT_multiviewMeshShader = LAYOUT.select(PathElement.groupElement("multiviewMeshShader"));
    public static final MemoryLayout LAYOUT_primitiveFragmentShadingRateMeshShader = LAYOUT.select(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    public static final MemoryLayout LAYOUT_meshShaderQueries = LAYOUT.select(PathElement.groupElement("meshShaderQueries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_taskShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskShader"));
    public static final VarHandle VH_meshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShader"));
    public static final VarHandle VH_multiviewMeshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewMeshShader"));
    public static final VarHandle VH_primitiveFragmentShadingRateMeshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveFragmentShadingRateMeshShader"));
    public static final VarHandle VH_meshShaderQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShaderQueries"));

    public VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT); }
    public static VkPhysicalDeviceMeshShaderFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMeshShaderFeaturesEXT copyFrom(VkPhysicalDeviceMeshShaderFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMeshShaderFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int taskShaderAt(long index) { return (int) VH_taskShader.get(this.segment(), 0L, index); }
    public int meshShaderAt(long index) { return (int) VH_meshShader.get(this.segment(), 0L, index); }
    public int multiviewMeshShaderAt(long index) { return (int) VH_multiviewMeshShader.get(this.segment(), 0L, index); }
    public int primitiveFragmentShadingRateMeshShaderAt(long index) { return (int) VH_primitiveFragmentShadingRateMeshShader.get(this.segment(), 0L, index); }
    public int meshShaderQueriesAt(long index) { return (int) VH_meshShaderQueries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int taskShader() { return (int) VH_taskShader.get(this.segment(), 0L, 0L); }
    public int meshShader() { return (int) VH_meshShader.get(this.segment(), 0L, 0L); }
    public int multiviewMeshShader() { return (int) VH_multiviewMeshShader.get(this.segment(), 0L, 0L); }
    public int primitiveFragmentShadingRateMeshShader() { return (int) VH_primitiveFragmentShadingRateMeshShader.get(this.segment(), 0L, 0L); }
    public int meshShaderQueries() { return (int) VH_meshShaderQueries.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShaderAt(long index, int value) { VH_taskShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderAt(long index, int value) { VH_meshShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShaderAt(long index, int value) { VH_multiviewMeshShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShaderAt(long index, int value) { VH_primitiveFragmentShadingRateMeshShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueriesAt(long index, int value) { VH_meshShaderQueries.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShader(int value) { VH_taskShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShader(int value) { VH_meshShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShader(int value) { VH_multiviewMeshShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShader(int value) { VH_primitiveFragmentShadingRateMeshShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueries(int value) { VH_meshShaderQueries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _taskShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_taskShader, index), LAYOUT_taskShader); }
    public MemorySegment _taskShader() { return _taskShaderAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _taskShaderAt(long index, MemorySegment src) { _taskShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _taskShader(MemorySegment src) { return _taskShaderAt(0L, src); }
    public MemorySegment _meshShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshShader, index), LAYOUT_meshShader); }
    public MemorySegment _meshShader() { return _meshShaderAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _meshShaderAt(long index, MemorySegment src) { _meshShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _meshShader(MemorySegment src) { return _meshShaderAt(0L, src); }
    public MemorySegment _multiviewMeshShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multiviewMeshShader, index), LAYOUT_multiviewMeshShader); }
    public MemorySegment _multiviewMeshShader() { return _multiviewMeshShaderAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _multiviewMeshShaderAt(long index, MemorySegment src) { _multiviewMeshShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _multiviewMeshShader(MemorySegment src) { return _multiviewMeshShaderAt(0L, src); }
    public MemorySegment _primitiveFragmentShadingRateMeshShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveFragmentShadingRateMeshShader, index), LAYOUT_primitiveFragmentShadingRateMeshShader); }
    public MemorySegment _primitiveFragmentShadingRateMeshShader() { return _primitiveFragmentShadingRateMeshShaderAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _primitiveFragmentShadingRateMeshShaderAt(long index, MemorySegment src) { _primitiveFragmentShadingRateMeshShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _primitiveFragmentShadingRateMeshShader(MemorySegment src) { return _primitiveFragmentShadingRateMeshShaderAt(0L, src); }
    public MemorySegment _meshShaderQueriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshShaderQueries, index), LAYOUT_meshShaderQueries); }
    public MemorySegment _meshShaderQueries() { return _meshShaderQueriesAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _meshShaderQueriesAt(long index, MemorySegment src) { _meshShaderQueriesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesEXT _meshShaderQueries(MemorySegment src) { return _meshShaderQueriesAt(0L, src); }
}
