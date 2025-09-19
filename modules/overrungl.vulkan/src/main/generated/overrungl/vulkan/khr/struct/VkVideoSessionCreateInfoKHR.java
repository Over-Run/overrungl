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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoSessionCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoSessionCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     ((uint32_t) VkFlags) VkVideoSessionCreateFlagsKHR flags;
///     const VkVideoProfileInfoKHR* pVideoProfile;
///     (int) VkFormat pictureFormat;
///     (struct VkExtent2D) VkExtent2D maxCodedExtent;
///     (int) VkFormat referencePictureFormat;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     const VkExtensionProperties* pStdHeaderVersion;
/// };
/// ```
public final class VkVideoSessionCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoSessionCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("pictureFormat"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxCodedExtent"),
        ValueLayout.JAVA_INT.withName("referencePictureFormat"),
        ValueLayout.JAVA_INT.withName("maxDpbSlots"),
        ValueLayout.JAVA_INT.withName("maxActiveReferencePictures"),
        ValueLayout.ADDRESS.withName("pStdHeaderVersion")
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
    /// The byte offset of `queueFamilyIndex`.
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    /// The memory layout of `queueFamilyIndex`.
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `pVideoProfile`.
    public static final long OFFSET_pVideoProfile = LAYOUT.byteOffset(PathElement.groupElement("pVideoProfile"));
    /// The memory layout of `pVideoProfile`.
    public static final MemoryLayout LAYOUT_pVideoProfile = LAYOUT.select(PathElement.groupElement("pVideoProfile"));
    /// The [VarHandle] of `pVideoProfile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVideoProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVideoProfile"));
    /// The byte offset of `pictureFormat`.
    public static final long OFFSET_pictureFormat = LAYOUT.byteOffset(PathElement.groupElement("pictureFormat"));
    /// The memory layout of `pictureFormat`.
    public static final MemoryLayout LAYOUT_pictureFormat = LAYOUT.select(PathElement.groupElement("pictureFormat"));
    /// The [VarHandle] of `pictureFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pictureFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pictureFormat"));
    /// The byte offset of `maxCodedExtent`.
    public static final long OFFSET_maxCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
    /// The memory layout of `maxCodedExtent`.
    public static final MemoryLayout LAYOUT_maxCodedExtent = LAYOUT.select(PathElement.groupElement("maxCodedExtent"));
    /// The byte offset of `referencePictureFormat`.
    public static final long OFFSET_referencePictureFormat = LAYOUT.byteOffset(PathElement.groupElement("referencePictureFormat"));
    /// The memory layout of `referencePictureFormat`.
    public static final MemoryLayout LAYOUT_referencePictureFormat = LAYOUT.select(PathElement.groupElement("referencePictureFormat"));
    /// The [VarHandle] of `referencePictureFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_referencePictureFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referencePictureFormat"));
    /// The byte offset of `maxDpbSlots`.
    public static final long OFFSET_maxDpbSlots = LAYOUT.byteOffset(PathElement.groupElement("maxDpbSlots"));
    /// The memory layout of `maxDpbSlots`.
    public static final MemoryLayout LAYOUT_maxDpbSlots = LAYOUT.select(PathElement.groupElement("maxDpbSlots"));
    /// The [VarHandle] of `maxDpbSlots` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxDpbSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDpbSlots"));
    /// The byte offset of `maxActiveReferencePictures`.
    public static final long OFFSET_maxActiveReferencePictures = LAYOUT.byteOffset(PathElement.groupElement("maxActiveReferencePictures"));
    /// The memory layout of `maxActiveReferencePictures`.
    public static final MemoryLayout LAYOUT_maxActiveReferencePictures = LAYOUT.select(PathElement.groupElement("maxActiveReferencePictures"));
    /// The [VarHandle] of `maxActiveReferencePictures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxActiveReferencePictures"));
    /// The byte offset of `pStdHeaderVersion`.
    public static final long OFFSET_pStdHeaderVersion = LAYOUT.byteOffset(PathElement.groupElement("pStdHeaderVersion"));
    /// The memory layout of `pStdHeaderVersion`.
    public static final MemoryLayout LAYOUT_pStdHeaderVersion = LAYOUT.select(PathElement.groupElement("pStdHeaderVersion"));
    /// The [VarHandle] of `pStdHeaderVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdHeaderVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdHeaderVersion"));

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoSessionCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoSessionCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionCreateInfoKHR`
    public static VkVideoSessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoSessionCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionCreateInfoKHR`
    public static VkVideoSessionCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoSessionCreateInfoKHR copyFrom(VkVideoSessionCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoSessionCreateInfoKHR reinterpret(long count) { return new VkVideoSessionCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoSessionCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoSessionCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    public int queueFamilyIndex() { return queueFamilyIndex(this.segment(), 0L); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndex(MemorySegment segment, long index, int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(int value) { queueFamilyIndex(this.segment(), 0L, value); return this; }

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
    public VkVideoSessionCreateInfoKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `pVideoProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVideoProfile(MemorySegment segment, long index) { return (MemorySegment) VH_pVideoProfile.get(segment, 0L, index); }
    /// {@return `pVideoProfile`}
    public MemorySegment pVideoProfile() { return pVideoProfile(this.segment(), 0L); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVideoProfile(MemorySegment segment, long index, MemorySegment value) { VH_pVideoProfile.set(segment, 0L, index, value); }
    /// Sets `pVideoProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pVideoProfile(MemorySegment value) { pVideoProfile(this.segment(), 0L, value); return this; }

    /// {@return `pictureFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pictureFormat(MemorySegment segment, long index) { return (int) VH_pictureFormat.get(segment, 0L, index); }
    /// {@return `pictureFormat`}
    public int pictureFormat() { return pictureFormat(this.segment(), 0L); }
    /// Sets `pictureFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pictureFormat(MemorySegment segment, long index, int value) { VH_pictureFormat.set(segment, 0L, index, value); }
    /// Sets `pictureFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pictureFormat(int value) { pictureFormat(this.segment(), 0L, value); return this; }

    /// {@return `maxCodedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxCodedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxCodedExtent, index), LAYOUT_maxCodedExtent); }
    /// {@return `maxCodedExtent`}
    public MemorySegment maxCodedExtent() { return maxCodedExtent(this.segment(), 0L); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCodedExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxCodedExtent, index), LAYOUT_maxCodedExtent.byteSize()); }
    /// Sets `maxCodedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxCodedExtent(MemorySegment value) { maxCodedExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxCodedExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxCodedExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxCodedExtent())); return this; }

    /// {@return `referencePictureFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int referencePictureFormat(MemorySegment segment, long index) { return (int) VH_referencePictureFormat.get(segment, 0L, index); }
    /// {@return `referencePictureFormat`}
    public int referencePictureFormat() { return referencePictureFormat(this.segment(), 0L); }
    /// Sets `referencePictureFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void referencePictureFormat(MemorySegment segment, long index, int value) { VH_referencePictureFormat.set(segment, 0L, index, value); }
    /// Sets `referencePictureFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR referencePictureFormat(int value) { referencePictureFormat(this.segment(), 0L, value); return this; }

    /// {@return `maxDpbSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDpbSlots(MemorySegment segment, long index) { return (int) VH_maxDpbSlots.get(segment, 0L, index); }
    /// {@return `maxDpbSlots`}
    public int maxDpbSlots() { return maxDpbSlots(this.segment(), 0L); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDpbSlots(MemorySegment segment, long index, int value) { VH_maxDpbSlots.set(segment, 0L, index, value); }
    /// Sets `maxDpbSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxDpbSlots(int value) { maxDpbSlots(this.segment(), 0L, value); return this; }

    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxActiveReferencePictures(MemorySegment segment, long index) { return (int) VH_maxActiveReferencePictures.get(segment, 0L, index); }
    /// {@return `maxActiveReferencePictures`}
    public int maxActiveReferencePictures() { return maxActiveReferencePictures(this.segment(), 0L); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxActiveReferencePictures(MemorySegment segment, long index, int value) { VH_maxActiveReferencePictures.set(segment, 0L, index, value); }
    /// Sets `maxActiveReferencePictures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(int value) { maxActiveReferencePictures(this.segment(), 0L, value); return this; }

    /// {@return `pStdHeaderVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdHeaderVersion(MemorySegment segment, long index) { return (MemorySegment) VH_pStdHeaderVersion.get(segment, 0L, index); }
    /// {@return `pStdHeaderVersion`}
    public MemorySegment pStdHeaderVersion() { return pStdHeaderVersion(this.segment(), 0L); }
    /// Sets `pStdHeaderVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdHeaderVersion(MemorySegment segment, long index, MemorySegment value) { VH_pStdHeaderVersion.set(segment, 0L, index, value); }
    /// Sets `pStdHeaderVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(MemorySegment value) { pStdHeaderVersion(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoSessionCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoSessionCreateInfoKHR`
    public VkVideoSessionCreateInfoKHR asSlice(long index) { return new VkVideoSessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoSessionCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoSessionCreateInfoKHR`
    public VkVideoSessionCreateInfoKHR asSlice(long index, long count) { return new VkVideoSessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoSessionCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoSessionCreateInfoKHR at(long index, Consumer<VkVideoSessionCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param index the index of the struct buffer
    public int queueFamilyIndexAt(long index) { return queueFamilyIndex(this.segment(), index); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR queueFamilyIndexAt(long index, int value) { queueFamilyIndex(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `pVideoProfile` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVideoProfileAt(long index) { return pVideoProfile(this.segment(), index); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pVideoProfileAt(long index, MemorySegment value) { pVideoProfile(this.segment(), index, value); return this; }

    /// {@return `pictureFormat` at the given index}
    /// @param index the index of the struct buffer
    public int pictureFormatAt(long index) { return pictureFormat(this.segment(), index); }
    /// Sets `pictureFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pictureFormatAt(long index, int value) { pictureFormat(this.segment(), index, value); return this; }

    /// {@return `maxCodedExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxCodedExtentAt(long index) { return maxCodedExtent(this.segment(), index); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxCodedExtentAt(long index, MemorySegment value) { maxCodedExtent(this.segment(), index, value); return this; }
    /// Accepts `maxCodedExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxCodedExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxCodedExtentAt(index))); return this; }

    /// {@return `referencePictureFormat` at the given index}
    /// @param index the index of the struct buffer
    public int referencePictureFormatAt(long index) { return referencePictureFormat(this.segment(), index); }
    /// Sets `referencePictureFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR referencePictureFormatAt(long index, int value) { referencePictureFormat(this.segment(), index, value); return this; }

    /// {@return `maxDpbSlots` at the given index}
    /// @param index the index of the struct buffer
    public int maxDpbSlotsAt(long index) { return maxDpbSlots(this.segment(), index); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxDpbSlotsAt(long index, int value) { maxDpbSlots(this.segment(), index, value); return this; }

    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param index the index of the struct buffer
    public int maxActiveReferencePicturesAt(long index) { return maxActiveReferencePictures(this.segment(), index); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxActiveReferencePicturesAt(long index, int value) { maxActiveReferencePictures(this.segment(), index, value); return this; }

    /// {@return `pStdHeaderVersion` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdHeaderVersionAt(long index) { return pStdHeaderVersion(this.segment(), index); }
    /// Sets `pStdHeaderVersion` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pStdHeaderVersionAt(long index, MemorySegment value) { pStdHeaderVersion(this.segment(), index, value); return this; }

}
