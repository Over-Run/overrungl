/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### pUserData
/// [VarHandle][#VH_pUserData] - [Getter][#pUserData()] - [Setter][#pUserData(java.lang.foreign.MemorySegment)]
/// ### pfnAllocation
/// [VarHandle][#VH_pfnAllocation] - [Getter][#pfnAllocation()] - [Setter][#pfnAllocation(java.lang.foreign.MemorySegment)]
/// ### pfnReallocation
/// [VarHandle][#VH_pfnReallocation] - [Getter][#pfnReallocation()] - [Setter][#pfnReallocation(java.lang.foreign.MemorySegment)]
/// ### pfnFree
/// [VarHandle][#VH_pfnFree] - [Getter][#pfnFree()] - [Setter][#pfnFree(java.lang.foreign.MemorySegment)]
/// ### pfnInternalAllocation
/// [VarHandle][#VH_pfnInternalAllocation] - [Getter][#pfnInternalAllocation()] - [Setter][#pfnInternalAllocation(java.lang.foreign.MemorySegment)]
/// ### pfnInternalFree
/// [VarHandle][#VH_pfnInternalFree] - [Getter][#pfnInternalFree()] - [Setter][#pfnInternalFree(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAllocationCallbacks {
///     void * pUserData;
///     PFN_vkAllocationFunction pfnAllocation;
///     PFN_vkReallocationFunction pfnReallocation;
///     PFN_vkFreeFunction pfnFree;
///     PFN_vkInternalAllocationNotification pfnInternalAllocation;
///     PFN_vkInternalFreeNotification pfnInternalFree;
/// } VkAllocationCallbacks;
/// ```
public final class VkAllocationCallbacks extends Struct {
    /// The struct layout of `VkAllocationCallbacks`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withName("pfnAllocation"),
        ValueLayout.ADDRESS.withName("pfnReallocation"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pfnInternalAllocation"),
        ValueLayout.ADDRESS.withName("pfnInternalFree")
    );
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pfnAllocation` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnAllocation"));
    /// The [VarHandle] of `pfnReallocation` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnReallocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnReallocation"));
    /// The [VarHandle] of `pfnFree` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnFree"));
    /// The [VarHandle] of `pfnInternalAllocation` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnInternalAllocation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnInternalAllocation"));
    /// The [VarHandle] of `pfnInternalFree` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnInternalFree = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnInternalFree"));

    /// Creates `VkAllocationCallbacks` with the given segment.
    /// @param segment the memory segment
    public VkAllocationCallbacks(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAllocationCallbacks` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAllocationCallbacks of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment); }

    /// Creates `VkAllocationCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAllocationCallbacks ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAllocationCallbacks` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAllocationCallbacks ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAllocationCallbacks(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAllocationCallbacks` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAllocationCallbacks`
    public static VkAllocationCallbacks alloc(SegmentAllocator allocator) { return new VkAllocationCallbacks(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAllocationCallbacks` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAllocationCallbacks`
    public static VkAllocationCallbacks alloc(SegmentAllocator allocator, long count) { return new VkAllocationCallbacks(allocator.allocate(LAYOUT, count)); }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment) { return VkAllocationCallbacks.get_pUserData(segment, 0L); }
    /// {@return `pUserData` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pUserDataAt(long index) { return VkAllocationCallbacks.get_pUserData(this.segment(), index); }
    /// {@return `pUserData`}
    public @CType("void *") java.lang.foreign.MemorySegment pUserData() { return VkAllocationCallbacks.get_pUserData(this.segment()); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pUserData(segment, 0L, value); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pUserDataAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pUserData(this.segment(), index, value); return this; }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pUserData(@CType("void *") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pUserData(this.segment(), value); return this; }

    /// {@return `pfnAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment get_pfnAllocation(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnAllocation.get(segment, 0L, index); }
    /// {@return `pfnAllocation`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment get_pfnAllocation(MemorySegment segment) { return VkAllocationCallbacks.get_pfnAllocation(segment, 0L); }
    /// {@return `pfnAllocation` at the given index}
    /// @param index the index
    public @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment pfnAllocationAt(long index) { return VkAllocationCallbacks.get_pfnAllocation(this.segment(), index); }
    /// {@return `pfnAllocation`}
    public @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment pfnAllocation() { return VkAllocationCallbacks.get_pfnAllocation(this.segment()); }
    /// Sets `pfnAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnAllocation(MemorySegment segment, long index, @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment value) { VH_pfnAllocation.set(segment, 0L, index, value); }
    /// Sets `pfnAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnAllocation(MemorySegment segment, @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnAllocation(segment, 0L, value); }
    /// Sets `pfnAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnAllocationAt(long index, @CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnAllocation(this.segment(), index, value); return this; }
    /// Sets `pfnAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnAllocation(@CType("PFN_vkAllocationFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnAllocation(this.segment(), value); return this; }

    /// {@return `pfnReallocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment get_pfnReallocation(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnReallocation.get(segment, 0L, index); }
    /// {@return `pfnReallocation`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment get_pfnReallocation(MemorySegment segment) { return VkAllocationCallbacks.get_pfnReallocation(segment, 0L); }
    /// {@return `pfnReallocation` at the given index}
    /// @param index the index
    public @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment pfnReallocationAt(long index) { return VkAllocationCallbacks.get_pfnReallocation(this.segment(), index); }
    /// {@return `pfnReallocation`}
    public @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment pfnReallocation() { return VkAllocationCallbacks.get_pfnReallocation(this.segment()); }
    /// Sets `pfnReallocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnReallocation(MemorySegment segment, long index, @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment value) { VH_pfnReallocation.set(segment, 0L, index, value); }
    /// Sets `pfnReallocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnReallocation(MemorySegment segment, @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnReallocation(segment, 0L, value); }
    /// Sets `pfnReallocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnReallocationAt(long index, @CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnReallocation(this.segment(), index, value); return this; }
    /// Sets `pfnReallocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnReallocation(@CType("PFN_vkReallocationFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnReallocation(this.segment(), value); return this; }

    /// {@return `pfnFree` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment get_pfnFree(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnFree.get(segment, 0L, index); }
    /// {@return `pfnFree`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment get_pfnFree(MemorySegment segment) { return VkAllocationCallbacks.get_pfnFree(segment, 0L); }
    /// {@return `pfnFree` at the given index}
    /// @param index the index
    public @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment pfnFreeAt(long index) { return VkAllocationCallbacks.get_pfnFree(this.segment(), index); }
    /// {@return `pfnFree`}
    public @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment pfnFree() { return VkAllocationCallbacks.get_pfnFree(this.segment()); }
    /// Sets `pfnFree` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnFree(MemorySegment segment, long index, @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment value) { VH_pfnFree.set(segment, 0L, index, value); }
    /// Sets `pfnFree` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnFree(MemorySegment segment, @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnFree(segment, 0L, value); }
    /// Sets `pfnFree` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnFreeAt(long index, @CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnFree(this.segment(), index, value); return this; }
    /// Sets `pfnFree` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnFree(@CType("PFN_vkFreeFunction") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnFree(this.segment(), value); return this; }

    /// {@return `pfnInternalAllocation` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment get_pfnInternalAllocation(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnInternalAllocation.get(segment, 0L, index); }
    /// {@return `pfnInternalAllocation`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment get_pfnInternalAllocation(MemorySegment segment) { return VkAllocationCallbacks.get_pfnInternalAllocation(segment, 0L); }
    /// {@return `pfnInternalAllocation` at the given index}
    /// @param index the index
    public @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment pfnInternalAllocationAt(long index) { return VkAllocationCallbacks.get_pfnInternalAllocation(this.segment(), index); }
    /// {@return `pfnInternalAllocation`}
    public @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment pfnInternalAllocation() { return VkAllocationCallbacks.get_pfnInternalAllocation(this.segment()); }
    /// Sets `pfnInternalAllocation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnInternalAllocation(MemorySegment segment, long index, @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment value) { VH_pfnInternalAllocation.set(segment, 0L, index, value); }
    /// Sets `pfnInternalAllocation` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnInternalAllocation(MemorySegment segment, @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnInternalAllocation(segment, 0L, value); }
    /// Sets `pfnInternalAllocation` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalAllocationAt(long index, @CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnInternalAllocation(this.segment(), index, value); return this; }
    /// Sets `pfnInternalAllocation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalAllocation(@CType("PFN_vkInternalAllocationNotification") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnInternalAllocation(this.segment(), value); return this; }

    /// {@return `pfnInternalFree` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment get_pfnInternalFree(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnInternalFree.get(segment, 0L, index); }
    /// {@return `pfnInternalFree`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment get_pfnInternalFree(MemorySegment segment) { return VkAllocationCallbacks.get_pfnInternalFree(segment, 0L); }
    /// {@return `pfnInternalFree` at the given index}
    /// @param index the index
    public @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment pfnInternalFreeAt(long index) { return VkAllocationCallbacks.get_pfnInternalFree(this.segment(), index); }
    /// {@return `pfnInternalFree`}
    public @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment pfnInternalFree() { return VkAllocationCallbacks.get_pfnInternalFree(this.segment()); }
    /// Sets `pfnInternalFree` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnInternalFree(MemorySegment segment, long index, @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment value) { VH_pfnInternalFree.set(segment, 0L, index, value); }
    /// Sets `pfnInternalFree` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnInternalFree(MemorySegment segment, @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnInternalFree(segment, 0L, value); }
    /// Sets `pfnInternalFree` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalFreeAt(long index, @CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnInternalFree(this.segment(), index, value); return this; }
    /// Sets `pfnInternalFree` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAllocationCallbacks pfnInternalFree(@CType("PFN_vkInternalFreeNotification") java.lang.foreign.MemorySegment value) { VkAllocationCallbacks.set_pfnInternalFree(this.segment(), value); return this; }

}
