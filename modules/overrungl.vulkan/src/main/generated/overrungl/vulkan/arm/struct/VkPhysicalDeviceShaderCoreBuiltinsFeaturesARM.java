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

/// Represents `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 shaderCoreBuiltins;
/// };
/// ```
public final class VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreBuiltins")
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
    /// The byte offset of `shaderCoreBuiltins`.
    public static final long OFFSET_shaderCoreBuiltins = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreBuiltins"));
    /// The memory layout of `shaderCoreBuiltins`.
    public static final MemoryLayout LAYOUT_shaderCoreBuiltins = LAYOUT.select(PathElement.groupElement("shaderCoreBuiltins"));
    /// The [VarHandle] of `shaderCoreBuiltins` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_shaderCoreBuiltins = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreBuiltins")));

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM copyFrom(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `shaderCoreBuiltins` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int shaderCoreBuiltins(MemorySegment segment, long index) { return (int) VH_shaderCoreBuiltins.get().get(segment, 0L, index); }
    /// {@return `shaderCoreBuiltins`}
    public int shaderCoreBuiltins() { return shaderCoreBuiltins(this.segment(), 0L); }
    /// Sets `shaderCoreBuiltins` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void shaderCoreBuiltins(MemorySegment segment, long index, int value) { VH_shaderCoreBuiltins.get().set(segment, 0L, index, value); }
    /// Sets `shaderCoreBuiltins` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM shaderCoreBuiltins(int value) { shaderCoreBuiltins(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM asSlice(long index) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM at(long index, Consumer<VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `shaderCoreBuiltins` at the given index}
    /// @param index the index of the struct buffer
    public int shaderCoreBuiltinsAt(long index) { return shaderCoreBuiltins(this.segment(), index); }
    /// Sets `shaderCoreBuiltins` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM shaderCoreBuiltinsAt(long index, int value) { shaderCoreBuiltins(this.segment(), index, value); return this; }

}
