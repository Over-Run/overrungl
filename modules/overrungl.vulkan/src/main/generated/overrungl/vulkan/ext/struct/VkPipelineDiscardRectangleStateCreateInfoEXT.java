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

/// Represents `VkPipelineDiscardRectangleStateCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineDiscardRectangleStateCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineDiscardRectangleStateCreateFlagsEXT flags;
///     (int) VkDiscardRectangleModeEXT discardRectangleMode;
///     uint32_t discardRectangleCount;
///     const VkRect2D* pDiscardRectangles;
/// };
/// ```
public final class VkPipelineDiscardRectangleStateCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineDiscardRectangleStateCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("discardRectangleMode"),
        ValueLayout.JAVA_INT.withName("discardRectangleCount"),
        ValueLayout.ADDRESS.withName("pDiscardRectangles")
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
    /// The byte offset of `discardRectangleMode`.
    public static final long OFFSET_discardRectangleMode = LAYOUT.byteOffset(PathElement.groupElement("discardRectangleMode"));
    /// The memory layout of `discardRectangleMode`.
    public static final MemoryLayout LAYOUT_discardRectangleMode = LAYOUT.select(PathElement.groupElement("discardRectangleMode"));
    /// The [VarHandle] of `discardRectangleMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_discardRectangleMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardRectangleMode"));
    /// The byte offset of `discardRectangleCount`.
    public static final long OFFSET_discardRectangleCount = LAYOUT.byteOffset(PathElement.groupElement("discardRectangleCount"));
    /// The memory layout of `discardRectangleCount`.
    public static final MemoryLayout LAYOUT_discardRectangleCount = LAYOUT.select(PathElement.groupElement("discardRectangleCount"));
    /// The [VarHandle] of `discardRectangleCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_discardRectangleCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discardRectangleCount"));
    /// The byte offset of `pDiscardRectangles`.
    public static final long OFFSET_pDiscardRectangles = LAYOUT.byteOffset(PathElement.groupElement("pDiscardRectangles"));
    /// The memory layout of `pDiscardRectangles`.
    public static final MemoryLayout LAYOUT_pDiscardRectangles = LAYOUT.select(PathElement.groupElement("pDiscardRectangles"));
    /// The [VarHandle] of `pDiscardRectangles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDiscardRectangles = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDiscardRectangles"));

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineDiscardRectangleStateCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineDiscardRectangleStateCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public static VkPipelineDiscardRectangleStateCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT copyFrom(VkPipelineDiscardRectangleStateCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineDiscardRectangleStateCreateInfoEXT reinterpret(long count) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `discardRectangleMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int discardRectangleMode(MemorySegment segment, long index) { return (int) VH_discardRectangleMode.get(segment, 0L, index); }
    /// {@return `discardRectangleMode`}
    public int discardRectangleMode() { return discardRectangleMode(this.segment(), 0L); }
    /// Sets `discardRectangleMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void discardRectangleMode(MemorySegment segment, long index, int value) { VH_discardRectangleMode.set(segment, 0L, index, value); }
    /// Sets `discardRectangleMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(int value) { discardRectangleMode(this.segment(), 0L, value); return this; }

    /// {@return `discardRectangleCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int discardRectangleCount(MemorySegment segment, long index) { return (int) VH_discardRectangleCount.get(segment, 0L, index); }
    /// {@return `discardRectangleCount`}
    public int discardRectangleCount() { return discardRectangleCount(this.segment(), 0L); }
    /// Sets `discardRectangleCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void discardRectangleCount(MemorySegment segment, long index, int value) { VH_discardRectangleCount.set(segment, 0L, index, value); }
    /// Sets `discardRectangleCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(int value) { discardRectangleCount(this.segment(), 0L, value); return this; }

    /// {@return `pDiscardRectangles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDiscardRectangles(MemorySegment segment, long index) { return (MemorySegment) VH_pDiscardRectangles.get(segment, 0L, index); }
    /// {@return `pDiscardRectangles`}
    public MemorySegment pDiscardRectangles() { return pDiscardRectangles(this.segment(), 0L); }
    /// Sets `pDiscardRectangles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDiscardRectangles(MemorySegment segment, long index, MemorySegment value) { VH_pDiscardRectangles.set(segment, 0L, index, value); }
    /// Sets `pDiscardRectangles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(MemorySegment value) { pDiscardRectangles(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public VkPipelineDiscardRectangleStateCreateInfoEXT asSlice(long index) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineDiscardRectangleStateCreateInfoEXT`
    public VkPipelineDiscardRectangleStateCreateInfoEXT asSlice(long index, long count) { return new VkPipelineDiscardRectangleStateCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineDiscardRectangleStateCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT at(long index, Consumer<VkPipelineDiscardRectangleStateCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `discardRectangleMode` at the given index}
    /// @param index the index of the struct buffer
    public int discardRectangleModeAt(long index) { return discardRectangleMode(this.segment(), index); }
    /// Sets `discardRectangleMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleModeAt(long index, int value) { discardRectangleMode(this.segment(), index, value); return this; }

    /// {@return `discardRectangleCount` at the given index}
    /// @param index the index of the struct buffer
    public int discardRectangleCountAt(long index) { return discardRectangleCount(this.segment(), index); }
    /// Sets `discardRectangleCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCountAt(long index, int value) { discardRectangleCount(this.segment(), index, value); return this; }

    /// {@return `pDiscardRectangles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDiscardRectanglesAt(long index) { return pDiscardRectangles(this.segment(), index); }
    /// Sets `pDiscardRectangles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectanglesAt(long index, MemorySegment value) { pDiscardRectangles(this.segment(), index, value); return this; }

}
