// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalBufferInfoKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalBufferInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferCreateFlags flags;
///     VkBufferUsageFlags usage;
///     VkExternalMemoryHandleTypeFlagBits handleType;
/// }
/// ```
public final class VkPhysicalDeviceExternalBufferInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    public VkPhysicalDeviceExternalBufferInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExternalBufferInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalBufferInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExternalBufferInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalBufferInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExternalBufferInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalBufferInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExternalBufferInfoKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalBufferInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExternalBufferInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalBufferInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExternalBufferInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO); }
    public static VkPhysicalDeviceExternalBufferInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO);
        return s;
    }
    public VkPhysicalDeviceExternalBufferInfoKHR copyFrom(VkPhysicalDeviceExternalBufferInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR reinterpret(long count) { return new VkPhysicalDeviceExternalBufferInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExternalBufferInfoKHR asSlice(long index) { return new VkPhysicalDeviceExternalBufferInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExternalBufferInfoKHR asSlice(long index, long count) { return new VkPhysicalDeviceExternalBufferInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExternalBufferInfoKHR at(long index, Consumer<VkPhysicalDeviceExternalBufferInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int handleTypeAt(long index) { return (int) VH_handleType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public int handleType() { return (int) VH_handleType.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExternalBufferInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR handleTypeAt(long index, int value) { VH_handleType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR handleType(int value) { VH_handleType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExternalBufferInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExternalBufferInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPhysicalDeviceExternalBufferInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkPhysicalDeviceExternalBufferInfoKHR _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR _usage(MemorySegment src) { return _usageAt(0L, src); }
    public MemorySegment _handleTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_handleType, index), LAYOUT_handleType); }
    public MemorySegment _handleType() { return _handleTypeAt(0L); }
    public VkPhysicalDeviceExternalBufferInfoKHR _handleTypeAt(long index, MemorySegment src) { _handleTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExternalBufferInfoKHR _handleType(MemorySegment src) { return _handleTypeAt(0L, src); }
}
