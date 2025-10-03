// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkWriteDescriptorSet`.
/// ## Layout
/// ```
/// struct VkWriteDescriptorSet {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDescriptorSet dstSet;
///     uint32_t dstBinding;
///     uint32_t dstArrayElement;
///     uint32_t descriptorCount;
///     (int) VkDescriptorType descriptorType;
///     const VkDescriptorImageInfo* pImageInfo;
///     const VkDescriptorBufferInfo* pBufferInfo;
///     const VkBufferView* pTexelBufferView;
/// };
/// ```
public final class VkWriteDescriptorSet extends GroupType {
    /// The struct layout of `VkWriteDescriptorSet`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withName("pImageInfo"),
        ValueLayout.ADDRESS.withName("pBufferInfo"),
        ValueLayout.ADDRESS.withName("pTexelBufferView")
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
    /// The byte offset of `descriptorType`.
    public static final long OFFSET_descriptorType = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
    /// The memory layout of `descriptorType`.
    public static final MemoryLayout LAYOUT_descriptorType = LAYOUT.select(PathElement.groupElement("descriptorType"));
    /// The [VarHandle] of `descriptorType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorType"));
    /// The byte offset of `pImageInfo`.
    public static final long OFFSET_pImageInfo = LAYOUT.byteOffset(PathElement.groupElement("pImageInfo"));
    /// The memory layout of `pImageInfo`.
    public static final MemoryLayout LAYOUT_pImageInfo = LAYOUT.select(PathElement.groupElement("pImageInfo"));
    /// The [VarHandle] of `pImageInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImageInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImageInfo"));
    /// The byte offset of `pBufferInfo`.
    public static final long OFFSET_pBufferInfo = LAYOUT.byteOffset(PathElement.groupElement("pBufferInfo"));
    /// The memory layout of `pBufferInfo`.
    public static final MemoryLayout LAYOUT_pBufferInfo = LAYOUT.select(PathElement.groupElement("pBufferInfo"));
    /// The [VarHandle] of `pBufferInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBufferInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferInfo"));
    /// The byte offset of `pTexelBufferView`.
    public static final long OFFSET_pTexelBufferView = LAYOUT.byteOffset(PathElement.groupElement("pTexelBufferView"));
    /// The memory layout of `pTexelBufferView`.
    public static final MemoryLayout LAYOUT_pTexelBufferView = LAYOUT.select(PathElement.groupElement("pTexelBufferView"));
    /// The [VarHandle] of `pTexelBufferView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTexelBufferView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTexelBufferView"));

