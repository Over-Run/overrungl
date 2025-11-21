// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeneratedCommandsInfoEXT`.
/// ## Layout
/// ```
/// struct VkGeneratedCommandsInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderStageFlags shaderStages;
///     VkIndirectExecutionSetEXT indirectExecutionSet;
///     VkIndirectCommandsLayoutEXT indirectCommandsLayout;
///     VkDeviceAddress indirectAddress;
///     VkDeviceSize indirectAddressSize;
///     VkDeviceAddress preprocessAddress;
///     VkDeviceSize preprocessSize;
///     uint32_t maxSequenceCount;
///     VkDeviceAddress sequenceCountAddress;
///     uint32_t maxDrawCount;
/// }
/// ```
public final class VkGeneratedCommandsInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderStages"),
        ValueLayout.JAVA_LONG.withName("indirectExecutionSet"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_LONG.withName("indirectAddress"),
        ValueLayout.JAVA_LONG.withName("indirectAddressSize"),
        ValueLayout.JAVA_LONG.withName("preprocessAddress"),
        ValueLayout.JAVA_LONG.withName("preprocessSize"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_LONG.withName("sequenceCountAddress"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderStages = LAYOUT.byteOffset(PathElement.groupElement("shaderStages"));
    public static final long OFFSET_indirectExecutionSet = LAYOUT.byteOffset(PathElement.groupElement("indirectExecutionSet"));
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    public static final long OFFSET_indirectAddress = LAYOUT.byteOffset(PathElement.groupElement("indirectAddress"));
    public static final long OFFSET_indirectAddressSize = LAYOUT.byteOffset(PathElement.groupElement("indirectAddressSize"));
    public static final long OFFSET_preprocessAddress = LAYOUT.byteOffset(PathElement.groupElement("preprocessAddress"));
    public static final long OFFSET_preprocessSize = LAYOUT.byteOffset(PathElement.groupElement("preprocessSize"));
    public static final long OFFSET_maxSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSequenceCount"));
    public static final long OFFSET_sequenceCountAddress = LAYOUT.byteOffset(PathElement.groupElement("sequenceCountAddress"));
    public static final long OFFSET_maxDrawCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderStages = LAYOUT.select(PathElement.groupElement("shaderStages"));
    public static final MemoryLayout LAYOUT_indirectExecutionSet = LAYOUT.select(PathElement.groupElement("indirectExecutionSet"));
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    public static final MemoryLayout LAYOUT_indirectAddress = LAYOUT.select(PathElement.groupElement("indirectAddress"));
    public static final MemoryLayout LAYOUT_indirectAddressSize = LAYOUT.select(PathElement.groupElement("indirectAddressSize"));
    public static final MemoryLayout LAYOUT_preprocessAddress = LAYOUT.select(PathElement.groupElement("preprocessAddress"));
    public static final MemoryLayout LAYOUT_preprocessSize = LAYOUT.select(PathElement.groupElement("preprocessSize"));
    public static final MemoryLayout LAYOUT_maxSequenceCount = LAYOUT.select(PathElement.groupElement("maxSequenceCount"));
    public static final MemoryLayout LAYOUT_sequenceCountAddress = LAYOUT.select(PathElement.groupElement("sequenceCountAddress"));
    public static final MemoryLayout LAYOUT_maxDrawCount = LAYOUT.select(PathElement.groupElement("maxDrawCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStages"));
    public static final VarHandle VH_indirectExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectExecutionSet"));
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    public static final VarHandle VH_indirectAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectAddress"));
    public static final VarHandle VH_indirectAddressSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectAddressSize"));
    public static final VarHandle VH_preprocessAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessAddress"));
    public static final VarHandle VH_preprocessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preprocessSize"));
    public static final VarHandle VH_maxSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequenceCount"));
    public static final VarHandle VH_sequenceCountAddress = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sequenceCountAddress"));
    public static final VarHandle VH_maxDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawCount"));

    public VkGeneratedCommandsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeneratedCommandsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeneratedCommandsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeneratedCommandsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeneratedCommandsInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkGeneratedCommandsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkGeneratedCommandsInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT); }
    public static VkGeneratedCommandsInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT);
        return s;
    }
    public VkGeneratedCommandsInfoEXT copyFrom(VkGeneratedCommandsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeneratedCommandsInfoEXT reinterpret(long count) { return new VkGeneratedCommandsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeneratedCommandsInfoEXT asSlice(long index) { return new VkGeneratedCommandsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeneratedCommandsInfoEXT asSlice(long index, long count) { return new VkGeneratedCommandsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeneratedCommandsInfoEXT at(long index, Consumer<VkGeneratedCommandsInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderStagesAt(long index) { return (int) VH_shaderStages.get(this.segment(), 0L, index); }
    public long indirectExecutionSetAt(long index) { return (long) VH_indirectExecutionSet.get(this.segment(), 0L, index); }
    public long indirectCommandsLayoutAt(long index) { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, index); }
    public long indirectAddressAt(long index) { return (long) VH_indirectAddress.get(this.segment(), 0L, index); }
    public long indirectAddressSizeAt(long index) { return (long) VH_indirectAddressSize.get(this.segment(), 0L, index); }
    public long preprocessAddressAt(long index) { return (long) VH_preprocessAddress.get(this.segment(), 0L, index); }
    public long preprocessSizeAt(long index) { return (long) VH_preprocessSize.get(this.segment(), 0L, index); }
    public int maxSequenceCountAt(long index) { return (int) VH_maxSequenceCount.get(this.segment(), 0L, index); }
    public long sequenceCountAddressAt(long index) { return (long) VH_sequenceCountAddress.get(this.segment(), 0L, index); }
    public int maxDrawCountAt(long index) { return (int) VH_maxDrawCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderStages() { return (int) VH_shaderStages.get(this.segment(), 0L, 0L); }
    public long indirectExecutionSet() { return (long) VH_indirectExecutionSet.get(this.segment(), 0L, 0L); }
    public long indirectCommandsLayout() { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, 0L); }
    public long indirectAddress() { return (long) VH_indirectAddress.get(this.segment(), 0L, 0L); }
    public long indirectAddressSize() { return (long) VH_indirectAddressSize.get(this.segment(), 0L, 0L); }
    public long preprocessAddress() { return (long) VH_preprocessAddress.get(this.segment(), 0L, 0L); }
    public long preprocessSize() { return (long) VH_preprocessSize.get(this.segment(), 0L, 0L); }
    public int maxSequenceCount() { return (int) VH_maxSequenceCount.get(this.segment(), 0L, 0L); }
    public long sequenceCountAddress() { return (long) VH_sequenceCountAddress.get(this.segment(), 0L, 0L); }
    public int maxDrawCount() { return (int) VH_maxDrawCount.get(this.segment(), 0L, 0L); }
    public VkGeneratedCommandsInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT shaderStagesAt(long index, int value) { VH_shaderStages.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectExecutionSetAt(long index, long value) { VH_indirectExecutionSet.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectCommandsLayoutAt(long index, long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectAddressAt(long index, long value) { VH_indirectAddress.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectAddressSizeAt(long index, long value) { VH_indirectAddressSize.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT preprocessAddressAt(long index, long value) { VH_preprocessAddress.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT preprocessSizeAt(long index, long value) { VH_preprocessSize.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT maxSequenceCountAt(long index, int value) { VH_maxSequenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT sequenceCountAddressAt(long index, long value) { VH_sequenceCountAddress.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT maxDrawCountAt(long index, int value) { VH_maxDrawCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT shaderStages(int value) { VH_shaderStages.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectExecutionSet(long value) { VH_indirectExecutionSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectAddress(long value) { VH_indirectAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT indirectAddressSize(long value) { VH_indirectAddressSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT preprocessAddress(long value) { VH_preprocessAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT preprocessSize(long value) { VH_preprocessSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT maxSequenceCount(int value) { VH_maxSequenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT sequenceCountAddress(long value) { VH_sequenceCountAddress.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsInfoEXT maxDrawCount(int value) { VH_maxDrawCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeneratedCommandsInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeneratedCommandsInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderStagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderStages, index), LAYOUT_shaderStages); }
    public MemorySegment _shaderStages() { return _shaderStagesAt(0L); }
    public VkGeneratedCommandsInfoEXT _shaderStagesAt(long index, MemorySegment src) { _shaderStagesAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _shaderStages(MemorySegment src) { return _shaderStagesAt(0L, src); }
    public MemorySegment _indirectExecutionSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectExecutionSet, index), LAYOUT_indirectExecutionSet); }
    public MemorySegment _indirectExecutionSet() { return _indirectExecutionSetAt(0L); }
    public VkGeneratedCommandsInfoEXT _indirectExecutionSetAt(long index, MemorySegment src) { _indirectExecutionSetAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _indirectExecutionSet(MemorySegment src) { return _indirectExecutionSetAt(0L, src); }
    public MemorySegment _indirectCommandsLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectCommandsLayout, index), LAYOUT_indirectCommandsLayout); }
    public MemorySegment _indirectCommandsLayout() { return _indirectCommandsLayoutAt(0L); }
    public VkGeneratedCommandsInfoEXT _indirectCommandsLayoutAt(long index, MemorySegment src) { _indirectCommandsLayoutAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _indirectCommandsLayout(MemorySegment src) { return _indirectCommandsLayoutAt(0L, src); }
    public MemorySegment _indirectAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectAddress, index), LAYOUT_indirectAddress); }
    public MemorySegment _indirectAddress() { return _indirectAddressAt(0L); }
    public VkGeneratedCommandsInfoEXT _indirectAddressAt(long index, MemorySegment src) { _indirectAddressAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _indirectAddress(MemorySegment src) { return _indirectAddressAt(0L, src); }
    public MemorySegment _indirectAddressSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectAddressSize, index), LAYOUT_indirectAddressSize); }
    public MemorySegment _indirectAddressSize() { return _indirectAddressSizeAt(0L); }
    public VkGeneratedCommandsInfoEXT _indirectAddressSizeAt(long index, MemorySegment src) { _indirectAddressSizeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _indirectAddressSize(MemorySegment src) { return _indirectAddressSizeAt(0L, src); }
    public MemorySegment _preprocessAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preprocessAddress, index), LAYOUT_preprocessAddress); }
    public MemorySegment _preprocessAddress() { return _preprocessAddressAt(0L); }
    public VkGeneratedCommandsInfoEXT _preprocessAddressAt(long index, MemorySegment src) { _preprocessAddressAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _preprocessAddress(MemorySegment src) { return _preprocessAddressAt(0L, src); }
    public MemorySegment _preprocessSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_preprocessSize, index), LAYOUT_preprocessSize); }
    public MemorySegment _preprocessSize() { return _preprocessSizeAt(0L); }
    public VkGeneratedCommandsInfoEXT _preprocessSizeAt(long index, MemorySegment src) { _preprocessSizeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _preprocessSize(MemorySegment src) { return _preprocessSizeAt(0L, src); }
    public MemorySegment _maxSequenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSequenceCount, index), LAYOUT_maxSequenceCount); }
    public MemorySegment _maxSequenceCount() { return _maxSequenceCountAt(0L); }
    public VkGeneratedCommandsInfoEXT _maxSequenceCountAt(long index, MemorySegment src) { _maxSequenceCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _maxSequenceCount(MemorySegment src) { return _maxSequenceCountAt(0L, src); }
    public MemorySegment _sequenceCountAddressAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sequenceCountAddress, index), LAYOUT_sequenceCountAddress); }
    public MemorySegment _sequenceCountAddress() { return _sequenceCountAddressAt(0L); }
    public VkGeneratedCommandsInfoEXT _sequenceCountAddressAt(long index, MemorySegment src) { _sequenceCountAddressAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _sequenceCountAddress(MemorySegment src) { return _sequenceCountAddressAt(0L, src); }
    public MemorySegment _maxDrawCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDrawCount, index), LAYOUT_maxDrawCount); }
    public MemorySegment _maxDrawCount() { return _maxDrawCountAt(0L); }
    public VkGeneratedCommandsInfoEXT _maxDrawCountAt(long index, MemorySegment src) { _maxDrawCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsInfoEXT _maxDrawCount(MemorySegment src) { return _maxDrawCountAt(0L, src); }
}
