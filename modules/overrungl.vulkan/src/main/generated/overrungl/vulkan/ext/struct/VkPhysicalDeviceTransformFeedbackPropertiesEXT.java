// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTransformFeedbackPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxTransformFeedbackStreams;
///     uint32_t maxTransformFeedbackBuffers;
///     VkDeviceSize maxTransformFeedbackBufferSize;
///     uint32_t maxTransformFeedbackStreamDataSize;
///     uint32_t maxTransformFeedbackBufferDataSize;
///     uint32_t maxTransformFeedbackBufferDataStride;
///     VkBool32 transformFeedbackQueries;
///     VkBool32 transformFeedbackStreamsLinesTriangles;
///     VkBool32 transformFeedbackRasterizationStreamSelect;
///     VkBool32 transformFeedbackDraw;
/// }
/// ```
public final class VkPhysicalDeviceTransformFeedbackPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreams"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBuffers"),
        ValueLayout.JAVA_LONG.withName("maxTransformFeedbackBufferSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreamDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataStride"),
        ValueLayout.JAVA_INT.withName("transformFeedbackQueries"),
        ValueLayout.JAVA_INT.withName("transformFeedbackStreamsLinesTriangles"),
        ValueLayout.JAVA_INT.withName("transformFeedbackRasterizationStreamSelect"),
        ValueLayout.JAVA_INT.withName("transformFeedbackDraw")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxTransformFeedbackStreams = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackStreams"));
    public static final long OFFSET_maxTransformFeedbackBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBuffers"));
    public static final long OFFSET_maxTransformFeedbackBufferSize = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    public static final long OFFSET_maxTransformFeedbackStreamDataSize = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    public static final long OFFSET_maxTransformFeedbackBufferDataSize = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    public static final long OFFSET_maxTransformFeedbackBufferDataStride = LAYOUT.byteOffset(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    public static final long OFFSET_transformFeedbackQueries = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackQueries"));
    public static final long OFFSET_transformFeedbackStreamsLinesTriangles = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    public static final long OFFSET_transformFeedbackRasterizationStreamSelect = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    public static final long OFFSET_transformFeedbackDraw = LAYOUT.byteOffset(PathElement.groupElement("transformFeedbackDraw"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxTransformFeedbackStreams = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackStreams"));
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBuffers = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBuffers"));
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBufferSize = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    public static final MemoryLayout LAYOUT_maxTransformFeedbackStreamDataSize = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBufferDataSize = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    public static final MemoryLayout LAYOUT_maxTransformFeedbackBufferDataStride = LAYOUT.select(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    public static final MemoryLayout LAYOUT_transformFeedbackQueries = LAYOUT.select(PathElement.groupElement("transformFeedbackQueries"));
    public static final MemoryLayout LAYOUT_transformFeedbackStreamsLinesTriangles = LAYOUT.select(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    public static final MemoryLayout LAYOUT_transformFeedbackRasterizationStreamSelect = LAYOUT.select(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    public static final MemoryLayout LAYOUT_transformFeedbackDraw = LAYOUT.select(PathElement.groupElement("transformFeedbackDraw"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxTransformFeedbackStreams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackStreams"));
    public static final VarHandle VH_maxTransformFeedbackBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBuffers"));
    public static final VarHandle VH_maxTransformFeedbackBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferSize"));
    public static final VarHandle VH_maxTransformFeedbackStreamDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackStreamDataSize"));
    public static final VarHandle VH_maxTransformFeedbackBufferDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferDataSize"));
    public static final VarHandle VH_maxTransformFeedbackBufferDataStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTransformFeedbackBufferDataStride"));
    public static final VarHandle VH_transformFeedbackQueries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackQueries"));
    public static final VarHandle VH_transformFeedbackStreamsLinesTriangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackStreamsLinesTriangles"));
    public static final VarHandle VH_transformFeedbackRasterizationStreamSelect = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackRasterizationStreamSelect"));
    public static final VarHandle VH_transformFeedbackDraw = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedbackDraw"));

    public VkPhysicalDeviceTransformFeedbackPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT); }
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT copyFrom(VkPhysicalDeviceTransformFeedbackPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT at(long index, Consumer<VkPhysicalDeviceTransformFeedbackPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxTransformFeedbackStreamsAt(long index) { return (int) VH_maxTransformFeedbackStreams.get(this.segment(), 0L, index); }
    public int maxTransformFeedbackBuffersAt(long index) { return (int) VH_maxTransformFeedbackBuffers.get(this.segment(), 0L, index); }
    public long maxTransformFeedbackBufferSizeAt(long index) { return (long) VH_maxTransformFeedbackBufferSize.get(this.segment(), 0L, index); }
    public int maxTransformFeedbackStreamDataSizeAt(long index) { return (int) VH_maxTransformFeedbackStreamDataSize.get(this.segment(), 0L, index); }
    public int maxTransformFeedbackBufferDataSizeAt(long index) { return (int) VH_maxTransformFeedbackBufferDataSize.get(this.segment(), 0L, index); }
    public int maxTransformFeedbackBufferDataStrideAt(long index) { return (int) VH_maxTransformFeedbackBufferDataStride.get(this.segment(), 0L, index); }
    public int transformFeedbackQueriesAt(long index) { return (int) VH_transformFeedbackQueries.get(this.segment(), 0L, index); }
    public int transformFeedbackStreamsLinesTrianglesAt(long index) { return (int) VH_transformFeedbackStreamsLinesTriangles.get(this.segment(), 0L, index); }
    public int transformFeedbackRasterizationStreamSelectAt(long index) { return (int) VH_transformFeedbackRasterizationStreamSelect.get(this.segment(), 0L, index); }
    public int transformFeedbackDrawAt(long index) { return (int) VH_transformFeedbackDraw.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxTransformFeedbackStreams() { return (int) VH_maxTransformFeedbackStreams.get(this.segment(), 0L, 0L); }
    public int maxTransformFeedbackBuffers() { return (int) VH_maxTransformFeedbackBuffers.get(this.segment(), 0L, 0L); }
    public long maxTransformFeedbackBufferSize() { return (long) VH_maxTransformFeedbackBufferSize.get(this.segment(), 0L, 0L); }
    public int maxTransformFeedbackStreamDataSize() { return (int) VH_maxTransformFeedbackStreamDataSize.get(this.segment(), 0L, 0L); }
    public int maxTransformFeedbackBufferDataSize() { return (int) VH_maxTransformFeedbackBufferDataSize.get(this.segment(), 0L, 0L); }
    public int maxTransformFeedbackBufferDataStride() { return (int) VH_maxTransformFeedbackBufferDataStride.get(this.segment(), 0L, 0L); }
    public int transformFeedbackQueries() { return (int) VH_transformFeedbackQueries.get(this.segment(), 0L, 0L); }
    public int transformFeedbackStreamsLinesTriangles() { return (int) VH_transformFeedbackStreamsLinesTriangles.get(this.segment(), 0L, 0L); }
    public int transformFeedbackRasterizationStreamSelect() { return (int) VH_transformFeedbackRasterizationStreamSelect.get(this.segment(), 0L, 0L); }
    public int transformFeedbackDraw() { return (int) VH_transformFeedbackDraw.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamsAt(long index, int value) { VH_maxTransformFeedbackStreams.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffersAt(long index, int value) { VH_maxTransformFeedbackBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSizeAt(long index, long value) { VH_maxTransformFeedbackBufferSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSizeAt(long index, int value) { VH_maxTransformFeedbackStreamDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSizeAt(long index, int value) { VH_maxTransformFeedbackBufferDataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStrideAt(long index, int value) { VH_maxTransformFeedbackBufferDataStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueriesAt(long index, int value) { VH_transformFeedbackQueries.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTrianglesAt(long index, int value) { VH_transformFeedbackStreamsLinesTriangles.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelectAt(long index, int value) { VH_transformFeedbackRasterizationStreamSelect.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDrawAt(long index, int value) { VH_transformFeedbackDraw.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreams(int value) { VH_maxTransformFeedbackStreams.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBuffers(int value) { VH_maxTransformFeedbackBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferSize(long value) { VH_maxTransformFeedbackBufferSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackStreamDataSize(int value) { VH_maxTransformFeedbackStreamDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataSize(int value) { VH_maxTransformFeedbackBufferDataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT maxTransformFeedbackBufferDataStride(int value) { VH_maxTransformFeedbackBufferDataStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackQueries(int value) { VH_transformFeedbackQueries.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackStreamsLinesTriangles(int value) { VH_transformFeedbackStreamsLinesTriangles.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackRasterizationStreamSelect(int value) { VH_transformFeedbackRasterizationStreamSelect.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT transformFeedbackDraw(int value) { VH_transformFeedbackDraw.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxTransformFeedbackStreamsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTransformFeedbackStreams, index), LAYOUT_maxTransformFeedbackStreams); }
    public MemorySegment _maxTransformFeedbackStreams() { return _maxTransformFeedbackStreamsAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackStreamsAt(long index, MemorySegment src) { _maxTransformFeedbackStreamsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackStreams(MemorySegment src) { return _maxTransformFeedbackStreamsAt(0L, src); }
    public MemorySegment _maxTransformFeedbackBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTransformFeedbackBuffers, index), LAYOUT_maxTransformFeedbackBuffers); }
    public MemorySegment _maxTransformFeedbackBuffers() { return _maxTransformFeedbackBuffersAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBuffersAt(long index, MemorySegment src) { _maxTransformFeedbackBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBuffers(MemorySegment src) { return _maxTransformFeedbackBuffersAt(0L, src); }
    public MemorySegment _maxTransformFeedbackBufferSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTransformFeedbackBufferSize, index), LAYOUT_maxTransformFeedbackBufferSize); }
    public MemorySegment _maxTransformFeedbackBufferSize() { return _maxTransformFeedbackBufferSizeAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBufferSizeAt(long index, MemorySegment src) { _maxTransformFeedbackBufferSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBufferSize(MemorySegment src) { return _maxTransformFeedbackBufferSizeAt(0L, src); }
    public MemorySegment _maxTransformFeedbackStreamDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTransformFeedbackStreamDataSize, index), LAYOUT_maxTransformFeedbackStreamDataSize); }
    public MemorySegment _maxTransformFeedbackStreamDataSize() { return _maxTransformFeedbackStreamDataSizeAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackStreamDataSizeAt(long index, MemorySegment src) { _maxTransformFeedbackStreamDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackStreamDataSize(MemorySegment src) { return _maxTransformFeedbackStreamDataSizeAt(0L, src); }
    public MemorySegment _maxTransformFeedbackBufferDataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTransformFeedbackBufferDataSize, index), LAYOUT_maxTransformFeedbackBufferDataSize); }
    public MemorySegment _maxTransformFeedbackBufferDataSize() { return _maxTransformFeedbackBufferDataSizeAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBufferDataSizeAt(long index, MemorySegment src) { _maxTransformFeedbackBufferDataSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBufferDataSize(MemorySegment src) { return _maxTransformFeedbackBufferDataSizeAt(0L, src); }
    public MemorySegment _maxTransformFeedbackBufferDataStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTransformFeedbackBufferDataStride, index), LAYOUT_maxTransformFeedbackBufferDataStride); }
    public MemorySegment _maxTransformFeedbackBufferDataStride() { return _maxTransformFeedbackBufferDataStrideAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBufferDataStrideAt(long index, MemorySegment src) { _maxTransformFeedbackBufferDataStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _maxTransformFeedbackBufferDataStride(MemorySegment src) { return _maxTransformFeedbackBufferDataStrideAt(0L, src); }
    public MemorySegment _transformFeedbackQueriesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedbackQueries, index), LAYOUT_transformFeedbackQueries); }
    public MemorySegment _transformFeedbackQueries() { return _transformFeedbackQueriesAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackQueriesAt(long index, MemorySegment src) { _transformFeedbackQueriesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackQueries(MemorySegment src) { return _transformFeedbackQueriesAt(0L, src); }
    public MemorySegment _transformFeedbackStreamsLinesTrianglesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedbackStreamsLinesTriangles, index), LAYOUT_transformFeedbackStreamsLinesTriangles); }
    public MemorySegment _transformFeedbackStreamsLinesTriangles() { return _transformFeedbackStreamsLinesTrianglesAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackStreamsLinesTrianglesAt(long index, MemorySegment src) { _transformFeedbackStreamsLinesTrianglesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackStreamsLinesTriangles(MemorySegment src) { return _transformFeedbackStreamsLinesTrianglesAt(0L, src); }
    public MemorySegment _transformFeedbackRasterizationStreamSelectAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedbackRasterizationStreamSelect, index), LAYOUT_transformFeedbackRasterizationStreamSelect); }
    public MemorySegment _transformFeedbackRasterizationStreamSelect() { return _transformFeedbackRasterizationStreamSelectAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackRasterizationStreamSelectAt(long index, MemorySegment src) { _transformFeedbackRasterizationStreamSelectAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackRasterizationStreamSelect(MemorySegment src) { return _transformFeedbackRasterizationStreamSelectAt(0L, src); }
    public MemorySegment _transformFeedbackDrawAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_transformFeedbackDraw, index), LAYOUT_transformFeedbackDraw); }
    public MemorySegment _transformFeedbackDraw() { return _transformFeedbackDrawAt(0L); }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackDrawAt(long index, MemorySegment src) { _transformFeedbackDrawAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTransformFeedbackPropertiesEXT _transformFeedbackDraw(MemorySegment src) { return _transformFeedbackDrawAt(0L, src); }
}
