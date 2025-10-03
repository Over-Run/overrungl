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

/// Represents `VkQueueFamilyProperties2KHR`.
/// ## Layout
/// ```
/// struct VkQueueFamilyProperties2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkQueueFamilyProperties) VkQueueFamilyProperties queueFamilyProperties;
/// };
/// ```
public final class VkQueueFamilyProperties2KHR extends GroupType {
    /// The struct layout of `VkQueueFamilyProperties2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkQueueFamilyProperties.LAYOUT.withName("queueFamilyProperties")
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
    /// The byte offset of `queueFamilyProperties`.
    public static final long OFFSET_queueFamilyProperties = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyProperties"));
    /// The memory layout of `queueFamilyProperties`.
    public static final MemoryLayout LAYOUT_queueFamilyProperties = LAYOUT.select(PathElement.groupElement("queueFamilyProperties"));

    /// Creates `VkQueueFamilyProperties2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyProperties2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyProperties2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyProperties2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyProperties2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyProperties2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyProperties2KHR`
    public static VkQueueFamilyProperties2KHR alloc(SegmentAllocator allocator) { return new VkQueueFamilyProperties2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyProperties2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyProperties2KHR`
    public static VkQueueFamilyProperties2KHR alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyProperties2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyProperties2KHR copyFrom(VkQueueFamilyProperties2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyProperties2KHR reinterpret(long count) { return new VkQueueFamilyProperties2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueueFamilyProperties2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueueFamilyProperties2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment queueFamilyProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_queueFamilyProperties, index), LAYOUT_queueFamilyProperties); }
    /// {@return `queueFamilyProperties`}
    public MemorySegment queueFamilyProperties() { return queueFamilyProperties(this.segment(), 0L); }
    /// Sets `queueFamilyProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_queueFamilyProperties, index), LAYOUT_queueFamilyProperties.byteSize()); }
    /// Sets `queueFamilyProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2KHR queueFamilyProperties(MemorySegment value) { queueFamilyProperties(this.segment(), 0L, value); return this; }
    /// Accepts `queueFamilyProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyProperties2KHR queueFamilyProperties(Consumer<overrungl.vulkan.struct.VkQueueFamilyProperties> func) { func.accept(overrungl.vulkan.struct.VkQueueFamilyProperties.of(queueFamilyProperties())); return this; }

    /// Creates a slice of `VkQueueFamilyProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyProperties2KHR`
    public VkQueueFamilyProperties2KHR asSlice(long index) { return new VkQueueFamilyProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyProperties2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyProperties2KHR`
    public VkQueueFamilyProperties2KHR asSlice(long index, long count) { return new VkQueueFamilyProperties2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyProperties2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyProperties2KHR at(long index, Consumer<VkQueueFamilyProperties2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queueFamilyProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment queueFamilyPropertiesAt(long index) { return queueFamilyProperties(this.segment(), index); }
    /// Sets `queueFamilyProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2KHR queueFamilyPropertiesAt(long index, MemorySegment value) { queueFamilyProperties(this.segment(), index, value); return this; }
    /// Accepts `queueFamilyProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyProperties2KHR queueFamilyPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkQueueFamilyProperties> func) { func.accept(overrungl.vulkan.struct.VkQueueFamilyProperties.of(queueFamilyPropertiesAt(index))); return this; }

}
