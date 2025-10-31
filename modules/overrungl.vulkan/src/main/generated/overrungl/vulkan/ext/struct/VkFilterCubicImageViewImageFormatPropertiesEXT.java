// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFilterCubicImageViewImageFormatPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkFilterCubicImageViewImageFormatPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 filterCubic;
///     (uint32_t) VkBool32 filterCubicMinmax;
/// };
/// ```
public final class VkFilterCubicImageViewImageFormatPropertiesEXT extends GroupType {
    /// The struct layout of `VkFilterCubicImageViewImageFormatPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("filterCubic"),
        ValueLayout.JAVA_INT.withName("filterCubicMinmax")
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
    /// The byte offset of `filterCubic`.
    public static final long OFFSET_filterCubic = LAYOUT.byteOffset(PathElement.groupElement("filterCubic"));
    /// The memory layout of `filterCubic`.
    public static final MemoryLayout LAYOUT_filterCubic = LAYOUT.select(PathElement.groupElement("filterCubic"));
    /// The [VarHandle] of `filterCubic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterCubic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCubic"));
    /// The byte offset of `filterCubicMinmax`.
    public static final long OFFSET_filterCubicMinmax = LAYOUT.byteOffset(PathElement.groupElement("filterCubicMinmax"));
    /// The memory layout of `filterCubicMinmax`.
    public static final MemoryLayout LAYOUT_filterCubicMinmax = LAYOUT.select(PathElement.groupElement("filterCubicMinmax"));
    /// The [VarHandle] of `filterCubicMinmax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filterCubicMinmax = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filterCubicMinmax"));

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFilterCubicImageViewImageFormatPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFilterCubicImageViewImageFormatPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT alloc(SegmentAllocator allocator) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFilterCubicImageViewImageFormatPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public static VkFilterCubicImageViewImageFormatPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT copyFrom(VkFilterCubicImageViewImageFormatPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFilterCubicImageViewImageFormatPropertiesEXT reinterpret(long count) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFilterCubicImageViewImageFormatPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `filterCubic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterCubic(MemorySegment segment, long index) { return (int) VH_filterCubic.get(segment, 0L, index); }
    /// {@return `filterCubic`}
    public int filterCubic() { return filterCubic(this.segment(), 0L); }
    /// Sets `filterCubic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterCubic(MemorySegment segment, long index, int value) { VH_filterCubic.set(segment, 0L, index, value); }
    /// Sets `filterCubic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubic(int value) { filterCubic(this.segment(), 0L, value); return this; }

    /// {@return `filterCubicMinmax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filterCubicMinmax(MemorySegment segment, long index) { return (int) VH_filterCubicMinmax.get(segment, 0L, index); }
    /// {@return `filterCubicMinmax`}
    public int filterCubicMinmax() { return filterCubicMinmax(this.segment(), 0L); }
    /// Sets `filterCubicMinmax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filterCubicMinmax(MemorySegment segment, long index, int value) { VH_filterCubicMinmax.set(segment, 0L, index, value); }
    /// Sets `filterCubicMinmax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicMinmax(int value) { filterCubicMinmax(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public VkFilterCubicImageViewImageFormatPropertiesEXT asSlice(long index) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFilterCubicImageViewImageFormatPropertiesEXT`
    public VkFilterCubicImageViewImageFormatPropertiesEXT asSlice(long index, long count) { return new VkFilterCubicImageViewImageFormatPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFilterCubicImageViewImageFormatPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT at(long index, Consumer<VkFilterCubicImageViewImageFormatPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `filterCubic` at the given index}
    /// @param index the index of the struct buffer
    public int filterCubicAt(long index) { return filterCubic(this.segment(), index); }
    /// Sets `filterCubic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicAt(long index, int value) { filterCubic(this.segment(), index, value); return this; }

    /// {@return `filterCubicMinmax` at the given index}
    /// @param index the index of the struct buffer
    public int filterCubicMinmaxAt(long index) { return filterCubicMinmax(this.segment(), index); }
    /// Sets `filterCubicMinmax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFilterCubicImageViewImageFormatPropertiesEXT filterCubicMinmaxAt(long index, int value) { filterCubicMinmax(this.segment(), index, value); return this; }

}
