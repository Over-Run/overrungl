// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 denseGeometryFormat;
/// };
/// ```
public final class VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("denseGeometryFormat")
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
    /// The byte offset of `denseGeometryFormat`.
    public static final long OFFSET_denseGeometryFormat = LAYOUT.byteOffset(PathElement.groupElement("denseGeometryFormat"));
    /// The memory layout of `denseGeometryFormat`.
    public static final MemoryLayout LAYOUT_denseGeometryFormat = LAYOUT.select(PathElement.groupElement("denseGeometryFormat"));
    /// The [VarHandle] of `denseGeometryFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_denseGeometryFormat = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("denseGeometryFormat")));

    /// Creates `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`
    public static VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX copyFrom(VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX reinterpret(long count) { return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `denseGeometryFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int denseGeometryFormat(MemorySegment segment, long index) { return (int) VH_denseGeometryFormat.get().get(segment, 0L, index); }
    /// {@return `denseGeometryFormat`}
    public int denseGeometryFormat() { return denseGeometryFormat(this.segment(), 0L); }
    /// Sets `denseGeometryFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void denseGeometryFormat(MemorySegment segment, long index, int value) { VH_denseGeometryFormat.get().set(segment, 0L, index, value); }
    /// Sets `denseGeometryFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX denseGeometryFormat(int value) { denseGeometryFormat(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX asSlice(long index) { return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX asSlice(long index, long count) { return new VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX at(long index, Consumer<VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `denseGeometryFormat` at the given index}
    /// @param index the index of the struct buffer
    public int denseGeometryFormatAt(long index) { return denseGeometryFormat(this.segment(), index); }
    /// Sets `denseGeometryFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDenseGeometryFormatFeaturesAMDX denseGeometryFormatAt(long index, int value) { denseGeometryFormat(this.segment(), index, value); return this; }

}
