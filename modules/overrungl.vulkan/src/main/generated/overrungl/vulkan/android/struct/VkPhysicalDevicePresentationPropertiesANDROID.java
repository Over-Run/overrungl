// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePresentationPropertiesANDROID`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePresentationPropertiesANDROID {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 sharedImage;
/// };
/// ```
public final class VkPhysicalDevicePresentationPropertiesANDROID extends GroupType {
    /// The struct layout of `VkPhysicalDevicePresentationPropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sharedImage")
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
    /// The byte offset of `sharedImage`.
    public static final long OFFSET_sharedImage = LAYOUT.byteOffset(PathElement.groupElement("sharedImage"));
    /// The memory layout of `sharedImage`.
    public static final MemoryLayout LAYOUT_sharedImage = LAYOUT.select(PathElement.groupElement("sharedImage"));
    /// The [VarHandle] of `sharedImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sharedImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedImage"));

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevicePresentationPropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentationPropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentationPropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevicePresentationPropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePresentationPropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevicePresentationPropertiesANDROID`
    public static VkPhysicalDevicePresentationPropertiesANDROID alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePresentationPropertiesANDROID(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevicePresentationPropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevicePresentationPropertiesANDROID`
    public static VkPhysicalDevicePresentationPropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePresentationPropertiesANDROID(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID copyFrom(VkPhysicalDevicePresentationPropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevicePresentationPropertiesANDROID reinterpret(long count) { return new VkPhysicalDevicePresentationPropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevicePresentationPropertiesANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevicePresentationPropertiesANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `sharedImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sharedImage(MemorySegment segment, long index) { return (int) VH_sharedImage.get(segment, 0L, index); }
    /// {@return `sharedImage`}
    public int sharedImage() { return sharedImage(this.segment(), 0L); }
    /// Sets `sharedImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sharedImage(MemorySegment segment, long index, int value) { VH_sharedImage.set(segment, 0L, index, value); }
    /// Sets `sharedImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID sharedImage(int value) { sharedImage(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevicePresentationPropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevicePresentationPropertiesANDROID`
    public VkPhysicalDevicePresentationPropertiesANDROID asSlice(long index) { return new VkPhysicalDevicePresentationPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevicePresentationPropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevicePresentationPropertiesANDROID`
    public VkPhysicalDevicePresentationPropertiesANDROID asSlice(long index, long count) { return new VkPhysicalDevicePresentationPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevicePresentationPropertiesANDROID` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID at(long index, Consumer<VkPhysicalDevicePresentationPropertiesANDROID> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `sharedImage` at the given index}
    /// @param index the index of the struct buffer
    public int sharedImageAt(long index) { return sharedImage(this.segment(), index); }
    /// Sets `sharedImage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevicePresentationPropertiesANDROID sharedImageAt(long index, int value) { sharedImage(this.segment(), index, value); return this; }

}
