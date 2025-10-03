// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMicromapTriangleEXT`.
/// ## Layout
/// ```
/// struct VkMicromapTriangleEXT {
///     uint32_t dataOffset;
///     uint16_t subdivisionLevel;
///     uint16_t format;
/// };
/// ```
public final class VkMicromapTriangleEXT extends GroupType {
    /// The struct layout of `VkMicromapTriangleEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("dataOffset"),
        ValueLayout.JAVA_SHORT.withName("subdivisionLevel"),
        ValueLayout.JAVA_SHORT.withName("format")
    );
    /// The byte offset of `dataOffset`.
    public static final long OFFSET_dataOffset = LAYOUT.byteOffset(PathElement.groupElement("dataOffset"));
    /// The memory layout of `dataOffset`.
    public static final MemoryLayout LAYOUT_dataOffset = LAYOUT.select(PathElement.groupElement("dataOffset"));
    /// The [VarHandle] of `dataOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dataOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataOffset")));
    /// The byte offset of `subdivisionLevel`.
    public static final long OFFSET_subdivisionLevel = LAYOUT.byteOffset(PathElement.groupElement("subdivisionLevel"));
    /// The memory layout of `subdivisionLevel`.
    public static final MemoryLayout LAYOUT_subdivisionLevel = LAYOUT.select(PathElement.groupElement("subdivisionLevel"));
    /// The [VarHandle] of `subdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subdivisionLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subdivisionLevel")));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_format = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("format")));

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMicromapTriangleEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapTriangleEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapTriangleEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMicromapTriangleEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMicromapTriangleEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMicromapTriangleEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMicromapTriangleEXT`
    public static VkMicromapTriangleEXT alloc(SegmentAllocator allocator) { return new VkMicromapTriangleEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMicromapTriangleEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMicromapTriangleEXT`
    public static VkMicromapTriangleEXT alloc(SegmentAllocator allocator, long count) { return new VkMicromapTriangleEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMicromapTriangleEXT copyFrom(VkMicromapTriangleEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMicromapTriangleEXT reinterpret(long count) { return new VkMicromapTriangleEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `dataOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dataOffset(MemorySegment segment, long index) { return (int) VH_dataOffset.get().get(segment, 0L, index); }
    /// {@return `dataOffset`}
    public int dataOffset() { return dataOffset(this.segment(), 0L); }
    /// Sets `dataOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataOffset(MemorySegment segment, long index, int value) { VH_dataOffset.get().set(segment, 0L, index, value); }
    /// Sets `dataOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT dataOffset(int value) { dataOffset(this.segment(), 0L, value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short subdivisionLevel(MemorySegment segment, long index) { return (short) VH_subdivisionLevel.get().get(segment, 0L, index); }
    /// {@return `subdivisionLevel`}
    public short subdivisionLevel() { return subdivisionLevel(this.segment(), 0L); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subdivisionLevel(MemorySegment segment, long index, short value) { VH_subdivisionLevel.get().set(segment, 0L, index, value); }
    /// Sets `subdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT subdivisionLevel(short value) { subdivisionLevel(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short format(MemorySegment segment, long index) { return (short) VH_format.get().get(segment, 0L, index); }
    /// {@return `format`}
    public short format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, short value) { VH_format.get().set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT format(short value) { format(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMicromapTriangleEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMicromapTriangleEXT`
    public VkMicromapTriangleEXT asSlice(long index) { return new VkMicromapTriangleEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMicromapTriangleEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMicromapTriangleEXT`
    public VkMicromapTriangleEXT asSlice(long index, long count) { return new VkMicromapTriangleEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMicromapTriangleEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMicromapTriangleEXT at(long index, Consumer<VkMicromapTriangleEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `dataOffset` at the given index}
    /// @param index the index of the struct buffer
    public int dataOffsetAt(long index) { return dataOffset(this.segment(), index); }
    /// Sets `dataOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT dataOffsetAt(long index, int value) { dataOffset(this.segment(), index, value); return this; }

    /// {@return `subdivisionLevel` at the given index}
    /// @param index the index of the struct buffer
    public short subdivisionLevelAt(long index) { return subdivisionLevel(this.segment(), index); }
    /// Sets `subdivisionLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT subdivisionLevelAt(long index, short value) { subdivisionLevel(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public short formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMicromapTriangleEXT formatAt(long index, short value) { format(this.segment(), index, value); return this; }

}
