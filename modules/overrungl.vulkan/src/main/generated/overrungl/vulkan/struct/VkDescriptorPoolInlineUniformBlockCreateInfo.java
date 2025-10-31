// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorPoolInlineUniformBlockCreateInfo`.
/// ## Layout
/// ```
/// struct VkDescriptorPoolInlineUniformBlockCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t maxInlineUniformBlockBindings;
/// };
/// ```
public final class VkDescriptorPoolInlineUniformBlockCreateInfo extends GroupType {
    /// The struct layout of `VkDescriptorPoolInlineUniformBlockCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockBindings")
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
    /// The byte offset of `maxInlineUniformBlockBindings`.
    public static final long OFFSET_maxInlineUniformBlockBindings = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockBindings"));
    /// The memory layout of `maxInlineUniformBlockBindings`.
    public static final MemoryLayout LAYOUT_maxInlineUniformBlockBindings = LAYOUT.select(PathElement.groupElement("maxInlineUniformBlockBindings"));
    /// The [VarHandle] of `maxInlineUniformBlockBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxInlineUniformBlockBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockBindings"));

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolInlineUniformBlockCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo alloc(SegmentAllocator allocator) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorPoolInlineUniformBlockCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public static VkDescriptorPoolInlineUniformBlockCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo copyFrom(VkDescriptorPoolInlineUniformBlockCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorPoolInlineUniformBlockCreateInfo reinterpret(long count) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorPoolInlineUniformBlockCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxInlineUniformBlockBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxInlineUniformBlockBindings(MemorySegment segment, long index) { return (int) VH_maxInlineUniformBlockBindings.get(segment, 0L, index); }
    /// {@return `maxInlineUniformBlockBindings`}
    public int maxInlineUniformBlockBindings() { return maxInlineUniformBlockBindings(this.segment(), 0L); }
    /// Sets `maxInlineUniformBlockBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInlineUniformBlockBindings(MemorySegment segment, long index, int value) { VH_maxInlineUniformBlockBindings.set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformBlockBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindings(int value) { maxInlineUniformBlockBindings(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public VkDescriptorPoolInlineUniformBlockCreateInfo asSlice(long index) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorPoolInlineUniformBlockCreateInfo`
    public VkDescriptorPoolInlineUniformBlockCreateInfo asSlice(long index, long count) { return new VkDescriptorPoolInlineUniformBlockCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorPoolInlineUniformBlockCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo at(long index, Consumer<VkDescriptorPoolInlineUniformBlockCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxInlineUniformBlockBindings` at the given index}
    /// @param index the index of the struct buffer
    public int maxInlineUniformBlockBindingsAt(long index) { return maxInlineUniformBlockBindings(this.segment(), index); }
    /// Sets `maxInlineUniformBlockBindings` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorPoolInlineUniformBlockCreateInfo maxInlineUniformBlockBindingsAt(long index, int value) { maxInlineUniformBlockBindings(this.segment(), index, value); return this; }

}
