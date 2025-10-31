// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkIndirectCommandsLayoutCreateInfoNV`.
/// ## Layout
/// ```
/// struct VkIndirectCommandsLayoutCreateInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkIndirectCommandsLayoutUsageFlagsNV flags;
///     (int) VkPipelineBindPoint pipelineBindPoint;
///     uint32_t tokenCount;
///     const VkIndirectCommandsLayoutTokenNV* pTokens;
///     uint32_t streamCount;
///     const uint32_t* pStreamStrides;
/// };
/// ```
public final class VkIndirectCommandsLayoutCreateInfoNV extends GroupType {
    /// The struct layout of `VkIndirectCommandsLayoutCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.JAVA_INT.withName("tokenCount"),
        ValueLayout.ADDRESS.withName("pTokens"),
        ValueLayout.JAVA_INT.withName("streamCount"),
        ValueLayout.ADDRESS.withName("pStreamStrides")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pipelineBindPoint`.
    public static final long OFFSET_pipelineBindPoint = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
    /// The memory layout of `pipelineBindPoint`.
    public static final MemoryLayout LAYOUT_pipelineBindPoint = LAYOUT.select(PathElement.groupElement("pipelineBindPoint"));
    /// The [VarHandle] of `pipelineBindPoint` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineBindPoint = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineBindPoint"));
    /// The byte offset of `tokenCount`.
    public static final long OFFSET_tokenCount = LAYOUT.byteOffset(PathElement.groupElement("tokenCount"));
    /// The memory layout of `tokenCount`.
    public static final MemoryLayout LAYOUT_tokenCount = LAYOUT.select(PathElement.groupElement("tokenCount"));
    /// The [VarHandle] of `tokenCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tokenCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tokenCount"));
    /// The byte offset of `pTokens`.
    public static final long OFFSET_pTokens = LAYOUT.byteOffset(PathElement.groupElement("pTokens"));
    /// The memory layout of `pTokens`.
    public static final MemoryLayout LAYOUT_pTokens = LAYOUT.select(PathElement.groupElement("pTokens"));
    /// The [VarHandle] of `pTokens` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTokens = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTokens"));
    /// The byte offset of `streamCount`.
    public static final long OFFSET_streamCount = LAYOUT.byteOffset(PathElement.groupElement("streamCount"));
    /// The memory layout of `streamCount`.
    public static final MemoryLayout LAYOUT_streamCount = LAYOUT.select(PathElement.groupElement("streamCount"));
    /// The [VarHandle] of `streamCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_streamCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("streamCount"));
    /// The byte offset of `pStreamStrides`.
    public static final long OFFSET_pStreamStrides = LAYOUT.byteOffset(PathElement.groupElement("pStreamStrides"));
    /// The memory layout of `pStreamStrides`.
    public static final MemoryLayout LAYOUT_pStreamStrides = LAYOUT.select(PathElement.groupElement("pStreamStrides"));
    /// The [VarHandle] of `pStreamStrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStreamStrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStreamStrides"));

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkIndirectCommandsLayoutCreateInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkIndirectCommandsLayoutCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutCreateInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutCreateInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoNV`
    public static VkIndirectCommandsLayoutCreateInfoNV alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutCreateInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkIndirectCommandsLayoutCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutCreateInfoNV`
    public static VkIndirectCommandsLayoutCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkIndirectCommandsLayoutCreateInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV copyFrom(VkIndirectCommandsLayoutCreateInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkIndirectCommandsLayoutCreateInfoNV reinterpret(long count) { return new VkIndirectCommandsLayoutCreateInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkIndirectCommandsLayoutCreateInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkIndirectCommandsLayoutCreateInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkIndirectCommandsLayoutCreateInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineBindPoint(MemorySegment segment, long index) { return (int) VH_pipelineBindPoint.get(segment, 0L, index); }
    /// {@return `pipelineBindPoint`}
    public int pipelineBindPoint() { return pipelineBindPoint(this.segment(), 0L); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineBindPoint(MemorySegment segment, long index, int value) { VH_pipelineBindPoint.set(segment, 0L, index, value); }
    /// Sets `pipelineBindPoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(int value) { pipelineBindPoint(this.segment(), 0L, value); return this; }

    /// {@return `tokenCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tokenCount(MemorySegment segment, long index) { return (int) VH_tokenCount.get(segment, 0L, index); }
    /// {@return `tokenCount`}
    public int tokenCount() { return tokenCount(this.segment(), 0L); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tokenCount(MemorySegment segment, long index, int value) { VH_tokenCount.set(segment, 0L, index, value); }
    /// Sets `tokenCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV tokenCount(int value) { tokenCount(this.segment(), 0L, value); return this; }

    /// {@return `pTokens` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTokens(MemorySegment segment, long index) { return (MemorySegment) VH_pTokens.get(segment, 0L, index); }
    /// {@return `pTokens`}
    public MemorySegment pTokens() { return pTokens(this.segment(), 0L); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTokens(MemorySegment segment, long index, MemorySegment value) { VH_pTokens.set(segment, 0L, index, value); }
    /// Sets `pTokens` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pTokens(MemorySegment value) { pTokens(this.segment(), 0L, value); return this; }

    /// {@return `streamCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int streamCount(MemorySegment segment, long index) { return (int) VH_streamCount.get(segment, 0L, index); }
    /// {@return `streamCount`}
    public int streamCount() { return streamCount(this.segment(), 0L); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void streamCount(MemorySegment segment, long index, int value) { VH_streamCount.set(segment, 0L, index, value); }
    /// Sets `streamCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV streamCount(int value) { streamCount(this.segment(), 0L, value); return this; }

    /// {@return `pStreamStrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStreamStrides(MemorySegment segment, long index) { return (MemorySegment) VH_pStreamStrides.get(segment, 0L, index); }
    /// {@return `pStreamStrides`}
    public MemorySegment pStreamStrides() { return pStreamStrides(this.segment(), 0L); }
    /// Sets `pStreamStrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStreamStrides(MemorySegment segment, long index, MemorySegment value) { VH_pStreamStrides.set(segment, 0L, index, value); }
    /// Sets `pStreamStrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(MemorySegment value) { pStreamStrides(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkIndirectCommandsLayoutCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectCommandsLayoutCreateInfoNV`
    public VkIndirectCommandsLayoutCreateInfoNV asSlice(long index) { return new VkIndirectCommandsLayoutCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkIndirectCommandsLayoutCreateInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectCommandsLayoutCreateInfoNV`
    public VkIndirectCommandsLayoutCreateInfoNV asSlice(long index, long count) { return new VkIndirectCommandsLayoutCreateInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkIndirectCommandsLayoutCreateInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV at(long index, Consumer<VkIndirectCommandsLayoutCreateInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pipelineBindPoint` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineBindPointAt(long index) { return pipelineBindPoint(this.segment(), index); }
    /// Sets `pipelineBindPoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPointAt(long index, int value) { pipelineBindPoint(this.segment(), index, value); return this; }

    /// {@return `tokenCount` at the given index}
    /// @param index the index of the struct buffer
    public int tokenCountAt(long index) { return tokenCount(this.segment(), index); }
    /// Sets `tokenCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV tokenCountAt(long index, int value) { tokenCount(this.segment(), index, value); return this; }

    /// {@return `pTokens` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTokensAt(long index) { return pTokens(this.segment(), index); }
    /// Sets `pTokens` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pTokensAt(long index, MemorySegment value) { pTokens(this.segment(), index, value); return this; }

    /// {@return `streamCount` at the given index}
    /// @param index the index of the struct buffer
    public int streamCountAt(long index) { return streamCount(this.segment(), index); }
    /// Sets `streamCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV streamCountAt(long index, int value) { streamCount(this.segment(), index, value); return this; }

    /// {@return `pStreamStrides` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStreamStridesAt(long index) { return pStreamStrides(this.segment(), index); }
    /// Sets `pStreamStrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStridesAt(long index, MemorySegment value) { pStreamStrides(this.segment(), index, value); return this; }

}
