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
/// struct VkRenderingAttachmentInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImageView imageView;
///     (int) VkImageLayout imageLayout;
///     (int) VkResolveModeFlagBits resolveMode;
///     (uint64_t) VkImageView resolveImageView;
///     (int) VkImageLayout resolveImageLayout;
///     (int) VkAttachmentLoadOp loadOp;
///     (int) VkAttachmentStoreOp storeOp;
///     (union VkClearValue) VkClearValue clearValue;
/// };
/// ```
public final class VkRenderingAttachmentInfo extends GroupType {
    /// The struct layout of `VkRenderingAttachmentInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        ValueLayout.JAVA_INT.withName("resolveMode"),
        ValueLayout.JAVA_LONG.withName("resolveImageView"),
        ValueLayout.JAVA_INT.withName("resolveImageLayout"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        overrungl.vulkan.union.VkClearValue.LAYOUT.withName("clearValue")
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
    /// The byte offset of `imageView`.
    public static final long OFFSET_imageView = LAYOUT.byteOffset(PathElement.groupElement("imageView"));
    /// The memory layout of `imageView`.
    public static final MemoryLayout LAYOUT_imageView = LAYOUT.select(PathElement.groupElement("imageView"));
    /// The [VarHandle] of `imageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageView"));
    /// The byte offset of `imageLayout`.
    public static final long OFFSET_imageLayout = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
    /// The memory layout of `imageLayout`.
    public static final MemoryLayout LAYOUT_imageLayout = LAYOUT.select(PathElement.groupElement("imageLayout"));
    /// The [VarHandle] of `imageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageLayout"));
    /// The byte offset of `resolveMode`.
    public static final long OFFSET_resolveMode = LAYOUT.byteOffset(PathElement.groupElement("resolveMode"));
    /// The memory layout of `resolveMode`.
    public static final MemoryLayout LAYOUT_resolveMode = LAYOUT.select(PathElement.groupElement("resolveMode"));
    /// The [VarHandle] of `resolveMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_resolveMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveMode"));
    /// The byte offset of `resolveImageView`.
    public static final long OFFSET_resolveImageView = LAYOUT.byteOffset(PathElement.groupElement("resolveImageView"));
    /// The memory layout of `resolveImageView`.
    public static final MemoryLayout LAYOUT_resolveImageView = LAYOUT.select(PathElement.groupElement("resolveImageView"));
    /// The [VarHandle] of `resolveImageView` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_resolveImageView = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveImageView"));
    /// The byte offset of `resolveImageLayout`.
    public static final long OFFSET_resolveImageLayout = LAYOUT.byteOffset(PathElement.groupElement("resolveImageLayout"));
    /// The memory layout of `resolveImageLayout`.
    public static final MemoryLayout LAYOUT_resolveImageLayout = LAYOUT.select(PathElement.groupElement("resolveImageLayout"));
    /// The [VarHandle] of `resolveImageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_resolveImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resolveImageLayout"));
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
    /// The byte offset of `clearValue`.
    public static final long OFFSET_clearValue = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
    /// The memory layout of `clearValue`.
    public static final MemoryLayout LAYOUT_clearValue = LAYOUT.select(PathElement.groupElement("clearValue"));

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderingAttachmentInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderingAttachmentInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderingAttachmentInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderingAttachmentInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo alloc(SegmentAllocator allocator) { return new VkRenderingAttachmentInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo alloc(SegmentAllocator allocator, long count) { return new VkRenderingAttachmentInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param resolveMode `resolveMode`
    /// @param resolveImageView `resolveImageView`
    /// @param resolveImageLayout `resolveImageLayout`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @param clearValue `clearValue`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView, int resolveImageLayout, int loadOp, int storeOp, MemorySegment clearValue) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).resolveMode(resolveMode).resolveImageView(resolveImageView).resolveImageLayout(resolveImageLayout).loadOp(loadOp).storeOp(storeOp).clearValue(clearValue);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param resolveMode `resolveMode`
    /// @param resolveImageView `resolveImageView`
    /// @param resolveImageLayout `resolveImageLayout`
    /// @param loadOp `loadOp`
    /// @param storeOp `storeOp`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView, int resolveImageLayout, int loadOp, int storeOp) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).resolveMode(resolveMode).resolveImageView(resolveImageView).resolveImageLayout(resolveImageLayout).loadOp(loadOp).storeOp(storeOp);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param resolveMode `resolveMode`
    /// @param resolveImageView `resolveImageView`
    /// @param resolveImageLayout `resolveImageLayout`
    /// @param loadOp `loadOp`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView, int resolveImageLayout, int loadOp) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).resolveMode(resolveMode).resolveImageView(resolveImageView).resolveImageLayout(resolveImageLayout).loadOp(loadOp);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param resolveMode `resolveMode`
    /// @param resolveImageView `resolveImageView`
    /// @param resolveImageLayout `resolveImageLayout`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView, int resolveImageLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).resolveMode(resolveMode).resolveImageView(resolveImageView).resolveImageLayout(resolveImageLayout);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param resolveMode `resolveMode`
    /// @param resolveImageView `resolveImageView`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, int resolveMode, long resolveImageView) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).resolveMode(resolveMode).resolveImageView(resolveImageView);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @param resolveMode `resolveMode`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout, int resolveMode) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout).resolveMode(resolveMode);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @param imageLayout `imageLayout`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView, int imageLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView).imageLayout(imageLayout);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageView `imageView`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long imageView) {
        return alloc(allocator).sType(sType).pNext(pNext).imageView(imageView);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkRenderingAttachmentInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkRenderingAttachmentInfo`
    public static VkRenderingAttachmentInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderingAttachmentInfo copyFrom(VkRenderingAttachmentInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderingAttachmentInfo reinterpret(long count) { return new VkRenderingAttachmentInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderingAttachmentInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderingAttachmentInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long imageView(MemorySegment segment, long index) { return (long) VH_imageView.get(segment, 0L, index); }
    /// {@return `imageView`}
    public long imageView() { return imageView(this.segment(), 0L); }
    /// Sets `imageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageView(MemorySegment segment, long index, long value) { VH_imageView.set(segment, 0L, index, value); }
    /// Sets `imageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageView(long value) { imageView(this.segment(), 0L, value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageLayout(MemorySegment segment, long index) { return (int) VH_imageLayout.get(segment, 0L, index); }
    /// {@return `imageLayout`}
    public int imageLayout() { return imageLayout(this.segment(), 0L); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageLayout(MemorySegment segment, long index, int value) { VH_imageLayout.set(segment, 0L, index, value); }
    /// Sets `imageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageLayout(int value) { imageLayout(this.segment(), 0L, value); return this; }

    /// {@return `resolveMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int resolveMode(MemorySegment segment, long index) { return (int) VH_resolveMode.get(segment, 0L, index); }
    /// {@return `resolveMode`}
    public int resolveMode() { return resolveMode(this.segment(), 0L); }
    /// Sets `resolveMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resolveMode(MemorySegment segment, long index, int value) { VH_resolveMode.set(segment, 0L, index, value); }
    /// Sets `resolveMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveMode(int value) { resolveMode(this.segment(), 0L, value); return this; }

    /// {@return `resolveImageView` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long resolveImageView(MemorySegment segment, long index) { return (long) VH_resolveImageView.get(segment, 0L, index); }
    /// {@return `resolveImageView`}
    public long resolveImageView() { return resolveImageView(this.segment(), 0L); }
    /// Sets `resolveImageView` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resolveImageView(MemorySegment segment, long index, long value) { VH_resolveImageView.set(segment, 0L, index, value); }
    /// Sets `resolveImageView` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageView(long value) { resolveImageView(this.segment(), 0L, value); return this; }

    /// {@return `resolveImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int resolveImageLayout(MemorySegment segment, long index) { return (int) VH_resolveImageLayout.get(segment, 0L, index); }
    /// {@return `resolveImageLayout`}
    public int resolveImageLayout() { return resolveImageLayout(this.segment(), 0L); }
    /// Sets `resolveImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void resolveImageLayout(MemorySegment segment, long index, int value) { VH_resolveImageLayout.set(segment, 0L, index, value); }
    /// Sets `resolveImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageLayout(int value) { resolveImageLayout(this.segment(), 0L, value); return this; }

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
    public VkRenderingAttachmentInfo loadOp(int value) { loadOp(this.segment(), 0L, value); return this; }

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
    public VkRenderingAttachmentInfo storeOp(int value) { storeOp(this.segment(), 0L, value); return this; }

    /// {@return `clearValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment clearValue(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_clearValue, index), LAYOUT_clearValue); }
    /// {@return `clearValue`}
    public MemorySegment clearValue() { return clearValue(this.segment(), 0L); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clearValue(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_clearValue, index), LAYOUT_clearValue.byteSize()); }
    /// Sets `clearValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo clearValue(MemorySegment value) { clearValue(this.segment(), 0L, value); return this; }
    /// Accepts `clearValue` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRenderingAttachmentInfo clearValue(Consumer<overrungl.vulkan.union.VkClearValue> func) { func.accept(overrungl.vulkan.union.VkClearValue.of(clearValue())); return this; }

    /// Creates a slice of `VkRenderingAttachmentInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderingAttachmentInfo`
    public VkRenderingAttachmentInfo asSlice(long index) { return new VkRenderingAttachmentInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderingAttachmentInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderingAttachmentInfo`
    public VkRenderingAttachmentInfo asSlice(long index, long count) { return new VkRenderingAttachmentInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderingAttachmentInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderingAttachmentInfo at(long index, Consumer<VkRenderingAttachmentInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageView` at the given index}
    /// @param index the index of the struct buffer
    public long imageViewAt(long index) { return imageView(this.segment(), index); }
    /// Sets `imageView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageViewAt(long index, long value) { imageView(this.segment(), index, value); return this; }

    /// {@return `imageLayout` at the given index}
    /// @param index the index of the struct buffer
    public int imageLayoutAt(long index) { return imageLayout(this.segment(), index); }
    /// Sets `imageLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo imageLayoutAt(long index, int value) { imageLayout(this.segment(), index, value); return this; }

    /// {@return `resolveMode` at the given index}
    /// @param index the index of the struct buffer
    public int resolveModeAt(long index) { return resolveMode(this.segment(), index); }
    /// Sets `resolveMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveModeAt(long index, int value) { resolveMode(this.segment(), index, value); return this; }

    /// {@return `resolveImageView` at the given index}
    /// @param index the index of the struct buffer
    public long resolveImageViewAt(long index) { return resolveImageView(this.segment(), index); }
    /// Sets `resolveImageView` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageViewAt(long index, long value) { resolveImageView(this.segment(), index, value); return this; }

    /// {@return `resolveImageLayout` at the given index}
    /// @param index the index of the struct buffer
    public int resolveImageLayoutAt(long index) { return resolveImageLayout(this.segment(), index); }
    /// Sets `resolveImageLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo resolveImageLayoutAt(long index, int value) { resolveImageLayout(this.segment(), index, value); return this; }

    /// {@return `loadOp` at the given index}
    /// @param index the index of the struct buffer
    public int loadOpAt(long index) { return loadOp(this.segment(), index); }
    /// Sets `loadOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo loadOpAt(long index, int value) { loadOp(this.segment(), index, value); return this; }

    /// {@return `storeOp` at the given index}
    /// @param index the index of the struct buffer
    public int storeOpAt(long index) { return storeOp(this.segment(), index); }
    /// Sets `storeOp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo storeOpAt(long index, int value) { storeOp(this.segment(), index, value); return this; }

    /// {@return `clearValue` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment clearValueAt(long index) { return clearValue(this.segment(), index); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderingAttachmentInfo clearValueAt(long index, MemorySegment value) { clearValue(this.segment(), index, value); return this; }
    /// Accepts `clearValue` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRenderingAttachmentInfo clearValueAt(long index, Consumer<overrungl.vulkan.union.VkClearValue> func) { func.accept(overrungl.vulkan.union.VkClearValue.of(clearValueAt(index))); return this; }

}
