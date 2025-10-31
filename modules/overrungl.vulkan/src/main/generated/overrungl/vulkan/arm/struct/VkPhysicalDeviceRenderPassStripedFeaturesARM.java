// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRenderPassStripedFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRenderPassStripedFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 renderPassStriped;
/// };
/// ```
public final class VkPhysicalDeviceRenderPassStripedFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceRenderPassStripedFeaturesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("renderPassStriped")
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
    /// The byte offset of `renderPassStriped`.
    public static final long OFFSET_renderPassStriped = LAYOUT.byteOffset(PathElement.groupElement("renderPassStriped"));
    /// The memory layout of `renderPassStriped`.
    public static final MemoryLayout LAYOUT_renderPassStriped = LAYOUT.select(PathElement.groupElement("renderPassStriped"));
    /// The [VarHandle] of `renderPassStriped` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderPassStriped = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPassStriped"));

    /// Creates `VkPhysicalDeviceRenderPassStripedFeaturesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceRenderPassStripedFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceRenderPassStripedFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceRenderPassStripedFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceRenderPassStripedFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceRenderPassStripedFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceRenderPassStripedFeaturesARM`
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceRenderPassStripedFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceRenderPassStripedFeaturesARM`
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM copyFrom(VkPhysicalDeviceRenderPassStripedFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceRenderPassStripedFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceRenderPassStripedFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `renderPassStriped` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int renderPassStriped(MemorySegment segment, long index) { return (int) VH_renderPassStriped.get(segment, 0L, index); }
    /// {@return `renderPassStriped`}
    public int renderPassStriped() { return renderPassStriped(this.segment(), 0L); }
    /// Sets `renderPassStriped` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderPassStriped(MemorySegment segment, long index, int value) { VH_renderPassStriped.set(segment, 0L, index, value); }
    /// Sets `renderPassStriped` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM renderPassStriped(int value) { renderPassStriped(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceRenderPassStripedFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceRenderPassStripedFeaturesARM`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM asSlice(long index) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceRenderPassStripedFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceRenderPassStripedFeaturesARM`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceRenderPassStripedFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceRenderPassStripedFeaturesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM at(long index, Consumer<VkPhysicalDeviceRenderPassStripedFeaturesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `renderPassStriped` at the given index}
    /// @param index the index of the struct buffer
    public int renderPassStripedAt(long index) { return renderPassStriped(this.segment(), index); }
    /// Sets `renderPassStriped` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceRenderPassStripedFeaturesARM renderPassStripedAt(long index, int value) { renderPassStriped(this.segment(), index, value); return this; }

}
