// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkOpticalFlowSessionCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkOpticalFlowSessionCreateInfoNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t width;
///     uint32_t height;
///     (int) VkFormat imageFormat;
///     (int) VkFormat flowVectorFormat;
///     (int) VkFormat costFormat;
///     ((uint32_t) VkFlags) VkOpticalFlowGridSizeFlagsNV outputGridSize;
///     ((uint32_t) VkFlags) VkOpticalFlowGridSizeFlagsNV hintGridSize;
///     (int) VkOpticalFlowPerformanceLevelNV performanceLevel;
///     ((uint32_t) VkFlags) VkOpticalFlowSessionCreateFlagsNV flags;
/// };
/// ```
public final class VkOpticalFlowSessionCreateInfoNV extends GroupType {
    /// The struct layout of `VkOpticalFlowSessionCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("flowVectorFormat"),
        ValueLayout.JAVA_INT.withName("costFormat"),
        ValueLayout.JAVA_INT.withName("outputGridSize"),
        ValueLayout.JAVA_INT.withName("hintGridSize"),
        ValueLayout.JAVA_INT.withName("performanceLevel"),
        ValueLayout.JAVA_INT.withName("flags")
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
    /// The byte offset of `width`.
    public static final long OFFSET_width = LAYOUT.byteOffset(PathElement.groupElement("width"));
    /// The memory layout of `width`.
    public static final MemoryLayout LAYOUT_width = LAYOUT.select(PathElement.groupElement("width"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The byte offset of `height`.
    public static final long OFFSET_height = LAYOUT.byteOffset(PathElement.groupElement("height"));
    /// The memory layout of `height`.
    public static final MemoryLayout LAYOUT_height = LAYOUT.select(PathElement.groupElement("height"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The byte offset of `imageFormat`.
    public static final long OFFSET_imageFormat = LAYOUT.byteOffset(PathElement.groupElement("imageFormat"));
    /// The memory layout of `imageFormat`.
    public static final MemoryLayout LAYOUT_imageFormat = LAYOUT.select(PathElement.groupElement("imageFormat"));
    /// The [VarHandle] of `imageFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageFormat"));
    /// The byte offset of `flowVectorFormat`.
    public static final long OFFSET_flowVectorFormat = LAYOUT.byteOffset(PathElement.groupElement("flowVectorFormat"));
    /// The memory layout of `flowVectorFormat`.
    public static final MemoryLayout LAYOUT_flowVectorFormat = LAYOUT.select(PathElement.groupElement("flowVectorFormat"));
    /// The [VarHandle] of `flowVectorFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flowVectorFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flowVectorFormat"));
    /// The byte offset of `costFormat`.
    public static final long OFFSET_costFormat = LAYOUT.byteOffset(PathElement.groupElement("costFormat"));
    /// The memory layout of `costFormat`.
    public static final MemoryLayout LAYOUT_costFormat = LAYOUT.select(PathElement.groupElement("costFormat"));
    /// The [VarHandle] of `costFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_costFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("costFormat"));
    /// The byte offset of `outputGridSize`.
    public static final long OFFSET_outputGridSize = LAYOUT.byteOffset(PathElement.groupElement("outputGridSize"));
    /// The memory layout of `outputGridSize`.
    public static final MemoryLayout LAYOUT_outputGridSize = LAYOUT.select(PathElement.groupElement("outputGridSize"));
    /// The [VarHandle] of `outputGridSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_outputGridSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("outputGridSize"));
    /// The byte offset of `hintGridSize`.
    public static final long OFFSET_hintGridSize = LAYOUT.byteOffset(PathElement.groupElement("hintGridSize"));
    /// The memory layout of `hintGridSize`.
    public static final MemoryLayout LAYOUT_hintGridSize = LAYOUT.select(PathElement.groupElement("hintGridSize"));
    /// The [VarHandle] of `hintGridSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hintGridSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hintGridSize"));
    /// The byte offset of `performanceLevel`.
    public static final long OFFSET_performanceLevel = LAYOUT.byteOffset(PathElement.groupElement("performanceLevel"));
    /// The memory layout of `performanceLevel`.
    public static final MemoryLayout LAYOUT_performanceLevel = LAYOUT.select(PathElement.groupElement("performanceLevel"));
    /// The [VarHandle] of `performanceLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_performanceLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("performanceLevel"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkOpticalFlowSessionCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkOpticalFlowSessionCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkOpticalFlowSessionCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreateInfoNV`
    public static VkOpticalFlowSessionCreateInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkOpticalFlowSessionCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowSessionCreateInfoNV`
    public static VkOpticalFlowSessionCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkOpticalFlowSessionCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV copyFrom(VkOpticalFlowSessionCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkOpticalFlowSessionCreateInfoNV reinterpret(long count) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkOpticalFlowSessionCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkOpticalFlowSessionCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    public int width() { return width(this.segment(), 0L); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void width(MemorySegment segment, long index, int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV width(int value) { width(this.segment(), 0L, value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    public int height() { return height(this.segment(), 0L); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void height(MemorySegment segment, long index, int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV height(int value) { height(this.segment(), 0L, value); return this; }

    /// {@return `imageFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageFormat(MemorySegment segment, long index) { return (int) VH_imageFormat.get(segment, 0L, index); }
    /// {@return `imageFormat`}
    public int imageFormat() { return imageFormat(this.segment(), 0L); }
    /// Sets `imageFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageFormat(MemorySegment segment, long index, int value) { VH_imageFormat.set(segment, 0L, index, value); }
    /// Sets `imageFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV imageFormat(int value) { imageFormat(this.segment(), 0L, value); return this; }

    /// {@return `flowVectorFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flowVectorFormat(MemorySegment segment, long index) { return (int) VH_flowVectorFormat.get(segment, 0L, index); }
    /// {@return `flowVectorFormat`}
    public int flowVectorFormat() { return flowVectorFormat(this.segment(), 0L); }
    /// Sets `flowVectorFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flowVectorFormat(MemorySegment segment, long index, int value) { VH_flowVectorFormat.set(segment, 0L, index, value); }
    /// Sets `flowVectorFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormat(int value) { flowVectorFormat(this.segment(), 0L, value); return this; }

    /// {@return `costFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int costFormat(MemorySegment segment, long index) { return (int) VH_costFormat.get(segment, 0L, index); }
    /// {@return `costFormat`}
    public int costFormat() { return costFormat(this.segment(), 0L); }
    /// Sets `costFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void costFormat(MemorySegment segment, long index, int value) { VH_costFormat.set(segment, 0L, index, value); }
    /// Sets `costFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV costFormat(int value) { costFormat(this.segment(), 0L, value); return this; }

    /// {@return `outputGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int outputGridSize(MemorySegment segment, long index) { return (int) VH_outputGridSize.get(segment, 0L, index); }
    /// {@return `outputGridSize`}
    public int outputGridSize() { return outputGridSize(this.segment(), 0L); }
    /// Sets `outputGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void outputGridSize(MemorySegment segment, long index, int value) { VH_outputGridSize.set(segment, 0L, index, value); }
    /// Sets `outputGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV outputGridSize(int value) { outputGridSize(this.segment(), 0L, value); return this; }

    /// {@return `hintGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hintGridSize(MemorySegment segment, long index) { return (int) VH_hintGridSize.get(segment, 0L, index); }
    /// {@return `hintGridSize`}
    public int hintGridSize() { return hintGridSize(this.segment(), 0L); }
    /// Sets `hintGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hintGridSize(MemorySegment segment, long index, int value) { VH_hintGridSize.set(segment, 0L, index, value); }
    /// Sets `hintGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV hintGridSize(int value) { hintGridSize(this.segment(), 0L, value); return this; }

    /// {@return `performanceLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int performanceLevel(MemorySegment segment, long index) { return (int) VH_performanceLevel.get(segment, 0L, index); }
    /// {@return `performanceLevel`}
    public int performanceLevel() { return performanceLevel(this.segment(), 0L); }
    /// Sets `performanceLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void performanceLevel(MemorySegment segment, long index, int value) { VH_performanceLevel.set(segment, 0L, index, value); }
    /// Sets `performanceLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV performanceLevel(int value) { performanceLevel(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkOpticalFlowSessionCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkOpticalFlowSessionCreateInfoNV`
    public VkOpticalFlowSessionCreateInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkOpticalFlowSessionCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkOpticalFlowSessionCreateInfoNV`
    public VkOpticalFlowSessionCreateInfoNV asSlice(long index, long count) { return new VkOpticalFlowSessionCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkOpticalFlowSessionCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV at(long index, Consumer<VkOpticalFlowSessionCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `width` at the given index}
    /// @param index the index of the struct buffer
    public int widthAt(long index) { return width(this.segment(), index); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV widthAt(long index, int value) { width(this.segment(), index, value); return this; }

    /// {@return `height` at the given index}
    /// @param index the index of the struct buffer
    public int heightAt(long index) { return height(this.segment(), index); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV heightAt(long index, int value) { height(this.segment(), index, value); return this; }

    /// {@return `imageFormat` at the given index}
    /// @param index the index of the struct buffer
    public int imageFormatAt(long index) { return imageFormat(this.segment(), index); }
    /// Sets `imageFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV imageFormatAt(long index, int value) { imageFormat(this.segment(), index, value); return this; }

    /// {@return `flowVectorFormat` at the given index}
    /// @param index the index of the struct buffer
    public int flowVectorFormatAt(long index) { return flowVectorFormat(this.segment(), index); }
    /// Sets `flowVectorFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV flowVectorFormatAt(long index, int value) { flowVectorFormat(this.segment(), index, value); return this; }

    /// {@return `costFormat` at the given index}
    /// @param index the index of the struct buffer
    public int costFormatAt(long index) { return costFormat(this.segment(), index); }
    /// Sets `costFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV costFormatAt(long index, int value) { costFormat(this.segment(), index, value); return this; }

    /// {@return `outputGridSize` at the given index}
    /// @param index the index of the struct buffer
    public int outputGridSizeAt(long index) { return outputGridSize(this.segment(), index); }
    /// Sets `outputGridSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV outputGridSizeAt(long index, int value) { outputGridSize(this.segment(), index, value); return this; }

    /// {@return `hintGridSize` at the given index}
    /// @param index the index of the struct buffer
    public int hintGridSizeAt(long index) { return hintGridSize(this.segment(), index); }
    /// Sets `hintGridSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV hintGridSizeAt(long index, int value) { hintGridSize(this.segment(), index, value); return this; }

    /// {@return `performanceLevel` at the given index}
    /// @param index the index of the struct buffer
    public int performanceLevelAt(long index) { return performanceLevel(this.segment(), index); }
    /// Sets `performanceLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV performanceLevelAt(long index, int value) { performanceLevel(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreateInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

}
