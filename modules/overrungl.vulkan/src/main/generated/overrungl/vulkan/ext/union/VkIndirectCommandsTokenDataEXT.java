// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsTokenDataEXT`.
/// ## Layout
/// ```
/// union VkIndirectCommandsTokenDataEXT {
///     const VkIndirectCommandsPushConstantTokenEXT* pPushConstant;
///     const VkIndirectCommandsVertexBufferTokenEXT* pVertexBuffer;
///     const VkIndirectCommandsIndexBufferTokenEXT* pIndexBuffer;
///     const VkIndirectCommandsExecutionSetTokenEXT* pExecutionSet;
/// }
/// ```
public final class VkIndirectCommandsTokenDataEXT extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPushConstant"),
        ValueLayout.ADDRESS.withName("pVertexBuffer"),
        ValueLayout.ADDRESS.withName("pIndexBuffer"),
        ValueLayout.ADDRESS.withName("pExecutionSet")
    );
    public static final long OFFSET_pPushConstant = LAYOUT.byteOffset(PathElement.groupElement("pPushConstant"));
    public static final long OFFSET_pVertexBuffer = LAYOUT.byteOffset(PathElement.groupElement("pVertexBuffer"));
    public static final long OFFSET_pIndexBuffer = LAYOUT.byteOffset(PathElement.groupElement("pIndexBuffer"));
    public static final long OFFSET_pExecutionSet = LAYOUT.byteOffset(PathElement.groupElement("pExecutionSet"));
    public static final MemoryLayout LAYOUT_pPushConstant = LAYOUT.select(PathElement.groupElement("pPushConstant"));
    public static final MemoryLayout LAYOUT_pVertexBuffer = LAYOUT.select(PathElement.groupElement("pVertexBuffer"));
    public static final MemoryLayout LAYOUT_pIndexBuffer = LAYOUT.select(PathElement.groupElement("pIndexBuffer"));
    public static final MemoryLayout LAYOUT_pExecutionSet = LAYOUT.select(PathElement.groupElement("pExecutionSet"));
    public static final VarHandle VH_pPushConstant = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstant"));
    public static final VarHandle VH_pVertexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVertexBuffer"));
    public static final VarHandle VH_pIndexBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexBuffer"));
    public static final VarHandle VH_pExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExecutionSet"));

    public VkIndirectCommandsTokenDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsTokenDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsTokenDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsTokenDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsTokenDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsTokenDataEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsTokenDataEXT(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectCommandsTokenDataEXT copyFrom(VkIndirectCommandsTokenDataEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsTokenDataEXT reinterpret(long count) { return new VkIndirectCommandsTokenDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsTokenDataEXT asSlice(long index) { return new VkIndirectCommandsTokenDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsTokenDataEXT asSlice(long index, long count) { return new VkIndirectCommandsTokenDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsTokenDataEXT at(long index, Consumer<VkIndirectCommandsTokenDataEXT> func) { func.accept(asSlice(index)); return this; }
    public MemorySegment pPushConstantAt(long index) { return (MemorySegment) VH_pPushConstant.get(this.segment(), 0L, index); }
    public MemorySegment pVertexBufferAt(long index) { return (MemorySegment) VH_pVertexBuffer.get(this.segment(), 0L, index); }
    public MemorySegment pIndexBufferAt(long index) { return (MemorySegment) VH_pIndexBuffer.get(this.segment(), 0L, index); }
    public MemorySegment pExecutionSetAt(long index) { return (MemorySegment) VH_pExecutionSet.get(this.segment(), 0L, index); }
    public MemorySegment pPushConstant() { return (MemorySegment) VH_pPushConstant.get(this.segment(), 0L, 0L); }
    public MemorySegment pVertexBuffer() { return (MemorySegment) VH_pVertexBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment pIndexBuffer() { return (MemorySegment) VH_pIndexBuffer.get(this.segment(), 0L, 0L); }
    public MemorySegment pExecutionSet() { return (MemorySegment) VH_pExecutionSet.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsTokenDataEXT pPushConstantAt(long index, MemorySegment value) { VH_pPushConstant.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsTokenDataEXT pVertexBufferAt(long index, MemorySegment value) { VH_pVertexBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsTokenDataEXT pIndexBufferAt(long index, MemorySegment value) { VH_pIndexBuffer.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsTokenDataEXT pExecutionSetAt(long index, MemorySegment value) { VH_pExecutionSet.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsTokenDataEXT pPushConstant(MemorySegment value) { VH_pPushConstant.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsTokenDataEXT pVertexBuffer(MemorySegment value) { VH_pVertexBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsTokenDataEXT pIndexBuffer(MemorySegment value) { VH_pIndexBuffer.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsTokenDataEXT pExecutionSet(MemorySegment value) { VH_pExecutionSet.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pPushConstantAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPushConstant, index), LAYOUT_pPushConstant); }
    public MemorySegment _pPushConstant() { return _pPushConstantAt(0L); }
    public VkIndirectCommandsTokenDataEXT _pPushConstantAt(long index, MemorySegment src) { _pPushConstantAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsTokenDataEXT _pPushConstant(MemorySegment src) { return _pPushConstantAt(0L, src); }
    public MemorySegment _pVertexBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVertexBuffer, index), LAYOUT_pVertexBuffer); }
    public MemorySegment _pVertexBuffer() { return _pVertexBufferAt(0L); }
    public VkIndirectCommandsTokenDataEXT _pVertexBufferAt(long index, MemorySegment src) { _pVertexBufferAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsTokenDataEXT _pVertexBuffer(MemorySegment src) { return _pVertexBufferAt(0L, src); }
    public MemorySegment _pIndexBufferAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pIndexBuffer, index), LAYOUT_pIndexBuffer); }
    public MemorySegment _pIndexBuffer() { return _pIndexBufferAt(0L); }
    public VkIndirectCommandsTokenDataEXT _pIndexBufferAt(long index, MemorySegment src) { _pIndexBufferAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsTokenDataEXT _pIndexBuffer(MemorySegment src) { return _pIndexBufferAt(0L, src); }
    public MemorySegment _pExecutionSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pExecutionSet, index), LAYOUT_pExecutionSet); }
    public MemorySegment _pExecutionSet() { return _pExecutionSetAt(0L); }
    public VkIndirectCommandsTokenDataEXT _pExecutionSetAt(long index, MemorySegment src) { _pExecutionSetAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsTokenDataEXT _pExecutionSet(MemorySegment src) { return _pExecutionSetAt(0L, src); }
}
