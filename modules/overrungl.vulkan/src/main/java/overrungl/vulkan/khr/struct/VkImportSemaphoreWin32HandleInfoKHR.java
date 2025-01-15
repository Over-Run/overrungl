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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ### handle
/// [VarHandle][#VH_handle] - [Getter][#handle()] - [Setter][#handle(java.lang.foreign.MemorySegment)]
/// ### name
/// [VarHandle][#VH_name] - [Getter][#name()] - [Setter][#name(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportSemaphoreWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphore semaphore;
///     VkSemaphoreImportFlags flags;
///     VkExternalSemaphoreHandleTypeFlagBits handleType;
///     HANDLE handle;
///     LPCWSTR name;
/// } VkImportSemaphoreWin32HandleInfoKHR;
/// ```
public sealed class VkImportSemaphoreWin32HandleInfoKHR extends Struct {
    /// The struct layout of `VkImportSemaphoreWin32HandleInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle"),
        ValueLayout.ADDRESS.withName("name")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));
    /// The [VarHandle] of `name` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"));

    /// Creates `VkImportSemaphoreWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkImportSemaphoreWin32HandleInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportSemaphoreWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportSemaphoreWin32HandleInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportSemaphoreWin32HandleInfoKHR(segment); }

    /// Creates `VkImportSemaphoreWin32HandleInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportSemaphoreWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportSemaphoreWin32HandleInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportSemaphoreWin32HandleInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportSemaphoreWin32HandleInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportSemaphoreWin32HandleInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportSemaphoreWin32HandleInfoKHR`
    public static VkImportSemaphoreWin32HandleInfoKHR alloc(SegmentAllocator allocator) { return new VkImportSemaphoreWin32HandleInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportSemaphoreWin32HandleInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportSemaphoreWin32HandleInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportSemaphoreWin32HandleInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportSemaphoreWin32HandleInfoKHR`
    public static VkImportSemaphoreWin32HandleInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphore, @CType("VkSemaphoreImportFlags") int flags, @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleType, @CType("HANDLE") java.lang.foreign.MemorySegment handle, @CType("LPCWSTR") java.lang.foreign.MemorySegment name) { return alloc(allocator).sType(sType).pNext(pNext).semaphore(semaphore).flags(flags).handleType(handleType).handle(handle).name(name); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR copyFrom(VkImportSemaphoreWin32HandleInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportSemaphoreWin32HandleInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR sType(@CType("VkStructureType") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportSemaphoreWin32HandleInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") java.lang.foreign.MemorySegment get_semaphore(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_semaphore(segment, 0L); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphore() { return VkImportSemaphoreWin32HandleInfoKHR.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR semaphore(@CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_semaphore(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphoreImportFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphoreImportFlags") int get_flags(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkSemaphoreImportFlags") int flags() { return VkImportSemaphoreWin32HandleInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSemaphoreImportFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSemaphoreImportFlags") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR flags(@CType("VkSemaphoreImportFlags") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalSemaphoreHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalSemaphoreHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_handleType(segment, 0L); }
    /// {@return `handleType`}
    public @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleType() { return VkImportSemaphoreWin32HandleInfoKHR.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR handleType(@CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_handleType(this.segment(), value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("HANDLE") java.lang.foreign.MemorySegment get_handle(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    /// @param segment the segment of the struct
    public static @CType("HANDLE") java.lang.foreign.MemorySegment get_handle(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_handle(segment, 0L); }
    /// {@return `handle`}
    public @CType("HANDLE") java.lang.foreign.MemorySegment handle() { return VkImportSemaphoreWin32HandleInfoKHR.get_handle(this.segment()); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handle(MemorySegment segment, long index, @CType("HANDLE") java.lang.foreign.MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handle(MemorySegment segment, @CType("HANDLE") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_handle(segment, 0L, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR handle(@CType("HANDLE") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_handle(this.segment(), value); return this; }

    /// {@return `name` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("LPCWSTR") java.lang.foreign.MemorySegment get_name(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_name.get(segment, 0L, index); }
    /// {@return `name`}
    /// @param segment the segment of the struct
    public static @CType("LPCWSTR") java.lang.foreign.MemorySegment get_name(MemorySegment segment) { return VkImportSemaphoreWin32HandleInfoKHR.get_name(segment, 0L); }
    /// {@return `name`}
    public @CType("LPCWSTR") java.lang.foreign.MemorySegment name() { return VkImportSemaphoreWin32HandleInfoKHR.get_name(this.segment()); }
    /// Sets `name` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_name(MemorySegment segment, long index, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VH_name.set(segment, 0L, index, value); }
    /// Sets `name` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_name(MemorySegment segment, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_name(segment, 0L, value); }
    /// Sets `name` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportSemaphoreWin32HandleInfoKHR name(@CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_name(this.segment(), value); return this; }

    /// A buffer of [VkImportSemaphoreWin32HandleInfoKHR].
    public static final class Buffer extends VkImportSemaphoreWin32HandleInfoKHR {
        private final long elementCount;

        /// Creates `VkImportSemaphoreWin32HandleInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportSemaphoreWin32HandleInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportSemaphoreWin32HandleInfoKHR`
        public VkImportSemaphoreWin32HandleInfoKHR asSlice(long index) { return new VkImportSemaphoreWin32HandleInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportSemaphoreWin32HandleInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportSemaphoreWin32HandleInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `semaphore` at the given index}
        /// @param index the index
        public @CType("VkSemaphore") java.lang.foreign.MemorySegment semaphoreAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_semaphore(this.segment(), index); }
        /// Sets `semaphore` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer semaphoreAt(long index, @CType("VkSemaphore") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_semaphore(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkSemaphoreImportFlags") int flagsAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkSemaphoreImportFlags") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `handleType` at the given index}
        /// @param index the index
        public @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleTypeAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_handleType(this.segment(), index); }
        /// Sets `handleType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleTypeAt(long index, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkImportSemaphoreWin32HandleInfoKHR.set_handleType(this.segment(), index, value); return this; }

        /// {@return `handle` at the given index}
        /// @param index the index
        public @CType("HANDLE") java.lang.foreign.MemorySegment handleAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_handle(this.segment(), index); }
        /// Sets `handle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleAt(long index, @CType("HANDLE") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_handle(this.segment(), index, value); return this; }

        /// {@return `name` at the given index}
        /// @param index the index
        public @CType("LPCWSTR") java.lang.foreign.MemorySegment nameAt(long index) { return VkImportSemaphoreWin32HandleInfoKHR.get_name(this.segment(), index); }
        /// Sets `name` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nameAt(long index, @CType("LPCWSTR") java.lang.foreign.MemorySegment value) { VkImportSemaphoreWin32HandleInfoKHR.set_name(this.segment(), index, value); return this; }

    }
}
