// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAllocationCallbacks`.
/// ## Layout
/// ```
/// struct VkAllocationCallbacks {
///     void* pUserData;
///     (void* (*VkAllocationFunction)(void* pUserData, size_t size, size_t alignment, (int) VkSystemAllocationScope allocationScope)) PFN_vkAllocationFunction pfnAllocation;
///     (void* (*VkReallocationFunction)(void* pUserData, void* pOriginal, size_t size, size_t alignment, (int) VkSystemAllocationScope allocationScope)) PFN_vkReallocationFunction pfnReallocation;
///     (void (*VkFreeFunction)(void* pUserData, void* pMemory)) PFN_vkFreeFunction pfnFree;
///     (void (*VkInternalAllocationNotification)(void* pUserData, size_t size, (int) VkInternalAllocationType allocationType, (int) VkSystemAllocationScope allocationScope)) PFN_vkInternalAllocationNotification pfnInternalAllocation;
///     (void (*VkInternalFreeNotification)(void* pUserData, size_t size, (int) VkInternalAllocationType allocationType, (int) VkSystemAllocationScope allocationScope)) PFN_vkInternalFreeNotification pfnInternalFree;
/// };
/// ```
public final class VkAllocationCallbacks extends GroupType {
    /// The struct layout of `VkAllocationCallbacks`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withName("pfnAllocation"),
        ValueLayout.ADDRESS.withName("pfnReallocation"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pfnInternalAllocation"),
        ValueLayout.ADDRESS.withName("pfnInternalFree")
    );
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));
    /// The byte offset of `pfnAllocation`.
    public static final long OFFSET_pfnAllocation = LAYOUT.byteOffset(PathElement.groupElement("pfnAllocation"));
    /// The memory layout of `pfnAllocation`.
    public static final MemoryLayout LAYOUT_pfnAllocation = LAYOUT.select(PathElement.groupElement("pfnAllocation"));
    /// The [VarHandle] of `pfnAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnAllocation"));
    /// The byte offset of `pfnReallocation`.
    public static final long OFFSET_pfnReallocation = LAYOUT.byteOffset(PathElement.groupElement("pfnReallocation"));
    /// The memory layout of `pfnReallocation`.
    public static final MemoryLayout LAYOUT_pfnReallocation = LAYOUT.select(PathElement.groupElement("pfnReallocation"));
    /// The [VarHandle] of `pfnReallocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnReallocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnReallocation"));
    /// The byte offset of `pfnFree`.
    public static final long OFFSET_pfnFree = LAYOUT.byteOffset(PathElement.groupElement("pfnFree"));
    /// The memory layout of `pfnFree`.
    public static final MemoryLayout LAYOUT_pfnFree = LAYOUT.select(PathElement.groupElement("pfnFree"));
    /// The [VarHandle] of `pfnFree` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnFree"));
    /// The byte offset of `pfnInternalAllocation`.
    public static final long OFFSET_pfnInternalAllocation = LAYOUT.byteOffset(PathElement.groupElement("pfnInternalAllocation"));
    /// The memory layout of `pfnInternalAllocation`.
    public static final MemoryLayout LAYOUT_pfnInternalAllocation = LAYOUT.select(PathElement.groupElement("pfnInternalAllocation"));
    /// The [VarHandle] of `pfnInternalAllocation` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnInternalAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnInternalAllocation"));
    /// The byte offset of `pfnInternalFree`.
    public static final long OFFSET_pfnInternalFree = LAYOUT.byteOffset(PathElement.groupElement("pfnInternalFree"));
    /// The memory layout of `pfnInternalFree`.
    public static final MemoryLayout LAYOUT_pfnInternalFree = LAYOUT.select(PathElement.groupElement("pfnInternalFree"));
    /// The [VarHandle] of `pfnInternalFree` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnInternalFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnInternalFree"));

    /// Creates `VkAllocationCallbacks` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAllocationCallbacks(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAllocationCallbacks` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAllocationCallbacks of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAllocationCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAllocationCallbacks ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAllocationCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAllocationCallbacks ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAllocationCallbacks` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAllocationCallbacks`
    public static VkAllocationCallbacks alloc(SegmentAllocator allocator) { return new VkAllocationCallbacks(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAllocationCallbacks` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAllocationCallbacks`
    public static VkAllocationCallbacks alloc(SegmentAllocator allocator, long count) { return new VkAllocationCallbacks(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAllocationCallbacks copyFrom(VkAllocationCallbacks src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAllocationCallbacks reinterpret(long count) { return new VkAllocationCallbacks(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// {@return `pfnAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnAllocation(MemorySegment segment, long index) { return (MemorySegment) VH_pfnAllocation.get(segment, 0L, index); }
    /// {@return `pfnAllocation`}
    public MemorySegment pfnAllocation() { return pfnAllocation(this.segment(), 0L); }
    /// Sets `pfnAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnAllocation(MemorySegment segment, long index, MemorySegment value) { VH_pfnAllocation.set(segment, 0L, index, value); }
    /// Sets `pfnAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnAllocation(MemorySegment value) { pfnAllocation(this.segment(), 0L, value); return this; }

    /// {@return `pfnReallocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnReallocation(MemorySegment segment, long index) { return (MemorySegment) VH_pfnReallocation.get(segment, 0L, index); }
    /// {@return `pfnReallocation`}
    public MemorySegment pfnReallocation() { return pfnReallocation(this.segment(), 0L); }
    /// Sets `pfnReallocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnReallocation(MemorySegment segment, long index, MemorySegment value) { VH_pfnReallocation.set(segment, 0L, index, value); }
    /// Sets `pfnReallocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnReallocation(MemorySegment value) { pfnReallocation(this.segment(), 0L, value); return this; }

    /// {@return `pfnFree` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnFree(MemorySegment segment, long index) { return (MemorySegment) VH_pfnFree.get(segment, 0L, index); }
    /// {@return `pfnFree`}
    public MemorySegment pfnFree() { return pfnFree(this.segment(), 0L); }
    /// Sets `pfnFree` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnFree(MemorySegment segment, long index, MemorySegment value) { VH_pfnFree.set(segment, 0L, index, value); }
    /// Sets `pfnFree` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnFree(MemorySegment value) { pfnFree(this.segment(), 0L, value); return this; }

    /// {@return `pfnInternalAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnInternalAllocation(MemorySegment segment, long index) { return (MemorySegment) VH_pfnInternalAllocation.get(segment, 0L, index); }
    /// {@return `pfnInternalAllocation`}
    public MemorySegment pfnInternalAllocation() { return pfnInternalAllocation(this.segment(), 0L); }
    /// Sets `pfnInternalAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnInternalAllocation(MemorySegment segment, long index, MemorySegment value) { VH_pfnInternalAllocation.set(segment, 0L, index, value); }
    /// Sets `pfnInternalAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalAllocation(MemorySegment value) { pfnInternalAllocation(this.segment(), 0L, value); return this; }

    /// {@return `pfnInternalFree` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnInternalFree(MemorySegment segment, long index) { return (MemorySegment) VH_pfnInternalFree.get(segment, 0L, index); }
    /// {@return `pfnInternalFree`}
    public MemorySegment pfnInternalFree() { return pfnInternalFree(this.segment(), 0L); }
    /// Sets `pfnInternalFree` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnInternalFree(MemorySegment segment, long index, MemorySegment value) { VH_pfnInternalFree.set(segment, 0L, index, value); }
    /// Sets `pfnInternalFree` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalFree(MemorySegment value) { pfnInternalFree(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAllocationCallbacks`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAllocationCallbacks`
    public VkAllocationCallbacks asSlice(long index) { return new VkAllocationCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAllocationCallbacks`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAllocationCallbacks`
    public VkAllocationCallbacks asSlice(long index, long count) { return new VkAllocationCallbacks(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAllocationCallbacks` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAllocationCallbacks at(long index, Consumer<VkAllocationCallbacks> func) { func.accept(asSlice(index)); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

    /// {@return `pfnAllocation` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnAllocationAt(long index) { return pfnAllocation(this.segment(), index); }
    /// Sets `pfnAllocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnAllocationAt(long index, MemorySegment value) { pfnAllocation(this.segment(), index, value); return this; }

    /// {@return `pfnReallocation` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnReallocationAt(long index) { return pfnReallocation(this.segment(), index); }
    /// Sets `pfnReallocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnReallocationAt(long index, MemorySegment value) { pfnReallocation(this.segment(), index, value); return this; }

    /// {@return `pfnFree` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnFreeAt(long index) { return pfnFree(this.segment(), index); }
    /// Sets `pfnFree` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnFreeAt(long index, MemorySegment value) { pfnFree(this.segment(), index, value); return this; }

    /// {@return `pfnInternalAllocation` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnInternalAllocationAt(long index) { return pfnInternalAllocation(this.segment(), index); }
    /// Sets `pfnInternalAllocation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalAllocationAt(long index, MemorySegment value) { pfnInternalAllocation(this.segment(), index, value); return this; }

    /// {@return `pfnInternalFree` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pfnInternalFreeAt(long index) { return pfnInternalFree(this.segment(), index); }
    /// Sets `pfnInternalFree` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalFreeAt(long index, MemorySegment value) { pfnInternalFree(this.segment(), index, value); return this; }

}
