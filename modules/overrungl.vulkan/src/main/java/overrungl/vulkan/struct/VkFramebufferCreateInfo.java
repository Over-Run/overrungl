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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### renderPass
/// [VarHandle][#VH_renderPass] - [Getter][#renderPass()] - [Setter][#renderPass(java.lang.foreign.MemorySegment)]
/// ### attachmentCount
/// [VarHandle][#VH_attachmentCount] - [Getter][#attachmentCount()] - [Setter][#attachmentCount(int)]
/// ### pAttachments
/// [VarHandle][#VH_pAttachments] - [Getter][#pAttachments()] - [Setter][#pAttachments(java.lang.foreign.MemorySegment)]
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### layers
/// [VarHandle][#VH_layers] - [Getter][#layers()] - [Setter][#layers(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFramebufferCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkFramebufferCreateFlags flags;
///     VkRenderPass renderPass;
///     uint32_t attachmentCount;
///     const VkImageView * pAttachments;
///     uint32_t width;
///     uint32_t height;
///     uint32_t layers;
/// } VkFramebufferCreateInfo;
/// ```
public final class VkFramebufferCreateInfo extends Struct {
    /// The struct layout of `VkFramebufferCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withName("pAttachments"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `renderPass` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_renderPass = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPass"));
    /// The [VarHandle] of `attachmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentCount"));
    /// The [VarHandle] of `pAttachments` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttachments"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `layers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layers"));

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkFramebufferCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment); }

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFramebufferCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo alloc(SegmentAllocator allocator) { return new VkFramebufferCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFramebufferCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferCreateInfo`
    public static VkFramebufferCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkFramebufferCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFramebufferCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkFramebufferCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFramebufferCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFramebufferCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkFramebufferCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo sType(@CType("VkStructureType") int value) { VkFramebufferCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkFramebufferCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkFramebufferCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkFramebufferCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFramebufferCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkFramebufferCreateFlags") int get_flags(MemorySegment segment) { return VkFramebufferCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkFramebufferCreateFlags") int flagsAt(long index) { return VkFramebufferCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkFramebufferCreateFlags") int flags() { return VkFramebufferCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkFramebufferCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkFramebufferCreateFlags") int value) { VkFramebufferCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo flagsAt(long index, @CType("VkFramebufferCreateFlags") int value) { VkFramebufferCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo flags(@CType("VkFramebufferCreateFlags") int value) { VkFramebufferCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `renderPass` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_renderPass.get(segment, 0L, index); }
    /// {@return `renderPass`}
    /// @param segment the segment of the struct
    public static @CType("VkRenderPass") java.lang.foreign.MemorySegment get_renderPass(MemorySegment segment) { return VkFramebufferCreateInfo.get_renderPass(segment, 0L); }
    /// {@return `renderPass` at the given index}
    /// @param index the index
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPassAt(long index) { return VkFramebufferCreateInfo.get_renderPass(this.segment(), index); }
    /// {@return `renderPass`}
    public @CType("VkRenderPass") java.lang.foreign.MemorySegment renderPass() { return VkFramebufferCreateInfo.get_renderPass(this.segment()); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VH_renderPass.set(segment, 0L, index, value); }
    /// Sets `renderPass` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPass(MemorySegment segment, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_renderPass(segment, 0L, value); }
    /// Sets `renderPass` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo renderPassAt(long index, @CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_renderPass(this.segment(), index, value); return this; }
    /// Sets `renderPass` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo renderPass(@CType("VkRenderPass") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_renderPass(this.segment(), value); return this; }

    /// {@return `attachmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment, long index) { return (int) VH_attachmentCount.get(segment, 0L, index); }
    /// {@return `attachmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentCount(MemorySegment segment) { return VkFramebufferCreateInfo.get_attachmentCount(segment, 0L); }
    /// {@return `attachmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int attachmentCountAt(long index) { return VkFramebufferCreateInfo.get_attachmentCount(this.segment(), index); }
    /// {@return `attachmentCount`}
    public @CType("uint32_t") int attachmentCount() { return VkFramebufferCreateInfo.get_attachmentCount(this.segment()); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentCount.set(segment, 0L, index, value); }
    /// Sets `attachmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_attachmentCount(segment, 0L, value); }
    /// Sets `attachmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo attachmentCountAt(long index, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_attachmentCount(this.segment(), index, value); return this; }
    /// Sets `attachmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo attachmentCount(@CType("uint32_t") int value) { VkFramebufferCreateInfo.set_attachmentCount(this.segment(), value); return this; }

    /// {@return `pAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkImageView *") java.lang.foreign.MemorySegment get_pAttachments(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttachments.get(segment, 0L, index); }
    /// {@return `pAttachments`}
    /// @param segment the segment of the struct
    public static @CType("const VkImageView *") java.lang.foreign.MemorySegment get_pAttachments(MemorySegment segment) { return VkFramebufferCreateInfo.get_pAttachments(segment, 0L); }
    /// {@return `pAttachments` at the given index}
    /// @param index the index
    public @CType("const VkImageView *") java.lang.foreign.MemorySegment pAttachmentsAt(long index) { return VkFramebufferCreateInfo.get_pAttachments(this.segment(), index); }
    /// {@return `pAttachments`}
    public @CType("const VkImageView *") java.lang.foreign.MemorySegment pAttachments() { return VkFramebufferCreateInfo.get_pAttachments(this.segment()); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, long index, @CType("const VkImageView *") java.lang.foreign.MemorySegment value) { VH_pAttachments.set(segment, 0L, index, value); }
    /// Sets `pAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttachments(MemorySegment segment, @CType("const VkImageView *") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_pAttachments(segment, 0L, value); }
    /// Sets `pAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo pAttachmentsAt(long index, @CType("const VkImageView *") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_pAttachments(this.segment(), index, value); return this; }
    /// Sets `pAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo pAttachments(@CType("const VkImageView *") java.lang.foreign.MemorySegment value) { VkFramebufferCreateInfo.set_pAttachments(this.segment(), value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkFramebufferCreateInfo.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("uint32_t") int widthAt(long index) { return VkFramebufferCreateInfo.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkFramebufferCreateInfo.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo widthAt(long index, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo width(@CType("uint32_t") int value) { VkFramebufferCreateInfo.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkFramebufferCreateInfo.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heightAt(long index) { return VkFramebufferCreateInfo.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkFramebufferCreateInfo.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo heightAt(long index, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo height(@CType("uint32_t") int value) { VkFramebufferCreateInfo.set_height(this.segment(), value); return this; }

    /// {@return `layers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layers(MemorySegment segment, long index) { return (int) VH_layers.get(segment, 0L, index); }
    /// {@return `layers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layers(MemorySegment segment) { return VkFramebufferCreateInfo.get_layers(segment, 0L); }
    /// {@return `layers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layersAt(long index) { return VkFramebufferCreateInfo.get_layers(this.segment(), index); }
    /// {@return `layers`}
    public @CType("uint32_t") int layers() { return VkFramebufferCreateInfo.get_layers(this.segment()); }
    /// Sets `layers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layers.set(segment, 0L, index, value); }
    /// Sets `layers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layers(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_layers(segment, 0L, value); }
    /// Sets `layers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo layersAt(long index, @CType("uint32_t") int value) { VkFramebufferCreateInfo.set_layers(this.segment(), index, value); return this; }
    /// Sets `layers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferCreateInfo layers(@CType("uint32_t") int value) { VkFramebufferCreateInfo.set_layers(this.segment(), value); return this; }

}
