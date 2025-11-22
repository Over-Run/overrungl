// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMemoryType`.
/// ## Layout
/// ```
/// struct VkMemoryType {
///     VkMemoryPropertyFlags propertyFlags;
///     uint32_t heapIndex;
/// }
/// ```
public final class VkMemoryType extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("propertyFlags"),
        ValueLayout.JAVA_INT.withName("heapIndex")
    );
    public static final long OFFSET_propertyFlags = LAYOUT.byteOffset(PathElement.groupElement("propertyFlags"));
    public static final long OFFSET_heapIndex = LAYOUT.byteOffset(PathElement.groupElement("heapIndex"));
    public static final MemoryLayout LAYOUT_propertyFlags = LAYOUT.select(PathElement.groupElement("propertyFlags"));
    public static final MemoryLayout LAYOUT_heapIndex = LAYOUT.select(PathElement.groupElement("heapIndex"));
    public static final VarHandle VH_propertyFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("propertyFlags"));
    public static final VarHandle VH_heapIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("heapIndex"));

    public VkMemoryType(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMemoryType of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryType(segment, estimateCount(segment, LAYOUT)); }
    public static VkMemoryType ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryType(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMemoryType ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryType(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMemoryType alloc(SegmentAllocator allocator) { return new VkMemoryType(allocator.allocate(LAYOUT), 1); }
    public static VkMemoryType alloc(SegmentAllocator allocator, long count) { return new VkMemoryType(allocator.allocate(LAYOUT, count), count); }
    public VkMemoryType copyFrom(VkMemoryType src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMemoryType reinterpret(long count) { return new VkMemoryType(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMemoryType asSlice(long index) { return new VkMemoryType(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMemoryType asSlice(long index, long count) { return new VkMemoryType(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMemoryType at(long index, Consumer<VkMemoryType> func) { func.accept(asSlice(index)); return this; }
    public int propertyFlagsAt(long index) { return (int) VH_propertyFlags.get(this.segment(), 0L, index); }
    public int heapIndexAt(long index) { return (int) VH_heapIndex.get(this.segment(), 0L, index); }
    public int propertyFlags() { return (int) VH_propertyFlags.get(this.segment(), 0L, 0L); }
    public int heapIndex() { return (int) VH_heapIndex.get(this.segment(), 0L, 0L); }
    public VkMemoryType propertyFlagsAt(long index, int value) { VH_propertyFlags.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryType heapIndexAt(long index, int value) { VH_heapIndex.set(this.segment(), 0L, index, value); return this; }
    public VkMemoryType propertyFlags(int value) { VH_propertyFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkMemoryType heapIndex(int value) { VH_heapIndex.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _propertyFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_propertyFlags, index), LAYOUT_propertyFlags); }
    public MemorySegment _propertyFlags() { return _propertyFlagsAt(0L); }
    public VkMemoryType _propertyFlagsAt(long index, MemorySegment src) { _propertyFlagsAt(index).copyFrom(src); return this; }
    public VkMemoryType _propertyFlags(MemorySegment src) { return _propertyFlagsAt(0L, src); }
    public MemorySegment _heapIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_heapIndex, index), LAYOUT_heapIndex); }
    public MemorySegment _heapIndex() { return _heapIndexAt(0L); }
    public VkMemoryType _heapIndexAt(long index, MemorySegment src) { _heapIndexAt(index).copyFrom(src); return this; }
    public VkMemoryType _heapIndex(MemorySegment src) { return _heapIndexAt(0L, src); }
}
