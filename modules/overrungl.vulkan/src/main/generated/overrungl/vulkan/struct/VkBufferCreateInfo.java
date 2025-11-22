// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferCreateInfo`.
/// ## Layout
/// ```
/// struct VkBufferCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferCreateFlags flags;
///     VkDeviceSize size;
///     VkBufferUsageFlags usage;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
/// }
/// ```
public final class VkBufferCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final long OFFSET_sharingMode = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_sharingMode = LAYOUT.select(PathElement.groupElement("sharingMode"));
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));

    public VkBufferCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferCreateInfo alloc(SegmentAllocator allocator) { return new VkBufferCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBufferCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkBufferCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO); }
    public static VkBufferCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO);
        return s;
    }
    public VkBufferCreateInfo copyFrom(VkBufferCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferCreateInfo reinterpret(long count) { return new VkBufferCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferCreateInfo asSlice(long index) { return new VkBufferCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferCreateInfo asSlice(long index, long count) { return new VkBufferCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferCreateInfo at(long index, Consumer<VkBufferCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long sizeAt(long index) { return (long) VH_size.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int sharingModeAt(long index) { return (int) VH_sharingMode.get(this.segment(), 0L, index); }
    public int queueFamilyIndexCountAt(long index) { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, index); }
    public MemorySegment pQueueFamilyIndicesAt(long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long size() { return (long) VH_size.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public int sharingMode() { return (int) VH_sharingMode.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndexCount() { return (int) VH_queueFamilyIndexCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pQueueFamilyIndices() { return (MemorySegment) VH_pQueueFamilyIndices.get(this.segment(), 0L, 0L); }
    public VkBufferCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo sizeAt(long index, long value) { VH_size.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo sharingModeAt(long index, int value) { VH_sharingMode.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo queueFamilyIndexCountAt(long index, int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo pQueueFamilyIndicesAt(long index, MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, index, value); return this; }
    public VkBufferCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo size(long value) { VH_size.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo sharingMode(int value) { VH_sharingMode.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo queueFamilyIndexCount(int value) { VH_queueFamilyIndexCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferCreateInfo pQueueFamilyIndices(MemorySegment value) { VH_pQueueFamilyIndices.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkBufferCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _sizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_size, index), LAYOUT_size); }
    public MemorySegment _size() { return _sizeAt(0L); }
    public VkBufferCreateInfo _sizeAt(long index, MemorySegment src) { _sizeAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _size(MemorySegment src) { return _sizeAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkBufferCreateInfo _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _usage(MemorySegment src) { return _usageAt(0L, src); }
    public MemorySegment _sharingModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sharingMode, index), LAYOUT_sharingMode); }
    public MemorySegment _sharingMode() { return _sharingModeAt(0L); }
    public VkBufferCreateInfo _sharingModeAt(long index, MemorySegment src) { _sharingModeAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _sharingMode(MemorySegment src) { return _sharingModeAt(0L, src); }
    public MemorySegment _queueFamilyIndexCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndexCount, index), LAYOUT_queueFamilyIndexCount); }
    public MemorySegment _queueFamilyIndexCount() { return _queueFamilyIndexCountAt(0L); }
    public VkBufferCreateInfo _queueFamilyIndexCountAt(long index, MemorySegment src) { _queueFamilyIndexCountAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _queueFamilyIndexCount(MemorySegment src) { return _queueFamilyIndexCountAt(0L, src); }
    public MemorySegment _pQueueFamilyIndicesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pQueueFamilyIndices, index), LAYOUT_pQueueFamilyIndices); }
    public MemorySegment _pQueueFamilyIndices() { return _pQueueFamilyIndicesAt(0L); }
    public VkBufferCreateInfo _pQueueFamilyIndicesAt(long index, MemorySegment src) { _pQueueFamilyIndicesAt(index).copyFrom(src); return this; }
    public VkBufferCreateInfo _pQueueFamilyIndices(MemorySegment src) { return _pQueueFamilyIndicesAt(0L, src); }
}
