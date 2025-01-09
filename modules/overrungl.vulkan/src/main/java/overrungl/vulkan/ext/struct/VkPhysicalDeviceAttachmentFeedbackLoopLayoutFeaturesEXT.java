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
/// ### attachmentFeedbackLoopLayout
/// [VarHandle][#VH_attachmentFeedbackLoopLayout] - [Getter][#attachmentFeedbackLoopLayout()] - [Setter][#attachmentFeedbackLoopLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 attachmentFeedbackLoopLayout;
/// } VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT;
/// ```
public final class VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentFeedbackLoopLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `attachmentFeedbackLoopLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentFeedbackLoopLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentFeedbackLoopLayout"));

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment); }

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT`
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `attachmentFeedbackLoopLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_attachmentFeedbackLoopLayout(MemorySegment segment, long index) { return (int) VH_attachmentFeedbackLoopLayout.get(segment, 0L, index); }
    /// {@return `attachmentFeedbackLoopLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_attachmentFeedbackLoopLayout(MemorySegment segment) { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_attachmentFeedbackLoopLayout(segment, 0L); }
    /// {@return `attachmentFeedbackLoopLayout` at the given index}
    /// @param index the index
    public @CType("VkBool32") int attachmentFeedbackLoopLayoutAt(long index) { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_attachmentFeedbackLoopLayout(this.segment(), index); }
    /// {@return `attachmentFeedbackLoopLayout`}
    public @CType("VkBool32") int attachmentFeedbackLoopLayout() { return VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.get_attachmentFeedbackLoopLayout(this.segment()); }
    /// Sets `attachmentFeedbackLoopLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentFeedbackLoopLayout(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_attachmentFeedbackLoopLayout.set(segment, 0L, index, value); }
    /// Sets `attachmentFeedbackLoopLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentFeedbackLoopLayout(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_attachmentFeedbackLoopLayout(segment, 0L, value); }
    /// Sets `attachmentFeedbackLoopLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayoutAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_attachmentFeedbackLoopLayout(this.segment(), index, value); return this; }
    /// Sets `attachmentFeedbackLoopLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayout(@CType("VkBool32") int value) { VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT.set_attachmentFeedbackLoopLayout(this.segment(), value); return this; }

}
