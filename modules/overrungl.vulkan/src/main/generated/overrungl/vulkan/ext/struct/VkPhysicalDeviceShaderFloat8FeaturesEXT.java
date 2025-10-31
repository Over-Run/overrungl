// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderFloat8FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderFloat8FeaturesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderFloat8;
///     (uint32_t) VkBool32 shaderFloat8CooperativeMatrix;
/// };
/// ```
public final class VkPhysicalDeviceShaderFloat8FeaturesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderFloat8FeaturesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat8"),
        ValueLayout.JAVA_INT.withName("shaderFloat8CooperativeMatrix")
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
    /// The byte offset of `shaderFloat8`.
    public static final long OFFSET_shaderFloat8 = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8"));
    /// The memory layout of `shaderFloat8`.
    public static final MemoryLayout LAYOUT_shaderFloat8 = LAYOUT.select(PathElement.groupElement("shaderFloat8"));
    /// The [VarHandle] of `shaderFloat8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderFloat8 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat8"));
    /// The byte offset of `shaderFloat8CooperativeMatrix`.
    public static final long OFFSET_shaderFloat8CooperativeMatrix = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat8CooperativeMatrix"));
    /// The memory layout of `shaderFloat8CooperativeMatrix`.
    public static final MemoryLayout LAYOUT_shaderFloat8CooperativeMatrix = LAYOUT.select(PathElement.groupElement("shaderFloat8CooperativeMatrix"));
    /// The [VarHandle] of `shaderFloat8CooperativeMatrix` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderFloat8CooperativeMatrix = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderFloat8CooperativeMatrix"));

    /// Creates `VkPhysicalDeviceShaderFloat8FeaturesEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderFloat8FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderFloat8FeaturesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderFloat8FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderFloat8FeaturesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderFloat8FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderFloat8FeaturesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderFloat8FeaturesEXT`
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderFloat8FeaturesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderFloat8FeaturesEXT`
    public static VkPhysicalDeviceShaderFloat8FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT copyFrom(VkPhysicalDeviceShaderFloat8FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderFloat8FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloat8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloat8(MemorySegment segment, long index) { return (int) VH_shaderFloat8.get(segment, 0L, index); }
    /// {@return `shaderFloat8`}
    public int shaderFloat8() { return shaderFloat8(this.segment(), 0L); }
    /// Sets `shaderFloat8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloat8(MemorySegment segment, long index, int value) { VH_shaderFloat8.set(segment, 0L, index, value); }
    /// Sets `shaderFloat8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8(int value) { shaderFloat8(this.segment(), 0L, value); return this; }

    /// {@return `shaderFloat8CooperativeMatrix` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderFloat8CooperativeMatrix(MemorySegment segment, long index) { return (int) VH_shaderFloat8CooperativeMatrix.get(segment, 0L, index); }
    /// {@return `shaderFloat8CooperativeMatrix`}
    public int shaderFloat8CooperativeMatrix() { return shaderFloat8CooperativeMatrix(this.segment(), 0L); }
    /// Sets `shaderFloat8CooperativeMatrix` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderFloat8CooperativeMatrix(MemorySegment segment, long index, int value) { VH_shaderFloat8CooperativeMatrix.set(segment, 0L, index, value); }
    /// Sets `shaderFloat8CooperativeMatrix` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrix(int value) { shaderFloat8CooperativeMatrix(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderFloat8FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderFloat8FeaturesEXT`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderFloat8FeaturesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderFloat8FeaturesEXT`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderFloat8FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderFloat8FeaturesEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT at(long index, Consumer<VkPhysicalDeviceShaderFloat8FeaturesEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderFloat8` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloat8At(long index) { return shaderFloat8(this.segment(), index); }
    /// Sets `shaderFloat8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8At(long index, int value) { shaderFloat8(this.segment(), index, value); return this; }

    /// {@return `shaderFloat8CooperativeMatrix` at the given index}
    /// @param index the index of the struct buffer
    public int shaderFloat8CooperativeMatrixAt(long index) { return shaderFloat8CooperativeMatrix(this.segment(), index); }
    /// Sets `shaderFloat8CooperativeMatrix` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderFloat8FeaturesEXT shaderFloat8CooperativeMatrixAt(long index, int value) { shaderFloat8CooperativeMatrix(this.segment(), index, value); return this; }

}
