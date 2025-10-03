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

/// Represents `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 dynamicRenderingLocalRead;
/// };
/// ```
public final class VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead")
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
    /// The byte offset of `dynamicRenderingLocalRead`.
    public static final long OFFSET_dynamicRenderingLocalRead = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalRead"));
    /// The memory layout of `dynamicRenderingLocalRead`.
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalRead = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalRead"));
    /// The [VarHandle] of `dynamicRenderingLocalRead` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dynamicRenderingLocalRead = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalRead")));

    /// Creates `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`
    public static VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR copyFrom(VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dynamicRenderingLocalRead` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicRenderingLocalRead(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalRead.get().get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalRead`}
    public int dynamicRenderingLocalRead() { return dynamicRenderingLocalRead(this.segment(), 0L); }
    /// Sets `dynamicRenderingLocalRead` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicRenderingLocalRead(MemorySegment segment, long index, int value) { VH_dynamicRenderingLocalRead.get().set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalRead` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR dynamicRenderingLocalRead(int value) { dynamicRenderingLocalRead(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR at(long index, Consumer<VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dynamicRenderingLocalRead` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicRenderingLocalReadAt(long index) { return dynamicRenderingLocalRead(this.segment(), index); }
    /// Sets `dynamicRenderingLocalRead` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDynamicRenderingLocalReadFeaturesKHR dynamicRenderingLocalReadAt(long index, int value) { dynamicRenderingLocalRead(this.segment(), index, value); return this; }

}
