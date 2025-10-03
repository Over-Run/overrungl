// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkSamplerCaptureDescriptorDataInfoEXT`.
/// ## Layout
/// ```
/// struct VkSamplerCaptureDescriptorDataInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSampler sampler;
/// };
/// ```
public final class VkSamplerCaptureDescriptorDataInfoEXT extends GroupType {
    /// The struct layout of `VkSamplerCaptureDescriptorDataInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("sampler")
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
    /// The byte offset of `sampler`.
    public static final long OFFSET_sampler = LAYOUT.byteOffset(PathElement.groupElement("sampler"));
    /// The memory layout of `sampler`.
    public static final MemoryLayout LAYOUT_sampler = LAYOUT.select(PathElement.groupElement("sampler"));
    /// The [VarHandle] of `sampler` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sampler = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampler"));

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSamplerCaptureDescriptorDataInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCaptureDescriptorDataInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSamplerCaptureDescriptorDataInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSamplerCaptureDescriptorDataInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSamplerCaptureDescriptorDataInfoEXT`
    public static VkSamplerCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator) { return new VkSamplerCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSamplerCaptureDescriptorDataInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSamplerCaptureDescriptorDataInfoEXT`
    public static VkSamplerCaptureDescriptorDataInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT copyFrom(VkSamplerCaptureDescriptorDataInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSamplerCaptureDescriptorDataInfoEXT reinterpret(long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSamplerCaptureDescriptorDataInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSamplerCaptureDescriptorDataInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sampler` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sampler(MemorySegment segment, long index) { return (long) VH_sampler.get(segment, 0L, index); }
    /// {@return `sampler`}
    public long sampler() { return sampler(this.segment(), 0L); }
    /// Sets `sampler` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampler(MemorySegment segment, long index, long value) { VH_sampler.set(segment, 0L, index, value); }
    /// Sets `sampler` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT sampler(long value) { sampler(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSamplerCaptureDescriptorDataInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSamplerCaptureDescriptorDataInfoEXT`
    public VkSamplerCaptureDescriptorDataInfoEXT asSlice(long index) { return new VkSamplerCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSamplerCaptureDescriptorDataInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSamplerCaptureDescriptorDataInfoEXT`
    public VkSamplerCaptureDescriptorDataInfoEXT asSlice(long index, long count) { return new VkSamplerCaptureDescriptorDataInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSamplerCaptureDescriptorDataInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT at(long index, Consumer<VkSamplerCaptureDescriptorDataInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sampler` at the given index}
    /// @param index the index of the struct buffer
    public long samplerAt(long index) { return sampler(this.segment(), index); }
    /// Sets `sampler` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSamplerCaptureDescriptorDataInfoEXT samplerAt(long index, long value) { sampler(this.segment(), index, value); return this; }

}
