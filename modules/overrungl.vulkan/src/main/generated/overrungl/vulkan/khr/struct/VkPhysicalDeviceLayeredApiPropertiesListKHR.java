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

/// Represents `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLayeredApiPropertiesListKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t layeredApiCount;
///     VkPhysicalDeviceLayeredApiPropertiesKHR* pLayeredApis;
/// };
/// ```
public final class VkPhysicalDeviceLayeredApiPropertiesListKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("layeredApiCount"),
        ValueLayout.ADDRESS.withName("pLayeredApis")
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
    /// The byte offset of `layeredApiCount`.
    public static final long OFFSET_layeredApiCount = LAYOUT.byteOffset(PathElement.groupElement("layeredApiCount"));
    /// The memory layout of `layeredApiCount`.
    public static final MemoryLayout LAYOUT_layeredApiCount = LAYOUT.select(PathElement.groupElement("layeredApiCount"));
    /// The [VarHandle] of `layeredApiCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_layeredApiCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredApiCount")));
    /// The byte offset of `pLayeredApis`.
    public static final long OFFSET_pLayeredApis = LAYOUT.byteOffset(PathElement.groupElement("pLayeredApis"));
    /// The memory layout of `pLayeredApis`.
    public static final MemoryLayout LAYOUT_pLayeredApis = LAYOUT.select(PathElement.groupElement("pLayeredApis"));
    /// The [VarHandle] of `pLayeredApis` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pLayeredApis = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pLayeredApis")));

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceLayeredApiPropertiesListKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public static VkPhysicalDeviceLayeredApiPropertiesListKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR copyFrom(VkPhysicalDeviceLayeredApiPropertiesListKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceLayeredApiPropertiesListKHR reinterpret(long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `layeredApiCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layeredApiCount(MemorySegment segment, long index) { return (int) VH_layeredApiCount.get().get(segment, 0L, index); }
    /// {@return `layeredApiCount`}
    public int layeredApiCount() { return layeredApiCount(this.segment(), 0L); }
    /// Sets `layeredApiCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layeredApiCount(MemorySegment segment, long index, int value) { VH_layeredApiCount.get().set(segment, 0L, index, value); }
    /// Sets `layeredApiCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCount(int value) { layeredApiCount(this.segment(), 0L, value); return this; }

    /// {@return `pLayeredApis` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pLayeredApis(MemorySegment segment, long index) { return (MemorySegment) VH_pLayeredApis.get().get(segment, 0L, index); }
    /// {@return `pLayeredApis`}
    public MemorySegment pLayeredApis() { return pLayeredApis(this.segment(), 0L); }
    /// Sets `pLayeredApis` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pLayeredApis(MemorySegment segment, long index, MemorySegment value) { VH_pLayeredApis.get().set(segment, 0L, index, value); }
    /// Sets `pLayeredApis` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApis(MemorySegment value) { pLayeredApis(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR asSlice(long index) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLayeredApiPropertiesListKHR`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR asSlice(long index, long count) { return new VkPhysicalDeviceLayeredApiPropertiesListKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceLayeredApiPropertiesListKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR at(long index, Consumer<VkPhysicalDeviceLayeredApiPropertiesListKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `layeredApiCount` at the given index}
    /// @param index the index of the struct buffer
    public int layeredApiCountAt(long index) { return layeredApiCount(this.segment(), index); }
    /// Sets `layeredApiCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR layeredApiCountAt(long index, int value) { layeredApiCount(this.segment(), index, value); return this; }

    /// {@return `pLayeredApis` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pLayeredApisAt(long index) { return pLayeredApis(this.segment(), index); }
    /// Sets `pLayeredApis` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredApiPropertiesListKHR pLayeredApisAt(long index, MemorySegment value) { pLayeredApis(this.segment(), index, value); return this; }

}
