// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageDrmFormatModifierListCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageDrmFormatModifierListCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t drmFormatModifierCount;
///     const uint64_t* pDrmFormatModifiers;
/// }
/// ```
public final class VkImageDrmFormatModifierListCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withName("pDrmFormatModifiers")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_drmFormatModifierCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierCount"));
    public static final long OFFSET_pDrmFormatModifiers = LAYOUT.byteOffset(PathElement.groupElement("pDrmFormatModifiers"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_drmFormatModifierCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierCount"));
    public static final MemoryLayout LAYOUT_pDrmFormatModifiers = LAYOUT.select(PathElement.groupElement("pDrmFormatModifiers"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_drmFormatModifierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierCount"));
    public static final VarHandle VH_pDrmFormatModifiers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrmFormatModifiers"));

    public VkImageDrmFormatModifierListCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkImageDrmFormatModifierListCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkImageDrmFormatModifierListCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkImageDrmFormatModifierListCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkImageDrmFormatModifierListCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierListCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkImageDrmFormatModifierListCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageDrmFormatModifierListCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkImageDrmFormatModifierListCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT); }
    public static VkImageDrmFormatModifierListCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
        return s;
    }
    public VkImageDrmFormatModifierListCreateInfoEXT copyFrom(VkImageDrmFormatModifierListCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT reinterpret(long count) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkImageDrmFormatModifierListCreateInfoEXT asSlice(long index) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkImageDrmFormatModifierListCreateInfoEXT asSlice(long index, long count) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkImageDrmFormatModifierListCreateInfoEXT at(long index, Consumer<VkImageDrmFormatModifierListCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int drmFormatModifierCountAt(long index) { return (int) VH_drmFormatModifierCount.get(this.segment(), 0L, index); }
    public MemorySegment pDrmFormatModifiersAt(long index) { return (MemorySegment) VH_pDrmFormatModifiers.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int drmFormatModifierCount() { return (int) VH_drmFormatModifierCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDrmFormatModifiers() { return (MemorySegment) VH_pDrmFormatModifiers.get(this.segment(), 0L, 0L); }
    public VkImageDrmFormatModifierListCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT drmFormatModifierCountAt(long index, int value) { VH_drmFormatModifierCount.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiersAt(long index, MemorySegment value) { VH_pDrmFormatModifiers.set(this.segment(), 0L, index, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT drmFormatModifierCount(int value) { VH_drmFormatModifierCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiers(MemorySegment value) { VH_pDrmFormatModifiers.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkImageDrmFormatModifierListCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkImageDrmFormatModifierListCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _drmFormatModifierCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierCount, index), LAYOUT_drmFormatModifierCount); }
    public MemorySegment _drmFormatModifierCount() { return _drmFormatModifierCountAt(0L); }
    public VkImageDrmFormatModifierListCreateInfoEXT _drmFormatModifierCountAt(long index, MemorySegment src) { _drmFormatModifierCountAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT _drmFormatModifierCount(MemorySegment src) { return _drmFormatModifierCountAt(0L, src); }
    public MemorySegment _pDrmFormatModifiersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDrmFormatModifiers, index), LAYOUT_pDrmFormatModifiers); }
    public MemorySegment _pDrmFormatModifiers() { return _pDrmFormatModifiersAt(0L); }
    public VkImageDrmFormatModifierListCreateInfoEXT _pDrmFormatModifiersAt(long index, MemorySegment src) { _pDrmFormatModifiersAt(index).copyFrom(src); return this; }
    public VkImageDrmFormatModifierListCreateInfoEXT _pDrmFormatModifiers(MemorySegment src) { return _pDrmFormatModifiersAt(0L, src); }
}
