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

/// Represents `VkDeviceGroupBindSparseInfoKHR`.
/// ## Layout
/// ```
/// struct VkDeviceGroupBindSparseInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t resourceDeviceIndex;
///     uint32_t memoryDeviceIndex;
/// };
/// ```
public final class VkDeviceGroupBindSparseInfoKHR extends GroupType {
    /// The struct layout of `VkDeviceGroupBindSparseInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("resourceDeviceIndex"),
        ValueLayout.JAVA_INT.withName("memoryDeviceIndex")
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
    /// The byte offset of `resourceDeviceIndex`.
    public static final long OFFSET_resourceDeviceIndex = LAYOUT.byteOffset(PathElement.groupElement("resourceDeviceIndex"));
    /// The memory layout of `resourceDeviceIndex`.
    public static final MemoryLayout LAYOUT_resourceDeviceIndex = LAYOUT.select(PathElement.groupElement("resourceDeviceIndex"));
    /// The [VarHandle] of `resourceDeviceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_resourceDeviceIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceDeviceIndex")));
    /// The byte offset of `memoryDeviceIndex`.
    public static final long OFFSET_memoryDeviceIndex = LAYOUT.byteOffset(PathElement.groupElement("memoryDeviceIndex"));
    /// The memory layout of `memoryDeviceIndex`.
    public static final MemoryLayout LAYOUT_memoryDeviceIndex = LAYOUT.select(PathElement.groupElement("memoryDeviceIndex"));
    /// The [VarHandle] of `memoryDeviceIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memoryDeviceIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryDeviceIndex")));

    /// Creates `VkDeviceGroupBindSparseInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceGroupBindSparseInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceGroupBindSparseInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupBindSparseInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceGroupBindSparseInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupBindSparseInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceGroupBindSparseInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupBindSparseInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceGroupBindSparseInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceGroupBindSparseInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupBindSparseInfoKHR`
    public static VkDeviceGroupBindSparseInfoKHR alloc(SegmentAllocator allocator) { return new VkDeviceGroupBindSparseInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceGroupBindSparseInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupBindSparseInfoKHR`
    public static VkDeviceGroupBindSparseInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupBindSparseInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR copyFrom(VkDeviceGroupBindSparseInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceGroupBindSparseInfoKHR reinterpret(long count) { return new VkDeviceGroupBindSparseInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDeviceGroupBindSparseInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDeviceGroupBindSparseInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `resourceDeviceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int resourceDeviceIndex(MemorySegment segment, long index) { return (int) VH_resourceDeviceIndex.get().get(segment, 0L, index); }
    /// {@return `resourceDeviceIndex`}
    public int resourceDeviceIndex() { return resourceDeviceIndex(this.segment(), 0L); }
    /// Sets `resourceDeviceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resourceDeviceIndex(MemorySegment segment, long index, int value) { VH_resourceDeviceIndex.get().set(segment, 0L, index, value); }
    /// Sets `resourceDeviceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR resourceDeviceIndex(int value) { resourceDeviceIndex(this.segment(), 0L, value); return this; }

    /// {@return `memoryDeviceIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryDeviceIndex(MemorySegment segment, long index) { return (int) VH_memoryDeviceIndex.get().get(segment, 0L, index); }
    /// {@return `memoryDeviceIndex`}
    public int memoryDeviceIndex() { return memoryDeviceIndex(this.segment(), 0L); }
    /// Sets `memoryDeviceIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryDeviceIndex(MemorySegment segment, long index, int value) { VH_memoryDeviceIndex.get().set(segment, 0L, index, value); }
    /// Sets `memoryDeviceIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR memoryDeviceIndex(int value) { memoryDeviceIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceGroupBindSparseInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceGroupBindSparseInfoKHR`
    public VkDeviceGroupBindSparseInfoKHR asSlice(long index) { return new VkDeviceGroupBindSparseInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceGroupBindSparseInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceGroupBindSparseInfoKHR`
    public VkDeviceGroupBindSparseInfoKHR asSlice(long index, long count) { return new VkDeviceGroupBindSparseInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceGroupBindSparseInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR at(long index, Consumer<VkDeviceGroupBindSparseInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `resourceDeviceIndex` at the given index}
    /// @param index the index of the struct buffer
    public int resourceDeviceIndexAt(long index) { return resourceDeviceIndex(this.segment(), index); }
    /// Sets `resourceDeviceIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR resourceDeviceIndexAt(long index, int value) { resourceDeviceIndex(this.segment(), index, value); return this; }

    /// {@return `memoryDeviceIndex` at the given index}
    /// @param index the index of the struct buffer
    public int memoryDeviceIndexAt(long index) { return memoryDeviceIndex(this.segment(), index); }
    /// Sets `memoryDeviceIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupBindSparseInfoKHR memoryDeviceIndexAt(long index, int value) { memoryDeviceIndex(this.segment(), index, value); return this; }

}
