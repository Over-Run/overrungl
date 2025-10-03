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

/// Represents `VkBindBufferMemoryDeviceGroupInfo`.
/// ## Layout
/// ```
/// struct VkBindBufferMemoryDeviceGroupInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t deviceIndexCount;
///     const uint32_t* pDeviceIndices;
/// };
/// ```
public final class VkBindBufferMemoryDeviceGroupInfo extends GroupType {
    /// The struct layout of `VkBindBufferMemoryDeviceGroupInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withName("pDeviceIndices")
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
    /// The byte offset of `deviceIndexCount`.
    public static final long OFFSET_deviceIndexCount = LAYOUT.byteOffset(PathElement.groupElement("deviceIndexCount"));
    /// The memory layout of `deviceIndexCount`.
    public static final MemoryLayout LAYOUT_deviceIndexCount = LAYOUT.select(PathElement.groupElement("deviceIndexCount"));
    /// The [VarHandle] of `deviceIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceIndexCount"));
    /// The byte offset of `pDeviceIndices`.
    public static final long OFFSET_pDeviceIndices = LAYOUT.byteOffset(PathElement.groupElement("pDeviceIndices"));
    /// The memory layout of `pDeviceIndices`.
    public static final MemoryLayout LAYOUT_pDeviceIndices = LAYOUT.select(PathElement.groupElement("pDeviceIndices"));
    /// The [VarHandle] of `pDeviceIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDeviceIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceIndices"));

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBindBufferMemoryDeviceGroupInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindBufferMemoryDeviceGroupInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindBufferMemoryDeviceGroupInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBindBufferMemoryDeviceGroupInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBindBufferMemoryDeviceGroupInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBindBufferMemoryDeviceGroupInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBindBufferMemoryDeviceGroupInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBindBufferMemoryDeviceGroupInfo`
    public static VkBindBufferMemoryDeviceGroupInfo alloc(SegmentAllocator allocator) { return new VkBindBufferMemoryDeviceGroupInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBindBufferMemoryDeviceGroupInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBindBufferMemoryDeviceGroupInfo`
    public static VkBindBufferMemoryDeviceGroupInfo alloc(SegmentAllocator allocator, long count) { return new VkBindBufferMemoryDeviceGroupInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo copyFrom(VkBindBufferMemoryDeviceGroupInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBindBufferMemoryDeviceGroupInfo reinterpret(long count) { return new VkBindBufferMemoryDeviceGroupInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBindBufferMemoryDeviceGroupInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBindBufferMemoryDeviceGroupInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceIndexCount(MemorySegment segment, long index) { return (int) VH_deviceIndexCount.get(segment, 0L, index); }
    /// {@return `deviceIndexCount`}
    public int deviceIndexCount() { return deviceIndexCount(this.segment(), 0L); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceIndexCount(MemorySegment segment, long index, int value) { VH_deviceIndexCount.set(segment, 0L, index, value); }
    /// Sets `deviceIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCount(int value) { deviceIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDeviceIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pDeviceIndices.get(segment, 0L, index); }
    /// {@return `pDeviceIndices`}
    public MemorySegment pDeviceIndices() { return pDeviceIndices(this.segment(), 0L); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDeviceIndices(MemorySegment segment, long index, MemorySegment value) { VH_pDeviceIndices.set(segment, 0L, index, value); }
    /// Sets `pDeviceIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndices(MemorySegment value) { pDeviceIndices(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkBindBufferMemoryDeviceGroupInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBindBufferMemoryDeviceGroupInfo`
    public VkBindBufferMemoryDeviceGroupInfo asSlice(long index) { return new VkBindBufferMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBindBufferMemoryDeviceGroupInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBindBufferMemoryDeviceGroupInfo`
    public VkBindBufferMemoryDeviceGroupInfo asSlice(long index, long count) { return new VkBindBufferMemoryDeviceGroupInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBindBufferMemoryDeviceGroupInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo at(long index, Consumer<VkBindBufferMemoryDeviceGroupInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `deviceIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIndexCountAt(long index) { return deviceIndexCount(this.segment(), index); }
    /// Sets `deviceIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo deviceIndexCountAt(long index, int value) { deviceIndexCount(this.segment(), index, value); return this; }

    /// {@return `pDeviceIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDeviceIndicesAt(long index) { return pDeviceIndices(this.segment(), index); }
    /// Sets `pDeviceIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBindBufferMemoryDeviceGroupInfo pDeviceIndicesAt(long index, MemorySegment value) { pDeviceIndices(this.segment(), index, value); return this; }

}
