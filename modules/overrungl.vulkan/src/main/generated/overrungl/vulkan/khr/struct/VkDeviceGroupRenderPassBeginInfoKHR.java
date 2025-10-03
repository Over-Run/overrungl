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

/// Represents `VkDeviceGroupRenderPassBeginInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupRenderPassBeginInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceMask;
///     uint32_t deviceRenderAreaCount;
///     const VkRect2D* pDeviceRenderAreas;
/// };
/// ```
public final class VkDeviceGroupRenderPassBeginInfoKHR extends GroupType {
    /// The struct layout of `VkDeviceGroupRenderPassBeginInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask"),
        ValueLayout.JAVA_INT.withName("deviceRenderAreaCount"),
        ValueLayout.ADDRESS.withName("pDeviceRenderAreas")
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
    /// The byte offset of `deviceMask`.
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    /// The memory layout of `deviceMask`.
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));
    /// The byte offset of `deviceRenderAreaCount`.
    public static final long OFFSET_deviceRenderAreaCount = LAYOUT.byteOffset(PathElement.groupElement("deviceRenderAreaCount"));
    /// The memory layout of `deviceRenderAreaCount`.
    public static final MemoryLayout LAYOUT_deviceRenderAreaCount = LAYOUT.select(PathElement.groupElement("deviceRenderAreaCount"));
    /// The [VarHandle] of `deviceRenderAreaCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceRenderAreaCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceRenderAreaCount"));
    /// The byte offset of `pDeviceRenderAreas`.
    public static final long OFFSET_pDeviceRenderAreas = LAYOUT.byteOffset(PathElement.groupElement("pDeviceRenderAreas"));
    /// The memory layout of `pDeviceRenderAreas`.
    public static final MemoryLayout LAYOUT_pDeviceRenderAreas = LAYOUT.select(PathElement.groupElement("pDeviceRenderAreas"));
    /// The [VarHandle] of `pDeviceRenderAreas` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceRenderAreas"));

    /// Creates `VkDeviceGroupRenderPassBeginInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceGroupRenderPassBeginInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceGroupRenderPassBeginInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupRenderPassBeginInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceGroupRenderPassBeginInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfoKHR`
    public static VkDeviceGroupRenderPassBeginInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupRenderPassBeginInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfoKHR`
    public static VkDeviceGroupRenderPassBeginInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupRenderPassBeginInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR copyFrom(VkDeviceGroupRenderPassBeginInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceGroupRenderPassBeginInfoKHR reinterpret(long count) { return new VkDeviceGroupRenderPassBeginInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceGroupRenderPassBeginInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceGroupRenderPassBeginInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    public int deviceMask() { return deviceMask(this.segment(), 0L); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceMask(MemorySegment segment, long index, int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR deviceMask(int value) { deviceMask(this.segment(), 0L, value); return this; }

    /// {@return `deviceRenderAreaCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceRenderAreaCount(MemorySegment segment, long index) { return (int) VH_deviceRenderAreaCount.get(segment, 0L, index); }
    /// {@return `deviceRenderAreaCount`}
    public int deviceRenderAreaCount() { return deviceRenderAreaCount(this.segment(), 0L); }
    /// Sets `deviceRenderAreaCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceRenderAreaCount(MemorySegment segment, long index, int value) { VH_deviceRenderAreaCount.set(segment, 0L, index, value); }
    /// Sets `deviceRenderAreaCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR deviceRenderAreaCount(int value) { deviceRenderAreaCount(this.segment(), 0L, value); return this; }

    /// {@return `pDeviceRenderAreas` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDeviceRenderAreas(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceRenderAreas.get(segment, 0L, index); }
    /// {@return `pDeviceRenderAreas`}
    public MemorySegment pDeviceRenderAreas() { return pDeviceRenderAreas(this.segment(), 0L); }
    /// Sets `pDeviceRenderAreas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDeviceRenderAreas(MemorySegment segment, long index, MemorySegment value) { VH_pDeviceRenderAreas.set(segment, 0L, index, value); }
    /// Sets `pDeviceRenderAreas` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR pDeviceRenderAreas(MemorySegment value) { pDeviceRenderAreas(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceGroupRenderPassBeginInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceGroupRenderPassBeginInfoKHR`
    public VkDeviceGroupRenderPassBeginInfoKHR asSlice(long index) { return new VkDeviceGroupRenderPassBeginInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceGroupRenderPassBeginInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceGroupRenderPassBeginInfoKHR`
    public VkDeviceGroupRenderPassBeginInfoKHR asSlice(long index, long count) { return new VkDeviceGroupRenderPassBeginInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceGroupRenderPassBeginInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR at(long index, Consumer<VkDeviceGroupRenderPassBeginInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param index the index of the struct buffer
    public int deviceMaskAt(long index) { return deviceMask(this.segment(), index); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR deviceMaskAt(long index, int value) { deviceMask(this.segment(), index, value); return this; }

    /// {@return `deviceRenderAreaCount` at the given index}
    /// @param index the index of the struct buffer
    public int deviceRenderAreaCountAt(long index) { return deviceRenderAreaCount(this.segment(), index); }
    /// Sets `deviceRenderAreaCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR deviceRenderAreaCountAt(long index, int value) { deviceRenderAreaCount(this.segment(), index, value); return this; }

    /// {@return `pDeviceRenderAreas` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDeviceRenderAreasAt(long index) { return pDeviceRenderAreas(this.segment(), index); }
    /// Sets `pDeviceRenderAreas` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfoKHR pDeviceRenderAreasAt(long index, MemorySegment value) { pDeviceRenderAreas(this.segment(), index, value); return this; }

}
