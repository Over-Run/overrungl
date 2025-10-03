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

/// Represents `VkSurfaceCapabilitiesPresentId2KHR`.
/// ## Layout
/// ```
/// struct VkSurfaceCapabilitiesPresentId2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 presentId2Supported;
/// };
/// ```
public final class VkSurfaceCapabilitiesPresentId2KHR extends GroupType {
    /// The struct layout of `VkSurfaceCapabilitiesPresentId2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentId2Supported")
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
    /// The byte offset of `presentId2Supported`.
    public static final long OFFSET_presentId2Supported = LAYOUT.byteOffset(PathElement.groupElement("presentId2Supported"));
    /// The memory layout of `presentId2Supported`.
    public static final MemoryLayout LAYOUT_presentId2Supported = LAYOUT.select(PathElement.groupElement("presentId2Supported"));
    /// The [VarHandle] of `presentId2Supported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_presentId2Supported = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId2Supported")));

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSurfaceCapabilitiesPresentId2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilitiesPresentId2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilitiesPresentId2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilitiesPresentId2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static VkSurfaceCapabilitiesPresentId2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilitiesPresentId2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static VkSurfaceCapabilitiesPresentId2KHR alloc(SegmentAllocator allocator, long count) { return new VkSurfaceCapabilitiesPresentId2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR copyFrom(VkSurfaceCapabilitiesPresentId2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSurfaceCapabilitiesPresentId2KHR reinterpret(long count) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSurfaceCapabilitiesPresentId2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfaceCapabilitiesPresentId2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentId2Supported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentId2Supported(MemorySegment segment, long index) { return (int) VH_presentId2Supported.get().get(segment, 0L, index); }
    /// {@return `presentId2Supported`}
    public int presentId2Supported() { return presentId2Supported(this.segment(), 0L); }
    /// Sets `presentId2Supported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentId2Supported(MemorySegment segment, long index, int value) { VH_presentId2Supported.get().set(segment, 0L, index, value); }
    /// Sets `presentId2Supported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR presentId2Supported(int value) { presentId2Supported(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSurfaceCapabilitiesPresentId2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSurfaceCapabilitiesPresentId2KHR`
    public VkSurfaceCapabilitiesPresentId2KHR asSlice(long index) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSurfaceCapabilitiesPresentId2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSurfaceCapabilitiesPresentId2KHR`
    public VkSurfaceCapabilitiesPresentId2KHR asSlice(long index, long count) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSurfaceCapabilitiesPresentId2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR at(long index, Consumer<VkSurfaceCapabilitiesPresentId2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentId2Supported` at the given index}
    /// @param index the index of the struct buffer
    public int presentId2SupportedAt(long index) { return presentId2Supported(this.segment(), index); }
    /// Sets `presentId2Supported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR presentId2SupportedAt(long index, int value) { presentId2Supported(this.segment(), index, value); return this; }

}
