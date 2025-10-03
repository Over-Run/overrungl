// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDataGraphPipelineCompilerControlCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineCompilerControlCreateInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const char* pVendorOptions;
/// };
/// ```
public final class VkDataGraphPipelineCompilerControlCreateInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineCompilerControlCreateInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVendorOptions")
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
    /// The byte offset of `pVendorOptions`.
    public static final long OFFSET_pVendorOptions = LAYOUT.byteOffset(PathElement.groupElement("pVendorOptions"));
    /// The memory layout of `pVendorOptions`.
    public static final MemoryLayout LAYOUT_pVendorOptions = LAYOUT.select(PathElement.groupElement("pVendorOptions"));
    /// The [VarHandle] of `pVendorOptions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVendorOptions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVendorOptions"));

    /// Creates `VkDataGraphPipelineCompilerControlCreateInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineCompilerControlCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineCompilerControlCreateInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCompilerControlCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineCompilerControlCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCompilerControlCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineCompilerControlCreateInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineCompilerControlCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineCompilerControlCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineCompilerControlCreateInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineCompilerControlCreateInfoARM`
    public static VkDataGraphPipelineCompilerControlCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineCompilerControlCreateInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineCompilerControlCreateInfoARM`
    public static VkDataGraphPipelineCompilerControlCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineCompilerControlCreateInfoARM copyFrom(VkDataGraphPipelineCompilerControlCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineCompilerControlCreateInfoARM reinterpret(long count) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDataGraphPipelineCompilerControlCreateInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDataGraphPipelineCompilerControlCreateInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pVendorOptions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVendorOptions(MemorySegment segment, long index) { return (MemorySegment) VH_pVendorOptions.get(segment, 0L, index); }
    /// {@return `pVendorOptions`}
    public MemorySegment pVendorOptions() { return pVendorOptions(this.segment(), 0L); }
    /// Sets `pVendorOptions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVendorOptions(MemorySegment segment, long index, MemorySegment value) { VH_pVendorOptions.set(segment, 0L, index, value); }
    /// Sets `pVendorOptions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptions(MemorySegment value) { pVendorOptions(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineCompilerControlCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineCompilerControlCreateInfoARM`
    public VkDataGraphPipelineCompilerControlCreateInfoARM asSlice(long index) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineCompilerControlCreateInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineCompilerControlCreateInfoARM`
    public VkDataGraphPipelineCompilerControlCreateInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineCompilerControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineCompilerControlCreateInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineCompilerControlCreateInfoARM at(long index, Consumer<VkDataGraphPipelineCompilerControlCreateInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCompilerControlCreateInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCompilerControlCreateInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pVendorOptions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVendorOptionsAt(long index) { return pVendorOptions(this.segment(), index); }
    /// Sets `pVendorOptions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineCompilerControlCreateInfoARM pVendorOptionsAt(long index, MemorySegment value) { pVendorOptions(this.segment(), index, value); return this; }

}
