// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCopyMemoryToImageIndirectCommandKHR`.
/// ## Layout
/// ```
/// struct VkCopyMemoryToImageIndirectCommandKHR {
///     (uint64_t) VkDeviceAddress srcAddress;
///     uint32_t bufferRowLength;
///     uint32_t bufferImageHeight;
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers imageSubresource;
///     (struct VkOffset3D) VkOffset3D imageOffset;
///     (struct VkExtent3D) VkExtent3D imageExtent;
/// };
/// ```
public final class VkCopyMemoryToImageIndirectCommandKHR extends GroupType {
    /// The struct layout of `VkCopyMemoryToImageIndirectCommandKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
    );
    /// The byte offset of `srcAddress`.
    public static final long OFFSET_srcAddress = LAYOUT.byteOffset(PathElement.groupElement("srcAddress"));
    /// The memory layout of `srcAddress`.
    public static final MemoryLayout LAYOUT_srcAddress = LAYOUT.select(PathElement.groupElement("srcAddress"));
    /// The [VarHandle] of `srcAddress` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_srcAddress = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAddress")));
    /// The byte offset of `bufferRowLength`.
    public static final long OFFSET_bufferRowLength = LAYOUT.byteOffset(PathElement.groupElement("bufferRowLength"));
    /// The memory layout of `bufferRowLength`.
    public static final MemoryLayout LAYOUT_bufferRowLength = LAYOUT.select(PathElement.groupElement("bufferRowLength"));
    /// The [VarHandle] of `bufferRowLength` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_bufferRowLength = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferRowLength")));
    /// The byte offset of `bufferImageHeight`.
    public static final long OFFSET_bufferImageHeight = LAYOUT.byteOffset(PathElement.groupElement("bufferImageHeight"));
    /// The memory layout of `bufferImageHeight`.
    public static final MemoryLayout LAYOUT_bufferImageHeight = LAYOUT.select(PathElement.groupElement("bufferImageHeight"));
    /// The [VarHandle] of `bufferImageHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_bufferImageHeight = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageHeight")));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    /// The byte offset of `imageOffset`.
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    /// The memory layout of `imageOffset`.
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkCopyMemoryToImageIndirectCommandKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCopyMemoryToImageIndirectCommandKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCopyMemoryToImageIndirectCommandKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToImageIndirectCommandKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectCommandKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCopyMemoryToImageIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToImageIndirectCommandKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectCommandKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCopyMemoryToImageIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCopyMemoryToImageIndirectCommandKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCopyMemoryToImageIndirectCommandKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCopyMemoryToImageIndirectCommandKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCopyMemoryToImageIndirectCommandKHR`
    public static VkCopyMemoryToImageIndirectCommandKHR alloc(SegmentAllocator allocator) { return new VkCopyMemoryToImageIndirectCommandKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCopyMemoryToImageIndirectCommandKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCopyMemoryToImageIndirectCommandKHR`
    public static VkCopyMemoryToImageIndirectCommandKHR alloc(SegmentAllocator allocator, long count) { return new VkCopyMemoryToImageIndirectCommandKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR copyFrom(VkCopyMemoryToImageIndirectCommandKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCopyMemoryToImageIndirectCommandKHR reinterpret(long count) { return new VkCopyMemoryToImageIndirectCommandKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `srcAddress` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAddress(MemorySegment segment, long index) { return (long) VH_srcAddress.get().get(segment, 0L, index); }
    /// {@return `srcAddress`}
    public long srcAddress() { return srcAddress(this.segment(), 0L); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAddress(MemorySegment segment, long index, long value) { VH_srcAddress.get().set(segment, 0L, index, value); }
    /// Sets `srcAddress` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR srcAddress(long value) { srcAddress(this.segment(), 0L, value); return this; }

    /// {@return `bufferRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferRowLength(MemorySegment segment, long index) { return (int) VH_bufferRowLength.get().get(segment, 0L, index); }
    /// {@return `bufferRowLength`}
    public int bufferRowLength() { return bufferRowLength(this.segment(), 0L); }
    /// Sets `bufferRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferRowLength(MemorySegment segment, long index, int value) { VH_bufferRowLength.get().set(segment, 0L, index, value); }
    /// Sets `bufferRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR bufferRowLength(int value) { bufferRowLength(this.segment(), 0L, value); return this; }

    /// {@return `bufferImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferImageHeight(MemorySegment segment, long index) { return (int) VH_bufferImageHeight.get().get(segment, 0L, index); }
    /// {@return `bufferImageHeight`}
    public int bufferImageHeight() { return bufferImageHeight(this.segment(), 0L); }
    /// Sets `bufferImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferImageHeight(MemorySegment segment, long index, int value) { VH_bufferImageHeight.get().set(segment, 0L, index, value); }
    /// Sets `bufferImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR bufferImageHeight(int value) { bufferImageHeight(this.segment(), 0L, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    /// {@return `imageSubresource`}
    public MemorySegment imageSubresource() { return imageSubresource(this.segment(), 0L); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageSubresource(MemorySegment value) { imageSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(imageSubresource())); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    /// {@return `imageOffset`}
    public MemorySegment imageOffset() { return imageOffset(this.segment(), 0L); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageOffset(MemorySegment value) { imageOffset(this.segment(), 0L, value); return this; }
    /// Accepts `imageOffset` with the given function.
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageOffset(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(imageOffset())); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    /// {@return `imageExtent`}
    public MemorySegment imageExtent() { return imageExtent(this.segment(), 0L); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageExtent(MemorySegment value) { imageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageExtent(Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(imageExtent())); return this; }

    /// Creates a slice of `VkCopyMemoryToImageIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCopyMemoryToImageIndirectCommandKHR`
    public VkCopyMemoryToImageIndirectCommandKHR asSlice(long index) { return new VkCopyMemoryToImageIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCopyMemoryToImageIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCopyMemoryToImageIndirectCommandKHR`
    public VkCopyMemoryToImageIndirectCommandKHR asSlice(long index, long count) { return new VkCopyMemoryToImageIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCopyMemoryToImageIndirectCommandKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR at(long index, Consumer<VkCopyMemoryToImageIndirectCommandKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `srcAddress` at the given index}
    /// @param index the index of the struct buffer
    public long srcAddressAt(long index) { return srcAddress(this.segment(), index); }
    /// Sets `srcAddress` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR srcAddressAt(long index, long value) { srcAddress(this.segment(), index, value); return this; }

    /// {@return `bufferRowLength` at the given index}
    /// @param index the index of the struct buffer
    public int bufferRowLengthAt(long index) { return bufferRowLength(this.segment(), index); }
    /// Sets `bufferRowLength` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR bufferRowLengthAt(long index, int value) { bufferRowLength(this.segment(), index, value); return this; }

    /// {@return `bufferImageHeight` at the given index}
    /// @param index the index of the struct buffer
    public int bufferImageHeightAt(long index) { return bufferImageHeight(this.segment(), index); }
    /// Sets `bufferImageHeight` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR bufferImageHeightAt(long index, int value) { bufferImageHeight(this.segment(), index, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageSubresourceAt(long index) { return imageSubresource(this.segment(), index); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageSubresourceAt(long index, MemorySegment value) { imageSubresource(this.segment(), index, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(imageSubresourceAt(index))); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageOffsetAt(long index) { return imageOffset(this.segment(), index); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageOffsetAt(long index, MemorySegment value) { imageOffset(this.segment(), index, value); return this; }
    /// Accepts `imageOffset` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageOffsetAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(imageOffsetAt(index))); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageExtentAt(long index) { return imageExtent(this.segment(), index); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageExtentAt(long index, MemorySegment value) { imageExtent(this.segment(), index, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkCopyMemoryToImageIndirectCommandKHR imageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(imageExtentAt(index))); return this; }

}
