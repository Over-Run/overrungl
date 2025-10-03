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

/// Represents `VkPhysicalDeviceMaintenance6PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance6PropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     (uint32_t) VkBool32 fragmentShadingRateClampCombinerInputs;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance6PropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance6PropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs")
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
    /// The byte offset of `blockTexelViewCompatibleMultipleLayers`.
    public static final long OFFSET_blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The memory layout of `blockTexelViewCompatibleMultipleLayers`.
    public static final MemoryLayout LAYOUT_blockTexelViewCompatibleMultipleLayers = LAYOUT.select(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The [VarHandle] of `blockTexelViewCompatibleMultipleLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_blockTexelViewCompatibleMultipleLayers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers")));
    /// The byte offset of `maxCombinedImageSamplerDescriptorCount`.
    public static final long OFFSET_maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The memory layout of `maxCombinedImageSamplerDescriptorCount`.
    public static final MemoryLayout LAYOUT_maxCombinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `maxCombinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxCombinedImageSamplerDescriptorCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount")));
    /// The byte offset of `fragmentShadingRateClampCombinerInputs`.
    public static final long OFFSET_fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The memory layout of `fragmentShadingRateClampCombinerInputs`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateClampCombinerInputs = LAYOUT.select(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The [VarHandle] of `fragmentShadingRateClampCombinerInputs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_fragmentShadingRateClampCombinerInputs = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs")));

    /// Creates `VkPhysicalDeviceMaintenance6PropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance6PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance6PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance6PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance6PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance6PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance6PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance6PropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance6PropertiesKHR`
    public static VkPhysicalDeviceMaintenance6PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance6PropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance6PropertiesKHR`
    public static VkPhysicalDeviceMaintenance6PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance6PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance6PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance6PropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance6PropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get().get(segment, 0L, index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    public int blockTexelViewCompatibleMultipleLayers() { return blockTexelViewCompatibleMultipleLayers(this.segment(), 0L); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index, int value) { VH_blockTexelViewCompatibleMultipleLayers.get().set(segment, 0L, index, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR blockTexelViewCompatibleMultipleLayers(int value) { blockTexelViewCompatibleMultipleLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get().get(segment, 0L, index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    public int maxCombinedImageSamplerDescriptorCount() { return maxCombinedImageSamplerDescriptorCount(this.segment(), 0L); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index, int value) { VH_maxCombinedImageSamplerDescriptorCount.get().set(segment, 0L, index, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR maxCombinedImageSamplerDescriptorCount(int value) { maxCombinedImageSamplerDescriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get().get(segment, 0L, index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    public int fragmentShadingRateClampCombinerInputs() { return fragmentShadingRateClampCombinerInputs(this.segment(), 0L); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index, int value) { VH_fragmentShadingRateClampCombinerInputs.get().set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR fragmentShadingRateClampCombinerInputs(int value) { fragmentShadingRateClampCombinerInputs(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance6PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance6PropertiesKHR`
    public VkPhysicalDeviceMaintenance6PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance6PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance6PropertiesKHR`
    public VkPhysicalDeviceMaintenance6PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance6PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance6PropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance6PropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param index the index of the struct buffer
    public int blockTexelViewCompatibleMultipleLayersAt(long index) { return blockTexelViewCompatibleMultipleLayers(this.segment(), index); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR blockTexelViewCompatibleMultipleLayersAt(long index, int value) { blockTexelViewCompatibleMultipleLayers(this.segment(), index, value); return this; }

    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxCombinedImageSamplerDescriptorCountAt(long index) { return maxCombinedImageSamplerDescriptorCount(this.segment(), index); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR maxCombinedImageSamplerDescriptorCountAt(long index, int value) { maxCombinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }

    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentShadingRateClampCombinerInputsAt(long index) { return fragmentShadingRateClampCombinerInputs(this.segment(), index); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance6PropertiesKHR fragmentShadingRateClampCombinerInputsAt(long index, int value) { fragmentShadingRateClampCombinerInputs(this.segment(), index, value); return this; }

}
