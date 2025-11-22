// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.huawei.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSubpassShadingPipelineCreateInfoHUAWEI`.
/// ## Layout
/// ```
/// struct VkSubpassShadingPipelineCreateInfoHUAWEI {
///     VkStructureType sType;
///     void* pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
/// }
/// ```
public final class VkSubpassShadingPipelineCreateInfoHUAWEI extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_renderPass = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
    public static final long OFFSET_subpass = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_renderPass = LAYOUT.select(PathElement.groupElement("renderPass"));
    public static final MemoryLayout LAYOUT_subpass = LAYOUT.select(PathElement.groupElement("subpass"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    public static final VarHandle VH_subpass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpass"));

    public VkSubpassShadingPipelineCreateInfoHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment, estimateCount(segment, LAYOUT)); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassShadingPipelineCreateInfoHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI alloc(SegmentAllocator allocator) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(allocator.allocate(LAYOUT), 1); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(allocator.allocate(LAYOUT, count), count); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.huawei.VKHUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI); }
    public static VkSubpassShadingPipelineCreateInfoHUAWEI allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.huawei.VKHUAWEISubpassShading.VK_STRUCTURE_TYPE_SUBPASS_SHADING_PIPELINE_CREATE_INFO_HUAWEI);
        return s;
    }
    public VkSubpassShadingPipelineCreateInfoHUAWEI copyFrom(VkSubpassShadingPipelineCreateInfoHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI reinterpret(long count) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI asSlice(long index) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI asSlice(long index, long count) { return new VkSubpassShadingPipelineCreateInfoHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI at(long index, Consumer<VkSubpassShadingPipelineCreateInfoHUAWEI> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long renderPassAt(long index) { return (long) VH_renderPass.get(this.segment(), 0L, index); }
    public int subpassAt(long index) { return (int) VH_subpass.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long renderPass() { return (long) VH_renderPass.get(this.segment(), 0L, 0L); }
    public int subpass() { return (int) VH_subpass.get(this.segment(), 0L, 0L); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPassAt(long index, long value) { VH_renderPass.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpassAt(long index, int value) { VH_subpass.set(this.segment(), 0L, index, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI renderPass(long value) { VH_renderPass.set(this.segment(), 0L, 0L, value); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI subpass(int value) { VH_subpass.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _renderPassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderPass, index), LAYOUT_renderPass); }
    public MemorySegment _renderPass() { return _renderPassAt(0L); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _renderPassAt(long index, MemorySegment src) { _renderPassAt(index).copyFrom(src); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _renderPass(MemorySegment src) { return _renderPassAt(0L, src); }
    public MemorySegment _subpassAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subpass, index), LAYOUT_subpass); }
    public MemorySegment _subpass() { return _subpassAt(0L); }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _subpassAt(long index, MemorySegment src) { _subpassAt(index).copyFrom(src); return this; }
    public VkSubpassShadingPipelineCreateInfoHUAWEI _subpass(MemorySegment src) { return _subpassAt(0L, src); }
}
