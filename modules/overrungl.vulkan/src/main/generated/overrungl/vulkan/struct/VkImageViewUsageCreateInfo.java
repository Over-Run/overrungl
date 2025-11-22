// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageViewUsageCreateInfo`.
/// ## Layout
/// ```
/// struct VkImageViewUsageCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageUsageFlags usage;
/// }
/// ```
public final class VkImageViewUsageCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("usage")
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

    public VkImageViewUsageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageViewUsageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewUsageCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageViewUsageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewUsageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageViewUsageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewUsageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageViewUsageCreateInfo alloc(SegmentAllocator allocator) { return new VkImageViewUsageCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkImageViewUsageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageViewUsageCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkImageViewUsageCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO); }
    public static VkImageViewUsageCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO);
        return s;
    }
    public VkImageViewUsageCreateInfo copyFrom(VkImageViewUsageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageViewUsageCreateInfo reinterpret(long count) { return new VkImageViewUsageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageViewUsageCreateInfo asSlice(long index) { return new VkImageViewUsageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageViewUsageCreateInfo asSlice(long index, long count) { return new VkImageViewUsageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageViewUsageCreateInfo at(long index, Consumer<VkImageViewUsageCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public VkImageViewUsageCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewUsageCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewUsageCreateInfo usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkImageViewUsageCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewUsageCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageViewUsageCreateInfo usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageViewUsageCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageViewUsageCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageViewUsageCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageViewUsageCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkImageViewUsageCreateInfo _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkImageViewUsageCreateInfo _usage(MemorySegment src) { return _usageAt(0L, src); }
}
