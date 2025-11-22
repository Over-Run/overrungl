// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferUsageFlags2CreateInfo`.
/// ## Layout
/// ```
/// struct VkBufferUsageFlags2CreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferUsageFlags2 usage;
/// }
/// ```
public final class VkBufferUsageFlags2CreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("usage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    public VkBufferUsageFlags2CreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBufferUsageFlags2CreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferUsageFlags2CreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkBufferUsageFlags2CreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferUsageFlags2CreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBufferUsageFlags2CreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferUsageFlags2CreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBufferUsageFlags2CreateInfo alloc(SegmentAllocator allocator) { return new VkBufferUsageFlags2CreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkBufferUsageFlags2CreateInfo alloc(SegmentAllocator allocator, long count) { return new VkBufferUsageFlags2CreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkBufferUsageFlags2CreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO); }
    public static VkBufferUsageFlags2CreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO);
        return s;
    }
    public VkBufferUsageFlags2CreateInfo copyFrom(VkBufferUsageFlags2CreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBufferUsageFlags2CreateInfo reinterpret(long count) { return new VkBufferUsageFlags2CreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBufferUsageFlags2CreateInfo asSlice(long index) { return new VkBufferUsageFlags2CreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBufferUsageFlags2CreateInfo asSlice(long index, long count) { return new VkBufferUsageFlags2CreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBufferUsageFlags2CreateInfo at(long index, Consumer<VkBufferUsageFlags2CreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long usageAt(long index) { return (long) VH_usage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long usage() { return (long) VH_usage.get(this.segment(), 0L, 0L); }
    public VkBufferUsageFlags2CreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBufferUsageFlags2CreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBufferUsageFlags2CreateInfo usageAt(long index, long value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkBufferUsageFlags2CreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferUsageFlags2CreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBufferUsageFlags2CreateInfo usage(long value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBufferUsageFlags2CreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBufferUsageFlags2CreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBufferUsageFlags2CreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBufferUsageFlags2CreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkBufferUsageFlags2CreateInfo _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkBufferUsageFlags2CreateInfo _usage(MemorySegment src) { return _usageAt(0L, src); }
}
