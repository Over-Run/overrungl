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

/// Represents `VkVideoProfileInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoProfileInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkVideoCodecOperationFlagBitsKHR videoCodecOperation;
///     ((uint32_t) VkFlags) VkVideoChromaSubsamplingFlagsKHR chromaSubsampling;
///     ((uint32_t) VkFlags) VkVideoComponentBitDepthFlagsKHR lumaBitDepth;
///     ((uint32_t) VkFlags) VkVideoComponentBitDepthFlagsKHR chromaBitDepth;
/// };
/// ```
public final class VkVideoProfileInfoKHR extends GroupType {
    /// The struct layout of `VkVideoProfileInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoCodecOperation"),
        ValueLayout.JAVA_INT.withName("chromaSubsampling"),
        ValueLayout.JAVA_INT.withName("lumaBitDepth"),
        ValueLayout.JAVA_INT.withName("chromaBitDepth")
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
    /// The byte offset of `videoCodecOperation`.
    public static final long OFFSET_videoCodecOperation = LAYOUT.byteOffset(PathElement.groupElement("videoCodecOperation"));
    /// The memory layout of `videoCodecOperation`.
    public static final MemoryLayout LAYOUT_videoCodecOperation = LAYOUT.select(PathElement.groupElement("videoCodecOperation"));
    /// The [VarHandle] of `videoCodecOperation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_videoCodecOperation = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoCodecOperation")));
    /// The byte offset of `chromaSubsampling`.
    public static final long OFFSET_chromaSubsampling = LAYOUT.byteOffset(PathElement.groupElement("chromaSubsampling"));
    /// The memory layout of `chromaSubsampling`.
    public static final MemoryLayout LAYOUT_chromaSubsampling = LAYOUT.select(PathElement.groupElement("chromaSubsampling"));
    /// The [VarHandle] of `chromaSubsampling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_chromaSubsampling = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaSubsampling")));
    /// The byte offset of `lumaBitDepth`.
    public static final long OFFSET_lumaBitDepth = LAYOUT.byteOffset(PathElement.groupElement("lumaBitDepth"));
    /// The memory layout of `lumaBitDepth`.
    public static final MemoryLayout LAYOUT_lumaBitDepth = LAYOUT.select(PathElement.groupElement("lumaBitDepth"));
    /// The [VarHandle] of `lumaBitDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_lumaBitDepth = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("lumaBitDepth")));
    /// The byte offset of `chromaBitDepth`.
    public static final long OFFSET_chromaBitDepth = LAYOUT.byteOffset(PathElement.groupElement("chromaBitDepth"));
    /// The memory layout of `chromaBitDepth`.
    public static final MemoryLayout LAYOUT_chromaBitDepth = LAYOUT.select(PathElement.groupElement("chromaBitDepth"));
    /// The [VarHandle] of `chromaBitDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_chromaBitDepth = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("chromaBitDepth")));

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoProfileInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoProfileInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoProfileInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoProfileInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoProfileInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoProfileInfoKHR`
    public static VkVideoProfileInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoProfileInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoProfileInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoProfileInfoKHR`
    public static VkVideoProfileInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoProfileInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoProfileInfoKHR copyFrom(VkVideoProfileInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoProfileInfoKHR reinterpret(long count) { return new VkVideoProfileInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoProfileInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoProfileInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `videoCodecOperation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int videoCodecOperation(MemorySegment segment, long index) { return (int) VH_videoCodecOperation.get().get(segment, 0L, index); }
    /// {@return `videoCodecOperation`}
    public int videoCodecOperation() { return videoCodecOperation(this.segment(), 0L); }
    /// Sets `videoCodecOperation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoCodecOperation(MemorySegment segment, long index, int value) { VH_videoCodecOperation.get().set(segment, 0L, index, value); }
    /// Sets `videoCodecOperation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR videoCodecOperation(int value) { videoCodecOperation(this.segment(), 0L, value); return this; }

    /// {@return `chromaSubsampling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chromaSubsampling(MemorySegment segment, long index) { return (int) VH_chromaSubsampling.get().get(segment, 0L, index); }
    /// {@return `chromaSubsampling`}
    public int chromaSubsampling() { return chromaSubsampling(this.segment(), 0L); }
    /// Sets `chromaSubsampling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chromaSubsampling(MemorySegment segment, long index, int value) { VH_chromaSubsampling.get().set(segment, 0L, index, value); }
    /// Sets `chromaSubsampling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR chromaSubsampling(int value) { chromaSubsampling(this.segment(), 0L, value); return this; }

    /// {@return `lumaBitDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lumaBitDepth(MemorySegment segment, long index) { return (int) VH_lumaBitDepth.get().get(segment, 0L, index); }
    /// {@return `lumaBitDepth`}
    public int lumaBitDepth() { return lumaBitDepth(this.segment(), 0L); }
    /// Sets `lumaBitDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lumaBitDepth(MemorySegment segment, long index, int value) { VH_lumaBitDepth.get().set(segment, 0L, index, value); }
    /// Sets `lumaBitDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR lumaBitDepth(int value) { lumaBitDepth(this.segment(), 0L, value); return this; }

    /// {@return `chromaBitDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int chromaBitDepth(MemorySegment segment, long index) { return (int) VH_chromaBitDepth.get().get(segment, 0L, index); }
    /// {@return `chromaBitDepth`}
    public int chromaBitDepth() { return chromaBitDepth(this.segment(), 0L); }
    /// Sets `chromaBitDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void chromaBitDepth(MemorySegment segment, long index, int value) { VH_chromaBitDepth.get().set(segment, 0L, index, value); }
    /// Sets `chromaBitDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR chromaBitDepth(int value) { chromaBitDepth(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoProfileInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoProfileInfoKHR`
    public VkVideoProfileInfoKHR asSlice(long index) { return new VkVideoProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoProfileInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoProfileInfoKHR`
    public VkVideoProfileInfoKHR asSlice(long index, long count) { return new VkVideoProfileInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoProfileInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoProfileInfoKHR at(long index, Consumer<VkVideoProfileInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `videoCodecOperation` at the given index}
    /// @param index the index of the struct buffer
    public int videoCodecOperationAt(long index) { return videoCodecOperation(this.segment(), index); }
    /// Sets `videoCodecOperation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR videoCodecOperationAt(long index, int value) { videoCodecOperation(this.segment(), index, value); return this; }

    /// {@return `chromaSubsampling` at the given index}
    /// @param index the index of the struct buffer
    public int chromaSubsamplingAt(long index) { return chromaSubsampling(this.segment(), index); }
    /// Sets `chromaSubsampling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR chromaSubsamplingAt(long index, int value) { chromaSubsampling(this.segment(), index, value); return this; }

    /// {@return `lumaBitDepth` at the given index}
    /// @param index the index of the struct buffer
    public int lumaBitDepthAt(long index) { return lumaBitDepth(this.segment(), index); }
    /// Sets `lumaBitDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR lumaBitDepthAt(long index, int value) { lumaBitDepth(this.segment(), index, value); return this; }

    /// {@return `chromaBitDepth` at the given index}
    /// @param index the index of the struct buffer
    public int chromaBitDepthAt(long index) { return chromaBitDepth(this.segment(), index); }
    /// Sets `chromaBitDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoProfileInfoKHR chromaBitDepthAt(long index, int value) { chromaBitDepth(this.segment(), index, value); return this; }

}
