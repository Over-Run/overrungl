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

/// Represents `VkBindMemoryStatus`.
/// ## Layout
/// ```
/// struct VkBindMemoryStatus {
///     (int) VkStructureType sType;
///     const void* pNext;
///     VkResult* pResult;
/// };
/// ```
public final class VkBindMemoryStatus extends GroupType {
    /// The struct layout of `VkBindMemoryStatus`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pResult")
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
    /// The byte offset of `pResult`.
    public static final long OFFSET_pResult = LAYOUT.byteOffset(PathElement.groupElement("pResult"));
    /// The memory layout of `pResult`.
    public static final MemoryLayout LAYOUT_pResult = LAYOUT.select(PathElement.groupElement("pResult"));
    /// The [VarHandle] of `pResult` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pResult = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pResult")));

    /// Creates `VkBindMemoryStatus` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindMemoryStatus(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindMemoryStatus` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindMemoryStatus of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatus(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindMemoryStatus` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindMemoryStatus ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatus(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindMemoryStatus` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindMemoryStatus ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindMemoryStatus(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindMemoryStatus` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindMemoryStatus`
    public static VkBindMemoryStatus alloc(SegmentAllocator allocator) { return new VkBindMemoryStatus(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindMemoryStatus` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindMemoryStatus`
    public static VkBindMemoryStatus alloc(SegmentAllocator allocator, long count) { return new VkBindMemoryStatus(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindMemoryStatus copyFrom(VkBindMemoryStatus src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindMemoryStatus reinterpret(long count) { return new VkBindMemoryStatus(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindMemoryStatus sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindMemoryStatus pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pResult` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pResult(MemorySegment segment, long index) { return (MemorySegment) VH_pResult.get().get(segment, 0L, index); }
    /// {@return `pResult`}
    public MemorySegment pResult() { return pResult(this.segment(), 0L); }
    /// Sets `pResult` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pResult(MemorySegment segment, long index, MemorySegment value) { VH_pResult.get().set(segment, 0L, index, value); }
    /// Sets `pResult` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatus pResult(MemorySegment value) { pResult(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindMemoryStatus`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindMemoryStatus`
    public VkBindMemoryStatus asSlice(long index) { return new VkBindMemoryStatus(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindMemoryStatus`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindMemoryStatus`
    public VkBindMemoryStatus asSlice(long index, long count) { return new VkBindMemoryStatus(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindMemoryStatus` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindMemoryStatus at(long index, Consumer<VkBindMemoryStatus> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatus sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatus pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pResult` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pResultAt(long index) { return pResult(this.segment(), index); }
    /// Sets `pResult` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindMemoryStatus pResultAt(long index, MemorySegment value) { pResult(this.segment(), index, value); return this; }

}
