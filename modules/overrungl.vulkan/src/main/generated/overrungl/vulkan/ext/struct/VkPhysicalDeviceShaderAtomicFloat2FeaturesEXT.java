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

/// Represents `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderBufferFloat16Atomics;
///     (uint32_t) VkBool32 shaderBufferFloat16AtomicAdd;
///     (uint32_t) VkBool32 shaderBufferFloat16AtomicMinMax;
///     (uint32_t) VkBool32 shaderBufferFloat32AtomicMinMax;
///     (uint32_t) VkBool32 shaderBufferFloat64AtomicMinMax;
///     (uint32_t) VkBool32 shaderSharedFloat16Atomics;
///     (uint32_t) VkBool32 shaderSharedFloat16AtomicAdd;
///     (uint32_t) VkBool32 shaderSharedFloat16AtomicMinMax;
///     (uint32_t) VkBool32 shaderSharedFloat32AtomicMinMax;
///     (uint32_t) VkBool32 shaderSharedFloat64AtomicMinMax;
///     (uint32_t) VkBool32 shaderImageFloat32AtomicMinMax;
///     (uint32_t) VkBool32 sparseImageFloat32AtomicMinMax;
/// };
/// ```
public final class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderBufferFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16Atomics"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicAdd"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat16AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderSharedFloat64AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("shaderImageFloat32AtomicMinMax"),
        ValueLayout.JAVA_INT.withName("sparseImageFloat32AtomicMinMax")
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
    /// The byte offset of `shaderBufferFloat16Atomics`.
    public static final long OFFSET_shaderBufferFloat16Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16Atomics"));
    /// The memory layout of `shaderBufferFloat16Atomics`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat16Atomics = LAYOUT.select(PathElement.groupElement("shaderBufferFloat16Atomics"));
    /// The [VarHandle] of `shaderBufferFloat16Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderBufferFloat16Atomics = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16Atomics")));
    /// The byte offset of `shaderBufferFloat16AtomicAdd`.
    public static final long OFFSET_shaderBufferFloat16AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
    /// The memory layout of `shaderBufferFloat16AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat16AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderBufferFloat16AtomicAdd"));
    /// The [VarHandle] of `shaderBufferFloat16AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderBufferFloat16AtomicAdd = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16AtomicAdd")));
    /// The byte offset of `shaderBufferFloat16AtomicMinMax`.
    public static final long OFFSET_shaderBufferFloat16AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
    /// The memory layout of `shaderBufferFloat16AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat16AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderBufferFloat16AtomicMinMax"));
    /// The [VarHandle] of `shaderBufferFloat16AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderBufferFloat16AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat16AtomicMinMax")));
    /// The byte offset of `shaderBufferFloat32AtomicMinMax`.
    public static final long OFFSET_shaderBufferFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
    /// The memory layout of `shaderBufferFloat32AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderBufferFloat32AtomicMinMax"));
    /// The [VarHandle] of `shaderBufferFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderBufferFloat32AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat32AtomicMinMax")));
    /// The byte offset of `shaderBufferFloat64AtomicMinMax`.
    public static final long OFFSET_shaderBufferFloat64AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
    /// The memory layout of `shaderBufferFloat64AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderBufferFloat64AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderBufferFloat64AtomicMinMax"));
    /// The [VarHandle] of `shaderBufferFloat64AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderBufferFloat64AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBufferFloat64AtomicMinMax")));
    /// The byte offset of `shaderSharedFloat16Atomics`.
    public static final long OFFSET_shaderSharedFloat16Atomics = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16Atomics"));
    /// The memory layout of `shaderSharedFloat16Atomics`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat16Atomics = LAYOUT.select(PathElement.groupElement("shaderSharedFloat16Atomics"));
    /// The [VarHandle] of `shaderSharedFloat16Atomics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderSharedFloat16Atomics = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16Atomics")));
    /// The byte offset of `shaderSharedFloat16AtomicAdd`.
    public static final long OFFSET_shaderSharedFloat16AtomicAdd = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
    /// The memory layout of `shaderSharedFloat16AtomicAdd`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat16AtomicAdd = LAYOUT.select(PathElement.groupElement("shaderSharedFloat16AtomicAdd"));
    /// The [VarHandle] of `shaderSharedFloat16AtomicAdd` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderSharedFloat16AtomicAdd = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16AtomicAdd")));
    /// The byte offset of `shaderSharedFloat16AtomicMinMax`.
    public static final long OFFSET_shaderSharedFloat16AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
    /// The memory layout of `shaderSharedFloat16AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat16AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderSharedFloat16AtomicMinMax"));
    /// The [VarHandle] of `shaderSharedFloat16AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderSharedFloat16AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat16AtomicMinMax")));
    /// The byte offset of `shaderSharedFloat32AtomicMinMax`.
    public static final long OFFSET_shaderSharedFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
    /// The memory layout of `shaderSharedFloat32AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderSharedFloat32AtomicMinMax"));
    /// The [VarHandle] of `shaderSharedFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderSharedFloat32AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat32AtomicMinMax")));
    /// The byte offset of `shaderSharedFloat64AtomicMinMax`.
    public static final long OFFSET_shaderSharedFloat64AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
    /// The memory layout of `shaderSharedFloat64AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderSharedFloat64AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderSharedFloat64AtomicMinMax"));
    /// The [VarHandle] of `shaderSharedFloat64AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderSharedFloat64AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSharedFloat64AtomicMinMax")));
    /// The byte offset of `shaderImageFloat32AtomicMinMax`.
    public static final long OFFSET_shaderImageFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
    /// The memory layout of `shaderImageFloat32AtomicMinMax`.
    public static final MemoryLayout LAYOUT_shaderImageFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("shaderImageFloat32AtomicMinMax"));
    /// The [VarHandle] of `shaderImageFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderImageFloat32AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderImageFloat32AtomicMinMax")));
    /// The byte offset of `sparseImageFloat32AtomicMinMax`.
    public static final long OFFSET_sparseImageFloat32AtomicMinMax = LAYOUT.byteOffset(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));
    /// The memory layout of `sparseImageFloat32AtomicMinMax`.
    public static final MemoryLayout LAYOUT_sparseImageFloat32AtomicMinMax = LAYOUT.select(PathElement.groupElement("sparseImageFloat32AtomicMinMax"));
    /// The [VarHandle] of `sparseImageFloat32AtomicMinMax` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sparseImageFloat32AtomicMinMax = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseImageFloat32AtomicMinMax")));

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT copyFrom(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat16Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat16Atomics(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat16Atomics.get().get(segment, 0L, index); }
    /// {@return `shaderBufferFloat16Atomics`}
    public int shaderBufferFloat16Atomics() { return shaderBufferFloat16Atomics(this.segment(), 0L); }
    /// Sets `shaderBufferFloat16Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat16Atomics(MemorySegment segment, long index, int value) { VH_shaderBufferFloat16Atomics.get().set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat16Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(int value) { shaderBufferFloat16Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat16AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat16AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat16AtomicAdd.get().get(segment, 0L, index); }
    /// {@return `shaderBufferFloat16AtomicAdd`}
    public int shaderBufferFloat16AtomicAdd() { return shaderBufferFloat16AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat16AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderBufferFloat16AtomicAdd.get().set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(int value) { shaderBufferFloat16AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat16AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat16AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat16AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderBufferFloat16AtomicMinMax`}
    public int shaderBufferFloat16AtomicMinMax() { return shaderBufferFloat16AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat16AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderBufferFloat16AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(int value) { shaderBufferFloat16AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat32AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderBufferFloat32AtomicMinMax`}
    public int shaderBufferFloat32AtomicMinMax() { return shaderBufferFloat32AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat32AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderBufferFloat32AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(int value) { shaderBufferFloat32AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `shaderBufferFloat64AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBufferFloat64AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderBufferFloat64AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderBufferFloat64AtomicMinMax`}
    public int shaderBufferFloat64AtomicMinMax() { return shaderBufferFloat64AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBufferFloat64AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderBufferFloat64AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(int value) { shaderBufferFloat64AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat16Atomics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat16Atomics(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat16Atomics.get().get(segment, 0L, index); }
    /// {@return `shaderSharedFloat16Atomics`}
    public int shaderSharedFloat16Atomics() { return shaderSharedFloat16Atomics(this.segment(), 0L); }
    /// Sets `shaderSharedFloat16Atomics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat16Atomics(MemorySegment segment, long index, int value) { VH_shaderSharedFloat16Atomics.get().set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat16Atomics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(int value) { shaderSharedFloat16Atomics(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat16AtomicAdd` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat16AtomicAdd(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat16AtomicAdd.get().get(segment, 0L, index); }
    /// {@return `shaderSharedFloat16AtomicAdd`}
    public int shaderSharedFloat16AtomicAdd() { return shaderSharedFloat16AtomicAdd(this.segment(), 0L); }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat16AtomicAdd(MemorySegment segment, long index, int value) { VH_shaderSharedFloat16AtomicAdd.get().set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(int value) { shaderSharedFloat16AtomicAdd(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat16AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat16AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat16AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderSharedFloat16AtomicMinMax`}
    public int shaderSharedFloat16AtomicMinMax() { return shaderSharedFloat16AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat16AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderSharedFloat16AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(int value) { shaderSharedFloat16AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat32AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderSharedFloat32AtomicMinMax`}
    public int shaderSharedFloat32AtomicMinMax() { return shaderSharedFloat32AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat32AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderSharedFloat32AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(int value) { shaderSharedFloat32AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `shaderSharedFloat64AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderSharedFloat64AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderSharedFloat64AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderSharedFloat64AtomicMinMax`}
    public int shaderSharedFloat64AtomicMinMax() { return shaderSharedFloat64AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderSharedFloat64AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderSharedFloat64AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(int value) { shaderSharedFloat64AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `shaderImageFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderImageFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_shaderImageFloat32AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `shaderImageFloat32AtomicMinMax`}
    public int shaderImageFloat32AtomicMinMax() { return shaderImageFloat32AtomicMinMax(this.segment(), 0L); }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderImageFloat32AtomicMinMax(MemorySegment segment, long index, int value) { VH_shaderImageFloat32AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(int value) { shaderImageFloat32AtomicMinMax(this.segment(), 0L, value); return this; }

    /// {@return `sparseImageFloat32AtomicMinMax` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sparseImageFloat32AtomicMinMax(MemorySegment segment, long index) { return (int) VH_sparseImageFloat32AtomicMinMax.get().get(segment, 0L, index); }
    /// {@return `sparseImageFloat32AtomicMinMax`}
    public int sparseImageFloat32AtomicMinMax() { return sparseImageFloat32AtomicMinMax(this.segment(), 0L); }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseImageFloat32AtomicMinMax(MemorySegment segment, long index, int value) { VH_sparseImageFloat32AtomicMinMax.get().set(segment, 0L, index, value); }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(int value) { sparseImageFloat32AtomicMinMax(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderBufferFloat16Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferFloat16AtomicsAt(long index) { return shaderBufferFloat16Atomics(this.segment(), index); }
    /// Sets `shaderBufferFloat16Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicsAt(long index, int value) { shaderBufferFloat16Atomics(this.segment(), index, value); return this; }

    /// {@return `shaderBufferFloat16AtomicAdd` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferFloat16AtomicAddAt(long index) { return shaderBufferFloat16AtomicAdd(this.segment(), index); }
    /// Sets `shaderBufferFloat16AtomicAdd` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAddAt(long index, int value) { shaderBufferFloat16AtomicAdd(this.segment(), index, value); return this; }

    /// {@return `shaderBufferFloat16AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferFloat16AtomicMinMaxAt(long index) { return shaderBufferFloat16AtomicMinMax(this.segment(), index); }
    /// Sets `shaderBufferFloat16AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMaxAt(long index, int value) { shaderBufferFloat16AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `shaderBufferFloat32AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferFloat32AtomicMinMaxAt(long index) { return shaderBufferFloat32AtomicMinMax(this.segment(), index); }
    /// Sets `shaderBufferFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMaxAt(long index, int value) { shaderBufferFloat32AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `shaderBufferFloat64AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBufferFloat64AtomicMinMaxAt(long index) { return shaderBufferFloat64AtomicMinMax(this.segment(), index); }
    /// Sets `shaderBufferFloat64AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMaxAt(long index, int value) { shaderBufferFloat64AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `shaderSharedFloat16Atomics` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedFloat16AtomicsAt(long index) { return shaderSharedFloat16Atomics(this.segment(), index); }
    /// Sets `shaderSharedFloat16Atomics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicsAt(long index, int value) { shaderSharedFloat16Atomics(this.segment(), index, value); return this; }

    /// {@return `shaderSharedFloat16AtomicAdd` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedFloat16AtomicAddAt(long index) { return shaderSharedFloat16AtomicAdd(this.segment(), index); }
    /// Sets `shaderSharedFloat16AtomicAdd` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAddAt(long index, int value) { shaderSharedFloat16AtomicAdd(this.segment(), index, value); return this; }

    /// {@return `shaderSharedFloat16AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedFloat16AtomicMinMaxAt(long index) { return shaderSharedFloat16AtomicMinMax(this.segment(), index); }
    /// Sets `shaderSharedFloat16AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMaxAt(long index, int value) { shaderSharedFloat16AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `shaderSharedFloat32AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedFloat32AtomicMinMaxAt(long index) { return shaderSharedFloat32AtomicMinMax(this.segment(), index); }
    /// Sets `shaderSharedFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMaxAt(long index, int value) { shaderSharedFloat32AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `shaderSharedFloat64AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderSharedFloat64AtomicMinMaxAt(long index) { return shaderSharedFloat64AtomicMinMax(this.segment(), index); }
    /// Sets `shaderSharedFloat64AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMaxAt(long index, int value) { shaderSharedFloat64AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `shaderImageFloat32AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int shaderImageFloat32AtomicMinMaxAt(long index) { return shaderImageFloat32AtomicMinMax(this.segment(), index); }
    /// Sets `shaderImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMaxAt(long index, int value) { shaderImageFloat32AtomicMinMax(this.segment(), index, value); return this; }

    /// {@return `sparseImageFloat32AtomicMinMax` at the given index}
    /// @param index the index of the struct buffer
    public int sparseImageFloat32AtomicMinMaxAt(long index) { return sparseImageFloat32AtomicMinMax(this.segment(), index); }
    /// Sets `sparseImageFloat32AtomicMinMax` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMaxAt(long index, int value) { sparseImageFloat32AtomicMinMax(this.segment(), index, value); return this; }

}
