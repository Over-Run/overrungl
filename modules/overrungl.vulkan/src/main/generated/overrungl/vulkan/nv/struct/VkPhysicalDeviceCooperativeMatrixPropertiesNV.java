// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeMatrixPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeMatrixPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkShaderStageFlags cooperativeMatrixSupportedStages;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeMatrixPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixSupportedStages")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cooperativeMatrixSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixSupportedStages"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixSupportedStages = LAYOUT.select(PathElement.groupElement("cooperativeMatrixSupportedStages"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cooperativeMatrixSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixSupportedStages"));

    public VkPhysicalDeviceCooperativeMatrixPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrixPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrixPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV); }
    public static VkPhysicalDeviceCooperativeMatrixPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV copyFrom(VkPhysicalDeviceCooperativeMatrixPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeMatrixPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrixPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrixPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV at(long index, Consumer<VkPhysicalDeviceCooperativeMatrixPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeMatrixSupportedStagesAt(long index) { return (int) VH_cooperativeMatrixSupportedStages.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixSupportedStages() { return (int) VH_cooperativeMatrixSupportedStages.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV cooperativeMatrixSupportedStagesAt(long index, int value) { VH_cooperativeMatrixSupportedStages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV cooperativeMatrixSupportedStages(int value) { VH_cooperativeMatrixSupportedStages.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeMatrixSupportedStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixSupportedStages, index), LAYOUT_cooperativeMatrixSupportedStages); }
    public MemorySegment _cooperativeMatrixSupportedStages() { return _cooperativeMatrixSupportedStagesAt(0L); }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV _cooperativeMatrixSupportedStagesAt(long index, MemorySegment src) { _cooperativeMatrixSupportedStagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrixPropertiesNV _cooperativeMatrixSupportedStages(MemorySegment src) { return _cooperativeMatrixSupportedStagesAt(0L, src); }
}
