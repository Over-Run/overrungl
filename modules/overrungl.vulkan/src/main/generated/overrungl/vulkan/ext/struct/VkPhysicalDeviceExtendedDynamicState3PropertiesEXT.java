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

/// Represents `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedDynamicState3PropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 dynamicPrimitiveTopologyUnrestricted;
/// };
/// ```
public final class VkPhysicalDeviceExtendedDynamicState3PropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicPrimitiveTopologyUnrestricted")
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
    /// The byte offset of `dynamicPrimitiveTopologyUnrestricted`.
    public static final long OFFSET_dynamicPrimitiveTopologyUnrestricted = LAYOUT.byteOffset(PathElement.groupElement("dynamicPrimitiveTopologyUnrestricted"));
    /// The memory layout of `dynamicPrimitiveTopologyUnrestricted`.
    public static final MemoryLayout LAYOUT_dynamicPrimitiveTopologyUnrestricted = LAYOUT.select(PathElement.groupElement("dynamicPrimitiveTopologyUnrestricted"));
    /// The [VarHandle] of `dynamicPrimitiveTopologyUnrestricted` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_dynamicPrimitiveTopologyUnrestricted = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicPrimitiveTopologyUnrestricted")));

    /// Creates `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState3PropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dynamicPrimitiveTopologyUnrestricted` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicPrimitiveTopologyUnrestricted(MemorySegment segment, long index) { return (int) VH_dynamicPrimitiveTopologyUnrestricted.get().get(segment, 0L, index); }
    /// {@return `dynamicPrimitiveTopologyUnrestricted`}
    public int dynamicPrimitiveTopologyUnrestricted() { return dynamicPrimitiveTopologyUnrestricted(this.segment(), 0L); }
    /// Sets `dynamicPrimitiveTopologyUnrestricted` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicPrimitiveTopologyUnrestricted(MemorySegment segment, long index, int value) { VH_dynamicPrimitiveTopologyUnrestricted.get().set(segment, 0L, index, value); }
    /// Sets `dynamicPrimitiveTopologyUnrestricted` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT dynamicPrimitiveTopologyUnrestricted(int value) { dynamicPrimitiveTopologyUnrestricted(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT asSlice(long index) { return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExtendedDynamicState3PropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT at(long index, Consumer<VkPhysicalDeviceExtendedDynamicState3PropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dynamicPrimitiveTopologyUnrestricted` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicPrimitiveTopologyUnrestrictedAt(long index) { return dynamicPrimitiveTopologyUnrestricted(this.segment(), index); }
    /// Sets `dynamicPrimitiveTopologyUnrestricted` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT dynamicPrimitiveTopologyUnrestrictedAt(long index, int value) { dynamicPrimitiveTopologyUnrestricted(this.segment(), index, value); return this; }

}
