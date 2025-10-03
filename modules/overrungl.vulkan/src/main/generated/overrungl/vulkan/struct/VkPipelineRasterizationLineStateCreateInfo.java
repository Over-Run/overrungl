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

/// Represents `VkPipelineRasterizationLineStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineRasterizationLineStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkLineRasterizationMode lineRasterizationMode;
///     (uint32_t) VkBool32 stippledLineEnable;
///     uint32_t lineStippleFactor;
///     uint16_t lineStipplePattern;
/// };
/// ```
public final class VkPipelineRasterizationLineStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineRasterizationLineStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("stippledLineEnable"),
        ValueLayout.JAVA_INT.withName("lineStippleFactor"),
        ValueLayout.JAVA_SHORT.withName("lineStipplePattern")
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
    /// The byte offset of `lineRasterizationMode`.
    public static final long OFFSET_lineRasterizationMode = LAYOUT.byteOffset(PathElement.groupElement("lineRasterizationMode"));
    /// The memory layout of `lineRasterizationMode`.
    public static final MemoryLayout LAYOUT_lineRasterizationMode = LAYOUT.select(PathElement.groupElement("lineRasterizationMode"));
    /// The [VarHandle] of `lineRasterizationMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineRasterizationMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineRasterizationMode"));
    /// The byte offset of `stippledLineEnable`.
    public static final long OFFSET_stippledLineEnable = LAYOUT.byteOffset(PathElement.groupElement("stippledLineEnable"));
    /// The memory layout of `stippledLineEnable`.
    public static final MemoryLayout LAYOUT_stippledLineEnable = LAYOUT.select(PathElement.groupElement("stippledLineEnable"));
    /// The [VarHandle] of `stippledLineEnable` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stippledLineEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledLineEnable"));
    /// The byte offset of `lineStippleFactor`.
    public static final long OFFSET_lineStippleFactor = LAYOUT.byteOffset(PathElement.groupElement("lineStippleFactor"));
    /// The memory layout of `lineStippleFactor`.
    public static final MemoryLayout LAYOUT_lineStippleFactor = LAYOUT.select(PathElement.groupElement("lineStippleFactor"));
    /// The [VarHandle] of `lineStippleFactor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineStippleFactor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineStippleFactor"));
    /// The byte offset of `lineStipplePattern`.
    public static final long OFFSET_lineStipplePattern = LAYOUT.byteOffset(PathElement.groupElement("lineStipplePattern"));
    /// The memory layout of `lineStipplePattern`.
    public static final MemoryLayout LAYOUT_lineStipplePattern = LAYOUT.select(PathElement.groupElement("lineStipplePattern"));
    /// The [VarHandle] of `lineStipplePattern` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineStipplePattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineStipplePattern"));

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineRasterizationLineStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationLineStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationLineStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineRasterizationLineStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationLineStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRasterizationLineStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineRasterizationLineStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationLineStateCreateInfo`
    public static VkPipelineRasterizationLineStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationLineStateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineRasterizationLineStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationLineStateCreateInfo`
    public static VkPipelineRasterizationLineStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationLineStateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo copyFrom(VkPipelineRasterizationLineStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineRasterizationLineStateCreateInfo reinterpret(long count) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineRasterizationLineStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineRasterizationLineStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `lineRasterizationMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lineRasterizationMode(MemorySegment segment, long index) { return (int) VH_lineRasterizationMode.get(segment, 0L, index); }
    /// {@return `lineRasterizationMode`}
    public int lineRasterizationMode() { return lineRasterizationMode(this.segment(), 0L); }
    /// Sets `lineRasterizationMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineRasterizationMode(MemorySegment segment, long index, int value) { VH_lineRasterizationMode.set(segment, 0L, index, value); }
    /// Sets `lineRasterizationMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(int value) { lineRasterizationMode(this.segment(), 0L, value); return this; }

    /// {@return `stippledLineEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledLineEnable(MemorySegment segment, long index) { return (int) VH_stippledLineEnable.get(segment, 0L, index); }
    /// {@return `stippledLineEnable`}
    public int stippledLineEnable() { return stippledLineEnable(this.segment(), 0L); }
    /// Sets `stippledLineEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledLineEnable(MemorySegment segment, long index, int value) { VH_stippledLineEnable.set(segment, 0L, index, value); }
    /// Sets `stippledLineEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(int value) { stippledLineEnable(this.segment(), 0L, value); return this; }

    /// {@return `lineStippleFactor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lineStippleFactor(MemorySegment segment, long index) { return (int) VH_lineStippleFactor.get(segment, 0L, index); }
    /// {@return `lineStippleFactor`}
    public int lineStippleFactor() { return lineStippleFactor(this.segment(), 0L); }
    /// Sets `lineStippleFactor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineStippleFactor(MemorySegment segment, long index, int value) { VH_lineStippleFactor.set(segment, 0L, index, value); }
    /// Sets `lineStippleFactor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(int value) { lineStippleFactor(this.segment(), 0L, value); return this; }

    /// {@return `lineStipplePattern` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static short lineStipplePattern(MemorySegment segment, long index) { return (short) VH_lineStipplePattern.get(segment, 0L, index); }
    /// {@return `lineStipplePattern`}
    public short lineStipplePattern() { return lineStipplePattern(this.segment(), 0L); }
    /// Sets `lineStipplePattern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineStipplePattern(MemorySegment segment, long index, short value) { VH_lineStipplePattern.set(segment, 0L, index, value); }
    /// Sets `lineStipplePattern` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(short value) { lineStipplePattern(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineRasterizationLineStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRasterizationLineStateCreateInfo`
    public VkPipelineRasterizationLineStateCreateInfo asSlice(long index) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineRasterizationLineStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRasterizationLineStateCreateInfo`
    public VkPipelineRasterizationLineStateCreateInfo asSlice(long index, long count) { return new VkPipelineRasterizationLineStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineRasterizationLineStateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo at(long index, Consumer<VkPipelineRasterizationLineStateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `lineRasterizationMode` at the given index}
    /// @param index the index of the struct buffer
    public int lineRasterizationModeAt(long index) { return lineRasterizationMode(this.segment(), index); }
    /// Sets `lineRasterizationMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationModeAt(long index, int value) { lineRasterizationMode(this.segment(), index, value); return this; }

    /// {@return `stippledLineEnable` at the given index}
    /// @param index the index of the struct buffer
    public int stippledLineEnableAt(long index) { return stippledLineEnable(this.segment(), index); }
    /// Sets `stippledLineEnable` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnableAt(long index, int value) { stippledLineEnable(this.segment(), index, value); return this; }

    /// {@return `lineStippleFactor` at the given index}
    /// @param index the index of the struct buffer
    public int lineStippleFactorAt(long index) { return lineStippleFactor(this.segment(), index); }
    /// Sets `lineStippleFactor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactorAt(long index, int value) { lineStippleFactor(this.segment(), index, value); return this; }

    /// {@return `lineStipplePattern` at the given index}
    /// @param index the index of the struct buffer
    public short lineStipplePatternAt(long index) { return lineStipplePattern(this.segment(), index); }
    /// Sets `lineStipplePattern` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePatternAt(long index, short value) { lineStipplePattern(this.segment(), index, value); return this; }

}
