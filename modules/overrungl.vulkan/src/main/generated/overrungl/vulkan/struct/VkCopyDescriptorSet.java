// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyDescriptorSet`.
/// ## Layout
/// ```
/// struct VkCopyDescriptorSet {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDescriptorSet srcSet;
///     uint32_t srcBinding;
///     uint32_t srcArrayElement;
///     (uint64_t) VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
/// };
/// ```
public final class VkCopyDescriptorSet extends GroupType {
    /// The struct layout of `VkCopyDescriptorSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcSet"),
        ValueLayout.JAVA_INT.withName("srcBinding"),
        ValueLayout.JAVA_INT.withName("srcArrayElement"),
        ValueLayout.JAVA_LONG.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
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
    /// The byte offset of `srcSet`.
    public static final long OFFSET_srcSet = LAYOUT.byteOffset(PathElement.groupElement("srcSet"));
    /// The memory layout of `srcSet`.
    public static final MemoryLayout LAYOUT_srcSet = LAYOUT.select(PathElement.groupElement("srcSet"));
    /// The [VarHandle] of `srcSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcSet"));
    /// The byte offset of `srcBinding`.
    public static final long OFFSET_srcBinding = LAYOUT.byteOffset(PathElement.groupElement("srcBinding"));
    /// The memory layout of `srcBinding`.
    public static final MemoryLayout LAYOUT_srcBinding = LAYOUT.select(PathElement.groupElement("srcBinding"));
    /// The [VarHandle] of `srcBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcBinding"));
    /// The byte offset of `srcArrayElement`.
    public static final long OFFSET_srcArrayElement = LAYOUT.byteOffset(PathElement.groupElement("srcArrayElement"));
    /// The memory layout of `srcArrayElement`.
    public static final MemoryLayout LAYOUT_srcArrayElement = LAYOUT.select(PathElement.groupElement("srcArrayElement"));
    /// The [VarHandle] of `srcArrayElement` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcArrayElement"));
    /// The byte offset of `dstSet`.
    public static final long OFFSET_dstSet = LAYOUT.byteOffset(PathElement.groupElement("dstSet"));
    /// The memory layout of `dstSet`.
    public static final MemoryLayout LAYOUT_dstSet = LAYOUT.select(PathElement.groupElement("dstSet"));
    /// The [VarHandle] of `dstSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstSet"));
    /// The byte offset of `dstBinding`.
    public static final long OFFSET_dstBinding = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
    /// The memory layout of `dstBinding`.
    public static final MemoryLayout LAYOUT_dstBinding = LAYOUT.select(PathElement.groupElement("dstBinding"));
    /// The [VarHandle] of `dstBinding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstBinding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstBinding"));
    /// The byte offset of `dstArrayElement`.
    public static final long OFFSET_dstArrayElement = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
    /// The memory layout of `dstArrayElement`.
    public static final MemoryLayout LAYOUT_dstArrayElement = LAYOUT.select(PathElement.groupElement("dstArrayElement"));
    /// The [VarHandle] of `dstArrayElement` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstArrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstArrayElement"));
    /// The byte offset of `descriptorCount`.
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    /// The memory layout of `descriptorCount`.
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    /// The [VarHandle] of `descriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));

