// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDispatchTileInfoQCOM`.
/// ## Layout
/// ```
/// struct VkDispatchTileInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
/// }
/// ```
public final class VkDispatchTileInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));

    public VkDispatchTileInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDispatchTileInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchTileInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDispatchTileInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchTileInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDispatchTileInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDispatchTileInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDispatchTileInfoQCOM alloc(SegmentAllocator allocator) { return new VkDispatchTileInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkDispatchTileInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkDispatchTileInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkDispatchTileInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMTileShading.VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM); }
    public static VkDispatchTileInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMTileShading.VK_STRUCTURE_TYPE_DISPATCH_TILE_INFO_QCOM);
        return s;
    }
    public VkDispatchTileInfoQCOM copyFrom(VkDispatchTileInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDispatchTileInfoQCOM reinterpret(long count) { return new VkDispatchTileInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDispatchTileInfoQCOM asSlice(long index) { return new VkDispatchTileInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDispatchTileInfoQCOM asSlice(long index, long count) { return new VkDispatchTileInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDispatchTileInfoQCOM at(long index, Consumer<VkDispatchTileInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public VkDispatchTileInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchTileInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDispatchTileInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDispatchTileInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDispatchTileInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDispatchTileInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDispatchTileInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDispatchTileInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
}
