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

/// Represents `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint64_t) VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     (uint32_t) VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     (uint64_t) VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     (uint32_t) VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
/// };
/// ```
public final class VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment")
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
    /// The byte offset of `storageTexelBufferOffsetAlignmentBytes`.
    public static final long OFFSET_storageTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The memory layout of `storageTexelBufferOffsetAlignmentBytes`.
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `storageTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storageTexelBufferOffsetAlignmentBytes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes")));
    /// The byte offset of `storageTexelBufferOffsetSingleTexelAlignment`.
    public static final long OFFSET_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The memory layout of `storageTexelBufferOffsetSingleTexelAlignment`.
    public static final MemoryLayout LAYOUT_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `storageTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storageTexelBufferOffsetSingleTexelAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment")));
    /// The byte offset of `uniformTexelBufferOffsetAlignmentBytes`.
    public static final long OFFSET_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The memory layout of `uniformTexelBufferOffsetAlignmentBytes`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `uniformTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uniformTexelBufferOffsetAlignmentBytes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes")));
    /// The byte offset of `uniformTexelBufferOffsetSingleTexelAlignment`.
    public static final long OFFSET_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The memory layout of `uniformTexelBufferOffsetSingleTexelAlignment`.
    public static final MemoryLayout LAYOUT_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.select(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `uniformTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uniformTexelBufferOffsetSingleTexelAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment")));

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`
    public static VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`
    public static VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT copyFrom(VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get().get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    public long storageTexelBufferOffsetAlignmentBytes() { return storageTexelBufferOffsetAlignmentBytes(this.segment(), 0L); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, long value) { VH_storageTexelBufferOffsetAlignmentBytes.get().set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT storageTexelBufferOffsetAlignmentBytes(long value) { storageTexelBufferOffsetAlignmentBytes(this.segment(), 0L, value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get().get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    public int storageTexelBufferOffsetSingleTexelAlignment() { return storageTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.get().set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT storageTexelBufferOffsetSingleTexelAlignment(int value) { storageTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get().get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    public long uniformTexelBufferOffsetAlignmentBytes() { return uniformTexelBufferOffsetAlignmentBytes(this.segment(), 0L); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, long value) { VH_uniformTexelBufferOffsetAlignmentBytes.get().set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT uniformTexelBufferOffsetAlignmentBytes(long value) { uniformTexelBufferOffsetAlignmentBytes(this.segment(), 0L, value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get().get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    public int uniformTexelBufferOffsetSingleTexelAlignment() { return uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.get().set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT uniformTexelBufferOffsetSingleTexelAlignment(int value) { uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT at(long index, Consumer<VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index of the struct buffer
    public long storageTexelBufferOffsetAlignmentBytesAt(long index) { return storageTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT storageTexelBufferOffsetAlignmentBytesAt(long index, long value) { storageTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT storageTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index of the struct buffer
    public long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return uniformTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT uniformTexelBufferOffsetAlignmentBytesAt(long index, long value) { uniformTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index of the struct buffer
    public int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, int value) { uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }

}
