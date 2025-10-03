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

/// Represents `VkVideoFormatPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkFormat format;
///     (struct VkComponentMapping) VkComponentMapping componentMapping;
///     ((uint32_t) VkFlags) VkImageCreateFlags imageCreateFlags;
///     (int) VkImageType imageType;
///     (int) VkImageTiling imageTiling;
///     ((uint32_t) VkFlags) VkImageUsageFlags imageUsageFlags;
/// };
/// ```
public final class VkVideoFormatPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoFormatPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("componentMapping"),
        ValueLayout.JAVA_INT.withName("imageCreateFlags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("imageTiling"),
        ValueLayout.JAVA_INT.withName("imageUsageFlags")
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
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `componentMapping`.
    public static final long OFFSET_componentMapping = LAYOUT.byteOffset(PathElement.groupElement("componentMapping"));
    /// The memory layout of `componentMapping`.
    public static final MemoryLayout LAYOUT_componentMapping = LAYOUT.select(PathElement.groupElement("componentMapping"));
    /// The byte offset of `imageCreateFlags`.
    public static final long OFFSET_imageCreateFlags = LAYOUT.byteOffset(PathElement.groupElement("imageCreateFlags"));
    /// The memory layout of `imageCreateFlags`.
    public static final MemoryLayout LAYOUT_imageCreateFlags = LAYOUT.select(PathElement.groupElement("imageCreateFlags"));
    /// The [VarHandle] of `imageCreateFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCreateFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCreateFlags"));
    /// The byte offset of `imageType`.
    public static final long OFFSET_imageType = LAYOUT.byteOffset(PathElement.groupElement("imageType"));
    /// The memory layout of `imageType`.
    public static final MemoryLayout LAYOUT_imageType = LAYOUT.select(PathElement.groupElement("imageType"));
    /// The [VarHandle] of `imageType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageType"));
    /// The byte offset of `imageTiling`.
    public static final long OFFSET_imageTiling = LAYOUT.byteOffset(PathElement.groupElement("imageTiling"));
    /// The memory layout of `imageTiling`.
    public static final MemoryLayout LAYOUT_imageTiling = LAYOUT.select(PathElement.groupElement("imageTiling"));
    /// The [VarHandle] of `imageTiling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageTiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageTiling"));
    /// The byte offset of `imageUsageFlags`.
    public static final long OFFSET_imageUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("imageUsageFlags"));
    /// The memory layout of `imageUsageFlags`.
    public static final MemoryLayout LAYOUT_imageUsageFlags = LAYOUT.select(PathElement.groupElement("imageUsageFlags"));
    /// The [VarHandle] of `imageUsageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageUsageFlags"));

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoFormatPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoFormatPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoFormatPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatPropertiesKHR`
    public static VkVideoFormatPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoFormatPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoFormatPropertiesKHR`
    public static VkVideoFormatPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoFormatPropertiesKHR copyFrom(VkVideoFormatPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoFormatPropertiesKHR reinterpret(long count) { return new VkVideoFormatPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoFormatPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoFormatPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `componentMapping` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment componentMapping(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_componentMapping, index), LAYOUT_componentMapping); }
    /// {@return `componentMapping`}
    public MemorySegment componentMapping() { return componentMapping(this.segment(), 0L); }
    /// Sets `componentMapping` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void componentMapping(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_componentMapping, index), LAYOUT_componentMapping.byteSize()); }
    /// Sets `componentMapping` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR componentMapping(MemorySegment value) { componentMapping(this.segment(), 0L, value); return this; }
    /// Accepts `componentMapping` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoFormatPropertiesKHR componentMapping(Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(componentMapping())); return this; }

    /// {@return `imageCreateFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageCreateFlags(MemorySegment segment, long index) { return (int) VH_imageCreateFlags.get(segment, 0L, index); }
    /// {@return `imageCreateFlags`}
    public int imageCreateFlags() { return imageCreateFlags(this.segment(), 0L); }
    /// Sets `imageCreateFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCreateFlags(MemorySegment segment, long index, int value) { VH_imageCreateFlags.set(segment, 0L, index, value); }
    /// Sets `imageCreateFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageCreateFlags(int value) { imageCreateFlags(this.segment(), 0L, value); return this; }

    /// {@return `imageType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageType(MemorySegment segment, long index) { return (int) VH_imageType.get(segment, 0L, index); }
    /// {@return `imageType`}
    public int imageType() { return imageType(this.segment(), 0L); }
    /// Sets `imageType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageType(MemorySegment segment, long index, int value) { VH_imageType.set(segment, 0L, index, value); }
    /// Sets `imageType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageType(int value) { imageType(this.segment(), 0L, value); return this; }

    /// {@return `imageTiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageTiling(MemorySegment segment, long index) { return (int) VH_imageTiling.get(segment, 0L, index); }
    /// {@return `imageTiling`}
    public int imageTiling() { return imageTiling(this.segment(), 0L); }
    /// Sets `imageTiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageTiling(MemorySegment segment, long index, int value) { VH_imageTiling.set(segment, 0L, index, value); }
    /// Sets `imageTiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageTiling(int value) { imageTiling(this.segment(), 0L, value); return this; }

    /// {@return `imageUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageUsageFlags(MemorySegment segment, long index) { return (int) VH_imageUsageFlags.get(segment, 0L, index); }
    /// {@return `imageUsageFlags`}
    public int imageUsageFlags() { return imageUsageFlags(this.segment(), 0L); }
    /// Sets `imageUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageUsageFlags(MemorySegment segment, long index, int value) { VH_imageUsageFlags.set(segment, 0L, index, value); }
    /// Sets `imageUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageUsageFlags(int value) { imageUsageFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoFormatPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoFormatPropertiesKHR`
    public VkVideoFormatPropertiesKHR asSlice(long index) { return new VkVideoFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoFormatPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoFormatPropertiesKHR`
    public VkVideoFormatPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoFormatPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoFormatPropertiesKHR at(long index, Consumer<VkVideoFormatPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `componentMapping` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment componentMappingAt(long index) { return componentMapping(this.segment(), index); }
    /// Sets `componentMapping` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR componentMappingAt(long index, MemorySegment value) { componentMapping(this.segment(), index, value); return this; }
    /// Accepts `componentMapping` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoFormatPropertiesKHR componentMappingAt(long index, Consumer<overrungl.vulkan.struct.VkComponentMapping> func) { func.accept(overrungl.vulkan.struct.VkComponentMapping.of(componentMappingAt(index))); return this; }

    /// {@return `imageCreateFlags` at the given index}
    /// @param index the index of the struct buffer
    public int imageCreateFlagsAt(long index) { return imageCreateFlags(this.segment(), index); }
    /// Sets `imageCreateFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageCreateFlagsAt(long index, int value) { imageCreateFlags(this.segment(), index, value); return this; }

    /// {@return `imageType` at the given index}
    /// @param index the index of the struct buffer
    public int imageTypeAt(long index) { return imageType(this.segment(), index); }
    /// Sets `imageType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageTypeAt(long index, int value) { imageType(this.segment(), index, value); return this; }

    /// {@return `imageTiling` at the given index}
    /// @param index the index of the struct buffer
    public int imageTilingAt(long index) { return imageTiling(this.segment(), index); }
    /// Sets `imageTiling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageTilingAt(long index, int value) { imageTiling(this.segment(), index, value); return this; }

    /// {@return `imageUsageFlags` at the given index}
    /// @param index the index of the struct buffer
    public int imageUsageFlagsAt(long index) { return imageUsageFlags(this.segment(), index); }
    /// Sets `imageUsageFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatPropertiesKHR imageUsageFlagsAt(long index, int value) { imageUsageFlags(this.segment(), index, value); return this; }

}
