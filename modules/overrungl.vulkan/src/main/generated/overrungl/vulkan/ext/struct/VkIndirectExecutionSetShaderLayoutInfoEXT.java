// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectExecutionSetShaderLayoutInfoEXT`.
/// ## Layout
/// ```
/// struct VkIndirectExecutionSetShaderLayoutInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout* pSetLayouts;
/// }
/// ```
public final class VkIndirectExecutionSetShaderLayoutInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_setLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_setLayoutCount = LAYOUT.select(PathElement.groupElement("setLayoutCount"));
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));

    public VkIndirectExecutionSetShaderLayoutInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT); }
    public static VkIndirectExecutionSetShaderLayoutInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT);
        return s;
    }
    public VkIndirectExecutionSetShaderLayoutInfoEXT copyFrom(VkIndirectExecutionSetShaderLayoutInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT asSlice(long index) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetShaderLayoutInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT at(long index, Consumer<VkIndirectExecutionSetShaderLayoutInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int setLayoutCountAt(long index) { return (int) VH_setLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pSetLayoutsAt(long index) { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int setLayoutCount() { return (int) VH_setLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetLayouts() { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, 0L); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCountAt(long index, int value) { VH_setLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayoutsAt(long index, MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCount(int value) { VH_setLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayouts(MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _setLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_setLayoutCount, index), LAYOUT_setLayoutCount); }
    public MemorySegment _setLayoutCount() { return _setLayoutCountAt(0L); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _setLayoutCountAt(long index, MemorySegment src) { _setLayoutCountAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _setLayoutCount(MemorySegment src) { return _setLayoutCountAt(0L, src); }
    public MemorySegment _pSetLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetLayouts, index), LAYOUT_pSetLayouts); }
    public MemorySegment _pSetLayouts() { return _pSetLayoutsAt(0L); }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _pSetLayoutsAt(long index, MemorySegment src) { _pSetLayoutsAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderLayoutInfoEXT _pSetLayouts(MemorySegment src) { return _pSetLayoutsAt(0L, src); }
}
