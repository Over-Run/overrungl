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

/// Represents `VkImageSubresource`.
/// ## Layout
/// ```
/// struct VkImageSubresource {
///     ((uint32_t) VkFlags) VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t arrayLayer;
/// };
/// ```
public final class VkImageSubresource extends GroupType {
    /// The struct layout of `VkImageSubresource`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("arrayLayer")
    );
    /// The byte offset of `aspectMask`.
    public static final long OFFSET_aspectMask = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
    /// The memory layout of `aspectMask`.
    public static final MemoryLayout LAYOUT_aspectMask = LAYOUT.select(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_aspectMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask")));
    /// The byte offset of `mipLevel`.
    public static final long OFFSET_mipLevel = LAYOUT.byteOffset(PathElement.groupElement("mipLevel"));
    /// The memory layout of `mipLevel`.
    public static final MemoryLayout LAYOUT_mipLevel = LAYOUT.select(PathElement.groupElement("mipLevel"));
    /// The [VarHandle] of `mipLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_mipLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevel")));
    /// The byte offset of `arrayLayer`.
    public static final long OFFSET_arrayLayer = LAYOUT.byteOffset(PathElement.groupElement("arrayLayer"));
    /// The memory layout of `arrayLayer`.
    public static final MemoryLayout LAYOUT_arrayLayer = LAYOUT.select(PathElement.groupElement("arrayLayer"));
    /// The [VarHandle] of `arrayLayer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_arrayLayer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayer")));

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageSubresource(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageSubresource` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSubresource` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageSubresource` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageSubresource` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource alloc(SegmentAllocator allocator) { return new VkImageSubresource(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageSubresource` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresource`
    public static VkImageSubresource alloc(SegmentAllocator allocator, long count) { return new VkImageSubresource(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSubresource copyFrom(VkImageSubresource src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageSubresource reinterpret(long count) { return new VkImageSubresource(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get().get(segment, 0L, index); }
    /// {@return `aspectMask`}
    public int aspectMask() { return aspectMask(this.segment(), 0L); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void aspectMask(MemorySegment segment, long index, int value) { VH_aspectMask.get().set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource aspectMask(int value) { aspectMask(this.segment(), 0L, value); return this; }

    /// {@return `mipLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mipLevel(MemorySegment segment, long index) { return (int) VH_mipLevel.get().get(segment, 0L, index); }
    /// {@return `mipLevel`}
    public int mipLevel() { return mipLevel(this.segment(), 0L); }
    /// Sets `mipLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mipLevel(MemorySegment segment, long index, int value) { VH_mipLevel.get().set(segment, 0L, index, value); }
    /// Sets `mipLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource mipLevel(int value) { mipLevel(this.segment(), 0L, value); return this; }

    /// {@return `arrayLayer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int arrayLayer(MemorySegment segment, long index) { return (int) VH_arrayLayer.get().get(segment, 0L, index); }
    /// {@return `arrayLayer`}
    public int arrayLayer() { return arrayLayer(this.segment(), 0L); }
    /// Sets `arrayLayer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayLayer(MemorySegment segment, long index, int value) { VH_arrayLayer.get().set(segment, 0L, index, value); }
    /// Sets `arrayLayer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource arrayLayer(int value) { arrayLayer(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageSubresource`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageSubresource`
    public VkImageSubresource asSlice(long index) { return new VkImageSubresource(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageSubresource`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageSubresource`
    public VkImageSubresource asSlice(long index, long count) { return new VkImageSubresource(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageSubresource` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageSubresource at(long index, Consumer<VkImageSubresource> func) { func.accept(asSlice(index)); return this; }

    /// {@return `aspectMask` at the given index}
    /// @param index the index of the struct buffer
    public int aspectMaskAt(long index) { return aspectMask(this.segment(), index); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresource aspectMaskAt(long index, int value) { aspectMask(this.segment(), index, value); return this; }

    /// {@return `mipLevel` at the given index}
    /// @param index the index of the struct buffer
    public int mipLevelAt(long index) { return mipLevel(this.segment(), index); }
    /// Sets `mipLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresource mipLevelAt(long index, int value) { mipLevel(this.segment(), index, value); return this; }

    /// {@return `arrayLayer` at the given index}
    /// @param index the index of the struct buffer
    public int arrayLayerAt(long index) { return arrayLayer(this.segment(), index); }
    /// Sets `arrayLayer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresource arrayLayerAt(long index, int value) { arrayLayer(this.segment(), index, value); return this; }

}
