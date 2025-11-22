// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkLatencyTimingsFrameReportNV`.
/// ## Layout
/// ```
/// struct VkLatencyTimingsFrameReportNV {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t presentID;
///     uint64_t inputSampleTimeUs;
///     uint64_t simStartTimeUs;
///     uint64_t simEndTimeUs;
///     uint64_t renderSubmitStartTimeUs;
///     uint64_t renderSubmitEndTimeUs;
///     uint64_t presentStartTimeUs;
///     uint64_t presentEndTimeUs;
///     uint64_t driverStartTimeUs;
///     uint64_t driverEndTimeUs;
///     uint64_t osRenderQueueStartTimeUs;
///     uint64_t osRenderQueueEndTimeUs;
///     uint64_t gpuRenderStartTimeUs;
///     uint64_t gpuRenderEndTimeUs;
/// }
/// ```
public final class VkLatencyTimingsFrameReportNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("inputSampleTimeUs"),
        ValueLayout.JAVA_LONG.withName("simStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("simEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("renderSubmitStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("renderSubmitEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("presentStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("presentEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("driverStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("driverEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("osRenderQueueStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("osRenderQueueEndTimeUs"),
        ValueLayout.JAVA_LONG.withName("gpuRenderStartTimeUs"),
        ValueLayout.JAVA_LONG.withName("gpuRenderEndTimeUs")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_presentID = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
    public static final long OFFSET_inputSampleTimeUs = LAYOUT.byteOffset(PathElement.groupElement("inputSampleTimeUs"));
    public static final long OFFSET_simStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("simStartTimeUs"));
    public static final long OFFSET_simEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("simEndTimeUs"));
    public static final long OFFSET_renderSubmitStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("renderSubmitStartTimeUs"));
    public static final long OFFSET_renderSubmitEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("renderSubmitEndTimeUs"));
    public static final long OFFSET_presentStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("presentStartTimeUs"));
    public static final long OFFSET_presentEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("presentEndTimeUs"));
    public static final long OFFSET_driverStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("driverStartTimeUs"));
    public static final long OFFSET_driverEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("driverEndTimeUs"));
    public static final long OFFSET_osRenderQueueStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("osRenderQueueStartTimeUs"));
    public static final long OFFSET_osRenderQueueEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("osRenderQueueEndTimeUs"));
    public static final long OFFSET_gpuRenderStartTimeUs = LAYOUT.byteOffset(PathElement.groupElement("gpuRenderStartTimeUs"));
    public static final long OFFSET_gpuRenderEndTimeUs = LAYOUT.byteOffset(PathElement.groupElement("gpuRenderEndTimeUs"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_presentID = LAYOUT.select(PathElement.groupElement("presentID"));
    public static final MemoryLayout LAYOUT_inputSampleTimeUs = LAYOUT.select(PathElement.groupElement("inputSampleTimeUs"));
    public static final MemoryLayout LAYOUT_simStartTimeUs = LAYOUT.select(PathElement.groupElement("simStartTimeUs"));
    public static final MemoryLayout LAYOUT_simEndTimeUs = LAYOUT.select(PathElement.groupElement("simEndTimeUs"));
    public static final MemoryLayout LAYOUT_renderSubmitStartTimeUs = LAYOUT.select(PathElement.groupElement("renderSubmitStartTimeUs"));
    public static final MemoryLayout LAYOUT_renderSubmitEndTimeUs = LAYOUT.select(PathElement.groupElement("renderSubmitEndTimeUs"));
    public static final MemoryLayout LAYOUT_presentStartTimeUs = LAYOUT.select(PathElement.groupElement("presentStartTimeUs"));
    public static final MemoryLayout LAYOUT_presentEndTimeUs = LAYOUT.select(PathElement.groupElement("presentEndTimeUs"));
    public static final MemoryLayout LAYOUT_driverStartTimeUs = LAYOUT.select(PathElement.groupElement("driverStartTimeUs"));
    public static final MemoryLayout LAYOUT_driverEndTimeUs = LAYOUT.select(PathElement.groupElement("driverEndTimeUs"));
    public static final MemoryLayout LAYOUT_osRenderQueueStartTimeUs = LAYOUT.select(PathElement.groupElement("osRenderQueueStartTimeUs"));
    public static final MemoryLayout LAYOUT_osRenderQueueEndTimeUs = LAYOUT.select(PathElement.groupElement("osRenderQueueEndTimeUs"));
    public static final MemoryLayout LAYOUT_gpuRenderStartTimeUs = LAYOUT.select(PathElement.groupElement("gpuRenderStartTimeUs"));
    public static final MemoryLayout LAYOUT_gpuRenderEndTimeUs = LAYOUT.select(PathElement.groupElement("gpuRenderEndTimeUs"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    public static final VarHandle VH_inputSampleTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("inputSampleTimeUs"));
    public static final VarHandle VH_simStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simStartTimeUs"));
    public static final VarHandle VH_simEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("simEndTimeUs"));
    public static final VarHandle VH_renderSubmitStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderSubmitStartTimeUs"));
    public static final VarHandle VH_renderSubmitEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderSubmitEndTimeUs"));
    public static final VarHandle VH_presentStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentStartTimeUs"));
    public static final VarHandle VH_presentEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentEndTimeUs"));
    public static final VarHandle VH_driverStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverStartTimeUs"));
    public static final VarHandle VH_driverEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverEndTimeUs"));
    public static final VarHandle VH_osRenderQueueStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("osRenderQueueStartTimeUs"));
    public static final VarHandle VH_osRenderQueueEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("osRenderQueueEndTimeUs"));
    public static final VarHandle VH_gpuRenderStartTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpuRenderStartTimeUs"));
    public static final VarHandle VH_gpuRenderEndTimeUs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gpuRenderEndTimeUs"));

    public VkLatencyTimingsFrameReportNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkLatencyTimingsFrameReportNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkLatencyTimingsFrameReportNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkLatencyTimingsFrameReportNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencyTimingsFrameReportNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkLatencyTimingsFrameReportNV alloc(SegmentAllocator allocator) { return new VkLatencyTimingsFrameReportNV(allocator.allocate(LAYOUT), 1); }
    public static VkLatencyTimingsFrameReportNV alloc(SegmentAllocator allocator, long count) { return new VkLatencyTimingsFrameReportNV(allocator.allocate(LAYOUT, count), count); }
    public static VkLatencyTimingsFrameReportNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV); }
    public static VkLatencyTimingsFrameReportNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV);
        return s;
    }
    public VkLatencyTimingsFrameReportNV copyFrom(VkLatencyTimingsFrameReportNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkLatencyTimingsFrameReportNV reinterpret(long count) { return new VkLatencyTimingsFrameReportNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkLatencyTimingsFrameReportNV asSlice(long index) { return new VkLatencyTimingsFrameReportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkLatencyTimingsFrameReportNV asSlice(long index, long count) { return new VkLatencyTimingsFrameReportNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkLatencyTimingsFrameReportNV at(long index, Consumer<VkLatencyTimingsFrameReportNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long presentIDAt(long index) { return (long) VH_presentID.get(this.segment(), 0L, index); }
    public long inputSampleTimeUsAt(long index) { return (long) VH_inputSampleTimeUs.get(this.segment(), 0L, index); }
    public long simStartTimeUsAt(long index) { return (long) VH_simStartTimeUs.get(this.segment(), 0L, index); }
    public long simEndTimeUsAt(long index) { return (long) VH_simEndTimeUs.get(this.segment(), 0L, index); }
    public long renderSubmitStartTimeUsAt(long index) { return (long) VH_renderSubmitStartTimeUs.get(this.segment(), 0L, index); }
    public long renderSubmitEndTimeUsAt(long index) { return (long) VH_renderSubmitEndTimeUs.get(this.segment(), 0L, index); }
    public long presentStartTimeUsAt(long index) { return (long) VH_presentStartTimeUs.get(this.segment(), 0L, index); }
    public long presentEndTimeUsAt(long index) { return (long) VH_presentEndTimeUs.get(this.segment(), 0L, index); }
    public long driverStartTimeUsAt(long index) { return (long) VH_driverStartTimeUs.get(this.segment(), 0L, index); }
    public long driverEndTimeUsAt(long index) { return (long) VH_driverEndTimeUs.get(this.segment(), 0L, index); }
    public long osRenderQueueStartTimeUsAt(long index) { return (long) VH_osRenderQueueStartTimeUs.get(this.segment(), 0L, index); }
    public long osRenderQueueEndTimeUsAt(long index) { return (long) VH_osRenderQueueEndTimeUs.get(this.segment(), 0L, index); }
    public long gpuRenderStartTimeUsAt(long index) { return (long) VH_gpuRenderStartTimeUs.get(this.segment(), 0L, index); }
    public long gpuRenderEndTimeUsAt(long index) { return (long) VH_gpuRenderEndTimeUs.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long presentID() { return (long) VH_presentID.get(this.segment(), 0L, 0L); }
    public long inputSampleTimeUs() { return (long) VH_inputSampleTimeUs.get(this.segment(), 0L, 0L); }
    public long simStartTimeUs() { return (long) VH_simStartTimeUs.get(this.segment(), 0L, 0L); }
    public long simEndTimeUs() { return (long) VH_simEndTimeUs.get(this.segment(), 0L, 0L); }
    public long renderSubmitStartTimeUs() { return (long) VH_renderSubmitStartTimeUs.get(this.segment(), 0L, 0L); }
    public long renderSubmitEndTimeUs() { return (long) VH_renderSubmitEndTimeUs.get(this.segment(), 0L, 0L); }
    public long presentStartTimeUs() { return (long) VH_presentStartTimeUs.get(this.segment(), 0L, 0L); }
    public long presentEndTimeUs() { return (long) VH_presentEndTimeUs.get(this.segment(), 0L, 0L); }
    public long driverStartTimeUs() { return (long) VH_driverStartTimeUs.get(this.segment(), 0L, 0L); }
    public long driverEndTimeUs() { return (long) VH_driverEndTimeUs.get(this.segment(), 0L, 0L); }
    public long osRenderQueueStartTimeUs() { return (long) VH_osRenderQueueStartTimeUs.get(this.segment(), 0L, 0L); }
    public long osRenderQueueEndTimeUs() { return (long) VH_osRenderQueueEndTimeUs.get(this.segment(), 0L, 0L); }
    public long gpuRenderStartTimeUs() { return (long) VH_gpuRenderStartTimeUs.get(this.segment(), 0L, 0L); }
    public long gpuRenderEndTimeUs() { return (long) VH_gpuRenderEndTimeUs.get(this.segment(), 0L, 0L); }
    public VkLatencyTimingsFrameReportNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV presentIDAt(long index, long value) { VH_presentID.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV inputSampleTimeUsAt(long index, long value) { VH_inputSampleTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV simStartTimeUsAt(long index, long value) { VH_simStartTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV simEndTimeUsAt(long index, long value) { VH_simEndTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV renderSubmitStartTimeUsAt(long index, long value) { VH_renderSubmitStartTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV renderSubmitEndTimeUsAt(long index, long value) { VH_renderSubmitEndTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV presentStartTimeUsAt(long index, long value) { VH_presentStartTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV presentEndTimeUsAt(long index, long value) { VH_presentEndTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV driverStartTimeUsAt(long index, long value) { VH_driverStartTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV driverEndTimeUsAt(long index, long value) { VH_driverEndTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV osRenderQueueStartTimeUsAt(long index, long value) { VH_osRenderQueueStartTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV osRenderQueueEndTimeUsAt(long index, long value) { VH_osRenderQueueEndTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV gpuRenderStartTimeUsAt(long index, long value) { VH_gpuRenderStartTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV gpuRenderEndTimeUsAt(long index, long value) { VH_gpuRenderEndTimeUs.set(this.segment(), 0L, index, value); return this; }
    public VkLatencyTimingsFrameReportNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV presentID(long value) { VH_presentID.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV inputSampleTimeUs(long value) { VH_inputSampleTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV simStartTimeUs(long value) { VH_simStartTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV simEndTimeUs(long value) { VH_simEndTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV renderSubmitStartTimeUs(long value) { VH_renderSubmitStartTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV renderSubmitEndTimeUs(long value) { VH_renderSubmitEndTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV presentStartTimeUs(long value) { VH_presentStartTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV presentEndTimeUs(long value) { VH_presentEndTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV driverStartTimeUs(long value) { VH_driverStartTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV driverEndTimeUs(long value) { VH_driverEndTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV osRenderQueueStartTimeUs(long value) { VH_osRenderQueueStartTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV osRenderQueueEndTimeUs(long value) { VH_osRenderQueueEndTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV gpuRenderStartTimeUs(long value) { VH_gpuRenderStartTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public VkLatencyTimingsFrameReportNV gpuRenderEndTimeUs(long value) { VH_gpuRenderEndTimeUs.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkLatencyTimingsFrameReportNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkLatencyTimingsFrameReportNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _presentIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentID, index), LAYOUT_presentID); }
    public MemorySegment _presentID() { return _presentIDAt(0L); }
    public VkLatencyTimingsFrameReportNV _presentIDAt(long index, MemorySegment src) { _presentIDAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _presentID(MemorySegment src) { return _presentIDAt(0L, src); }
    public MemorySegment _inputSampleTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_inputSampleTimeUs, index), LAYOUT_inputSampleTimeUs); }
    public MemorySegment _inputSampleTimeUs() { return _inputSampleTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _inputSampleTimeUsAt(long index, MemorySegment src) { _inputSampleTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _inputSampleTimeUs(MemorySegment src) { return _inputSampleTimeUsAt(0L, src); }
    public MemorySegment _simStartTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_simStartTimeUs, index), LAYOUT_simStartTimeUs); }
    public MemorySegment _simStartTimeUs() { return _simStartTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _simStartTimeUsAt(long index, MemorySegment src) { _simStartTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _simStartTimeUs(MemorySegment src) { return _simStartTimeUsAt(0L, src); }
    public MemorySegment _simEndTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_simEndTimeUs, index), LAYOUT_simEndTimeUs); }
    public MemorySegment _simEndTimeUs() { return _simEndTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _simEndTimeUsAt(long index, MemorySegment src) { _simEndTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _simEndTimeUs(MemorySegment src) { return _simEndTimeUsAt(0L, src); }
    public MemorySegment _renderSubmitStartTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderSubmitStartTimeUs, index), LAYOUT_renderSubmitStartTimeUs); }
    public MemorySegment _renderSubmitStartTimeUs() { return _renderSubmitStartTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _renderSubmitStartTimeUsAt(long index, MemorySegment src) { _renderSubmitStartTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _renderSubmitStartTimeUs(MemorySegment src) { return _renderSubmitStartTimeUsAt(0L, src); }
    public MemorySegment _renderSubmitEndTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderSubmitEndTimeUs, index), LAYOUT_renderSubmitEndTimeUs); }
    public MemorySegment _renderSubmitEndTimeUs() { return _renderSubmitEndTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _renderSubmitEndTimeUsAt(long index, MemorySegment src) { _renderSubmitEndTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _renderSubmitEndTimeUs(MemorySegment src) { return _renderSubmitEndTimeUsAt(0L, src); }
    public MemorySegment _presentStartTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentStartTimeUs, index), LAYOUT_presentStartTimeUs); }
    public MemorySegment _presentStartTimeUs() { return _presentStartTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _presentStartTimeUsAt(long index, MemorySegment src) { _presentStartTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _presentStartTimeUs(MemorySegment src) { return _presentStartTimeUsAt(0L, src); }
    public MemorySegment _presentEndTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_presentEndTimeUs, index), LAYOUT_presentEndTimeUs); }
    public MemorySegment _presentEndTimeUs() { return _presentEndTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _presentEndTimeUsAt(long index, MemorySegment src) { _presentEndTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _presentEndTimeUs(MemorySegment src) { return _presentEndTimeUsAt(0L, src); }
    public MemorySegment _driverStartTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverStartTimeUs, index), LAYOUT_driverStartTimeUs); }
    public MemorySegment _driverStartTimeUs() { return _driverStartTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _driverStartTimeUsAt(long index, MemorySegment src) { _driverStartTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _driverStartTimeUs(MemorySegment src) { return _driverStartTimeUsAt(0L, src); }
    public MemorySegment _driverEndTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverEndTimeUs, index), LAYOUT_driverEndTimeUs); }
    public MemorySegment _driverEndTimeUs() { return _driverEndTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _driverEndTimeUsAt(long index, MemorySegment src) { _driverEndTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _driverEndTimeUs(MemorySegment src) { return _driverEndTimeUsAt(0L, src); }
    public MemorySegment _osRenderQueueStartTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_osRenderQueueStartTimeUs, index), LAYOUT_osRenderQueueStartTimeUs); }
    public MemorySegment _osRenderQueueStartTimeUs() { return _osRenderQueueStartTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _osRenderQueueStartTimeUsAt(long index, MemorySegment src) { _osRenderQueueStartTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _osRenderQueueStartTimeUs(MemorySegment src) { return _osRenderQueueStartTimeUsAt(0L, src); }
    public MemorySegment _osRenderQueueEndTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_osRenderQueueEndTimeUs, index), LAYOUT_osRenderQueueEndTimeUs); }
    public MemorySegment _osRenderQueueEndTimeUs() { return _osRenderQueueEndTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _osRenderQueueEndTimeUsAt(long index, MemorySegment src) { _osRenderQueueEndTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _osRenderQueueEndTimeUs(MemorySegment src) { return _osRenderQueueEndTimeUsAt(0L, src); }
    public MemorySegment _gpuRenderStartTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gpuRenderStartTimeUs, index), LAYOUT_gpuRenderStartTimeUs); }
    public MemorySegment _gpuRenderStartTimeUs() { return _gpuRenderStartTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _gpuRenderStartTimeUsAt(long index, MemorySegment src) { _gpuRenderStartTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _gpuRenderStartTimeUs(MemorySegment src) { return _gpuRenderStartTimeUsAt(0L, src); }
    public MemorySegment _gpuRenderEndTimeUsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_gpuRenderEndTimeUs, index), LAYOUT_gpuRenderEndTimeUs); }
    public MemorySegment _gpuRenderEndTimeUs() { return _gpuRenderEndTimeUsAt(0L); }
    public VkLatencyTimingsFrameReportNV _gpuRenderEndTimeUsAt(long index, MemorySegment src) { _gpuRenderEndTimeUsAt(index).copyFrom(src); return this; }
    public VkLatencyTimingsFrameReportNV _gpuRenderEndTimeUs(MemorySegment src) { return _gpuRenderEndTimeUsAt(0L, src); }
}
