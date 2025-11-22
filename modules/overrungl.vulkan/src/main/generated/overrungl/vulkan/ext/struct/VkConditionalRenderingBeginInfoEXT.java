// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkConditionalRenderingBeginInfoEXT`.
/// ## Layout
/// ```
/// struct VkConditionalRenderingBeginInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkConditionalRenderingFlagsEXT flags;
/// }
/// ```
public final class VkConditionalRenderingBeginInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    public VkConditionalRenderingBeginInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkConditionalRenderingBeginInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConditionalRenderingBeginInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkConditionalRenderingBeginInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkConditionalRenderingBeginInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkConditionalRenderingBeginInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkConditionalRenderingBeginInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkConditionalRenderingBeginInfoEXT alloc(SegmentAllocator allocator) { return new VkConditionalRenderingBeginInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkConditionalRenderingBeginInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkConditionalRenderingBeginInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkConditionalRenderingBeginInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTConditionalRendering.VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT); }
    public static VkConditionalRenderingBeginInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTConditionalRendering.VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT);
        return s;
    }
    public VkConditionalRenderingBeginInfoEXT copyFrom(VkConditionalRenderingBeginInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkConditionalRenderingBeginInfoEXT reinterpret(long count) { return new VkConditionalRenderingBeginInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkConditionalRenderingBeginInfoEXT asSlice(long index) { return new VkConditionalRenderingBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkConditionalRenderingBeginInfoEXT asSlice(long index, long count) { return new VkConditionalRenderingBeginInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkConditionalRenderingBeginInfoEXT at(long index, Consumer<VkConditionalRenderingBeginInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public VkConditionalRenderingBeginInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkConditionalRenderingBeginInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkConditionalRenderingBeginInfoEXT bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkConditionalRenderingBeginInfoEXT offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkConditionalRenderingBeginInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkConditionalRenderingBeginInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkConditionalRenderingBeginInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkConditionalRenderingBeginInfoEXT buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkConditionalRenderingBeginInfoEXT offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkConditionalRenderingBeginInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkConditionalRenderingBeginInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkConditionalRenderingBeginInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkConditionalRenderingBeginInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkConditionalRenderingBeginInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkConditionalRenderingBeginInfoEXT _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkConditionalRenderingBeginInfoEXT _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkConditionalRenderingBeginInfoEXT _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkConditionalRenderingBeginInfoEXT _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkConditionalRenderingBeginInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkConditionalRenderingBeginInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
}
