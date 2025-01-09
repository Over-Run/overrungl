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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### unit
/// [VarHandle][#VH_unit] - [Getter][#unit()] - [Setter][#unit(int)]
/// ### scope
/// [VarHandle][#VH_scope] - [Getter][#scope()] - [Setter][#scope(int)]
/// ### storage
/// [VarHandle][#VH_storage] - [Getter][#storage()] - [Setter][#storage(int)]
/// ### uuid
/// [Byte offset handle][#MH_uuid] - [Memory layout][#ML_uuid] - [Getter][#uuid(long)] - [Setter][#uuid(long, java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPerformanceCounterKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkPerformanceCounterUnitKHR unit;
///     VkPerformanceCounterScopeKHR scope;
///     VkPerformanceCounterStorageKHR storage;
///     uint8_t[VK_UUID_SIZE] uuid;
/// } VkPerformanceCounterKHR;
/// ```
public final class VkPerformanceCounterKHR extends Struct {
    /// The struct layout of `VkPerformanceCounterKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unit"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("storage"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("uuid")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `unit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_unit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unit"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));
    /// The [VarHandle] of `storage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storage"));
    /// The byte offset handle of `uuid` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_uuid = LAYOUT.byteOffsetHandle(PathElement.groupElement("uuid"), PathElement.sequenceElement());
    /// The memory layout of `uuid`.
    public static final MemoryLayout ML_uuid = LAYOUT.select(PathElement.groupElement("uuid"));

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    /// @param segment the memory segment
    public VkPerformanceCounterKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment); }

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPerformanceCounterKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPerformanceCounterKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPerformanceCounterKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterKHR`
    public static VkPerformanceCounterKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterKHR`
    public static VkPerformanceCounterKHR alloc(SegmentAllocator allocator, long count) { return new VkPerformanceCounterKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceCounterKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceCounterKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPerformanceCounterKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPerformanceCounterKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceCounterKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR sType(@CType("VkStructureType") int value) { VkPerformanceCounterKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceCounterKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPerformanceCounterKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPerformanceCounterKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPerformanceCounterKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPerformanceCounterKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPerformanceCounterKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `unit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceCounterUnitKHR") int get_unit(MemorySegment segment, long index) { return (int) VH_unit.get(segment, 0L, index); }
    /// {@return `unit`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceCounterUnitKHR") int get_unit(MemorySegment segment) { return VkPerformanceCounterKHR.get_unit(segment, 0L); }
    /// {@return `unit` at the given index}
    /// @param index the index
    public @CType("VkPerformanceCounterUnitKHR") int unitAt(long index) { return VkPerformanceCounterKHR.get_unit(this.segment(), index); }
    /// {@return `unit`}
    public @CType("VkPerformanceCounterUnitKHR") int unit() { return VkPerformanceCounterKHR.get_unit(this.segment()); }
    /// Sets `unit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_unit(MemorySegment segment, long index, @CType("VkPerformanceCounterUnitKHR") int value) { VH_unit.set(segment, 0L, index, value); }
    /// Sets `unit` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_unit(MemorySegment segment, @CType("VkPerformanceCounterUnitKHR") int value) { VkPerformanceCounterKHR.set_unit(segment, 0L, value); }
    /// Sets `unit` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR unitAt(long index, @CType("VkPerformanceCounterUnitKHR") int value) { VkPerformanceCounterKHR.set_unit(this.segment(), index, value); return this; }
    /// Sets `unit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR unit(@CType("VkPerformanceCounterUnitKHR") int value) { VkPerformanceCounterKHR.set_unit(this.segment(), value); return this; }

    /// {@return `scope` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceCounterScopeKHR") int get_scope(MemorySegment segment, long index) { return (int) VH_scope.get(segment, 0L, index); }
    /// {@return `scope`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceCounterScopeKHR") int get_scope(MemorySegment segment) { return VkPerformanceCounterKHR.get_scope(segment, 0L); }
    /// {@return `scope` at the given index}
    /// @param index the index
    public @CType("VkPerformanceCounterScopeKHR") int scopeAt(long index) { return VkPerformanceCounterKHR.get_scope(this.segment(), index); }
    /// {@return `scope`}
    public @CType("VkPerformanceCounterScopeKHR") int scope() { return VkPerformanceCounterKHR.get_scope(this.segment()); }
    /// Sets `scope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scope(MemorySegment segment, long index, @CType("VkPerformanceCounterScopeKHR") int value) { VH_scope.set(segment, 0L, index, value); }
    /// Sets `scope` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scope(MemorySegment segment, @CType("VkPerformanceCounterScopeKHR") int value) { VkPerformanceCounterKHR.set_scope(segment, 0L, value); }
    /// Sets `scope` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR scopeAt(long index, @CType("VkPerformanceCounterScopeKHR") int value) { VkPerformanceCounterKHR.set_scope(this.segment(), index, value); return this; }
    /// Sets `scope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR scope(@CType("VkPerformanceCounterScopeKHR") int value) { VkPerformanceCounterKHR.set_scope(this.segment(), value); return this; }

    /// {@return `storage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceCounterStorageKHR") int get_storage(MemorySegment segment, long index) { return (int) VH_storage.get(segment, 0L, index); }
    /// {@return `storage`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceCounterStorageKHR") int get_storage(MemorySegment segment) { return VkPerformanceCounterKHR.get_storage(segment, 0L); }
    /// {@return `storage` at the given index}
    /// @param index the index
    public @CType("VkPerformanceCounterStorageKHR") int storageAt(long index) { return VkPerformanceCounterKHR.get_storage(this.segment(), index); }
    /// {@return `storage`}
    public @CType("VkPerformanceCounterStorageKHR") int storage() { return VkPerformanceCounterKHR.get_storage(this.segment()); }
    /// Sets `storage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storage(MemorySegment segment, long index, @CType("VkPerformanceCounterStorageKHR") int value) { VH_storage.set(segment, 0L, index, value); }
    /// Sets `storage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storage(MemorySegment segment, @CType("VkPerformanceCounterStorageKHR") int value) { VkPerformanceCounterKHR.set_storage(segment, 0L, value); }
    /// Sets `storage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR storageAt(long index, @CType("VkPerformanceCounterStorageKHR") int value) { VkPerformanceCounterKHR.set_storage(this.segment(), index, value); return this; }
    /// Sets `storage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR storage(@CType("VkPerformanceCounterStorageKHR") int value) { VkPerformanceCounterKHR.set_storage(this.segment(), value); return this; }

    /// {@return `uuid` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_uuid(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_uuid.invokeExact(0L, elementIndex), index), ML_uuid); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `uuid`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_uuid(MemorySegment segment, long elementIndex) { return VkPerformanceCounterKHR.get_uuid(segment, 0L, elementIndex); }
    /// {@return `uuid` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment uuidAt(long index, long elementIndex) { return VkPerformanceCounterKHR.get_uuid(this.segment(), index, elementIndex); }
    /// {@return `uuid`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment uuid(long elementIndex) { return VkPerformanceCounterKHR.get_uuid(this.segment(), elementIndex); }
    /// Sets `uuid` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_uuid(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_uuid.invokeExact(0L, elementIndex), index), ML_uuid.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `uuid` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_uuid(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterKHR.set_uuid(segment, 0L, elementIndex, value); }
    /// Sets `uuid` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterKHR uuidAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterKHR.set_uuid(this.segment(), index, elementIndex, value); return this; }
    /// Sets `uuid` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPerformanceCounterKHR uuid(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPerformanceCounterKHR.set_uuid(this.segment(), elementIndex, value); return this; }

}
