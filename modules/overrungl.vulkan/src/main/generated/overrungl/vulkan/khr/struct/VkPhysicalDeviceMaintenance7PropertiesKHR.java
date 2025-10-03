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

/// Represents `VkPhysicalDeviceMaintenance7PropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMaintenance7PropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 robustFragmentShadingRateAttachmentAccess;
///     (uint32_t) VkBool32 separateDepthStencilAttachmentAccess;
///     uint32_t maxDescriptorSetTotalUniformBuffersDynamic;
///     uint32_t maxDescriptorSetTotalStorageBuffersDynamic;
///     uint32_t maxDescriptorSetTotalBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic;
///     uint32_t maxDescriptorSetUpdateAfterBindTotalBuffersDynamic;
/// };
/// ```
public final class VkPhysicalDeviceMaintenance7PropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceMaintenance7PropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustFragmentShadingRateAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic")
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
    /// The byte offset of `robustFragmentShadingRateAttachmentAccess`.
    public static final long OFFSET_robustFragmentShadingRateAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    /// The memory layout of `robustFragmentShadingRateAttachmentAccess`.
    public static final MemoryLayout LAYOUT_robustFragmentShadingRateAttachmentAccess = LAYOUT.select(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    /// The [VarHandle] of `robustFragmentShadingRateAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_robustFragmentShadingRateAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("robustFragmentShadingRateAttachmentAccess"));
    /// The byte offset of `separateDepthStencilAttachmentAccess`.
    public static final long OFFSET_separateDepthStencilAttachmentAccess = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    /// The memory layout of `separateDepthStencilAttachmentAccess`.
    public static final MemoryLayout LAYOUT_separateDepthStencilAttachmentAccess = LAYOUT.select(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    /// The [VarHandle] of `separateDepthStencilAttachmentAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_separateDepthStencilAttachmentAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("separateDepthStencilAttachmentAccess"));
    /// The byte offset of `maxDescriptorSetTotalUniformBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetTotalUniformBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetTotalUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetTotalStorageBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetTotalStorageBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetTotalStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetTotalBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetTotalBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetTotalBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetTotalBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetTotalBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetTotalBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"));
    /// The byte offset of `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic"));

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceMaintenance7PropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMaintenance7PropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceMaintenance7PropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public static VkPhysicalDeviceMaintenance7PropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR copyFrom(VkPhysicalDeviceMaintenance7PropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceMaintenance7PropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `robustFragmentShadingRateAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int robustFragmentShadingRateAttachmentAccess(MemorySegment segment, long index) { return (int) VH_robustFragmentShadingRateAttachmentAccess.get(segment, 0L, index); }
    /// {@return `robustFragmentShadingRateAttachmentAccess`}
    public int robustFragmentShadingRateAttachmentAccess() { return robustFragmentShadingRateAttachmentAccess(this.segment(), 0L); }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void robustFragmentShadingRateAttachmentAccess(MemorySegment segment, long index, int value) { VH_robustFragmentShadingRateAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccess(int value) { robustFragmentShadingRateAttachmentAccess(this.segment(), 0L, value); return this; }

    /// {@return `separateDepthStencilAttachmentAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int separateDepthStencilAttachmentAccess(MemorySegment segment, long index) { return (int) VH_separateDepthStencilAttachmentAccess.get(segment, 0L, index); }
    /// {@return `separateDepthStencilAttachmentAccess`}
    public int separateDepthStencilAttachmentAccess() { return separateDepthStencilAttachmentAccess(this.segment(), 0L); }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void separateDepthStencilAttachmentAccess(MemorySegment segment, long index, int value) { VH_separateDepthStencilAttachmentAccess.set(segment, 0L, index, value); }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccess(int value) { separateDepthStencilAttachmentAccess(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetTotalUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic`}
    public int maxDescriptorSetTotalUniformBuffersDynamic() { return maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetTotalUniformBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetTotalUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamic(int value) { maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetTotalStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic`}
    public int maxDescriptorSetTotalStorageBuffersDynamic() { return maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetTotalStorageBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetTotalStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamic(int value) { maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetTotalBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetTotalBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetTotalBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetTotalBuffersDynamic`}
    public int maxDescriptorSetTotalBuffersDynamic() { return maxDescriptorSetTotalBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetTotalBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetTotalBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamic(int value) { maxDescriptorSetTotalBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() { return maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() { return maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic`}
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() { return maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUpdateAfterBindTotalBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(int value) { maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public VkPhysicalDeviceMaintenance7PropertiesKHR asSlice(long index) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMaintenance7PropertiesKHR`
    public VkPhysicalDeviceMaintenance7PropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceMaintenance7PropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceMaintenance7PropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR at(long index, Consumer<VkPhysicalDeviceMaintenance7PropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `robustFragmentShadingRateAttachmentAccess` at the given index}
    /// @param index the index of the struct buffer
    public int robustFragmentShadingRateAttachmentAccessAt(long index) { return robustFragmentShadingRateAttachmentAccess(this.segment(), index); }
    /// Sets `robustFragmentShadingRateAttachmentAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR robustFragmentShadingRateAttachmentAccessAt(long index, int value) { robustFragmentShadingRateAttachmentAccess(this.segment(), index, value); return this; }

    /// {@return `separateDepthStencilAttachmentAccess` at the given index}
    /// @param index the index of the struct buffer
    public int separateDepthStencilAttachmentAccessAt(long index) { return separateDepthStencilAttachmentAccess(this.segment(), index); }
    /// Sets `separateDepthStencilAttachmentAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR separateDepthStencilAttachmentAccessAt(long index, int value) { separateDepthStencilAttachmentAccess(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetTotalUniformBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetTotalUniformBuffersDynamicAt(long index) { return maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalUniformBuffersDynamicAt(long index, int value) { maxDescriptorSetTotalUniformBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetTotalStorageBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetTotalStorageBuffersDynamicAt(long index) { return maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalStorageBuffersDynamicAt(long index, int value) { maxDescriptorSetTotalStorageBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetTotalBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetTotalBuffersDynamicAt(long index) { return maxDescriptorSetTotalBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetTotalBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetTotalBuffersDynamicAt(long index, int value) { maxDescriptorSetTotalBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index) { return maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetUpdateAfterBindTotalBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMaintenance7PropertiesKHR maxDescriptorSetUpdateAfterBindTotalBuffersDynamicAt(long index, int value) { maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(this.segment(), index, value); return this; }

}
