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

/// Represents `VkPhysicalDeviceFragmentShadingRateKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShadingRateKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampleCounts;
///     (struct VkExtent2D) VkExtent2D fragmentSize;
/// };
/// ```
public final class VkPhysicalDeviceFragmentShadingRateKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize")
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
    /// The byte offset of `sampleCounts`.
    public static final long OFFSET_sampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
    /// The memory layout of `sampleCounts`.
    public static final MemoryLayout LAYOUT_sampleCounts = LAYOUT.select(PathElement.groupElement("sampleCounts"));
    /// The [VarHandle] of `sampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts")));
    /// The byte offset of `fragmentSize`.
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    /// The memory layout of `fragmentSize`.
    public static final MemoryLayout LAYOUT_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR copyFrom(VkPhysicalDeviceFragmentShadingRateKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentShadingRateKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentShadingRateKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCounts(int value) { sampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment fragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize); }
    /// {@return `fragmentSize`}
    public MemorySegment fragmentSize() { return fragmentSize(this.segment(), 0L); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentSize, index), LAYOUT_fragmentSize.byteSize()); }
    /// Sets `fragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize(MemorySegment value) { fragmentSize(this.segment(), 0L, value); return this; }
    /// Accepts `fragmentSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(fragmentSize())); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateKHR`
    public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateKHR`
    public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentShadingRateKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR at(long index, Consumer<VkPhysicalDeviceFragmentShadingRateKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampleCountsAt(long index) { return sampleCounts(this.segment(), index); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCountsAt(long index, int value) { sampleCounts(this.segment(), index, value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment fragmentSizeAt(long index) { return fragmentSize(this.segment(), index); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSizeAt(long index, MemorySegment value) { fragmentSize(this.segment(), index, value); return this; }
    /// Accepts `fragmentSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(fragmentSizeAt(index))); return this; }

}
