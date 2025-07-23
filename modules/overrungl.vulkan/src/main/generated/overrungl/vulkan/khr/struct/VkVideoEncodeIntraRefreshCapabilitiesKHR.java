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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeIntraRefreshCapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeIntraRefreshModeFlagsKHR intraRefreshModes;
///     uint32_t maxIntraRefreshCycleDuration;
///     uint32_t maxIntraRefreshActiveReferencePictures;
///     (uint32_t) VkBool32 partitionIndependentIntraRefreshRegions;
///     (uint32_t) VkBool32 nonRectangularIntraRefreshRegions;
/// };
/// ```
public final class VkVideoEncodeIntraRefreshCapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeIntraRefreshCapabilitiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("intraRefreshModes"),
        ValueLayout.JAVA_INT.withName("maxIntraRefreshCycleDuration"),
        ValueLayout.JAVA_INT.withName("maxIntraRefreshActiveReferencePictures"),
        ValueLayout.JAVA_INT.withName("partitionIndependentIntraRefreshRegions"),
        ValueLayout.JAVA_INT.withName("nonRectangularIntraRefreshRegions")
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
    /// The byte offset of `intraRefreshModes`.
    public static final long OFFSET_intraRefreshModes = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshModes"));
    /// The memory layout of `intraRefreshModes`.
    public static final MemoryLayout LAYOUT_intraRefreshModes = LAYOUT.select(PathElement.groupElement("intraRefreshModes"));
    /// The [VarHandle] of `intraRefreshModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_intraRefreshModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshModes"));
    /// The byte offset of `maxIntraRefreshCycleDuration`.
    public static final long OFFSET_maxIntraRefreshCycleDuration = LAYOUT.byteOffset(PathElement.groupElement("maxIntraRefreshCycleDuration"));
    /// The memory layout of `maxIntraRefreshCycleDuration`.
    public static final MemoryLayout LAYOUT_maxIntraRefreshCycleDuration = LAYOUT.select(PathElement.groupElement("maxIntraRefreshCycleDuration"));
    /// The [VarHandle] of `maxIntraRefreshCycleDuration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIntraRefreshCycleDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIntraRefreshCycleDuration"));
    /// The byte offset of `maxIntraRefreshActiveReferencePictures`.
    public static final long OFFSET_maxIntraRefreshActiveReferencePictures = LAYOUT.byteOffset(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
    /// The memory layout of `maxIntraRefreshActiveReferencePictures`.
    public static final MemoryLayout LAYOUT_maxIntraRefreshActiveReferencePictures = LAYOUT.select(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
    /// The [VarHandle] of `maxIntraRefreshActiveReferencePictures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxIntraRefreshActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxIntraRefreshActiveReferencePictures"));
    /// The byte offset of `partitionIndependentIntraRefreshRegions`.
    public static final long OFFSET_partitionIndependentIntraRefreshRegions = LAYOUT.byteOffset(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
    /// The memory layout of `partitionIndependentIntraRefreshRegions`.
    public static final MemoryLayout LAYOUT_partitionIndependentIntraRefreshRegions = LAYOUT.select(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
    /// The [VarHandle] of `partitionIndependentIntraRefreshRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_partitionIndependentIntraRefreshRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("partitionIndependentIntraRefreshRegions"));
    /// The byte offset of `nonRectangularIntraRefreshRegions`.
    public static final long OFFSET_nonRectangularIntraRefreshRegions = LAYOUT.byteOffset(PathElement.groupElement("nonRectangularIntraRefreshRegions"));
    /// The memory layout of `nonRectangularIntraRefreshRegions`.
    public static final MemoryLayout LAYOUT_nonRectangularIntraRefreshRegions = LAYOUT.select(PathElement.groupElement("nonRectangularIntraRefreshRegions"));
    /// The [VarHandle] of `nonRectangularIntraRefreshRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nonRectangularIntraRefreshRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonRectangularIntraRefreshRegions"));

    /// Creates `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeIntraRefreshCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param intraRefreshModes `intraRefreshModes`
    /// @param maxIntraRefreshCycleDuration `maxIntraRefreshCycleDuration`
    /// @param maxIntraRefreshActiveReferencePictures `maxIntraRefreshActiveReferencePictures`
    /// @param partitionIndependentIntraRefreshRegions `partitionIndependentIntraRefreshRegions`
    /// @param nonRectangularIntraRefreshRegions `nonRectangularIntraRefreshRegions`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int intraRefreshModes, int maxIntraRefreshCycleDuration, int maxIntraRefreshActiveReferencePictures, int partitionIndependentIntraRefreshRegions, int nonRectangularIntraRefreshRegions) {
        return alloc(allocator).sType(sType).pNext(pNext).intraRefreshModes(intraRefreshModes).maxIntraRefreshCycleDuration(maxIntraRefreshCycleDuration).maxIntraRefreshActiveReferencePictures(maxIntraRefreshActiveReferencePictures).partitionIndependentIntraRefreshRegions(partitionIndependentIntraRefreshRegions).nonRectangularIntraRefreshRegions(nonRectangularIntraRefreshRegions);
    }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param intraRefreshModes `intraRefreshModes`
    /// @param maxIntraRefreshCycleDuration `maxIntraRefreshCycleDuration`
    /// @param maxIntraRefreshActiveReferencePictures `maxIntraRefreshActiveReferencePictures`
    /// @param partitionIndependentIntraRefreshRegions `partitionIndependentIntraRefreshRegions`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int intraRefreshModes, int maxIntraRefreshCycleDuration, int maxIntraRefreshActiveReferencePictures, int partitionIndependentIntraRefreshRegions) {
        return alloc(allocator).sType(sType).pNext(pNext).intraRefreshModes(intraRefreshModes).maxIntraRefreshCycleDuration(maxIntraRefreshCycleDuration).maxIntraRefreshActiveReferencePictures(maxIntraRefreshActiveReferencePictures).partitionIndependentIntraRefreshRegions(partitionIndependentIntraRefreshRegions);
    }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param intraRefreshModes `intraRefreshModes`
    /// @param maxIntraRefreshCycleDuration `maxIntraRefreshCycleDuration`
    /// @param maxIntraRefreshActiveReferencePictures `maxIntraRefreshActiveReferencePictures`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int intraRefreshModes, int maxIntraRefreshCycleDuration, int maxIntraRefreshActiveReferencePictures) {
        return alloc(allocator).sType(sType).pNext(pNext).intraRefreshModes(intraRefreshModes).maxIntraRefreshCycleDuration(maxIntraRefreshCycleDuration).maxIntraRefreshActiveReferencePictures(maxIntraRefreshActiveReferencePictures);
    }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param intraRefreshModes `intraRefreshModes`
    /// @param maxIntraRefreshCycleDuration `maxIntraRefreshCycleDuration`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int intraRefreshModes, int maxIntraRefreshCycleDuration) {
        return alloc(allocator).sType(sType).pNext(pNext).intraRefreshModes(intraRefreshModes).maxIntraRefreshCycleDuration(maxIntraRefreshCycleDuration);
    }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param intraRefreshModes `intraRefreshModes`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int intraRefreshModes) {
        return alloc(allocator).sType(sType).pNext(pNext).intraRefreshModes(intraRefreshModes);
    }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeIntraRefreshCapabilitiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR copyFrom(VkVideoEncodeIntraRefreshCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeIntraRefreshCapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `intraRefreshModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int intraRefreshModes(MemorySegment segment, long index) { return (int) VH_intraRefreshModes.get(segment, 0L, index); }
    /// {@return `intraRefreshModes`}
    public int intraRefreshModes() { return intraRefreshModes(this.segment(), 0L); }
    /// Sets `intraRefreshModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void intraRefreshModes(MemorySegment segment, long index, int value) { VH_intraRefreshModes.set(segment, 0L, index, value); }
    /// Sets `intraRefreshModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR intraRefreshModes(int value) { intraRefreshModes(this.segment(), 0L, value); return this; }

    /// {@return `maxIntraRefreshCycleDuration` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIntraRefreshCycleDuration(MemorySegment segment, long index) { return (int) VH_maxIntraRefreshCycleDuration.get(segment, 0L, index); }
    /// {@return `maxIntraRefreshCycleDuration`}
    public int maxIntraRefreshCycleDuration() { return maxIntraRefreshCycleDuration(this.segment(), 0L); }
    /// Sets `maxIntraRefreshCycleDuration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIntraRefreshCycleDuration(MemorySegment segment, long index, int value) { VH_maxIntraRefreshCycleDuration.set(segment, 0L, index, value); }
    /// Sets `maxIntraRefreshCycleDuration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshCycleDuration(int value) { maxIntraRefreshCycleDuration(this.segment(), 0L, value); return this; }

    /// {@return `maxIntraRefreshActiveReferencePictures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxIntraRefreshActiveReferencePictures(MemorySegment segment, long index) { return (int) VH_maxIntraRefreshActiveReferencePictures.get(segment, 0L, index); }
    /// {@return `maxIntraRefreshActiveReferencePictures`}
    public int maxIntraRefreshActiveReferencePictures() { return maxIntraRefreshActiveReferencePictures(this.segment(), 0L); }
    /// Sets `maxIntraRefreshActiveReferencePictures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxIntraRefreshActiveReferencePictures(MemorySegment segment, long index, int value) { VH_maxIntraRefreshActiveReferencePictures.set(segment, 0L, index, value); }
    /// Sets `maxIntraRefreshActiveReferencePictures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshActiveReferencePictures(int value) { maxIntraRefreshActiveReferencePictures(this.segment(), 0L, value); return this; }

    /// {@return `partitionIndependentIntraRefreshRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int partitionIndependentIntraRefreshRegions(MemorySegment segment, long index) { return (int) VH_partitionIndependentIntraRefreshRegions.get(segment, 0L, index); }
    /// {@return `partitionIndependentIntraRefreshRegions`}
    public int partitionIndependentIntraRefreshRegions() { return partitionIndependentIntraRefreshRegions(this.segment(), 0L); }
    /// Sets `partitionIndependentIntraRefreshRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void partitionIndependentIntraRefreshRegions(MemorySegment segment, long index, int value) { VH_partitionIndependentIntraRefreshRegions.set(segment, 0L, index, value); }
    /// Sets `partitionIndependentIntraRefreshRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR partitionIndependentIntraRefreshRegions(int value) { partitionIndependentIntraRefreshRegions(this.segment(), 0L, value); return this; }

    /// {@return `nonRectangularIntraRefreshRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nonRectangularIntraRefreshRegions(MemorySegment segment, long index) { return (int) VH_nonRectangularIntraRefreshRegions.get(segment, 0L, index); }
    /// {@return `nonRectangularIntraRefreshRegions`}
    public int nonRectangularIntraRefreshRegions() { return nonRectangularIntraRefreshRegions(this.segment(), 0L); }
    /// Sets `nonRectangularIntraRefreshRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nonRectangularIntraRefreshRegions(MemorySegment segment, long index, int value) { VH_nonRectangularIntraRefreshRegions.set(segment, 0L, index, value); }
    /// Sets `nonRectangularIntraRefreshRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR nonRectangularIntraRefreshRegions(int value) { nonRectangularIntraRefreshRegions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeIntraRefreshCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeIntraRefreshCapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeIntraRefreshCapabilitiesKHR`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeIntraRefreshCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeIntraRefreshCapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR at(long index, Consumer<VkVideoEncodeIntraRefreshCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `intraRefreshModes` at the given index}
    /// @param index the index of the struct buffer
    public int intraRefreshModesAt(long index) { return intraRefreshModes(this.segment(), index); }
    /// Sets `intraRefreshModes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR intraRefreshModesAt(long index, int value) { intraRefreshModes(this.segment(), index, value); return this; }

    /// {@return `maxIntraRefreshCycleDuration` at the given index}
    /// @param index the index of the struct buffer
    public int maxIntraRefreshCycleDurationAt(long index) { return maxIntraRefreshCycleDuration(this.segment(), index); }
    /// Sets `maxIntraRefreshCycleDuration` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshCycleDurationAt(long index, int value) { maxIntraRefreshCycleDuration(this.segment(), index, value); return this; }

    /// {@return `maxIntraRefreshActiveReferencePictures` at the given index}
    /// @param index the index of the struct buffer
    public int maxIntraRefreshActiveReferencePicturesAt(long index) { return maxIntraRefreshActiveReferencePictures(this.segment(), index); }
    /// Sets `maxIntraRefreshActiveReferencePictures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR maxIntraRefreshActiveReferencePicturesAt(long index, int value) { maxIntraRefreshActiveReferencePictures(this.segment(), index, value); return this; }

    /// {@return `partitionIndependentIntraRefreshRegions` at the given index}
    /// @param index the index of the struct buffer
    public int partitionIndependentIntraRefreshRegionsAt(long index) { return partitionIndependentIntraRefreshRegions(this.segment(), index); }
    /// Sets `partitionIndependentIntraRefreshRegions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR partitionIndependentIntraRefreshRegionsAt(long index, int value) { partitionIndependentIntraRefreshRegions(this.segment(), index, value); return this; }

    /// {@return `nonRectangularIntraRefreshRegions` at the given index}
    /// @param index the index of the struct buffer
    public int nonRectangularIntraRefreshRegionsAt(long index) { return nonRectangularIntraRefreshRegions(this.segment(), index); }
    /// Sets `nonRectangularIntraRefreshRegions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshCapabilitiesKHR nonRectangularIntraRefreshRegionsAt(long index, int value) { nonRectangularIntraRefreshRegions(this.segment(), index, value); return this; }

}
