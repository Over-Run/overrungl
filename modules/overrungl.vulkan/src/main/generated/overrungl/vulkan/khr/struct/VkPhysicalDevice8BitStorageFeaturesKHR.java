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

/// Represents `VkPhysicalDevice8BitStorageFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDevice8BitStorageFeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 storageBuffer8BitAccess;
///     (uint32_t) VkBool32 uniformAndStorageBuffer8BitAccess;
///     (uint32_t) VkBool32 storagePushConstant8;
/// };
/// ```
public final class VkPhysicalDevice8BitStorageFeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDevice8BitStorageFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8")
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
    /// The byte offset of `storageBuffer8BitAccess`.
    public static final long OFFSET_storageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The memory layout of `storageBuffer8BitAccess`.
    public static final MemoryLayout LAYOUT_storageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("storageBuffer8BitAccess"));
    /// The [VarHandle] of `storageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storageBuffer8BitAccess = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageBuffer8BitAccess")));
    /// The byte offset of `uniformAndStorageBuffer8BitAccess`.
    public static final long OFFSET_uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The memory layout of `uniformAndStorageBuffer8BitAccess`.
    public static final MemoryLayout LAYOUT_uniformAndStorageBuffer8BitAccess = LAYOUT.select(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
    /// The [VarHandle] of `uniformAndStorageBuffer8BitAccess` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_uniformAndStorageBuffer8BitAccess = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess")));
    /// The byte offset of `storagePushConstant8`.
    public static final long OFFSET_storagePushConstant8 = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
    /// The memory layout of `storagePushConstant8`.
    public static final MemoryLayout LAYOUT_storagePushConstant8 = LAYOUT.select(PathElement.groupElement("storagePushConstant8"));
    /// The [VarHandle] of `storagePushConstant8` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storagePushConstant8 = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storagePushConstant8")));

    /// Creates `VkPhysicalDevice8BitStorageFeaturesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDevice8BitStorageFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDevice8BitStorageFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice8BitStorageFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDevice8BitStorageFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice8BitStorageFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDevice8BitStorageFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDevice8BitStorageFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevice8BitStorageFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDevice8BitStorageFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDevice8BitStorageFeaturesKHR`
    public static VkPhysicalDevice8BitStorageFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDevice8BitStorageFeaturesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDevice8BitStorageFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDevice8BitStorageFeaturesKHR`
    public static VkPhysicalDevice8BitStorageFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevice8BitStorageFeaturesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR copyFrom(VkPhysicalDevice8BitStorageFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDevice8BitStorageFeaturesKHR reinterpret(long count) { return new VkPhysicalDevice8BitStorageFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDevice8BitStorageFeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDevice8BitStorageFeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `storageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_storageBuffer8BitAccess.get().get(segment, 0L, index); }
    /// {@return `storageBuffer8BitAccess`}
    public int storageBuffer8BitAccess() { return storageBuffer8BitAccess(this.segment(), 0L); }
    /// Sets `storageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageBuffer8BitAccess(MemorySegment segment, long index, int value) { VH_storageBuffer8BitAccess.get().set(segment, 0L, index, value); }
    /// Sets `storageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR storageBuffer8BitAccess(int value) { storageBuffer8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index) { return (int) VH_uniformAndStorageBuffer8BitAccess.get().get(segment, 0L, index); }
    /// {@return `uniformAndStorageBuffer8BitAccess`}
    public int uniformAndStorageBuffer8BitAccess() { return uniformAndStorageBuffer8BitAccess(this.segment(), 0L); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uniformAndStorageBuffer8BitAccess(MemorySegment segment, long index, int value) { VH_uniformAndStorageBuffer8BitAccess.get().set(segment, 0L, index, value); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR uniformAndStorageBuffer8BitAccess(int value) { uniformAndStorageBuffer8BitAccess(this.segment(), 0L, value); return this; }

    /// {@return `storagePushConstant8` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storagePushConstant8(MemorySegment segment, long index) { return (int) VH_storagePushConstant8.get().get(segment, 0L, index); }
    /// {@return `storagePushConstant8`}
    public int storagePushConstant8() { return storagePushConstant8(this.segment(), 0L); }
    /// Sets `storagePushConstant8` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storagePushConstant8(MemorySegment segment, long index, int value) { VH_storagePushConstant8.get().set(segment, 0L, index, value); }
    /// Sets `storagePushConstant8` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR storagePushConstant8(int value) { storagePushConstant8(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDevice8BitStorageFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDevice8BitStorageFeaturesKHR`
    public VkPhysicalDevice8BitStorageFeaturesKHR asSlice(long index) { return new VkPhysicalDevice8BitStorageFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDevice8BitStorageFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDevice8BitStorageFeaturesKHR`
    public VkPhysicalDevice8BitStorageFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDevice8BitStorageFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDevice8BitStorageFeaturesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR at(long index, Consumer<VkPhysicalDevice8BitStorageFeaturesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `storageBuffer8BitAccess` at the given index}
    /// @param index the index of the struct buffer
    public int storageBuffer8BitAccessAt(long index) { return storageBuffer8BitAccess(this.segment(), index); }
    /// Sets `storageBuffer8BitAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR storageBuffer8BitAccessAt(long index, int value) { storageBuffer8BitAccess(this.segment(), index, value); return this; }

    /// {@return `uniformAndStorageBuffer8BitAccess` at the given index}
    /// @param index the index of the struct buffer
    public int uniformAndStorageBuffer8BitAccessAt(long index) { return uniformAndStorageBuffer8BitAccess(this.segment(), index); }
    /// Sets `uniformAndStorageBuffer8BitAccess` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR uniformAndStorageBuffer8BitAccessAt(long index, int value) { uniformAndStorageBuffer8BitAccess(this.segment(), index, value); return this; }

    /// {@return `storagePushConstant8` at the given index}
    /// @param index the index of the struct buffer
    public int storagePushConstant8At(long index) { return storagePushConstant8(this.segment(), index); }
    /// Sets `storagePushConstant8` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDevice8BitStorageFeaturesKHR storagePushConstant8At(long index, int value) { storagePushConstant8(this.segment(), index, value); return this; }

}
