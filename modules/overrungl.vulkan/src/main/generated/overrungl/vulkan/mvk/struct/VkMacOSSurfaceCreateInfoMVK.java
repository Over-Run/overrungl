// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.mvk.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMacOSSurfaceCreateInfoMVK`.
/// ## Layout
/// ```
/// struct VkMacOSSurfaceCreateInfoMVK {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkMacOSSurfaceCreateFlagsMVK flags;
///     const void* pView;
/// };
/// ```
public final class VkMacOSSurfaceCreateInfoMVK extends GroupType {
    /// The struct layout of `VkMacOSSurfaceCreateInfoMVK`.
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
    /// The byte offset of `pView`.
    public static final long OFFSET_pView = LAYOUT.byteOffset(PathElement.groupElement("pView"));
    /// The memory layout of `pView`.
    public static final MemoryLayout LAYOUT_pView = LAYOUT.select(PathElement.groupElement("pView"));
    /// The [VarHandle] of `pView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pView = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pView")));

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMacOSSurfaceCreateInfoMVK(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMacOSSurfaceCreateInfoMVK of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMacOSSurfaceCreateInfoMVK ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMacOSSurfaceCreateInfoMVK` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMacOSSurfaceCreateInfoMVK ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMacOSSurfaceCreateInfoMVK(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMacOSSurfaceCreateInfoMVK` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMacOSSurfaceCreateInfoMVK`
    public static VkMacOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator) { return new VkMacOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMacOSSurfaceCreateInfoMVK` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMacOSSurfaceCreateInfoMVK`
    public static VkMacOSSurfaceCreateInfoMVK alloc(SegmentAllocator allocator, long count) { return new VkMacOSSurfaceCreateInfoMVK(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK copyFrom(VkMacOSSurfaceCreateInfoMVK src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMacOSSurfaceCreateInfoMVK reinterpret(long count) { return new VkMacOSSurfaceCreateInfoMVK(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMacOSSurfaceCreateInfoMVK sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMacOSSurfaceCreateInfoMVK pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkMacOSSurfaceCreateInfoMVK flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pView(MemorySegment segment, long index) { return (MemorySegment) VH_pView.get().get(segment, 0L, index); }
    /// {@return `pView`}
    public MemorySegment pView() { return pView(this.segment(), 0L); }
    /// Sets `pView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pView(MemorySegment segment, long index, MemorySegment value) { VH_pView.get().set(segment, 0L, index, value); }
    /// Sets `pView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pView(MemorySegment value) { pView(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMacOSSurfaceCreateInfoMVK`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMacOSSurfaceCreateInfoMVK`
    public VkMacOSSurfaceCreateInfoMVK asSlice(long index) { return new VkMacOSSurfaceCreateInfoMVK(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMacOSSurfaceCreateInfoMVK`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMacOSSurfaceCreateInfoMVK`
    public VkMacOSSurfaceCreateInfoMVK asSlice(long index, long count) { return new VkMacOSSurfaceCreateInfoMVK(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMacOSSurfaceCreateInfoMVK` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK at(long index, Consumer<VkMacOSSurfaceCreateInfoMVK> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pView` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewAt(long index) { return pView(this.segment(), index); }
    /// Sets `pView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMacOSSurfaceCreateInfoMVK pViewAt(long index, MemorySegment value) { pView(this.segment(), index, value); return this; }

}
