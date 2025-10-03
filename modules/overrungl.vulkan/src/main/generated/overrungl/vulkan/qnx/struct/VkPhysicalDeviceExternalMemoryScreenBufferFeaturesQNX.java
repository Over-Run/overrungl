// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qnx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 screenBufferImport;
/// };
/// ```
public final class VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("screenBufferImport")
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
    /// The byte offset of `screenBufferImport`.
    public static final long OFFSET_screenBufferImport = LAYOUT.byteOffset(PathElement.groupElement("screenBufferImport"));
    /// The memory layout of `screenBufferImport`.
    public static final MemoryLayout LAYOUT_screenBufferImport = LAYOUT.select(PathElement.groupElement("screenBufferImport"));
    /// The [VarHandle] of `screenBufferImport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_screenBufferImport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("screenBufferImport"));

    /// Creates `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`
    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX copyFrom(VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX reinterpret(long count) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `screenBufferImport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int screenBufferImport(MemorySegment segment, long index) { return (int) VH_screenBufferImport.get(segment, 0L, index); }
    /// {@return `screenBufferImport`}
    public int screenBufferImport() { return screenBufferImport(this.segment(), 0L); }
    /// Sets `screenBufferImport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void screenBufferImport(MemorySegment segment, long index, int value) { VH_screenBufferImport.set(segment, 0L, index, value); }
    /// Sets `screenBufferImport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX screenBufferImport(int value) { screenBufferImport(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX asSlice(long index) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX at(long index, Consumer<VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `screenBufferImport` at the given index}
    /// @param index the index of the struct buffer
    public int screenBufferImportAt(long index) { return screenBufferImport(this.segment(), index); }
    /// Sets `screenBufferImport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX screenBufferImportAt(long index, int value) { screenBufferImport(this.segment(), index, value); return this; }

}
