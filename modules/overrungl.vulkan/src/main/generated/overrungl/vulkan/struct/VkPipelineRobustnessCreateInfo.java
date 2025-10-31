// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineRobustnessCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineRobustnessCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkPipelineRobustnessBufferBehavior storageBuffers;
///     (int) VkPipelineRobustnessBufferBehavior uniformBuffers;
///     (int) VkPipelineRobustnessBufferBehavior vertexInputs;
///     (int) VkPipelineRobustnessImageBehavior images;
/// };
/// ```
public final class VkPipelineRobustnessCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineRobustnessCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
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
    /// The byte offset of `storageBuffers`.
    public static final long OFFSET_storageBuffers = LAYOUT.byteOffset(PathElement.groupElement("storageBuffers"));
    /// The memory layout of `storageBuffers`.
    public static final MemoryLayout LAYOUT_storageBuffers = LAYOUT.select(PathElement.groupElement("storageBuffers"));
    /// The [VarHandle] of `storageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffers"));
    /// The byte offset of `uniformBuffers`.
    public static final long OFFSET_uniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("uniformBuffers"));
    /// The memory layout of `uniformBuffers`.
    public static final MemoryLayout LAYOUT_uniformBuffers = LAYOUT.select(PathElement.groupElement("uniformBuffers"));
    /// The [VarHandle] of `uniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformBuffers"));
    /// The byte offset of `vertexInputs`.
    public static final long OFFSET_vertexInputs = LAYOUT.byteOffset(PathElement.groupElement("vertexInputs"));
    /// The memory layout of `vertexInputs`.
    public static final MemoryLayout LAYOUT_vertexInputs = LAYOUT.select(PathElement.groupElement("vertexInputs"));
    /// The [VarHandle] of `vertexInputs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexInputs"));
    /// The byte offset of `images`.
    public static final long OFFSET_images = LAYOUT.byteOffset(PathElement.groupElement("images"));
    /// The memory layout of `images`.
    public static final MemoryLayout LAYOUT_images = LAYOUT.select(PathElement.groupElement("images"));
    /// The [VarHandle] of `images` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_images = LAYOUT.arrayElementVarHandle(PathElement.groupElement("images"));

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineRobustnessCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRobustnessCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRobustnessCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineRobustnessCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRobustnessCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineRobustnessCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineRobustnessCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRobustnessCreateInfo`
    public static VkPipelineRobustnessCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineRobustnessCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineRobustnessCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRobustnessCreateInfo`
    public static VkPipelineRobustnessCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineRobustnessCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineRobustnessCreateInfo copyFrom(VkPipelineRobustnessCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineRobustnessCreateInfo reinterpret(long count) { return new VkPipelineRobustnessCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineRobustnessCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineRobustnessCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageBuffers(MemorySegment segment, long index) { return (int) VH_storageBuffers.get(segment, 0L, index); }
    /// {@return `storageBuffers`}
    public int storageBuffers() { return storageBuffers(this.segment(), 0L); }
    /// Sets `storageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBuffers(MemorySegment segment, long index, int value) { VH_storageBuffers.set(segment, 0L, index, value); }
    /// Sets `storageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo storageBuffers(int value) { storageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `uniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformBuffers(MemorySegment segment, long index) { return (int) VH_uniformBuffers.get(segment, 0L, index); }
    /// {@return `uniformBuffers`}
    public int uniformBuffers() { return uniformBuffers(this.segment(), 0L); }
    /// Sets `uniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformBuffers(MemorySegment segment, long index, int value) { VH_uniformBuffers.set(segment, 0L, index, value); }
    /// Sets `uniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo uniformBuffers(int value) { uniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `vertexInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexInputs(MemorySegment segment, long index) { return (int) VH_vertexInputs.get(segment, 0L, index); }
    /// {@return `vertexInputs`}
    public int vertexInputs() { return vertexInputs(this.segment(), 0L); }
    /// Sets `vertexInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexInputs(MemorySegment segment, long index, int value) { VH_vertexInputs.set(segment, 0L, index, value); }
    /// Sets `vertexInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo vertexInputs(int value) { vertexInputs(this.segment(), 0L, value); return this; }

    /// {@return `images` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int images(MemorySegment segment, long index) { return (int) VH_images.get(segment, 0L, index); }
    /// {@return `images`}
    public int images() { return images(this.segment(), 0L); }
    /// Sets `images` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void images(MemorySegment segment, long index, int value) { VH_images.set(segment, 0L, index, value); }
    /// Sets `images` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo images(int value) { images(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineRobustnessCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRobustnessCreateInfo`
    public VkPipelineRobustnessCreateInfo asSlice(long index) { return new VkPipelineRobustnessCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineRobustnessCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRobustnessCreateInfo`
    public VkPipelineRobustnessCreateInfo asSlice(long index, long count) { return new VkPipelineRobustnessCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineRobustnessCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineRobustnessCreateInfo at(long index, Consumer<VkPipelineRobustnessCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `storageBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int storageBuffersAt(long index) { return storageBuffers(this.segment(), index); }
    /// Sets `storageBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo storageBuffersAt(long index, int value) { storageBuffers(this.segment(), index, value); return this; }

    /// {@return `uniformBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int uniformBuffersAt(long index) { return uniformBuffers(this.segment(), index); }
    /// Sets `uniformBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo uniformBuffersAt(long index, int value) { uniformBuffers(this.segment(), index, value); return this; }

    /// {@return `vertexInputs` at the given index}
    /// @param index the index of the struct buffer
    public int vertexInputsAt(long index) { return vertexInputs(this.segment(), index); }
    /// Sets `vertexInputs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo vertexInputsAt(long index, int value) { vertexInputs(this.segment(), index, value); return this; }

    /// {@return `images` at the given index}
    /// @param index the index of the struct buffer
    public int imagesAt(long index) { return images(this.segment(), index); }
    /// Sets `images` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineRobustnessCreateInfo imagesAt(long index, int value) { images(this.segment(), index, value); return this; }

}
