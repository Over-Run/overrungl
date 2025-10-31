// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkanSC10Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkanSC10Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderAtomicInstructions;
/// };
/// ```
public final class VkPhysicalDeviceVulkanSC10Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkanSC10Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderAtomicInstructions")
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
    /// The byte offset of `shaderAtomicInstructions`.
    public static final long OFFSET_shaderAtomicInstructions = LAYOUT.byteOffset(PathElement.groupElement("shaderAtomicInstructions"));
    /// The memory layout of `shaderAtomicInstructions`.
    public static final MemoryLayout LAYOUT_shaderAtomicInstructions = LAYOUT.select(PathElement.groupElement("shaderAtomicInstructions"));
    /// The [VarHandle] of `shaderAtomicInstructions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderAtomicInstructions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderAtomicInstructions"));

    /// Creates `VkPhysicalDeviceVulkanSC10Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkanSC10Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkanSC10Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkanSC10Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkanSC10Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanSC10Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanSC10Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkanSC10Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanSC10Features`
    public static VkPhysicalDeviceVulkanSC10Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanSC10Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkanSC10Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanSC10Features`
    public static VkPhysicalDeviceVulkanSC10Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkanSC10Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Features copyFrom(VkPhysicalDeviceVulkanSC10Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkanSC10Features reinterpret(long count) { return new VkPhysicalDeviceVulkanSC10Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVulkanSC10Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanSC10Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderAtomicInstructions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderAtomicInstructions(MemorySegment segment, long index) { return (int) VH_shaderAtomicInstructions.get(segment, 0L, index); }
    /// {@return `shaderAtomicInstructions`}
    public int shaderAtomicInstructions() { return shaderAtomicInstructions(this.segment(), 0L); }
    /// Sets `shaderAtomicInstructions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderAtomicInstructions(MemorySegment segment, long index, int value) { VH_shaderAtomicInstructions.set(segment, 0L, index, value); }
    /// Sets `shaderAtomicInstructions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Features shaderAtomicInstructions(int value) { shaderAtomicInstructions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkanSC10Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkanSC10Features`
    public VkPhysicalDeviceVulkanSC10Features asSlice(long index) { return new VkPhysicalDeviceVulkanSC10Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkanSC10Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkanSC10Features`
    public VkPhysicalDeviceVulkanSC10Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkanSC10Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkanSC10Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Features at(long index, Consumer<VkPhysicalDeviceVulkanSC10Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderAtomicInstructions` at the given index}
    /// @param index the index of the struct buffer
    public int shaderAtomicInstructionsAt(long index) { return shaderAtomicInstructions(this.segment(), index); }
    /// Sets `shaderAtomicInstructions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanSC10Features shaderAtomicInstructionsAt(long index, int value) { shaderAtomicInstructions(this.segment(), index, value); return this; }

}
