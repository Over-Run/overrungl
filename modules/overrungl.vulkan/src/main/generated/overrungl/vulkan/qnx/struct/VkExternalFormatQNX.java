// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qnx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalFormatQNX`.
/// ## Layout
/// ```
/// struct VkExternalFormatQNX {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint64_t externalFormat;
/// };
/// ```
public final class VkExternalFormatQNX extends GroupType {
    /// The struct layout of `VkExternalFormatQNX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("externalFormat")
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
    /// The byte offset of `externalFormat`.
    public static final long OFFSET_externalFormat = LAYOUT.byteOffset(PathElement.groupElement("externalFormat"));
    /// The memory layout of `externalFormat`.
    public static final MemoryLayout LAYOUT_externalFormat = LAYOUT.select(PathElement.groupElement("externalFormat"));
    /// The [VarHandle] of `externalFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));

    /// Creates `VkExternalFormatQNX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalFormatQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalFormatQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFormatQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalFormatQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFormatQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalFormatQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFormatQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalFormatQNX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalFormatQNX`
    public static VkExternalFormatQNX alloc(SegmentAllocator allocator) { return new VkExternalFormatQNX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalFormatQNX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalFormatQNX`
    public static VkExternalFormatQNX alloc(SegmentAllocator allocator, long count) { return new VkExternalFormatQNX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalFormatQNX copyFrom(VkExternalFormatQNX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalFormatQNX reinterpret(long count) { return new VkExternalFormatQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExternalFormatQNX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalFormatQNX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get(segment, 0L, index); }
    /// {@return `externalFormat`}
    public long externalFormat() { return externalFormat(this.segment(), 0L); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalFormat(MemorySegment segment, long index, long value) { VH_externalFormat.set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX externalFormat(long value) { externalFormat(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalFormatQNX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalFormatQNX`
    public VkExternalFormatQNX asSlice(long index) { return new VkExternalFormatQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalFormatQNX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalFormatQNX`
    public VkExternalFormatQNX asSlice(long index, long count) { return new VkExternalFormatQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalFormatQNX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalFormatQNX at(long index, Consumer<VkExternalFormatQNX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param index the index of the struct buffer
    public long externalFormatAt(long index) { return externalFormat(this.segment(), index); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX externalFormatAt(long index, long value) { externalFormat(this.segment(), index, value); return this; }

}
