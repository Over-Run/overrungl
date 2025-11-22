// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowExecuteInfoNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowExecuteInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     VkOpticalFlowExecuteFlagsNV flags;
///     uint32_t regionCount;
///     const VkRect2D* pRegions;
/// }
/// ```
public final class VkOpticalFlowExecuteInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    public VkOpticalFlowExecuteInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkOpticalFlowExecuteInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkOpticalFlowExecuteInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkOpticalFlowExecuteInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowExecuteInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkOpticalFlowExecuteInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowExecuteInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkOpticalFlowExecuteInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowExecuteInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkOpticalFlowExecuteInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV); }
    public static VkOpticalFlowExecuteInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV);
        return s;
    }
    public VkOpticalFlowExecuteInfoNV copyFrom(VkOpticalFlowExecuteInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkOpticalFlowExecuteInfoNV reinterpret(long count) { return new VkOpticalFlowExecuteInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkOpticalFlowExecuteInfoNV asSlice(long index) { return new VkOpticalFlowExecuteInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkOpticalFlowExecuteInfoNV asSlice(long index, long count) { return new VkOpticalFlowExecuteInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkOpticalFlowExecuteInfoNV at(long index, Consumer<VkOpticalFlowExecuteInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int regionCountAt(long index) { return (int) VH_regionCount.get(this.segment(), 0L, index); }
    public MemorySegment pRegionsAt(long index) { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int regionCount() { return (int) VH_regionCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pRegions() { return (MemorySegment) VH_pRegions.get(this.segment(), 0L, 0L); }
    public VkOpticalFlowExecuteInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowExecuteInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowExecuteInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowExecuteInfoNV regionCountAt(long index, int value) { VH_regionCount.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowExecuteInfoNV pRegionsAt(long index, MemorySegment value) { VH_pRegions.set(this.segment(), 0L, index, value); return this; }
    public VkOpticalFlowExecuteInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowExecuteInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowExecuteInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowExecuteInfoNV regionCount(int value) { VH_regionCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkOpticalFlowExecuteInfoNV pRegions(MemorySegment value) { VH_pRegions.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkOpticalFlowExecuteInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkOpticalFlowExecuteInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkOpticalFlowExecuteInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkOpticalFlowExecuteInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkOpticalFlowExecuteInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkOpticalFlowExecuteInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _regionCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_regionCount, index), LAYOUT_regionCount); }
    public MemorySegment _regionCount() { return _regionCountAt(0L); }
    public VkOpticalFlowExecuteInfoNV _regionCountAt(long index, MemorySegment src) { _regionCountAt(index).copyFrom(src); return this; }
    public VkOpticalFlowExecuteInfoNV _regionCount(MemorySegment src) { return _regionCountAt(0L, src); }
    public MemorySegment _pRegionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pRegions, index), LAYOUT_pRegions); }
    public MemorySegment _pRegions() { return _pRegionsAt(0L); }
    public VkOpticalFlowExecuteInfoNV _pRegionsAt(long index, MemorySegment src) { _pRegionsAt(index).copyFrom(src); return this; }
    public VkOpticalFlowExecuteInfoNV _pRegions(MemorySegment src) { return _pRegionsAt(0L, src); }
}
