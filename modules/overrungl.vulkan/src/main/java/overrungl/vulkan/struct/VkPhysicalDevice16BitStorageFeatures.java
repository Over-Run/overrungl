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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### storageBuffer16BitAccess
/// [VarHandle][#VH_storageBuffer16BitAccess] - [Getter][#storageBuffer16BitAccess()] - [Setter][#storageBuffer16BitAccess(int)]
/// ### uniformAndStorageBuffer16BitAccess
/// [VarHandle][#VH_uniformAndStorageBuffer16BitAccess] - [Getter][#uniformAndStorageBuffer16BitAccess()] - [Setter][#uniformAndStorageBuffer16BitAccess(int)]
/// ### storagePushConstant16
/// [VarHandle][#VH_storagePushConstant16] - [Getter][#storagePushConstant16()] - [Setter][#storagePushConstant16(int)]
/// ### storageInputOutput16
/// [VarHandle][#VH_storageInputOutput16] - [Getter][#storageInputOutput16()] - [Setter][#storageInputOutput16(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDevice16BitStorageFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 storageBuffer16BitAccess;
///     VkBool32 uniformAndStorageBuffer16BitAccess;
///     VkBool32 storagePushConstant16;
///     VkBool32 storageInputOutput16;
/// } VkPhysicalDevice16BitStorageFeatures;
/// ```
public sealed class VkPhysicalDevice16BitStorageFeatures extends Struct {
    /// The struct layout of `VkPhysicalDevice16BitStorageFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `storageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer16BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer16BitAccess` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformAndStorageBuffer16BitAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer16BitAccess"));
    /// The [VarHandle] of `storagePushConstant16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storagePushConstant16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant16"));
    /// The [VarHandle] of `storageInputOutput16` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageInputOutput16 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageInputOutput16"));

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDevice16BitStorageFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice16BitStorageFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevice16BitStorageFeatures(segment); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice16BitStorageFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDevice16BitStorageFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDevice16BitStorageFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDevice16BitStorageFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice16BitStorageFeatures`
    public static VkPhysicalDevice16BitStorageFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDevice16BitStorageFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDevice16BitStorageFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevice16BitStorageFeatures`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDevice16BitStorageFeatures` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice16BitStorageFeatures`
    public static VkPhysicalDevice16BitStorageFeatures allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkBool32") int storageBuffer16BitAccess, @CType("VkBool32") int uniformAndStorageBuffer16BitAccess, @CType("VkBool32") int storagePushConstant16, @CType("VkBool32") int storageInputOutput16) { return alloc(allocator).sType(sType).pNext(pNext).storageBuffer16BitAccess(storageBuffer16BitAccess).uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess).storagePushConstant16(storagePushConstant16).storageInputOutput16(storageInputOutput16); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures copyFrom(VkPhysicalDevice16BitStorageFeatures src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDevice16BitStorageFeatures.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDevice16BitStorageFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDevice16BitStorageFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDevice16BitStorageFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDevice16BitStorageFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkPhysicalDevice16BitStorageFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkPhysicalDevice16BitStorageFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures pNext(@CType("void *") MemorySegment value) { VkPhysicalDevice16BitStorageFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `storageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `storageBuffer16BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageBuffer16BitAccess(MemorySegment segment) { return VkPhysicalDevice16BitStorageFeatures.get_storageBuffer16BitAccess(segment, 0L); }
    /// {@return `storageBuffer16BitAccess`}
    public @CType("VkBool32") int storageBuffer16BitAccess() { return VkPhysicalDevice16BitStorageFeatures.get_storageBuffer16BitAccess(this.segment()); }
    /// Sets `storageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageBuffer16BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `storageBuffer16BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageBuffer16BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storageBuffer16BitAccess(segment, 0L, value); }
    /// Sets `storageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures storageBuffer16BitAccess(@CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storageBuffer16BitAccess(this.segment(), value); return this; }

    /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer16BitAccess.get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer16BitAccess`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformAndStorageBuffer16BitAccess(MemorySegment segment) { return VkPhysicalDevice16BitStorageFeatures.get_uniformAndStorageBuffer16BitAccess(segment, 0L); }
    /// {@return `uniformAndStorageBuffer16BitAccess`}
    public @CType("VkBool32") int uniformAndStorageBuffer16BitAccess() { return VkPhysicalDevice16BitStorageFeatures.get_uniformAndStorageBuffer16BitAccess(this.segment()); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformAndStorageBuffer16BitAccess(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformAndStorageBuffer16BitAccess.set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformAndStorageBuffer16BitAccess(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_uniformAndStorageBuffer16BitAccess(segment, 0L, value); }
    /// Sets `uniformAndStorageBuffer16BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures uniformAndStorageBuffer16BitAccess(@CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_uniformAndStorageBuffer16BitAccess(this.segment(), value); return this; }

