// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxVertexAttribDivisor;
///     (uint32_t) VkBool32 supportsNonZeroFirstInstance;
/// };
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance")
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
    /// The byte offset of `maxVertexAttribDivisor`.
    public static final long OFFSET_maxVertexAttribDivisor = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The memory layout of `maxVertexAttribDivisor`.
    public static final MemoryLayout LAYOUT_maxVertexAttribDivisor = LAYOUT.select(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The [VarHandle] of `maxVertexAttribDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The byte offset of `supportsNonZeroFirstInstance`.
    public static final long OFFSET_supportsNonZeroFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The memory layout of `supportsNonZeroFirstInstance`.
    public static final MemoryLayout LAYOUT_supportsNonZeroFirstInstance = LAYOUT.select(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The [VarHandle] of `supportsNonZeroFirstInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`
    public static VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR copyFrom(VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR reinterpret(long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexAttribDivisor(MemorySegment segment, long index) { return (int) VH_maxVertexAttribDivisor.get(segment, 0L, index); }
    /// {@return `maxVertexAttribDivisor`}
    public int maxVertexAttribDivisor() { return maxVertexAttribDivisor(this.segment(), 0L); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexAttribDivisor(MemorySegment segment, long index, int value) { VH_maxVertexAttribDivisor.set(segment, 0L, index, value); }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR maxVertexAttribDivisor(int value) { maxVertexAttribDivisor(this.segment(), 0L, value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportsNonZeroFirstInstance(MemorySegment segment, long index) { return (int) VH_supportsNonZeroFirstInstance.get(segment, 0L, index); }
    /// {@return `supportsNonZeroFirstInstance`}
    public int supportsNonZeroFirstInstance() { return supportsNonZeroFirstInstance(this.segment(), 0L); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportsNonZeroFirstInstance(MemorySegment segment, long index, int value) { VH_supportsNonZeroFirstInstance.set(segment, 0L, index, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR supportsNonZeroFirstInstance(int value) { supportsNonZeroFirstInstance(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR at(long index, Consumer<VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexAttribDivisorAt(long index) { return maxVertexAttribDivisor(this.segment(), index); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR maxVertexAttribDivisorAt(long index, int value) { maxVertexAttribDivisor(this.segment(), index, value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param index the index of the struct buffer
    public int supportsNonZeroFirstInstanceAt(long index) { return supportsNonZeroFirstInstance(this.segment(), index); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR supportsNonZeroFirstInstanceAt(long index, int value) { supportsNonZeroFirstInstance(this.segment(), index, value); return this; }

}
