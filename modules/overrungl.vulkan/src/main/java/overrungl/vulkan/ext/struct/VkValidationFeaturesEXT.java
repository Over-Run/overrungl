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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### enabledValidationFeatureCount
/// [VarHandle][#VH_enabledValidationFeatureCount] - [Getter][#enabledValidationFeatureCount()] - [Setter][#enabledValidationFeatureCount(int)]
/// ### pEnabledValidationFeatures
/// [VarHandle][#VH_pEnabledValidationFeatures] - [Getter][#pEnabledValidationFeatures()] - [Setter][#pEnabledValidationFeatures(MemorySegment)]
/// ### disabledValidationFeatureCount
/// [VarHandle][#VH_disabledValidationFeatureCount] - [Getter][#disabledValidationFeatureCount()] - [Setter][#disabledValidationFeatureCount(int)]
/// ### pDisabledValidationFeatures
/// [VarHandle][#VH_pDisabledValidationFeatures] - [Getter][#pDisabledValidationFeatures()] - [Setter][#pDisabledValidationFeatures(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkValidationFeaturesEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t enabledValidationFeatureCount;
///     const VkValidationFeatureEnableEXT * pEnabledValidationFeatures;
///     uint32_t disabledValidationFeatureCount;
///     const VkValidationFeatureDisableEXT * pDisabledValidationFeatures;
/// } VkValidationFeaturesEXT;
/// ```
public sealed class VkValidationFeaturesEXT extends Struct {
    /// The struct layout of `VkValidationFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withName("pEnabledValidationFeatures"),
        ValueLayout.JAVA_INT.withName("disabledValidationFeatureCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationFeatures")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `enabledValidationFeatureCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_enabledValidationFeatureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("enabledValidationFeatureCount"));
    /// The [VarHandle] of `pEnabledValidationFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pEnabledValidationFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEnabledValidationFeatures"));
    /// The [VarHandle] of `disabledValidationFeatureCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_disabledValidationFeatureCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationFeatureCount"));
    /// The [VarHandle] of `pDisabledValidationFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDisabledValidationFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationFeatures"));

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    public VkValidationFeaturesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFeaturesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationFeaturesEXT(segment); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFeaturesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkValidationFeaturesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkValidationFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkValidationFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationFeaturesEXT`
    public static VkValidationFeaturesEXT alloc(SegmentAllocator allocator) { return new VkValidationFeaturesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkValidationFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkValidationFeaturesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkValidationFeaturesEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationFeaturesEXT`
    public static VkValidationFeaturesEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int enabledValidationFeatureCount, @CType("const VkValidationFeatureEnableEXT *") MemorySegment pEnabledValidationFeatures, @CType("uint32_t") int disabledValidationFeatureCount, @CType("const VkValidationFeatureDisableEXT *") MemorySegment pDisabledValidationFeatures) { return alloc(allocator).sType(sType).pNext(pNext).enabledValidationFeatureCount(enabledValidationFeatureCount).pEnabledValidationFeatures(pEnabledValidationFeatures).disabledValidationFeatureCount(disabledValidationFeatureCount).pDisabledValidationFeatures(pDisabledValidationFeatures); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkValidationFeaturesEXT copyFrom(VkValidationFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkValidationFeaturesEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkValidationFeaturesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkValidationFeaturesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT sType(@CType("VkStructureType") int value) { VkValidationFeaturesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkValidationFeaturesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkValidationFeaturesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkValidationFeaturesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT pNext(@CType("const void *") MemorySegment value) { VkValidationFeaturesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `enabledValidationFeatureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_enabledValidationFeatureCount(MemorySegment segment, long index) { return (int) VH_enabledValidationFeatureCount.get(segment, 0L, index); }
    /// {@return `enabledValidationFeatureCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_enabledValidationFeatureCount(MemorySegment segment) { return VkValidationFeaturesEXT.get_enabledValidationFeatureCount(segment, 0L); }
    /// {@return `enabledValidationFeatureCount`}
    public @CType("uint32_t") int enabledValidationFeatureCount() { return VkValidationFeaturesEXT.get_enabledValidationFeatureCount(this.segment()); }
    /// Sets `enabledValidationFeatureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_enabledValidationFeatureCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_enabledValidationFeatureCount.set(segment, 0L, index, value); }
    /// Sets `enabledValidationFeatureCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_enabledValidationFeatureCount(MemorySegment segment, @CType("uint32_t") int value) { VkValidationFeaturesEXT.set_enabledValidationFeatureCount(segment, 0L, value); }
    /// Sets `enabledValidationFeatureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT enabledValidationFeatureCount(@CType("uint32_t") int value) { VkValidationFeaturesEXT.set_enabledValidationFeatureCount(this.segment(), value); return this; }

    /// {@return `pEnabledValidationFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkValidationFeatureEnableEXT *") MemorySegment get_pEnabledValidationFeatures(MemorySegment segment, long index) { return (MemorySegment) VH_pEnabledValidationFeatures.get(segment, 0L, index); }
    /// {@return `pEnabledValidationFeatures`}
    /// @param segment the segment of the struct
    public static @CType("const VkValidationFeatureEnableEXT *") MemorySegment get_pEnabledValidationFeatures(MemorySegment segment) { return VkValidationFeaturesEXT.get_pEnabledValidationFeatures(segment, 0L); }
    /// {@return `pEnabledValidationFeatures`}
    public @CType("const VkValidationFeatureEnableEXT *") MemorySegment pEnabledValidationFeatures() { return VkValidationFeaturesEXT.get_pEnabledValidationFeatures(this.segment()); }
    /// Sets `pEnabledValidationFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pEnabledValidationFeatures(MemorySegment segment, long index, @CType("const VkValidationFeatureEnableEXT *") MemorySegment value) { VH_pEnabledValidationFeatures.set(segment, 0L, index, value); }
    /// Sets `pEnabledValidationFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pEnabledValidationFeatures(MemorySegment segment, @CType("const VkValidationFeatureEnableEXT *") MemorySegment value) { VkValidationFeaturesEXT.set_pEnabledValidationFeatures(segment, 0L, value); }
    /// Sets `pEnabledValidationFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT pEnabledValidationFeatures(@CType("const VkValidationFeatureEnableEXT *") MemorySegment value) { VkValidationFeaturesEXT.set_pEnabledValidationFeatures(this.segment(), value); return this; }

    /// {@return `disabledValidationFeatureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_disabledValidationFeatureCount(MemorySegment segment, long index) { return (int) VH_disabledValidationFeatureCount.get(segment, 0L, index); }
    /// {@return `disabledValidationFeatureCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_disabledValidationFeatureCount(MemorySegment segment) { return VkValidationFeaturesEXT.get_disabledValidationFeatureCount(segment, 0L); }
    /// {@return `disabledValidationFeatureCount`}
    public @CType("uint32_t") int disabledValidationFeatureCount() { return VkValidationFeaturesEXT.get_disabledValidationFeatureCount(this.segment()); }
    /// Sets `disabledValidationFeatureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_disabledValidationFeatureCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_disabledValidationFeatureCount.set(segment, 0L, index, value); }
    /// Sets `disabledValidationFeatureCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_disabledValidationFeatureCount(MemorySegment segment, @CType("uint32_t") int value) { VkValidationFeaturesEXT.set_disabledValidationFeatureCount(segment, 0L, value); }
    /// Sets `disabledValidationFeatureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT disabledValidationFeatureCount(@CType("uint32_t") int value) { VkValidationFeaturesEXT.set_disabledValidationFeatureCount(this.segment(), value); return this; }

    /// {@return `pDisabledValidationFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkValidationFeatureDisableEXT *") MemorySegment get_pDisabledValidationFeatures(MemorySegment segment, long index) { return (MemorySegment) VH_pDisabledValidationFeatures.get(segment, 0L, index); }
    /// {@return `pDisabledValidationFeatures`}
    /// @param segment the segment of the struct
    public static @CType("const VkValidationFeatureDisableEXT *") MemorySegment get_pDisabledValidationFeatures(MemorySegment segment) { return VkValidationFeaturesEXT.get_pDisabledValidationFeatures(segment, 0L); }
    /// {@return `pDisabledValidationFeatures`}
    public @CType("const VkValidationFeatureDisableEXT *") MemorySegment pDisabledValidationFeatures() { return VkValidationFeaturesEXT.get_pDisabledValidationFeatures(this.segment()); }
    /// Sets `pDisabledValidationFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDisabledValidationFeatures(MemorySegment segment, long index, @CType("const VkValidationFeatureDisableEXT *") MemorySegment value) { VH_pDisabledValidationFeatures.set(segment, 0L, index, value); }
    /// Sets `pDisabledValidationFeatures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDisabledValidationFeatures(MemorySegment segment, @CType("const VkValidationFeatureDisableEXT *") MemorySegment value) { VkValidationFeaturesEXT.set_pDisabledValidationFeatures(segment, 0L, value); }
    /// Sets `pDisabledValidationFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFeaturesEXT pDisabledValidationFeatures(@CType("const VkValidationFeatureDisableEXT *") MemorySegment value) { VkValidationFeaturesEXT.set_pDisabledValidationFeatures(this.segment(), value); return this; }

    /// A buffer of [VkValidationFeaturesEXT].
    public static final class Buffer extends VkValidationFeaturesEXT {
        private final long elementCount;

        /// Creates `VkValidationFeaturesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkValidationFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkValidationFeaturesEXT`
        public VkValidationFeaturesEXT asSlice(long index) { return new VkValidationFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkValidationFeaturesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkValidationFeaturesEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkValidationFeaturesEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkValidationFeaturesEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkValidationFeaturesEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkValidationFeaturesEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `enabledValidationFeatureCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int enabledValidationFeatureCountAt(long index) { return VkValidationFeaturesEXT.get_enabledValidationFeatureCount(this.segment(), index); }
        /// Sets `enabledValidationFeatureCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer enabledValidationFeatureCountAt(long index, @CType("uint32_t") int value) { VkValidationFeaturesEXT.set_enabledValidationFeatureCount(this.segment(), index, value); return this; }

        /// {@return `pEnabledValidationFeatures` at the given index}
        /// @param index the index
        public @CType("const VkValidationFeatureEnableEXT *") MemorySegment pEnabledValidationFeaturesAt(long index) { return VkValidationFeaturesEXT.get_pEnabledValidationFeatures(this.segment(), index); }
        /// Sets `pEnabledValidationFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pEnabledValidationFeaturesAt(long index, @CType("const VkValidationFeatureEnableEXT *") MemorySegment value) { VkValidationFeaturesEXT.set_pEnabledValidationFeatures(this.segment(), index, value); return this; }

        /// {@return `disabledValidationFeatureCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int disabledValidationFeatureCountAt(long index) { return VkValidationFeaturesEXT.get_disabledValidationFeatureCount(this.segment(), index); }
        /// Sets `disabledValidationFeatureCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer disabledValidationFeatureCountAt(long index, @CType("uint32_t") int value) { VkValidationFeaturesEXT.set_disabledValidationFeatureCount(this.segment(), index, value); return this; }

        /// {@return `pDisabledValidationFeatures` at the given index}
        /// @param index the index
        public @CType("const VkValidationFeatureDisableEXT *") MemorySegment pDisabledValidationFeaturesAt(long index) { return VkValidationFeaturesEXT.get_pDisabledValidationFeatures(this.segment(), index); }
        /// Sets `pDisabledValidationFeatures` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pDisabledValidationFeaturesAt(long index, @CType("const VkValidationFeatureDisableEXT *") MemorySegment value) { VkValidationFeaturesEXT.set_pDisabledValidationFeatures(this.segment(), index, value); return this; }

    }
}
