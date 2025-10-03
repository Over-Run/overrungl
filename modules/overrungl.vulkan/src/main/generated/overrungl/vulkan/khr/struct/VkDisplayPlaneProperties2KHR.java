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

/// Represents `VkDisplayPlaneProperties2KHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlaneProperties2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkDisplayPlanePropertiesKHR) VkDisplayPlanePropertiesKHR displayPlaneProperties;
/// };
/// ```
public final class VkDisplayPlaneProperties2KHR extends GroupType {
    /// The struct layout of `VkDisplayPlaneProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayPlanePropertiesKHR.LAYOUT.withName("displayPlaneProperties")
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
    /// The byte offset of `displayPlaneProperties`.
    public static final long OFFSET_displayPlaneProperties = LAYOUT.byteOffset(PathElement.groupElement("displayPlaneProperties"));
    /// The memory layout of `displayPlaneProperties`.
    public static final MemoryLayout LAYOUT_displayPlaneProperties = LAYOUT.select(PathElement.groupElement("displayPlaneProperties"));

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDisplayPlaneProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneProperties2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDisplayPlaneProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayPlaneProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneProperties2KHR`
    public static VkDisplayPlaneProperties2KHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneProperties2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDisplayPlaneProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlaneProperties2KHR`
    public static VkDisplayPlaneProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneProperties2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPlaneProperties2KHR copyFrom(VkDisplayPlaneProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDisplayPlaneProperties2KHR reinterpret(long count) { return new VkDisplayPlaneProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDisplayPlaneProperties2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDisplayPlaneProperties2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `displayPlaneProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displayPlaneProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPlaneProperties, index), LAYOUT_displayPlaneProperties); }
    /// {@return `displayPlaneProperties`}
    public MemorySegment displayPlaneProperties() { return displayPlaneProperties(this.segment(), 0L); }
    /// Sets `displayPlaneProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayPlaneProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPlaneProperties, index), LAYOUT_displayPlaneProperties.byteSize()); }
    /// Sets `displayPlaneProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR displayPlaneProperties(MemorySegment value) { displayPlaneProperties(this.segment(), 0L, value); return this; }
    /// Accepts `displayPlaneProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneProperties2KHR displayPlaneProperties(Consumer<overrungl.vulkan.khr.struct.VkDisplayPlanePropertiesKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkDisplayPlanePropertiesKHR.of(displayPlaneProperties())); return this; }

    /// Creates a slice of `VkDisplayPlaneProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayPlaneProperties2KHR`
    public VkDisplayPlaneProperties2KHR asSlice(long index) { return new VkDisplayPlaneProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDisplayPlaneProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayPlaneProperties2KHR`
    public VkDisplayPlaneProperties2KHR asSlice(long index, long count) { return new VkDisplayPlaneProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDisplayPlaneProperties2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDisplayPlaneProperties2KHR at(long index, Consumer<VkDisplayPlaneProperties2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `displayPlaneProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment displayPlanePropertiesAt(long index) { return displayPlaneProperties(this.segment(), index); }
    /// Sets `displayPlaneProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneProperties2KHR displayPlanePropertiesAt(long index, MemorySegment value) { displayPlaneProperties(this.segment(), index, value); return this; }
    /// Accepts `displayPlaneProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneProperties2KHR displayPlanePropertiesAt(long index, Consumer<overrungl.vulkan.khr.struct.VkDisplayPlanePropertiesKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkDisplayPlanePropertiesKHR.of(displayPlanePropertiesAt(index))); return this; }

}
