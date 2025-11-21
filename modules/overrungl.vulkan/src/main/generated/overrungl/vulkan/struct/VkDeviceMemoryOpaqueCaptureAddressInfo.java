// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceMemoryOpaqueCaptureAddressInfo`.
/// ## Layout
/// ```
/// struct VkDeviceMemoryOpaqueCaptureAddressInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemory memory;
/// }
/// ```
public final class VkDeviceMemoryOpaqueCaptureAddressInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("memory")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_memory = LAYOUT.byteOffset(PathElement.groupElement("memory"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_memory = LAYOUT.select(PathElement.groupElement("memory"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));

    public VkDeviceMemoryOpaqueCaptureAddressInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryOpaqueCaptureAddressInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryOpaqueCaptureAddressInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceMemoryOpaqueCaptureAddressInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo alloc(SegmentAllocator allocator) { return new VkDeviceMemoryOpaqueCaptureAddressInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceMemoryOpaqueCaptureAddressInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO); }
    public static VkDeviceMemoryOpaqueCaptureAddressInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO);
        return s;
    }
    public VkDeviceMemoryOpaqueCaptureAddressInfo copyFrom(VkDeviceMemoryOpaqueCaptureAddressInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo reinterpret(long count) { return new VkDeviceMemoryOpaqueCaptureAddressInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo asSlice(long index) { return new VkDeviceMemoryOpaqueCaptureAddressInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo asSlice(long index, long count) { return new VkDeviceMemoryOpaqueCaptureAddressInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo at(long index, Consumer<VkDeviceMemoryOpaqueCaptureAddressInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long memoryAt(long index) { return (long) VH_memory.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long memory() { return (long) VH_memory.get(this.segment(), 0L, 0L); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo memoryAt(long index, long value) { VH_memory.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo memory(long value) { VH_memory.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _memoryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_memory, index), LAYOUT_memory); }
    public MemorySegment _memory() { return _memoryAt(0L); }
    public VkDeviceMemoryOpaqueCaptureAddressInfo _memoryAt(long index, MemorySegment src) { _memoryAt(index).copyFrom(src); return this; }
    public VkDeviceMemoryOpaqueCaptureAddressInfo _memory(MemorySegment src) { return _memoryAt(0L, src); }
}
