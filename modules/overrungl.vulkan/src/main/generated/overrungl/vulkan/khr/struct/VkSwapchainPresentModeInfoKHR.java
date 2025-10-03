// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentModeInfoKHR`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentModeInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkPresentModeKHR* pPresentModes;
/// };
/// ```
public final class VkSwapchainPresentModeInfoKHR extends GroupType {
    /// The struct layout of `VkSwapchainPresentModeInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
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
    /// The byte offset of `pPresentModes`.
    public static final long OFFSET_pPresentModes = LAYOUT.byteOffset(PathElement.groupElement("pPresentModes"));
    /// The memory layout of `pPresentModes`.
    public static final MemoryLayout LAYOUT_pPresentModes = LAYOUT.select(PathElement.groupElement("pPresentModes"));
    /// The [VarHandle] of `pPresentModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPresentModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes"));

    /// Creates `VkSwapchainPresentModeInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSwapchainPresentModeInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSwapchainPresentModeInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentModeInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentModeInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentModeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentModeInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentModeInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSwapchainPresentModeInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentModeInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentModeInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSwapchainPresentModeInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentModeInfoKHR`
    public static VkSwapchainPresentModeInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainPresentModeInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSwapchainPresentModeInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentModeInfoKHR`
    public static VkSwapchainPresentModeInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentModeInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR copyFrom(VkSwapchainPresentModeInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSwapchainPresentModeInfoKHR reinterpret(long count) { return new VkSwapchainPresentModeInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSwapchainPresentModeInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSwapchainPresentModeInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkSwapchainPresentModeInfoKHR swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPresentModes(MemorySegment segment, long index) { return (MemorySegment) VH_pPresentModes.get(segment, 0L, index); }
    /// {@return `pPresentModes`}
    public MemorySegment pPresentModes() { return pPresentModes(this.segment(), 0L); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPresentModes(MemorySegment segment, long index, MemorySegment value) { VH_pPresentModes.set(segment, 0L, index, value); }
    /// Sets `pPresentModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR pPresentModes(MemorySegment value) { pPresentModes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSwapchainPresentModeInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSwapchainPresentModeInfoKHR`
    public VkSwapchainPresentModeInfoKHR asSlice(long index) { return new VkSwapchainPresentModeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSwapchainPresentModeInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSwapchainPresentModeInfoKHR`
    public VkSwapchainPresentModeInfoKHR asSlice(long index, long count) { return new VkSwapchainPresentModeInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSwapchainPresentModeInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR at(long index, Consumer<VkSwapchainPresentModeInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainCountAt(long index) { return swapchainCount(this.segment(), index); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR swapchainCountAt(long index, int value) { swapchainCount(this.segment(), index, value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPresentModesAt(long index) { return pPresentModes(this.segment(), index); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentModeInfoKHR pPresentModesAt(long index, MemorySegment value) { pPresentModes(this.segment(), index, value); return this; }

}
