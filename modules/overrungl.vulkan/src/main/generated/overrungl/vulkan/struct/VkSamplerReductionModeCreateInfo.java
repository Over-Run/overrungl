// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerReductionModeCreateInfo`.
/// ## Layout
/// ```
/// struct VkSamplerReductionModeCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkSamplerReductionMode reductionMode;
/// }
/// ```
public final class VkSamplerReductionModeCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("reductionMode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_reductionMode = LAYOUT.byteOffset(PathElement.groupElement("reductionMode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_reductionMode = LAYOUT.select(PathElement.groupElement("reductionMode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_reductionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("reductionMode"));

    public VkSamplerReductionModeCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkSamplerReductionModeCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkSamplerReductionModeCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkSamplerReductionModeCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkSamplerReductionModeCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerReductionModeCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkSamplerReductionModeCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerReductionModeCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkSamplerReductionModeCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO); }
    public static VkSamplerReductionModeCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO);
        return s;
    }
    public VkSamplerReductionModeCreateInfo copyFrom(VkSamplerReductionModeCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkSamplerReductionModeCreateInfo reinterpret(long count) { return new VkSamplerReductionModeCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkSamplerReductionModeCreateInfo asSlice(long index) { return new VkSamplerReductionModeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkSamplerReductionModeCreateInfo asSlice(long index, long count) { return new VkSamplerReductionModeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkSamplerReductionModeCreateInfo at(long index, Consumer<VkSamplerReductionModeCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int reductionModeAt(long index) { return (int) VH_reductionMode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int reductionMode() { return (int) VH_reductionMode.get(this.segment(), 0L, 0L); }
    public VkSamplerReductionModeCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerReductionModeCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerReductionModeCreateInfo reductionModeAt(long index, int value) { VH_reductionMode.set(this.segment(), 0L, index, value); return this; }
    public VkSamplerReductionModeCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerReductionModeCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkSamplerReductionModeCreateInfo reductionMode(int value) { VH_reductionMode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkSamplerReductionModeCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkSamplerReductionModeCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkSamplerReductionModeCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkSamplerReductionModeCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _reductionModeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_reductionMode, index), LAYOUT_reductionMode); }
    public MemorySegment _reductionMode() { return _reductionModeAt(0L); }
    public VkSamplerReductionModeCreateInfo _reductionModeAt(long index, MemorySegment src) { _reductionModeAt(index).copyFrom(src); return this; }
    public VkSamplerReductionModeCreateInfo _reductionMode(MemorySegment src) { return _reductionModeAt(0L, src); }
}
