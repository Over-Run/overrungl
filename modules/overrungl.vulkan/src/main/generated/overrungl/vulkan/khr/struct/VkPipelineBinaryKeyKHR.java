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

/// Represents `VkPipelineBinaryKeyKHR`.
/// ## Layout
/// ```
/// struct VkPipelineBinaryKeyKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t keySize;
///     uint8_t key[32];
/// };
/// ```
public final class VkPipelineBinaryKeyKHR extends GroupType {
    /// The struct layout of `VkPipelineBinaryKeyKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("keySize"),
        MemoryLayout.sequenceLayout(32, ValueLayout.JAVA_BYTE).withName("key")
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
    /// The byte offset of `keySize`.
    public static final long OFFSET_keySize = LAYOUT.byteOffset(PathElement.groupElement("keySize"));
    /// The memory layout of `keySize`.
    public static final MemoryLayout LAYOUT_keySize = LAYOUT.select(PathElement.groupElement("keySize"));
    /// The [VarHandle] of `keySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_keySize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("keySize")));
    /// The byte offset of `key`.
    public static final long OFFSET_key = LAYOUT.byteOffset(PathElement.groupElement("key"));
    /// The memory layout of `key`.
    public static final MemoryLayout LAYOUT_key = LAYOUT.select(PathElement.groupElement("key"));
    /// The [VarHandle] of `key` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_key = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("key"), PathElement.sequenceElement()));

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPipelineBinaryKeyKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeyKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeyKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPipelineBinaryKeyKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineBinaryKeyKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineBinaryKeyKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineBinaryKeyKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineBinaryKeyKHR`
    public static VkPipelineBinaryKeyKHR alloc(SegmentAllocator allocator) { return new VkPipelineBinaryKeyKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPipelineBinaryKeyKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineBinaryKeyKHR`
    public static VkPipelineBinaryKeyKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineBinaryKeyKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineBinaryKeyKHR copyFrom(VkPipelineBinaryKeyKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPipelineBinaryKeyKHR reinterpret(long count) { return new VkPipelineBinaryKeyKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPipelineBinaryKeyKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPipelineBinaryKeyKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `keySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int keySize(MemorySegment segment, long index) { return (int) VH_keySize.get().get(segment, 0L, index); }
    /// {@return `keySize`}
    public int keySize() { return keySize(this.segment(), 0L); }
    /// Sets `keySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void keySize(MemorySegment segment, long index, int value) { VH_keySize.get().set(segment, 0L, index, value); }
    /// Sets `keySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR keySize(int value) { keySize(this.segment(), 0L, value); return this; }

    /// {@return `key` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment key(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_key, index), LAYOUT_key); }
    /// {@return `key` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte key(MemorySegment segment, long index, long index0) { return (byte) VH_key.get().get(segment, 0L, index, index0); }
    /// {@return `key`}
    public MemorySegment key() { return key(this.segment(), 0L); }
    /// {@return `key`}
    /// @param index0 the Index 0 of the array
    public byte key(long index0) { return key(this.segment(), 0L, index0); }
    /// Sets `key` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void key(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_key, index), LAYOUT_key.byteSize()); }
    /// Sets `key` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void key(MemorySegment segment, long index, long index0, byte value) { VH_key.get().set(segment, 0L, index, index0, value); }
    /// Sets `key` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR key(MemorySegment value) { key(this.segment(), 0L, value); return this; }
    /// Sets `key` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR key(long index0, byte value) { key(this.segment(), 0L, index0, value); return this; }

    /// Creates a slice of `VkPipelineBinaryKeyKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineBinaryKeyKHR`
    public VkPipelineBinaryKeyKHR asSlice(long index) { return new VkPipelineBinaryKeyKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPipelineBinaryKeyKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineBinaryKeyKHR`
    public VkPipelineBinaryKeyKHR asSlice(long index, long count) { return new VkPipelineBinaryKeyKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPipelineBinaryKeyKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPipelineBinaryKeyKHR at(long index, Consumer<VkPipelineBinaryKeyKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `keySize` at the given index}
    /// @param index the index of the struct buffer
    public int keySizeAt(long index) { return keySize(this.segment(), index); }
    /// Sets `keySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR keySizeAt(long index, int value) { keySize(this.segment(), index, value); return this; }

    /// {@return `key` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment keyAt(long index) { return key(this.segment(), index); }
    /// {@return `key` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public byte keyAt(long index, long index0) { return key(this.segment(), index, index0); }
    /// Sets `key` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR keyAt(long index, MemorySegment value) { key(this.segment(), index, value); return this; }
    /// Sets `key` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPipelineBinaryKeyKHR keyAt(long index, long index0, byte value) { key(this.segment(), index, index0, value); return this; }

}
