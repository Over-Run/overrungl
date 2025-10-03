// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.valve.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorSetLayoutHostMappingInfoVALVE`.
/// ## Layout
/// ```
/// struct VkDescriptorSetLayoutHostMappingInfoVALVE {
///     (int) VkStructureType sType;
///     void* pNext;
///     size_t descriptorOffset;
///     uint32_t descriptorSize;
/// };
/// ```
public final class VkDescriptorSetLayoutHostMappingInfoVALVE extends GroupType {
    /// The struct layout of `VkDescriptorSetLayoutHostMappingInfoVALVE`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("descriptorOffset"),
        ValueLayout.JAVA_INT.withName("descriptorSize")
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
    /// The byte offset of `descriptorOffset`.
    public static final long OFFSET_descriptorOffset = LAYOUT.byteOffset(PathElement.groupElement("descriptorOffset"));
    /// The memory layout of `descriptorOffset`.
    public static final MemoryLayout LAYOUT_descriptorOffset = LAYOUT.select(PathElement.groupElement("descriptorOffset"));
    /// The [VarHandle] of `descriptorOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorOffset"));
    /// The byte offset of `descriptorSize`.
    public static final long OFFSET_descriptorSize = LAYOUT.byteOffset(PathElement.groupElement("descriptorSize"));
    /// The memory layout of `descriptorSize`.
    public static final MemoryLayout LAYOUT_descriptorSize = LAYOUT.select(PathElement.groupElement("descriptorSize"));
    /// The [VarHandle] of `descriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSize"));

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDescriptorSetLayoutHostMappingInfoVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorSetLayoutHostMappingInfoVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE alloc(SegmentAllocator allocator) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDescriptorSetLayoutHostMappingInfoVALVE` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public static VkDescriptorSetLayoutHostMappingInfoVALVE alloc(SegmentAllocator allocator, long count) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE copyFrom(VkDescriptorSetLayoutHostMappingInfoVALVE src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDescriptorSetLayoutHostMappingInfoVALVE reinterpret(long count) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDescriptorSetLayoutHostMappingInfoVALVE sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `descriptorOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long descriptorOffset(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_descriptorOffset.get(segment, 0L, index)); }
    /// {@return `descriptorOffset`}
    public long descriptorOffset() { return descriptorOffset(this.segment(), 0L); }
    /// Sets `descriptorOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorOffset(MemorySegment segment, long index, long value) { VH_descriptorOffset.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `descriptorOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffset(long value) { descriptorOffset(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSize(MemorySegment segment, long index) { return (int) VH_descriptorSize.get(segment, 0L, index); }
    /// {@return `descriptorSize`}
    public int descriptorSize() { return descriptorSize(this.segment(), 0L); }
    /// Sets `descriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSize(MemorySegment segment, long index, int value) { VH_descriptorSize.set(segment, 0L, index, value); }
    /// Sets `descriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSize(int value) { descriptorSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public VkDescriptorSetLayoutHostMappingInfoVALVE asSlice(long index) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDescriptorSetLayoutHostMappingInfoVALVE`
    public VkDescriptorSetLayoutHostMappingInfoVALVE asSlice(long index, long count) { return new VkDescriptorSetLayoutHostMappingInfoVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDescriptorSetLayoutHostMappingInfoVALVE` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE at(long index, Consumer<VkDescriptorSetLayoutHostMappingInfoVALVE> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `descriptorOffset` at the given index}
    /// @param index the index of the struct buffer
    public long descriptorOffsetAt(long index) { return descriptorOffset(this.segment(), index); }
    /// Sets `descriptorOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorOffsetAt(long index, long value) { descriptorOffset(this.segment(), index, value); return this; }

    /// {@return `descriptorSize` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSizeAt(long index) { return descriptorSize(this.segment(), index); }
    /// Sets `descriptorSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDescriptorSetLayoutHostMappingInfoVALVE descriptorSizeAt(long index, int value) { descriptorSize(this.segment(), index, value); return this; }

}
