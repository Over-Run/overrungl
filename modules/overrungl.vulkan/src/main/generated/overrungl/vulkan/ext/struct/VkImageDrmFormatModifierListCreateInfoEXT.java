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

/// Represents `VkImageDrmFormatModifierListCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkImageDrmFormatModifierListCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t drmFormatModifierCount;
///     const uint64_t* pDrmFormatModifiers;
/// };
/// ```
public final class VkImageDrmFormatModifierListCreateInfoEXT extends GroupType {
    /// The struct layout of `VkImageDrmFormatModifierListCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withName("pDrmFormatModifiers")
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
    /// The byte offset of `drmFormatModifierCount`.
    public static final long OFFSET_drmFormatModifierCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierCount"));
    /// The memory layout of `drmFormatModifierCount`.
    public static final MemoryLayout LAYOUT_drmFormatModifierCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierCount"));
    /// The [VarHandle] of `drmFormatModifierCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_drmFormatModifierCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierCount")));
    /// The byte offset of `pDrmFormatModifiers`.
    public static final long OFFSET_pDrmFormatModifiers = LAYOUT.byteOffset(PathElement.groupElement("pDrmFormatModifiers"));
    /// The memory layout of `pDrmFormatModifiers`.
    public static final MemoryLayout LAYOUT_pDrmFormatModifiers = LAYOUT.select(PathElement.groupElement("pDrmFormatModifiers"));
    /// The [VarHandle] of `pDrmFormatModifiers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDrmFormatModifiers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrmFormatModifiers")));

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageDrmFormatModifierListCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierListCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierListCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageDrmFormatModifierListCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageDrmFormatModifierListCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageDrmFormatModifierListCreateInfoEXT`
    public static VkImageDrmFormatModifierListCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageDrmFormatModifierListCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageDrmFormatModifierListCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageDrmFormatModifierListCreateInfoEXT`
    public static VkImageDrmFormatModifierListCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageDrmFormatModifierListCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT copyFrom(VkImageDrmFormatModifierListCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageDrmFormatModifierListCreateInfoEXT reinterpret(long count) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageDrmFormatModifierListCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageDrmFormatModifierListCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drmFormatModifierCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierCount.get().get(segment, 0L, index); }
    /// {@return `drmFormatModifierCount`}
    public int drmFormatModifierCount() { return drmFormatModifierCount(this.segment(), 0L); }
    /// Sets `drmFormatModifierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierCount(MemorySegment segment, long index, int value) { VH_drmFormatModifierCount.get().set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT drmFormatModifierCount(int value) { drmFormatModifierCount(this.segment(), 0L, value); return this; }

    /// {@return `pDrmFormatModifiers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDrmFormatModifiers(MemorySegment segment, long index) { return (MemorySegment) VH_pDrmFormatModifiers.get().get(segment, 0L, index); }
    /// {@return `pDrmFormatModifiers`}
    public MemorySegment pDrmFormatModifiers() { return pDrmFormatModifiers(this.segment(), 0L); }
    /// Sets `pDrmFormatModifiers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDrmFormatModifiers(MemorySegment segment, long index, MemorySegment value) { VH_pDrmFormatModifiers.get().set(segment, 0L, index, value); }
    /// Sets `pDrmFormatModifiers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiers(MemorySegment value) { pDrmFormatModifiers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageDrmFormatModifierListCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageDrmFormatModifierListCreateInfoEXT`
    public VkImageDrmFormatModifierListCreateInfoEXT asSlice(long index) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageDrmFormatModifierListCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageDrmFormatModifierListCreateInfoEXT`
    public VkImageDrmFormatModifierListCreateInfoEXT asSlice(long index, long count) { return new VkImageDrmFormatModifierListCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageDrmFormatModifierListCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT at(long index, Consumer<VkImageDrmFormatModifierListCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `drmFormatModifierCount` at the given index}
    /// @param index the index of the struct buffer
    public int drmFormatModifierCountAt(long index) { return drmFormatModifierCount(this.segment(), index); }
    /// Sets `drmFormatModifierCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT drmFormatModifierCountAt(long index, int value) { drmFormatModifierCount(this.segment(), index, value); return this; }

    /// {@return `pDrmFormatModifiers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDrmFormatModifiersAt(long index) { return pDrmFormatModifiers(this.segment(), index); }
    /// Sets `pDrmFormatModifiers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiersAt(long index, MemorySegment value) { pDrmFormatModifiers(this.segment(), index, value); return this; }

}
