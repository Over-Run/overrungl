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

/// Represents `VkSamplerReductionModeCreateInfo`.
/// ## Layout
/// ```
/// struct VkSamplerReductionModeCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSamplerReductionMode reductionMode;
/// };
/// ```
public final class VkSamplerReductionModeCreateInfo extends GroupType {
    /// The struct layout of `VkSamplerReductionModeCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("reductionMode")
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
    /// The byte offset of `reductionMode`.
    public static final long OFFSET_reductionMode = LAYOUT.byteOffset(PathElement.groupElement("reductionMode"));
    /// The memory layout of `reductionMode`.
    public static final MemoryLayout LAYOUT_reductionMode = LAYOUT.select(PathElement.groupElement("reductionMode"));
    /// The [VarHandle] of `reductionMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_reductionMode = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("reductionMode")));

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerReductionModeCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerReductionModeCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerReductionModeCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerReductionModeCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerReductionModeCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerReductionModeCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerReductionModeCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerReductionModeCreateInfo`
    public static VkSamplerReductionModeCreateInfo alloc(SegmentAllocator allocator) { return new VkSamplerReductionModeCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerReductionModeCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerReductionModeCreateInfo`
    public static VkSamplerReductionModeCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkSamplerReductionModeCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerReductionModeCreateInfo copyFrom(VkSamplerReductionModeCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerReductionModeCreateInfo reinterpret(long count) { return new VkSamplerReductionModeCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerReductionModeCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerReductionModeCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `reductionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int reductionMode(MemorySegment segment, long index) { return (int) VH_reductionMode.get().get(segment, 0L, index); }
    /// {@return `reductionMode`}
    public int reductionMode() { return reductionMode(this.segment(), 0L); }
    /// Sets `reductionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void reductionMode(MemorySegment segment, long index, int value) { VH_reductionMode.get().set(segment, 0L, index, value); }
    /// Sets `reductionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo reductionMode(int value) { reductionMode(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerReductionModeCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerReductionModeCreateInfo`
    public VkSamplerReductionModeCreateInfo asSlice(long index) { return new VkSamplerReductionModeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerReductionModeCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerReductionModeCreateInfo`
    public VkSamplerReductionModeCreateInfo asSlice(long index, long count) { return new VkSamplerReductionModeCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerReductionModeCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerReductionModeCreateInfo at(long index, Consumer<VkSamplerReductionModeCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `reductionMode` at the given index}
    /// @param index the index of the struct buffer
    public int reductionModeAt(long index) { return reductionMode(this.segment(), index); }
    /// Sets `reductionMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerReductionModeCreateInfo reductionModeAt(long index, int value) { reductionMode(this.segment(), index, value); return this; }

}
