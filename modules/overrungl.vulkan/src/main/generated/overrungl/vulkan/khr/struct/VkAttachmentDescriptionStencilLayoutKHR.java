// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentDescriptionStencilLayoutKHR`.
/// ## Layout
/// ```
/// struct VkAttachmentDescriptionStencilLayoutKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkImageLayout stencilInitialLayout;
///     (int) VkImageLayout stencilFinalLayout;
/// };
/// ```
public final class VkAttachmentDescriptionStencilLayoutKHR extends GroupType {
    /// The struct layout of `VkAttachmentDescriptionStencilLayoutKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilInitialLayout"),
        ValueLayout.JAVA_INT.withName("stencilFinalLayout")
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
    /// The byte offset of `stencilInitialLayout`.
    public static final long OFFSET_stencilInitialLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilInitialLayout"));
    /// The memory layout of `stencilInitialLayout`.
    public static final MemoryLayout LAYOUT_stencilInitialLayout = LAYOUT.select(PathElement.groupElement("stencilInitialLayout"));
    /// The [VarHandle] of `stencilInitialLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilInitialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilInitialLayout"));
    /// The byte offset of `stencilFinalLayout`.
    public static final long OFFSET_stencilFinalLayout = LAYOUT.byteOffset(PathElement.groupElement("stencilFinalLayout"));
    /// The memory layout of `stencilFinalLayout`.
    public static final MemoryLayout LAYOUT_stencilFinalLayout = LAYOUT.select(PathElement.groupElement("stencilFinalLayout"));
    /// The [VarHandle] of `stencilFinalLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilFinalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilFinalLayout"));

    /// Creates `VkAttachmentDescriptionStencilLayoutKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAttachmentDescriptionStencilLayoutKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAttachmentDescriptionStencilLayoutKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayoutKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayoutKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentDescriptionStencilLayoutKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayoutKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayoutKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAttachmentDescriptionStencilLayoutKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescriptionStencilLayoutKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescriptionStencilLayoutKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentDescriptionStencilLayoutKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentDescriptionStencilLayoutKHR`
    public static VkAttachmentDescriptionStencilLayoutKHR alloc(SegmentAllocator allocator) { return new VkAttachmentDescriptionStencilLayoutKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAttachmentDescriptionStencilLayoutKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentDescriptionStencilLayoutKHR`
    public static VkAttachmentDescriptionStencilLayoutKHR alloc(SegmentAllocator allocator, long count) { return new VkAttachmentDescriptionStencilLayoutKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR copyFrom(VkAttachmentDescriptionStencilLayoutKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAttachmentDescriptionStencilLayoutKHR reinterpret(long count) { return new VkAttachmentDescriptionStencilLayoutKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAttachmentDescriptionStencilLayoutKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAttachmentDescriptionStencilLayoutKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stencilInitialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilInitialLayout(MemorySegment segment, long index) { return (int) VH_stencilInitialLayout.get(segment, 0L, index); }
    /// {@return `stencilInitialLayout`}
    public int stencilInitialLayout() { return stencilInitialLayout(this.segment(), 0L); }
    /// Sets `stencilInitialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilInitialLayout(MemorySegment segment, long index, int value) { VH_stencilInitialLayout.set(segment, 0L, index, value); }
    /// Sets `stencilInitialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayout(int value) { stencilInitialLayout(this.segment(), 0L, value); return this; }

    /// {@return `stencilFinalLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilFinalLayout(MemorySegment segment, long index) { return (int) VH_stencilFinalLayout.get(segment, 0L, index); }
    /// {@return `stencilFinalLayout`}
    public int stencilFinalLayout() { return stencilFinalLayout(this.segment(), 0L); }
    /// Sets `stencilFinalLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilFinalLayout(MemorySegment segment, long index, int value) { VH_stencilFinalLayout.set(segment, 0L, index, value); }
    /// Sets `stencilFinalLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayout(int value) { stencilFinalLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAttachmentDescriptionStencilLayoutKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAttachmentDescriptionStencilLayoutKHR`
    public VkAttachmentDescriptionStencilLayoutKHR asSlice(long index) { return new VkAttachmentDescriptionStencilLayoutKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAttachmentDescriptionStencilLayoutKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAttachmentDescriptionStencilLayoutKHR`
    public VkAttachmentDescriptionStencilLayoutKHR asSlice(long index, long count) { return new VkAttachmentDescriptionStencilLayoutKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAttachmentDescriptionStencilLayoutKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR at(long index, Consumer<VkAttachmentDescriptionStencilLayoutKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stencilInitialLayout` at the given index}
    /// @param index the index of the struct buffer
    public int stencilInitialLayoutAt(long index) { return stencilInitialLayout(this.segment(), index); }
    /// Sets `stencilInitialLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayoutAt(long index, int value) { stencilInitialLayout(this.segment(), index, value); return this; }

    /// {@return `stencilFinalLayout` at the given index}
    /// @param index the index of the struct buffer
    public int stencilFinalLayoutAt(long index) { return stencilFinalLayout(this.segment(), index); }
    /// Sets `stencilFinalLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayoutAt(long index, int value) { stencilFinalLayout(this.segment(), index, value); return this; }

}
