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

/// Represents `VkPhysicalDeviceRobustness2PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRobustness2PropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize robustStorageBufferAccessSizeAlignment;
///     (uint64_t) VkDeviceSize robustUniformBufferAccessSizeAlignment;
/// };
/// ```
public final class VkPhysicalDeviceRobustness2PropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRobustness2PropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment"),
        ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment")
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
    /// The byte offset of `robustStorageBufferAccessSizeAlignment`.
    public static final long OFFSET_robustStorageBufferAccessSizeAlignment = LAYOUT.byteOffset(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    /// The memory layout of `robustStorageBufferAccessSizeAlignment`.
    public static final MemoryLayout LAYOUT_robustStorageBufferAccessSizeAlignment = LAYOUT.select(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    /// The [VarHandle] of `robustStorageBufferAccessSizeAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustStorageBufferAccessSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustStorageBufferAccessSizeAlignment"));
    /// The byte offset of `robustUniformBufferAccessSizeAlignment`.
    public static final long OFFSET_robustUniformBufferAccessSizeAlignment = LAYOUT.byteOffset(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));
    /// The memory layout of `robustUniformBufferAccessSizeAlignment`.
    public static final MemoryLayout LAYOUT_robustUniformBufferAccessSizeAlignment = LAYOUT.select(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));
    /// The [VarHandle] of `robustUniformBufferAccessSizeAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustUniformBufferAccessSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustUniformBufferAccessSizeAlignment"));

    /// Creates `VkPhysicalDeviceRobustness2PropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRobustness2PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRobustness2PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRobustness2PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRobustness2PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRobustness2PropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRobustness2PropertiesKHR`
    public static VkPhysicalDeviceRobustness2PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRobustness2PropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRobustness2PropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRobustness2PropertiesKHR`
    public static VkPhysicalDeviceRobustness2PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRobustness2PropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR copyFrom(VkPhysicalDeviceRobustness2PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRobustness2PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceRobustness2PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRobustness2PropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRobustness2PropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `robustStorageBufferAccessSizeAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long robustStorageBufferAccessSizeAlignment(MemorySegment segment, long index) { return (long) VH_robustStorageBufferAccessSizeAlignment.get(segment, 0L, index); }
    /// {@return `robustStorageBufferAccessSizeAlignment`}
    public long robustStorageBufferAccessSizeAlignment() { return robustStorageBufferAccessSizeAlignment(this.segment(), 0L); }
    /// Sets `robustStorageBufferAccessSizeAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustStorageBufferAccessSizeAlignment(MemorySegment segment, long index, long value) { VH_robustStorageBufferAccessSizeAlignment.set(segment, 0L, index, value); }
    /// Sets `robustStorageBufferAccessSizeAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR robustStorageBufferAccessSizeAlignment(long value) { robustStorageBufferAccessSizeAlignment(this.segment(), 0L, value); return this; }

    /// {@return `robustUniformBufferAccessSizeAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long robustUniformBufferAccessSizeAlignment(MemorySegment segment, long index) { return (long) VH_robustUniformBufferAccessSizeAlignment.get(segment, 0L, index); }
    /// {@return `robustUniformBufferAccessSizeAlignment`}
    public long robustUniformBufferAccessSizeAlignment() { return robustUniformBufferAccessSizeAlignment(this.segment(), 0L); }
    /// Sets `robustUniformBufferAccessSizeAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustUniformBufferAccessSizeAlignment(MemorySegment segment, long index, long value) { VH_robustUniformBufferAccessSizeAlignment.set(segment, 0L, index, value); }
    /// Sets `robustUniformBufferAccessSizeAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR robustUniformBufferAccessSizeAlignment(long value) { robustUniformBufferAccessSizeAlignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRobustness2PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRobustness2PropertiesKHR`
    public VkPhysicalDeviceRobustness2PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceRobustness2PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRobustness2PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRobustness2PropertiesKHR`
    public VkPhysicalDeviceRobustness2PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRobustness2PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRobustness2PropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR at(long index, Consumer<VkPhysicalDeviceRobustness2PropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `robustStorageBufferAccessSizeAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long robustStorageBufferAccessSizeAlignmentAt(long index) { return robustStorageBufferAccessSizeAlignment(this.segment(), index); }
    /// Sets `robustStorageBufferAccessSizeAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR robustStorageBufferAccessSizeAlignmentAt(long index, long value) { robustStorageBufferAccessSizeAlignment(this.segment(), index, value); return this; }

    /// {@return `robustUniformBufferAccessSizeAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long robustUniformBufferAccessSizeAlignmentAt(long index) { return robustUniformBufferAccessSizeAlignment(this.segment(), index); }
    /// Sets `robustUniformBufferAccessSizeAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRobustness2PropertiesKHR robustUniformBufferAccessSizeAlignmentAt(long index, long value) { robustUniformBufferAccessSizeAlignment(this.segment(), index, value); return this; }

}
