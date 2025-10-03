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

/// Represents `VkExternalImageFormatPropertiesNV`.
/// ## Layout
/// ```
/// struct VkExternalImageFormatPropertiesNV {
///     (struct VkImageFormatProperties) VkImageFormatProperties imageFormatProperties;
///     ((uint32_t) VkFlags) VkExternalMemoryFeatureFlagsNV externalMemoryFeatures;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes;
///     ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes;
/// };
/// ```
public final class VkExternalImageFormatPropertiesNV extends GroupType {
    /// The struct layout of `VkExternalImageFormatPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkImageFormatProperties.LAYOUT.withName("imageFormatProperties"),
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    /// The byte offset of `imageFormatProperties`.
    public static final long OFFSET_imageFormatProperties = LAYOUT.byteOffset(PathElement.groupElement("imageFormatProperties"));
    /// The memory layout of `imageFormatProperties`.
    public static final MemoryLayout LAYOUT_imageFormatProperties = LAYOUT.select(PathElement.groupElement("imageFormatProperties"));
    /// The byte offset of `externalMemoryFeatures`.
    public static final long OFFSET_externalMemoryFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryFeatures"));
    /// The memory layout of `externalMemoryFeatures`.
    public static final MemoryLayout LAYOUT_externalMemoryFeatures = LAYOUT.select(PathElement.groupElement("externalMemoryFeatures"));
    /// The [VarHandle] of `externalMemoryFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_externalMemoryFeatures = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryFeatures")));
    /// The byte offset of `exportFromImportedHandleTypes`.
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The memory layout of `exportFromImportedHandleTypes`.
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    /// The [VarHandle] of `exportFromImportedHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_exportFromImportedHandleTypes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes")));
    /// The byte offset of `compatibleHandleTypes`.
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    /// The memory layout of `compatibleHandleTypes`.
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    /// The [VarHandle] of `compatibleHandleTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_compatibleHandleTypes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes")));

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkExternalImageFormatPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkExternalImageFormatPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalImageFormatPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalImageFormatPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkExternalImageFormatPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalImageFormatPropertiesNV`
    public static VkExternalImageFormatPropertiesNV alloc(SegmentAllocator allocator) { return new VkExternalImageFormatPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkExternalImageFormatPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalImageFormatPropertiesNV`
    public static VkExternalImageFormatPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkExternalImageFormatPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkExternalImageFormatPropertiesNV copyFrom(VkExternalImageFormatPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkExternalImageFormatPropertiesNV reinterpret(long count) { return new VkExternalImageFormatPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `imageFormatProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageFormatProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageFormatProperties, index), LAYOUT_imageFormatProperties); }
    /// {@return `imageFormatProperties`}
    public MemorySegment imageFormatProperties() { return imageFormatProperties(this.segment(), 0L); }
    /// Sets `imageFormatProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageFormatProperties(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageFormatProperties, index), LAYOUT_imageFormatProperties.byteSize()); }
    /// Sets `imageFormatProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV imageFormatProperties(MemorySegment value) { imageFormatProperties(this.segment(), 0L, value); return this; }
    /// Accepts `imageFormatProperties` with the given function.
    /// @param func the function
    /// @return `this`
    public VkExternalImageFormatPropertiesNV imageFormatProperties(Consumer<overrungl.vulkan.struct.VkImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkImageFormatProperties.of(imageFormatProperties())); return this; }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int externalMemoryFeatures(MemorySegment segment, long index) { return (int) VH_externalMemoryFeatures.get().get(segment, 0L, index); }
    /// {@return `externalMemoryFeatures`}
    public int externalMemoryFeatures() { return externalMemoryFeatures(this.segment(), 0L); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalMemoryFeatures(MemorySegment segment, long index, int value) { VH_externalMemoryFeatures.get().set(segment, 0L, index, value); }
    /// Sets `externalMemoryFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV externalMemoryFeatures(int value) { externalMemoryFeatures(this.segment(), 0L, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int exportFromImportedHandleTypes(MemorySegment segment, long index) { return (int) VH_exportFromImportedHandleTypes.get().get(segment, 0L, index); }
    /// {@return `exportFromImportedHandleTypes`}
    public int exportFromImportedHandleTypes() { return exportFromImportedHandleTypes(this.segment(), 0L); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void exportFromImportedHandleTypes(MemorySegment segment, long index, int value) { VH_exportFromImportedHandleTypes.get().set(segment, 0L, index, value); }
    /// Sets `exportFromImportedHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypes(int value) { exportFromImportedHandleTypes(this.segment(), 0L, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compatibleHandleTypes(MemorySegment segment, long index) { return (int) VH_compatibleHandleTypes.get().get(segment, 0L, index); }
    /// {@return `compatibleHandleTypes`}
    public int compatibleHandleTypes() { return compatibleHandleTypes(this.segment(), 0L); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compatibleHandleTypes(MemorySegment segment, long index, int value) { VH_compatibleHandleTypes.get().set(segment, 0L, index, value); }
    /// Sets `compatibleHandleTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV compatibleHandleTypes(int value) { compatibleHandleTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkExternalImageFormatPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalImageFormatPropertiesNV`
    public VkExternalImageFormatPropertiesNV asSlice(long index) { return new VkExternalImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkExternalImageFormatPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalImageFormatPropertiesNV`
    public VkExternalImageFormatPropertiesNV asSlice(long index, long count) { return new VkExternalImageFormatPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkExternalImageFormatPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkExternalImageFormatPropertiesNV at(long index, Consumer<VkExternalImageFormatPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `imageFormatProperties` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageFormatPropertiesAt(long index) { return imageFormatProperties(this.segment(), index); }
    /// Sets `imageFormatProperties` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV imageFormatPropertiesAt(long index, MemorySegment value) { imageFormatProperties(this.segment(), index, value); return this; }
    /// Accepts `imageFormatProperties` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkExternalImageFormatPropertiesNV imageFormatPropertiesAt(long index, Consumer<overrungl.vulkan.struct.VkImageFormatProperties> func) { func.accept(overrungl.vulkan.struct.VkImageFormatProperties.of(imageFormatPropertiesAt(index))); return this; }

    /// {@return `externalMemoryFeatures` at the given index}
    /// @param index the index of the struct buffer
    public int externalMemoryFeaturesAt(long index) { return externalMemoryFeatures(this.segment(), index); }
    /// Sets `externalMemoryFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV externalMemoryFeaturesAt(long index, int value) { externalMemoryFeatures(this.segment(), index, value); return this; }

    /// {@return `exportFromImportedHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int exportFromImportedHandleTypesAt(long index) { return exportFromImportedHandleTypes(this.segment(), index); }
    /// Sets `exportFromImportedHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV exportFromImportedHandleTypesAt(long index, int value) { exportFromImportedHandleTypes(this.segment(), index, value); return this; }

    /// {@return `compatibleHandleTypes` at the given index}
    /// @param index the index of the struct buffer
    public int compatibleHandleTypesAt(long index) { return compatibleHandleTypes(this.segment(), index); }
    /// Sets `compatibleHandleTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkExternalImageFormatPropertiesNV compatibleHandleTypesAt(long index, int value) { compatibleHandleTypes(this.segment(), index, value); return this; }

}
