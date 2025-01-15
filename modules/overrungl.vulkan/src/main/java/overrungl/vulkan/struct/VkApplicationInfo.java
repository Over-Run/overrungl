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
/// ### pApplicationName
/// [VarHandle][#VH_pApplicationName] - [Getter][#pApplicationName()] - [Setter][#pApplicationName(java.lang.foreign.MemorySegment)]
/// ### applicationVersion
/// [VarHandle][#VH_applicationVersion] - [Getter][#applicationVersion()] - [Setter][#applicationVersion(int)]
/// ### pEngineName
/// [VarHandle][#VH_pEngineName] - [Getter][#pEngineName()] - [Setter][#pEngineName(java.lang.foreign.MemorySegment)]
/// ### engineVersion
/// [VarHandle][#VH_engineVersion] - [Getter][#engineVersion()] - [Setter][#engineVersion(int)]
/// ### apiVersion
/// [VarHandle][#VH_apiVersion] - [Getter][#apiVersion()] - [Setter][#apiVersion(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkApplicationInfo {
///     VkStructureType sType;
///     const void * pNext;
///     const char * pApplicationName;
///     uint32_t applicationVersion;
///     const char * pEngineName;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// } VkApplicationInfo;
/// ```
public sealed class VkApplicationInfo extends Struct {
    /// The struct layout of `VkApplicationInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pApplicationName"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.ADDRESS.withName("pEngineName"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pApplicationName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pApplicationName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pApplicationName"));
    /// The [VarHandle] of `applicationVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_applicationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationVersion"));
    /// The [VarHandle] of `pEngineName` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pEngineName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pEngineName"));
    /// The [VarHandle] of `engineVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_engineVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineVersion"));
    /// The [VarHandle] of `apiVersion` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));

