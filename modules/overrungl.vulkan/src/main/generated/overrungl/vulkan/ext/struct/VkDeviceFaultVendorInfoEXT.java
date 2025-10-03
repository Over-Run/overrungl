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

/// Represents `VkDeviceFaultVendorInfoEXT`.
/// ## Layout
/// ```
/// struct VkDeviceFaultVendorInfoEXT {
///     char description[256];
///     uint64_t vendorFaultCode;
///     uint64_t vendorFaultData;
/// };
/// ```
public final class VkDeviceFaultVendorInfoEXT extends GroupType {
    /// The struct layout of `VkDeviceFaultVendorInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        MemoryLayout.sequenceLayout(256, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_LONG.withName("vendorFaultCode"),
        ValueLayout.JAVA_LONG.withName("vendorFaultData")
    );
    /// The byte offset of `description`.
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    /// The memory layout of `description`.
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    /// The [VarHandle] of `description` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    /// The byte offset of `vendorFaultCode`.
    public static final long OFFSET_vendorFaultCode = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultCode"));
    /// The memory layout of `vendorFaultCode`.
    public static final MemoryLayout LAYOUT_vendorFaultCode = LAYOUT.select(PathElement.groupElement("vendorFaultCode"));
    /// The [VarHandle] of `vendorFaultCode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorFaultCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultCode"));
    /// The byte offset of `vendorFaultData`.
    public static final long OFFSET_vendorFaultData = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultData"));
    /// The memory layout of `vendorFaultData`.
    public static final MemoryLayout LAYOUT_vendorFaultData = LAYOUT.select(PathElement.groupElement("vendorFaultData"));
    /// The [VarHandle] of `vendorFaultData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_vendorFaultData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorFaultData"));

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceFaultVendorInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceFaultVendorInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceFaultVendorInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceFaultVendorInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceFaultVendorInfoEXT`
    public static VkDeviceFaultVendorInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultVendorInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT copyFrom(VkDeviceFaultVendorInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceFaultVendorInfoEXT reinterpret(long count) { return new VkDeviceFaultVendorInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment description(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    /// {@return `description` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte description(MemorySegment segment, long index, long index0) { return (byte) VH_description.get(segment, 0L, index, index0); }
    /// {@return `description`}
    public MemorySegment description() { return description(this.segment(), 0L); }
    /// {@return `description`}
    /// @param index0 the Index 0 of the array
    public byte description(long index0) { return description(this.segment(), 0L, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void description(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_description, index), LAYOUT_description.byteSize()); }
    /// Sets `description` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void description(MemorySegment segment, long index, long index0, byte value) { VH_description.set(segment, 0L, index, index0, value); }
    /// Sets `description` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT description(MemorySegment value) { description(this.segment(), 0L, value); return this; }
    /// Sets `description` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT description(long index0, byte value) { description(this.segment(), 0L, index0, value); return this; }

    /// {@return `vendorFaultCode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vendorFaultCode(MemorySegment segment, long index) { return (long) VH_vendorFaultCode.get(segment, 0L, index); }
    /// {@return `vendorFaultCode`}
    public long vendorFaultCode() { return vendorFaultCode(this.segment(), 0L); }
    /// Sets `vendorFaultCode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorFaultCode(MemorySegment segment, long index, long value) { VH_vendorFaultCode.set(segment, 0L, index, value); }
    /// Sets `vendorFaultCode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultCode(long value) { vendorFaultCode(this.segment(), 0L, value); return this; }

    /// {@return `vendorFaultData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long vendorFaultData(MemorySegment segment, long index) { return (long) VH_vendorFaultData.get(segment, 0L, index); }
    /// {@return `vendorFaultData`}
    public long vendorFaultData() { return vendorFaultData(this.segment(), 0L); }
    /// Sets `vendorFaultData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void vendorFaultData(MemorySegment segment, long index, long value) { VH_vendorFaultData.set(segment, 0L, index, value); }
    /// Sets `vendorFaultData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultData(long value) { vendorFaultData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceFaultVendorInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceFaultVendorInfoEXT`
    public VkDeviceFaultVendorInfoEXT asSlice(long index) { return new VkDeviceFaultVendorInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceFaultVendorInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceFaultVendorInfoEXT`
    public VkDeviceFaultVendorInfoEXT asSlice(long index, long count) { return new VkDeviceFaultVendorInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceFaultVendorInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT at(long index, Consumer<VkDeviceFaultVendorInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment descriptionAt(long index) { return description(this.segment(), index); }
    /// {@return `description` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte descriptionAt(long index, long index0) { return description(this.segment(), index, index0); }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT descriptionAt(long index, MemorySegment value) { description(this.segment(), index, value); return this; }
    /// Sets `description` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT descriptionAt(long index, long index0, byte value) { description(this.segment(), index, index0, value); return this; }

    /// {@return `vendorFaultCode` at the given index}
    /// @param index the index of the struct buffer
    public long vendorFaultCodeAt(long index) { return vendorFaultCode(this.segment(), index); }
    /// Sets `vendorFaultCode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultCodeAt(long index, long value) { vendorFaultCode(this.segment(), index, value); return this; }

    /// {@return `vendorFaultData` at the given index}
    /// @param index the index of the struct buffer
    public long vendorFaultDataAt(long index) { return vendorFaultData(this.segment(), index); }
    /// Sets `vendorFaultData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceFaultVendorInfoEXT vendorFaultDataAt(long index, long value) { vendorFaultData(this.segment(), index, value); return this; }

}
