// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 swapchainMaintenance1;
/// };
/// ```
public final class VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainMaintenance1")
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
    /// The byte offset of `swapchainMaintenance1`.
    public static final long OFFSET_swapchainMaintenance1 = LAYOUT.byteOffset(PathElement.groupElement("swapchainMaintenance1"));
    /// The memory layout of `swapchainMaintenance1`.
    public static final MemoryLayout LAYOUT_swapchainMaintenance1 = LAYOUT.select(PathElement.groupElement("swapchainMaintenance1"));
    /// The [VarHandle] of `swapchainMaintenance1` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchainMaintenance1 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainMaintenance1"));

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`
    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR copyFrom(VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchainMaintenance1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int swapchainMaintenance1(MemorySegment segment, long index) { return (int) VH_swapchainMaintenance1.get(segment, 0L, index); }
    /// {@return `swapchainMaintenance1`}
    public int swapchainMaintenance1() { return swapchainMaintenance1(this.segment(), 0L); }
    /// Sets `swapchainMaintenance1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchainMaintenance1(MemorySegment segment, long index, int value) { VH_swapchainMaintenance1.set(segment, 0L, index, value); }
    /// Sets `swapchainMaintenance1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR swapchainMaintenance1(int value) { swapchainMaintenance1(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR at(long index, Consumer<VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchainMaintenance1` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainMaintenance1At(long index) { return swapchainMaintenance1(this.segment(), index); }
    /// Sets `swapchainMaintenance1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSwapchainMaintenance1FeaturesKHR swapchainMaintenance1At(long index, int value) { swapchainMaintenance1(this.segment(), index, value); return this; }

}
