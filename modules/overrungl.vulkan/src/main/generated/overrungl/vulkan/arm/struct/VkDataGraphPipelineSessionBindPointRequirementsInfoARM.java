// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineSessionBindPointRequirementsInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDataGraphPipelineSessionARM session;
/// };
/// ```
public final class VkDataGraphPipelineSessionBindPointRequirementsInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("session")
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
    /// The byte offset of `session`.
    public static final long OFFSET_session = LAYOUT.byteOffset(PathElement.groupElement("session"));
    /// The memory layout of `session`.
    public static final MemoryLayout LAYOUT_session = LAYOUT.select(PathElement.groupElement("session"));
    /// The [VarHandle] of `session` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_session = LAYOUT.arrayElementVarHandle(PathElement.groupElement("session"));

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`
    public static VkDataGraphPipelineSessionBindPointRequirementsInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM copyFrom(VkDataGraphPipelineSessionBindPointRequirementsInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM reinterpret(long count) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `session` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long session(MemorySegment segment, long index) { return (long) VH_session.get(segment, 0L, index); }
    /// {@return `session`}
    public long session() { return session(this.segment(), 0L); }
    /// Sets `session` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void session(MemorySegment segment, long index, long value) { VH_session.set(segment, 0L, index, value); }
    /// Sets `session` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM session(long value) { session(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM asSlice(long index) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineSessionBindPointRequirementsInfoARM`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineSessionBindPointRequirementsInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineSessionBindPointRequirementsInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM at(long index, Consumer<VkDataGraphPipelineSessionBindPointRequirementsInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `session` at the given index}
    /// @param index the index of the struct buffer
    public long sessionAt(long index) { return session(this.segment(), index); }
    /// Sets `session` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineSessionBindPointRequirementsInfoARM sessionAt(long index, long value) { session(this.segment(), index, value); return this; }

}
