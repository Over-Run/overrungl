// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
/// ## Layout
/// ```
/// struct VkBindDescriptorBufferEmbeddedSamplersInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags stageFlags;
///     (uint64_t) VkPipelineLayout layout;
///     uint32_t set;
/// };
/// ```
public final class VkBindDescriptorBufferEmbeddedSamplersInfoEXT extends GroupType {
    /// The struct layout of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_LONG.withName("layout"),
        ValueLayout.JAVA_INT.withName("set")
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
    /// The byte offset of `stageFlags`.
    public static final long OFFSET_stageFlags = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
    /// The memory layout of `stageFlags`.
    public static final MemoryLayout LAYOUT_stageFlags = LAYOUT.select(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The byte offset of `layout`.
    public static final long OFFSET_layout = LAYOUT.byteOffset(PathElement.groupElement("layout"));
    /// The memory layout of `layout`.
    public static final MemoryLayout LAYOUT_layout = LAYOUT.select(PathElement.groupElement("layout"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));
    /// The byte offset of `set`.
    public static final long OFFSET_set = LAYOUT.byteOffset(PathElement.groupElement("set"));
    /// The memory layout of `set`.
    public static final MemoryLayout LAYOUT_set = LAYOUT.select(PathElement.groupElement("set"));
    /// The [VarHandle] of `set` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_set = LAYOUT.arrayElementVarHandle(PathElement.groupElement("set"));

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT alloc(SegmentAllocator allocator) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public static VkBindDescriptorBufferEmbeddedSamplersInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT copyFrom(VkBindDescriptorBufferEmbeddedSamplersInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT reinterpret(long count) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    public int stageFlags() { return stageFlags(this.segment(), 0L); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stageFlags(MemorySegment segment, long index, int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlags(int value) { stageFlags(this.segment(), 0L, value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long layout(MemorySegment segment, long index) { return (long) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    public long layout() { return layout(this.segment(), 0L); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layout(MemorySegment segment, long index, long value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layout(long value) { layout(this.segment(), 0L, value); return this; }

    /// {@return `set` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int set(MemorySegment segment, long index) { return (int) VH_set.get(segment, 0L, index); }
    /// {@return `set`}
    public int set() { return set(this.segment(), 0L); }
    /// Sets `set` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void set(MemorySegment segment, long index, int value) { VH_set.set(segment, 0L, index, value); }
    /// Sets `set` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT set(int value) { set(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT asSlice(long index) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindDescriptorBufferEmbeddedSamplersInfoEXT`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT asSlice(long index, long count) { return new VkBindDescriptorBufferEmbeddedSamplersInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindDescriptorBufferEmbeddedSamplersInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT at(long index, Consumer<VkBindDescriptorBufferEmbeddedSamplersInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stageFlagsAt(long index) { return stageFlags(this.segment(), index); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT stageFlagsAt(long index, int value) { stageFlags(this.segment(), index, value); return this; }

    /// {@return `layout` at the given index}
    /// @param index the index of the struct buffer
    public long layoutAt(long index) { return layout(this.segment(), index); }
    /// Sets `layout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT layoutAt(long index, long value) { layout(this.segment(), index, value); return this; }

    /// {@return `set` at the given index}
    /// @param index the index of the struct buffer
    public int setAt(long index) { return set(this.segment(), index); }
    /// Sets `set` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindDescriptorBufferEmbeddedSamplersInfoEXT setAt(long index, int value) { set(this.segment(), index, value); return this; }

}
