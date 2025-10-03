// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHostImageCopyDevicePerformanceQueryEXT`.
/// ## Layout
/// ```
/// struct VkHostImageCopyDevicePerformanceQueryEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 optimalDeviceAccess;
///     (uint32_t) VkBool32 identicalMemoryLayout;
/// };
/// ```
public final class VkHostImageCopyDevicePerformanceQueryEXT extends GroupType {
    /// The struct layout of `VkHostImageCopyDevicePerformanceQueryEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalDeviceAccess"),
        ValueLayout.JAVA_INT.withName("identicalMemoryLayout")
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
    /// The byte offset of `optimalDeviceAccess`.
    public static final long OFFSET_optimalDeviceAccess = LAYOUT.byteOffset(PathElement.groupElement("optimalDeviceAccess"));
    /// The memory layout of `optimalDeviceAccess`.
    public static final MemoryLayout LAYOUT_optimalDeviceAccess = LAYOUT.select(PathElement.groupElement("optimalDeviceAccess"));
    /// The [VarHandle] of `optimalDeviceAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_optimalDeviceAccess = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalDeviceAccess"));
    /// The byte offset of `identicalMemoryLayout`.
    public static final long OFFSET_identicalMemoryLayout = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryLayout"));
    /// The memory layout of `identicalMemoryLayout`.
    public static final MemoryLayout LAYOUT_identicalMemoryLayout = LAYOUT.select(PathElement.groupElement("identicalMemoryLayout"));
    /// The [VarHandle] of `identicalMemoryLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_identicalMemoryLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryLayout"));

    /// Creates `VkHostImageCopyDevicePerformanceQueryEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkHostImageCopyDevicePerformanceQueryEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkHostImageCopyDevicePerformanceQueryEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageCopyDevicePerformanceQueryEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQueryEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkHostImageCopyDevicePerformanceQueryEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageCopyDevicePerformanceQueryEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQueryEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkHostImageCopyDevicePerformanceQueryEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageCopyDevicePerformanceQueryEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHostImageCopyDevicePerformanceQueryEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkHostImageCopyDevicePerformanceQueryEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHostImageCopyDevicePerformanceQueryEXT`
    public static VkHostImageCopyDevicePerformanceQueryEXT alloc(SegmentAllocator allocator) { return new VkHostImageCopyDevicePerformanceQueryEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkHostImageCopyDevicePerformanceQueryEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHostImageCopyDevicePerformanceQueryEXT`
    public static VkHostImageCopyDevicePerformanceQueryEXT alloc(SegmentAllocator allocator, long count) { return new VkHostImageCopyDevicePerformanceQueryEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT copyFrom(VkHostImageCopyDevicePerformanceQueryEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkHostImageCopyDevicePerformanceQueryEXT reinterpret(long count) { return new VkHostImageCopyDevicePerformanceQueryEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkHostImageCopyDevicePerformanceQueryEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkHostImageCopyDevicePerformanceQueryEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `optimalDeviceAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int optimalDeviceAccess(MemorySegment segment, long index) { return (int) VH_optimalDeviceAccess.get(segment, 0L, index); }
    /// {@return `optimalDeviceAccess`}
    public int optimalDeviceAccess() { return optimalDeviceAccess(this.segment(), 0L); }
    /// Sets `optimalDeviceAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalDeviceAccess(MemorySegment segment, long index, int value) { VH_optimalDeviceAccess.set(segment, 0L, index, value); }
    /// Sets `optimalDeviceAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT optimalDeviceAccess(int value) { optimalDeviceAccess(this.segment(), 0L, value); return this; }

    /// {@return `identicalMemoryLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int identicalMemoryLayout(MemorySegment segment, long index) { return (int) VH_identicalMemoryLayout.get(segment, 0L, index); }
    /// {@return `identicalMemoryLayout`}
    public int identicalMemoryLayout() { return identicalMemoryLayout(this.segment(), 0L); }
    /// Sets `identicalMemoryLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identicalMemoryLayout(MemorySegment segment, long index, int value) { VH_identicalMemoryLayout.set(segment, 0L, index, value); }
    /// Sets `identicalMemoryLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT identicalMemoryLayout(int value) { identicalMemoryLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkHostImageCopyDevicePerformanceQueryEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkHostImageCopyDevicePerformanceQueryEXT`
    public VkHostImageCopyDevicePerformanceQueryEXT asSlice(long index) { return new VkHostImageCopyDevicePerformanceQueryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkHostImageCopyDevicePerformanceQueryEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkHostImageCopyDevicePerformanceQueryEXT`
    public VkHostImageCopyDevicePerformanceQueryEXT asSlice(long index, long count) { return new VkHostImageCopyDevicePerformanceQueryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkHostImageCopyDevicePerformanceQueryEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT at(long index, Consumer<VkHostImageCopyDevicePerformanceQueryEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `optimalDeviceAccess` at the given index}
    /// @param index the index of the struct buffer
    public int optimalDeviceAccessAt(long index) { return optimalDeviceAccess(this.segment(), index); }
    /// Sets `optimalDeviceAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT optimalDeviceAccessAt(long index, int value) { optimalDeviceAccess(this.segment(), index, value); return this; }

    /// {@return `identicalMemoryLayout` at the given index}
    /// @param index the index of the struct buffer
    public int identicalMemoryLayoutAt(long index) { return identicalMemoryLayout(this.segment(), index); }
    /// Sets `identicalMemoryLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHostImageCopyDevicePerformanceQueryEXT identicalMemoryLayoutAt(long index, int value) { identicalMemoryLayout(this.segment(), index, value); return this; }

}
