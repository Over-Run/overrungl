// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VmaAllocationCreateInfo`.
/// ## Layout
/// ```
/// struct VmaAllocationCreateInfo {
///     ((uint32_t) VkFlags) VmaAllocationCreateFlags flags;
///     (int) VmaMemoryUsage usage;
///     ((uint32_t) VkFlags) VkMemoryPropertyFlags requiredFlags;
///     ((uint32_t) VkFlags) VkMemoryPropertyFlags preferredFlags;
///     uint32_t memoryTypeBits;
///     (struct VmaPool *) VmaPool pool;
///     void* pUserData;
///     float priority;
/// };
/// ```
public final class VmaAllocationCreateInfo extends GroupType {
    /// The struct layout of `VmaAllocationCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("requiredFlags"),
        ValueLayout.JAVA_INT.withName("preferredFlags"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits"),
        ValueLayout.ADDRESS.withName("pool"),
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.JAVA_FLOAT.withName("priority")
    );
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `usage`.
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    /// The memory layout of `usage`.
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_usage = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage")));
    /// The byte offset of `requiredFlags`.
    public static final long OFFSET_requiredFlags = LAYOUT.byteOffset(PathElement.groupElement("requiredFlags"));
    /// The memory layout of `requiredFlags`.
    public static final MemoryLayout LAYOUT_requiredFlags = LAYOUT.select(PathElement.groupElement("requiredFlags"));
    /// The [VarHandle] of `requiredFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_requiredFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredFlags")));
    /// The byte offset of `preferredFlags`.
    public static final long OFFSET_preferredFlags = LAYOUT.byteOffset(PathElement.groupElement("preferredFlags"));
    /// The memory layout of `preferredFlags`.
    public static final MemoryLayout LAYOUT_preferredFlags = LAYOUT.select(PathElement.groupElement("preferredFlags"));
    /// The [VarHandle] of `preferredFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_preferredFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredFlags")));
    /// The byte offset of `memoryTypeBits`.
    public static final long OFFSET_memoryTypeBits = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
    /// The memory layout of `memoryTypeBits`.
    public static final MemoryLayout LAYOUT_memoryTypeBits = LAYOUT.select(PathElement.groupElement("memoryTypeBits"));
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_memoryTypeBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits")));
    /// The byte offset of `pool`.
    public static final long OFFSET_pool = LAYOUT.byteOffset(PathElement.groupElement("pool"));
    /// The memory layout of `pool`.
    public static final MemoryLayout LAYOUT_pool = LAYOUT.select(PathElement.groupElement("pool"));
    /// The [VarHandle] of `pool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pool = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pool")));
    /// The byte offset of `pUserData`.
    public static final long OFFSET_pUserData = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
    /// The memory layout of `pUserData`.
    public static final MemoryLayout LAYOUT_pUserData = LAYOUT.select(PathElement.groupElement("pUserData"));
    /// The [VarHandle] of `pUserData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pUserData = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pUserData")));
    /// The byte offset of `priority`.
    public static final long OFFSET_priority = LAYOUT.byteOffset(PathElement.groupElement("priority"));
    /// The memory layout of `priority`.
    public static final MemoryLayout LAYOUT_priority = LAYOUT.select(PathElement.groupElement("priority"));
    /// The [VarHandle] of `priority` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_priority = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("priority")));

