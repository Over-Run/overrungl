// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShadingRateImageFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShadingRateImageFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shadingRateImage;
///     (uint32_t) VkBool32 shadingRateCoarseSampleOrder;
/// };
/// ```
public final class VkPhysicalDeviceShadingRateImageFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
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
    /// The byte offset of `shadingRateImage`.
    public static final long OFFSET_shadingRateImage = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImage"));
    /// The memory layout of `shadingRateImage`.
    public static final MemoryLayout LAYOUT_shadingRateImage = LAYOUT.select(PathElement.groupElement("shadingRateImage"));
    /// The [VarHandle] of `shadingRateImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shadingRateImage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateImage")));
    /// The byte offset of `shadingRateCoarseSampleOrder`.
    public static final long OFFSET_shadingRateCoarseSampleOrder = LAYOUT.byteOffset(PathElement.groupElement("shadingRateCoarseSampleOrder"));
    /// The memory layout of `shadingRateCoarseSampleOrder`.
    public static final MemoryLayout LAYOUT_shadingRateCoarseSampleOrder = LAYOUT.select(PathElement.groupElement("shadingRateCoarseSampleOrder"));
    /// The [VarHandle] of `shadingRateCoarseSampleOrder` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shadingRateCoarseSampleOrder = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shadingRateCoarseSampleOrder")));

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShadingRateImageFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShadingRateImageFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public static VkPhysicalDeviceShadingRateImageFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV copyFrom(VkPhysicalDeviceShadingRateImageFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShadingRateImageFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateImage(MemorySegment segment, long index) { return (int) VH_shadingRateImage.get().get(segment, 0L, index); }
    /// {@return `shadingRateImage`}
    public int shadingRateImage() { return shadingRateImage(this.segment(), 0L); }
    /// Sets `shadingRateImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateImage(MemorySegment segment, long index, int value) { VH_shadingRateImage.get().set(segment, 0L, index, value); }
    /// Sets `shadingRateImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(int value) { shadingRateImage(this.segment(), 0L, value); return this; }

    /// {@return `shadingRateCoarseSampleOrder` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shadingRateCoarseSampleOrder(MemorySegment segment, long index) { return (int) VH_shadingRateCoarseSampleOrder.get().get(segment, 0L, index); }
    /// {@return `shadingRateCoarseSampleOrder`}
    public int shadingRateCoarseSampleOrder() { return shadingRateCoarseSampleOrder(this.segment(), 0L); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shadingRateCoarseSampleOrder(MemorySegment segment, long index, int value) { VH_shadingRateCoarseSampleOrder.get().set(segment, 0L, index, value); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(int value) { shadingRateCoarseSampleOrder(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public VkPhysicalDeviceShadingRateImageFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShadingRateImageFeaturesNV`
    public VkPhysicalDeviceShadingRateImageFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShadingRateImageFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShadingRateImageFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV at(long index, Consumer<VkPhysicalDeviceShadingRateImageFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shadingRateImage` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRateImageAt(long index) { return shadingRateImage(this.segment(), index); }
    /// Sets `shadingRateImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImageAt(long index, int value) { shadingRateImage(this.segment(), index, value); return this; }

    /// {@return `shadingRateCoarseSampleOrder` at the given index}
    /// @param index the index of the struct buffer
    public int shadingRateCoarseSampleOrderAt(long index) { return shadingRateCoarseSampleOrder(this.segment(), index); }
    /// Sets `shadingRateCoarseSampleOrder` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrderAt(long index, int value) { shadingRateCoarseSampleOrder(this.segment(), index, value); return this; }

}
