// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowImageFormatPropertiesNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowImageFormatPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat format;
/// }
/// ```
public final class VkOpticalFlowImageFormatPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    public VkOpticalFlowImageFormatPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOpticalFlowImageFormatPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowImageFormatPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkOpticalFlowImageFormatPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowImageFormatPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOpticalFlowImageFormatPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowImageFormatPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOpticalFlowImageFormatPropertiesNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowImageFormatPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkOpticalFlowImageFormatPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowImageFormatPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkOpticalFlowImageFormatPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV); }
    public static VkOpticalFlowImageFormatPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV);
        return s;
    }
    public VkOpticalFlowImageFormatPropertiesNV copyFrom(VkOpticalFlowImageFormatPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOpticalFlowImageFormatPropertiesNV reinterpret(long count) { return new VkOpticalFlowImageFormatPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOpticalFlowImageFormatPropertiesNV asSlice(long index) { return new VkOpticalFlowImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOpticalFlowImageFormatPropertiesNV asSlice(long index, long count) { return new VkOpticalFlowImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOpticalFlowImageFormatPropertiesNV at(long index, Consumer<VkOpticalFlowImageFormatPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public VkOpticalFlowImageFormatPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowImageFormatPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowImageFormatPropertiesNV formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowImageFormatPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowImageFormatPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowImageFormatPropertiesNV format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOpticalFlowImageFormatPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowImageFormatPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOpticalFlowImageFormatPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOpticalFlowImageFormatPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkOpticalFlowImageFormatPropertiesNV _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkOpticalFlowImageFormatPropertiesNV _format(MemorySegment src) { return _formatAt(0L, src); }
}
