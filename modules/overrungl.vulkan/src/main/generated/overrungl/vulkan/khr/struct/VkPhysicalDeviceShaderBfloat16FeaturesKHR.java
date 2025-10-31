// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderBfloat16FeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderBfloat16FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderBFloat16Type;
///     (uint32_t) VkBool32 shaderBFloat16DotProduct;
///     (uint32_t) VkBool32 shaderBFloat16CooperativeMatrix;
/// };
/// ```
public final class VkPhysicalDeviceShaderBfloat16FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderBfloat16FeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderBFloat16Type"),
        ValueLayout.JAVA_INT.withName("shaderBFloat16DotProduct"),
        ValueLayout.JAVA_INT.withName("shaderBFloat16CooperativeMatrix")
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
    /// The byte offset of `shaderBFloat16Type`.
    public static final long OFFSET_shaderBFloat16Type = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16Type"));
    /// The memory layout of `shaderBFloat16Type`.
    public static final MemoryLayout LAYOUT_shaderBFloat16Type = LAYOUT.select(PathElement.groupElement("shaderBFloat16Type"));
    /// The [VarHandle] of `shaderBFloat16Type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBFloat16Type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBFloat16Type"));
    /// The byte offset of `shaderBFloat16DotProduct`.
    public static final long OFFSET_shaderBFloat16DotProduct = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16DotProduct"));
    /// The memory layout of `shaderBFloat16DotProduct`.
    public static final MemoryLayout LAYOUT_shaderBFloat16DotProduct = LAYOUT.select(PathElement.groupElement("shaderBFloat16DotProduct"));
    /// The [VarHandle] of `shaderBFloat16DotProduct` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBFloat16DotProduct = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBFloat16DotProduct"));
    /// The byte offset of `shaderBFloat16CooperativeMatrix`.
    public static final long OFFSET_shaderBFloat16CooperativeMatrix = LAYOUT.byteOffset(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));
    /// The memory layout of `shaderBFloat16CooperativeMatrix`.
    public static final MemoryLayout LAYOUT_shaderBFloat16CooperativeMatrix = LAYOUT.select(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));
    /// The [VarHandle] of `shaderBFloat16CooperativeMatrix` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderBFloat16CooperativeMatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBFloat16CooperativeMatrix"));

    /// Creates `VkPhysicalDeviceShaderBfloat16FeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderBfloat16FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderBfloat16FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderBfloat16FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderBfloat16FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderBfloat16FeaturesKHR`
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderBfloat16FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderBfloat16FeaturesKHR`
    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR copyFrom(VkPhysicalDeviceShaderBfloat16FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderBFloat16Type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBFloat16Type(MemorySegment segment, long index) { return (int) VH_shaderBFloat16Type.get(segment, 0L, index); }
    /// {@return `shaderBFloat16Type`}
    public int shaderBFloat16Type() { return shaderBFloat16Type(this.segment(), 0L); }
    /// Sets `shaderBFloat16Type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBFloat16Type(MemorySegment segment, long index, int value) { VH_shaderBFloat16Type.set(segment, 0L, index, value); }
    /// Sets `shaderBFloat16Type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16Type(int value) { shaderBFloat16Type(this.segment(), 0L, value); return this; }

    /// {@return `shaderBFloat16DotProduct` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBFloat16DotProduct(MemorySegment segment, long index) { return (int) VH_shaderBFloat16DotProduct.get(segment, 0L, index); }
    /// {@return `shaderBFloat16DotProduct`}
    public int shaderBFloat16DotProduct() { return shaderBFloat16DotProduct(this.segment(), 0L); }
    /// Sets `shaderBFloat16DotProduct` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBFloat16DotProduct(MemorySegment segment, long index, int value) { VH_shaderBFloat16DotProduct.set(segment, 0L, index, value); }
    /// Sets `shaderBFloat16DotProduct` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProduct(int value) { shaderBFloat16DotProduct(this.segment(), 0L, value); return this; }

    /// {@return `shaderBFloat16CooperativeMatrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderBFloat16CooperativeMatrix(MemorySegment segment, long index) { return (int) VH_shaderBFloat16CooperativeMatrix.get(segment, 0L, index); }
    /// {@return `shaderBFloat16CooperativeMatrix`}
    public int shaderBFloat16CooperativeMatrix() { return shaderBFloat16CooperativeMatrix(this.segment(), 0L); }
    /// Sets `shaderBFloat16CooperativeMatrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderBFloat16CooperativeMatrix(MemorySegment segment, long index, int value) { VH_shaderBFloat16CooperativeMatrix.set(segment, 0L, index, value); }
    /// Sets `shaderBFloat16CooperativeMatrix` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrix(int value) { shaderBFloat16CooperativeMatrix(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderBfloat16FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderBfloat16FeaturesKHR`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderBfloat16FeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderBfloat16FeaturesKHR`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderBfloat16FeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderBfloat16FeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderBFloat16Type` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBFloat16TypeAt(long index) { return shaderBFloat16Type(this.segment(), index); }
    /// Sets `shaderBFloat16Type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16TypeAt(long index, int value) { shaderBFloat16Type(this.segment(), index, value); return this; }

    /// {@return `shaderBFloat16DotProduct` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBFloat16DotProductAt(long index) { return shaderBFloat16DotProduct(this.segment(), index); }
    /// Sets `shaderBFloat16DotProduct` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProductAt(long index, int value) { shaderBFloat16DotProduct(this.segment(), index, value); return this; }

    /// {@return `shaderBFloat16CooperativeMatrix` at the given index}
    /// @param index the index of the struct buffer
    public int shaderBFloat16CooperativeMatrixAt(long index) { return shaderBFloat16CooperativeMatrix(this.segment(), index); }
    /// Sets `shaderBFloat16CooperativeMatrix` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrixAt(long index, int value) { shaderBFloat16CooperativeMatrix(this.segment(), index, value); return this; }

}
