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

/// Represents `VkPipelineViewportDepthClipControlCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineViewportDepthClipControlCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 negativeOneToOne;
/// };
/// ```
public final class VkPipelineViewportDepthClipControlCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineViewportDepthClipControlCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("negativeOneToOne")
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
    /// The byte offset of `negativeOneToOne`.
    public static final long OFFSET_negativeOneToOne = LAYOUT.byteOffset(PathElement.groupElement("negativeOneToOne"));
    /// The memory layout of `negativeOneToOne`.
    public static final MemoryLayout LAYOUT_negativeOneToOne = LAYOUT.select(PathElement.groupElement("negativeOneToOne"));
    /// The [VarHandle] of `negativeOneToOne` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_negativeOneToOne = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("negativeOneToOne")));

    /// Creates `VkPipelineViewportDepthClipControlCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineViewportDepthClipControlCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineViewportDepthClipControlCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportDepthClipControlCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportDepthClipControlCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportDepthClipControlCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportDepthClipControlCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportDepthClipControlCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineViewportDepthClipControlCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportDepthClipControlCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportDepthClipControlCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineViewportDepthClipControlCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportDepthClipControlCreateInfoEXT`
    public static VkPipelineViewportDepthClipControlCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineViewportDepthClipControlCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineViewportDepthClipControlCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportDepthClipControlCreateInfoEXT`
    public static VkPipelineViewportDepthClipControlCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportDepthClipControlCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportDepthClipControlCreateInfoEXT copyFrom(VkPipelineViewportDepthClipControlCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineViewportDepthClipControlCreateInfoEXT reinterpret(long count) { return new VkPipelineViewportDepthClipControlCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineViewportDepthClipControlCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportDepthClipControlCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `negativeOneToOne` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int negativeOneToOne(MemorySegment segment, long index) { return (int) VH_negativeOneToOne.get().get(segment, 0L, index); }
    /// {@return `negativeOneToOne`}
    public int negativeOneToOne() { return negativeOneToOne(this.segment(), 0L); }
    /// Sets `negativeOneToOne` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void negativeOneToOne(MemorySegment segment, long index, int value) { VH_negativeOneToOne.get().set(segment, 0L, index, value); }
    /// Sets `negativeOneToOne` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClipControlCreateInfoEXT negativeOneToOne(int value) { negativeOneToOne(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineViewportDepthClipControlCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportDepthClipControlCreateInfoEXT`
    public VkPipelineViewportDepthClipControlCreateInfoEXT asSlice(long index) { return new VkPipelineViewportDepthClipControlCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineViewportDepthClipControlCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportDepthClipControlCreateInfoEXT`
    public VkPipelineViewportDepthClipControlCreateInfoEXT asSlice(long index, long count) { return new VkPipelineViewportDepthClipControlCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineViewportDepthClipControlCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineViewportDepthClipControlCreateInfoEXT at(long index, Consumer<VkPipelineViewportDepthClipControlCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClipControlCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClipControlCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `negativeOneToOne` at the given index}
    /// @param index the index of the struct buffer
    public int negativeOneToOneAt(long index) { return negativeOneToOne(this.segment(), index); }
    /// Sets `negativeOneToOne` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportDepthClipControlCreateInfoEXT negativeOneToOneAt(long index, int value) { negativeOneToOne(this.segment(), index, value); return this; }

}
