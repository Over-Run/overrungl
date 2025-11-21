// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVertexInputAttributeDescription2EXT`.
/// ## Layout
/// ```
/// struct VkVertexInputAttributeDescription2EXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t location;
///     uint32_t binding;
///     VkFormat format;
///     uint32_t offset;
/// }
/// ```
public final class VkVertexInputAttributeDescription2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_location = LAYOUT.byteOffset(PathElement.groupElement("location"));
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_location = LAYOUT.select(PathElement.groupElement("location"));
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_location = LAYOUT.arrayElementVarHandle(PathElement.groupElement("location"));
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    public VkVertexInputAttributeDescription2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVertexInputAttributeDescription2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkVertexInputAttributeDescription2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVertexInputAttributeDescription2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVertexInputAttributeDescription2EXT alloc(SegmentAllocator allocator) { return new VkVertexInputAttributeDescription2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkVertexInputAttributeDescription2EXT alloc(SegmentAllocator allocator, long count) { return new VkVertexInputAttributeDescription2EXT(allocator.allocate(LAYOUT, count), count); }
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT); }
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT);
        return s;
    }
    public VkVertexInputAttributeDescription2EXT copyFrom(VkVertexInputAttributeDescription2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVertexInputAttributeDescription2EXT reinterpret(long count) { return new VkVertexInputAttributeDescription2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVertexInputAttributeDescription2EXT asSlice(long index) { return new VkVertexInputAttributeDescription2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVertexInputAttributeDescription2EXT asSlice(long index, long count) { return new VkVertexInputAttributeDescription2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVertexInputAttributeDescription2EXT at(long index, Consumer<VkVertexInputAttributeDescription2EXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int locationAt(long index) { return (int) VH_location.get(this.segment(), 0L, index); }
    public int bindingAt(long index) { return (int) VH_binding.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int location() { return (int) VH_location.get(this.segment(), 0L, 0L); }
    public int binding() { return (int) VH_binding.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public VkVertexInputAttributeDescription2EXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription2EXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription2EXT locationAt(long index, int value) { VH_location.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription2EXT bindingAt(long index, int value) { VH_binding.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription2EXT formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription2EXT offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkVertexInputAttributeDescription2EXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription2EXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription2EXT location(int value) { VH_location.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription2EXT binding(int value) { VH_binding.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription2EXT format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkVertexInputAttributeDescription2EXT offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVertexInputAttributeDescription2EXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription2EXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVertexInputAttributeDescription2EXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription2EXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _locationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_location, index), LAYOUT_location); }
    public MemorySegment _location() { return _locationAt(0L); }
    public VkVertexInputAttributeDescription2EXT _locationAt(long index, MemorySegment src) { _locationAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription2EXT _location(MemorySegment src) { return _locationAt(0L, src); }
    public MemorySegment _bindingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_binding, index), LAYOUT_binding); }
    public MemorySegment _binding() { return _bindingAt(0L); }
    public VkVertexInputAttributeDescription2EXT _bindingAt(long index, MemorySegment src) { _bindingAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription2EXT _binding(MemorySegment src) { return _bindingAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkVertexInputAttributeDescription2EXT _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription2EXT _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkVertexInputAttributeDescription2EXT _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkVertexInputAttributeDescription2EXT _offset(MemorySegment src) { return _offsetAt(0L, src); }
}
