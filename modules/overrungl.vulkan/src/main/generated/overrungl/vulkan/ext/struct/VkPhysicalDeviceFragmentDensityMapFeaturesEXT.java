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

/// Represents `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 fragmentDensityMap;
///     (uint32_t) VkBool32 fragmentDensityMapDynamic;
///     (uint32_t) VkBool32 fragmentDensityMapNonSubsampledImages;
/// };
/// ```
public final class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
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
    /// The byte offset of `fragmentDensityMap`.
    public static final long OFFSET_fragmentDensityMap = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMap"));
    /// The memory layout of `fragmentDensityMap`.
    public static final MemoryLayout LAYOUT_fragmentDensityMap = LAYOUT.select(PathElement.groupElement("fragmentDensityMap"));
    /// The [VarHandle] of `fragmentDensityMap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_fragmentDensityMap = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMap")));
    /// The byte offset of `fragmentDensityMapDynamic`.
    public static final long OFFSET_fragmentDensityMapDynamic = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapDynamic"));
    /// The memory layout of `fragmentDensityMapDynamic`.
    public static final MemoryLayout LAYOUT_fragmentDensityMapDynamic = LAYOUT.select(PathElement.groupElement("fragmentDensityMapDynamic"));
    /// The [VarHandle] of `fragmentDensityMapDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_fragmentDensityMapDynamic = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapDynamic")));
    /// The byte offset of `fragmentDensityMapNonSubsampledImages`.
    public static final long OFFSET_fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    /// The memory layout of `fragmentDensityMapNonSubsampledImages`.
    public static final MemoryLayout LAYOUT_fragmentDensityMapNonSubsampledImages = LAYOUT.select(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
    /// The [VarHandle] of `fragmentDensityMapNonSubsampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_fragmentDensityMapNonSubsampledImages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapNonSubsampledImages")));

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public static VkPhysicalDeviceFragmentDensityMapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT copyFrom(VkPhysicalDeviceFragmentDensityMapFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMap(MemorySegment segment, long index) { return (int) VH_fragmentDensityMap.get().get(segment, 0L, index); }
    /// {@return `fragmentDensityMap`}
    public int fragmentDensityMap() { return fragmentDensityMap(this.segment(), 0L); }
    /// Sets `fragmentDensityMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMap(MemorySegment segment, long index, int value) { VH_fragmentDensityMap.get().set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(int value) { fragmentDensityMap(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMapDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMapDynamic(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapDynamic.get().get(segment, 0L, index); }
    /// {@return `fragmentDensityMapDynamic`}
    public int fragmentDensityMapDynamic() { return fragmentDensityMapDynamic(this.segment(), 0L); }
    /// Sets `fragmentDensityMapDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMapDynamic(MemorySegment segment, long index, int value) { VH_fragmentDensityMapDynamic.get().set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(int value) { fragmentDensityMapDynamic(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMapNonSubsampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMapNonSubsampledImages(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapNonSubsampledImages.get().get(segment, 0L, index); }
    /// {@return `fragmentDensityMapNonSubsampledImages`}
    public int fragmentDensityMapNonSubsampledImages() { return fragmentDensityMapNonSubsampledImages(this.segment(), 0L); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMapNonSubsampledImages(MemorySegment segment, long index, int value) { VH_fragmentDensityMapNonSubsampledImages.get().set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImages(int value) { fragmentDensityMapNonSubsampledImages(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapFeaturesEXT`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentDensityMapFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `fragmentDensityMap` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentDensityMapAt(long index) { return fragmentDensityMap(this.segment(), index); }
    /// Sets `fragmentDensityMap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapAt(long index, int value) { fragmentDensityMap(this.segment(), index, value); return this; }

    /// {@return `fragmentDensityMapDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentDensityMapDynamicAt(long index) { return fragmentDensityMapDynamic(this.segment(), index); }
    /// Sets `fragmentDensityMapDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamicAt(long index, int value) { fragmentDensityMapDynamic(this.segment(), index, value); return this; }

    /// {@return `fragmentDensityMapNonSubsampledImages` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentDensityMapNonSubsampledImagesAt(long index) { return fragmentDensityMapNonSubsampledImages(this.segment(), index); }
    /// Sets `fragmentDensityMapNonSubsampledImages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImagesAt(long index, int value) { fragmentDensityMapNonSubsampledImages(this.segment(), index, value); return this; }

}
