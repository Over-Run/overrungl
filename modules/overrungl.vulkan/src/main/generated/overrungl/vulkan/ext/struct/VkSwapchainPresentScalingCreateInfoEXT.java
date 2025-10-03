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

/// Represents `VkSwapchainPresentScalingCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentScalingCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPresentScalingFlagsKHR scalingBehavior;
///     ((uint32_t) VkFlags) VkPresentGravityFlagsKHR presentGravityX;
///     ((uint32_t) VkFlags) VkPresentGravityFlagsKHR presentGravityY;
/// };
/// ```
public final class VkSwapchainPresentScalingCreateInfoEXT extends GroupType {
    /// The struct layout of `VkSwapchainPresentScalingCreateInfoEXT`.
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
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `scalingBehavior`.
    public static final long OFFSET_scalingBehavior = LAYOUT.byteOffset(PathElement.groupElement("scalingBehavior"));
    /// The memory layout of `scalingBehavior`.
    public static final MemoryLayout LAYOUT_scalingBehavior = LAYOUT.select(PathElement.groupElement("scalingBehavior"));
    /// The [VarHandle] of `scalingBehavior` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_scalingBehavior = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalingBehavior")));
    /// The byte offset of `presentGravityX`.
    public static final long OFFSET_presentGravityX = LAYOUT.byteOffset(PathElement.groupElement("presentGravityX"));
    /// The memory layout of `presentGravityX`.
    public static final MemoryLayout LAYOUT_presentGravityX = LAYOUT.select(PathElement.groupElement("presentGravityX"));
    /// The [VarHandle] of `presentGravityX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_presentGravityX = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityX")));
    /// The byte offset of `presentGravityY`.
    public static final long OFFSET_presentGravityY = LAYOUT.byteOffset(PathElement.groupElement("presentGravityY"));
    /// The memory layout of `presentGravityY`.
    public static final MemoryLayout LAYOUT_presentGravityY = LAYOUT.select(PathElement.groupElement("presentGravityY"));
    /// The [VarHandle] of `presentGravityY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_presentGravityY = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityY")));

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static VkSwapchainPresentScalingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentScalingCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static VkSwapchainPresentScalingCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentScalingCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT copyFrom(VkSwapchainPresentScalingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSwapchainPresentScalingCreateInfoEXT reinterpret(long count) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `scalingBehavior` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scalingBehavior(MemorySegment segment, long index) { return (int) VH_scalingBehavior.get().get(segment, 0L, index); }
    /// {@return `scalingBehavior`}
    public int scalingBehavior() { return scalingBehavior(this.segment(), 0L); }
    /// Sets `scalingBehavior` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scalingBehavior(MemorySegment segment, long index, int value) { VH_scalingBehavior.get().set(segment, 0L, index, value); }
    /// Sets `scalingBehavior` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(int value) { scalingBehavior(this.segment(), 0L, value); return this; }

    /// {@return `presentGravityX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentGravityX(MemorySegment segment, long index) { return (int) VH_presentGravityX.get().get(segment, 0L, index); }
    /// {@return `presentGravityX`}
    public int presentGravityX() { return presentGravityX(this.segment(), 0L); }
    /// Sets `presentGravityX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentGravityX(MemorySegment segment, long index, int value) { VH_presentGravityX.get().set(segment, 0L, index, value); }
    /// Sets `presentGravityX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(int value) { presentGravityX(this.segment(), 0L, value); return this; }

    /// {@return `presentGravityY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentGravityY(MemorySegment segment, long index) { return (int) VH_presentGravityY.get().get(segment, 0L, index); }
    /// {@return `presentGravityY`}
    public int presentGravityY() { return presentGravityY(this.segment(), 0L); }
    /// Sets `presentGravityY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentGravityY(MemorySegment segment, long index, int value) { VH_presentGravityY.get().set(segment, 0L, index, value); }
    /// Sets `presentGravityY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(int value) { presentGravityY(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSwapchainPresentScalingCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSwapchainPresentScalingCreateInfoEXT`
    public VkSwapchainPresentScalingCreateInfoEXT asSlice(long index) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSwapchainPresentScalingCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSwapchainPresentScalingCreateInfoEXT`
    public VkSwapchainPresentScalingCreateInfoEXT asSlice(long index, long count) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSwapchainPresentScalingCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT at(long index, Consumer<VkSwapchainPresentScalingCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `scalingBehavior` at the given index}
    /// @param index the index of the struct buffer
    public int scalingBehaviorAt(long index) { return scalingBehavior(this.segment(), index); }
    /// Sets `scalingBehavior` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehaviorAt(long index, int value) { scalingBehavior(this.segment(), index, value); return this; }

    /// {@return `presentGravityX` at the given index}
    /// @param index the index of the struct buffer
    public int presentGravityXAt(long index) { return presentGravityX(this.segment(), index); }
    /// Sets `presentGravityX` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityXAt(long index, int value) { presentGravityX(this.segment(), index, value); return this; }

    /// {@return `presentGravityY` at the given index}
    /// @param index the index of the struct buffer
    public int presentGravityYAt(long index) { return presentGravityY(this.segment(), index); }
    /// Sets `presentGravityY` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityYAt(long index, int value) { presentGravityY(this.segment(), index, value); return this; }

}
