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

/// Represents `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 subpassMergeFeedback;
/// };
/// ```
public final class VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassMergeFeedback")
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
    /// The byte offset of `subpassMergeFeedback`.
    public static final long OFFSET_subpassMergeFeedback = LAYOUT.byteOffset(PathElement.groupElement("subpassMergeFeedback"));
    /// The memory layout of `subpassMergeFeedback`.
    public static final MemoryLayout LAYOUT_subpassMergeFeedback = LAYOUT.select(PathElement.groupElement("subpassMergeFeedback"));
    /// The [VarHandle] of `subpassMergeFeedback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subpassMergeFeedback = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassMergeFeedback")));

    /// Creates `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT copyFrom(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `subpassMergeFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassMergeFeedback(MemorySegment segment, long index) { return (int) VH_subpassMergeFeedback.get().get(segment, 0L, index); }
    /// {@return `subpassMergeFeedback`}
    public int subpassMergeFeedback() { return subpassMergeFeedback(this.segment(), 0L); }
    /// Sets `subpassMergeFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassMergeFeedback(MemorySegment segment, long index, int value) { VH_subpassMergeFeedback.get().set(segment, 0L, index, value); }
    /// Sets `subpassMergeFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT subpassMergeFeedback(int value) { subpassMergeFeedback(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT at(long index, Consumer<VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `subpassMergeFeedback` at the given index}
    /// @param index the index of the struct buffer
    public int subpassMergeFeedbackAt(long index) { return subpassMergeFeedback(this.segment(), index); }
    /// Sets `subpassMergeFeedback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT subpassMergeFeedbackAt(long index, int value) { subpassMergeFeedback(this.segment(), index, value); return this; }

}
