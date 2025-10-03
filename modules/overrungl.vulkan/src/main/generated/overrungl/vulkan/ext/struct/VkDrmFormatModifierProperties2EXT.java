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

/// Represents `VkDrmFormatModifierProperties2EXT`.
/// ## Layout
/// ```
/// struct VkDrmFormatModifierProperties2EXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 drmFormatModifierTilingFeatures;
/// };
/// ```
public final class VkDrmFormatModifierProperties2EXT extends GroupType {
    /// The struct layout of `VkDrmFormatModifierProperties2EXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifierTilingFeatures")
    );
    /// The byte offset of `drmFormatModifier`.
    public static final long OFFSET_drmFormatModifier = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifier"));
    /// The memory layout of `drmFormatModifier`.
    public static final MemoryLayout LAYOUT_drmFormatModifier = LAYOUT.select(PathElement.groupElement("drmFormatModifier"));
    /// The [VarHandle] of `drmFormatModifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_drmFormatModifier = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifier")));
    /// The byte offset of `drmFormatModifierPlaneCount`.
    public static final long OFFSET_drmFormatModifierPlaneCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The memory layout of `drmFormatModifierPlaneCount`.
    public static final MemoryLayout LAYOUT_drmFormatModifierPlaneCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierPlaneCount"));
    /// The [VarHandle] of `drmFormatModifierPlaneCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_drmFormatModifierPlaneCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierPlaneCount")));
    /// The byte offset of `drmFormatModifierTilingFeatures`.
    public static final long OFFSET_drmFormatModifierTilingFeatures = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierTilingFeatures"));
    /// The memory layout of `drmFormatModifierTilingFeatures`.
    public static final MemoryLayout LAYOUT_drmFormatModifierTilingFeatures = LAYOUT.select(PathElement.groupElement("drmFormatModifierTilingFeatures"));
    /// The [VarHandle] of `drmFormatModifierTilingFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_drmFormatModifierTilingFeatures = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierTilingFeatures")));

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDrmFormatModifierProperties2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierProperties2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierProperties2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDrmFormatModifierProperties2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDrmFormatModifierProperties2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierProperties2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDrmFormatModifierProperties2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDrmFormatModifierProperties2EXT`
    public static VkDrmFormatModifierProperties2EXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierProperties2EXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDrmFormatModifierProperties2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDrmFormatModifierProperties2EXT`
    public static VkDrmFormatModifierProperties2EXT alloc(SegmentAllocator allocator, long count) { return new VkDrmFormatModifierProperties2EXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT copyFrom(VkDrmFormatModifierProperties2EXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDrmFormatModifierProperties2EXT reinterpret(long count) { return new VkDrmFormatModifierProperties2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `drmFormatModifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long drmFormatModifier(MemorySegment segment, long index) { return (long) VH_drmFormatModifier.get().get(segment, 0L, index); }
    /// {@return `drmFormatModifier`}
    public long drmFormatModifier() { return drmFormatModifier(this.segment(), 0L); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifier(MemorySegment segment, long index, long value) { VH_drmFormatModifier.get().set(segment, 0L, index, value); }
    /// Sets `drmFormatModifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifier(long value) { drmFormatModifier(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int drmFormatModifierPlaneCount(MemorySegment segment, long index) { return (int) VH_drmFormatModifierPlaneCount.get().get(segment, 0L, index); }
    /// {@return `drmFormatModifierPlaneCount`}
    public int drmFormatModifierPlaneCount() { return drmFormatModifierPlaneCount(this.segment(), 0L); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierPlaneCount(MemorySegment segment, long index, int value) { VH_drmFormatModifierPlaneCount.get().set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierPlaneCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCount(int value) { drmFormatModifierPlaneCount(this.segment(), 0L, value); return this; }

    /// {@return `drmFormatModifierTilingFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long drmFormatModifierTilingFeatures(MemorySegment segment, long index) { return (long) VH_drmFormatModifierTilingFeatures.get().get(segment, 0L, index); }
    /// {@return `drmFormatModifierTilingFeatures`}
    public long drmFormatModifierTilingFeatures() { return drmFormatModifierTilingFeatures(this.segment(), 0L); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void drmFormatModifierTilingFeatures(MemorySegment segment, long index, long value) { VH_drmFormatModifierTilingFeatures.get().set(segment, 0L, index, value); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeatures(long value) { drmFormatModifierTilingFeatures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDrmFormatModifierProperties2EXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDrmFormatModifierProperties2EXT`
    public VkDrmFormatModifierProperties2EXT asSlice(long index) { return new VkDrmFormatModifierProperties2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDrmFormatModifierProperties2EXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDrmFormatModifierProperties2EXT`
    public VkDrmFormatModifierProperties2EXT asSlice(long index, long count) { return new VkDrmFormatModifierProperties2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDrmFormatModifierProperties2EXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT at(long index, Consumer<VkDrmFormatModifierProperties2EXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `drmFormatModifier` at the given index}
    /// @param index the index of the struct buffer
    public long drmFormatModifierAt(long index) { return drmFormatModifier(this.segment(), index); }
    /// Sets `drmFormatModifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierAt(long index, long value) { drmFormatModifier(this.segment(), index, value); return this; }

    /// {@return `drmFormatModifierPlaneCount` at the given index}
    /// @param index the index of the struct buffer
    public int drmFormatModifierPlaneCountAt(long index) { return drmFormatModifierPlaneCount(this.segment(), index); }
    /// Sets `drmFormatModifierPlaneCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierPlaneCountAt(long index, int value) { drmFormatModifierPlaneCount(this.segment(), index, value); return this; }

    /// {@return `drmFormatModifierTilingFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long drmFormatModifierTilingFeaturesAt(long index) { return drmFormatModifierTilingFeatures(this.segment(), index); }
    /// Sets `drmFormatModifierTilingFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDrmFormatModifierProperties2EXT drmFormatModifierTilingFeaturesAt(long index, long value) { drmFormatModifierTilingFeatures(this.segment(), index, value); return this; }

}
