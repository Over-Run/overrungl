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

/// Represents `VkPipelinePropertiesIdentifierEXT`.
/// ## Layout
/// ```
/// struct VkPipelinePropertiesIdentifierEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint8_t pipelineIdentifier[16];
/// };
/// ```
public final class VkPipelinePropertiesIdentifierEXT extends GroupType {
    /// The struct layout of `VkPipelinePropertiesIdentifierEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier")
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
    /// The byte offset of `pipelineIdentifier`.
    public static final long OFFSET_pipelineIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelineIdentifier"));
    /// The memory layout of `pipelineIdentifier`.
    public static final MemoryLayout LAYOUT_pipelineIdentifier = LAYOUT.select(PathElement.groupElement("pipelineIdentifier"));
    /// The [VarHandle] of `pipelineIdentifier` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_pipelineIdentifier = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIdentifier"), PathElement.sequenceElement()));

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelinePropertiesIdentifierEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePropertiesIdentifierEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePropertiesIdentifierEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelinePropertiesIdentifierEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelinePropertiesIdentifierEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelinePropertiesIdentifierEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelinePropertiesIdentifierEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelinePropertiesIdentifierEXT`
    public static VkPipelinePropertiesIdentifierEXT alloc(SegmentAllocator allocator) { return new VkPipelinePropertiesIdentifierEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelinePropertiesIdentifierEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelinePropertiesIdentifierEXT`
    public static VkPipelinePropertiesIdentifierEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelinePropertiesIdentifierEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT copyFrom(VkPipelinePropertiesIdentifierEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelinePropertiesIdentifierEXT reinterpret(long count) { return new VkPipelinePropertiesIdentifierEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelinePropertiesIdentifierEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelinePropertiesIdentifierEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pipelineIdentifier(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte pipelineIdentifier(MemorySegment segment, long index, long index0) { return (byte) VH_pipelineIdentifier.get().get(segment, 0L, index, index0); }
    /// {@return `pipelineIdentifier`}
    public MemorySegment pipelineIdentifier() { return pipelineIdentifier(this.segment(), 0L); }
    /// {@return `pipelineIdentifier`}
    /// @param index0 the Index 0 of the array
    public byte pipelineIdentifier(long index0) { return pipelineIdentifier(this.segment(), 0L, index0); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineIdentifier(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pipelineIdentifier, index), LAYOUT_pipelineIdentifier.byteSize()); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void pipelineIdentifier(MemorySegment segment, long index, long index0, byte value) { VH_pipelineIdentifier.get().set(segment, 0L, index, index0, value); }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(MemorySegment value) { pipelineIdentifier(this.segment(), 0L, value); return this; }
    /// Sets `pipelineIdentifier` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifier(long index0, byte value) { pipelineIdentifier(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPipelinePropertiesIdentifierEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelinePropertiesIdentifierEXT`
    public VkPipelinePropertiesIdentifierEXT asSlice(long index) { return new VkPipelinePropertiesIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelinePropertiesIdentifierEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelinePropertiesIdentifierEXT`
    public VkPipelinePropertiesIdentifierEXT asSlice(long index, long count) { return new VkPipelinePropertiesIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelinePropertiesIdentifierEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT at(long index, Consumer<VkPipelinePropertiesIdentifierEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelineIdentifier` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pipelineIdentifierAt(long index) { return pipelineIdentifier(this.segment(), index); }
    /// {@return `pipelineIdentifier` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte pipelineIdentifierAt(long index, long index0) { return pipelineIdentifier(this.segment(), index, index0); }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifierAt(long index, MemorySegment value) { pipelineIdentifier(this.segment(), index, value); return this; }
    /// Sets `pipelineIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelinePropertiesIdentifierEXT pipelineIdentifierAt(long index, long index0, byte value) { pipelineIdentifier(this.segment(), index, index0, value); return this; }

}
