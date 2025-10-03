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

/// Represents `VkImportMetalTextureInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMetalTextureInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkImageAspectFlagBits plane;
///     (void*) MTLTexture_id mtlTexture;
/// };
/// ```
public final class VkImportMetalTextureInfoEXT extends GroupType {
    /// The struct layout of `VkImportMetalTextureInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("plane"),
        ValueLayout.ADDRESS.withName("mtlTexture")
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
    /// The byte offset of `plane`.
    public static final long OFFSET_plane = LAYOUT.byteOffset(PathElement.groupElement("plane"));
    /// The memory layout of `plane`.
    public static final MemoryLayout LAYOUT_plane = LAYOUT.select(PathElement.groupElement("plane"));
    /// The [VarHandle] of `plane` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_plane = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("plane")));
    /// The byte offset of `mtlTexture`.
    public static final long OFFSET_mtlTexture = LAYOUT.byteOffset(PathElement.groupElement("mtlTexture"));
    /// The memory layout of `mtlTexture`.
    public static final MemoryLayout LAYOUT_mtlTexture = LAYOUT.select(PathElement.groupElement("mtlTexture"));
    /// The [VarHandle] of `mtlTexture` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_mtlTexture = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlTexture")));

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImportMetalTextureInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalTextureInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalTextureInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImportMetalTextureInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalTextureInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalTextureInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImportMetalTextureInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalTextureInfoEXT`
    public static VkImportMetalTextureInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalTextureInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImportMetalTextureInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalTextureInfoEXT`
    public static VkImportMetalTextureInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalTextureInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMetalTextureInfoEXT copyFrom(VkImportMetalTextureInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImportMetalTextureInfoEXT reinterpret(long count) { return new VkImportMetalTextureInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImportMetalTextureInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportMetalTextureInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `plane` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int plane(MemorySegment segment, long index) { return (int) VH_plane.get().get(segment, 0L, index); }
    /// {@return `plane`}
    public int plane() { return plane(this.segment(), 0L); }
    /// Sets `plane` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void plane(MemorySegment segment, long index, int value) { VH_plane.get().set(segment, 0L, index, value); }
    /// Sets `plane` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT plane(int value) { plane(this.segment(), 0L, value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment mtlTexture(MemorySegment segment, long index) { return (MemorySegment) VH_mtlTexture.get().get(segment, 0L, index); }
    /// {@return `mtlTexture`}
    public MemorySegment mtlTexture() { return mtlTexture(this.segment(), 0L); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mtlTexture(MemorySegment segment, long index, MemorySegment value) { VH_mtlTexture.get().set(segment, 0L, index, value); }
    /// Sets `mtlTexture` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT mtlTexture(MemorySegment value) { mtlTexture(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImportMetalTextureInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImportMetalTextureInfoEXT`
    public VkImportMetalTextureInfoEXT asSlice(long index) { return new VkImportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImportMetalTextureInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImportMetalTextureInfoEXT`
    public VkImportMetalTextureInfoEXT asSlice(long index, long count) { return new VkImportMetalTextureInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImportMetalTextureInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImportMetalTextureInfoEXT at(long index, Consumer<VkImportMetalTextureInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `plane` at the given index}
    /// @param index the index of the struct buffer
    public int planeAt(long index) { return plane(this.segment(), index); }
    /// Sets `plane` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT planeAt(long index, int value) { plane(this.segment(), index, value); return this; }

    /// {@return `mtlTexture` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment mtlTextureAt(long index) { return mtlTexture(this.segment(), index); }
    /// Sets `mtlTexture` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalTextureInfoEXT mtlTextureAt(long index, MemorySegment value) { mtlTexture(this.segment(), index, value); return this; }

}
