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

/// Represents `VkShadingRatePaletteNV`.
/// ## Layout
/// ```
/// struct VkShadingRatePaletteNV {
///     uint32_t shadingRatePaletteEntryCount;
///     const VkShadingRatePaletteEntryNV* pShadingRatePaletteEntries;
/// };
/// ```
public final class VkShadingRatePaletteNV extends GroupType {
    /// The struct layout of `VkShadingRatePaletteNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withName("pShadingRatePaletteEntries")
    );
    /// The byte offset of `shadingRatePaletteEntryCount`.
    public static final long OFFSET_shadingRatePaletteEntryCount = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The memory layout of `shadingRatePaletteEntryCount`.
    public static final MemoryLayout LAYOUT_shadingRatePaletteEntryCount = LAYOUT.select(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The [VarHandle] of `shadingRatePaletteEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shadingRatePaletteEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRatePaletteEntryCount"));
    /// The byte offset of `pShadingRatePaletteEntries`.
    public static final long OFFSET_pShadingRatePaletteEntries = LAYOUT.byteOffset(PathElement.groupElement("pShadingRatePaletteEntries"));
    /// The memory layout of `pShadingRatePaletteEntries`.
    public static final MemoryLayout LAYOUT_pShadingRatePaletteEntries = LAYOUT.select(PathElement.groupElement("pShadingRatePaletteEntries"));
    /// The [VarHandle] of `pShadingRatePaletteEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pShadingRatePaletteEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShadingRatePaletteEntries"));

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkShadingRatePaletteNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShadingRatePaletteNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShadingRatePaletteNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkShadingRatePaletteNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShadingRatePaletteNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShadingRatePaletteNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV alloc(SegmentAllocator allocator) { return new VkShadingRatePaletteNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkShadingRatePaletteNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShadingRatePaletteNV`
    public static VkShadingRatePaletteNV alloc(SegmentAllocator allocator, long count) { return new VkShadingRatePaletteNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShadingRatePaletteNV copyFrom(VkShadingRatePaletteNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkShadingRatePaletteNV reinterpret(long count) { return new VkShadingRatePaletteNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `shadingRatePaletteEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRatePaletteEntryCount(MemorySegment segment, long index) { return (int) VH_shadingRatePaletteEntryCount.get(segment, 0L, index); }
    /// {@return `shadingRatePaletteEntryCount`}
    public int shadingRatePaletteEntryCount() { return shadingRatePaletteEntryCount(this.segment(), 0L); }
    /// Sets `shadingRatePaletteEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRatePaletteEntryCount(MemorySegment segment, long index, int value) { VH_shadingRatePaletteEntryCount.set(segment, 0L, index, value); }
    /// Sets `shadingRatePaletteEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV shadingRatePaletteEntryCount(int value) { shadingRatePaletteEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pShadingRatePaletteEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pShadingRatePaletteEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pShadingRatePaletteEntries.get(segment, 0L, index); }
    /// {@return `pShadingRatePaletteEntries`}
    public MemorySegment pShadingRatePaletteEntries() { return pShadingRatePaletteEntries(this.segment(), 0L); }
    /// Sets `pShadingRatePaletteEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pShadingRatePaletteEntries(MemorySegment segment, long index, MemorySegment value) { VH_pShadingRatePaletteEntries.set(segment, 0L, index, value); }
    /// Sets `pShadingRatePaletteEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(MemorySegment value) { pShadingRatePaletteEntries(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkShadingRatePaletteNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkShadingRatePaletteNV`
    public VkShadingRatePaletteNV asSlice(long index) { return new VkShadingRatePaletteNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkShadingRatePaletteNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkShadingRatePaletteNV`
    public VkShadingRatePaletteNV asSlice(long index, long count) { return new VkShadingRatePaletteNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkShadingRatePaletteNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkShadingRatePaletteNV at(long index, Consumer<VkShadingRatePaletteNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `shadingRatePaletteEntryCount` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRatePaletteEntryCountAt(long index) { return shadingRatePaletteEntryCount(this.segment(), index); }
    /// Sets `shadingRatePaletteEntryCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV shadingRatePaletteEntryCountAt(long index, int value) { shadingRatePaletteEntryCount(this.segment(), index, value); return this; }

    /// {@return `pShadingRatePaletteEntries` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pShadingRatePaletteEntriesAt(long index) { return pShadingRatePaletteEntries(this.segment(), index); }
    /// Sets `pShadingRatePaletteEntries` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShadingRatePaletteNV pShadingRatePaletteEntriesAt(long index, MemorySegment value) { pShadingRatePaletteEntries(this.segment(), index, value); return this; }

}
