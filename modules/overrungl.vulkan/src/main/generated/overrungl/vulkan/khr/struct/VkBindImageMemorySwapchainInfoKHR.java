// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindImageMemorySwapchainInfoKHR`.
/// ## Layout
/// ```
/// struct VkBindImageMemorySwapchainInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSwapchainKHR swapchain;
///     uint32_t imageIndex;
/// };
/// ```
public final class VkBindImageMemorySwapchainInfoKHR extends GroupType {
    /// The struct layout of `VkBindImageMemorySwapchainInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndex")
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
    /// The byte offset of `swapchain`.
    public static final long OFFSET_swapchain = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
    /// The memory layout of `swapchain`.
    public static final MemoryLayout LAYOUT_swapchain = LAYOUT.select(PathElement.groupElement("swapchain"));
    /// The [VarHandle] of `swapchain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchain"));
    /// The byte offset of `imageIndex`.
    public static final long OFFSET_imageIndex = LAYOUT.byteOffset(PathElement.groupElement("imageIndex"));
    /// The memory layout of `imageIndex`.
    public static final MemoryLayout LAYOUT_imageIndex = LAYOUT.select(PathElement.groupElement("imageIndex"));
    /// The [VarHandle] of `imageIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageIndex"));

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindImageMemorySwapchainInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindImageMemorySwapchainInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImageMemorySwapchainInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImageMemorySwapchainInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR alloc(SegmentAllocator allocator) { return new VkBindImageMemorySwapchainInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindImageMemorySwapchainInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImageMemorySwapchainInfoKHR`
    public static VkBindImageMemorySwapchainInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBindImageMemorySwapchainInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR copyFrom(VkBindImageMemorySwapchainInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindImageMemorySwapchainInfoKHR reinterpret(long count) { return new VkBindImageMemorySwapchainInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindImageMemorySwapchainInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindImageMemorySwapchainInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long swapchain(MemorySegment segment, long index) { return (long) VH_swapchain.get(segment, 0L, index); }
    /// {@return `swapchain`}
    public long swapchain() { return swapchain(this.segment(), 0L); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchain(MemorySegment segment, long index, long value) { VH_swapchain.set(segment, 0L, index, value); }
    /// Sets `swapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR swapchain(long value) { swapchain(this.segment(), 0L, value); return this; }

    /// {@return `imageIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageIndex(MemorySegment segment, long index) { return (int) VH_imageIndex.get(segment, 0L, index); }
    /// {@return `imageIndex`}
    public int imageIndex() { return imageIndex(this.segment(), 0L); }
    /// Sets `imageIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageIndex(MemorySegment segment, long index, int value) { VH_imageIndex.set(segment, 0L, index, value); }
    /// Sets `imageIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR imageIndex(int value) { imageIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindImageMemorySwapchainInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindImageMemorySwapchainInfoKHR`
    public VkBindImageMemorySwapchainInfoKHR asSlice(long index) { return new VkBindImageMemorySwapchainInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindImageMemorySwapchainInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindImageMemorySwapchainInfoKHR`
    public VkBindImageMemorySwapchainInfoKHR asSlice(long index, long count) { return new VkBindImageMemorySwapchainInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindImageMemorySwapchainInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR at(long index, Consumer<VkBindImageMemorySwapchainInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchain` at the given index}
    /// @param index the index of the struct buffer
    public long swapchainAt(long index) { return swapchain(this.segment(), index); }
    /// Sets `swapchain` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR swapchainAt(long index, long value) { swapchain(this.segment(), index, value); return this; }

    /// {@return `imageIndex` at the given index}
    /// @param index the index of the struct buffer
    public int imageIndexAt(long index) { return imageIndex(this.segment(), index); }
    /// Sets `imageIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImageMemorySwapchainInfoKHR imageIndexAt(long index, int value) { imageIndex(this.segment(), index, value); return this; }

}
