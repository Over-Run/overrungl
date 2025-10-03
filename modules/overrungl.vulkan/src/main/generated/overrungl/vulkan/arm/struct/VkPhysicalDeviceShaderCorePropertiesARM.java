// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCorePropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCorePropertiesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t pixelRate;
///     uint32_t texelRate;
///     uint32_t fmaRate;
/// };
/// ```
public final class VkPhysicalDeviceShaderCorePropertiesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderCorePropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pixelRate"),
        ValueLayout.JAVA_INT.withName("texelRate"),
        ValueLayout.JAVA_INT.withName("fmaRate")
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
    /// The byte offset of `pixelRate`.
    public static final long OFFSET_pixelRate = LAYOUT.byteOffset(PathElement.groupElement("pixelRate"));
    /// The memory layout of `pixelRate`.
    public static final MemoryLayout LAYOUT_pixelRate = LAYOUT.select(PathElement.groupElement("pixelRate"));
    /// The [VarHandle] of `pixelRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pixelRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pixelRate"));
    /// The byte offset of `texelRate`.
    public static final long OFFSET_texelRate = LAYOUT.byteOffset(PathElement.groupElement("texelRate"));
    /// The memory layout of `texelRate`.
    public static final MemoryLayout LAYOUT_texelRate = LAYOUT.select(PathElement.groupElement("texelRate"));
    /// The [VarHandle] of `texelRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_texelRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("texelRate"));
    /// The byte offset of `fmaRate`.
    public static final long OFFSET_fmaRate = LAYOUT.byteOffset(PathElement.groupElement("fmaRate"));
    /// The memory layout of `fmaRate`.
    public static final MemoryLayout LAYOUT_fmaRate = LAYOUT.select(PathElement.groupElement("fmaRate"));
    /// The [VarHandle] of `fmaRate` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fmaRate = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fmaRate"));

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderCorePropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCorePropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCorePropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesARM`
    public static VkPhysicalDeviceShaderCorePropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCorePropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderCorePropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCorePropertiesARM`
    public static VkPhysicalDeviceShaderCorePropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCorePropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM copyFrom(VkPhysicalDeviceShaderCorePropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderCorePropertiesARM reinterpret(long count) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderCorePropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderCorePropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pixelRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pixelRate(MemorySegment segment, long index) { return (int) VH_pixelRate.get(segment, 0L, index); }
    /// {@return `pixelRate`}
    public int pixelRate() { return pixelRate(this.segment(), 0L); }
    /// Sets `pixelRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pixelRate(MemorySegment segment, long index, int value) { VH_pixelRate.set(segment, 0L, index, value); }
    /// Sets `pixelRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM pixelRate(int value) { pixelRate(this.segment(), 0L, value); return this; }

    /// {@return `texelRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int texelRate(MemorySegment segment, long index) { return (int) VH_texelRate.get(segment, 0L, index); }
    /// {@return `texelRate`}
    public int texelRate() { return texelRate(this.segment(), 0L); }
    /// Sets `texelRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void texelRate(MemorySegment segment, long index, int value) { VH_texelRate.set(segment, 0L, index, value); }
    /// Sets `texelRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM texelRate(int value) { texelRate(this.segment(), 0L, value); return this; }

    /// {@return `fmaRate` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fmaRate(MemorySegment segment, long index) { return (int) VH_fmaRate.get(segment, 0L, index); }
    /// {@return `fmaRate`}
    public int fmaRate() { return fmaRate(this.segment(), 0L); }
    /// Sets `fmaRate` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fmaRate(MemorySegment segment, long index, int value) { VH_fmaRate.set(segment, 0L, index, value); }
    /// Sets `fmaRate` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM fmaRate(int value) { fmaRate(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderCorePropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderCorePropertiesARM`
    public VkPhysicalDeviceShaderCorePropertiesARM asSlice(long index) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderCorePropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderCorePropertiesARM`
    public VkPhysicalDeviceShaderCorePropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceShaderCorePropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderCorePropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM at(long index, Consumer<VkPhysicalDeviceShaderCorePropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pixelRate` at the given index}
    /// @param index the index of the struct buffer
    public int pixelRateAt(long index) { return pixelRate(this.segment(), index); }
    /// Sets `pixelRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM pixelRateAt(long index, int value) { pixelRate(this.segment(), index, value); return this; }

    /// {@return `texelRate` at the given index}
    /// @param index the index of the struct buffer
    public int texelRateAt(long index) { return texelRate(this.segment(), index); }
    /// Sets `texelRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM texelRateAt(long index, int value) { texelRate(this.segment(), index, value); return this; }

    /// {@return `fmaRate` at the given index}
    /// @param index the index of the struct buffer
    public int fmaRateAt(long index) { return fmaRate(this.segment(), index); }
    /// Sets `fmaRate` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCorePropertiesARM fmaRateAt(long index, int value) { fmaRate(this.segment(), index, value); return this; }

}
