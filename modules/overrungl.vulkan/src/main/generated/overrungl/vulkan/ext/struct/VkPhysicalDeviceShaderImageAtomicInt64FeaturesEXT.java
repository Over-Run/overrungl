// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderImageInt64Atomics;
///     (uint32_t) VkBool32 sparseImageInt64Atomics;
/// };
/// ```
public final class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderImageInt64Atomics"),
        ValueLayout.JAVA_INT.withName("sparseImageInt64Atomics")
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
    /// The byte offset of `shaderImageInt64Atomics`.
    public static final long OFFSET_shaderImageInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderImageInt64Atomics"));
    /// The memory layout of `shaderImageInt64Atomics`.
    public static final MemoryLayout LAYOUT_shaderImageInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderImageInt64Atomics"));
    /// The [VarHandle] of `shaderImageInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderImageInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageInt64Atomics"));
    /// The byte offset of `sparseImageInt64Atomics`.
    public static final long OFFSET_sparseImageInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("sparseImageInt64Atomics"));
    /// The memory layout of `sparseImageInt64Atomics`.
    public static final MemoryLayout LAYOUT_sparseImageInt64Atomics = LAYOUT.select(PathElement.groupElement("sparseImageInt64Atomics"));
    /// The [VarHandle] of `sparseImageInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sparseImageInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageInt64Atomics"));

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT copyFrom(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderImageInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderImageInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderImageInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderImageInt64Atomics`}
    public int shaderImageInt64Atomics() { return shaderImageInt64Atomics(this.segment(), 0L); }
    /// Sets `shaderImageInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderImageInt64Atomics(MemorySegment segment, long index, int value) { VH_shaderImageInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderImageInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(int value) { shaderImageInt64Atomics(this.segment(), 0L, value); return this; }

    /// {@return `sparseImageInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseImageInt64Atomics(MemorySegment segment, long index) { return (int) VH_sparseImageInt64Atomics.get(segment, 0L, index); }
    /// {@return `sparseImageInt64Atomics`}
    public int sparseImageInt64Atomics() { return sparseImageInt64Atomics(this.segment(), 0L); }
    /// Sets `sparseImageInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseImageInt64Atomics(MemorySegment segment, long index, int value) { VH_sparseImageInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `sparseImageInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(int value) { sparseImageInt64Atomics(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderImageInt64Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderImageInt64AtomicsAt(long index) { return shaderImageInt64Atomics(this.segment(), index); }
    /// Sets `shaderImageInt64Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64AtomicsAt(long index, int value) { shaderImageInt64Atomics(this.segment(), index, value); return this; }

    /// {@return `sparseImageInt64Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int sparseImageInt64AtomicsAt(long index) { return sparseImageInt64Atomics(this.segment(), index); }
    /// Sets `sparseImageInt64Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64AtomicsAt(long index, int value) { sparseImageInt64Atomics(this.segment(), index, value); return this; }

}