    /// Creates `VmaAllocationCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VmaAllocationCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VmaAllocationCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VmaAllocationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VmaAllocationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VmaAllocationCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VmaAllocationCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VmaAllocationCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VmaAllocationCreateInfo`
    public static VmaAllocationCreateInfo alloc(SegmentAllocator allocator) { return new VmaAllocationCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VmaAllocationCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VmaAllocationCreateInfo`
    public static VmaAllocationCreateInfo alloc(SegmentAllocator allocator, long count) { return new VmaAllocationCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VmaAllocationCreateInfo copyFrom(VmaAllocationCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VmaAllocationCreateInfo reinterpret(long count) { return new VmaAllocationCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VmaAllocationCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int usage(MemorySegment segment, long index) { return (int) VH_usage.get().get(segment, 0L, index); }
    /// {@return `usage`}
    public int usage() { return usage(this.segment(), 0L); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage(MemorySegment segment, long index, int value) { VH_usage.get().set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo usage(int value) { usage(this.segment(), 0L, value); return this; }

    /// {@return `requiredFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiredFlags(MemorySegment segment, long index) { return (int) VH_requiredFlags.get().get(segment, 0L, index); }
    /// {@return `requiredFlags`}
    public int requiredFlags() { return requiredFlags(this.segment(), 0L); }
    /// Sets `requiredFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiredFlags(MemorySegment segment, long index, int value) { VH_requiredFlags.get().set(segment, 0L, index, value); }
    /// Sets `requiredFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo requiredFlags(int value) { requiredFlags(this.segment(), 0L, value); return this; }

    /// {@return `preferredFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredFlags(MemorySegment segment, long index) { return (int) VH_preferredFlags.get().get(segment, 0L, index); }
    /// {@return `preferredFlags`}
    public int preferredFlags() { return preferredFlags(this.segment(), 0L); }
    /// Sets `preferredFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredFlags(MemorySegment segment, long index, int value) { VH_preferredFlags.get().set(segment, 0L, index, value); }
    /// Sets `preferredFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo preferredFlags(int value) { preferredFlags(this.segment(), 0L, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get().get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    public int memoryTypeBits() { return memoryTypeBits(this.segment(), 0L); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryTypeBits(MemorySegment segment, long index, int value) { VH_memoryTypeBits.get().set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo memoryTypeBits(int value) { memoryTypeBits(this.segment(), 0L, value); return this; }

    /// {@return `pool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pool(MemorySegment segment, long index) { return (MemorySegment) VH_pool.get().get(segment, 0L, index); }
    /// {@return `pool`}
    public MemorySegment pool() { return pool(this.segment(), 0L); }
    /// Sets `pool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pool(MemorySegment segment, long index, MemorySegment value) { VH_pool.get().set(segment, 0L, index, value); }
    /// Sets `pool` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo pool(MemorySegment value) { pool(this.segment(), 0L, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pUserData(MemorySegment segment, long index) { return (MemorySegment) VH_pUserData.get().get(segment, 0L, index); }
    /// {@return `pUserData`}
    public MemorySegment pUserData() { return pUserData(this.segment(), 0L); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pUserData(MemorySegment segment, long index, MemorySegment value) { VH_pUserData.get().set(segment, 0L, index, value); }
    /// Sets `pUserData` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo pUserData(MemorySegment value) { pUserData(this.segment(), 0L, value); return this; }

    /// {@return `priority` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float priority(MemorySegment segment, long index) { return (float) VH_priority.get().get(segment, 0L, index); }
    /// {@return `priority`}
    public float priority() { return priority(this.segment(), 0L); }
    /// Sets `priority` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void priority(MemorySegment segment, long index, float value) { VH_priority.get().set(segment, 0L, index, value); }
    /// Sets `priority` with the given value.
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo priority(float value) { priority(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VmaAllocationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VmaAllocationCreateInfo`
    public VmaAllocationCreateInfo asSlice(long index) { return new VmaAllocationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VmaAllocationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VmaAllocationCreateInfo`
    public VmaAllocationCreateInfo asSlice(long index, long count) { return new VmaAllocationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VmaAllocationCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VmaAllocationCreateInfo at(long index, Consumer<VmaAllocationCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `usage` at the given index}
    /// @param index the index of the struct buffer
    public int usageAt(long index) { return usage(this.segment(), index); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo usageAt(long index, int value) { usage(this.segment(), index, value); return this; }

    /// {@return `requiredFlags` at the given index}
    /// @param index the index of the struct buffer
    public int requiredFlagsAt(long index) { return requiredFlags(this.segment(), index); }
    /// Sets `requiredFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo requiredFlagsAt(long index, int value) { requiredFlags(this.segment(), index, value); return this; }

    /// {@return `preferredFlags` at the given index}
    /// @param index the index of the struct buffer
    public int preferredFlagsAt(long index) { return preferredFlags(this.segment(), index); }
    /// Sets `preferredFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo preferredFlagsAt(long index, int value) { preferredFlags(this.segment(), index, value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param index the index of the struct buffer
    public int memoryTypeBitsAt(long index) { return memoryTypeBits(this.segment(), index); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo memoryTypeBitsAt(long index, int value) { memoryTypeBits(this.segment(), index, value); return this; }

    /// {@return `pool` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment poolAt(long index) { return pool(this.segment(), index); }
    /// Sets `pool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo poolAt(long index, MemorySegment value) { pool(this.segment(), index, value); return this; }

    /// {@return `pUserData` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pUserDataAt(long index) { return pUserData(this.segment(), index); }
    /// Sets `pUserData` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo pUserDataAt(long index, MemorySegment value) { pUserData(this.segment(), index, value); return this; }

    /// {@return `priority` at the given index}
    /// @param index the index of the struct buffer
    public float priorityAt(long index) { return priority(this.segment(), index); }
    /// Sets `priority` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VmaAllocationCreateInfo priorityAt(long index, float value) { priority(this.segment(), index, value); return this; }

}
