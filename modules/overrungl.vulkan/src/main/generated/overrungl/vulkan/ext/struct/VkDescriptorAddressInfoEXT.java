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

/// Represents `VkDescriptorAddressInfoEXT`.
/// ## Layout
/// ```
/// struct VkDescriptorAddressInfoEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceAddress address;
///     (uint64_t) VkDeviceSize range;
///     (int) VkFormat format;
/// };
/// ```
public final class VkDescriptorAddressInfoEXT extends GroupType {
    /// The struct layout of `VkDescriptorAddressInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("address"),
        ValueLayout.JAVA_LONG.withName("range"),
        ValueLayout.JAVA_INT.withName("format")
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
    /// The byte offset of `address`.
    public static final long OFFSET_address = LAYOUT.byteOffset(PathElement.groupElement("address"));
    /// The memory layout of `address`.
    public static final MemoryLayout LAYOUT_address = LAYOUT.select(PathElement.groupElement("address"));
    /// The [VarHandle] of `address` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_address = LAYOUT.arrayElementVarHandle(PathElement.groupElement("address"));
    /// The byte offset of `range`.
    public static final long OFFSET_range = LAYOUT.byteOffset(PathElement.groupElement("range"));
    /// The memory layout of `range`.
    public static final MemoryLayout LAYOUT_range = LAYOUT.select(PathElement.groupElement("range"));
    /// The [VarHandle] of `range` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_range = LAYOUT.arrayElementVarHandle(PathElement.groupElement("range"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorAddressInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorAddressInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorAddressInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorAddressInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorAddressInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorAddressInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorAddressInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorAddressInfoEXT`
    public static VkDescriptorAddressInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorAddressInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorAddressInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorAddressInfoEXT`
    public static VkDescriptorAddressInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorAddressInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorAddressInfoEXT copyFrom(VkDescriptorAddressInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorAddressInfoEXT reinterpret(long count) { return new VkDescriptorAddressInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorAddressInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorAddressInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `address` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long address(MemorySegment segment, long index) { return (long) VH_address.get(segment, 0L, index); }
    /// {@return `address`}
    public long address() { return address(this.segment(), 0L); }
    /// Sets `address` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void address(MemorySegment segment, long index, long value) { VH_address.set(segment, 0L, index, value); }
    /// Sets `address` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT address(long value) { address(this.segment(), 0L, value); return this; }

    /// {@return `range` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long range(MemorySegment segment, long index) { return (long) VH_range.get(segment, 0L, index); }
    /// {@return `range`}
    public long range() { return range(this.segment(), 0L); }
    /// Sets `range` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void range(MemorySegment segment, long index, long value) { VH_range.set(segment, 0L, index, value); }
    /// Sets `range` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT range(long value) { range(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT format(int value) { format(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorAddressInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorAddressInfoEXT`
    public VkDescriptorAddressInfoEXT asSlice(long index) { return new VkDescriptorAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorAddressInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorAddressInfoEXT`
    public VkDescriptorAddressInfoEXT asSlice(long index, long count) { return new VkDescriptorAddressInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorAddressInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorAddressInfoEXT at(long index, Consumer<VkDescriptorAddressInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `address` at the given index}
    /// @param index the index of the struct buffer
    public long addressAt(long index) { return address(this.segment(), index); }
    /// Sets `address` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT addressAt(long index, long value) { address(this.segment(), index, value); return this; }

    /// {@return `range` at the given index}
    /// @param index the index of the struct buffer
    public long rangeAt(long index) { return range(this.segment(), index); }
    /// Sets `range` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT rangeAt(long index, long value) { range(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorAddressInfoEXT formatAt(long index, int value) { format(this.segment(), index, value); return this; }

}
