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
package overrungl.vulkan.ext.struct;

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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### messageSeverity
/// [VarHandle][#VH_messageSeverity] - [Getter][#messageSeverity()] - [Setter][#messageSeverity(int)]
/// ### messageType
/// [VarHandle][#VH_messageType] - [Getter][#messageType()] - [Setter][#messageType(int)]
/// ### pfnUserCallback
/// [VarHandle][#VH_pfnUserCallback] - [Getter][#pfnUserCallback()] - [Setter][#pfnUserCallback(java.lang.foreign.MemorySegment)]
/// ### pUserData
/// [VarHandle][#VH_pUserData] - [Getter][#pUserData()] - [Setter][#pUserData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugUtilsMessengerCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDebugUtilsMessengerCreateFlagsEXT flags;
///     VkDebugUtilsMessageSeverityFlagsEXT messageSeverity;
///     VkDebugUtilsMessageTypeFlagsEXT messageType;
///     PFN_vkDebugUtilsMessengerCallbackEXT pfnUserCallback;
///     void * pUserData;
/// } VkDebugUtilsMessengerCreateInfoEXT;
/// ```
public sealed class VkDebugUtilsMessengerCreateInfoEXT extends Struct {
    /// The struct layout of `VkDebugUtilsMessengerCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("messageSeverity"),
        ValueLayout.JAVA_INT.withName("messageType"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `messageSeverity` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_messageSeverity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageSeverity"));
    /// The [VarHandle] of `messageType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_messageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageType"));
    /// The [VarHandle] of `pfnUserCallback` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pfnUserCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnUserCallback"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pUserData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData"));

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugUtilsMessengerCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugUtilsMessengerCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDebugUtilsMessengerCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsMessengerCreateInfoEXT`
    public static VkDebugUtilsMessengerCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsMessengerCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugUtilsMessengerCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsMessengerCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDebugUtilsMessengerCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsMessengerCreateInfoEXT`
    public static VkDebugUtilsMessengerCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDebugUtilsMessengerCreateFlagsEXT") int flags, @CType("VkDebugUtilsMessageSeverityFlagsEXT") int messageSeverity, @CType("VkDebugUtilsMessageTypeFlagsEXT") int messageType, @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment pfnUserCallback, @CType("void *") java.lang.foreign.MemorySegment pUserData) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).messageSeverity(messageSeverity).messageType(messageType).pfnUserCallback(pfnUserCallback).pUserData(pUserData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT copyFrom(VkDebugUtilsMessengerCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugUtilsMessengerCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT sType(@CType("VkStructureType") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugUtilsMessengerCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugUtilsMessengerCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugUtilsMessengerCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkDebugUtilsMessengerCreateFlagsEXT") int flags() { return VkDebugUtilsMessengerCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT flags(@CType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `messageSeverity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugUtilsMessageSeverityFlagsEXT") int get_messageSeverity(MemorySegment segment, long index) { return (int) VH_messageSeverity.get(segment, 0L, index); }
    /// {@return `messageSeverity`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugUtilsMessageSeverityFlagsEXT") int get_messageSeverity(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_messageSeverity(segment, 0L); }
    /// {@return `messageSeverity`}
    public @CType("VkDebugUtilsMessageSeverityFlagsEXT") int messageSeverity() { return VkDebugUtilsMessengerCreateInfoEXT.get_messageSeverity(this.segment()); }
    /// Sets `messageSeverity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_messageSeverity(MemorySegment segment, long index, @CType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { VH_messageSeverity.set(segment, 0L, index, value); }
    /// Sets `messageSeverity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_messageSeverity(MemorySegment segment, @CType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_messageSeverity(segment, 0L, value); }
    /// Sets `messageSeverity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(@CType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_messageSeverity(this.segment(), value); return this; }

    /// {@return `messageType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugUtilsMessageTypeFlagsEXT") int get_messageType(MemorySegment segment, long index) { return (int) VH_messageType.get(segment, 0L, index); }
    /// {@return `messageType`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugUtilsMessageTypeFlagsEXT") int get_messageType(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_messageType(segment, 0L); }
    /// {@return `messageType`}
    public @CType("VkDebugUtilsMessageTypeFlagsEXT") int messageType() { return VkDebugUtilsMessengerCreateInfoEXT.get_messageType(this.segment()); }
    /// Sets `messageType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_messageType(MemorySegment segment, long index, @CType("VkDebugUtilsMessageTypeFlagsEXT") int value) { VH_messageType.set(segment, 0L, index, value); }
    /// Sets `messageType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_messageType(MemorySegment segment, @CType("VkDebugUtilsMessageTypeFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_messageType(segment, 0L, value); }
    /// Sets `messageType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT messageType(@CType("VkDebugUtilsMessageTypeFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_messageType(this.segment(), value); return this; }

    /// {@return `pfnUserCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment get_pfnUserCallback(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pfnUserCallback.get(segment, 0L, index); }
    /// {@return `pfnUserCallback`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment get_pfnUserCallback(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_pfnUserCallback(segment, 0L); }
    /// {@return `pfnUserCallback`}
    public @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment pfnUserCallback() { return VkDebugUtilsMessengerCreateInfoEXT.get_pfnUserCallback(this.segment()); }
    /// Sets `pfnUserCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnUserCallback(MemorySegment segment, long index, @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment value) { VH_pfnUserCallback.set(segment, 0L, index, value); }
    /// Sets `pfnUserCallback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnUserCallback(MemorySegment segment, @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pfnUserCallback(segment, 0L, value); }
    /// Sets `pfnUserCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(@CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pfnUserCallback(this.segment(), value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pUserData.get(segment, 0L, index); }
    /// {@return `pUserData`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pUserData(MemorySegment segment) { return VkDebugUtilsMessengerCreateInfoEXT.get_pUserData(segment, 0L); }
    /// {@return `pUserData`}
    public @CType("void *") java.lang.foreign.MemorySegment pUserData() { return VkDebugUtilsMessengerCreateInfoEXT.get_pUserData(this.segment()); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pUserData.set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pUserData(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pUserData(segment, 0L, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCreateInfoEXT pUserData(@CType("void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pUserData(this.segment(), value); return this; }

    /// A buffer of [VkDebugUtilsMessengerCreateInfoEXT].
    public static final class Buffer extends VkDebugUtilsMessengerCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkDebugUtilsMessengerCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDebugUtilsMessengerCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDebugUtilsMessengerCreateInfoEXT`
        public VkDebugUtilsMessengerCreateInfoEXT asSlice(long index) { return new VkDebugUtilsMessengerCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDebugUtilsMessengerCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDebugUtilsMessengerCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkDebugUtilsMessengerCreateFlagsEXT") int flagsAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkDebugUtilsMessengerCreateFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_flags(this.segment(), index, value); return this; }

        /// {@return `messageSeverity` at the given index}
        /// @param index the index
        public @CType("VkDebugUtilsMessageSeverityFlagsEXT") int messageSeverityAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_messageSeverity(this.segment(), index); }
        /// Sets `messageSeverity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer messageSeverityAt(long index, @CType("VkDebugUtilsMessageSeverityFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_messageSeverity(this.segment(), index, value); return this; }

        /// {@return `messageType` at the given index}
        /// @param index the index
        public @CType("VkDebugUtilsMessageTypeFlagsEXT") int messageTypeAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_messageType(this.segment(), index); }
        /// Sets `messageType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer messageTypeAt(long index, @CType("VkDebugUtilsMessageTypeFlagsEXT") int value) { VkDebugUtilsMessengerCreateInfoEXT.set_messageType(this.segment(), index, value); return this; }

        /// {@return `pfnUserCallback` at the given index}
        /// @param index the index
        public @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment pfnUserCallbackAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_pfnUserCallback(this.segment(), index); }
        /// Sets `pfnUserCallback` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pfnUserCallbackAt(long index, @CType("PFN_vkDebugUtilsMessengerCallbackEXT") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pfnUserCallback(this.segment(), index, value); return this; }

        /// {@return `pUserData` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pUserDataAt(long index) { return VkDebugUtilsMessengerCreateInfoEXT.get_pUserData(this.segment(), index); }
        /// Sets `pUserData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pUserDataAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCreateInfoEXT.set_pUserData(this.segment(), index, value); return this; }

    }
}
