// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelinePropertiesFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 pipelinePropertiesIdentifier;
/// };
/// ```
public final class VkPhysicalDevicePipelinePropertiesFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelinePropertiesIdentifier")
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
    /// The byte offset of `pipelinePropertiesIdentifier`.
    public static final long OFFSET_pipelinePropertiesIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelinePropertiesIdentifier"));
    /// The memory layout of `pipelinePropertiesIdentifier`.
    public static final MemoryLayout LAYOUT_pipelinePropertiesIdentifier = LAYOUT.select(PathElement.groupElement("pipelinePropertiesIdentifier"));
    /// The [VarHandle] of `pipelinePropertiesIdentifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelinePropertiesIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelinePropertiesIdentifier"));

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePipelinePropertiesFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT copyFrom(VkPhysicalDevicePipelinePropertiesFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelinePropertiesIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelinePropertiesIdentifier(MemorySegment segment, long index) { return (int) VH_pipelinePropertiesIdentifier.get(segment, 0L, index); }
    /// {@return `pipelinePropertiesIdentifier`}
    public int pipelinePropertiesIdentifier() { return pipelinePropertiesIdentifier(this.segment(), 0L); }
    /// Sets `pipelinePropertiesIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelinePropertiesIdentifier(MemorySegment segment, long index, int value) { VH_pipelinePropertiesIdentifier.set(segment, 0L, index, value); }
    /// Sets `pipelinePropertiesIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifier(int value) { pipelinePropertiesIdentifier(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePipelinePropertiesFeaturesEXT`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePipelinePropertiesFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT at(long index, Consumer<VkPhysicalDevicePipelinePropertiesFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelinePropertiesIdentifier` at the given index}
    /// @param index the index of the struct buffer
    public int pipelinePropertiesIdentifierAt(long index) { return pipelinePropertiesIdentifier(this.segment(), index); }
    /// Sets `pipelinePropertiesIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifierAt(long index, int value) { pipelinePropertiesIdentifier(this.segment(), index, value); return this; }

}
