// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAndroidHardwareBufferPropertiesANDROID`.
/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferPropertiesANDROID {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize allocationSize;
///     uint32_t memoryTypeBits;
/// };
/// ```
public final class VkAndroidHardwareBufferPropertiesANDROID extends GroupType {
    /// The struct layout of `VkAndroidHardwareBufferPropertiesANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("allocationSize"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
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
    /// The byte offset of `allocationSize`.
    public static final long OFFSET_allocationSize = LAYOUT.byteOffset(PathElement.groupElement("allocationSize"));
    /// The memory layout of `allocationSize`.
    public static final MemoryLayout LAYOUT_allocationSize = LAYOUT.select(PathElement.groupElement("allocationSize"));
    /// The [VarHandle] of `allocationSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_allocationSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("allocationSize")));
    /// The byte offset of `memoryTypeBits`.
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    /// The memory layout of `memoryTypeBits`.
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memoryTypeBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits")));

    /// Creates `VkAndroidHardwareBufferPropertiesANDROID` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAndroidHardwareBufferPropertiesANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAndroidHardwareBufferPropertiesANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferPropertiesANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferPropertiesANDROID(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferPropertiesANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferPropertiesANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAndroidHardwareBufferPropertiesANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferPropertiesANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferPropertiesANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAndroidHardwareBufferPropertiesANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferPropertiesANDROID`
    public static VkAndroidHardwareBufferPropertiesANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferPropertiesANDROID(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAndroidHardwareBufferPropertiesANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferPropertiesANDROID`
    public static VkAndroidHardwareBufferPropertiesANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferPropertiesANDROID(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID copyFrom(VkAndroidHardwareBufferPropertiesANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAndroidHardwareBufferPropertiesANDROID reinterpret(long count) { return new VkAndroidHardwareBufferPropertiesANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAndroidHardwareBufferPropertiesANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAndroidHardwareBufferPropertiesANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `allocationSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long allocationSize(MemorySegment segment, long index) { return (long) VH_allocationSize.get().get(segment, 0L, index); }
    /// {@return `allocationSize`}
    public long allocationSize() { return allocationSize(this.segment(), 0L); }
    /// Sets `allocationSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void allocationSize(MemorySegment segment, long index, long value) { VH_allocationSize.get().set(segment, 0L, index, value); }
    /// Sets `allocationSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID allocationSize(long value) { allocationSize(this.segment(), 0L, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get().get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    public int memoryTypeBits() { return memoryTypeBits(this.segment(), 0L); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypeBits(MemorySegment segment, long index, int value) { VH_memoryTypeBits.get().set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID memoryTypeBits(int value) { memoryTypeBits(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAndroidHardwareBufferPropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAndroidHardwareBufferPropertiesANDROID`
    public VkAndroidHardwareBufferPropertiesANDROID asSlice(long index) { return new VkAndroidHardwareBufferPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAndroidHardwareBufferPropertiesANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAndroidHardwareBufferPropertiesANDROID`
    public VkAndroidHardwareBufferPropertiesANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferPropertiesANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAndroidHardwareBufferPropertiesANDROID` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID at(long index, Consumer<VkAndroidHardwareBufferPropertiesANDROID> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `allocationSize` at the given index}
    /// @param index the index of the struct buffer
    public long allocationSizeAt(long index) { return allocationSize(this.segment(), index); }
    /// Sets `allocationSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID allocationSizeAt(long index, long value) { allocationSize(this.segment(), index, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param index the index of the struct buffer
    public int memoryTypeBitsAt(long index) { return memoryTypeBits(this.segment(), index); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferPropertiesANDROID memoryTypeBitsAt(long index, int value) { memoryTypeBits(this.segment(), index, value); return this; }

}
