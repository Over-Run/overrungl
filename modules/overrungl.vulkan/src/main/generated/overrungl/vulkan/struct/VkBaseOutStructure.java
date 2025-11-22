// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBaseOutStructure`.
/// ## Layout
/// ```
/// struct VkBaseOutStructure {
///     VkStructureType sType;
///     struct VkBaseOutStructure* pNext;
/// }
/// ```
public final class VkBaseOutStructure extends GroupType {
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

    public VkBaseOutStructure(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBaseOutStructure of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBaseOutStructure(segment, estimateCount(segment, LAYOUT)); }
    public static VkBaseOutStructure ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBaseOutStructure(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBaseOutStructure ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBaseOutStructure(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBaseOutStructure alloc(SegmentAllocator allocator) { return new VkBaseOutStructure(allocator.allocate(LAYOUT), 1); }
    public static VkBaseOutStructure alloc(SegmentAllocator allocator, long count) { return new VkBaseOutStructure(allocator.allocate(LAYOUT, count), count); }
    public VkBaseOutStructure copyFrom(VkBaseOutStructure src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBaseOutStructure reinterpret(long count) { return new VkBaseOutStructure(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBaseOutStructure asSlice(long index) { return new VkBaseOutStructure(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBaseOutStructure asSlice(long index, long count) { return new VkBaseOutStructure(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBaseOutStructure at(long index, Consumer<VkBaseOutStructure> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public VkBaseOutStructure sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBaseOutStructure pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBaseOutStructure sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBaseOutStructure pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBaseOutStructure _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBaseOutStructure _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBaseOutStructure _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBaseOutStructure _pNext(MemorySegment src) { return _pNextAt(0L, src); }
}
