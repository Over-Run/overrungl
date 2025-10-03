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

/// Represents `VkPushConstantsInfo`.
/// ## Layout
/// ```
/// struct VkPushConstantsInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkPipelineLayout layout;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     uint32_t offset;
///     uint32_t size;
///     const void* pValues;
/// };
/// ```
public final class VkPushConstantsInfo extends GroupType {
    /// The struct layout of `VkPushConstantsInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pValues")
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
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layout = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout")));
    /// The byte offset of `stageFlags`.
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    /// The memory layout of `stageFlags`.
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stageFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags")));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_offset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset")));
    /// The byte offset of `size`.
    public static final long OFFSET_size = LAYOUT.byteOffset(PathElement.groupElement("size"));
    /// The memory layout of `size`.
    public static final MemoryLayout LAYOUT_size = LAYOUT.select(PathElement.groupElement("size"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_size = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("size")));
    /// The byte offset of `pValues`.
    public static final long OFFSET_pValues = LAYOUT.byteOffset(PathElement.groupElement("pValues"));
    /// The memory layout of `pValues`.
    public static final MemoryLayout LAYOUT_pValues = LAYOUT.select(PathElement.groupElement("pValues"));
    /// The [VarHandle] of `pValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pValues = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues")));

    /// Creates `VkPushConstantsInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPushConstantsInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantsInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantsInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantsInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantsInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPushConstantsInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantsInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPushConstantsInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPushConstantsInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushConstantsInfo`
    public static VkPushConstantsInfo alloc(SegmentAllocator allocator) { return new VkPushConstantsInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPushConstantsInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushConstantsInfo`
    public static VkPushConstantsInfo alloc(SegmentAllocator allocator, long count) { return new VkPushConstantsInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPushConstantsInfo copyFrom(VkPushConstantsInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPushConstantsInfo reinterpret(long count) { return new VkPushConstantsInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPushConstantsInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPushConstantsInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPushConstantsInfo layout(long value) { layout(this.segment(), 0L, value); return this; }

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
    public VkPushConstantsInfo stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

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
    public VkPushConstantsInfo offset(int value) { offset(this.segment(), 0L, value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int size(MemorySegment segment, long index) { return (int) VH_size.get().get(segment, 0L, index); }
    /// {@return `size`}
    public int size() { return size(this.segment(), 0L); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void size(MemorySegment segment, long index, int value) { VH_size.get().set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo size(int value) { size(this.segment(), 0L, value); return this; }

    /// {@return `pValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pValues(MemorySegment segment, long index) { return (MemorySegment) VH_pValues.get().get(segment, 0L, index); }
    /// {@return `pValues`}
    public MemorySegment pValues() { return pValues(this.segment(), 0L); }
    /// Sets `pValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pValues(MemorySegment segment, long index, MemorySegment value) { VH_pValues.get().set(segment, 0L, index, value); }
    /// Sets `pValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo pValues(MemorySegment value) { pValues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPushConstantsInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPushConstantsInfo`
    public VkPushConstantsInfo asSlice(long index) { return new VkPushConstantsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPushConstantsInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPushConstantsInfo`
    public VkPushConstantsInfo asSlice(long index, long count) { return new VkPushConstantsInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPushConstantsInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPushConstantsInfo at(long index, Consumer<VkPushConstantsInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public int offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo offsetAt(long index, int value) { offset(this.segment(), index, value); return this; }

    /// {@return `size` at the given index}
    /// @param index the index of the struct buffer
    public int sizeAt(long index) { return size(this.segment(), index); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo sizeAt(long index, int value) { size(this.segment(), index, value); return this; }

    /// {@return `pValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pValuesAt(long index) { return pValues(this.segment(), index); }
    /// Sets `pValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPushConstantsInfo pValuesAt(long index, MemorySegment value) { pValues(this.segment(), index, value); return this; }

}
