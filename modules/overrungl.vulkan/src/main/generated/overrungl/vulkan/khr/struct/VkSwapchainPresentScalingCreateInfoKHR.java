// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentScalingCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentScalingCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPresentScalingFlagsKHR scalingBehavior;
///     ((uint32_t) VkFlags) VkPresentGravityFlagsKHR presentGravityX;
///     ((uint32_t) VkFlags) VkPresentGravityFlagsKHR presentGravityY;
/// };
/// ```
public final class VkSwapchainPresentScalingCreateInfoKHR extends GroupType {
    /// The struct layout of `VkSwapchainPresentScalingCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
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
    /// The byte offset of `scalingBehavior`.
    public static final long OFFSET_scalingBehavior = LAYOUT.byteOffset(PathElement.groupElement("scalingBehavior"));
    /// The memory layout of `scalingBehavior`.
    public static final MemoryLayout LAYOUT_scalingBehavior = LAYOUT.select(PathElement.groupElement("scalingBehavior"));
    /// The [VarHandle] of `scalingBehavior` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scalingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalingBehavior"));
    /// The byte offset of `presentGravityX`.
    public static final long OFFSET_presentGravityX = LAYOUT.byteOffset(PathElement.groupElement("presentGravityX"));
    /// The memory layout of `presentGravityX`.
    public static final MemoryLayout LAYOUT_presentGravityX = LAYOUT.select(PathElement.groupElement("presentGravityX"));
    /// The [VarHandle] of `presentGravityX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityX"));
    /// The byte offset of `presentGravityY`.
    public static final long OFFSET_presentGravityY = LAYOUT.byteOffset(PathElement.groupElement("presentGravityY"));
    /// The memory layout of `presentGravityY`.
    public static final MemoryLayout LAYOUT_presentGravityY = LAYOUT.select(PathElement.groupElement("presentGravityY"));
    /// The [VarHandle] of `presentGravityY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityY"));

    /// Creates `VkSwapchainPresentScalingCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSwapchainPresentScalingCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSwapchainPresentScalingCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentScalingCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSwapchainPresentScalingCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoKHR`
    public static VkSwapchainPresentScalingCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSwapchainPresentScalingCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoKHR`
    public static VkSwapchainPresentScalingCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentScalingCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR copyFrom(VkSwapchainPresentScalingCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSwapchainPresentScalingCreateInfoKHR reinterpret(long count) { return new VkSwapchainPresentScalingCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSwapchainPresentScalingCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSwapchainPresentScalingCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `scalingBehavior` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scalingBehavior(MemorySegment segment, long index) { return (int) VH_scalingBehavior.get(segment, 0L, index); }
    /// {@return `scalingBehavior`}
    public int scalingBehavior() { return scalingBehavior(this.segment(), 0L); }
    /// Sets `scalingBehavior` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scalingBehavior(MemorySegment segment, long index, int value) { VH_scalingBehavior.set(segment, 0L, index, value); }
    /// Sets `scalingBehavior` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR scalingBehavior(int value) { scalingBehavior(this.segment(), 0L, value); return this; }

    /// {@return `presentGravityX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentGravityX(MemorySegment segment, long index) { return (int) VH_presentGravityX.get(segment, 0L, index); }
    /// {@return `presentGravityX`}
    public int presentGravityX() { return presentGravityX(this.segment(), 0L); }
    /// Sets `presentGravityX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentGravityX(MemorySegment segment, long index, int value) { VH_presentGravityX.set(segment, 0L, index, value); }
    /// Sets `presentGravityX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityX(int value) { presentGravityX(this.segment(), 0L, value); return this; }

    /// {@return `presentGravityY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentGravityY(MemorySegment segment, long index) { return (int) VH_presentGravityY.get(segment, 0L, index); }
    /// {@return `presentGravityY`}
    public int presentGravityY() { return presentGravityY(this.segment(), 0L); }
    /// Sets `presentGravityY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentGravityY(MemorySegment segment, long index, int value) { VH_presentGravityY.set(segment, 0L, index, value); }
    /// Sets `presentGravityY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityY(int value) { presentGravityY(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSwapchainPresentScalingCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSwapchainPresentScalingCreateInfoKHR`
    public VkSwapchainPresentScalingCreateInfoKHR asSlice(long index) { return new VkSwapchainPresentScalingCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSwapchainPresentScalingCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSwapchainPresentScalingCreateInfoKHR`
    public VkSwapchainPresentScalingCreateInfoKHR asSlice(long index, long count) { return new VkSwapchainPresentScalingCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSwapchainPresentScalingCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR at(long index, Consumer<VkSwapchainPresentScalingCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `scalingBehavior` at the given index}
    /// @param index the index of the struct buffer
    public int scalingBehaviorAt(long index) { return scalingBehavior(this.segment(), index); }
    /// Sets `scalingBehavior` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR scalingBehaviorAt(long index, int value) { scalingBehavior(this.segment(), index, value); return this; }

    /// {@return `presentGravityX` at the given index}
    /// @param index the index of the struct buffer
    public int presentGravityXAt(long index) { return presentGravityX(this.segment(), index); }
    /// Sets `presentGravityX` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityXAt(long index, int value) { presentGravityX(this.segment(), index, value); return this; }

    /// {@return `presentGravityY` at the given index}
    /// @param index the index of the struct buffer
    public int presentGravityYAt(long index) { return presentGravityY(this.segment(), index); }
    /// Sets `presentGravityY` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityYAt(long index, int value) { presentGravityY(this.segment(), index, value); return this; }

}
