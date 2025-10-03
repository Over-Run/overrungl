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

/// Represents `VkRayTracingPipelineCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkRayTracingPipelineCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCreateFlags flags;
///     uint32_t stageCount;
///     const VkPipelineShaderStageCreateInfo* pStages;
///     uint32_t groupCount;
///     const VkRayTracingShaderGroupCreateInfoNV* pGroups;
///     uint32_t maxRecursionDepth;
///     (uint64_t) VkPipelineLayout layout;
///     (uint64_t) VkPipeline basePipelineHandle;
///     int32_t basePipelineIndex;
/// };
/// ```
public final class VkRayTracingPipelineCreateInfoNV extends GroupType {
    /// The struct layout of `VkRayTracingPipelineCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stageCount"),
        ValueLayout.ADDRESS.withName("pStages"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withName("pGroups"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_LONG.withName("basePipelineHandle"),
        ValueLayout.JAVA_INT.withName("basePipelineIndex")
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
    /// The byte offset of `stageCount`.
    public static final long OFFSET_stageCount = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
    /// The memory layout of `stageCount`.
    public static final MemoryLayout LAYOUT_stageCount = LAYOUT.select(PathElement.groupElement("stageCount"));
    /// The [VarHandle] of `stageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stageCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageCount")));
    /// The byte offset of `pStages`.
    public static final long OFFSET_pStages = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
    /// The memory layout of `pStages`.
    public static final MemoryLayout LAYOUT_pStages = LAYOUT.select(PathElement.groupElement("pStages"));
    /// The [VarHandle] of `pStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStages")));
    /// The byte offset of `groupCount`.
    public static final long OFFSET_groupCount = LAYOUT.byteOffset(PathElement.groupElement("groupCount"));
    /// The memory layout of `groupCount`.
    public static final MemoryLayout LAYOUT_groupCount = LAYOUT.select(PathElement.groupElement("groupCount"));
    /// The [VarHandle] of `groupCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_groupCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("groupCount")));
    /// The byte offset of `pGroups`.
    public static final long OFFSET_pGroups = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
    /// The memory layout of `pGroups`.
    public static final MemoryLayout LAYOUT_pGroups = LAYOUT.select(PathElement.groupElement("pGroups"));
    /// The [VarHandle] of `pGroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pGroups = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGroups")));
    /// The byte offset of `maxRecursionDepth`.
    public static final long OFFSET_maxRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxRecursionDepth"));
    /// The memory layout of `maxRecursionDepth`.
    public static final MemoryLayout LAYOUT_maxRecursionDepth = LAYOUT.select(PathElement.groupElement("maxRecursionDepth"));
    /// The [VarHandle] of `maxRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxRecursionDepth = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRecursionDepth")));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout")));
    /// The byte offset of `basePipelineHandle`.
    public static final long OFFSET_basePipelineHandle = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
    /// The memory layout of `basePipelineHandle`.
    public static final MemoryLayout LAYOUT_basePipelineHandle = LAYOUT.select(PathElement.groupElement("basePipelineHandle"));
    /// The [VarHandle] of `basePipelineHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_basePipelineHandle = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineHandle")));
    /// The byte offset of `basePipelineIndex`.
    public static final long OFFSET_basePipelineIndex = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
    /// The memory layout of `basePipelineIndex`.
    public static final MemoryLayout LAYOUT_basePipelineIndex = LAYOUT.select(PathElement.groupElement("basePipelineIndex"));
    /// The [VarHandle] of `basePipelineIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_basePipelineIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("basePipelineIndex")));

    /// Creates `VkRayTracingPipelineCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRayTracingPipelineCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRayTracingPipelineCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRayTracingPipelineCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRayTracingPipelineCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRayTracingPipelineCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingPipelineCreateInfoNV`
    public static VkRayTracingPipelineCreateInfoNV alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRayTracingPipelineCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingPipelineCreateInfoNV`
    public static VkRayTracingPipelineCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV copyFrom(VkRayTracingPipelineCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRayTracingPipelineCreateInfoNV reinterpret(long count) { return new VkRayTracingPipelineCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRayTracingPipelineCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageCount(MemorySegment segment, long index) { return (int) VH_stageCount.get().get(segment, 0L, index); }
    /// {@return `stageCount`}
    public int stageCount() { return stageCount(this.segment(), 0L); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageCount(MemorySegment segment, long index, int value) { VH_stageCount.get().set(segment, 0L, index, value); }
    /// Sets `stageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV stageCount(int value) { stageCount(this.segment(), 0L, value); return this; }

    /// {@return `pStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStages(MemorySegment segment, long index) { return (MemorySegment) VH_pStages.get().get(segment, 0L, index); }
    /// {@return `pStages`}
    public MemorySegment pStages() { return pStages(this.segment(), 0L); }
    /// Sets `pStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStages(MemorySegment segment, long index, MemorySegment value) { VH_pStages.get().set(segment, 0L, index, value); }
    /// Sets `pStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV pStages(MemorySegment value) { pStages(this.segment(), 0L, value); return this; }

    /// {@return `groupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int groupCount(MemorySegment segment, long index) { return (int) VH_groupCount.get().get(segment, 0L, index); }
    /// {@return `groupCount`}
    public int groupCount() { return groupCount(this.segment(), 0L); }
    /// Sets `groupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void groupCount(MemorySegment segment, long index, int value) { VH_groupCount.get().set(segment, 0L, index, value); }
    /// Sets `groupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV groupCount(int value) { groupCount(this.segment(), 0L, value); return this; }

    /// {@return `pGroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pGroups(MemorySegment segment, long index) { return (MemorySegment) VH_pGroups.get().get(segment, 0L, index); }
    /// {@return `pGroups`}
    public MemorySegment pGroups() { return pGroups(this.segment(), 0L); }
    /// Sets `pGroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pGroups(MemorySegment segment, long index, MemorySegment value) { VH_pGroups.get().set(segment, 0L, index, value); }
    /// Sets `pGroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV pGroups(MemorySegment value) { pGroups(this.segment(), 0L, value); return this; }

    /// {@return `maxRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxRecursionDepth.get().get(segment, 0L, index); }
    /// {@return `maxRecursionDepth`}
    public int maxRecursionDepth() { return maxRecursionDepth(this.segment(), 0L); }
    /// Sets `maxRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRecursionDepth(MemorySegment segment, long index, int value) { VH_maxRecursionDepth.get().set(segment, 0L, index, value); }
    /// Sets `maxRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV maxRecursionDepth(int value) { maxRecursionDepth(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineCreateInfoNV layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long basePipelineHandle(MemorySegment segment, long index) { return (long) VH_basePipelineHandle.get().get(segment, 0L, index); }
    /// {@return `basePipelineHandle`}
    public long basePipelineHandle() { return basePipelineHandle(this.segment(), 0L); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineHandle(MemorySegment segment, long index, long value) { VH_basePipelineHandle.get().set(segment, 0L, index, value); }
    /// Sets `basePipelineHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV basePipelineHandle(long value) { basePipelineHandle(this.segment(), 0L, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int basePipelineIndex(MemorySegment segment, long index) { return (int) VH_basePipelineIndex.get().get(segment, 0L, index); }
    /// {@return `basePipelineIndex`}
    public int basePipelineIndex() { return basePipelineIndex(this.segment(), 0L); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void basePipelineIndex(MemorySegment segment, long index, int value) { VH_basePipelineIndex.get().set(segment, 0L, index, value); }
    /// Sets `basePipelineIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV basePipelineIndex(int value) { basePipelineIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRayTracingPipelineCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRayTracingPipelineCreateInfoNV`
    public VkRayTracingPipelineCreateInfoNV asSlice(long index) { return new VkRayTracingPipelineCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRayTracingPipelineCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRayTracingPipelineCreateInfoNV`
    public VkRayTracingPipelineCreateInfoNV asSlice(long index, long count) { return new VkRayTracingPipelineCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRayTracingPipelineCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV at(long index, Consumer<VkRayTracingPipelineCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `stageCount` at the given index}
    /// @param index the index of the struct buffer
    public int stageCountAt(long index) { return stageCount(this.segment(), index); }
    /// Sets `stageCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV stageCountAt(long index, int value) { stageCount(this.segment(), index, value); return this; }

    /// {@return `pStages` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStagesAt(long index) { return pStages(this.segment(), index); }
    /// Sets `pStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV pStagesAt(long index, MemorySegment value) { pStages(this.segment(), index, value); return this; }

    /// {@return `groupCount` at the given index}
    /// @param index the index of the struct buffer
    public int groupCountAt(long index) { return groupCount(this.segment(), index); }
    /// Sets `groupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV groupCountAt(long index, int value) { groupCount(this.segment(), index, value); return this; }

    /// {@return `pGroups` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pGroupsAt(long index) { return pGroups(this.segment(), index); }
    /// Sets `pGroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV pGroupsAt(long index, MemorySegment value) { pGroups(this.segment(), index, value); return this; }

    /// {@return `maxRecursionDepth` at the given index}
    /// @param index the index of the struct buffer
    public int maxRecursionDepthAt(long index) { return maxRecursionDepth(this.segment(), index); }
    /// Sets `maxRecursionDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV maxRecursionDepthAt(long index, int value) { maxRecursionDepth(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `basePipelineHandle` at the given index}
    /// @param index the index of the struct buffer
    public long basePipelineHandleAt(long index) { return basePipelineHandle(this.segment(), index); }
    /// Sets `basePipelineHandle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV basePipelineHandleAt(long index, long value) { basePipelineHandle(this.segment(), index, value); return this; }

    /// {@return `basePipelineIndex` at the given index}
    /// @param index the index of the struct buffer
    public int basePipelineIndexAt(long index) { return basePipelineIndex(this.segment(), index); }
    /// Sets `basePipelineIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineCreateInfoNV basePipelineIndexAt(long index, int value) { basePipelineIndex(this.segment(), index, value); return this; }

}
