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

/// Represents `VkBindDescriptorSetsInfo`.
/// ## Layout
/// ```
/// struct VkBindDescriptorSetsInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t descriptorSetCount;
///     const VkDescriptorSet* pDescriptorSets;
///     uint32_t dynamicOffsetCount;
///     const uint32_t* pDynamicOffsets;
/// };
/// ```
public final class VkBindDescriptorSetsInfo extends GroupType {
    /// The struct layout of `VkBindDescriptorSetsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withName("pDescriptorSets"),
        ValueLayout.JAVA_INT.withName("dynamicOffsetCount"),
        ValueLayout.ADDRESS.withName("pDynamicOffsets")
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
    /// The byte offset of `stageFlags`.
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    /// The memory layout of `stageFlags`.
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stageFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags")));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout")));
    /// The byte offset of `firstSet`.
    public static final long OFFSET_firstSet = LAYOUT.byteOffset(PathElement.groupElement("firstSet"));
    /// The memory layout of `firstSet`.
    public static final MemoryLayout LAYOUT_firstSet = LAYOUT.select(PathElement.groupElement("firstSet"));
    /// The [VarHandle] of `firstSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_firstSet = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstSet")));
    /// The byte offset of `descriptorSetCount`.
    public static final long OFFSET_descriptorSetCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetCount"));
    /// The memory layout of `descriptorSetCount`.
    public static final MemoryLayout LAYOUT_descriptorSetCount = LAYOUT.select(PathElement.groupElement("descriptorSetCount"));
    /// The [VarHandle] of `descriptorSetCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_descriptorSetCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetCount")));
    /// The byte offset of `pDescriptorSets`.
    public static final long OFFSET_pDescriptorSets = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorSets"));
    /// The memory layout of `pDescriptorSets`.
    public static final MemoryLayout LAYOUT_pDescriptorSets = LAYOUT.select(PathElement.groupElement("pDescriptorSets"));
    /// The [VarHandle] of `pDescriptorSets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDescriptorSets = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorSets")));
    /// The byte offset of `dynamicOffsetCount`.
    public static final long OFFSET_dynamicOffsetCount = LAYOUT.byteOffset(PathElement.groupElement("dynamicOffsetCount"));
    /// The memory layout of `dynamicOffsetCount`.
    public static final MemoryLayout LAYOUT_dynamicOffsetCount = LAYOUT.select(PathElement.groupElement("dynamicOffsetCount"));
    /// The [VarHandle] of `dynamicOffsetCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dynamicOffsetCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicOffsetCount")));
    /// The byte offset of `pDynamicOffsets`.
    public static final long OFFSET_pDynamicOffsets = LAYOUT.byteOffset(PathElement.groupElement("pDynamicOffsets"));
    /// The memory layout of `pDynamicOffsets`.
    public static final MemoryLayout LAYOUT_pDynamicOffsets = LAYOUT.select(PathElement.groupElement("pDynamicOffsets"));
    /// The [VarHandle] of `pDynamicOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDynamicOffsets = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicOffsets")));

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindDescriptorSetsInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorSetsInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorSetsInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindDescriptorSetsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorSetsInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorSetsInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindDescriptorSetsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDescriptorSetsInfo`
    public static VkBindDescriptorSetsInfo alloc(SegmentAllocator allocator) { return new VkBindDescriptorSetsInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindDescriptorSetsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindDescriptorSetsInfo`
    public static VkBindDescriptorSetsInfo alloc(SegmentAllocator allocator, long count) { return new VkBindDescriptorSetsInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindDescriptorSetsInfo copyFrom(VkBindDescriptorSetsInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindDescriptorSetsInfo reinterpret(long count) { return new VkBindDescriptorSetsInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindDescriptorSetsInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindDescriptorSetsInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get().get(segment, 0L, index); }
    /// {@return `stageFlags`}
    public int stageFlags() { return stageFlags(this.segment(), 0L); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageFlags(MemorySegment segment, long index, int value) { VH_stageFlags.get().set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get().get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.get().set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `firstSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int firstSet(MemorySegment segment, long index) { return (int) VH_firstSet.get().get(segment, 0L, index); }
    /// {@return `firstSet`}
    public int firstSet() { return firstSet(this.segment(), 0L); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstSet(MemorySegment segment, long index, int value) { VH_firstSet.get().set(segment, 0L, index, value); }
    /// Sets `firstSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo firstSet(int value) { firstSet(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetCount(MemorySegment segment, long index) { return (int) VH_descriptorSetCount.get().get(segment, 0L, index); }
    /// {@return `descriptorSetCount`}
    public int descriptorSetCount() { return descriptorSetCount(this.segment(), 0L); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetCount(MemorySegment segment, long index, int value) { VH_descriptorSetCount.get().set(segment, 0L, index, value); }
    /// Sets `descriptorSetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo descriptorSetCount(int value) { descriptorSetCount(this.segment(), 0L, value); return this; }

    /// {@return `pDescriptorSets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDescriptorSets(MemorySegment segment, long index) { return (MemorySegment) VH_pDescriptorSets.get().get(segment, 0L, index); }
    /// {@return `pDescriptorSets`}
    public MemorySegment pDescriptorSets() { return pDescriptorSets(this.segment(), 0L); }
    /// Sets `pDescriptorSets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDescriptorSets(MemorySegment segment, long index, MemorySegment value) { VH_pDescriptorSets.get().set(segment, 0L, index, value); }
    /// Sets `pDescriptorSets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pDescriptorSets(MemorySegment value) { pDescriptorSets(this.segment(), 0L, value); return this; }

    /// {@return `dynamicOffsetCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicOffsetCount(MemorySegment segment, long index) { return (int) VH_dynamicOffsetCount.get().get(segment, 0L, index); }
    /// {@return `dynamicOffsetCount`}
    public int dynamicOffsetCount() { return dynamicOffsetCount(this.segment(), 0L); }
    /// Sets `dynamicOffsetCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicOffsetCount(MemorySegment segment, long index, int value) { VH_dynamicOffsetCount.get().set(segment, 0L, index, value); }
    /// Sets `dynamicOffsetCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo dynamicOffsetCount(int value) { dynamicOffsetCount(this.segment(), 0L, value); return this; }

    /// {@return `pDynamicOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDynamicOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pDynamicOffsets.get().get(segment, 0L, index); }
    /// {@return `pDynamicOffsets`}
    public MemorySegment pDynamicOffsets() { return pDynamicOffsets(this.segment(), 0L); }
    /// Sets `pDynamicOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDynamicOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pDynamicOffsets.get().set(segment, 0L, index, value); }
    /// Sets `pDynamicOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pDynamicOffsets(MemorySegment value) { pDynamicOffsets(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindDescriptorSetsInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindDescriptorSetsInfo`
    public VkBindDescriptorSetsInfo asSlice(long index) { return new VkBindDescriptorSetsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindDescriptorSetsInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindDescriptorSetsInfo`
    public VkBindDescriptorSetsInfo asSlice(long index, long count) { return new VkBindDescriptorSetsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindDescriptorSetsInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindDescriptorSetsInfo at(long index, Consumer<VkBindDescriptorSetsInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `firstSet` at the given index}
    /// @param index the index of the struct buffer
    public int firstSetAt(long index) { return firstSet(this.segment(), index); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo firstSetAt(long index, int value) { firstSet(this.segment(), index, value); return this; }

    /// {@return `descriptorSetCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetCountAt(long index) { return descriptorSetCount(this.segment(), index); }
    /// Sets `descriptorSetCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo descriptorSetCountAt(long index, int value) { descriptorSetCount(this.segment(), index, value); return this; }

    /// {@return `pDescriptorSets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDescriptorSetsAt(long index) { return pDescriptorSets(this.segment(), index); }
    /// Sets `pDescriptorSets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pDescriptorSetsAt(long index, MemorySegment value) { pDescriptorSets(this.segment(), index, value); return this; }

    /// {@return `dynamicOffsetCount` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicOffsetCountAt(long index) { return dynamicOffsetCount(this.segment(), index); }
    /// Sets `dynamicOffsetCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo dynamicOffsetCountAt(long index, int value) { dynamicOffsetCount(this.segment(), index, value); return this; }

    /// {@return `pDynamicOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDynamicOffsetsAt(long index) { return pDynamicOffsets(this.segment(), index); }
    /// Sets `pDynamicOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorSetsInfo pDynamicOffsetsAt(long index, MemorySegment value) { pDynamicOffsets(this.segment(), index, value); return this; }

}
