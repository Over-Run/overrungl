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
package overrungl.vulkan.khr.struct;

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
/// ### queueFamilyIndex
/// [VarHandle][#VH_queueFamilyIndex] - [Getter][#queueFamilyIndex()] - [Setter][#queueFamilyIndex(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### pVideoProfile
/// [VarHandle][#VH_pVideoProfile] - [Getter][#pVideoProfile()] - [Setter][#pVideoProfile(java.lang.foreign.MemorySegment)]
/// ### pictureFormat
/// [VarHandle][#VH_pictureFormat] - [Getter][#pictureFormat()] - [Setter][#pictureFormat(int)]
/// ### maxCodedExtent
/// [Byte offset][#OFFSET_maxCodedExtent] - [Memory layout][#ML_maxCodedExtent] - [Getter][#maxCodedExtent()] - [Setter][#maxCodedExtent(java.lang.foreign.MemorySegment)]
/// ### referencePictureFormat
/// [VarHandle][#VH_referencePictureFormat] - [Getter][#referencePictureFormat()] - [Setter][#referencePictureFormat(int)]
/// ### maxDpbSlots
/// [VarHandle][#VH_maxDpbSlots] - [Getter][#maxDpbSlots()] - [Setter][#maxDpbSlots(int)]
/// ### maxActiveReferencePictures
/// [VarHandle][#VH_maxActiveReferencePictures] - [Getter][#maxActiveReferencePictures()] - [Setter][#maxActiveReferencePictures(int)]
/// ### pStdHeaderVersion
/// [VarHandle][#VH_pStdHeaderVersion] - [Getter][#pStdHeaderVersion()] - [Setter][#pStdHeaderVersion(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoSessionCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t queueFamilyIndex;
///     VkVideoSessionCreateFlagsKHR flags;
///     const VkVideoProfileInfoKHR * pVideoProfile;
///     VkFormat pictureFormat;
///     VkExtent2D maxCodedExtent;
///     VkFormat referencePictureFormat;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     const VkExtensionProperties * pStdHeaderVersion;
/// } VkVideoSessionCreateInfoKHR;
/// ```
public final class VkVideoSessionCreateInfoKHR extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `queueFamilyIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `pVideoProfile` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pVideoProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVideoProfile"));
    /// The [VarHandle] of `pictureFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pictureFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pictureFormat"));
    /// The byte offset of `maxCodedExtent`.
    public static final long OFFSET_maxCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
    /// The memory layout of `maxCodedExtent`.
    public static final MemoryLayout ML_maxCodedExtent = LAYOUT.select(PathElement.groupElement("maxCodedExtent"));
    /// The [VarHandle] of `referencePictureFormat` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_referencePictureFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referencePictureFormat"));
    /// The [VarHandle] of `maxDpbSlots` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDpbSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDpbSlots"));
    /// The [VarHandle] of `maxActiveReferencePictures` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxActiveReferencePictures"));
    /// The [VarHandle] of `pStdHeaderVersion` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdHeaderVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdHeaderVersion"));

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoSessionCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment); }

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoSessionCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoSessionCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionCreateInfoKHR`
    public static VkVideoSessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoSessionCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionCreateInfoKHR`
    public static VkVideoSessionCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoSessionCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoSessionCreateInfoKHR`
    public VkVideoSessionCreateInfoKHR asSlice(long index) { return new VkVideoSessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoSessionCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoSessionCreateInfoKHR`
    public VkVideoSessionCreateInfoKHR asSlice(long index, long count) { return new VkVideoSessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoSessionCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoSessionCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoSessionCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoSessionCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoSessionCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoSessionCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoSessionCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `queueFamilyIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment, long index) { return (int) VH_queueFamilyIndex.get(segment, 0L, index); }
    /// {@return `queueFamilyIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndex(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_queueFamilyIndex(segment, 0L); }
    /// {@return `queueFamilyIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueFamilyIndexAt(long index) { return VkVideoSessionCreateInfoKHR.get_queueFamilyIndex(this.segment(), index); }
    /// {@return `queueFamilyIndex`}
    public @CType("uint32_t") int queueFamilyIndex() { return VkVideoSessionCreateInfoKHR.get_queueFamilyIndex(this.segment()); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndex.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_queueFamilyIndex(segment, 0L, value); }
    /// Sets `queueFamilyIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR queueFamilyIndexAt(long index, @CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_queueFamilyIndex(this.segment(), index, value); return this; }
    /// Sets `queueFamilyIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(@CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_queueFamilyIndex(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoSessionCreateFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoSessionCreateFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoSessionCreateFlagsKHR") int flagsAt(long index) { return VkVideoSessionCreateInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoSessionCreateFlagsKHR") int flags() { return VkVideoSessionCreateInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoSessionCreateFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoSessionCreateFlagsKHR") int value) { VkVideoSessionCreateInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR flagsAt(long index, @CType("VkVideoSessionCreateFlagsKHR") int value) { VkVideoSessionCreateInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR flags(@CType("VkVideoSessionCreateFlagsKHR") int value) { VkVideoSessionCreateInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `pVideoProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment get_pVideoProfile(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pVideoProfile.get(segment, 0L, index); }
    /// {@return `pVideoProfile`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment get_pVideoProfile(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_pVideoProfile(segment, 0L); }
    /// {@return `pVideoProfile` at the given index}
    /// @param index the index
    public @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment pVideoProfileAt(long index) { return VkVideoSessionCreateInfoKHR.get_pVideoProfile(this.segment(), index); }
    /// {@return `pVideoProfile`}
    public @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment pVideoProfile() { return VkVideoSessionCreateInfoKHR.get_pVideoProfile(this.segment()); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pVideoProfile(MemorySegment segment, long index, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pVideoProfile.set(segment, 0L, index, value); }
    /// Sets `pVideoProfile` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pVideoProfile(MemorySegment segment, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pVideoProfile(segment, 0L, value); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pVideoProfileAt(long index, @CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pVideoProfile(this.segment(), index, value); return this; }
    /// Sets `pVideoProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pVideoProfile(@CType("const VkVideoProfileInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pVideoProfile(this.segment(), value); return this; }

    /// {@return `pictureFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_pictureFormat(MemorySegment segment, long index) { return (int) VH_pictureFormat.get(segment, 0L, index); }
    /// {@return `pictureFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_pictureFormat(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_pictureFormat(segment, 0L); }
    /// {@return `pictureFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int pictureFormatAt(long index) { return VkVideoSessionCreateInfoKHR.get_pictureFormat(this.segment(), index); }
    /// {@return `pictureFormat`}
    public @CType("VkFormat") int pictureFormat() { return VkVideoSessionCreateInfoKHR.get_pictureFormat(this.segment()); }
    /// Sets `pictureFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pictureFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_pictureFormat.set(segment, 0L, index, value); }
    /// Sets `pictureFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pictureFormat(MemorySegment segment, @CType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.set_pictureFormat(segment, 0L, value); }
    /// Sets `pictureFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pictureFormatAt(long index, @CType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.set_pictureFormat(this.segment(), index, value); return this; }
    /// Sets `pictureFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pictureFormat(@CType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.set_pictureFormat(this.segment(), value); return this; }

    /// {@return `maxCodedExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxCodedExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxCodedExtent, index), ML_maxCodedExtent); }
    /// {@return `maxCodedExtent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxCodedExtent(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_maxCodedExtent(segment, 0L); }
    /// {@return `maxCodedExtent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxCodedExtentAt(long index) { return VkVideoSessionCreateInfoKHR.get_maxCodedExtent(this.segment(), index); }
    /// {@return `maxCodedExtent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxCodedExtent() { return VkVideoSessionCreateInfoKHR.get_maxCodedExtent(this.segment()); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCodedExtent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxCodedExtent, index), ML_maxCodedExtent.byteSize()); }
    /// Sets `maxCodedExtent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCodedExtent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_maxCodedExtent(segment, 0L, value); }
    /// Sets `maxCodedExtent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxCodedExtentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_maxCodedExtent(this.segment(), index, value); return this; }
    /// Sets `maxCodedExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxCodedExtent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_maxCodedExtent(this.segment(), value); return this; }

    /// {@return `referencePictureFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_referencePictureFormat(MemorySegment segment, long index) { return (int) VH_referencePictureFormat.get(segment, 0L, index); }
    /// {@return `referencePictureFormat`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_referencePictureFormat(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_referencePictureFormat(segment, 0L); }
    /// {@return `referencePictureFormat` at the given index}
    /// @param index the index
    public @CType("VkFormat") int referencePictureFormatAt(long index) { return VkVideoSessionCreateInfoKHR.get_referencePictureFormat(this.segment(), index); }
    /// {@return `referencePictureFormat`}
    public @CType("VkFormat") int referencePictureFormat() { return VkVideoSessionCreateInfoKHR.get_referencePictureFormat(this.segment()); }
    /// Sets `referencePictureFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_referencePictureFormat(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_referencePictureFormat.set(segment, 0L, index, value); }
    /// Sets `referencePictureFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_referencePictureFormat(MemorySegment segment, @CType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.set_referencePictureFormat(segment, 0L, value); }
    /// Sets `referencePictureFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR referencePictureFormatAt(long index, @CType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.set_referencePictureFormat(this.segment(), index, value); return this; }
    /// Sets `referencePictureFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR referencePictureFormat(@CType("VkFormat") int value) { VkVideoSessionCreateInfoKHR.set_referencePictureFormat(this.segment(), value); return this; }

    /// {@return `maxDpbSlots` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDpbSlots(MemorySegment segment, long index) { return (int) VH_maxDpbSlots.get(segment, 0L, index); }
    /// {@return `maxDpbSlots`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDpbSlots(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_maxDpbSlots(segment, 0L); }
    /// {@return `maxDpbSlots` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDpbSlotsAt(long index) { return VkVideoSessionCreateInfoKHR.get_maxDpbSlots(this.segment(), index); }
    /// {@return `maxDpbSlots`}
    public @CType("uint32_t") int maxDpbSlots() { return VkVideoSessionCreateInfoKHR.get_maxDpbSlots(this.segment()); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDpbSlots(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDpbSlots.set(segment, 0L, index, value); }
    /// Sets `maxDpbSlots` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDpbSlots(MemorySegment segment, @CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_maxDpbSlots(segment, 0L, value); }
    /// Sets `maxDpbSlots` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxDpbSlotsAt(long index, @CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_maxDpbSlots(this.segment(), index, value); return this; }
    /// Sets `maxDpbSlots` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxDpbSlots(@CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_maxDpbSlots(this.segment(), value); return this; }

    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxActiveReferencePictures(MemorySegment segment, long index) { return (int) VH_maxActiveReferencePictures.get(segment, 0L, index); }
    /// {@return `maxActiveReferencePictures`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxActiveReferencePictures(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_maxActiveReferencePictures(segment, 0L); }
    /// {@return `maxActiveReferencePictures` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxActiveReferencePicturesAt(long index) { return VkVideoSessionCreateInfoKHR.get_maxActiveReferencePictures(this.segment(), index); }
    /// {@return `maxActiveReferencePictures`}
    public @CType("uint32_t") int maxActiveReferencePictures() { return VkVideoSessionCreateInfoKHR.get_maxActiveReferencePictures(this.segment()); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxActiveReferencePictures(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxActiveReferencePictures.set(segment, 0L, index, value); }
    /// Sets `maxActiveReferencePictures` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxActiveReferencePictures(MemorySegment segment, @CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_maxActiveReferencePictures(segment, 0L, value); }
    /// Sets `maxActiveReferencePictures` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxActiveReferencePicturesAt(long index, @CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_maxActiveReferencePictures(this.segment(), index, value); return this; }
    /// Sets `maxActiveReferencePictures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(@CType("uint32_t") int value) { VkVideoSessionCreateInfoKHR.set_maxActiveReferencePictures(this.segment(), value); return this; }

    /// {@return `pStdHeaderVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment get_pStdHeaderVersion(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdHeaderVersion.get(segment, 0L, index); }
    /// {@return `pStdHeaderVersion`}
    /// @param segment the segment of the struct
    public static @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment get_pStdHeaderVersion(MemorySegment segment) { return VkVideoSessionCreateInfoKHR.get_pStdHeaderVersion(segment, 0L); }
    /// {@return `pStdHeaderVersion` at the given index}
    /// @param index the index
    public @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment pStdHeaderVersionAt(long index) { return VkVideoSessionCreateInfoKHR.get_pStdHeaderVersion(this.segment(), index); }
    /// {@return `pStdHeaderVersion`}
    public @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment pStdHeaderVersion() { return VkVideoSessionCreateInfoKHR.get_pStdHeaderVersion(this.segment()); }
    /// Sets `pStdHeaderVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdHeaderVersion(MemorySegment segment, long index, @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment value) { VH_pStdHeaderVersion.set(segment, 0L, index, value); }
    /// Sets `pStdHeaderVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdHeaderVersion(MemorySegment segment, @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pStdHeaderVersion(segment, 0L, value); }
    /// Sets `pStdHeaderVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pStdHeaderVersionAt(long index, @CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pStdHeaderVersion(this.segment(), index, value); return this; }
    /// Sets `pStdHeaderVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(@CType("const VkExtensionProperties *") java.lang.foreign.MemorySegment value) { VkVideoSessionCreateInfoKHR.set_pStdHeaderVersion(this.segment(), value); return this; }

}
