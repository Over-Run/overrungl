// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSwapchainPresentFenceInfoEXT`.
/// ## Layout
/// ```
/// struct VkSwapchainPresentFenceInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t swapchainCount;
///     const VkFence* pFences;
/// };
/// ```
public final class VkSwapchainPresentFenceInfoEXT extends GroupType {
    /// The struct layout of `VkSwapchainPresentFenceInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pFences")
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
    /// The byte offset of `swapchainCount`.
    public static final long OFFSET_swapchainCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
    /// The memory layout of `swapchainCount`.
    public static final MemoryLayout LAYOUT_swapchainCount = LAYOUT.select(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_swapchainCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount")));
    /// The byte offset of `pFences`.
    public static final long OFFSET_pFences = LAYOUT.byteOffset(PathElement.groupElement("pFences"));
    /// The memory layout of `pFences`.
    public static final MemoryLayout LAYOUT_pFences = LAYOUT.select(PathElement.groupElement("pFences"));
    /// The [VarHandle] of `pFences` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pFences = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFences")));

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSwapchainPresentFenceInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentFenceInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentFenceInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSwapchainPresentFenceInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentFenceInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentFenceInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSwapchainPresentFenceInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentFenceInfoEXT`
    public static VkSwapchainPresentFenceInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentFenceInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSwapchainPresentFenceInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentFenceInfoEXT`
    public static VkSwapchainPresentFenceInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSwapchainPresentFenceInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT copyFrom(VkSwapchainPresentFenceInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSwapchainPresentFenceInfoEXT reinterpret(long count) { return new VkSwapchainPresentFenceInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSwapchainPresentFenceInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSwapchainPresentFenceInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get().get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    public int swapchainCount() { return swapchainCount(this.segment(), 0L); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchainCount(MemorySegment segment, long index, int value) { VH_swapchainCount.get().set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT swapchainCount(int value) { swapchainCount(this.segment(), 0L, value); return this; }

    /// {@return `pFences` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFences(MemorySegment segment, long index) { return (MemorySegment) VH_pFences.get().get(segment, 0L, index); }
    /// {@return `pFences`}
    public MemorySegment pFences() { return pFences(this.segment(), 0L); }
    /// Sets `pFences` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFences(MemorySegment segment, long index, MemorySegment value) { VH_pFences.get().set(segment, 0L, index, value); }
    /// Sets `pFences` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pFences(MemorySegment value) { pFences(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSwapchainPresentFenceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSwapchainPresentFenceInfoEXT`
    public VkSwapchainPresentFenceInfoEXT asSlice(long index) { return new VkSwapchainPresentFenceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSwapchainPresentFenceInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSwapchainPresentFenceInfoEXT`
    public VkSwapchainPresentFenceInfoEXT asSlice(long index, long count) { return new VkSwapchainPresentFenceInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSwapchainPresentFenceInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT at(long index, Consumer<VkSwapchainPresentFenceInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainCountAt(long index) { return swapchainCount(this.segment(), index); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT swapchainCountAt(long index, int value) { swapchainCount(this.segment(), index, value); return this; }

    /// {@return `pFences` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pFencesAt(long index) { return pFences(this.segment(), index); }
    /// Sets `pFences` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentFenceInfoEXT pFencesAt(long index, MemorySegment value) { pFences(this.segment(), index, value); return this; }

}
