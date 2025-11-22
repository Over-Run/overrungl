// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageDrmFormatModifierExplicitCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     const VkSubresourceLayout* pPlaneLayouts;
/// }
/// ```
public final class VkImageDrmFormatModifierExplicitCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.ADDRESS.withName("pPlaneLayouts")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    public static final long OFFSET_drmFormatModifierPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
    public static final long OFFSET_pPlaneLayouts = LAYOUT.byteOffset(PathElement.groupElement("pPlaneLayouts"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    public static final MemoryLayout LAYOUT_drmFormatModifierPlaneCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierPlaneCount"));
    public static final MemoryLayout LAYOUT_pPlaneLayouts = LAYOUT.select(PathElement.groupElement("pPlaneLayouts"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_drmFormatModifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier"));
    public static final VarHandle VH_drmFormatModifierPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount"));
    public static final VarHandle VH_pPlaneLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPlaneLayouts"));

    public VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT); }
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT);
        return s;
    }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT copyFrom(VkImageDrmFormatModifierExplicitCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT reinterpret(long count) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT asSlice(long index) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT asSlice(long index, long count) { return new VkImageDrmFormatModifierExplicitCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT at(long index, Consumer<VkImageDrmFormatModifierExplicitCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long drmFormatModifierAt(long index) { return (long) VH_drmFormatModifier.get(this.segment(), 0L, index); }
    public int drmFormatModifierPlaneCountAt(long index) { return (int) VH_drmFormatModifierPlaneCount.get(this.segment(), 0L, index); }
    public MemorySegment pPlaneLayoutsAt(long index) { return (MemorySegment) VH_pPlaneLayouts.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long drmFormatModifier() { return (long) VH_drmFormatModifier.get(this.segment(), 0L, 0L); }
    public int drmFormatModifierPlaneCount() { return (int) VH_drmFormatModifierPlaneCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPlaneLayouts() { return (MemorySegment) VH_pPlaneLayouts.get(this.segment(), 0L, 0L); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierAt(long index, long value) { VH_drmFormatModifier.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierPlaneCountAt(long index, int value) { VH_drmFormatModifierPlaneCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayoutsAt(long index, MemorySegment value) { VH_pPlaneLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(long value) { VH_drmFormatModifier.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifierPlaneCount(int value) { VH_drmFormatModifierPlaneCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(MemorySegment value) { VH_pPlaneLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _drmFormatModifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifier, index), LAYOUT_drmFormatModifier); }
    public MemorySegment _drmFormatModifier() { return _drmFormatModifierAt(0L); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _drmFormatModifierAt(long index, MemorySegment src) { _drmFormatModifierAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _drmFormatModifier(MemorySegment src) { return _drmFormatModifierAt(0L, src); }
    public MemorySegment _drmFormatModifierPlaneCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierPlaneCount, index), LAYOUT_drmFormatModifierPlaneCount); }
    public MemorySegment _drmFormatModifierPlaneCount() { return _drmFormatModifierPlaneCountAt(0L); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _drmFormatModifierPlaneCountAt(long index, MemorySegment src) { _drmFormatModifierPlaneCountAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _drmFormatModifierPlaneCount(MemorySegment src) { return _drmFormatModifierPlaneCountAt(0L, src); }
    public MemorySegment _pPlaneLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPlaneLayouts, index), LAYOUT_pPlaneLayouts); }
    public MemorySegment _pPlaneLayouts() { return _pPlaneLayoutsAt(0L); }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _pPlaneLayoutsAt(long index, MemorySegment src) { _pPlaneLayoutsAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierExplicitCreateInfoEXT _pPlaneLayouts(MemorySegment src) { return _pPlaneLayoutsAt(0L, src); }
}
