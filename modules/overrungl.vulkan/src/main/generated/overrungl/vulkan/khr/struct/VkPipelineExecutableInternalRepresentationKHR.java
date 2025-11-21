// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineExecutableInternalRepresentationKHR`.
/// ## Layout
/// ```
/// struct VkPipelineExecutableInternalRepresentationKHR {
///     VkStructureType sType;
///     void* pNext;
///     char name[VK_MAX_DESCRIPTION_SIZE];
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     VkBool32 isText;
///     size_t dataSize;
///     void* pData;
/// }
/// ```
public final class VkPipelineExecutableInternalRepresentationKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("isText"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_isText = LAYOUT.byteOffset(PathElement.groupElement("isText"));
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_isText = LAYOUT.select(PathElement.groupElement("isText"));
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_isText = LAYOUT.arrayElementVarHandle(PathElement.groupElement("isText"));
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    public VkPipelineExecutableInternalRepresentationKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineExecutableInternalRepresentationKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInternalRepresentationKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineExecutableInternalRepresentationKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInternalRepresentationKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineExecutableInternalRepresentationKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineExecutableInternalRepresentationKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineExecutableInternalRepresentationKHR alloc(SegmentAllocator allocator) { return new VkPipelineExecutableInternalRepresentationKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineExecutableInternalRepresentationKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineExecutableInternalRepresentationKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineExecutableInternalRepresentationKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR); }
    public static VkPipelineExecutableInternalRepresentationKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
        return s;
    }
    public VkPipelineExecutableInternalRepresentationKHR copyFrom(VkPipelineExecutableInternalRepresentationKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineExecutableInternalRepresentationKHR reinterpret(long count) { return new VkPipelineExecutableInternalRepresentationKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineExecutableInternalRepresentationKHR asSlice(long index) { return new VkPipelineExecutableInternalRepresentationKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineExecutableInternalRepresentationKHR asSlice(long index, long count) { return new VkPipelineExecutableInternalRepresentationKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineExecutableInternalRepresentationKHR at(long index, Consumer<VkPipelineExecutableInternalRepresentationKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public int isTextAt(long index) { return (int) VH_isText.get(this.segment(), 0L, index); }
    public long dataSizeAt(long index) { return (long) VH_dataSize.get(this.segment(), 0L, index); }
    public MemorySegment pDataAt(long index) { return (MemorySegment) VH_pData.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public int isText() { return (int) VH_isText.get(this.segment(), 0L, 0L); }
    public long dataSize() { return (long) VH_dataSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pData() { return (MemorySegment) VH_pData.get(this.segment(), 0L, 0L); }
    public VkPipelineExecutableInternalRepresentationKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR isTextAt(long index, int value) { VH_isText.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR dataSizeAt(long index, long value) { VH_dataSize.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR pDataAt(long index, MemorySegment value) { VH_pData.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR isText(int value) { VH_isText.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR dataSize(long value) { VH_dataSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineExecutableInternalRepresentationKHR pData(MemorySegment value) { VH_pData.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _name(MemorySegment src) { return _nameAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _isTextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_isText, index), LAYOUT_isText); }
    public MemorySegment _isText() { return _isTextAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _isTextAt(long index, MemorySegment src) { _isTextAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _isText(MemorySegment src) { return _isTextAt(0L, src); }
    public MemorySegment _dataSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dataSize, index), LAYOUT_dataSize); }
    public MemorySegment _dataSize() { return _dataSizeAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _dataSizeAt(long index, MemorySegment src) { _dataSizeAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _dataSize(MemorySegment src) { return _dataSizeAt(0L, src); }
    public MemorySegment _pDataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pData, index), LAYOUT_pData); }
    public MemorySegment _pData() { return _pDataAt(0L); }
    public VkPipelineExecutableInternalRepresentationKHR _pDataAt(long index, MemorySegment src) { _pDataAt(index).copyFrom(src); return this; }
    public VkPipelineExecutableInternalRepresentationKHR _pData(MemorySegment src) { return _pDataAt(0L, src); }
}
