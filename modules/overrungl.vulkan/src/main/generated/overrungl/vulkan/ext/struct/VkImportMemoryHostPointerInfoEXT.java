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

/// Represents `VkImportMemoryHostPointerInfoEXT`.
/// ## Layout
/// ```
/// struct VkImportMemoryHostPointerInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkExternalMemoryHandleTypeFlagBits handleType;
///     void* pHostPointer;
/// };
/// ```
public final class VkImportMemoryHostPointerInfoEXT extends GroupType {
    /// The struct layout of `VkImportMemoryHostPointerInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("pHostPointer")
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
    /// The byte offset of `handleType`.
    public static final long OFFSET_handleType = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
    /// The memory layout of `handleType`.
    public static final MemoryLayout LAYOUT_handleType = LAYOUT.select(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_handleType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType")));
    /// The byte offset of `pHostPointer`.
    public static final long OFFSET_pHostPointer = LAYOUT.byteOffset(PathElement.groupElement("pHostPointer"));
    /// The memory layout of `pHostPointer`.
    public static final MemoryLayout LAYOUT_pHostPointer = LAYOUT.select(PathElement.groupElement("pHostPointer"));
    /// The [VarHandle] of `pHostPointer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pHostPointer = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pHostPointer")));

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImportMemoryHostPointerInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryHostPointerInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryHostPointerInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryHostPointerInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryHostPointerInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImportMemoryHostPointerInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryHostPointerInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMemoryHostPointerInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImportMemoryHostPointerInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryHostPointerInfoEXT`
    public static VkImportMemoryHostPointerInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMemoryHostPointerInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImportMemoryHostPointerInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMemoryHostPointerInfoEXT`
    public static VkImportMemoryHostPointerInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMemoryHostPointerInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT copyFrom(VkImportMemoryHostPointerInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImportMemoryHostPointerInfoEXT reinterpret(long count) { return new VkImportMemoryHostPointerInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImportMemoryHostPointerInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportMemoryHostPointerInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int handleType(MemorySegment segment, long index) { return (int) VH_handleType.get().get(segment, 0L, index); }
    /// {@return `handleType`}
    public int handleType() { return handleType(this.segment(), 0L); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void handleType(MemorySegment segment, long index, int value) { VH_handleType.get().set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT handleType(int value) { handleType(this.segment(), 0L, value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pHostPointer(MemorySegment segment, long index) { return (MemorySegment) VH_pHostPointer.get().get(segment, 0L, index); }
    /// {@return `pHostPointer`}
    public MemorySegment pHostPointer() { return pHostPointer(this.segment(), 0L); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pHostPointer(MemorySegment segment, long index, MemorySegment value) { VH_pHostPointer.get().set(segment, 0L, index, value); }
    /// Sets `pHostPointer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pHostPointer(MemorySegment value) { pHostPointer(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImportMemoryHostPointerInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImportMemoryHostPointerInfoEXT`
    public VkImportMemoryHostPointerInfoEXT asSlice(long index) { return new VkImportMemoryHostPointerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImportMemoryHostPointerInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImportMemoryHostPointerInfoEXT`
    public VkImportMemoryHostPointerInfoEXT asSlice(long index, long count) { return new VkImportMemoryHostPointerInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImportMemoryHostPointerInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT at(long index, Consumer<VkImportMemoryHostPointerInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `handleType` at the given index}
    /// @param index the index of the struct buffer
    public int handleTypeAt(long index) { return handleType(this.segment(), index); }
    /// Sets `handleType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT handleTypeAt(long index, int value) { handleType(this.segment(), index, value); return this; }

    /// {@return `pHostPointer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pHostPointerAt(long index) { return pHostPointer(this.segment(), index); }
    /// Sets `pHostPointer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMemoryHostPointerInfoEXT pHostPointerAt(long index, MemorySegment value) { pHostPointer(this.segment(), index, value); return this; }

}
