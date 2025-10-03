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

/// Represents `VkIndirectCommandsLayoutTokenNV`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutTokenNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkIndirectCommandsTokenTypeNV tokenType;
///     uint32_t stream;
///     uint32_t offset;
///     uint32_t vertexBindingUnit;
///     (uint32_t) VkBool32 vertexDynamicStride;
///     (uint64_t) VkPipelineLayout pushconstantPipelineLayout;
///     ((uint32_t) VkFlags) VkShaderStageFlags pushconstantShaderStageFlags;
///     uint32_t pushconstantOffset;
///     uint32_t pushconstantSize;
///     ((uint32_t) VkFlags) VkIndirectStateFlagsNV indirectStateFlags;
///     uint32_t indexTypeCount;
///     const VkIndexType* pIndexTypes;
///     const uint32_t* pIndexTypeValues;
/// };
/// ```
public final class VkIndirectCommandsLayoutTokenNV extends GroupType {
    /// The struct layout of `VkIndirectCommandsLayoutTokenNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tokenType"),
        ValueLayout.JAVA_INT.withName("stream"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("vertexBindingUnit"),
        ValueLayout.JAVA_INT.withName("vertexDynamicStride"),
        ValueLayout.JAVA_LONG.withName("pushconstantPipelineLayout"),
        ValueLayout.JAVA_INT.withName("pushconstantShaderStageFlags"),
        ValueLayout.JAVA_INT.withName("pushconstantOffset"),
        ValueLayout.JAVA_INT.withName("pushconstantSize"),
        ValueLayout.JAVA_INT.withName("indirectStateFlags"),
        ValueLayout.JAVA_INT.withName("indexTypeCount"),
        ValueLayout.ADDRESS.withName("pIndexTypes"),
        ValueLayout.ADDRESS.withName("pIndexTypeValues")
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
    /// The byte offset of `tokenType`.
    public static final long OFFSET_tokenType = LAYOUT.byteOffset(PathElement.groupElement("tokenType"));
    /// The memory layout of `tokenType`.
    public static final MemoryLayout LAYOUT_tokenType = LAYOUT.select(PathElement.groupElement("tokenType"));
    /// The [VarHandle] of `tokenType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tokenType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenType")));
    /// The byte offset of `stream`.
    public static final long OFFSET_stream = LAYOUT.byteOffset(PathElement.groupElement("stream"));
    /// The memory layout of `stream`.
    public static final MemoryLayout LAYOUT_stream = LAYOUT.select(PathElement.groupElement("stream"));
    /// The [VarHandle] of `stream` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stream = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stream")));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_offset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset")));
    /// The byte offset of `vertexBindingUnit`.
    public static final long OFFSET_vertexBindingUnit = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingUnit"));
    /// The memory layout of `vertexBindingUnit`.
    public static final MemoryLayout LAYOUT_vertexBindingUnit = LAYOUT.select(PathElement.groupElement("vertexBindingUnit"));
    /// The [VarHandle] of `vertexBindingUnit` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_vertexBindingUnit = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexBindingUnit")));
    /// The byte offset of `vertexDynamicStride`.
    public static final long OFFSET_vertexDynamicStride = LAYOUT.byteOffset(PathElement.groupElement("vertexDynamicStride"));
    /// The memory layout of `vertexDynamicStride`.
    public static final MemoryLayout LAYOUT_vertexDynamicStride = LAYOUT.select(PathElement.groupElement("vertexDynamicStride"));
    /// The [VarHandle] of `vertexDynamicStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_vertexDynamicStride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexDynamicStride")));
    /// The byte offset of `pushconstantPipelineLayout`.
    public static final long OFFSET_pushconstantPipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("pushconstantPipelineLayout"));
    /// The memory layout of `pushconstantPipelineLayout`.
    public static final MemoryLayout LAYOUT_pushconstantPipelineLayout = LAYOUT.select(PathElement.groupElement("pushconstantPipelineLayout"));
    /// The [VarHandle] of `pushconstantPipelineLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pushconstantPipelineLayout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantPipelineLayout")));
    /// The byte offset of `pushconstantShaderStageFlags`.
    public static final long OFFSET_pushconstantShaderStageFlags = LAYOUT.byteOffset(PathElement.groupElement("pushconstantShaderStageFlags"));
    /// The memory layout of `pushconstantShaderStageFlags`.
    public static final MemoryLayout LAYOUT_pushconstantShaderStageFlags = LAYOUT.select(PathElement.groupElement("pushconstantShaderStageFlags"));
    /// The [VarHandle] of `pushconstantShaderStageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pushconstantShaderStageFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantShaderStageFlags")));
    /// The byte offset of `pushconstantOffset`.
    public static final long OFFSET_pushconstantOffset = LAYOUT.byteOffset(PathElement.groupElement("pushconstantOffset"));
    /// The memory layout of `pushconstantOffset`.
    public static final MemoryLayout LAYOUT_pushconstantOffset = LAYOUT.select(PathElement.groupElement("pushconstantOffset"));
    /// The [VarHandle] of `pushconstantOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pushconstantOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantOffset")));
    /// The byte offset of `pushconstantSize`.
    public static final long OFFSET_pushconstantSize = LAYOUT.byteOffset(PathElement.groupElement("pushconstantSize"));
    /// The memory layout of `pushconstantSize`.
    public static final MemoryLayout LAYOUT_pushconstantSize = LAYOUT.select(PathElement.groupElement("pushconstantSize"));
    /// The [VarHandle] of `pushconstantSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pushconstantSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushconstantSize")));
    /// The byte offset of `indirectStateFlags`.
    public static final long OFFSET_indirectStateFlags = LAYOUT.byteOffset(PathElement.groupElement("indirectStateFlags"));
    /// The memory layout of `indirectStateFlags`.
    public static final MemoryLayout LAYOUT_indirectStateFlags = LAYOUT.select(PathElement.groupElement("indirectStateFlags"));
    /// The [VarHandle] of `indirectStateFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_indirectStateFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectStateFlags")));
    /// The byte offset of `indexTypeCount`.
    public static final long OFFSET_indexTypeCount = LAYOUT.byteOffset(PathElement.groupElement("indexTypeCount"));
    /// The memory layout of `indexTypeCount`.
    public static final MemoryLayout LAYOUT_indexTypeCount = LAYOUT.select(PathElement.groupElement("indexTypeCount"));
    /// The [VarHandle] of `indexTypeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_indexTypeCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeCount")));
    /// The byte offset of `pIndexTypes`.
    public static final long OFFSET_pIndexTypes = LAYOUT.byteOffset(PathElement.groupElement("pIndexTypes"));
    /// The memory layout of `pIndexTypes`.
    public static final MemoryLayout LAYOUT_pIndexTypes = LAYOUT.select(PathElement.groupElement("pIndexTypes"));
    /// The [VarHandle] of `pIndexTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pIndexTypes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexTypes")));
    /// The byte offset of `pIndexTypeValues`.
    public static final long OFFSET_pIndexTypeValues = LAYOUT.byteOffset(PathElement.groupElement("pIndexTypeValues"));
    /// The memory layout of `pIndexTypeValues`.
    public static final MemoryLayout LAYOUT_pIndexTypeValues = LAYOUT.select(PathElement.groupElement("pIndexTypeValues"));
    /// The [VarHandle] of `pIndexTypeValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pIndexTypeValues = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIndexTypeValues")));

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsLayoutTokenNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsLayoutTokenNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsLayoutTokenNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutTokenNV`
    public static VkIndirectCommandsLayoutTokenNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutTokenNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsLayoutTokenNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutTokenNV`
    public static VkIndirectCommandsLayoutTokenNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutTokenNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV copyFrom(VkIndirectCommandsLayoutTokenNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsLayoutTokenNV reinterpret(long count) { return new VkIndirectCommandsLayoutTokenNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkIndirectCommandsLayoutTokenNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIndirectCommandsLayoutTokenNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tokenType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tokenType(MemorySegment segment, long index) { return (int) VH_tokenType.get().get(segment, 0L, index); }
    /// {@return `tokenType`}
    public int tokenType() { return tokenType(this.segment(), 0L); }
    /// Sets `tokenType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tokenType(MemorySegment segment, long index, int value) { VH_tokenType.get().set(segment, 0L, index, value); }
    /// Sets `tokenType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV tokenType(int value) { tokenType(this.segment(), 0L, value); return this; }

    /// {@return `stream` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stream(MemorySegment segment, long index) { return (int) VH_stream.get().get(segment, 0L, index); }
    /// {@return `stream`}
    public int stream() { return stream(this.segment(), 0L); }
    /// Sets `stream` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stream(MemorySegment segment, long index, int value) { VH_stream.get().set(segment, 0L, index, value); }
    /// Sets `stream` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV stream(int value) { stream(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int offset(MemorySegment segment, long index) { return (int) VH_offset.get().get(segment, 0L, index); }
    /// {@return `offset`}
    public int offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, int value) { VH_offset.get().set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV offset(int value) { offset(this.segment(), 0L, value); return this; }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexBindingUnit(MemorySegment segment, long index) { return (int) VH_vertexBindingUnit.get().get(segment, 0L, index); }
    /// {@return `vertexBindingUnit`}
    public int vertexBindingUnit() { return vertexBindingUnit(this.segment(), 0L); }
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexBindingUnit(MemorySegment segment, long index, int value) { VH_vertexBindingUnit.get().set(segment, 0L, index, value); }
    /// Sets `vertexBindingUnit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(int value) { vertexBindingUnit(this.segment(), 0L, value); return this; }

    /// {@return `vertexDynamicStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexDynamicStride(MemorySegment segment, long index) { return (int) VH_vertexDynamicStride.get().get(segment, 0L, index); }
    /// {@return `vertexDynamicStride`}
    public int vertexDynamicStride() { return vertexDynamicStride(this.segment(), 0L); }
    /// Sets `vertexDynamicStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexDynamicStride(MemorySegment segment, long index, int value) { VH_vertexDynamicStride.get().set(segment, 0L, index, value); }
    /// Sets `vertexDynamicStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(int value) { vertexDynamicStride(this.segment(), 0L, value); return this; }

    /// {@return `pushconstantPipelineLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pushconstantPipelineLayout(MemorySegment segment, long index) { return (long) VH_pushconstantPipelineLayout.get().get(segment, 0L, index); }
    /// {@return `pushconstantPipelineLayout`}
    public long pushconstantPipelineLayout() { return pushconstantPipelineLayout(this.segment(), 0L); }
    /// Sets `pushconstantPipelineLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushconstantPipelineLayout(MemorySegment segment, long index, long value) { VH_pushconstantPipelineLayout.get().set(segment, 0L, index, value); }
    /// Sets `pushconstantPipelineLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(long value) { pushconstantPipelineLayout(this.segment(), 0L, value); return this; }

    /// {@return `pushconstantShaderStageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pushconstantShaderStageFlags(MemorySegment segment, long index) { return (int) VH_pushconstantShaderStageFlags.get().get(segment, 0L, index); }
    /// {@return `pushconstantShaderStageFlags`}
    public int pushconstantShaderStageFlags() { return pushconstantShaderStageFlags(this.segment(), 0L); }
    /// Sets `pushconstantShaderStageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushconstantShaderStageFlags(MemorySegment segment, long index, int value) { VH_pushconstantShaderStageFlags.get().set(segment, 0L, index, value); }
    /// Sets `pushconstantShaderStageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(int value) { pushconstantShaderStageFlags(this.segment(), 0L, value); return this; }

    /// {@return `pushconstantOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pushconstantOffset(MemorySegment segment, long index) { return (int) VH_pushconstantOffset.get().get(segment, 0L, index); }
    /// {@return `pushconstantOffset`}
    public int pushconstantOffset() { return pushconstantOffset(this.segment(), 0L); }
    /// Sets `pushconstantOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushconstantOffset(MemorySegment segment, long index, int value) { VH_pushconstantOffset.get().set(segment, 0L, index, value); }
    /// Sets `pushconstantOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(int value) { pushconstantOffset(this.segment(), 0L, value); return this; }

    /// {@return `pushconstantSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pushconstantSize(MemorySegment segment, long index) { return (int) VH_pushconstantSize.get().get(segment, 0L, index); }
    /// {@return `pushconstantSize`}
    public int pushconstantSize() { return pushconstantSize(this.segment(), 0L); }
    /// Sets `pushconstantSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushconstantSize(MemorySegment segment, long index, int value) { VH_pushconstantSize.get().set(segment, 0L, index, value); }
    /// Sets `pushconstantSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantSize(int value) { pushconstantSize(this.segment(), 0L, value); return this; }

    /// {@return `indirectStateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indirectStateFlags(MemorySegment segment, long index) { return (int) VH_indirectStateFlags.get().get(segment, 0L, index); }
    /// {@return `indirectStateFlags`}
    public int indirectStateFlags() { return indirectStateFlags(this.segment(), 0L); }
    /// Sets `indirectStateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectStateFlags(MemorySegment segment, long index, int value) { VH_indirectStateFlags.get().set(segment, 0L, index, value); }
    /// Sets `indirectStateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(int value) { indirectStateFlags(this.segment(), 0L, value); return this; }

    /// {@return `indexTypeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexTypeCount(MemorySegment segment, long index) { return (int) VH_indexTypeCount.get().get(segment, 0L, index); }
    /// {@return `indexTypeCount`}
    public int indexTypeCount() { return indexTypeCount(this.segment(), 0L); }
    /// Sets `indexTypeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexTypeCount(MemorySegment segment, long index, int value) { VH_indexTypeCount.get().set(segment, 0L, index, value); }
    /// Sets `indexTypeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV indexTypeCount(int value) { indexTypeCount(this.segment(), 0L, value); return this; }

    /// {@return `pIndexTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pIndexTypes(MemorySegment segment, long index) { return (MemorySegment) VH_pIndexTypes.get().get(segment, 0L, index); }
    /// {@return `pIndexTypes`}
    public MemorySegment pIndexTypes() { return pIndexTypes(this.segment(), 0L); }
    /// Sets `pIndexTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pIndexTypes(MemorySegment segment, long index, MemorySegment value) { VH_pIndexTypes.get().set(segment, 0L, index, value); }
    /// Sets `pIndexTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pIndexTypes(MemorySegment value) { pIndexTypes(this.segment(), 0L, value); return this; }

    /// {@return `pIndexTypeValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pIndexTypeValues(MemorySegment segment, long index) { return (MemorySegment) VH_pIndexTypeValues.get().get(segment, 0L, index); }
    /// {@return `pIndexTypeValues`}
    public MemorySegment pIndexTypeValues() { return pIndexTypeValues(this.segment(), 0L); }
    /// Sets `pIndexTypeValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pIndexTypeValues(MemorySegment segment, long index, MemorySegment value) { VH_pIndexTypeValues.get().set(segment, 0L, index, value); }
    /// Sets `pIndexTypeValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(MemorySegment value) { pIndexTypeValues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsLayoutTokenNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsLayoutTokenNV`
    public VkIndirectCommandsLayoutTokenNV asSlice(long index) { return new VkIndirectCommandsLayoutTokenNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsLayoutTokenNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsLayoutTokenNV`
    public VkIndirectCommandsLayoutTokenNV asSlice(long index, long count) { return new VkIndirectCommandsLayoutTokenNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsLayoutTokenNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV at(long index, Consumer<VkIndirectCommandsLayoutTokenNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tokenType` at the given index}
    /// @param index the index of the struct buffer
    public int tokenTypeAt(long index) { return tokenType(this.segment(), index); }
    /// Sets `tokenType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV tokenTypeAt(long index, int value) { tokenType(this.segment(), index, value); return this; }

    /// {@return `stream` at the given index}
    /// @param index the index of the struct buffer
    public int streamAt(long index) { return stream(this.segment(), index); }
    /// Sets `stream` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV streamAt(long index, int value) { stream(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public int offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV offsetAt(long index, int value) { offset(this.segment(), index, value); return this; }

    /// {@return `vertexBindingUnit` at the given index}
    /// @param index the index of the struct buffer
    public int vertexBindingUnitAt(long index) { return vertexBindingUnit(this.segment(), index); }
    /// Sets `vertexBindingUnit` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV vertexBindingUnitAt(long index, int value) { vertexBindingUnit(this.segment(), index, value); return this; }

    /// {@return `vertexDynamicStride` at the given index}
    /// @param index the index of the struct buffer
    public int vertexDynamicStrideAt(long index) { return vertexDynamicStride(this.segment(), index); }
    /// Sets `vertexDynamicStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV vertexDynamicStrideAt(long index, int value) { vertexDynamicStride(this.segment(), index, value); return this; }

    /// {@return `pushconstantPipelineLayout` at the given index}
    /// @param index the index of the struct buffer
    public long pushconstantPipelineLayoutAt(long index) { return pushconstantPipelineLayout(this.segment(), index); }
    /// Sets `pushconstantPipelineLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayoutAt(long index, long value) { pushconstantPipelineLayout(this.segment(), index, value); return this; }

    /// {@return `pushconstantShaderStageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int pushconstantShaderStageFlagsAt(long index) { return pushconstantShaderStageFlags(this.segment(), index); }
    /// Sets `pushconstantShaderStageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlagsAt(long index, int value) { pushconstantShaderStageFlags(this.segment(), index, value); return this; }

    /// {@return `pushconstantOffset` at the given index}
    /// @param index the index of the struct buffer
    public int pushconstantOffsetAt(long index) { return pushconstantOffset(this.segment(), index); }
    /// Sets `pushconstantOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantOffsetAt(long index, int value) { pushconstantOffset(this.segment(), index, value); return this; }

    /// {@return `pushconstantSize` at the given index}
    /// @param index the index of the struct buffer
    public int pushconstantSizeAt(long index) { return pushconstantSize(this.segment(), index); }
    /// Sets `pushconstantSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pushconstantSizeAt(long index, int value) { pushconstantSize(this.segment(), index, value); return this; }

    /// {@return `indirectStateFlags` at the given index}
    /// @param index the index of the struct buffer
    public int indirectStateFlagsAt(long index) { return indirectStateFlags(this.segment(), index); }
    /// Sets `indirectStateFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV indirectStateFlagsAt(long index, int value) { indirectStateFlags(this.segment(), index, value); return this; }

    /// {@return `indexTypeCount` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeCountAt(long index) { return indexTypeCount(this.segment(), index); }
    /// Sets `indexTypeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV indexTypeCountAt(long index, int value) { indexTypeCount(this.segment(), index, value); return this; }

    /// {@return `pIndexTypes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pIndexTypesAt(long index) { return pIndexTypes(this.segment(), index); }
    /// Sets `pIndexTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pIndexTypesAt(long index, MemorySegment value) { pIndexTypes(this.segment(), index, value); return this; }

    /// {@return `pIndexTypeValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pIndexTypeValuesAt(long index) { return pIndexTypeValues(this.segment(), index); }
    /// Sets `pIndexTypeValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenNV pIndexTypeValuesAt(long index, MemorySegment value) { pIndexTypeValues(this.segment(), index, value); return this; }

}
