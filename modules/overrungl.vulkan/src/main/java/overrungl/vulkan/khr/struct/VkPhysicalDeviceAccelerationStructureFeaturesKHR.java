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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 accelerationStructure;
///     (uint32_t) VkBool32 accelerationStructureCaptureReplay;
///     (uint32_t) VkBool32 accelerationStructureIndirectBuild;
///     (uint32_t) VkBool32 accelerationStructureHostCommands;
///     (uint32_t) VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
/// };
/// ```
public sealed class VkPhysicalDeviceAccelerationStructureFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceAccelerationStructureFeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructure"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay"),
        ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild"),
        ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands"),
        ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind")
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
    /// The byte offset of `accelerationStructure`.
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    /// The memory layout of `accelerationStructure`.
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    /// The [VarHandle] of `accelerationStructure` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    /// The byte offset of `accelerationStructureCaptureReplay`.
    public static final long OFFSET_accelerationStructureCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCaptureReplay"));
    /// The memory layout of `accelerationStructureCaptureReplay`.
    public static final MemoryLayout LAYOUT_accelerationStructureCaptureReplay = LAYOUT.select(PathElement.groupElement("accelerationStructureCaptureReplay"));
    /// The [VarHandle] of `accelerationStructureCaptureReplay` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCaptureReplay"));
    /// The byte offset of `accelerationStructureIndirectBuild`.
    public static final long OFFSET_accelerationStructureIndirectBuild = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureIndirectBuild"));
    /// The memory layout of `accelerationStructureIndirectBuild`.
    public static final MemoryLayout LAYOUT_accelerationStructureIndirectBuild = LAYOUT.select(PathElement.groupElement("accelerationStructureIndirectBuild"));
    /// The [VarHandle] of `accelerationStructureIndirectBuild` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureIndirectBuild = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureIndirectBuild"));
    /// The byte offset of `accelerationStructureHostCommands`.
    public static final long OFFSET_accelerationStructureHostCommands = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureHostCommands"));
    /// The memory layout of `accelerationStructureHostCommands`.
    public static final MemoryLayout LAYOUT_accelerationStructureHostCommands = LAYOUT.select(PathElement.groupElement("accelerationStructureHostCommands"));
    /// The [VarHandle] of `accelerationStructureHostCommands` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureHostCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureHostCommands"));
    /// The byte offset of `descriptorBindingAccelerationStructureUpdateAfterBind`.
    public static final long OFFSET_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));
    /// The memory layout of `descriptorBindingAccelerationStructureUpdateAfterBind`.
    public static final MemoryLayout LAYOUT_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));
    /// The [VarHandle] of `descriptorBindingAccelerationStructureUpdateAfterBind` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceAccelerationStructureFeaturesKHR`
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceAccelerationStructureFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceAccelerationStructureFeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR copyFrom(VkPhysicalDeviceAccelerationStructureFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int accelerationStructure(MemorySegment segment, long index) { return (int) VH_accelerationStructure.get(segment, 0L, index); }
    /// {@return `accelerationStructure`}
    public int accelerationStructure() { return accelerationStructure(this.segment(), 0L); }
    /// Sets `accelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructure(MemorySegment segment, long index, int value) { VH_accelerationStructure.set(segment, 0L, index, value); }
    /// Sets `accelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(int value) { accelerationStructure(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureCaptureReplay` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int accelerationStructureCaptureReplay(MemorySegment segment, long index) { return (int) VH_accelerationStructureCaptureReplay.get(segment, 0L, index); }
    /// {@return `accelerationStructureCaptureReplay`}
    public int accelerationStructureCaptureReplay() { return accelerationStructureCaptureReplay(this.segment(), 0L); }
    /// Sets `accelerationStructureCaptureReplay` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureCaptureReplay(MemorySegment segment, long index, int value) { VH_accelerationStructureCaptureReplay.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureCaptureReplay` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(int value) { accelerationStructureCaptureReplay(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureIndirectBuild` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int accelerationStructureIndirectBuild(MemorySegment segment, long index) { return (int) VH_accelerationStructureIndirectBuild.get(segment, 0L, index); }
    /// {@return `accelerationStructureIndirectBuild`}
    public int accelerationStructureIndirectBuild() { return accelerationStructureIndirectBuild(this.segment(), 0L); }
    /// Sets `accelerationStructureIndirectBuild` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureIndirectBuild(MemorySegment segment, long index, int value) { VH_accelerationStructureIndirectBuild.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureIndirectBuild` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(int value) { accelerationStructureIndirectBuild(this.segment(), 0L, value); return this; }

    /// {@return `accelerationStructureHostCommands` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int accelerationStructureHostCommands(MemorySegment segment, long index) { return (int) VH_accelerationStructureHostCommands.get(segment, 0L, index); }
    /// {@return `accelerationStructureHostCommands`}
    public int accelerationStructureHostCommands() { return accelerationStructureHostCommands(this.segment(), 0L); }
    /// Sets `accelerationStructureHostCommands` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureHostCommands(MemorySegment segment, long index, int value) { VH_accelerationStructureHostCommands.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureHostCommands` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(int value) { accelerationStructureHostCommands(this.segment(), 0L, value); return this; }

    /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment segment, long index) { return (int) VH_descriptorBindingAccelerationStructureUpdateAfterBind.get(segment, 0L, index); }
    /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind`}
    public int descriptorBindingAccelerationStructureUpdateAfterBind() { return descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), 0L); }
    /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment segment, long index, int value) { VH_descriptorBindingAccelerationStructureUpdateAfterBind.set(segment, 0L, index, value); }
    /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBind(int value) { descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceAccelerationStructureFeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceAccelerationStructureFeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceAccelerationStructureFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceAccelerationStructureFeaturesKHR`
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceAccelerationStructureFeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceAccelerationStructureFeaturesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `accelerationStructure` at the given index}
        /// @param index the index of the struct buffer
        public int accelerationStructureAt(long index) { return accelerationStructure(this.segment(), index); }
        /// Sets `accelerationStructure` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureAt(long index, int value) { accelerationStructure(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureCaptureReplay` at the given index}
        /// @param index the index of the struct buffer
        public int accelerationStructureCaptureReplayAt(long index) { return accelerationStructureCaptureReplay(this.segment(), index); }
        /// Sets `accelerationStructureCaptureReplay` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureCaptureReplayAt(long index, int value) { accelerationStructureCaptureReplay(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureIndirectBuild` at the given index}
        /// @param index the index of the struct buffer
        public int accelerationStructureIndirectBuildAt(long index) { return accelerationStructureIndirectBuild(this.segment(), index); }
        /// Sets `accelerationStructureIndirectBuild` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureIndirectBuildAt(long index, int value) { accelerationStructureIndirectBuild(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureHostCommands` at the given index}
        /// @param index the index of the struct buffer
        public int accelerationStructureHostCommandsAt(long index) { return accelerationStructureHostCommands(this.segment(), index); }
        /// Sets `accelerationStructureHostCommands` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureHostCommandsAt(long index, int value) { accelerationStructureHostCommands(this.segment(), index, value); return this; }

        /// {@return `descriptorBindingAccelerationStructureUpdateAfterBind` at the given index}
        /// @param index the index of the struct buffer
        public int descriptorBindingAccelerationStructureUpdateAfterBindAt(long index) { return descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), index); }
        /// Sets `descriptorBindingAccelerationStructureUpdateAfterBind` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer descriptorBindingAccelerationStructureUpdateAfterBindAt(long index, int value) { descriptorBindingAccelerationStructureUpdateAfterBind(this.segment(), index, value); return this; }

    }
}
