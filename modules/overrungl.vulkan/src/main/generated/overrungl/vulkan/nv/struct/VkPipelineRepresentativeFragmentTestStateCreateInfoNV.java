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

/// Represents `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkPipelineRepresentativeFragmentTestStateCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 representativeFragmentTestEnable;
/// };
/// ```
public final class VkPipelineRepresentativeFragmentTestStateCreateInfoNV extends GroupType {
    /// The struct layout of `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("representativeFragmentTestEnable")
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
    /// The byte offset of `representativeFragmentTestEnable`.
    public static final long OFFSET_representativeFragmentTestEnable = LAYOUT.byteOffset(PathElement.groupElement("representativeFragmentTestEnable"));
    /// The memory layout of `representativeFragmentTestEnable`.
    public static final MemoryLayout LAYOUT_representativeFragmentTestEnable = LAYOUT.select(PathElement.groupElement("representativeFragmentTestEnable"));
    /// The [VarHandle] of `representativeFragmentTestEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_representativeFragmentTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("representativeFragmentTestEnable"));

    /// Creates `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`
    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV copyFrom(VkPipelineRepresentativeFragmentTestStateCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV reinterpret(long count) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `representativeFragmentTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int representativeFragmentTestEnable(MemorySegment segment, long index) { return (int) VH_representativeFragmentTestEnable.get(segment, 0L, index); }
    /// {@return `representativeFragmentTestEnable`}
    public int representativeFragmentTestEnable() { return representativeFragmentTestEnable(this.segment(), 0L); }
    /// Sets `representativeFragmentTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void representativeFragmentTestEnable(MemorySegment segment, long index, int value) { VH_representativeFragmentTestEnable.set(segment, 0L, index, value); }
    /// Sets `representativeFragmentTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnable(int value) { representativeFragmentTestEnable(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV asSlice(long index) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRepresentativeFragmentTestStateCreateInfoNV`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV asSlice(long index, long count) { return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineRepresentativeFragmentTestStateCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV at(long index, Consumer<VkPipelineRepresentativeFragmentTestStateCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `representativeFragmentTestEnable` at the given index}
    /// @param index the index of the struct buffer
    public int representativeFragmentTestEnableAt(long index) { return representativeFragmentTestEnable(this.segment(), index); }
    /// Sets `representativeFragmentTestEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnableAt(long index, int value) { representativeFragmentTestEnable(this.segment(), index, value); return this; }

}
