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
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### samples
/// [VarHandle][#VH_samples] - [Getter][#samples()] - [Setter][#samples(int)]
/// ### loadOp
/// [VarHandle][#VH_loadOp] - [Getter][#loadOp()] - [Setter][#loadOp(int)]
/// ### storeOp
/// [VarHandle][#VH_storeOp] - [Getter][#storeOp()] - [Setter][#storeOp(int)]
/// ### stencilLoadOp
/// [VarHandle][#VH_stencilLoadOp] - [Getter][#stencilLoadOp()] - [Setter][#stencilLoadOp(int)]
/// ### stencilStoreOp
/// [VarHandle][#VH_stencilStoreOp] - [Getter][#stencilStoreOp()] - [Setter][#stencilStoreOp(int)]
/// ### initialLayout
/// [VarHandle][#VH_initialLayout] - [Getter][#initialLayout()] - [Setter][#initialLayout(int)]
/// ### finalLayout
/// [VarHandle][#VH_finalLayout] - [Getter][#finalLayout()] - [Setter][#finalLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAttachmentDescription2 {
///     VkStructureType sType;
///     const void * pNext;
///     VkAttachmentDescriptionFlags flags;
///     VkFormat format;
///     VkSampleCountFlagBits samples;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkAttachmentLoadOp stencilLoadOp;
///     VkAttachmentStoreOp stencilStoreOp;
///     VkImageLayout initialLayout;
///     VkImageLayout finalLayout;
/// } VkAttachmentDescription2;
/// ```
public final class VkAttachmentDescription2 extends Struct {
    /// The struct layout of `VkAttachmentDescription2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        ValueLayout.JAVA_INT.withName("stencilLoadOp"),
        ValueLayout.JAVA_INT.withName("stencilStoreOp"),
        ValueLayout.JAVA_INT.withName("initialLayout"),
        ValueLayout.JAVA_INT.withName("finalLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    /// The [VarHandle] of `loadOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_loadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loadOp"));
    /// The [VarHandle] of `storeOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storeOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storeOp"));
    /// The [VarHandle] of `stencilLoadOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilLoadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilLoadOp"));
    /// The [VarHandle] of `stencilStoreOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilStoreOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilStoreOp"));
    /// The [VarHandle] of `initialLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialLayout"));
    /// The [VarHandle] of `finalLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_finalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("finalLayout"));

    /// Creates `VkAttachmentDescription2` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentDescription2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentDescription2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescription2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment); }

    /// Creates `VkAttachmentDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescription2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescription2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 alloc(SegmentAllocator allocator) { return new VkAttachmentDescription2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 alloc(SegmentAllocator allocator, long count) { return new VkAttachmentDescription2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAttachmentDescription2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAttachmentDescription2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAttachmentDescription2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAttachmentDescription2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 sTypeAt(long index, @CType("VkStructureType") int value) { VkAttachmentDescription2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 sType(@CType("VkStructureType") int value) { VkAttachmentDescription2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAttachmentDescription2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAttachmentDescription2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAttachmentDescription2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentDescription2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentDescription2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAttachmentDescription2.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentDescriptionFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentDescriptionFlags") int get_flags(MemorySegment segment) { return VkAttachmentDescription2.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkAttachmentDescriptionFlags") int flagsAt(long index) { return VkAttachmentDescription2.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkAttachmentDescriptionFlags") int flags() { return VkAttachmentDescription2.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkAttachmentDescriptionFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkAttachmentDescriptionFlags") int value) { VkAttachmentDescription2.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 flagsAt(long index, @CType("VkAttachmentDescriptionFlags") int value) { VkAttachmentDescription2.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 flags(@CType("VkAttachmentDescriptionFlags") int value) { VkAttachmentDescription2.set_flags(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkAttachmentDescription2.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkAttachmentDescription2.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkAttachmentDescription2.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkAttachmentDescription2.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 formatAt(long index, @CType("VkFormat") int value) { VkAttachmentDescription2.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 format(@CType("VkFormat") int value) { VkAttachmentDescription2.set_format(this.segment(), value); return this; }

    /// {@return `samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_samples(MemorySegment segment, long index) { return (int) VH_samples.get(segment, 0L, index); }
    /// {@return `samples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_samples(MemorySegment segment) { return VkAttachmentDescription2.get_samples(segment, 0L); }
    /// {@return `samples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlagBits") int samplesAt(long index) { return VkAttachmentDescription2.get_samples(this.segment(), index); }
    /// {@return `samples`}
    public @CType("VkSampleCountFlagBits") int samples() { return VkAttachmentDescription2.get_samples(this.segment()); }
    /// Sets `samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_samples.set(segment, 0L, index, value); }
    /// Sets `samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkAttachmentDescription2.set_samples(segment, 0L, value); }
    /// Sets `samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 samplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkAttachmentDescription2.set_samples(this.segment(), index, value); return this; }
    /// Sets `samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 samples(@CType("VkSampleCountFlagBits") int value) { VkAttachmentDescription2.set_samples(this.segment(), value); return this; }

    /// {@return `loadOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentLoadOp") int get_loadOp(MemorySegment segment, long index) { return (int) VH_loadOp.get(segment, 0L, index); }
    /// {@return `loadOp`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentLoadOp") int get_loadOp(MemorySegment segment) { return VkAttachmentDescription2.get_loadOp(segment, 0L); }
    /// {@return `loadOp` at the given index}
    /// @param index the index
    public @CType("VkAttachmentLoadOp") int loadOpAt(long index) { return VkAttachmentDescription2.get_loadOp(this.segment(), index); }
    /// {@return `loadOp`}
    public @CType("VkAttachmentLoadOp") int loadOp() { return VkAttachmentDescription2.get_loadOp(this.segment()); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_loadOp(MemorySegment segment, long index, @CType("VkAttachmentLoadOp") int value) { VH_loadOp.set(segment, 0L, index, value); }
    /// Sets `loadOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_loadOp(MemorySegment segment, @CType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.set_loadOp(segment, 0L, value); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 loadOpAt(long index, @CType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.set_loadOp(this.segment(), index, value); return this; }
    /// Sets `loadOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 loadOp(@CType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.set_loadOp(this.segment(), value); return this; }

    /// {@return `storeOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentStoreOp") int get_storeOp(MemorySegment segment, long index) { return (int) VH_storeOp.get(segment, 0L, index); }
    /// {@return `storeOp`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentStoreOp") int get_storeOp(MemorySegment segment) { return VkAttachmentDescription2.get_storeOp(segment, 0L); }
    /// {@return `storeOp` at the given index}
    /// @param index the index
    public @CType("VkAttachmentStoreOp") int storeOpAt(long index) { return VkAttachmentDescription2.get_storeOp(this.segment(), index); }
    /// {@return `storeOp`}
    public @CType("VkAttachmentStoreOp") int storeOp() { return VkAttachmentDescription2.get_storeOp(this.segment()); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storeOp(MemorySegment segment, long index, @CType("VkAttachmentStoreOp") int value) { VH_storeOp.set(segment, 0L, index, value); }
    /// Sets `storeOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storeOp(MemorySegment segment, @CType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.set_storeOp(segment, 0L, value); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 storeOpAt(long index, @CType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.set_storeOp(this.segment(), index, value); return this; }
    /// Sets `storeOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 storeOp(@CType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.set_storeOp(this.segment(), value); return this; }

    /// {@return `stencilLoadOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentLoadOp") int get_stencilLoadOp(MemorySegment segment, long index) { return (int) VH_stencilLoadOp.get(segment, 0L, index); }
    /// {@return `stencilLoadOp`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentLoadOp") int get_stencilLoadOp(MemorySegment segment) { return VkAttachmentDescription2.get_stencilLoadOp(segment, 0L); }
    /// {@return `stencilLoadOp` at the given index}
    /// @param index the index
    public @CType("VkAttachmentLoadOp") int stencilLoadOpAt(long index) { return VkAttachmentDescription2.get_stencilLoadOp(this.segment(), index); }
    /// {@return `stencilLoadOp`}
    public @CType("VkAttachmentLoadOp") int stencilLoadOp() { return VkAttachmentDescription2.get_stencilLoadOp(this.segment()); }
    /// Sets `stencilLoadOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilLoadOp(MemorySegment segment, long index, @CType("VkAttachmentLoadOp") int value) { VH_stencilLoadOp.set(segment, 0L, index, value); }
    /// Sets `stencilLoadOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilLoadOp(MemorySegment segment, @CType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.set_stencilLoadOp(segment, 0L, value); }
    /// Sets `stencilLoadOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilLoadOpAt(long index, @CType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.set_stencilLoadOp(this.segment(), index, value); return this; }
    /// Sets `stencilLoadOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilLoadOp(@CType("VkAttachmentLoadOp") int value) { VkAttachmentDescription2.set_stencilLoadOp(this.segment(), value); return this; }

    /// {@return `stencilStoreOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAttachmentStoreOp") int get_stencilStoreOp(MemorySegment segment, long index) { return (int) VH_stencilStoreOp.get(segment, 0L, index); }
    /// {@return `stencilStoreOp`}
    /// @param segment the segment of the struct
    public static @CType("VkAttachmentStoreOp") int get_stencilStoreOp(MemorySegment segment) { return VkAttachmentDescription2.get_stencilStoreOp(segment, 0L); }
    /// {@return `stencilStoreOp` at the given index}
    /// @param index the index
    public @CType("VkAttachmentStoreOp") int stencilStoreOpAt(long index) { return VkAttachmentDescription2.get_stencilStoreOp(this.segment(), index); }
    /// {@return `stencilStoreOp`}
    public @CType("VkAttachmentStoreOp") int stencilStoreOp() { return VkAttachmentDescription2.get_stencilStoreOp(this.segment()); }
    /// Sets `stencilStoreOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilStoreOp(MemorySegment segment, long index, @CType("VkAttachmentStoreOp") int value) { VH_stencilStoreOp.set(segment, 0L, index, value); }
    /// Sets `stencilStoreOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilStoreOp(MemorySegment segment, @CType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.set_stencilStoreOp(segment, 0L, value); }
    /// Sets `stencilStoreOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilStoreOpAt(long index, @CType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.set_stencilStoreOp(this.segment(), index, value); return this; }
    /// Sets `stencilStoreOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilStoreOp(@CType("VkAttachmentStoreOp") int value) { VkAttachmentDescription2.set_stencilStoreOp(this.segment(), value); return this; }

    /// {@return `initialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_initialLayout(MemorySegment segment, long index) { return (int) VH_initialLayout.get(segment, 0L, index); }
    /// {@return `initialLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_initialLayout(MemorySegment segment) { return VkAttachmentDescription2.get_initialLayout(segment, 0L); }
    /// {@return `initialLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int initialLayoutAt(long index) { return VkAttachmentDescription2.get_initialLayout(this.segment(), index); }
    /// {@return `initialLayout`}
    public @CType("VkImageLayout") int initialLayout() { return VkAttachmentDescription2.get_initialLayout(this.segment()); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_initialLayout.set(segment, 0L, index, value); }
    /// Sets `initialLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkAttachmentDescription2.set_initialLayout(segment, 0L, value); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 initialLayoutAt(long index, @CType("VkImageLayout") int value) { VkAttachmentDescription2.set_initialLayout(this.segment(), index, value); return this; }
    /// Sets `initialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 initialLayout(@CType("VkImageLayout") int value) { VkAttachmentDescription2.set_initialLayout(this.segment(), value); return this; }

    /// {@return `finalLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_finalLayout(MemorySegment segment, long index) { return (int) VH_finalLayout.get(segment, 0L, index); }
    /// {@return `finalLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_finalLayout(MemorySegment segment) { return VkAttachmentDescription2.get_finalLayout(segment, 0L); }
    /// {@return `finalLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int finalLayoutAt(long index) { return VkAttachmentDescription2.get_finalLayout(this.segment(), index); }
    /// {@return `finalLayout`}
    public @CType("VkImageLayout") int finalLayout() { return VkAttachmentDescription2.get_finalLayout(this.segment()); }
    /// Sets `finalLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_finalLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_finalLayout.set(segment, 0L, index, value); }
    /// Sets `finalLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_finalLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkAttachmentDescription2.set_finalLayout(segment, 0L, value); }
    /// Sets `finalLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 finalLayoutAt(long index, @CType("VkImageLayout") int value) { VkAttachmentDescription2.set_finalLayout(this.segment(), index, value); return this; }
    /// Sets `finalLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 finalLayout(@CType("VkImageLayout") int value) { VkAttachmentDescription2.set_finalLayout(this.segment(), value); return this; }

}
