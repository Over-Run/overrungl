// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelineRobustnessPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelineRobustnessPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
///     (int) VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
///     (int) VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
///     (int) VkPipelineRobustnessImageBehavior defaultRobustnessImages;
/// };
/// ```
public final class VkPhysicalDevicePipelineRobustnessPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDevicePipelineRobustnessPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages")
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
    /// The byte offset of `defaultRobustnessStorageBuffers`.
    public static final long OFFSET_defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The memory layout of `defaultRobustnessStorageBuffers`.
    public static final MemoryLayout LAYOUT_defaultRobustnessStorageBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The [VarHandle] of `defaultRobustnessStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The byte offset of `defaultRobustnessUniformBuffers`.
    public static final long OFFSET_defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The memory layout of `defaultRobustnessUniformBuffers`.
    public static final MemoryLayout LAYOUT_defaultRobustnessUniformBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The [VarHandle] of `defaultRobustnessUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The byte offset of `defaultRobustnessVertexInputs`.
    public static final long OFFSET_defaultRobustnessVertexInputs = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The memory layout of `defaultRobustnessVertexInputs`.
    public static final MemoryLayout LAYOUT_defaultRobustnessVertexInputs = LAYOUT.select(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The [VarHandle] of `defaultRobustnessVertexInputs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessVertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The byte offset of `defaultRobustnessImages`.
    public static final long OFFSET_defaultRobustnessImages = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessImages"));
    /// The memory layout of `defaultRobustnessImages`.
    public static final MemoryLayout LAYOUT_defaultRobustnessImages = LAYOUT.select(PathElement.groupElement("defaultRobustnessImages"));
    /// The [VarHandle] of `defaultRobustnessImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessImages"));

    /// Creates `VkPhysicalDevicePipelineRobustnessPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePipelineRobustnessPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePipelineRobustnessPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePipelineRobustnessPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelineRobustnessPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePipelineRobustnessPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePipelineRobustnessPropertiesEXT`
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePipelineRobustnessPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePipelineRobustnessPropertiesEXT`
    public static VkPhysicalDevicePipelineRobustnessPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT copyFrom(VkPhysicalDevicePipelineRobustnessPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT reinterpret(long count) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessStorageBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessStorageBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessStorageBuffers`}
    public int defaultRobustnessStorageBuffers() { return defaultRobustnessStorageBuffers(this.segment(), 0L); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessStorageBuffers(MemorySegment segment, long index, int value) { VH_defaultRobustnessStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessStorageBuffers(int value) { defaultRobustnessStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessUniformBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessUniformBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessUniformBuffers`}
    public int defaultRobustnessUniformBuffers() { return defaultRobustnessUniformBuffers(this.segment(), 0L); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessUniformBuffers(MemorySegment segment, long index, int value) { VH_defaultRobustnessUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessUniformBuffers(int value) { defaultRobustnessUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessVertexInputs(MemorySegment segment, long index) { return (int) VH_defaultRobustnessVertexInputs.get(segment, 0L, index); }
    /// {@return `defaultRobustnessVertexInputs`}
    public int defaultRobustnessVertexInputs() { return defaultRobustnessVertexInputs(this.segment(), 0L); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessVertexInputs(MemorySegment segment, long index, int value) { VH_defaultRobustnessVertexInputs.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessVertexInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessVertexInputs(int value) { defaultRobustnessVertexInputs(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessImages(MemorySegment segment, long index) { return (int) VH_defaultRobustnessImages.get(segment, 0L, index); }
    /// {@return `defaultRobustnessImages`}
    public int defaultRobustnessImages() { return defaultRobustnessImages(this.segment(), 0L); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessImages(MemorySegment segment, long index, int value) { VH_defaultRobustnessImages.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessImages(int value) { defaultRobustnessImages(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePipelineRobustnessPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePipelineRobustnessPropertiesEXT`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT asSlice(long index) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePipelineRobustnessPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePipelineRobustnessPropertiesEXT`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelineRobustnessPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePipelineRobustnessPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT at(long index, Consumer<VkPhysicalDevicePipelineRobustnessPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int defaultRobustnessStorageBuffersAt(long index) { return defaultRobustnessStorageBuffers(this.segment(), index); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessStorageBuffersAt(long index, int value) { defaultRobustnessStorageBuffers(this.segment(), index, value); return this; }

    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int defaultRobustnessUniformBuffersAt(long index) { return defaultRobustnessUniformBuffers(this.segment(), index); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessUniformBuffersAt(long index, int value) { defaultRobustnessUniformBuffers(this.segment(), index, value); return this; }

    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param index the index of the struct buffer
    public int defaultRobustnessVertexInputsAt(long index) { return defaultRobustnessVertexInputs(this.segment(), index); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessVertexInputsAt(long index, int value) { defaultRobustnessVertexInputs(this.segment(), index, value); return this; }

    /// {@return `defaultRobustnessImages` at the given index}
    /// @param index the index of the struct buffer
    public int defaultRobustnessImagesAt(long index) { return defaultRobustnessImages(this.segment(), index); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePipelineRobustnessPropertiesEXT defaultRobustnessImagesAt(long index, int value) { defaultRobustnessImages(this.segment(), index, value); return this; }

}
