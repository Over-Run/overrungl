// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMicromapInfoEXT`.
/// ## Layout
/// ```
/// struct VkCopyMicromapInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkMicromapEXT src;
///     (uint64_t) VkMicromapEXT dst;
///     (int) VkCopyMicromapModeEXT mode;
/// };
/// ```
public final class VkCopyMicromapInfoEXT extends GroupType {
    /// The struct layout of `VkCopyMicromapInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("src"),
        ValueLayout.JAVA_LONG.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
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
    /// The byte offset of `src`.
    public static final long OFFSET_src = LAYOUT.byteOffset(PathElement.groupElement("src"));
    /// The memory layout of `src`.
    public static final MemoryLayout LAYOUT_src = LAYOUT.select(PathElement.groupElement("src"));
    /// The [VarHandle] of `src` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_src = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("src")));
    /// The byte offset of `dst`.
    public static final long OFFSET_dst = LAYOUT.byteOffset(PathElement.groupElement("dst"));
    /// The memory layout of `dst`.
    public static final MemoryLayout LAYOUT_dst = LAYOUT.select(PathElement.groupElement("dst"));
    /// The [VarHandle] of `dst` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dst = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dst")));
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_mode = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode")));

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyMicromapInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMicromapInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMicromapInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMicromapInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMicromapInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyMicromapInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMicromapInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMicromapInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyMicromapInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMicromapInfoEXT`
    public static VkCopyMicromapInfoEXT alloc(SegmentAllocator allocator) { return new VkCopyMicromapInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyMicromapInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMicromapInfoEXT`
    public static VkCopyMicromapInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkCopyMicromapInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMicromapInfoEXT copyFrom(VkCopyMicromapInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyMicromapInfoEXT reinterpret(long count) { return new VkCopyMicromapInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCopyMicromapInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyMicromapInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `src` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long src(MemorySegment segment, long index) { return (long) VH_src.get().get(segment, 0L, index); }
    /// {@return `src`}
    public long src() { return src(this.segment(), 0L); }
    /// Sets `src` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void src(MemorySegment segment, long index, long value) { VH_src.get().set(segment, 0L, index, value); }
    /// Sets `src` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT src(long value) { src(this.segment(), 0L, value); return this; }

    /// {@return `dst` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dst(MemorySegment segment, long index) { return (long) VH_dst.get().get(segment, 0L, index); }
    /// {@return `dst`}
    public long dst() { return dst(this.segment(), 0L); }
    /// Sets `dst` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dst(MemorySegment segment, long index, long value) { VH_dst.get().set(segment, 0L, index, value); }
    /// Sets `dst` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT dst(long value) { dst(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get().get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.get().set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyMicromapInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyMicromapInfoEXT`
    public VkCopyMicromapInfoEXT asSlice(long index) { return new VkCopyMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyMicromapInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyMicromapInfoEXT`
    public VkCopyMicromapInfoEXT asSlice(long index, long count) { return new VkCopyMicromapInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyMicromapInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyMicromapInfoEXT at(long index, Consumer<VkCopyMicromapInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `src` at the given index}
    /// @param index the index of the struct buffer
    public long srcAt(long index) { return src(this.segment(), index); }
    /// Sets `src` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT srcAt(long index, long value) { src(this.segment(), index, value); return this; }

    /// {@return `dst` at the given index}
    /// @param index the index of the struct buffer
    public long dstAt(long index) { return dst(this.segment(), index); }
    /// Sets `dst` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT dstAt(long index, long value) { dst(this.segment(), index, value); return this; }

    /// {@return `mode` at the given index}
    /// @param index the index of the struct buffer
    public int modeAt(long index) { return mode(this.segment(), index); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMicromapInfoEXT modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

}
