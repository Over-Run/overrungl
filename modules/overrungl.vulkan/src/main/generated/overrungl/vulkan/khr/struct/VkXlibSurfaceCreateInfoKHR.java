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

/// Represents `VkXlibSurfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkXlibSurfaceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkXlibSurfaceCreateFlagsKHR flags;
///     Display* dpy;
///     ((unsigned long) XID) Window window;
/// };
/// ```
public final class VkXlibSurfaceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkXlibSurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("dpy"),
        CanonicalTypes.C_LONG.withName("window")
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
    /// The byte offset of `dpy`.
    public static final long OFFSET_dpy = LAYOUT.byteOffset(PathElement.groupElement("dpy"));
    /// The memory layout of `dpy`.
    public static final MemoryLayout LAYOUT_dpy = LAYOUT.select(PathElement.groupElement("dpy"));
    /// The [VarHandle] of `dpy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dpy = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dpy")));
    /// The byte offset of `window`.
    public static final long OFFSET_window = LAYOUT.byteOffset(PathElement.groupElement("window"));
    /// The memory layout of `window`.
    public static final MemoryLayout LAYOUT_window = LAYOUT.select(PathElement.groupElement("window"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_window = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("window")));

    /// Creates `VkXlibSurfaceCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkXlibSurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkXlibSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXlibSurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkXlibSurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkXlibSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXlibSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkXlibSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkXlibSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXlibSurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkXlibSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkXlibSurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkXlibSurfaceCreateInfoKHR`
    public static VkXlibSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkXlibSurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkXlibSurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkXlibSurfaceCreateInfoKHR`
    public static VkXlibSurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkXlibSurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR copyFrom(VkXlibSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkXlibSurfaceCreateInfoKHR reinterpret(long count) { return new VkXlibSurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkXlibSurfaceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkXlibSurfaceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkXlibSurfaceCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `dpy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dpy(MemorySegment segment, long index) { return (MemorySegment) VH_dpy.get().get(segment, 0L, index); }
    /// {@return `dpy`}
    public MemorySegment dpy() { return dpy(this.segment(), 0L); }
    /// Sets `dpy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dpy(MemorySegment segment, long index, MemorySegment value) { VH_dpy.get().set(segment, 0L, index, value); }
    /// Sets `dpy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR dpy(MemorySegment value) { dpy(this.segment(), 0L, value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long window(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.C_LONG, VH_window.get().get(segment, 0L, index)); }
    /// {@return `window`}
    public long window() { return window(this.segment(), 0L); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void window(MemorySegment segment, long index, long value) { VH_window.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.C_LONG, value)); }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR window(long value) { window(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkXlibSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkXlibSurfaceCreateInfoKHR`
    public VkXlibSurfaceCreateInfoKHR asSlice(long index) { return new VkXlibSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkXlibSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkXlibSurfaceCreateInfoKHR`
    public VkXlibSurfaceCreateInfoKHR asSlice(long index, long count) { return new VkXlibSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkXlibSurfaceCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR at(long index, Consumer<VkXlibSurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `dpy` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dpyAt(long index) { return dpy(this.segment(), index); }
    /// Sets `dpy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR dpyAt(long index, MemorySegment value) { dpy(this.segment(), index, value); return this; }

    /// {@return `window` at the given index}
    /// @param index the index of the struct buffer
    public long windowAt(long index) { return window(this.segment(), index); }
    /// Sets `window` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXlibSurfaceCreateInfoKHR windowAt(long index, long value) { window(this.segment(), index, value); return this; }

}
