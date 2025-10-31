// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkImageStencilUsageCreateInfo`.
/// ## Layout
/// ```
/// struct VkImageStencilUsageCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkImageUsageFlags stencilUsage;
/// };
/// ```
public final class VkImageStencilUsageCreateInfo extends GroupType {
    /// The struct layout of `VkImageStencilUsageCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stencilUsage")
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
    /// The byte offset of `stencilUsage`.
    public static final long OFFSET_stencilUsage = LAYOUT.byteOffset(PathElement.groupElement("stencilUsage"));
    /// The memory layout of `stencilUsage`.
    public static final MemoryLayout LAYOUT_stencilUsage = LAYOUT.select(PathElement.groupElement("stencilUsage"));
    /// The [VarHandle] of `stencilUsage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilUsage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilUsage"));

    /// Creates `VkImageStencilUsageCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageStencilUsageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageStencilUsageCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageStencilUsageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageStencilUsageCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageStencilUsageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageStencilUsageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageStencilUsageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageStencilUsageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageStencilUsageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageStencilUsageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageStencilUsageCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageStencilUsageCreateInfo`
    public static VkImageStencilUsageCreateInfo alloc(SegmentAllocator allocator) { return new VkImageStencilUsageCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageStencilUsageCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageStencilUsageCreateInfo`
    public static VkImageStencilUsageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageStencilUsageCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageStencilUsageCreateInfo copyFrom(VkImageStencilUsageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageStencilUsageCreateInfo reinterpret(long count) { return new VkImageStencilUsageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageStencilUsageCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageStencilUsageCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stencilUsage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilUsage(MemorySegment segment, long index) { return (int) VH_stencilUsage.get(segment, 0L, index); }
    /// {@return `stencilUsage`}
    public int stencilUsage() { return stencilUsage(this.segment(), 0L); }
    /// Sets `stencilUsage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilUsage(MemorySegment segment, long index, int value) { VH_stencilUsage.set(segment, 0L, index, value); }
    /// Sets `stencilUsage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageStencilUsageCreateInfo stencilUsage(int value) { stencilUsage(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageStencilUsageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageStencilUsageCreateInfo`
    public VkImageStencilUsageCreateInfo asSlice(long index) { return new VkImageStencilUsageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageStencilUsageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageStencilUsageCreateInfo`
    public VkImageStencilUsageCreateInfo asSlice(long index, long count) { return new VkImageStencilUsageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageStencilUsageCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageStencilUsageCreateInfo at(long index, Consumer<VkImageStencilUsageCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageStencilUsageCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageStencilUsageCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stencilUsage` at the given index}
    /// @param index the index of the struct buffer
    public int stencilUsageAt(long index) { return stencilUsage(this.segment(), index); }
    /// Sets `stencilUsage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageStencilUsageCreateInfo stencilUsageAt(long index, int value) { stencilUsage(this.segment(), index, value); return this; }

}
