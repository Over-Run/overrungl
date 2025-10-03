// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRenderPassStripeInfoARM`.
/// ## Layout
/// ```
/// struct VkRenderPassStripeInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkRect2D) VkRect2D stripeArea;
/// };
/// ```
public final class VkRenderPassStripeInfoARM extends GroupType {
    /// The struct layout of `VkRenderPassStripeInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkRect2D.LAYOUT.withName("stripeArea")
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
    /// The byte offset of `stripeArea`.
    public static final long OFFSET_stripeArea = LAYOUT.byteOffset(PathElement.groupElement("stripeArea"));
    /// The memory layout of `stripeArea`.
    public static final MemoryLayout LAYOUT_stripeArea = LAYOUT.select(PathElement.groupElement("stripeArea"));

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkRenderPassStripeInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkRenderPassStripeInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRenderPassStripeInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRenderPassStripeInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkRenderPassStripeInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRenderPassStripeInfoARM`
    public static VkRenderPassStripeInfoARM alloc(SegmentAllocator allocator) { return new VkRenderPassStripeInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkRenderPassStripeInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRenderPassStripeInfoARM`
    public static VkRenderPassStripeInfoARM alloc(SegmentAllocator allocator, long count) { return new VkRenderPassStripeInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkRenderPassStripeInfoARM copyFrom(VkRenderPassStripeInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkRenderPassStripeInfoARM reinterpret(long count) { return new VkRenderPassStripeInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkRenderPassStripeInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkRenderPassStripeInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stripeArea` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment stripeArea(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_stripeArea, index), LAYOUT_stripeArea); }
    /// {@return `stripeArea`}
    public MemorySegment stripeArea() { return stripeArea(this.segment(), 0L); }
    /// Sets `stripeArea` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stripeArea(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_stripeArea, index), LAYOUT_stripeArea.byteSize()); }
    /// Sets `stripeArea` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM stripeArea(MemorySegment value) { stripeArea(this.segment(), 0L, value); return this; }
    /// Accepts `stripeArea` with the given function.
    /// @param func the function
    /// @return `this`
    public VkRenderPassStripeInfoARM stripeArea(Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(stripeArea())); return this; }

    /// Creates a slice of `VkRenderPassStripeInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRenderPassStripeInfoARM`
    public VkRenderPassStripeInfoARM asSlice(long index) { return new VkRenderPassStripeInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkRenderPassStripeInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRenderPassStripeInfoARM`
    public VkRenderPassStripeInfoARM asSlice(long index, long count) { return new VkRenderPassStripeInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkRenderPassStripeInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkRenderPassStripeInfoARM at(long index, Consumer<VkRenderPassStripeInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stripeArea` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment stripeAreaAt(long index) { return stripeArea(this.segment(), index); }
    /// Sets `stripeArea` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkRenderPassStripeInfoARM stripeAreaAt(long index, MemorySegment value) { stripeArea(this.segment(), index, value); return this; }
    /// Accepts `stripeArea` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkRenderPassStripeInfoARM stripeAreaAt(long index, Consumer<overrungl.vulkan.struct.VkRect2D> func) { func.accept(overrungl.vulkan.struct.VkRect2D.of(stripeAreaAt(index))); return this; }

}
