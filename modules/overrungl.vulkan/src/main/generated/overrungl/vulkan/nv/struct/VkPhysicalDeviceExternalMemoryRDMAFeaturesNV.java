// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalMemoryRDMAFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 externalMemoryRDMA;
/// }
/// ```
public final class VkPhysicalDeviceExternalMemoryRDMAFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalMemoryRDMA")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_externalMemoryRDMA = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryRDMA"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_externalMemoryRDMA = LAYOUT.select(PathElement.groupElement("externalMemoryRDMA"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_externalMemoryRDMA = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryRDMA"));

    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVExternalMemoryRdma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV); }
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVExternalMemoryRdma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV copyFrom(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV at(long index, Consumer<VkPhysicalDeviceExternalMemoryRDMAFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int externalMemoryRDMAAt(long index) { return (int) VH_externalMemoryRDMA.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int externalMemoryRDMA() { return (int) VH_externalMemoryRDMA.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV externalMemoryRDMAAt(long index, int value) { VH_externalMemoryRDMA.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV externalMemoryRDMA(int value) { VH_externalMemoryRDMA.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalMemoryRDMAAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalMemoryRDMA, index), LAYOUT_externalMemoryRDMA); }
    public MemorySegment _externalMemoryRDMA() { return _externalMemoryRDMAAt(0L); }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV _externalMemoryRDMAAt(long index, MemorySegment src) { _externalMemoryRDMAAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV _externalMemoryRDMA(MemorySegment src) { return _externalMemoryRDMAAt(0L, src); }
}
