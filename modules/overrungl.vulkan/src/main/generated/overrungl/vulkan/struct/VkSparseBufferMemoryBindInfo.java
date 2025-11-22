// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSparseBufferMemoryBindInfo`.
/// ## Layout
/// ```
/// struct VkSparseBufferMemoryBindInfo {
///     VkBuffer buffer;
///     uint32_t bindCount;
///     const VkSparseMemoryBind* pBinds;
/// }
/// ```
public final class VkSparseBufferMemoryBindInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withName("pBinds")
    );
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_bindCount = LAYOUT.byteOffset(PathElement.groupElement("bindCount"));
    public static final long OFFSET_pBinds = LAYOUT.byteOffset(PathElement.groupElement("pBinds"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_bindCount = LAYOUT.select(PathElement.groupElement("bindCount"));
    public static final MemoryLayout LAYOUT_pBinds = LAYOUT.select(PathElement.groupElement("pBinds"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_bindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindCount"));
    public static final VarHandle VH_pBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBinds"));

    public VkSparseBufferMemoryBindInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSparseBufferMemoryBindInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator, long count) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT, count), count); }
    public VkSparseBufferMemoryBindInfo copyFrom(VkSparseBufferMemoryBindInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSparseBufferMemoryBindInfo reinterpret(long count) { return new VkSparseBufferMemoryBindInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSparseBufferMemoryBindInfo asSlice(long index) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSparseBufferMemoryBindInfo asSlice(long index, long count) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSparseBufferMemoryBindInfo at(long index, Consumer<VkSparseBufferMemoryBindInfo> func) { func.accept(asSlice(index)); return this; }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public int bindCountAt(long index) { return (int) VH_bindCount.get(this.segment(), 0L, index); }
    public MemorySegment pBindsAt(long index) { return (MemorySegment) VH_pBinds.get(this.segment(), 0L, index); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public int bindCount() { return (int) VH_bindCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pBinds() { return (MemorySegment) VH_pBinds.get(this.segment(), 0L, 0L); }
    public VkSparseBufferMemoryBindInfo bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkSparseBufferMemoryBindInfo bindCountAt(long index, int value) { VH_bindCount.set(this.segment(), 0L, index, value); return this; }
    public VkSparseBufferMemoryBindInfo pBindsAt(long index, MemorySegment value) { VH_pBinds.set(this.segment(), 0L, index, value); return this; }
    public VkSparseBufferMemoryBindInfo buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseBufferMemoryBindInfo bindCount(int value) { VH_bindCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkSparseBufferMemoryBindInfo pBinds(MemorySegment value) { VH_pBinds.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkSparseBufferMemoryBindInfo _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkSparseBufferMemoryBindInfo _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _bindCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bindCount, index), LAYOUT_bindCount); }
    public MemorySegment _bindCount() { return _bindCountAt(0L); }
    public VkSparseBufferMemoryBindInfo _bindCountAt(long index, MemorySegment src) { _bindCountAt(index).copyFrom(src); return this; }
    public VkSparseBufferMemoryBindInfo _bindCount(MemorySegment src) { return _bindCountAt(0L, src); }
    public MemorySegment _pBindsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pBinds, index), LAYOUT_pBinds); }
    public MemorySegment _pBinds() { return _pBindsAt(0L); }
    public VkSparseBufferMemoryBindInfo _pBindsAt(long index, MemorySegment src) { _pBindsAt(index).copyFrom(src); return this; }
    public VkSparseBufferMemoryBindInfo _pBinds(MemorySegment src) { return _pBindsAt(0L, src); }
}
