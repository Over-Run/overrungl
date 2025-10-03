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

/// Represents `VkExternalTensorPropertiesARM`.
/// ## Layout
/// ```
/// struct VkExternalTensorPropertiesARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkExternalMemoryProperties) VkExternalMemoryProperties externalMemoryProperties;
/// };
/// ```
public final class VkExternalTensorPropertiesARM extends GroupType {
    /// The struct layout of `VkExternalTensorPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExternalMemoryProperties.LAYOUT.withName("externalMemoryProperties")
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
    /// The byte offset of `externalMemoryProperties`.
    public static final long OFFSET_externalMemoryProperties = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryProperties"));
    /// The memory layout of `externalMemoryProperties`.
    public static final MemoryLayout LAYOUT_externalMemoryProperties = LAYOUT.select(PathElement.groupElement("externalMemoryProperties"));

    /// Creates `VkExternalTensorPropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalTensorPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalTensorPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalTensorPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalTensorPropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalTensorPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalTensorPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalTensorPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalTensorPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalTensorPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalTensorPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalTensorPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalTensorPropertiesARM`
    public static VkExternalTensorPropertiesARM alloc(SegmentAllocator allocator) { return new VkExternalTensorPropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalTensorPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalTensorPropertiesARM`
    public static VkExternalTensorPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkExternalTensorPropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalTensorPropertiesARM copyFrom(VkExternalTensorPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalTensorPropertiesARM reinterpret(long count) { return new VkExternalTensorPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExternalTensorPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalTensorPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `externalMemoryProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment externalMemoryProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_externalMemoryProperties, index), LAYOUT_externalMemoryProperties); }
    /// {@return `externalMemoryProperties`}
    public MemorySegment externalMemoryProperties() { return externalMemoryProperties(this.segment(), 0L); }
    /// Sets `externalMemoryProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalMemoryProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_externalMemoryProperties, index), LAYOUT_externalMemoryProperties.byteSize()); }
    /// Sets `externalMemoryProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalTensorPropertiesARM externalMemoryProperties(MemorySegment value) { externalMemoryProperties(this.segment(), 0L, value); return this; }
    /// Accepts `externalMemoryProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkExternalTensorPropertiesARM externalMemoryProperties(Consumer<overrungl.vulkan.struct.VkExternalMemoryProperties> func) { func.accept(overrungl.vulkan.struct.VkExternalMemoryProperties.of(externalMemoryProperties())); return this; }

    /// Creates a slice of `VkExternalTensorPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalTensorPropertiesARM`
    public VkExternalTensorPropertiesARM asSlice(long index) { return new VkExternalTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalTensorPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalTensorPropertiesARM`
    public VkExternalTensorPropertiesARM asSlice(long index, long count) { return new VkExternalTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalTensorPropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalTensorPropertiesARM at(long index, Consumer<VkExternalTensorPropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalTensorPropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalTensorPropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `externalMemoryProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment externalMemoryPropertiesAt(long index) { return externalMemoryProperties(this.segment(), index); }
    /// Sets `externalMemoryProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalTensorPropertiesARM externalMemoryPropertiesAt(long index, MemorySegment value) { externalMemoryProperties(this.segment(), index, value); return this; }
    /// Accepts `externalMemoryProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkExternalTensorPropertiesARM externalMemoryPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkExternalMemoryProperties> func) { func.accept(overrungl.vulkan.struct.VkExternalMemoryProperties.of(externalMemoryPropertiesAt(index))); return this; }

}
