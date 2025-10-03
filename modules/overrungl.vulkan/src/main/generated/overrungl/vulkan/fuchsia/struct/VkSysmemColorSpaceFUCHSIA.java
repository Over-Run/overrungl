// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.fuchsia.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSysmemColorSpaceFUCHSIA`.
/// ## Layout
/// ```
/// struct VkSysmemColorSpaceFUCHSIA {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t colorSpace;
/// };
/// ```
public final class VkSysmemColorSpaceFUCHSIA extends GroupType {
    /// The struct layout of `VkSysmemColorSpaceFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorSpace")
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
    /// The byte offset of `colorSpace`.
    public static final long OFFSET_colorSpace = LAYOUT.byteOffset(PathElement.groupElement("colorSpace"));
    /// The memory layout of `colorSpace`.
    public static final MemoryLayout LAYOUT_colorSpace = LAYOUT.select(PathElement.groupElement("colorSpace"));
    /// The [VarHandle] of `colorSpace` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorSpace = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorSpace"));

    /// Creates `VkSysmemColorSpaceFUCHSIA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSysmemColorSpaceFUCHSIA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSysmemColorSpaceFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSysmemColorSpaceFUCHSIA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSysmemColorSpaceFUCHSIA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSysmemColorSpaceFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSysmemColorSpaceFUCHSIA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSysmemColorSpaceFUCHSIA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSysmemColorSpaceFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSysmemColorSpaceFUCHSIA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSysmemColorSpaceFUCHSIA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSysmemColorSpaceFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSysmemColorSpaceFUCHSIA`
    public static VkSysmemColorSpaceFUCHSIA alloc(SegmentAllocator allocator) { return new VkSysmemColorSpaceFUCHSIA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSysmemColorSpaceFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSysmemColorSpaceFUCHSIA`
    public static VkSysmemColorSpaceFUCHSIA alloc(SegmentAllocator allocator, long count) { return new VkSysmemColorSpaceFUCHSIA(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSysmemColorSpaceFUCHSIA copyFrom(VkSysmemColorSpaceFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSysmemColorSpaceFUCHSIA reinterpret(long count) { return new VkSysmemColorSpaceFUCHSIA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSysmemColorSpaceFUCHSIA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSysmemColorSpaceFUCHSIA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `colorSpace` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorSpace(MemorySegment segment, long index) { return (int) VH_colorSpace.get(segment, 0L, index); }
    /// {@return `colorSpace`}
    public int colorSpace() { return colorSpace(this.segment(), 0L); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorSpace(MemorySegment segment, long index, int value) { VH_colorSpace.set(segment, 0L, index, value); }
    /// Sets `colorSpace` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSysmemColorSpaceFUCHSIA colorSpace(int value) { colorSpace(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSysmemColorSpaceFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSysmemColorSpaceFUCHSIA`
    public VkSysmemColorSpaceFUCHSIA asSlice(long index) { return new VkSysmemColorSpaceFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSysmemColorSpaceFUCHSIA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSysmemColorSpaceFUCHSIA`
    public VkSysmemColorSpaceFUCHSIA asSlice(long index, long count) { return new VkSysmemColorSpaceFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSysmemColorSpaceFUCHSIA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSysmemColorSpaceFUCHSIA at(long index, Consumer<VkSysmemColorSpaceFUCHSIA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSysmemColorSpaceFUCHSIA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSysmemColorSpaceFUCHSIA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `colorSpace` at the given index}
    /// @param index the index of the struct buffer
    public int colorSpaceAt(long index) { return colorSpace(this.segment(), index); }
    /// Sets `colorSpace` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSysmemColorSpaceFUCHSIA colorSpaceAt(long index, int value) { colorSpace(this.segment(), index, value); return this; }

}
