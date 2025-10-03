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

/// Represents `VkExternalMemoryImageCreateInfo`.
/// ## Layout
/// ```
/// struct VkExternalMemoryImageCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlags handleTypes;
/// };
/// ```
public final class VkExternalMemoryImageCreateInfo extends GroupType {
    /// The struct layout of `VkExternalMemoryImageCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleTypes")
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
    /// The byte offset of `handleTypes`.
    public static final long OFFSET_handleTypes = LAYOUT.byteOffset(PathElement.groupElement("handleTypes"));
    /// The memory layout of `handleTypes`.
    public static final MemoryLayout LAYOUT_handleTypes = LAYOUT.select(PathElement.groupElement("handleTypes"));
    /// The [VarHandle] of `handleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_handleTypes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleTypes")));

    /// Creates `VkExternalMemoryImageCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalMemoryImageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalMemoryImageCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryImageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryImageCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalMemoryImageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryImageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryImageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalMemoryImageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryImageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryImageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalMemoryImageCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalMemoryImageCreateInfo`
    public static VkExternalMemoryImageCreateInfo alloc(SegmentAllocator allocator) { return new VkExternalMemoryImageCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalMemoryImageCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalMemoryImageCreateInfo`
    public static VkExternalMemoryImageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryImageCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalMemoryImageCreateInfo copyFrom(VkExternalMemoryImageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalMemoryImageCreateInfo reinterpret(long count) { return new VkExternalMemoryImageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExternalMemoryImageCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalMemoryImageCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `handleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handleTypes(MemorySegment segment, long index) { return (int) VH_handleTypes.get().get(segment, 0L, index); }
    /// {@return `handleTypes`}
    public int handleTypes() { return handleTypes(this.segment(), 0L); }
    /// Sets `handleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handleTypes(MemorySegment segment, long index, int value) { VH_handleTypes.get().set(segment, 0L, index, value); }
    /// Sets `handleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryImageCreateInfo handleTypes(int value) { handleTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalMemoryImageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalMemoryImageCreateInfo`
    public VkExternalMemoryImageCreateInfo asSlice(long index) { return new VkExternalMemoryImageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalMemoryImageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalMemoryImageCreateInfo`
    public VkExternalMemoryImageCreateInfo asSlice(long index, long count) { return new VkExternalMemoryImageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalMemoryImageCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalMemoryImageCreateInfo at(long index, Consumer<VkExternalMemoryImageCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryImageCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryImageCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `handleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypesAt(long index) { return handleTypes(this.segment(), index); }
    /// Sets `handleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryImageCreateInfo handleTypesAt(long index, int value) { handleTypes(this.segment(), index, value); return this; }

}