    /// Creates `VkApplicationInfo` with the given segment.
    /// @param segment the memory segment
    public VkApplicationInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkApplicationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkApplicationInfo(segment); }

    /// Creates `VkApplicationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkApplicationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkApplicationInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkApplicationInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkApplicationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkApplicationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationInfo`
    public static VkApplicationInfo alloc(SegmentAllocator allocator) { return new VkApplicationInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkApplicationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkApplicationInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkApplicationInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkApplicationInfo`
    public static VkApplicationInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("const char *") java.lang.foreign.MemorySegment pApplicationName, @CType("uint32_t") int applicationVersion, @CType("const char *") java.lang.foreign.MemorySegment pEngineName, @CType("uint32_t") int engineVersion, @CType("uint32_t") int apiVersion) { return alloc(allocator).sType(sType).pNext(pNext).pApplicationName(pApplicationName).applicationVersion(applicationVersion).pEngineName(pEngineName).engineVersion(engineVersion).apiVersion(apiVersion); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkApplicationInfo copyFrom(VkApplicationInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkApplicationInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkApplicationInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkApplicationInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo sType(@CType("VkStructureType") int value) { VkApplicationInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkApplicationInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkApplicationInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `pApplicationName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pApplicationName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pApplicationName.get(segment, 0L, index); }
    /// {@return `pApplicationName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pApplicationName(MemorySegment segment) { return VkApplicationInfo.get_pApplicationName(segment, 0L); }
    /// {@return `pApplicationName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pApplicationName() { return VkApplicationInfo.get_pApplicationName(this.segment()); }
    /// Sets `pApplicationName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pApplicationName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pApplicationName.set(segment, 0L, index, value); }
    /// Sets `pApplicationName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pApplicationName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pApplicationName(segment, 0L, value); }
    /// Sets `pApplicationName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pApplicationName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pApplicationName(this.segment(), value); return this; }

    /// {@return `applicationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_applicationVersion(MemorySegment segment, long index) { return (int) VH_applicationVersion.get(segment, 0L, index); }
    /// {@return `applicationVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_applicationVersion(MemorySegment segment) { return VkApplicationInfo.get_applicationVersion(segment, 0L); }
    /// {@return `applicationVersion`}
    public @CType("uint32_t") int applicationVersion() { return VkApplicationInfo.get_applicationVersion(this.segment()); }
    /// Sets `applicationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_applicationVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_applicationVersion.set(segment, 0L, index, value); }
    /// Sets `applicationVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_applicationVersion(MemorySegment segment, @CType("uint32_t") int value) { VkApplicationInfo.set_applicationVersion(segment, 0L, value); }
    /// Sets `applicationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo applicationVersion(@CType("uint32_t") int value) { VkApplicationInfo.set_applicationVersion(this.segment(), value); return this; }

    /// {@return `pEngineName` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pEngineName(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pEngineName.get(segment, 0L, index); }
    /// {@return `pEngineName`}
    /// @param segment the segment of the struct
    public static @CType("const char *") java.lang.foreign.MemorySegment get_pEngineName(MemorySegment segment) { return VkApplicationInfo.get_pEngineName(segment, 0L); }
    /// {@return `pEngineName`}
    public @CType("const char *") java.lang.foreign.MemorySegment pEngineName() { return VkApplicationInfo.get_pEngineName(this.segment()); }
    /// Sets `pEngineName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pEngineName(MemorySegment segment, long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VH_pEngineName.set(segment, 0L, index, value); }
    /// Sets `pEngineName` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pEngineName(MemorySegment segment, @CType("const char *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pEngineName(segment, 0L, value); }
    /// Sets `pEngineName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo pEngineName(@CType("const char *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pEngineName(this.segment(), value); return this; }

    /// {@return `engineVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_engineVersion(MemorySegment segment, long index) { return (int) VH_engineVersion.get(segment, 0L, index); }
    /// {@return `engineVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_engineVersion(MemorySegment segment) { return VkApplicationInfo.get_engineVersion(segment, 0L); }
    /// {@return `engineVersion`}
    public @CType("uint32_t") int engineVersion() { return VkApplicationInfo.get_engineVersion(this.segment()); }
    /// Sets `engineVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_engineVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_engineVersion.set(segment, 0L, index, value); }
    /// Sets `engineVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_engineVersion(MemorySegment segment, @CType("uint32_t") int value) { VkApplicationInfo.set_engineVersion(segment, 0L, value); }
    /// Sets `engineVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo engineVersion(@CType("uint32_t") int value) { VkApplicationInfo.set_engineVersion(this.segment(), value); return this; }

    /// {@return `apiVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_apiVersion(MemorySegment segment, long index) { return (int) VH_apiVersion.get(segment, 0L, index); }
    /// {@return `apiVersion`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_apiVersion(MemorySegment segment) { return VkApplicationInfo.get_apiVersion(segment, 0L); }
    /// {@return `apiVersion`}
    public @CType("uint32_t") int apiVersion() { return VkApplicationInfo.get_apiVersion(this.segment()); }
    /// Sets `apiVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_apiVersion(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_apiVersion.set(segment, 0L, index, value); }
    /// Sets `apiVersion` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_apiVersion(MemorySegment segment, @CType("uint32_t") int value) { VkApplicationInfo.set_apiVersion(segment, 0L, value); }
    /// Sets `apiVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkApplicationInfo apiVersion(@CType("uint32_t") int value) { VkApplicationInfo.set_apiVersion(this.segment(), value); return this; }

    /// A buffer of [VkApplicationInfo].
    public static final class Buffer extends VkApplicationInfo {
        private final long elementCount;

        /// Creates `VkApplicationInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkApplicationInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkApplicationInfo`
        public VkApplicationInfo asSlice(long index) { return new VkApplicationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkApplicationInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkApplicationInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkApplicationInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkApplicationInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkApplicationInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `pApplicationName` at the given index}
        /// @param index the index
        public @CType("const char *") java.lang.foreign.MemorySegment pApplicationNameAt(long index) { return VkApplicationInfo.get_pApplicationName(this.segment(), index); }
        /// Sets `pApplicationName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pApplicationNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pApplicationName(this.segment(), index, value); return this; }

        /// {@return `applicationVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int applicationVersionAt(long index) { return VkApplicationInfo.get_applicationVersion(this.segment(), index); }
        /// Sets `applicationVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer applicationVersionAt(long index, @CType("uint32_t") int value) { VkApplicationInfo.set_applicationVersion(this.segment(), index, value); return this; }

        /// {@return `pEngineName` at the given index}
        /// @param index the index
        public @CType("const char *") java.lang.foreign.MemorySegment pEngineNameAt(long index) { return VkApplicationInfo.get_pEngineName(this.segment(), index); }
        /// Sets `pEngineName` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pEngineNameAt(long index, @CType("const char *") java.lang.foreign.MemorySegment value) { VkApplicationInfo.set_pEngineName(this.segment(), index, value); return this; }

        /// {@return `engineVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int engineVersionAt(long index) { return VkApplicationInfo.get_engineVersion(this.segment(), index); }
        /// Sets `engineVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer engineVersionAt(long index, @CType("uint32_t") int value) { VkApplicationInfo.set_engineVersion(this.segment(), index, value); return this; }

        /// {@return `apiVersion` at the given index}
        /// @param index the index
        public @CType("uint32_t") int apiVersionAt(long index) { return VkApplicationInfo.get_apiVersion(this.segment(), index); }
        /// Sets `apiVersion` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer apiVersionAt(long index, @CType("uint32_t") int value) { VkApplicationInfo.set_apiVersion(this.segment(), index, value); return this; }

    }
}
