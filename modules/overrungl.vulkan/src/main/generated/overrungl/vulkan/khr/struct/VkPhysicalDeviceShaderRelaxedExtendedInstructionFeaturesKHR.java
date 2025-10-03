// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderRelaxedExtendedInstruction;
/// };
/// ```
public final class VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderRelaxedExtendedInstruction")
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
    /// The byte offset of `shaderRelaxedExtendedInstruction`.
    public static final long OFFSET_shaderRelaxedExtendedInstruction = LAYOUT.byteOffset(PathElement.groupElement("shaderRelaxedExtendedInstruction"));
    /// The memory layout of `shaderRelaxedExtendedInstruction`.
    public static final MemoryLayout LAYOUT_shaderRelaxedExtendedInstruction = LAYOUT.select(PathElement.groupElement("shaderRelaxedExtendedInstruction"));
    /// The [VarHandle] of `shaderRelaxedExtendedInstruction` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderRelaxedExtendedInstruction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRelaxedExtendedInstruction"));

    /// Creates `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR copyFrom(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderRelaxedExtendedInstruction` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderRelaxedExtendedInstruction(MemorySegment segment, long index) { return (int) VH_shaderRelaxedExtendedInstruction.get(segment, 0L, index); }
    /// {@return `shaderRelaxedExtendedInstruction`}
    public int shaderRelaxedExtendedInstruction() { return shaderRelaxedExtendedInstruction(this.segment(), 0L); }
    /// Sets `shaderRelaxedExtendedInstruction` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderRelaxedExtendedInstruction(MemorySegment segment, long index, int value) { VH_shaderRelaxedExtendedInstruction.set(segment, 0L, index, value); }
    /// Sets `shaderRelaxedExtendedInstruction` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR shaderRelaxedExtendedInstruction(int value) { shaderRelaxedExtendedInstruction(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderRelaxedExtendedInstruction` at the given index}
    /// @param index the index of the struct buffer
    public int shaderRelaxedExtendedInstructionAt(long index) { return shaderRelaxedExtendedInstruction(this.segment(), index); }
    /// Sets `shaderRelaxedExtendedInstruction` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR shaderRelaxedExtendedInstructionAt(long index, int value) { shaderRelaxedExtendedInstruction(this.segment(), index, value); return this; }

}
