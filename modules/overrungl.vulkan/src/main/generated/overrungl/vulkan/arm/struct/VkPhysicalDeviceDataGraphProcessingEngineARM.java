// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDataGraphProcessingEngineARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDataGraphProcessingEngineARM {
///     (int) VkPhysicalDeviceDataGraphProcessingEngineTypeARM type;
///     (uint32_t) VkBool32 isForeign;
/// };
/// ```
public final class VkPhysicalDeviceDataGraphProcessingEngineARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDataGraphProcessingEngineARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("isForeign")
    );
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_type = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("type")));
    /// The byte offset of `isForeign`.
    public static final long OFFSET_isForeign = LAYOUT.byteOffset(PathElement.groupElement("isForeign"));
    /// The memory layout of `isForeign`.
    public static final MemoryLayout LAYOUT_isForeign = LAYOUT.select(PathElement.groupElement("isForeign"));
    /// The [VarHandle] of `isForeign` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_isForeign = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("isForeign")));

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDataGraphProcessingEngineARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDataGraphProcessingEngineARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public static VkPhysicalDeviceDataGraphProcessingEngineARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM copyFrom(VkPhysicalDeviceDataGraphProcessingEngineARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDataGraphProcessingEngineARM reinterpret(long count) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDataGraphProcessingEngineARM type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `isForeign` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int isForeign(MemorySegment segment, long index) { return (int) VH_isForeign.get().get(segment, 0L, index); }
    /// {@return `isForeign`}
    public int isForeign() { return isForeign(this.segment(), 0L); }
    /// Sets `isForeign` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void isForeign(MemorySegment segment, long index, int value) { VH_isForeign.get().set(segment, 0L, index, value); }
    /// Sets `isForeign` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeign(int value) { isForeign(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public VkPhysicalDeviceDataGraphProcessingEngineARM asSlice(long index) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDataGraphProcessingEngineARM`
    public VkPhysicalDeviceDataGraphProcessingEngineARM asSlice(long index, long count) { return new VkPhysicalDeviceDataGraphProcessingEngineARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDataGraphProcessingEngineARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM at(long index, Consumer<VkPhysicalDeviceDataGraphProcessingEngineARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `isForeign` at the given index}
    /// @param index the index of the struct buffer
    public int isForeignAt(long index) { return isForeign(this.segment(), index); }
    /// Sets `isForeign` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeignAt(long index, int value) { isForeign(this.segment(), index, value); return this; }

}
