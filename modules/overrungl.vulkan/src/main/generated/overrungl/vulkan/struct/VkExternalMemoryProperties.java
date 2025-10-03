// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalMemoryProperties`.
/// ## Layout
/// ```
/// struct VkExternalMemoryProperties {
///     ((uint32_t) VkFlags) VkExternalMemoryFeatureFlags externalMemoryFeatures;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlags exportFromImportedHandleTypes;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlags compatibleHandleTypes;
/// };
/// ```
public final class VkExternalMemoryProperties extends GroupType {
    /// The struct layout of `VkExternalMemoryProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    /// The byte offset of `externalMemoryFeatures`.
    public static final long OFFSET_externalMemoryFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
    /// The memory layout of `externalMemoryFeatures`.
    public static final MemoryLayout LAYOUT_externalMemoryFeatures = LAYOUT.select(PathElement.groupElement("externalMemoryFeatures"));
    /// The [VarHandle] of `externalMemoryFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures"));
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

    /// Creates `VkExternalMemoryProperties` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalMemoryProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalMemoryProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalMemoryProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalMemoryProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalMemoryProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalMemoryProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalMemoryProperties`
    public static VkExternalMemoryProperties alloc(SegmentAllocator allocator) { return new VkExternalMemoryProperties(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalMemoryProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalMemoryProperties`
    public static VkExternalMemoryProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalMemoryProperties(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalMemoryProperties copyFrom(VkExternalMemoryProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalMemoryProperties reinterpret(long count) { return new VkExternalMemoryProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalMemoryFeatures(MemorySegment segment, long index) { return (int) VH_externalMemoryFeatures.get(segment, 0L, index); }
    /// {@return `externalMemoryFeatures`}
    public int externalMemoryFeatures() { return externalMemoryFeatures(this.segment(), 0L); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalMemoryFeatures(MemorySegment segment, long index, int value) { VH_externalMemoryFeatures.set(segment, 0L, index, value); }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties externalMemoryFeatures(int value) { externalMemoryFeatures(this.segment(), 0L, value); return this; }

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
    public VkExternalMemoryProperties exportFromImportedHandleTypes(int value) { exportFromImportedHandleTypes(this.segment(), 0L, value); return this; }

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
    public VkExternalMemoryProperties compatibleHandleTypes(int value) { compatibleHandleTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalMemoryProperties`
    public VkExternalMemoryProperties asSlice(long index) { return new VkExternalMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalMemoryProperties`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalMemoryProperties`
    public VkExternalMemoryProperties asSlice(long index, long count) { return new VkExternalMemoryProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalMemoryProperties` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalMemoryProperties at(long index, Consumer<VkExternalMemoryProperties> func) { func.accept(asSlice(index)); return this; }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int externalMemoryFeaturesAt(long index) { return externalMemoryFeatures(this.segment(), index); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties externalMemoryFeaturesAt(long index, int value) { externalMemoryFeatures(this.segment(), index, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int exportFromImportedHandleTypesAt(long index) { return exportFromImportedHandleTypes(this.segment(), index); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties exportFromImportedHandleTypesAt(long index, int value) { exportFromImportedHandleTypes(this.segment(), index, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int compatibleHandleTypesAt(long index) { return compatibleHandleTypes(this.segment(), index); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalMemoryProperties compatibleHandleTypesAt(long index, int value) { compatibleHandleTypes(this.segment(), index, value); return this; }

}
