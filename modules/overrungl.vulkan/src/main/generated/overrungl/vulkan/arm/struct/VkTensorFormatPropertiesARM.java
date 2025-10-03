// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorFormatPropertiesARM`.
/// ## Layout
/// ```
/// struct VkTensorFormatPropertiesARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 optimalTilingTensorFeatures;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 linearTilingTensorFeatures;
/// };
/// ```
public final class VkTensorFormatPropertiesARM extends GroupType {
    /// The struct layout of `VkTensorFormatPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("optimalTilingTensorFeatures"),
        ValueLayout.JAVA_LONG.withName("linearTilingTensorFeatures")
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
    /// The byte offset of `optimalTilingTensorFeatures`.
    public static final long OFFSET_optimalTilingTensorFeatures = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingTensorFeatures"));
    /// The memory layout of `optimalTilingTensorFeatures`.
    public static final MemoryLayout LAYOUT_optimalTilingTensorFeatures = LAYOUT.select(PathElement.groupElement("optimalTilingTensorFeatures"));
    /// The [VarHandle] of `optimalTilingTensorFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_optimalTilingTensorFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingTensorFeatures"));
    /// The byte offset of `linearTilingTensorFeatures`.
    public static final long OFFSET_linearTilingTensorFeatures = LAYOUT.byteOffset(PathElement.groupElement("linearTilingTensorFeatures"));
    /// The memory layout of `linearTilingTensorFeatures`.
    public static final MemoryLayout LAYOUT_linearTilingTensorFeatures = LAYOUT.select(PathElement.groupElement("linearTilingTensorFeatures"));
    /// The [VarHandle] of `linearTilingTensorFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_linearTilingTensorFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("linearTilingTensorFeatures"));

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTensorFormatPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorFormatPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorFormatPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTensorFormatPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorFormatPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorFormatPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM alloc(SegmentAllocator allocator) { return new VkTensorFormatPropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTensorFormatPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTensorFormatPropertiesARM`
    public static VkTensorFormatPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkTensorFormatPropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTensorFormatPropertiesARM copyFrom(VkTensorFormatPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTensorFormatPropertiesARM reinterpret(long count) { return new VkTensorFormatPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTensorFormatPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTensorFormatPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `optimalTilingTensorFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long optimalTilingTensorFeatures(MemorySegment segment, long index) { return (long) VH_optimalTilingTensorFeatures.get(segment, 0L, index); }
    /// {@return `optimalTilingTensorFeatures`}
    public long optimalTilingTensorFeatures() { return optimalTilingTensorFeatures(this.segment(), 0L); }
    /// Sets `optimalTilingTensorFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalTilingTensorFeatures(MemorySegment segment, long index, long value) { VH_optimalTilingTensorFeatures.set(segment, 0L, index, value); }
    /// Sets `optimalTilingTensorFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM optimalTilingTensorFeatures(long value) { optimalTilingTensorFeatures(this.segment(), 0L, value); return this; }

    /// {@return `linearTilingTensorFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long linearTilingTensorFeatures(MemorySegment segment, long index) { return (long) VH_linearTilingTensorFeatures.get(segment, 0L, index); }
    /// {@return `linearTilingTensorFeatures`}
    public long linearTilingTensorFeatures() { return linearTilingTensorFeatures(this.segment(), 0L); }
    /// Sets `linearTilingTensorFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void linearTilingTensorFeatures(MemorySegment segment, long index, long value) { VH_linearTilingTensorFeatures.set(segment, 0L, index, value); }
    /// Sets `linearTilingTensorFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM linearTilingTensorFeatures(long value) { linearTilingTensorFeatures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTensorFormatPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTensorFormatPropertiesARM`
    public VkTensorFormatPropertiesARM asSlice(long index) { return new VkTensorFormatPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTensorFormatPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTensorFormatPropertiesARM`
    public VkTensorFormatPropertiesARM asSlice(long index, long count) { return new VkTensorFormatPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTensorFormatPropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTensorFormatPropertiesARM at(long index, Consumer<VkTensorFormatPropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `optimalTilingTensorFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long optimalTilingTensorFeaturesAt(long index) { return optimalTilingTensorFeatures(this.segment(), index); }
    /// Sets `optimalTilingTensorFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM optimalTilingTensorFeaturesAt(long index, long value) { optimalTilingTensorFeatures(this.segment(), index, value); return this; }

    /// {@return `linearTilingTensorFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long linearTilingTensorFeaturesAt(long index) { return linearTilingTensorFeatures(this.segment(), index); }
    /// Sets `linearTilingTensorFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorFormatPropertiesARM linearTilingTensorFeaturesAt(long index, long value) { linearTilingTensorFeatures(this.segment(), index, value); return this; }

}
