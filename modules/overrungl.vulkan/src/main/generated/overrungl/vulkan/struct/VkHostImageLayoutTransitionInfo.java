// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHostImageLayoutTransitionInfo`.
/// ## Layout
/// ```
/// struct VkHostImageLayoutTransitionInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImage image;
///     (int) VkImageLayout oldLayout;
///     (int) VkImageLayout newLayout;
///     (struct VkImageSubresourceRange) VkImageSubresourceRange subresourceRange;
/// };
/// ```
public final class VkHostImageLayoutTransitionInfo extends GroupType {
    /// The struct layout of `VkHostImageLayoutTransitionInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
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
    /// The byte offset of `oldLayout`.
    public static final long OFFSET_oldLayout = LAYOUT.byteOffset(PathElement.groupElement("oldLayout"));
    /// The memory layout of `oldLayout`.
    public static final MemoryLayout LAYOUT_oldLayout = LAYOUT.select(PathElement.groupElement("oldLayout"));
    /// The [VarHandle] of `oldLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_oldLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldLayout"));
    /// The byte offset of `newLayout`.
    public static final long OFFSET_newLayout = LAYOUT.byteOffset(PathElement.groupElement("newLayout"));
    /// The memory layout of `newLayout`.
    public static final MemoryLayout LAYOUT_newLayout = LAYOUT.select(PathElement.groupElement("newLayout"));
    /// The [VarHandle] of `newLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_newLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("newLayout"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkHostImageLayoutTransitionInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageLayoutTransitionInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageLayoutTransitionInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageLayoutTransitionInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkHostImageLayoutTransitionInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHostImageLayoutTransitionInfo`
    public static VkHostImageLayoutTransitionInfo alloc(SegmentAllocator allocator) { return new VkHostImageLayoutTransitionInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkHostImageLayoutTransitionInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHostImageLayoutTransitionInfo`
    public static VkHostImageLayoutTransitionInfo alloc(SegmentAllocator allocator, long count) { return new VkHostImageLayoutTransitionInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkHostImageLayoutTransitionInfo copyFrom(VkHostImageLayoutTransitionInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkHostImageLayoutTransitionInfo reinterpret(long count) { return new VkHostImageLayoutTransitionInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkHostImageLayoutTransitionInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkHostImageLayoutTransitionInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkHostImageLayoutTransitionInfo image(long value) { image(this.segment(), 0L, value); return this; }

    /// {@return `oldLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int oldLayout(MemorySegment segment, long index) { return (int) VH_oldLayout.get(segment, 0L, index); }
    /// {@return `oldLayout`}
    public int oldLayout() { return oldLayout(this.segment(), 0L); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void oldLayout(MemorySegment segment, long index, int value) { VH_oldLayout.set(segment, 0L, index, value); }
    /// Sets `oldLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo oldLayout(int value) { oldLayout(this.segment(), 0L, value); return this; }

    /// {@return `newLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int newLayout(MemorySegment segment, long index) { return (int) VH_newLayout.get(segment, 0L, index); }
    /// {@return `newLayout`}
    public int newLayout() { return newLayout(this.segment(), 0L); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void newLayout(MemorySegment segment, long index, int value) { VH_newLayout.set(segment, 0L, index, value); }
    /// Sets `newLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo newLayout(int value) { newLayout(this.segment(), 0L, value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment subresourceRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange); }
    /// {@return `subresourceRange`}
    public MemorySegment subresourceRange() { return subresourceRange(this.segment(), 0L); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subresourceRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceRange, index), LAYOUT_subresourceRange.byteSize()); }
    /// Sets `subresourceRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo subresourceRange(MemorySegment value) { subresourceRange(this.segment(), 0L, value); return this; }
    /// Accepts `subresourceRange` with the given function.
    /// @param func the function
    /// @return `this`
    public VkHostImageLayoutTransitionInfo subresourceRange(Consumer<overrungl.vulkan.struct.VkImageSubresourceRange> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceRange.of(subresourceRange())); return this; }

    /// Creates a slice of `VkHostImageLayoutTransitionInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkHostImageLayoutTransitionInfo`
    public VkHostImageLayoutTransitionInfo asSlice(long index) { return new VkHostImageLayoutTransitionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkHostImageLayoutTransitionInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkHostImageLayoutTransitionInfo`
    public VkHostImageLayoutTransitionInfo asSlice(long index, long count) { return new VkHostImageLayoutTransitionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkHostImageLayoutTransitionInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkHostImageLayoutTransitionInfo at(long index, Consumer<VkHostImageLayoutTransitionInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `image` at the given index}
    /// @param index the index of the struct buffer
    public long imageAt(long index) { return image(this.segment(), index); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo imageAt(long index, long value) { image(this.segment(), index, value); return this; }

    /// {@return `oldLayout` at the given index}
    /// @param index the index of the struct buffer
    public int oldLayoutAt(long index) { return oldLayout(this.segment(), index); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo oldLayoutAt(long index, int value) { oldLayout(this.segment(), index, value); return this; }

    /// {@return `newLayout` at the given index}
    /// @param index the index of the struct buffer
    public int newLayoutAt(long index) { return newLayout(this.segment(), index); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo newLayoutAt(long index, int value) { newLayout(this.segment(), index, value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment subresourceRangeAt(long index) { return subresourceRange(this.segment(), index); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo subresourceRangeAt(long index, MemorySegment value) { subresourceRange(this.segment(), index, value); return this; }
    /// Accepts `subresourceRange` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkHostImageLayoutTransitionInfo subresourceRangeAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceRange> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceRange.of(subresourceRangeAt(index))); return this; }

}
