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

/// Represents `VkBindImagePlaneMemoryInfoKHR`.
/// ## Layout
/// ```
/// struct VkBindImagePlaneMemoryInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkImageAspectFlagBits planeAspect;
/// };
/// ```
public final class VkBindImagePlaneMemoryInfoKHR extends GroupType {
    /// The struct layout of `VkBindImagePlaneMemoryInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("planeAspect")
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
    /// The byte offset of `planeAspect`.
    public static final long OFFSET_planeAspect = LAYOUT.byteOffset(PathElement.groupElement("planeAspect"));
    /// The memory layout of `planeAspect`.
    public static final MemoryLayout LAYOUT_planeAspect = LAYOUT.select(PathElement.groupElement("planeAspect"));
    /// The [VarHandle] of `planeAspect` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_planeAspect = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeAspect")));

    /// Creates `VkBindImagePlaneMemoryInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindImagePlaneMemoryInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindImagePlaneMemoryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImagePlaneMemoryInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImagePlaneMemoryInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindImagePlaneMemoryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImagePlaneMemoryInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImagePlaneMemoryInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindImagePlaneMemoryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindImagePlaneMemoryInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindImagePlaneMemoryInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindImagePlaneMemoryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindImagePlaneMemoryInfoKHR`
    public static VkBindImagePlaneMemoryInfoKHR alloc(SegmentAllocator allocator) { return new VkBindImagePlaneMemoryInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindImagePlaneMemoryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindImagePlaneMemoryInfoKHR`
    public static VkBindImagePlaneMemoryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkBindImagePlaneMemoryInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindImagePlaneMemoryInfoKHR copyFrom(VkBindImagePlaneMemoryInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindImagePlaneMemoryInfoKHR reinterpret(long count) { return new VkBindImagePlaneMemoryInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindImagePlaneMemoryInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindImagePlaneMemoryInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `planeAspect` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int planeAspect(MemorySegment segment, long index) { return (int) VH_planeAspect.get().get(segment, 0L, index); }
    /// {@return `planeAspect`}
    public int planeAspect() { return planeAspect(this.segment(), 0L); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void planeAspect(MemorySegment segment, long index, int value) { VH_planeAspect.get().set(segment, 0L, index, value); }
    /// Sets `planeAspect` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfoKHR planeAspect(int value) { planeAspect(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindImagePlaneMemoryInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindImagePlaneMemoryInfoKHR`
    public VkBindImagePlaneMemoryInfoKHR asSlice(long index) { return new VkBindImagePlaneMemoryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindImagePlaneMemoryInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindImagePlaneMemoryInfoKHR`
    public VkBindImagePlaneMemoryInfoKHR asSlice(long index, long count) { return new VkBindImagePlaneMemoryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindImagePlaneMemoryInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindImagePlaneMemoryInfoKHR at(long index, Consumer<VkBindImagePlaneMemoryInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `planeAspect` at the given index}
    /// @param index the index of the struct buffer
    public int planeAspectAt(long index) { return planeAspect(this.segment(), index); }
    /// Sets `planeAspect` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindImagePlaneMemoryInfoKHR planeAspectAt(long index, int value) { planeAspect(this.segment(), index, value); return this; }

}
