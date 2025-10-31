// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkanMemoryModelFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkanMemoryModelFeatures {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 vulkanMemoryModel;
///     (uint32_t) VkBool32 vulkanMemoryModelDeviceScope;
///     (uint32_t) VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
/// };
/// ```
public final class VkPhysicalDeviceVulkanMemoryModelFeatures extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains")
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
    /// The byte offset of `vulkanMemoryModel`.
    public static final long OFFSET_vulkanMemoryModel = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
    /// The memory layout of `vulkanMemoryModel`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModel = LAYOUT.select(PathElement.groupElement("vulkanMemoryModel"));
    /// The [VarHandle] of `vulkanMemoryModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModel"));
    /// The byte offset of `vulkanMemoryModelDeviceScope`.
    public static final long OFFSET_vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The memory layout of `vulkanMemoryModelDeviceScope`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModelDeviceScope = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The [VarHandle] of `vulkanMemoryModelDeviceScope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModelDeviceScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
    /// The byte offset of `vulkanMemoryModelAvailabilityVisibilityChains`.
    public static final long OFFSET_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The memory layout of `vulkanMemoryModelAvailabilityVisibilityChains`.
    public static final MemoryLayout LAYOUT_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.select(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
    /// The [VarHandle] of `vulkanMemoryModelAvailabilityVisibilityChains` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVulkanMemoryModelFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public static VkPhysicalDeviceVulkanMemoryModelFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures copyFrom(VkPhysicalDeviceVulkanMemoryModelFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVulkanMemoryModelFeatures reinterpret(long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVulkanMemoryModelFeatures sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModel(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModel.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModel`}
    public int vulkanMemoryModel() { return vulkanMemoryModel(this.segment(), 0L); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModel(MemorySegment segment, long index, int value) { VH_vulkanMemoryModel.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModel(int value) { vulkanMemoryModel(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModelDeviceScope(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelDeviceScope.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelDeviceScope`}
    public int vulkanMemoryModelDeviceScope() { return vulkanMemoryModelDeviceScope(this.segment(), 0L); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModelDeviceScope(MemorySegment segment, long index, int value) { VH_vulkanMemoryModelDeviceScope.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScope(int value) { vulkanMemoryModelDeviceScope(this.segment(), 0L, value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index) { return (int) VH_vulkanMemoryModelAvailabilityVisibilityChains.get(segment, 0L, index); }
    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains`}
    public int vulkanMemoryModelAvailabilityVisibilityChains() { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vulkanMemoryModelAvailabilityVisibilityChains(MemorySegment segment, long index, int value) { VH_vulkanMemoryModelAvailabilityVisibilityChains.set(segment, 0L, index, value); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChains(int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public VkPhysicalDeviceVulkanMemoryModelFeatures asSlice(long index) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVulkanMemoryModelFeatures`
    public VkPhysicalDeviceVulkanMemoryModelFeatures asSlice(long index, long count) { return new VkPhysicalDeviceVulkanMemoryModelFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVulkanMemoryModelFeatures` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures at(long index, Consumer<VkPhysicalDeviceVulkanMemoryModelFeatures> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModel` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelAt(long index) { return vulkanMemoryModel(this.segment(), index); }
    /// Sets `vulkanMemoryModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAt(long index, int value) { vulkanMemoryModel(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModelDeviceScope` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelDeviceScopeAt(long index) { return vulkanMemoryModelDeviceScope(this.segment(), index); }
    /// Sets `vulkanMemoryModelDeviceScope` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelDeviceScopeAt(long index, int value) { vulkanMemoryModelDeviceScope(this.segment(), index, value); return this; }

    /// {@return `vulkanMemoryModelAvailabilityVisibilityChains` at the given index}
    /// @param index the index of the struct buffer
    public int vulkanMemoryModelAvailabilityVisibilityChainsAt(long index) { return vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index); }
    /// Sets `vulkanMemoryModelAvailabilityVisibilityChains` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkanMemoryModelFeatures vulkanMemoryModelAvailabilityVisibilityChainsAt(long index, int value) { vulkanMemoryModelAvailabilityVisibilityChains(this.segment(), index, value); return this; }

}
