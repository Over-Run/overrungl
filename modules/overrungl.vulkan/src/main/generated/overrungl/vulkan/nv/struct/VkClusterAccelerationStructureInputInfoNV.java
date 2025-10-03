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

/// Represents `VkClusterAccelerationStructureInputInfoNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureInputInfoNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t maxAccelerationStructureCount;
///     ((uint32_t) VkFlags) VkBuildAccelerationStructureFlagsKHR flags;
///     (int) VkClusterAccelerationStructureOpTypeNV opType;
///     (int) VkClusterAccelerationStructureOpModeNV opMode;
///     (union VkClusterAccelerationStructureOpInputNV) VkClusterAccelerationStructureOpInputNV opInput;
/// };
/// ```
public final class VkClusterAccelerationStructureInputInfoNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureInputInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxAccelerationStructureCount"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("opMode"),
        overrungl.vulkan.nv.union.VkClusterAccelerationStructureOpInputNV.LAYOUT.withName("opInput")
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
    /// The byte offset of `maxAccelerationStructureCount`.
    public static final long OFFSET_maxAccelerationStructureCount = LAYOUT.byteOffset(PathElement.groupElement("maxAccelerationStructureCount"));
    /// The memory layout of `maxAccelerationStructureCount`.
    public static final MemoryLayout LAYOUT_maxAccelerationStructureCount = LAYOUT.select(PathElement.groupElement("maxAccelerationStructureCount"));
    /// The [VarHandle] of `maxAccelerationStructureCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxAccelerationStructureCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxAccelerationStructureCount")));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `opType`.
    public static final long OFFSET_opType = LAYOUT.byteOffset(PathElement.groupElement("opType"));
    /// The memory layout of `opType`.
    public static final MemoryLayout LAYOUT_opType = LAYOUT.select(PathElement.groupElement("opType"));
    /// The [VarHandle] of `opType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_opType = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("opType")));
    /// The byte offset of `opMode`.
    public static final long OFFSET_opMode = LAYOUT.byteOffset(PathElement.groupElement("opMode"));
    /// The memory layout of `opMode`.
    public static final MemoryLayout LAYOUT_opMode = LAYOUT.select(PathElement.groupElement("opMode"));
    /// The [VarHandle] of `opMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_opMode = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("opMode")));
    /// The byte offset of `opInput`.
    public static final long OFFSET_opInput = LAYOUT.byteOffset(PathElement.groupElement("opInput"));
    /// The memory layout of `opInput`.
    public static final MemoryLayout LAYOUT_opInput = LAYOUT.select(PathElement.groupElement("opInput"));

    /// Creates `VkClusterAccelerationStructureInputInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureInputInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureInputInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureInputInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInputInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureInputInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureInputInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInputInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureInputInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureInputInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureInputInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureInputInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureInputInfoNV`
    public static VkClusterAccelerationStructureInputInfoNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureInputInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureInputInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureInputInfoNV`
    public static VkClusterAccelerationStructureInputInfoNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureInputInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV copyFrom(VkClusterAccelerationStructureInputInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureInputInfoNV reinterpret(long count) { return new VkClusterAccelerationStructureInputInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkClusterAccelerationStructureInputInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureInputInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxAccelerationStructureCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxAccelerationStructureCount(MemorySegment segment, long index) { return (int) VH_maxAccelerationStructureCount.get().get(segment, 0L, index); }
    /// {@return `maxAccelerationStructureCount`}
    public int maxAccelerationStructureCount() { return maxAccelerationStructureCount(this.segment(), 0L); }
    /// Sets `maxAccelerationStructureCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxAccelerationStructureCount(MemorySegment segment, long index, int value) { VH_maxAccelerationStructureCount.get().set(segment, 0L, index, value); }
    /// Sets `maxAccelerationStructureCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCount(int value) { maxAccelerationStructureCount(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get().get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.get().set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `opType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int opType(MemorySegment segment, long index) { return (int) VH_opType.get().get(segment, 0L, index); }
    /// {@return `opType`}
    public int opType() { return opType(this.segment(), 0L); }
    /// Sets `opType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opType(MemorySegment segment, long index, int value) { VH_opType.get().set(segment, 0L, index, value); }
    /// Sets `opType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opType(int value) { opType(this.segment(), 0L, value); return this; }

    /// {@return `opMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int opMode(MemorySegment segment, long index) { return (int) VH_opMode.get().get(segment, 0L, index); }
    /// {@return `opMode`}
    public int opMode() { return opMode(this.segment(), 0L); }
    /// Sets `opMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opMode(MemorySegment segment, long index, int value) { VH_opMode.get().set(segment, 0L, index, value); }
    /// Sets `opMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opMode(int value) { opMode(this.segment(), 0L, value); return this; }

    /// {@return `opInput` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment opInput(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_opInput, index), LAYOUT_opInput); }
    /// {@return `opInput`}
    public MemorySegment opInput() { return opInput(this.segment(), 0L); }
    /// Sets `opInput` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opInput(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_opInput, index), LAYOUT_opInput.byteSize()); }
    /// Sets `opInput` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opInput(MemorySegment value) { opInput(this.segment(), 0L, value); return this; }
    /// Accepts `opInput` with the given function.
    /// @param func the function
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opInput(Consumer<overrungl.vulkan.nv.union.VkClusterAccelerationStructureOpInputNV> func) { func.accept(overrungl.vulkan.nv.union.VkClusterAccelerationStructureOpInputNV.of(opInput())); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureInputInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureInputInfoNV`
    public VkClusterAccelerationStructureInputInfoNV asSlice(long index) { return new VkClusterAccelerationStructureInputInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureInputInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureInputInfoNV`
    public VkClusterAccelerationStructureInputInfoNV asSlice(long index, long count) { return new VkClusterAccelerationStructureInputInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureInputInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV at(long index, Consumer<VkClusterAccelerationStructureInputInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `maxAccelerationStructureCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxAccelerationStructureCountAt(long index) { return maxAccelerationStructureCount(this.segment(), index); }
    /// Sets `maxAccelerationStructureCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCountAt(long index, int value) { maxAccelerationStructureCount(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `opType` at the given index}
    /// @param index the index of the struct buffer
    public int opTypeAt(long index) { return opType(this.segment(), index); }
    /// Sets `opType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opTypeAt(long index, int value) { opType(this.segment(), index, value); return this; }

    /// {@return `opMode` at the given index}
    /// @param index the index of the struct buffer
    public int opModeAt(long index) { return opMode(this.segment(), index); }
    /// Sets `opMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opModeAt(long index, int value) { opMode(this.segment(), index, value); return this; }

    /// {@return `opInput` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment opInputAt(long index) { return opInput(this.segment(), index); }
    /// Sets `opInput` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opInputAt(long index, MemorySegment value) { opInput(this.segment(), index, value); return this; }
    /// Accepts `opInput` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkClusterAccelerationStructureInputInfoNV opInputAt(long index, Consumer<overrungl.vulkan.nv.union.VkClusterAccelerationStructureOpInputNV> func) { func.accept(overrungl.vulkan.nv.union.VkClusterAccelerationStructureOpInputNV.of(opInputAt(index))); return this; }

}
