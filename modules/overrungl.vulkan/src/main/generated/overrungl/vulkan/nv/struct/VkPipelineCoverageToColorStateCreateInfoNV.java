// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCoverageToColorStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineCoverageToColorStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCoverageToColorStateCreateFlagsNV flags;
///     VkBool32 coverageToColorEnable;
///     uint32_t coverageToColorLocation;
/// }
/// ```
public final class VkPipelineCoverageToColorStateCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("coverageToColorLocation")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_coverageToColorEnable = LAYOUT.byteOffset(PathElement.groupElement("coverageToColorEnable"));
    public static final long OFFSET_coverageToColorLocation = LAYOUT.byteOffset(PathElement.groupElement("coverageToColorLocation"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_coverageToColorEnable = LAYOUT.select(PathElement.groupElement("coverageToColorEnable"));
    public static final MemoryLayout LAYOUT_coverageToColorLocation = LAYOUT.select(PathElement.groupElement("coverageToColorLocation"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_coverageToColorEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageToColorEnable"));
    public static final VarHandle VH_coverageToColorLocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("coverageToColorLocation"));

    public VkPipelineCoverageToColorStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineCoverageToColorStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineCoverageToColorStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineCoverageToColorStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCoverageToColorStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineCoverageToColorStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineCoverageToColorStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineCoverageToColorStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineCoverageToColorStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineCoverageToColorStateCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVFragmentCoverageToColor.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV); }
    public static VkPipelineCoverageToColorStateCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVFragmentCoverageToColor.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
        return s;
    }
    public VkPipelineCoverageToColorStateCreateInfoNV copyFrom(VkPipelineCoverageToColorStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV reinterpret(long count) { return new VkPipelineCoverageToColorStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineCoverageToColorStateCreateInfoNV asSlice(long index) { return new VkPipelineCoverageToColorStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineCoverageToColorStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineCoverageToColorStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineCoverageToColorStateCreateInfoNV at(long index, Consumer<VkPipelineCoverageToColorStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int coverageToColorEnableAt(long index) { return (int) VH_coverageToColorEnable.get(this.segment(), 0L, index); }
    public int coverageToColorLocationAt(long index) { return (int) VH_coverageToColorLocation.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int coverageToColorEnable() { return (int) VH_coverageToColorEnable.get(this.segment(), 0L, 0L); }
    public int coverageToColorLocation() { return (int) VH_coverageToColorLocation.get(this.segment(), 0L, 0L); }
    public VkPipelineCoverageToColorStateCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnableAt(long index, int value) { VH_coverageToColorEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocationAt(long index, int value) { VH_coverageToColorLocation.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorEnable(int value) { VH_coverageToColorEnable.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV coverageToColorLocation(int value) { VH_coverageToColorLocation.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineCoverageToColorStateCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineCoverageToColorStateCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkPipelineCoverageToColorStateCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _coverageToColorEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageToColorEnable, index), LAYOUT_coverageToColorEnable); }
    public MemorySegment _coverageToColorEnable() { return _coverageToColorEnableAt(0L); }
    public VkPipelineCoverageToColorStateCreateInfoNV _coverageToColorEnableAt(long index, MemorySegment src) { _coverageToColorEnableAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV _coverageToColorEnable(MemorySegment src) { return _coverageToColorEnableAt(0L, src); }
    public MemorySegment _coverageToColorLocationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_coverageToColorLocation, index), LAYOUT_coverageToColorLocation); }
    public MemorySegment _coverageToColorLocation() { return _coverageToColorLocationAt(0L); }
    public VkPipelineCoverageToColorStateCreateInfoNV _coverageToColorLocationAt(long index, MemorySegment src) { _coverageToColorLocationAt(index).copyFrom(src); return this; }
    public VkPipelineCoverageToColorStateCreateInfoNV _coverageToColorLocation(MemorySegment src) { return _coverageToColorLocationAt(0L, src); }
}
