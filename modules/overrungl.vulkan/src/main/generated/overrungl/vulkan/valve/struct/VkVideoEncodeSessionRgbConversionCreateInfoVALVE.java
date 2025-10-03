// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`.
/// ## Layout
/// ```
/// struct VkVideoEncodeSessionRgbConversionCreateInfoVALVE {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkVideoEncodeRgbModelConversionFlagBitsVALVE rgbModel;
///     (int) VkVideoEncodeRgbRangeCompressionFlagBitsVALVE rgbRange;
///     (int) VkVideoEncodeRgbChromaOffsetFlagBitsVALVE xChromaOffset;
///     (int) VkVideoEncodeRgbChromaOffsetFlagBitsVALVE yChromaOffset;
/// };
/// ```
public final class VkVideoEncodeSessionRgbConversionCreateInfoVALVE extends GroupType {
    /// The struct layout of `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rgbModel"),
        ValueLayout.JAVA_INT.withName("rgbRange"),
        ValueLayout.JAVA_INT.withName("xChromaOffset"),
        ValueLayout.JAVA_INT.withName("yChromaOffset")
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
    /// The byte offset of `rgbModel`.
    public static final long OFFSET_rgbModel = LAYOUT.byteOffset(PathElement.groupElement("rgbModel"));
    /// The memory layout of `rgbModel`.
    public static final MemoryLayout LAYOUT_rgbModel = LAYOUT.select(PathElement.groupElement("rgbModel"));
    /// The [VarHandle] of `rgbModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_rgbModel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbModel")));
    /// The byte offset of `rgbRange`.
    public static final long OFFSET_rgbRange = LAYOUT.byteOffset(PathElement.groupElement("rgbRange"));
    /// The memory layout of `rgbRange`.
    public static final MemoryLayout LAYOUT_rgbRange = LAYOUT.select(PathElement.groupElement("rgbRange"));
    /// The [VarHandle] of `rgbRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_rgbRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("rgbRange")));
    /// The byte offset of `xChromaOffset`.
    public static final long OFFSET_xChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("xChromaOffset"));
    /// The memory layout of `xChromaOffset`.
    public static final MemoryLayout LAYOUT_xChromaOffset = LAYOUT.select(PathElement.groupElement("xChromaOffset"));
    /// The [VarHandle] of `xChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_xChromaOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("xChromaOffset")));
    /// The byte offset of `yChromaOffset`.
    public static final long OFFSET_yChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("yChromaOffset"));
    /// The memory layout of `yChromaOffset`.
    public static final MemoryLayout LAYOUT_yChromaOffset = LAYOUT.select(PathElement.groupElement("yChromaOffset"));
    /// The [VarHandle] of `yChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_yChromaOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("yChromaOffset")));

    /// Creates `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`
    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE copyFrom(VkVideoEncodeSessionRgbConversionCreateInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE reinterpret(long count) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `rgbModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rgbModel(MemorySegment segment, long index) { return (int) VH_rgbModel.get().get(segment, 0L, index); }
    /// {@return `rgbModel`}
    public int rgbModel() { return rgbModel(this.segment(), 0L); }
    /// Sets `rgbModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rgbModel(MemorySegment segment, long index, int value) { VH_rgbModel.get().set(segment, 0L, index, value); }
    /// Sets `rgbModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModel(int value) { rgbModel(this.segment(), 0L, value); return this; }

    /// {@return `rgbRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rgbRange(MemorySegment segment, long index) { return (int) VH_rgbRange.get().get(segment, 0L, index); }
    /// {@return `rgbRange`}
    public int rgbRange() { return rgbRange(this.segment(), 0L); }
    /// Sets `rgbRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rgbRange(MemorySegment segment, long index, int value) { VH_rgbRange.get().set(segment, 0L, index, value); }
    /// Sets `rgbRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRange(int value) { rgbRange(this.segment(), 0L, value); return this; }

    /// {@return `xChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int xChromaOffset(MemorySegment segment, long index) { return (int) VH_xChromaOffset.get().get(segment, 0L, index); }
    /// {@return `xChromaOffset`}
    public int xChromaOffset() { return xChromaOffset(this.segment(), 0L); }
    /// Sets `xChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xChromaOffset(MemorySegment segment, long index, int value) { VH_xChromaOffset.get().set(segment, 0L, index, value); }
    /// Sets `xChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffset(int value) { xChromaOffset(this.segment(), 0L, value); return this; }

    /// {@return `yChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int yChromaOffset(MemorySegment segment, long index) { return (int) VH_yChromaOffset.get().get(segment, 0L, index); }
    /// {@return `yChromaOffset`}
    public int yChromaOffset() { return yChromaOffset(this.segment(), 0L); }
    /// Sets `yChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void yChromaOffset(MemorySegment segment, long index, int value) { VH_yChromaOffset.get().set(segment, 0L, index, value); }
    /// Sets `yChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffset(int value) { yChromaOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE asSlice(long index) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeSessionRgbConversionCreateInfoVALVE`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE asSlice(long index, long count) { return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeSessionRgbConversionCreateInfoVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE at(long index, Consumer<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `rgbModel` at the given index}
    /// @param index the index of the struct buffer
    public int rgbModelAt(long index) { return rgbModel(this.segment(), index); }
    /// Sets `rgbModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModelAt(long index, int value) { rgbModel(this.segment(), index, value); return this; }

    /// {@return `rgbRange` at the given index}
    /// @param index the index of the struct buffer
    public int rgbRangeAt(long index) { return rgbRange(this.segment(), index); }
    /// Sets `rgbRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRangeAt(long index, int value) { rgbRange(this.segment(), index, value); return this; }

    /// {@return `xChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int xChromaOffsetAt(long index) { return xChromaOffset(this.segment(), index); }
    /// Sets `xChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffsetAt(long index, int value) { xChromaOffset(this.segment(), index, value); return this; }

    /// {@return `yChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int yChromaOffsetAt(long index) { return yChromaOffset(this.segment(), index); }
    /// Sets `yChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffsetAt(long index, int value) { yChromaOffset(this.segment(), index, value); return this; }

}
