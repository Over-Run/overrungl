// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageCompressionControlEXT`.
/// ## Layout
/// ```
/// struct VkImageCompressionControlEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkImageCompressionFlagsEXT flags;
///     uint32_t compressionControlPlaneCount;
///     VkImageCompressionFixedRateFlagsEXT* pFixedRateFlags;
/// };
/// ```
public final class VkImageCompressionControlEXT extends GroupType {
    /// The struct layout of `VkImageCompressionControlEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withName("pFixedRateFlags")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `compressionControlPlaneCount`.
    public static final long OFFSET_compressionControlPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("compressionControlPlaneCount"));
    /// The memory layout of `compressionControlPlaneCount`.
    public static final MemoryLayout LAYOUT_compressionControlPlaneCount = LAYOUT.select(PathElement.groupElement("compressionControlPlaneCount"));
    /// The [VarHandle] of `compressionControlPlaneCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compressionControlPlaneCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressionControlPlaneCount"));
    /// The byte offset of `pFixedRateFlags`.
    public static final long OFFSET_pFixedRateFlags = LAYOUT.byteOffset(PathElement.groupElement("pFixedRateFlags"));
    /// The memory layout of `pFixedRateFlags`.
    public static final MemoryLayout LAYOUT_pFixedRateFlags = LAYOUT.select(PathElement.groupElement("pFixedRateFlags"));
    /// The [VarHandle] of `pFixedRateFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFixedRateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFixedRateFlags"));

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageCompressionControlEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionControlEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionControlEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageCompressionControlEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCompressionControlEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCompressionControlEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageCompressionControlEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCompressionControlEXT`
    public static VkImageCompressionControlEXT alloc(SegmentAllocator allocator) { return new VkImageCompressionControlEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageCompressionControlEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageCompressionControlEXT`
    public static VkImageCompressionControlEXT alloc(SegmentAllocator allocator, long count) { return new VkImageCompressionControlEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageCompressionControlEXT copyFrom(VkImageCompressionControlEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageCompressionControlEXT reinterpret(long count) { return new VkImageCompressionControlEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageCompressionControlEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageCompressionControlEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `compressionControlPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compressionControlPlaneCount(MemorySegment segment, long index) { return (int) VH_compressionControlPlaneCount.get(segment, 0L, index); }
    /// {@return `compressionControlPlaneCount`}
    public int compressionControlPlaneCount() { return compressionControlPlaneCount(this.segment(), 0L); }
    /// Sets `compressionControlPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compressionControlPlaneCount(MemorySegment segment, long index, int value) { VH_compressionControlPlaneCount.set(segment, 0L, index, value); }
    /// Sets `compressionControlPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT compressionControlPlaneCount(int value) { compressionControlPlaneCount(this.segment(), 0L, value); return this; }

    /// {@return `pFixedRateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFixedRateFlags(MemorySegment segment, long index) { return (MemorySegment) VH_pFixedRateFlags.get(segment, 0L, index); }
    /// {@return `pFixedRateFlags`}
    public MemorySegment pFixedRateFlags() { return pFixedRateFlags(this.segment(), 0L); }
    /// Sets `pFixedRateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFixedRateFlags(MemorySegment segment, long index, MemorySegment value) { VH_pFixedRateFlags.set(segment, 0L, index, value); }
    /// Sets `pFixedRateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pFixedRateFlags(MemorySegment value) { pFixedRateFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageCompressionControlEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageCompressionControlEXT`
    public VkImageCompressionControlEXT asSlice(long index) { return new VkImageCompressionControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageCompressionControlEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageCompressionControlEXT`
    public VkImageCompressionControlEXT asSlice(long index, long count) { return new VkImageCompressionControlEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageCompressionControlEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageCompressionControlEXT at(long index, Consumer<VkImageCompressionControlEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `compressionControlPlaneCount` at the given index}
    /// @param index the index of the struct buffer
    public int compressionControlPlaneCountAt(long index) { return compressionControlPlaneCount(this.segment(), index); }
    /// Sets `compressionControlPlaneCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT compressionControlPlaneCountAt(long index, int value) { compressionControlPlaneCount(this.segment(), index, value); return this; }

    /// {@return `pFixedRateFlags` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pFixedRateFlagsAt(long index) { return pFixedRateFlags(this.segment(), index); }
    /// Sets `pFixedRateFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCompressionControlEXT pFixedRateFlagsAt(long index, MemorySegment value) { pFixedRateFlags(this.segment(), index, value); return this; }

}
