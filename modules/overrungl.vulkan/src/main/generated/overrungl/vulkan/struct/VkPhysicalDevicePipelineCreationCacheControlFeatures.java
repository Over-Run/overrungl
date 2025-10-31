// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineCreationCacheControlFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineCreationCacheControlFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 pipelineCreationCacheControl;
/// };
/// ```
public final class VkPhysicalDevicePipelineCreationCacheControlFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDevicePipelineCreationCacheControlFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineCreationCacheControl")
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
    /// The byte offset of `pipelineCreationCacheControl`.
    public static final long OFFSET_pipelineCreationCacheControl = LAYOUT.byteOffset(PathElement.groupElement("pipelineCreationCacheControl"));
    /// The memory layout of `pipelineCreationCacheControl`.
    public static final MemoryLayout LAYOUT_pipelineCreationCacheControl = LAYOUT.select(PathElement.groupElement("pipelineCreationCacheControl"));
    /// The [VarHandle] of `pipelineCreationCacheControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineCreationCacheControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCreationCacheControl"));

    /// Creates `VkPhysicalDevicePipelineCreationCacheControlFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePipelineCreationCacheControlFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePipelineCreationCacheControlFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCreationCacheControlFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePipelineCreationCacheControlFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCreationCacheControlFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePipelineCreationCacheControlFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineCreationCacheControlFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePipelineCreationCacheControlFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelineCreationCacheControlFeatures`
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineCreationCacheControlFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePipelineCreationCacheControlFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelineCreationCacheControlFeatures`
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineCreationCacheControlFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures copyFrom(VkPhysicalDevicePipelineCreationCacheControlFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePipelineCreationCacheControlFeatures reinterpret(long count) { return new VkPhysicalDevicePipelineCreationCacheControlFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePipelineCreationCacheControlFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePipelineCreationCacheControlFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineCreationCacheControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineCreationCacheControl(MemorySegment segment, long index) { return (int) VH_pipelineCreationCacheControl.get(segment, 0L, index); }
    /// {@return `pipelineCreationCacheControl`}
    public int pipelineCreationCacheControl() { return pipelineCreationCacheControl(this.segment(), 0L); }
    /// Sets `pipelineCreationCacheControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineCreationCacheControl(MemorySegment segment, long index, int value) { VH_pipelineCreationCacheControl.set(segment, 0L, index, value); }
    /// Sets `pipelineCreationCacheControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures pipelineCreationCacheControl(int value) { pipelineCreationCacheControl(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePipelineCreationCacheControlFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePipelineCreationCacheControlFeatures`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures asSlice(long index) { return new VkPhysicalDevicePipelineCreationCacheControlFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePipelineCreationCacheControlFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePipelineCreationCacheControlFeatures`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures asSlice(long index, long count) { return new VkPhysicalDevicePipelineCreationCacheControlFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePipelineCreationCacheControlFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures at(long index, Consumer<VkPhysicalDevicePipelineCreationCacheControlFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelineCreationCacheControl` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineCreationCacheControlAt(long index) { return pipelineCreationCacheControl(this.segment(), index); }
    /// Sets `pipelineCreationCacheControl` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineCreationCacheControlFeatures pipelineCreationCacheControlAt(long index, int value) { pipelineCreationCacheControl(this.segment(), index, value); return this; }

}
