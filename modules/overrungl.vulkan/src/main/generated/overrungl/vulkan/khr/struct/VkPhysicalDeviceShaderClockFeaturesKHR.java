// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderClockFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderClockFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderSubgroupClock;
///     (uint32_t) VkBool32 shaderDeviceClock;
/// };
/// ```
public final class VkPhysicalDeviceShaderClockFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderClockFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupClock"),
        ValueLayout.JAVA_INT.withName("shaderDeviceClock")
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
    /// The byte offset of `shaderSubgroupClock`.
    public static final long OFFSET_shaderSubgroupClock = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupClock"));
    /// The memory layout of `shaderSubgroupClock`.
    public static final MemoryLayout LAYOUT_shaderSubgroupClock = LAYOUT.select(PathElement.groupElement("shaderSubgroupClock"));
    /// The [VarHandle] of `shaderSubgroupClock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSubgroupClock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupClock"));
    /// The byte offset of `shaderDeviceClock`.
    public static final long OFFSET_shaderDeviceClock = LAYOUT.byteOffset(PathElement.groupElement("shaderDeviceClock"));
    /// The memory layout of `shaderDeviceClock`.
    public static final MemoryLayout LAYOUT_shaderDeviceClock = LAYOUT.select(PathElement.groupElement("shaderDeviceClock"));
    /// The [VarHandle] of `shaderDeviceClock` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderDeviceClock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDeviceClock"));

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderClockFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderClockFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderClockFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderClockFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderClockFeaturesKHR`
    public static VkPhysicalDeviceShaderClockFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderClockFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderClockFeaturesKHR`
    public static VkPhysicalDeviceShaderClockFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR copyFrom(VkPhysicalDeviceShaderClockFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderClockFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderClockFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderClockFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderSubgroupClock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSubgroupClock(MemorySegment segment, long index) { return (int) VH_shaderSubgroupClock.get(segment, 0L, index); }
    /// {@return `shaderSubgroupClock`}
    public int shaderSubgroupClock() { return shaderSubgroupClock(this.segment(), 0L); }
    /// Sets `shaderSubgroupClock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSubgroupClock(MemorySegment segment, long index, int value) { VH_shaderSubgroupClock.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupClock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClock(int value) { shaderSubgroupClock(this.segment(), 0L, value); return this; }

    /// {@return `shaderDeviceClock` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderDeviceClock(MemorySegment segment, long index) { return (int) VH_shaderDeviceClock.get(segment, 0L, index); }
    /// {@return `shaderDeviceClock`}
    public int shaderDeviceClock() { return shaderDeviceClock(this.segment(), 0L); }
    /// Sets `shaderDeviceClock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderDeviceClock(MemorySegment segment, long index, int value) { VH_shaderDeviceClock.set(segment, 0L, index, value); }
    /// Sets `shaderDeviceClock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClock(int value) { shaderDeviceClock(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderClockFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderClockFeaturesKHR`
    public VkPhysicalDeviceShaderClockFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderClockFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderClockFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderClockFeaturesKHR`
    public VkPhysicalDeviceShaderClockFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderClockFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderClockFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderSubgroupClock` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSubgroupClockAt(long index) { return shaderSubgroupClock(this.segment(), index); }
    /// Sets `shaderSubgroupClock` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClockAt(long index, int value) { shaderSubgroupClock(this.segment(), index, value); return this; }

    /// {@return `shaderDeviceClock` at the given index}
    /// @param index the index of the struct buffer
    public int shaderDeviceClockAt(long index) { return shaderDeviceClock(this.segment(), index); }
    /// Sets `shaderDeviceClock` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClockAt(long index, int value) { shaderDeviceClock(this.segment(), index, value); return this; }

}
