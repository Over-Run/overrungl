// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderResourceUsageAMD`.
/// ## Layout
/// ```
/// struct VkShaderResourceUsageAMD {
///     uint32_t numUsedVgprs;
///     uint32_t numUsedSgprs;
///     uint32_t ldsSizePerLocalWorkGroup;
///     size_t ldsUsageSizeInBytes;
///     size_t scratchMemUsageInBytes;
/// };
/// ```
public final class VkShaderResourceUsageAMD extends GroupType {
    /// The struct layout of `VkShaderResourceUsageAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        CanonicalTypes.SIZE_T.withName("ldsUsageSizeInBytes"),
        CanonicalTypes.SIZE_T.withName("scratchMemUsageInBytes")
    );
    /// The byte offset of `numUsedVgprs`.
    public static final long OFFSET_numUsedVgprs = LAYOUT.byteOffset(PathElement.groupElement("numUsedVgprs"));
    /// The memory layout of `numUsedVgprs`.
    public static final MemoryLayout LAYOUT_numUsedVgprs = LAYOUT.select(PathElement.groupElement("numUsedVgprs"));
    /// The [VarHandle] of `numUsedVgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_numUsedVgprs = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedVgprs")));
    /// The byte offset of `numUsedSgprs`.
    public static final long OFFSET_numUsedSgprs = LAYOUT.byteOffset(PathElement.groupElement("numUsedSgprs"));
    /// The memory layout of `numUsedSgprs`.
    public static final MemoryLayout LAYOUT_numUsedSgprs = LAYOUT.select(PathElement.groupElement("numUsedSgprs"));
    /// The [VarHandle] of `numUsedSgprs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_numUsedSgprs = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("numUsedSgprs")));
    /// The byte offset of `ldsSizePerLocalWorkGroup`.
    public static final long OFFSET_ldsSizePerLocalWorkGroup = LAYOUT.byteOffset(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    /// The memory layout of `ldsSizePerLocalWorkGroup`.
    public static final MemoryLayout LAYOUT_ldsSizePerLocalWorkGroup = LAYOUT.select(PathElement.groupElement("ldsSizePerLocalWorkGroup"));
    /// The [VarHandle] of `ldsSizePerLocalWorkGroup` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_ldsSizePerLocalWorkGroup = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsSizePerLocalWorkGroup")));
    /// The byte offset of `ldsUsageSizeInBytes`.
    public static final long OFFSET_ldsUsageSizeInBytes = LAYOUT.byteOffset(PathElement.groupElement("ldsUsageSizeInBytes"));
    /// The memory layout of `ldsUsageSizeInBytes`.
    public static final MemoryLayout LAYOUT_ldsUsageSizeInBytes = LAYOUT.select(PathElement.groupElement("ldsUsageSizeInBytes"));
    /// The [VarHandle] of `ldsUsageSizeInBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_ldsUsageSizeInBytes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("ldsUsageSizeInBytes")));
    /// The byte offset of `scratchMemUsageInBytes`.
    public static final long OFFSET_scratchMemUsageInBytes = LAYOUT.byteOffset(PathElement.groupElement("scratchMemUsageInBytes"));
    /// The memory layout of `scratchMemUsageInBytes`.
    public static final MemoryLayout LAYOUT_scratchMemUsageInBytes = LAYOUT.select(PathElement.groupElement("scratchMemUsageInBytes"));
    /// The [VarHandle] of `scratchMemUsageInBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_scratchMemUsageInBytes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchMemUsageInBytes")));

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkShaderResourceUsageAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkShaderResourceUsageAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkShaderResourceUsageAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderResourceUsageAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkShaderResourceUsageAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkShaderResourceUsageAMD`
    public static VkShaderResourceUsageAMD alloc(SegmentAllocator allocator, long count) { return new VkShaderResourceUsageAMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkShaderResourceUsageAMD copyFrom(VkShaderResourceUsageAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkShaderResourceUsageAMD reinterpret(long count) { return new VkShaderResourceUsageAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `numUsedVgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numUsedVgprs(MemorySegment segment, long index) { return (int) VH_numUsedVgprs.get().get(segment, 0L, index); }
    /// {@return `numUsedVgprs`}
    public int numUsedVgprs() { return numUsedVgprs(this.segment(), 0L); }
    /// Sets `numUsedVgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numUsedVgprs(MemorySegment segment, long index, int value) { VH_numUsedVgprs.get().set(segment, 0L, index, value); }
    /// Sets `numUsedVgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedVgprs(int value) { numUsedVgprs(this.segment(), 0L, value); return this; }

    /// {@return `numUsedSgprs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int numUsedSgprs(MemorySegment segment, long index) { return (int) VH_numUsedSgprs.get().get(segment, 0L, index); }
    /// {@return `numUsedSgprs`}
    public int numUsedSgprs() { return numUsedSgprs(this.segment(), 0L); }
    /// Sets `numUsedSgprs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void numUsedSgprs(MemorySegment segment, long index, int value) { VH_numUsedSgprs.get().set(segment, 0L, index, value); }
    /// Sets `numUsedSgprs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedSgprs(int value) { numUsedSgprs(this.segment(), 0L, value); return this; }

    /// {@return `ldsSizePerLocalWorkGroup` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ldsSizePerLocalWorkGroup(MemorySegment segment, long index) { return (int) VH_ldsSizePerLocalWorkGroup.get().get(segment, 0L, index); }
    /// {@return `ldsSizePerLocalWorkGroup`}
    public int ldsSizePerLocalWorkGroup() { return ldsSizePerLocalWorkGroup(this.segment(), 0L); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ldsSizePerLocalWorkGroup(MemorySegment segment, long index, int value) { VH_ldsSizePerLocalWorkGroup.get().set(segment, 0L, index, value); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroup(int value) { ldsSizePerLocalWorkGroup(this.segment(), 0L, value); return this; }

    /// {@return `ldsUsageSizeInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long ldsUsageSizeInBytes(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_ldsUsageSizeInBytes.get().get(segment, 0L, index)); }
    /// {@return `ldsUsageSizeInBytes`}
    public long ldsUsageSizeInBytes() { return ldsUsageSizeInBytes(this.segment(), 0L); }
    /// Sets `ldsUsageSizeInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ldsUsageSizeInBytes(MemorySegment segment, long index, long value) { VH_ldsUsageSizeInBytes.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `ldsUsageSizeInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsUsageSizeInBytes(long value) { ldsUsageSizeInBytes(this.segment(), 0L, value); return this; }

    /// {@return `scratchMemUsageInBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long scratchMemUsageInBytes(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_scratchMemUsageInBytes.get().get(segment, 0L, index)); }
    /// {@return `scratchMemUsageInBytes`}
    public long scratchMemUsageInBytes() { return scratchMemUsageInBytes(this.segment(), 0L); }
    /// Sets `scratchMemUsageInBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scratchMemUsageInBytes(MemorySegment segment, long index, long value) { VH_scratchMemUsageInBytes.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `scratchMemUsageInBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD scratchMemUsageInBytes(long value) { scratchMemUsageInBytes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkShaderResourceUsageAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkShaderResourceUsageAMD`
    public VkShaderResourceUsageAMD asSlice(long index) { return new VkShaderResourceUsageAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkShaderResourceUsageAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkShaderResourceUsageAMD`
    public VkShaderResourceUsageAMD asSlice(long index, long count) { return new VkShaderResourceUsageAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkShaderResourceUsageAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkShaderResourceUsageAMD at(long index, Consumer<VkShaderResourceUsageAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `numUsedVgprs` at the given index}
    /// @param index the index of the struct buffer
    public int numUsedVgprsAt(long index) { return numUsedVgprs(this.segment(), index); }
    /// Sets `numUsedVgprs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedVgprsAt(long index, int value) { numUsedVgprs(this.segment(), index, value); return this; }

    /// {@return `numUsedSgprs` at the given index}
    /// @param index the index of the struct buffer
    public int numUsedSgprsAt(long index) { return numUsedSgprs(this.segment(), index); }
    /// Sets `numUsedSgprs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD numUsedSgprsAt(long index, int value) { numUsedSgprs(this.segment(), index, value); return this; }

    /// {@return `ldsSizePerLocalWorkGroup` at the given index}
    /// @param index the index of the struct buffer
    public int ldsSizePerLocalWorkGroupAt(long index) { return ldsSizePerLocalWorkGroup(this.segment(), index); }
    /// Sets `ldsSizePerLocalWorkGroup` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsSizePerLocalWorkGroupAt(long index, int value) { ldsSizePerLocalWorkGroup(this.segment(), index, value); return this; }

    /// {@return `ldsUsageSizeInBytes` at the given index}
    /// @param index the index of the struct buffer
    public long ldsUsageSizeInBytesAt(long index) { return ldsUsageSizeInBytes(this.segment(), index); }
    /// Sets `ldsUsageSizeInBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD ldsUsageSizeInBytesAt(long index, long value) { ldsUsageSizeInBytes(this.segment(), index, value); return this; }

    /// {@return `scratchMemUsageInBytes` at the given index}
    /// @param index the index of the struct buffer
    public long scratchMemUsageInBytesAt(long index) { return scratchMemUsageInBytes(this.segment(), index); }
    /// Sets `scratchMemUsageInBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkShaderResourceUsageAMD scratchMemUsageInBytesAt(long index, long value) { scratchMemUsageInBytes(this.segment(), index, value); return this; }

}
