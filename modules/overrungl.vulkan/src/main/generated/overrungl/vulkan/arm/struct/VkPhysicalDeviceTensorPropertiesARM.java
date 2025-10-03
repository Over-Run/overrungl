// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTensorPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTensorPropertiesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxTensorDimensionCount;
///     uint64_t maxTensorElements;
///     uint64_t maxPerDimensionTensorElements;
///     int64_t maxTensorStride;
///     uint64_t maxTensorSize;
///     uint32_t maxTensorShaderAccessArrayLength;
///     uint32_t maxTensorShaderAccessSize;
///     uint32_t maxDescriptorSetStorageTensors;
///     uint32_t maxPerStageDescriptorSetStorageTensors;
///     uint32_t maxDescriptorSetUpdateAfterBindStorageTensors;
///     uint32_t maxPerStageDescriptorUpdateAfterBindStorageTensors;
///     (uint32_t) VkBool32 shaderStorageTensorArrayNonUniformIndexingNative;
///     ((uint32_t) VkFlags) VkShaderStageFlags shaderTensorSupportedStages;
/// };
/// ```
public final class VkPhysicalDeviceTensorPropertiesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTensorPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTensorDimensionCount"),
        ValueLayout.JAVA_LONG.withName("maxTensorElements"),
        ValueLayout.JAVA_LONG.withName("maxPerDimensionTensorElements"),
        ValueLayout.JAVA_LONG.withName("maxTensorStride"),
        ValueLayout.JAVA_LONG.withName("maxTensorSize"),
        ValueLayout.JAVA_INT.withName("maxTensorShaderAccessArrayLength"),
        ValueLayout.JAVA_INT.withName("maxTensorShaderAccessSize"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageTensors"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSetStorageTensors"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageTensors"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageTensors"),
        ValueLayout.JAVA_INT.withName("shaderStorageTensorArrayNonUniformIndexingNative"),
        ValueLayout.JAVA_INT.withName("shaderTensorSupportedStages")
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
    /// The byte offset of `maxTensorDimensionCount`.
    public static final long OFFSET_maxTensorDimensionCount = LAYOUT.byteOffset(PathElement.groupElement("maxTensorDimensionCount"));
    /// The memory layout of `maxTensorDimensionCount`.
    public static final MemoryLayout LAYOUT_maxTensorDimensionCount = LAYOUT.select(PathElement.groupElement("maxTensorDimensionCount"));
    /// The [VarHandle] of `maxTensorDimensionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTensorDimensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorDimensionCount"));
    /// The byte offset of `maxTensorElements`.
    public static final long OFFSET_maxTensorElements = LAYOUT.byteOffset(PathElement.groupElement("maxTensorElements"));
    /// The memory layout of `maxTensorElements`.
    public static final MemoryLayout LAYOUT_maxTensorElements = LAYOUT.select(PathElement.groupElement("maxTensorElements"));
    /// The [VarHandle] of `maxTensorElements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTensorElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorElements"));
    /// The byte offset of `maxPerDimensionTensorElements`.
    public static final long OFFSET_maxPerDimensionTensorElements = LAYOUT.byteOffset(PathElement.groupElement("maxPerDimensionTensorElements"));
    /// The memory layout of `maxPerDimensionTensorElements`.
    public static final MemoryLayout LAYOUT_maxPerDimensionTensorElements = LAYOUT.select(PathElement.groupElement("maxPerDimensionTensorElements"));
    /// The [VarHandle] of `maxPerDimensionTensorElements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerDimensionTensorElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerDimensionTensorElements"));
    /// The byte offset of `maxTensorStride`.
    public static final long OFFSET_maxTensorStride = LAYOUT.byteOffset(PathElement.groupElement("maxTensorStride"));
    /// The memory layout of `maxTensorStride`.
    public static final MemoryLayout LAYOUT_maxTensorStride = LAYOUT.select(PathElement.groupElement("maxTensorStride"));
    /// The [VarHandle] of `maxTensorStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTensorStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorStride"));
    /// The byte offset of `maxTensorSize`.
    public static final long OFFSET_maxTensorSize = LAYOUT.byteOffset(PathElement.groupElement("maxTensorSize"));
    /// The memory layout of `maxTensorSize`.
    public static final MemoryLayout LAYOUT_maxTensorSize = LAYOUT.select(PathElement.groupElement("maxTensorSize"));
    /// The [VarHandle] of `maxTensorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTensorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorSize"));
    /// The byte offset of `maxTensorShaderAccessArrayLength`.
    public static final long OFFSET_maxTensorShaderAccessArrayLength = LAYOUT.byteOffset(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
    /// The memory layout of `maxTensorShaderAccessArrayLength`.
    public static final MemoryLayout LAYOUT_maxTensorShaderAccessArrayLength = LAYOUT.select(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
    /// The [VarHandle] of `maxTensorShaderAccessArrayLength` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTensorShaderAccessArrayLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorShaderAccessArrayLength"));
    /// The byte offset of `maxTensorShaderAccessSize`.
    public static final long OFFSET_maxTensorShaderAccessSize = LAYOUT.byteOffset(PathElement.groupElement("maxTensorShaderAccessSize"));
    /// The memory layout of `maxTensorShaderAccessSize`.
    public static final MemoryLayout LAYOUT_maxTensorShaderAccessSize = LAYOUT.select(PathElement.groupElement("maxTensorShaderAccessSize"));
    /// The [VarHandle] of `maxTensorShaderAccessSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTensorShaderAccessSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTensorShaderAccessSize"));
    /// The byte offset of `maxDescriptorSetStorageTensors`.
    public static final long OFFSET_maxDescriptorSetStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageTensors"));
    /// The memory layout of `maxDescriptorSetStorageTensors`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageTensors = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageTensors"));
    /// The [VarHandle] of `maxDescriptorSetStorageTensors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageTensors"));
    /// The byte offset of `maxPerStageDescriptorSetStorageTensors`.
    public static final long OFFSET_maxPerStageDescriptorSetStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
    /// The memory layout of `maxPerStageDescriptorSetStorageTensors`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorSetStorageTensors = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
    /// The [VarHandle] of `maxPerStageDescriptorSetStorageTensors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorSetStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSetStorageTensors"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindStorageTensors`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindStorageTensors`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindStorageTensors = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindStorageTensors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageTensors"));
    /// The byte offset of `maxPerStageDescriptorUpdateAfterBindStorageTensors`.
    public static final long OFFSET_maxPerStageDescriptorUpdateAfterBindStorageTensors = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
    /// The memory layout of `maxPerStageDescriptorUpdateAfterBindStorageTensors`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUpdateAfterBindStorageTensors = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindStorageTensors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindStorageTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageTensors"));
    /// The byte offset of `shaderStorageTensorArrayNonUniformIndexingNative`.
    public static final long OFFSET_shaderStorageTensorArrayNonUniformIndexingNative = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
    /// The memory layout of `shaderStorageTensorArrayNonUniformIndexingNative`.
    public static final MemoryLayout LAYOUT_shaderStorageTensorArrayNonUniformIndexingNative = LAYOUT.select(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
    /// The [VarHandle] of `shaderStorageTensorArrayNonUniformIndexingNative` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderStorageTensorArrayNonUniformIndexingNative = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderStorageTensorArrayNonUniformIndexingNative"));
    /// The byte offset of `shaderTensorSupportedStages`.
    public static final long OFFSET_shaderTensorSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("shaderTensorSupportedStages"));
    /// The memory layout of `shaderTensorSupportedStages`.
    public static final MemoryLayout LAYOUT_shaderTensorSupportedStages = LAYOUT.select(PathElement.groupElement("shaderTensorSupportedStages"));
    /// The [VarHandle] of `shaderTensorSupportedStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderTensorSupportedStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderTensorSupportedStages"));

    /// Creates `VkPhysicalDeviceTensorPropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTensorPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTensorPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTensorPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorPropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTensorPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTensorPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTensorPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTensorPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTensorPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTensorPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTensorPropertiesARM`
    public static VkPhysicalDeviceTensorPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTensorPropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTensorPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTensorPropertiesARM`
    public static VkPhysicalDeviceTensorPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTensorPropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM copyFrom(VkPhysicalDeviceTensorPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTensorPropertiesARM reinterpret(long count) { return new VkPhysicalDeviceTensorPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTensorPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTensorPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxTensorDimensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTensorDimensionCount(MemorySegment segment, long index) { return (int) VH_maxTensorDimensionCount.get(segment, 0L, index); }
    /// {@return `maxTensorDimensionCount`}
    public int maxTensorDimensionCount() { return maxTensorDimensionCount(this.segment(), 0L); }
    /// Sets `maxTensorDimensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTensorDimensionCount(MemorySegment segment, long index, int value) { VH_maxTensorDimensionCount.set(segment, 0L, index, value); }
    /// Sets `maxTensorDimensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorDimensionCount(int value) { maxTensorDimensionCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTensorElements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTensorElements(MemorySegment segment, long index) { return (long) VH_maxTensorElements.get(segment, 0L, index); }
    /// {@return `maxTensorElements`}
    public long maxTensorElements() { return maxTensorElements(this.segment(), 0L); }
    /// Sets `maxTensorElements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTensorElements(MemorySegment segment, long index, long value) { VH_maxTensorElements.set(segment, 0L, index, value); }
    /// Sets `maxTensorElements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorElements(long value) { maxTensorElements(this.segment(), 0L, value); return this; }

    /// {@return `maxPerDimensionTensorElements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxPerDimensionTensorElements(MemorySegment segment, long index) { return (long) VH_maxPerDimensionTensorElements.get(segment, 0L, index); }
    /// {@return `maxPerDimensionTensorElements`}
    public long maxPerDimensionTensorElements() { return maxPerDimensionTensorElements(this.segment(), 0L); }
    /// Sets `maxPerDimensionTensorElements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerDimensionTensorElements(MemorySegment segment, long index, long value) { VH_maxPerDimensionTensorElements.set(segment, 0L, index, value); }
    /// Sets `maxPerDimensionTensorElements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxPerDimensionTensorElements(long value) { maxPerDimensionTensorElements(this.segment(), 0L, value); return this; }

    /// {@return `maxTensorStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTensorStride(MemorySegment segment, long index) { return (long) VH_maxTensorStride.get(segment, 0L, index); }
    /// {@return `maxTensorStride`}
    public long maxTensorStride() { return maxTensorStride(this.segment(), 0L); }
    /// Sets `maxTensorStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTensorStride(MemorySegment segment, long index, long value) { VH_maxTensorStride.set(segment, 0L, index, value); }
    /// Sets `maxTensorStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorStride(long value) { maxTensorStride(this.segment(), 0L, value); return this; }

    /// {@return `maxTensorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxTensorSize(MemorySegment segment, long index) { return (long) VH_maxTensorSize.get(segment, 0L, index); }
    /// {@return `maxTensorSize`}
    public long maxTensorSize() { return maxTensorSize(this.segment(), 0L); }
    /// Sets `maxTensorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTensorSize(MemorySegment segment, long index, long value) { VH_maxTensorSize.set(segment, 0L, index, value); }
    /// Sets `maxTensorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorSize(long value) { maxTensorSize(this.segment(), 0L, value); return this; }

    /// {@return `maxTensorShaderAccessArrayLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTensorShaderAccessArrayLength(MemorySegment segment, long index) { return (int) VH_maxTensorShaderAccessArrayLength.get(segment, 0L, index); }
    /// {@return `maxTensorShaderAccessArrayLength`}
    public int maxTensorShaderAccessArrayLength() { return maxTensorShaderAccessArrayLength(this.segment(), 0L); }
    /// Sets `maxTensorShaderAccessArrayLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTensorShaderAccessArrayLength(MemorySegment segment, long index, int value) { VH_maxTensorShaderAccessArrayLength.set(segment, 0L, index, value); }
    /// Sets `maxTensorShaderAccessArrayLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessArrayLength(int value) { maxTensorShaderAccessArrayLength(this.segment(), 0L, value); return this; }

    /// {@return `maxTensorShaderAccessSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTensorShaderAccessSize(MemorySegment segment, long index) { return (int) VH_maxTensorShaderAccessSize.get(segment, 0L, index); }
    /// {@return `maxTensorShaderAccessSize`}
    public int maxTensorShaderAccessSize() { return maxTensorShaderAccessSize(this.segment(), 0L); }
    /// Sets `maxTensorShaderAccessSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTensorShaderAccessSize(MemorySegment segment, long index, int value) { VH_maxTensorShaderAccessSize.set(segment, 0L, index, value); }
    /// Sets `maxTensorShaderAccessSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessSize(int value) { maxTensorShaderAccessSize(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetStorageTensors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetStorageTensors(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageTensors.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageTensors`}
    public int maxDescriptorSetStorageTensors() { return maxDescriptorSetStorageTensors(this.segment(), 0L); }
    /// Sets `maxDescriptorSetStorageTensors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetStorageTensors(MemorySegment segment, long index, int value) { VH_maxDescriptorSetStorageTensors.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageTensors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetStorageTensors(int value) { maxDescriptorSetStorageTensors(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorSetStorageTensors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorSetStorageTensors(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorSetStorageTensors.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorSetStorageTensors`}
    public int maxPerStageDescriptorSetStorageTensors() { return maxPerStageDescriptorSetStorageTensors(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorSetStorageTensors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorSetStorageTensors(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorSetStorageTensors.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorSetStorageTensors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorSetStorageTensors(int value) { maxPerStageDescriptorSetStorageTensors(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageTensors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindStorageTensors(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindStorageTensors.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindStorageTensors`}
    public int maxDescriptorSetUpdateAfterBindStorageTensors() { return maxDescriptorSetUpdateAfterBindStorageTensors(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageTensors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindStorageTensors(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindStorageTensors.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageTensors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetUpdateAfterBindStorageTensors(int value) { maxDescriptorSetUpdateAfterBindStorageTensors(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageTensors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUpdateAfterBindStorageTensors(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindStorageTensors.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageTensors`}
    public int maxPerStageDescriptorUpdateAfterBindStorageTensors() { return maxPerStageDescriptorUpdateAfterBindStorageTensors(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageTensors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUpdateAfterBindStorageTensors(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUpdateAfterBindStorageTensors.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageTensors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorUpdateAfterBindStorageTensors(int value) { maxPerStageDescriptorUpdateAfterBindStorageTensors(this.segment(), 0L, value); return this; }

    /// {@return `shaderStorageTensorArrayNonUniformIndexingNative` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderStorageTensorArrayNonUniformIndexingNative(MemorySegment segment, long index) { return (int) VH_shaderStorageTensorArrayNonUniformIndexingNative.get(segment, 0L, index); }
    /// {@return `shaderStorageTensorArrayNonUniformIndexingNative`}
    public int shaderStorageTensorArrayNonUniformIndexingNative() { return shaderStorageTensorArrayNonUniformIndexingNative(this.segment(), 0L); }
    /// Sets `shaderStorageTensorArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderStorageTensorArrayNonUniformIndexingNative(MemorySegment segment, long index, int value) { VH_shaderStorageTensorArrayNonUniformIndexingNative.set(segment, 0L, index, value); }
    /// Sets `shaderStorageTensorArrayNonUniformIndexingNative` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM shaderStorageTensorArrayNonUniformIndexingNative(int value) { shaderStorageTensorArrayNonUniformIndexingNative(this.segment(), 0L, value); return this; }

    /// {@return `shaderTensorSupportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderTensorSupportedStages(MemorySegment segment, long index) { return (int) VH_shaderTensorSupportedStages.get(segment, 0L, index); }
    /// {@return `shaderTensorSupportedStages`}
    public int shaderTensorSupportedStages() { return shaderTensorSupportedStages(this.segment(), 0L); }
    /// Sets `shaderTensorSupportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderTensorSupportedStages(MemorySegment segment, long index, int value) { VH_shaderTensorSupportedStages.set(segment, 0L, index, value); }
    /// Sets `shaderTensorSupportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM shaderTensorSupportedStages(int value) { shaderTensorSupportedStages(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTensorPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTensorPropertiesARM`
    public VkPhysicalDeviceTensorPropertiesARM asSlice(long index) { return new VkPhysicalDeviceTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTensorPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTensorPropertiesARM`
    public VkPhysicalDeviceTensorPropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTensorPropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM at(long index, Consumer<VkPhysicalDeviceTensorPropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxTensorDimensionCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxTensorDimensionCountAt(long index) { return maxTensorDimensionCount(this.segment(), index); }
    /// Sets `maxTensorDimensionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorDimensionCountAt(long index, int value) { maxTensorDimensionCount(this.segment(), index, value); return this; }

    /// {@return `maxTensorElements` at the given index}
    /// @param index the index of the struct buffer
    public long maxTensorElementsAt(long index) { return maxTensorElements(this.segment(), index); }
    /// Sets `maxTensorElements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorElementsAt(long index, long value) { maxTensorElements(this.segment(), index, value); return this; }

    /// {@return `maxPerDimensionTensorElements` at the given index}
    /// @param index the index of the struct buffer
    public long maxPerDimensionTensorElementsAt(long index) { return maxPerDimensionTensorElements(this.segment(), index); }
    /// Sets `maxPerDimensionTensorElements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxPerDimensionTensorElementsAt(long index, long value) { maxPerDimensionTensorElements(this.segment(), index, value); return this; }

    /// {@return `maxTensorStride` at the given index}
    /// @param index the index of the struct buffer
    public long maxTensorStrideAt(long index) { return maxTensorStride(this.segment(), index); }
    /// Sets `maxTensorStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorStrideAt(long index, long value) { maxTensorStride(this.segment(), index, value); return this; }

    /// {@return `maxTensorSize` at the given index}
    /// @param index the index of the struct buffer
    public long maxTensorSizeAt(long index) { return maxTensorSize(this.segment(), index); }
    /// Sets `maxTensorSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorSizeAt(long index, long value) { maxTensorSize(this.segment(), index, value); return this; }

    /// {@return `maxTensorShaderAccessArrayLength` at the given index}
    /// @param index the index of the struct buffer
    public int maxTensorShaderAccessArrayLengthAt(long index) { return maxTensorShaderAccessArrayLength(this.segment(), index); }
    /// Sets `maxTensorShaderAccessArrayLength` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessArrayLengthAt(long index, int value) { maxTensorShaderAccessArrayLength(this.segment(), index, value); return this; }

    /// {@return `maxTensorShaderAccessSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxTensorShaderAccessSizeAt(long index) { return maxTensorShaderAccessSize(this.segment(), index); }
    /// Sets `maxTensorShaderAccessSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxTensorShaderAccessSizeAt(long index, int value) { maxTensorShaderAccessSize(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetStorageTensors` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetStorageTensorsAt(long index) { return maxDescriptorSetStorageTensors(this.segment(), index); }
    /// Sets `maxDescriptorSetStorageTensors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetStorageTensorsAt(long index, int value) { maxDescriptorSetStorageTensors(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorSetStorageTensors` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorSetStorageTensorsAt(long index) { return maxPerStageDescriptorSetStorageTensors(this.segment(), index); }
    /// Sets `maxPerStageDescriptorSetStorageTensors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorSetStorageTensorsAt(long index, int value) { maxPerStageDescriptorSetStorageTensors(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindStorageTensors` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUpdateAfterBindStorageTensorsAt(long index) { return maxDescriptorSetUpdateAfterBindStorageTensors(this.segment(), index); }
    /// Sets `maxDescriptorSetUpdateAfterBindStorageTensors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxDescriptorSetUpdateAfterBindStorageTensorsAt(long index, int value) { maxDescriptorSetUpdateAfterBindStorageTensors(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindStorageTensors` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(long index) { return maxPerStageDescriptorUpdateAfterBindStorageTensors(this.segment(), index); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindStorageTensors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM maxPerStageDescriptorUpdateAfterBindStorageTensorsAt(long index, int value) { maxPerStageDescriptorUpdateAfterBindStorageTensors(this.segment(), index, value); return this; }

    /// {@return `shaderStorageTensorArrayNonUniformIndexingNative` at the given index}
    /// @param index the index of the struct buffer
    public int shaderStorageTensorArrayNonUniformIndexingNativeAt(long index) { return shaderStorageTensorArrayNonUniformIndexingNative(this.segment(), index); }
    /// Sets `shaderStorageTensorArrayNonUniformIndexingNative` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM shaderStorageTensorArrayNonUniformIndexingNativeAt(long index, int value) { shaderStorageTensorArrayNonUniformIndexingNative(this.segment(), index, value); return this; }

    /// {@return `shaderTensorSupportedStages` at the given index}
    /// @param index the index of the struct buffer
    public int shaderTensorSupportedStagesAt(long index) { return shaderTensorSupportedStages(this.segment(), index); }
    /// Sets `shaderTensorSupportedStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTensorPropertiesARM shaderTensorSupportedStagesAt(long index, int value) { shaderTensorSupportedStages(this.segment(), index, value); return this; }

}
