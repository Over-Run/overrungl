// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTileMemoryHeapFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileMemoryHeapFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 tileMemoryHeap;
/// }
/// ```
public final class VkPhysicalDeviceTileMemoryHeapFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileMemoryHeap")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tileMemoryHeap = LAYOUT.byteOffset(PathElement.groupElement("tileMemoryHeap"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tileMemoryHeap = LAYOUT.select(PathElement.groupElement("tileMemoryHeap"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tileMemoryHeap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileMemoryHeap"));

    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM); }
    public static VkPhysicalDeviceTileMemoryHeapFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM copyFrom(VkPhysicalDeviceTileMemoryHeapFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileMemoryHeapFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceTileMemoryHeapFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tileMemoryHeapAt(long index) { return (int) VH_tileMemoryHeap.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tileMemoryHeap() { return (int) VH_tileMemoryHeap.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM tileMemoryHeapAt(long index, int value) { VH_tileMemoryHeap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM tileMemoryHeap(int value) { VH_tileMemoryHeap.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tileMemoryHeapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tileMemoryHeap, index), LAYOUT_tileMemoryHeap); }
    public MemorySegment _tileMemoryHeap() { return _tileMemoryHeapAt(0L); }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM _tileMemoryHeapAt(long index, MemorySegment src) { _tileMemoryHeapAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTileMemoryHeapFeaturesQCOM _tileMemoryHeap(MemorySegment src) { return _tileMemoryHeapAt(0L, src); }
}
