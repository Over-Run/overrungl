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

/// Represents `VkMemoryRequirements2`.
/// ## Layout
/// ```
/// struct VkMemoryRequirements2 {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkMemoryRequirements) VkMemoryRequirements memoryRequirements;
/// };
/// ```
public final class VkMemoryRequirements2 extends GroupType {
    /// The struct layout of `VkMemoryRequirements2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
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
    /// The byte offset of `memoryRequirements`.
    public static final long OFFSET_memoryRequirements = LAYOUT.byteOffset(PathElement.groupElement("memoryRequirements"));
    /// The memory layout of `memoryRequirements`.
    public static final MemoryLayout LAYOUT_memoryRequirements = LAYOUT.select(PathElement.groupElement("memoryRequirements"));

    /// Creates `VkMemoryRequirements2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMemoryRequirements2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMemoryRequirements2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryRequirements2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMemoryRequirements2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryRequirements2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMemoryRequirements2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMemoryRequirements2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryRequirements2`
    public static VkMemoryRequirements2 alloc(SegmentAllocator allocator) { return new VkMemoryRequirements2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMemoryRequirements2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryRequirements2`
    public static VkMemoryRequirements2 alloc(SegmentAllocator allocator, long count) { return new VkMemoryRequirements2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryRequirements2 copyFrom(VkMemoryRequirements2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMemoryRequirements2 reinterpret(long count) { return new VkMemoryRequirements2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkMemoryRequirements2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkMemoryRequirements2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `memoryRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment memoryRequirements(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements); }
    /// {@return `memoryRequirements`}
    public MemorySegment memoryRequirements() { return memoryRequirements(this.segment(), 0L); }
    /// Sets `memoryRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void memoryRequirements(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryRequirements, index), LAYOUT_memoryRequirements.byteSize()); }
    /// Sets `memoryRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements2 memoryRequirements(MemorySegment value) { memoryRequirements(this.segment(), 0L, value); return this; }
    /// Accepts `memoryRequirements` with the given function.
    /// @param func the function
    /// @return `this`
    public VkMemoryRequirements2 memoryRequirements(Consumer<overrungl.vulkan.struct.VkMemoryRequirements> func) { func.accept(overrungl.vulkan.struct.VkMemoryRequirements.of(memoryRequirements())); return this; }

    /// Creates a slice of `VkMemoryRequirements2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryRequirements2`
    public VkMemoryRequirements2 asSlice(long index) { return new VkMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMemoryRequirements2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryRequirements2`
    public VkMemoryRequirements2 asSlice(long index, long count) { return new VkMemoryRequirements2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMemoryRequirements2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMemoryRequirements2 at(long index, Consumer<VkMemoryRequirements2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `memoryRequirements` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment memoryRequirementsAt(long index) { return memoryRequirements(this.segment(), index); }
    /// Sets `memoryRequirements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMemoryRequirements2 memoryRequirementsAt(long index, MemorySegment value) { memoryRequirements(this.segment(), index, value); return this; }
    /// Accepts `memoryRequirements` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkMemoryRequirements2 memoryRequirementsAt(long index, Consumer<overrungl.vulkan.struct.VkMemoryRequirements> func) { func.accept(overrungl.vulkan.struct.VkMemoryRequirements.of(memoryRequirementsAt(index))); return this; }

}
