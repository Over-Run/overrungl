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
/// ### pMessageIdName
/// [VarHandle][#VH_pMessageIdName] - [Getter][#pMessageIdName()] - [Setter][#pMessageIdName(java.lang.foreign.MemorySegment)]
/// ### messageIdNumber
/// [VarHandle][#VH_messageIdNumber] - [Getter][#messageIdNumber()] - [Setter][#messageIdNumber(int)]
/// ### pMessage
/// [VarHandle][#VH_pMessage] - [Getter][#pMessage()] - [Setter][#pMessage(java.lang.foreign.MemorySegment)]
/// ### queueLabelCount
/// [VarHandle][#VH_queueLabelCount] - [Getter][#queueLabelCount()] - [Setter][#queueLabelCount(int)]
/// ### pQueueLabels
/// [VarHandle][#VH_pQueueLabels] - [Getter][#pQueueLabels()] - [Setter][#pQueueLabels(java.lang.foreign.MemorySegment)]
/// ### cmdBufLabelCount
/// [VarHandle][#VH_cmdBufLabelCount] - [Getter][#cmdBufLabelCount()] - [Setter][#cmdBufLabelCount(int)]
/// ### pCmdBufLabels
/// [VarHandle][#VH_pCmdBufLabels] - [Getter][#pCmdBufLabels()] - [Setter][#pCmdBufLabels(java.lang.foreign.MemorySegment)]
/// ### objectCount
/// [VarHandle][#VH_objectCount] - [Getter][#objectCount()] - [Setter][#objectCount(int)]
/// ### pObjects
/// [VarHandle][#VH_pObjects] - [Getter][#pObjects()] - [Setter][#pObjects(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDebugUtilsMessengerCallbackDataEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkDebugUtilsMessengerCallbackDataFlagsEXT flags;
///     const char * pMessageIdName;
///     int32_t messageIdNumber;
///     const char * pMessage;
///     uint32_t queueLabelCount;
///     const VkDebugUtilsLabelEXT * pQueueLabels;
///     uint32_t cmdBufLabelCount;
///     const VkDebugUtilsLabelEXT * pCmdBufLabels;
///     uint32_t objectCount;
///     const VkDebugUtilsObjectNameInfoEXT * pObjects;
/// } VkDebugUtilsMessengerCallbackDataEXT;
/// ```
public final class VkDebugUtilsMessengerCallbackDataEXT extends Struct {
    /// The struct layout of `VkDebugUtilsMessengerCallbackDataEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pMessageIdName"),
        ValueLayout.JAVA_INT.withName("messageIdNumber"),
        ValueLayout.ADDRESS.withName("pMessage"),
        ValueLayout.JAVA_INT.withName("queueLabelCount"),
        ValueLayout.ADDRESS.withName("pQueueLabels"),
        ValueLayout.JAVA_INT.withName("cmdBufLabelCount"),
        ValueLayout.ADDRESS.withName("pCmdBufLabels"),
        ValueLayout.JAVA_INT.withName("objectCount"),
        ValueLayout.ADDRESS.withName("pObjects")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pMessageIdName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMessageIdName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMessageIdName"));
    /// The [VarHandle] of `messageIdNumber` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_messageIdNumber = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageIdNumber"));
    /// The [VarHandle] of `pMessage` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pMessage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMessage"));
    /// The [VarHandle] of `queueLabelCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueLabelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueLabelCount"));
    /// The [VarHandle] of `pQueueLabels` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueueLabels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueLabels"));
    /// The [VarHandle] of `cmdBufLabelCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cmdBufLabelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cmdBufLabelCount"));
    /// The [VarHandle] of `pCmdBufLabels` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCmdBufLabels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCmdBufLabels"));
    /// The [VarHandle] of `objectCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_objectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectCount"));
    /// The [VarHandle] of `pObjects` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjects"));

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    public VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCallbackDataEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment); }

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCallbackDataEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCallbackDataEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDebugUtilsMessengerCallbackDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsMessengerCallbackDataEXT`
    public static VkDebugUtilsMessengerCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsMessengerCallbackDataEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDebugUtilsMessengerCallbackDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsMessengerCallbackDataEXT`
    public static VkDebugUtilsMessengerCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsMessengerCallbackDataEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDebugUtilsMessengerCallbackDataEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT sType(@CType("VkStructureType") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDebugUtilsMessengerCallbackDataEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int get_flags(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int flagsAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int flags() { return VkDebugUtilsMessengerCallbackDataEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT flagsAt(long index, @CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT flags(@CType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_flags(this.segment(), value); return this; }

    /// {@return `pMessageIdName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pMessageIdName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMessageIdName.get(segment, 0L, index); }
    /// {@return `pMessageIdName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pMessageIdName(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_pMessageIdName(segment, 0L); }
    /// {@return `pMessageIdName` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pMessageIdNameAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_pMessageIdName(this.segment(), index); }
    /// {@return `pMessageIdName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pMessageIdName() { return VkDebugUtilsMessengerCallbackDataEXT.get_pMessageIdName(this.segment()); }
    /// Sets `pMessageIdName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMessageIdName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pMessageIdName.set(segment, 0L, index, value); }
    /// Sets `pMessageIdName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMessageIdName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pMessageIdName(segment, 0L, value); }
    /// Sets `pMessageIdName` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pMessageIdName(this.segment(), index, value); return this; }
    /// Sets `pMessageIdName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pMessageIdName(this.segment(), value); return this; }

    /// {@return `messageIdNumber` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_messageIdNumber(MemorySegment segment, long index) { return (int) VH_messageIdNumber.get(segment, 0L, index); }
    /// {@return `messageIdNumber`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_messageIdNumber(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_messageIdNumber(segment, 0L); }
    /// {@return `messageIdNumber` at the given index}
    /// @param index the index
    public @CType("int32_t") int messageIdNumberAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_messageIdNumber(this.segment(), index); }
    /// {@return `messageIdNumber`}
    public @CType("int32_t") int messageIdNumber() { return VkDebugUtilsMessengerCallbackDataEXT.get_messageIdNumber(this.segment()); }
    /// Sets `messageIdNumber` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_messageIdNumber(MemorySegment segment, long index, @CType("int32_t") int value) { VH_messageIdNumber.set(segment, 0L, index, value); }
    /// Sets `messageIdNumber` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_messageIdNumber(MemorySegment segment, @CType("int32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_messageIdNumber(segment, 0L, value); }
    /// Sets `messageIdNumber` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumberAt(long index, @CType("int32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_messageIdNumber(this.segment(), index, value); return this; }
    /// Sets `messageIdNumber` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(@CType("int32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_messageIdNumber(this.segment(), value); return this; }

    /// {@return `pMessage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pMessage(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pMessage.get(segment, 0L, index); }
    /// {@return `pMessage`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pMessage(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_pMessage(segment, 0L); }
    /// {@return `pMessage` at the given index}
    /// @param index the index
    public @CType("const char *") java.lang.foreign.MemorySegment pMessageAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_pMessage(this.segment(), index); }
    /// {@return `pMessage`}
    public @CType("const char *") java.lang.foreign.MemorySegment pMessage() { return VkDebugUtilsMessengerCallbackDataEXT.get_pMessage(this.segment()); }
    /// Sets `pMessage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pMessage(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pMessage.set(segment, 0L, index, value); }
    /// Sets `pMessage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pMessage(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pMessage(segment, 0L, value); }
    /// Sets `pMessage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessageAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pMessage(this.segment(), index, value); return this; }
    /// Sets `pMessage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessage(@CType("const char *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pMessage(this.segment(), value); return this; }

    /// {@return `queueLabelCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueLabelCount(MemorySegment segment, long index) { return (int) VH_queueLabelCount.get(segment, 0L, index); }
    /// {@return `queueLabelCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueLabelCount(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_queueLabelCount(segment, 0L); }
    /// {@return `queueLabelCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueLabelCountAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_queueLabelCount(this.segment(), index); }
    /// {@return `queueLabelCount`}
    public @CType("uint32_t") int queueLabelCount() { return VkDebugUtilsMessengerCallbackDataEXT.get_queueLabelCount(this.segment()); }
    /// Sets `queueLabelCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueLabelCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueLabelCount.set(segment, 0L, index, value); }
    /// Sets `queueLabelCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueLabelCount(MemorySegment segment, @CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_queueLabelCount(segment, 0L, value); }
    /// Sets `queueLabelCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCountAt(long index, @CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_queueLabelCount(this.segment(), index, value); return this; }
    /// Sets `queueLabelCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCount(@CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_queueLabelCount(this.segment(), value); return this; }

    /// {@return `pQueueLabels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment get_pQueueLabels(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueueLabels.get(segment, 0L, index); }
    /// {@return `pQueueLabels`}
    /// @param segment the segment of the struct
    public static @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment get_pQueueLabels(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_pQueueLabels(segment, 0L); }
    /// {@return `pQueueLabels` at the given index}
    /// @param index the index
    public @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment pQueueLabelsAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_pQueueLabels(this.segment(), index); }
    /// {@return `pQueueLabels`}
    public @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment pQueueLabels() { return VkDebugUtilsMessengerCallbackDataEXT.get_pQueueLabels(this.segment()); }
    /// Sets `pQueueLabels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueueLabels(MemorySegment segment, long index, @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VH_pQueueLabels.set(segment, 0L, index, value); }
    /// Sets `pQueueLabels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueueLabels(MemorySegment segment, @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pQueueLabels(segment, 0L, value); }
    /// Sets `pQueueLabels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabelsAt(long index, @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pQueueLabels(this.segment(), index, value); return this; }
    /// Sets `pQueueLabels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(@CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pQueueLabels(this.segment(), value); return this; }

    /// {@return `cmdBufLabelCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_cmdBufLabelCount(MemorySegment segment, long index) { return (int) VH_cmdBufLabelCount.get(segment, 0L, index); }
    /// {@return `cmdBufLabelCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_cmdBufLabelCount(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_cmdBufLabelCount(segment, 0L); }
    /// {@return `cmdBufLabelCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int cmdBufLabelCountAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_cmdBufLabelCount(this.segment(), index); }
    /// {@return `cmdBufLabelCount`}
    public @CType("uint32_t") int cmdBufLabelCount() { return VkDebugUtilsMessengerCallbackDataEXT.get_cmdBufLabelCount(this.segment()); }
    /// Sets `cmdBufLabelCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cmdBufLabelCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_cmdBufLabelCount.set(segment, 0L, index, value); }
    /// Sets `cmdBufLabelCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cmdBufLabelCount(MemorySegment segment, @CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_cmdBufLabelCount(segment, 0L, value); }
    /// Sets `cmdBufLabelCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCountAt(long index, @CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_cmdBufLabelCount(this.segment(), index, value); return this; }
    /// Sets `cmdBufLabelCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCount(@CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_cmdBufLabelCount(this.segment(), value); return this; }

    /// {@return `pCmdBufLabels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment get_pCmdBufLabels(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCmdBufLabels.get(segment, 0L, index); }
    /// {@return `pCmdBufLabels`}
    /// @param segment the segment of the struct
    public static @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment get_pCmdBufLabels(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_pCmdBufLabels(segment, 0L); }
    /// {@return `pCmdBufLabels` at the given index}
    /// @param index the index
    public @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment pCmdBufLabelsAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_pCmdBufLabels(this.segment(), index); }
    /// {@return `pCmdBufLabels`}
    public @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment pCmdBufLabels() { return VkDebugUtilsMessengerCallbackDataEXT.get_pCmdBufLabels(this.segment()); }
    /// Sets `pCmdBufLabels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCmdBufLabels(MemorySegment segment, long index, @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VH_pCmdBufLabels.set(segment, 0L, index, value); }
    /// Sets `pCmdBufLabels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCmdBufLabels(MemorySegment segment, @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pCmdBufLabels(segment, 0L, value); }
    /// Sets `pCmdBufLabels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabelsAt(long index, @CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pCmdBufLabels(this.segment(), index, value); return this; }
    /// Sets `pCmdBufLabels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(@CType("const VkDebugUtilsLabelEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pCmdBufLabels(this.segment(), value); return this; }

    /// {@return `objectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_objectCount(MemorySegment segment, long index) { return (int) VH_objectCount.get(segment, 0L, index); }
    /// {@return `objectCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_objectCount(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_objectCount(segment, 0L); }
    /// {@return `objectCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int objectCountAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_objectCount(this.segment(), index); }
    /// {@return `objectCount`}
    public @CType("uint32_t") int objectCount() { return VkDebugUtilsMessengerCallbackDataEXT.get_objectCount(this.segment()); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_objectCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_objectCount.set(segment, 0L, index, value); }
    /// Sets `objectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_objectCount(MemorySegment segment, @CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_objectCount(segment, 0L, value); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT objectCountAt(long index, @CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_objectCount(this.segment(), index, value); return this; }
    /// Sets `objectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT objectCount(@CType("uint32_t") int value) { VkDebugUtilsMessengerCallbackDataEXT.set_objectCount(this.segment(), value); return this; }

    /// {@return `pObjects` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment get_pObjects(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pObjects.get(segment, 0L, index); }
    /// {@return `pObjects`}
    /// @param segment the segment of the struct
    public static @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment get_pObjects(MemorySegment segment) { return VkDebugUtilsMessengerCallbackDataEXT.get_pObjects(segment, 0L); }
    /// {@return `pObjects` at the given index}
    /// @param index the index
    public @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment pObjectsAt(long index) { return VkDebugUtilsMessengerCallbackDataEXT.get_pObjects(this.segment(), index); }
    /// {@return `pObjects`}
    public @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment pObjects() { return VkDebugUtilsMessengerCallbackDataEXT.get_pObjects(this.segment()); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pObjects(MemorySegment segment, long index, @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment value) { VH_pObjects.set(segment, 0L, index, value); }
    /// Sets `pObjects` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pObjects(MemorySegment segment, @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pObjects(segment, 0L, value); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pObjectsAt(long index, @CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pObjects(this.segment(), index, value); return this; }
    /// Sets `pObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pObjects(@CType("const VkDebugUtilsObjectNameInfoEXT *") java.lang.foreign.MemorySegment value) { VkDebugUtilsMessengerCallbackDataEXT.set_pObjects(this.segment(), value); return this; }

}
