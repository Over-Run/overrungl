// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsLayoutTokenEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutTokenEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectCommandsTokenTypeEXT type;
///     VkIndirectCommandsTokenDataEXT data;
///     uint32_t offset;
/// }
/// ```
public final class VkIndirectCommandsLayoutTokenEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.ext.union.VkIndirectCommandsTokenDataEXT.LAYOUT.withName("data"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_data$pPushConstant = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pPushConstant"));
    public static final VarHandle VH_data$pVertexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pVertexBuffer"));
    public static final VarHandle VH_data$pIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pIndexBuffer"));
    public static final VarHandle VH_data$pExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"), PathElement.groupElement("pExecutionSet"));
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    public VkIndirectCommandsLayoutTokenEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsLayoutTokenEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsLayoutTokenEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsLayoutTokenEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsLayoutTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutTokenEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsLayoutTokenEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutTokenEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectCommandsLayoutTokenEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT); }
    public static VkIndirectCommandsLayoutTokenEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT);
        return s;
    }
    public VkIndirectCommandsLayoutTokenEXT copyFrom(VkIndirectCommandsLayoutTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsLayoutTokenEXT reinterpret(long count) { return new VkIndirectCommandsLayoutTokenEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsLayoutTokenEXT asSlice(long index) { return new VkIndirectCommandsLayoutTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsLayoutTokenEXT asSlice(long index, long count) { return new VkIndirectCommandsLayoutTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsLayoutTokenEXT at(long index, Consumer<VkIndirectCommandsLayoutTokenEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public MemorySegment data$pPushConstantAt(long index) { return (MemorySegment) VH_data$pPushConstant.get(this.segment(), 0L, index); }
    public MemorySegment data$pVertexBufferAt(long index) { return (MemorySegment) VH_data$pVertexBuffer.get(this.segment(), 0L, index); }
    public MemorySegment data$pIndexBufferAt(long index) { return (MemorySegment) VH_data$pIndexBuffer.get(this.segment(), 0L, index); }
    public MemorySegment data$pExecutionSetAt(long index) { return (MemorySegment) VH_data$pExecutionSet.get(this.segment(), 0L, index); }
    public int offsetAt(long index) { return (int) VH_offset.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pPushConstant() { return (MemorySegment) VH_data$pPushConstant.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pVertexBuffer() { return (MemorySegment) VH_data$pVertexBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pIndexBuffer() { return (MemorySegment) VH_data$pIndexBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment data$pExecutionSet() { return (MemorySegment) VH_data$pExecutionSet.get(this.segment(), 0L, 0L); }
    public int offset() { return (int) VH_offset.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsLayoutTokenEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pPushConstantAt(long index, MemorySegment value) { VH_data$pPushConstant.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pVertexBufferAt(long index, MemorySegment value) { VH_data$pVertexBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pIndexBufferAt(long index, MemorySegment value) { VH_data$pIndexBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pExecutionSetAt(long index, MemorySegment value) { VH_data$pExecutionSet.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT offsetAt(long index, int value) { VH_offset.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pPushConstant(MemorySegment value) { VH_data$pPushConstant.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pVertexBuffer(MemorySegment value) { VH_data$pVertexBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pIndexBuffer(MemorySegment value) { VH_data$pIndexBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT data$pExecutionSet(MemorySegment value) { VH_data$pExecutionSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutTokenEXT offset(int value) { VH_offset.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectCommandsLayoutTokenEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectCommandsLayoutTokenEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkIndirectCommandsLayoutTokenEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _dataAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    public MemorySegment _data() { return _dataAt(0L); }
    public VkIndirectCommandsLayoutTokenEXT _dataAt(long index, MemorySegment src) { _dataAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenEXT _data(MemorySegment src) { return _dataAt(0L, src); }
    public MemorySegment _offsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_offset, index), LAYOUT_offset); }
    public MemorySegment _offset() { return _offsetAt(0L); }
    public VkIndirectCommandsLayoutTokenEXT _offsetAt(long index, MemorySegment src) { _offsetAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutTokenEXT _offset(MemorySegment src) { return _offsetAt(0L, src); }
}
