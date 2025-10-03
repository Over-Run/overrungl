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

/// Represents `VkPhysicalDeviceSynchronization2FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSynchronization2FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 synchronization2;
/// };
/// ```
public final class VkPhysicalDeviceSynchronization2FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSynchronization2FeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("synchronization2")
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
    /// The byte offset of `synchronization2`.
    public static final long OFFSET_synchronization2 = LAYOUT.byteOffset(PathElement.groupElement("synchronization2"));
    /// The memory layout of `synchronization2`.
    public static final MemoryLayout LAYOUT_synchronization2 = LAYOUT.select(PathElement.groupElement("synchronization2"));
    /// The [VarHandle] of `synchronization2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_synchronization2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("synchronization2"));

    /// Creates `VkPhysicalDeviceSynchronization2FeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSynchronization2FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSynchronization2FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSynchronization2FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSynchronization2FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSynchronization2FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSynchronization2FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSynchronization2FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSynchronization2FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSynchronization2FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSynchronization2FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSynchronization2FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSynchronization2FeaturesKHR`
    public static VkPhysicalDeviceSynchronization2FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSynchronization2FeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSynchronization2FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSynchronization2FeaturesKHR`
    public static VkPhysicalDeviceSynchronization2FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSynchronization2FeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSynchronization2FeaturesKHR copyFrom(VkPhysicalDeviceSynchronization2FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSynchronization2FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceSynchronization2FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSynchronization2FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSynchronization2FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `synchronization2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int synchronization2(MemorySegment segment, long index) { return (int) VH_synchronization2.get(segment, 0L, index); }
    /// {@return `synchronization2`}
    public int synchronization2() { return synchronization2(this.segment(), 0L); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void synchronization2(MemorySegment segment, long index, int value) { VH_synchronization2.set(segment, 0L, index, value); }
    /// Sets `synchronization2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSynchronization2FeaturesKHR synchronization2(int value) { synchronization2(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSynchronization2FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSynchronization2FeaturesKHR`
    public VkPhysicalDeviceSynchronization2FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceSynchronization2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSynchronization2FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSynchronization2FeaturesKHR`
    public VkPhysicalDeviceSynchronization2FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceSynchronization2FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSynchronization2FeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSynchronization2FeaturesKHR at(long index, Consumer<VkPhysicalDeviceSynchronization2FeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSynchronization2FeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSynchronization2FeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `synchronization2` at the given index}
    /// @param index the index of the struct buffer
    public int synchronization2At(long index) { return synchronization2(this.segment(), index); }
    /// Sets `synchronization2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSynchronization2FeaturesKHR synchronization2At(long index, int value) { synchronization2(this.segment(), index, value); return this; }

}
