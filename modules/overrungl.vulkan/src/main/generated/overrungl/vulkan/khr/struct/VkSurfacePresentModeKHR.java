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

/// Represents `VkSurfacePresentModeKHR`.
/// ## Layout
/// ```
/// struct VkSurfacePresentModeKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkPresentModeKHR presentMode;
/// };
/// ```
public final class VkSurfacePresentModeKHR extends GroupType {
    /// The struct layout of `VkSurfacePresentModeKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentMode")
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
    /// The byte offset of `presentMode`.
    public static final long OFFSET_presentMode = LAYOUT.byteOffset(PathElement.groupElement("presentMode"));
    /// The memory layout of `presentMode`.
    public static final MemoryLayout LAYOUT_presentMode = LAYOUT.select(PathElement.groupElement("presentMode"));
    /// The [VarHandle] of `presentMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentMode"));

    /// Creates `VkSurfacePresentModeKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSurfacePresentModeKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSurfacePresentModeKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfacePresentModeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSurfacePresentModeKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfacePresentModeKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfacePresentModeKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfacePresentModeKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfacePresentModeKHR`
    public static VkSurfacePresentModeKHR alloc(SegmentAllocator allocator) { return new VkSurfacePresentModeKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSurfacePresentModeKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfacePresentModeKHR`
    public static VkSurfacePresentModeKHR alloc(SegmentAllocator allocator, long count) { return new VkSurfacePresentModeKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfacePresentModeKHR copyFrom(VkSurfacePresentModeKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSurfacePresentModeKHR reinterpret(long count) { return new VkSurfacePresentModeKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSurfacePresentModeKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfacePresentModeKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentMode(MemorySegment segment, long index) { return (int) VH_presentMode.get(segment, 0L, index); }
    /// {@return `presentMode`}
    public int presentMode() { return presentMode(this.segment(), 0L); }
    /// Sets `presentMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentMode(MemorySegment segment, long index, int value) { VH_presentMode.set(segment, 0L, index, value); }
    /// Sets `presentMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeKHR presentMode(int value) { presentMode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSurfacePresentModeKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfacePresentModeKHR`
    public VkSurfacePresentModeKHR asSlice(long index) { return new VkSurfacePresentModeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSurfacePresentModeKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfacePresentModeKHR`
    public VkSurfacePresentModeKHR asSlice(long index, long count) { return new VkSurfacePresentModeKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSurfacePresentModeKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSurfacePresentModeKHR at(long index, Consumer<VkSurfacePresentModeKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentMode` at the given index}
    /// @param index the index of the struct buffer
    public int presentModeAt(long index) { return presentMode(this.segment(), index); }
    /// Sets `presentMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfacePresentModeKHR presentModeAt(long index, int value) { presentMode(this.segment(), index, value); return this; }

}
