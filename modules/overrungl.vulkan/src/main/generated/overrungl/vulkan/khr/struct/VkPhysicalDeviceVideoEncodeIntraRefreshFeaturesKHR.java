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

/// Represents `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 videoEncodeIntraRefresh;
/// };
/// ```
public final class VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoEncodeIntraRefresh")
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
    /// The byte offset of `videoEncodeIntraRefresh`.
    public static final long OFFSET_videoEncodeIntraRefresh = LAYOUT.byteOffset(PathElement.groupElement("videoEncodeIntraRefresh"));
    /// The memory layout of `videoEncodeIntraRefresh`.
    public static final MemoryLayout LAYOUT_videoEncodeIntraRefresh = LAYOUT.select(PathElement.groupElement("videoEncodeIntraRefresh"));
    /// The [VarHandle] of `videoEncodeIntraRefresh` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_videoEncodeIntraRefresh = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoEncodeIntraRefresh")));

    /// Creates `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`
    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR copyFrom(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `videoEncodeIntraRefresh` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int videoEncodeIntraRefresh(MemorySegment segment, long index) { return (int) VH_videoEncodeIntraRefresh.get().get(segment, 0L, index); }
    /// {@return `videoEncodeIntraRefresh`}
    public int videoEncodeIntraRefresh() { return videoEncodeIntraRefresh(this.segment(), 0L); }
    /// Sets `videoEncodeIntraRefresh` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoEncodeIntraRefresh(MemorySegment segment, long index, int value) { VH_videoEncodeIntraRefresh.get().set(segment, 0L, index, value); }
    /// Sets `videoEncodeIntraRefresh` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR videoEncodeIntraRefresh(int value) { videoEncodeIntraRefresh(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR at(long index, Consumer<VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `videoEncodeIntraRefresh` at the given index}
    /// @param index the index of the struct buffer
    public int videoEncodeIntraRefreshAt(long index) { return videoEncodeIntraRefresh(this.segment(), index); }
    /// Sets `videoEncodeIntraRefresh` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR videoEncodeIntraRefreshAt(long index, int value) { videoEncodeIntraRefresh(this.segment(), index, value); return this; }

}
