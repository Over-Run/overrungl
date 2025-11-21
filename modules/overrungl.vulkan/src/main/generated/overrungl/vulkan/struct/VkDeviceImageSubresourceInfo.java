// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceImageSubresourceInfo`.
/// ## Layout
/// ```
/// struct VkDeviceImageSubresourceInfo {
///     VkStructureType sType;
///     const void* pNext;
///     const VkImageCreateInfo* pCreateInfo;
///     const VkImageSubresource2* pSubresource;
/// }
/// ```
public final class VkDeviceImageSubresourceInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pCreateInfo"),
        ValueLayout.ADDRESS.withName("pSubresource")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pCreateInfo = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
    public static final long OFFSET_pSubresource = LAYOUT.byteOffset(PathElement.groupElement("pSubresource"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pCreateInfo = LAYOUT.select(PathElement.groupElement("pCreateInfo"));
    public static final MemoryLayout LAYOUT_pSubresource = LAYOUT.select(PathElement.groupElement("pSubresource"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pCreateInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCreateInfo"));
    public static final VarHandle VH_pSubresource = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSubresource"));

    public VkDeviceImageSubresourceInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceImageSubresourceInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceImageSubresourceInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceImageSubresourceInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceImageSubresourceInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceImageSubresourceInfo alloc(SegmentAllocator allocator) { return new VkDeviceImageSubresourceInfo(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceImageSubresourceInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceImageSubresourceInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceImageSubresourceInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO); }
    public static VkDeviceImageSubresourceInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO);
        return s;
    }
    public VkDeviceImageSubresourceInfo copyFrom(VkDeviceImageSubresourceInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceImageSubresourceInfo reinterpret(long count) { return new VkDeviceImageSubresourceInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceImageSubresourceInfo asSlice(long index) { return new VkDeviceImageSubresourceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceImageSubresourceInfo asSlice(long index, long count) { return new VkDeviceImageSubresourceInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceImageSubresourceInfo at(long index, Consumer<VkDeviceImageSubresourceInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pCreateInfoAt(long index) { return (MemorySegment) VH_pCreateInfo.get(this.segment(), 0L, index); }
    public MemorySegment pSubresourceAt(long index) { return (MemorySegment) VH_pSubresource.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pCreateInfo() { return (MemorySegment) VH_pCreateInfo.get(this.segment(), 0L, 0L); }
    public MemorySegment pSubresource() { return (MemorySegment) VH_pSubresource.get(this.segment(), 0L, 0L); }
    public VkDeviceImageSubresourceInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceImageSubresourceInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceImageSubresourceInfo pCreateInfoAt(long index, MemorySegment value) { VH_pCreateInfo.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceImageSubresourceInfo pSubresourceAt(long index, MemorySegment value) { VH_pSubresource.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceImageSubresourceInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceImageSubresourceInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceImageSubresourceInfo pCreateInfo(MemorySegment value) { VH_pCreateInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceImageSubresourceInfo pSubresource(MemorySegment value) { VH_pSubresource.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceImageSubresourceInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceImageSubresourceInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceImageSubresourceInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceImageSubresourceInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pCreateInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCreateInfo, index), LAYOUT_pCreateInfo); }
    public MemorySegment _pCreateInfo() { return _pCreateInfoAt(0L); }
    public VkDeviceImageSubresourceInfo _pCreateInfoAt(long index, MemorySegment src) { _pCreateInfoAt(index).copyFrom(src); return this; }
    public VkDeviceImageSubresourceInfo _pCreateInfo(MemorySegment src) { return _pCreateInfoAt(0L, src); }
    public MemorySegment _pSubresourceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSubresource, index), LAYOUT_pSubresource); }
    public MemorySegment _pSubresource() { return _pSubresourceAt(0L); }
    public VkDeviceImageSubresourceInfo _pSubresourceAt(long index, MemorySegment src) { _pSubresourceAt(index).copyFrom(src); return this; }
    public VkDeviceImageSubresourceInfo _pSubresource(MemorySegment src) { return _pSubresourceAt(0L, src); }
}
