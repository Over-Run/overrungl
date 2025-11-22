// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxGraphicsShaderGroupCount;
///     uint32_t maxIndirectSequenceCount;
///     uint32_t maxIndirectCommandsTokenCount;
///     uint32_t maxIndirectCommandsStreamCount;
///     uint32_t maxIndirectCommandsTokenOffset;
///     uint32_t maxIndirectCommandsStreamStride;
///     uint32_t minSequencesCountBufferOffsetAlignment;
///     uint32_t minSequencesIndexBufferOffsetAlignment;
///     uint32_t minIndirectCommandsBufferOffsetAlignment;
/// }
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxGraphicsShaderGroupCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamCount"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset"),
        ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamStride"),
        ValueLayout.JAVA_INT.withName("minSequencesCountBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minSequencesIndexBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minIndirectCommandsBufferOffsetAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_maxGraphicsShaderGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    public static final long OFFSET_maxIndirectSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectSequenceCount"));
    public static final long OFFSET_maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    public static final long OFFSET_maxIndirectCommandsStreamCount = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    public static final long OFFSET_maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    public static final long OFFSET_maxIndirectCommandsStreamStride = LAYOUT.byteOffset(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    public static final long OFFSET_minSequencesCountBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    public static final long OFFSET_minSequencesIndexBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    public static final long OFFSET_minIndirectCommandsBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_maxGraphicsShaderGroupCount = LAYOUT.select(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    public static final MemoryLayout LAYOUT_maxIndirectSequenceCount = LAYOUT.select(PathElement.groupElement("maxIndirectSequenceCount"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenCount = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsStreamCount = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsTokenOffset = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    public static final MemoryLayout LAYOUT_maxIndirectCommandsStreamStride = LAYOUT.select(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    public static final MemoryLayout LAYOUT_minSequencesCountBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_minSequencesIndexBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_minIndirectCommandsBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_maxGraphicsShaderGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGraphicsShaderGroupCount"));
    public static final VarHandle VH_maxIndirectSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectSequenceCount"));
    public static final VarHandle VH_maxIndirectCommandsTokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenCount"));
    public static final VarHandle VH_maxIndirectCommandsStreamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsStreamCount"));
    public static final VarHandle VH_maxIndirectCommandsTokenOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsTokenOffset"));
    public static final VarHandle VH_maxIndirectCommandsStreamStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIndirectCommandsStreamStride"));
    public static final VarHandle VH_minSequencesCountBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSequencesCountBufferOffsetAlignment"));
    public static final VarHandle VH_minSequencesIndexBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSequencesIndexBufferOffsetAlignment"));
    public static final VarHandle VH_minIndirectCommandsBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minIndirectCommandsBufferOffsetAlignment"));

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int maxGraphicsShaderGroupCountAt(long index) { return (int) VH_maxGraphicsShaderGroupCount.get(this.segment(), 0L, index); }
    public int maxIndirectSequenceCountAt(long index) { return (int) VH_maxIndirectSequenceCount.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsTokenCountAt(long index) { return (int) VH_maxIndirectCommandsTokenCount.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsStreamCountAt(long index) { return (int) VH_maxIndirectCommandsStreamCount.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsTokenOffsetAt(long index) { return (int) VH_maxIndirectCommandsTokenOffset.get(this.segment(), 0L, index); }
    public int maxIndirectCommandsStreamStrideAt(long index) { return (int) VH_maxIndirectCommandsStreamStride.get(this.segment(), 0L, index); }
    public int minSequencesCountBufferOffsetAlignmentAt(long index) { return (int) VH_minSequencesCountBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int minSequencesIndexBufferOffsetAlignmentAt(long index) { return (int) VH_minSequencesIndexBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int minIndirectCommandsBufferOffsetAlignmentAt(long index) { return (int) VH_minIndirectCommandsBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int maxGraphicsShaderGroupCount() { return (int) VH_maxGraphicsShaderGroupCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectSequenceCount() { return (int) VH_maxIndirectSequenceCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsTokenCount() { return (int) VH_maxIndirectCommandsTokenCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsStreamCount() { return (int) VH_maxIndirectCommandsStreamCount.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsTokenOffset() { return (int) VH_maxIndirectCommandsTokenOffset.get(this.segment(), 0L, 0L); }
    public int maxIndirectCommandsStreamStride() { return (int) VH_maxIndirectCommandsStreamStride.get(this.segment(), 0L, 0L); }
    public int minSequencesCountBufferOffsetAlignment() { return (int) VH_minSequencesCountBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public int minSequencesIndexBufferOffsetAlignment() { return (int) VH_minSequencesIndexBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public int minIndirectCommandsBufferOffsetAlignment() { return (int) VH_minIndirectCommandsBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxGraphicsShaderGroupCountAt(long index, int value) { VH_maxGraphicsShaderGroupCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectSequenceCountAt(long index, int value) { VH_maxIndirectSequenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenCountAt(long index, int value) { VH_maxIndirectCommandsTokenCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamCountAt(long index, int value) { VH_maxIndirectCommandsStreamCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenOffsetAt(long index, int value) { VH_maxIndirectCommandsTokenOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamStrideAt(long index, int value) { VH_maxIndirectCommandsStreamStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesCountBufferOffsetAlignmentAt(long index, int value) { VH_minSequencesCountBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesIndexBufferOffsetAlignmentAt(long index, int value) { VH_minSequencesIndexBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minIndirectCommandsBufferOffsetAlignmentAt(long index, int value) { VH_minIndirectCommandsBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxGraphicsShaderGroupCount(int value) { VH_maxGraphicsShaderGroupCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectSequenceCount(int value) { VH_maxIndirectSequenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenCount(int value) { VH_maxIndirectCommandsTokenCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamCount(int value) { VH_maxIndirectCommandsStreamCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsTokenOffset(int value) { VH_maxIndirectCommandsTokenOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV maxIndirectCommandsStreamStride(int value) { VH_maxIndirectCommandsStreamStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesCountBufferOffsetAlignment(int value) { VH_minSequencesCountBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minSequencesIndexBufferOffsetAlignment(int value) { VH_minSequencesIndexBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV minIndirectCommandsBufferOffsetAlignment(int value) { VH_minIndirectCommandsBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _maxGraphicsShaderGroupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGraphicsShaderGroupCount, index), LAYOUT_maxGraphicsShaderGroupCount); }
    public MemorySegment _maxGraphicsShaderGroupCount() { return _maxGraphicsShaderGroupCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxGraphicsShaderGroupCountAt(long index, MemorySegment src) { _maxGraphicsShaderGroupCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxGraphicsShaderGroupCount(MemorySegment src) { return _maxGraphicsShaderGroupCountAt(0L, src); }
    public MemorySegment _maxIndirectSequenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectSequenceCount, index), LAYOUT_maxIndirectSequenceCount); }
    public MemorySegment _maxIndirectSequenceCount() { return _maxIndirectSequenceCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectSequenceCountAt(long index, MemorySegment src) { _maxIndirectSequenceCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectSequenceCount(MemorySegment src) { return _maxIndirectSequenceCountAt(0L, src); }
    public MemorySegment _maxIndirectCommandsTokenCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsTokenCount, index), LAYOUT_maxIndirectCommandsTokenCount); }
    public MemorySegment _maxIndirectCommandsTokenCount() { return _maxIndirectCommandsTokenCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsTokenCountAt(long index, MemorySegment src) { _maxIndirectCommandsTokenCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsTokenCount(MemorySegment src) { return _maxIndirectCommandsTokenCountAt(0L, src); }
    public MemorySegment _maxIndirectCommandsStreamCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsStreamCount, index), LAYOUT_maxIndirectCommandsStreamCount); }
    public MemorySegment _maxIndirectCommandsStreamCount() { return _maxIndirectCommandsStreamCountAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsStreamCountAt(long index, MemorySegment src) { _maxIndirectCommandsStreamCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsStreamCount(MemorySegment src) { return _maxIndirectCommandsStreamCountAt(0L, src); }
    public MemorySegment _maxIndirectCommandsTokenOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsTokenOffset, index), LAYOUT_maxIndirectCommandsTokenOffset); }
    public MemorySegment _maxIndirectCommandsTokenOffset() { return _maxIndirectCommandsTokenOffsetAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsTokenOffsetAt(long index, MemorySegment src) { _maxIndirectCommandsTokenOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsTokenOffset(MemorySegment src) { return _maxIndirectCommandsTokenOffsetAt(0L, src); }
    public MemorySegment _maxIndirectCommandsStreamStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxIndirectCommandsStreamStride, index), LAYOUT_maxIndirectCommandsStreamStride); }
    public MemorySegment _maxIndirectCommandsStreamStride() { return _maxIndirectCommandsStreamStrideAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsStreamStrideAt(long index, MemorySegment src) { _maxIndirectCommandsStreamStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _maxIndirectCommandsStreamStride(MemorySegment src) { return _maxIndirectCommandsStreamStrideAt(0L, src); }
    public MemorySegment _minSequencesCountBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSequencesCountBufferOffsetAlignment, index), LAYOUT_minSequencesCountBufferOffsetAlignment); }
    public MemorySegment _minSequencesCountBufferOffsetAlignment() { return _minSequencesCountBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _minSequencesCountBufferOffsetAlignmentAt(long index, MemorySegment src) { _minSequencesCountBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _minSequencesCountBufferOffsetAlignment(MemorySegment src) { return _minSequencesCountBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _minSequencesIndexBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minSequencesIndexBufferOffsetAlignment, index), LAYOUT_minSequencesIndexBufferOffsetAlignment); }
    public MemorySegment _minSequencesIndexBufferOffsetAlignment() { return _minSequencesIndexBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _minSequencesIndexBufferOffsetAlignmentAt(long index, MemorySegment src) { _minSequencesIndexBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _minSequencesIndexBufferOffsetAlignment(MemorySegment src) { return _minSequencesIndexBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _minIndirectCommandsBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minIndirectCommandsBufferOffsetAlignment, index), LAYOUT_minIndirectCommandsBufferOffsetAlignment); }
    public MemorySegment _minIndirectCommandsBufferOffsetAlignment() { return _minIndirectCommandsBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _minIndirectCommandsBufferOffsetAlignmentAt(long index, MemorySegment src) { _minIndirectCommandsBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV _minIndirectCommandsBufferOffsetAlignment(MemorySegment src) { return _minIndirectCommandsBufferOffsetAlignmentAt(0L, src); }
}
