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

/// Represents `VkPipelineRenderingCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineRenderingCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount;
///     const VkFormat* pColorAttachmentFormats;
///     (int) VkFormat depthAttachmentFormat;
///     (int) VkFormat stencilAttachmentFormat;
/// };
/// ```
public final class VkPipelineRenderingCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineRenderingCreateInfo`.
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
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `viewMask`.
    public static final long OFFSET_viewMask = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
    /// The memory layout of `viewMask`.
    public static final MemoryLayout LAYOUT_viewMask = LAYOUT.select(PathElement.groupElement("viewMask"));
    /// The [VarHandle] of `viewMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_viewMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewMask")));
    /// The byte offset of `colorAttachmentCount`.
    public static final long OFFSET_colorAttachmentCount = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
    /// The memory layout of `colorAttachmentCount`.
    public static final MemoryLayout LAYOUT_colorAttachmentCount = LAYOUT.select(PathElement.groupElement("colorAttachmentCount"));
    /// The [VarHandle] of `colorAttachmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_colorAttachmentCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachmentCount")));
    /// The byte offset of `pColorAttachmentFormats`.
    public static final long OFFSET_pColorAttachmentFormats = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachmentFormats"));
    /// The memory layout of `pColorAttachmentFormats`.
    public static final MemoryLayout LAYOUT_pColorAttachmentFormats = LAYOUT.select(PathElement.groupElement("pColorAttachmentFormats"));
    /// The [VarHandle] of `pColorAttachmentFormats` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pColorAttachmentFormats = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pColorAttachmentFormats")));
    /// The byte offset of `depthAttachmentFormat`.
    public static final long OFFSET_depthAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("depthAttachmentFormat"));
    /// The memory layout of `depthAttachmentFormat`.
    public static final MemoryLayout LAYOUT_depthAttachmentFormat = LAYOUT.select(PathElement.groupElement("depthAttachmentFormat"));
    /// The [VarHandle] of `depthAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_depthAttachmentFormat = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthAttachmentFormat")));
    /// The byte offset of `stencilAttachmentFormat`.
    public static final long OFFSET_stencilAttachmentFormat = LAYOUT.byteOffset(PathElement.groupElement("stencilAttachmentFormat"));
    /// The memory layout of `stencilAttachmentFormat`.
    public static final MemoryLayout LAYOUT_stencilAttachmentFormat = LAYOUT.select(PathElement.groupElement("stencilAttachmentFormat"));
    /// The [VarHandle] of `stencilAttachmentFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stencilAttachmentFormat = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilAttachmentFormat")));

    /// Creates `VkPipelineRenderingCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineRenderingCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineRenderingCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRenderingCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRenderingCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRenderingCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRenderingCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRenderingCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineRenderingCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRenderingCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRenderingCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineRenderingCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRenderingCreateInfo`
    public static VkPipelineRenderingCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRenderingCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineRenderingCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRenderingCreateInfo`
    public static VkPipelineRenderingCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRenderingCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRenderingCreateInfo copyFrom(VkPipelineRenderingCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineRenderingCreateInfo reinterpret(long count) { return new VkPipelineRenderingCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineRenderingCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineRenderingCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewMask(MemorySegment segment, long index) { return (int) VH_viewMask.get().get(segment, 0L, index); }
    /// {@return `viewMask`}
    public int viewMask() { return viewMask(this.segment(), 0L); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewMask(MemorySegment segment, long index, int value) { VH_viewMask.get().set(segment, 0L, index, value); }
    /// Sets `viewMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo viewMask(int value) { viewMask(this.segment(), 0L, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int colorAttachmentCount(MemorySegment segment, long index) { return (int) VH_colorAttachmentCount.get().get(segment, 0L, index); }
    /// {@return `colorAttachmentCount`}
    public int colorAttachmentCount() { return colorAttachmentCount(this.segment(), 0L); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void colorAttachmentCount(MemorySegment segment, long index, int value) { VH_colorAttachmentCount.get().set(segment, 0L, index, value); }
    /// Sets `colorAttachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo colorAttachmentCount(int value) { colorAttachmentCount(this.segment(), 0L, value); return this; }

    /// {@return `pColorAttachmentFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pColorAttachmentFormats(MemorySegment segment, long index) { return (MemorySegment) VH_pColorAttachmentFormats.get().get(segment, 0L, index); }
    /// {@return `pColorAttachmentFormats`}
    public MemorySegment pColorAttachmentFormats() { return pColorAttachmentFormats(this.segment(), 0L); }
    /// Sets `pColorAttachmentFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pColorAttachmentFormats(MemorySegment segment, long index, MemorySegment value) { VH_pColorAttachmentFormats.get().set(segment, 0L, index, value); }
    /// Sets `pColorAttachmentFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo pColorAttachmentFormats(MemorySegment value) { pColorAttachmentFormats(this.segment(), 0L, value); return this; }

    /// {@return `depthAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthAttachmentFormat(MemorySegment segment, long index) { return (int) VH_depthAttachmentFormat.get().get(segment, 0L, index); }
    /// {@return `depthAttachmentFormat`}
    public int depthAttachmentFormat() { return depthAttachmentFormat(this.segment(), 0L); }
    /// Sets `depthAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthAttachmentFormat(MemorySegment segment, long index, int value) { VH_depthAttachmentFormat.get().set(segment, 0L, index, value); }
    /// Sets `depthAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo depthAttachmentFormat(int value) { depthAttachmentFormat(this.segment(), 0L, value); return this; }

    /// {@return `stencilAttachmentFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilAttachmentFormat(MemorySegment segment, long index) { return (int) VH_stencilAttachmentFormat.get().get(segment, 0L, index); }
    /// {@return `stencilAttachmentFormat`}
    public int stencilAttachmentFormat() { return stencilAttachmentFormat(this.segment(), 0L); }
    /// Sets `stencilAttachmentFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilAttachmentFormat(MemorySegment segment, long index, int value) { VH_stencilAttachmentFormat.get().set(segment, 0L, index, value); }
    /// Sets `stencilAttachmentFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo stencilAttachmentFormat(int value) { stencilAttachmentFormat(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineRenderingCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRenderingCreateInfo`
    public VkPipelineRenderingCreateInfo asSlice(long index) { return new VkPipelineRenderingCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineRenderingCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRenderingCreateInfo`
    public VkPipelineRenderingCreateInfo asSlice(long index, long count) { return new VkPipelineRenderingCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineRenderingCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineRenderingCreateInfo at(long index, Consumer<VkPipelineRenderingCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `viewMask` at the given index}
    /// @param index the index of the struct buffer
    public int viewMaskAt(long index) { return viewMask(this.segment(), index); }
    /// Sets `viewMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo viewMaskAt(long index, int value) { viewMask(this.segment(), index, value); return this; }

    /// {@return `colorAttachmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int colorAttachmentCountAt(long index) { return colorAttachmentCount(this.segment(), index); }
    /// Sets `colorAttachmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo colorAttachmentCountAt(long index, int value) { colorAttachmentCount(this.segment(), index, value); return this; }

    /// {@return `pColorAttachmentFormats` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pColorAttachmentFormatsAt(long index) { return pColorAttachmentFormats(this.segment(), index); }
    /// Sets `pColorAttachmentFormats` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo pColorAttachmentFormatsAt(long index, MemorySegment value) { pColorAttachmentFormats(this.segment(), index, value); return this; }

    /// {@return `depthAttachmentFormat` at the given index}
    /// @param index the index of the struct buffer
    public int depthAttachmentFormatAt(long index) { return depthAttachmentFormat(this.segment(), index); }
    /// Sets `depthAttachmentFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo depthAttachmentFormatAt(long index, int value) { depthAttachmentFormat(this.segment(), index, value); return this; }

    /// {@return `stencilAttachmentFormat` at the given index}
    /// @param index the index of the struct buffer
    public int stencilAttachmentFormatAt(long index) { return stencilAttachmentFormat(this.segment(), index); }
    /// Sets `stencilAttachmentFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRenderingCreateInfo stencilAttachmentFormatAt(long index, int value) { stencilAttachmentFormat(this.segment(), index, value); return this; }

}
