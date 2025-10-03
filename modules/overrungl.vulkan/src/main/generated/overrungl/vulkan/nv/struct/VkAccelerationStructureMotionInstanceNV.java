// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAccelerationStructureMotionInstanceNV`.
/// ## Layout
/// ```
/// struct VkAccelerationStructureMotionInstanceNV {
///     (int) VkAccelerationStructureMotionInstanceTypeNV type;
///     ((uint32_t) VkFlags) VkAccelerationStructureMotionInstanceFlagsNV flags;
///     (union VkAccelerationStructureMotionInstanceDataNV) VkAccelerationStructureMotionInstanceDataNV data;
/// };
/// ```
public final class VkAccelerationStructureMotionInstanceNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureMotionInstanceNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.nv.union.VkAccelerationStructureMotionInstanceDataNV.LAYOUT.withName("data")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_type = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("type")));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureMotionInstanceNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureMotionInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMotionInstanceNV`
    public static VkAccelerationStructureMotionInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMotionInstanceNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureMotionInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMotionInstanceNV`
    public static VkAccelerationStructureMotionInstanceNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMotionInstanceNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV copyFrom(VkAccelerationStructureMotionInstanceNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureMotionInstanceNV reinterpret(long count) { return new VkAccelerationStructureMotionInstanceNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get().get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.get().set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    /// {@return `data`}
    public MemorySegment data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), LAYOUT_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV data(MemorySegment value) { data(this.segment(), 0L, value); return this; }
    /// Accepts `data` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV data(Consumer<overrungl.vulkan.nv.union.VkAccelerationStructureMotionInstanceDataNV> func) { func.accept(overrungl.vulkan.nv.union.VkAccelerationStructureMotionInstanceDataNV.of(data())); return this; }

    /// Creates a slice of `VkAccelerationStructureMotionInstanceNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureMotionInstanceNV`
    public VkAccelerationStructureMotionInstanceNV asSlice(long index) { return new VkAccelerationStructureMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureMotionInstanceNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureMotionInstanceNV`
    public VkAccelerationStructureMotionInstanceNV asSlice(long index, long count) { return new VkAccelerationStructureMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureMotionInstanceNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV at(long index, Consumer<VkAccelerationStructureMotionInstanceNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `data` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dataAt(long index) { return data(this.segment(), index); }
    /// Sets `data` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV dataAt(long index, MemorySegment value) { data(this.segment(), index, value); return this; }
    /// Accepts `data` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV dataAt(long index, Consumer<overrungl.vulkan.nv.union.VkAccelerationStructureMotionInstanceDataNV> func) { func.accept(overrungl.vulkan.nv.union.VkAccelerationStructureMotionInstanceDataNV.of(dataAt(index))); return this; }

}
