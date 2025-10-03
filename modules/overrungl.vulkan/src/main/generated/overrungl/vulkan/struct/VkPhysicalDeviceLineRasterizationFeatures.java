// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLineRasterizationFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLineRasterizationFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 rectangularLines;
///     (uint32_t) VkBool32 bresenhamLines;
///     (uint32_t) VkBool32 smoothLines;
///     (uint32_t) VkBool32 stippledRectangularLines;
///     (uint32_t) VkBool32 stippledBresenhamLines;
///     (uint32_t) VkBool32 stippledSmoothLines;
/// };
/// ```
public final class VkPhysicalDeviceLineRasterizationFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLineRasterizationFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines")
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
    /// The byte offset of `rectangularLines`.
    public static final long OFFSET_rectangularLines = LAYOUT.byteOffset(PathElement.groupElement("rectangularLines"));
    /// The memory layout of `rectangularLines`.
    public static final MemoryLayout LAYOUT_rectangularLines = LAYOUT.select(PathElement.groupElement("rectangularLines"));
    /// The [VarHandle] of `rectangularLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_rectangularLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangularLines")));
    /// The byte offset of `bresenhamLines`.
    public static final long OFFSET_bresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("bresenhamLines"));
    /// The memory layout of `bresenhamLines`.
    public static final MemoryLayout LAYOUT_bresenhamLines = LAYOUT.select(PathElement.groupElement("bresenhamLines"));
    /// The [VarHandle] of `bresenhamLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_bresenhamLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("bresenhamLines")));
    /// The byte offset of `smoothLines`.
    public static final long OFFSET_smoothLines = LAYOUT.byteOffset(PathElement.groupElement("smoothLines"));
    /// The memory layout of `smoothLines`.
    public static final MemoryLayout LAYOUT_smoothLines = LAYOUT.select(PathElement.groupElement("smoothLines"));
    /// The [VarHandle] of `smoothLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_smoothLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("smoothLines")));
    /// The byte offset of `stippledRectangularLines`.
    public static final long OFFSET_stippledRectangularLines = LAYOUT.byteOffset(PathElement.groupElement("stippledRectangularLines"));
    /// The memory layout of `stippledRectangularLines`.
    public static final MemoryLayout LAYOUT_stippledRectangularLines = LAYOUT.select(PathElement.groupElement("stippledRectangularLines"));
    /// The [VarHandle] of `stippledRectangularLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stippledRectangularLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledRectangularLines")));
    /// The byte offset of `stippledBresenhamLines`.
    public static final long OFFSET_stippledBresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("stippledBresenhamLines"));
    /// The memory layout of `stippledBresenhamLines`.
    public static final MemoryLayout LAYOUT_stippledBresenhamLines = LAYOUT.select(PathElement.groupElement("stippledBresenhamLines"));
    /// The [VarHandle] of `stippledBresenhamLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stippledBresenhamLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledBresenhamLines")));
    /// The byte offset of `stippledSmoothLines`.
    public static final long OFFSET_stippledSmoothLines = LAYOUT.byteOffset(PathElement.groupElement("stippledSmoothLines"));
    /// The memory layout of `stippledSmoothLines`.
    public static final MemoryLayout LAYOUT_stippledSmoothLines = LAYOUT.select(PathElement.groupElement("stippledSmoothLines"));
    /// The [VarHandle] of `stippledSmoothLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stippledSmoothLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledSmoothLines")));

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceLineRasterizationFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceLineRasterizationFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLineRasterizationFeatures`
    public static VkPhysicalDeviceLineRasterizationFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLineRasterizationFeatures`
    public static VkPhysicalDeviceLineRasterizationFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLineRasterizationFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures copyFrom(VkPhysicalDeviceLineRasterizationFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceLineRasterizationFeatures reinterpret(long count) { return new VkPhysicalDeviceLineRasterizationFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceLineRasterizationFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceLineRasterizationFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rectangularLines(MemorySegment segment, long index) { return (int) VH_rectangularLines.get().get(segment, 0L, index); }
    /// {@return `rectangularLines`}
    public int rectangularLines() { return rectangularLines(this.segment(), 0L); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rectangularLines(MemorySegment segment, long index, int value) { VH_rectangularLines.get().set(segment, 0L, index, value); }
    /// Sets `rectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures rectangularLines(int value) { rectangularLines(this.segment(), 0L, value); return this; }

    /// {@return `bresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bresenhamLines(MemorySegment segment, long index) { return (int) VH_bresenhamLines.get().get(segment, 0L, index); }
    /// {@return `bresenhamLines`}
    public int bresenhamLines() { return bresenhamLines(this.segment(), 0L); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bresenhamLines(MemorySegment segment, long index, int value) { VH_bresenhamLines.get().set(segment, 0L, index, value); }
    /// Sets `bresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(int value) { bresenhamLines(this.segment(), 0L, value); return this; }

    /// {@return `smoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int smoothLines(MemorySegment segment, long index) { return (int) VH_smoothLines.get().get(segment, 0L, index); }
    /// {@return `smoothLines`}
    public int smoothLines() { return smoothLines(this.segment(), 0L); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void smoothLines(MemorySegment segment, long index, int value) { VH_smoothLines.get().set(segment, 0L, index, value); }
    /// Sets `smoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures smoothLines(int value) { smoothLines(this.segment(), 0L, value); return this; }

    /// {@return `stippledRectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledRectangularLines(MemorySegment segment, long index) { return (int) VH_stippledRectangularLines.get().get(segment, 0L, index); }
    /// {@return `stippledRectangularLines`}
    public int stippledRectangularLines() { return stippledRectangularLines(this.segment(), 0L); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledRectangularLines(MemorySegment segment, long index, int value) { VH_stippledRectangularLines.get().set(segment, 0L, index, value); }
    /// Sets `stippledRectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(int value) { stippledRectangularLines(this.segment(), 0L, value); return this; }

    /// {@return `stippledBresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledBresenhamLines(MemorySegment segment, long index) { return (int) VH_stippledBresenhamLines.get().get(segment, 0L, index); }
    /// {@return `stippledBresenhamLines`}
    public int stippledBresenhamLines() { return stippledBresenhamLines(this.segment(), 0L); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledBresenhamLines(MemorySegment segment, long index, int value) { VH_stippledBresenhamLines.get().set(segment, 0L, index, value); }
    /// Sets `stippledBresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(int value) { stippledBresenhamLines(this.segment(), 0L, value); return this; }

    /// {@return `stippledSmoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledSmoothLines(MemorySegment segment, long index) { return (int) VH_stippledSmoothLines.get().get(segment, 0L, index); }
    /// {@return `stippledSmoothLines`}
    public int stippledSmoothLines() { return stippledSmoothLines(this.segment(), 0L); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledSmoothLines(MemorySegment segment, long index, int value) { VH_stippledSmoothLines.get().set(segment, 0L, index, value); }
    /// Sets `stippledSmoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(int value) { stippledSmoothLines(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceLineRasterizationFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLineRasterizationFeatures`
    public VkPhysicalDeviceLineRasterizationFeatures asSlice(long index) { return new VkPhysicalDeviceLineRasterizationFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceLineRasterizationFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLineRasterizationFeatures`
    public VkPhysicalDeviceLineRasterizationFeatures asSlice(long index, long count) { return new VkPhysicalDeviceLineRasterizationFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceLineRasterizationFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures at(long index, Consumer<VkPhysicalDeviceLineRasterizationFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `rectangularLines` at the given index}
    /// @param index the index of the struct buffer
    public int rectangularLinesAt(long index) { return rectangularLines(this.segment(), index); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures rectangularLinesAt(long index, int value) { rectangularLines(this.segment(), index, value); return this; }

    /// {@return `bresenhamLines` at the given index}
    /// @param index the index of the struct buffer
    public int bresenhamLinesAt(long index) { return bresenhamLines(this.segment(), index); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLinesAt(long index, int value) { bresenhamLines(this.segment(), index, value); return this; }

    /// {@return `smoothLines` at the given index}
    /// @param index the index of the struct buffer
    public int smoothLinesAt(long index) { return smoothLines(this.segment(), index); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures smoothLinesAt(long index, int value) { smoothLines(this.segment(), index, value); return this; }

    /// {@return `stippledRectangularLines` at the given index}
    /// @param index the index of the struct buffer
    public int stippledRectangularLinesAt(long index) { return stippledRectangularLines(this.segment(), index); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLinesAt(long index, int value) { stippledRectangularLines(this.segment(), index, value); return this; }

    /// {@return `stippledBresenhamLines` at the given index}
    /// @param index the index of the struct buffer
    public int stippledBresenhamLinesAt(long index) { return stippledBresenhamLines(this.segment(), index); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLinesAt(long index, int value) { stippledBresenhamLines(this.segment(), index, value); return this; }

    /// {@return `stippledSmoothLines` at the given index}
    /// @param index the index of the struct buffer
    public int stippledSmoothLinesAt(long index) { return stippledSmoothLines(this.segment(), index); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLinesAt(long index, int value) { stippledSmoothLines(this.segment(), index, value); return this; }

}
