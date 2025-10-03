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

/// Represents `VkValidationFlagsEXT`.
/// ## Layout
/// ```
/// struct VkValidationFlagsEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t disabledValidationCheckCount;
///     const VkValidationCheckEXT* pDisabledValidationChecks;
/// };
/// ```
public final class VkValidationFlagsEXT extends GroupType {
    /// The struct layout of `VkValidationFlagsEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("disabledValidationCheckCount"),
        ValueLayout.ADDRESS.withName("pDisabledValidationChecks")
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
    /// The byte offset of `disabledValidationCheckCount`.
    public static final long OFFSET_disabledValidationCheckCount = LAYOUT.byteOffset(PathElement.groupElement("disabledValidationCheckCount"));
    /// The memory layout of `disabledValidationCheckCount`.
    public static final MemoryLayout LAYOUT_disabledValidationCheckCount = LAYOUT.select(PathElement.groupElement("disabledValidationCheckCount"));
    /// The [VarHandle] of `disabledValidationCheckCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_disabledValidationCheckCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("disabledValidationCheckCount")));
    /// The byte offset of `pDisabledValidationChecks`.
    public static final long OFFSET_pDisabledValidationChecks = LAYOUT.byteOffset(PathElement.groupElement("pDisabledValidationChecks"));
    /// The memory layout of `pDisabledValidationChecks`.
    public static final MemoryLayout LAYOUT_pDisabledValidationChecks = LAYOUT.select(PathElement.groupElement("pDisabledValidationChecks"));
    /// The [VarHandle] of `pDisabledValidationChecks` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pDisabledValidationChecks = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDisabledValidationChecks")));

    /// Creates `VkValidationFlagsEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkValidationFlagsEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkValidationFlagsEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkValidationFlagsEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkValidationFlagsEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkValidationFlagsEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkValidationFlagsEXT`
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkValidationFlagsEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkValidationFlagsEXT`
    public static VkValidationFlagsEXT alloc(SegmentAllocator allocator, long count) { return new VkValidationFlagsEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkValidationFlagsEXT copyFrom(VkValidationFlagsEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkValidationFlagsEXT reinterpret(long count) { return new VkValidationFlagsEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkValidationFlagsEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkValidationFlagsEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `disabledValidationCheckCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int disabledValidationCheckCount(MemorySegment segment, long index) { return (int) VH_disabledValidationCheckCount.get().get(segment, 0L, index); }
    /// {@return `disabledValidationCheckCount`}
    public int disabledValidationCheckCount() { return disabledValidationCheckCount(this.segment(), 0L); }
    /// Sets `disabledValidationCheckCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void disabledValidationCheckCount(MemorySegment segment, long index, int value) { VH_disabledValidationCheckCount.get().set(segment, 0L, index, value); }
    /// Sets `disabledValidationCheckCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT disabledValidationCheckCount(int value) { disabledValidationCheckCount(this.segment(), 0L, value); return this; }

    /// {@return `pDisabledValidationChecks` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDisabledValidationChecks(MemorySegment segment, long index) { return (MemorySegment) VH_pDisabledValidationChecks.get().get(segment, 0L, index); }
    /// {@return `pDisabledValidationChecks`}
    public MemorySegment pDisabledValidationChecks() { return pDisabledValidationChecks(this.segment(), 0L); }
    /// Sets `pDisabledValidationChecks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDisabledValidationChecks(MemorySegment segment, long index, MemorySegment value) { VH_pDisabledValidationChecks.get().set(segment, 0L, index, value); }
    /// Sets `pDisabledValidationChecks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pDisabledValidationChecks(MemorySegment value) { pDisabledValidationChecks(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkValidationFlagsEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkValidationFlagsEXT`
    public VkValidationFlagsEXT asSlice(long index) { return new VkValidationFlagsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkValidationFlagsEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkValidationFlagsEXT`
    public VkValidationFlagsEXT asSlice(long index, long count) { return new VkValidationFlagsEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkValidationFlagsEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkValidationFlagsEXT at(long index, Consumer<VkValidationFlagsEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `disabledValidationCheckCount` at the given index}
    /// @param index the index of the struct buffer
    public int disabledValidationCheckCountAt(long index) { return disabledValidationCheckCount(this.segment(), index); }
    /// Sets `disabledValidationCheckCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT disabledValidationCheckCountAt(long index, int value) { disabledValidationCheckCount(this.segment(), index, value); return this; }

    /// {@return `pDisabledValidationChecks` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDisabledValidationChecksAt(long index) { return pDisabledValidationChecks(this.segment(), index); }
    /// Sets `pDisabledValidationChecks` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkValidationFlagsEXT pDisabledValidationChecksAt(long index, MemorySegment value) { pDisabledValidationChecks(this.segment(), index, value); return this; }

}
