// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderEarlyAndLateFragmentTests;
/// };
/// ```
public final class VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEarlyAndLateFragmentTests")
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
    /// The byte offset of `shaderEarlyAndLateFragmentTests`.
    public static final long OFFSET_shaderEarlyAndLateFragmentTests = LAYOUT.byteOffset(PathElement.groupElement("shaderEarlyAndLateFragmentTests"));
    /// The memory layout of `shaderEarlyAndLateFragmentTests`.
    public static final MemoryLayout LAYOUT_shaderEarlyAndLateFragmentTests = LAYOUT.select(PathElement.groupElement("shaderEarlyAndLateFragmentTests"));
    /// The [VarHandle] of `shaderEarlyAndLateFragmentTests` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_shaderEarlyAndLateFragmentTests = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderEarlyAndLateFragmentTests"));

    /// Creates `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`
    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD copyFrom(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD reinterpret(long count) { return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderEarlyAndLateFragmentTests` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderEarlyAndLateFragmentTests(MemorySegment segment, long index) { return (int) VH_shaderEarlyAndLateFragmentTests.get(segment, 0L, index); }
    /// {@return `shaderEarlyAndLateFragmentTests`}
    public int shaderEarlyAndLateFragmentTests() { return shaderEarlyAndLateFragmentTests(this.segment(), 0L); }
    /// Sets `shaderEarlyAndLateFragmentTests` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderEarlyAndLateFragmentTests(MemorySegment segment, long index, int value) { VH_shaderEarlyAndLateFragmentTests.set(segment, 0L, index, value); }
    /// Sets `shaderEarlyAndLateFragmentTests` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD shaderEarlyAndLateFragmentTests(int value) { shaderEarlyAndLateFragmentTests(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD asSlice(long index) { return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD asSlice(long index, long count) { return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD at(long index, Consumer<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderEarlyAndLateFragmentTests` at the given index}
    /// @param index the index of the struct buffer
    public int shaderEarlyAndLateFragmentTestsAt(long index) { return shaderEarlyAndLateFragmentTests(this.segment(), index); }
    /// Sets `shaderEarlyAndLateFragmentTests` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD shaderEarlyAndLateFragmentTestsAt(long index, int value) { shaderEarlyAndLateFragmentTests(this.segment(), index, value); return this; }

}
