// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkQueueFamilyOwnershipTransferPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyOwnershipTransferPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t optimalImageTransferToQueueFamilies;
/// };
/// ```
public final class VkQueueFamilyOwnershipTransferPropertiesKHR extends GroupType {
    /// The struct layout of `VkQueueFamilyOwnershipTransferPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalImageTransferToQueueFamilies")
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
    /// The byte offset of `optimalImageTransferToQueueFamilies`.
    public static final long OFFSET_optimalImageTransferToQueueFamilies = LAYOUT.byteOffset(PathElement.groupElement("optimalImageTransferToQueueFamilies"));
    /// The memory layout of `optimalImageTransferToQueueFamilies`.
    public static final MemoryLayout LAYOUT_optimalImageTransferToQueueFamilies = LAYOUT.select(PathElement.groupElement("optimalImageTransferToQueueFamilies"));
    /// The [VarHandle] of `optimalImageTransferToQueueFamilies` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_optimalImageTransferToQueueFamilies = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalImageTransferToQueueFamilies"));

    /// Creates `VkQueueFamilyOwnershipTransferPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyOwnershipTransferPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyOwnershipTransferPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyOwnershipTransferPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyOwnershipTransferPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyOwnershipTransferPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyOwnershipTransferPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyOwnershipTransferPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyOwnershipTransferPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyOwnershipTransferPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyOwnershipTransferPropertiesKHR`
    public static VkQueueFamilyOwnershipTransferPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyOwnershipTransferPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyOwnershipTransferPropertiesKHR`
    public static VkQueueFamilyOwnershipTransferPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyOwnershipTransferPropertiesKHR copyFrom(VkQueueFamilyOwnershipTransferPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyOwnershipTransferPropertiesKHR reinterpret(long count) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueueFamilyOwnershipTransferPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueueFamilyOwnershipTransferPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `optimalImageTransferToQueueFamilies` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int optimalImageTransferToQueueFamilies(MemorySegment segment, long index) { return (int) VH_optimalImageTransferToQueueFamilies.get(segment, 0L, index); }
    /// {@return `optimalImageTransferToQueueFamilies`}
    public int optimalImageTransferToQueueFamilies() { return optimalImageTransferToQueueFamilies(this.segment(), 0L); }
    /// Sets `optimalImageTransferToQueueFamilies` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalImageTransferToQueueFamilies(MemorySegment segment, long index, int value) { VH_optimalImageTransferToQueueFamilies.set(segment, 0L, index, value); }
    /// Sets `optimalImageTransferToQueueFamilies` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyOwnershipTransferPropertiesKHR optimalImageTransferToQueueFamilies(int value) { optimalImageTransferToQueueFamilies(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkQueueFamilyOwnershipTransferPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyOwnershipTransferPropertiesKHR`
    public VkQueueFamilyOwnershipTransferPropertiesKHR asSlice(long index) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyOwnershipTransferPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyOwnershipTransferPropertiesKHR`
    public VkQueueFamilyOwnershipTransferPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyOwnershipTransferPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyOwnershipTransferPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyOwnershipTransferPropertiesKHR at(long index, Consumer<VkQueueFamilyOwnershipTransferPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyOwnershipTransferPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyOwnershipTransferPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `optimalImageTransferToQueueFamilies` at the given index}
    /// @param index the index of the struct buffer
    public int optimalImageTransferToQueueFamiliesAt(long index) { return optimalImageTransferToQueueFamilies(this.segment(), index); }
    /// Sets `optimalImageTransferToQueueFamilies` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyOwnershipTransferPropertiesKHR optimalImageTransferToQueueFamiliesAt(long index, int value) { optimalImageTransferToQueueFamilies(this.segment(), index, value); return this; }

}
