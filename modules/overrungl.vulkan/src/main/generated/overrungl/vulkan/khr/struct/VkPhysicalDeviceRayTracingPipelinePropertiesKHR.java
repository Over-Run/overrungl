// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRayRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint32_t shaderGroupHandleCaptureReplaySize;
///     uint32_t maxRayDispatchInvocationCount;
///     uint32_t shaderGroupHandleAlignment;
///     uint32_t maxRayHitAttributeSize;
/// };
/// ```
public final class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRayRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleCaptureReplaySize"),
        ValueLayout.JAVA_INT.withName("maxRayDispatchInvocationCount"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleAlignment"),
        ValueLayout.JAVA_INT.withName("maxRayHitAttributeSize")
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
    /// The byte offset of `shaderGroupHandleSize`.
    public static final long OFFSET_shaderGroupHandleSize = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleSize"));
    /// The memory layout of `shaderGroupHandleSize`.
    public static final MemoryLayout LAYOUT_shaderGroupHandleSize = LAYOUT.select(PathElement.groupElement("shaderGroupHandleSize"));
    /// The [VarHandle] of `shaderGroupHandleSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderGroupHandleSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleSize"));
    /// The byte offset of `maxRayRecursionDepth`.
    public static final long OFFSET_maxRayRecursionDepth = LAYOUT.byteOffset(PathElement.groupElement("maxRayRecursionDepth"));
    /// The memory layout of `maxRayRecursionDepth`.
    public static final MemoryLayout LAYOUT_maxRayRecursionDepth = LAYOUT.select(PathElement.groupElement("maxRayRecursionDepth"));
    /// The [VarHandle] of `maxRayRecursionDepth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRayRecursionDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayRecursionDepth"));
    /// The byte offset of `maxShaderGroupStride`.
    public static final long OFFSET_maxShaderGroupStride = LAYOUT.byteOffset(PathElement.groupElement("maxShaderGroupStride"));
    /// The memory layout of `maxShaderGroupStride`.
    public static final MemoryLayout LAYOUT_maxShaderGroupStride = LAYOUT.select(PathElement.groupElement("maxShaderGroupStride"));
    /// The [VarHandle] of `maxShaderGroupStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxShaderGroupStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxShaderGroupStride"));
    /// The byte offset of `shaderGroupBaseAlignment`.
    public static final long OFFSET_shaderGroupBaseAlignment = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The memory layout of `shaderGroupBaseAlignment`.
    public static final MemoryLayout LAYOUT_shaderGroupBaseAlignment = LAYOUT.select(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The [VarHandle] of `shaderGroupBaseAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderGroupBaseAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
    /// The byte offset of `shaderGroupHandleCaptureReplaySize`.
    public static final long OFFSET_shaderGroupHandleCaptureReplaySize = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    /// The memory layout of `shaderGroupHandleCaptureReplaySize`.
    public static final MemoryLayout LAYOUT_shaderGroupHandleCaptureReplaySize = LAYOUT.select(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    /// The [VarHandle] of `shaderGroupHandleCaptureReplaySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderGroupHandleCaptureReplaySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
    /// The byte offset of `maxRayDispatchInvocationCount`.
    public static final long OFFSET_maxRayDispatchInvocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxRayDispatchInvocationCount"));
    /// The memory layout of `maxRayDispatchInvocationCount`.
    public static final MemoryLayout LAYOUT_maxRayDispatchInvocationCount = LAYOUT.select(PathElement.groupElement("maxRayDispatchInvocationCount"));
    /// The [VarHandle] of `maxRayDispatchInvocationCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRayDispatchInvocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayDispatchInvocationCount"));
    /// The byte offset of `shaderGroupHandleAlignment`.
    public static final long OFFSET_shaderGroupHandleAlignment = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleAlignment"));
    /// The memory layout of `shaderGroupHandleAlignment`.
    public static final MemoryLayout LAYOUT_shaderGroupHandleAlignment = LAYOUT.select(PathElement.groupElement("shaderGroupHandleAlignment"));
    /// The [VarHandle] of `shaderGroupHandleAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderGroupHandleAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderGroupHandleAlignment"));
    /// The byte offset of `maxRayHitAttributeSize`.
    public static final long OFFSET_maxRayHitAttributeSize = LAYOUT.byteOffset(PathElement.groupElement("maxRayHitAttributeSize"));
    /// The memory layout of `maxRayHitAttributeSize`.
    public static final MemoryLayout LAYOUT_maxRayHitAttributeSize = LAYOUT.select(PathElement.groupElement("maxRayHitAttributeSize"));
    /// The [VarHandle] of `maxRayHitAttributeSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxRayHitAttributeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxRayHitAttributeSize"));

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR copyFrom(VkPhysicalDeviceRayTracingPipelinePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderGroupHandleSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderGroupHandleSize(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleSize.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleSize`}
    public int shaderGroupHandleSize() { return shaderGroupHandleSize(this.segment(), 0L); }
    /// Sets `shaderGroupHandleSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderGroupHandleSize(MemorySegment segment, long index, int value) { VH_shaderGroupHandleSize.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleSize(int value) { shaderGroupHandleSize(this.segment(), 0L, value); return this; }

    /// {@return `maxRayRecursionDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRayRecursionDepth(MemorySegment segment, long index) { return (int) VH_maxRayRecursionDepth.get(segment, 0L, index); }
    /// {@return `maxRayRecursionDepth`}
    public int maxRayRecursionDepth() { return maxRayRecursionDepth(this.segment(), 0L); }
    /// Sets `maxRayRecursionDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRayRecursionDepth(MemorySegment segment, long index, int value) { VH_maxRayRecursionDepth.set(segment, 0L, index, value); }
    /// Sets `maxRayRecursionDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayRecursionDepth(int value) { maxRayRecursionDepth(this.segment(), 0L, value); return this; }

    /// {@return `maxShaderGroupStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxShaderGroupStride(MemorySegment segment, long index) { return (int) VH_maxShaderGroupStride.get(segment, 0L, index); }
    /// {@return `maxShaderGroupStride`}
    public int maxShaderGroupStride() { return maxShaderGroupStride(this.segment(), 0L); }
    /// Sets `maxShaderGroupStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxShaderGroupStride(MemorySegment segment, long index, int value) { VH_maxShaderGroupStride.set(segment, 0L, index, value); }
    /// Sets `maxShaderGroupStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxShaderGroupStride(int value) { maxShaderGroupStride(this.segment(), 0L, value); return this; }

    /// {@return `shaderGroupBaseAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderGroupBaseAlignment(MemorySegment segment, long index) { return (int) VH_shaderGroupBaseAlignment.get(segment, 0L, index); }
    /// {@return `shaderGroupBaseAlignment`}
    public int shaderGroupBaseAlignment() { return shaderGroupBaseAlignment(this.segment(), 0L); }
    /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderGroupBaseAlignment(MemorySegment segment, long index, int value) { VH_shaderGroupBaseAlignment.set(segment, 0L, index, value); }
    /// Sets `shaderGroupBaseAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupBaseAlignment(int value) { shaderGroupBaseAlignment(this.segment(), 0L, value); return this; }

    /// {@return `shaderGroupHandleCaptureReplaySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderGroupHandleCaptureReplaySize(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleCaptureReplaySize.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleCaptureReplaySize`}
    public int shaderGroupHandleCaptureReplaySize() { return shaderGroupHandleCaptureReplaySize(this.segment(), 0L); }
    /// Sets `shaderGroupHandleCaptureReplaySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderGroupHandleCaptureReplaySize(MemorySegment segment, long index, int value) { VH_shaderGroupHandleCaptureReplaySize.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleCaptureReplaySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleCaptureReplaySize(int value) { shaderGroupHandleCaptureReplaySize(this.segment(), 0L, value); return this; }

    /// {@return `maxRayDispatchInvocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRayDispatchInvocationCount(MemorySegment segment, long index) { return (int) VH_maxRayDispatchInvocationCount.get(segment, 0L, index); }
    /// {@return `maxRayDispatchInvocationCount`}
    public int maxRayDispatchInvocationCount() { return maxRayDispatchInvocationCount(this.segment(), 0L); }
    /// Sets `maxRayDispatchInvocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRayDispatchInvocationCount(MemorySegment segment, long index, int value) { VH_maxRayDispatchInvocationCount.set(segment, 0L, index, value); }
    /// Sets `maxRayDispatchInvocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayDispatchInvocationCount(int value) { maxRayDispatchInvocationCount(this.segment(), 0L, value); return this; }

    /// {@return `shaderGroupHandleAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderGroupHandleAlignment(MemorySegment segment, long index) { return (int) VH_shaderGroupHandleAlignment.get(segment, 0L, index); }
    /// {@return `shaderGroupHandleAlignment`}
    public int shaderGroupHandleAlignment() { return shaderGroupHandleAlignment(this.segment(), 0L); }
    /// Sets `shaderGroupHandleAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderGroupHandleAlignment(MemorySegment segment, long index, int value) { VH_shaderGroupHandleAlignment.set(segment, 0L, index, value); }
    /// Sets `shaderGroupHandleAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleAlignment(int value) { shaderGroupHandleAlignment(this.segment(), 0L, value); return this; }

    /// {@return `maxRayHitAttributeSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxRayHitAttributeSize(MemorySegment segment, long index) { return (int) VH_maxRayHitAttributeSize.get(segment, 0L, index); }
    /// {@return `maxRayHitAttributeSize`}
    public int maxRayHitAttributeSize() { return maxRayHitAttributeSize(this.segment(), 0L); }
    /// Sets `maxRayHitAttributeSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxRayHitAttributeSize(MemorySegment segment, long index, int value) { VH_maxRayHitAttributeSize.set(segment, 0L, index, value); }
    /// Sets `maxRayHitAttributeSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayHitAttributeSize(int value) { maxRayHitAttributeSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR asSlice(long index) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRayTracingPipelinePropertiesKHR`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRayTracingPipelinePropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR at(long index, Consumer<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderGroupHandleSize` at the given index}
    /// @param index the index of the struct buffer
    public int shaderGroupHandleSizeAt(long index) { return shaderGroupHandleSize(this.segment(), index); }
    /// Sets `shaderGroupHandleSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleSizeAt(long index, int value) { shaderGroupHandleSize(this.segment(), index, value); return this; }

    /// {@return `maxRayRecursionDepth` at the given index}
    /// @param index the index of the struct buffer
    public int maxRayRecursionDepthAt(long index) { return maxRayRecursionDepth(this.segment(), index); }
    /// Sets `maxRayRecursionDepth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayRecursionDepthAt(long index, int value) { maxRayRecursionDepth(this.segment(), index, value); return this; }

    /// {@return `maxShaderGroupStride` at the given index}
    /// @param index the index of the struct buffer
    public int maxShaderGroupStrideAt(long index) { return maxShaderGroupStride(this.segment(), index); }
    /// Sets `maxShaderGroupStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxShaderGroupStrideAt(long index, int value) { maxShaderGroupStride(this.segment(), index, value); return this; }

    /// {@return `shaderGroupBaseAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int shaderGroupBaseAlignmentAt(long index) { return shaderGroupBaseAlignment(this.segment(), index); }
    /// Sets `shaderGroupBaseAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupBaseAlignmentAt(long index, int value) { shaderGroupBaseAlignment(this.segment(), index, value); return this; }

    /// {@return `shaderGroupHandleCaptureReplaySize` at the given index}
    /// @param index the index of the struct buffer
    public int shaderGroupHandleCaptureReplaySizeAt(long index) { return shaderGroupHandleCaptureReplaySize(this.segment(), index); }
    /// Sets `shaderGroupHandleCaptureReplaySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleCaptureReplaySizeAt(long index, int value) { shaderGroupHandleCaptureReplaySize(this.segment(), index, value); return this; }

    /// {@return `maxRayDispatchInvocationCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxRayDispatchInvocationCountAt(long index) { return maxRayDispatchInvocationCount(this.segment(), index); }
    /// Sets `maxRayDispatchInvocationCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayDispatchInvocationCountAt(long index, int value) { maxRayDispatchInvocationCount(this.segment(), index, value); return this; }

    /// {@return `shaderGroupHandleAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int shaderGroupHandleAlignmentAt(long index) { return shaderGroupHandleAlignment(this.segment(), index); }
    /// Sets `shaderGroupHandleAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleAlignmentAt(long index, int value) { shaderGroupHandleAlignment(this.segment(), index, value); return this; }

    /// {@return `maxRayHitAttributeSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxRayHitAttributeSizeAt(long index) { return maxRayHitAttributeSize(this.segment(), index); }
    /// Sets `maxRayHitAttributeSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayHitAttributeSizeAt(long index, int value) { maxRayHitAttributeSize(this.segment(), index, value); return this; }

}
