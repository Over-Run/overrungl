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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### unit
/// [VarHandle][#VH_unit] - [Getter][#unit()] - [Setter][#unit(int)]
/// ### scope
/// [VarHandle][#VH_scope] - [Getter][#scope()] - [Setter][#scope(int)]
/// ### storage
/// [VarHandle][#VH_storage] - [Getter][#storage()] - [Setter][#storage(int)]
/// ### uuid
/// [Byte offset][#OFFSET_uuid] - [Memory layout][#ML_uuid] - [Getter][#uuid()] - [Setter][#uuid(MemorySegment)]
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
public sealed class VkPerformanceCounterKHR extends Struct {
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
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `unit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_unit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unit"));
    /// The [VarHandle] of `scope` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scope"));
    /// The [VarHandle] of `storage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storage"));
    /// The byte offset of `uuid`.
    public static final long OFFSET_uuid = LAYOUT.byteOffset(PathElement.groupElement("uuid"));
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
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

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
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterKHR`
    public static VkPerformanceCounterKHR alloc(SegmentAllocator allocator) { return new VkPerformanceCounterKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPerformanceCounterKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPerformanceCounterKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPerformanceCounterKHR`
    public static VkPerformanceCounterKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkPerformanceCounterUnitKHR") int unit, @CType("VkPerformanceCounterScopeKHR") int scope, @CType("VkPerformanceCounterStorageKHR") int storage, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment uuid) { return alloc(allocator).sType(sType).pNext(pNext).unit(unit).scope(scope).storage(storage).uuid(uuid); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPerformanceCounterKHR copyFrom(VkPerformanceCounterKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPerformanceCounterKHR.get_sType(segment, 0L); }
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
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR sType(@CType("VkStructureType") int value) { VkPerformanceCounterKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPerformanceCounterKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPerformanceCounterKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPerformanceCounterKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR pNext(@CType("void *") MemorySegment value) { VkPerformanceCounterKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `unit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPerformanceCounterUnitKHR") int get_unit(MemorySegment segment, long index) { return (int) VH_unit.get(segment, 0L, index); }
    /// {@return `unit`}
    /// @param segment the segment of the struct
    public static @CType("VkPerformanceCounterUnitKHR") int get_unit(MemorySegment segment) { return VkPerformanceCounterKHR.get_unit(segment, 0L); }
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
    /// Sets `storage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR storage(@CType("VkPerformanceCounterStorageKHR") int value) { VkPerformanceCounterKHR.set_storage(this.segment(), value); return this; }

    /// {@return `uuid` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_uuid(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_uuid, index), ML_uuid); }
    /// {@return `uuid`}
    /// @param segment the segment of the struct
    public static @CType("uint8_t[VK_UUID_SIZE]") MemorySegment get_uuid(MemorySegment segment) { return VkPerformanceCounterKHR.get_uuid(segment, 0L); }
    /// {@return `uuid`}
    public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment uuid() { return VkPerformanceCounterKHR.get_uuid(this.segment()); }
    /// Sets `uuid` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uuid(MemorySegment segment, long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_uuid, index), ML_uuid.byteSize()); }
    /// Sets `uuid` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uuid(MemorySegment segment, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPerformanceCounterKHR.set_uuid(segment, 0L, value); }
    /// Sets `uuid` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPerformanceCounterKHR uuid(@CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPerformanceCounterKHR.set_uuid(this.segment(), value); return this; }

    /// A buffer of [VkPerformanceCounterKHR].
    public static final class Buffer extends VkPerformanceCounterKHR {
        private final long elementCount;

        /// Creates `VkPerformanceCounterKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPerformanceCounterKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPerformanceCounterKHR`
        public VkPerformanceCounterKHR asSlice(long index) { return new VkPerformanceCounterKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPerformanceCounterKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPerformanceCounterKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPerformanceCounterKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPerformanceCounterKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPerformanceCounterKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPerformanceCounterKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `unit` at the given index}
        /// @param index the index
        public @CType("VkPerformanceCounterUnitKHR") int unitAt(long index) { return VkPerformanceCounterKHR.get_unit(this.segment(), index); }
        /// Sets `unit` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer unitAt(long index, @CType("VkPerformanceCounterUnitKHR") int value) { VkPerformanceCounterKHR.set_unit(this.segment(), index, value); return this; }

        /// {@return `scope` at the given index}
        /// @param index the index
        public @CType("VkPerformanceCounterScopeKHR") int scopeAt(long index) { return VkPerformanceCounterKHR.get_scope(this.segment(), index); }
        /// Sets `scope` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer scopeAt(long index, @CType("VkPerformanceCounterScopeKHR") int value) { VkPerformanceCounterKHR.set_scope(this.segment(), index, value); return this; }

        /// {@return `storage` at the given index}
        /// @param index the index
        public @CType("VkPerformanceCounterStorageKHR") int storageAt(long index) { return VkPerformanceCounterKHR.get_storage(this.segment(), index); }
        /// Sets `storage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageAt(long index, @CType("VkPerformanceCounterStorageKHR") int value) { VkPerformanceCounterKHR.set_storage(this.segment(), index, value); return this; }

        /// {@return `uuid` at the given index}
        /// @param index the index
        public @CType("uint8_t[VK_UUID_SIZE]") MemorySegment uuidAt(long index) { return VkPerformanceCounterKHR.get_uuid(this.segment(), index); }
        /// Sets `uuid` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uuidAt(long index, @CType("uint8_t[VK_UUID_SIZE]") MemorySegment value) { VkPerformanceCounterKHR.set_uuid(this.segment(), index, value); return this; }

    }
}
