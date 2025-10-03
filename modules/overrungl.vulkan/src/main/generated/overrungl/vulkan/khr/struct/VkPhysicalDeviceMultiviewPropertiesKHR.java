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

/// Represents `VkPhysicalDeviceMultiviewPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultiviewPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
/// };
/// ```
public final class VkPhysicalDeviceMultiviewPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMultiviewPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex")
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
    /// The byte offset of `maxMultiviewViewCount`.
    public static final long OFFSET_maxMultiviewViewCount = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewViewCount"));
    /// The memory layout of `maxMultiviewViewCount`.
    public static final MemoryLayout LAYOUT_maxMultiviewViewCount = LAYOUT.select(PathElement.groupElement("maxMultiviewViewCount"));
    /// The [VarHandle] of `maxMultiviewViewCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxMultiviewViewCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewViewCount")));
    /// The byte offset of `maxMultiviewInstanceIndex`.
    public static final long OFFSET_maxMultiviewInstanceIndex = LAYOUT.byteOffset(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The memory layout of `maxMultiviewInstanceIndex`.
    public static final MemoryLayout LAYOUT_maxMultiviewInstanceIndex = LAYOUT.select(PathElement.groupElement("maxMultiviewInstanceIndex"));
    /// The [VarHandle] of `maxMultiviewInstanceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxMultiviewInstanceIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMultiviewInstanceIndex")));

    /// Creates `VkPhysicalDeviceMultiviewPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMultiviewPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMultiviewPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMultiviewPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMultiviewPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMultiviewPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewPropertiesKHR`
    public static VkPhysicalDeviceMultiviewPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMultiviewPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewPropertiesKHR`
    public static VkPhysicalDeviceMultiviewPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR copyFrom(VkPhysicalDeviceMultiviewPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMultiviewPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMultiviewPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMultiviewPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMultiviewPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMultiviewViewCount(MemorySegment segment, long index) { return (int) VH_maxMultiviewViewCount.get().get(segment, 0L, index); }
    /// {@return `maxMultiviewViewCount`}
    public int maxMultiviewViewCount() { return maxMultiviewViewCount(this.segment(), 0L); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMultiviewViewCount(MemorySegment segment, long index, int value) { VH_maxMultiviewViewCount.get().set(segment, 0L, index, value); }
    /// Sets `maxMultiviewViewCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewViewCount(int value) { maxMultiviewViewCount(this.segment(), 0L, value); return this; }

    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMultiviewInstanceIndex(MemorySegment segment, long index) { return (int) VH_maxMultiviewInstanceIndex.get().get(segment, 0L, index); }
    /// {@return `maxMultiviewInstanceIndex`}
    public int maxMultiviewInstanceIndex() { return maxMultiviewInstanceIndex(this.segment(), 0L); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMultiviewInstanceIndex(MemorySegment segment, long index, int value) { VH_maxMultiviewInstanceIndex.get().set(segment, 0L, index, value); }
    /// Sets `maxMultiviewInstanceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewInstanceIndex(int value) { maxMultiviewInstanceIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMultiviewPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMultiviewPropertiesKHR`
    public VkPhysicalDeviceMultiviewPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMultiviewPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMultiviewPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMultiviewPropertiesKHR`
    public VkPhysicalDeviceMultiviewPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMultiviewPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR at(long index, Consumer<VkPhysicalDeviceMultiviewPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxMultiviewViewCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxMultiviewViewCountAt(long index) { return maxMultiviewViewCount(this.segment(), index); }
    /// Sets `maxMultiviewViewCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewViewCountAt(long index, int value) { maxMultiviewViewCount(this.segment(), index, value); return this; }

    /// {@return `maxMultiviewInstanceIndex` at the given index}
    /// @param index the index of the struct buffer
    public int maxMultiviewInstanceIndexAt(long index) { return maxMultiviewInstanceIndex(this.segment(), index); }
    /// Sets `maxMultiviewInstanceIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPropertiesKHR maxMultiviewInstanceIndexAt(long index, int value) { maxMultiviewInstanceIndex(this.segment(), index, value); return this; }

}
