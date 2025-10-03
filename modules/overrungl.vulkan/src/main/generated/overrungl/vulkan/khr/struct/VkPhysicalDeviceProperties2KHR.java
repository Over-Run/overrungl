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

/// Represents `VkPhysicalDeviceProperties2KHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceProperties2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkPhysicalDeviceProperties) VkPhysicalDeviceProperties properties;
/// };
/// ```
public final class VkPhysicalDeviceProperties2KHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkPhysicalDeviceProperties.LAYOUT.withName("properties")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `properties`.
    public static final long OFFSET_properties = LAYOUT.byteOffset(PathElement.groupElement("properties"));
    /// The memory layout of `properties`.
    public static final MemoryLayout LAYOUT_properties = LAYOUT.select(PathElement.groupElement("properties"));

    /// Creates `VkPhysicalDeviceProperties2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceProperties2KHR`
    public static VkPhysicalDeviceProperties2KHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProperties2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceProperties2KHR`
    public static VkPhysicalDeviceProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProperties2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR copyFrom(VkPhysicalDeviceProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceProperties2KHR reinterpret(long count) { return new VkPhysicalDeviceProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `properties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment properties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_properties, index), LAYOUT_properties); }
    /// {@return `properties`}
    public MemorySegment properties() { return properties(this.segment(), 0L); }
    /// Sets `properties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void properties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_properties, index), LAYOUT_properties.byteSize()); }
    /// Sets `properties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR properties(MemorySegment value) { properties(this.segment(), 0L, value); return this; }
    /// Accepts `properties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR properties(Consumer<overrungl.vulkan.struct.VkPhysicalDeviceProperties> func) { func.accept(overrungl.vulkan.struct.VkPhysicalDeviceProperties.of(properties())); return this; }

    /// Creates a slice of `VkPhysicalDeviceProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceProperties2KHR`
    public VkPhysicalDeviceProperties2KHR asSlice(long index) { return new VkPhysicalDeviceProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceProperties2KHR`
    public VkPhysicalDeviceProperties2KHR asSlice(long index, long count) { return new VkPhysicalDeviceProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceProperties2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR at(long index, Consumer<VkPhysicalDeviceProperties2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `properties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment propertiesAt(long index) { return properties(this.segment(), index); }
    /// Sets `properties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR propertiesAt(long index, MemorySegment value) { properties(this.segment(), index, value); return this; }
    /// Accepts `properties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkPhysicalDeviceProperties2KHR propertiesAt(long index, Consumer<overrungl.vulkan.struct.VkPhysicalDeviceProperties> func) { func.accept(overrungl.vulkan.struct.VkPhysicalDeviceProperties.of(propertiesAt(index))); return this; }

}
