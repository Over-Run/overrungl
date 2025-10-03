// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.google.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPresentTimesInfoGOOGLE`.
/// ## Layout
/// ```
/// struct VkPresentTimesInfoGOOGLE {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkPresentTimeGOOGLE* pTimes;
/// };
/// ```
public final class VkPresentTimesInfoGOOGLE extends GroupType {
    /// The struct layout of `VkPresentTimesInfoGOOGLE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pTimes")
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
    /// The byte offset of `swapchainCount`.
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    /// The memory layout of `swapchainCount`.
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The byte offset of `pTimes`.
    public static final long OFFSET_pTimes = LAYOUT.byteOffset(PathElement.groupElement("pTimes"));
    /// The memory layout of `pTimes`.
    public static final MemoryLayout LAYOUT_pTimes = LAYOUT.select(PathElement.groupElement("pTimes"));
    /// The [VarHandle] of `pTimes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTimes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimes"));

    /// Creates `VkPresentTimesInfoGOOGLE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPresentTimesInfoGOOGLE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPresentTimesInfoGOOGLE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimesInfoGOOGLE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimesInfoGOOGLE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentTimesInfoGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimesInfoGOOGLE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimesInfoGOOGLE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPresentTimesInfoGOOGLE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentTimesInfoGOOGLE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentTimesInfoGOOGLE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentTimesInfoGOOGLE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentTimesInfoGOOGLE`
    public static VkPresentTimesInfoGOOGLE alloc(SegmentAllocator allocator) { return new VkPresentTimesInfoGOOGLE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPresentTimesInfoGOOGLE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentTimesInfoGOOGLE`
    public static VkPresentTimesInfoGOOGLE alloc(SegmentAllocator allocator, long count) { return new VkPresentTimesInfoGOOGLE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentTimesInfoGOOGLE copyFrom(VkPresentTimesInfoGOOGLE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPresentTimesInfoGOOGLE reinterpret(long count) { return new VkPresentTimesInfoGOOGLE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPresentTimesInfoGOOGLE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPresentTimesInfoGOOGLE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    public int swapchainCount() { return swapchainCount(this.segment(), 0L); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchainCount(MemorySegment segment, long index, int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentTimesInfoGOOGLE swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pTimes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTimes(MemorySegment segment, long index) { return (MemorySegment) VH_pTimes.get(segment, 0L, index); }
    /// {@return `pTimes`}
    public MemorySegment pTimes() { return pTimes(this.segment(), 0L); }
    /// Sets `pTimes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTimes(MemorySegment segment, long index, MemorySegment value) { VH_pTimes.set(segment, 0L, index, value); }
    /// Sets `pTimes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentTimesInfoGOOGLE pTimes(MemorySegment value) { pTimes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPresentTimesInfoGOOGLE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentTimesInfoGOOGLE`
    public VkPresentTimesInfoGOOGLE asSlice(long index) { return new VkPresentTimesInfoGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPresentTimesInfoGOOGLE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentTimesInfoGOOGLE`
    public VkPresentTimesInfoGOOGLE asSlice(long index, long count) { return new VkPresentTimesInfoGOOGLE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPresentTimesInfoGOOGLE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPresentTimesInfoGOOGLE at(long index, Consumer<VkPresentTimesInfoGOOGLE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentTimesInfoGOOGLE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentTimesInfoGOOGLE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainCountAt(long index) { return swapchainCount(this.segment(), index); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentTimesInfoGOOGLE swapchainCountAt(long index, int value) { swapchainCount(this.segment(), index, value); return this; }

    /// {@return `pTimes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTimesAt(long index) { return pTimes(this.segment(), index); }
    /// Sets `pTimes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentTimesInfoGOOGLE pTimesAt(long index, MemorySegment value) { pTimes(this.segment(), index, value); return this; }

}
