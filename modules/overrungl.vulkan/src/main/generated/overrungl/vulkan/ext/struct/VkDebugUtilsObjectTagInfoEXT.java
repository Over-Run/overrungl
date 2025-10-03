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

/// Represents `VkDebugUtilsObjectTagInfoEXT`.
/// ## Layout
/// ```
/// struct VkDebugUtilsObjectTagInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkObjectType objectType;
///     uint64_t objectHandle;
///     uint64_t tagName;
///     size_t tagSize;
///     const void* pTag;
/// };
/// ```
public final class VkDebugUtilsObjectTagInfoEXT extends GroupType {
    /// The struct layout of `VkDebugUtilsObjectTagInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("objectType"),
        ValueLayout.JAVA_LONG.withName("objectHandle"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        CanonicalTypes.SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
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
    /// The byte offset of `objectType`.
    public static final long OFFSET_objectType = LAYOUT.byteOffset(PathElement.groupElement("objectType"));
    /// The memory layout of `objectType`.
    public static final MemoryLayout LAYOUT_objectType = LAYOUT.select(PathElement.groupElement("objectType"));
    /// The [VarHandle] of `objectType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_objectType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectType")));
    /// The byte offset of `objectHandle`.
    public static final long OFFSET_objectHandle = LAYOUT.byteOffset(PathElement.groupElement("objectHandle"));
    /// The memory layout of `objectHandle`.
    public static final MemoryLayout LAYOUT_objectHandle = LAYOUT.select(PathElement.groupElement("objectHandle"));
    /// The [VarHandle] of `objectHandle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_objectHandle = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("objectHandle")));
    /// The byte offset of `tagName`.
    public static final long OFFSET_tagName = LAYOUT.byteOffset(PathElement.groupElement("tagName"));
    /// The memory layout of `tagName`.
    public static final MemoryLayout LAYOUT_tagName = LAYOUT.select(PathElement.groupElement("tagName"));
    /// The [VarHandle] of `tagName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tagName = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName")));
    /// The byte offset of `tagSize`.
    public static final long OFFSET_tagSize = LAYOUT.byteOffset(PathElement.groupElement("tagSize"));
    /// The memory layout of `tagSize`.
    public static final MemoryLayout LAYOUT_tagSize = LAYOUT.select(PathElement.groupElement("tagSize"));
    /// The [VarHandle] of `tagSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tagSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize")));
    /// The byte offset of `pTag`.
    public static final long OFFSET_pTag = LAYOUT.byteOffset(PathElement.groupElement("pTag"));
    /// The memory layout of `pTag`.
    public static final MemoryLayout LAYOUT_pTag = LAYOUT.select(PathElement.groupElement("pTag"));
    /// The [VarHandle] of `pTag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pTag = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag")));

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDebugUtilsObjectTagInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsObjectTagInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectTagInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsObjectTagInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectTagInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDebugUtilsObjectTagInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDebugUtilsObjectTagInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDebugUtilsObjectTagInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDebugUtilsObjectTagInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDebugUtilsObjectTagInfoEXT`
    public static VkDebugUtilsObjectTagInfoEXT alloc(SegmentAllocator allocator) { return new VkDebugUtilsObjectTagInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDebugUtilsObjectTagInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDebugUtilsObjectTagInfoEXT`
    public static VkDebugUtilsObjectTagInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkDebugUtilsObjectTagInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT copyFrom(VkDebugUtilsObjectTagInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDebugUtilsObjectTagInfoEXT reinterpret(long count) { return new VkDebugUtilsObjectTagInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDebugUtilsObjectTagInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDebugUtilsObjectTagInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int objectType(MemorySegment segment, long index) { return (int) VH_objectType.get().get(segment, 0L, index); }
    /// {@return `objectType`}
    public int objectType() { return objectType(this.segment(), 0L); }
    /// Sets `objectType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectType(MemorySegment segment, long index, int value) { VH_objectType.get().set(segment, 0L, index, value); }
    /// Sets `objectType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT objectType(int value) { objectType(this.segment(), 0L, value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long objectHandle(MemorySegment segment, long index) { return (long) VH_objectHandle.get().get(segment, 0L, index); }
    /// {@return `objectHandle`}
    public long objectHandle() { return objectHandle(this.segment(), 0L); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void objectHandle(MemorySegment segment, long index, long value) { VH_objectHandle.get().set(segment, 0L, index, value); }
    /// Sets `objectHandle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT objectHandle(long value) { objectHandle(this.segment(), 0L, value); return this; }

    /// {@return `tagName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tagName(MemorySegment segment, long index) { return (long) VH_tagName.get().get(segment, 0L, index); }
    /// {@return `tagName`}
    public long tagName() { return tagName(this.segment(), 0L); }
    /// Sets `tagName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tagName(MemorySegment segment, long index, long value) { VH_tagName.get().set(segment, 0L, index, value); }
    /// Sets `tagName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT tagName(long value) { tagName(this.segment(), 0L, value); return this; }

    /// {@return `tagSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tagSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_tagSize.get().get(segment, 0L, index)); }
    /// {@return `tagSize`}
    public long tagSize() { return tagSize(this.segment(), 0L); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tagSize(MemorySegment segment, long index, long value) { VH_tagSize.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `tagSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT tagSize(long value) { tagSize(this.segment(), 0L, value); return this; }

    /// {@return `pTag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTag(MemorySegment segment, long index) { return (MemorySegment) VH_pTag.get().get(segment, 0L, index); }
    /// {@return `pTag`}
    public MemorySegment pTag() { return pTag(this.segment(), 0L); }
    /// Sets `pTag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTag(MemorySegment segment, long index, MemorySegment value) { VH_pTag.get().set(segment, 0L, index, value); }
    /// Sets `pTag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT pTag(MemorySegment value) { pTag(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDebugUtilsObjectTagInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDebugUtilsObjectTagInfoEXT`
    public VkDebugUtilsObjectTagInfoEXT asSlice(long index) { return new VkDebugUtilsObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDebugUtilsObjectTagInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDebugUtilsObjectTagInfoEXT`
    public VkDebugUtilsObjectTagInfoEXT asSlice(long index, long count) { return new VkDebugUtilsObjectTagInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDebugUtilsObjectTagInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT at(long index, Consumer<VkDebugUtilsObjectTagInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `objectType` at the given index}
    /// @param index the index of the struct buffer
    public int objectTypeAt(long index) { return objectType(this.segment(), index); }
    /// Sets `objectType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT objectTypeAt(long index, int value) { objectType(this.segment(), index, value); return this; }

    /// {@return `objectHandle` at the given index}
    /// @param index the index of the struct buffer
    public long objectHandleAt(long index) { return objectHandle(this.segment(), index); }
    /// Sets `objectHandle` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT objectHandleAt(long index, long value) { objectHandle(this.segment(), index, value); return this; }

    /// {@return `tagName` at the given index}
    /// @param index the index of the struct buffer
    public long tagNameAt(long index) { return tagName(this.segment(), index); }
    /// Sets `tagName` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT tagNameAt(long index, long value) { tagName(this.segment(), index, value); return this; }

    /// {@return `tagSize` at the given index}
    /// @param index the index of the struct buffer
    public long tagSizeAt(long index) { return tagSize(this.segment(), index); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT tagSizeAt(long index, long value) { tagSize(this.segment(), index, value); return this; }

    /// {@return `pTag` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTagAt(long index) { return pTag(this.segment(), index); }
    /// Sets `pTag` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDebugUtilsObjectTagInfoEXT pTagAt(long index, MemorySegment value) { pTag(this.segment(), index, value); return this; }

}
