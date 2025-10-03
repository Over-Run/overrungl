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

/// Represents `VkPhysicalDeviceTimelineSemaphoreProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTimelineSemaphoreProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint64_t maxTimelineSemaphoreValueDifference;
/// };
/// ```
public final class VkPhysicalDeviceTimelineSemaphoreProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTimelineSemaphoreProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("maxTimelineSemaphoreValueDifference")
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
    /// The byte offset of `maxTimelineSemaphoreValueDifference`.
    public static final long OFFSET_maxTimelineSemaphoreValueDifference = LAYOUT.byteOffset(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    /// The memory layout of `maxTimelineSemaphoreValueDifference`.
    public static final MemoryLayout LAYOUT_maxTimelineSemaphoreValueDifference = LAYOUT.select(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
    /// The [VarHandle] of `maxTimelineSemaphoreValueDifference` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTimelineSemaphoreValueDifference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));

    /// Creates `VkPhysicalDeviceTimelineSemaphoreProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTimelineSemaphoreProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTimelineSemaphoreProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTimelineSemaphoreProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTimelineSemaphoreProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTimelineSemaphoreProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTimelineSemaphoreProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTimelineSemaphoreProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTimelineSemaphoreProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTimelineSemaphoreProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTimelineSemaphoreProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTimelineSemaphoreProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTimelineSemaphoreProperties`
    public static VkPhysicalDeviceTimelineSemaphoreProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTimelineSemaphoreProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTimelineSemaphoreProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTimelineSemaphoreProperties`
    public static VkPhysicalDeviceTimelineSemaphoreProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTimelineSemaphoreProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTimelineSemaphoreProperties copyFrom(VkPhysicalDeviceTimelineSemaphoreProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTimelineSemaphoreProperties reinterpret(long count) { return new VkPhysicalDeviceTimelineSemaphoreProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTimelineSemaphoreProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTimelineSemaphoreProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxTimelineSemaphoreValueDifference` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTimelineSemaphoreValueDifference(MemorySegment segment, long index) { return (long) VH_maxTimelineSemaphoreValueDifference.get(segment, 0L, index); }
    /// {@return `maxTimelineSemaphoreValueDifference`}
    public long maxTimelineSemaphoreValueDifference() { return maxTimelineSemaphoreValueDifference(this.segment(), 0L); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTimelineSemaphoreValueDifference(MemorySegment segment, long index, long value) { VH_maxTimelineSemaphoreValueDifference.set(segment, 0L, index, value); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTimelineSemaphoreProperties maxTimelineSemaphoreValueDifference(long value) { maxTimelineSemaphoreValueDifference(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTimelineSemaphoreProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTimelineSemaphoreProperties`
    public VkPhysicalDeviceTimelineSemaphoreProperties asSlice(long index) { return new VkPhysicalDeviceTimelineSemaphoreProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTimelineSemaphoreProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTimelineSemaphoreProperties`
    public VkPhysicalDeviceTimelineSemaphoreProperties asSlice(long index, long count) { return new VkPhysicalDeviceTimelineSemaphoreProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTimelineSemaphoreProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTimelineSemaphoreProperties at(long index, Consumer<VkPhysicalDeviceTimelineSemaphoreProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTimelineSemaphoreProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTimelineSemaphoreProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxTimelineSemaphoreValueDifference` at the given index}
    /// @param index the index of the struct buffer
    public long maxTimelineSemaphoreValueDifferenceAt(long index) { return maxTimelineSemaphoreValueDifference(this.segment(), index); }
    /// Sets `maxTimelineSemaphoreValueDifference` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTimelineSemaphoreProperties maxTimelineSemaphoreValueDifferenceAt(long index, long value) { maxTimelineSemaphoreValueDifference(this.segment(), index, value); return this; }

}
