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
/// ### depthTestEnable
/// [VarHandle][#VH_depthTestEnable] - [Getter][#depthTestEnable()] - [Setter][#depthTestEnable(int)]
/// ### depthWriteEnable
/// [VarHandle][#VH_depthWriteEnable] - [Getter][#depthWriteEnable()] - [Setter][#depthWriteEnable(int)]
/// ### depthCompareOp
/// [VarHandle][#VH_depthCompareOp] - [Getter][#depthCompareOp()] - [Setter][#depthCompareOp(int)]
/// ### depthBoundsTestEnable
/// [VarHandle][#VH_depthBoundsTestEnable] - [Getter][#depthBoundsTestEnable()] - [Setter][#depthBoundsTestEnable(int)]
/// ### stencilTestEnable
/// [VarHandle][#VH_stencilTestEnable] - [Getter][#stencilTestEnable()] - [Setter][#stencilTestEnable(int)]
/// ### front
/// [Byte offset][#OFFSET_front] - [Memory layout][#ML_front] - [Getter][#front()] - [Setter][#front(java.lang.foreign.MemorySegment)]
/// ### back
/// [Byte offset][#OFFSET_back] - [Memory layout][#ML_back] - [Getter][#back()] - [Setter][#back(java.lang.foreign.MemorySegment)]
/// ### minDepthBounds
/// [VarHandle][#VH_minDepthBounds] - [Getter][#minDepthBounds()] - [Setter][#minDepthBounds(float)]
/// ### maxDepthBounds
/// [VarHandle][#VH_maxDepthBounds] - [Getter][#maxDepthBounds()] - [Setter][#maxDepthBounds(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineDepthStencilStateCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineDepthStencilStateCreateFlags flags;
///     VkBool32 depthTestEnable;
///     VkBool32 depthWriteEnable;
///     VkCompareOp depthCompareOp;
///     VkBool32 depthBoundsTestEnable;
///     VkBool32 stencilTestEnable;
///     VkStencilOpState front;
///     VkStencilOpState back;
///     float minDepthBounds;
///     float maxDepthBounds;
/// } VkPipelineDepthStencilStateCreateInfo;
/// ```
public final class VkPipelineDepthStencilStateCreateInfo extends Struct {
    /// The struct layout of `VkPipelineDepthStencilStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthTestEnable"),
        ValueLayout.JAVA_INT.withName("depthWriteEnable"),
        ValueLayout.JAVA_INT.withName("depthCompareOp"),
        ValueLayout.JAVA_INT.withName("depthBoundsTestEnable"),
        ValueLayout.JAVA_INT.withName("stencilTestEnable"),
        overrungl.vulkan.struct.VkStencilOpState.LAYOUT.withName("front"),
        overrungl.vulkan.struct.VkStencilOpState.LAYOUT.withName("back"),
        ValueLayout.JAVA_FLOAT.withName("minDepthBounds"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthBounds")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `depthTestEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthTestEnable"));
    /// The [VarHandle] of `depthWriteEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthWriteEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthWriteEnable"));
    /// The [VarHandle] of `depthCompareOp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthCompareOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthCompareOp"));
    /// The [VarHandle] of `depthBoundsTestEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthBoundsTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBoundsTestEnable"));
    /// The [VarHandle] of `stencilTestEnable` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stencilTestEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilTestEnable"));
    /// The byte offset of `front`.
    public static final long OFFSET_front = LAYOUT.byteOffset(PathElement.groupElement("front"));
    /// The memory layout of `front`.
    public static final MemoryLayout ML_front = LAYOUT.select(PathElement.groupElement("front"));
    /// The byte offset of `back`.
    public static final long OFFSET_back = LAYOUT.byteOffset(PathElement.groupElement("back"));
    /// The memory layout of `back`.
    public static final MemoryLayout ML_back = LAYOUT.select(PathElement.groupElement("back"));
    /// The [VarHandle] of `minDepthBounds` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minDepthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepthBounds"));
    /// The [VarHandle] of `maxDepthBounds` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxDepthBounds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepthBounds"));

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkPipelineDepthStencilStateCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDepthStencilStateCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment); }

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDepthStencilStateCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineDepthStencilStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineDepthStencilStateCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineDepthStencilStateCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineDepthStencilStateCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineDepthStencilStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineDepthStencilStateCreateInfo`
    public static VkPipelineDepthStencilStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineDepthStencilStateCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineDepthStencilStateCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineDepthStencilStateCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineDepthStencilStateCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo sType(@CType("VkStructureType") int value) { VkPipelineDepthStencilStateCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineDepthStencilStateCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineDepthStencilStateCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineDepthStencilStateCreateFlags") int get_flags(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineDepthStencilStateCreateFlags") int flagsAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineDepthStencilStateCreateFlags") int flags() { return VkPipelineDepthStencilStateCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineDepthStencilStateCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineDepthStencilStateCreateFlags") int value) { VkPipelineDepthStencilStateCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo flagsAt(long index, @CType("VkPipelineDepthStencilStateCreateFlags") int value) { VkPipelineDepthStencilStateCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo flags(@CType("VkPipelineDepthStencilStateCreateFlags") int value) { VkPipelineDepthStencilStateCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `depthTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthTestEnable(MemorySegment segment, long index) { return (int) VH_depthTestEnable.get(segment, 0L, index); }
    /// {@return `depthTestEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthTestEnable(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_depthTestEnable(segment, 0L); }
    /// {@return `depthTestEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthTestEnableAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_depthTestEnable(this.segment(), index); }
    /// {@return `depthTestEnable`}
    public @CType("VkBool32") int depthTestEnable() { return VkPipelineDepthStencilStateCreateInfo.get_depthTestEnable(this.segment()); }
    /// Sets `depthTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthTestEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthTestEnable.set(segment, 0L, index, value); }
    /// Sets `depthTestEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthTestEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthTestEnable(segment, 0L, value); }
    /// Sets `depthTestEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthTestEnableAt(long index, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthTestEnable(this.segment(), index, value); return this; }
    /// Sets `depthTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthTestEnable(@CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthTestEnable(this.segment(), value); return this; }

    /// {@return `depthWriteEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthWriteEnable(MemorySegment segment, long index) { return (int) VH_depthWriteEnable.get(segment, 0L, index); }
    /// {@return `depthWriteEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthWriteEnable(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_depthWriteEnable(segment, 0L); }
    /// {@return `depthWriteEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthWriteEnableAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_depthWriteEnable(this.segment(), index); }
    /// {@return `depthWriteEnable`}
    public @CType("VkBool32") int depthWriteEnable() { return VkPipelineDepthStencilStateCreateInfo.get_depthWriteEnable(this.segment()); }
    /// Sets `depthWriteEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthWriteEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthWriteEnable.set(segment, 0L, index, value); }
    /// Sets `depthWriteEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthWriteEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthWriteEnable(segment, 0L, value); }
    /// Sets `depthWriteEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnableAt(long index, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthWriteEnable(this.segment(), index, value); return this; }
    /// Sets `depthWriteEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(@CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthWriteEnable(this.segment(), value); return this; }

    /// {@return `depthCompareOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCompareOp") int get_depthCompareOp(MemorySegment segment, long index) { return (int) VH_depthCompareOp.get(segment, 0L, index); }
    /// {@return `depthCompareOp`}
    /// @param segment the segment of the struct
    public static @CType("VkCompareOp") int get_depthCompareOp(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_depthCompareOp(segment, 0L); }
    /// {@return `depthCompareOp` at the given index}
    /// @param index the index
    public @CType("VkCompareOp") int depthCompareOpAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_depthCompareOp(this.segment(), index); }
    /// {@return `depthCompareOp`}
    public @CType("VkCompareOp") int depthCompareOp() { return VkPipelineDepthStencilStateCreateInfo.get_depthCompareOp(this.segment()); }
    /// Sets `depthCompareOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthCompareOp(MemorySegment segment, long index, @CType("VkCompareOp") int value) { VH_depthCompareOp.set(segment, 0L, index, value); }
    /// Sets `depthCompareOp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthCompareOp(MemorySegment segment, @CType("VkCompareOp") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthCompareOp(segment, 0L, value); }
    /// Sets `depthCompareOp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthCompareOpAt(long index, @CType("VkCompareOp") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthCompareOp(this.segment(), index, value); return this; }
    /// Sets `depthCompareOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthCompareOp(@CType("VkCompareOp") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthCompareOp(this.segment(), value); return this; }

    /// {@return `depthBoundsTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthBoundsTestEnable(MemorySegment segment, long index) { return (int) VH_depthBoundsTestEnable.get(segment, 0L, index); }
    /// {@return `depthBoundsTestEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthBoundsTestEnable(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_depthBoundsTestEnable(segment, 0L); }
    /// {@return `depthBoundsTestEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthBoundsTestEnableAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_depthBoundsTestEnable(this.segment(), index); }
    /// {@return `depthBoundsTestEnable`}
    public @CType("VkBool32") int depthBoundsTestEnable() { return VkPipelineDepthStencilStateCreateInfo.get_depthBoundsTestEnable(this.segment()); }
    /// Sets `depthBoundsTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthBoundsTestEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthBoundsTestEnable.set(segment, 0L, index, value); }
    /// Sets `depthBoundsTestEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthBoundsTestEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthBoundsTestEnable(segment, 0L, value); }
    /// Sets `depthBoundsTestEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnableAt(long index, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthBoundsTestEnable(this.segment(), index, value); return this; }
    /// Sets `depthBoundsTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(@CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_depthBoundsTestEnable(this.segment(), value); return this; }

    /// {@return `stencilTestEnable` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_stencilTestEnable(MemorySegment segment, long index) { return (int) VH_stencilTestEnable.get(segment, 0L, index); }
    /// {@return `stencilTestEnable`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_stencilTestEnable(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_stencilTestEnable(segment, 0L); }
    /// {@return `stencilTestEnable` at the given index}
    /// @param index the index
    public @CType("VkBool32") int stencilTestEnableAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_stencilTestEnable(this.segment(), index); }
    /// {@return `stencilTestEnable`}
    public @CType("VkBool32") int stencilTestEnable() { return VkPipelineDepthStencilStateCreateInfo.get_stencilTestEnable(this.segment()); }
    /// Sets `stencilTestEnable` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stencilTestEnable(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_stencilTestEnable.set(segment, 0L, index, value); }
    /// Sets `stencilTestEnable` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stencilTestEnable(MemorySegment segment, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_stencilTestEnable(segment, 0L, value); }
    /// Sets `stencilTestEnable` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnableAt(long index, @CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_stencilTestEnable(this.segment(), index, value); return this; }
    /// Sets `stencilTestEnable` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(@CType("VkBool32") int value) { VkPipelineDepthStencilStateCreateInfo.set_stencilTestEnable(this.segment(), value); return this; }

    /// {@return `front` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStencilOpState") java.lang.foreign.MemorySegment get_front(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_front, index), ML_front); }
    /// {@return `front`}
    /// @param segment the segment of the struct
    public static @CType("VkStencilOpState") java.lang.foreign.MemorySegment get_front(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_front(segment, 0L); }
    /// {@return `front` at the given index}
    /// @param index the index
    public @CType("VkStencilOpState") java.lang.foreign.MemorySegment frontAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_front(this.segment(), index); }
    /// {@return `front`}
    public @CType("VkStencilOpState") java.lang.foreign.MemorySegment front() { return VkPipelineDepthStencilStateCreateInfo.get_front(this.segment()); }
    /// Sets `front` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_front(MemorySegment segment, long index, @CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_front, index), ML_front.byteSize()); }
    /// Sets `front` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_front(MemorySegment segment, @CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_front(segment, 0L, value); }
    /// Sets `front` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo frontAt(long index, @CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_front(this.segment(), index, value); return this; }
    /// Sets `front` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo front(@CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_front(this.segment(), value); return this; }

    /// {@return `back` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStencilOpState") java.lang.foreign.MemorySegment get_back(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_back, index), ML_back); }
    /// {@return `back`}
    /// @param segment the segment of the struct
    public static @CType("VkStencilOpState") java.lang.foreign.MemorySegment get_back(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_back(segment, 0L); }
    /// {@return `back` at the given index}
    /// @param index the index
    public @CType("VkStencilOpState") java.lang.foreign.MemorySegment backAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_back(this.segment(), index); }
    /// {@return `back`}
    public @CType("VkStencilOpState") java.lang.foreign.MemorySegment back() { return VkPipelineDepthStencilStateCreateInfo.get_back(this.segment()); }
    /// Sets `back` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_back(MemorySegment segment, long index, @CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_back, index), ML_back.byteSize()); }
    /// Sets `back` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_back(MemorySegment segment, @CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_back(segment, 0L, value); }
    /// Sets `back` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo backAt(long index, @CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_back(this.segment(), index, value); return this; }
    /// Sets `back` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo back(@CType("VkStencilOpState") java.lang.foreign.MemorySegment value) { VkPipelineDepthStencilStateCreateInfo.set_back(this.segment(), value); return this; }

    /// {@return `minDepthBounds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minDepthBounds(MemorySegment segment, long index) { return (float) VH_minDepthBounds.get(segment, 0L, index); }
    /// {@return `minDepthBounds`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minDepthBounds(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_minDepthBounds(segment, 0L); }
    /// {@return `minDepthBounds` at the given index}
    /// @param index the index
    public @CType("float") float minDepthBoundsAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_minDepthBounds(this.segment(), index); }
    /// {@return `minDepthBounds`}
    public @CType("float") float minDepthBounds() { return VkPipelineDepthStencilStateCreateInfo.get_minDepthBounds(this.segment()); }
    /// Sets `minDepthBounds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minDepthBounds(MemorySegment segment, long index, @CType("float") float value) { VH_minDepthBounds.set(segment, 0L, index, value); }
    /// Sets `minDepthBounds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minDepthBounds(MemorySegment segment, @CType("float") float value) { VkPipelineDepthStencilStateCreateInfo.set_minDepthBounds(segment, 0L, value); }
    /// Sets `minDepthBounds` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo minDepthBoundsAt(long index, @CType("float") float value) { VkPipelineDepthStencilStateCreateInfo.set_minDepthBounds(this.segment(), index, value); return this; }
    /// Sets `minDepthBounds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo minDepthBounds(@CType("float") float value) { VkPipelineDepthStencilStateCreateInfo.set_minDepthBounds(this.segment(), value); return this; }

    /// {@return `maxDepthBounds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxDepthBounds(MemorySegment segment, long index) { return (float) VH_maxDepthBounds.get(segment, 0L, index); }
    /// {@return `maxDepthBounds`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxDepthBounds(MemorySegment segment) { return VkPipelineDepthStencilStateCreateInfo.get_maxDepthBounds(segment, 0L); }
    /// {@return `maxDepthBounds` at the given index}
    /// @param index the index
    public @CType("float") float maxDepthBoundsAt(long index) { return VkPipelineDepthStencilStateCreateInfo.get_maxDepthBounds(this.segment(), index); }
    /// {@return `maxDepthBounds`}
    public @CType("float") float maxDepthBounds() { return VkPipelineDepthStencilStateCreateInfo.get_maxDepthBounds(this.segment()); }
    /// Sets `maxDepthBounds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDepthBounds(MemorySegment segment, long index, @CType("float") float value) { VH_maxDepthBounds.set(segment, 0L, index, value); }
    /// Sets `maxDepthBounds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDepthBounds(MemorySegment segment, @CType("float") float value) { VkPipelineDepthStencilStateCreateInfo.set_maxDepthBounds(segment, 0L, value); }
    /// Sets `maxDepthBounds` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo maxDepthBoundsAt(long index, @CType("float") float value) { VkPipelineDepthStencilStateCreateInfo.set_maxDepthBounds(this.segment(), index, value); return this; }
    /// Sets `maxDepthBounds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(@CType("float") float value) { VkPipelineDepthStencilStateCreateInfo.set_maxDepthBounds(this.segment(), value); return this; }

}
