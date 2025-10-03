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

/// Represents `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkPipelineShaderStageModuleIdentifierCreateInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t identifierSize;
///     const uint8_t* pIdentifier;
/// };
/// ```
public final class VkPipelineShaderStageModuleIdentifierCreateInfoEXT extends GroupType {
    /// The struct layout of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        ValueLayout.ADDRESS.withName("pIdentifier")
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
    /// The byte offset of `identifierSize`.
    public static final long OFFSET_identifierSize = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
    /// The memory layout of `identifierSize`.
    public static final MemoryLayout LAYOUT_identifierSize = LAYOUT.select(PathElement.groupElement("identifierSize"));
    /// The [VarHandle] of `identifierSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_identifierSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize")));
    /// The byte offset of `pIdentifier`.
    public static final long OFFSET_pIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pIdentifier"));
    /// The memory layout of `pIdentifier`.
    public static final MemoryLayout LAYOUT_pIdentifier = LAYOUT.select(PathElement.groupElement("pIdentifier"));
    /// The [VarHandle] of `pIdentifier` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pIdentifier = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pIdentifier")));

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT copyFrom(VkPipelineShaderStageModuleIdentifierCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT reinterpret(long count) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int identifierSize(MemorySegment segment, long index) { return (int) VH_identifierSize.get().get(segment, 0L, index); }
    /// {@return `identifierSize`}
    public int identifierSize() { return identifierSize(this.segment(), 0L); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identifierSize(MemorySegment segment, long index, int value) { VH_identifierSize.get().set(segment, 0L, index, value); }
    /// Sets `identifierSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT identifierSize(int value) { identifierSize(this.segment(), 0L, value); return this; }

    /// {@return `pIdentifier` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pIdentifier(MemorySegment segment, long index) { return (MemorySegment) VH_pIdentifier.get().get(segment, 0L, index); }
    /// {@return `pIdentifier`}
    public MemorySegment pIdentifier() { return pIdentifier(this.segment(), 0L); }
    /// Sets `pIdentifier` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pIdentifier(MemorySegment segment, long index, MemorySegment value) { VH_pIdentifier.get().set(segment, 0L, index, value); }
    /// Sets `pIdentifier` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifier(MemorySegment value) { pIdentifier(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT asSlice(long index) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineShaderStageModuleIdentifierCreateInfoEXT`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT asSlice(long index, long count) { return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineShaderStageModuleIdentifierCreateInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT at(long index, Consumer<VkPipelineShaderStageModuleIdentifierCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `identifierSize` at the given index}
    /// @param index the index of the struct buffer
    public int identifierSizeAt(long index) { return identifierSize(this.segment(), index); }
    /// Sets `identifierSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT identifierSizeAt(long index, int value) { identifierSize(this.segment(), index, value); return this; }

    /// {@return `pIdentifier` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pIdentifierAt(long index) { return pIdentifier(this.segment(), index); }
    /// Sets `pIdentifier` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifierAt(long index, MemorySegment value) { pIdentifier(this.segment(), index, value); return this; }

}
