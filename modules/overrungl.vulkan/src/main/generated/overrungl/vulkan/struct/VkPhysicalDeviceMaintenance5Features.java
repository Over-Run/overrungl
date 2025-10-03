// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMaintenance5Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance5Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 maintenance5;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance5Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance5Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maintenance5")
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
    /// The byte offset of `maintenance5`.
    public static final long OFFSET_maintenance5 = LAYOUT.byteOffset(PathElement.groupElement("maintenance5"));
    /// The memory layout of `maintenance5`.
    public static final MemoryLayout LAYOUT_maintenance5 = LAYOUT.select(PathElement.groupElement("maintenance5"));
    /// The [VarHandle] of `maintenance5` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maintenance5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance5"));

    /// Creates `VkPhysicalDeviceMaintenance5Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance5Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance5Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance5Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance5Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance5Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance5Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance5Features`
    public static VkPhysicalDeviceMaintenance5Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance5Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance5Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance5Features`
    public static VkPhysicalDeviceMaintenance5Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance5Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Features copyFrom(VkPhysicalDeviceMaintenance5Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance5Features reinterpret(long count) { return new VkPhysicalDeviceMaintenance5Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance5Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance5Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maintenance5` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maintenance5(MemorySegment segment, long index) { return (int) VH_maintenance5.get(segment, 0L, index); }
    /// {@return `maintenance5`}
    public int maintenance5() { return maintenance5(this.segment(), 0L); }
    /// Sets `maintenance5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maintenance5(MemorySegment segment, long index, int value) { VH_maintenance5.set(segment, 0L, index, value); }
    /// Sets `maintenance5` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Features maintenance5(int value) { maintenance5(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance5Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance5Features`
    public VkPhysicalDeviceMaintenance5Features asSlice(long index) { return new VkPhysicalDeviceMaintenance5Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance5Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance5Features`
    public VkPhysicalDeviceMaintenance5Features asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance5Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance5Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Features at(long index, Consumer<VkPhysicalDeviceMaintenance5Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maintenance5` at the given index}
    /// @param index the index of the struct buffer
    public int maintenance5At(long index) { return maintenance5(this.segment(), index); }
    /// Sets `maintenance5` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance5Features maintenance5At(long index, int value) { maintenance5(this.segment(), index, value); return this; }

}
