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

/// Represents `VkPhysicalDeviceSubgroupProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubgroupProperties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t subgroupSize;
///     ((uint32_t) VkFlags) VkShaderStageFlags supportedStages;
///     ((uint32_t) VkFlags) VkSubgroupFeatureFlags supportedOperations;
///     (uint32_t) VkBool32 quadOperationsInAllStages;
/// };
/// ```
public final class VkPhysicalDeviceSubgroupProperties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSubgroupProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("supportedStages"),
        ValueLayout.JAVA_INT.withName("supportedOperations"),
        ValueLayout.JAVA_INT.withName("quadOperationsInAllStages")
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
    /// The byte offset of `subgroupSize`.
    public static final long OFFSET_subgroupSize = LAYOUT.byteOffset(PathElement.groupElement("subgroupSize"));
    /// The memory layout of `subgroupSize`.
    public static final MemoryLayout LAYOUT_subgroupSize = LAYOUT.select(PathElement.groupElement("subgroupSize"));
    /// The [VarHandle] of `subgroupSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subgroupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subgroupSize")));
    /// The byte offset of `supportedStages`.
    public static final long OFFSET_supportedStages = LAYOUT.byteOffset(PathElement.groupElement("supportedStages"));
    /// The memory layout of `supportedStages`.
    public static final MemoryLayout LAYOUT_supportedStages = LAYOUT.select(PathElement.groupElement("supportedStages"));
    /// The [VarHandle] of `supportedStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_supportedStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStages")));
    /// The byte offset of `supportedOperations`.
    public static final long OFFSET_supportedOperations = LAYOUT.byteOffset(PathElement.groupElement("supportedOperations"));
    /// The memory layout of `supportedOperations`.
    public static final MemoryLayout LAYOUT_supportedOperations = LAYOUT.select(PathElement.groupElement("supportedOperations"));
    /// The [VarHandle] of `supportedOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_supportedOperations = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedOperations")));
    /// The byte offset of `quadOperationsInAllStages`.
    public static final long OFFSET_quadOperationsInAllStages = LAYOUT.byteOffset(PathElement.groupElement("quadOperationsInAllStages"));
    /// The memory layout of `quadOperationsInAllStages`.
    public static final MemoryLayout LAYOUT_quadOperationsInAllStages = LAYOUT.select(PathElement.groupElement("quadOperationsInAllStages"));
    /// The [VarHandle] of `quadOperationsInAllStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_quadOperationsInAllStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("quadOperationsInAllStages")));

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSubgroupProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSubgroupProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubgroupProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubgroupProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSubgroupProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubgroupProperties`
    public static VkPhysicalDeviceSubgroupProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubgroupProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSubgroupProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubgroupProperties`
    public static VkPhysicalDeviceSubgroupProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubgroupProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties copyFrom(VkPhysicalDeviceSubgroupProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSubgroupProperties reinterpret(long count) { return new VkPhysicalDeviceSubgroupProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSubgroupProperties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSubgroupProperties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `subgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subgroupSize(MemorySegment segment, long index) { return (int) VH_subgroupSize.get().get(segment, 0L, index); }
    /// {@return `subgroupSize`}
    public int subgroupSize() { return subgroupSize(this.segment(), 0L); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subgroupSize(MemorySegment segment, long index, int value) { VH_subgroupSize.get().set(segment, 0L, index, value); }
    /// Sets `subgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties subgroupSize(int value) { subgroupSize(this.segment(), 0L, value); return this; }

    /// {@return `supportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedStages(MemorySegment segment, long index) { return (int) VH_supportedStages.get().get(segment, 0L, index); }
    /// {@return `supportedStages`}
    public int supportedStages() { return supportedStages(this.segment(), 0L); }
    /// Sets `supportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedStages(MemorySegment segment, long index, int value) { VH_supportedStages.get().set(segment, 0L, index, value); }
    /// Sets `supportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedStages(int value) { supportedStages(this.segment(), 0L, value); return this; }

    /// {@return `supportedOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedOperations(MemorySegment segment, long index) { return (int) VH_supportedOperations.get().get(segment, 0L, index); }
    /// {@return `supportedOperations`}
    public int supportedOperations() { return supportedOperations(this.segment(), 0L); }
    /// Sets `supportedOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedOperations(MemorySegment segment, long index, int value) { VH_supportedOperations.get().set(segment, 0L, index, value); }
    /// Sets `supportedOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedOperations(int value) { supportedOperations(this.segment(), 0L, value); return this; }

    /// {@return `quadOperationsInAllStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int quadOperationsInAllStages(MemorySegment segment, long index) { return (int) VH_quadOperationsInAllStages.get().get(segment, 0L, index); }
    /// {@return `quadOperationsInAllStages`}
    public int quadOperationsInAllStages() { return quadOperationsInAllStages(this.segment(), 0L); }
    /// Sets `quadOperationsInAllStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quadOperationsInAllStages(MemorySegment segment, long index, int value) { VH_quadOperationsInAllStages.get().set(segment, 0L, index, value); }
    /// Sets `quadOperationsInAllStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStages(int value) { quadOperationsInAllStages(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSubgroupProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSubgroupProperties`
    public VkPhysicalDeviceSubgroupProperties asSlice(long index) { return new VkPhysicalDeviceSubgroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSubgroupProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSubgroupProperties`
    public VkPhysicalDeviceSubgroupProperties asSlice(long index, long count) { return new VkPhysicalDeviceSubgroupProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSubgroupProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties at(long index, Consumer<VkPhysicalDeviceSubgroupProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `subgroupSize` at the given index}
    /// @param index the index of the struct buffer
    public int subgroupSizeAt(long index) { return subgroupSize(this.segment(), index); }
    /// Sets `subgroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties subgroupSizeAt(long index, int value) { subgroupSize(this.segment(), index, value); return this; }

    /// {@return `supportedStages` at the given index}
    /// @param index the index of the struct buffer
    public int supportedStagesAt(long index) { return supportedStages(this.segment(), index); }
    /// Sets `supportedStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedStagesAt(long index, int value) { supportedStages(this.segment(), index, value); return this; }

    /// {@return `supportedOperations` at the given index}
    /// @param index the index of the struct buffer
    public int supportedOperationsAt(long index) { return supportedOperations(this.segment(), index); }
    /// Sets `supportedOperations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties supportedOperationsAt(long index, int value) { supportedOperations(this.segment(), index, value); return this; }

    /// {@return `quadOperationsInAllStages` at the given index}
    /// @param index the index of the struct buffer
    public int quadOperationsInAllStagesAt(long index) { return quadOperationsInAllStages(this.segment(), index); }
    /// Sets `quadOperationsInAllStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubgroupProperties quadOperationsInAllStagesAt(long index, int value) { quadOperationsInAllStages(this.segment(), index, value); return this; }

}
