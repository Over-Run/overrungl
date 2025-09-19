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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDebugUtilsMessengerCallbackDataEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsMessengerCallbackDataEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkDebugUtilsMessengerCallbackDataFlagsEXT flags;
///     const char* pMessageIdName;
///     int32_t messageIdNumber;
///     const char* pMessage;
///     uint32_t queueLabelCount;
///     const VkDebugUtilsLabelEXT* pQueueLabels;
///     uint32_t cmdBufLabelCount;
///     const VkDebugUtilsLabelEXT* pCmdBufLabels;
///     uint32_t objectCount;
///     const VkDebugUtilsObjectNameInfoEXT* pObjects;
/// };
/// ```
public final class VkDebugUtilsMessengerCallbackDataEXT extends GroupType {
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pMessageIdName`.
    public static final long OFFSET_pMessageIdName = LAYOUT.byteOffset(PathElement.groupElement("pMessageIdName"));
    /// The memory layout of `pMessageIdName`.
    public static final MemoryLayout LAYOUT_pMessageIdName = LAYOUT.select(PathElement.groupElement("pMessageIdName"));
    /// The [VarHandle] of `pMessageIdName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMessageIdName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMessageIdName"));
    /// The byte offset of `messageIdNumber`.
    public static final long OFFSET_messageIdNumber = LAYOUT.byteOffset(PathElement.groupElement("messageIdNumber"));
    /// The memory layout of `messageIdNumber`.
    public static final MemoryLayout LAYOUT_messageIdNumber = LAYOUT.select(PathElement.groupElement("messageIdNumber"));
    /// The [VarHandle] of `messageIdNumber` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_messageIdNumber = LAYOUT.arrayElementVarHandle(PathElement.groupElement("messageIdNumber"));
    /// The byte offset of `pMessage`.
    public static final long OFFSET_pMessage = LAYOUT.byteOffset(PathElement.groupElement("pMessage"));
    /// The memory layout of `pMessage`.
    public static final MemoryLayout LAYOUT_pMessage = LAYOUT.select(PathElement.groupElement("pMessage"));
    /// The [VarHandle] of `pMessage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMessage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMessage"));
    /// The byte offset of `queueLabelCount`.
    public static final long OFFSET_queueLabelCount = LAYOUT.byteOffset(PathElement.groupElement("queueLabelCount"));
    /// The memory layout of `queueLabelCount`.
    public static final MemoryLayout LAYOUT_queueLabelCount = LAYOUT.select(PathElement.groupElement("queueLabelCount"));
    /// The [VarHandle] of `queueLabelCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueLabelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueLabelCount"));
    /// The byte offset of `pQueueLabels`.
    public static final long OFFSET_pQueueLabels = LAYOUT.byteOffset(PathElement.groupElement("pQueueLabels"));
    /// The memory layout of `pQueueLabels`.
    public static final MemoryLayout LAYOUT_pQueueLabels = LAYOUT.select(PathElement.groupElement("pQueueLabels"));
    /// The [VarHandle] of `pQueueLabels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQueueLabels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueLabels"));
    /// The byte offset of `cmdBufLabelCount`.
    public static final long OFFSET_cmdBufLabelCount = LAYOUT.byteOffset(PathElement.groupElement("cmdBufLabelCount"));
    /// The memory layout of `cmdBufLabelCount`.
    public static final MemoryLayout LAYOUT_cmdBufLabelCount = LAYOUT.select(PathElement.groupElement("cmdBufLabelCount"));
    /// The [VarHandle] of `cmdBufLabelCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cmdBufLabelCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cmdBufLabelCount"));
    /// The byte offset of `pCmdBufLabels`.
    public static final long OFFSET_pCmdBufLabels = LAYOUT.byteOffset(PathElement.groupElement("pCmdBufLabels"));
    /// The memory layout of `pCmdBufLabels`.
    public static final MemoryLayout LAYOUT_pCmdBufLabels = LAYOUT.select(PathElement.groupElement("pCmdBufLabels"));
    /// The [VarHandle] of `pCmdBufLabels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCmdBufLabels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCmdBufLabels"));
    /// The byte offset of `objectCount`.
    public static final long OFFSET_objectCount = LAYOUT.byteOffset(PathElement.groupElement("objectCount"));
    /// The memory layout of `objectCount`.
    public static final MemoryLayout LAYOUT_objectCount = LAYOUT.select(PathElement.groupElement("objectCount"));
    /// The [VarHandle] of `objectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_objectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectCount"));
    /// The byte offset of `pObjects`.
    public static final long OFFSET_pObjects = LAYOUT.byteOffset(PathElement.groupElement("pObjects"));
    /// The memory layout of `pObjects`.
    public static final MemoryLayout LAYOUT_pObjects = LAYOUT.select(PathElement.groupElement("pObjects"));
    /// The [VarHandle] of `pObjects` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pObjects = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pObjects"));

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCallbackDataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCallbackDataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDebugUtilsMessengerCallbackDataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsMessengerCallbackDataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsMessengerCallbackDataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugUtilsMessengerCallbackDataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsMessengerCallbackDataEXT`
    public static VkDebugUtilsMessengerCallbackDataEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsMessengerCallbackDataEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDebugUtilsMessengerCallbackDataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsMessengerCallbackDataEXT`
    public static VkDebugUtilsMessengerCallbackDataEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsMessengerCallbackDataEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT copyFrom(VkDebugUtilsMessengerCallbackDataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDebugUtilsMessengerCallbackDataEXT reinterpret(long count) { return new VkDebugUtilsMessengerCallbackDataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pMessageIdName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMessageIdName(MemorySegment segment, long index) { return (MemorySegment) VH_pMessageIdName.get(segment, 0L, index); }
    /// {@return `pMessageIdName`}
    public MemorySegment pMessageIdName() { return pMessageIdName(this.segment(), 0L); }
    /// Sets `pMessageIdName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMessageIdName(MemorySegment segment, long index, MemorySegment value) { VH_pMessageIdName.set(segment, 0L, index, value); }
    /// Sets `pMessageIdName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(MemorySegment value) { pMessageIdName(this.segment(), 0L, value); return this; }

    /// {@return `messageIdNumber` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int messageIdNumber(MemorySegment segment, long index) { return (int) VH_messageIdNumber.get(segment, 0L, index); }
    /// {@return `messageIdNumber`}
    public int messageIdNumber() { return messageIdNumber(this.segment(), 0L); }
    /// Sets `messageIdNumber` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void messageIdNumber(MemorySegment segment, long index, int value) { VH_messageIdNumber.set(segment, 0L, index, value); }
    /// Sets `messageIdNumber` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(int value) { messageIdNumber(this.segment(), 0L, value); return this; }

    /// {@return `pMessage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMessage(MemorySegment segment, long index) { return (MemorySegment) VH_pMessage.get(segment, 0L, index); }
    /// {@return `pMessage`}
    public MemorySegment pMessage() { return pMessage(this.segment(), 0L); }
    /// Sets `pMessage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMessage(MemorySegment segment, long index, MemorySegment value) { VH_pMessage.set(segment, 0L, index, value); }
    /// Sets `pMessage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessage(MemorySegment value) { pMessage(this.segment(), 0L, value); return this; }

    /// {@return `queueLabelCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueLabelCount(MemorySegment segment, long index) { return (int) VH_queueLabelCount.get(segment, 0L, index); }
    /// {@return `queueLabelCount`}
    public int queueLabelCount() { return queueLabelCount(this.segment(), 0L); }
    /// Sets `queueLabelCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueLabelCount(MemorySegment segment, long index, int value) { VH_queueLabelCount.set(segment, 0L, index, value); }
    /// Sets `queueLabelCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCount(int value) { queueLabelCount(this.segment(), 0L, value); return this; }

    /// {@return `pQueueLabels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQueueLabels(MemorySegment segment, long index) { return (MemorySegment) VH_pQueueLabels.get(segment, 0L, index); }
    /// {@return `pQueueLabels`}
    public MemorySegment pQueueLabels() { return pQueueLabels(this.segment(), 0L); }
    /// Sets `pQueueLabels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQueueLabels(MemorySegment segment, long index, MemorySegment value) { VH_pQueueLabels.set(segment, 0L, index, value); }
    /// Sets `pQueueLabels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(MemorySegment value) { pQueueLabels(this.segment(), 0L, value); return this; }

    /// {@return `cmdBufLabelCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cmdBufLabelCount(MemorySegment segment, long index) { return (int) VH_cmdBufLabelCount.get(segment, 0L, index); }
    /// {@return `cmdBufLabelCount`}
    public int cmdBufLabelCount() { return cmdBufLabelCount(this.segment(), 0L); }
    /// Sets `cmdBufLabelCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cmdBufLabelCount(MemorySegment segment, long index, int value) { VH_cmdBufLabelCount.set(segment, 0L, index, value); }
    /// Sets `cmdBufLabelCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCount(int value) { cmdBufLabelCount(this.segment(), 0L, value); return this; }

    /// {@return `pCmdBufLabels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCmdBufLabels(MemorySegment segment, long index) { return (MemorySegment) VH_pCmdBufLabels.get(segment, 0L, index); }
    /// {@return `pCmdBufLabels`}
    public MemorySegment pCmdBufLabels() { return pCmdBufLabels(this.segment(), 0L); }
    /// Sets `pCmdBufLabels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCmdBufLabels(MemorySegment segment, long index, MemorySegment value) { VH_pCmdBufLabels.set(segment, 0L, index, value); }
    /// Sets `pCmdBufLabels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(MemorySegment value) { pCmdBufLabels(this.segment(), 0L, value); return this; }

    /// {@return `objectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectCount(MemorySegment segment, long index) { return (int) VH_objectCount.get(segment, 0L, index); }
    /// {@return `objectCount`}
    public int objectCount() { return objectCount(this.segment(), 0L); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectCount(MemorySegment segment, long index, int value) { VH_objectCount.set(segment, 0L, index, value); }
    /// Sets `objectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT objectCount(int value) { objectCount(this.segment(), 0L, value); return this; }

    /// {@return `pObjects` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pObjects(MemorySegment segment, long index) { return (MemorySegment) VH_pObjects.get(segment, 0L, index); }
    /// {@return `pObjects`}
    public MemorySegment pObjects() { return pObjects(this.segment(), 0L); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pObjects(MemorySegment segment, long index, MemorySegment value) { VH_pObjects.set(segment, 0L, index, value); }
    /// Sets `pObjects` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pObjects(MemorySegment value) { pObjects(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDebugUtilsMessengerCallbackDataEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDebugUtilsMessengerCallbackDataEXT`
    public VkDebugUtilsMessengerCallbackDataEXT asSlice(long index) { return new VkDebugUtilsMessengerCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDebugUtilsMessengerCallbackDataEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDebugUtilsMessengerCallbackDataEXT`
    public VkDebugUtilsMessengerCallbackDataEXT asSlice(long index, long count) { return new VkDebugUtilsMessengerCallbackDataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDebugUtilsMessengerCallbackDataEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT at(long index, Consumer<VkDebugUtilsMessengerCallbackDataEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pMessageIdName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMessageIdNameAt(long index) { return pMessageIdName(this.segment(), index); }
    /// Sets `pMessageIdName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdNameAt(long index, MemorySegment value) { pMessageIdName(this.segment(), index, value); return this; }

    /// {@return `messageIdNumber` at the given index}
    /// @param index the index of the struct buffer
    public int messageIdNumberAt(long index) { return messageIdNumber(this.segment(), index); }
    /// Sets `messageIdNumber` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumberAt(long index, int value) { messageIdNumber(this.segment(), index, value); return this; }

    /// {@return `pMessage` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pMessageAt(long index) { return pMessage(this.segment(), index); }
    /// Sets `pMessage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pMessageAt(long index, MemorySegment value) { pMessage(this.segment(), index, value); return this; }

    /// {@return `queueLabelCount` at the given index}
    /// @param index the index of the struct buffer
    public int queueLabelCountAt(long index) { return queueLabelCount(this.segment(), index); }
    /// Sets `queueLabelCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCountAt(long index, int value) { queueLabelCount(this.segment(), index, value); return this; }

    /// {@return `pQueueLabels` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pQueueLabelsAt(long index) { return pQueueLabels(this.segment(), index); }
    /// Sets `pQueueLabels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabelsAt(long index, MemorySegment value) { pQueueLabels(this.segment(), index, value); return this; }

    /// {@return `cmdBufLabelCount` at the given index}
    /// @param index the index of the struct buffer
    public int cmdBufLabelCountAt(long index) { return cmdBufLabelCount(this.segment(), index); }
    /// Sets `cmdBufLabelCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCountAt(long index, int value) { cmdBufLabelCount(this.segment(), index, value); return this; }

    /// {@return `pCmdBufLabels` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCmdBufLabelsAt(long index) { return pCmdBufLabels(this.segment(), index); }
    /// Sets `pCmdBufLabels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabelsAt(long index, MemorySegment value) { pCmdBufLabels(this.segment(), index, value); return this; }

    /// {@return `objectCount` at the given index}
    /// @param index the index of the struct buffer
    public int objectCountAt(long index) { return objectCount(this.segment(), index); }
    /// Sets `objectCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT objectCountAt(long index, int value) { objectCount(this.segment(), index, value); return this; }

    /// {@return `pObjects` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pObjectsAt(long index) { return pObjects(this.segment(), index); }
    /// Sets `pObjects` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsMessengerCallbackDataEXT pObjectsAt(long index, MemorySegment value) { pObjects(this.segment(), index, value); return this; }

}
