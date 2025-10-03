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

/// Represents `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`.
/// ## Layout
/// ```
/// struct VkDescriptorSetVariableDescriptorCountAllocateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t descriptorSetCount;
///     const uint32_t* pDescriptorCounts;
/// };
/// ```
public final class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends GroupType {
    /// The struct layout of `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pDescriptorCounts")
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
    /// The byte offset of `descriptorSetCount`.
    public static final long OFFSET_descriptorSetCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
    /// The memory layout of `descriptorSetCount`.
    public static final MemoryLayout LAYOUT_descriptorSetCount = LAYOUT.select(PathElement.groupElement("descriptorSetCount"));
    /// The [VarHandle] of `descriptorSetCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount"));
    /// The byte offset of `pDescriptorCounts`.
    public static final long OFFSET_pDescriptorCounts = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorCounts"));
    /// The memory layout of `pDescriptorCounts`.
    public static final MemoryLayout LAYOUT_pDescriptorCounts = LAYOUT.select(PathElement.groupElement("pDescriptorCounts"));
    /// The [VarHandle] of `pDescriptorCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDescriptorCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorCounts"));

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT alloc(SegmentAllocator allocator) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT copyFrom(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT reinterpret(long count) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetCount(MemorySegment segment, long index) { return (int) VH_descriptorSetCount.get(segment, 0L, index); }
    /// {@return `descriptorSetCount`}
    public int descriptorSetCount() { return descriptorSetCount(this.segment(), 0L); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetCount(MemorySegment segment, long index, int value) { VH_descriptorSetCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT descriptorSetCount(int value) { descriptorSetCount(this.segment(), 0L, value); return this; }

    /// {@return `pDescriptorCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDescriptorCounts(MemorySegment segment, long index) { return (MemorySegment) VH_pDescriptorCounts.get(segment, 0L, index); }
    /// {@return `pDescriptorCounts`}
    public MemorySegment pDescriptorCounts() { return pDescriptorCounts(this.segment(), 0L); }
    /// Sets `pDescriptorCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDescriptorCounts(MemorySegment segment, long index, MemorySegment value) { VH_pDescriptorCounts.set(segment, 0L, index, value); }
    /// Sets `pDescriptorCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCounts(MemorySegment value) { pDescriptorCounts(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT asSlice(long index) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT asSlice(long index, long count) { return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorSetVariableDescriptorCountAllocateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT at(long index, Consumer<VkDescriptorSetVariableDescriptorCountAllocateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetCountAt(long index) { return descriptorSetCount(this.segment(), index); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT descriptorSetCountAt(long index, int value) { descriptorSetCount(this.segment(), index, value); return this; }

    /// {@return `pDescriptorCounts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDescriptorCountsAt(long index) { return pDescriptorCounts(this.segment(), index); }
    /// Sets `pDescriptorCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCountsAt(long index, MemorySegment value) { pDescriptorCounts(this.segment(), index, value); return this; }

}
