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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAttachmentDescription2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkAttachmentDescriptionFlags flags;
///     (int) VkFormat format;
///     (int) VkSampleCountFlagBits samples;
///     (int) VkAttachmentLoadOp loadOp;
///     (int) VkAttachmentStoreOp storeOp;
///     (int) VkAttachmentLoadOp stencilLoadOp;
///     (int) VkAttachmentStoreOp stencilStoreOp;
///     (int) VkImageLayout initialLayout;
///     (int) VkImageLayout finalLayout;
/// };
/// ```
public final class VkAttachmentDescription2 extends GroupType {
    /// The struct layout of `VkAttachmentDescription2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `samples`.
    public static final long OFFSET_samples = LAYOUT.byteOffset(PathElement.groupElement("samples"));
    /// The memory layout of `samples`.
    public static final MemoryLayout LAYOUT_samples = LAYOUT.select(PathElement.groupElement("samples"));
    /// The [VarHandle] of `samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    /// The byte offset of `loadOp`.
    public static final long OFFSET_loadOp = LAYOUT.byteOffset(PathElement.groupElement("loadOp"));
    /// The memory layout of `loadOp`.
    public static final MemoryLayout LAYOUT_loadOp = LAYOUT.select(PathElement.groupElement("loadOp"));
    /// The [VarHandle] of `loadOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_loadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loadOp"));
    /// The byte offset of `storeOp`.
    public static final long OFFSET_storeOp = LAYOUT.byteOffset(PathElement.groupElement("storeOp"));
    /// The memory layout of `storeOp`.
    public static final MemoryLayout LAYOUT_storeOp = LAYOUT.select(PathElement.groupElement("storeOp"));
    /// The [VarHandle] of `storeOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_storeOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storeOp"));
    /// The byte offset of `stencilLoadOp`.
    public static final long OFFSET_stencilLoadOp = LAYOUT.byteOffset(PathElement.groupElement("stencilLoadOp"));
    /// The memory layout of `stencilLoadOp`.
    public static final MemoryLayout LAYOUT_stencilLoadOp = LAYOUT.select(PathElement.groupElement("stencilLoadOp"));
    /// The [VarHandle] of `stencilLoadOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilLoadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilLoadOp"));
    /// The byte offset of `stencilStoreOp`.
    public static final long OFFSET_stencilStoreOp = LAYOUT.byteOffset(PathElement.groupElement("stencilStoreOp"));
    /// The memory layout of `stencilStoreOp`.
    public static final MemoryLayout LAYOUT_stencilStoreOp = LAYOUT.select(PathElement.groupElement("stencilStoreOp"));
    /// The [VarHandle] of `stencilStoreOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stencilStoreOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilStoreOp"));
    /// The byte offset of `initialLayout`.
    public static final long OFFSET_initialLayout = LAYOUT.byteOffset(PathElement.groupElement("initialLayout"));
    /// The memory layout of `initialLayout`.
    public static final MemoryLayout LAYOUT_initialLayout = LAYOUT.select(PathElement.groupElement("initialLayout"));
    /// The [VarHandle] of `initialLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialLayout"));
    /// The byte offset of `finalLayout`.
    public static final long OFFSET_finalLayout = LAYOUT.byteOffset(PathElement.groupElement("finalLayout"));
    /// The memory layout of `finalLayout`.
    public static final MemoryLayout LAYOUT_finalLayout = LAYOUT.select(PathElement.groupElement("finalLayout"));
    /// The [VarHandle] of `finalLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_finalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("finalLayout"));

