// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderFloat16VectorAtomics;
/// };
/// ```
public final class VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16VectorAtomics")
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
    /// The byte offset of `shaderFloat16VectorAtomics`.
    public static final long OFFSET_shaderFloat16VectorAtomics = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16VectorAtomics"));
    /// The memory layout of `shaderFloat16VectorAtomics`.
    public static final MemoryLayout LAYOUT_shaderFloat16VectorAtomics = LAYOUT.select(PathElement.groupElement("shaderFloat16VectorAtomics"));
    /// The [VarHandle] of `shaderFloat16VectorAtomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderFloat16VectorAtomics = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat16VectorAtomics")));

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV copyFrom(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloat16VectorAtomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloat16VectorAtomics(MemorySegment segment, long index) { return (int) VH_shaderFloat16VectorAtomics.get().get(segment, 0L, index); }
    /// {@return `shaderFloat16VectorAtomics`}
    public int shaderFloat16VectorAtomics() { return shaderFloat16VectorAtomics(this.segment(), 0L); }
    /// Sets `shaderFloat16VectorAtomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloat16VectorAtomics(MemorySegment segment, long index, int value) { VH_shaderFloat16VectorAtomics.get().set(segment, 0L, index, value); }
    /// Sets `shaderFloat16VectorAtomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomics(int value) { shaderFloat16VectorAtomics(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV at(long index, Consumer<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderFloat16VectorAtomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloat16VectorAtomicsAt(long index) { return shaderFloat16VectorAtomics(this.segment(), index); }
    /// Sets `shaderFloat16VectorAtomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomicsAt(long index, int value) { shaderFloat16VectorAtomics(this.segment(), index, value); return this; }

}
