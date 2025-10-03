// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nvx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCuModuleTexturingModeCreateInfoNVX`.
/// ## Layout
/// ```
/// struct VkCuModuleTexturingModeCreateInfoNVX {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 use64bitTexturing;
/// };
/// ```
public final class VkCuModuleTexturingModeCreateInfoNVX extends GroupType {
    /// The struct layout of `VkCuModuleTexturingModeCreateInfoNVX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("use64bitTexturing")
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
    /// The byte offset of `use64bitTexturing`.
    public static final long OFFSET_use64bitTexturing = LAYOUT.byteOffset(PathElement.groupElement("use64bitTexturing"));
    /// The memory layout of `use64bitTexturing`.
    public static final MemoryLayout LAYOUT_use64bitTexturing = LAYOUT.select(PathElement.groupElement("use64bitTexturing"));
    /// The [VarHandle] of `use64bitTexturing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_use64bitTexturing = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("use64bitTexturing")));

    /// Creates `VkCuModuleTexturingModeCreateInfoNVX` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCuModuleTexturingModeCreateInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCuModuleTexturingModeCreateInfoNVX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleTexturingModeCreateInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleTexturingModeCreateInfoNVX(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCuModuleTexturingModeCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleTexturingModeCreateInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleTexturingModeCreateInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCuModuleTexturingModeCreateInfoNVX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCuModuleTexturingModeCreateInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleTexturingModeCreateInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCuModuleTexturingModeCreateInfoNVX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCuModuleTexturingModeCreateInfoNVX`
    public static VkCuModuleTexturingModeCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuModuleTexturingModeCreateInfoNVX(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCuModuleTexturingModeCreateInfoNVX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCuModuleTexturingModeCreateInfoNVX`
    public static VkCuModuleTexturingModeCreateInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkCuModuleTexturingModeCreateInfoNVX(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCuModuleTexturingModeCreateInfoNVX copyFrom(VkCuModuleTexturingModeCreateInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCuModuleTexturingModeCreateInfoNVX reinterpret(long count) { return new VkCuModuleTexturingModeCreateInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCuModuleTexturingModeCreateInfoNVX sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCuModuleTexturingModeCreateInfoNVX pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `use64bitTexturing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int use64bitTexturing(MemorySegment segment, long index) { return (int) VH_use64bitTexturing.get().get(segment, 0L, index); }
    /// {@return `use64bitTexturing`}
    public int use64bitTexturing() { return use64bitTexturing(this.segment(), 0L); }
    /// Sets `use64bitTexturing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void use64bitTexturing(MemorySegment segment, long index, int value) { VH_use64bitTexturing.get().set(segment, 0L, index, value); }
    /// Sets `use64bitTexturing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCuModuleTexturingModeCreateInfoNVX use64bitTexturing(int value) { use64bitTexturing(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCuModuleTexturingModeCreateInfoNVX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCuModuleTexturingModeCreateInfoNVX`
    public VkCuModuleTexturingModeCreateInfoNVX asSlice(long index) { return new VkCuModuleTexturingModeCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCuModuleTexturingModeCreateInfoNVX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCuModuleTexturingModeCreateInfoNVX`
    public VkCuModuleTexturingModeCreateInfoNVX asSlice(long index, long count) { return new VkCuModuleTexturingModeCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCuModuleTexturingModeCreateInfoNVX` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCuModuleTexturingModeCreateInfoNVX at(long index, Consumer<VkCuModuleTexturingModeCreateInfoNVX> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleTexturingModeCreateInfoNVX sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleTexturingModeCreateInfoNVX pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `use64bitTexturing` at the given index}
    /// @param index the index of the struct buffer
    public int use64bitTexturingAt(long index) { return use64bitTexturing(this.segment(), index); }
    /// Sets `use64bitTexturing` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCuModuleTexturingModeCreateInfoNVX use64bitTexturingAt(long index, int value) { use64bitTexturing(this.segment(), index, value); return this; }

}
