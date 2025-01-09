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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### shaderBinaryUUID
/// [Byte offset handle][#MH_shaderBinaryUUID] - [Memory layout][#ML_shaderBinaryUUID] - [Getter][#shaderBinaryUUID(long)] - [Setter][#shaderBinaryUUID(long, java.lang.foreign.MemorySegment)]
/// ### shaderBinaryVersion
/// [VarHandle][#VH_shaderBinaryVersion] - [Getter][#shaderBinaryVersion()] - [Setter][#shaderBinaryVersion(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderObjectPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint8_t[VK_UUID_SIZE] shaderBinaryUUID;
///     uint32_t shaderBinaryVersion;
/// } VkPhysicalDeviceShaderObjectPropertiesEXT;
/// ```
public final class VkPhysicalDeviceShaderObjectPropertiesEXT extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderObjectPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset handle of `shaderBinaryUUID` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_shaderBinaryUUID = LAYOUT.byteOffsetHandle(PathElement.groupElement("shaderBinaryUUID"), PathElement.sequenceElement());
    /// The memory layout of `shaderBinaryUUID`.
    public static final MemoryLayout ML_shaderBinaryUUID = LAYOUT.select(PathElement.groupElement("shaderBinaryUUID"));
    /// The [VarHandle] of `shaderBinaryVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderBinaryVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBinaryVersion"));

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderObjectPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderObjectPropertiesEXT`
    public static VkPhysicalDeviceShaderObjectPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderBinaryUUID` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_shaderBinaryUUID(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_shaderBinaryUUID.invokeExact(0L, elementIndex), index), ML_shaderBinaryUUID); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `shaderBinaryUUID`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_shaderBinaryUUID(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryUUID(segment, 0L, elementIndex); }
    /// {@return `shaderBinaryUUID` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment shaderBinaryUUIDAt(long index, long elementIndex) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryUUID(this.segment(), index, elementIndex); }
    /// {@return `shaderBinaryUUID`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment shaderBinaryUUID(long elementIndex) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryUUID(this.segment(), elementIndex); }
    /// Sets `shaderBinaryUUID` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_shaderBinaryUUID(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_shaderBinaryUUID.invokeExact(0L, elementIndex), index), ML_shaderBinaryUUID.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `shaderBinaryUUID` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_shaderBinaryUUID(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryUUID(segment, 0L, elementIndex, value); }
    /// Sets `shaderBinaryUUID` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUIDAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryUUID(this.segment(), index, elementIndex, value); return this; }
    /// Sets `shaderBinaryUUID` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUID(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryUUID(this.segment(), elementIndex, value); return this; }

    /// {@return `shaderBinaryVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_shaderBinaryVersion(MemorySegment segment, long index) { return (int) VH_shaderBinaryVersion.get(segment, 0L, index); }
    /// {@return `shaderBinaryVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_shaderBinaryVersion(MemorySegment segment) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryVersion(segment, 0L); }
    /// {@return `shaderBinaryVersion` at the given index}
    /// @param index the index
    public @CType("uint32_t") int shaderBinaryVersionAt(long index) { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryVersion(this.segment(), index); }
    /// {@return `shaderBinaryVersion`}
    public @CType("uint32_t") int shaderBinaryVersion() { return VkPhysicalDeviceShaderObjectPropertiesEXT.get_shaderBinaryVersion(this.segment()); }
    /// Sets `shaderBinaryVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderBinaryVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_shaderBinaryVersion.set(segment, 0L, index, value); }
    /// Sets `shaderBinaryVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderBinaryVersion(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryVersion(segment, 0L, value); }
    /// Sets `shaderBinaryVersion` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersionAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryVersion(this.segment(), index, value); return this; }
    /// Sets `shaderBinaryVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersion(@CType("uint32_t") int value) { VkPhysicalDeviceShaderObjectPropertiesEXT.set_shaderBinaryVersion(this.segment(), value); return this; }

}
