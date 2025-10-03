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

/// Represents `VkSubpassDescriptionDepthStencilResolve`.
/// ## Layout
/// ```
/// struct VkSubpassDescriptionDepthStencilResolve {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkResolveModeFlagBits depthResolveMode;
///     (int) VkResolveModeFlagBits stencilResolveMode;
///     const VkAttachmentReference2* pDepthStencilResolveAttachment;
/// };
/// ```
public final class VkSubpassDescriptionDepthStencilResolve extends GroupType {
    /// The struct layout of `VkSubpassDescriptionDepthStencilResolve`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthResolveMode"),
        ValueLayout.JAVA_INT.withName("stencilResolveMode"),
        ValueLayout.ADDRESS.withName("pDepthStencilResolveAttachment")
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
    /// The byte offset of `depthResolveMode`.
    public static final long OFFSET_depthResolveMode = LAYOUT.byteOffset(PathElement.groupElement("depthResolveMode"));
    /// The memory layout of `depthResolveMode`.
    public static final MemoryLayout LAYOUT_depthResolveMode = LAYOUT.select(PathElement.groupElement("depthResolveMode"));
    /// The [VarHandle] of `depthResolveMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthResolveMode"));
    /// The byte offset of `stencilResolveMode`.
    public static final long OFFSET_stencilResolveMode = LAYOUT.byteOffset(PathElement.groupElement("stencilResolveMode"));
    /// The memory layout of `stencilResolveMode`.
    public static final MemoryLayout LAYOUT_stencilResolveMode = LAYOUT.select(PathElement.groupElement("stencilResolveMode"));
    /// The [VarHandle] of `stencilResolveMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilResolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilResolveMode"));
    /// The byte offset of `pDepthStencilResolveAttachment`.
    public static final long OFFSET_pDepthStencilResolveAttachment = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilResolveAttachment"));
    /// The memory layout of `pDepthStencilResolveAttachment`.
    public static final MemoryLayout LAYOUT_pDepthStencilResolveAttachment = LAYOUT.select(PathElement.groupElement("pDepthStencilResolveAttachment"));
    /// The [VarHandle] of `pDepthStencilResolveAttachment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDepthStencilResolveAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDepthStencilResolveAttachment"));

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSubpassDescriptionDepthStencilResolve(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescriptionDepthStencilResolve of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolve(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescriptionDepthStencilResolve ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolve(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSubpassDescriptionDepthStencilResolve` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassDescriptionDepthStencilResolve ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSubpassDescriptionDepthStencilResolve(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSubpassDescriptionDepthStencilResolve` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassDescriptionDepthStencilResolve`
    public static VkSubpassDescriptionDepthStencilResolve alloc(SegmentAllocator allocator) { return new VkSubpassDescriptionDepthStencilResolve(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSubpassDescriptionDepthStencilResolve` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassDescriptionDepthStencilResolve`
    public static VkSubpassDescriptionDepthStencilResolve alloc(SegmentAllocator allocator, long count) { return new VkSubpassDescriptionDepthStencilResolve(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve copyFrom(VkSubpassDescriptionDepthStencilResolve src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSubpassDescriptionDepthStencilResolve reinterpret(long count) { return new VkSubpassDescriptionDepthStencilResolve(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSubpassDescriptionDepthStencilResolve sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSubpassDescriptionDepthStencilResolve pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `depthResolveMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthResolveMode(MemorySegment segment, long index) { return (int) VH_depthResolveMode.get(segment, 0L, index); }
    /// {@return `depthResolveMode`}
    public int depthResolveMode() { return depthResolveMode(this.segment(), 0L); }
    /// Sets `depthResolveMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthResolveMode(MemorySegment segment, long index, int value) { VH_depthResolveMode.set(segment, 0L, index, value); }
    /// Sets `depthResolveMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve depthResolveMode(int value) { depthResolveMode(this.segment(), 0L, value); return this; }

    /// {@return `stencilResolveMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilResolveMode(MemorySegment segment, long index) { return (int) VH_stencilResolveMode.get(segment, 0L, index); }
    /// {@return `stencilResolveMode`}
    public int stencilResolveMode() { return stencilResolveMode(this.segment(), 0L); }
    /// Sets `stencilResolveMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilResolveMode(MemorySegment segment, long index, int value) { VH_stencilResolveMode.set(segment, 0L, index, value); }
    /// Sets `stencilResolveMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve stencilResolveMode(int value) { stencilResolveMode(this.segment(), 0L, value); return this; }

    /// {@return `pDepthStencilResolveAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDepthStencilResolveAttachment(MemorySegment segment, long index) { return (MemorySegment) VH_pDepthStencilResolveAttachment.get(segment, 0L, index); }
    /// {@return `pDepthStencilResolveAttachment`}
    public MemorySegment pDepthStencilResolveAttachment() { return pDepthStencilResolveAttachment(this.segment(), 0L); }
    /// Sets `pDepthStencilResolveAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDepthStencilResolveAttachment(MemorySegment segment, long index, MemorySegment value) { VH_pDepthStencilResolveAttachment.set(segment, 0L, index, value); }
    /// Sets `pDepthStencilResolveAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(MemorySegment value) { pDepthStencilResolveAttachment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSubpassDescriptionDepthStencilResolve`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSubpassDescriptionDepthStencilResolve`
    public VkSubpassDescriptionDepthStencilResolve asSlice(long index) { return new VkSubpassDescriptionDepthStencilResolve(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSubpassDescriptionDepthStencilResolve`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSubpassDescriptionDepthStencilResolve`
    public VkSubpassDescriptionDepthStencilResolve asSlice(long index, long count) { return new VkSubpassDescriptionDepthStencilResolve(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSubpassDescriptionDepthStencilResolve` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve at(long index, Consumer<VkSubpassDescriptionDepthStencilResolve> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `depthResolveMode` at the given index}
    /// @param index the index of the struct buffer
    public int depthResolveModeAt(long index) { return depthResolveMode(this.segment(), index); }
    /// Sets `depthResolveMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve depthResolveModeAt(long index, int value) { depthResolveMode(this.segment(), index, value); return this; }

    /// {@return `stencilResolveMode` at the given index}
    /// @param index the index of the struct buffer
    public int stencilResolveModeAt(long index) { return stencilResolveMode(this.segment(), index); }
    /// Sets `stencilResolveMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve stencilResolveModeAt(long index, int value) { stencilResolveMode(this.segment(), index, value); return this; }

    /// {@return `pDepthStencilResolveAttachment` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDepthStencilResolveAttachmentAt(long index) { return pDepthStencilResolveAttachment(this.segment(), index); }
    /// Sets `pDepthStencilResolveAttachment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachmentAt(long index, MemorySegment value) { pDepthStencilResolveAttachment(this.segment(), index, value); return this; }

}