    /// Creates `VkAttachmentDescription2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAttachmentDescription2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAttachmentDescription2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescription2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescription2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAttachmentDescription2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentDescription2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 alloc(SegmentAllocator allocator) { return new VkAttachmentDescription2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 alloc(SegmentAllocator allocator, long count) { return new VkAttachmentDescription2(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @param stencilLoadOp `stencilLoadOp`
    /// @param stencilStoreOp `stencilStoreOp`
    /// @param initialLayout `initialLayout`
    /// @param finalLayout `finalLayout`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples, int loadOp, int storeOp, int stencilLoadOp, int stencilStoreOp, int initialLayout, int finalLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples).loadOp(loadOp).storeOp(storeOp).stencilLoadOp(stencilLoadOp).stencilStoreOp(stencilStoreOp).initialLayout(initialLayout).finalLayout(finalLayout);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @param stencilLoadOp `stencilLoadOp`
    /// @param stencilStoreOp `stencilStoreOp`
    /// @param initialLayout `initialLayout`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples, int loadOp, int storeOp, int stencilLoadOp, int stencilStoreOp, int initialLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples).loadOp(loadOp).storeOp(storeOp).stencilLoadOp(stencilLoadOp).stencilStoreOp(stencilStoreOp).initialLayout(initialLayout);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @param stencilLoadOp `stencilLoadOp`
    /// @param stencilStoreOp `stencilStoreOp`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples, int loadOp, int storeOp, int stencilLoadOp, int stencilStoreOp) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples).loadOp(loadOp).storeOp(storeOp).stencilLoadOp(stencilLoadOp).stencilStoreOp(stencilStoreOp);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @param stencilLoadOp `stencilLoadOp`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples, int loadOp, int storeOp, int stencilLoadOp) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples).loadOp(loadOp).storeOp(storeOp).stencilLoadOp(stencilLoadOp);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples, int loadOp, int storeOp) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples).loadOp(loadOp).storeOp(storeOp);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @param loadOp `loadOp`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples, int loadOp) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples).loadOp(loadOp);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @param samples `samples`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format, int samples) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format).samples(samples);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param format `format`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).format(format);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAttachmentDescription2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAttachmentDescription2`
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentDescription2 copyFrom(VkAttachmentDescription2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAttachmentDescription2 reinterpret(long count) { return new VkAttachmentDescription2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAttachmentDescription2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAttachmentDescription2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkAttachmentDescription2 flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samples(MemorySegment segment, long index) { return (int) VH_samples.get(segment, 0L, index); }
    /// {@return `samples`}
    public int samples() { return samples(this.segment(), 0L); }
    /// Sets `samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samples(MemorySegment segment, long index, int value) { VH_samples.set(segment, 0L, index, value); }
    /// Sets `samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 samples(int value) { samples(this.segment(), 0L, value); return this; }

    /// {@return `loadOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int loadOp(MemorySegment segment, long index) { return (int) VH_loadOp.get(segment, 0L, index); }
    /// {@return `loadOp`}
    public int loadOp() { return loadOp(this.segment(), 0L); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void loadOp(MemorySegment segment, long index, int value) { VH_loadOp.set(segment, 0L, index, value); }
    /// Sets `loadOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 loadOp(int value) { loadOp(this.segment(), 0L, value); return this; }

    /// {@return `storeOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storeOp(MemorySegment segment, long index) { return (int) VH_storeOp.get(segment, 0L, index); }
    /// {@return `storeOp`}
    public int storeOp() { return storeOp(this.segment(), 0L); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storeOp(MemorySegment segment, long index, int value) { VH_storeOp.set(segment, 0L, index, value); }
    /// Sets `storeOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 storeOp(int value) { storeOp(this.segment(), 0L, value); return this; }

    /// {@return `stencilLoadOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilLoadOp(MemorySegment segment, long index) { return (int) VH_stencilLoadOp.get(segment, 0L, index); }
    /// {@return `stencilLoadOp`}
    public int stencilLoadOp() { return stencilLoadOp(this.segment(), 0L); }
    /// Sets `stencilLoadOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilLoadOp(MemorySegment segment, long index, int value) { VH_stencilLoadOp.set(segment, 0L, index, value); }
    /// Sets `stencilLoadOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilLoadOp(int value) { stencilLoadOp(this.segment(), 0L, value); return this; }

    /// {@return `stencilStoreOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stencilStoreOp(MemorySegment segment, long index) { return (int) VH_stencilStoreOp.get(segment, 0L, index); }
    /// {@return `stencilStoreOp`}
    public int stencilStoreOp() { return stencilStoreOp(this.segment(), 0L); }
    /// Sets `stencilStoreOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stencilStoreOp(MemorySegment segment, long index, int value) { VH_stencilStoreOp.set(segment, 0L, index, value); }
    /// Sets `stencilStoreOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilStoreOp(int value) { stencilStoreOp(this.segment(), 0L, value); return this; }

    /// {@return `initialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int initialLayout(MemorySegment segment, long index) { return (int) VH_initialLayout.get(segment, 0L, index); }
    /// {@return `initialLayout`}
    public int initialLayout() { return initialLayout(this.segment(), 0L); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialLayout(MemorySegment segment, long index, int value) { VH_initialLayout.set(segment, 0L, index, value); }
    /// Sets `initialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 initialLayout(int value) { initialLayout(this.segment(), 0L, value); return this; }

    /// {@return `finalLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int finalLayout(MemorySegment segment, long index) { return (int) VH_finalLayout.get(segment, 0L, index); }
    /// {@return `finalLayout`}
    public int finalLayout() { return finalLayout(this.segment(), 0L); }
    /// Sets `finalLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void finalLayout(MemorySegment segment, long index, int value) { VH_finalLayout.set(segment, 0L, index, value); }
    /// Sets `finalLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 finalLayout(int value) { finalLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAttachmentDescription2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAttachmentDescription2`
    public VkAttachmentDescription2 asSlice(long index) { return new VkAttachmentDescription2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAttachmentDescription2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAttachmentDescription2`
    public VkAttachmentDescription2 asSlice(long index, long count) { return new VkAttachmentDescription2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAttachmentDescription2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAttachmentDescription2 at(long index, Consumer<VkAttachmentDescription2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `samples` at the given index}
    /// @param index the index of the struct buffer
    public int samplesAt(long index) { return samples(this.segment(), index); }
    /// Sets `samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 samplesAt(long index, int value) { samples(this.segment(), index, value); return this; }

    /// {@return `loadOp` at the given index}
    /// @param index the index of the struct buffer
    public int loadOpAt(long index) { return loadOp(this.segment(), index); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 loadOpAt(long index, int value) { loadOp(this.segment(), index, value); return this; }

    /// {@return `storeOp` at the given index}
    /// @param index the index of the struct buffer
    public int storeOpAt(long index) { return storeOp(this.segment(), index); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 storeOpAt(long index, int value) { storeOp(this.segment(), index, value); return this; }

    /// {@return `stencilLoadOp` at the given index}
    /// @param index the index of the struct buffer
    public int stencilLoadOpAt(long index) { return stencilLoadOp(this.segment(), index); }
    /// Sets `stencilLoadOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilLoadOpAt(long index, int value) { stencilLoadOp(this.segment(), index, value); return this; }

    /// {@return `stencilStoreOp` at the given index}
    /// @param index the index of the struct buffer
    public int stencilStoreOpAt(long index) { return stencilStoreOp(this.segment(), index); }
    /// Sets `stencilStoreOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 stencilStoreOpAt(long index, int value) { stencilStoreOp(this.segment(), index, value); return this; }

    /// {@return `initialLayout` at the given index}
    /// @param index the index of the struct buffer
    public int initialLayoutAt(long index) { return initialLayout(this.segment(), index); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 initialLayoutAt(long index, int value) { initialLayout(this.segment(), index, value); return this; }

    /// {@return `finalLayout` at the given index}
    /// @param index the index of the struct buffer
    public int finalLayoutAt(long index) { return finalLayout(this.segment(), index); }
    /// Sets `finalLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAttachmentDescription2 finalLayoutAt(long index, int value) { finalLayout(this.segment(), index, value); return this; }

}
