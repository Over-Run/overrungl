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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### logicOpEnable
/// [VarHandle][#VH_logicOpEnable] - [Getter][#logicOpEnable()] - [Setter][#logicOpEnable(int)]
/// ### logicOp
/// [VarHandle][#VH_logicOp] - [Getter][#logicOp()] - [Setter][#logicOp(int)]
/// ### attachmentCount
/// [VarHandle][#VH_attachmentCount] - [Getter][#attachmentCount()] - [Setter][#attachmentCount(int)]
/// ### pAttachments
/// [VarHandle][#VH_pAttachments] - [Getter][#pAttachments()] - [Setter][#pAttachments(MemorySegment)]
/// ### blendConstants
/// [Byte offset][#OFFSET_blendConstants] - [Memory layout][#ML_blendConstants] - [Getter][#blendConstants()] - [Setter][#blendConstants(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineColorBlendStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineColorBlendStateCreateFlags flags;
///     VkBool32 logicOpEnable;
///     VkLogicOp logicOp;
///     uint32_t attachmentCount;
///     const VkPipelineColorBlendAttachmentState * pAttachments;
///     float[4] blendConstants;
/// } VkPipelineColorBlendStateCreateInfo;
/// ```
public sealed class VkPipelineColorBlendStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineColorBlendStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("logicOpEnable"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("blendConstants")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `logicOpEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_logicOpEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOpEnable"));
    /// The [VarHandle] of `logicOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_logicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("logicOp"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    /// The byte offset of `blendConstants`.
    public static final long OFFSET_blendConstants = LAYOUT.byteOffset(PathElement.groupElement("blendConstants"));
    /// The memory layout of `blendConstants`.
    public static final MemoryLayout ML_blendConstants = LAYOUT.select(PathElement.groupElement("blendConstants"));

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineColorBlendStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineColorBlendStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineColorBlendStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineColorBlendStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPipelineColorBlendStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendStateCreateInfo`
    public static VkPipelineColorBlendStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineColorBlendStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineColorBlendStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineColorBlendStateCreateInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineColorBlendStateCreateInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineColorBlendStateCreateInfo`
    public static VkPipelineColorBlendStateCreateInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkPipelineColorBlendStateCreateFlags") int flags, @CType("VkBool32") int logicOpEnable, @CType("VkLogicOp") int logicOp, @CType("uint32_t") int attachmentCount, @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment pAttachments, @CType("float[4]") MemorySegment blendConstants) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).logicOpEnable(logicOpEnable).logicOp(logicOp).attachmentCount(attachmentCount).pAttachments(pAttachments).blendConstants(blendConstants); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo copyFrom(VkPipelineColorBlendStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineColorBlendStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineColorBlendStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineColorBlendStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkPipelineColorBlendStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo pNext(@CType("const void *") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineColorBlendStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineColorBlendStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkPipelineColorBlendStateCreateFlags") int flags() { return VkPipelineColorBlendStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineColorBlendStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineColorBlendStateCreateFlags") int value) { VkPipelineColorBlendStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo flags(@CType("VkPipelineColorBlendStateCreateFlags") int value) { VkPipelineColorBlendStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `logicOpEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_logicOpEnable(MemorySegment segment, long index) { return (int) VH_logicOpEnable.get(segment, 0L, index); }
    /// {@return `logicOpEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_logicOpEnable(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_logicOpEnable(segment, 0L); }
    /// {@return `logicOpEnable`}
    public @CType("VkBool32") int logicOpEnable() { return VkPipelineColorBlendStateCreateInfo.get_logicOpEnable(this.segment()); }
    /// Sets `logicOpEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_logicOpEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_logicOpEnable.set(segment, 0L, index, value); }
    /// Sets `logicOpEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_logicOpEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineColorBlendStateCreateInfo.set_logicOpEnable(segment, 0L, value); }
    /// Sets `logicOpEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo logicOpEnable(@CType("VkBool32") int value) { VkPipelineColorBlendStateCreateInfo.set_logicOpEnable(this.segment(), value); return this; }

    /// {@return `logicOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkLogicOp") int get_logicOp(MemorySegment segment, long index) { return (int) VH_logicOp.get(segment, 0L, index); }
    /// {@return `logicOp`}
    /// @param segment the segment of the struct
    public static @CType("VkLogicOp") int get_logicOp(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_logicOp(segment, 0L); }
    /// {@return `logicOp`}
    public @CType("VkLogicOp") int logicOp() { return VkPipelineColorBlendStateCreateInfo.get_logicOp(this.segment()); }
    /// Sets `logicOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_logicOp(MemorySegment segment, long index, @CType("VkLogicOp") int value) { VH_logicOp.set(segment, 0L, index, value); }
    /// Sets `logicOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_logicOp(MemorySegment segment, @CType("VkLogicOp") int value) { VkPipelineColorBlendStateCreateInfo.set_logicOp(segment, 0L, value); }
    /// Sets `logicOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo logicOp(@CType("VkLogicOp") int value) { VkPipelineColorBlendStateCreateInfo.set_logicOp(this.segment(), value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_attachmentCount(segment, 0L); }
    /// {@return `attachmentCount`}
    public @CType("uint32_t") int attachmentCount() { return VkPipelineColorBlendStateCreateInfo.get_attachmentCount(this.segment()); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineColorBlendStateCreateInfo.set_attachmentCount(segment, 0L, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo attachmentCount(@CType("uint32_t") int value) { VkPipelineColorBlendStateCreateInfo.set_attachmentCount(this.segment(), value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment get_pAttachments(MemorySegment segment, long index) { return (MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment get_pAttachments(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_pAttachments(segment, 0L); }
    /// {@return `pAttachments`}
    public @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment pAttachments() { return VkPipelineColorBlendStateCreateInfo.get_pAttachments(this.segment()); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, long index, @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_pAttachments(segment, 0L, value); }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo pAttachments(@CType("const VkPipelineColorBlendAttachmentState *") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_pAttachments(this.segment(), value); return this; }

    /// {@return `blendConstants` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[4]") MemorySegment get_blendConstants(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_blendConstants, index), ML_blendConstants); }
    /// {@return `blendConstants`}
    /// @param segment the segment of the struct
    public static @CType("float[4]") MemorySegment get_blendConstants(MemorySegment segment) { return VkPipelineColorBlendStateCreateInfo.get_blendConstants(segment, 0L); }
    /// {@return `blendConstants`}
    public @CType("float[4]") MemorySegment blendConstants() { return VkPipelineColorBlendStateCreateInfo.get_blendConstants(this.segment()); }
    /// Sets `blendConstants` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blendConstants(MemorySegment segment, long index, @CType("float[4]") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_blendConstants, index), ML_blendConstants.byteSize()); }
    /// Sets `blendConstants` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blendConstants(MemorySegment segment, @CType("float[4]") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_blendConstants(segment, 0L, value); }
    /// Sets `blendConstants` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineColorBlendStateCreateInfo blendConstants(@CType("float[4]") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_blendConstants(this.segment(), value); return this; }

    /// A buffer of [VkPipelineColorBlendStateCreateInfo].
    public static final class Buffer extends VkPipelineColorBlendStateCreateInfo {
        private final long elementCount;

        /// Creates `VkPipelineColorBlendStateCreateInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineColorBlendStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineColorBlendStateCreateInfo`
        public VkPipelineColorBlendStateCreateInfo asSlice(long index) { return new VkPipelineColorBlendStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineColorBlendStateCreateInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineColorBlendStateCreateInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineColorBlendStateCreateInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkPipelineColorBlendStateCreateFlags") int flagsAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkPipelineColorBlendStateCreateFlags") int value) { VkPipelineColorBlendStateCreateInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `logicOpEnable` at the given index}
        /// @param index the index
        public @CType("VkBool32") int logicOpEnableAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_logicOpEnable(this.segment(), index); }
        /// Sets `logicOpEnable` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer logicOpEnableAt(long index, @CType("VkBool32") int value) { VkPipelineColorBlendStateCreateInfo.set_logicOpEnable(this.segment(), index, value); return this; }

        /// {@return `logicOp` at the given index}
        /// @param index the index
        public @CType("VkLogicOp") int logicOpAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_logicOp(this.segment(), index); }
        /// Sets `logicOp` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer logicOpAt(long index, @CType("VkLogicOp") int value) { VkPipelineColorBlendStateCreateInfo.set_logicOp(this.segment(), index, value); return this; }

        /// {@return `attachmentCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int attachmentCountAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_attachmentCount(this.segment(), index); }
        /// Sets `attachmentCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer attachmentCountAt(long index, @CType("uint32_t") int value) { VkPipelineColorBlendStateCreateInfo.set_attachmentCount(this.segment(), index, value); return this; }

        /// {@return `pAttachments` at the given index}
        /// @param index the index
        public @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment pAttachmentsAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_pAttachments(this.segment(), index); }
        /// Sets `pAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pAttachmentsAt(long index, @CType("const VkPipelineColorBlendAttachmentState *") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_pAttachments(this.segment(), index, value); return this; }

        /// {@return `blendConstants` at the given index}
        /// @param index the index
        public @CType("float[4]") MemorySegment blendConstantsAt(long index) { return VkPipelineColorBlendStateCreateInfo.get_blendConstants(this.segment(), index); }
        /// Sets `blendConstants` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer blendConstantsAt(long index, @CType("float[4]") MemorySegment value) { VkPipelineColorBlendStateCreateInfo.set_blendConstants(this.segment(), index, value); return this; }

    }
}
