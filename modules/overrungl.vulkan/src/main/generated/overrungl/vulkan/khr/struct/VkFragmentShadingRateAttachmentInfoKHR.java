// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFragmentShadingRateAttachmentInfoKHR`.
/// ## Layout
/// ```
/// struct VkFragmentShadingRateAttachmentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const VkAttachmentReference2* pFragmentShadingRateAttachment;
///     VkExtent2D shadingRateAttachmentTexelSize;
/// }
/// ```
public final class VkFragmentShadingRateAttachmentInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pFragmentShadingRateAttachment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pFragmentShadingRateAttachment = LAYOUT.byteOffset(PathElement.groupElement("pFragmentShadingRateAttachment"));
    public static final long OFFSET_shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pFragmentShadingRateAttachment = LAYOUT.select(PathElement.groupElement("pFragmentShadingRateAttachment"));
    public static final MemoryLayout LAYOUT_shadingRateAttachmentTexelSize = LAYOUT.select(PathElement.groupElement("shadingRateAttachmentTexelSize"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pFragmentShadingRateAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFragmentShadingRateAttachment"));
    public static final VarHandle VH_shadingRateAttachmentTexelSize$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateAttachmentTexelSize"), PathElement.groupElement("width"));
    public static final VarHandle VH_shadingRateAttachmentTexelSize$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateAttachmentTexelSize"), PathElement.groupElement("height"));

    public VkFragmentShadingRateAttachmentInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkFragmentShadingRateAttachmentInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkFragmentShadingRateAttachmentInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFragmentShadingRateAttachmentInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator) { return new VkFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkFragmentShadingRateAttachmentInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkFragmentShadingRateAttachmentInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR); }
    public static VkFragmentShadingRateAttachmentInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShadingRate.VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
        return s;
    }
    public VkFragmentShadingRateAttachmentInfoKHR copyFrom(VkFragmentShadingRateAttachmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR reinterpret(long count) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkFragmentShadingRateAttachmentInfoKHR asSlice(long index) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkFragmentShadingRateAttachmentInfoKHR asSlice(long index, long count) { return new VkFragmentShadingRateAttachmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkFragmentShadingRateAttachmentInfoKHR at(long index, Consumer<VkFragmentShadingRateAttachmentInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pFragmentShadingRateAttachmentAt(long index) { return (MemorySegment) VH_pFragmentShadingRateAttachment.get(this.segment(), 0L, index); }
    public int shadingRateAttachmentTexelSize$widthAt(long index) { return (int) VH_shadingRateAttachmentTexelSize$width.get(this.segment(), 0L, index); }
    public int shadingRateAttachmentTexelSize$heightAt(long index) { return (int) VH_shadingRateAttachmentTexelSize$height.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pFragmentShadingRateAttachment() { return (MemorySegment) VH_pFragmentShadingRateAttachment.get(this.segment(), 0L, 0L); }
    public int shadingRateAttachmentTexelSize$width() { return (int) VH_shadingRateAttachmentTexelSize$width.get(this.segment(), 0L, 0L); }
    public int shadingRateAttachmentTexelSize$height() { return (int) VH_shadingRateAttachmentTexelSize$height.get(this.segment(), 0L, 0L); }
    public VkFragmentShadingRateAttachmentInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachmentAt(long index, MemorySegment value) { VH_pFragmentShadingRateAttachment.set(this.segment(), 0L, index, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$widthAt(long index, int value) { VH_shadingRateAttachmentTexelSize$width.set(this.segment(), 0L, index, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$heightAt(long index, int value) { VH_shadingRateAttachmentTexelSize$height.set(this.segment(), 0L, index, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR pFragmentShadingRateAttachment(MemorySegment value) { VH_pFragmentShadingRateAttachment.set(this.segment(), 0L, 0L, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$width(int value) { VH_shadingRateAttachmentTexelSize$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize$height(int value) { VH_shadingRateAttachmentTexelSize$height.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkFragmentShadingRateAttachmentInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkFragmentShadingRateAttachmentInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pFragmentShadingRateAttachmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pFragmentShadingRateAttachment, index), LAYOUT_pFragmentShadingRateAttachment); }
    public MemorySegment _pFragmentShadingRateAttachment() { return _pFragmentShadingRateAttachmentAt(0L); }
    public VkFragmentShadingRateAttachmentInfoKHR _pFragmentShadingRateAttachmentAt(long index, MemorySegment src) { _pFragmentShadingRateAttachmentAt(index).copyFrom(src); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR _pFragmentShadingRateAttachment(MemorySegment src) { return _pFragmentShadingRateAttachmentAt(0L, src); }
    public MemorySegment _shadingRateAttachmentTexelSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shadingRateAttachmentTexelSize, index), LAYOUT_shadingRateAttachmentTexelSize); }
    public MemorySegment _shadingRateAttachmentTexelSize() { return _shadingRateAttachmentTexelSizeAt(0L); }
    public VkFragmentShadingRateAttachmentInfoKHR _shadingRateAttachmentTexelSizeAt(long index, MemorySegment src) { _shadingRateAttachmentTexelSizeAt(index).copyFrom(src); return this; }
    public VkFragmentShadingRateAttachmentInfoKHR _shadingRateAttachmentTexelSize(MemorySegment src) { return _shadingRateAttachmentTexelSizeAt(0L, src); }
}
