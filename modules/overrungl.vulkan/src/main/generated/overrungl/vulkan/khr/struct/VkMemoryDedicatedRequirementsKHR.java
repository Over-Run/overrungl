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

/// Represents `VkMemoryDedicatedRequirementsKHR`.
/// ## Layout
/// ```
/// struct VkMemoryDedicatedRequirementsKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 prefersDedicatedAllocation;
///     (uint32_t) VkBool32 requiresDedicatedAllocation;
/// };
/// ```
public final class VkMemoryDedicatedRequirementsKHR extends GroupType {
    /// The struct layout of `VkMemoryDedicatedRequirementsKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("prefersDedicatedAllocation"),
        ValueLayout.JAVA_INT.withName("requiresDedicatedAllocation")
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
    /// The byte offset of `prefersDedicatedAllocation`.
    public static final long OFFSET_prefersDedicatedAllocation = LAYOUT.byteOffset(PathElement.groupElement("prefersDedicatedAllocation"));
    /// The memory layout of `prefersDedicatedAllocation`.
    public static final MemoryLayout LAYOUT_prefersDedicatedAllocation = LAYOUT.select(PathElement.groupElement("prefersDedicatedAllocation"));
    /// The [VarHandle] of `prefersDedicatedAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_prefersDedicatedAllocation = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersDedicatedAllocation")));
    /// The byte offset of `requiresDedicatedAllocation`.
    public static final long OFFSET_requiresDedicatedAllocation = LAYOUT.byteOffset(PathElement.groupElement("requiresDedicatedAllocation"));
    /// The memory layout of `requiresDedicatedAllocation`.
    public static final MemoryLayout LAYOUT_requiresDedicatedAllocation = LAYOUT.select(PathElement.groupElement("requiresDedicatedAllocation"));
    /// The [VarHandle] of `requiresDedicatedAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_requiresDedicatedAllocation = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresDedicatedAllocation")));

    /// Creates `VkMemoryDedicatedRequirementsKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryDedicatedRequirementsKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryDedicatedRequirementsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryDedicatedRequirementsKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirementsKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryDedicatedRequirementsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryDedicatedRequirementsKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirementsKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryDedicatedRequirementsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryDedicatedRequirementsKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryDedicatedRequirementsKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryDedicatedRequirementsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryDedicatedRequirementsKHR`
    public static VkMemoryDedicatedRequirementsKHR alloc(SegmentAllocator allocator) { return new VkMemoryDedicatedRequirementsKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryDedicatedRequirementsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryDedicatedRequirementsKHR`
    public static VkMemoryDedicatedRequirementsKHR alloc(SegmentAllocator allocator, long count) { return new VkMemoryDedicatedRequirementsKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR copyFrom(VkMemoryDedicatedRequirementsKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryDedicatedRequirementsKHR reinterpret(long count) { return new VkMemoryDedicatedRequirementsKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryDedicatedRequirementsKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryDedicatedRequirementsKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `prefersDedicatedAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersDedicatedAllocation(MemorySegment segment, long index) { return (int) VH_prefersDedicatedAllocation.get().get(segment, 0L, index); }
    /// {@return `prefersDedicatedAllocation`}
    public int prefersDedicatedAllocation() { return prefersDedicatedAllocation(this.segment(), 0L); }
    /// Sets `prefersDedicatedAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersDedicatedAllocation(MemorySegment segment, long index, int value) { VH_prefersDedicatedAllocation.get().set(segment, 0L, index, value); }
    /// Sets `prefersDedicatedAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR prefersDedicatedAllocation(int value) { prefersDedicatedAllocation(this.segment(), 0L, value); return this; }

    /// {@return `requiresDedicatedAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiresDedicatedAllocation(MemorySegment segment, long index) { return (int) VH_requiresDedicatedAllocation.get().get(segment, 0L, index); }
    /// {@return `requiresDedicatedAllocation`}
    public int requiresDedicatedAllocation() { return requiresDedicatedAllocation(this.segment(), 0L); }
    /// Sets `requiresDedicatedAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiresDedicatedAllocation(MemorySegment segment, long index, int value) { VH_requiresDedicatedAllocation.get().set(segment, 0L, index, value); }
    /// Sets `requiresDedicatedAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR requiresDedicatedAllocation(int value) { requiresDedicatedAllocation(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMemoryDedicatedRequirementsKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryDedicatedRequirementsKHR`
    public VkMemoryDedicatedRequirementsKHR asSlice(long index) { return new VkMemoryDedicatedRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryDedicatedRequirementsKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryDedicatedRequirementsKHR`
    public VkMemoryDedicatedRequirementsKHR asSlice(long index, long count) { return new VkMemoryDedicatedRequirementsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryDedicatedRequirementsKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR at(long index, Consumer<VkMemoryDedicatedRequirementsKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `prefersDedicatedAllocation` at the given index}
    /// @param index the index of the struct buffer
    public int prefersDedicatedAllocationAt(long index) { return prefersDedicatedAllocation(this.segment(), index); }
    /// Sets `prefersDedicatedAllocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR prefersDedicatedAllocationAt(long index, int value) { prefersDedicatedAllocation(this.segment(), index, value); return this; }

    /// {@return `requiresDedicatedAllocation` at the given index}
    /// @param index the index of the struct buffer
    public int requiresDedicatedAllocationAt(long index) { return requiresDedicatedAllocation(this.segment(), index); }
    /// Sets `requiresDedicatedAllocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryDedicatedRequirementsKHR requiresDedicatedAllocationAt(long index, int value) { requiresDedicatedAllocation(this.segment(), index, value); return this; }

}
