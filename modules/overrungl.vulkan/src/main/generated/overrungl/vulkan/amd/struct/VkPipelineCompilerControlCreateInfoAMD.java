// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPipelineCompilerControlCreateInfoAMD`.
/// ## Layout
/// ```
/// struct VkPipelineCompilerControlCreateInfoAMD {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCompilerControlFlagsAMD compilerControlFlags;
/// };
/// ```
public final class VkPipelineCompilerControlCreateInfoAMD extends GroupType {
    /// The struct layout of `VkPipelineCompilerControlCreateInfoAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compilerControlFlags")
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
    /// The byte offset of `compilerControlFlags`.
    public static final long OFFSET_compilerControlFlags = LAYOUT.byteOffset(PathElement.groupElement("compilerControlFlags"));
    /// The memory layout of `compilerControlFlags`.
    public static final MemoryLayout LAYOUT_compilerControlFlags = LAYOUT.select(PathElement.groupElement("compilerControlFlags"));
    /// The [VarHandle] of `compilerControlFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compilerControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compilerControlFlags"));

    /// Creates `VkPipelineCompilerControlCreateInfoAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCompilerControlCreateInfoAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCompilerControlCreateInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCompilerControlCreateInfoAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCompilerControlCreateInfoAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCompilerControlCreateInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCompilerControlCreateInfoAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCompilerControlCreateInfoAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCompilerControlCreateInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCompilerControlCreateInfoAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCompilerControlCreateInfoAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCompilerControlCreateInfoAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCompilerControlCreateInfoAMD`
    public static VkPipelineCompilerControlCreateInfoAMD alloc(SegmentAllocator allocator) { return new VkPipelineCompilerControlCreateInfoAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCompilerControlCreateInfoAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCompilerControlCreateInfoAMD`
    public static VkPipelineCompilerControlCreateInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkPipelineCompilerControlCreateInfoAMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCompilerControlCreateInfoAMD copyFrom(VkPipelineCompilerControlCreateInfoAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCompilerControlCreateInfoAMD reinterpret(long count) { return new VkPipelineCompilerControlCreateInfoAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineCompilerControlCreateInfoAMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineCompilerControlCreateInfoAMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `compilerControlFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compilerControlFlags(MemorySegment segment, long index) { return (int) VH_compilerControlFlags.get(segment, 0L, index); }
    /// {@return `compilerControlFlags`}
    public int compilerControlFlags() { return compilerControlFlags(this.segment(), 0L); }
    /// Sets `compilerControlFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compilerControlFlags(MemorySegment segment, long index, int value) { VH_compilerControlFlags.set(segment, 0L, index, value); }
    /// Sets `compilerControlFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlags(int value) { compilerControlFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCompilerControlCreateInfoAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCompilerControlCreateInfoAMD`
    public VkPipelineCompilerControlCreateInfoAMD asSlice(long index) { return new VkPipelineCompilerControlCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCompilerControlCreateInfoAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCompilerControlCreateInfoAMD`
    public VkPipelineCompilerControlCreateInfoAMD asSlice(long index, long count) { return new VkPipelineCompilerControlCreateInfoAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCompilerControlCreateInfoAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCompilerControlCreateInfoAMD at(long index, Consumer<VkPipelineCompilerControlCreateInfoAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCompilerControlCreateInfoAMD sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCompilerControlCreateInfoAMD pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `compilerControlFlags` at the given index}
    /// @param index the index of the struct buffer
    public int compilerControlFlagsAt(long index) { return compilerControlFlags(this.segment(), index); }
    /// Sets `compilerControlFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlagsAt(long index, int value) { compilerControlFlags(this.segment(), index, value); return this; }

}
