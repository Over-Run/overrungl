// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBaseInStructure`.
/// ## Layout
/// ```
/// struct VkBaseInStructure {
///     VkStructureType sType;
///     const struct VkBaseInStructure* pNext;
/// }
/// ```
public final class VkBaseInStructure extends GroupType {
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

    public VkBaseInStructure(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBaseInStructure of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBaseInStructure(segment, estimateCount(segment, LAYOUT)); }
    public static VkBaseInStructure ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBaseInStructure(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBaseInStructure ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBaseInStructure(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBaseInStructure alloc(SegmentAllocator allocator) { return new VkBaseInStructure(allocator.allocate(LAYOUT), 1); }
    public static VkBaseInStructure alloc(SegmentAllocator allocator, long count) { return new VkBaseInStructure(allocator.allocate(LAYOUT, count), count); }
    public VkBaseInStructure copyFrom(VkBaseInStructure src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBaseInStructure reinterpret(long count) { return new VkBaseInStructure(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBaseInStructure asSlice(long index) { return new VkBaseInStructure(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBaseInStructure asSlice(long index, long count) { return new VkBaseInStructure(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBaseInStructure at(long index, Consumer<VkBaseInStructure> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public VkBaseInStructure sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBaseInStructure pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBaseInStructure sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBaseInStructure pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBaseInStructure _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBaseInStructure _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBaseInStructure _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBaseInStructure _pNext(MemorySegment src) { return _pNextAt(0L, src); }
}
