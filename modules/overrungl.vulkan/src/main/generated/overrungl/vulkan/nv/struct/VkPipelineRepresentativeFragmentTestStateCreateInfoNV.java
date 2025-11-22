// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineRepresentativeFragmentTestStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 representativeFragmentTestEnable;
/// }
/// ```
public final class VkPipelineRepresentativeFragmentTestStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("representativeFragmentTestEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_representativeFragmentTestEnable = LAYOUT.byteOffset(PathElement.groupElement("representativeFragmentTestEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_representativeFragmentTestEnable = LAYOUT.select(PathElement.groupElement("representativeFragmentTestEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_representativeFragmentTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("representativeFragmentTestEnable"));

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV); }
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV copyFrom(VkPipelineRepresentativeFragmentTestStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV reinterpret(long count) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV asSlice(long index) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV at(long index, Consumer<VkPipelineRepresentativeFragmentTestStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int representativeFragmentTestEnableAt(long index) { return (int) VH_representativeFragmentTestEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int representativeFragmentTestEnable() { return (int) VH_representativeFragmentTestEnable.get(this.segment(), 0L, 0L); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnableAt(long index, int value) { VH_representativeFragmentTestEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnable(int value) { VH_representativeFragmentTestEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _representativeFragmentTestEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_representativeFragmentTestEnable, index), LAYOUT_representativeFragmentTestEnable); }
    public MemorySegment _representativeFragmentTestEnable() { return _representativeFragmentTestEnableAt(0L); }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV _representativeFragmentTestEnableAt(long index, MemorySegment src) { _representativeFragmentTestEnableAt(index).copyFrom(src); return this; }
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV _representativeFragmentTestEnable(MemorySegment src) { return _representativeFragmentTestEnableAt(0L, src); }
}
