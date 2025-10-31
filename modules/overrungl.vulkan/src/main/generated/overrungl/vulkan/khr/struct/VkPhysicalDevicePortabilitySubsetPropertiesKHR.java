// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePortabilitySubsetPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePortabilitySubsetPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t minVertexInputBindingStrideAlignment;
/// };
/// ```
public final class VkPhysicalDevicePortabilitySubsetPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDevicePortabilitySubsetPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minVertexInputBindingStrideAlignment")
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
    /// The byte offset of `minVertexInputBindingStrideAlignment`.
    public static final long OFFSET_minVertexInputBindingStrideAlignment = LAYOUT.byteOffset(PathElement.groupElement("minVertexInputBindingStrideAlignment"));
    /// The memory layout of `minVertexInputBindingStrideAlignment`.
    public static final MemoryLayout LAYOUT_minVertexInputBindingStrideAlignment = LAYOUT.select(PathElement.groupElement("minVertexInputBindingStrideAlignment"));
    /// The [VarHandle] of `minVertexInputBindingStrideAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minVertexInputBindingStrideAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minVertexInputBindingStrideAlignment"));

    /// Creates `VkPhysicalDevicePortabilitySubsetPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePortabilitySubsetPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePortabilitySubsetPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePortabilitySubsetPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePortabilitySubsetPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePortabilitySubsetPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePortabilitySubsetPropertiesKHR`
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePortabilitySubsetPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePortabilitySubsetPropertiesKHR`
    public static VkPhysicalDevicePortabilitySubsetPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR copyFrom(VkPhysicalDevicePortabilitySubsetPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR reinterpret(long count) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minVertexInputBindingStrideAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minVertexInputBindingStrideAlignment(MemorySegment segment, long index) { return (int) VH_minVertexInputBindingStrideAlignment.get(segment, 0L, index); }
    /// {@return `minVertexInputBindingStrideAlignment`}
    public int minVertexInputBindingStrideAlignment() { return minVertexInputBindingStrideAlignment(this.segment(), 0L); }
    /// Sets `minVertexInputBindingStrideAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minVertexInputBindingStrideAlignment(MemorySegment segment, long index, int value) { VH_minVertexInputBindingStrideAlignment.set(segment, 0L, index, value); }
    /// Sets `minVertexInputBindingStrideAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR minVertexInputBindingStrideAlignment(int value) { minVertexInputBindingStrideAlignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePortabilitySubsetPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePortabilitySubsetPropertiesKHR`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR asSlice(long index) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePortabilitySubsetPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePortabilitySubsetPropertiesKHR`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDevicePortabilitySubsetPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePortabilitySubsetPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR at(long index, Consumer<VkPhysicalDevicePortabilitySubsetPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minVertexInputBindingStrideAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int minVertexInputBindingStrideAlignmentAt(long index) { return minVertexInputBindingStrideAlignment(this.segment(), index); }
    /// Sets `minVertexInputBindingStrideAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePortabilitySubsetPropertiesKHR minVertexInputBindingStrideAlignmentAt(long index, int value) { minVertexInputBindingStrideAlignment(this.segment(), index, value); return this; }

}
