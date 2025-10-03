// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 imageSlicedViewOf3D;
/// };
/// ```
public final class VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageSlicedViewOf3D")
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
    /// The byte offset of `imageSlicedViewOf3D`.
    public static final long OFFSET_imageSlicedViewOf3D = LAYOUT.byteOffset(PathElement.groupElement("imageSlicedViewOf3D"));
    /// The memory layout of `imageSlicedViewOf3D`.
    public static final MemoryLayout LAYOUT_imageSlicedViewOf3D = LAYOUT.select(PathElement.groupElement("imageSlicedViewOf3D"));
    /// The [VarHandle] of `imageSlicedViewOf3D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_imageSlicedViewOf3D = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageSlicedViewOf3D")));

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT copyFrom(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageSlicedViewOf3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageSlicedViewOf3D(MemorySegment segment, long index) { return (int) VH_imageSlicedViewOf3D.get().get(segment, 0L, index); }
    /// {@return `imageSlicedViewOf3D`}
    public int imageSlicedViewOf3D() { return imageSlicedViewOf3D(this.segment(), 0L); }
    /// Sets `imageSlicedViewOf3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageSlicedViewOf3D(MemorySegment segment, long index, int value) { VH_imageSlicedViewOf3D.get().set(segment, 0L, index, value); }
    /// Sets `imageSlicedViewOf3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3D(int value) { imageSlicedViewOf3D(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT at(long index, Consumer<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageSlicedViewOf3D` at the given index}
    /// @param index the index of the struct buffer
    public int imageSlicedViewOf3DAt(long index) { return imageSlicedViewOf3D(this.segment(), index); }
    /// Sets `imageSlicedViewOf3D` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3DAt(long index, int value) { imageSlicedViewOf3D(this.segment(), index, value); return this; }

}
