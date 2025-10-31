// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeRgbConversionCapabilitiesVALVE`.
/// ## Layout
/// ```
/// struct VkVideoEncodeRgbConversionCapabilitiesVALVE {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeRgbModelConversionFlagsVALVE rgbModels;
///     ((uint32_t) VkFlags) VkVideoEncodeRgbRangeCompressionFlagsVALVE rgbRanges;
///     ((uint32_t) VkFlags) VkVideoEncodeRgbChromaOffsetFlagsVALVE xChromaOffsets;
///     ((uint32_t) VkFlags) VkVideoEncodeRgbChromaOffsetFlagsVALVE yChromaOffsets;
/// };
/// ```
public final class VkVideoEncodeRgbConversionCapabilitiesVALVE extends GroupType {
    /// The struct layout of `VkVideoEncodeRgbConversionCapabilitiesVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rgbModels"),
        ValueLayout.JAVA_INT.withName("rgbRanges"),
        ValueLayout.JAVA_INT.withName("xChromaOffsets"),
        ValueLayout.JAVA_INT.withName("yChromaOffsets")
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
    /// The byte offset of `rgbModels`.
    public static final long OFFSET_rgbModels = LAYOUT.byteOffset(PathElement.groupElement("rgbModels"));
    /// The memory layout of `rgbModels`.
    public static final MemoryLayout LAYOUT_rgbModels = LAYOUT.select(PathElement.groupElement("rgbModels"));
    /// The [VarHandle] of `rgbModels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rgbModels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbModels"));
    /// The byte offset of `rgbRanges`.
    public static final long OFFSET_rgbRanges = LAYOUT.byteOffset(PathElement.groupElement("rgbRanges"));
    /// The memory layout of `rgbRanges`.
    public static final MemoryLayout LAYOUT_rgbRanges = LAYOUT.select(PathElement.groupElement("rgbRanges"));
    /// The [VarHandle] of `rgbRanges` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rgbRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbRanges"));
    /// The byte offset of `xChromaOffsets`.
    public static final long OFFSET_xChromaOffsets = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffsets"));
    /// The memory layout of `xChromaOffsets`.
    public static final MemoryLayout LAYOUT_xChromaOffsets = LAYOUT.select(PathElement.groupElement("xChromaOffsets"));
    /// The [VarHandle] of `xChromaOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_xChromaOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffsets"));
    /// The byte offset of `yChromaOffsets`.
    public static final long OFFSET_yChromaOffsets = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffsets"));
    /// The memory layout of `yChromaOffsets`.
    public static final MemoryLayout LAYOUT_yChromaOffsets = LAYOUT.select(PathElement.groupElement("yChromaOffsets"));
    /// The [VarHandle] of `yChromaOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_yChromaOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffsets"));

    /// Creates `VkVideoEncodeRgbConversionCapabilitiesVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeRgbConversionCapabilitiesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeRgbConversionCapabilitiesVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeRgbConversionCapabilitiesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeRgbConversionCapabilitiesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeRgbConversionCapabilitiesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeRgbConversionCapabilitiesVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeRgbConversionCapabilitiesVALVE`
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE alloc(SegmentAllocator allocator) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeRgbConversionCapabilitiesVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeRgbConversionCapabilitiesVALVE`
    public static VkVideoEncodeRgbConversionCapabilitiesVALVE alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE copyFrom(VkVideoEncodeRgbConversionCapabilitiesVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeRgbConversionCapabilitiesVALVE reinterpret(long count) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rgbModels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rgbModels(MemorySegment segment, long index) { return (int) VH_rgbModels.get(segment, 0L, index); }
    /// {@return `rgbModels`}
    public int rgbModels() { return rgbModels(this.segment(), 0L); }
    /// Sets `rgbModels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rgbModels(MemorySegment segment, long index, int value) { VH_rgbModels.set(segment, 0L, index, value); }
    /// Sets `rgbModels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbModels(int value) { rgbModels(this.segment(), 0L, value); return this; }

    /// {@return `rgbRanges` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rgbRanges(MemorySegment segment, long index) { return (int) VH_rgbRanges.get(segment, 0L, index); }
    /// {@return `rgbRanges`}
    public int rgbRanges() { return rgbRanges(this.segment(), 0L); }
    /// Sets `rgbRanges` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rgbRanges(MemorySegment segment, long index, int value) { VH_rgbRanges.set(segment, 0L, index, value); }
    /// Sets `rgbRanges` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbRanges(int value) { rgbRanges(this.segment(), 0L, value); return this; }

    /// {@return `xChromaOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int xChromaOffsets(MemorySegment segment, long index) { return (int) VH_xChromaOffsets.get(segment, 0L, index); }
    /// {@return `xChromaOffsets`}
    public int xChromaOffsets() { return xChromaOffsets(this.segment(), 0L); }
    /// Sets `xChromaOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xChromaOffsets(MemorySegment segment, long index, int value) { VH_xChromaOffsets.set(segment, 0L, index, value); }
    /// Sets `xChromaOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE xChromaOffsets(int value) { xChromaOffsets(this.segment(), 0L, value); return this; }

    /// {@return `yChromaOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int yChromaOffsets(MemorySegment segment, long index) { return (int) VH_yChromaOffsets.get(segment, 0L, index); }
    /// {@return `yChromaOffsets`}
    public int yChromaOffsets() { return yChromaOffsets(this.segment(), 0L); }
    /// Sets `yChromaOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void yChromaOffsets(MemorySegment segment, long index, int value) { VH_yChromaOffsets.set(segment, 0L, index, value); }
    /// Sets `yChromaOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE yChromaOffsets(int value) { yChromaOffsets(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeRgbConversionCapabilitiesVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeRgbConversionCapabilitiesVALVE`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE asSlice(long index) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeRgbConversionCapabilitiesVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeRgbConversionCapabilitiesVALVE`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE asSlice(long index, long count) { return new VkVideoEncodeRgbConversionCapabilitiesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeRgbConversionCapabilitiesVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE at(long index, Consumer<VkVideoEncodeRgbConversionCapabilitiesVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `rgbModels` at the given index}
    /// @param index the index of the struct buffer
    public int rgbModelsAt(long index) { return rgbModels(this.segment(), index); }
    /// Sets `rgbModels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbModelsAt(long index, int value) { rgbModels(this.segment(), index, value); return this; }

    /// {@return `rgbRanges` at the given index}
    /// @param index the index of the struct buffer
    public int rgbRangesAt(long index) { return rgbRanges(this.segment(), index); }
    /// Sets `rgbRanges` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE rgbRangesAt(long index, int value) { rgbRanges(this.segment(), index, value); return this; }

    /// {@return `xChromaOffsets` at the given index}
    /// @param index the index of the struct buffer
    public int xChromaOffsetsAt(long index) { return xChromaOffsets(this.segment(), index); }
    /// Sets `xChromaOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE xChromaOffsetsAt(long index, int value) { xChromaOffsets(this.segment(), index, value); return this; }

    /// {@return `yChromaOffsets` at the given index}
    /// @param index the index of the struct buffer
    public int yChromaOffsetsAt(long index) { return yChromaOffsets(this.segment(), index); }
    /// Sets `yChromaOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeRgbConversionCapabilitiesVALVE yChromaOffsetsAt(long index, int value) { yChromaOffsets(this.segment(), index, value); return this; }

}
