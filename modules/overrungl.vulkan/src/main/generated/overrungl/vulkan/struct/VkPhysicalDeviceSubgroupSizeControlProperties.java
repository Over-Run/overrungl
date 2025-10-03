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

/// Represents `VkPhysicalDeviceSubgroupSizeControlProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubgroupSizeControlProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t minSubgroupSize;
///     uint32_t maxSubgroupSize;
///     uint32_t maxComputeWorkgroupSubgroups;
///     ((uint32_t) VkFlags) VkShaderStageFlags requiredSubgroupSizeStages;
/// };
/// ```
public final class VkPhysicalDeviceSubgroupSizeControlProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSubgroupSizeControlProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages")
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
    /// The byte offset of `minSubgroupSize`.
    public static final long OFFSET_minSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("minSubgroupSize"));
    /// The memory layout of `minSubgroupSize`.
    public static final MemoryLayout LAYOUT_minSubgroupSize = LAYOUT.select(PathElement.groupElement("minSubgroupSize"));
    /// The [VarHandle] of `minSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minSubgroupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSubgroupSize")));
    /// The byte offset of `maxSubgroupSize`.
    public static final long OFFSET_maxSubgroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxSubgroupSize"));
    /// The memory layout of `maxSubgroupSize`.
    public static final MemoryLayout LAYOUT_maxSubgroupSize = LAYOUT.select(PathElement.groupElement("maxSubgroupSize"));
    /// The [VarHandle] of `maxSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSubgroupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubgroupSize")));
    /// The byte offset of `maxComputeWorkgroupSubgroups`.
    public static final long OFFSET_maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    /// The memory layout of `maxComputeWorkgroupSubgroups`.
    public static final MemoryLayout LAYOUT_maxComputeWorkgroupSubgroups = LAYOUT.select(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    /// The [VarHandle] of `maxComputeWorkgroupSubgroups` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxComputeWorkgroupSubgroups = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups")));
    /// The byte offset of `requiredSubgroupSizeStages`.
    public static final long OFFSET_requiredSubgroupSizeStages = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSizeStages"));
    /// The memory layout of `requiredSubgroupSizeStages`.
    public static final MemoryLayout LAYOUT_requiredSubgroupSizeStages = LAYOUT.select(PathElement.groupElement("requiredSubgroupSizeStages"));
    /// The [VarHandle] of `requiredSubgroupSizeStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_requiredSubgroupSizeStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSizeStages")));

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSubgroupSizeControlProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupSizeControlProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupSizeControlProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlProperties`
    public static VkPhysicalDeviceSubgroupSizeControlProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupSizeControlProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSubgroupSizeControlProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubgroupSizeControlProperties`
    public static VkPhysicalDeviceSubgroupSizeControlProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties copyFrom(VkPhysicalDeviceSubgroupSizeControlProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSubgroupSizeControlProperties reinterpret(long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSubgroupSizeControlProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSubgroupSizeControlProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minSubgroupSize(MemorySegment segment, long index) { return (int) VH_minSubgroupSize.get().get(segment, 0L, index); }
    /// {@return `minSubgroupSize`}
    public int minSubgroupSize() { return minSubgroupSize(this.segment(), 0L); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minSubgroupSize(MemorySegment segment, long index, int value) { VH_minSubgroupSize.get().set(segment, 0L, index, value); }
    /// Sets `minSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSize(int value) { minSubgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `maxSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSubgroupSize(MemorySegment segment, long index) { return (int) VH_maxSubgroupSize.get().get(segment, 0L, index); }
    /// {@return `maxSubgroupSize`}
    public int maxSubgroupSize() { return maxSubgroupSize(this.segment(), 0L); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSubgroupSize(MemorySegment segment, long index, int value) { VH_maxSubgroupSize.get().set(segment, 0L, index, value); }
    /// Sets `maxSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSize(int value) { maxSubgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxComputeWorkgroupSubgroups(MemorySegment segment, long index) { return (int) VH_maxComputeWorkgroupSubgroups.get().get(segment, 0L, index); }
    /// {@return `maxComputeWorkgroupSubgroups`}
    public int maxComputeWorkgroupSubgroups() { return maxComputeWorkgroupSubgroups(this.segment(), 0L); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxComputeWorkgroupSubgroups(MemorySegment segment, long index, int value) { VH_maxComputeWorkgroupSubgroups.get().set(segment, 0L, index, value); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroups(int value) { maxComputeWorkgroupSubgroups(this.segment(), 0L, value); return this; }

    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiredSubgroupSizeStages(MemorySegment segment, long index) { return (int) VH_requiredSubgroupSizeStages.get().get(segment, 0L, index); }
    /// {@return `requiredSubgroupSizeStages`}
    public int requiredSubgroupSizeStages() { return requiredSubgroupSizeStages(this.segment(), 0L); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiredSubgroupSizeStages(MemorySegment segment, long index, int value) { VH_requiredSubgroupSizeStages.get().set(segment, 0L, index, value); }
    /// Sets `requiredSubgroupSizeStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStages(int value) { requiredSubgroupSizeStages(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSubgroupSizeControlProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSubgroupSizeControlProperties`
    public VkPhysicalDeviceSubgroupSizeControlProperties asSlice(long index) { return new VkPhysicalDeviceSubgroupSizeControlProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSubgroupSizeControlProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSubgroupSizeControlProperties`
    public VkPhysicalDeviceSubgroupSizeControlProperties asSlice(long index, long count) { return new VkPhysicalDeviceSubgroupSizeControlProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSubgroupSizeControlProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties at(long index, Consumer<VkPhysicalDeviceSubgroupSizeControlProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minSubgroupSize` at the given index}
    /// @param index the index of the struct buffer
    public int minSubgroupSizeAt(long index) { return minSubgroupSize(this.segment(), index); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties minSubgroupSizeAt(long index, int value) { minSubgroupSize(this.segment(), index, value); return this; }

    /// {@return `maxSubgroupSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxSubgroupSizeAt(long index) { return maxSubgroupSize(this.segment(), index); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxSubgroupSizeAt(long index, int value) { maxSubgroupSize(this.segment(), index, value); return this; }

    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param index the index of the struct buffer
    public int maxComputeWorkgroupSubgroupsAt(long index) { return maxComputeWorkgroupSubgroups(this.segment(), index); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties maxComputeWorkgroupSubgroupsAt(long index, int value) { maxComputeWorkgroupSubgroups(this.segment(), index, value); return this; }

    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param index the index of the struct buffer
    public int requiredSubgroupSizeStagesAt(long index) { return requiredSubgroupSizeStages(this.segment(), index); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupSizeControlProperties requiredSubgroupSizeStagesAt(long index, int value) { requiredSubgroupSizeStages(this.segment(), index, value); return this; }

}
