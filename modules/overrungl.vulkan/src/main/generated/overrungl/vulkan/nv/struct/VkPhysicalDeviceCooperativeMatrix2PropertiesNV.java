// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeMatrix2PropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t cooperativeMatrixWorkgroupScopeMaxWorkgroupSize;
///     uint32_t cooperativeMatrixFlexibleDimensionsMaxDimension;
///     uint32_t cooperativeMatrixWorkgroupScopeReservedSharedMemory;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeMatrix2PropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensionsMaxDimension"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeReservedSharedMemory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    public static final long OFFSET_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    public static final long OFFSET_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.select(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.select(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.select(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    public static final VarHandle VH_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    public static final VarHandle VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV); }
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV copyFrom(VkPhysicalDeviceCooperativeMatrix2PropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV at(long index, Consumer<VkPhysicalDeviceCooperativeMatrix2PropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index) { return (int) VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.get(this.segment(), 0L, index); }
    public int cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index) { return (int) VH_cooperativeMatrixFlexibleDimensionsMaxDimension.get(this.segment(), 0L, index); }
    public int cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index) { return (int) VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() { return (int) VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixFlexibleDimensionsMaxDimension() { return (int) VH_cooperativeMatrixFlexibleDimensionsMaxDimension.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixWorkgroupScopeReservedSharedMemory() { return (int) VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index, int value) { VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index, int value) { VH_cooperativeMatrixFlexibleDimensionsMaxDimension.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index, int value) { VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(int value) { VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixFlexibleDimensionsMaxDimension(int value) { VH_cooperativeMatrixFlexibleDimensionsMaxDimension.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeReservedSharedMemory(int value) { VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize, index), LAYOUT_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize); }
    public MemorySegment _cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() { return _cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index, MemorySegment src) { _cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment src) { return _cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(0L, src); }
    public MemorySegment _cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixFlexibleDimensionsMaxDimension, index), LAYOUT_cooperativeMatrixFlexibleDimensionsMaxDimension); }
    public MemorySegment _cooperativeMatrixFlexibleDimensionsMaxDimension() { return _cooperativeMatrixFlexibleDimensionsMaxDimensionAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index, MemorySegment src) { _cooperativeMatrixFlexibleDimensionsMaxDimensionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment src) { return _cooperativeMatrixFlexibleDimensionsMaxDimensionAt(0L, src); }
    public MemorySegment _cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixWorkgroupScopeReservedSharedMemory, index), LAYOUT_cooperativeMatrixWorkgroupScopeReservedSharedMemory); }
    public MemorySegment _cooperativeMatrixWorkgroupScopeReservedSharedMemory() { return _cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index, MemorySegment src) { _cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV _cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment src) { return _cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(0L, src); }
}
