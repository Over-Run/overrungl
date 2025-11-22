// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectExecutionSetShaderInfoEXT`.
/// ## Layout
/// ```
/// struct VkIndirectExecutionSetShaderInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t shaderCount;
///     const VkShaderEXT* pInitialShaders;
///     const VkIndirectExecutionSetShaderLayoutInfoEXT* pSetLayoutInfos;
///     uint32_t maxShaderCount;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange* pPushConstantRanges;
/// }
/// ```
public final class VkIndirectExecutionSetShaderInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withName("pInitialShaders"),
        ValueLayout.ADDRESS.withName("pSetLayoutInfos"),
        ValueLayout.JAVA_INT.withName("maxShaderCount"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCount"));
    public static final long OFFSET_pInitialShaders = LAYOUT.byteOffset(PathElement.groupElement("pInitialShaders"));
    public static final long OFFSET_pSetLayoutInfos = LAYOUT.byteOffset(PathElement.groupElement("pSetLayoutInfos"));
    public static final long OFFSET_maxShaderCount = LAYOUT.byteOffset(PathElement.groupElement("maxShaderCount"));
    public static final long OFFSET_pushConstantRangeCount = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
    public static final long OFFSET_pPushConstantRanges = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderCount = LAYOUT.select(PathElement.groupElement("shaderCount"));
    public static final MemoryLayout LAYOUT_pInitialShaders = LAYOUT.select(PathElement.groupElement("pInitialShaders"));
    public static final MemoryLayout LAYOUT_pSetLayoutInfos = LAYOUT.select(PathElement.groupElement("pSetLayoutInfos"));
    public static final MemoryLayout LAYOUT_maxShaderCount = LAYOUT.select(PathElement.groupElement("maxShaderCount"));
    public static final MemoryLayout LAYOUT_pushConstantRangeCount = LAYOUT.select(PathElement.groupElement("pushConstantRangeCount"));
    public static final MemoryLayout LAYOUT_pPushConstantRanges = LAYOUT.select(PathElement.groupElement("pPushConstantRanges"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCount"));
    public static final VarHandle VH_pInitialShaders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialShaders"));
    public static final VarHandle VH_pSetLayoutInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayoutInfos"));
    public static final VarHandle VH_maxShaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderCount"));
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));

    public VkIndirectExecutionSetShaderInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectExecutionSetShaderInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectExecutionSetShaderInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectExecutionSetShaderInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectExecutionSetShaderInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectExecutionSetShaderInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetShaderInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectExecutionSetShaderInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetShaderInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectExecutionSetShaderInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT); }
    public static VkIndirectExecutionSetShaderInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT);
        return s;
    }
    public VkIndirectExecutionSetShaderInfoEXT copyFrom(VkIndirectExecutionSetShaderInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectExecutionSetShaderInfoEXT reinterpret(long count) { return new VkIndirectExecutionSetShaderInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectExecutionSetShaderInfoEXT asSlice(long index) { return new VkIndirectExecutionSetShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectExecutionSetShaderInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectExecutionSetShaderInfoEXT at(long index, Consumer<VkIndirectExecutionSetShaderInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderCountAt(long index) { return (int) VH_shaderCount.get(this.segment(), 0L, index); }
    public MemorySegment pInitialShadersAt(long index) { return (MemorySegment) VH_pInitialShaders.get(this.segment(), 0L, index); }
    public MemorySegment pSetLayoutInfosAt(long index) { return (MemorySegment) VH_pSetLayoutInfos.get(this.segment(), 0L, index); }
    public int maxShaderCountAt(long index) { return (int) VH_maxShaderCount.get(this.segment(), 0L, index); }
    public int pushConstantRangeCountAt(long index) { return (int) VH_pushConstantRangeCount.get(this.segment(), 0L, index); }
    public MemorySegment pPushConstantRangesAt(long index) { return (MemorySegment) VH_pPushConstantRanges.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderCount() { return (int) VH_shaderCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pInitialShaders() { return (MemorySegment) VH_pInitialShaders.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetLayoutInfos() { return (MemorySegment) VH_pSetLayoutInfos.get(this.segment(), 0L, 0L); }
    public int maxShaderCount() { return (int) VH_maxShaderCount.get(this.segment(), 0L, 0L); }
    public int pushConstantRangeCount() { return (int) VH_pushConstantRangeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPushConstantRanges() { return (MemorySegment) VH_pPushConstantRanges.get(this.segment(), 0L, 0L); }
    public VkIndirectExecutionSetShaderInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT shaderCountAt(long index, int value) { VH_shaderCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pInitialShadersAt(long index, MemorySegment value) { VH_pInitialShaders.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfosAt(long index, MemorySegment value) { VH_pSetLayoutInfos.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCountAt(long index, int value) { VH_maxShaderCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pushConstantRangeCountAt(long index, int value) { VH_pushConstantRangeCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRangesAt(long index, MemorySegment value) { VH_pPushConstantRanges.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT shaderCount(int value) { VH_shaderCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(MemorySegment value) { VH_pInitialShaders.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(MemorySegment value) { VH_pSetLayoutInfos.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(int value) { VH_maxShaderCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pushConstantRangeCount(int value) { VH_pushConstantRangeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(MemorySegment value) { VH_pPushConstantRanges.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCount, index), LAYOUT_shaderCount); }
    public MemorySegment _shaderCount() { return _shaderCountAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _shaderCountAt(long index, MemorySegment src) { _shaderCountAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _shaderCount(MemorySegment src) { return _shaderCountAt(0L, src); }
    public MemorySegment _pInitialShadersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pInitialShaders, index), LAYOUT_pInitialShaders); }
    public MemorySegment _pInitialShaders() { return _pInitialShadersAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _pInitialShadersAt(long index, MemorySegment src) { _pInitialShadersAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _pInitialShaders(MemorySegment src) { return _pInitialShadersAt(0L, src); }
    public MemorySegment _pSetLayoutInfosAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetLayoutInfos, index), LAYOUT_pSetLayoutInfos); }
    public MemorySegment _pSetLayoutInfos() { return _pSetLayoutInfosAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _pSetLayoutInfosAt(long index, MemorySegment src) { _pSetLayoutInfosAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _pSetLayoutInfos(MemorySegment src) { return _pSetLayoutInfosAt(0L, src); }
    public MemorySegment _maxShaderCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxShaderCount, index), LAYOUT_maxShaderCount); }
    public MemorySegment _maxShaderCount() { return _maxShaderCountAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _maxShaderCountAt(long index, MemorySegment src) { _maxShaderCountAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _maxShaderCount(MemorySegment src) { return _maxShaderCountAt(0L, src); }
    public MemorySegment _pushConstantRangeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushConstantRangeCount, index), LAYOUT_pushConstantRangeCount); }
    public MemorySegment _pushConstantRangeCount() { return _pushConstantRangeCountAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _pushConstantRangeCountAt(long index, MemorySegment src) { _pushConstantRangeCountAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _pushConstantRangeCount(MemorySegment src) { return _pushConstantRangeCountAt(0L, src); }
    public MemorySegment _pPushConstantRangesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPushConstantRanges, index), LAYOUT_pPushConstantRanges); }
    public MemorySegment _pPushConstantRanges() { return _pPushConstantRangesAt(0L); }
    public VkIndirectExecutionSetShaderInfoEXT _pPushConstantRangesAt(long index, MemorySegment src) { _pPushConstantRangesAt(index).copyFrom(src); return this; }
    public VkIndirectExecutionSetShaderInfoEXT _pPushConstantRanges(MemorySegment src) { return _pPushConstantRangesAt(0L, src); }
}
