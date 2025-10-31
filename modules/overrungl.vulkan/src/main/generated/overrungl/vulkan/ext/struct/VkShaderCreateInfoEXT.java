// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkShaderCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderCreateFlagsEXT flags;
///     (int) VkShaderStageFlagBits stage;
///     ((uint32_t) VkFlags) VkShaderStageFlags nextStage;
///     (int) VkShaderCodeTypeEXT codeType;
///     size_t codeSize;
///     const void* pCode;
///     const char* pName;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout* pSetLayouts;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange* pPushConstantRanges;
///     const VkSpecializationInfo* pSpecializationInfo;
/// };
/// ```
public final class VkShaderCreateInfoEXT extends GroupType {
    /// The struct layout of `VkShaderCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_INT.withName("nextStage"),
        ValueLayout.JAVA_INT.withName("codeType"),
        CanonicalTypes.SIZE_T.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `stage`.
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    /// The memory layout of `stage`.
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    /// The byte offset of `nextStage`.
    public static final long OFFSET_nextStage = LAYOUT.byteOffset(PathElement.groupElement("nextStage"));
    /// The memory layout of `nextStage`.
    public static final MemoryLayout LAYOUT_nextStage = LAYOUT.select(PathElement.groupElement("nextStage"));
    /// The [VarHandle] of `nextStage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nextStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nextStage"));
    /// The byte offset of `codeType`.
    public static final long OFFSET_codeType = LAYOUT.byteOffset(PathElement.groupElement("codeType"));
    /// The memory layout of `codeType`.
    public static final MemoryLayout LAYOUT_codeType = LAYOUT.select(PathElement.groupElement("codeType"));
    /// The [VarHandle] of `codeType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_codeType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeType"));
    /// The byte offset of `codeSize`.
    public static final long OFFSET_codeSize = LAYOUT.byteOffset(PathElement.groupElement("codeSize"));
    /// The memory layout of `codeSize`.
    public static final MemoryLayout LAYOUT_codeSize = LAYOUT.select(PathElement.groupElement("codeSize"));
    /// The [VarHandle] of `codeSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    /// The byte offset of `pCode`.
    public static final long OFFSET_pCode = LAYOUT.byteOffset(PathElement.groupElement("pCode"));
    /// The memory layout of `pCode`.
    public static final MemoryLayout LAYOUT_pCode = LAYOUT.select(PathElement.groupElement("pCode"));
    /// The [VarHandle] of `pCode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCode"));
    /// The byte offset of `pName`.
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    /// The memory layout of `pName`.
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    /// The byte offset of `setLayoutCount`.
    public static final long OFFSET_setLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
    /// The memory layout of `setLayoutCount`.
    public static final MemoryLayout LAYOUT_setLayoutCount = LAYOUT.select(PathElement.groupElement("setLayoutCount"));
    /// The [VarHandle] of `setLayoutCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    /// The byte offset of `pSetLayouts`.
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    /// The memory layout of `pSetLayouts`.
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    /// The [VarHandle] of `pSetLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));
    /// The byte offset of `pushConstantRangeCount`.
    public static final long OFFSET_pushConstantRangeCount = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
    /// The memory layout of `pushConstantRangeCount`.
    public static final MemoryLayout LAYOUT_pushConstantRangeCount = LAYOUT.select(PathElement.groupElement("pushConstantRangeCount"));
    /// The [VarHandle] of `pushConstantRangeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    /// The byte offset of `pPushConstantRanges`.
    public static final long OFFSET_pPushConstantRanges = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
    /// The memory layout of `pPushConstantRanges`.
    public static final MemoryLayout LAYOUT_pPushConstantRanges = LAYOUT.select(PathElement.groupElement("pPushConstantRanges"));
    /// The [VarHandle] of `pPushConstantRanges` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));
    /// The byte offset of `pSpecializationInfo`.
    public static final long OFFSET_pSpecializationInfo = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
    /// The memory layout of `pSpecializationInfo`.
    public static final MemoryLayout LAYOUT_pSpecializationInfo = LAYOUT.select(PathElement.groupElement("pSpecializationInfo"));
    /// The [VarHandle] of `pSpecializationInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkShaderCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkShaderCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShaderCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderCreateInfoEXT`
    public static VkShaderCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkShaderCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkShaderCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderCreateInfoEXT`
    public static VkShaderCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkShaderCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderCreateInfoEXT copyFrom(VkShaderCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkShaderCreateInfoEXT reinterpret(long count) { return new VkShaderCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkShaderCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkShaderCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stage(MemorySegment segment, long index) { return (int) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    public int stage() { return stage(this.segment(), 0L); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stage(MemorySegment segment, long index, int value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT stage(int value) { stage(this.segment(), 0L, value); return this; }

    /// {@return `nextStage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nextStage(MemorySegment segment, long index) { return (int) VH_nextStage.get(segment, 0L, index); }
    /// {@return `nextStage`}
    public int nextStage() { return nextStage(this.segment(), 0L); }
    /// Sets `nextStage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nextStage(MemorySegment segment, long index, int value) { VH_nextStage.set(segment, 0L, index, value); }
    /// Sets `nextStage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT nextStage(int value) { nextStage(this.segment(), 0L, value); return this; }

