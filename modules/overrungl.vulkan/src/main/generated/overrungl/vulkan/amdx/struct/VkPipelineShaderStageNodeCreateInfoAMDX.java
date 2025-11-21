// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineShaderStageNodeCreateInfoAMDX`.
/// ## Layout
/// ```
/// struct VkPipelineShaderStageNodeCreateInfoAMDX {
///      VkStructureType sType;
///     const void* pNext;
///     const char* pName;
///     uint32_t index;
/// }
/// ```
public final class VkPipelineShaderStageNodeCreateInfoAMDX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.JAVA_INT.withName("index")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    public static final long OFFSET_index = LAYOUT.byteOffset(PathElement.groupElement("index"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    public static final MemoryLayout LAYOUT_index = LAYOUT.select(PathElement.groupElement("index"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    public static final VarHandle VH_index = LAYOUT.arrayElementVarHandle(PathElement.groupElement("index"));

    public VkPipelineShaderStageNodeCreateInfoAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment, estimateCount(segment, LAYOUT)); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageNodeCreateInfoAMDX(allocator.allocate(LAYOUT), 1); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(allocator.allocate(LAYOUT, count), count); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX); }
    public static VkPipelineShaderStageNodeCreateInfoAMDX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.amdx.VKAMDXShaderEnqueue.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX);
        return s;
    }
    public VkPipelineShaderStageNodeCreateInfoAMDX copyFrom(VkPipelineShaderStageNodeCreateInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX reinterpret(long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPipelineShaderStageNodeCreateInfoAMDX asSlice(long index) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPipelineShaderStageNodeCreateInfoAMDX asSlice(long index, long count) { return new VkPipelineShaderStageNodeCreateInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPipelineShaderStageNodeCreateInfoAMDX at(long index, Consumer<VkPipelineShaderStageNodeCreateInfoAMDX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public MemorySegment pNameAt(long index) { return (MemorySegment) VH_pName.get(this.segment(), 0L, index); }
    public int indexAt(long index) { return (int) VH_index.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public MemorySegment pName() { return (MemorySegment) VH_pName.get(this.segment(), 0L, 0L); }
    public int index() { return (int) VH_index.get(this.segment(), 0L, 0L); }
    public VkPipelineShaderStageNodeCreateInfoAMDX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX pNameAt(long index, MemorySegment value) { VH_pName.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX indexAt(long index, int value) { VH_index.set(this.segment(), 0L, index, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX pName(MemorySegment value) { VH_pName.set(this.segment(), 0L, 0L, value); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX index(int value) { VH_index.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPipelineShaderStageNodeCreateInfoAMDX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPipelineShaderStageNodeCreateInfoAMDX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pName, index), LAYOUT_pName); }
    public MemorySegment _pName() { return _pNameAt(0L); }
    public VkPipelineShaderStageNodeCreateInfoAMDX _pNameAt(long index, MemorySegment src) { _pNameAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX _pName(MemorySegment src) { return _pNameAt(0L, src); }
    public MemorySegment _indexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_index, index), LAYOUT_index); }
    public MemorySegment _index() { return _indexAt(0L); }
    public VkPipelineShaderStageNodeCreateInfoAMDX _indexAt(long index, MemorySegment src) { _indexAt(index).copyFrom(src); return this; }
    public VkPipelineShaderStageNodeCreateInfoAMDX _index(MemorySegment src) { return _indexAt(0L, src); }
}
