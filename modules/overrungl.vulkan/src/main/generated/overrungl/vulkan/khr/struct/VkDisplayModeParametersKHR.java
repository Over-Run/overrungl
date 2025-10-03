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

/// Represents `VkDisplayModeParametersKHR`.
/// ## Layout
/// ```
/// struct VkDisplayModeParametersKHR {
///     (struct VkExtent2D) VkExtent2D visibleRegion;
///     uint32_t refreshRate;
/// };
/// ```
public final class VkDisplayModeParametersKHR extends GroupType {
    /// The struct layout of `VkDisplayModeParametersKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    /// The byte offset of `visibleRegion`.
    public static final long OFFSET_visibleRegion = LAYOUT.byteOffset(PathElement.groupElement("visibleRegion"));
    /// The memory layout of `visibleRegion`.
    public static final MemoryLayout LAYOUT_visibleRegion = LAYOUT.select(PathElement.groupElement("visibleRegion"));
    /// The byte offset of `refreshRate`.
    public static final long OFFSET_refreshRate = LAYOUT.byteOffset(PathElement.groupElement("refreshRate"));
    /// The memory layout of `refreshRate`.
    public static final MemoryLayout LAYOUT_refreshRate = LAYOUT.select(PathElement.groupElement("refreshRate"));
    /// The [VarHandle] of `refreshRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_refreshRate = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("refreshRate")));

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDisplayModeParametersKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDisplayModeParametersKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayModeParametersKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayModeParametersKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDisplayModeParametersKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayModeParametersKHR`
    public static VkDisplayModeParametersKHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayModeParametersKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayModeParametersKHR copyFrom(VkDisplayModeParametersKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDisplayModeParametersKHR reinterpret(long count) { return new VkDisplayModeParametersKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `visibleRegion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment visibleRegion(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_visibleRegion, index), LAYOUT_visibleRegion); }
    /// {@return `visibleRegion`}
    public MemorySegment visibleRegion() { return visibleRegion(this.segment(), 0L); }
    /// Sets `visibleRegion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void visibleRegion(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_visibleRegion, index), LAYOUT_visibleRegion.byteSize()); }
    /// Sets `visibleRegion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegion(MemorySegment value) { visibleRegion(this.segment(), 0L, value); return this; }
    /// Accepts `visibleRegion` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegion(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(visibleRegion())); return this; }

    /// {@return `refreshRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int refreshRate(MemorySegment segment, long index) { return (int) VH_refreshRate.get().get(segment, 0L, index); }
    /// {@return `refreshRate`}
    public int refreshRate() { return refreshRate(this.segment(), 0L); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void refreshRate(MemorySegment segment, long index, int value) { VH_refreshRate.get().set(segment, 0L, index, value); }
    /// Sets `refreshRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR refreshRate(int value) { refreshRate(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDisplayModeParametersKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayModeParametersKHR`
    public VkDisplayModeParametersKHR asSlice(long index) { return new VkDisplayModeParametersKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDisplayModeParametersKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayModeParametersKHR`
    public VkDisplayModeParametersKHR asSlice(long index, long count) { return new VkDisplayModeParametersKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDisplayModeParametersKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDisplayModeParametersKHR at(long index, Consumer<VkDisplayModeParametersKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `visibleRegion` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment visibleRegionAt(long index) { return visibleRegion(this.segment(), index); }
    /// Sets `visibleRegion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegionAt(long index, MemorySegment value) { visibleRegion(this.segment(), index, value); return this; }
    /// Accepts `visibleRegion` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayModeParametersKHR visibleRegionAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(visibleRegionAt(index))); return this; }

    /// {@return `refreshRate` at the given index}
    /// @param index the index of the struct buffer
    public int refreshRateAt(long index) { return refreshRate(this.segment(), index); }
    /// Sets `refreshRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayModeParametersKHR refreshRateAt(long index, int value) { refreshRate(this.segment(), index, value); return this; }

}
