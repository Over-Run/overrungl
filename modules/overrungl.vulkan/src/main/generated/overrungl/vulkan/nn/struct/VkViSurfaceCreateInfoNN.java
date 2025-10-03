// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nn.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkViSurfaceCreateInfoNN`.
/// ## Layout
/// ```
/// struct VkViSurfaceCreateInfoNN {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkViSurfaceCreateFlagsNN flags;
///     void* window;
/// };
/// ```
public final class VkViSurfaceCreateInfoNN extends GroupType {
    /// The struct layout of `VkViSurfaceCreateInfoNN`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("window")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `window`.
    public static final long OFFSET_window = LAYOUT.byteOffset(PathElement.groupElement("window"));
    /// The memory layout of `window`.
    public static final MemoryLayout LAYOUT_window = LAYOUT.select(PathElement.groupElement("window"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_window = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("window")));

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkViSurfaceCreateInfoNN(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViSurfaceCreateInfoNN of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViSurfaceCreateInfoNN(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViSurfaceCreateInfoNN ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViSurfaceCreateInfoNN(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkViSurfaceCreateInfoNN` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViSurfaceCreateInfoNN ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkViSurfaceCreateInfoNN(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkViSurfaceCreateInfoNN` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViSurfaceCreateInfoNN`
    public static VkViSurfaceCreateInfoNN alloc(SegmentAllocator allocator) { return new VkViSurfaceCreateInfoNN(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkViSurfaceCreateInfoNN` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViSurfaceCreateInfoNN`
    public static VkViSurfaceCreateInfoNN alloc(SegmentAllocator allocator, long count) { return new VkViSurfaceCreateInfoNN(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkViSurfaceCreateInfoNN copyFrom(VkViSurfaceCreateInfoNN src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkViSurfaceCreateInfoNN reinterpret(long count) { return new VkViSurfaceCreateInfoNN(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkViSurfaceCreateInfoNN sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkViSurfaceCreateInfoNN pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment window(MemorySegment segment, long index) { return (MemorySegment) VH_window.get().get(segment, 0L, index); }
    /// {@return `window`}
    public MemorySegment window() { return window(this.segment(), 0L); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void window(MemorySegment segment, long index, MemorySegment value) { VH_window.get().set(segment, 0L, index, value); }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN window(MemorySegment value) { window(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkViSurfaceCreateInfoNN`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkViSurfaceCreateInfoNN`
    public VkViSurfaceCreateInfoNN asSlice(long index) { return new VkViSurfaceCreateInfoNN(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkViSurfaceCreateInfoNN`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkViSurfaceCreateInfoNN`
    public VkViSurfaceCreateInfoNN asSlice(long index, long count) { return new VkViSurfaceCreateInfoNN(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkViSurfaceCreateInfoNN` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkViSurfaceCreateInfoNN at(long index, Consumer<VkViSurfaceCreateInfoNN> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `window` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment windowAt(long index) { return window(this.segment(), index); }
    /// Sets `window` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkViSurfaceCreateInfoNN windowAt(long index, MemorySegment value) { window(this.segment(), index, value); return this; }

}