    /// Creates `VkWriteDescriptorSet` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkWriteDescriptorSet(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSet of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSet ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkWriteDescriptorSet` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkWriteDescriptorSet ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkWriteDescriptorSet(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkWriteDescriptorSet` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkWriteDescriptorSet`
    public static VkWriteDescriptorSet alloc(SegmentAllocator allocator) { return new VkWriteDescriptorSet(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkWriteDescriptorSet` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkWriteDescriptorSet`
    public static VkWriteDescriptorSet alloc(SegmentAllocator allocator, long count) { return new VkWriteDescriptorSet(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkWriteDescriptorSet copyFrom(VkWriteDescriptorSet src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkWriteDescriptorSet reinterpret(long count) { return new VkWriteDescriptorSet(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkWriteDescriptorSet sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSet pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSet dstSet(long value) { dstSet(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSet dstBinding(int value) { dstBinding(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSet dstArrayElement(int value) { dstArrayElement(this.segment(), 0L, value); return this; }

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
    public VkWriteDescriptorSet descriptorCount(int value) { descriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorType(MemorySegment segment, long index) { return (int) VH_descriptorType.get(segment, 0L, index); }
    /// {@return `descriptorType`}
    public int descriptorType() { return descriptorType(this.segment(), 0L); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorType(MemorySegment segment, long index, int value) { VH_descriptorType.set(segment, 0L, index, value); }
    /// Sets `descriptorType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet descriptorType(int value) { descriptorType(this.segment(), 0L, value); return this; }

    /// {@return `pImageInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImageInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pImageInfo.get(segment, 0L, index); }
    /// {@return `pImageInfo`}
    public MemorySegment pImageInfo() { return pImageInfo(this.segment(), 0L); }
    /// Sets `pImageInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImageInfo(MemorySegment segment, long index, MemorySegment value) { VH_pImageInfo.set(segment, 0L, index, value); }
    /// Sets `pImageInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pImageInfo(MemorySegment value) { pImageInfo(this.segment(), 0L, value); return this; }

    /// {@return `pBufferInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBufferInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferInfo.get(segment, 0L, index); }
    /// {@return `pBufferInfo`}
    public MemorySegment pBufferInfo() { return pBufferInfo(this.segment(), 0L); }
    /// Sets `pBufferInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBufferInfo(MemorySegment segment, long index, MemorySegment value) { VH_pBufferInfo.set(segment, 0L, index, value); }
    /// Sets `pBufferInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pBufferInfo(MemorySegment value) { pBufferInfo(this.segment(), 0L, value); return this; }

    /// {@return `pTexelBufferView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTexelBufferView(MemorySegment segment, long index) { return (MemorySegment) VH_pTexelBufferView.get(segment, 0L, index); }
    /// {@return `pTexelBufferView`}
    public MemorySegment pTexelBufferView() { return pTexelBufferView(this.segment(), 0L); }
    /// Sets `pTexelBufferView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTexelBufferView(MemorySegment segment, long index, MemorySegment value) { VH_pTexelBufferView.set(segment, 0L, index, value); }
    /// Sets `pTexelBufferView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pTexelBufferView(MemorySegment value) { pTexelBufferView(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkWriteDescriptorSet`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkWriteDescriptorSet`
    public VkWriteDescriptorSet asSlice(long index) { return new VkWriteDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkWriteDescriptorSet`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkWriteDescriptorSet`
    public VkWriteDescriptorSet asSlice(long index, long count) { return new VkWriteDescriptorSet(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkWriteDescriptorSet` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkWriteDescriptorSet at(long index, Consumer<VkWriteDescriptorSet> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dstSet` at the given index}
    /// @param index the index of the struct buffer
    public long dstSetAt(long index) { return dstSet(this.segment(), index); }
    /// Sets `dstSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet dstSetAt(long index, long value) { dstSet(this.segment(), index, value); return this; }

    /// {@return `dstBinding` at the given index}
    /// @param index the index of the struct buffer
    public int dstBindingAt(long index) { return dstBinding(this.segment(), index); }
    /// Sets `dstBinding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet dstBindingAt(long index, int value) { dstBinding(this.segment(), index, value); return this; }

    /// {@return `dstArrayElement` at the given index}
    /// @param index the index of the struct buffer
    public int dstArrayElementAt(long index) { return dstArrayElement(this.segment(), index); }
    /// Sets `dstArrayElement` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet dstArrayElementAt(long index, int value) { dstArrayElement(this.segment(), index, value); return this; }

    /// {@return `descriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorCountAt(long index) { return descriptorCount(this.segment(), index); }
    /// Sets `descriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet descriptorCountAt(long index, int value) { descriptorCount(this.segment(), index, value); return this; }

    /// {@return `descriptorType` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorTypeAt(long index) { return descriptorType(this.segment(), index); }
    /// Sets `descriptorType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet descriptorTypeAt(long index, int value) { descriptorType(this.segment(), index, value); return this; }

    /// {@return `pImageInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pImageInfoAt(long index) { return pImageInfo(this.segment(), index); }
    /// Sets `pImageInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pImageInfoAt(long index, MemorySegment value) { pImageInfo(this.segment(), index, value); return this; }

    /// {@return `pBufferInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pBufferInfoAt(long index) { return pBufferInfo(this.segment(), index); }
    /// Sets `pBufferInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pBufferInfoAt(long index, MemorySegment value) { pBufferInfo(this.segment(), index, value); return this; }

    /// {@return `pTexelBufferView` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTexelBufferViewAt(long index) { return pTexelBufferView(this.segment(), index); }
    /// Sets `pTexelBufferView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkWriteDescriptorSet pTexelBufferViewAt(long index, MemorySegment value) { pTexelBufferView(this.segment(), index, value); return this; }

}
