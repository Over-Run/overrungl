// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorBufferBindingInfoEXT`.
/// ## Layout
/// ```
/// struct VkDescriptorBufferBindingInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceAddress address;
///     VkBufferUsageFlags usage;
/// }
/// ```
public final class VkDescriptorBufferBindingInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_INT.withName("usage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_address = LAYOUT.byteOffset(PathElement.groupElement("address"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_address = LAYOUT.select(PathElement.groupElement("address"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    public VkDescriptorBufferBindingInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorBufferBindingInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorBufferBindingInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorBufferBindingInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorBufferBindingInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorBufferBindingInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorBufferBindingInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorBufferBindingInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorBufferBindingInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorBufferBindingInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorBufferBindingInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDescriptorBufferBindingInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT); }
    public static VkDescriptorBufferBindingInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT);
        return s;
    }
    public VkDescriptorBufferBindingInfoEXT copyFrom(VkDescriptorBufferBindingInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorBufferBindingInfoEXT reinterpret(long count) { return new VkDescriptorBufferBindingInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorBufferBindingInfoEXT asSlice(long index) { return new VkDescriptorBufferBindingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorBufferBindingInfoEXT asSlice(long index, long count) { return new VkDescriptorBufferBindingInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorBufferBindingInfoEXT at(long index, Consumer<VkDescriptorBufferBindingInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long addressAt(long index) { return (long) VH_address.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long address() { return (long) VH_address.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public VkDescriptorBufferBindingInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferBindingInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferBindingInfoEXT addressAt(long index, long value) { VH_address.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferBindingInfoEXT usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorBufferBindingInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorBufferBindingInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorBufferBindingInfoEXT address(long value) { VH_address.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorBufferBindingInfoEXT usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDescriptorBufferBindingInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferBindingInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDescriptorBufferBindingInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferBindingInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _addressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_address, index), LAYOUT_address); }
    public MemorySegment _address() { return _addressAt(0L); }
    public VkDescriptorBufferBindingInfoEXT _addressAt(long index, MemorySegment src) { _addressAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferBindingInfoEXT _address(MemorySegment src) { return _addressAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkDescriptorBufferBindingInfoEXT _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkDescriptorBufferBindingInfoEXT _usage(MemorySegment src) { return _usageAt(0L, src); }
}
