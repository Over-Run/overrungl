// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentSampleCountInfoAMD`.
/// ## Layout
/// ```
/// struct VkAttachmentSampleCountInfoAMD {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const VkSampleCountFlagBits* pColorAttachmentSamples;
///     VkSampleCountFlagBits depthStencilAttachmentSamples;
/// }
/// ```
public final class VkAttachmentSampleCountInfoAMD extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilAttachmentSamples")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    public static final long OFFSET_pColorAttachmentSamples = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentSamples"));
    public static final long OFFSET_depthStencilAttachmentSamples = LAYOUT.byteOffset(PathElement.groupElement("depthStencilAttachmentSamples"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    public static final MemoryLayout LAYOUT_pColorAttachmentSamples = LAYOUT.select(PathElement.groupElement("pColorAttachmentSamples"));
    public static final MemoryLayout LAYOUT_depthStencilAttachmentSamples = LAYOUT.select(PathElement.groupElement("depthStencilAttachmentSamples"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    public static final VarHandle VH_pColorAttachmentSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentSamples"));
    public static final VarHandle VH_depthStencilAttachmentSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilAttachmentSamples"));

    public VkAttachmentSampleCountInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentSampleCountInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoAMD(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentSampleCountInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentSampleCountInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentSampleCountInfoAMD alloc(SegmentAllocator allocator) { return new VkAttachmentSampleCountInfoAMD(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentSampleCountInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkAttachmentSampleCountInfoAMD(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentSampleCountInfoAMD allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDMixedAttachmentSamples.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD); }
    public static VkAttachmentSampleCountInfoAMD allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDMixedAttachmentSamples.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
        return s;
    }
    public VkAttachmentSampleCountInfoAMD copyFrom(VkAttachmentSampleCountInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentSampleCountInfoAMD reinterpret(long count) { return new VkAttachmentSampleCountInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentSampleCountInfoAMD asSlice(long index) { return new VkAttachmentSampleCountInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentSampleCountInfoAMD asSlice(long index, long count) { return new VkAttachmentSampleCountInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentSampleCountInfoAMD at(long index, Consumer<VkAttachmentSampleCountInfoAMD> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int colorAttachmentCountAt(long index) { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, index); }
    public MemorySegment pColorAttachmentSamplesAt(long index) { return (MemorySegment) VH_pColorAttachmentSamples.get(this.segment(), 0L, index); }
    public int depthStencilAttachmentSamplesAt(long index) { return (int) VH_depthStencilAttachmentSamples.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int colorAttachmentCount() { return (int) VH_colorAttachmentCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pColorAttachmentSamples() { return (MemorySegment) VH_pColorAttachmentSamples.get(this.segment(), 0L, 0L); }
    public int depthStencilAttachmentSamples() { return (int) VH_depthStencilAttachmentSamples.get(this.segment(), 0L, 0L); }
    public VkAttachmentSampleCountInfoAMD sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoAMD pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoAMD colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoAMD pColorAttachmentSamplesAt(long index, MemorySegment value) { VH_pColorAttachmentSamples.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamplesAt(long index, int value) { VH_depthStencilAttachmentSamples.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoAMD sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoAMD pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoAMD colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoAMD pColorAttachmentSamples(MemorySegment value) { VH_pColorAttachmentSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamples(int value) { VH_depthStencilAttachmentSamples.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentSampleCountInfoAMD _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoAMD _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentSampleCountInfoAMD _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoAMD _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkAttachmentSampleCountInfoAMD _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoAMD _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachmentSamples, index), LAYOUT_pColorAttachmentSamples); }
    public MemorySegment _pColorAttachmentSamples() { return _pColorAttachmentSamplesAt(0L); }
    public VkAttachmentSampleCountInfoAMD _pColorAttachmentSamplesAt(long index, MemorySegment src) { _pColorAttachmentSamplesAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoAMD _pColorAttachmentSamples(MemorySegment src) { return _pColorAttachmentSamplesAt(0L, src); }
    public MemorySegment _depthStencilAttachmentSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthStencilAttachmentSamples, index), LAYOUT_depthStencilAttachmentSamples); }
    public MemorySegment _depthStencilAttachmentSamples() { return _depthStencilAttachmentSamplesAt(0L); }
    public VkAttachmentSampleCountInfoAMD _depthStencilAttachmentSamplesAt(long index, MemorySegment src) { _depthStencilAttachmentSamplesAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoAMD _depthStencilAttachmentSamples(MemorySegment src) { return _depthStencilAttachmentSamplesAt(0L, src); }
}
