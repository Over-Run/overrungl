// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoFormatAV1QuantizationMapPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatAV1QuantizationMapPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeAV1SuperblockSizeFlagsKHR compatibleSuperblockSizes;
/// };
/// ```
public final class VkVideoFormatAV1QuantizationMapPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoFormatAV1QuantizationMapPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compatibleSuperblockSizes")
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
    /// The byte offset of `compatibleSuperblockSizes`.
    public static final long OFFSET_compatibleSuperblockSizes = LAYOUT.byteOffset(PathElement.groupElement("compatibleSuperblockSizes"));
    /// The memory layout of `compatibleSuperblockSizes`.
    public static final MemoryLayout LAYOUT_compatibleSuperblockSizes = LAYOUT.select(PathElement.groupElement("compatibleSuperblockSizes"));
    /// The [VarHandle] of `compatibleSuperblockSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compatibleSuperblockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleSuperblockSizes"));

    /// Creates `VkVideoFormatAV1QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoFormatAV1QuantizationMapPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoFormatAV1QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoFormatAV1QuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoFormatAV1QuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatAV1QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoFormatAV1QuantizationMapPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatAV1QuantizationMapPropertiesKHR`
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoFormatAV1QuantizationMapPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoFormatAV1QuantizationMapPropertiesKHR`
    public static VkVideoFormatAV1QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR copyFrom(VkVideoFormatAV1QuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoFormatAV1QuantizationMapPropertiesKHR reinterpret(long count) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `compatibleSuperblockSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compatibleSuperblockSizes(MemorySegment segment, long index) { return (int) VH_compatibleSuperblockSizes.get(segment, 0L, index); }
    /// {@return `compatibleSuperblockSizes`}
    public int compatibleSuperblockSizes() { return compatibleSuperblockSizes(this.segment(), 0L); }
    /// Sets `compatibleSuperblockSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compatibleSuperblockSizes(MemorySegment segment, long index, int value) { VH_compatibleSuperblockSizes.set(segment, 0L, index, value); }
    /// Sets `compatibleSuperblockSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR compatibleSuperblockSizes(int value) { compatibleSuperblockSizes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoFormatAV1QuantizationMapPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoFormatAV1QuantizationMapPropertiesKHR`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoFormatAV1QuantizationMapPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoFormatAV1QuantizationMapPropertiesKHR`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatAV1QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoFormatAV1QuantizationMapPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR at(long index, Consumer<VkVideoFormatAV1QuantizationMapPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `compatibleSuperblockSizes` at the given index}
    /// @param index the index of the struct buffer
    public int compatibleSuperblockSizesAt(long index) { return compatibleSuperblockSizes(this.segment(), index); }
    /// Sets `compatibleSuperblockSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatAV1QuantizationMapPropertiesKHR compatibleSuperblockSizesAt(long index, int value) { compatibleSuperblockSizes(this.segment(), index, value); return this; }

}
