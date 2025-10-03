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

/// Represents `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCudaKernelLaunchPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t computeCapabilityMinor;
///     uint32_t computeCapabilityMajor;
/// };
/// ```
public final class VkPhysicalDeviceCudaKernelLaunchPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
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
    /// The byte offset of `computeCapabilityMinor`.
    public static final long OFFSET_computeCapabilityMinor = LAYOUT.byteOffset(PathElement.groupElement("computeCapabilityMinor"));
    /// The memory layout of `computeCapabilityMinor`.
    public static final MemoryLayout LAYOUT_computeCapabilityMinor = LAYOUT.select(PathElement.groupElement("computeCapabilityMinor"));
    /// The [VarHandle] of `computeCapabilityMinor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_computeCapabilityMinor = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMinor")));
    /// The byte offset of `computeCapabilityMajor`.
    public static final long OFFSET_computeCapabilityMajor = LAYOUT.byteOffset(PathElement.groupElement("computeCapabilityMajor"));
    /// The memory layout of `computeCapabilityMajor`.
    public static final MemoryLayout LAYOUT_computeCapabilityMajor = LAYOUT.select(PathElement.groupElement("computeCapabilityMajor"));
    /// The [VarHandle] of `computeCapabilityMajor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_computeCapabilityMajor = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("computeCapabilityMajor")));

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV copyFrom(VkPhysicalDeviceCudaKernelLaunchPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `computeCapabilityMinor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeCapabilityMinor(MemorySegment segment, long index) { return (int) VH_computeCapabilityMinor.get().get(segment, 0L, index); }
    /// {@return `computeCapabilityMinor`}
    public int computeCapabilityMinor() { return computeCapabilityMinor(this.segment(), 0L); }
    /// Sets `computeCapabilityMinor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeCapabilityMinor(MemorySegment segment, long index, int value) { VH_computeCapabilityMinor.get().set(segment, 0L, index, value); }
    /// Sets `computeCapabilityMinor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinor(int value) { computeCapabilityMinor(this.segment(), 0L, value); return this; }

    /// {@return `computeCapabilityMajor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computeCapabilityMajor(MemorySegment segment, long index) { return (int) VH_computeCapabilityMajor.get().get(segment, 0L, index); }
    /// {@return `computeCapabilityMajor`}
    public int computeCapabilityMajor() { return computeCapabilityMajor(this.segment(), 0L); }
    /// Sets `computeCapabilityMajor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computeCapabilityMajor(MemorySegment segment, long index, int value) { VH_computeCapabilityMajor.get().set(segment, 0L, index, value); }
    /// Sets `computeCapabilityMajor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajor(int value) { computeCapabilityMajor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV asSlice(long index) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCudaKernelLaunchPropertiesNV`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCudaKernelLaunchPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV at(long index, Consumer<VkPhysicalDeviceCudaKernelLaunchPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `computeCapabilityMinor` at the given index}
    /// @param index the index of the struct buffer
    public int computeCapabilityMinorAt(long index) { return computeCapabilityMinor(this.segment(), index); }
    /// Sets `computeCapabilityMinor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMinorAt(long index, int value) { computeCapabilityMinor(this.segment(), index, value); return this; }

    /// {@return `computeCapabilityMajor` at the given index}
    /// @param index the index of the struct buffer
    public int computeCapabilityMajorAt(long index) { return computeCapabilityMajor(this.segment(), index); }
    /// Sets `computeCapabilityMajor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV computeCapabilityMajorAt(long index, int value) { computeCapabilityMajor(this.segment(), index, value); return this; }

}
