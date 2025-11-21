// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.union;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectExecutionSetInfoEXT`.
/// ## Layout
/// ```
/// union VkIndirectExecutionSetInfoEXT {
///     const VkIndirectExecutionSetPipelineInfoEXT* pPipelineInfo;
///     const VkIndirectExecutionSetShaderInfoEXT* pShaderInfo;
/// }
/// ```
public final class VkIndirectExecutionSetInfoEXT extends GroupType {
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        ValueLayout.ADDRESS.withName("pPipelineInfo"),
        ValueLayout.ADDRESS.withName("pShaderInfo")
    );
    public static final long OFFSET_pPipelineInfo = LAYOUT.byteOffset(PathElement.groupElement("pPipelineInfo"));
    public static final long OFFSET_pShaderInfo = LAYOUT.byteOffset(PathElement.groupElement("pShaderInfo"));
    public static final MemoryLayout LAYOUT_pPipelineInfo = LAYOUT.select(PathElement.groupElement("pPipelineInfo"));
    public static final MemoryLayout LAYOUT_pShaderInfo = LAYOUT.select(PathElement.groupElement("pShaderInfo"));
    public static final VarHandle VH_pPipelineInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineInfo"));
    public static final VarHandle VH_pShaderInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaderInfo"));

    public VkIndirectExecutionSetInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectExecutionSetInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectExecutionSetInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectExecutionSetInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public VkIndirectExecutionSetInfoEXT copyFrom(VkIndirectExecutionSetInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectExecutionSetInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectExecutionSetInfoEXT asSlice(long index) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectExecutionSetInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectExecutionSetInfoEXT at(long index, Consumer<VkIndirectExecutionSetInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public MemorySegment pPipelineInfoAt(long index) { return (MemorySegment) VH_pPipelineInfo.get(this.segment(), 0L, index); }
    public MemorySegment pShaderInfoAt(long index) { return (MemorySegment) VH_pShaderInfo.get(this.segment(), 0L, index); }
    public MemorySegment pPipelineInfo() { return (MemorySegment) VH_pPipelineInfo.get(this.segment(), 0L, 0L); }
    public MemorySegment pShaderInfo() { return (MemorySegment) VH_pShaderInfo.get(this.segment(), 0L, 0L); }
    public VkIndirectExecutionSetInfoEXT pPipelineInfoAt(long index, MemorySegment value) { VH_pPipelineInfo.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetInfoEXT pShaderInfoAt(long index, MemorySegment value) { VH_pShaderInfo.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetInfoEXT pPipelineInfo(MemorySegment value) { VH_pPipelineInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetInfoEXT pShaderInfo(MemorySegment value) { VH_pShaderInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _pPipelineInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPipelineInfo, index), LAYOUT_pPipelineInfo); }
    public MemorySegment _pPipelineInfo() { return _pPipelineInfoAt(0L); }
    public VkIndirectExecutionSetInfoEXT _pPipelineInfoAt(long index, MemorySegment src) { _pPipelineInfoAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetInfoEXT _pPipelineInfo(MemorySegment src) { return _pPipelineInfoAt(0L, src); }
    public MemorySegment _pShaderInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pShaderInfo, index), LAYOUT_pShaderInfo); }
    public MemorySegment _pShaderInfo() { return _pShaderInfoAt(0L); }
    public VkIndirectExecutionSetInfoEXT _pShaderInfoAt(long index, MemorySegment src) { _pShaderInfoAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetInfoEXT _pShaderInfo(MemorySegment src) { return _pShaderInfoAt(0L, src); }
}
