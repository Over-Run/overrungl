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

/// Represents `VkImageFormatProperties`.
/// ## Layout
/// ```
/// struct VkImageFormatProperties {
///     (struct VkExtent3D) VkExtent3D maxExtent;
///     uint32_t maxMipLevels;
///     uint32_t maxArrayLayers;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampleCounts;
///     (uint64_t) VkDeviceSize maxResourceSize;
/// };
/// ```
public final class VkImageFormatProperties extends GroupType {
    /// The struct layout of `VkImageFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );
    /// The byte offset of `maxExtent`.
    public static final long OFFSET_maxExtent = LAYOUT.byteOffset(PathElement.groupElement("maxExtent"));
    /// The memory layout of `maxExtent`.
    public static final MemoryLayout LAYOUT_maxExtent = LAYOUT.select(PathElement.groupElement("maxExtent"));
    /// The byte offset of `maxMipLevels`.
    public static final long OFFSET_maxMipLevels = LAYOUT.byteOffset(PathElement.groupElement("maxMipLevels"));
    /// The memory layout of `maxMipLevels`.
    public static final MemoryLayout LAYOUT_maxMipLevels = LAYOUT.select(PathElement.groupElement("maxMipLevels"));
    /// The [VarHandle] of `maxMipLevels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxMipLevels = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMipLevels")));
    /// The byte offset of `maxArrayLayers`.
    public static final long OFFSET_maxArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxArrayLayers"));
    /// The memory layout of `maxArrayLayers`.
    public static final MemoryLayout LAYOUT_maxArrayLayers = LAYOUT.select(PathElement.groupElement("maxArrayLayers"));
    /// The [VarHandle] of `maxArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxArrayLayers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxArrayLayers")));
    /// The byte offset of `sampleCounts`.
    public static final long OFFSET_sampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
    /// The memory layout of `sampleCounts`.
    public static final MemoryLayout LAYOUT_sampleCounts = LAYOUT.select(PathElement.groupElement("sampleCounts"));
    /// The [VarHandle] of `sampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts")));
    /// The byte offset of `maxResourceSize`.
    public static final long OFFSET_maxResourceSize = LAYOUT.byteOffset(PathElement.groupElement("maxResourceSize"));
    /// The memory layout of `maxResourceSize`.
    public static final MemoryLayout LAYOUT_maxResourceSize = LAYOUT.select(PathElement.groupElement("maxResourceSize"));
    /// The [VarHandle] of `maxResourceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxResourceSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxResourceSize")));

    /// Creates `VkImageFormatProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageFormatProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageFormatProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatProperties`
    public static VkImageFormatProperties alloc(SegmentAllocator allocator) { return new VkImageFormatProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatProperties`
    public static VkImageFormatProperties alloc(SegmentAllocator allocator, long count) { return new VkImageFormatProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageFormatProperties copyFrom(VkImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageFormatProperties reinterpret(long count) { return new VkImageFormatProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `maxExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxExtent, index), LAYOUT_maxExtent); }
    /// {@return `maxExtent`}
    public MemorySegment maxExtent() { return maxExtent(this.segment(), 0L); }
    /// Sets `maxExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxExtent, index), LAYOUT_maxExtent.byteSize()); }
    /// Sets `maxExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxExtent(MemorySegment value) { maxExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageFormatProperties maxExtent(Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(maxExtent())); return this; }

    /// {@return `maxMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMipLevels(MemorySegment segment, long index) { return (int) VH_maxMipLevels.get().get(segment, 0L, index); }
    /// {@return `maxMipLevels`}
    public int maxMipLevels() { return maxMipLevels(this.segment(), 0L); }
    /// Sets `maxMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMipLevels(MemorySegment segment, long index, int value) { VH_maxMipLevels.get().set(segment, 0L, index, value); }
    /// Sets `maxMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxMipLevels(int value) { maxMipLevels(this.segment(), 0L, value); return this; }

    /// {@return `maxArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxArrayLayers(MemorySegment segment, long index) { return (int) VH_maxArrayLayers.get().get(segment, 0L, index); }
    /// {@return `maxArrayLayers`}
    public int maxArrayLayers() { return maxArrayLayers(this.segment(), 0L); }
    /// Sets `maxArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxArrayLayers(MemorySegment segment, long index, int value) { VH_maxArrayLayers.get().set(segment, 0L, index, value); }
    /// Sets `maxArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxArrayLayers(int value) { maxArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampleCounts(MemorySegment segment, long index) { return (int) VH_sampleCounts.get().get(segment, 0L, index); }
    /// {@return `sampleCounts`}
    public int sampleCounts() { return sampleCounts(this.segment(), 0L); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampleCounts(MemorySegment segment, long index, int value) { VH_sampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `sampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties sampleCounts(int value) { sampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `maxResourceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxResourceSize(MemorySegment segment, long index) { return (long) VH_maxResourceSize.get().get(segment, 0L, index); }
    /// {@return `maxResourceSize`}
    public long maxResourceSize() { return maxResourceSize(this.segment(), 0L); }
    /// Sets `maxResourceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxResourceSize(MemorySegment segment, long index, long value) { VH_maxResourceSize.get().set(segment, 0L, index, value); }
    /// Sets `maxResourceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxResourceSize(long value) { maxResourceSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageFormatProperties`
    public VkImageFormatProperties asSlice(long index) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageFormatProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageFormatProperties`
    public VkImageFormatProperties asSlice(long index, long count) { return new VkImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageFormatProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageFormatProperties at(long index, Consumer<VkImageFormatProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `maxExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxExtentAt(long index) { return maxExtent(this.segment(), index); }
    /// Sets `maxExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxExtentAt(long index, MemorySegment value) { maxExtent(this.segment(), index, value); return this; }
    /// Accepts `maxExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageFormatProperties maxExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(maxExtentAt(index))); return this; }

    /// {@return `maxMipLevels` at the given index}
    /// @param index the index of the struct buffer
    public int maxMipLevelsAt(long index) { return maxMipLevels(this.segment(), index); }
    /// Sets `maxMipLevels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxMipLevelsAt(long index, int value) { maxMipLevels(this.segment(), index, value); return this; }

    /// {@return `maxArrayLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxArrayLayersAt(long index) { return maxArrayLayers(this.segment(), index); }
    /// Sets `maxArrayLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxArrayLayersAt(long index, int value) { maxArrayLayers(this.segment(), index, value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampleCountsAt(long index) { return sampleCounts(this.segment(), index); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties sampleCountsAt(long index, int value) { sampleCounts(this.segment(), index, value); return this; }

    /// {@return `maxResourceSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxResourceSizeAt(long index) { return maxResourceSize(this.segment(), index); }
    /// Sets `maxResourceSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageFormatProperties maxResourceSizeAt(long index, long value) { maxResourceSize(this.segment(), index, value); return this; }

}
