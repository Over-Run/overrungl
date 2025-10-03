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

/// Represents `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 indirectMemoryCopy;
///     (uint32_t) VkBool32 indirectMemoryToImageCopy;
/// };
/// ```
public final class VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indirectMemoryCopy"),
        ValueLayout.JAVA_INT.withName("indirectMemoryToImageCopy")
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
    /// The byte offset of `indirectMemoryCopy`.
    public static final long OFFSET_indirectMemoryCopy = LAYOUT.byteOffset(PathElement.groupElement("indirectMemoryCopy"));
    /// The memory layout of `indirectMemoryCopy`.
    public static final MemoryLayout LAYOUT_indirectMemoryCopy = LAYOUT.select(PathElement.groupElement("indirectMemoryCopy"));
    /// The [VarHandle] of `indirectMemoryCopy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectMemoryCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectMemoryCopy"));
    /// The byte offset of `indirectMemoryToImageCopy`.
    public static final long OFFSET_indirectMemoryToImageCopy = LAYOUT.byteOffset(PathElement.groupElement("indirectMemoryToImageCopy"));
    /// The memory layout of `indirectMemoryToImageCopy`.
    public static final MemoryLayout LAYOUT_indirectMemoryToImageCopy = LAYOUT.select(PathElement.groupElement("indirectMemoryToImageCopy"));
    /// The [VarHandle] of `indirectMemoryToImageCopy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectMemoryToImageCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectMemoryToImageCopy"));

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR copyFrom(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `indirectMemoryCopy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indirectMemoryCopy(MemorySegment segment, long index) { return (int) VH_indirectMemoryCopy.get(segment, 0L, index); }
    /// {@return `indirectMemoryCopy`}
    public int indirectMemoryCopy() { return indirectMemoryCopy(this.segment(), 0L); }
    /// Sets `indirectMemoryCopy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectMemoryCopy(MemorySegment segment, long index, int value) { VH_indirectMemoryCopy.set(segment, 0L, index, value); }
    /// Sets `indirectMemoryCopy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryCopy(int value) { indirectMemoryCopy(this.segment(), 0L, value); return this; }

    /// {@return `indirectMemoryToImageCopy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indirectMemoryToImageCopy(MemorySegment segment, long index) { return (int) VH_indirectMemoryToImageCopy.get(segment, 0L, index); }
    /// {@return `indirectMemoryToImageCopy`}
    public int indirectMemoryToImageCopy() { return indirectMemoryToImageCopy(this.segment(), 0L); }
    /// Sets `indirectMemoryToImageCopy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectMemoryToImageCopy(MemorySegment segment, long index, int value) { VH_indirectMemoryToImageCopy.set(segment, 0L, index, value); }
    /// Sets `indirectMemoryToImageCopy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryToImageCopy(int value) { indirectMemoryToImageCopy(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR at(long index, Consumer<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `indirectMemoryCopy` at the given index}
    /// @param index the index of the struct buffer
    public int indirectMemoryCopyAt(long index) { return indirectMemoryCopy(this.segment(), index); }
    /// Sets `indirectMemoryCopy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryCopyAt(long index, int value) { indirectMemoryCopy(this.segment(), index, value); return this; }

    /// {@return `indirectMemoryToImageCopy` at the given index}
    /// @param index the index of the struct buffer
    public int indirectMemoryToImageCopyAt(long index) { return indirectMemoryToImageCopy(this.segment(), index); }
    /// Sets `indirectMemoryToImageCopy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryToImageCopyAt(long index, int value) { indirectMemoryToImageCopy(this.segment(), index, value); return this; }

}
