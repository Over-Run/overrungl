// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMeshShaderFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMeshShaderFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 taskShader;
///     VkBool32 meshShader;
/// }
/// ```
public final class VkPhysicalDeviceMeshShaderFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_taskShader = LAYOUT.byteOffset(PathElement.groupElement("taskShader"));
    public static final long OFFSET_meshShader = LAYOUT.byteOffset(PathElement.groupElement("meshShader"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_taskShader = LAYOUT.select(PathElement.groupElement("taskShader"));
    public static final MemoryLayout LAYOUT_meshShader = LAYOUT.select(PathElement.groupElement("meshShader"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_taskShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("taskShader"));
    public static final VarHandle VH_meshShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("meshShader"));

    public VkPhysicalDeviceMeshShaderFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMeshShaderFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMeshShaderFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV); }
    public static VkPhysicalDeviceMeshShaderFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVMeshShader.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceMeshShaderFeaturesNV copyFrom(VkPhysicalDeviceMeshShaderFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMeshShaderFeaturesNV asSlice(long index) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMeshShaderFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceMeshShaderFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMeshShaderFeaturesNV at(long index, Consumer<VkPhysicalDeviceMeshShaderFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int taskShaderAt(long index) { return (int) VH_taskShader.get(this.segment(), 0L, index); }
    public int meshShaderAt(long index) { return (int) VH_meshShader.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int taskShader() { return (int) VH_taskShader.get(this.segment(), 0L, 0L); }
    public int meshShader() { return (int) VH_meshShader.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMeshShaderFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShaderAt(long index, int value) { VH_taskShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShaderAt(long index, int value) { VH_meshShader.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV taskShader(int value) { VH_taskShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV meshShader(int value) { VH_meshShader.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _taskShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_taskShader, index), LAYOUT_taskShader); }
    public MemorySegment _taskShader() { return _taskShaderAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesNV _taskShaderAt(long index, MemorySegment src) { _taskShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV _taskShader(MemorySegment src) { return _taskShaderAt(0L, src); }
    public MemorySegment _meshShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_meshShader, index), LAYOUT_meshShader); }
    public MemorySegment _meshShader() { return _meshShaderAt(0L); }
    public VkPhysicalDeviceMeshShaderFeaturesNV _meshShaderAt(long index, MemorySegment src) { _meshShaderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMeshShaderFeaturesNV _meshShader(MemorySegment src) { return _meshShaderAt(0L, src); }
}
