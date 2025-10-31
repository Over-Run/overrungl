// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkQueueFlags supportedQueues;
/// };
/// ```
public final class VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedQueues")
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
    /// The byte offset of `supportedQueues`.
    public static final long OFFSET_supportedQueues = LAYOUT.byteOffset(PathElement.groupElement("supportedQueues"));
    /// The memory layout of `supportedQueues`.
    public static final MemoryLayout LAYOUT_supportedQueues = LAYOUT.select(PathElement.groupElement("supportedQueues"));
    /// The [VarHandle] of `supportedQueues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedQueues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedQueues"));

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`
    public static VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR copyFrom(VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `supportedQueues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedQueues(MemorySegment segment, long index) { return (int) VH_supportedQueues.get(segment, 0L, index); }
    /// {@return `supportedQueues`}
    public int supportedQueues() { return supportedQueues(this.segment(), 0L); }
    /// Sets `supportedQueues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedQueues(MemorySegment segment, long index, int value) { VH_supportedQueues.set(segment, 0L, index, value); }
    /// Sets `supportedQueues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR supportedQueues(int value) { supportedQueues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR at(long index, Consumer<VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `supportedQueues` at the given index}
    /// @param index the index of the struct buffer
    public int supportedQueuesAt(long index) { return supportedQueues(this.segment(), index); }
    /// Sets `supportedQueues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectPropertiesKHR supportedQueuesAt(long index, int value) { supportedQueues(this.segment(), index, value); return this; }

}
