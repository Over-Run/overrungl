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

/// Represents `VkXcbSurfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkXcbSurfaceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkXcbSurfaceCreateFlagsKHR flags;
///     xcb_connection_t* connection;
///     (uint32_t) xcb_window_t window;
/// };
/// ```
public final class VkXcbSurfaceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkXcbSurfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("connection"),
        ValueLayout.JAVA_INT.withName("window")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `connection`.
    public static final long OFFSET_connection = LAYOUT.byteOffset(PathElement.groupElement("connection"));
    /// The memory layout of `connection`.
    public static final MemoryLayout LAYOUT_connection = LAYOUT.select(PathElement.groupElement("connection"));
    /// The [VarHandle] of `connection` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_connection = LAYOUT.arrayElementVarHandle(PathElement.groupElement("connection"));
    /// The byte offset of `window`.
    public static final long OFFSET_window = LAYOUT.byteOffset(PathElement.groupElement("window"));
    /// The memory layout of `window`.
    public static final MemoryLayout LAYOUT_window = LAYOUT.select(PathElement.groupElement("window"));
    /// The [VarHandle] of `window` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_window = LAYOUT.arrayElementVarHandle(PathElement.groupElement("window"));

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkXcbSurfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXcbSurfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXcbSurfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkXcbSurfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkXcbSurfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkXcbSurfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkXcbSurfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkXcbSurfaceCreateInfoKHR`
    public static VkXcbSurfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkXcbSurfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkXcbSurfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkXcbSurfaceCreateInfoKHR`
    public static VkXcbSurfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkXcbSurfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR copyFrom(VkXcbSurfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkXcbSurfaceCreateInfoKHR reinterpret(long count) { return new VkXcbSurfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkXcbSurfaceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkXcbSurfaceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `connection` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment connection(MemorySegment segment, long index) { return (MemorySegment) VH_connection.get(segment, 0L, index); }
    /// {@return `connection`}
    public MemorySegment connection() { return connection(this.segment(), 0L); }
    /// Sets `connection` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void connection(MemorySegment segment, long index, MemorySegment value) { VH_connection.set(segment, 0L, index, value); }
    /// Sets `connection` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR connection(MemorySegment value) { connection(this.segment(), 0L, value); return this; }

    /// {@return `window` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int window(MemorySegment segment, long index) { return (int) VH_window.get(segment, 0L, index); }
    /// {@return `window`}
    public int window() { return window(this.segment(), 0L); }
    /// Sets `window` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void window(MemorySegment segment, long index, int value) { VH_window.set(segment, 0L, index, value); }
    /// Sets `window` with the given value.
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR window(int value) { window(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkXcbSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkXcbSurfaceCreateInfoKHR`
    public VkXcbSurfaceCreateInfoKHR asSlice(long index) { return new VkXcbSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkXcbSurfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkXcbSurfaceCreateInfoKHR`
    public VkXcbSurfaceCreateInfoKHR asSlice(long index, long count) { return new VkXcbSurfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkXcbSurfaceCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR at(long index, Consumer<VkXcbSurfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `connection` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment connectionAt(long index) { return connection(this.segment(), index); }
    /// Sets `connection` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR connectionAt(long index, MemorySegment value) { connection(this.segment(), index, value); return this; }

    /// {@return `window` at the given index}
    /// @param index the index of the struct buffer
    public int windowAt(long index) { return window(this.segment(), index); }
    /// Sets `window` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkXcbSurfaceCreateInfoKHR windowAt(long index, int value) { window(this.segment(), index, value); return this; }

}
