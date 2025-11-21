// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultisampledRenderToSingleSampledInfoEXT`.
/// ## Layout
/// ```
/// struct VkMultisampledRenderToSingleSampledInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 multisampledRenderToSingleSampledEnable;
///     VkSampleCountFlagBits rasterizationSamples;
/// }
/// ```
public final class VkMultisampledRenderToSingleSampledInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampledEnable"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_multisampledRenderToSingleSampledEnable = LAYOUT.byteOffset(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    public static final long OFFSET_rasterizationSamples = LAYOUT.byteOffset(PathElement.groupElement("rasterizationSamples"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_multisampledRenderToSingleSampledEnable = LAYOUT.select(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    public static final MemoryLayout LAYOUT_rasterizationSamples = LAYOUT.select(PathElement.groupElement("rasterizationSamples"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_multisampledRenderToSingleSampledEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampledRenderToSingleSampledEnable"));
    public static final VarHandle VH_rasterizationSamples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationSamples"));

    public VkMultisampledRenderToSingleSampledInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMultisampledRenderToSingleSampledInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkMultisampledRenderToSingleSampledInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMultisampledRenderToSingleSampledInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultisampledRenderToSingleSampledInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMultisampledRenderToSingleSampledInfoEXT alloc(SegmentAllocator allocator) { return new VkMultisampledRenderToSingleSampledInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkMultisampledRenderToSingleSampledInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkMultisampledRenderToSingleSampledInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkMultisampledRenderToSingleSampledInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT); }
    public static VkMultisampledRenderToSingleSampledInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_INFO_EXT);
        return s;
    }
    public VkMultisampledRenderToSingleSampledInfoEXT copyFrom(VkMultisampledRenderToSingleSampledInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT reinterpret(long count) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMultisampledRenderToSingleSampledInfoEXT asSlice(long index) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMultisampledRenderToSingleSampledInfoEXT asSlice(long index, long count) { return new VkMultisampledRenderToSingleSampledInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMultisampledRenderToSingleSampledInfoEXT at(long index, Consumer<VkMultisampledRenderToSingleSampledInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int multisampledRenderToSingleSampledEnableAt(long index) { return (int) VH_multisampledRenderToSingleSampledEnable.get(this.segment(), 0L, index); }
    public int rasterizationSamplesAt(long index) { return (int) VH_rasterizationSamples.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int multisampledRenderToSingleSampledEnable() { return (int) VH_multisampledRenderToSingleSampledEnable.get(this.segment(), 0L, 0L); }
    public int rasterizationSamples() { return (int) VH_rasterizationSamples.get(this.segment(), 0L, 0L); }
    public VkMultisampledRenderToSingleSampledInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnableAt(long index, int value) { VH_multisampledRenderToSingleSampledEnable.set(this.segment(), 0L, index, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamplesAt(long index, int value) { VH_rasterizationSamples.set(this.segment(), 0L, index, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT multisampledRenderToSingleSampledEnable(int value) { VH_multisampledRenderToSingleSampledEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT rasterizationSamples(int value) { VH_rasterizationSamples.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMultisampledRenderToSingleSampledInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMultisampledRenderToSingleSampledInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _multisampledRenderToSingleSampledEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multisampledRenderToSingleSampledEnable, index), LAYOUT_multisampledRenderToSingleSampledEnable); }
    public MemorySegment _multisampledRenderToSingleSampledEnable() { return _multisampledRenderToSingleSampledEnableAt(0L); }
    public VkMultisampledRenderToSingleSampledInfoEXT _multisampledRenderToSingleSampledEnableAt(long index, MemorySegment src) { _multisampledRenderToSingleSampledEnableAt(index).copyFrom(src); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT _multisampledRenderToSingleSampledEnable(MemorySegment src) { return _multisampledRenderToSingleSampledEnableAt(0L, src); }
    public MemorySegment _rasterizationSamplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_rasterizationSamples, index), LAYOUT_rasterizationSamples); }
    public MemorySegment _rasterizationSamples() { return _rasterizationSamplesAt(0L); }
    public VkMultisampledRenderToSingleSampledInfoEXT _rasterizationSamplesAt(long index, MemorySegment src) { _rasterizationSamplesAt(index).copyFrom(src); return this; }
    public VkMultisampledRenderToSingleSampledInfoEXT _rasterizationSamples(MemorySegment src) { return _rasterizationSamplesAt(0L, src); }
}
