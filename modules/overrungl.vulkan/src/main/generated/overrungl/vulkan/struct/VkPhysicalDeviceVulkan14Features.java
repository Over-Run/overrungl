// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan14Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan14Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 globalPriorityQuery;
///     (uint32_t) VkBool32 shaderSubgroupRotate;
///     (uint32_t) VkBool32 shaderSubgroupRotateClustered;
///     (uint32_t) VkBool32 shaderFloatControls2;
///     (uint32_t) VkBool32 shaderExpectAssume;
///     (uint32_t) VkBool32 rectangularLines;
///     (uint32_t) VkBool32 bresenhamLines;
///     (uint32_t) VkBool32 smoothLines;
///     (uint32_t) VkBool32 stippledRectangularLines;
///     (uint32_t) VkBool32 stippledBresenhamLines;
///     (uint32_t) VkBool32 stippledSmoothLines;
///     (uint32_t) VkBool32 vertexAttributeInstanceRateDivisor;
///     (uint32_t) VkBool32 vertexAttributeInstanceRateZeroDivisor;
///     (uint32_t) VkBool32 indexTypeUint8;
///     (uint32_t) VkBool32 dynamicRenderingLocalRead;
///     (uint32_t) VkBool32 maintenance5;
///     (uint32_t) VkBool32 maintenance6;
///     (uint32_t) VkBool32 pipelineProtectedAccess;
///     (uint32_t) VkBool32 pipelineRobustness;
///     (uint32_t) VkBool32 hostImageCopy;
///     (uint32_t) VkBool32 pushDescriptor;
/// };
/// ```
public final class VkPhysicalDeviceVulkan14Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan14Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriorityQuery"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2"),
        ValueLayout.JAVA_INT.withName("shaderExpectAssume"),
        ValueLayout.JAVA_INT.withName("rectangularLines"),
        ValueLayout.JAVA_INT.withName("bresenhamLines"),
        ValueLayout.JAVA_INT.withName("smoothLines"),
        ValueLayout.JAVA_INT.withName("stippledRectangularLines"),
        ValueLayout.JAVA_INT.withName("stippledBresenhamLines"),
        ValueLayout.JAVA_INT.withName("stippledSmoothLines"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor"),
        ValueLayout.JAVA_INT.withName("indexTypeUint8"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalRead"),
        ValueLayout.JAVA_INT.withName("maintenance5"),
        ValueLayout.JAVA_INT.withName("maintenance6"),
        ValueLayout.JAVA_INT.withName("pipelineProtectedAccess"),
        ValueLayout.JAVA_INT.withName("pipelineRobustness"),
        ValueLayout.JAVA_INT.withName("hostImageCopy"),
        ValueLayout.JAVA_INT.withName("pushDescriptor")
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
    /// The byte offset of `globalPriorityQuery`.
    public static final long OFFSET_globalPriorityQuery = LAYOUT.byteOffset(PathElement.groupElement("globalPriorityQuery"));
    /// The memory layout of `globalPriorityQuery`.
    public static final MemoryLayout LAYOUT_globalPriorityQuery = LAYOUT.select(PathElement.groupElement("globalPriorityQuery"));
    /// The [VarHandle] of `globalPriorityQuery` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_globalPriorityQuery = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalPriorityQuery"));
    /// The byte offset of `shaderSubgroupRotate`.
    public static final long OFFSET_shaderSubgroupRotate = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotate"));
    /// The memory layout of `shaderSubgroupRotate`.
    public static final MemoryLayout LAYOUT_shaderSubgroupRotate = LAYOUT.select(PathElement.groupElement("shaderSubgroupRotate"));
    /// The [VarHandle] of `shaderSubgroupRotate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSubgroupRotate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotate"));
    /// The byte offset of `shaderSubgroupRotateClustered`.
    public static final long OFFSET_shaderSubgroupRotateClustered = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotateClustered"));
    /// The memory layout of `shaderSubgroupRotateClustered`.
    public static final MemoryLayout LAYOUT_shaderSubgroupRotateClustered = LAYOUT.select(PathElement.groupElement("shaderSubgroupRotateClustered"));
    /// The [VarHandle] of `shaderSubgroupRotateClustered` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSubgroupRotateClustered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupRotateClustered"));
    /// The byte offset of `shaderFloatControls2`.
    public static final long OFFSET_shaderFloatControls2 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloatControls2"));
    /// The memory layout of `shaderFloatControls2`.
    public static final MemoryLayout LAYOUT_shaderFloatControls2 = LAYOUT.select(PathElement.groupElement("shaderFloatControls2"));
    /// The [VarHandle] of `shaderFloatControls2` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderFloatControls2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloatControls2"));
    /// The byte offset of `shaderExpectAssume`.
    public static final long OFFSET_shaderExpectAssume = LAYOUT.byteOffset(PathElement.groupElement("shaderExpectAssume"));
    /// The memory layout of `shaderExpectAssume`.
    public static final MemoryLayout LAYOUT_shaderExpectAssume = LAYOUT.select(PathElement.groupElement("shaderExpectAssume"));
    /// The [VarHandle] of `shaderExpectAssume` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderExpectAssume = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderExpectAssume"));
    /// The byte offset of `rectangularLines`.
    public static final long OFFSET_rectangularLines = LAYOUT.byteOffset(PathElement.groupElement("rectangularLines"));
    /// The memory layout of `rectangularLines`.
    public static final MemoryLayout LAYOUT_rectangularLines = LAYOUT.select(PathElement.groupElement("rectangularLines"));
    /// The [VarHandle] of `rectangularLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rectangularLines"));
    /// The byte offset of `bresenhamLines`.
    public static final long OFFSET_bresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("bresenhamLines"));
    /// The memory layout of `bresenhamLines`.
    public static final MemoryLayout LAYOUT_bresenhamLines = LAYOUT.select(PathElement.groupElement("bresenhamLines"));
    /// The [VarHandle] of `bresenhamLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bresenhamLines"));
    /// The byte offset of `smoothLines`.
    public static final long OFFSET_smoothLines = LAYOUT.byteOffset(PathElement.groupElement("smoothLines"));
    /// The memory layout of `smoothLines`.
    public static final MemoryLayout LAYOUT_smoothLines = LAYOUT.select(PathElement.groupElement("smoothLines"));
    /// The [VarHandle] of `smoothLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_smoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("smoothLines"));
    /// The byte offset of `stippledRectangularLines`.
    public static final long OFFSET_stippledRectangularLines = LAYOUT.byteOffset(PathElement.groupElement("stippledRectangularLines"));
    /// The memory layout of `stippledRectangularLines`.
    public static final MemoryLayout LAYOUT_stippledRectangularLines = LAYOUT.select(PathElement.groupElement("stippledRectangularLines"));
    /// The [VarHandle] of `stippledRectangularLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stippledRectangularLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledRectangularLines"));
    /// The byte offset of `stippledBresenhamLines`.
    public static final long OFFSET_stippledBresenhamLines = LAYOUT.byteOffset(PathElement.groupElement("stippledBresenhamLines"));
    /// The memory layout of `stippledBresenhamLines`.
    public static final MemoryLayout LAYOUT_stippledBresenhamLines = LAYOUT.select(PathElement.groupElement("stippledBresenhamLines"));
    /// The [VarHandle] of `stippledBresenhamLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stippledBresenhamLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledBresenhamLines"));
    /// The byte offset of `stippledSmoothLines`.
    public static final long OFFSET_stippledSmoothLines = LAYOUT.byteOffset(PathElement.groupElement("stippledSmoothLines"));
    /// The memory layout of `stippledSmoothLines`.
    public static final MemoryLayout LAYOUT_stippledSmoothLines = LAYOUT.select(PathElement.groupElement("stippledSmoothLines"));
    /// The [VarHandle] of `stippledSmoothLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stippledSmoothLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stippledSmoothLines"));
    /// The byte offset of `vertexAttributeInstanceRateDivisor`.
    public static final long OFFSET_vertexAttributeInstanceRateDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The memory layout of `vertexAttributeInstanceRateDivisor`.
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The [VarHandle] of `vertexAttributeInstanceRateDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexAttributeInstanceRateDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The byte offset of `vertexAttributeInstanceRateZeroDivisor`.
    public static final long OFFSET_vertexAttributeInstanceRateZeroDivisor = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    /// The memory layout of `vertexAttributeInstanceRateZeroDivisor`.
    public static final MemoryLayout LAYOUT_vertexAttributeInstanceRateZeroDivisor = LAYOUT.select(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    /// The [VarHandle] of `vertexAttributeInstanceRateZeroDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vertexAttributeInstanceRateZeroDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
    /// The byte offset of `indexTypeUint8`.
    public static final long OFFSET_indexTypeUint8 = LAYOUT.byteOffset(PathElement.groupElement("indexTypeUint8"));
    /// The memory layout of `indexTypeUint8`.
    public static final MemoryLayout LAYOUT_indexTypeUint8 = LAYOUT.select(PathElement.groupElement("indexTypeUint8"));
    /// The [VarHandle] of `indexTypeUint8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indexTypeUint8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indexTypeUint8"));
    /// The byte offset of `dynamicRenderingLocalRead`.
    public static final long OFFSET_dynamicRenderingLocalRead = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalRead"));
    /// The memory layout of `dynamicRenderingLocalRead`.
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalRead = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalRead"));
    /// The [VarHandle] of `dynamicRenderingLocalRead` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicRenderingLocalRead = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalRead"));
    /// The byte offset of `maintenance5`.
    public static final long OFFSET_maintenance5 = LAYOUT.byteOffset(PathElement.groupElement("maintenance5"));
    /// The memory layout of `maintenance5`.
    public static final MemoryLayout LAYOUT_maintenance5 = LAYOUT.select(PathElement.groupElement("maintenance5"));
    /// The [VarHandle] of `maintenance5` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maintenance5 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance5"));
    /// The byte offset of `maintenance6`.
    public static final long OFFSET_maintenance6 = LAYOUT.byteOffset(PathElement.groupElement("maintenance6"));
    /// The memory layout of `maintenance6`.
    public static final MemoryLayout LAYOUT_maintenance6 = LAYOUT.select(PathElement.groupElement("maintenance6"));
    /// The [VarHandle] of `maintenance6` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maintenance6 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maintenance6"));
    /// The byte offset of `pipelineProtectedAccess`.
    public static final long OFFSET_pipelineProtectedAccess = LAYOUT.byteOffset(PathElement.groupElement("pipelineProtectedAccess"));
    /// The memory layout of `pipelineProtectedAccess`.
    public static final MemoryLayout LAYOUT_pipelineProtectedAccess = LAYOUT.select(PathElement.groupElement("pipelineProtectedAccess"));
    /// The [VarHandle] of `pipelineProtectedAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineProtectedAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineProtectedAccess"));
    /// The byte offset of `pipelineRobustness`.
    public static final long OFFSET_pipelineRobustness = LAYOUT.byteOffset(PathElement.groupElement("pipelineRobustness"));
    /// The memory layout of `pipelineRobustness`.
    public static final MemoryLayout LAYOUT_pipelineRobustness = LAYOUT.select(PathElement.groupElement("pipelineRobustness"));
    /// The [VarHandle] of `pipelineRobustness` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineRobustness = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineRobustness"));
    /// The byte offset of `hostImageCopy`.
    public static final long OFFSET_hostImageCopy = LAYOUT.byteOffset(PathElement.groupElement("hostImageCopy"));
    /// The memory layout of `hostImageCopy`.
    public static final MemoryLayout LAYOUT_hostImageCopy = LAYOUT.select(PathElement.groupElement("hostImageCopy"));
    /// The [VarHandle] of `hostImageCopy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hostImageCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hostImageCopy"));
    /// The byte offset of `pushDescriptor`.
    public static final long OFFSET_pushDescriptor = LAYOUT.byteOffset(PathElement.groupElement("pushDescriptor"));
    /// The memory layout of `pushDescriptor`.
    public static final MemoryLayout LAYOUT_pushDescriptor = LAYOUT.select(PathElement.groupElement("pushDescriptor"));
    /// The [VarHandle] of `pushDescriptor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pushDescriptor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushDescriptor"));

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkan14Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkan14Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan14Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan14Features`
    public static VkPhysicalDeviceVulkan14Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan14Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkan14Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan14Features`
    public static VkPhysicalDeviceVulkan14Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan14Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features copyFrom(VkPhysicalDeviceVulkan14Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkan14Features reinterpret(long count) { return new VkPhysicalDeviceVulkan14Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVulkan14Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan14Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `globalPriorityQuery` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int globalPriorityQuery(MemorySegment segment, long index) { return (int) VH_globalPriorityQuery.get(segment, 0L, index); }
    /// {@return `globalPriorityQuery`}
    public int globalPriorityQuery() { return globalPriorityQuery(this.segment(), 0L); }
    /// Sets `globalPriorityQuery` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void globalPriorityQuery(MemorySegment segment, long index, int value) { VH_globalPriorityQuery.set(segment, 0L, index, value); }
    /// Sets `globalPriorityQuery` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(int value) { globalPriorityQuery(this.segment(), 0L, value); return this; }

    /// {@return `shaderSubgroupRotate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSubgroupRotate(MemorySegment segment, long index) { return (int) VH_shaderSubgroupRotate.get(segment, 0L, index); }
    /// {@return `shaderSubgroupRotate`}
    public int shaderSubgroupRotate() { return shaderSubgroupRotate(this.segment(), 0L); }
    /// Sets `shaderSubgroupRotate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSubgroupRotate(MemorySegment segment, long index, int value) { VH_shaderSubgroupRotate.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupRotate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(int value) { shaderSubgroupRotate(this.segment(), 0L, value); return this; }

    /// {@return `shaderSubgroupRotateClustered` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSubgroupRotateClustered(MemorySegment segment, long index) { return (int) VH_shaderSubgroupRotateClustered.get(segment, 0L, index); }
    /// {@return `shaderSubgroupRotateClustered`}
    public int shaderSubgroupRotateClustered() { return shaderSubgroupRotateClustered(this.segment(), 0L); }
    /// Sets `shaderSubgroupRotateClustered` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSubgroupRotateClustered(MemorySegment segment, long index, int value) { VH_shaderSubgroupRotateClustered.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupRotateClustered` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(int value) { shaderSubgroupRotateClustered(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloatControls2` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloatControls2(MemorySegment segment, long index) { return (int) VH_shaderFloatControls2.get(segment, 0L, index); }
    /// {@return `shaderFloatControls2`}
    public int shaderFloatControls2() { return shaderFloatControls2(this.segment(), 0L); }
    /// Sets `shaderFloatControls2` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloatControls2(MemorySegment segment, long index, int value) { VH_shaderFloatControls2.set(segment, 0L, index, value); }
    /// Sets `shaderFloatControls2` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(int value) { shaderFloatControls2(this.segment(), 0L, value); return this; }

    /// {@return `shaderExpectAssume` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderExpectAssume(MemorySegment segment, long index) { return (int) VH_shaderExpectAssume.get(segment, 0L, index); }
    /// {@return `shaderExpectAssume`}
    public int shaderExpectAssume() { return shaderExpectAssume(this.segment(), 0L); }
    /// Sets `shaderExpectAssume` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderExpectAssume(MemorySegment segment, long index, int value) { VH_shaderExpectAssume.set(segment, 0L, index, value); }
    /// Sets `shaderExpectAssume` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(int value) { shaderExpectAssume(this.segment(), 0L, value); return this; }

    /// {@return `rectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rectangularLines(MemorySegment segment, long index) { return (int) VH_rectangularLines.get(segment, 0L, index); }
    /// {@return `rectangularLines`}
    public int rectangularLines() { return rectangularLines(this.segment(), 0L); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rectangularLines(MemorySegment segment, long index, int value) { VH_rectangularLines.set(segment, 0L, index, value); }
    /// Sets `rectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features rectangularLines(int value) { rectangularLines(this.segment(), 0L, value); return this; }

    /// {@return `bresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bresenhamLines(MemorySegment segment, long index) { return (int) VH_bresenhamLines.get(segment, 0L, index); }
    /// {@return `bresenhamLines`}
    public int bresenhamLines() { return bresenhamLines(this.segment(), 0L); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bresenhamLines(MemorySegment segment, long index, int value) { VH_bresenhamLines.set(segment, 0L, index, value); }
    /// Sets `bresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features bresenhamLines(int value) { bresenhamLines(this.segment(), 0L, value); return this; }

    /// {@return `smoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int smoothLines(MemorySegment segment, long index) { return (int) VH_smoothLines.get(segment, 0L, index); }
    /// {@return `smoothLines`}
    public int smoothLines() { return smoothLines(this.segment(), 0L); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void smoothLines(MemorySegment segment, long index, int value) { VH_smoothLines.set(segment, 0L, index, value); }
    /// Sets `smoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features smoothLines(int value) { smoothLines(this.segment(), 0L, value); return this; }

    /// {@return `stippledRectangularLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledRectangularLines(MemorySegment segment, long index) { return (int) VH_stippledRectangularLines.get(segment, 0L, index); }
    /// {@return `stippledRectangularLines`}
    public int stippledRectangularLines() { return stippledRectangularLines(this.segment(), 0L); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledRectangularLines(MemorySegment segment, long index, int value) { VH_stippledRectangularLines.set(segment, 0L, index, value); }
    /// Sets `stippledRectangularLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(int value) { stippledRectangularLines(this.segment(), 0L, value); return this; }

    /// {@return `stippledBresenhamLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledBresenhamLines(MemorySegment segment, long index) { return (int) VH_stippledBresenhamLines.get(segment, 0L, index); }
    /// {@return `stippledBresenhamLines`}
    public int stippledBresenhamLines() { return stippledBresenhamLines(this.segment(), 0L); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledBresenhamLines(MemorySegment segment, long index, int value) { VH_stippledBresenhamLines.set(segment, 0L, index, value); }
    /// Sets `stippledBresenhamLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(int value) { stippledBresenhamLines(this.segment(), 0L, value); return this; }

    /// {@return `stippledSmoothLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stippledSmoothLines(MemorySegment segment, long index) { return (int) VH_stippledSmoothLines.get(segment, 0L, index); }
    /// {@return `stippledSmoothLines`}
    public int stippledSmoothLines() { return stippledSmoothLines(this.segment(), 0L); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stippledSmoothLines(MemorySegment segment, long index, int value) { VH_stippledSmoothLines.set(segment, 0L, index, value); }
    /// Sets `stippledSmoothLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(int value) { stippledSmoothLines(this.segment(), 0L, value); return this; }

    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexAttributeInstanceRateDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateDivisor`}
    public int vertexAttributeInstanceRateDivisor() { return vertexAttributeInstanceRateDivisor(this.segment(), 0L); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexAttributeInstanceRateDivisor(MemorySegment segment, long index, int value) { VH_vertexAttributeInstanceRateDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(int value) { vertexAttributeInstanceRateDivisor(this.segment(), 0L, value); return this; }

    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor`}
    public int vertexAttributeInstanceRateZeroDivisor() { return vertexAttributeInstanceRateZeroDivisor(this.segment(), 0L); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index, int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(int value) { vertexAttributeInstanceRateZeroDivisor(this.segment(), 0L, value); return this; }

    /// {@return `indexTypeUint8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indexTypeUint8(MemorySegment segment, long index) { return (int) VH_indexTypeUint8.get(segment, 0L, index); }
    /// {@return `indexTypeUint8`}
    public int indexTypeUint8() { return indexTypeUint8(this.segment(), 0L); }
    /// Sets `indexTypeUint8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indexTypeUint8(MemorySegment segment, long index, int value) { VH_indexTypeUint8.set(segment, 0L, index, value); }
    /// Sets `indexTypeUint8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features indexTypeUint8(int value) { indexTypeUint8(this.segment(), 0L, value); return this; }

    /// {@return `dynamicRenderingLocalRead` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicRenderingLocalRead(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalRead.get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalRead`}
    public int dynamicRenderingLocalRead() { return dynamicRenderingLocalRead(this.segment(), 0L); }
    /// Sets `dynamicRenderingLocalRead` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicRenderingLocalRead(MemorySegment segment, long index, int value) { VH_dynamicRenderingLocalRead.set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalRead` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(int value) { dynamicRenderingLocalRead(this.segment(), 0L, value); return this; }

    /// {@return `maintenance5` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maintenance5(MemorySegment segment, long index) { return (int) VH_maintenance5.get(segment, 0L, index); }
    /// {@return `maintenance5`}
    public int maintenance5() { return maintenance5(this.segment(), 0L); }
    /// Sets `maintenance5` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maintenance5(MemorySegment segment, long index, int value) { VH_maintenance5.set(segment, 0L, index, value); }
    /// Sets `maintenance5` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features maintenance5(int value) { maintenance5(this.segment(), 0L, value); return this; }

    /// {@return `maintenance6` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maintenance6(MemorySegment segment, long index) { return (int) VH_maintenance6.get(segment, 0L, index); }
    /// {@return `maintenance6`}
    public int maintenance6() { return maintenance6(this.segment(), 0L); }
    /// Sets `maintenance6` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maintenance6(MemorySegment segment, long index, int value) { VH_maintenance6.set(segment, 0L, index, value); }
    /// Sets `maintenance6` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features maintenance6(int value) { maintenance6(this.segment(), 0L, value); return this; }

    /// {@return `pipelineProtectedAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineProtectedAccess(MemorySegment segment, long index) { return (int) VH_pipelineProtectedAccess.get(segment, 0L, index); }
    /// {@return `pipelineProtectedAccess`}
    public int pipelineProtectedAccess() { return pipelineProtectedAccess(this.segment(), 0L); }
    /// Sets `pipelineProtectedAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineProtectedAccess(MemorySegment segment, long index, int value) { VH_pipelineProtectedAccess.set(segment, 0L, index, value); }
    /// Sets `pipelineProtectedAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(int value) { pipelineProtectedAccess(this.segment(), 0L, value); return this; }

    /// {@return `pipelineRobustness` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineRobustness(MemorySegment segment, long index) { return (int) VH_pipelineRobustness.get(segment, 0L, index); }
    /// {@return `pipelineRobustness`}
    public int pipelineRobustness() { return pipelineRobustness(this.segment(), 0L); }
    /// Sets `pipelineRobustness` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineRobustness(MemorySegment segment, long index, int value) { VH_pipelineRobustness.set(segment, 0L, index, value); }
    /// Sets `pipelineRobustness` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pipelineRobustness(int value) { pipelineRobustness(this.segment(), 0L, value); return this; }

    /// {@return `hostImageCopy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hostImageCopy(MemorySegment segment, long index) { return (int) VH_hostImageCopy.get(segment, 0L, index); }
    /// {@return `hostImageCopy`}
    public int hostImageCopy() { return hostImageCopy(this.segment(), 0L); }
    /// Sets `hostImageCopy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hostImageCopy(MemorySegment segment, long index, int value) { VH_hostImageCopy.set(segment, 0L, index, value); }
    /// Sets `hostImageCopy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features hostImageCopy(int value) { hostImageCopy(this.segment(), 0L, value); return this; }

    /// {@return `pushDescriptor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pushDescriptor(MemorySegment segment, long index) { return (int) VH_pushDescriptor.get(segment, 0L, index); }
    /// {@return `pushDescriptor`}
    public int pushDescriptor() { return pushDescriptor(this.segment(), 0L); }
    /// Sets `pushDescriptor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pushDescriptor(MemorySegment segment, long index, int value) { VH_pushDescriptor.set(segment, 0L, index, value); }
    /// Sets `pushDescriptor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pushDescriptor(int value) { pushDescriptor(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkan14Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkan14Features`
    public VkPhysicalDeviceVulkan14Features asSlice(long index) { return new VkPhysicalDeviceVulkan14Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkan14Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkan14Features`
    public VkPhysicalDeviceVulkan14Features asSlice(long index, long count) { return new VkPhysicalDeviceVulkan14Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkan14Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features at(long index, Consumer<VkPhysicalDeviceVulkan14Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `globalPriorityQuery` at the given index}
    /// @param index the index of the struct buffer
    public int globalPriorityQueryAt(long index) { return globalPriorityQuery(this.segment(), index); }
    /// Sets `globalPriorityQuery` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features globalPriorityQueryAt(long index, int value) { globalPriorityQuery(this.segment(), index, value); return this; }

    /// {@return `shaderSubgroupRotate` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSubgroupRotateAt(long index) { return shaderSubgroupRotate(this.segment(), index); }
    /// Sets `shaderSubgroupRotate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateAt(long index, int value) { shaderSubgroupRotate(this.segment(), index, value); return this; }

    /// {@return `shaderSubgroupRotateClustered` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSubgroupRotateClusteredAt(long index) { return shaderSubgroupRotateClustered(this.segment(), index); }
    /// Sets `shaderSubgroupRotateClustered` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClusteredAt(long index, int value) { shaderSubgroupRotateClustered(this.segment(), index, value); return this; }

    /// {@return `shaderFloatControls2` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloatControls2At(long index) { return shaderFloatControls2(this.segment(), index); }
    /// Sets `shaderFloatControls2` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2At(long index, int value) { shaderFloatControls2(this.segment(), index, value); return this; }

    /// {@return `shaderExpectAssume` at the given index}
    /// @param index the index of the struct buffer
    public int shaderExpectAssumeAt(long index) { return shaderExpectAssume(this.segment(), index); }
    /// Sets `shaderExpectAssume` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features shaderExpectAssumeAt(long index, int value) { shaderExpectAssume(this.segment(), index, value); return this; }

    /// {@return `rectangularLines` at the given index}
    /// @param index the index of the struct buffer
    public int rectangularLinesAt(long index) { return rectangularLines(this.segment(), index); }
    /// Sets `rectangularLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features rectangularLinesAt(long index, int value) { rectangularLines(this.segment(), index, value); return this; }

    /// {@return `bresenhamLines` at the given index}
    /// @param index the index of the struct buffer
    public int bresenhamLinesAt(long index) { return bresenhamLines(this.segment(), index); }
    /// Sets `bresenhamLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features bresenhamLinesAt(long index, int value) { bresenhamLines(this.segment(), index, value); return this; }

    /// {@return `smoothLines` at the given index}
    /// @param index the index of the struct buffer
    public int smoothLinesAt(long index) { return smoothLines(this.segment(), index); }
    /// Sets `smoothLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features smoothLinesAt(long index, int value) { smoothLines(this.segment(), index, value); return this; }

    /// {@return `stippledRectangularLines` at the given index}
    /// @param index the index of the struct buffer
    public int stippledRectangularLinesAt(long index) { return stippledRectangularLines(this.segment(), index); }
    /// Sets `stippledRectangularLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledRectangularLinesAt(long index, int value) { stippledRectangularLines(this.segment(), index, value); return this; }

    /// {@return `stippledBresenhamLines` at the given index}
    /// @param index the index of the struct buffer
    public int stippledBresenhamLinesAt(long index) { return stippledBresenhamLines(this.segment(), index); }
    /// Sets `stippledBresenhamLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLinesAt(long index, int value) { stippledBresenhamLines(this.segment(), index, value); return this; }

    /// {@return `stippledSmoothLines` at the given index}
    /// @param index the index of the struct buffer
    public int stippledSmoothLinesAt(long index) { return stippledSmoothLines(this.segment(), index); }
    /// Sets `stippledSmoothLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features stippledSmoothLinesAt(long index, int value) { stippledSmoothLines(this.segment(), index, value); return this; }

    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param index the index of the struct buffer
    public int vertexAttributeInstanceRateDivisorAt(long index) { return vertexAttributeInstanceRateDivisor(this.segment(), index); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisorAt(long index, int value) { vertexAttributeInstanceRateDivisor(this.segment(), index, value); return this; }

    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param index the index of the struct buffer
    public int vertexAttributeInstanceRateZeroDivisorAt(long index) { return vertexAttributeInstanceRateZeroDivisor(this.segment(), index); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisorAt(long index, int value) { vertexAttributeInstanceRateZeroDivisor(this.segment(), index, value); return this; }

    /// {@return `indexTypeUint8` at the given index}
    /// @param index the index of the struct buffer
    public int indexTypeUint8At(long index) { return indexTypeUint8(this.segment(), index); }
    /// Sets `indexTypeUint8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features indexTypeUint8At(long index, int value) { indexTypeUint8(this.segment(), index, value); return this; }

    /// {@return `dynamicRenderingLocalRead` at the given index}
    /// @param index the index of the struct buffer
    public int dynamicRenderingLocalReadAt(long index) { return dynamicRenderingLocalRead(this.segment(), index); }
    /// Sets `dynamicRenderingLocalRead` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalReadAt(long index, int value) { dynamicRenderingLocalRead(this.segment(), index, value); return this; }

    /// {@return `maintenance5` at the given index}
    /// @param index the index of the struct buffer
    public int maintenance5At(long index) { return maintenance5(this.segment(), index); }
    /// Sets `maintenance5` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features maintenance5At(long index, int value) { maintenance5(this.segment(), index, value); return this; }

    /// {@return `maintenance6` at the given index}
    /// @param index the index of the struct buffer
    public int maintenance6At(long index) { return maintenance6(this.segment(), index); }
    /// Sets `maintenance6` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features maintenance6At(long index, int value) { maintenance6(this.segment(), index, value); return this; }

    /// {@return `pipelineProtectedAccess` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineProtectedAccessAt(long index) { return pipelineProtectedAccess(this.segment(), index); }
    /// Sets `pipelineProtectedAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccessAt(long index, int value) { pipelineProtectedAccess(this.segment(), index, value); return this; }

    /// {@return `pipelineRobustness` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineRobustnessAt(long index) { return pipelineRobustness(this.segment(), index); }
    /// Sets `pipelineRobustness` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pipelineRobustnessAt(long index, int value) { pipelineRobustness(this.segment(), index, value); return this; }

    /// {@return `hostImageCopy` at the given index}
    /// @param index the index of the struct buffer
    public int hostImageCopyAt(long index) { return hostImageCopy(this.segment(), index); }
    /// Sets `hostImageCopy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features hostImageCopyAt(long index, int value) { hostImageCopy(this.segment(), index, value); return this; }

    /// {@return `pushDescriptor` at the given index}
    /// @param index the index of the struct buffer
    public int pushDescriptorAt(long index) { return pushDescriptor(this.segment(), index); }
    /// Sets `pushDescriptor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Features pushDescriptorAt(long index, int value) { pushDescriptor(this.segment(), index, value); return this; }

}
