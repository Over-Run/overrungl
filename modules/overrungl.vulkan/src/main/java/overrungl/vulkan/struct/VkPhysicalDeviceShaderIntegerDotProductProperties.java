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
/// ### integerDotProduct8BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct8BitUnsignedAccelerated] - [Getter][#integerDotProduct8BitUnsignedAccelerated()] - [Setter][#integerDotProduct8BitUnsignedAccelerated(int)]
/// ### integerDotProduct8BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct8BitSignedAccelerated] - [Getter][#integerDotProduct8BitSignedAccelerated()] - [Setter][#integerDotProduct8BitSignedAccelerated(int)]
/// ### integerDotProduct8BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct8BitMixedSignednessAccelerated] - [Getter][#integerDotProduct8BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct8BitMixedSignednessAccelerated(int)]
/// ### integerDotProduct4x8BitPackedUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct4x8BitPackedUnsignedAccelerated] - [Getter][#integerDotProduct4x8BitPackedUnsignedAccelerated()] - [Setter][#integerDotProduct4x8BitPackedUnsignedAccelerated(int)]
/// ### integerDotProduct4x8BitPackedSignedAccelerated
/// [VarHandle][#VH_integerDotProduct4x8BitPackedSignedAccelerated] - [Getter][#integerDotProduct4x8BitPackedSignedAccelerated()] - [Setter][#integerDotProduct4x8BitPackedSignedAccelerated(int)]
/// ### integerDotProduct4x8BitPackedMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated] - [Getter][#integerDotProduct4x8BitPackedMixedSignednessAccelerated()] - [Setter][#integerDotProduct4x8BitPackedMixedSignednessAccelerated(int)]
/// ### integerDotProduct16BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct16BitUnsignedAccelerated] - [Getter][#integerDotProduct16BitUnsignedAccelerated()] - [Setter][#integerDotProduct16BitUnsignedAccelerated(int)]
/// ### integerDotProduct16BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct16BitSignedAccelerated] - [Getter][#integerDotProduct16BitSignedAccelerated()] - [Setter][#integerDotProduct16BitSignedAccelerated(int)]
/// ### integerDotProduct16BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct16BitMixedSignednessAccelerated] - [Getter][#integerDotProduct16BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct16BitMixedSignednessAccelerated(int)]
/// ### integerDotProduct32BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct32BitUnsignedAccelerated] - [Getter][#integerDotProduct32BitUnsignedAccelerated()] - [Setter][#integerDotProduct32BitUnsignedAccelerated(int)]
/// ### integerDotProduct32BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct32BitSignedAccelerated] - [Getter][#integerDotProduct32BitSignedAccelerated()] - [Setter][#integerDotProduct32BitSignedAccelerated(int)]
/// ### integerDotProduct32BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct32BitMixedSignednessAccelerated] - [Getter][#integerDotProduct32BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct32BitMixedSignednessAccelerated(int)]
/// ### integerDotProduct64BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct64BitUnsignedAccelerated] - [Getter][#integerDotProduct64BitUnsignedAccelerated()] - [Setter][#integerDotProduct64BitUnsignedAccelerated(int)]
/// ### integerDotProduct64BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct64BitSignedAccelerated] - [Getter][#integerDotProduct64BitSignedAccelerated()] - [Setter][#integerDotProduct64BitSignedAccelerated(int)]
/// ### integerDotProduct64BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct64BitMixedSignednessAccelerated] - [Getter][#integerDotProduct64BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct64BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating8BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating8BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating8BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating8BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating16BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating16BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating16BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating16BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating32BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating32BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating32BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating32BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating64BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating64BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating64BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating64BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderIntegerDotProductProperties {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     VkBool32 integerDotProduct8BitSignedAccelerated;
///     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     VkBool32 integerDotProduct16BitSignedAccelerated;
///     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     VkBool32 integerDotProduct32BitSignedAccelerated;
///     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     VkBool32 integerDotProduct64BitSignedAccelerated;
///     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
/// } VkPhysicalDeviceShaderIntegerDotProductProperties;
/// ```
public final class VkPhysicalDeviceShaderIntegerDotProductProperties extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderIntegerDotProductProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `integerDotProduct8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderIntegerDotProductProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(segment); }

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerDotProductProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderIntegerDotProductProperties`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderIntegerDotProductProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderIntegerDotProductProperties`
    public static VkPhysicalDeviceShaderIntegerDotProductProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderIntegerDotProductProperties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_pNext(this.segment(), value); return this; }

    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct8BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct8BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct8BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct8BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct8BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct8BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct8BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct8BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct8BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct8BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct4x8BitPackedMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct16BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct16BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct16BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct16BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct16BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct16BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct16BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct16BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct16BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct16BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct32BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct32BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct32BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct32BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct32BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct32BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct32BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct32BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct32BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct32BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct64BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct64BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct64BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct64BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct64BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct64BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct64BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProduct64BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProduct64BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProduct64BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceShaderIntegerDotProductProperties.get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderIntegerDotProductProperties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceShaderIntegerDotProductProperties.set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), value); return this; }

}
