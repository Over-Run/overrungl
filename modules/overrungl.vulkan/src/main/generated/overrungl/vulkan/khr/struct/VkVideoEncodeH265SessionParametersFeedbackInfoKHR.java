// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265SessionParametersFeedbackInfoKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 hasStdVPSOverrides;
///     (uint32_t) VkBool32 hasStdSPSOverrides;
///     (uint32_t) VkBool32 hasStdPPSOverrides;
/// };
/// ```
public final class VkVideoEncodeH265SessionParametersFeedbackInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasStdVPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdSPSOverrides"),
        ValueLayout.JAVA_INT.withName("hasStdPPSOverrides")
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
    /// The byte offset of `hasStdVPSOverrides`.
    public static final long OFFSET_hasStdVPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdVPSOverrides"));
    /// The memory layout of `hasStdVPSOverrides`.
    public static final MemoryLayout LAYOUT_hasStdVPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdVPSOverrides"));
    /// The [VarHandle] of `hasStdVPSOverrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_hasStdVPSOverrides = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdVPSOverrides")));
    /// The byte offset of `hasStdSPSOverrides`.
    public static final long OFFSET_hasStdSPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdSPSOverrides"));
    /// The memory layout of `hasStdSPSOverrides`.
    public static final MemoryLayout LAYOUT_hasStdSPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdSPSOverrides"));
    /// The [VarHandle] of `hasStdSPSOverrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_hasStdSPSOverrides = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdSPSOverrides")));
    /// The byte offset of `hasStdPPSOverrides`.
    public static final long OFFSET_hasStdPPSOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasStdPPSOverrides"));
    /// The memory layout of `hasStdPPSOverrides`.
    public static final MemoryLayout LAYOUT_hasStdPPSOverrides = LAYOUT.select(PathElement.groupElement("hasStdPPSOverrides"));
    /// The [VarHandle] of `hasStdPPSOverrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_hasStdPPSOverrides = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasStdPPSOverrides")));

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR copyFrom(VkVideoEncodeH265SessionParametersFeedbackInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR reinterpret(long count) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `hasStdVPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasStdVPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdVPSOverrides.get().get(segment, 0L, index); }
    /// {@return `hasStdVPSOverrides`}
    public int hasStdVPSOverrides() { return hasStdVPSOverrides(this.segment(), 0L); }
    /// Sets `hasStdVPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasStdVPSOverrides(MemorySegment segment, long index, int value) { VH_hasStdVPSOverrides.get().set(segment, 0L, index, value); }
    /// Sets `hasStdVPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdVPSOverrides(int value) { hasStdVPSOverrides(this.segment(), 0L, value); return this; }

    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasStdSPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdSPSOverrides.get().get(segment, 0L, index); }
    /// {@return `hasStdSPSOverrides`}
    public int hasStdSPSOverrides() { return hasStdSPSOverrides(this.segment(), 0L); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasStdSPSOverrides(MemorySegment segment, long index, int value) { VH_hasStdSPSOverrides.get().set(segment, 0L, index, value); }
    /// Sets `hasStdSPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdSPSOverrides(int value) { hasStdSPSOverrides(this.segment(), 0L, value); return this; }

    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasStdPPSOverrides(MemorySegment segment, long index) { return (int) VH_hasStdPPSOverrides.get().get(segment, 0L, index); }
    /// {@return `hasStdPPSOverrides`}
    public int hasStdPPSOverrides() { return hasStdPPSOverrides(this.segment(), 0L); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasStdPPSOverrides(MemorySegment segment, long index, int value) { VH_hasStdPPSOverrides.get().set(segment, 0L, index, value); }
    /// Sets `hasStdPPSOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdPPSOverrides(int value) { hasStdPPSOverrides(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR asSlice(long index) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265SessionParametersFeedbackInfoKHR`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265SessionParametersFeedbackInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR at(long index, Consumer<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `hasStdVPSOverrides` at the given index}
    /// @param index the index of the struct buffer
    public int hasStdVPSOverridesAt(long index) { return hasStdVPSOverrides(this.segment(), index); }
    /// Sets `hasStdVPSOverrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdVPSOverridesAt(long index, int value) { hasStdVPSOverrides(this.segment(), index, value); return this; }

    /// {@return `hasStdSPSOverrides` at the given index}
    /// @param index the index of the struct buffer
    public int hasStdSPSOverridesAt(long index) { return hasStdSPSOverrides(this.segment(), index); }
    /// Sets `hasStdSPSOverrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdSPSOverridesAt(long index, int value) { hasStdSPSOverrides(this.segment(), index, value); return this; }

    /// {@return `hasStdPPSOverrides` at the given index}
    /// @param index the index of the struct buffer
    public int hasStdPPSOverridesAt(long index) { return hasStdPPSOverrides(this.segment(), index); }
    /// Sets `hasStdPPSOverrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR hasStdPPSOverridesAt(long index, int value) { hasStdPPSOverrides(this.segment(), index, value); return this; }

}
