// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMicromapCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkMicromapCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkMicromapCreateFlagsEXT createFlags;
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
///     VkMicromapTypeEXT type;
///     VkDeviceAddress deviceAddress;
/// }
/// ```
public final class VkMicromapCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("createFlags"),
        ValueLayout.JAVA_LONG.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("deviceAddress")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_createFlags = LAYOUT.byteOffset(PathElement.groupElement("createFlags"));
    public static final long OFFSET_buffer = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_createFlags = LAYOUT.select(PathElement.groupElement("createFlags"));
    public static final MemoryLayout LAYOUT_buffer = LAYOUT.select(PathElement.groupElement("buffer"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_createFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("createFlags"));
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));

    public VkMicromapCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMicromapCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMicromapCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMicromapCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMicromapCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkMicromapCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMicromapCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMicromapCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT); }
    public static VkMicromapCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT);
        return s;
    }
    public VkMicromapCreateInfoEXT copyFrom(VkMicromapCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMicromapCreateInfoEXT reinterpret(long count) { return new VkMicromapCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMicromapCreateInfoEXT asSlice(long index) { return new VkMicromapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMicromapCreateInfoEXT asSlice(long index, long count) { return new VkMicromapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMicromapCreateInfoEXT at(long index, Consumer<VkMicromapCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int createFlagsAt(long index) { return (int) VH_createFlags.get(this.segment(), 0L, index); }
    public long bufferAt(long index) { return (long) VH_buffer.get(this.segment(), 0L, index); }
    public long offsetAt(long index) { return (long) VH_offset.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public long deviceAddressAt(long index) { return (long) VH_deviceAddress.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int createFlags() { return (int) VH_createFlags.get(this.segment(), 0L, 0L); }
    public long buffer() { return (long) VH_buffer.get(this.segment(), 0L, 0L); }
    public long offset() { return (long) VH_offset.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public long deviceAddress() { return (long) VH_deviceAddress.get(this.segment(), 0L, 0L); }
    public VkMicromapCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT createFlagsAt(long index, int value) { VH_createFlags.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT bufferAt(long index, long value) { VH_buffer.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT offsetAt(long index, long value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT deviceAddressAt(long index, long value) { VH_deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkMicromapCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT createFlags(int value) { VH_createFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT buffer(long value) { VH_buffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT offset(long value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkMicromapCreateInfoEXT deviceAddress(long value) { VH_deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMicromapCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMicromapCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _createFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_createFlags, index), LAYOUT_createFlags); }
    public MemorySegment _createFlags() { return _createFlagsAt(0L); }
    public VkMicromapCreateInfoEXT _createFlagsAt(long index, MemorySegment src) { _createFlagsAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _createFlags(MemorySegment src) { return _createFlagsAt(0L, src); }
    public MemorySegment _bufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_buffer, index), LAYOUT_buffer); }
    public MemorySegment _buffer() { return _bufferAt(0L); }
    public VkMicromapCreateInfoEXT _bufferAt(long index, MemorySegment src) { _bufferAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _buffer(MemorySegment src) { return _bufferAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkMicromapCreateInfoEXT _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkMicromapCreateInfoEXT _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkMicromapCreateInfoEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _deviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceAddress, index), LAYOUT_deviceAddress); }
    public MemorySegment _deviceAddress() { return _deviceAddressAt(0L); }
    public VkMicromapCreateInfoEXT _deviceAddressAt(long index, MemorySegment src) { _deviceAddressAt(index).copyFrom(src); return this; }
    public VkMicromapCreateInfoEXT _deviceAddress(MemorySegment src) { return _deviceAddressAt(0L, src); }
}
