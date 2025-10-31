// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ggp.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentFrameTokenGGP`.
/// ## Layout
/// ```
/// struct VkPresentFrameTokenGGP {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) GgpFrameToken frameToken;
/// };
/// ```
public final class VkPresentFrameTokenGGP extends GroupType {
    /// The struct layout of `VkPresentFrameTokenGGP`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("frameToken")
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
    /// The byte offset of `frameToken`.
    public static final long OFFSET_frameToken = LAYOUT.byteOffset(PathElement.groupElement("frameToken"));
    /// The memory layout of `frameToken`.
    public static final MemoryLayout LAYOUT_frameToken = LAYOUT.select(PathElement.groupElement("frameToken"));
    /// The [VarHandle] of `frameToken` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameToken = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameToken"));

    /// Creates `VkPresentFrameTokenGGP` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPresentFrameTokenGGP(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPresentFrameTokenGGP` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentFrameTokenGGP of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentFrameTokenGGP(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentFrameTokenGGP` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentFrameTokenGGP ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentFrameTokenGGP(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPresentFrameTokenGGP` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentFrameTokenGGP ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentFrameTokenGGP(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentFrameTokenGGP` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentFrameTokenGGP`
    public static VkPresentFrameTokenGGP alloc(SegmentAllocator allocator) { return new VkPresentFrameTokenGGP(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPresentFrameTokenGGP` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentFrameTokenGGP`
    public static VkPresentFrameTokenGGP alloc(SegmentAllocator allocator, long count) { return new VkPresentFrameTokenGGP(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentFrameTokenGGP copyFrom(VkPresentFrameTokenGGP src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPresentFrameTokenGGP reinterpret(long count) { return new VkPresentFrameTokenGGP(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPresentFrameTokenGGP sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPresentFrameTokenGGP pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `frameToken` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long frameToken(MemorySegment segment, long index) { return (long) VH_frameToken.get(segment, 0L, index); }
    /// {@return `frameToken`}
    public long frameToken() { return frameToken(this.segment(), 0L); }
    /// Sets `frameToken` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameToken(MemorySegment segment, long index, long value) { VH_frameToken.set(segment, 0L, index, value); }
    /// Sets `frameToken` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentFrameTokenGGP frameToken(long value) { frameToken(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPresentFrameTokenGGP`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentFrameTokenGGP`
    public VkPresentFrameTokenGGP asSlice(long index) { return new VkPresentFrameTokenGGP(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPresentFrameTokenGGP`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentFrameTokenGGP`
    public VkPresentFrameTokenGGP asSlice(long index, long count) { return new VkPresentFrameTokenGGP(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPresentFrameTokenGGP` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPresentFrameTokenGGP at(long index, Consumer<VkPresentFrameTokenGGP> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentFrameTokenGGP sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentFrameTokenGGP pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `frameToken` at the given index}
    /// @param index the index of the struct buffer
    public long frameTokenAt(long index) { return frameToken(this.segment(), index); }
    /// Sets `frameToken` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentFrameTokenGGP frameTokenAt(long index, long value) { frameToken(this.segment(), index, value); return this; }

}
