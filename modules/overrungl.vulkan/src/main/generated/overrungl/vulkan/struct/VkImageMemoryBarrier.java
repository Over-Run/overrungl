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

/// Represents `VkImageMemoryBarrier`.
/// ## Layout
/// ```
/// struct VkImageMemoryBarrier {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkAccessFlags srcAccessMask;
///     ((uint32_t) VkFlags) VkAccessFlags dstAccessMask;
///     (int) VkImageLayout oldLayout;
///     (int) VkImageLayout newLayout;
///     uint32_t srcQueueFamilyIndex;
///     uint32_t dstQueueFamilyIndex;
///     (uint64_t) VkImage image;
///     (struct VkImageSubresourceRange) VkImageSubresourceRange subresourceRange;
/// };
/// ```
public final class VkImageMemoryBarrier extends GroupType {
    /// The struct layout of `VkImageMemoryBarrier`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex"),
        ValueLayout.JAVA_LONG.withName("image"),
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
    /// The byte offset of `srcAccessMask`.
    public static final long OFFSET_srcAccessMask = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
    /// The memory layout of `srcAccessMask`.
    public static final MemoryLayout LAYOUT_srcAccessMask = LAYOUT.select(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The byte offset of `dstAccessMask`.
    public static final long OFFSET_dstAccessMask = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
    /// The memory layout of `dstAccessMask`.
    public static final MemoryLayout LAYOUT_dstAccessMask = LAYOUT.select(PathElement.groupElement("dstAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));
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
    /// The byte offset of `srcQueueFamilyIndex`.
    public static final long OFFSET_srcQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The memory layout of `srcQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_srcQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The [VarHandle] of `srcQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcQueueFamilyIndex"));
    /// The byte offset of `dstQueueFamilyIndex`.
    public static final long OFFSET_dstQueueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The memory layout of `dstQueueFamilyIndex`.
    public static final MemoryLayout LAYOUT_dstQueueFamilyIndex = LAYOUT.select(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The [VarHandle] of `dstQueueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstQueueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstQueueFamilyIndex"));
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout LAYOUT_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkImageMemoryBarrier` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageMemoryBarrier(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryBarrier of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryBarrier ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageMemoryBarrier ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageMemoryBarrier(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageMemoryBarrier` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageMemoryBarrier`
    public static VkImageMemoryBarrier alloc(SegmentAllocator allocator) { return new VkImageMemoryBarrier(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageMemoryBarrier` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageMemoryBarrier`
    public static VkImageMemoryBarrier alloc(SegmentAllocator allocator, long count) { return new VkImageMemoryBarrier(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageMemoryBarrier copyFrom(VkImageMemoryBarrier src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageMemoryBarrier reinterpret(long count) { return new VkImageMemoryBarrier(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageMemoryBarrier sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryBarrier pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    public int srcAccessMask() { return srcAccessMask(this.segment(), 0L); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccessMask(MemorySegment segment, long index, int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier srcAccessMask(int value) { srcAccessMask(this.segment(), 0L, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    public int dstAccessMask() { return dstAccessMask(this.segment(), 0L); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccessMask(MemorySegment segment, long index, int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier dstAccessMask(int value) { dstAccessMask(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryBarrier oldLayout(int value) { oldLayout(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryBarrier newLayout(int value) { newLayout(this.segment(), 0L, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_srcQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `srcQueueFamilyIndex`}
    public int srcQueueFamilyIndex() { return srcQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_srcQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `srcQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier srcQueueFamilyIndex(int value) { srcQueueFamilyIndex(this.segment(), 0L, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstQueueFamilyIndex(MemorySegment segment, long index) { return (int) VH_dstQueueFamilyIndex.get(segment, 0L, index); }
    /// {@return `dstQueueFamilyIndex`}
    public int dstQueueFamilyIndex() { return dstQueueFamilyIndex(this.segment(), 0L); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstQueueFamilyIndex(MemorySegment segment, long index, int value) { VH_dstQueueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `dstQueueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier dstQueueFamilyIndex(int value) { dstQueueFamilyIndex(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryBarrier image(long value) { image(this.segment(), 0L, value); return this; }

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
    public VkImageMemoryBarrier subresourceRange(MemorySegment value) { subresourceRange(this.segment(), 0L, value); return this; }
    /// Accepts `subresourceRange` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageMemoryBarrier subresourceRange(Consumer<overrungl.vulkan.struct.VkImageSubresourceRange> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceRange.of(subresourceRange())); return this; }

    /// Creates a slice of `VkImageMemoryBarrier`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageMemoryBarrier`
    public VkImageMemoryBarrier asSlice(long index) { return new VkImageMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageMemoryBarrier`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageMemoryBarrier`
    public VkImageMemoryBarrier asSlice(long index, long count) { return new VkImageMemoryBarrier(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageMemoryBarrier` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageMemoryBarrier at(long index, Consumer<VkImageMemoryBarrier> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public int srcAccessMaskAt(long index) { return srcAccessMask(this.segment(), index); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier srcAccessMaskAt(long index, int value) { srcAccessMask(this.segment(), index, value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param index the index of the struct buffer
    public int dstAccessMaskAt(long index) { return dstAccessMask(this.segment(), index); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier dstAccessMaskAt(long index, int value) { dstAccessMask(this.segment(), index, value); return this; }

    /// {@return `oldLayout` at the given index}
    /// @param index the index of the struct buffer
    public int oldLayoutAt(long index) { return oldLayout(this.segment(), index); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier oldLayoutAt(long index, int value) { oldLayout(this.segment(), index, value); return this; }

    /// {@return `newLayout` at the given index}
    /// @param index the index of the struct buffer
    public int newLayoutAt(long index) { return newLayout(this.segment(), index); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier newLayoutAt(long index, int value) { newLayout(this.segment(), index, value); return this; }

    /// {@return `srcQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int srcQueueFamilyIndexAt(long index) { return srcQueueFamilyIndex(this.segment(), index); }
    /// Sets `srcQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier srcQueueFamilyIndexAt(long index, int value) { srcQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `dstQueueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int dstQueueFamilyIndexAt(long index) { return dstQueueFamilyIndex(this.segment(), index); }
    /// Sets `dstQueueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier dstQueueFamilyIndexAt(long index, int value) { dstQueueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `image` at the given index}
    /// @param index the index of the struct buffer
    public long imageAt(long index) { return image(this.segment(), index); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier imageAt(long index, long value) { image(this.segment(), index, value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment subresourceRangeAt(long index) { return subresourceRange(this.segment(), index); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageMemoryBarrier subresourceRangeAt(long index, MemorySegment value) { subresourceRange(this.segment(), index, value); return this; }
    /// Accepts `subresourceRange` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageMemoryBarrier subresourceRangeAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceRange> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceRange.of(subresourceRangeAt(index))); return this; }

}
