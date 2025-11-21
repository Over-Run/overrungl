// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultiDrawIndexedInfoEXT`.
/// ## Layout
/// ```
/// struct VkMultiDrawIndexedInfoEXT {
///     uint32_t firstIndex;
///     uint32_t indexCount;
///     int32_t vertexOffset;
/// }
/// ```
public final class VkMultiDrawIndexedInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("vertexOffset")
    );
    public static final long OFFSET_firstIndex = LAYOUT.byteOffset(PathElement.groupElement("firstIndex"));
    public static final long OFFSET_indexCount = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
    public static final long OFFSET_vertexOffset = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
    public static final MemoryLayout LAYOUT_firstIndex = LAYOUT.select(PathElement.groupElement("firstIndex"));
    public static final MemoryLayout LAYOUT_indexCount = LAYOUT.select(PathElement.groupElement("indexCount"));
    public static final MemoryLayout LAYOUT_vertexOffset = LAYOUT.select(PathElement.groupElement("vertexOffset"));
    public static final VarHandle VH_firstIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstIndex"));
    public static final VarHandle VH_indexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexCount"));
    public static final VarHandle VH_vertexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexOffset"));

    public VkMultiDrawIndexedInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMultiDrawIndexedInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMultiDrawIndexedInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMultiDrawIndexedInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiDrawIndexedInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMultiDrawIndexedInfoEXT alloc(SegmentAllocator allocator) { return new VkMultiDrawIndexedInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMultiDrawIndexedInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultiDrawIndexedInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkMultiDrawIndexedInfoEXT copyFrom(VkMultiDrawIndexedInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMultiDrawIndexedInfoEXT reinterpret(long count) { return new VkMultiDrawIndexedInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMultiDrawIndexedInfoEXT asSlice(long index) { return new VkMultiDrawIndexedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMultiDrawIndexedInfoEXT asSlice(long index, long count) { return new VkMultiDrawIndexedInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMultiDrawIndexedInfoEXT at(long index, Consumer<VkMultiDrawIndexedInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int firstIndexAt(long index) { return (int) VH_firstIndex.get(this.segment(), 0L, index); }
    public int indexCountAt(long index) { return (int) VH_indexCount.get(this.segment(), 0L, index); }
    public int vertexOffsetAt(long index) { return (int) VH_vertexOffset.get(this.segment(), 0L, index); }
    public int firstIndex() { return (int) VH_firstIndex.get(this.segment(), 0L, 0L); }
    public int indexCount() { return (int) VH_indexCount.get(this.segment(), 0L, 0L); }
    public int vertexOffset() { return (int) VH_vertexOffset.get(this.segment(), 0L, 0L); }
    public VkMultiDrawIndexedInfoEXT firstIndexAt(long index, int value) { VH_firstIndex.set(this.segment(), 0L, index, value); return this; }
    public VkMultiDrawIndexedInfoEXT indexCountAt(long index, int value) { VH_indexCount.set(this.segment(), 0L, index, value); return this; }
    public VkMultiDrawIndexedInfoEXT vertexOffsetAt(long index, int value) { VH_vertexOffset.set(this.segment(), 0L, index, value); return this; }
    public VkMultiDrawIndexedInfoEXT firstIndex(int value) { VH_firstIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiDrawIndexedInfoEXT indexCount(int value) { VH_indexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiDrawIndexedInfoEXT vertexOffset(int value) { VH_vertexOffset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _firstIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_firstIndex, index), LAYOUT_firstIndex); }
    public MemorySegment _firstIndex() { return _firstIndexAt(0L); }
    public VkMultiDrawIndexedInfoEXT _firstIndexAt(long index, MemorySegment src) { _firstIndexAt(index).copyFrom(src); return this; }
    public VkMultiDrawIndexedInfoEXT _firstIndex(MemorySegment src) { return _firstIndexAt(0L, src); }
    public MemorySegment _indexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexCount, index), LAYOUT_indexCount); }
    public MemorySegment _indexCount() { return _indexCountAt(0L); }
    public VkMultiDrawIndexedInfoEXT _indexCountAt(long index, MemorySegment src) { _indexCountAt(index).copyFrom(src); return this; }
    public VkMultiDrawIndexedInfoEXT _indexCount(MemorySegment src) { return _indexCountAt(0L, src); }
    public MemorySegment _vertexOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexOffset, index), LAYOUT_vertexOffset); }
    public MemorySegment _vertexOffset() { return _vertexOffsetAt(0L); }
    public VkMultiDrawIndexedInfoEXT _vertexOffsetAt(long index, MemorySegment src) { _vertexOffsetAt(index).copyFrom(src); return this; }
    public VkMultiDrawIndexedInfoEXT _vertexOffset(MemorySegment src) { return _vertexOffsetAt(0L, src); }
}
