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

/// Represents `VkRayTracingPipelineInterfaceCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkRayTracingPipelineInterfaceCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t maxPipelineRayPayloadSize;
///     uint32_t maxPipelineRayHitAttributeSize;
/// };
/// ```
public final class VkRayTracingPipelineInterfaceCreateInfoKHR extends GroupType {
    /// The struct layout of `VkRayTracingPipelineInterfaceCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayHitAttributeSize")
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
    /// The byte offset of `maxPipelineRayPayloadSize`.
    public static final long OFFSET_maxPipelineRayPayloadSize = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayPayloadSize"));
    /// The memory layout of `maxPipelineRayPayloadSize`.
    public static final MemoryLayout LAYOUT_maxPipelineRayPayloadSize = LAYOUT.select(PathElement.groupElement("maxPipelineRayPayloadSize"));
    /// The [VarHandle] of `maxPipelineRayPayloadSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPipelineRayPayloadSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayPayloadSize"));
    /// The byte offset of `maxPipelineRayHitAttributeSize`.
    public static final long OFFSET_maxPipelineRayHitAttributeSize = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayHitAttributeSize"));
    /// The memory layout of `maxPipelineRayHitAttributeSize`.
    public static final MemoryLayout LAYOUT_maxPipelineRayHitAttributeSize = LAYOUT.select(PathElement.groupElement("maxPipelineRayHitAttributeSize"));
    /// The [VarHandle] of `maxPipelineRayHitAttributeSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPipelineRayHitAttributeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineRayHitAttributeSize"));

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRayTracingPipelineInterfaceCreateInfoKHR`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRayTracingPipelineInterfaceCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRayTracingPipelineInterfaceCreateInfoKHR`
    public static VkRayTracingPipelineInterfaceCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR copyFrom(VkRayTracingPipelineInterfaceCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRayTracingPipelineInterfaceCreateInfoKHR reinterpret(long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRayTracingPipelineInterfaceCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxPipelineRayPayloadSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPipelineRayPayloadSize(MemorySegment segment, long index) { return (int) VH_maxPipelineRayPayloadSize.get(segment, 0L, index); }
    /// {@return `maxPipelineRayPayloadSize`}
    public int maxPipelineRayPayloadSize() { return maxPipelineRayPayloadSize(this.segment(), 0L); }
    /// Sets `maxPipelineRayPayloadSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPipelineRayPayloadSize(MemorySegment segment, long index, int value) { VH_maxPipelineRayPayloadSize.set(segment, 0L, index, value); }
    /// Sets `maxPipelineRayPayloadSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSize(int value) { maxPipelineRayPayloadSize(this.segment(), 0L, value); return this; }

    /// {@return `maxPipelineRayHitAttributeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPipelineRayHitAttributeSize(MemorySegment segment, long index) { return (int) VH_maxPipelineRayHitAttributeSize.get(segment, 0L, index); }
    /// {@return `maxPipelineRayHitAttributeSize`}
    public int maxPipelineRayHitAttributeSize() { return maxPipelineRayHitAttributeSize(this.segment(), 0L); }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPipelineRayHitAttributeSize(MemorySegment segment, long index, int value) { VH_maxPipelineRayHitAttributeSize.set(segment, 0L, index, value); }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSize(int value) { maxPipelineRayHitAttributeSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkRayTracingPipelineInterfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRayTracingPipelineInterfaceCreateInfoKHR`
    public VkRayTracingPipelineInterfaceCreateInfoKHR asSlice(long index) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRayTracingPipelineInterfaceCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRayTracingPipelineInterfaceCreateInfoKHR`
    public VkRayTracingPipelineInterfaceCreateInfoKHR asSlice(long index, long count) { return new VkRayTracingPipelineInterfaceCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRayTracingPipelineInterfaceCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR at(long index, Consumer<VkRayTracingPipelineInterfaceCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxPipelineRayPayloadSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxPipelineRayPayloadSizeAt(long index) { return maxPipelineRayPayloadSize(this.segment(), index); }
    /// Sets `maxPipelineRayPayloadSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSizeAt(long index, int value) { maxPipelineRayPayloadSize(this.segment(), index, value); return this; }

    /// {@return `maxPipelineRayHitAttributeSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxPipelineRayHitAttributeSizeAt(long index) { return maxPipelineRayHitAttributeSize(this.segment(), index); }
    /// Sets `maxPipelineRayHitAttributeSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSizeAt(long index, int value) { maxPipelineRayHitAttributeSize(this.segment(), index, value); return this; }

}
