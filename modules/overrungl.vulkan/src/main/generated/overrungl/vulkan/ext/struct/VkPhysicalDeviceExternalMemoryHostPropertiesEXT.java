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

/// Represents `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExternalMemoryHostPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize minImportedHostPointerAlignment;
/// };
/// ```
public final class VkPhysicalDeviceExternalMemoryHostPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("minImportedHostPointerAlignment")
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
    /// The byte offset of `minImportedHostPointerAlignment`.
    public static final long OFFSET_minImportedHostPointerAlignment = LAYOUT.byteOffset(PathElement.groupElement("minImportedHostPointerAlignment"));
    /// The memory layout of `minImportedHostPointerAlignment`.
    public static final MemoryLayout LAYOUT_minImportedHostPointerAlignment = LAYOUT.select(PathElement.groupElement("minImportedHostPointerAlignment"));
    /// The [VarHandle] of `minImportedHostPointerAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minImportedHostPointerAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImportedHostPointerAlignment")));

    /// Creates `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`
    public static VkPhysicalDeviceExternalMemoryHostPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT copyFrom(VkPhysicalDeviceExternalMemoryHostPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minImportedHostPointerAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minImportedHostPointerAlignment(MemorySegment segment, long index) { return (long) VH_minImportedHostPointerAlignment.get().get(segment, 0L, index); }
    /// {@return `minImportedHostPointerAlignment`}
    public long minImportedHostPointerAlignment() { return minImportedHostPointerAlignment(this.segment(), 0L); }
    /// Sets `minImportedHostPointerAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minImportedHostPointerAlignment(MemorySegment segment, long index, long value) { VH_minImportedHostPointerAlignment.get().set(segment, 0L, index, value); }
    /// Sets `minImportedHostPointerAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT minImportedHostPointerAlignment(long value) { minImportedHostPointerAlignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceExternalMemoryHostPropertiesEXT`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceExternalMemoryHostPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT at(long index, Consumer<VkPhysicalDeviceExternalMemoryHostPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `minImportedHostPointerAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minImportedHostPointerAlignmentAt(long index) { return minImportedHostPointerAlignment(this.segment(), index); }
    /// Sets `minImportedHostPointerAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT minImportedHostPointerAlignmentAt(long index, long value) { minImportedHostPointerAlignment(this.segment(), index, value); return this; }

}
