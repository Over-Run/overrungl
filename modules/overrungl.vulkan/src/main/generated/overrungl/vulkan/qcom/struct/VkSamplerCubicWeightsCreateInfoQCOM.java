// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerCubicWeightsCreateInfoQCOM`.
/// ## Layout
/// ```
/// struct VkSamplerCubicWeightsCreateInfoQCOM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkCubicFilterWeightsQCOM cubicWeights;
/// };
/// ```
public final class VkSamplerCubicWeightsCreateInfoQCOM extends GroupType {
    /// The struct layout of `VkSamplerCubicWeightsCreateInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicWeights")
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
    /// The byte offset of `cubicWeights`.
    public static final long OFFSET_cubicWeights = LAYOUT.byteOffset(PathElement.groupElement("cubicWeights"));
    /// The memory layout of `cubicWeights`.
    public static final MemoryLayout LAYOUT_cubicWeights = LAYOUT.select(PathElement.groupElement("cubicWeights"));
    /// The [VarHandle] of `cubicWeights` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cubicWeights = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cubicWeights")));

    /// Creates `VkSamplerCubicWeightsCreateInfoQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerCubicWeightsCreateInfoQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerCubicWeightsCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCubicWeightsCreateInfoQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCubicWeightsCreateInfoQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerCubicWeightsCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCubicWeightsCreateInfoQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCubicWeightsCreateInfoQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerCubicWeightsCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCubicWeightsCreateInfoQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCubicWeightsCreateInfoQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerCubicWeightsCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCubicWeightsCreateInfoQCOM`
    public static VkSamplerCubicWeightsCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkSamplerCubicWeightsCreateInfoQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerCubicWeightsCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCubicWeightsCreateInfoQCOM`
    public static VkSamplerCubicWeightsCreateInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkSamplerCubicWeightsCreateInfoQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerCubicWeightsCreateInfoQCOM copyFrom(VkSamplerCubicWeightsCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerCubicWeightsCreateInfoQCOM reinterpret(long count) { return new VkSamplerCubicWeightsCreateInfoQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerCubicWeightsCreateInfoQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerCubicWeightsCreateInfoQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `cubicWeights` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cubicWeights(MemorySegment segment, long index) { return (int) VH_cubicWeights.get().get(segment, 0L, index); }
    /// {@return `cubicWeights`}
    public int cubicWeights() { return cubicWeights(this.segment(), 0L); }
    /// Sets `cubicWeights` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cubicWeights(MemorySegment segment, long index, int value) { VH_cubicWeights.get().set(segment, 0L, index, value); }
    /// Sets `cubicWeights` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCubicWeightsCreateInfoQCOM cubicWeights(int value) { cubicWeights(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerCubicWeightsCreateInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerCubicWeightsCreateInfoQCOM`
    public VkSamplerCubicWeightsCreateInfoQCOM asSlice(long index) { return new VkSamplerCubicWeightsCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerCubicWeightsCreateInfoQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerCubicWeightsCreateInfoQCOM`
    public VkSamplerCubicWeightsCreateInfoQCOM asSlice(long index, long count) { return new VkSamplerCubicWeightsCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerCubicWeightsCreateInfoQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerCubicWeightsCreateInfoQCOM at(long index, Consumer<VkSamplerCubicWeightsCreateInfoQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCubicWeightsCreateInfoQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCubicWeightsCreateInfoQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `cubicWeights` at the given index}
    /// @param index the index of the struct buffer
    public int cubicWeightsAt(long index) { return cubicWeights(this.segment(), index); }
    /// Sets `cubicWeights` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCubicWeightsCreateInfoQCOM cubicWeightsAt(long index, int value) { cubicWeights(this.segment(), index, value); return this; }

}
