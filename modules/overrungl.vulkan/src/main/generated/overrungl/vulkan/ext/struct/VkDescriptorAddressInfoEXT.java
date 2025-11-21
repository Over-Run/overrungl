// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorAddressInfoEXT`.
/// ## Layout
/// ```
/// struct VkDescriptorAddressInfoEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceAddress address;
///     VkDeviceSize range;
///     VkFormat format;
/// }
/// ```
public final class VkDescriptorAddressInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_LONG.withName("range"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_address = LAYOUT.byteOffset(PathElement.groupElement("address"));
    public static final long OFFSET_range = LAYOUT.byteOffset(PathElement.groupElement("range"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_address = LAYOUT.select(PathElement.groupElement("address"));
    public static final MemoryLayout LAYOUT_range = LAYOUT.select(PathElement.groupElement("range"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    public static final VarHandle VH_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("range"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkDescriptorAddressInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorAddressInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorAddressInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorAddressInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorAddressInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorAddressInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorAddressInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorAddressInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorAddressInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT); }
    public static VkDescriptorAddressInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT);
        return s;
    }
    public VkDescriptorAddressInfoEXT copyFrom(VkDescriptorAddressInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorAddressInfoEXT reinterpret(long count) { return new VkDescriptorAddressInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorAddressInfoEXT asSlice(long index) { return new VkDescriptorAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorAddressInfoEXT asSlice(long index, long count) { return new VkDescriptorAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorAddressInfoEXT at(long index, Consumer<VkDescriptorAddressInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long addressAt(long index) { return (long) VH_address.get(this.segment(), 0L, index); }
    public long rangeAt(long index) { return (long) VH_range.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long address() { return (long) VH_address.get(this.segment(), 0L, 0L); }
    public long range() { return (long) VH_range.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public VkDescriptorAddressInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorAddressInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorAddressInfoEXT addressAt(long index, long value) { VH_address.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorAddressInfoEXT rangeAt(long index, long value) { VH_range.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorAddressInfoEXT formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorAddressInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorAddressInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorAddressInfoEXT address(long value) { VH_address.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorAddressInfoEXT range(long value) { VH_range.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorAddressInfoEXT format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorAddressInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorAddressInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorAddressInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorAddressInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _addressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_address, index), LAYOUT_address); }
    public MemorySegment _address() { return _addressAt(0L); }
    public VkDescriptorAddressInfoEXT _addressAt(long index, MemorySegment src) { _addressAt(index).copyFrom(src); return this; }
    public VkDescriptorAddressInfoEXT _address(MemorySegment src) { return _addressAt(0L, src); }
    public MemorySegment _rangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_range, index), LAYOUT_range); }
    public MemorySegment _range() { return _rangeAt(0L); }
    public VkDescriptorAddressInfoEXT _rangeAt(long index, MemorySegment src) { _rangeAt(index).copyFrom(src); return this; }
    public VkDescriptorAddressInfoEXT _range(MemorySegment src) { return _rangeAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkDescriptorAddressInfoEXT _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkDescriptorAddressInfoEXT _format(MemorySegment src) { return _formatAt(0L, src); }
}
