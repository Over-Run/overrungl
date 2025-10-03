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

/// Represents `VkApplicationParametersEXT`.
/// ## Layout
/// ```
/// struct VkApplicationParametersEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint32_t key;
///     uint64_t value;
/// };
/// ```
public final class VkApplicationParametersEXT extends GroupType {
    /// The struct layout of `VkApplicationParametersEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("key"),
        ValueLayout.JAVA_LONG.withName("value")
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
    /// The byte offset of `vendorID`.
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    /// The memory layout of `vendorID`.
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    /// The [VarHandle] of `vendorID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_vendorID = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID")));
    /// The byte offset of `deviceID`.
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    /// The memory layout of `deviceID`.
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    /// The [VarHandle] of `deviceID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_deviceID = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID")));
    /// The byte offset of `key`.
    public static final long OFFSET_key = LAYOUT.byteOffset(PathElement.groupElement("key"));
    /// The memory layout of `key`.
    public static final MemoryLayout LAYOUT_key = LAYOUT.select(PathElement.groupElement("key"));
    /// The [VarHandle] of `key` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_key = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("key")));
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_value = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("value")));

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkApplicationParametersEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationParametersEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationParametersEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationParametersEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationParametersEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkApplicationParametersEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationParametersEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkApplicationParametersEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationParametersEXT`
    public static VkApplicationParametersEXT alloc(SegmentAllocator allocator) { return new VkApplicationParametersEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkApplicationParametersEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkApplicationParametersEXT`
    public static VkApplicationParametersEXT alloc(SegmentAllocator allocator, long count) { return new VkApplicationParametersEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkApplicationParametersEXT copyFrom(VkApplicationParametersEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkApplicationParametersEXT reinterpret(long count) { return new VkApplicationParametersEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkApplicationParametersEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkApplicationParametersEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int vendorID(MemorySegment segment, long index) { return (int) VH_vendorID.get().get(segment, 0L, index); }
    /// {@return `vendorID`}
    public int vendorID() { return vendorID(this.segment(), 0L); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorID(MemorySegment segment, long index, int value) { VH_vendorID.get().set(segment, 0L, index, value); }
    /// Sets `vendorID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT vendorID(int value) { vendorID(this.segment(), 0L, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceID(MemorySegment segment, long index) { return (int) VH_deviceID.get().get(segment, 0L, index); }
    /// {@return `deviceID`}
    public int deviceID() { return deviceID(this.segment(), 0L); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceID(MemorySegment segment, long index, int value) { VH_deviceID.get().set(segment, 0L, index, value); }
    /// Sets `deviceID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT deviceID(int value) { deviceID(this.segment(), 0L, value); return this; }

    /// {@return `key` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int key(MemorySegment segment, long index) { return (int) VH_key.get().get(segment, 0L, index); }
    /// {@return `key`}
    public int key() { return key(this.segment(), 0L); }
    /// Sets `key` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void key(MemorySegment segment, long index, int value) { VH_key.get().set(segment, 0L, index, value); }
    /// Sets `key` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT key(int value) { key(this.segment(), 0L, value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long value(MemorySegment segment, long index) { return (long) VH_value.get().get(segment, 0L, index); }
    /// {@return `value`}
    public long value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, long value) { VH_value.get().set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT value(long value) { value(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkApplicationParametersEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkApplicationParametersEXT`
    public VkApplicationParametersEXT asSlice(long index) { return new VkApplicationParametersEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkApplicationParametersEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkApplicationParametersEXT`
    public VkApplicationParametersEXT asSlice(long index, long count) { return new VkApplicationParametersEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkApplicationParametersEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkApplicationParametersEXT at(long index, Consumer<VkApplicationParametersEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `vendorID` at the given index}
    /// @param index the index of the struct buffer
    public int vendorIDAt(long index) { return vendorID(this.segment(), index); }
    /// Sets `vendorID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT vendorIDAt(long index, int value) { vendorID(this.segment(), index, value); return this; }

    /// {@return `deviceID` at the given index}
    /// @param index the index of the struct buffer
    public int deviceIDAt(long index) { return deviceID(this.segment(), index); }
    /// Sets `deviceID` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT deviceIDAt(long index, int value) { deviceID(this.segment(), index, value); return this; }

    /// {@return `key` at the given index}
    /// @param index the index of the struct buffer
    public int keyAt(long index) { return key(this.segment(), index); }
    /// Sets `key` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT keyAt(long index, int value) { key(this.segment(), index, value); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public long valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkApplicationParametersEXT valueAt(long index, long value) { value(this.segment(), index, value); return this; }

}
