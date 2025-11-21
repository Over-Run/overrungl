// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
/// ## Layout
/// ```
/// struct VkGeneratedCommandsMemoryRequirementsInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkIndirectExecutionSetEXT indirectExecutionSet;
///     VkIndirectCommandsLayoutEXT indirectCommandsLayout;
///     uint32_t maxSequenceCount;
///     uint32_t maxDrawCount;
/// }
/// ```
public final class VkGeneratedCommandsMemoryRequirementsInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("indirectExecutionSet"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_indirectExecutionSet = LAYOUT.byteOffset(PathElement.groupElement("indirectExecutionSet"));
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    public static final long OFFSET_maxSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSequenceCount"));
    public static final long OFFSET_maxDrawCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_indirectExecutionSet = LAYOUT.select(PathElement.groupElement("indirectExecutionSet"));
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    public static final MemoryLayout LAYOUT_maxSequenceCount = LAYOUT.select(PathElement.groupElement("maxSequenceCount"));
    public static final MemoryLayout LAYOUT_maxDrawCount = LAYOUT.select(PathElement.groupElement("maxDrawCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_indirectExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectExecutionSet"));
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    public static final VarHandle VH_maxSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequenceCount"));
    public static final VarHandle VH_maxDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawCount"));

    public VkGeneratedCommandsMemoryRequirementsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT); }
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT);
        return s;
    }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT copyFrom(VkGeneratedCommandsMemoryRequirementsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT reinterpret(long count) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT asSlice(long index) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT asSlice(long index, long count) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT at(long index, Consumer<VkGeneratedCommandsMemoryRequirementsInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long indirectExecutionSetAt(long index) { return (long) VH_indirectExecutionSet.get(this.segment(), 0L, index); }
    public long indirectCommandsLayoutAt(long index) { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, index); }
    public int maxSequenceCountAt(long index) { return (int) VH_maxSequenceCount.get(this.segment(), 0L, index); }
    public int maxDrawCountAt(long index) { return (int) VH_maxDrawCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long indirectExecutionSet() { return (long) VH_indirectExecutionSet.get(this.segment(), 0L, 0L); }
    public long indirectCommandsLayout() { return (long) VH_indirectCommandsLayout.get(this.segment(), 0L, 0L); }
    public int maxSequenceCount() { return (int) VH_maxSequenceCount.get(this.segment(), 0L, 0L); }
    public int maxDrawCount() { return (int) VH_maxDrawCount.get(this.segment(), 0L, 0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSetAt(long index, long value) { VH_indirectExecutionSet.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayoutAt(long index, long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCountAt(long index, int value) { VH_maxSequenceCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCountAt(long index, int value) { VH_maxDrawCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(long value) { VH_indirectExecutionSet.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(long value) { VH_indirectCommandsLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(int value) { VH_maxSequenceCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(int value) { VH_maxDrawCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _indirectExecutionSetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectExecutionSet, index), LAYOUT_indirectExecutionSet); }
    public MemorySegment _indirectExecutionSet() { return _indirectExecutionSetAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _indirectExecutionSetAt(long index, MemorySegment src) { _indirectExecutionSetAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _indirectExecutionSet(MemorySegment src) { return _indirectExecutionSetAt(0L, src); }
    public MemorySegment _indirectCommandsLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_indirectCommandsLayout, index), LAYOUT_indirectCommandsLayout); }
    public MemorySegment _indirectCommandsLayout() { return _indirectCommandsLayoutAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _indirectCommandsLayoutAt(long index, MemorySegment src) { _indirectCommandsLayoutAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _indirectCommandsLayout(MemorySegment src) { return _indirectCommandsLayoutAt(0L, src); }
    public MemorySegment _maxSequenceCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSequenceCount, index), LAYOUT_maxSequenceCount); }
    public MemorySegment _maxSequenceCount() { return _maxSequenceCountAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _maxSequenceCountAt(long index, MemorySegment src) { _maxSequenceCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _maxSequenceCount(MemorySegment src) { return _maxSequenceCountAt(0L, src); }
    public MemorySegment _maxDrawCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDrawCount, index), LAYOUT_maxDrawCount); }
    public MemorySegment _maxDrawCount() { return _maxDrawCountAt(0L); }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _maxDrawCountAt(long index, MemorySegment src) { _maxDrawCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsMemoryRequirementsInfoEXT _maxDrawCount(MemorySegment src) { return _maxDrawCountAt(0L, src); }
}
