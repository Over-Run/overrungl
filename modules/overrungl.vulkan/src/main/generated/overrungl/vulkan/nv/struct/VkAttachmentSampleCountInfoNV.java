// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentSampleCountInfoNV`.
/// ## Layout
/// ```
/// struct VkAttachmentSampleCountInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t colorAttachmentCount;
///     const VkSampleCountFlagBits* pColorAttachmentSamples;
///     VkSampleCountFlagBits depthStencilAttachmentSamples;
/// }
/// ```
public final class VkAttachmentSampleCountInfoNV extends GroupType {
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

    public VkAttachmentSampleCountInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentSampleCountInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentSampleCountInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentSampleCountInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentSampleCountInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentSampleCountInfoNV alloc(SegmentAllocator allocator) { return new VkAttachmentSampleCountInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentSampleCountInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAttachmentSampleCountInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amd.VKAMDMixedAttachmentSamples.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD); }
    public static VkAttachmentSampleCountInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amd.VKAMDMixedAttachmentSamples.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD);
        return s;
    }
    public VkAttachmentSampleCountInfoNV copyFrom(VkAttachmentSampleCountInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentSampleCountInfoNV reinterpret(long count) { return new VkAttachmentSampleCountInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentSampleCountInfoNV asSlice(long index) { return new VkAttachmentSampleCountInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentSampleCountInfoNV asSlice(long index, long count) { return new VkAttachmentSampleCountInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentSampleCountInfoNV at(long index, Consumer<VkAttachmentSampleCountInfoNV> func) { func.accept(asSlice(index)); return this; }
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
    public VkAttachmentSampleCountInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoNV colorAttachmentCountAt(long index, int value) { VH_colorAttachmentCount.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoNV pColorAttachmentSamplesAt(long index, MemorySegment value) { VH_pColorAttachmentSamples.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoNV depthStencilAttachmentSamplesAt(long index, int value) { VH_depthStencilAttachmentSamples.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentSampleCountInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoNV colorAttachmentCount(int value) { VH_colorAttachmentCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoNV pColorAttachmentSamples(MemorySegment value) { VH_pColorAttachmentSamples.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentSampleCountInfoNV depthStencilAttachmentSamples(int value) { VH_depthStencilAttachmentSamples.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentSampleCountInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentSampleCountInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _colorAttachmentCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_colorAttachmentCount, index), LAYOUT_colorAttachmentCount); }
    public MemorySegment _colorAttachmentCount() { return _colorAttachmentCountAt(0L); }
    public VkAttachmentSampleCountInfoNV _colorAttachmentCountAt(long index, MemorySegment src) { _colorAttachmentCountAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoNV _colorAttachmentCount(MemorySegment src) { return _colorAttachmentCountAt(0L, src); }
    public MemorySegment _pColorAttachmentSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pColorAttachmentSamples, index), LAYOUT_pColorAttachmentSamples); }
    public MemorySegment _pColorAttachmentSamples() { return _pColorAttachmentSamplesAt(0L); }
    public VkAttachmentSampleCountInfoNV _pColorAttachmentSamplesAt(long index, MemorySegment src) { _pColorAttachmentSamplesAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoNV _pColorAttachmentSamples(MemorySegment src) { return _pColorAttachmentSamplesAt(0L, src); }
    public MemorySegment _depthStencilAttachmentSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthStencilAttachmentSamples, index), LAYOUT_depthStencilAttachmentSamples); }
    public MemorySegment _depthStencilAttachmentSamples() { return _depthStencilAttachmentSamplesAt(0L); }
    public VkAttachmentSampleCountInfoNV _depthStencilAttachmentSamplesAt(long index, MemorySegment src) { _depthStencilAttachmentSamplesAt(index).copyFrom(src); return this; }
    public VkAttachmentSampleCountInfoNV _depthStencilAttachmentSamples(MemorySegment src) { return _depthStencilAttachmentSamplesAt(0L, src); }
}
