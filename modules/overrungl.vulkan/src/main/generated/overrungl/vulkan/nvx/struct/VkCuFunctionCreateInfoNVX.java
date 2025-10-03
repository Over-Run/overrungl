// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nvx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCuFunctionCreateInfoNVX`.
/// ## Layout
/// ```
/// struct VkCuFunctionCreateInfoNVX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkCuModuleNVX module;
///     const char* pName;
/// };
/// ```
public final class VkCuFunctionCreateInfoNVX extends GroupType {
    /// The struct layout of `VkCuFunctionCreateInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("module"),
        ValueLayout.ADDRESS.withName("pName")
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
    /// The byte offset of `module`.
    public static final long OFFSET_module = LAYOUT.byteOffset(PathElement.groupElement("module"));
    /// The memory layout of `module`.
    public static final MemoryLayout LAYOUT_module = LAYOUT.select(PathElement.groupElement("module"));
    /// The [VarHandle] of `module` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    /// The byte offset of `pName`.
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    /// The memory layout of `pName`.
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    /// The [VarHandle] of `pName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCuFunctionCreateInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuFunctionCreateInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuFunctionCreateInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCuFunctionCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuFunctionCreateInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCuFunctionCreateInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCuFunctionCreateInfoNVX`
    public static VkCuFunctionCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuFunctionCreateInfoNVX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCuFunctionCreateInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCuFunctionCreateInfoNVX`
    public static VkCuFunctionCreateInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkCuFunctionCreateInfoNVX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCuFunctionCreateInfoNVX copyFrom(VkCuFunctionCreateInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCuFunctionCreateInfoNVX reinterpret(long count) { return new VkCuFunctionCreateInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCuFunctionCreateInfoNVX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCuFunctionCreateInfoNVX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `module` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long module(MemorySegment segment, long index) { return (long) VH_module.get(segment, 0L, index); }
    /// {@return `module`}
    public long module() { return module(this.segment(), 0L); }
    /// Sets `module` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void module(MemorySegment segment, long index, long value) { VH_module.set(segment, 0L, index, value); }
    /// Sets `module` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX module(long value) { module(this.segment(), 0L, value); return this; }

    /// {@return `pName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pName(MemorySegment segment, long index) { return (MemorySegment) VH_pName.get(segment, 0L, index); }
    /// {@return `pName`}
    public MemorySegment pName() { return pName(this.segment(), 0L); }
    /// Sets `pName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pName(MemorySegment segment, long index, MemorySegment value) { VH_pName.set(segment, 0L, index, value); }
    /// Sets `pName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pName(MemorySegment value) { pName(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCuFunctionCreateInfoNVX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCuFunctionCreateInfoNVX`
    public VkCuFunctionCreateInfoNVX asSlice(long index) { return new VkCuFunctionCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCuFunctionCreateInfoNVX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCuFunctionCreateInfoNVX`
    public VkCuFunctionCreateInfoNVX asSlice(long index, long count) { return new VkCuFunctionCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCuFunctionCreateInfoNVX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCuFunctionCreateInfoNVX at(long index, Consumer<VkCuFunctionCreateInfoNVX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `module` at the given index}
    /// @param index the index of the struct buffer
    public long moduleAt(long index) { return module(this.segment(), index); }
    /// Sets `module` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX moduleAt(long index, long value) { module(this.segment(), index, value); return this; }

    /// {@return `pName` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNameAt(long index) { return pName(this.segment(), index); }
    /// Sets `pName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuFunctionCreateInfoNVX pNameAt(long index, MemorySegment value) { pName(this.segment(), index, value); return this; }

}
