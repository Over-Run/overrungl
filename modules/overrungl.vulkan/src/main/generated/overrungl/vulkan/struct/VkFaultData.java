// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkFaultData`.
/// ## Layout
/// ```
/// struct VkFaultData {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkFaultLevel faultLevel;
///     (int) VkFaultType faultType;
/// };
/// ```
public final class VkFaultData extends GroupType {
    /// The struct layout of `VkFaultData`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("faultLevel"),
        ValueLayout.JAVA_INT.withName("faultType")
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
    /// The byte offset of `faultLevel`.
    public static final long OFFSET_faultLevel = LAYOUT.byteOffset(PathElement.groupElement("faultLevel"));
    /// The memory layout of `faultLevel`.
    public static final MemoryLayout LAYOUT_faultLevel = LAYOUT.select(PathElement.groupElement("faultLevel"));
    /// The [VarHandle] of `faultLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_faultLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("faultLevel"));
    /// The byte offset of `faultType`.
    public static final long OFFSET_faultType = LAYOUT.byteOffset(PathElement.groupElement("faultType"));
    /// The memory layout of `faultType`.
    public static final MemoryLayout LAYOUT_faultType = LAYOUT.select(PathElement.groupElement("faultType"));
    /// The [VarHandle] of `faultType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_faultType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("faultType"));

    /// Creates `VkFaultData` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFaultData(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFaultData` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultData of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFaultData(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFaultData` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultData ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFaultData(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFaultData` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultData ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFaultData(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFaultData` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFaultData`
    public static VkFaultData alloc(SegmentAllocator allocator) { return new VkFaultData(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFaultData` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFaultData`
    public static VkFaultData alloc(SegmentAllocator allocator, long count) { return new VkFaultData(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFaultData copyFrom(VkFaultData src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFaultData reinterpret(long count) { return new VkFaultData(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFaultData sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFaultData pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `faultLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int faultLevel(MemorySegment segment, long index) { return (int) VH_faultLevel.get(segment, 0L, index); }
    /// {@return `faultLevel`}
    public int faultLevel() { return faultLevel(this.segment(), 0L); }
    /// Sets `faultLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void faultLevel(MemorySegment segment, long index, int value) { VH_faultLevel.set(segment, 0L, index, value); }
    /// Sets `faultLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultData faultLevel(int value) { faultLevel(this.segment(), 0L, value); return this; }

    /// {@return `faultType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int faultType(MemorySegment segment, long index) { return (int) VH_faultType.get(segment, 0L, index); }
    /// {@return `faultType`}
    public int faultType() { return faultType(this.segment(), 0L); }
    /// Sets `faultType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void faultType(MemorySegment segment, long index, int value) { VH_faultType.set(segment, 0L, index, value); }
    /// Sets `faultType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultData faultType(int value) { faultType(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFaultData`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFaultData`
    public VkFaultData asSlice(long index) { return new VkFaultData(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFaultData`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFaultData`
    public VkFaultData asSlice(long index, long count) { return new VkFaultData(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFaultData` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFaultData at(long index, Consumer<VkFaultData> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFaultData sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFaultData pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `faultLevel` at the given index}
    /// @param index the index of the struct buffer
    public int faultLevelAt(long index) { return faultLevel(this.segment(), index); }
    /// Sets `faultLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFaultData faultLevelAt(long index, int value) { faultLevel(this.segment(), index, value); return this; }

    /// {@return `faultType` at the given index}
    /// @param index the index of the struct buffer
    public int faultTypeAt(long index) { return faultType(this.segment(), index); }
    /// Sets `faultType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFaultData faultTypeAt(long index, int value) { faultType(this.segment(), index, value); return this; }

}
