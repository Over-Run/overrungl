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

/// Represents `VkPipelineCacheCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineCacheCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkPipelineCacheCreateFlags flags;
///     size_t initialDataSize;
///     const void* pInitialData;
/// };
/// ```
public final class VkPipelineCacheCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineCacheCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        CanonicalTypes.SIZE_T.withName("initialDataSize"),
        ValueLayout.ADDRESS.withName("pInitialData")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType")));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pNext = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext")));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `initialDataSize`.
    public static final long OFFSET_initialDataSize = LAYOUT.byteOffset(PathElement.groupElement("initialDataSize"));
    /// The memory layout of `initialDataSize`.
    public static final MemoryLayout LAYOUT_initialDataSize = LAYOUT.select(PathElement.groupElement("initialDataSize"));
    /// The [VarHandle] of `initialDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_initialDataSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialDataSize")));
    /// The byte offset of `pInitialData`.
    public static final long OFFSET_pInitialData = LAYOUT.byteOffset(PathElement.groupElement("pInitialData"));
    /// The memory layout of `pInitialData`.
    public static final MemoryLayout LAYOUT_pInitialData = LAYOUT.select(PathElement.groupElement("pInitialData"));
    /// The [VarHandle] of `pInitialData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pInitialData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pInitialData")));

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineCacheCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineCacheCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCacheCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheCreateInfo`
    public static VkPipelineCacheCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineCacheCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineCacheCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheCreateInfo`
    public static VkPipelineCacheCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineCacheCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheCreateInfo copyFrom(VkPipelineCacheCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineCacheCreateInfo reinterpret(long count) { return new VkPipelineCacheCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get().get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.get().set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get().get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.get().set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `initialDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long initialDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_initialDataSize.get().get(segment, 0L, index)); }
    /// {@return `initialDataSize`}
    public long initialDataSize() { return initialDataSize(this.segment(), 0L); }
    /// Sets `initialDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialDataSize(MemorySegment segment, long index, long value) { VH_initialDataSize.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `initialDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo initialDataSize(long value) { initialDataSize(this.segment(), 0L, value); return this; }

    /// {@return `pInitialData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pInitialData(MemorySegment segment, long index) { return (MemorySegment) VH_pInitialData.get().get(segment, 0L, index); }
    /// {@return `pInitialData`}
    public MemorySegment pInitialData() { return pInitialData(this.segment(), 0L); }
    /// Sets `pInitialData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pInitialData(MemorySegment segment, long index, MemorySegment value) { VH_pInitialData.get().set(segment, 0L, index, value); }
    /// Sets `pInitialData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo pInitialData(MemorySegment value) { pInitialData(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineCacheCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineCacheCreateInfo`
    public VkPipelineCacheCreateInfo asSlice(long index) { return new VkPipelineCacheCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineCacheCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineCacheCreateInfo`
    public VkPipelineCacheCreateInfo asSlice(long index, long count) { return new VkPipelineCacheCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineCacheCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineCacheCreateInfo at(long index, Consumer<VkPipelineCacheCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `initialDataSize` at the given index}
    /// @param index the index of the struct buffer
    public long initialDataSizeAt(long index) { return initialDataSize(this.segment(), index); }
    /// Sets `initialDataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo initialDataSizeAt(long index, long value) { initialDataSize(this.segment(), index, value); return this; }

    /// {@return `pInitialData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pInitialDataAt(long index) { return pInitialData(this.segment(), index); }
    /// Sets `pInitialData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheCreateInfo pInitialDataAt(long index, MemorySegment value) { pInitialData(this.segment(), index, value); return this; }

}
