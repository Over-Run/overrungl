// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderSubgroupUniformControlFlow;
/// };
/// ```
public final class VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupUniformControlFlow")
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
    /// The byte offset of `shaderSubgroupUniformControlFlow`.
    public static final long OFFSET_shaderSubgroupUniformControlFlow = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupUniformControlFlow"));
    /// The memory layout of `shaderSubgroupUniformControlFlow`.
    public static final MemoryLayout LAYOUT_shaderSubgroupUniformControlFlow = LAYOUT.select(PathElement.groupElement("shaderSubgroupUniformControlFlow"));
    /// The [VarHandle] of `shaderSubgroupUniformControlFlow` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSubgroupUniformControlFlow = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupUniformControlFlow"));

    /// Creates `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR copyFrom(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderSubgroupUniformControlFlow` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSubgroupUniformControlFlow(MemorySegment segment, long index) { return (int) VH_shaderSubgroupUniformControlFlow.get(segment, 0L, index); }
    /// {@return `shaderSubgroupUniformControlFlow`}
    public int shaderSubgroupUniformControlFlow() { return shaderSubgroupUniformControlFlow(this.segment(), 0L); }
    /// Sets `shaderSubgroupUniformControlFlow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSubgroupUniformControlFlow(MemorySegment segment, long index, int value) { VH_shaderSubgroupUniformControlFlow.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupUniformControlFlow` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR shaderSubgroupUniformControlFlow(int value) { shaderSubgroupUniformControlFlow(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderSubgroupUniformControlFlow` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSubgroupUniformControlFlowAt(long index) { return shaderSubgroupUniformControlFlow(this.segment(), index); }
    /// Sets `shaderSubgroupUniformControlFlow` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR shaderSubgroupUniformControlFlowAt(long index, int value) { shaderSubgroupUniformControlFlow(this.segment(), index, value); return this; }

}
