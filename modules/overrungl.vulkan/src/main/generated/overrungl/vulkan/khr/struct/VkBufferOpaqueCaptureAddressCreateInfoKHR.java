// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferOpaqueCaptureAddressCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkBufferOpaqueCaptureAddressCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t opaqueCaptureAddress;
/// }
/// ```
public final class VkBufferOpaqueCaptureAddressCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("opaqueCaptureAddress")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_opaqueCaptureAddress = LAYOUT.byteOffset(PathElement.groupElement("opaqueCaptureAddress"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_opaqueCaptureAddress = LAYOUT.select(PathElement.groupElement("opaqueCaptureAddress"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_opaqueCaptureAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opaqueCaptureAddress"));

    public VkBufferOpaqueCaptureAddressCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferOpaqueCaptureAddressCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferOpaqueCaptureAddressCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferOpaqueCaptureAddressCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkBufferOpaqueCaptureAddressCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBufferOpaqueCaptureAddressCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO); }
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO);
        return s;
    }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR copyFrom(VkBufferOpaqueCaptureAddressCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR reinterpret(long count) { return new VkBufferOpaqueCaptureAddressCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR asSlice(long index) { return new VkBufferOpaqueCaptureAddressCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR asSlice(long index, long count) { return new VkBufferOpaqueCaptureAddressCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR at(long index, Consumer<VkBufferOpaqueCaptureAddressCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long opaqueCaptureAddressAt(long index) { return (long) VH_opaqueCaptureAddress.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long opaqueCaptureAddress() { return (long) VH_opaqueCaptureAddress.get(this.segment(), 0L, 0L); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR opaqueCaptureAddressAt(long index, long value) { VH_opaqueCaptureAddress.set(this.segment(), 0L, index, value); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR opaqueCaptureAddress(long value) { VH_opaqueCaptureAddress.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _opaqueCaptureAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_opaqueCaptureAddress, index), LAYOUT_opaqueCaptureAddress); }
    public MemorySegment _opaqueCaptureAddress() { return _opaqueCaptureAddressAt(0L); }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR _opaqueCaptureAddressAt(long index, MemorySegment src) { _opaqueCaptureAddressAt(index).copyFrom(src); return this; }
    public VkBufferOpaqueCaptureAddressCreateInfoKHR _opaqueCaptureAddress(MemorySegment src) { return _opaqueCaptureAddressAt(0L, src); }
}
