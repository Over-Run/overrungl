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

/// Represents `VkPhysicalDeviceVariablePointerFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVariablePointerFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 variablePointersStorageBuffer;
///     (uint32_t) VkBool32 variablePointers;
/// };
/// ```
public final class VkPhysicalDeviceVariablePointerFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVariablePointerFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers")
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
    /// The byte offset of `variablePointersStorageBuffer`.
    public static final long OFFSET_variablePointersStorageBuffer = LAYOUT.byteOffset(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The memory layout of `variablePointersStorageBuffer`.
    public static final MemoryLayout LAYOUT_variablePointersStorageBuffer = LAYOUT.select(PathElement.groupElement("variablePointersStorageBuffer"));
    /// The [VarHandle] of `variablePointersStorageBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_variablePointersStorageBuffer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointersStorageBuffer")));
    /// The byte offset of `variablePointers`.
    public static final long OFFSET_variablePointers = LAYOUT.byteOffset(PathElement.groupElement("variablePointers"));
    /// The memory layout of `variablePointers`.
    public static final MemoryLayout LAYOUT_variablePointers = LAYOUT.select(PathElement.groupElement("variablePointers"));
    /// The [VarHandle] of `variablePointers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_variablePointers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("variablePointers")));

    /// Creates `VkPhysicalDeviceVariablePointerFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVariablePointerFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVariablePointerFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointerFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVariablePointerFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointerFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVariablePointerFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVariablePointerFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVariablePointerFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeaturesKHR`
    public static VkPhysicalDeviceVariablePointerFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVariablePointerFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVariablePointerFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVariablePointerFeaturesKHR`
    public static VkPhysicalDeviceVariablePointerFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVariablePointerFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR copyFrom(VkPhysicalDeviceVariablePointerFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVariablePointerFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceVariablePointerFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVariablePointerFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVariablePointerFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variablePointersStorageBuffer(MemorySegment segment, long index) { return (int) VH_variablePointersStorageBuffer.get().get(segment, 0L, index); }
    /// {@return `variablePointersStorageBuffer`}
    public int variablePointersStorageBuffer() { return variablePointersStorageBuffer(this.segment(), 0L); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variablePointersStorageBuffer(MemorySegment segment, long index, int value) { VH_variablePointersStorageBuffer.get().set(segment, 0L, index, value); }
    /// Sets `variablePointersStorageBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointersStorageBuffer(int value) { variablePointersStorageBuffer(this.segment(), 0L, value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int variablePointers(MemorySegment segment, long index) { return (int) VH_variablePointers.get().get(segment, 0L, index); }
    /// {@return `variablePointers`}
    public int variablePointers() { return variablePointers(this.segment(), 0L); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void variablePointers(MemorySegment segment, long index, int value) { VH_variablePointers.get().set(segment, 0L, index, value); }
    /// Sets `variablePointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointers(int value) { variablePointers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVariablePointerFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVariablePointerFeaturesKHR`
    public VkPhysicalDeviceVariablePointerFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVariablePointerFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVariablePointerFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVariablePointerFeaturesKHR`
    public VkPhysicalDeviceVariablePointerFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVariablePointerFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVariablePointerFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR at(long index, Consumer<VkPhysicalDeviceVariablePointerFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `variablePointersStorageBuffer` at the given index}
    /// @param index the index of the struct buffer
    public int variablePointersStorageBufferAt(long index) { return variablePointersStorageBuffer(this.segment(), index); }
    /// Sets `variablePointersStorageBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointersStorageBufferAt(long index, int value) { variablePointersStorageBuffer(this.segment(), index, value); return this; }

    /// {@return `variablePointers` at the given index}
    /// @param index the index of the struct buffer
    public int variablePointersAt(long index) { return variablePointers(this.segment(), index); }
    /// Sets `variablePointers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointersAt(long index, int value) { variablePointers(this.segment(), index, value); return this; }

}
