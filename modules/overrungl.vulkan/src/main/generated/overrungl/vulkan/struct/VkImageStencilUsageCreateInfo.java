// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageStencilUsageCreateInfo`.
/// ## Layout
/// ```
/// struct VkImageStencilUsageCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageUsageFlags stencilUsage;
/// }
/// ```
public final class VkImageStencilUsageCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilUsage")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_stencilUsage = LAYOUT.byteOffset(PathElement.groupElement("stencilUsage"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_stencilUsage = LAYOUT.select(PathElement.groupElement("stencilUsage"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_stencilUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilUsage"));

    public VkImageStencilUsageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageStencilUsageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageStencilUsageCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageStencilUsageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageStencilUsageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageStencilUsageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageStencilUsageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageStencilUsageCreateInfo alloc(SegmentAllocator allocator) { return new VkImageStencilUsageCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkImageStencilUsageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageStencilUsageCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkImageStencilUsageCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO); }
    public static VkImageStencilUsageCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO);
        return s;
    }
    public VkImageStencilUsageCreateInfo copyFrom(VkImageStencilUsageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageStencilUsageCreateInfo reinterpret(long count) { return new VkImageStencilUsageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageStencilUsageCreateInfo asSlice(long index) { return new VkImageStencilUsageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageStencilUsageCreateInfo asSlice(long index, long count) { return new VkImageStencilUsageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageStencilUsageCreateInfo at(long index, Consumer<VkImageStencilUsageCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int stencilUsageAt(long index) { return (int) VH_stencilUsage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int stencilUsage() { return (int) VH_stencilUsage.get(this.segment(), 0L, 0L); }
    public VkImageStencilUsageCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageStencilUsageCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageStencilUsageCreateInfo stencilUsageAt(long index, int value) { VH_stencilUsage.set(this.segment(), 0L, index, value); return this; }
    public VkImageStencilUsageCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageStencilUsageCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageStencilUsageCreateInfo stencilUsage(int value) { VH_stencilUsage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageStencilUsageCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageStencilUsageCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageStencilUsageCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageStencilUsageCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _stencilUsageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilUsage, index), LAYOUT_stencilUsage); }
    public MemorySegment _stencilUsage() { return _stencilUsageAt(0L); }
    public VkImageStencilUsageCreateInfo _stencilUsageAt(long index, MemorySegment src) { _stencilUsageAt(index).copyFrom(src); return this; }
    public VkImageStencilUsageCreateInfo _stencilUsage(MemorySegment src) { return _stencilUsageAt(0L, src); }
}
