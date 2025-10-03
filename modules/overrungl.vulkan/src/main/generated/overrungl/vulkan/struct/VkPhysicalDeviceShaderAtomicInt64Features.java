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

/// Represents `VkPhysicalDeviceShaderAtomicInt64Features`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicInt64Features {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderBufferInt64Atomics;
///     (uint32_t) VkBool32 shaderSharedInt64Atomics;
/// };
/// ```
public final class VkPhysicalDeviceShaderAtomicInt64Features extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicInt64Features`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferInt64Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedInt64Atomics")
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
    /// The byte offset of `shaderBufferInt64Atomics`.
    public static final long OFFSET_shaderBufferInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The memory layout of `shaderBufferInt64Atomics`.
    public static final MemoryLayout LAYOUT_shaderBufferInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The [VarHandle] of `shaderBufferInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBufferInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
    /// The byte offset of `shaderSharedInt64Atomics`.
    public static final long OFFSET_shaderSharedInt64Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedInt64Atomics"));
    /// The memory layout of `shaderSharedInt64Atomics`.
    public static final MemoryLayout LAYOUT_shaderSharedInt64Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedInt64Atomics"));
    /// The [VarHandle] of `shaderSharedInt64Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderSharedInt64Atomics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedInt64Atomics"));

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderAtomicInt64Features(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicInt64Features of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64Features(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicInt64Features ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64Features(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicInt64Features ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicInt64Features(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicInt64Features`
    public static VkPhysicalDeviceShaderAtomicInt64Features alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicInt64Features(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicInt64Features` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicInt64Features`
    public static VkPhysicalDeviceShaderAtomicInt64Features alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicInt64Features(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features copyFrom(VkPhysicalDeviceShaderAtomicInt64Features src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderAtomicInt64Features reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicInt64Features(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderAtomicInt64Features sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderAtomicInt64Features pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderBufferInt64Atomics`}
    public int shaderBufferInt64Atomics() { return shaderBufferInt64Atomics(this.segment(), 0L); }
    /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferInt64Atomics(MemorySegment segment, long index, int value) { VH_shaderBufferInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderBufferInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64Atomics(int value) { shaderBufferInt64Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedInt64Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedInt64Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedInt64Atomics.get(segment, 0L, index); }
    /// {@return `shaderSharedInt64Atomics`}
    public int shaderSharedInt64Atomics() { return shaderSharedInt64Atomics(this.segment(), 0L); }
    /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedInt64Atomics(MemorySegment segment, long index, int value) { VH_shaderSharedInt64Atomics.set(segment, 0L, index, value); }
    /// Sets `shaderSharedInt64Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64Atomics(int value) { shaderSharedInt64Atomics(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicInt64Features`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderAtomicInt64Features`
    public VkPhysicalDeviceShaderAtomicInt64Features asSlice(long index) { return new VkPhysicalDeviceShaderAtomicInt64Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicInt64Features`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderAtomicInt64Features`
    public VkPhysicalDeviceShaderAtomicInt64Features asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicInt64Features(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderAtomicInt64Features` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features at(long index, Consumer<VkPhysicalDeviceShaderAtomicInt64Features> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderBufferInt64Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferInt64AtomicsAt(long index) { return shaderBufferInt64Atomics(this.segment(), index); }
    /// Sets `shaderBufferInt64Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features shaderBufferInt64AtomicsAt(long index, int value) { shaderBufferInt64Atomics(this.segment(), index, value); return this; }

    /// {@return `shaderSharedInt64Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedInt64AtomicsAt(long index) { return shaderSharedInt64Atomics(this.segment(), index); }
    /// Sets `shaderSharedInt64Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicInt64Features shaderSharedInt64AtomicsAt(long index, int value) { shaderSharedInt64Atomics(this.segment(), index, value); return this; }

}
