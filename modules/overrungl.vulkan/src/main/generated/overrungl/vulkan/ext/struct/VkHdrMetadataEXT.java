// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHdrMetadataEXT`.
/// ## Layout
/// ```
/// struct VkHdrMetadataEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkXYColorEXT) VkXYColorEXT displayPrimaryRed;
///     (struct VkXYColorEXT) VkXYColorEXT displayPrimaryGreen;
///     (struct VkXYColorEXT) VkXYColorEXT displayPrimaryBlue;
///     (struct VkXYColorEXT) VkXYColorEXT whitePoint;
///     float maxLuminance;
///     float minLuminance;
///     float maxContentLightLevel;
///     float maxFrameAverageLightLevel;
/// };
/// ```
public final class VkHdrMetadataEXT extends GroupType {
    /// The struct layout of `VkHdrMetadataEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryRed"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryGreen"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("displayPrimaryBlue"),
        overrungl.vulkan.ext.struct.VkXYColorEXT.LAYOUT.withName("whitePoint"),
        ValueLayout.JAVA_FLOAT.withName("maxLuminance"),
        ValueLayout.JAVA_FLOAT.withName("minLuminance"),
        ValueLayout.JAVA_FLOAT.withName("maxContentLightLevel"),
        ValueLayout.JAVA_FLOAT.withName("maxFrameAverageLightLevel")
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
    /// The byte offset of `displayPrimaryRed`.
    public static final long OFFSET_displayPrimaryRed = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryRed"));
    /// The memory layout of `displayPrimaryRed`.
    public static final MemoryLayout LAYOUT_displayPrimaryRed = LAYOUT.select(PathElement.groupElement("displayPrimaryRed"));
    /// The byte offset of `displayPrimaryGreen`.
    public static final long OFFSET_displayPrimaryGreen = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryGreen"));
    /// The memory layout of `displayPrimaryGreen`.
    public static final MemoryLayout LAYOUT_displayPrimaryGreen = LAYOUT.select(PathElement.groupElement("displayPrimaryGreen"));
    /// The byte offset of `displayPrimaryBlue`.
    public static final long OFFSET_displayPrimaryBlue = LAYOUT.byteOffset(PathElement.groupElement("displayPrimaryBlue"));
    /// The memory layout of `displayPrimaryBlue`.
    public static final MemoryLayout LAYOUT_displayPrimaryBlue = LAYOUT.select(PathElement.groupElement("displayPrimaryBlue"));
    /// The byte offset of `whitePoint`.
    public static final long OFFSET_whitePoint = LAYOUT.byteOffset(PathElement.groupElement("whitePoint"));
    /// The memory layout of `whitePoint`.
    public static final MemoryLayout LAYOUT_whitePoint = LAYOUT.select(PathElement.groupElement("whitePoint"));
    /// The byte offset of `maxLuminance`.
    public static final long OFFSET_maxLuminance = LAYOUT.byteOffset(PathElement.groupElement("maxLuminance"));
    /// The memory layout of `maxLuminance`.
    public static final MemoryLayout LAYOUT_maxLuminance = LAYOUT.select(PathElement.groupElement("maxLuminance"));
    /// The [VarHandle] of `maxLuminance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxLuminance = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLuminance")));
    /// The byte offset of `minLuminance`.
    public static final long OFFSET_minLuminance = LAYOUT.byteOffset(PathElement.groupElement("minLuminance"));
    /// The memory layout of `minLuminance`.
    public static final MemoryLayout LAYOUT_minLuminance = LAYOUT.select(PathElement.groupElement("minLuminance"));
    /// The [VarHandle] of `minLuminance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minLuminance = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minLuminance")));
    /// The byte offset of `maxContentLightLevel`.
    public static final long OFFSET_maxContentLightLevel = LAYOUT.byteOffset(PathElement.groupElement("maxContentLightLevel"));
    /// The memory layout of `maxContentLightLevel`.
    public static final MemoryLayout LAYOUT_maxContentLightLevel = LAYOUT.select(PathElement.groupElement("maxContentLightLevel"));
    /// The [VarHandle] of `maxContentLightLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxContentLightLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxContentLightLevel")));
    /// The byte offset of `maxFrameAverageLightLevel`.
    public static final long OFFSET_maxFrameAverageLightLevel = LAYOUT.byteOffset(PathElement.groupElement("maxFrameAverageLightLevel"));
    /// The memory layout of `maxFrameAverageLightLevel`.
    public static final MemoryLayout LAYOUT_maxFrameAverageLightLevel = LAYOUT.select(PathElement.groupElement("maxFrameAverageLightLevel"));
    /// The [VarHandle] of `maxFrameAverageLightLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFrameAverageLightLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFrameAverageLightLevel")));

