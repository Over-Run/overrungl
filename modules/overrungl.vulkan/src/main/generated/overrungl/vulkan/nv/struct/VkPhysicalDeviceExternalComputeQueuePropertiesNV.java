// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalComputeQueuePropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalComputeQueuePropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t externalDataSize;
///     uint32_t maxExternalQueues;
/// };
/// ```
public final class VkPhysicalDeviceExternalComputeQueuePropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalComputeQueuePropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalDataSize"),
        ValueLayout.JAVA_INT.withName("maxExternalQueues")
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
    /// The byte offset of `externalDataSize`.
    public static final long OFFSET_externalDataSize = LAYOUT.byteOffset(PathElement.groupElement("externalDataSize"));
    /// The memory layout of `externalDataSize`.
    public static final MemoryLayout LAYOUT_externalDataSize = LAYOUT.select(PathElement.groupElement("externalDataSize"));
    /// The [VarHandle] of `externalDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalDataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalDataSize"));
    /// The byte offset of `maxExternalQueues`.
    public static final long OFFSET_maxExternalQueues = LAYOUT.byteOffset(PathElement.groupElement("maxExternalQueues"));
    /// The memory layout of `maxExternalQueues`.
    public static final MemoryLayout LAYOUT_maxExternalQueues = LAYOUT.select(PathElement.groupElement("maxExternalQueues"));
    /// The [VarHandle] of `maxExternalQueues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxExternalQueues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxExternalQueues"));

    /// Creates `VkPhysicalDeviceExternalComputeQueuePropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalComputeQueuePropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalComputeQueuePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalComputeQueuePropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalComputeQueuePropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalComputeQueuePropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalComputeQueuePropertiesNV`
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalComputeQueuePropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalComputeQueuePropertiesNV`
    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV copyFrom(VkPhysicalDeviceExternalComputeQueuePropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV reinterpret(long count) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `externalDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalDataSize(MemorySegment segment, long index) { return (int) VH_externalDataSize.get(segment, 0L, index); }
    /// {@return `externalDataSize`}
    public int externalDataSize() { return externalDataSize(this.segment(), 0L); }
    /// Sets `externalDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalDataSize(MemorySegment segment, long index, int value) { VH_externalDataSize.set(segment, 0L, index, value); }
    /// Sets `externalDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV externalDataSize(int value) { externalDataSize(this.segment(), 0L, value); return this; }

    /// {@return `maxExternalQueues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxExternalQueues(MemorySegment segment, long index) { return (int) VH_maxExternalQueues.get(segment, 0L, index); }
    /// {@return `maxExternalQueues`}
    public int maxExternalQueues() { return maxExternalQueues(this.segment(), 0L); }
    /// Sets `maxExternalQueues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExternalQueues(MemorySegment segment, long index, int value) { VH_maxExternalQueues.set(segment, 0L, index, value); }
    /// Sets `maxExternalQueues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV maxExternalQueues(int value) { maxExternalQueues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalComputeQueuePropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalComputeQueuePropertiesNV`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV asSlice(long index) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalComputeQueuePropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalComputeQueuePropertiesNV`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalComputeQueuePropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV at(long index, Consumer<VkPhysicalDeviceExternalComputeQueuePropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `externalDataSize` at the given index}
    /// @param index the index of the struct buffer
    public int externalDataSizeAt(long index) { return externalDataSize(this.segment(), index); }
    /// Sets `externalDataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV externalDataSizeAt(long index, int value) { externalDataSize(this.segment(), index, value); return this; }

    /// {@return `maxExternalQueues` at the given index}
    /// @param index the index of the struct buffer
    public int maxExternalQueuesAt(long index) { return maxExternalQueues(this.segment(), index); }
    /// Sets `maxExternalQueues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV maxExternalQueuesAt(long index, int value) { maxExternalQueues(this.segment(), index, value); return this; }

}
