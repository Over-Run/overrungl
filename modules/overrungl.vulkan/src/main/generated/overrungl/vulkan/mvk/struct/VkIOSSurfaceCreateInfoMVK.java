// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.mvk.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIOSSurfaceCreateInfoMVK`.
/// ## Layout
/// ```
/// struct VkIOSSurfaceCreateInfoMVK {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkIOSSurfaceCreateFlagsMVK flags;
///     const void* pView;
/// };
/// ```
public final class VkIOSSurfaceCreateInfoMVK extends GroupType {
    /// The struct layout of `VkIOSSurfaceCreateInfoMVK`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pView")
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
    /// The byte offset of `pView`.
    public static final long OFFSET_pView = LAYOUT.byteOffset(PathElement.groupElement("pView"));
    /// The memory layout of `pView`.
    public static final MemoryLayout LAYOUT_pView = LAYOUT.select(PathElement.groupElement("pView"));
    /// The [VarHandle] of `pView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pView"));

    /// Creates `VkIOSSurfaceCreateInfoMVK` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIOSSurfaceCreateInfoMVK(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIOSSurfaceCreateInfoMVK` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIOSSurfaceCreateInfoMVK of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIOSSurfaceCreateInfoMVK(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIOSSurfaceCreateInfoMVK` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIOSSurfaceCreateInfoMVK ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIOSSurfaceCreateInfoMVK(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIOSSurfaceCreateInfoMVK` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIOSSurfaceCreateInfoMVK ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIOSSurfaceCreateInfoMVK(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIOSSurfaceCreateInfoMVK` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIOSSurfaceCreateInfoMVK`
    public static VkIOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator) { return new VkIOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIOSSurfaceCreateInfoMVK` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIOSSurfaceCreateInfoMVK`
    public static VkIOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator, long count) { return new VkIOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK copyFrom(VkIOSSurfaceCreateInfoMVK src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIOSSurfaceCreateInfoMVK reinterpret(long count) { return new VkIOSSurfaceCreateInfoMVK(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkIOSSurfaceCreateInfoMVK sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIOSSurfaceCreateInfoMVK pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkIOSSurfaceCreateInfoMVK flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pView(MemorySegment segment, long index) { return (MemorySegment) VH_pView.get(segment, 0L, index); }
    /// {@return `pView`}
    public MemorySegment pView() { return pView(this.segment(), 0L); }
    /// Sets `pView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pView(MemorySegment segment, long index, MemorySegment value) { VH_pView.set(segment, 0L, index, value); }
    /// Sets `pView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK pView(MemorySegment value) { pView(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIOSSurfaceCreateInfoMVK`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIOSSurfaceCreateInfoMVK`
    public VkIOSSurfaceCreateInfoMVK asSlice(long index) { return new VkIOSSurfaceCreateInfoMVK(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIOSSurfaceCreateInfoMVK`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIOSSurfaceCreateInfoMVK`
    public VkIOSSurfaceCreateInfoMVK asSlice(long index, long count) { return new VkIOSSurfaceCreateInfoMVK(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIOSSurfaceCreateInfoMVK` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK at(long index, Consumer<VkIOSSurfaceCreateInfoMVK> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pView` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewAt(long index) { return pView(this.segment(), index); }
    /// Sets `pView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIOSSurfaceCreateInfoMVK pViewAt(long index, MemorySegment value) { pView(this.segment(), index, value); return this; }

}
