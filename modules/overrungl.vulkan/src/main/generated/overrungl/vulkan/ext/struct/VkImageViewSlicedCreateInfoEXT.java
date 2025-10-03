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

/// Represents `VkImageViewSlicedCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageViewSlicedCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t sliceOffset;
///     uint32_t sliceCount;
/// };
/// ```
public final class VkImageViewSlicedCreateInfoEXT extends GroupType {
    /// The struct layout of `VkImageViewSlicedCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sliceOffset"),
        ValueLayout.JAVA_INT.withName("sliceCount")
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
    /// The byte offset of `sliceOffset`.
    public static final long OFFSET_sliceOffset = LAYOUT.byteOffset(PathElement.groupElement("sliceOffset"));
    /// The memory layout of `sliceOffset`.
    public static final MemoryLayout LAYOUT_sliceOffset = LAYOUT.select(PathElement.groupElement("sliceOffset"));
    /// The [VarHandle] of `sliceOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sliceOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceOffset")));
    /// The byte offset of `sliceCount`.
    public static final long OFFSET_sliceCount = LAYOUT.byteOffset(PathElement.groupElement("sliceCount"));
    /// The memory layout of `sliceCount`.
    public static final MemoryLayout LAYOUT_sliceCount = LAYOUT.select(PathElement.groupElement("sliceCount"));
    /// The [VarHandle] of `sliceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sliceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceCount")));

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageViewSlicedCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSlicedCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSlicedCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSlicedCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageViewSlicedCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewSlicedCreateInfoEXT`
    public static VkImageViewSlicedCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageViewSlicedCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageViewSlicedCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewSlicedCreateInfoEXT`
    public static VkImageViewSlicedCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewSlicedCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT copyFrom(VkImageViewSlicedCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageViewSlicedCreateInfoEXT reinterpret(long count) { return new VkImageViewSlicedCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageViewSlicedCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageViewSlicedCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sliceOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sliceOffset(MemorySegment segment, long index) { return (int) VH_sliceOffset.get().get(segment, 0L, index); }
    /// {@return `sliceOffset`}
    public int sliceOffset() { return sliceOffset(this.segment(), 0L); }
    /// Sets `sliceOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sliceOffset(MemorySegment segment, long index, int value) { VH_sliceOffset.get().set(segment, 0L, index, value); }
    /// Sets `sliceOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceOffset(int value) { sliceOffset(this.segment(), 0L, value); return this; }

    /// {@return `sliceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sliceCount(MemorySegment segment, long index) { return (int) VH_sliceCount.get().get(segment, 0L, index); }
    /// {@return `sliceCount`}
    public int sliceCount() { return sliceCount(this.segment(), 0L); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sliceCount(MemorySegment segment, long index, int value) { VH_sliceCount.get().set(segment, 0L, index, value); }
    /// Sets `sliceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceCount(int value) { sliceCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageViewSlicedCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageViewSlicedCreateInfoEXT`
    public VkImageViewSlicedCreateInfoEXT asSlice(long index) { return new VkImageViewSlicedCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageViewSlicedCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageViewSlicedCreateInfoEXT`
    public VkImageViewSlicedCreateInfoEXT asSlice(long index, long count) { return new VkImageViewSlicedCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageViewSlicedCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT at(long index, Consumer<VkImageViewSlicedCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sliceOffset` at the given index}
    /// @param index the index of the struct buffer
    public int sliceOffsetAt(long index) { return sliceOffset(this.segment(), index); }
    /// Sets `sliceOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceOffsetAt(long index, int value) { sliceOffset(this.segment(), index, value); return this; }

    /// {@return `sliceCount` at the given index}
    /// @param index the index of the struct buffer
    public int sliceCountAt(long index) { return sliceCount(this.segment(), index); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceCountAt(long index, int value) { sliceCount(this.segment(), index, value); return this; }

}
