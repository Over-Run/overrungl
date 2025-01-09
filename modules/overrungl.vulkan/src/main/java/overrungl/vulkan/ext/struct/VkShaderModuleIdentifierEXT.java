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
import static overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### identifierSize
/// [VarHandle][#VH_identifierSize] - [Getter][#identifierSize()] - [Setter][#identifierSize(int)]
/// ### identifier
/// [Byte offset handle][#MH_identifier] - [Memory layout][#ML_identifier] - [Getter][#identifier(long)] - [Setter][#identifier(long, java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkShaderModuleIdentifierEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t identifierSize;
///     uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT] identifier;
/// } VkShaderModuleIdentifierEXT;
/// ```
public final class VkShaderModuleIdentifierEXT extends Struct {
    /// The struct layout of `VkShaderModuleIdentifierEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        MemoryLayout.sequenceLayout(VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT, ValueLayout.JAVA_BYTE).withName("identifier")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `identifierSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    /// The byte offset handle of `identifier` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_identifier = LAYOUT.byteOffsetHandle(PathElement.groupElement("identifier"), PathElement.sequenceElement());
    /// The memory layout of `identifier`.
    public static final MemoryLayout ML_identifier = LAYOUT.select(PathElement.groupElement("identifier"));

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    public VkShaderModuleIdentifierEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleIdentifierEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleIdentifierEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkShaderModuleIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderModuleIdentifierEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT alloc(SegmentAllocator allocator) { return new VkShaderModuleIdentifierEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkShaderModuleIdentifierEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderModuleIdentifierEXT`
    public static VkShaderModuleIdentifierEXT alloc(SegmentAllocator allocator, long count) { return new VkShaderModuleIdentifierEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkShaderModuleIdentifierEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkShaderModuleIdentifierEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT sType(@CType("VkStructureType") int value) { VkShaderModuleIdentifierEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkShaderModuleIdentifierEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkShaderModuleIdentifierEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkShaderModuleIdentifierEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkShaderModuleIdentifierEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkShaderModuleIdentifierEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_identifierSize(MemorySegment segment, long index) { return (int) VH_identifierSize.get(segment, 0L, index); }
    /// {@return `identifierSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_identifierSize(MemorySegment segment) { return VkShaderModuleIdentifierEXT.get_identifierSize(segment, 0L); }
    /// {@return `identifierSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int identifierSizeAt(long index) { return VkShaderModuleIdentifierEXT.get_identifierSize(this.segment(), index); }
    /// {@return `identifierSize`}
    public @CType("uint32_t") int identifierSize() { return VkShaderModuleIdentifierEXT.get_identifierSize(this.segment()); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identifierSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_identifierSize.set(segment, 0L, index, value); }
    /// Sets `identifierSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identifierSize(MemorySegment segment, @CType("uint32_t") int value) { VkShaderModuleIdentifierEXT.set_identifierSize(segment, 0L, value); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifierSizeAt(long index, @CType("uint32_t") int value) { VkShaderModuleIdentifierEXT.set_identifierSize(this.segment(), index, value); return this; }
    /// Sets `identifierSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifierSize(@CType("uint32_t") int value) { VkShaderModuleIdentifierEXT.set_identifierSize(this.segment(), value); return this; }

    /// {@return `identifier` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment get_identifier(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_identifier.invokeExact(0L, elementIndex), index), ML_identifier); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `identifier`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment get_identifier(MemorySegment segment, long elementIndex) { return VkShaderModuleIdentifierEXT.get_identifier(segment, 0L, elementIndex); }
    /// {@return `identifier` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment identifierAt(long index, long elementIndex) { return VkShaderModuleIdentifierEXT.get_identifier(this.segment(), index, elementIndex); }
    /// {@return `identifier`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment identifier(long elementIndex) { return VkShaderModuleIdentifierEXT.get_identifier(this.segment(), elementIndex); }
    /// Sets `identifier` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_identifier(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_identifier.invokeExact(0L, elementIndex), index), ML_identifier.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `identifier` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_identifier(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment value) { VkShaderModuleIdentifierEXT.set_identifier(segment, 0L, elementIndex, value); }
    /// Sets `identifier` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifierAt(long index, long elementIndex, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment value) { VkShaderModuleIdentifierEXT.set_identifier(this.segment(), index, elementIndex, value); return this; }
    /// Sets `identifier` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkShaderModuleIdentifierEXT identifier(long elementIndex, @CType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]") java.lang.foreign.MemorySegment value) { VkShaderModuleIdentifierEXT.set_identifier(this.segment(), elementIndex, value); return this; }

}
