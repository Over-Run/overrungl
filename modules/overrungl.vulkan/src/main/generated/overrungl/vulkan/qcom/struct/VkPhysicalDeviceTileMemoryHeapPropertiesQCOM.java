// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTileMemoryHeapPropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileMemoryHeapPropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 queueSubmitBoundary;
///     VkBool32 tileBufferTransfers;
/// }
/// ```
public final class VkPhysicalDeviceTileMemoryHeapPropertiesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueSubmitBoundary"),
        ValueLayout.JAVA_INT.withName("tileBufferTransfers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queueSubmitBoundary = LAYOUT.byteOffset(PathElement.groupElement("queueSubmitBoundary"));
    public static final long OFFSET_tileBufferTransfers = LAYOUT.byteOffset(PathElement.groupElement("tileBufferTransfers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queueSubmitBoundary = LAYOUT.select(PathElement.groupElement("queueSubmitBoundary"));
    public static final MemoryLayout LAYOUT_tileBufferTransfers = LAYOUT.select(PathElement.groupElement("tileBufferTransfers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queueSubmitBoundary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueSubmitBoundary"));
    public static final VarHandle VH_tileBufferTransfers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileBufferTransfers"));

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM); }
    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM);
        return s;
    }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM copyFrom(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM at(long index, Consumer<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queueSubmitBoundaryAt(long index) { return (int) VH_queueSubmitBoundary.get(this.segment(), 0L, index); }
    public int tileBufferTransfersAt(long index) { return (int) VH_tileBufferTransfers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queueSubmitBoundary() { return (int) VH_queueSubmitBoundary.get(this.segment(), 0L, 0L); }
    public int tileBufferTransfers() { return (int) VH_tileBufferTransfers.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundaryAt(long index, int value) { VH_queueSubmitBoundary.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfersAt(long index, int value) { VH_tileBufferTransfers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundary(int value) { VH_queueSubmitBoundary.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfers(int value) { VH_tileBufferTransfers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueSubmitBoundaryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueSubmitBoundary, index), LAYOUT_queueSubmitBoundary); }
    public MemorySegment _queueSubmitBoundary() { return _queueSubmitBoundaryAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _queueSubmitBoundaryAt(long index, MemorySegment src) { _queueSubmitBoundaryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _queueSubmitBoundary(MemorySegment src) { return _queueSubmitBoundaryAt(0L, src); }
    public MemorySegment _tileBufferTransfersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileBufferTransfers, index), LAYOUT_tileBufferTransfers); }
    public MemorySegment _tileBufferTransfers() { return _tileBufferTransfersAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _tileBufferTransfersAt(long index, MemorySegment src) { _tileBufferTransfersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM _tileBufferTransfers(MemorySegment src) { return _tileBufferTransfersAt(0L, src); }
}
