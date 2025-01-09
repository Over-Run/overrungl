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
/// ### imageView
/// [VarHandle][#VH_imageView] - [Getter][#imageView()] - [Setter][#imageView(java.lang.foreign.MemorySegment)]
/// ### imageLayout
/// [VarHandle][#VH_imageLayout] - [Getter][#imageLayout()] - [Setter][#imageLayout(int)]
/// ### resolveMode
/// [VarHandle][#VH_resolveMode] - [Getter][#resolveMode()] - [Setter][#resolveMode(int)]
/// ### resolveImageView
/// [VarHandle][#VH_resolveImageView] - [Getter][#resolveImageView()] - [Setter][#resolveImageView(java.lang.foreign.MemorySegment)]
/// ### resolveImageLayout
/// [VarHandle][#VH_resolveImageLayout] - [Getter][#resolveImageLayout()] - [Setter][#resolveImageLayout(int)]
/// ### loadOp
/// [VarHandle][#VH_loadOp] - [Getter][#loadOp()] - [Setter][#loadOp(int)]
/// ### storeOp
/// [VarHandle][#VH_storeOp] - [Getter][#storeOp()] - [Setter][#storeOp(int)]
/// ### clearValue
/// [Byte offset][#OFFSET_clearValue] - [Memory layout][#ML_clearValue] - [Getter][#clearValue()] - [Setter][#clearValue(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRenderingAttachmentInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageView imageView;
///     VkImageLayout imageLayout;
///     VkResolveModeFlagBits resolveMode;
///     VkImageView resolveImageView;
///     VkImageLayout resolveImageLayout;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkClearValue clearValue;
/// } VkRenderingAttachmentInfo;
/// ```
public final class VkRenderingAttachmentInfo extends Struct {
    /// The struct layout of `VkRenderingAttachmentInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        ValueLayout.JAVA_INT.withName("resolveMode"),
        ValueLayout.ADDRESS.withName("resolveImageView"),
        ValueLayout.JAVA_INT.withName("resolveImageLayout"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        overrungl.vulkan.union.VkClearValue.LAYOUT.withName("clearValue")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));
    /// The [VarHandle] of `resolveMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_resolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveMode"));
    /// The [VarHandle] of `resolveImageView` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_resolveImageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveImageView"));
    /// The [VarHandle] of `resolveImageLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_resolveImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveImageLayout"));
    /// The [VarHandle] of `loadOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_loadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loadOp"));
    /// The [VarHandle] of `storeOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storeOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storeOp"));
    /// The byte offset of `clearValue`.
    public static final long OFFSET_clearValue = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
    /// The memory layout of `clearValue`.
    public static final MemoryLayout ML_clearValue = LAYOUT.select(PathElement.groupElement("clearValue"));

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    /// @param segment the memory segment
    public VkRenderingAttachmentInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment); }

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo alloc(SegmentAllocator allocator) { return new VkRenderingAttachmentInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAttachmentInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkRenderingAttachmentInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkRenderingAttachmentInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkRenderingAttachmentInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkRenderingAttachmentInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkRenderingAttachmentInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo sType(@CType("VkStructureType") int value) { VkRenderingAttachmentInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkRenderingAttachmentInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkRenderingAttachmentInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkRenderingAttachmentInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_imageView(MemorySegment segment) { return VkRenderingAttachmentInfo.get_imageView(segment, 0L); }
    /// {@return `imageView` at the given index}
    /// @param index the index
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageViewAt(long index) { return VkRenderingAttachmentInfo.get_imageView(this.segment(), index); }
    /// {@return `imageView`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment imageView() { return VkRenderingAttachmentInfo.get_imageView(this.segment()); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageView(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_imageView(segment, 0L, value); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageViewAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_imageView(this.segment(), index, value); return this; }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageView(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_imageView(this.segment(), value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_imageLayout(MemorySegment segment, long index) { return (int) VH_imageLayout.get(segment, 0L, index); }
    /// {@return `imageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_imageLayout(MemorySegment segment) { return VkRenderingAttachmentInfo.get_imageLayout(segment, 0L); }
    /// {@return `imageLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int imageLayoutAt(long index) { return VkRenderingAttachmentInfo.get_imageLayout(this.segment(), index); }
    /// {@return `imageLayout`}
    public @CType("VkImageLayout") int imageLayout() { return VkRenderingAttachmentInfo.get_imageLayout(this.segment()); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_imageLayout.set(segment, 0L, index, value); }
    /// Sets `imageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkRenderingAttachmentInfo.set_imageLayout(segment, 0L, value); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageLayoutAt(long index, @CType("VkImageLayout") int value) { VkRenderingAttachmentInfo.set_imageLayout(this.segment(), index, value); return this; }
    /// Sets `imageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageLayout(@CType("VkImageLayout") int value) { VkRenderingAttachmentInfo.set_imageLayout(this.segment(), value); return this; }

    /// {@return `resolveMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkResolveModeFlagBits") int get_resolveMode(MemorySegment segment, long index) { return (int) VH_resolveMode.get(segment, 0L, index); }
    /// {@return `resolveMode`}
    /// @param segment the segment of the struct
    public static @CType("VkResolveModeFlagBits") int get_resolveMode(MemorySegment segment) { return VkRenderingAttachmentInfo.get_resolveMode(segment, 0L); }
    /// {@return `resolveMode` at the given index}
    /// @param index the index
    public @CType("VkResolveModeFlagBits") int resolveModeAt(long index) { return VkRenderingAttachmentInfo.get_resolveMode(this.segment(), index); }
    /// {@return `resolveMode`}
    public @CType("VkResolveModeFlagBits") int resolveMode() { return VkRenderingAttachmentInfo.get_resolveMode(this.segment()); }
    /// Sets `resolveMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resolveMode(MemorySegment segment, long index, @CType("VkResolveModeFlagBits") int value) { VH_resolveMode.set(segment, 0L, index, value); }
    /// Sets `resolveMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resolveMode(MemorySegment segment, @CType("VkResolveModeFlagBits") int value) { VkRenderingAttachmentInfo.set_resolveMode(segment, 0L, value); }
    /// Sets `resolveMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveModeAt(long index, @CType("VkResolveModeFlagBits") int value) { VkRenderingAttachmentInfo.set_resolveMode(this.segment(), index, value); return this; }
    /// Sets `resolveMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveMode(@CType("VkResolveModeFlagBits") int value) { VkRenderingAttachmentInfo.set_resolveMode(this.segment(), value); return this; }

    /// {@return `resolveImageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_resolveImageView(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_resolveImageView.get(segment, 0L, index); }
    /// {@return `resolveImageView`}
    /// @param segment the segment of the struct
    public static @CType("VkImageView") java.lang.foreign.MemorySegment get_resolveImageView(MemorySegment segment) { return VkRenderingAttachmentInfo.get_resolveImageView(segment, 0L); }
    /// {@return `resolveImageView` at the given index}
    /// @param index the index
    public @CType("VkImageView") java.lang.foreign.MemorySegment resolveImageViewAt(long index) { return VkRenderingAttachmentInfo.get_resolveImageView(this.segment(), index); }
    /// {@return `resolveImageView`}
    public @CType("VkImageView") java.lang.foreign.MemorySegment resolveImageView() { return VkRenderingAttachmentInfo.get_resolveImageView(this.segment()); }
    /// Sets `resolveImageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resolveImageView(MemorySegment segment, long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VH_resolveImageView.set(segment, 0L, index, value); }
    /// Sets `resolveImageView` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resolveImageView(MemorySegment segment, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_resolveImageView(segment, 0L, value); }
    /// Sets `resolveImageView` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageViewAt(long index, @CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_resolveImageView(this.segment(), index, value); return this; }
    /// Sets `resolveImageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageView(@CType("VkImageView") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_resolveImageView(this.segment(), value); return this; }

    /// {@return `resolveImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_resolveImageLayout(MemorySegment segment, long index) { return (int) VH_resolveImageLayout.get(segment, 0L, index); }
    /// {@return `resolveImageLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_resolveImageLayout(MemorySegment segment) { return VkRenderingAttachmentInfo.get_resolveImageLayout(segment, 0L); }
    /// {@return `resolveImageLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int resolveImageLayoutAt(long index) { return VkRenderingAttachmentInfo.get_resolveImageLayout(this.segment(), index); }
    /// {@return `resolveImageLayout`}
    public @CType("VkImageLayout") int resolveImageLayout() { return VkRenderingAttachmentInfo.get_resolveImageLayout(this.segment()); }
    /// Sets `resolveImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resolveImageLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_resolveImageLayout.set(segment, 0L, index, value); }
    /// Sets `resolveImageLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resolveImageLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkRenderingAttachmentInfo.set_resolveImageLayout(segment, 0L, value); }
    /// Sets `resolveImageLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageLayoutAt(long index, @CType("VkImageLayout") int value) { VkRenderingAttachmentInfo.set_resolveImageLayout(this.segment(), index, value); return this; }
    /// Sets `resolveImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageLayout(@CType("VkImageLayout") int value) { VkRenderingAttachmentInfo.set_resolveImageLayout(this.segment(), value); return this; }

    /// {@return `loadOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentLoadOp") int get_loadOp(MemorySegment segment, long index) { return (int) VH_loadOp.get(segment, 0L, index); }
    /// {@return `loadOp`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentLoadOp") int get_loadOp(MemorySegment segment) { return VkRenderingAttachmentInfo.get_loadOp(segment, 0L); }
    /// {@return `loadOp` at the given index}
    /// @param index the index
    public @CType("VkAttachmentLoadOp") int loadOpAt(long index) { return VkRenderingAttachmentInfo.get_loadOp(this.segment(), index); }
    /// {@return `loadOp`}
    public @CType("VkAttachmentLoadOp") int loadOp() { return VkRenderingAttachmentInfo.get_loadOp(this.segment()); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loadOp(MemorySegment segment, long index, @CType("VkAttachmentLoadOp") int value) { VH_loadOp.set(segment, 0L, index, value); }
    /// Sets `loadOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loadOp(MemorySegment segment, @CType("VkAttachmentLoadOp") int value) { VkRenderingAttachmentInfo.set_loadOp(segment, 0L, value); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo loadOpAt(long index, @CType("VkAttachmentLoadOp") int value) { VkRenderingAttachmentInfo.set_loadOp(this.segment(), index, value); return this; }
    /// Sets `loadOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo loadOp(@CType("VkAttachmentLoadOp") int value) { VkRenderingAttachmentInfo.set_loadOp(this.segment(), value); return this; }

    /// {@return `storeOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentStoreOp") int get_storeOp(MemorySegment segment, long index) { return (int) VH_storeOp.get(segment, 0L, index); }
    /// {@return `storeOp`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentStoreOp") int get_storeOp(MemorySegment segment) { return VkRenderingAttachmentInfo.get_storeOp(segment, 0L); }
    /// {@return `storeOp` at the given index}
    /// @param index the index
    public @CType("VkAttachmentStoreOp") int storeOpAt(long index) { return VkRenderingAttachmentInfo.get_storeOp(this.segment(), index); }
    /// {@return `storeOp`}
    public @CType("VkAttachmentStoreOp") int storeOp() { return VkRenderingAttachmentInfo.get_storeOp(this.segment()); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storeOp(MemorySegment segment, long index, @CType("VkAttachmentStoreOp") int value) { VH_storeOp.set(segment, 0L, index, value); }
    /// Sets `storeOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storeOp(MemorySegment segment, @CType("VkAttachmentStoreOp") int value) { VkRenderingAttachmentInfo.set_storeOp(segment, 0L, value); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo storeOpAt(long index, @CType("VkAttachmentStoreOp") int value) { VkRenderingAttachmentInfo.set_storeOp(this.segment(), index, value); return this; }
    /// Sets `storeOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo storeOp(@CType("VkAttachmentStoreOp") int value) { VkRenderingAttachmentInfo.set_storeOp(this.segment(), value); return this; }

    /// {@return `clearValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkClearValue") java.lang.foreign.MemorySegment get_clearValue(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_clearValue, index), ML_clearValue); }
    /// {@return `clearValue`}
    /// @param segment the segment of the struct
    public static @CType("VkClearValue") java.lang.foreign.MemorySegment get_clearValue(MemorySegment segment) { return VkRenderingAttachmentInfo.get_clearValue(segment, 0L); }
    /// {@return `clearValue` at the given index}
    /// @param index the index
    public @CType("VkClearValue") java.lang.foreign.MemorySegment clearValueAt(long index) { return VkRenderingAttachmentInfo.get_clearValue(this.segment(), index); }
    /// {@return `clearValue`}
    public @CType("VkClearValue") java.lang.foreign.MemorySegment clearValue() { return VkRenderingAttachmentInfo.get_clearValue(this.segment()); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clearValue(MemorySegment segment, long index, @CType("VkClearValue") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_clearValue, index), ML_clearValue.byteSize()); }
    /// Sets `clearValue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clearValue(MemorySegment segment, @CType("VkClearValue") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_clearValue(segment, 0L, value); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo clearValueAt(long index, @CType("VkClearValue") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_clearValue(this.segment(), index, value); return this; }
    /// Sets `clearValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo clearValue(@CType("VkClearValue") java.lang.foreign.MemorySegment value) { VkRenderingAttachmentInfo.set_clearValue(this.segment(), value); return this; }

}
