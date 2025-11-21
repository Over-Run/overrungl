// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsLayoutCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectCommandsLayoutUsageFlagsNV flags;
///     VkPipelineBindPoint pipelineBindPoint;
///     uint32_t tokenCount;
///     const VkIndirectCommandsLayoutTokenNV* pTokens;
///     uint32_t streamCount;
///     const uint32_t* pStreamStrides;
/// }
/// ```
public final class VkIndirectCommandsLayoutCreateInfoNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withName("pTokens"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withName("pStreamStrides")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    public static final long OFFSET_tokenCount = LAYOUT.byteOffset(PathElement.groupElement("tokenCount"));
    public static final long OFFSET_pTokens = LAYOUT.byteOffset(PathElement.groupElement("pTokens"));
    public static final long OFFSET_streamCount = LAYOUT.byteOffset(PathElement.groupElement("streamCount"));
    public static final long OFFSET_pStreamStrides = LAYOUT.byteOffset(PathElement.groupElement("pStreamStrides"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    public static final MemoryLayout LAYOUT_tokenCount = LAYOUT.select(PathElement.groupElement("tokenCount"));
    public static final MemoryLayout LAYOUT_pTokens = LAYOUT.select(PathElement.groupElement("pTokens"));
    public static final MemoryLayout LAYOUT_streamCount = LAYOUT.select(PathElement.groupElement("streamCount"));
    public static final MemoryLayout LAYOUT_pStreamStrides = LAYOUT.select(PathElement.groupElement("pStreamStrides"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    public static final VarHandle VH_tokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenCount"));
    public static final VarHandle VH_pTokens = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTokens"));
    public static final VarHandle VH_streamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamCount"));
    public static final VarHandle VH_pStreamStrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStreamStrides"));

    public VkIndirectCommandsLayoutCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkIndirectCommandsLayoutCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkIndirectCommandsLayoutCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkIndirectCommandsLayoutCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkIndirectCommandsLayoutCreateInfoNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutCreateInfoNV(allocator.allocate(LAYOUT), 1); }
    public static VkIndirectCommandsLayoutCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutCreateInfoNV(allocator.allocate(LAYOUT, count), count); }
    public static VkIndirectCommandsLayoutCreateInfoNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV); }
    public static VkIndirectCommandsLayoutCreateInfoNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV);
        return s;
    }
    public VkIndirectCommandsLayoutCreateInfoNV copyFrom(VkIndirectCommandsLayoutCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV reinterpret(long count) { return new VkIndirectCommandsLayoutCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkIndirectCommandsLayoutCreateInfoNV asSlice(long index) { return new VkIndirectCommandsLayoutCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkIndirectCommandsLayoutCreateInfoNV asSlice(long index, long count) { return new VkIndirectCommandsLayoutCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkIndirectCommandsLayoutCreateInfoNV at(long index, Consumer<VkIndirectCommandsLayoutCreateInfoNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int pipelineBindPointAt(long index) { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, index); }
    public int tokenCountAt(long index) { return (int) VH_tokenCount.get(this.segment(), 0L, index); }
    public MemorySegment pTokensAt(long index) { return (MemorySegment) VH_pTokens.get(this.segment(), 0L, index); }
    public int streamCountAt(long index) { return (int) VH_streamCount.get(this.segment(), 0L, index); }
    public MemorySegment pStreamStridesAt(long index) { return (MemorySegment) VH_pStreamStrides.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int pipelineBindPoint() { return (int) VH_pipelineBindPoint.get(this.segment(), 0L, 0L); }
    public int tokenCount() { return (int) VH_tokenCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pTokens() { return (MemorySegment) VH_pTokens.get(this.segment(), 0L, 0L); }
    public int streamCount() { return (int) VH_streamCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pStreamStrides() { return (MemorySegment) VH_pStreamStrides.get(this.segment(), 0L, 0L); }
    public VkIndirectCommandsLayoutCreateInfoNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPointAt(long index, int value) { VH_pipelineBindPoint.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV tokenCountAt(long index, int value) { VH_tokenCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pTokensAt(long index, MemorySegment value) { VH_pTokens.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV streamCountAt(long index, int value) { VH_streamCount.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStridesAt(long index, MemorySegment value) { VH_pStreamStrides.set(this.segment(), 0L, index, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(int value) { VH_pipelineBindPoint.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV tokenCount(int value) { VH_tokenCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pTokens(MemorySegment value) { VH_pTokens.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV streamCount(int value) { VH_streamCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(MemorySegment value) { VH_pStreamStrides.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pipelineBindPointAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineBindPoint, index), LAYOUT_pipelineBindPoint); }
    public MemorySegment _pipelineBindPoint() { return _pipelineBindPointAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _pipelineBindPointAt(long index, MemorySegment src) { _pipelineBindPointAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _pipelineBindPoint(MemorySegment src) { return _pipelineBindPointAt(0L, src); }
    public MemorySegment _tokenCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_tokenCount, index), LAYOUT_tokenCount); }
    public MemorySegment _tokenCount() { return _tokenCountAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _tokenCountAt(long index, MemorySegment src) { _tokenCountAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _tokenCount(MemorySegment src) { return _tokenCountAt(0L, src); }
    public MemorySegment _pTokensAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pTokens, index), LAYOUT_pTokens); }
    public MemorySegment _pTokens() { return _pTokensAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _pTokensAt(long index, MemorySegment src) { _pTokensAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _pTokens(MemorySegment src) { return _pTokensAt(0L, src); }
    public MemorySegment _streamCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_streamCount, index), LAYOUT_streamCount); }
    public MemorySegment _streamCount() { return _streamCountAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _streamCountAt(long index, MemorySegment src) { _streamCountAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _streamCount(MemorySegment src) { return _streamCountAt(0L, src); }
    public MemorySegment _pStreamStridesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStreamStrides, index), LAYOUT_pStreamStrides); }
    public MemorySegment _pStreamStrides() { return _pStreamStridesAt(0L); }
    public VkIndirectCommandsLayoutCreateInfoNV _pStreamStridesAt(long index, MemorySegment src) { _pStreamStridesAt(index).copyFrom(src); return this; }
    public VkIndirectCommandsLayoutCreateInfoNV _pStreamStrides(MemorySegment src) { return _pStreamStridesAt(0L, src); }
}
