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

/// Represents `VkWriteDescriptorSetAccelerationStructureKHR`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSetAccelerationStructureKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t accelerationStructureCount;
///     const VkAccelerationStructureKHR* pAccelerationStructures;
/// };
/// ```
public final class VkWriteDescriptorSetAccelerationStructureKHR extends GroupType {
    /// The struct layout of `VkWriteDescriptorSetAccelerationStructureKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCount"),
        ValueLayout.ADDRESS.withName("pAccelerationStructures")
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
    /// The byte offset of `accelerationStructureCount`.
    public static final long OFFSET_accelerationStructureCount = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCount"));
    /// The memory layout of `accelerationStructureCount`.
    public static final MemoryLayout LAYOUT_accelerationStructureCount = LAYOUT.select(PathElement.groupElement("accelerationStructureCount"));
    /// The [VarHandle] of `accelerationStructureCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCount"));
    /// The byte offset of `pAccelerationStructures`.
    public static final long OFFSET_pAccelerationStructures = LAYOUT.byteOffset(PathElement.groupElement("pAccelerationStructures"));
    /// The memory layout of `pAccelerationStructures`.
    public static final MemoryLayout LAYOUT_pAccelerationStructures = LAYOUT.select(PathElement.groupElement("pAccelerationStructures"));
    /// The [VarHandle] of `pAccelerationStructures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAccelerationStructures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAccelerationStructures"));

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWriteDescriptorSetAccelerationStructureKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSetAccelerationStructureKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSetAccelerationStructureKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureKHR`
    public static VkWriteDescriptorSetAccelerationStructureKHR alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSetAccelerationStructureKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWriteDescriptorSetAccelerationStructureKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSetAccelerationStructureKHR`
    public static VkWriteDescriptorSetAccelerationStructureKHR alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR copyFrom(VkWriteDescriptorSetAccelerationStructureKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWriteDescriptorSetAccelerationStructureKHR reinterpret(long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkWriteDescriptorSetAccelerationStructureKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSetAccelerationStructureKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int accelerationStructureCount(MemorySegment segment, long index) { return (int) VH_accelerationStructureCount.get(segment, 0L, index); }
    /// {@return `accelerationStructureCount`}
    public int accelerationStructureCount() { return accelerationStructureCount(this.segment(), 0L); }
    /// Sets `accelerationStructureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureCount(MemorySegment segment, long index, int value) { VH_accelerationStructureCount.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCount(int value) { accelerationStructureCount(this.segment(), 0L, value); return this; }

    /// {@return `pAccelerationStructures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pAccelerationStructures(MemorySegment segment, long index) { return (MemorySegment) VH_pAccelerationStructures.get(segment, 0L, index); }
    /// {@return `pAccelerationStructures`}
    public MemorySegment pAccelerationStructures() { return pAccelerationStructures(this.segment(), 0L); }
    /// Sets `pAccelerationStructures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pAccelerationStructures(MemorySegment segment, long index, MemorySegment value) { VH_pAccelerationStructures.set(segment, 0L, index, value); }
    /// Sets `pAccelerationStructures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructures(MemorySegment value) { pAccelerationStructures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWriteDescriptorSetAccelerationStructureKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWriteDescriptorSetAccelerationStructureKHR`
    public VkWriteDescriptorSetAccelerationStructureKHR asSlice(long index) { return new VkWriteDescriptorSetAccelerationStructureKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWriteDescriptorSetAccelerationStructureKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWriteDescriptorSetAccelerationStructureKHR`
    public VkWriteDescriptorSetAccelerationStructureKHR asSlice(long index, long count) { return new VkWriteDescriptorSetAccelerationStructureKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWriteDescriptorSetAccelerationStructureKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR at(long index, Consumer<VkWriteDescriptorSetAccelerationStructureKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `accelerationStructureCount` at the given index}
    /// @param index the index of the struct buffer
    public int accelerationStructureCountAt(long index) { return accelerationStructureCount(this.segment(), index); }
    /// Sets `accelerationStructureCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR accelerationStructureCountAt(long index, int value) { accelerationStructureCount(this.segment(), index, value); return this; }

    /// {@return `pAccelerationStructures` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pAccelerationStructuresAt(long index) { return pAccelerationStructures(this.segment(), index); }
    /// Sets `pAccelerationStructures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSetAccelerationStructureKHR pAccelerationStructuresAt(long index, MemorySegment value) { pAccelerationStructures(this.segment(), index, value); return this; }

}
