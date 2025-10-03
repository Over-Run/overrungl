// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageMemoryRequirementsInfo2`.
/// ## Layout
/// ```
/// struct VkImageMemoryRequirementsInfo2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImage image;
/// };
/// ```
public final class VkImageMemoryRequirementsInfo2 extends GroupType {
    /// The struct layout of `VkImageMemoryRequirementsInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image")
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
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));

    /// Creates `VkImageMemoryRequirementsInfo2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageMemoryRequirementsInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageMemoryRequirementsInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryRequirementsInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryRequirementsInfo2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageMemoryRequirementsInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryRequirementsInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryRequirementsInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageMemoryRequirementsInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryRequirementsInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryRequirementsInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageMemoryRequirementsInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageMemoryRequirementsInfo2`
    public static VkImageMemoryRequirementsInfo2 alloc(SegmentAllocator allocator) { return new VkImageMemoryRequirementsInfo2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageMemoryRequirementsInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageMemoryRequirementsInfo2`
    public static VkImageMemoryRequirementsInfo2 alloc(SegmentAllocator allocator, long count) { return new VkImageMemoryRequirementsInfo2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageMemoryRequirementsInfo2 copyFrom(VkImageMemoryRequirementsInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageMemoryRequirementsInfo2 reinterpret(long count) { return new VkImageMemoryRequirementsInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageMemoryRequirementsInfo2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryRequirementsInfo2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long image(MemorySegment segment, long index) { return (long) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    public long image() { return image(this.segment(), 0L); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image(MemorySegment segment, long index, long value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryRequirementsInfo2 image(long value) { image(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageMemoryRequirementsInfo2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageMemoryRequirementsInfo2`
    public VkImageMemoryRequirementsInfo2 asSlice(long index) { return new VkImageMemoryRequirementsInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageMemoryRequirementsInfo2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageMemoryRequirementsInfo2`
    public VkImageMemoryRequirementsInfo2 asSlice(long index, long count) { return new VkImageMemoryRequirementsInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageMemoryRequirementsInfo2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageMemoryRequirementsInfo2 at(long index, Consumer<VkImageMemoryRequirementsInfo2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryRequirementsInfo2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryRequirementsInfo2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `image` at the given index}
    /// @param index the index of the struct buffer
    public long imageAt(long index) { return image(this.segment(), index); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryRequirementsInfo2 imageAt(long index, long value) { image(this.segment(), index, value); return this; }

}
