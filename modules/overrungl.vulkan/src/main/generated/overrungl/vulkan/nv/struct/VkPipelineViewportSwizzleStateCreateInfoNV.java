// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineViewportSwizzleStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineViewportSwizzleStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineViewportSwizzleStateCreateFlagsNV flags;
///     uint32_t viewportCount;
///     const VkViewportSwizzleNV* pViewportSwizzles;
/// };
/// ```
public final class VkPipelineViewportSwizzleStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineViewportSwizzleStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withName("pViewportSwizzles")
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
    /// The byte offset of `viewportCount`.
    public static final long OFFSET_viewportCount = LAYOUT.byteOffset(PathElement.groupElement("viewportCount"));
    /// The memory layout of `viewportCount`.
    public static final MemoryLayout LAYOUT_viewportCount = LAYOUT.select(PathElement.groupElement("viewportCount"));
    /// The [VarHandle] of `viewportCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_viewportCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportCount")));
    /// The byte offset of `pViewportSwizzles`.
    public static final long OFFSET_pViewportSwizzles = LAYOUT.byteOffset(PathElement.groupElement("pViewportSwizzles"));
    /// The memory layout of `pViewportSwizzles`.
    public static final MemoryLayout LAYOUT_pViewportSwizzles = LAYOUT.select(PathElement.groupElement("pViewportSwizzles"));
    /// The [VarHandle] of `pViewportSwizzles` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pViewportSwizzles = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewportSwizzles")));

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineViewportSwizzleStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportSwizzleStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportSwizzleStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportSwizzleStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineViewportSwizzleStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportSwizzleStateCreateInfoNV`
    public static VkPipelineViewportSwizzleStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportSwizzleStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineViewportSwizzleStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportSwizzleStateCreateInfoNV`
    public static VkPipelineViewportSwizzleStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV copyFrom(VkPipelineViewportSwizzleStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineViewportSwizzleStateCreateInfoNV reinterpret(long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineViewportSwizzleStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportSwizzleStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineViewportSwizzleStateCreateInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportCount(MemorySegment segment, long index) { return (int) VH_viewportCount.get().get(segment, 0L, index); }
    /// {@return `viewportCount`}
    public int viewportCount() { return viewportCount(this.segment(), 0L); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportCount(MemorySegment segment, long index, int value) { VH_viewportCount.get().set(segment, 0L, index, value); }
    /// Sets `viewportCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCount(int value) { viewportCount(this.segment(), 0L, value); return this; }

    /// {@return `pViewportSwizzles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pViewportSwizzles(MemorySegment segment, long index) { return (MemorySegment) VH_pViewportSwizzles.get().get(segment, 0L, index); }
    /// {@return `pViewportSwizzles`}
    public MemorySegment pViewportSwizzles() { return pViewportSwizzles(this.segment(), 0L); }
    /// Sets `pViewportSwizzles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pViewportSwizzles(MemorySegment segment, long index, MemorySegment value) { VH_pViewportSwizzles.get().set(segment, 0L, index, value); }
    /// Sets `pViewportSwizzles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzles(MemorySegment value) { pViewportSwizzles(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineViewportSwizzleStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineViewportSwizzleStateCreateInfoNV`
    public VkPipelineViewportSwizzleStateCreateInfoNV asSlice(long index) { return new VkPipelineViewportSwizzleStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineViewportSwizzleStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineViewportSwizzleStateCreateInfoNV`
    public VkPipelineViewportSwizzleStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineViewportSwizzleStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineViewportSwizzleStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV at(long index, Consumer<VkPipelineViewportSwizzleStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `viewportCount` at the given index}
    /// @param index the index of the struct buffer
    public int viewportCountAt(long index) { return viewportCount(this.segment(), index); }
    /// Sets `viewportCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV viewportCountAt(long index, int value) { viewportCount(this.segment(), index, value); return this; }

    /// {@return `pViewportSwizzles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pViewportSwizzlesAt(long index) { return pViewportSwizzles(this.segment(), index); }
    /// Sets `pViewportSwizzles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportSwizzleStateCreateInfoNV pViewportSwizzlesAt(long index, MemorySegment value) { pViewportSwizzles(this.segment(), index, value); return this; }

}
