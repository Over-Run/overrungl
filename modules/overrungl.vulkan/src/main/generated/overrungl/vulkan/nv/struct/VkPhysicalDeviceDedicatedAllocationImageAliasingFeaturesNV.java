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

/// Represents `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 dedicatedAllocationImageAliasing;
/// };
/// ```
public final class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dedicatedAllocationImageAliasing")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `dedicatedAllocationImageAliasing`.
    public static final long OFFSET_dedicatedAllocationImageAliasing = LAYOUT.byteOffset(PathElement.groupElement("dedicatedAllocationImageAliasing"));
    /// The memory layout of `dedicatedAllocationImageAliasing`.
    public static final MemoryLayout LAYOUT_dedicatedAllocationImageAliasing = LAYOUT.select(PathElement.groupElement("dedicatedAllocationImageAliasing"));
    /// The [VarHandle] of `dedicatedAllocationImageAliasing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dedicatedAllocationImageAliasing = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dedicatedAllocationImageAliasing")));

    /// Creates `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV copyFrom(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dedicatedAllocationImageAliasing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dedicatedAllocationImageAliasing(MemorySegment segment, long index) { return (int) VH_dedicatedAllocationImageAliasing.get().get(segment, 0L, index); }
    /// {@return `dedicatedAllocationImageAliasing`}
    public int dedicatedAllocationImageAliasing() { return dedicatedAllocationImageAliasing(this.segment(), 0L); }
    /// Sets `dedicatedAllocationImageAliasing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dedicatedAllocationImageAliasing(MemorySegment segment, long index, int value) { VH_dedicatedAllocationImageAliasing.get().set(segment, 0L, index, value); }
    /// Sets `dedicatedAllocationImageAliasing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasing(int value) { dedicatedAllocationImageAliasing(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV at(long index, Consumer<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dedicatedAllocationImageAliasing` at the given index}
    /// @param index the index of the struct buffer
    public int dedicatedAllocationImageAliasingAt(long index) { return dedicatedAllocationImageAliasing(this.segment(), index); }
    /// Sets `dedicatedAllocationImageAliasing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasingAt(long index, int value) { dedicatedAllocationImageAliasing(this.segment(), index, value); return this; }

}
