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

/// Represents `VkVideoDecodeH265CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoDecodeH265CapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) StdVideoH265LevelIdc maxLevelIdc;
/// };
/// ```
public final class VkVideoDecodeH265CapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH265CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc")
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
    /// The byte offset of `maxLevelIdc`.
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    /// The memory layout of `maxLevelIdc`.
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeH265CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeH265CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265CapabilitiesKHR`
    public static VkVideoDecodeH265CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeH265CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265CapabilitiesKHR`
    public static VkVideoDecodeH265CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR copyFrom(VkVideoDecodeH265CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeH265CapabilitiesKHR reinterpret(long count) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeH265CapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH265CapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    public int maxLevelIdc() { return maxLevelIdc(this.segment(), 0L); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLevelIdc(MemorySegment segment, long index, int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR maxLevelIdc(int value) { maxLevelIdc(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeH265CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH265CapabilitiesKHR`
    public VkVideoDecodeH265CapabilitiesKHR asSlice(long index) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeH265CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH265CapabilitiesKHR`
    public VkVideoDecodeH265CapabilitiesKHR asSlice(long index, long count) { return new VkVideoDecodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeH265CapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR at(long index, Consumer<VkVideoDecodeH265CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param index the index of the struct buffer
    public int maxLevelIdcAt(long index) { return maxLevelIdc(this.segment(), index); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265CapabilitiesKHR maxLevelIdcAt(long index, int value) { maxLevelIdc(this.segment(), index, value); return this; }

}
