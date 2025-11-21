// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowImageFormatInfoNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowImageFormatInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkOpticalFlowUsageFlagsNV usage;
/// }
/// ```
public final class VkOpticalFlowImageFormatInfoNV extends GroupType {
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

    public VkOpticalFlowImageFormatInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOpticalFlowImageFormatInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowImageFormatInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkOpticalFlowImageFormatInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowImageFormatInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOpticalFlowImageFormatInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowImageFormatInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOpticalFlowImageFormatInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowImageFormatInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkOpticalFlowImageFormatInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowImageFormatInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkOpticalFlowImageFormatInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV); }
    public static VkOpticalFlowImageFormatInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV);
        return s;
    }
    public VkOpticalFlowImageFormatInfoNV copyFrom(VkOpticalFlowImageFormatInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOpticalFlowImageFormatInfoNV reinterpret(long count) { return new VkOpticalFlowImageFormatInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOpticalFlowImageFormatInfoNV asSlice(long index) { return new VkOpticalFlowImageFormatInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOpticalFlowImageFormatInfoNV asSlice(long index, long count) { return new VkOpticalFlowImageFormatInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOpticalFlowImageFormatInfoNV at(long index, Consumer<VkOpticalFlowImageFormatInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int usageAt(long index) { return (int) VH_usage.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int usage() { return (int) VH_usage.get(this.segment(), 0L, 0L); }
    public VkOpticalFlowImageFormatInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowImageFormatInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowImageFormatInfoNV usageAt(long index, int value) { VH_usage.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowImageFormatInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowImageFormatInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowImageFormatInfoNV usage(int value) { VH_usage.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOpticalFlowImageFormatInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowImageFormatInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOpticalFlowImageFormatInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOpticalFlowImageFormatInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _usageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_usage, index), LAYOUT_usage); }
    public MemorySegment _usage() { return _usageAt(0L); }
    public VkOpticalFlowImageFormatInfoNV _usageAt(long index, MemorySegment src) { _usageAt(index).copyFrom(src); return this; }
    public VkOpticalFlowImageFormatInfoNV _usage(MemorySegment src) { return _usageAt(0L, src); }
}
