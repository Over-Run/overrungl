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

/// Represents `VkSurfacePresentModeCompatibilityEXT`.
/// ## Layout
/// ```
/// struct VkSurfacePresentModeCompatibilityEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t presentModeCount;
///     VkPresentModeKHR* pPresentModes;
/// };
/// ```
public final class VkSurfacePresentModeCompatibilityEXT extends GroupType {
    /// The struct layout of `VkSurfacePresentModeCompatibilityEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
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
    /// The byte offset of `presentModeCount`.
    public static final long OFFSET_presentModeCount = LAYOUT.byteOffset(PathElement.groupElement("presentModeCount"));
    /// The memory layout of `presentModeCount`.
    public static final MemoryLayout LAYOUT_presentModeCount = LAYOUT.select(PathElement.groupElement("presentModeCount"));
    /// The [VarHandle] of `presentModeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_presentModeCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentModeCount")));
    /// The byte offset of `pPresentModes`.
    public static final long OFFSET_pPresentModes = LAYOUT.byteOffset(PathElement.groupElement("pPresentModes"));
    /// The memory layout of `pPresentModes`.
    public static final MemoryLayout LAYOUT_pPresentModes = LAYOUT.select(PathElement.groupElement("pPresentModes"));
    /// The [VarHandle] of `pPresentModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pPresentModes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes")));

    /// Creates `VkSurfacePresentModeCompatibilityEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSurfacePresentModeCompatibilityEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSurfacePresentModeCompatibilityEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeCompatibilityEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfacePresentModeCompatibilityEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeCompatibilityEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSurfacePresentModeCompatibilityEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeCompatibilityEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeCompatibilityEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfacePresentModeCompatibilityEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentModeCompatibilityEXT`
    public static VkSurfacePresentModeCompatibilityEXT alloc(SegmentAllocator allocator) { return new VkSurfacePresentModeCompatibilityEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSurfacePresentModeCompatibilityEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfacePresentModeCompatibilityEXT`
    public static VkSurfacePresentModeCompatibilityEXT alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentModeCompatibilityEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT copyFrom(VkSurfacePresentModeCompatibilityEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSurfacePresentModeCompatibilityEXT reinterpret(long count) { return new VkSurfacePresentModeCompatibilityEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSurfacePresentModeCompatibilityEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfacePresentModeCompatibilityEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentModeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentModeCount(MemorySegment segment, long index) { return (int) VH_presentModeCount.get().get(segment, 0L, index); }
    /// {@return `presentModeCount`}
    public int presentModeCount() { return presentModeCount(this.segment(), 0L); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentModeCount(MemorySegment segment, long index, int value) { VH_presentModeCount.get().set(segment, 0L, index, value); }
    /// Sets `presentModeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT presentModeCount(int value) { presentModeCount(this.segment(), 0L, value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPresentModes(MemorySegment segment, long index) { return (MemorySegment) VH_pPresentModes.get().get(segment, 0L, index); }
    /// {@return `pPresentModes`}
    public MemorySegment pPresentModes() { return pPresentModes(this.segment(), 0L); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPresentModes(MemorySegment segment, long index, MemorySegment value) { VH_pPresentModes.get().set(segment, 0L, index, value); }
    /// Sets `pPresentModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT pPresentModes(MemorySegment value) { pPresentModes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSurfacePresentModeCompatibilityEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfacePresentModeCompatibilityEXT`
    public VkSurfacePresentModeCompatibilityEXT asSlice(long index) { return new VkSurfacePresentModeCompatibilityEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSurfacePresentModeCompatibilityEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfacePresentModeCompatibilityEXT`
    public VkSurfacePresentModeCompatibilityEXT asSlice(long index, long count) { return new VkSurfacePresentModeCompatibilityEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSurfacePresentModeCompatibilityEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT at(long index, Consumer<VkSurfacePresentModeCompatibilityEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentModeCount` at the given index}
    /// @param index the index of the struct buffer
    public int presentModeCountAt(long index) { return presentModeCount(this.segment(), index); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT presentModeCountAt(long index, int value) { presentModeCount(this.segment(), index, value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPresentModesAt(long index) { return pPresentModes(this.segment(), index); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeCompatibilityEXT pPresentModesAt(long index, MemorySegment value) { pPresentModes(this.segment(), index, value); return this; }

}
