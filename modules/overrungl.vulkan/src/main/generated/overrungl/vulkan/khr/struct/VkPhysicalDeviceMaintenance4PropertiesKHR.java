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

/// Represents `VkPhysicalDeviceMaintenance4PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance4PropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize maxBufferSize;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance4PropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance4PropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("maxBufferSize")
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
    /// The byte offset of `maxBufferSize`.
    public static final long OFFSET_maxBufferSize = LAYOUT.byteOffset(PathElement.groupElement("maxBufferSize"));
    /// The memory layout of `maxBufferSize`.
    public static final MemoryLayout LAYOUT_maxBufferSize = LAYOUT.select(PathElement.groupElement("maxBufferSize"));
    /// The [VarHandle] of `maxBufferSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferSize"));

    /// Creates `VkPhysicalDeviceMaintenance4PropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance4PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance4PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance4PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance4PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance4PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance4PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance4PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance4PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance4PropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance4PropertiesKHR`
    public static VkPhysicalDeviceMaintenance4PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance4PropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance4PropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance4PropertiesKHR`
    public static VkPhysicalDeviceMaintenance4PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance4PropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance4PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance4PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance4PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance4PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance4PropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance4PropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxBufferSize(MemorySegment segment, long index) { return (long) VH_maxBufferSize.get(segment, 0L, index); }
    /// {@return `maxBufferSize`}
    public long maxBufferSize() { return maxBufferSize(this.segment(), 0L); }
    /// Sets `maxBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBufferSize(MemorySegment segment, long index, long value) { VH_maxBufferSize.set(segment, 0L, index, value); }
    /// Sets `maxBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4PropertiesKHR maxBufferSize(long value) { maxBufferSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance4PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance4PropertiesKHR`
    public VkPhysicalDeviceMaintenance4PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance4PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance4PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance4PropertiesKHR`
    public VkPhysicalDeviceMaintenance4PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance4PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance4PropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance4PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance4PropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4PropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4PropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxBufferSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxBufferSizeAt(long index) { return maxBufferSize(this.segment(), index); }
    /// Sets `maxBufferSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance4PropertiesKHR maxBufferSizeAt(long index, long value) { maxBufferSize(this.segment(), index, value); return this; }

}
