// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 imageCompressionControlSwapchain;
/// };
/// ```
public final class VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionControlSwapchain")
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
    /// The byte offset of `imageCompressionControlSwapchain`.
    public static final long OFFSET_imageCompressionControlSwapchain = LAYOUT.byteOffset(PathElement.groupElement("imageCompressionControlSwapchain"));
    /// The memory layout of `imageCompressionControlSwapchain`.
    public static final MemoryLayout LAYOUT_imageCompressionControlSwapchain = LAYOUT.select(PathElement.groupElement("imageCompressionControlSwapchain"));
    /// The [VarHandle] of `imageCompressionControlSwapchain` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCompressionControlSwapchain = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCompressionControlSwapchain"));

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`
    public static VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT copyFrom(VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageCompressionControlSwapchain` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageCompressionControlSwapchain(MemorySegment segment, long index) { return (int) VH_imageCompressionControlSwapchain.get(segment, 0L, index); }
    /// {@return `imageCompressionControlSwapchain`}
    public int imageCompressionControlSwapchain() { return imageCompressionControlSwapchain(this.segment(), 0L); }
    /// Sets `imageCompressionControlSwapchain` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCompressionControlSwapchain(MemorySegment segment, long index, int value) { VH_imageCompressionControlSwapchain.set(segment, 0L, index, value); }
    /// Sets `imageCompressionControlSwapchain` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchain(int value) { imageCompressionControlSwapchain(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageCompressionControlSwapchain` at the given index}
    /// @param index the index of the struct buffer
    public int imageCompressionControlSwapchainAt(long index) { return imageCompressionControlSwapchain(this.segment(), index); }
    /// Sets `imageCompressionControlSwapchain` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT imageCompressionControlSwapchainAt(long index, int value) { imageCompressionControlSwapchain(this.segment(), index, value); return this; }

}
