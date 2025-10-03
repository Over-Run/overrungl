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

/// Represents `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTransformFeedbackFeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 transformFeedback;
///     (uint32_t) VkBool32 geometryStreams;
/// };
/// ```
public final class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transformFeedback"),
        ValueLayout.JAVA_INT.withName("geometryStreams")
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
    /// The byte offset of `transformFeedback`.
    public static final long OFFSET_transformFeedback = LAYOUT.byteOffset(PathElement.groupElement("transformFeedback"));
    /// The memory layout of `transformFeedback`.
    public static final MemoryLayout LAYOUT_transformFeedback = LAYOUT.select(PathElement.groupElement("transformFeedback"));
    /// The [VarHandle] of `transformFeedback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_transformFeedback = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformFeedback")));
    /// The byte offset of `geometryStreams`.
    public static final long OFFSET_geometryStreams = LAYOUT.byteOffset(PathElement.groupElement("geometryStreams"));
    /// The memory layout of `geometryStreams`.
    public static final MemoryLayout LAYOUT_geometryStreams = LAYOUT.select(PathElement.groupElement("geometryStreams"));
    /// The [VarHandle] of `geometryStreams` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_geometryStreams = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryStreams")));

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceTransformFeedbackFeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT copyFrom(VkPhysicalDeviceTransformFeedbackFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `transformFeedback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformFeedback(MemorySegment segment, long index) { return (int) VH_transformFeedback.get().get(segment, 0L, index); }
    /// {@return `transformFeedback`}
    public int transformFeedback() { return transformFeedback(this.segment(), 0L); }
    /// Sets `transformFeedback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformFeedback(MemorySegment segment, long index, int value) { VH_transformFeedback.get().set(segment, 0L, index, value); }
    /// Sets `transformFeedback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedback(int value) { transformFeedback(this.segment(), 0L, value); return this; }

    /// {@return `geometryStreams` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int geometryStreams(MemorySegment segment, long index) { return (int) VH_geometryStreams.get().get(segment, 0L, index); }
    /// {@return `geometryStreams`}
    public int geometryStreams() { return geometryStreams(this.segment(), 0L); }
    /// Sets `geometryStreams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void geometryStreams(MemorySegment segment, long index, int value) { VH_geometryStreams.get().set(segment, 0L, index, value); }
    /// Sets `geometryStreams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreams(int value) { geometryStreams(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceTransformFeedbackFeaturesEXT`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceTransformFeedbackFeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT at(long index, Consumer<VkPhysicalDeviceTransformFeedbackFeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `transformFeedback` at the given index}
    /// @param index the index of the struct buffer
    public int transformFeedbackAt(long index) { return transformFeedback(this.segment(), index); }
    /// Sets `transformFeedback` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedbackAt(long index, int value) { transformFeedback(this.segment(), index, value); return this; }

    /// {@return `geometryStreams` at the given index}
    /// @param index the index of the struct buffer
    public int geometryStreamsAt(long index) { return geometryStreams(this.segment(), index); }
    /// Sets `geometryStreams` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreamsAt(long index, int value) { geometryStreams(this.segment(), index, value); return this; }

}
