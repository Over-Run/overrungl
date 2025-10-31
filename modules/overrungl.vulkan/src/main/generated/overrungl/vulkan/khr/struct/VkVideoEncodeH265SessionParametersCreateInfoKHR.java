// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265SessionParametersCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t maxStdVPSCount;
///     uint32_t maxStdSPSCount;
///     uint32_t maxStdPPSCount;
///     const VkVideoEncodeH265SessionParametersAddInfoKHR* pParametersAddInfo;
/// };
/// ```
public final class VkVideoEncodeH265SessionParametersCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxStdVPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdSPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdPPSCount"),
        ValueLayout.ADDRESS.withName("pParametersAddInfo")
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
    /// The byte offset of `maxStdVPSCount`.
    public static final long OFFSET_maxStdVPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdVPSCount"));
    /// The memory layout of `maxStdVPSCount`.
    public static final MemoryLayout LAYOUT_maxStdVPSCount = LAYOUT.select(PathElement.groupElement("maxStdVPSCount"));
    /// The [VarHandle] of `maxStdVPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxStdVPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdVPSCount"));
    /// The byte offset of `maxStdSPSCount`.
    public static final long OFFSET_maxStdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdSPSCount"));
    /// The memory layout of `maxStdSPSCount`.
    public static final MemoryLayout LAYOUT_maxStdSPSCount = LAYOUT.select(PathElement.groupElement("maxStdSPSCount"));
    /// The [VarHandle] of `maxStdSPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxStdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdSPSCount"));
    /// The byte offset of `maxStdPPSCount`.
    public static final long OFFSET_maxStdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdPPSCount"));
    /// The memory layout of `maxStdPPSCount`.
    public static final MemoryLayout LAYOUT_maxStdPPSCount = LAYOUT.select(PathElement.groupElement("maxStdPPSCount"));
    /// The [VarHandle] of `maxStdPPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxStdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdPPSCount"));
    /// The byte offset of `pParametersAddInfo`.
    public static final long OFFSET_pParametersAddInfo = LAYOUT.byteOffset(PathElement.groupElement("pParametersAddInfo"));
    /// The memory layout of `pParametersAddInfo`.
    public static final MemoryLayout LAYOUT_pParametersAddInfo = LAYOUT.select(PathElement.groupElement("pParametersAddInfo"));
    /// The [VarHandle] of `pParametersAddInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pParametersAddInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParametersAddInfo"));

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265SessionParametersCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265SessionParametersCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265SessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public static VkVideoEncodeH265SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR copyFrom(VkVideoEncodeH265SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265SessionParametersCreateInfoKHR reinterpret(long count) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265SessionParametersCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxStdVPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxStdVPSCount(MemorySegment segment, long index) { return (int) VH_maxStdVPSCount.get(segment, 0L, index); }
    /// {@return `maxStdVPSCount`}
    public int maxStdVPSCount() { return maxStdVPSCount(this.segment(), 0L); }
    /// Sets `maxStdVPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxStdVPSCount(MemorySegment segment, long index, int value) { VH_maxStdVPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdVPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdVPSCount(int value) { maxStdVPSCount(this.segment(), 0L, value); return this; }

    /// {@return `maxStdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxStdSPSCount(MemorySegment segment, long index) { return (int) VH_maxStdSPSCount.get(segment, 0L, index); }
    /// {@return `maxStdSPSCount`}
    public int maxStdSPSCount() { return maxStdSPSCount(this.segment(), 0L); }
    /// Sets `maxStdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxStdSPSCount(MemorySegment segment, long index, int value) { VH_maxStdSPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdSPSCount(int value) { maxStdSPSCount(this.segment(), 0L, value); return this; }

    /// {@return `maxStdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxStdPPSCount(MemorySegment segment, long index) { return (int) VH_maxStdPPSCount.get(segment, 0L, index); }
    /// {@return `maxStdPPSCount`}
    public int maxStdPPSCount() { return maxStdPPSCount(this.segment(), 0L); }
    /// Sets `maxStdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxStdPPSCount(MemorySegment segment, long index, int value) { VH_maxStdPPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdPPSCount(int value) { maxStdPPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pParametersAddInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pParametersAddInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pParametersAddInfo.get(segment, 0L, index); }
    /// {@return `pParametersAddInfo`}
    public MemorySegment pParametersAddInfo() { return pParametersAddInfo(this.segment(), 0L); }
    /// Sets `pParametersAddInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pParametersAddInfo(MemorySegment segment, long index, MemorySegment value) { VH_pParametersAddInfo.set(segment, 0L, index, value); }
    /// Sets `pParametersAddInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pParametersAddInfo(MemorySegment value) { pParametersAddInfo(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265SessionParametersCreateInfoKHR`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH265SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265SessionParametersCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR at(long index, Consumer<VkVideoEncodeH265SessionParametersCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxStdVPSCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxStdVPSCountAt(long index) { return maxStdVPSCount(this.segment(), index); }
    /// Sets `maxStdVPSCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdVPSCountAt(long index, int value) { maxStdVPSCount(this.segment(), index, value); return this; }

    /// {@return `maxStdSPSCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxStdSPSCountAt(long index) { return maxStdSPSCount(this.segment(), index); }
    /// Sets `maxStdSPSCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdSPSCountAt(long index, int value) { maxStdSPSCount(this.segment(), index, value); return this; }

    /// {@return `maxStdPPSCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxStdPPSCountAt(long index) { return maxStdPPSCount(this.segment(), index); }
    /// Sets `maxStdPPSCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR maxStdPPSCountAt(long index, int value) { maxStdPPSCount(this.segment(), index, value); return this; }

    /// {@return `pParametersAddInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pParametersAddInfoAt(long index) { return pParametersAddInfo(this.segment(), index); }
    /// Sets `pParametersAddInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265SessionParametersCreateInfoKHR pParametersAddInfoAt(long index, MemorySegment value) { pParametersAddInfo(this.segment(), index, value); return this; }

}
