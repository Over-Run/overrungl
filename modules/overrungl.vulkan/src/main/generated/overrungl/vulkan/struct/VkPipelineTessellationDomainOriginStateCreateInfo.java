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

/// Represents `VkPipelineTessellationDomainOriginStateCreateInfo`.
/// ## Layout
/// ```
/// struct VkPipelineTessellationDomainOriginStateCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkTessellationDomainOrigin domainOrigin;
/// };
/// ```
public final class VkPipelineTessellationDomainOriginStateCreateInfo extends GroupType {
    /// The struct layout of `VkPipelineTessellationDomainOriginStateCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("domainOrigin")
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
    /// The byte offset of `domainOrigin`.
    public static final long OFFSET_domainOrigin = LAYOUT.byteOffset(PathElement.groupElement("domainOrigin"));
    /// The memory layout of `domainOrigin`.
    public static final MemoryLayout LAYOUT_domainOrigin = LAYOUT.select(PathElement.groupElement("domainOrigin"));
    /// The [VarHandle] of `domainOrigin` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_domainOrigin = LAYOUT.arrayElementVarHandle(PathElement.groupElement("domainOrigin"));

    /// Creates `VkPipelineTessellationDomainOriginStateCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineTessellationDomainOriginStateCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineTessellationDomainOriginStateCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineTessellationDomainOriginStateCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationDomainOriginStateCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineTessellationDomainOriginStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineTessellationDomainOriginStateCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationDomainOriginStateCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineTessellationDomainOriginStateCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineTessellationDomainOriginStateCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineTessellationDomainOriginStateCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineTessellationDomainOriginStateCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineTessellationDomainOriginStateCreateInfo`
    public static VkPipelineTessellationDomainOriginStateCreateInfo alloc(SegmentAllocator allocator) { return new VkPipelineTessellationDomainOriginStateCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineTessellationDomainOriginStateCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineTessellationDomainOriginStateCreateInfo`
    public static VkPipelineTessellationDomainOriginStateCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkPipelineTessellationDomainOriginStateCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineTessellationDomainOriginStateCreateInfo copyFrom(VkPipelineTessellationDomainOriginStateCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineTessellationDomainOriginStateCreateInfo reinterpret(long count) { return new VkPipelineTessellationDomainOriginStateCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineTessellationDomainOriginStateCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineTessellationDomainOriginStateCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `domainOrigin` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int domainOrigin(MemorySegment segment, long index) { return (int) VH_domainOrigin.get(segment, 0L, index); }
    /// {@return `domainOrigin`}
    public int domainOrigin() { return domainOrigin(this.segment(), 0L); }
    /// Sets `domainOrigin` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void domainOrigin(MemorySegment segment, long index, int value) { VH_domainOrigin.set(segment, 0L, index, value); }
    /// Sets `domainOrigin` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationDomainOriginStateCreateInfo domainOrigin(int value) { domainOrigin(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPipelineTessellationDomainOriginStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineTessellationDomainOriginStateCreateInfo`
    public VkPipelineTessellationDomainOriginStateCreateInfo asSlice(long index) { return new VkPipelineTessellationDomainOriginStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineTessellationDomainOriginStateCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineTessellationDomainOriginStateCreateInfo`
    public VkPipelineTessellationDomainOriginStateCreateInfo asSlice(long index, long count) { return new VkPipelineTessellationDomainOriginStateCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineTessellationDomainOriginStateCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineTessellationDomainOriginStateCreateInfo at(long index, Consumer<VkPipelineTessellationDomainOriginStateCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationDomainOriginStateCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationDomainOriginStateCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `domainOrigin` at the given index}
    /// @param index the index of the struct buffer
    public int domainOriginAt(long index) { return domainOrigin(this.segment(), index); }
    /// Sets `domainOrigin` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineTessellationDomainOriginStateCreateInfo domainOriginAt(long index, int value) { domainOrigin(this.segment(), index, value); return this; }

}