    /// Creates `VkCopyDescriptorSet` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyDescriptorSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyDescriptorSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyDescriptorSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyDescriptorSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyDescriptorSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyDescriptorSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyDescriptorSet`
    public static VkCopyDescriptorSet alloc(SegmentAllocator allocator) { return new VkCopyDescriptorSet(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyDescriptorSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyDescriptorSet`
    public static VkCopyDescriptorSet alloc(SegmentAllocator allocator, long count) { return new VkCopyDescriptorSet(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyDescriptorSet copyFrom(VkCopyDescriptorSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyDescriptorSet reinterpret(long count) { return new VkCopyDescriptorSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCopyDescriptorSet sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCopyDescriptorSet pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcSet(MemorySegment segment, long index) { return (long) VH_srcSet.get(segment, 0L, index); }
    /// {@return `srcSet`}
    public long srcSet() { return srcSet(this.segment(), 0L); }
    /// Sets `srcSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcSet(MemorySegment segment, long index, long value) { VH_srcSet.set(segment, 0L, index, value); }
    /// Sets `srcSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcSet(long value) { srcSet(this.segment(), 0L, value); return this; }

    /// {@return `srcBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcBinding(MemorySegment segment, long index) { return (int) VH_srcBinding.get(segment, 0L, index); }
    /// {@return `srcBinding`}
    public int srcBinding() { return srcBinding(this.segment(), 0L); }
    /// Sets `srcBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcBinding(MemorySegment segment, long index, int value) { VH_srcBinding.set(segment, 0L, index, value); }
    /// Sets `srcBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcBinding(int value) { srcBinding(this.segment(), 0L, value); return this; }

    /// {@return `srcArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcArrayElement(MemorySegment segment, long index) { return (int) VH_srcArrayElement.get(segment, 0L, index); }
    /// {@return `srcArrayElement`}
    public int srcArrayElement() { return srcArrayElement(this.segment(), 0L); }
    /// Sets `srcArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcArrayElement(MemorySegment segment, long index, int value) { VH_srcArrayElement.set(segment, 0L, index, value); }
    /// Sets `srcArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcArrayElement(int value) { srcArrayElement(this.segment(), 0L, value); return this; }

    /// {@return `dstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstSet(MemorySegment segment, long index) { return (long) VH_dstSet.get(segment, 0L, index); }
    /// {@return `dstSet`}
    public long dstSet() { return dstSet(this.segment(), 0L); }
    /// Sets `dstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstSet(MemorySegment segment, long index, long value) { VH_dstSet.set(segment, 0L, index, value); }
    /// Sets `dstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstSet(long value) { dstSet(this.segment(), 0L, value); return this; }

    /// {@return `dstBinding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstBinding(MemorySegment segment, long index) { return (int) VH_dstBinding.get(segment, 0L, index); }
    /// {@return `dstBinding`}
    public int dstBinding() { return dstBinding(this.segment(), 0L); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstBinding(MemorySegment segment, long index, int value) { VH_dstBinding.set(segment, 0L, index, value); }
    /// Sets `dstBinding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstBinding(int value) { dstBinding(this.segment(), 0L, value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstArrayElement(MemorySegment segment, long index) { return (int) VH_dstArrayElement.get(segment, 0L, index); }
    /// {@return `dstArrayElement`}
    public int dstArrayElement() { return dstArrayElement(this.segment(), 0L); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstArrayElement(MemorySegment segment, long index, int value) { VH_dstArrayElement.set(segment, 0L, index, value); }
    /// Sets `dstArrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstArrayElement(int value) { dstArrayElement(this.segment(), 0L, value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorCount(MemorySegment segment, long index) { return (int) VH_descriptorCount.get(segment, 0L, index); }
    /// {@return `descriptorCount`}
    public int descriptorCount() { return descriptorCount(this.segment(), 0L); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorCount(MemorySegment segment, long index, int value) { VH_descriptorCount.set(segment, 0L, index, value); }
    /// Sets `descriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet descriptorCount(int value) { descriptorCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCopyDescriptorSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyDescriptorSet`
    public VkCopyDescriptorSet asSlice(long index) { return new VkCopyDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyDescriptorSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyDescriptorSet`
    public VkCopyDescriptorSet asSlice(long index, long count) { return new VkCopyDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyDescriptorSet` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyDescriptorSet at(long index, Consumer<VkCopyDescriptorSet> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcSet` at the given index}
    /// @param index the index of the struct buffer
    public long srcSetAt(long index) { return srcSet(this.segment(), index); }
    /// Sets `srcSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcSetAt(long index, long value) { srcSet(this.segment(), index, value); return this; }

    /// {@return `srcBinding` at the given index}
    /// @param index the index of the struct buffer
    public int srcBindingAt(long index) { return srcBinding(this.segment(), index); }
    /// Sets `srcBinding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcBindingAt(long index, int value) { srcBinding(this.segment(), index, value); return this; }

    /// {@return `srcArrayElement` at the given index}
    /// @param index the index of the struct buffer
    public int srcArrayElementAt(long index) { return srcArrayElement(this.segment(), index); }
    /// Sets `srcArrayElement` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet srcArrayElementAt(long index, int value) { srcArrayElement(this.segment(), index, value); return this; }

    /// {@return `dstSet` at the given index}
    /// @param index the index of the struct buffer
    public long dstSetAt(long index) { return dstSet(this.segment(), index); }
    /// Sets `dstSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstSetAt(long index, long value) { dstSet(this.segment(), index, value); return this; }

    /// {@return `dstBinding` at the given index}
    /// @param index the index of the struct buffer
    public int dstBindingAt(long index) { return dstBinding(this.segment(), index); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstBindingAt(long index, int value) { dstBinding(this.segment(), index, value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param index the index of the struct buffer
    public int dstArrayElementAt(long index) { return dstArrayElement(this.segment(), index); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet dstArrayElementAt(long index, int value) { dstArrayElement(this.segment(), index, value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorCountAt(long index) { return descriptorCount(this.segment(), index); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyDescriptorSet descriptorCountAt(long index, int value) { descriptorCount(this.segment(), index, value); return this; }

}
