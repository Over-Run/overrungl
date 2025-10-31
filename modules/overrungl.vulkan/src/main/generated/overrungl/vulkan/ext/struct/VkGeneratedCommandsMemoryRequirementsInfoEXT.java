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
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkIndirectExecutionSetEXT indirectExecutionSet;
///     (uint64_t) VkIndirectCommandsLayoutEXT indirectCommandsLayout;
///     uint32_t maxSequenceCount;
///     uint32_t maxDrawCount;
/// };
/// ```
public final class VkGeneratedCommandsMemoryRequirementsInfoEXT extends GroupType {
    /// The struct layout of `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("indirectExecutionSet"),
        ValueLayout.JAVA_LONG.withName("indirectCommandsLayout"),
        ValueLayout.JAVA_INT.withName("maxSequenceCount"),
        ValueLayout.JAVA_INT.withName("maxDrawCount")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `indirectExecutionSet`.
    public static final long OFFSET_indirectExecutionSet = LAYOUT.byteOffset(PathElement.groupElement("indirectExecutionSet"));
    /// The memory layout of `indirectExecutionSet`.
    public static final MemoryLayout LAYOUT_indirectExecutionSet = LAYOUT.select(PathElement.groupElement("indirectExecutionSet"));
    /// The [VarHandle] of `indirectExecutionSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectExecutionSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectExecutionSet"));
    /// The byte offset of `indirectCommandsLayout`.
    public static final long OFFSET_indirectCommandsLayout = LAYOUT.byteOffset(PathElement.groupElement("indirectCommandsLayout"));
    /// The memory layout of `indirectCommandsLayout`.
    public static final MemoryLayout LAYOUT_indirectCommandsLayout = LAYOUT.select(PathElement.groupElement("indirectCommandsLayout"));
    /// The [VarHandle] of `indirectCommandsLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectCommandsLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCommandsLayout"));
    /// The byte offset of `maxSequenceCount`.
    public static final long OFFSET_maxSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSequenceCount"));
    /// The memory layout of `maxSequenceCount`.
    public static final MemoryLayout LAYOUT_maxSequenceCount = LAYOUT.select(PathElement.groupElement("maxSequenceCount"));
    /// The [VarHandle] of `maxSequenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSequenceCount"));
    /// The byte offset of `maxDrawCount`.
    public static final long OFFSET_maxDrawCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawCount"));
    /// The memory layout of `maxDrawCount`.
    public static final MemoryLayout LAYOUT_maxDrawCount = LAYOUT.select(PathElement.groupElement("maxDrawCount"));
    /// The [VarHandle] of `maxDrawCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDrawCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawCount"));

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkGeneratedCommandsMemoryRequirementsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkGeneratedCommandsMemoryRequirementsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT copyFrom(VkGeneratedCommandsMemoryRequirementsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkGeneratedCommandsMemoryRequirementsInfoEXT reinterpret(long count) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `indirectExecutionSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectExecutionSet(MemorySegment segment, long index) { return (long) VH_indirectExecutionSet.get(segment, 0L, index); }
    /// {@return `indirectExecutionSet`}
    public long indirectExecutionSet() { return indirectExecutionSet(this.segment(), 0L); }
    /// Sets `indirectExecutionSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectExecutionSet(MemorySegment segment, long index, long value) { VH_indirectExecutionSet.set(segment, 0L, index, value); }
    /// Sets `indirectExecutionSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(long value) { indirectExecutionSet(this.segment(), 0L, value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long indirectCommandsLayout(MemorySegment segment, long index) { return (long) VH_indirectCommandsLayout.get(segment, 0L, index); }
    /// {@return `indirectCommandsLayout`}
    public long indirectCommandsLayout() { return indirectCommandsLayout(this.segment(), 0L); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectCommandsLayout(MemorySegment segment, long index, long value) { VH_indirectCommandsLayout.set(segment, 0L, index, value); }
    /// Sets `indirectCommandsLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(long value) { indirectCommandsLayout(this.segment(), 0L, value); return this; }

    /// {@return `maxSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSequenceCount(MemorySegment segment, long index) { return (int) VH_maxSequenceCount.get(segment, 0L, index); }
    /// {@return `maxSequenceCount`}
    public int maxSequenceCount() { return maxSequenceCount(this.segment(), 0L); }
    /// Sets `maxSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSequenceCount(MemorySegment segment, long index, int value) { VH_maxSequenceCount.set(segment, 0L, index, value); }
    /// Sets `maxSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(int value) { maxSequenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxDrawCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDrawCount(MemorySegment segment, long index) { return (int) VH_maxDrawCount.get(segment, 0L, index); }
    /// {@return `maxDrawCount`}
    public int maxDrawCount() { return maxDrawCount(this.segment(), 0L); }
    /// Sets `maxDrawCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDrawCount(MemorySegment segment, long index, int value) { VH_maxDrawCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(int value) { maxDrawCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT asSlice(long index) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkGeneratedCommandsMemoryRequirementsInfoEXT`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT asSlice(long index, long count) { return new VkGeneratedCommandsMemoryRequirementsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkGeneratedCommandsMemoryRequirementsInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT at(long index, Consumer<VkGeneratedCommandsMemoryRequirementsInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `indirectExecutionSet` at the given index}
    /// @param index the index of the struct buffer
    public long indirectExecutionSetAt(long index) { return indirectExecutionSet(this.segment(), index); }
    /// Sets `indirectExecutionSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSetAt(long index, long value) { indirectExecutionSet(this.segment(), index, value); return this; }

    /// {@return `indirectCommandsLayout` at the given index}
    /// @param index the index of the struct buffer
    public long indirectCommandsLayoutAt(long index) { return indirectCommandsLayout(this.segment(), index); }
    /// Sets `indirectCommandsLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayoutAt(long index, long value) { indirectCommandsLayout(this.segment(), index, value); return this; }

    /// {@return `maxSequenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSequenceCountAt(long index) { return maxSequenceCount(this.segment(), index); }
    /// Sets `maxSequenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCountAt(long index, int value) { maxSequenceCount(this.segment(), index, value); return this; }

    /// {@return `maxDrawCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxDrawCountAt(long index) { return maxDrawCount(this.segment(), index); }
    /// Sets `maxDrawCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCountAt(long index, int value) { maxDrawCount(this.segment(), index, value); return this; }

}
