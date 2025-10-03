// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.msft.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLayeredDriverPropertiesMSFT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkLayeredDriverUnderlyingApiMSFT underlyingAPI;
/// };
/// ```
public final class VkPhysicalDeviceLayeredDriverPropertiesMSFT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("underlyingAPI")
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
    /// The byte offset of `underlyingAPI`.
    public static final long OFFSET_underlyingAPI = LAYOUT.byteOffset(PathElement.groupElement("underlyingAPI"));
    /// The memory layout of `underlyingAPI`.
    public static final MemoryLayout LAYOUT_underlyingAPI = LAYOUT.select(PathElement.groupElement("underlyingAPI"));
    /// The [VarHandle] of `underlyingAPI` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_underlyingAPI = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("underlyingAPI")));

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLayeredDriverPropertiesMSFT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceLayeredDriverPropertiesMSFT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public static VkPhysicalDeviceLayeredDriverPropertiesMSFT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT copyFrom(VkPhysicalDeviceLayeredDriverPropertiesMSFT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT reinterpret(long count) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `underlyingAPI` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int underlyingAPI(MemorySegment segment, long index) { return (int) VH_underlyingAPI.get().get(segment, 0L, index); }
    /// {@return `underlyingAPI`}
    public int underlyingAPI() { return underlyingAPI(this.segment(), 0L); }
    /// Sets `underlyingAPI` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void underlyingAPI(MemorySegment segment, long index, int value) { VH_underlyingAPI.get().set(segment, 0L, index, value); }
    /// Sets `underlyingAPI` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT underlyingAPI(int value) { underlyingAPI(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT asSlice(long index) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLayeredDriverPropertiesMSFT`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT asSlice(long index, long count) { return new VkPhysicalDeviceLayeredDriverPropertiesMSFT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceLayeredDriverPropertiesMSFT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT at(long index, Consumer<VkPhysicalDeviceLayeredDriverPropertiesMSFT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `underlyingAPI` at the given index}
    /// @param index the index of the struct buffer
    public int underlyingAPIAt(long index) { return underlyingAPI(this.segment(), index); }
    /// Sets `underlyingAPI` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLayeredDriverPropertiesMSFT underlyingAPIAt(long index, int value) { underlyingAPI(this.segment(), index, value); return this; }

}
