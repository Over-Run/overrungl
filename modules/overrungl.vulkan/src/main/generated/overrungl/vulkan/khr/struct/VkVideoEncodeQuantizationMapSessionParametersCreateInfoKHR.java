// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkExtent2D) VkExtent2D quantizationMapTexelSize;
/// };
/// ```
public final class VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapTexelSize")
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
    /// The byte offset of `quantizationMapTexelSize`.
    public static final long OFFSET_quantizationMapTexelSize = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapTexelSize"));
    /// The memory layout of `quantizationMapTexelSize`.
    public static final MemoryLayout LAYOUT_quantizationMapTexelSize = LAYOUT.select(PathElement.groupElement("quantizationMapTexelSize"));

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR copyFrom(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `quantizationMapTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment quantizationMapTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), LAYOUT_quantizationMapTexelSize); }
    /// {@return `quantizationMapTexelSize`}
    public MemorySegment quantizationMapTexelSize() { return quantizationMapTexelSize(this.segment(), 0L); }
    /// Sets `quantizationMapTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quantizationMapTexelSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), LAYOUT_quantizationMapTexelSize.byteSize()); }
    /// Sets `quantizationMapTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(MemorySegment value) { quantizationMapTexelSize(this.segment(), 0L, value); return this; }
    /// Accepts `quantizationMapTexelSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(quantizationMapTexelSize())); return this; }

    /// Creates a slice of `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR at(long index, Consumer<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `quantizationMapTexelSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment quantizationMapTexelSizeAt(long index) { return quantizationMapTexelSize(this.segment(), index); }
    /// Sets `quantizationMapTexelSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSizeAt(long index, MemorySegment value) { quantizationMapTexelSize(this.segment(), index, value); return this; }
    /// Accepts `quantizationMapTexelSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(quantizationMapTexelSizeAt(index))); return this; }

}
