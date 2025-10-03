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

/// Represents `VkSetDescriptorBufferOffsetsInfoEXT`.
/// ## Layout
/// ```
/// struct VkSetDescriptorBufferOffsetsInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t firstSet;
///     uint32_t setCount;
///     const uint32_t* pBufferIndices;
///     const VkDeviceSize* pOffsets;
/// };
/// ```
public final class VkSetDescriptorBufferOffsetsInfoEXT extends GroupType {
    /// The struct layout of `VkSetDescriptorBufferOffsetsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withName("pBufferIndices"),
        ValueLayout.ADDRESS.withName("pOffsets")
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
    /// The byte offset of `setCount`.
    public static final long OFFSET_setCount = LAYOUT.byteOffset(PathElement.groupElement("setCount"));
    /// The memory layout of `setCount`.
    public static final MemoryLayout LAYOUT_setCount = LAYOUT.select(PathElement.groupElement("setCount"));
    /// The [VarHandle] of `setCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_setCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("setCount")));
    /// The byte offset of `pBufferIndices`.
    public static final long OFFSET_pBufferIndices = LAYOUT.byteOffset(PathElement.groupElement("pBufferIndices"));
    /// The memory layout of `pBufferIndices`.
    public static final MemoryLayout LAYOUT_pBufferIndices = LAYOUT.select(PathElement.groupElement("pBufferIndices"));
    /// The [VarHandle] of `pBufferIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pBufferIndices = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBufferIndices")));
    /// The byte offset of `pOffsets`.
    public static final long OFFSET_pOffsets = LAYOUT.byteOffset(PathElement.groupElement("pOffsets"));
    /// The memory layout of `pOffsets`.
    public static final MemoryLayout LAYOUT_pOffsets = LAYOUT.select(PathElement.groupElement("pOffsets"));
    /// The [VarHandle] of `pOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pOffsets = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pOffsets")));

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetDescriptorBufferOffsetsInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSetDescriptorBufferOffsetsInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetDescriptorBufferOffsetsInfoEXT`
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSetDescriptorBufferOffsetsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetDescriptorBufferOffsetsInfoEXT`
    public static VkSetDescriptorBufferOffsetsInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT copyFrom(VkSetDescriptorBufferOffsetsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSetDescriptorBufferOffsetsInfoEXT reinterpret(long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSetDescriptorBufferOffsetsInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSetDescriptorBufferOffsetsInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

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
    public VkSetDescriptorBufferOffsetsInfoEXT layout(long value) { layout(this.segment(), 0L, value); return this; }

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
    public VkSetDescriptorBufferOffsetsInfoEXT firstSet(int value) { firstSet(this.segment(), 0L, value); return this; }

    /// {@return `setCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int setCount(MemorySegment segment, long index) { return (int) VH_setCount.get().get(segment, 0L, index); }
    /// {@return `setCount`}
    public int setCount() { return setCount(this.segment(), 0L); }
    /// Sets `setCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void setCount(MemorySegment segment, long index, int value) { VH_setCount.get().set(segment, 0L, index, value); }
    /// Sets `setCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT setCount(int value) { setCount(this.segment(), 0L, value); return this; }

    /// {@return `pBufferIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBufferIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pBufferIndices.get().get(segment, 0L, index); }
    /// {@return `pBufferIndices`}
    public MemorySegment pBufferIndices() { return pBufferIndices(this.segment(), 0L); }
    /// Sets `pBufferIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBufferIndices(MemorySegment segment, long index, MemorySegment value) { VH_pBufferIndices.get().set(segment, 0L, index, value); }
    /// Sets `pBufferIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndices(MemorySegment value) { pBufferIndices(this.segment(), 0L, value); return this; }

    /// {@return `pOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pOffsets.get().get(segment, 0L, index); }
    /// {@return `pOffsets`}
    public MemorySegment pOffsets() { return pOffsets(this.segment(), 0L); }
    /// Sets `pOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pOffsets.get().set(segment, 0L, index, value); }
    /// Sets `pOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsets(MemorySegment value) { pOffsets(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSetDescriptorBufferOffsetsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSetDescriptorBufferOffsetsInfoEXT`
    public VkSetDescriptorBufferOffsetsInfoEXT asSlice(long index) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSetDescriptorBufferOffsetsInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSetDescriptorBufferOffsetsInfoEXT`
    public VkSetDescriptorBufferOffsetsInfoEXT asSlice(long index, long count) { return new VkSetDescriptorBufferOffsetsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSetDescriptorBufferOffsetsInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT at(long index, Consumer<VkSetDescriptorBufferOffsetsInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `firstSet` at the given index}
    /// @param index the index of the struct buffer
    public int firstSetAt(long index) { return firstSet(this.segment(), index); }
    /// Sets `firstSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT firstSetAt(long index, int value) { firstSet(this.segment(), index, value); return this; }

    /// {@return `setCount` at the given index}
    /// @param index the index of the struct buffer
    public int setCountAt(long index) { return setCount(this.segment(), index); }
    /// Sets `setCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT setCountAt(long index, int value) { setCount(this.segment(), index, value); return this; }

    /// {@return `pBufferIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pBufferIndicesAt(long index) { return pBufferIndices(this.segment(), index); }
    /// Sets `pBufferIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pBufferIndicesAt(long index, MemorySegment value) { pBufferIndices(this.segment(), index, value); return this; }

    /// {@return `pOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pOffsetsAt(long index) { return pOffsets(this.segment(), index); }
    /// Sets `pOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSetDescriptorBufferOffsetsInfoEXT pOffsetsAt(long index, MemorySegment value) { pOffsets(this.segment(), index, value); return this; }

}
