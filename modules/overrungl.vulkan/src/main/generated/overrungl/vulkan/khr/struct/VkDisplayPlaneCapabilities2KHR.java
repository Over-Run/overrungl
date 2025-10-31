// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDisplayPlaneCapabilities2KHR`.
/// ## Layout
/// ```
/// struct VkDisplayPlaneCapabilities2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkDisplayPlaneCapabilitiesKHR) VkDisplayPlaneCapabilitiesKHR capabilities;
/// };
/// ```
public final class VkDisplayPlaneCapabilities2KHR extends GroupType {
    /// The struct layout of `VkDisplayPlaneCapabilities2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkDisplayPlaneCapabilitiesKHR.LAYOUT.withName("capabilities")
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
    /// The byte offset of `capabilities`.
    public static final long OFFSET_capabilities = LAYOUT.byteOffset(PathElement.groupElement("capabilities"));
    /// The memory layout of `capabilities`.
    public static final MemoryLayout LAYOUT_capabilities = LAYOUT.select(PathElement.groupElement("capabilities"));

    /// Creates `VkDisplayPlaneCapabilities2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDisplayPlaneCapabilities2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDisplayPlaneCapabilities2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilities2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilities2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDisplayPlaneCapabilities2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilities2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilities2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDisplayPlaneCapabilities2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneCapabilities2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDisplayPlaneCapabilities2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDisplayPlaneCapabilities2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneCapabilities2KHR`
    public static VkDisplayPlaneCapabilities2KHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneCapabilities2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDisplayPlaneCapabilities2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlaneCapabilities2KHR`
    public static VkDisplayPlaneCapabilities2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneCapabilities2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR copyFrom(VkDisplayPlaneCapabilities2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDisplayPlaneCapabilities2KHR reinterpret(long count) { return new VkDisplayPlaneCapabilities2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDisplayPlaneCapabilities2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDisplayPlaneCapabilities2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `capabilities` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment capabilities(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_capabilities, index), LAYOUT_capabilities); }
    /// {@return `capabilities`}
    public MemorySegment capabilities() { return capabilities(this.segment(), 0L); }
    /// Sets `capabilities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void capabilities(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_capabilities, index), LAYOUT_capabilities.byteSize()); }
    /// Sets `capabilities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR capabilities(MemorySegment value) { capabilities(this.segment(), 0L, value); return this; }
    /// Accepts `capabilities` with the given function.
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR capabilities(Consumer<overrungl.vulkan.khr.struct.VkDisplayPlaneCapabilitiesKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkDisplayPlaneCapabilitiesKHR.of(capabilities())); return this; }

    /// Creates a slice of `VkDisplayPlaneCapabilities2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDisplayPlaneCapabilities2KHR`
    public VkDisplayPlaneCapabilities2KHR asSlice(long index) { return new VkDisplayPlaneCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDisplayPlaneCapabilities2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDisplayPlaneCapabilities2KHR`
    public VkDisplayPlaneCapabilities2KHR asSlice(long index, long count) { return new VkDisplayPlaneCapabilities2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDisplayPlaneCapabilities2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR at(long index, Consumer<VkDisplayPlaneCapabilities2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `capabilities` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment capabilitiesAt(long index) { return capabilities(this.segment(), index); }
    /// Sets `capabilities` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR capabilitiesAt(long index, MemorySegment value) { capabilities(this.segment(), index, value); return this; }
    /// Accepts `capabilities` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkDisplayPlaneCapabilities2KHR capabilitiesAt(long index, Consumer<overrungl.vulkan.khr.struct.VkDisplayPlaneCapabilitiesKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkDisplayPlaneCapabilitiesKHR.of(capabilitiesAt(index))); return this; }

}
