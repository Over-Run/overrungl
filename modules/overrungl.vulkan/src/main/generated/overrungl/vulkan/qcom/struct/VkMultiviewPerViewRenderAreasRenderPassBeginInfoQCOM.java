// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM`.
/// ## Layout
/// ```
/// struct VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t perViewRenderAreaCount;
///     const VkRect2D* pPerViewRenderAreas;
/// }
/// ```
public final class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewRenderAreaCount"),
        ValueLayout.ADDRESS.withName("pPerViewRenderAreas")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_perViewRenderAreaCount = LAYOUT.byteOffset(PathElement.groupElement("perViewRenderAreaCount"));
    public static final long OFFSET_pPerViewRenderAreas = LAYOUT.byteOffset(PathElement.groupElement("pPerViewRenderAreas"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_perViewRenderAreaCount = LAYOUT.select(PathElement.groupElement("perViewRenderAreaCount"));
    public static final MemoryLayout LAYOUT_pPerViewRenderAreas = LAYOUT.select(PathElement.groupElement("pPerViewRenderAreas"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_perViewRenderAreaCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewRenderAreaCount"));
    public static final VarHandle VH_pPerViewRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPerViewRenderAreas"));

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM alloc(SegmentAllocator allocator) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM); }
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
        return s;
    }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM copyFrom(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM reinterpret(long count) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM asSlice(long index) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM asSlice(long index, long count) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM at(long index, Consumer<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int perViewRenderAreaCountAt(long index) { return (int) VH_perViewRenderAreaCount.get(this.segment(), 0L, index); }
    public MemorySegment pPerViewRenderAreasAt(long index) { return (MemorySegment) VH_pPerViewRenderAreas.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int perViewRenderAreaCount() { return (int) VH_perViewRenderAreaCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPerViewRenderAreas() { return (MemorySegment) VH_pPerViewRenderAreas.get(this.segment(), 0L, 0L); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM perViewRenderAreaCountAt(long index, int value) { VH_perViewRenderAreaCount.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreasAt(long index, MemorySegment value) { VH_pPerViewRenderAreas.set(this.segment(), 0L, index, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM perViewRenderAreaCount(int value) { VH_perViewRenderAreaCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreas(MemorySegment value) { VH_pPerViewRenderAreas.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _perViewRenderAreaCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_perViewRenderAreaCount, index), LAYOUT_perViewRenderAreaCount); }
    public MemorySegment _perViewRenderAreaCount() { return _perViewRenderAreaCountAt(0L); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _perViewRenderAreaCountAt(long index, MemorySegment src) { _perViewRenderAreaCountAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _perViewRenderAreaCount(MemorySegment src) { return _perViewRenderAreaCountAt(0L, src); }
    public MemorySegment _pPerViewRenderAreasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPerViewRenderAreas, index), LAYOUT_pPerViewRenderAreas); }
    public MemorySegment _pPerViewRenderAreas() { return _pPerViewRenderAreasAt(0L); }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _pPerViewRenderAreasAt(long index, MemorySegment src) { _pPerViewRenderAreasAt(index).copyFrom(src); return this; }
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM _pPerViewRenderAreas(MemorySegment src) { return _pPerViewRenderAreasAt(0L, src); }
}
