// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCoreProperties2AMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCoreProperties2AMD {
///     VkStructureType sType;
///     void* pNext;
///     VkShaderCorePropertiesFlagsAMD shaderCoreFeatures;
///     uint32_t activeComputeUnitCount;
/// }
/// ```
public final class VkPhysicalDeviceShaderCoreProperties2AMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreFeatures"),
        ValueLayout.JAVA_INT.withName("activeComputeUnitCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderCoreFeatures = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreFeatures"));
    public static final long OFFSET_activeComputeUnitCount = LAYOUT.byteOffset(PathElement.groupElement("activeComputeUnitCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderCoreFeatures = LAYOUT.select(PathElement.groupElement("shaderCoreFeatures"));
    public static final MemoryLayout LAYOUT_activeComputeUnitCount = LAYOUT.select(PathElement.groupElement("activeComputeUnitCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderCoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreFeatures"));
    public static final VarHandle VH_activeComputeUnitCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("activeComputeUnitCount"));

    public VkPhysicalDeviceShaderCoreProperties2AMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreProperties2AMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreProperties2AMD(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCoreProperties2AMD(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDShaderCoreProperties2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD); }
    public static VkPhysicalDeviceShaderCoreProperties2AMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDShaderCoreProperties2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
        return s;
    }
    public VkPhysicalDeviceShaderCoreProperties2AMD copyFrom(VkPhysicalDeviceShaderCoreProperties2AMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD reinterpret(long count) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderCoreProperties2AMD asSlice(long index) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderCoreProperties2AMD asSlice(long index, long count) { return new VkPhysicalDeviceShaderCoreProperties2AMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderCoreProperties2AMD at(long index, Consumer<VkPhysicalDeviceShaderCoreProperties2AMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderCoreFeaturesAt(long index) { return (int) VH_shaderCoreFeatures.get(this.segment(), 0L, index); }
    public int activeComputeUnitCountAt(long index) { return (int) VH_activeComputeUnitCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderCoreFeatures() { return (int) VH_shaderCoreFeatures.get(this.segment(), 0L, 0L); }
    public int activeComputeUnitCount() { return (int) VH_activeComputeUnitCount.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderCoreProperties2AMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD shaderCoreFeaturesAt(long index, int value) { VH_shaderCoreFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD activeComputeUnitCountAt(long index, int value) { VH_activeComputeUnitCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD shaderCoreFeatures(int value) { VH_shaderCoreFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD activeComputeUnitCount(int value) { VH_activeComputeUnitCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderCoreProperties2AMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderCoreProperties2AMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderCoreFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCoreFeatures, index), LAYOUT_shaderCoreFeatures); }
    public MemorySegment _shaderCoreFeatures() { return _shaderCoreFeaturesAt(0L); }
    public VkPhysicalDeviceShaderCoreProperties2AMD _shaderCoreFeaturesAt(long index, MemorySegment src) { _shaderCoreFeaturesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD _shaderCoreFeatures(MemorySegment src) { return _shaderCoreFeaturesAt(0L, src); }
    public MemorySegment _activeComputeUnitCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_activeComputeUnitCount, index), LAYOUT_activeComputeUnitCount); }
    public MemorySegment _activeComputeUnitCount() { return _activeComputeUnitCountAt(0L); }
    public VkPhysicalDeviceShaderCoreProperties2AMD _activeComputeUnitCountAt(long index, MemorySegment src) { _activeComputeUnitCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreProperties2AMD _activeComputeUnitCount(MemorySegment src) { return _activeComputeUnitCountAt(0L, src); }
}
