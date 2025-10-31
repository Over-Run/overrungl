// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLineRasterizationProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLineRasterizationProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t lineSubPixelPrecisionBits;
/// };
/// ```
public final class VkPhysicalDeviceLineRasterizationProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLineRasterizationProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineSubPixelPrecisionBits")
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
    /// The byte offset of `lineSubPixelPrecisionBits`.
    public static final long OFFSET_lineSubPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The memory layout of `lineSubPixelPrecisionBits`.
    public static final MemoryLayout LAYOUT_lineSubPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The [VarHandle] of `lineSubPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceLineRasterizationProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceLineRasterizationProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLineRasterizationProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLineRasterizationProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static VkPhysicalDeviceLineRasterizationProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLineRasterizationProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceLineRasterizationProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLineRasterizationProperties`
    public static VkPhysicalDeviceLineRasterizationProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLineRasterizationProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties copyFrom(VkPhysicalDeviceLineRasterizationProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceLineRasterizationProperties reinterpret(long count) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceLineRasterizationProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceLineRasterizationProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lineSubPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_lineSubPixelPrecisionBits.get(segment, 0L, index); }
    /// {@return `lineSubPixelPrecisionBits`}
    public int lineSubPixelPrecisionBits() { return lineSubPixelPrecisionBits(this.segment(), 0L); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineSubPixelPrecisionBits(MemorySegment segment, long index, int value) { VH_lineSubPixelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBits(int value) { lineSubPixelPrecisionBits(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceLineRasterizationProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLineRasterizationProperties`
    public VkPhysicalDeviceLineRasterizationProperties asSlice(long index) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceLineRasterizationProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLineRasterizationProperties`
    public VkPhysicalDeviceLineRasterizationProperties asSlice(long index, long count) { return new VkPhysicalDeviceLineRasterizationProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceLineRasterizationProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties at(long index, Consumer<VkPhysicalDeviceLineRasterizationProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param index the index of the struct buffer
    public int lineSubPixelPrecisionBitsAt(long index) { return lineSubPixelPrecisionBits(this.segment(), index); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLineRasterizationProperties lineSubPixelPrecisionBitsAt(long index, int value) { lineSubPixelPrecisionBits(this.segment(), index, value); return this; }

}
