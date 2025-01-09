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
/// ### accelerationStructure
/// [VarHandle][#VH_accelerationStructure] - [Getter][#accelerationStructure()] - [Setter][#accelerationStructure(int)]
/// ### accelerationStructureCaptureReplay
/// [VarHandle][#VH_accelerationStructureCaptureReplay] - [Getter][#accelerationStructureCaptureReplay()] - [Setter][#accelerationStructureCaptureReplay(int)]
/// ### accelerationStructureIndirectBuild
/// [VarHandle][#VH_accelerationStructureIndirectBuild] - [Getter][#accelerationStructureIndirectBuild()] - [Setter][#accelerationStructureIndirectBuild(int)]
/// ### accelerationStructureHostCommands
/// [VarHandle][#VH_accelerationStructureHostCommands] - [Getter][#accelerationStructureHostCommands()] - [Setter][#accelerationStructureHostCommands(int)]
/// ### descriptorBindingAccelerationStructureUpdateAfterBind
/// [VarHandle][#VH_descriptorBindingAccelerationStructureUpdateAfterBind] - [Getter][#descriptorBindingAccelerationStructureUpdateAfterBind()] - [Setter][#descriptorBindingAccelerationStructureUpdateAfterBind(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 accelerationStructure;
///     VkBool32 accelerationStructureCaptureReplay;
///     VkBool32 accelerationStructureIndirectBuild;
///     VkBool32 accelerationStructureHostCommands;
///     VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
/// } VkPhysicalDeviceAccelerationStructureFeaturesKHR;
/// ```
public final class VkPhysicalDeviceAccelerationStructureFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceAccelerationStructureFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructure"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay"),
        ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild"),
        ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands"),
        ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructureCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_accelerationStructureCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCaptureReplay"));
    /// The [VarHandle] of `accelerationStructureIndirectBuild` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_accelerationStructureIndirectBuild = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureIndirectBuild"));
    /// The [VarHandle] of `accelerationStructureHostCommands` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_accelerationStructureHostCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureHostCommands"));
    /// The [VarHandle] of `descriptorBindingAccelerationStructureUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAccelerationStructureFeaturesKHR`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAccelerationStructureFeaturesKHR`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_accelerationStructure(MemorySegment segment, long index) { return (int) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_accelerationStructure(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructure(segment, 0L); }
    /// {@return `accelerationStructure` at the given index}
    /// @param index the index
    public @CType("VkBool32") int accelerationStructureAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructure(this.segment(), index); }
    /// {@return `accelerationStructure`}
    public @CType("VkBool32") int accelerationStructure() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructure(this.segment()); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructure(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructure(segment, 0L, value); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructure(this.segment(), index, value); return this; }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(@CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructure(this.segment(), value); return this; }

    /// {@return `accelerationStructureCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_accelerationStructureCaptureReplay(MemorySegment segment, long index) { return (int) VH_accelerationStructureCaptureReplay.get(segment, 0L, index); }
    /// {@return `accelerationStructureCaptureReplay`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_accelerationStructureCaptureReplay(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureCaptureReplay(segment, 0L); }
    /// {@return `accelerationStructureCaptureReplay` at the given index}
    /// @param index the index
    public @CType("VkBool32") int accelerationStructureCaptureReplayAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureCaptureReplay(this.segment(), index); }
    /// {@return `accelerationStructureCaptureReplay`}
    public @CType("VkBool32") int accelerationStructureCaptureReplay() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureCaptureReplay(this.segment()); }
    /// Sets `accelerationStructureCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureCaptureReplay(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_accelerationStructureCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCaptureReplay` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureCaptureReplay(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureCaptureReplay(segment, 0L, value); }
    /// Sets `accelerationStructureCaptureReplay` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplayAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureCaptureReplay(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(@CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureCaptureReplay(this.segment(), value); return this; }

    /// {@return `accelerationStructureIndirectBuild` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_accelerationStructureIndirectBuild(MemorySegment segment, long index) { return (int) VH_accelerationStructureIndirectBuild.get(segment, 0L, index); }
    /// {@return `accelerationStructureIndirectBuild`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_accelerationStructureIndirectBuild(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureIndirectBuild(segment, 0L); }
    /// {@return `accelerationStructureIndirectBuild` at the given index}
    /// @param index the index
    public @CType("VkBool32") int accelerationStructureIndirectBuildAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureIndirectBuild(this.segment(), index); }
    /// {@return `accelerationStructureIndirectBuild`}
    public @CType("VkBool32") int accelerationStructureIndirectBuild() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureIndirectBuild(this.segment()); }
    /// Sets `accelerationStructureIndirectBuild` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureIndirectBuild(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_accelerationStructureIndirectBuild.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureIndirectBuild` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureIndirectBuild(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureIndirectBuild(segment, 0L, value); }
    /// Sets `accelerationStructureIndirectBuild` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuildAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureIndirectBuild(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureIndirectBuild` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(@CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureIndirectBuild(this.segment(), value); return this; }

    /// {@return `accelerationStructureHostCommands` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_accelerationStructureHostCommands(MemorySegment segment, long index) { return (int) VH_accelerationStructureHostCommands.get(segment, 0L, index); }
    /// {@return `accelerationStructureHostCommands`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_accelerationStructureHostCommands(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureHostCommands(segment, 0L); }
    /// {@return `accelerationStructureHostCommands` at the given index}
    /// @param index the index
    public @CType("VkBool32") int accelerationStructureHostCommandsAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureHostCommands(this.segment(), index); }
    /// {@return `accelerationStructureHostCommands`}
    public @CType("VkBool32") int accelerationStructureHostCommands() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_accelerationStructureHostCommands(this.segment()); }
    /// Sets `accelerationStructureHostCommands` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureHostCommands(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_accelerationStructureHostCommands.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureHostCommands` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureHostCommands(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureHostCommands(segment, 0L, value); }
    /// Sets `accelerationStructureHostCommands` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommandsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureHostCommands(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureHostCommands` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(@CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_accelerationStructureHostCommands(this.segment(), value); return this; }

    /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingAccelerationStructureUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment segment) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_descriptorBindingAccelerationStructureUpdateAfterBind(segment, 0L); }
    /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind` at the given index}
    /// @param index the index
    public @CType("VkBool32") int descriptorBindingAccelerationStructureUpdateAfterBindAt(long index) { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), index); }
    /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind`}
    public @CType("VkBool32") int descriptorBindingAccelerationStructureUpdateAfterBind() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.get_descriptorBindingAccelerationStructureUpdateAfterBind(this.segment()); }
    /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_descriptorBindingAccelerationStructureUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_descriptorBindingAccelerationStructureUpdateAfterBind(segment, 0L, value); }
    /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBindAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), index, value); return this; }
    /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBind(@CType("VkBool32") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.set_descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), value); return this; }

}
