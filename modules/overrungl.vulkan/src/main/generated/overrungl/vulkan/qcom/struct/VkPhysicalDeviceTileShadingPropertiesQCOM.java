// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.qcom.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTileShadingPropertiesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTileShadingPropertiesQCOM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxApronSize;
///     (uint32_t) VkBool32 preferNonCoherent;
///     (struct VkExtent2D) VkExtent2D tileGranularity;
///     (struct VkExtent2D) VkExtent2D maxTileShadingRate;
/// };
/// ```
public final class VkPhysicalDeviceTileShadingPropertiesQCOM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTileShadingPropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxApronSize"),
        ValueLayout.JAVA_INT.withName("preferNonCoherent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("tileGranularity"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTileShadingRate")
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
    /// The byte offset of `maxApronSize`.
    public static final long OFFSET_maxApronSize = LAYOUT.byteOffset(PathElement.groupElement("maxApronSize"));
    /// The memory layout of `maxApronSize`.
    public static final MemoryLayout LAYOUT_maxApronSize = LAYOUT.select(PathElement.groupElement("maxApronSize"));
    /// The [VarHandle] of `maxApronSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxApronSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxApronSize")));
    /// The byte offset of `preferNonCoherent`.
    public static final long OFFSET_preferNonCoherent = LAYOUT.byteOffset(PathElement.groupElement("preferNonCoherent"));
    /// The memory layout of `preferNonCoherent`.
    public static final MemoryLayout LAYOUT_preferNonCoherent = LAYOUT.select(PathElement.groupElement("preferNonCoherent"));
    /// The [VarHandle] of `preferNonCoherent` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferNonCoherent = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferNonCoherent")));
    /// The byte offset of `tileGranularity`.
    public static final long OFFSET_tileGranularity = LAYOUT.byteOffset(PathElement.groupElement("tileGranularity"));
    /// The memory layout of `tileGranularity`.
    public static final MemoryLayout LAYOUT_tileGranularity = LAYOUT.select(PathElement.groupElement("tileGranularity"));
    /// The byte offset of `maxTileShadingRate`.
    public static final long OFFSET_maxTileShadingRate = LAYOUT.byteOffset(PathElement.groupElement("maxTileShadingRate"));
    /// The memory layout of `maxTileShadingRate`.
    public static final MemoryLayout LAYOUT_maxTileShadingRate = LAYOUT.select(PathElement.groupElement("maxTileShadingRate"));

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTileShadingPropertiesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTileShadingPropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public static VkPhysicalDeviceTileShadingPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM copyFrom(VkPhysicalDeviceTileShadingPropertiesQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTileShadingPropertiesQCOM reinterpret(long count) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTileShadingPropertiesQCOM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxApronSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxApronSize(MemorySegment segment, long index) { return (int) VH_maxApronSize.get().get(segment, 0L, index); }
    /// {@return `maxApronSize`}
    public int maxApronSize() { return maxApronSize(this.segment(), 0L); }
    /// Sets `maxApronSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxApronSize(MemorySegment segment, long index, int value) { VH_maxApronSize.get().set(segment, 0L, index, value); }
    /// Sets `maxApronSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxApronSize(int value) { maxApronSize(this.segment(), 0L, value); return this; }

    /// {@return `preferNonCoherent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferNonCoherent(MemorySegment segment, long index) { return (int) VH_preferNonCoherent.get().get(segment, 0L, index); }
    /// {@return `preferNonCoherent`}
    public int preferNonCoherent() { return preferNonCoherent(this.segment(), 0L); }
    /// Sets `preferNonCoherent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferNonCoherent(MemorySegment segment, long index, int value) { VH_preferNonCoherent.get().set(segment, 0L, index, value); }
    /// Sets `preferNonCoherent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM preferNonCoherent(int value) { preferNonCoherent(this.segment(), 0L, value); return this; }

    /// {@return `tileGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment tileGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_tileGranularity, index), LAYOUT_tileGranularity); }
    /// {@return `tileGranularity`}
    public MemorySegment tileGranularity() { return tileGranularity(this.segment(), 0L); }
    /// Sets `tileGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileGranularity(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_tileGranularity, index), LAYOUT_tileGranularity.byteSize()); }
    /// Sets `tileGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity(MemorySegment value) { tileGranularity(this.segment(), 0L, value); return this; }
    /// Accepts `tileGranularity` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularity(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(tileGranularity())); return this; }

    /// {@return `maxTileShadingRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxTileShadingRate(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTileShadingRate, index), LAYOUT_maxTileShadingRate); }
    /// {@return `maxTileShadingRate`}
    public MemorySegment maxTileShadingRate() { return maxTileShadingRate(this.segment(), 0L); }
    /// Sets `maxTileShadingRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTileShadingRate(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTileShadingRate, index), LAYOUT_maxTileShadingRate.byteSize()); }
    /// Sets `maxTileShadingRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate(MemorySegment value) { maxTileShadingRate(this.segment(), 0L, value); return this; }
    /// Accepts `maxTileShadingRate` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRate(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTileShadingRate())); return this; }

    /// Creates a slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public VkPhysicalDeviceTileShadingPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTileShadingPropertiesQCOM`
    public VkPhysicalDeviceTileShadingPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceTileShadingPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTileShadingPropertiesQCOM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM at(long index, Consumer<VkPhysicalDeviceTileShadingPropertiesQCOM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxApronSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxApronSizeAt(long index) { return maxApronSize(this.segment(), index); }
    /// Sets `maxApronSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxApronSizeAt(long index, int value) { maxApronSize(this.segment(), index, value); return this; }

    /// {@return `preferNonCoherent` at the given index}
    /// @param index the index of the struct buffer
    public int preferNonCoherentAt(long index) { return preferNonCoherent(this.segment(), index); }
    /// Sets `preferNonCoherent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM preferNonCoherentAt(long index, int value) { preferNonCoherent(this.segment(), index, value); return this; }

    /// {@return `tileGranularity` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment tileGranularityAt(long index) { return tileGranularity(this.segment(), index); }
    /// Sets `tileGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularityAt(long index, MemorySegment value) { tileGranularity(this.segment(), index, value); return this; }
    /// Accepts `tileGranularity` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM tileGranularityAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(tileGranularityAt(index))); return this; }

    /// {@return `maxTileShadingRate` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxTileShadingRateAt(long index) { return maxTileShadingRate(this.segment(), index); }
    /// Sets `maxTileShadingRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRateAt(long index, MemorySegment value) { maxTileShadingRate(this.segment(), index, value); return this; }
    /// Accepts `maxTileShadingRate` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceTileShadingPropertiesQCOM maxTileShadingRateAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTileShadingRateAt(index))); return this; }

}
