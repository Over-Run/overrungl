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

/// Represents `VkScreenSurfaceCreateInfoQNX`.
/// ## Layout
/// ```
/// struct VkScreenSurfaceCreateInfoQNX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkScreenSurfaceCreateFlagsQNX flags;
///     struct _screen_context * context;
///     struct _screen_window * window;
/// };
/// ```
public final class VkScreenSurfaceCreateInfoQNX extends GroupType {
    /// The struct layout of `VkScreenSurfaceCreateInfoQNX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("context"),
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
    /// The byte offset of `context`.
    public static final long OFFSET_context = LAYOUT.byteOffset(PathElement.groupElement("context"));
    /// The memory layout of `context`.
    public static final MemoryLayout LAYOUT_context = LAYOUT.select(PathElement.groupElement("context"));
    /// The [VarHandle] of `context` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_context = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("context")));
    /// The byte offset of `window`.
    public static final long OFFSET_window = LAYOUT.byteOffset(PathElement.groupElement("window"));
    /// The memory layout of `window`.
    public static final MemoryLayout LAYOUT_window = LAYOUT.select(PathElement.groupElement("window"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_window = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("window")));

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkScreenSurfaceCreateInfoQNX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenSurfaceCreateInfoQNX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenSurfaceCreateInfoQNX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkScreenSurfaceCreateInfoQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkScreenSurfaceCreateInfoQNX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkScreenSurfaceCreateInfoQNX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkScreenSurfaceCreateInfoQNX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkScreenSurfaceCreateInfoQNX`
    public static VkScreenSurfaceCreateInfoQNX alloc(SegmentAllocator allocator) { return new VkScreenSurfaceCreateInfoQNX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkScreenSurfaceCreateInfoQNX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkScreenSurfaceCreateInfoQNX`
    public static VkScreenSurfaceCreateInfoQNX alloc(SegmentAllocator allocator, long count) { return new VkScreenSurfaceCreateInfoQNX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX copyFrom(VkScreenSurfaceCreateInfoQNX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkScreenSurfaceCreateInfoQNX reinterpret(long count) { return new VkScreenSurfaceCreateInfoQNX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkScreenSurfaceCreateInfoQNX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkScreenSurfaceCreateInfoQNX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkScreenSurfaceCreateInfoQNX flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `context` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment context(MemorySegment segment, long index) { return (MemorySegment) VH_context.get().get(segment, 0L, index); }
    /// {@return `context`}
    public MemorySegment context() { return context(this.segment(), 0L); }
    /// Sets `context` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void context(MemorySegment segment, long index, MemorySegment value) { VH_context.get().set(segment, 0L, index, value); }
    /// Sets `context` with the given value.
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX context(MemorySegment value) { context(this.segment(), 0L, value); return this; }

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
    public VkScreenSurfaceCreateInfoQNX window(MemorySegment value) { window(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkScreenSurfaceCreateInfoQNX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkScreenSurfaceCreateInfoQNX`
    public VkScreenSurfaceCreateInfoQNX asSlice(long index) { return new VkScreenSurfaceCreateInfoQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkScreenSurfaceCreateInfoQNX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkScreenSurfaceCreateInfoQNX`
    public VkScreenSurfaceCreateInfoQNX asSlice(long index, long count) { return new VkScreenSurfaceCreateInfoQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkScreenSurfaceCreateInfoQNX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX at(long index, Consumer<VkScreenSurfaceCreateInfoQNX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `context` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment contextAt(long index) { return context(this.segment(), index); }
    /// Sets `context` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX contextAt(long index, MemorySegment value) { context(this.segment(), index, value); return this; }

    /// {@return `window` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment windowAt(long index) { return window(this.segment(), index); }
    /// Sets `window` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkScreenSurfaceCreateInfoQNX windowAt(long index, MemorySegment value) { window(this.segment(), index, value); return this; }

}
