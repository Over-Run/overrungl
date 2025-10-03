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

/// Represents `VkRenderPassFragmentDensityMapCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkRenderPassFragmentDensityMapCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkAttachmentReference) VkAttachmentReference fragmentDensityMapAttachment;
/// };
/// ```
public final class VkRenderPassFragmentDensityMapCreateInfoEXT extends GroupType {
    /// The struct layout of `VkRenderPassFragmentDensityMapCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkAttachmentReference.LAYOUT.withName("fragmentDensityMapAttachment")
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
    /// The byte offset of `fragmentDensityMapAttachment`.
    public static final long OFFSET_fragmentDensityMapAttachment = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapAttachment"));
    /// The memory layout of `fragmentDensityMapAttachment`.
    public static final MemoryLayout LAYOUT_fragmentDensityMapAttachment = LAYOUT.select(PathElement.groupElement("fragmentDensityMapAttachment"));

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassFragmentDensityMapCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public static VkRenderPassFragmentDensityMapCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT copyFrom(VkRenderPassFragmentDensityMapCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassFragmentDensityMapCreateInfoEXT reinterpret(long count) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassFragmentDensityMapCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassFragmentDensityMapCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMapAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fragmentDensityMapAttachment(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentDensityMapAttachment, index), LAYOUT_fragmentDensityMapAttachment); }
    /// {@return `fragmentDensityMapAttachment`}
    public MemorySegment fragmentDensityMapAttachment() { return fragmentDensityMapAttachment(this.segment(), 0L); }
    /// Sets `fragmentDensityMapAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMapAttachment(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentDensityMapAttachment, index), LAYOUT_fragmentDensityMapAttachment.byteSize()); }
    /// Sets `fragmentDensityMapAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(MemorySegment value) { fragmentDensityMapAttachment(this.segment(), 0L, value); return this; }
    /// Accepts `fragmentDensityMapAttachment` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachment(Consumer<overrungl.vulkan.struct.VkAttachmentReference> func) { func.accept(overrungl.vulkan.struct.VkAttachmentReference.of(fragmentDensityMapAttachment())); return this; }

    /// Creates a slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public VkRenderPassFragmentDensityMapCreateInfoEXT asSlice(long index) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassFragmentDensityMapCreateInfoEXT`
    public VkRenderPassFragmentDensityMapCreateInfoEXT asSlice(long index, long count) { return new VkRenderPassFragmentDensityMapCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassFragmentDensityMapCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT at(long index, Consumer<VkRenderPassFragmentDensityMapCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `fragmentDensityMapAttachment` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment fragmentDensityMapAttachmentAt(long index) { return fragmentDensityMapAttachment(this.segment(), index); }
    /// Sets `fragmentDensityMapAttachment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachmentAt(long index, MemorySegment value) { fragmentDensityMapAttachment(this.segment(), index, value); return this; }
    /// Accepts `fragmentDensityMapAttachment` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRenderPassFragmentDensityMapCreateInfoEXT fragmentDensityMapAttachmentAt(long index, Consumer<overrungl.vulkan.struct.VkAttachmentReference> func) { func.accept(overrungl.vulkan.struct.VkAttachmentReference.of(fragmentDensityMapAttachmentAt(index))); return this; }

}
