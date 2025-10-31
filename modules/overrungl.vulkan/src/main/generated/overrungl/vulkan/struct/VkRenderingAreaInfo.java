// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderingAreaInfo`.
/// ## Layout
/// ```
/// struct VkRenderingAreaInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkFormat* pColorAttachmentFormats;
///     (int) VkFormat depthAttachmentFormat;
///     (int) VkFormat stencilAttachmentFormat;
/// };
/// ```
public final class VkRenderingAreaInfo extends GroupType {
    /// The struct layout of `VkRenderingAreaInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withName("pColorAttachmentFormats"),
        ValueLayout.JAVA_INT.withName("depthAttachmentFormat"),
        ValueLayout.JAVA_INT.withName("stencilAttachmentFormat")
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
    /// The byte offset of `viewMask`.
    public static final long OFFSET_viewMask = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
    /// The memory layout of `viewMask`.
    public static final MemoryLayout LAYOUT_viewMask = LAYOUT.select(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_viewMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask"));
    /// The byte offset of `colorAttachmentCount`.
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    /// The memory layout of `colorAttachmentCount`.
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_colorAttachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount"));
    /// The byte offset of `pColorAttachmentFormats`.
    public static final long OFFSET_pColorAttachmentFormats = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
    /// The memory layout of `pColorAttachmentFormats`.
    public static final MemoryLayout LAYOUT_pColorAttachmentFormats = LAYOUT.select(PathElement.groupElement("pColorAttachmentFormats"));
    /// The [VarHandle] of `pColorAttachmentFormats` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pColorAttachmentFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentFormats"));
    /// The byte offset of `depthAttachmentFormat`.
    public static final long OFFSET_depthAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
    /// The memory layout of `depthAttachmentFormat`.
    public static final MemoryLayout LAYOUT_depthAttachmentFormat = LAYOUT.select(PathElement.groupElement("depthAttachmentFormat"));
    /// The [VarHandle] of `depthAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthAttachmentFormat"));
    /// The byte offset of `stencilAttachmentFormat`.
    public static final long OFFSET_stencilAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
    /// The memory layout of `stencilAttachmentFormat`.
    public static final MemoryLayout LAYOUT_stencilAttachmentFormat = LAYOUT.select(PathElement.groupElement("stencilAttachmentFormat"));
    /// The [VarHandle] of `stencilAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilAttachmentFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilAttachmentFormat"));

    /// Creates `VkRenderingAreaInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderingAreaInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderingAreaInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAreaInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingAreaInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAreaInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderingAreaInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAreaInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAreaInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderingAreaInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingAreaInfo`
    public static VkRenderingAreaInfo alloc(SegmentAllocator allocator) { return new VkRenderingAreaInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderingAreaInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingAreaInfo`
    public static VkRenderingAreaInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAreaInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingAreaInfo copyFrom(VkRenderingAreaInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderingAreaInfo reinterpret(long count) { return new VkRenderingAreaInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderingAreaInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderingAreaInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get(segment, 0L, index); }
    /// {@return `viewMask`}
    public int viewMask() { return viewMask(this.segment(), 0L); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewMask(MemorySegment segment, long index, int value) { VH_viewMask.set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo viewMask(int value) { viewMask(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    public int colorAttachmentCount() { return colorAttachmentCount(this.segment(), 0L); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachmentCount(MemorySegment segment, long index, int value) { VH_colorAttachmentCount.set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo colorAttachmentCount(int value) { colorAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorAttachmentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorAttachmentFormats(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachmentFormats.get(segment, 0L, index); }
    /// {@return `pColorAttachmentFormats`}
    public MemorySegment pColorAttachmentFormats() { return pColorAttachmentFormats(this.segment(), 0L); }
    /// Sets `pColorAttachmentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorAttachmentFormats(MemorySegment segment, long index, MemorySegment value) { VH_pColorAttachmentFormats.set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pColorAttachmentFormats(MemorySegment value) { pColorAttachmentFormats(this.segment(), 0L, value); return this; }

    /// {@return `depthAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthAttachmentFormat(MemorySegment segment, long index) { return (int) VH_depthAttachmentFormat.get(segment, 0L, index); }
    /// {@return `depthAttachmentFormat`}
    public int depthAttachmentFormat() { return depthAttachmentFormat(this.segment(), 0L); }
    /// Sets `depthAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthAttachmentFormat(MemorySegment segment, long index, int value) { VH_depthAttachmentFormat.set(segment, 0L, index, value); }
    /// Sets `depthAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo depthAttachmentFormat(int value) { depthAttachmentFormat(this.segment(), 0L, value); return this; }

    /// {@return `stencilAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilAttachmentFormat(MemorySegment segment, long index) { return (int) VH_stencilAttachmentFormat.get(segment, 0L, index); }
    /// {@return `stencilAttachmentFormat`}
    public int stencilAttachmentFormat() { return stencilAttachmentFormat(this.segment(), 0L); }
    /// Sets `stencilAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilAttachmentFormat(MemorySegment segment, long index, int value) { VH_stencilAttachmentFormat.set(segment, 0L, index, value); }
    /// Sets `stencilAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo stencilAttachmentFormat(int value) { stencilAttachmentFormat(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRenderingAreaInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingAreaInfo`
    public VkRenderingAreaInfo asSlice(long index) { return new VkRenderingAreaInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderingAreaInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingAreaInfo`
    public VkRenderingAreaInfo asSlice(long index, long count) { return new VkRenderingAreaInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderingAreaInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderingAreaInfo at(long index, Consumer<VkRenderingAreaInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param index the index of the struct buffer
    public int viewMaskAt(long index) { return viewMask(this.segment(), index); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo viewMaskAt(long index, int value) { viewMask(this.segment(), index, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int colorAttachmentCountAt(long index) { return colorAttachmentCount(this.segment(), index); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo colorAttachmentCountAt(long index, int value) { colorAttachmentCount(this.segment(), index, value); return this; }

    /// {@return `pColorAttachmentFormats` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pColorAttachmentFormatsAt(long index) { return pColorAttachmentFormats(this.segment(), index); }
    /// Sets `pColorAttachmentFormats` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo pColorAttachmentFormatsAt(long index, MemorySegment value) { pColorAttachmentFormats(this.segment(), index, value); return this; }

    /// {@return `depthAttachmentFormat` at the given index}
    /// @param index the index of the struct buffer
    public int depthAttachmentFormatAt(long index) { return depthAttachmentFormat(this.segment(), index); }
    /// Sets `depthAttachmentFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo depthAttachmentFormatAt(long index, int value) { depthAttachmentFormat(this.segment(), index, value); return this; }

    /// {@return `stencilAttachmentFormat` at the given index}
    /// @param index the index of the struct buffer
    public int stencilAttachmentFormatAt(long index) { return stencilAttachmentFormat(this.segment(), index); }
    /// Sets `stencilAttachmentFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAreaInfo stencilAttachmentFormatAt(long index, int value) { stencilAttachmentFormat(this.segment(), index, value); return this; }

}
