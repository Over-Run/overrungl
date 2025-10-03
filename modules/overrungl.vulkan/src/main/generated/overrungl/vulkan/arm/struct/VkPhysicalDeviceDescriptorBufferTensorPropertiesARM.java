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

/// Represents `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDescriptorBufferTensorPropertiesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     size_t tensorCaptureReplayDescriptorDataSize;
///     size_t tensorViewCaptureReplayDescriptorDataSize;
///     size_t tensorDescriptorSize;
/// };
/// ```
public final class VkPhysicalDeviceDescriptorBufferTensorPropertiesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("tensorCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("tensorViewCaptureReplayDescriptorDataSize"),
        CanonicalTypes.SIZE_T.withName("tensorDescriptorSize")
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
    /// The byte offset of `tensorCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_tensorCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
    /// The memory layout of `tensorCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_tensorCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `tensorCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tensorCaptureReplayDescriptorDataSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorCaptureReplayDescriptorDataSize")));
    /// The byte offset of `tensorViewCaptureReplayDescriptorDataSize`.
    public static final long OFFSET_tensorViewCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
    /// The memory layout of `tensorViewCaptureReplayDescriptorDataSize`.
    public static final MemoryLayout LAYOUT_tensorViewCaptureReplayDescriptorDataSize = LAYOUT.select(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize"));
    /// The [VarHandle] of `tensorViewCaptureReplayDescriptorDataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tensorViewCaptureReplayDescriptorDataSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorViewCaptureReplayDescriptorDataSize")));
    /// The byte offset of `tensorDescriptorSize`.
    public static final long OFFSET_tensorDescriptorSize = LAYOUT.byteOffset(PathElement.groupElement("tensorDescriptorSize"));
    /// The memory layout of `tensorDescriptorSize`.
    public static final MemoryLayout LAYOUT_tensorDescriptorSize = LAYOUT.select(PathElement.groupElement("tensorDescriptorSize"));
    /// The [VarHandle] of `tensorDescriptorSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_tensorDescriptorSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorDescriptorSize")));

    /// Creates `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`
    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM copyFrom(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM reinterpret(long count) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tensorCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tensorCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_tensorCaptureReplayDescriptorDataSize.get().get(segment, 0L, index)); }
    /// {@return `tensorCaptureReplayDescriptorDataSize`}
    public long tensorCaptureReplayDescriptorDataSize() { return tensorCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `tensorCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_tensorCaptureReplayDescriptorDataSize.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `tensorCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSize(long value) { tensorCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `tensorViewCaptureReplayDescriptorDataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tensorViewCaptureReplayDescriptorDataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_tensorViewCaptureReplayDescriptorDataSize.get().get(segment, 0L, index)); }
    /// {@return `tensorViewCaptureReplayDescriptorDataSize`}
    public long tensorViewCaptureReplayDescriptorDataSize() { return tensorViewCaptureReplayDescriptorDataSize(this.segment(), 0L); }
    /// Sets `tensorViewCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorViewCaptureReplayDescriptorDataSize(MemorySegment segment, long index, long value) { VH_tensorViewCaptureReplayDescriptorDataSize.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `tensorViewCaptureReplayDescriptorDataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSize(long value) { tensorViewCaptureReplayDescriptorDataSize(this.segment(), 0L, value); return this; }

    /// {@return `tensorDescriptorSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tensorDescriptorSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_tensorDescriptorSize.get().get(segment, 0L, index)); }
    /// {@return `tensorDescriptorSize`}
    public long tensorDescriptorSize() { return tensorDescriptorSize(this.segment(), 0L); }
    /// Sets `tensorDescriptorSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorDescriptorSize(MemorySegment segment, long index, long value) { VH_tensorDescriptorSize.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `tensorDescriptorSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSize(long value) { tensorDescriptorSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM asSlice(long index) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceDescriptorBufferTensorPropertiesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM at(long index, Consumer<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tensorCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index of the struct buffer
    public long tensorCaptureReplayDescriptorDataSizeAt(long index) { return tensorCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// Sets `tensorCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSizeAt(long index, long value) { tensorCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

    /// {@return `tensorViewCaptureReplayDescriptorDataSize` at the given index}
    /// @param index the index of the struct buffer
    public long tensorViewCaptureReplayDescriptorDataSizeAt(long index) { return tensorViewCaptureReplayDescriptorDataSize(this.segment(), index); }
    /// Sets `tensorViewCaptureReplayDescriptorDataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSizeAt(long index, long value) { tensorViewCaptureReplayDescriptorDataSize(this.segment(), index, value); return this; }

    /// {@return `tensorDescriptorSize` at the given index}
    /// @param index the index of the struct buffer
    public long tensorDescriptorSizeAt(long index) { return tensorDescriptorSize(this.segment(), index); }
    /// Sets `tensorDescriptorSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSizeAt(long index, long value) { tensorDescriptorSize(this.segment(), index, value); return this; }

}
