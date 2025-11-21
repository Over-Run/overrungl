// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewAddressPropertiesNVX`.
/// ## Layout
/// ```
/// struct VkImageViewAddressPropertiesNVX {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceAddress deviceAddress;
///     VkDeviceSize size;
/// }
/// ```
public final class VkImageViewAddressPropertiesNVX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("deviceAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceAddress = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceAddress = LAYOUT.select(PathElement.groupElement("deviceAddress"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceAddress"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    public VkImageViewAddressPropertiesNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewAddressPropertiesNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewAddressPropertiesNVX(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewAddressPropertiesNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewAddressPropertiesNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewAddressPropertiesNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewAddressPropertiesNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewAddressPropertiesNVX alloc(SegmentAllocator allocator) { return new VkImageViewAddressPropertiesNVX(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewAddressPropertiesNVX alloc(SegmentAllocator allocator, long count) { return new VkImageViewAddressPropertiesNVX(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewAddressPropertiesNVX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nvx.VKNVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX); }
    public static VkImageViewAddressPropertiesNVX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nvx.VKNVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX);
        return s;
    }
    public VkImageViewAddressPropertiesNVX copyFrom(VkImageViewAddressPropertiesNVX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewAddressPropertiesNVX reinterpret(long count) { return new VkImageViewAddressPropertiesNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewAddressPropertiesNVX asSlice(long index) { return new VkImageViewAddressPropertiesNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewAddressPropertiesNVX asSlice(long index, long count) { return new VkImageViewAddressPropertiesNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewAddressPropertiesNVX at(long index, Consumer<VkImageViewAddressPropertiesNVX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long deviceAddressAt(long index) { return (long) VH_deviceAddress.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long deviceAddress() { return (long) VH_deviceAddress.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public VkImageViewAddressPropertiesNVX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewAddressPropertiesNVX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewAddressPropertiesNVX deviceAddressAt(long index, long value) { VH_deviceAddress.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewAddressPropertiesNVX sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewAddressPropertiesNVX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewAddressPropertiesNVX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewAddressPropertiesNVX deviceAddress(long value) { VH_deviceAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewAddressPropertiesNVX size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewAddressPropertiesNVX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewAddressPropertiesNVX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewAddressPropertiesNVX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewAddressPropertiesNVX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceAddress, index), LAYOUT_deviceAddress); }
    public MemorySegment _deviceAddress() { return _deviceAddressAt(0L); }
    public VkImageViewAddressPropertiesNVX _deviceAddressAt(long index, MemorySegment src) { _deviceAddressAt(index).copyFrom(src); return this; }
    public VkImageViewAddressPropertiesNVX _deviceAddress(MemorySegment src) { return _deviceAddressAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkImageViewAddressPropertiesNVX _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkImageViewAddressPropertiesNVX _size(MemorySegment src) { return _sizeAt(0L, src); }
}
