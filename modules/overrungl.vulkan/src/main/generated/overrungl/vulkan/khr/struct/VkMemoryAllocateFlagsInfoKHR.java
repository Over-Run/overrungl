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

/// Represents `VkMemoryAllocateFlagsInfoKHR`.
/// ## Layout
/// ```
/// struct VkMemoryAllocateFlagsInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkMemoryAllocateFlags flags;
///     uint32_t deviceMask;
/// };
/// ```
public final class VkMemoryAllocateFlagsInfoKHR extends GroupType {
    /// The struct layout of `VkMemoryAllocateFlagsInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("deviceMask")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `deviceMask`.
    public static final long OFFSET_deviceMask = LAYOUT.byteOffset(PathElement.groupElement("deviceMask"));
    /// The memory layout of `deviceMask`.
    public static final MemoryLayout LAYOUT_deviceMask = LAYOUT.select(PathElement.groupElement("deviceMask"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));

    /// Creates `VkMemoryAllocateFlagsInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryAllocateFlagsInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryAllocateFlagsInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateFlagsInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryAllocateFlagsInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryAllocateFlagsInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateFlagsInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryAllocateFlagsInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryAllocateFlagsInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryAllocateFlagsInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryAllocateFlagsInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryAllocateFlagsInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryAllocateFlagsInfoKHR`
    public static VkMemoryAllocateFlagsInfoKHR alloc(SegmentAllocator allocator) { return new VkMemoryAllocateFlagsInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryAllocateFlagsInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryAllocateFlagsInfoKHR`
    public static VkMemoryAllocateFlagsInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryAllocateFlagsInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR copyFrom(VkMemoryAllocateFlagsInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryAllocateFlagsInfoKHR reinterpret(long count) { return new VkMemoryAllocateFlagsInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryAllocateFlagsInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryAllocateFlagsInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    public int deviceMask() { return deviceMask(this.segment(), 0L); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceMask(MemorySegment segment, long index, int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR deviceMask(int value) { deviceMask(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryAllocateFlagsInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryAllocateFlagsInfoKHR`
    public VkMemoryAllocateFlagsInfoKHR asSlice(long index) { return new VkMemoryAllocateFlagsInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryAllocateFlagsInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryAllocateFlagsInfoKHR`
    public VkMemoryAllocateFlagsInfoKHR asSlice(long index, long count) { return new VkMemoryAllocateFlagsInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryAllocateFlagsInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR at(long index, Consumer<VkMemoryAllocateFlagsInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param index the index of the struct buffer
    public int deviceMaskAt(long index) { return deviceMask(this.segment(), index); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryAllocateFlagsInfoKHR deviceMaskAt(long index, int value) { deviceMask(this.segment(), index, value); return this; }

}
