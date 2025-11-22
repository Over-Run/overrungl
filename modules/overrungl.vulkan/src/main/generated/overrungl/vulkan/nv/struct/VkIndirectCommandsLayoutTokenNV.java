// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsLayoutTokenNV`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutTokenNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectCommandsTokenTypeNV tokenType;
///     uint32_t stream;
///     uint32_t offset;
///     uint32_t vertexBindingUnit;
///     VkBool32 vertexDynamicStride;
///     VkPipelineLayout pushconstantPipelineLayout;
///     VkShaderStageFlags pushconstantShaderStageFlags;
///     uint32_t pushconstantOffset;
///     uint32_t pushconstantSize;
///     VkIndirectStateFlagsNV indirectStateFlags;
///     uint32_t indexTypeCount;
///     const VkIndexType* pIndexTypes;
///     const uint32_t* pIndexTypeValues;
/// }
/// ```
public final class VkIndirectCommandsLayoutTokenNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tokenType"),
        ValueLayout.JAVA_INT.withName("stream"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("vertexBindingUnit"),
        ValueLayout.JAVA_INT.withName("vertexDynamicStride"),
        ValueLayout.JAVA_LONG.withName("pushconstantPipelineLayout"),
        ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags"),
        ValueLayout.JAVA_INT.withName("pushconstantOffset"),
        ValueLayout.JAVA_INT.withName("pushconstantSize"),
        ValueLayout.JAVA_INT.withName("indirectStateFlags"),
        ValueLayout.JAVA_INT.withName("indexTypeCount"),
        ValueLayout.ADDRESS.withName("pIndexTypes"),
        ValueLayout.ADDRESS.withName("pIndexTypeValues")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_tokenType = LAYOUT.byteOffset(PathElement.groupElement("tokenType"));
    public static final long OFFSET_stream = LAYOUT.byteOffset(PathElement.groupElement("stream"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final long OFFSET_vertexBindingUnit = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingUnit"));
    public static final long OFFSET_vertexDynamicStride = LAYOUT.byteOffset(PathElement.groupElement("vertexDynamicStride"));
    public static final long OFFSET_pushconstantPipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("pushconstantPipelineLayout"));
    public static final long OFFSET_pushconstantShaderStageFlags = LAYOUT.byteOffset(PathElement.groupElement("pushconstantShaderStageFlags"));
    public static final long OFFSET_pushconstantOffset = LAYOUT.byteOffset(PathElement.groupElement("pushconstantOffset"));
    public static final long OFFSET_pushconstantSize = LAYOUT.byteOffset(PathElement.groupElement("pushconstantSize"));
    public static final long OFFSET_indirectStateFlags = LAYOUT.byteOffset(PathElement.groupElement("indirectStateFlags"));
    public static final long OFFSET_indexTypeCount = LAYOUT.byteOffset(PathElement.groupElement("indexTypeCount"));
    public static final long OFFSET_pIndexTypes = LAYOUT.byteOffset(PathElement.groupElement("pIndexTypes"));
    public static final long OFFSET_pIndexTypeValues = LAYOUT.byteOffset(PathElement.groupElement("pIndexTypeValues"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_tokenType = LAYOUT.select(PathElement.groupElement("tokenType"));
    public static final MemoryLayout LAYOUT_stream = LAYOUT.select(PathElement.groupElement("stream"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_vertexBindingUnit = LAYOUT.select(PathElement.groupElement("vertexBindingUnit"));
    public static final MemoryLayout LAYOUT_vertexDynamicStride = LAYOUT.select(PathElement.groupElement("vertexDynamicStride"));
    public static final MemoryLayout LAYOUT_pushconstantPipelineLayout = LAYOUT.select(PathElement.groupElement("pushconstantPipelineLayout"));
    public static final MemoryLayout LAYOUT_pushconstantShaderStageFlags = LAYOUT.select(PathElement.groupElement("pushconstantShaderStageFlags"));
    public static final MemoryLayout LAYOUT_pushconstantOffset = LAYOUT.select(PathElement.groupElement("pushconstantOffset"));
    public static final MemoryLayout LAYOUT_pushconstantSize = LAYOUT.select(PathElement.groupElement("pushconstantSize"));
    public static final MemoryLayout LAYOUT_indirectStateFlags = LAYOUT.select(PathElement.groupElement("indirectStateFlags"));
    public static final MemoryLayout LAYOUT_indexTypeCount = LAYOUT.select(PathElement.groupElement("indexTypeCount"));
    public static final MemoryLayout LAYOUT_pIndexTypes = LAYOUT.select(PathElement.groupElement("pIndexTypes"));
    public static final MemoryLayout LAYOUT_pIndexTypeValues = LAYOUT.select(PathElement.groupElement("pIndexTypeValues"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_tokenType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenType"));
    public static final VarHandle VH_stream = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stream"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    public static final VarHandle VH_vertexBindingUnit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingUnit"));
    public static final VarHandle VH_vertexDynamicStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexDynamicStride"));
    public static final VarHandle VH_pushconstantPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantPipelineLayout"));
    public static final VarHandle VH_pushconstantShaderStageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantShaderStageFlags"));
    public static final VarHandle VH_pushconstantOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantOffset"));
    public static final VarHandle VH_pushconstantSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantSize"));
    public static final VarHandle VH_indirectStateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectStateFlags"));
    public static final VarHandle VH_indexTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeCount"));
    public static final VarHandle VH_pIndexTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexTypes"));
    public static final VarHandle VH_pIndexTypeValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexTypeValues"));

    public VkIndirectCommandsLayoutTokenNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsLayoutTokenNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsLayoutTokenNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsLayoutTokenNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsLayoutTokenNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutTokenNV(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsLayoutTokenNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutTokenNV(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectCommandsLayoutTokenNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV); }
    public static VkIndirectCommandsLayoutTokenNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
        return s;
    }
    public VkIndirectCommandsLayoutTokenNV copyFrom(VkIndirectCommandsLayoutTokenNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsLayoutTokenNV reinterpret(long count) { return new VkIndirectCommandsLayoutTokenNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsLayoutTokenNV asSlice(long index) { return new VkIndirectCommandsLayoutTokenNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsLayoutTokenNV asSlice(long index, long count) { return new VkIndirectCommandsLayoutTokenNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsLayoutTokenNV at(long index, Consumer<VkIndirectCommandsLayoutTokenNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int tokenTypeAt(long index) { return (int) VH_tokenType.get(this.segment(), 0L, index); }
    public int streamAt(long index) { return (int) VH_stream.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public int vertexBindingUnitAt(long index) { return (int) VH_vertexBindingUnit.get(this.segment(), 0L, index); }
    public int vertexDynamicStrideAt(long index) { return (int) VH_vertexDynamicStride.get(this.segment(), 0L, index); }
    public long pushconstantPipelineLayoutAt(long index) { return (long) VH_pushconstantPipelineLayout.get(this.segment(), 0L, index); }
    public int pushconstantShaderStageFlagsAt(long index) { return (int) VH_pushconstantShaderStageFlags.get(this.segment(), 0L, index); }
    public int pushconstantOffsetAt(long index) { return (int) VH_pushconstantOffset.get(this.segment(), 0L, index); }
    public int pushconstantSizeAt(long index) { return (int) VH_pushconstantSize.get(this.segment(), 0L, index); }
    public int indirectStateFlagsAt(long index) { return (int) VH_indirectStateFlags.get(this.segment(), 0L, index); }
    public int indexTypeCountAt(long index) { return (int) VH_indexTypeCount.get(this.segment(), 0L, index); }
    public MemorySegment pIndexTypesAt(long index) { return (MemorySegment) VH_pIndexTypes.get(this.segment(), 0L, index); }
    public MemorySegment pIndexTypeValuesAt(long index) { return (MemorySegment) VH_pIndexTypeValues.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int tokenType() { return (int) VH_tokenType.get(this.segment(), 0L, 0L); }
    public int stream() { return (int) VH_stream.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public int vertexBindingUnit() { return (int) VH_vertexBindingUnit.get(this.segment(), 0L, 0L); }
    public int vertexDynamicStride() { return (int) VH_vertexDynamicStride.get(this.segment(), 0L, 0L); }
    public long pushconstantPipelineLayout() { return (long) VH_pushconstantPipelineLayout.get(this.segment(), 0L, 0L); }
    public int pushconstantShaderStageFlags() { return (int) VH_pushconstantShaderStageFlags.get(this.segment(), 0L, 0L); }
    public int pushconstantOffset() { return (int) VH_pushconstantOffset.get(this.segment(), 0L, 0L); }
    public int pushconstantSize() { return (int) VH_pushconstantSize.get(this.segment(), 0L, 0L); }
    public int indirectStateFlags() { return (int) VH_indirectStateFlags.get(this.segment(), 0L, 0L); }
    public int indexTypeCount() { return (int) VH_indexTypeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pIndexTypes() { return (MemorySegment) VH_pIndexTypes.get(this.segment(), 0L, 0L); }
    public MemorySegment pIndexTypeValues() { return (MemorySegment) VH_pIndexTypeValues.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsLayoutTokenNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV tokenTypeAt(long index, int value) { VH_tokenType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV streamAt(long index, int value) { VH_stream.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnitAt(long index, int value) { VH_vertexBindingUnit.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStrideAt(long index, int value) { VH_vertexDynamicStride.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayoutAt(long index, long value) { VH_pushconstantPipelineLayout.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlagsAt(long index, int value) { VH_pushconstantShaderStageFlags.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantOffsetAt(long index, int value) { VH_pushconstantOffset.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantSizeAt(long index, int value) { VH_pushconstantSize.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV indirectStateFlagsAt(long index, int value) { VH_indirectStateFlags.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV indexTypeCountAt(long index, int value) { VH_indexTypeCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pIndexTypesAt(long index, MemorySegment value) { VH_pIndexTypes.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValuesAt(long index, MemorySegment value) { VH_pIndexTypeValues.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV tokenType(int value) { VH_tokenType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV stream(int value) { VH_stream.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(int value) { VH_vertexBindingUnit.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(int value) { VH_vertexDynamicStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(long value) { VH_pushconstantPipelineLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(int value) { VH_pushconstantShaderStageFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(int value) { VH_pushconstantOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pushconstantSize(int value) { VH_pushconstantSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(int value) { VH_indirectStateFlags.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV indexTypeCount(int value) { VH_indexTypeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pIndexTypes(MemorySegment value) { VH_pIndexTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(MemorySegment value) { VH_pIndexTypeValues.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _tokenTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tokenType, index), LAYOUT_tokenType); }
    public MemorySegment _tokenType() { return _tokenTypeAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _tokenTypeAt(long index, MemorySegment src) { _tokenTypeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _tokenType(MemorySegment src) { return _tokenTypeAt(0L, src); }
    public MemorySegment _streamAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stream, index), LAYOUT_stream); }
    public MemorySegment _stream() { return _streamAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _streamAt(long index, MemorySegment src) { _streamAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _stream(MemorySegment src) { return _streamAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _offset(MemorySegment src) { return _offsetAt(0L, src); }
    public MemorySegment _vertexBindingUnitAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexBindingUnit, index), LAYOUT_vertexBindingUnit); }
    public MemorySegment _vertexBindingUnit() { return _vertexBindingUnitAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _vertexBindingUnitAt(long index, MemorySegment src) { _vertexBindingUnitAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _vertexBindingUnit(MemorySegment src) { return _vertexBindingUnitAt(0L, src); }
    public MemorySegment _vertexDynamicStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vertexDynamicStride, index), LAYOUT_vertexDynamicStride); }
    public MemorySegment _vertexDynamicStride() { return _vertexDynamicStrideAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _vertexDynamicStrideAt(long index, MemorySegment src) { _vertexDynamicStrideAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _vertexDynamicStride(MemorySegment src) { return _vertexDynamicStrideAt(0L, src); }
    public MemorySegment _pushconstantPipelineLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushconstantPipelineLayout, index), LAYOUT_pushconstantPipelineLayout); }
    public MemorySegment _pushconstantPipelineLayout() { return _pushconstantPipelineLayoutAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pushconstantPipelineLayoutAt(long index, MemorySegment src) { _pushconstantPipelineLayoutAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pushconstantPipelineLayout(MemorySegment src) { return _pushconstantPipelineLayoutAt(0L, src); }
    public MemorySegment _pushconstantShaderStageFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushconstantShaderStageFlags, index), LAYOUT_pushconstantShaderStageFlags); }
    public MemorySegment _pushconstantShaderStageFlags() { return _pushconstantShaderStageFlagsAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pushconstantShaderStageFlagsAt(long index, MemorySegment src) { _pushconstantShaderStageFlagsAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pushconstantShaderStageFlags(MemorySegment src) { return _pushconstantShaderStageFlagsAt(0L, src); }
    public MemorySegment _pushconstantOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushconstantOffset, index), LAYOUT_pushconstantOffset); }
    public MemorySegment _pushconstantOffset() { return _pushconstantOffsetAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pushconstantOffsetAt(long index, MemorySegment src) { _pushconstantOffsetAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pushconstantOffset(MemorySegment src) { return _pushconstantOffsetAt(0L, src); }
    public MemorySegment _pushconstantSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushconstantSize, index), LAYOUT_pushconstantSize); }
    public MemorySegment _pushconstantSize() { return _pushconstantSizeAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pushconstantSizeAt(long index, MemorySegment src) { _pushconstantSizeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pushconstantSize(MemorySegment src) { return _pushconstantSizeAt(0L, src); }
    public MemorySegment _indirectStateFlagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectStateFlags, index), LAYOUT_indirectStateFlags); }
    public MemorySegment _indirectStateFlags() { return _indirectStateFlagsAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _indirectStateFlagsAt(long index, MemorySegment src) { _indirectStateFlagsAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _indirectStateFlags(MemorySegment src) { return _indirectStateFlagsAt(0L, src); }
    public MemorySegment _indexTypeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indexTypeCount, index), LAYOUT_indexTypeCount); }
    public MemorySegment _indexTypeCount() { return _indexTypeCountAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _indexTypeCountAt(long index, MemorySegment src) { _indexTypeCountAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _indexTypeCount(MemorySegment src) { return _indexTypeCountAt(0L, src); }
    public MemorySegment _pIndexTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pIndexTypes, index), LAYOUT_pIndexTypes); }
    public MemorySegment _pIndexTypes() { return _pIndexTypesAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pIndexTypesAt(long index, MemorySegment src) { _pIndexTypesAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pIndexTypes(MemorySegment src) { return _pIndexTypesAt(0L, src); }
    public MemorySegment _pIndexTypeValuesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pIndexTypeValues, index), LAYOUT_pIndexTypeValues); }
    public MemorySegment _pIndexTypeValues() { return _pIndexTypeValuesAt(0L); }
    public VkIndirectCommandsLayoutTokenNV _pIndexTypeValuesAt(long index, MemorySegment src) { _pIndexTypeValuesAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenNV _pIndexTypeValues(MemorySegment src) { return _pIndexTypeValuesAt(0L, src); }
}