    /// {@return `codeType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int codeType(MemorySegment segment, long index) { return (int) VH_codeType.get(segment, 0L, index); }
    /// {@return `codeType`}
    public int codeType() { return codeType(this.segment(), 0L); }
    /// Sets `codeType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codeType(MemorySegment segment, long index, int value) { VH_codeType.set(segment, 0L, index, value); }
    /// Sets `codeType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT codeType(int value) { codeType(this.segment(), 0L, value); return this; }

    /// {@return `codeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long codeSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_codeSize.get(segment, 0L, index)); }
    /// {@return `codeSize`}
    public long codeSize() { return codeSize(this.segment(), 0L); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codeSize(MemorySegment segment, long index, long value) { VH_codeSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `codeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT codeSize(long value) { codeSize(this.segment(), 0L, value); return this; }

    /// {@return `pCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCode(MemorySegment segment, long index) { return (MemorySegment) VH_pCode.get(segment, 0L, index); }
    /// {@return `pCode`}
    public MemorySegment pCode() { return pCode(this.segment(), 0L); }
    /// Sets `pCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCode(MemorySegment segment, long index, MemorySegment value) { VH_pCode.set(segment, 0L, index, value); }
    /// Sets `pCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pCode(MemorySegment value) { pCode(this.segment(), 0L, value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pName(MemorySegment segment, long index) { return (MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    public MemorySegment pName() { return pName(this.segment(), 0L); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pName(MemorySegment segment, long index, MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pName(MemorySegment value) { pName(this.segment(), 0L, value); return this; }

    /// {@return `setLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int setLayoutCount(MemorySegment segment, long index) { return (int) VH_setLayoutCount.get(segment, 0L, index); }
    /// {@return `setLayoutCount`}
    public int setLayoutCount() { return setLayoutCount(this.segment(), 0L); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void setLayoutCount(MemorySegment segment, long index, int value) { VH_setLayoutCount.set(segment, 0L, index, value); }
    /// Sets `setLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT setLayoutCount(int value) { setLayoutCount(this.segment(), 0L, value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSetLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pSetLayouts.get(segment, 0L, index); }
    /// {@return `pSetLayouts`}
    public MemorySegment pSetLayouts() { return pSetLayouts(this.segment(), 0L); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSetLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pSetLayouts.set(segment, 0L, index, value); }
    /// Sets `pSetLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pSetLayouts(MemorySegment value) { pSetLayouts(this.segment(), 0L, value); return this; }

    /// {@return `pushConstantRangeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pushConstantRangeCount(MemorySegment segment, long index) { return (int) VH_pushConstantRangeCount.get(segment, 0L, index); }
    /// {@return `pushConstantRangeCount`}
    public int pushConstantRangeCount() { return pushConstantRangeCount(this.segment(), 0L); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushConstantRangeCount(MemorySegment segment, long index, int value) { VH_pushConstantRangeCount.set(segment, 0L, index, value); }
    /// Sets `pushConstantRangeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pushConstantRangeCount(int value) { pushConstantRangeCount(this.segment(), 0L, value); return this; }

    /// {@return `pPushConstantRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPushConstantRanges(MemorySegment segment, long index) { return (MemorySegment) VH_pPushConstantRanges.get(segment, 0L, index); }
    /// {@return `pPushConstantRanges`}
    public MemorySegment pPushConstantRanges() { return pPushConstantRanges(this.segment(), 0L); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPushConstantRanges(MemorySegment segment, long index, MemorySegment value) { VH_pPushConstantRanges.set(segment, 0L, index, value); }
    /// Sets `pPushConstantRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pPushConstantRanges(MemorySegment value) { pPushConstantRanges(this.segment(), 0L, value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSpecializationInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pSpecializationInfo.get(segment, 0L, index); }
    /// {@return `pSpecializationInfo`}
    public MemorySegment pSpecializationInfo() { return pSpecializationInfo(this.segment(), 0L); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSpecializationInfo(MemorySegment segment, long index, MemorySegment value) { VH_pSpecializationInfo.set(segment, 0L, index, value); }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pSpecializationInfo(MemorySegment value) { pSpecializationInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkShaderCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkShaderCreateInfoEXT`
    public VkShaderCreateInfoEXT asSlice(long index) { return new VkShaderCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkShaderCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkShaderCreateInfoEXT`
    public VkShaderCreateInfoEXT asSlice(long index, long count) { return new VkShaderCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkShaderCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkShaderCreateInfoEXT at(long index, Consumer<VkShaderCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `stage` at the given index}
    /// @param index the index of the struct buffer
    public int stageAt(long index) { return stage(this.segment(), index); }
    /// Sets `stage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT stageAt(long index, int value) { stage(this.segment(), index, value); return this; }

    /// {@return `nextStage` at the given index}
    /// @param index the index of the struct buffer
    public int nextStageAt(long index) { return nextStage(this.segment(), index); }
    /// Sets `nextStage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT nextStageAt(long index, int value) { nextStage(this.segment(), index, value); return this; }

    /// {@return `codeType` at the given index}
    /// @param index the index of the struct buffer
    public int codeTypeAt(long index) { return codeType(this.segment(), index); }
    /// Sets `codeType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT codeTypeAt(long index, int value) { codeType(this.segment(), index, value); return this; }

    /// {@return `codeSize` at the given index}
    /// @param index the index of the struct buffer
    public long codeSizeAt(long index) { return codeSize(this.segment(), index); }
    /// Sets `codeSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT codeSizeAt(long index, long value) { codeSize(this.segment(), index, value); return this; }

    /// {@return `pCode` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCodeAt(long index) { return pCode(this.segment(), index); }
    /// Sets `pCode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pCodeAt(long index, MemorySegment value) { pCode(this.segment(), index, value); return this; }

    /// {@return `pName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNameAt(long index) { return pName(this.segment(), index); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pNameAt(long index, MemorySegment value) { pName(this.segment(), index, value); return this; }

    /// {@return `setLayoutCount` at the given index}
    /// @param index the index of the struct buffer
    public int setLayoutCountAt(long index) { return setLayoutCount(this.segment(), index); }
    /// Sets `setLayoutCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT setLayoutCountAt(long index, int value) { setLayoutCount(this.segment(), index, value); return this; }

    /// {@return `pSetLayouts` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSetLayoutsAt(long index) { return pSetLayouts(this.segment(), index); }
    /// Sets `pSetLayouts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pSetLayoutsAt(long index, MemorySegment value) { pSetLayouts(this.segment(), index, value); return this; }

    /// {@return `pushConstantRangeCount` at the given index}
    /// @param index the index of the struct buffer
    public int pushConstantRangeCountAt(long index) { return pushConstantRangeCount(this.segment(), index); }
    /// Sets `pushConstantRangeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pushConstantRangeCountAt(long index, int value) { pushConstantRangeCount(this.segment(), index, value); return this; }

    /// {@return `pPushConstantRanges` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPushConstantRangesAt(long index) { return pPushConstantRanges(this.segment(), index); }
    /// Sets `pPushConstantRanges` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pPushConstantRangesAt(long index, MemorySegment value) { pPushConstantRanges(this.segment(), index, value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSpecializationInfoAt(long index) { return pSpecializationInfo(this.segment(), index); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderCreateInfoEXT pSpecializationInfoAt(long index, MemorySegment value) { pSpecializationInfo(this.segment(), index, value); return this; }

}