    /// {@return `storagePushConstant16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storagePushConstant16(MemorySegment segment, long index) { return (int) VH_storagePushConstant16.get(segment, 0L, index); }
    /// {@return `storagePushConstant16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storagePushConstant16(MemorySegment segment) { return VkPhysicalDevice16BitStorageFeatures.get_storagePushConstant16(segment, 0L); }
    /// {@return `storagePushConstant16`}
    public @CType("VkBool32") int storagePushConstant16() { return VkPhysicalDevice16BitStorageFeatures.get_storagePushConstant16(this.segment()); }
    /// Sets `storagePushConstant16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storagePushConstant16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storagePushConstant16.set(segment, 0L, index, value); }
    /// Sets `storagePushConstant16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storagePushConstant16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storagePushConstant16(segment, 0L, value); }
    /// Sets `storagePushConstant16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures storagePushConstant16(@CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storagePushConstant16(this.segment(), value); return this; }

    /// {@return `storageInputOutput16` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageInputOutput16(MemorySegment segment, long index) { return (int) VH_storageInputOutput16.get(segment, 0L, index); }
    /// {@return `storageInputOutput16`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageInputOutput16(MemorySegment segment) { return VkPhysicalDevice16BitStorageFeatures.get_storageInputOutput16(segment, 0L); }
    /// {@return `storageInputOutput16`}
    public @CType("VkBool32") int storageInputOutput16() { return VkPhysicalDevice16BitStorageFeatures.get_storageInputOutput16(this.segment()); }
    /// Sets `storageInputOutput16` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageInputOutput16(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageInputOutput16.set(segment, 0L, index, value); }
    /// Sets `storageInputOutput16` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageInputOutput16(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storageInputOutput16(segment, 0L, value); }
    /// Sets `storageInputOutput16` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice16BitStorageFeatures storageInputOutput16(@CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storageInputOutput16(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDevice16BitStorageFeatures].
    public static final class Buffer extends VkPhysicalDevice16BitStorageFeatures {
        private final long elementCount;

        /// Creates `VkPhysicalDevice16BitStorageFeatures.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDevice16BitStorageFeatures`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDevice16BitStorageFeatures`
        public VkPhysicalDevice16BitStorageFeatures asSlice(long index) { return new VkPhysicalDevice16BitStorageFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDevice16BitStorageFeatures`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDevice16BitStorageFeatures`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDevice16BitStorageFeatures.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDevice16BitStorageFeatures.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkPhysicalDevice16BitStorageFeatures.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkPhysicalDevice16BitStorageFeatures.set_pNext(this.segment(), index, value); return this; }

        /// {@return `storageBuffer16BitAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int storageBuffer16BitAccessAt(long index) { return VkPhysicalDevice16BitStorageFeatures.get_storageBuffer16BitAccess(this.segment(), index); }
        /// Sets `storageBuffer16BitAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageBuffer16BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storageBuffer16BitAccess(this.segment(), index, value); return this; }

        /// {@return `uniformAndStorageBuffer16BitAccess` at the given index}
        /// @param index the index
        public @CType("VkBool32") int uniformAndStorageBuffer16BitAccessAt(long index) { return VkPhysicalDevice16BitStorageFeatures.get_uniformAndStorageBuffer16BitAccess(this.segment(), index); }
        /// Sets `uniformAndStorageBuffer16BitAccess` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer uniformAndStorageBuffer16BitAccessAt(long index, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_uniformAndStorageBuffer16BitAccess(this.segment(), index, value); return this; }

        /// {@return `storagePushConstant16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int storagePushConstant16At(long index) { return VkPhysicalDevice16BitStorageFeatures.get_storagePushConstant16(this.segment(), index); }
        /// Sets `storagePushConstant16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storagePushConstant16At(long index, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storagePushConstant16(this.segment(), index, value); return this; }

        /// {@return `storageInputOutput16` at the given index}
        /// @param index the index
        public @CType("VkBool32") int storageInputOutput16At(long index) { return VkPhysicalDevice16BitStorageFeatures.get_storageInputOutput16(this.segment(), index); }
        /// Sets `storageInputOutput16` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageInputOutput16At(long index, @CType("VkBool32") int value) { VkPhysicalDevice16BitStorageFeatures.set_storageInputOutput16(this.segment(), index, value); return this; }

    }
}
