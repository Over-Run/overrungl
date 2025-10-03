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

/// Represents `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceNestedCommandBufferPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxCommandBufferNestingLevel;
/// };
/// ```
public final class VkPhysicalDeviceNestedCommandBufferPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxCommandBufferNestingLevel")
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
    /// The byte offset of `maxCommandBufferNestingLevel`.
    public static final long OFFSET_maxCommandBufferNestingLevel = LAYOUT.byteOffset(PathElement.groupElement("maxCommandBufferNestingLevel"));
    /// The memory layout of `maxCommandBufferNestingLevel`.
    public static final MemoryLayout LAYOUT_maxCommandBufferNestingLevel = LAYOUT.select(PathElement.groupElement("maxCommandBufferNestingLevel"));
    /// The [VarHandle] of `maxCommandBufferNestingLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxCommandBufferNestingLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCommandBufferNestingLevel")));

    /// Creates `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`
    public static VkPhysicalDeviceNestedCommandBufferPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT copyFrom(VkPhysicalDeviceNestedCommandBufferPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxCommandBufferNestingLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCommandBufferNestingLevel(MemorySegment segment, long index) { return (int) VH_maxCommandBufferNestingLevel.get().get(segment, 0L, index); }
    /// {@return `maxCommandBufferNestingLevel`}
    public int maxCommandBufferNestingLevel() { return maxCommandBufferNestingLevel(this.segment(), 0L); }
    /// Sets `maxCommandBufferNestingLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCommandBufferNestingLevel(MemorySegment segment, long index, int value) { VH_maxCommandBufferNestingLevel.get().set(segment, 0L, index, value); }
    /// Sets `maxCommandBufferNestingLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT maxCommandBufferNestingLevel(int value) { maxCommandBufferNestingLevel(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceNestedCommandBufferPropertiesEXT`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceNestedCommandBufferPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceNestedCommandBufferPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT at(long index, Consumer<VkPhysicalDeviceNestedCommandBufferPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxCommandBufferNestingLevel` at the given index}
    /// @param index the index of the struct buffer
    public int maxCommandBufferNestingLevelAt(long index) { return maxCommandBufferNestingLevel(this.segment(), index); }
    /// Sets `maxCommandBufferNestingLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceNestedCommandBufferPropertiesEXT maxCommandBufferNestingLevelAt(long index, int value) { maxCommandBufferNestingLevel(this.segment(), index, value); return this; }

}
