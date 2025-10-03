// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkViewportWScalingNV`.
/// ## Layout
/// ```
/// struct VkViewportWScalingNV {
///     float xcoeff;
///     float ycoeff;
/// };
/// ```
public final class VkViewportWScalingNV extends GroupType {
    /// The struct layout of `VkViewportWScalingNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );
    /// The byte offset of `xcoeff`.
    public static final long OFFSET_xcoeff = LAYOUT.byteOffset(PathElement.groupElement("xcoeff"));
    /// The memory layout of `xcoeff`.
    public static final MemoryLayout LAYOUT_xcoeff = LAYOUT.select(PathElement.groupElement("xcoeff"));
    /// The [VarHandle] of `xcoeff` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_xcoeff = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("xcoeff")));
    /// The byte offset of `ycoeff`.
    public static final long OFFSET_ycoeff = LAYOUT.byteOffset(PathElement.groupElement("ycoeff"));
    /// The memory layout of `ycoeff`.
    public static final MemoryLayout LAYOUT_ycoeff = LAYOUT.select(PathElement.groupElement("ycoeff"));
    /// The [VarHandle] of `ycoeff` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_ycoeff = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycoeff")));

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkViewportWScalingNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportWScalingNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportWScalingNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportWScalingNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV alloc(SegmentAllocator allocator) { return new VkViewportWScalingNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV alloc(SegmentAllocator allocator, long count) { return new VkViewportWScalingNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkViewportWScalingNV copyFrom(VkViewportWScalingNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkViewportWScalingNV reinterpret(long count) { return new VkViewportWScalingNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `xcoeff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float xcoeff(MemorySegment segment, long index) { return (float) VH_xcoeff.get().get(segment, 0L, index); }
    /// {@return `xcoeff`}
    public float xcoeff() { return xcoeff(this.segment(), 0L); }
    /// Sets `xcoeff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xcoeff(MemorySegment segment, long index, float value) { VH_xcoeff.get().set(segment, 0L, index, value); }
    /// Sets `xcoeff` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV xcoeff(float value) { xcoeff(this.segment(), 0L, value); return this; }

    /// {@return `ycoeff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float ycoeff(MemorySegment segment, long index) { return (float) VH_ycoeff.get().get(segment, 0L, index); }
    /// {@return `ycoeff`}
    public float ycoeff() { return ycoeff(this.segment(), 0L); }
    /// Sets `ycoeff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ycoeff(MemorySegment segment, long index, float value) { VH_ycoeff.get().set(segment, 0L, index, value); }
    /// Sets `ycoeff` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV ycoeff(float value) { ycoeff(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkViewportWScalingNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkViewportWScalingNV`
    public VkViewportWScalingNV asSlice(long index) { return new VkViewportWScalingNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkViewportWScalingNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkViewportWScalingNV`
    public VkViewportWScalingNV asSlice(long index, long count) { return new VkViewportWScalingNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkViewportWScalingNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkViewportWScalingNV at(long index, Consumer<VkViewportWScalingNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `xcoeff` at the given index}
    /// @param index the index of the struct buffer
    public float xcoeffAt(long index) { return xcoeff(this.segment(), index); }
    /// Sets `xcoeff` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV xcoeffAt(long index, float value) { xcoeff(this.segment(), index, value); return this; }

    /// {@return `ycoeff` at the given index}
    /// @param index the index of the struct buffer
    public float ycoeffAt(long index) { return ycoeff(this.segment(), index); }
    /// Sets `ycoeff` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV ycoeffAt(long index, float value) { ycoeff(this.segment(), index, value); return this; }

}
