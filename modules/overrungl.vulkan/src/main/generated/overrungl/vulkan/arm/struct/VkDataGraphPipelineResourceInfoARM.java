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

/// Represents `VkDataGraphPipelineResourceInfoARM`.
/// ## Layout
/// ```
/// struct VkDataGraphPipelineResourceInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t descriptorSet;
///     uint32_t binding;
///     uint32_t arrayElement;
/// };
/// ```
public final class VkDataGraphPipelineResourceInfoARM extends GroupType {
    /// The struct layout of `VkDataGraphPipelineResourceInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSet"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("arrayElement")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `descriptorSet`.
    public static final long OFFSET_descriptorSet = LAYOUT.byteOffset(PathElement.groupElement("descriptorSet"));
    /// The memory layout of `descriptorSet`.
    public static final MemoryLayout LAYOUT_descriptorSet = LAYOUT.select(PathElement.groupElement("descriptorSet"));
    /// The [VarHandle] of `descriptorSet` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSet = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSet"));
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `arrayElement`.
    public static final long OFFSET_arrayElement = LAYOUT.byteOffset(PathElement.groupElement("arrayElement"));
    /// The memory layout of `arrayElement`.
    public static final MemoryLayout LAYOUT_arrayElement = LAYOUT.select(PathElement.groupElement("arrayElement"));
    /// The [VarHandle] of `arrayElement` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_arrayElement = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayElement"));

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDataGraphPipelineResourceInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineResourceInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineResourceInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDataGraphPipelineResourceInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDataGraphPipelineResourceInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDataGraphPipelineResourceInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM alloc(SegmentAllocator allocator) { return new VkDataGraphPipelineResourceInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDataGraphPipelineResourceInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDataGraphPipelineResourceInfoARM`
    public static VkDataGraphPipelineResourceInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDataGraphPipelineResourceInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM copyFrom(VkDataGraphPipelineResourceInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDataGraphPipelineResourceInfoARM reinterpret(long count) { return new VkDataGraphPipelineResourceInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSet` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSet(MemorySegment segment, long index) { return (int) VH_descriptorSet.get(segment, 0L, index); }
    /// {@return `descriptorSet`}
    public int descriptorSet() { return descriptorSet(this.segment(), 0L); }
    /// Sets `descriptorSet` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSet(MemorySegment segment, long index, int value) { VH_descriptorSet.set(segment, 0L, index, value); }
    /// Sets `descriptorSet` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM descriptorSet(int value) { descriptorSet(this.segment(), 0L, value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `arrayElement` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int arrayElement(MemorySegment segment, long index) { return (int) VH_arrayElement.get(segment, 0L, index); }
    /// {@return `arrayElement`}
    public int arrayElement() { return arrayElement(this.segment(), 0L); }
    /// Sets `arrayElement` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayElement(MemorySegment segment, long index, int value) { VH_arrayElement.set(segment, 0L, index, value); }
    /// Sets `arrayElement` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM arrayElement(int value) { arrayElement(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDataGraphPipelineResourceInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDataGraphPipelineResourceInfoARM`
    public VkDataGraphPipelineResourceInfoARM asSlice(long index) { return new VkDataGraphPipelineResourceInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDataGraphPipelineResourceInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDataGraphPipelineResourceInfoARM`
    public VkDataGraphPipelineResourceInfoARM asSlice(long index, long count) { return new VkDataGraphPipelineResourceInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDataGraphPipelineResourceInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM at(long index, Consumer<VkDataGraphPipelineResourceInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `descriptorSet` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetAt(long index) { return descriptorSet(this.segment(), index); }
    /// Sets `descriptorSet` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM descriptorSetAt(long index, int value) { descriptorSet(this.segment(), index, value); return this; }

    /// {@return `binding` at the given index}
    /// @param index the index of the struct buffer
    public int bindingAt(long index) { return binding(this.segment(), index); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    /// {@return `arrayElement` at the given index}
    /// @param index the index of the struct buffer
    public int arrayElementAt(long index) { return arrayElement(this.segment(), index); }
    /// Sets `arrayElement` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDataGraphPipelineResourceInfoARM arrayElementAt(long index, int value) { arrayElement(this.segment(), index, value); return this; }

}
