// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAndroidHardwareBufferFormatProperties2ANDROID`.
/// ## Layout
/// ```
/// struct VkAndroidHardwareBufferFormatProperties2ANDROID {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkFormat format;
///     uint64_t externalFormat;
///     ((uint64_t) VkFlags64) VkFormatFeatureFlags2 formatFeatures;
///     (struct VkComponentMapping) VkComponentMapping samplerYcbcrConversionComponents;
///     (int) VkSamplerYcbcrModelConversion suggestedYcbcrModel;
///     (int) VkSamplerYcbcrRange suggestedYcbcrRange;
///     (int) VkChromaLocation suggestedXChromaOffset;
///     (int) VkChromaLocation suggestedYChromaOffset;
/// };
/// ```
public final class VkAndroidHardwareBufferFormatProperties2ANDROID extends GroupType {
    /// The struct layout of `VkAndroidHardwareBufferFormatProperties2ANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_LONG.withName("formatFeatures"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
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
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_format = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("format")));
    /// The byte offset of `externalFormat`.
    public static final long OFFSET_externalFormat = LAYOUT.byteOffset(PathElement.groupElement("externalFormat"));
    /// The memory layout of `externalFormat`.
    public static final MemoryLayout LAYOUT_externalFormat = LAYOUT.select(PathElement.groupElement("externalFormat"));
    /// The [VarHandle] of `externalFormat` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_externalFormat = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat")));
    /// The byte offset of `formatFeatures`.
    public static final long OFFSET_formatFeatures = LAYOUT.byteOffset(PathElement.groupElement("formatFeatures"));
    /// The memory layout of `formatFeatures`.
    public static final MemoryLayout LAYOUT_formatFeatures = LAYOUT.select(PathElement.groupElement("formatFeatures"));
    /// The [VarHandle] of `formatFeatures` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_formatFeatures = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("formatFeatures")));
    /// The byte offset of `samplerYcbcrConversionComponents`.
    public static final long OFFSET_samplerYcbcrConversionComponents = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionComponents"));
    /// The memory layout of `samplerYcbcrConversionComponents`.
    public static final MemoryLayout LAYOUT_samplerYcbcrConversionComponents = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversionComponents"));
    /// The byte offset of `suggestedYcbcrModel`.
    public static final long OFFSET_suggestedYcbcrModel = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrModel"));
    /// The memory layout of `suggestedYcbcrModel`.
    public static final MemoryLayout LAYOUT_suggestedYcbcrModel = LAYOUT.select(PathElement.groupElement("suggestedYcbcrModel"));
    /// The [VarHandle] of `suggestedYcbcrModel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_suggestedYcbcrModel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrModel")));
    /// The byte offset of `suggestedYcbcrRange`.
    public static final long OFFSET_suggestedYcbcrRange = LAYOUT.byteOffset(PathElement.groupElement("suggestedYcbcrRange"));
    /// The memory layout of `suggestedYcbcrRange`.
    public static final MemoryLayout LAYOUT_suggestedYcbcrRange = LAYOUT.select(PathElement.groupElement("suggestedYcbcrRange"));
    /// The [VarHandle] of `suggestedYcbcrRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_suggestedYcbcrRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYcbcrRange")));
    /// The byte offset of `suggestedXChromaOffset`.
    public static final long OFFSET_suggestedXChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedXChromaOffset"));
    /// The memory layout of `suggestedXChromaOffset`.
    public static final MemoryLayout LAYOUT_suggestedXChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedXChromaOffset"));
    /// The [VarHandle] of `suggestedXChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_suggestedXChromaOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedXChromaOffset")));
    /// The byte offset of `suggestedYChromaOffset`.
    public static final long OFFSET_suggestedYChromaOffset = LAYOUT.byteOffset(PathElement.groupElement("suggestedYChromaOffset"));
    /// The memory layout of `suggestedYChromaOffset`.
    public static final MemoryLayout LAYOUT_suggestedYChromaOffset = LAYOUT.select(PathElement.groupElement("suggestedYChromaOffset"));
    /// The [VarHandle] of `suggestedYChromaOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_suggestedYChromaOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("suggestedYChromaOffset")));

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAndroidHardwareBufferFormatProperties2ANDROID(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAndroidHardwareBufferFormatProperties2ANDROID(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID alloc(SegmentAllocator allocator) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAndroidHardwareBufferFormatProperties2ANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public static VkAndroidHardwareBufferFormatProperties2ANDROID alloc(SegmentAllocator allocator, long count) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID copyFrom(VkAndroidHardwareBufferFormatProperties2ANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAndroidHardwareBufferFormatProperties2ANDROID reinterpret(long count) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAndroidHardwareBufferFormatProperties2ANDROID sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAndroidHardwareBufferFormatProperties2ANDROID pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get().get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.get().set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get().get(segment, 0L, index); }
    /// {@return `externalFormat`}
    public long externalFormat() { return externalFormat(this.segment(), 0L); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void externalFormat(MemorySegment segment, long index, long value) { VH_externalFormat.get().set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID externalFormat(long value) { externalFormat(this.segment(), 0L, value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long formatFeatures(MemorySegment segment, long index) { return (long) VH_formatFeatures.get().get(segment, 0L, index); }
    /// {@return `formatFeatures`}
    public long formatFeatures() { return formatFeatures(this.segment(), 0L); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void formatFeatures(MemorySegment segment, long index, long value) { VH_formatFeatures.get().set(segment, 0L, index, value); }
    /// Sets `formatFeatures` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID formatFeatures(long value) { formatFeatures(this.segment(), 0L, value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment samplerYcbcrConversionComponents(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents); }
    /// {@return `samplerYcbcrConversionComponents`}
    public MemorySegment samplerYcbcrConversionComponents() { return samplerYcbcrConversionComponents(this.segment(), 0L); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerYcbcrConversionComponents(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_samplerYcbcrConversionComponents, index), LAYOUT_samplerYcbcrConversionComponents.byteSize()); }
    /// Sets `samplerYcbcrConversionComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID samplerYcbcrConversionComponents(MemorySegment value) { samplerYcbcrConversionComponents(this.segment(), 0L, value); return this; }
    /// Accepts `samplerYcbcrConversionComponents` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID samplerYcbcrConversionComponents(Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(samplerYcbcrConversionComponents())); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedYcbcrModel(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrModel.get().get(segment, 0L, index); }
    /// {@return `suggestedYcbcrModel`}
    public int suggestedYcbcrModel() { return suggestedYcbcrModel(this.segment(), 0L); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedYcbcrModel(MemorySegment segment, long index, int value) { VH_suggestedYcbcrModel.get().set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrModel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrModel(int value) { suggestedYcbcrModel(this.segment(), 0L, value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedYcbcrRange(MemorySegment segment, long index) { return (int) VH_suggestedYcbcrRange.get().get(segment, 0L, index); }
    /// {@return `suggestedYcbcrRange`}
    public int suggestedYcbcrRange() { return suggestedYcbcrRange(this.segment(), 0L); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedYcbcrRange(MemorySegment segment, long index, int value) { VH_suggestedYcbcrRange.get().set(segment, 0L, index, value); }
    /// Sets `suggestedYcbcrRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrRange(int value) { suggestedYcbcrRange(this.segment(), 0L, value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedXChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedXChromaOffset.get().get(segment, 0L, index); }
    /// {@return `suggestedXChromaOffset`}
    public int suggestedXChromaOffset() { return suggestedXChromaOffset(this.segment(), 0L); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedXChromaOffset(MemorySegment segment, long index, int value) { VH_suggestedXChromaOffset.get().set(segment, 0L, index, value); }
    /// Sets `suggestedXChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedXChromaOffset(int value) { suggestedXChromaOffset(this.segment(), 0L, value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int suggestedYChromaOffset(MemorySegment segment, long index) { return (int) VH_suggestedYChromaOffset.get().get(segment, 0L, index); }
    /// {@return `suggestedYChromaOffset`}
    public int suggestedYChromaOffset() { return suggestedYChromaOffset(this.segment(), 0L); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void suggestedYChromaOffset(MemorySegment segment, long index, int value) { VH_suggestedYChromaOffset.get().set(segment, 0L, index, value); }
    /// Sets `suggestedYChromaOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYChromaOffset(int value) { suggestedYChromaOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public VkAndroidHardwareBufferFormatProperties2ANDROID asSlice(long index) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAndroidHardwareBufferFormatProperties2ANDROID`
    public VkAndroidHardwareBufferFormatProperties2ANDROID asSlice(long index, long count) { return new VkAndroidHardwareBufferFormatProperties2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAndroidHardwareBufferFormatProperties2ANDROID` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID at(long index, Consumer<VkAndroidHardwareBufferFormatProperties2ANDROID> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param index the index of the struct buffer
    public long externalFormatAt(long index) { return externalFormat(this.segment(), index); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID externalFormatAt(long index, long value) { externalFormat(this.segment(), index, value); return this; }

    /// {@return `formatFeatures` at the given index}
    /// @param index the index of the struct buffer
    public long formatFeaturesAt(long index) { return formatFeatures(this.segment(), index); }
    /// Sets `formatFeatures` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID formatFeaturesAt(long index, long value) { formatFeatures(this.segment(), index, value); return this; }

    /// {@return `samplerYcbcrConversionComponents` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment samplerYcbcrConversionComponentsAt(long index) { return samplerYcbcrConversionComponents(this.segment(), index); }
    /// Sets `samplerYcbcrConversionComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID samplerYcbcrConversionComponentsAt(long index, MemorySegment value) { samplerYcbcrConversionComponents(this.segment(), index, value); return this; }
    /// Accepts `samplerYcbcrConversionComponents` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID samplerYcbcrConversionComponentsAt(long index, Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(samplerYcbcrConversionComponentsAt(index))); return this; }

    /// {@return `suggestedYcbcrModel` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedYcbcrModelAt(long index) { return suggestedYcbcrModel(this.segment(), index); }
    /// Sets `suggestedYcbcrModel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrModelAt(long index, int value) { suggestedYcbcrModel(this.segment(), index, value); return this; }

    /// {@return `suggestedYcbcrRange` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedYcbcrRangeAt(long index) { return suggestedYcbcrRange(this.segment(), index); }
    /// Sets `suggestedYcbcrRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYcbcrRangeAt(long index, int value) { suggestedYcbcrRange(this.segment(), index, value); return this; }

    /// {@return `suggestedXChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedXChromaOffsetAt(long index) { return suggestedXChromaOffset(this.segment(), index); }
    /// Sets `suggestedXChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedXChromaOffsetAt(long index, int value) { suggestedXChromaOffset(this.segment(), index, value); return this; }

    /// {@return `suggestedYChromaOffset` at the given index}
    /// @param index the index of the struct buffer
    public int suggestedYChromaOffsetAt(long index) { return suggestedYChromaOffset(this.segment(), index); }
    /// Sets `suggestedYChromaOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAndroidHardwareBufferFormatProperties2ANDROID suggestedYChromaOffsetAt(long index, int value) { suggestedYChromaOffset(this.segment(), index, value); return this; }

}
