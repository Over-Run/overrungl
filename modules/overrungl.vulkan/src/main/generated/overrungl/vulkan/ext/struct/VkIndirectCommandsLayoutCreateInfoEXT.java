// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsLayoutCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectCommandsLayoutUsageFlagsEXT flags;
///     VkShaderStageFlags shaderStages;
///     uint32_t indirectStride;
///     VkPipelineLayout pipelineLayout;
///     uint32_t tokenCount;
///     const VkIndirectCommandsLayoutTokenEXT* pTokens;
/// }
/// ```
public final class VkIndirectCommandsLayoutCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.JAVA_INT.withName("indirectStride"),
        ValueLayout.JAVA_LONG.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withName("pTokens")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_shaderStages = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
    public static final long OFFSET_indirectStride = LAYOUT.byteOffset(PathElement.groupElement("indirectStride"));
    public static final long OFFSET_pipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayout"));
    public static final long OFFSET_tokenCount = LAYOUT.byteOffset(PathElement.groupElement("tokenCount"));
    public static final long OFFSET_pTokens = LAYOUT.byteOffset(PathElement.groupElement("pTokens"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_shaderStages = LAYOUT.select(PathElement.groupElement("shaderStages"));
    public static final MemoryLayout LAYOUT_indirectStride = LAYOUT.select(PathElement.groupElement("indirectStride"));
    public static final MemoryLayout LAYOUT_pipelineLayout = LAYOUT.select(PathElement.groupElement("pipelineLayout"));
    public static final MemoryLayout LAYOUT_tokenCount = LAYOUT.select(PathElement.groupElement("tokenCount"));
    public static final MemoryLayout LAYOUT_pTokens = LAYOUT.select(PathElement.groupElement("pTokens"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));
    public static final VarHandle VH_indirectStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectStride"));
    public static final VarHandle VH_pipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayout"));
    public static final VarHandle VH_tokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenCount"));
    public static final VarHandle VH_pTokens = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTokens"));

    public VkIndirectCommandsLayoutCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsLayoutCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsLayoutCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsLayoutCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsLayoutCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsLayoutCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT); }
    public static VkIndirectCommandsLayoutCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT);
        return s;
    }
    public VkIndirectCommandsLayoutCreateInfoEXT copyFrom(VkIndirectCommandsLayoutCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT reinterpret(long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsLayoutCreateInfoEXT asSlice(long index) { return new VkIndirectCommandsLayoutCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsLayoutCreateInfoEXT asSlice(long index, long count) { return new VkIndirectCommandsLayoutCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsLayoutCreateInfoEXT at(long index, Consumer<VkIndirectCommandsLayoutCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int shaderStagesAt(long index) { return (int) VH_shaderStages.get(this.segment(), 0L, index); }
    public int indirectStrideAt(long index) { return (int) VH_indirectStride.get(this.segment(), 0L, index); }
    public long pipelineLayoutAt(long index) { return (long) VH_pipelineLayout.get(this.segment(), 0L, index); }
    public int tokenCountAt(long index) { return (int) VH_tokenCount.get(this.segment(), 0L, index); }
    public MemorySegment pTokensAt(long index) { return (MemorySegment) VH_pTokens.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int shaderStages() { return (int) VH_shaderStages.get(this.segment(), 0L, 0L); }
    public int indirectStride() { return (int) VH_indirectStride.get(this.segment(), 0L, 0L); }
    public long pipelineLayout() { return (long) VH_pipelineLayout.get(this.segment(), 0L, 0L); }
    public int tokenCount() { return (int) VH_tokenCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTokens() { return (MemorySegment) VH_pTokens.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStagesAt(long index, int value) { VH_shaderStages.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStrideAt(long index, int value) { VH_indirectStride.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayoutAt(long index, long value) { VH_pipelineLayout.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCountAt(long index, int value) { VH_tokenCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT pTokensAt(long index, MemorySegment value) { VH_pTokens.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(int value) { VH_shaderStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(int value) { VH_indirectStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(long value) { VH_pipelineLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT tokenCount(int value) { VH_tokenCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(MemorySegment value) { VH_pTokens.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _shaderStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStages, index), LAYOUT_shaderStages); }
    public MemorySegment _shaderStages() { return _shaderStagesAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _shaderStagesAt(long index, MemorySegment src) { _shaderStagesAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _shaderStages(MemorySegment src) { return _shaderStagesAt(0L, src); }
    public MemorySegment _indirectStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectStride, index), LAYOUT_indirectStride); }
    public MemorySegment _indirectStride() { return _indirectStrideAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _indirectStrideAt(long index, MemorySegment src) { _indirectStrideAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _indirectStride(MemorySegment src) { return _indirectStrideAt(0L, src); }
    public MemorySegment _pipelineLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineLayout, index), LAYOUT_pipelineLayout); }
    public MemorySegment _pipelineLayout() { return _pipelineLayoutAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _pipelineLayoutAt(long index, MemorySegment src) { _pipelineLayoutAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _pipelineLayout(MemorySegment src) { return _pipelineLayoutAt(0L, src); }
    public MemorySegment _tokenCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tokenCount, index), LAYOUT_tokenCount); }
    public MemorySegment _tokenCount() { return _tokenCountAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _tokenCountAt(long index, MemorySegment src) { _tokenCountAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _tokenCount(MemorySegment src) { return _tokenCountAt(0L, src); }
    public MemorySegment _pTokensAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTokens, index), LAYOUT_pTokens); }
    public MemorySegment _pTokens() { return _pTokensAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoEXT _pTokensAt(long index, MemorySegment src) { _pTokensAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoEXT _pTokens(MemorySegment src) { return _pTokensAt(0L, src); }
}
