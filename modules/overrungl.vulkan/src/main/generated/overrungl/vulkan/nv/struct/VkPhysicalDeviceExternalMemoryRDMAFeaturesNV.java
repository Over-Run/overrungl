// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalMemoryRDMAFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 externalMemoryRDMA;
/// };
/// ```
public final class VkPhysicalDeviceExternalMemoryRDMAFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("externalMemoryRDMA")
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
    /// The byte offset of `externalMemoryRDMA`.
    public static final long OFFSET_externalMemoryRDMA = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryRDMA"));
    /// The memory layout of `externalMemoryRDMA`.
    public static final MemoryLayout LAYOUT_externalMemoryRDMA = LAYOUT.select(PathElement.groupElement("externalMemoryRDMA"));
    /// The [VarHandle] of `externalMemoryRDMA` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalMemoryRDMA = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryRDMA"));

    /// Creates `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`
    public static VkPhysicalDeviceExternalMemoryRDMAFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV copyFrom(VkPhysicalDeviceExternalMemoryRDMAFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `externalMemoryRDMA` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalMemoryRDMA(MemorySegment segment, long index) { return (int) VH_externalMemoryRDMA.get(segment, 0L, index); }
    /// {@return `externalMemoryRDMA`}
    public int externalMemoryRDMA() { return externalMemoryRDMA(this.segment(), 0L); }
    /// Sets `externalMemoryRDMA` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalMemoryRDMA(MemorySegment segment, long index, int value) { VH_externalMemoryRDMA.set(segment, 0L, index, value); }
    /// Sets `externalMemoryRDMA` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV externalMemoryRDMA(int value) { externalMemoryRDMA(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV asSlice(long index) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemoryRDMAFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalMemoryRDMAFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV at(long index, Consumer<VkPhysicalDeviceExternalMemoryRDMAFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `externalMemoryRDMA` at the given index}
    /// @param index the index of the struct buffer
    public int externalMemoryRDMAAt(long index) { return externalMemoryRDMA(this.segment(), index); }
    /// Sets `externalMemoryRDMA` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryRDMAFeaturesNV externalMemoryRDMAAt(long index, int value) { externalMemoryRDMA(this.segment(), index, value); return this; }

}