    /// Creates `VkHdrMetadataEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkHdrMetadataEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrMetadataEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrMetadataEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkHdrMetadataEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrMetadataEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrMetadataEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkHdrMetadataEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHdrMetadataEXT`
    public static VkHdrMetadataEXT alloc(SegmentAllocator allocator) { return new VkHdrMetadataEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkHdrMetadataEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHdrMetadataEXT`
    public static VkHdrMetadataEXT alloc(SegmentAllocator allocator, long count) { return new VkHdrMetadataEXT(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkHdrMetadataEXT copyFrom(VkHdrMetadataEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkHdrMetadataEXT reinterpret(long count) { return new VkHdrMetadataEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkHdrMetadataEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkHdrMetadataEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `displayPrimaryRed` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displayPrimaryRed(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPrimaryRed, index), LAYOUT_displayPrimaryRed); }
    /// {@return `displayPrimaryRed`}
    public MemorySegment displayPrimaryRed() { return displayPrimaryRed(this.segment(), 0L); }
    /// Sets `displayPrimaryRed` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayPrimaryRed(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPrimaryRed, index), LAYOUT_displayPrimaryRed.byteSize()); }
    /// Sets `displayPrimaryRed` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryRed(MemorySegment value) { displayPrimaryRed(this.segment(), 0L, value); return this; }
    /// Accepts `displayPrimaryRed` with the given function.
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryRed(Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(displayPrimaryRed())); return this; }

    /// {@return `displayPrimaryGreen` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displayPrimaryGreen(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPrimaryGreen, index), LAYOUT_displayPrimaryGreen); }
    /// {@return `displayPrimaryGreen`}
    public MemorySegment displayPrimaryGreen() { return displayPrimaryGreen(this.segment(), 0L); }
    /// Sets `displayPrimaryGreen` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayPrimaryGreen(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPrimaryGreen, index), LAYOUT_displayPrimaryGreen.byteSize()); }
    /// Sets `displayPrimaryGreen` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryGreen(MemorySegment value) { displayPrimaryGreen(this.segment(), 0L, value); return this; }
    /// Accepts `displayPrimaryGreen` with the given function.
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryGreen(Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(displayPrimaryGreen())); return this; }

    /// {@return `displayPrimaryBlue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment displayPrimaryBlue(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_displayPrimaryBlue, index), LAYOUT_displayPrimaryBlue); }
    /// {@return `displayPrimaryBlue`}
    public MemorySegment displayPrimaryBlue() { return displayPrimaryBlue(this.segment(), 0L); }
    /// Sets `displayPrimaryBlue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayPrimaryBlue(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_displayPrimaryBlue, index), LAYOUT_displayPrimaryBlue.byteSize()); }
    /// Sets `displayPrimaryBlue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryBlue(MemorySegment value) { displayPrimaryBlue(this.segment(), 0L, value); return this; }
    /// Accepts `displayPrimaryBlue` with the given function.
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryBlue(Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(displayPrimaryBlue())); return this; }

    /// {@return `whitePoint` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment whitePoint(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_whitePoint, index), LAYOUT_whitePoint); }
    /// {@return `whitePoint`}
    public MemorySegment whitePoint() { return whitePoint(this.segment(), 0L); }
    /// Sets `whitePoint` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void whitePoint(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_whitePoint, index), LAYOUT_whitePoint.byteSize()); }
    /// Sets `whitePoint` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT whitePoint(MemorySegment value) { whitePoint(this.segment(), 0L, value); return this; }
    /// Accepts `whitePoint` with the given function.
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT whitePoint(Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(whitePoint())); return this; }

    /// {@return `maxLuminance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxLuminance(MemorySegment segment, long index) { return (float) VH_maxLuminance.get().get(segment, 0L, index); }
    /// {@return `maxLuminance`}
    public float maxLuminance() { return maxLuminance(this.segment(), 0L); }
    /// Sets `maxLuminance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLuminance(MemorySegment segment, long index, float value) { VH_maxLuminance.get().set(segment, 0L, index, value); }
    /// Sets `maxLuminance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxLuminance(float value) { maxLuminance(this.segment(), 0L, value); return this; }

    /// {@return `minLuminance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minLuminance(MemorySegment segment, long index) { return (float) VH_minLuminance.get().get(segment, 0L, index); }
    /// {@return `minLuminance`}
    public float minLuminance() { return minLuminance(this.segment(), 0L); }
    /// Sets `minLuminance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minLuminance(MemorySegment segment, long index, float value) { VH_minLuminance.get().set(segment, 0L, index, value); }
    /// Sets `minLuminance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT minLuminance(float value) { minLuminance(this.segment(), 0L, value); return this; }

    /// {@return `maxContentLightLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxContentLightLevel(MemorySegment segment, long index) { return (float) VH_maxContentLightLevel.get().get(segment, 0L, index); }
    /// {@return `maxContentLightLevel`}
    public float maxContentLightLevel() { return maxContentLightLevel(this.segment(), 0L); }
    /// Sets `maxContentLightLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxContentLightLevel(MemorySegment segment, long index, float value) { VH_maxContentLightLevel.get().set(segment, 0L, index, value); }
    /// Sets `maxContentLightLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxContentLightLevel(float value) { maxContentLightLevel(this.segment(), 0L, value); return this; }

    /// {@return `maxFrameAverageLightLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxFrameAverageLightLevel(MemorySegment segment, long index) { return (float) VH_maxFrameAverageLightLevel.get().get(segment, 0L, index); }
    /// {@return `maxFrameAverageLightLevel`}
    public float maxFrameAverageLightLevel() { return maxFrameAverageLightLevel(this.segment(), 0L); }
    /// Sets `maxFrameAverageLightLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFrameAverageLightLevel(MemorySegment segment, long index, float value) { VH_maxFrameAverageLightLevel.get().set(segment, 0L, index, value); }
    /// Sets `maxFrameAverageLightLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxFrameAverageLightLevel(float value) { maxFrameAverageLightLevel(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkHdrMetadataEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkHdrMetadataEXT`
    public VkHdrMetadataEXT asSlice(long index) { return new VkHdrMetadataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkHdrMetadataEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkHdrMetadataEXT`
    public VkHdrMetadataEXT asSlice(long index, long count) { return new VkHdrMetadataEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkHdrMetadataEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkHdrMetadataEXT at(long index, Consumer<VkHdrMetadataEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `displayPrimaryRed` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment displayPrimaryRedAt(long index) { return displayPrimaryRed(this.segment(), index); }
    /// Sets `displayPrimaryRed` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryRedAt(long index, MemorySegment value) { displayPrimaryRed(this.segment(), index, value); return this; }
    /// Accepts `displayPrimaryRed` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryRedAt(long index, Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(displayPrimaryRedAt(index))); return this; }

    /// {@return `displayPrimaryGreen` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment displayPrimaryGreenAt(long index) { return displayPrimaryGreen(this.segment(), index); }
    /// Sets `displayPrimaryGreen` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryGreenAt(long index, MemorySegment value) { displayPrimaryGreen(this.segment(), index, value); return this; }
    /// Accepts `displayPrimaryGreen` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryGreenAt(long index, Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(displayPrimaryGreenAt(index))); return this; }

    /// {@return `displayPrimaryBlue` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment displayPrimaryBlueAt(long index) { return displayPrimaryBlue(this.segment(), index); }
    /// Sets `displayPrimaryBlue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryBlueAt(long index, MemorySegment value) { displayPrimaryBlue(this.segment(), index, value); return this; }
    /// Accepts `displayPrimaryBlue` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT displayPrimaryBlueAt(long index, Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(displayPrimaryBlueAt(index))); return this; }

    /// {@return `whitePoint` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment whitePointAt(long index) { return whitePoint(this.segment(), index); }
    /// Sets `whitePoint` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT whitePointAt(long index, MemorySegment value) { whitePoint(this.segment(), index, value); return this; }
    /// Accepts `whitePoint` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkHdrMetadataEXT whitePointAt(long index, Consumer<overrungl.vulkan.ext.struct.VkXYColorEXT> func) { func.accept(overrungl.vulkan.ext.struct.VkXYColorEXT.of(whitePointAt(index))); return this; }

    /// {@return `maxLuminance` at the given index}
    /// @param index the index of the struct buffer
    public float maxLuminanceAt(long index) { return maxLuminance(this.segment(), index); }
    /// Sets `maxLuminance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxLuminanceAt(long index, float value) { maxLuminance(this.segment(), index, value); return this; }

    /// {@return `minLuminance` at the given index}
    /// @param index the index of the struct buffer
    public float minLuminanceAt(long index) { return minLuminance(this.segment(), index); }
    /// Sets `minLuminance` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT minLuminanceAt(long index, float value) { minLuminance(this.segment(), index, value); return this; }

    /// {@return `maxContentLightLevel` at the given index}
    /// @param index the index of the struct buffer
    public float maxContentLightLevelAt(long index) { return maxContentLightLevel(this.segment(), index); }
    /// Sets `maxContentLightLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxContentLightLevelAt(long index, float value) { maxContentLightLevel(this.segment(), index, value); return this; }

    /// {@return `maxFrameAverageLightLevel` at the given index}
    /// @param index the index of the struct buffer
    public float maxFrameAverageLightLevelAt(long index) { return maxFrameAverageLightLevel(this.segment(), index); }
    /// Sets `maxFrameAverageLightLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrMetadataEXT maxFrameAverageLightLevelAt(long index, float value) { maxFrameAverageLightLevel(this.segment(), index, value); return this; }

}
