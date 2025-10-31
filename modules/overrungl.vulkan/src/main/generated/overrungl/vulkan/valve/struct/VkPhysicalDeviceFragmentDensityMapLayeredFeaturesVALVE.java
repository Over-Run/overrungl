// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 fragmentDensityMapLayered;
/// };
/// ```
public final class VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE extends GroupType {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapLayered")
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
    /// The byte offset of `fragmentDensityMapLayered`.
    public static final long OFFSET_fragmentDensityMapLayered = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapLayered"));
    /// The memory layout of `fragmentDensityMapLayered`.
    public static final MemoryLayout LAYOUT_fragmentDensityMapLayered = LAYOUT.select(PathElement.groupElement("fragmentDensityMapLayered"));
    /// The [VarHandle] of `fragmentDensityMapLayered` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentDensityMapLayered = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentDensityMapLayered"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`
    public static VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE copyFrom(VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE reinterpret(long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `fragmentDensityMapLayered` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentDensityMapLayered(MemorySegment segment, long index) { return (int) VH_fragmentDensityMapLayered.get(segment, 0L, index); }
    /// {@return `fragmentDensityMapLayered`}
    public int fragmentDensityMapLayered() { return fragmentDensityMapLayered(this.segment(), 0L); }
    /// Sets `fragmentDensityMapLayered` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentDensityMapLayered(MemorySegment segment, long index, int value) { VH_fragmentDensityMapLayered.set(segment, 0L, index, value); }
    /// Sets `fragmentDensityMapLayered` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE fragmentDensityMapLayered(int value) { fragmentDensityMapLayered(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE at(long index, Consumer<VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `fragmentDensityMapLayered` at the given index}
    /// @param index the index of the struct buffer
    public int fragmentDensityMapLayeredAt(long index) { return fragmentDensityMapLayered(this.segment(), index); }
    /// Sets `fragmentDensityMapLayered` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapLayeredFeaturesVALVE fragmentDensityMapLayeredAt(long index, int value) { fragmentDensityMapLayered(this.segment(), index, value); return this; }

}
