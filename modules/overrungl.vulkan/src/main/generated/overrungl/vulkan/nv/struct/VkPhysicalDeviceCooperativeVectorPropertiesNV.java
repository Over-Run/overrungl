// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeVectorPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeVectorPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkShaderStageFlags cooperativeVectorSupportedStages;
///     (uint32_t) VkBool32 cooperativeVectorTrainingFloat16Accumulation;
///     (uint32_t) VkBool32 cooperativeVectorTrainingFloat32Accumulation;
///     uint32_t maxCooperativeVectorComponents;
/// };
/// ```
public final class VkPhysicalDeviceCooperativeVectorPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCooperativeVectorPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorSupportedStages"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTrainingFloat16Accumulation"),
        ValueLayout.JAVA_INT.withName("cooperativeVectorTrainingFloat32Accumulation"),
        ValueLayout.JAVA_INT.withName("maxCooperativeVectorComponents")
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
    /// The byte offset of `cooperativeVectorSupportedStages`.
    public static final long OFFSET_cooperativeVectorSupportedStages = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorSupportedStages"));
    /// The memory layout of `cooperativeVectorSupportedStages`.
    public static final MemoryLayout LAYOUT_cooperativeVectorSupportedStages = LAYOUT.select(PathElement.groupElement("cooperativeVectorSupportedStages"));
    /// The [VarHandle] of `cooperativeVectorSupportedStages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cooperativeVectorSupportedStages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorSupportedStages")));
    /// The byte offset of `cooperativeVectorTrainingFloat16Accumulation`.
    public static final long OFFSET_cooperativeVectorTrainingFloat16Accumulation = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
    /// The memory layout of `cooperativeVectorTrainingFloat16Accumulation`.
    public static final MemoryLayout LAYOUT_cooperativeVectorTrainingFloat16Accumulation = LAYOUT.select(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation"));
    /// The [VarHandle] of `cooperativeVectorTrainingFloat16Accumulation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cooperativeVectorTrainingFloat16Accumulation = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorTrainingFloat16Accumulation")));
    /// The byte offset of `cooperativeVectorTrainingFloat32Accumulation`.
    public static final long OFFSET_cooperativeVectorTrainingFloat32Accumulation = LAYOUT.byteOffset(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
    /// The memory layout of `cooperativeVectorTrainingFloat32Accumulation`.
    public static final MemoryLayout LAYOUT_cooperativeVectorTrainingFloat32Accumulation = LAYOUT.select(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation"));
    /// The [VarHandle] of `cooperativeVectorTrainingFloat32Accumulation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_cooperativeVectorTrainingFloat32Accumulation = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeVectorTrainingFloat32Accumulation")));
    /// The byte offset of `maxCooperativeVectorComponents`.
    public static final long OFFSET_maxCooperativeVectorComponents = LAYOUT.byteOffset(PathElement.groupElement("maxCooperativeVectorComponents"));
    /// The memory layout of `maxCooperativeVectorComponents`.
    public static final MemoryLayout LAYOUT_maxCooperativeVectorComponents = LAYOUT.select(PathElement.groupElement("maxCooperativeVectorComponents"));
    /// The [VarHandle] of `maxCooperativeVectorComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxCooperativeVectorComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCooperativeVectorComponents")));

    /// Creates `VkPhysicalDeviceCooperativeVectorPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCooperativeVectorPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCooperativeVectorPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeVectorPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCooperativeVectorPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeVectorPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorPropertiesNV`
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCooperativeVectorPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeVectorPropertiesNV`
    public static VkPhysicalDeviceCooperativeVectorPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV copyFrom(VkPhysicalDeviceCooperativeVectorPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCooperativeVectorPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeVectorSupportedStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeVectorSupportedStages(MemorySegment segment, long index) { return (int) VH_cooperativeVectorSupportedStages.get().get(segment, 0L, index); }
    /// {@return `cooperativeVectorSupportedStages`}
    public int cooperativeVectorSupportedStages() { return cooperativeVectorSupportedStages(this.segment(), 0L); }
    /// Sets `cooperativeVectorSupportedStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeVectorSupportedStages(MemorySegment segment, long index, int value) { VH_cooperativeVectorSupportedStages.get().set(segment, 0L, index, value); }
    /// Sets `cooperativeVectorSupportedStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorSupportedStages(int value) { cooperativeVectorSupportedStages(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeVectorTrainingFloat16Accumulation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeVectorTrainingFloat16Accumulation(MemorySegment segment, long index) { return (int) VH_cooperativeVectorTrainingFloat16Accumulation.get().get(segment, 0L, index); }
    /// {@return `cooperativeVectorTrainingFloat16Accumulation`}
    public int cooperativeVectorTrainingFloat16Accumulation() { return cooperativeVectorTrainingFloat16Accumulation(this.segment(), 0L); }
    /// Sets `cooperativeVectorTrainingFloat16Accumulation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeVectorTrainingFloat16Accumulation(MemorySegment segment, long index, int value) { VH_cooperativeVectorTrainingFloat16Accumulation.get().set(segment, 0L, index, value); }
    /// Sets `cooperativeVectorTrainingFloat16Accumulation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat16Accumulation(int value) { cooperativeVectorTrainingFloat16Accumulation(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeVectorTrainingFloat32Accumulation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeVectorTrainingFloat32Accumulation(MemorySegment segment, long index) { return (int) VH_cooperativeVectorTrainingFloat32Accumulation.get().get(segment, 0L, index); }
    /// {@return `cooperativeVectorTrainingFloat32Accumulation`}
    public int cooperativeVectorTrainingFloat32Accumulation() { return cooperativeVectorTrainingFloat32Accumulation(this.segment(), 0L); }
    /// Sets `cooperativeVectorTrainingFloat32Accumulation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeVectorTrainingFloat32Accumulation(MemorySegment segment, long index, int value) { VH_cooperativeVectorTrainingFloat32Accumulation.get().set(segment, 0L, index, value); }
    /// Sets `cooperativeVectorTrainingFloat32Accumulation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat32Accumulation(int value) { cooperativeVectorTrainingFloat32Accumulation(this.segment(), 0L, value); return this; }

    /// {@return `maxCooperativeVectorComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCooperativeVectorComponents(MemorySegment segment, long index) { return (int) VH_maxCooperativeVectorComponents.get().get(segment, 0L, index); }
    /// {@return `maxCooperativeVectorComponents`}
    public int maxCooperativeVectorComponents() { return maxCooperativeVectorComponents(this.segment(), 0L); }
    /// Sets `maxCooperativeVectorComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCooperativeVectorComponents(MemorySegment segment, long index, int value) { VH_maxCooperativeVectorComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxCooperativeVectorComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV maxCooperativeVectorComponents(int value) { maxCooperativeVectorComponents(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCooperativeVectorPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCooperativeVectorPropertiesNV`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCooperativeVectorPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCooperativeVectorPropertiesNV`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeVectorPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCooperativeVectorPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV at(long index, Consumer<VkPhysicalDeviceCooperativeVectorPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `cooperativeVectorSupportedStages` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeVectorSupportedStagesAt(long index) { return cooperativeVectorSupportedStages(this.segment(), index); }
    /// Sets `cooperativeVectorSupportedStages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorSupportedStagesAt(long index, int value) { cooperativeVectorSupportedStages(this.segment(), index, value); return this; }

    /// {@return `cooperativeVectorTrainingFloat16Accumulation` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeVectorTrainingFloat16AccumulationAt(long index) { return cooperativeVectorTrainingFloat16Accumulation(this.segment(), index); }
    /// Sets `cooperativeVectorTrainingFloat16Accumulation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat16AccumulationAt(long index, int value) { cooperativeVectorTrainingFloat16Accumulation(this.segment(), index, value); return this; }

    /// {@return `cooperativeVectorTrainingFloat32Accumulation` at the given index}
    /// @param index the index of the struct buffer
    public int cooperativeVectorTrainingFloat32AccumulationAt(long index) { return cooperativeVectorTrainingFloat32Accumulation(this.segment(), index); }
    /// Sets `cooperativeVectorTrainingFloat32Accumulation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV cooperativeVectorTrainingFloat32AccumulationAt(long index, int value) { cooperativeVectorTrainingFloat32Accumulation(this.segment(), index, value); return this; }

    /// {@return `maxCooperativeVectorComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxCooperativeVectorComponentsAt(long index) { return maxCooperativeVectorComponents(this.segment(), index); }
    /// Sets `maxCooperativeVectorComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeVectorPropertiesNV maxCooperativeVectorComponentsAt(long index, int value) { maxCooperativeVectorComponents(this.segment(), index, value); return this; }

}
