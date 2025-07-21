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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkQueueFamilyDataGraphPropertiesARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkPhysicalDeviceDataGraphProcessingEngineARM) VkPhysicalDeviceDataGraphProcessingEngineARM engine;
///     (struct VkPhysicalDeviceDataGraphOperationSupportARM) VkPhysicalDeviceDataGraphOperationSupportARM operation;
/// };
/// ```
public final class VkQueueFamilyDataGraphPropertiesARM extends GroupType {
    /// The struct layout of `VkQueueFamilyDataGraphPropertiesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphProcessingEngineARM.LAYOUT.withName("engine"),
        overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphOperationSupportARM.LAYOUT.withName("operation")
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
    /// The byte offset of `engine`.
    public static final long OFFSET_engine = LAYOUT.byteOffset(PathElement.groupElement("engine"));
    /// The memory layout of `engine`.
    public static final MemoryLayout LAYOUT_engine = LAYOUT.select(PathElement.groupElement("engine"));
    /// The byte offset of `operation`.
    public static final long OFFSET_operation = LAYOUT.byteOffset(PathElement.groupElement("operation"));
    /// The memory layout of `operation`.
    public static final MemoryLayout LAYOUT_operation = LAYOUT.select(PathElement.groupElement("operation"));

    /// Creates `VkQueueFamilyDataGraphPropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkQueueFamilyDataGraphPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkQueueFamilyDataGraphPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyDataGraphPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphPropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyDataGraphPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyDataGraphPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkQueueFamilyDataGraphPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyDataGraphPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkQueueFamilyDataGraphPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkQueueFamilyDataGraphPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyDataGraphPropertiesARM`
    public static VkQueueFamilyDataGraphPropertiesARM alloc(SegmentAllocator allocator) { return new VkQueueFamilyDataGraphPropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkQueueFamilyDataGraphPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyDataGraphPropertiesARM`
    public static VkQueueFamilyDataGraphPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyDataGraphPropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueueFamilyDataGraphPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param engine `engine`
    /// @param operation `operation`
    /// @return the allocated `VkQueueFamilyDataGraphPropertiesARM`
    public static VkQueueFamilyDataGraphPropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment engine, MemorySegment operation) {
        return alloc(allocator).sType(sType).pNext(pNext).engine(engine).operation(operation);
    }

    /// Allocates a `VkQueueFamilyDataGraphPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param engine `engine`
    /// @return the allocated `VkQueueFamilyDataGraphPropertiesARM`
    public static VkQueueFamilyDataGraphPropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment engine) {
        return alloc(allocator).sType(sType).pNext(pNext).engine(engine);
    }

    /// Allocates a `VkQueueFamilyDataGraphPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkQueueFamilyDataGraphPropertiesARM`
    public static VkQueueFamilyDataGraphPropertiesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkQueueFamilyDataGraphPropertiesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkQueueFamilyDataGraphPropertiesARM`
    public static VkQueueFamilyDataGraphPropertiesARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM copyFrom(VkQueueFamilyDataGraphPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkQueueFamilyDataGraphPropertiesARM reinterpret(long count) { return new VkQueueFamilyDataGraphPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkQueueFamilyDataGraphPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkQueueFamilyDataGraphPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `engine` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment engine(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_engine, index), LAYOUT_engine); }
    /// {@return `engine`}
    public MemorySegment engine() { return engine(this.segment(), 0L); }
    /// Sets `engine` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void engine(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_engine, index), LAYOUT_engine.byteSize()); }
    /// Sets `engine` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM engine(MemorySegment value) { engine(this.segment(), 0L, value); return this; }
    /// Accepts `engine` with the given function.
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM engine(Consumer<overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphProcessingEngineARM> func) { func.accept(overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphProcessingEngineARM.of(engine())); return this; }

    /// {@return `operation` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment operation(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_operation, index), LAYOUT_operation); }
    /// {@return `operation`}
    public MemorySegment operation() { return operation(this.segment(), 0L); }
    /// Sets `operation` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void operation(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_operation, index), LAYOUT_operation.byteSize()); }
    /// Sets `operation` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM operation(MemorySegment value) { operation(this.segment(), 0L, value); return this; }
    /// Accepts `operation` with the given function.
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM operation(Consumer<overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphOperationSupportARM> func) { func.accept(overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphOperationSupportARM.of(operation())); return this; }

    /// Creates a slice of `VkQueueFamilyDataGraphPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyDataGraphPropertiesARM`
    public VkQueueFamilyDataGraphPropertiesARM asSlice(long index) { return new VkQueueFamilyDataGraphPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkQueueFamilyDataGraphPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyDataGraphPropertiesARM`
    public VkQueueFamilyDataGraphPropertiesARM asSlice(long index, long count) { return new VkQueueFamilyDataGraphPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkQueueFamilyDataGraphPropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM at(long index, Consumer<VkQueueFamilyDataGraphPropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `engine` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment engineAt(long index) { return engine(this.segment(), index); }
    /// Sets `engine` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM engineAt(long index, MemorySegment value) { engine(this.segment(), index, value); return this; }
    /// Accepts `engine` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM engineAt(long index, Consumer<overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphProcessingEngineARM> func) { func.accept(overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphProcessingEngineARM.of(engineAt(index))); return this; }

    /// {@return `operation` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment operationAt(long index) { return operation(this.segment(), index); }
    /// Sets `operation` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM operationAt(long index, MemorySegment value) { operation(this.segment(), index, value); return this; }
    /// Accepts `operation` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkQueueFamilyDataGraphPropertiesARM operationAt(long index, Consumer<overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphOperationSupportARM> func) { func.accept(overrungl.vulkan.arm.struct.VkPhysicalDeviceDataGraphOperationSupportARM.of(operationAt(index))); return this; }

}
