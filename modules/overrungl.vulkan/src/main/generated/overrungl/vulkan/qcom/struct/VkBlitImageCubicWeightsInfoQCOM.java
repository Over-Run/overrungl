// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBlitImageCubicWeightsInfoQCOM`.
/// ## Layout
/// ```
/// struct VkBlitImageCubicWeightsInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkCubicFilterWeightsQCOM cubicWeights;
/// }
/// ```
public final class VkBlitImageCubicWeightsInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicWeights")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cubicWeights = LAYOUT.byteOffset(PathElement.groupElement("cubicWeights"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cubicWeights = LAYOUT.select(PathElement.groupElement("cubicWeights"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cubicWeights = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cubicWeights"));

    public VkBlitImageCubicWeightsInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkBlitImageCubicWeightsInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBlitImageCubicWeightsInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkBlitImageCubicWeightsInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBlitImageCubicWeightsInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkBlitImageCubicWeightsInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBlitImageCubicWeightsInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkBlitImageCubicWeightsInfoQCOM alloc(SegmentAllocator allocator) { return new VkBlitImageCubicWeightsInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkBlitImageCubicWeightsInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkBlitImageCubicWeightsInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkBlitImageCubicWeightsInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMFilterCubicWeights.VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM); }
    public static VkBlitImageCubicWeightsInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMFilterCubicWeights.VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
        return s;
    }
    public VkBlitImageCubicWeightsInfoQCOM copyFrom(VkBlitImageCubicWeightsInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkBlitImageCubicWeightsInfoQCOM reinterpret(long count) { return new VkBlitImageCubicWeightsInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkBlitImageCubicWeightsInfoQCOM asSlice(long index) { return new VkBlitImageCubicWeightsInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkBlitImageCubicWeightsInfoQCOM asSlice(long index, long count) { return new VkBlitImageCubicWeightsInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkBlitImageCubicWeightsInfoQCOM at(long index, Consumer<VkBlitImageCubicWeightsInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cubicWeightsAt(long index) { return (int) VH_cubicWeights.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cubicWeights() { return (int) VH_cubicWeights.get(this.segment(), 0L, 0L); }
    public VkBlitImageCubicWeightsInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkBlitImageCubicWeightsInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkBlitImageCubicWeightsInfoQCOM cubicWeightsAt(long index, int value) { VH_cubicWeights.set(this.segment(), 0L, index, value); return this; }
    public VkBlitImageCubicWeightsInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkBlitImageCubicWeightsInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkBlitImageCubicWeightsInfoQCOM cubicWeights(int value) { VH_cubicWeights.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkBlitImageCubicWeightsInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkBlitImageCubicWeightsInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkBlitImageCubicWeightsInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkBlitImageCubicWeightsInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cubicWeightsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cubicWeights, index), LAYOUT_cubicWeights); }
    public MemorySegment _cubicWeights() { return _cubicWeightsAt(0L); }
    public VkBlitImageCubicWeightsInfoQCOM _cubicWeightsAt(long index, MemorySegment src) { _cubicWeightsAt(index).copyFrom(src); return this; }
    public VkBlitImageCubicWeightsInfoQCOM _cubicWeights(MemorySegment src) { return _cubicWeightsAt(0L, src); }
}
