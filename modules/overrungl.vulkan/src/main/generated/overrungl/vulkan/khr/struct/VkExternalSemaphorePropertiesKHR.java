// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalSemaphorePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkExternalSemaphorePropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
///     ((uint32_t) VkFlags) VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
///     ((uint32_t) VkFlags) VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
/// };
/// ```
public final class VkExternalSemaphorePropertiesKHR extends GroupType {
    /// The struct layout of `VkExternalSemaphorePropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures")
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
    /// The byte offset of `exportFromImportedHandleTypes`.
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The memory layout of `exportFromImportedHandleTypes`.
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The byte offset of `compatibleHandleTypes`.
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    /// The memory layout of `compatibleHandleTypes`.
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));
    /// The byte offset of `externalSemaphoreFeatures`.
    public static final long OFFSET_externalSemaphoreFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalSemaphoreFeatures"));
    /// The memory layout of `externalSemaphoreFeatures`.
    public static final MemoryLayout LAYOUT_externalSemaphoreFeatures = LAYOUT.select(PathElement.groupElement("externalSemaphoreFeatures"));
    /// The [VarHandle] of `externalSemaphoreFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalSemaphoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalSemaphoreFeatures"));

    /// Creates `VkExternalSemaphorePropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalSemaphorePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalSemaphorePropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphorePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphorePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalSemaphorePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphorePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphorePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalSemaphorePropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalSemaphorePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphorePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalSemaphorePropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalSemaphorePropertiesKHR`
    public static VkExternalSemaphorePropertiesKHR alloc(SegmentAllocator allocator) { return new VkExternalSemaphorePropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalSemaphorePropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalSemaphorePropertiesKHR`
    public static VkExternalSemaphorePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkExternalSemaphorePropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR copyFrom(VkExternalSemaphorePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalSemaphorePropertiesKHR reinterpret(long count) { return new VkExternalSemaphorePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkExternalSemaphorePropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkExternalSemaphorePropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    public int exportFromImportedHandleTypes() { return exportFromImportedHandleTypes(this.segment(), 0L); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void exportFromImportedHandleTypes(MemorySegment segment, long index, int value) { VH_exportFromImportedHandleTypes.set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR exportFromImportedHandleTypes(int value) { exportFromImportedHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    public int compatibleHandleTypes() { return compatibleHandleTypes(this.segment(), 0L); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compatibleHandleTypes(MemorySegment segment, long index, int value) { VH_compatibleHandleTypes.set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR compatibleHandleTypes(int value) { compatibleHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `externalSemaphoreFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalSemaphoreFeatures(MemorySegment segment, long index) { return (int) VH_externalSemaphoreFeatures.get(segment, 0L, index); }
    /// {@return `externalSemaphoreFeatures`}
    public int externalSemaphoreFeatures() { return externalSemaphoreFeatures(this.segment(), 0L); }
    /// Sets `externalSemaphoreFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalSemaphoreFeatures(MemorySegment segment, long index, int value) { VH_externalSemaphoreFeatures.set(segment, 0L, index, value); }
    /// Sets `externalSemaphoreFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR externalSemaphoreFeatures(int value) { externalSemaphoreFeatures(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalSemaphorePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalSemaphorePropertiesKHR`
    public VkExternalSemaphorePropertiesKHR asSlice(long index) { return new VkExternalSemaphorePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalSemaphorePropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalSemaphorePropertiesKHR`
    public VkExternalSemaphorePropertiesKHR asSlice(long index, long count) { return new VkExternalSemaphorePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalSemaphorePropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR at(long index, Consumer<VkExternalSemaphorePropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int exportFromImportedHandleTypesAt(long index) { return exportFromImportedHandleTypes(this.segment(), index); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR exportFromImportedHandleTypesAt(long index, int value) { exportFromImportedHandleTypes(this.segment(), index, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int compatibleHandleTypesAt(long index) { return compatibleHandleTypes(this.segment(), index); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR compatibleHandleTypesAt(long index, int value) { compatibleHandleTypes(this.segment(), index, value); return this; }

    /// {@return `externalSemaphoreFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int externalSemaphoreFeaturesAt(long index) { return externalSemaphoreFeatures(this.segment(), index); }
    /// Sets `externalSemaphoreFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalSemaphorePropertiesKHR externalSemaphoreFeaturesAt(long index, int value) { externalSemaphoreFeatures(this.segment(), index, value); return this; }

}
