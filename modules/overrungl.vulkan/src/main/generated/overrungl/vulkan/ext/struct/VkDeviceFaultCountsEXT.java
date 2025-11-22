// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceFaultCountsEXT`.
/// ## Layout
/// ```
/// struct VkDeviceFaultCountsEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t addressInfoCount;
///     uint32_t vendorInfoCount;
///     VkDeviceSize vendorBinarySize;
/// }
/// ```
public final class VkDeviceFaultCountsEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("addressInfoCount"),
        ValueLayout.JAVA_INT.withName("vendorInfoCount"),
        ValueLayout.JAVA_LONG.withName("vendorBinarySize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_addressInfoCount = LAYOUT.byteOffset(PathElement.groupElement("addressInfoCount"));
    public static final long OFFSET_vendorInfoCount = LAYOUT.byteOffset(PathElement.groupElement("vendorInfoCount"));
    public static final long OFFSET_vendorBinarySize = LAYOUT.byteOffset(PathElement.groupElement("vendorBinarySize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_addressInfoCount = LAYOUT.select(PathElement.groupElement("addressInfoCount"));
    public static final MemoryLayout LAYOUT_vendorInfoCount = LAYOUT.select(PathElement.groupElement("vendorInfoCount"));
    public static final MemoryLayout LAYOUT_vendorBinarySize = LAYOUT.select(PathElement.groupElement("vendorBinarySize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_addressInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("addressInfoCount"));
    public static final VarHandle VH_vendorInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorInfoCount"));
    public static final VarHandle VH_vendorBinarySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorBinarySize"));

    public VkDeviceFaultCountsEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceFaultCountsEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultCountsEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceFaultCountsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultCountsEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceFaultCountsEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultCountsEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceFaultCountsEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultCountsEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceFaultCountsEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultCountsEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceFaultCountsEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT); }
    public static VkDeviceFaultCountsEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT);
        return s;
    }
    public VkDeviceFaultCountsEXT copyFrom(VkDeviceFaultCountsEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceFaultCountsEXT reinterpret(long count) { return new VkDeviceFaultCountsEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceFaultCountsEXT asSlice(long index) { return new VkDeviceFaultCountsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceFaultCountsEXT asSlice(long index, long count) { return new VkDeviceFaultCountsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceFaultCountsEXT at(long index, Consumer<VkDeviceFaultCountsEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int addressInfoCountAt(long index) { return (int) VH_addressInfoCount.get(this.segment(), 0L, index); }
    public int vendorInfoCountAt(long index) { return (int) VH_vendorInfoCount.get(this.segment(), 0L, index); }
    public long vendorBinarySizeAt(long index) { return (long) VH_vendorBinarySize.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int addressInfoCount() { return (int) VH_addressInfoCount.get(this.segment(), 0L, 0L); }
    public int vendorInfoCount() { return (int) VH_vendorInfoCount.get(this.segment(), 0L, 0L); }
    public long vendorBinarySize() { return (long) VH_vendorBinarySize.get(this.segment(), 0L, 0L); }
    public VkDeviceFaultCountsEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultCountsEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultCountsEXT addressInfoCountAt(long index, int value) { VH_addressInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultCountsEXT vendorInfoCountAt(long index, int value) { VH_vendorInfoCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultCountsEXT vendorBinarySizeAt(long index, long value) { VH_vendorBinarySize.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultCountsEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultCountsEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultCountsEXT addressInfoCount(int value) { VH_addressInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultCountsEXT vendorInfoCount(int value) { VH_vendorInfoCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultCountsEXT vendorBinarySize(long value) { VH_vendorBinarySize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceFaultCountsEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceFaultCountsEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceFaultCountsEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceFaultCountsEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _addressInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_addressInfoCount, index), LAYOUT_addressInfoCount); }
    public MemorySegment _addressInfoCount() { return _addressInfoCountAt(0L); }
    public VkDeviceFaultCountsEXT _addressInfoCountAt(long index, MemorySegment src) { _addressInfoCountAt(index).copyFrom(src); return this; }
    public VkDeviceFaultCountsEXT _addressInfoCount(MemorySegment src) { return _addressInfoCountAt(0L, src); }
    public MemorySegment _vendorInfoCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorInfoCount, index), LAYOUT_vendorInfoCount); }
    public MemorySegment _vendorInfoCount() { return _vendorInfoCountAt(0L); }
    public VkDeviceFaultCountsEXT _vendorInfoCountAt(long index, MemorySegment src) { _vendorInfoCountAt(index).copyFrom(src); return this; }
    public VkDeviceFaultCountsEXT _vendorInfoCount(MemorySegment src) { return _vendorInfoCountAt(0L, src); }
    public MemorySegment _vendorBinarySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorBinarySize, index), LAYOUT_vendorBinarySize); }
    public MemorySegment _vendorBinarySize() { return _vendorBinarySizeAt(0L); }
    public VkDeviceFaultCountsEXT _vendorBinarySizeAt(long index, MemorySegment src) { _vendorBinarySizeAt(index).copyFrom(src); return this; }
    public VkDeviceFaultCountsEXT _vendorBinarySize(MemorySegment src) { return _vendorBinarySizeAt(0L, src); }
}
