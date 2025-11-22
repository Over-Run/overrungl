// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVertexInputAttributeDescription`.
/// ## Layout
/// ```
/// struct VkVertexInputAttributeDescription {
///     uint32_t location;
///     uint32_t binding;
///     VkFormat format;
///     uint32_t offset;
/// }
/// ```
public final class VkVertexInputAttributeDescription extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    public static final long OFFSET_location = LAYOUT.byteOffset(PathElement.groupElement("location"));
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_location = LAYOUT.select(PathElement.groupElement("location"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final VarHandle VH_location = LAYOUT.arrayElementVarHandle(PathElement.groupElement("location"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    public VkVertexInputAttributeDescription(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVertexInputAttributeDescription of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment, estimateCount(segment, LAYOUT)); }
    public static VkVertexInputAttributeDescription ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVertexInputAttributeDescription ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVertexInputAttributeDescription alloc(SegmentAllocator allocator) { return new VkVertexInputAttributeDescription(allocator.allocate(LAYOUT), 1); }
    public static VkVertexInputAttributeDescription alloc(SegmentAllocator allocator, long count) { return new VkVertexInputAttributeDescription(allocator.allocate(LAYOUT, count), count); }
    public VkVertexInputAttributeDescription copyFrom(VkVertexInputAttributeDescription src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVertexInputAttributeDescription reinterpret(long count) { return new VkVertexInputAttributeDescription(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVertexInputAttributeDescription asSlice(long index) { return new VkVertexInputAttributeDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVertexInputAttributeDescription asSlice(long index, long count) { return new VkVertexInputAttributeDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVertexInputAttributeDescription at(long index, Consumer<VkVertexInputAttributeDescription> func) { func.accept(asSlice(index)); return this; }
    public int locationAt(long index) { return (int) VH_location.get(this.segment(), 0L, index); }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public int location() { return (int) VH_location.get(this.segment(), 0L, 0L); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public VkVertexInputAttributeDescription locationAt(long index, int value) { VH_location.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription location(int value) { VH_location.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _locationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_location, index), LAYOUT_location); }
    public MemorySegment _location() { return _locationAt(0L); }
    public VkVertexInputAttributeDescription _locationAt(long index, MemorySegment src) { _locationAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription _location(MemorySegment src) { return _locationAt(0L, src); }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkVertexInputAttributeDescription _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkVertexInputAttributeDescription _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkVertexInputAttributeDescription _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription _offset(MemorySegment src) { return _offsetAt(0L, src); }
}
