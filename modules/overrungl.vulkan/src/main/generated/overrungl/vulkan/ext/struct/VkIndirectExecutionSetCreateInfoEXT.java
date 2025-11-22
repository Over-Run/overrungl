// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectExecutionSetCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkIndirectExecutionSetCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectExecutionSetInfoTypeEXT type;
///     VkIndirectExecutionSetInfoEXT info;
/// }
/// ```
public final class VkIndirectExecutionSetCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.ext.union.VkIndirectExecutionSetInfoEXT.LAYOUT.withName("info")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_info = LAYOUT.byteOffset(PathElement.groupElement("info"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_info = LAYOUT.select(PathElement.groupElement("info"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_info$pPipelineInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("pPipelineInfo"));
    public static final VarHandle VH_info$pShaderInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("info"), PathElement.groupElement("pShaderInfo"));

    public VkIndirectExecutionSetCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectExecutionSetCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectExecutionSetCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectExecutionSetCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectExecutionSetCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectExecutionSetCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectExecutionSetCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT); }
    public static VkIndirectExecutionSetCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT);
        return s;
    }
    public VkIndirectExecutionSetCreateInfoEXT copyFrom(VkIndirectExecutionSetCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectExecutionSetCreateInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectExecutionSetCreateInfoEXT asSlice(long index) { return new VkIndirectExecutionSetCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectExecutionSetCreateInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectExecutionSetCreateInfoEXT at(long index, Consumer<VkIndirectExecutionSetCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public MemorySegment info$pPipelineInfoAt(long index) { return (MemorySegment) VH_info$pPipelineInfo.get(this.segment(), 0L, index); }
    public MemorySegment info$pShaderInfoAt(long index) { return (MemorySegment) VH_info$pShaderInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public MemorySegment info$pPipelineInfo() { return (MemorySegment) VH_info$pPipelineInfo.get(this.segment(), 0L, 0L); }
    public MemorySegment info$pShaderInfo() { return (MemorySegment) VH_info$pShaderInfo.get(this.segment(), 0L, 0L); }
    public VkIndirectExecutionSetCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT info$pPipelineInfoAt(long index, MemorySegment value) { VH_info$pPipelineInfo.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT info$pShaderInfoAt(long index, MemorySegment value) { VH_info$pShaderInfo.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT info$pPipelineInfo(MemorySegment value) { VH_info$pPipelineInfo.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetCreateInfoEXT info$pShaderInfo(MemorySegment value) { VH_info$pShaderInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectExecutionSetCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectExecutionSetCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkIndirectExecutionSetCreateInfoEXT _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetCreateInfoEXT _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _infoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_info, index), LAYOUT_info); }
    public MemorySegment _info() { return _infoAt(0L); }
    public VkIndirectExecutionSetCreateInfoEXT _infoAt(long index, MemorySegment src) { _infoAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetCreateInfoEXT _info(MemorySegment src) { return _infoAt(0L, src); }
}
