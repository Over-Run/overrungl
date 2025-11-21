// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelinePropertyQueryResultARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelinePropertyQueryResultARM {
///     VkStructureType sType;
///     const void* pNext;
///     VkDataGraphPipelinePropertyARM property;
///     VkBool32 isText;
///     size_t dataSize;
///     void* pData;
/// }
/// ```
public final class VkDataGraphPipelinePropertyQueryResultARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("property"),
        ValueLayout.JAVA_INT.withName("isText"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_property = LAYOUT.byteOffset(PathElement.groupElement("property"));
    public static final long OFFSET_isText = LAYOUT.byteOffset(PathElement.groupElement("isText"));
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_property = LAYOUT.select(PathElement.groupElement("property"));
    public static final MemoryLayout LAYOUT_isText = LAYOUT.select(PathElement.groupElement("isText"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_property = LAYOUT.arrayElementVarHandle(PathElement.groupElement("property"));
    public static final VarHandle VH_isText = LAYOUT.arrayElementVarHandle(PathElement.groupElement("isText"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkDataGraphPipelinePropertyQueryResultARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDataGraphPipelinePropertyQueryResultARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelinePropertyQueryResultARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDataGraphPipelinePropertyQueryResultARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelinePropertyQueryResultARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDataGraphPipelinePropertyQueryResultARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelinePropertyQueryResultARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDataGraphPipelinePropertyQueryResultARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelinePropertyQueryResultARM(allocator.allocate(LAYOUT), 1); }
    public static VkDataGraphPipelinePropertyQueryResultARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelinePropertyQueryResultARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM); }
    public static VkDataGraphPipelinePropertyQueryResultARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_PROPERTY_QUERY_RESULT_ARM);
        return s;
    }
    public VkDataGraphPipelinePropertyQueryResultARM copyFrom(VkDataGraphPipelinePropertyQueryResultARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM reinterpret(long count) { return new VkDataGraphPipelinePropertyQueryResultARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDataGraphPipelinePropertyQueryResultARM asSlice(long index) { return new VkDataGraphPipelinePropertyQueryResultARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDataGraphPipelinePropertyQueryResultARM asSlice(long index, long count) { return new VkDataGraphPipelinePropertyQueryResultARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDataGraphPipelinePropertyQueryResultARM at(long index, Consumer<VkDataGraphPipelinePropertyQueryResultARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int propertyAt(long index) { return (int) VH_property.get(this.segment(), 0L, index); }
    public int isTextAt(long index) { return (int) VH_isText.get(this.segment(), 0L, index); }
    public long dataSizeAt(long index) { return (long) VH_dataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int property() { return (int) VH_property.get(this.segment(), 0L, 0L); }
    public int isText() { return (int) VH_isText.get(this.segment(), 0L, 0L); }
    public long dataSize() { return (long) VH_dataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkDataGraphPipelinePropertyQueryResultARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM propertyAt(long index, int value) { VH_property.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM isTextAt(long index, int value) { VH_isText.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM dataSizeAt(long index, long value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM property(int value) { VH_property.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM isText(int value) { VH_isText.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM dataSize(long value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDataGraphPipelinePropertyQueryResultARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDataGraphPipelinePropertyQueryResultARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _propertyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_property, index), LAYOUT_property); }
    public MemorySegment _property() { return _propertyAt(0L); }
    public VkDataGraphPipelinePropertyQueryResultARM _propertyAt(long index, MemorySegment src) { _propertyAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM _property(MemorySegment src) { return _propertyAt(0L, src); }
    public MemorySegment _isTextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_isText, index), LAYOUT_isText); }
    public MemorySegment _isText() { return _isTextAt(0L); }
    public VkDataGraphPipelinePropertyQueryResultARM _isTextAt(long index, MemorySegment src) { _isTextAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM _isText(MemorySegment src) { return _isTextAt(0L, src); }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkDataGraphPipelinePropertyQueryResultARM _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkDataGraphPipelinePropertyQueryResultARM _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkDataGraphPipelinePropertyQueryResultARM _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
