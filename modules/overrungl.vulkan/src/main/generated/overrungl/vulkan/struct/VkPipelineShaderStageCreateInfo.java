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

/// Represents `VkPipelineShaderStageCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineShaderStageCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineShaderStageCreateFlags flags;
///     (int) VkShaderStageFlagBits stage;
///     (uint64_t) VkShaderModule module;
///     const char* pName;
///     const VkSpecializationInfo* pSpecializationInfo;
/// };
/// ```
public final class VkPipelineShaderStageCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineShaderStageCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("module"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo")
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
    /// The byte offset of `stage`.
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    /// The memory layout of `stage`.
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage")));
    /// The byte offset of `module`.
    public static final long OFFSET_module = LAYOUT.byteOffset(PathElement.groupElement("module"));
    /// The memory layout of `module`.
    public static final MemoryLayout LAYOUT_module = LAYOUT.select(PathElement.groupElement("module"));
    /// The [VarHandle] of `module` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_module = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("module")));
    /// The byte offset of `pName`.
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    /// The memory layout of `pName`.
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pName = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName")));
    /// The byte offset of `pSpecializationInfo`.
    public static final long OFFSET_pSpecializationInfo = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
    /// The memory layout of `pSpecializationInfo`.
    public static final MemoryLayout LAYOUT_pSpecializationInfo = LAYOUT.select(PathElement.groupElement("pSpecializationInfo"));
    /// The [VarHandle] of `pSpecializationInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pSpecializationInfo = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo")));

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineShaderStageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineShaderStageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineShaderStageCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageCreateInfo`
    public static VkPipelineShaderStageCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineShaderStageCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineShaderStageCreateInfo`
    public static VkPipelineShaderStageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineShaderStageCreateInfo copyFrom(VkPipelineShaderStageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineShaderStageCreateInfo reinterpret(long count) { return new VkPipelineShaderStageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineShaderStageCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineShaderStageCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPipelineShaderStageCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stage(MemorySegment segment, long index) { return (int) VH_stage.get().get(segment, 0L, index); }
    /// {@return `stage`}
    public int stage() { return stage(this.segment(), 0L); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stage(MemorySegment segment, long index, int value) { VH_stage.get().set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo stage(int value) { stage(this.segment(), 0L, value); return this; }

    /// {@return `module` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long module(MemorySegment segment, long index) { return (long) VH_module.get().get(segment, 0L, index); }
    /// {@return `module`}
    public long module() { return module(this.segment(), 0L); }
    /// Sets `module` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void module(MemorySegment segment, long index, long value) { VH_module.get().set(segment, 0L, index, value); }
    /// Sets `module` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo module(long value) { module(this.segment(), 0L, value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pName(MemorySegment segment, long index) { return (MemorySegment) VH_pName.get().get(segment, 0L, index); }
    /// {@return `pName`}
    public MemorySegment pName() { return pName(this.segment(), 0L); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pName(MemorySegment segment, long index, MemorySegment value) { VH_pName.get().set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pName(MemorySegment value) { pName(this.segment(), 0L, value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSpecializationInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pSpecializationInfo.get().get(segment, 0L, index); }
    /// {@return `pSpecializationInfo`}
    public MemorySegment pSpecializationInfo() { return pSpecializationInfo(this.segment(), 0L); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSpecializationInfo(MemorySegment segment, long index, MemorySegment value) { VH_pSpecializationInfo.get().set(segment, 0L, index, value); }
    /// Sets `pSpecializationInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pSpecializationInfo(MemorySegment value) { pSpecializationInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineShaderStageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineShaderStageCreateInfo`
    public VkPipelineShaderStageCreateInfo asSlice(long index) { return new VkPipelineShaderStageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineShaderStageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineShaderStageCreateInfo`
    public VkPipelineShaderStageCreateInfo asSlice(long index, long count) { return new VkPipelineShaderStageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineShaderStageCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineShaderStageCreateInfo at(long index, Consumer<VkPipelineShaderStageCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `stage` at the given index}
    /// @param index the index of the struct buffer
    public int stageAt(long index) { return stage(this.segment(), index); }
    /// Sets `stage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo stageAt(long index, int value) { stage(this.segment(), index, value); return this; }

    /// {@return `module` at the given index}
    /// @param index the index of the struct buffer
    public long moduleAt(long index) { return module(this.segment(), index); }
    /// Sets `module` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo moduleAt(long index, long value) { module(this.segment(), index, value); return this; }

    /// {@return `pName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNameAt(long index) { return pName(this.segment(), index); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pNameAt(long index, MemorySegment value) { pName(this.segment(), index, value); return this; }

    /// {@return `pSpecializationInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSpecializationInfoAt(long index) { return pSpecializationInfo(this.segment(), index); }
    /// Sets `pSpecializationInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageCreateInfo pSpecializationInfoAt(long index, MemorySegment value) { pSpecializationInfo(this.segment(), index, value); return this; }

}
