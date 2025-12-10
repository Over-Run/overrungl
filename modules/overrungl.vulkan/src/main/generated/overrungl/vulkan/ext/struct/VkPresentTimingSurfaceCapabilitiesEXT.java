// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentTimingSurfaceCapabilitiesEXT`.
/// ## Layout
/// ```
/// struct VkPresentTimingSurfaceCapabilitiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 presentTimingSupported;
///     VkBool32 presentAtAbsoluteTimeSupported;
///     VkBool32 presentAtRelativeTimeSupported;
///     VkPresentStageFlagsEXT presentStageQueries;
/// }
/// ```
public final class VkPresentTimingSurfaceCapabilitiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentTimingSupported"),
        ValueLayout.JAVA_INT.withName("presentAtAbsoluteTimeSupported"),
        ValueLayout.JAVA_INT.withName("presentAtRelativeTimeSupported"),
        ValueLayout.JAVA_INT.withName("presentStageQueries")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentTimingSupported = LAYOUT.byteOffset(PathElement.groupElement("presentTimingSupported"));
    public static final long OFFSET_presentAtAbsoluteTimeSupported = LAYOUT.byteOffset(PathElement.groupElement("presentAtAbsoluteTimeSupported"));
    public static final long OFFSET_presentAtRelativeTimeSupported = LAYOUT.byteOffset(PathElement.groupElement("presentAtRelativeTimeSupported"));
    public static final long OFFSET_presentStageQueries = LAYOUT.byteOffset(PathElement.groupElement("presentStageQueries"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentTimingSupported = LAYOUT.select(PathElement.groupElement("presentTimingSupported"));
    public static final MemoryLayout LAYOUT_presentAtAbsoluteTimeSupported = LAYOUT.select(PathElement.groupElement("presentAtAbsoluteTimeSupported"));
    public static final MemoryLayout LAYOUT_presentAtRelativeTimeSupported = LAYOUT.select(PathElement.groupElement("presentAtRelativeTimeSupported"));
    public static final MemoryLayout LAYOUT_presentStageQueries = LAYOUT.select(PathElement.groupElement("presentStageQueries"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentTimingSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentTimingSupported"));
    public static final VarHandle VH_presentAtAbsoluteTimeSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentAtAbsoluteTimeSupported"));
    public static final VarHandle VH_presentAtRelativeTimeSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentAtRelativeTimeSupported"));
    public static final VarHandle VH_presentStageQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStageQueries"));

    public VkPresentTimingSurfaceCapabilitiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPresentTimingSurfaceCapabilitiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimingSurfaceCapabilitiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPresentTimingSurfaceCapabilitiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimingSurfaceCapabilitiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPresentTimingSurfaceCapabilitiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimingSurfaceCapabilitiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPresentTimingSurfaceCapabilitiesEXT alloc(SegmentAllocator allocator) { return new VkPresentTimingSurfaceCapabilitiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPresentTimingSurfaceCapabilitiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPresentTimingSurfaceCapabilitiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPresentTimingSurfaceCapabilitiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT); }
    public static VkPresentTimingSurfaceCapabilitiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMING_SURFACE_CAPABILITIES_EXT);
        return s;
    }
    public VkPresentTimingSurfaceCapabilitiesEXT copyFrom(VkPresentTimingSurfaceCapabilitiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT reinterpret(long count) { return new VkPresentTimingSurfaceCapabilitiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPresentTimingSurfaceCapabilitiesEXT asSlice(long index) { return new VkPresentTimingSurfaceCapabilitiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPresentTimingSurfaceCapabilitiesEXT asSlice(long index, long count) { return new VkPresentTimingSurfaceCapabilitiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPresentTimingSurfaceCapabilitiesEXT at(long index, Consumer<VkPresentTimingSurfaceCapabilitiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int presentTimingSupportedAt(long index) { return (int) VH_presentTimingSupported.get(this.segment(), 0L, index); }
    public int presentAtAbsoluteTimeSupportedAt(long index) { return (int) VH_presentAtAbsoluteTimeSupported.get(this.segment(), 0L, index); }
    public int presentAtRelativeTimeSupportedAt(long index) { return (int) VH_presentAtRelativeTimeSupported.get(this.segment(), 0L, index); }
    public int presentStageQueriesAt(long index) { return (int) VH_presentStageQueries.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int presentTimingSupported() { return (int) VH_presentTimingSupported.get(this.segment(), 0L, 0L); }
    public int presentAtAbsoluteTimeSupported() { return (int) VH_presentAtAbsoluteTimeSupported.get(this.segment(), 0L, 0L); }
    public int presentAtRelativeTimeSupported() { return (int) VH_presentAtRelativeTimeSupported.get(this.segment(), 0L, 0L); }
    public int presentStageQueries() { return (int) VH_presentStageQueries.get(this.segment(), 0L, 0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentTimingSupportedAt(long index, int value) { VH_presentTimingSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtAbsoluteTimeSupportedAt(long index, int value) { VH_presentAtAbsoluteTimeSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtRelativeTimeSupportedAt(long index, int value) { VH_presentAtRelativeTimeSupported.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentStageQueriesAt(long index, int value) { VH_presentStageQueries.set(this.segment(), 0L, index, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentTimingSupported(int value) { VH_presentTimingSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtAbsoluteTimeSupported(int value) { VH_presentAtAbsoluteTimeSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentAtRelativeTimeSupported(int value) { VH_presentAtRelativeTimeSupported.set(this.segment(), 0L, 0L, value); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT presentStageQueries(int value) { VH_presentStageQueries.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentTimingSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentTimingSupported, index), LAYOUT_presentTimingSupported); }
    public MemorySegment _presentTimingSupported() { return _presentTimingSupportedAt(0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentTimingSupportedAt(long index, MemorySegment src) { _presentTimingSupportedAt(index).copyFrom(src); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentTimingSupported(MemorySegment src) { return _presentTimingSupportedAt(0L, src); }
    public MemorySegment _presentAtAbsoluteTimeSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentAtAbsoluteTimeSupported, index), LAYOUT_presentAtAbsoluteTimeSupported); }
    public MemorySegment _presentAtAbsoluteTimeSupported() { return _presentAtAbsoluteTimeSupportedAt(0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentAtAbsoluteTimeSupportedAt(long index, MemorySegment src) { _presentAtAbsoluteTimeSupportedAt(index).copyFrom(src); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentAtAbsoluteTimeSupported(MemorySegment src) { return _presentAtAbsoluteTimeSupportedAt(0L, src); }
    public MemorySegment _presentAtRelativeTimeSupportedAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentAtRelativeTimeSupported, index), LAYOUT_presentAtRelativeTimeSupported); }
    public MemorySegment _presentAtRelativeTimeSupported() { return _presentAtRelativeTimeSupportedAt(0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentAtRelativeTimeSupportedAt(long index, MemorySegment src) { _presentAtRelativeTimeSupportedAt(index).copyFrom(src); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentAtRelativeTimeSupported(MemorySegment src) { return _presentAtRelativeTimeSupportedAt(0L, src); }
    public MemorySegment _presentStageQueriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentStageQueries, index), LAYOUT_presentStageQueries); }
    public MemorySegment _presentStageQueries() { return _presentStageQueriesAt(0L); }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentStageQueriesAt(long index, MemorySegment src) { _presentStageQueriesAt(index).copyFrom(src); return this; }
    public VkPresentTimingSurfaceCapabilitiesEXT _presentStageQueries(MemorySegment src) { return _presentStageQueriesAt(0L, src); }
}
