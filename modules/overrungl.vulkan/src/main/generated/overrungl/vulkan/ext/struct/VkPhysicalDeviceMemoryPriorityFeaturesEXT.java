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

/// Represents `VkPhysicalDeviceMemoryPriorityFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMemoryPriorityFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 memoryPriority;
/// };
/// ```
public final class VkPhysicalDeviceMemoryPriorityFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMemoryPriorityFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryPriority")
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
    /// The byte offset of `memoryPriority`.
    public static final long OFFSET_memoryPriority = LAYOUT.byteOffset(PathElement.groupElement("memoryPriority"));
    /// The memory layout of `memoryPriority`.
    public static final MemoryLayout LAYOUT_memoryPriority = LAYOUT.select(PathElement.groupElement("memoryPriority"));
    /// The [VarHandle] of `memoryPriority` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_memoryPriority = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryPriority"));

    /// Creates `VkPhysicalDeviceMemoryPriorityFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMemoryPriorityFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMemoryPriorityFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMemoryPriorityFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryPriorityFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMemoryPriorityFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryPriorityFeaturesEXT`
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMemoryPriorityFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryPriorityFeaturesEXT`
    public static VkPhysicalDeviceMemoryPriorityFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT copyFrom(VkPhysicalDeviceMemoryPriorityFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memoryPriority` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryPriority(MemorySegment segment, long index) { return (int) VH_memoryPriority.get(segment, 0L, index); }
    /// {@return `memoryPriority`}
    public int memoryPriority() { return memoryPriority(this.segment(), 0L); }
    /// Sets `memoryPriority` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryPriority(MemorySegment segment, long index, int value) { VH_memoryPriority.set(segment, 0L, index, value); }
    /// Sets `memoryPriority` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT memoryPriority(int value) { memoryPriority(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMemoryPriorityFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMemoryPriorityFeaturesEXT`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMemoryPriorityFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMemoryPriorityFeaturesEXT`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMemoryPriorityFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMemoryPriorityFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMemoryPriorityFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `memoryPriority` at the given index}
    /// @param index the index of the struct buffer
    public int memoryPriorityAt(long index) { return memoryPriority(this.segment(), index); }
    /// Sets `memoryPriority` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryPriorityFeaturesEXT memoryPriorityAt(long index, int value) { memoryPriority(this.segment(), index, value); return this; }

}
