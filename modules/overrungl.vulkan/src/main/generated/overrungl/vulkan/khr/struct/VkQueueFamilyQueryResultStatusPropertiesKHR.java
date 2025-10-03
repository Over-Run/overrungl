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

/// Represents `VkQueueFamilyQueryResultStatusPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyQueryResultStatusPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 queryResultStatusSupport;
/// };
/// ```
public final class VkQueueFamilyQueryResultStatusPropertiesKHR extends GroupType {
    /// The struct layout of `VkQueueFamilyQueryResultStatusPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queryResultStatusSupport")
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
    /// The byte offset of `queryResultStatusSupport`.
    public static final long OFFSET_queryResultStatusSupport = LAYOUT.byteOffset(PathElement.groupElement("queryResultStatusSupport"));
    /// The memory layout of `queryResultStatusSupport`.
    public static final MemoryLayout LAYOUT_queryResultStatusSupport = LAYOUT.select(PathElement.groupElement("queryResultStatusSupport"));
    /// The [VarHandle] of `queryResultStatusSupport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_queryResultStatusSupport = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryResultStatusSupport")));

    /// Creates `VkQueueFamilyQueryResultStatusPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyQueryResultStatusPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyQueryResultStatusPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyQueryResultStatusPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyQueryResultStatusPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyQueryResultStatusPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyQueryResultStatusPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyQueryResultStatusPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyQueryResultStatusPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyQueryResultStatusPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyQueryResultStatusPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyQueryResultStatusPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyQueryResultStatusPropertiesKHR`
    public static VkQueueFamilyQueryResultStatusPropertiesKHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyQueryResultStatusPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyQueryResultStatusPropertiesKHR`
    public static VkQueueFamilyQueryResultStatusPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyQueryResultStatusPropertiesKHR copyFrom(VkQueueFamilyQueryResultStatusPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyQueryResultStatusPropertiesKHR reinterpret(long count) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueueFamilyQueryResultStatusPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueueFamilyQueryResultStatusPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queryResultStatusSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queryResultStatusSupport(MemorySegment segment, long index) { return (int) VH_queryResultStatusSupport.get().get(segment, 0L, index); }
    /// {@return `queryResultStatusSupport`}
    public int queryResultStatusSupport() { return queryResultStatusSupport(this.segment(), 0L); }
    /// Sets `queryResultStatusSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryResultStatusSupport(MemorySegment segment, long index, int value) { VH_queryResultStatusSupport.get().set(segment, 0L, index, value); }
    /// Sets `queryResultStatusSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyQueryResultStatusPropertiesKHR queryResultStatusSupport(int value) { queryResultStatusSupport(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkQueueFamilyQueryResultStatusPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyQueryResultStatusPropertiesKHR`
    public VkQueueFamilyQueryResultStatusPropertiesKHR asSlice(long index) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyQueryResultStatusPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyQueryResultStatusPropertiesKHR`
    public VkQueueFamilyQueryResultStatusPropertiesKHR asSlice(long index, long count) { return new VkQueueFamilyQueryResultStatusPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyQueryResultStatusPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyQueryResultStatusPropertiesKHR at(long index, Consumer<VkQueueFamilyQueryResultStatusPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyQueryResultStatusPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyQueryResultStatusPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queryResultStatusSupport` at the given index}
    /// @param index the index of the struct buffer
    public int queryResultStatusSupportAt(long index) { return queryResultStatusSupport(this.segment(), index); }
    /// Sets `queryResultStatusSupport` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyQueryResultStatusPropertiesKHR queryResultStatusSupportAt(long index, int value) { queryResultStatusSupport(this.segment(), index, value); return this; }

}
