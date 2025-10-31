// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoEncodeH265CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeH265CapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeH265CapabilityFlagsKHR flags;
///     (int) StdVideoH265LevelIdc maxLevelIdc;
///     uint32_t maxSliceSegmentCount;
///     (struct VkExtent2D) VkExtent2D maxTiles;
///     ((uint32_t) VkFlags) VkVideoEncodeH265CtbSizeFlagsKHR ctbSizes;
///     ((uint32_t) VkFlags) VkVideoEncodeH265TransformBlockSizeFlagsKHR transformBlockSizes;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxSubLayerCount;
///     (uint32_t) VkBool32 expectDyadicTemporalSubLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     (uint32_t) VkBool32 prefersGopRemainingFrames;
///     (uint32_t) VkBool32 requiresGopRemainingFrames;
///     ((uint32_t) VkFlags) VkVideoEncodeH265StdFlagsKHR stdSyntaxFlags;
/// };
/// ```
public final class VkVideoEncodeH265CapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceSegmentCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTiles"),
        ValueLayout.JAVA_INT.withName("ctbSizes"),
        ValueLayout.JAVA_INT.withName("transformBlockSizes"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxSubLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalSubLayerPattern"),
        ValueLayout.JAVA_INT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `maxLevelIdc`.
    public static final long OFFSET_maxLevelIdc = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
    /// The memory layout of `maxLevelIdc`.
    public static final MemoryLayout LAYOUT_maxLevelIdc = LAYOUT.select(PathElement.groupElement("maxLevelIdc"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    /// The byte offset of `maxSliceSegmentCount`.
    public static final long OFFSET_maxSliceSegmentCount = LAYOUT.byteOffset(PathElement.groupElement("maxSliceSegmentCount"));
    /// The memory layout of `maxSliceSegmentCount`.
    public static final MemoryLayout LAYOUT_maxSliceSegmentCount = LAYOUT.select(PathElement.groupElement("maxSliceSegmentCount"));
    /// The [VarHandle] of `maxSliceSegmentCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSliceSegmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSliceSegmentCount"));
    /// The byte offset of `maxTiles`.
    public static final long OFFSET_maxTiles = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
    /// The memory layout of `maxTiles`.
    public static final MemoryLayout LAYOUT_maxTiles = LAYOUT.select(PathElement.groupElement("maxTiles"));
    /// The byte offset of `ctbSizes`.
    public static final long OFFSET_ctbSizes = LAYOUT.byteOffset(PathElement.groupElement("ctbSizes"));
    /// The memory layout of `ctbSizes`.
    public static final MemoryLayout LAYOUT_ctbSizes = LAYOUT.select(PathElement.groupElement("ctbSizes"));
    /// The [VarHandle] of `ctbSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ctbSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ctbSizes"));
    /// The byte offset of `transformBlockSizes`.
    public static final long OFFSET_transformBlockSizes = LAYOUT.byteOffset(PathElement.groupElement("transformBlockSizes"));
    /// The memory layout of `transformBlockSizes`.
    public static final MemoryLayout LAYOUT_transformBlockSizes = LAYOUT.select(PathElement.groupElement("transformBlockSizes"));
    /// The [VarHandle] of `transformBlockSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_transformBlockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformBlockSizes"));
    /// The byte offset of `maxPPictureL0ReferenceCount`.
    public static final long OFFSET_maxPPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The memory layout of `maxPPictureL0ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxPPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxPPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The byte offset of `maxBPictureL0ReferenceCount`.
    public static final long OFFSET_maxBPictureL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The memory layout of `maxBPictureL0ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxBPictureL0ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxBPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxBPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The byte offset of `maxL1ReferenceCount`.
    public static final long OFFSET_maxL1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxL1ReferenceCount"));
    /// The memory layout of `maxL1ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxL1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxL1ReferenceCount"));
    /// The [VarHandle] of `maxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxL1ReferenceCount"));
    /// The byte offset of `maxSubLayerCount`.
    public static final long OFFSET_maxSubLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxSubLayerCount"));
    /// The memory layout of `maxSubLayerCount`.
    public static final MemoryLayout LAYOUT_maxSubLayerCount = LAYOUT.select(PathElement.groupElement("maxSubLayerCount"));
    /// The [VarHandle] of `maxSubLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxSubLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubLayerCount"));
    /// The byte offset of `expectDyadicTemporalSubLayerPattern`.
    public static final long OFFSET_expectDyadicTemporalSubLayerPattern = LAYOUT.byteOffset(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    /// The memory layout of `expectDyadicTemporalSubLayerPattern`.
    public static final MemoryLayout LAYOUT_expectDyadicTemporalSubLayerPattern = LAYOUT.select(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    /// The [VarHandle] of `expectDyadicTemporalSubLayerPattern` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_expectDyadicTemporalSubLayerPattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    /// The byte offset of `minQp`.
    public static final long OFFSET_minQp = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
    /// The memory layout of `minQp`.
    public static final MemoryLayout LAYOUT_minQp = LAYOUT.select(PathElement.groupElement("minQp"));
    /// The [VarHandle] of `minQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"));
    /// The byte offset of `maxQp`.
    public static final long OFFSET_maxQp = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
    /// The memory layout of `maxQp`.
    public static final MemoryLayout LAYOUT_maxQp = LAYOUT.select(PathElement.groupElement("maxQp"));
    /// The [VarHandle] of `maxQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"));
    /// The byte offset of `prefersGopRemainingFrames`.
    public static final long OFFSET_prefersGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The memory layout of `prefersGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_prefersGopRemainingFrames = LAYOUT.select(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The [VarHandle] of `prefersGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The byte offset of `requiresGopRemainingFrames`.
    public static final long OFFSET_requiresGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The memory layout of `requiresGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_requiresGopRemainingFrames = LAYOUT.select(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The [VarHandle] of `requiresGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The byte offset of `stdSyntaxFlags`.
    public static final long OFFSET_stdSyntaxFlags = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
    /// The memory layout of `stdSyntaxFlags`.
    public static final MemoryLayout LAYOUT_stdSyntaxFlags = LAYOUT.select(PathElement.groupElement("stdSyntaxFlags"));
    /// The [VarHandle] of `stdSyntaxFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265CapabilitiesKHR`
    public static VkVideoEncodeH265CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265CapabilitiesKHR`
    public static VkVideoEncodeH265CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR copyFrom(VkVideoEncodeH265CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265CapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265CapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265CapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    public int maxLevelIdc() { return maxLevelIdc(this.segment(), 0L); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLevelIdc(MemorySegment segment, long index, int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdc(int value) { maxLevelIdc(this.segment(), 0L, value); return this; }

    /// {@return `maxSliceSegmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSliceSegmentCount(MemorySegment segment, long index) { return (int) VH_maxSliceSegmentCount.get(segment, 0L, index); }
    /// {@return `maxSliceSegmentCount`}
    public int maxSliceSegmentCount() { return maxSliceSegmentCount(this.segment(), 0L); }
    /// Sets `maxSliceSegmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSliceSegmentCount(MemorySegment segment, long index, int value) { VH_maxSliceSegmentCount.set(segment, 0L, index, value); }
    /// Sets `maxSliceSegmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCount(int value) { maxSliceSegmentCount(this.segment(), 0L, value); return this; }

    /// {@return `maxTiles` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxTiles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTiles, index), LAYOUT_maxTiles); }
    /// {@return `maxTiles`}
    public MemorySegment maxTiles() { return maxTiles(this.segment(), 0L); }
    /// Sets `maxTiles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTiles(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTiles, index), LAYOUT_maxTiles.byteSize()); }
    /// Sets `maxTiles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxTiles(MemorySegment value) { maxTiles(this.segment(), 0L, value); return this; }
    /// Accepts `maxTiles` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxTiles(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTiles())); return this; }

    /// {@return `ctbSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int ctbSizes(MemorySegment segment, long index) { return (int) VH_ctbSizes.get(segment, 0L, index); }
    /// {@return `ctbSizes`}
    public int ctbSizes() { return ctbSizes(this.segment(), 0L); }
    /// Sets `ctbSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ctbSizes(MemorySegment segment, long index, int value) { VH_ctbSizes.set(segment, 0L, index, value); }
    /// Sets `ctbSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR ctbSizes(int value) { ctbSizes(this.segment(), 0L, value); return this; }

    /// {@return `transformBlockSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int transformBlockSizes(MemorySegment segment, long index) { return (int) VH_transformBlockSizes.get(segment, 0L, index); }
    /// {@return `transformBlockSizes`}
    public int transformBlockSizes() { return transformBlockSizes(this.segment(), 0L); }
    /// Sets `transformBlockSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformBlockSizes(MemorySegment segment, long index, int value) { VH_transformBlockSizes.set(segment, 0L, index, value); }
    /// Sets `transformBlockSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizes(int value) { transformBlockSizes(this.segment(), 0L, value); return this; }

    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxPPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxPPictureL0ReferenceCount`}
    public int maxPPictureL0ReferenceCount() { return maxPPictureL0ReferenceCount(this.segment(), 0L); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPPictureL0ReferenceCount(MemorySegment segment, long index, int value) { VH_maxPPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCount(int value) { maxPPictureL0ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBPictureL0ReferenceCount`}
    public int maxBPictureL0ReferenceCount() { return maxBPictureL0ReferenceCount(this.segment(), 0L); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBPictureL0ReferenceCount(MemorySegment segment, long index, int value) { VH_maxBPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCount(int value) { maxBPictureL0ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxL1ReferenceCount`}
    public int maxL1ReferenceCount() { return maxL1ReferenceCount(this.segment(), 0L); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxL1ReferenceCount(MemorySegment segment, long index, int value) { VH_maxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCount(int value) { maxL1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxSubLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSubLayerCount(MemorySegment segment, long index) { return (int) VH_maxSubLayerCount.get(segment, 0L, index); }
    /// {@return `maxSubLayerCount`}
    public int maxSubLayerCount() { return maxSubLayerCount(this.segment(), 0L); }
    /// Sets `maxSubLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSubLayerCount(MemorySegment segment, long index, int value) { VH_maxSubLayerCount.set(segment, 0L, index, value); }
    /// Sets `maxSubLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCount(int value) { maxSubLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `expectDyadicTemporalSubLayerPattern` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int expectDyadicTemporalSubLayerPattern(MemorySegment segment, long index) { return (int) VH_expectDyadicTemporalSubLayerPattern.get(segment, 0L, index); }
    /// {@return `expectDyadicTemporalSubLayerPattern`}
    public int expectDyadicTemporalSubLayerPattern() { return expectDyadicTemporalSubLayerPattern(this.segment(), 0L); }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void expectDyadicTemporalSubLayerPattern(MemorySegment segment, long index, int value) { VH_expectDyadicTemporalSubLayerPattern.set(segment, 0L, index, value); }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPattern(int value) { expectDyadicTemporalSubLayerPattern(this.segment(), 0L, value); return this; }

    /// {@return `minQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minQp(MemorySegment segment, long index) { return (int) VH_minQp.get(segment, 0L, index); }
    /// {@return `minQp`}
    public int minQp() { return minQp(this.segment(), 0L); }
    /// Sets `minQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQp(MemorySegment segment, long index, int value) { VH_minQp.set(segment, 0L, index, value); }
    /// Sets `minQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR minQp(int value) { minQp(this.segment(), 0L, value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQp(MemorySegment segment, long index) { return (int) VH_maxQp.get(segment, 0L, index); }
    /// {@return `maxQp`}
    public int maxQp() { return maxQp(this.segment(), 0L); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQp(MemorySegment segment, long index, int value) { VH_maxQp.set(segment, 0L, index, value); }
    /// Sets `maxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxQp(int value) { maxQp(this.segment(), 0L, value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_prefersGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `prefersGopRemainingFrames`}
    public int prefersGopRemainingFrames() { return prefersGopRemainingFrames(this.segment(), 0L); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersGopRemainingFrames(MemorySegment segment, long index, int value) { VH_prefersGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFrames(int value) { prefersGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiresGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_requiresGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `requiresGopRemainingFrames`}
    public int requiresGopRemainingFrames() { return requiresGopRemainingFrames(this.segment(), 0L); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiresGopRemainingFrames(MemorySegment segment, long index, int value) { VH_requiresGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFrames(int value) { requiresGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSyntaxFlags(MemorySegment segment, long index) { return (int) VH_stdSyntaxFlags.get(segment, 0L, index); }
    /// {@return `stdSyntaxFlags`}
    public int stdSyntaxFlags() { return stdSyntaxFlags(this.segment(), 0L); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSyntaxFlags(MemorySegment segment, long index, int value) { VH_stdSyntaxFlags.set(segment, 0L, index, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlags(int value) { stdSyntaxFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265CapabilitiesKHR`
    public VkVideoEncodeH265CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265CapabilitiesKHR`
    public VkVideoEncodeH265CapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265CapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR at(long index, Consumer<VkVideoEncodeH265CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param index the index of the struct buffer
    public int maxLevelIdcAt(long index) { return maxLevelIdc(this.segment(), index); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdcAt(long index, int value) { maxLevelIdc(this.segment(), index, value); return this; }

    /// {@return `maxSliceSegmentCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSliceSegmentCountAt(long index) { return maxSliceSegmentCount(this.segment(), index); }
    /// Sets `maxSliceSegmentCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCountAt(long index, int value) { maxSliceSegmentCount(this.segment(), index, value); return this; }

    /// {@return `maxTiles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxTilesAt(long index) { return maxTiles(this.segment(), index); }
    /// Sets `maxTiles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxTilesAt(long index, MemorySegment value) { maxTiles(this.segment(), index, value); return this; }
    /// Accepts `maxTiles` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxTilesAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTilesAt(index))); return this; }

    /// {@return `ctbSizes` at the given index}
    /// @param index the index of the struct buffer
    public int ctbSizesAt(long index) { return ctbSizes(this.segment(), index); }
    /// Sets `ctbSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR ctbSizesAt(long index, int value) { ctbSizes(this.segment(), index, value); return this; }

    /// {@return `transformBlockSizes` at the given index}
    /// @param index the index of the struct buffer
    public int transformBlockSizesAt(long index) { return transformBlockSizes(this.segment(), index); }
    /// Sets `transformBlockSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizesAt(long index, int value) { transformBlockSizes(this.segment(), index, value); return this; }

    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxPPictureL0ReferenceCountAt(long index) { return maxPPictureL0ReferenceCount(this.segment(), index); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCountAt(long index, int value) { maxPPictureL0ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxBPictureL0ReferenceCountAt(long index) { return maxBPictureL0ReferenceCount(this.segment(), index); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCountAt(long index, int value) { maxBPictureL0ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxL1ReferenceCountAt(long index) { return maxL1ReferenceCount(this.segment(), index); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCountAt(long index, int value) { maxL1ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `maxSubLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSubLayerCountAt(long index) { return maxSubLayerCount(this.segment(), index); }
    /// Sets `maxSubLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCountAt(long index, int value) { maxSubLayerCount(this.segment(), index, value); return this; }

    /// {@return `expectDyadicTemporalSubLayerPattern` at the given index}
    /// @param index the index of the struct buffer
    public int expectDyadicTemporalSubLayerPatternAt(long index) { return expectDyadicTemporalSubLayerPattern(this.segment(), index); }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPatternAt(long index, int value) { expectDyadicTemporalSubLayerPattern(this.segment(), index, value); return this; }

    /// {@return `minQp` at the given index}
    /// @param index the index of the struct buffer
    public int minQpAt(long index) { return minQp(this.segment(), index); }
    /// Sets `minQp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR minQpAt(long index, int value) { minQp(this.segment(), index, value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param index the index of the struct buffer
    public int maxQpAt(long index) { return maxQp(this.segment(), index); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxQpAt(long index, int value) { maxQp(this.segment(), index, value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param index the index of the struct buffer
    public int prefersGopRemainingFramesAt(long index) { return prefersGopRemainingFrames(this.segment(), index); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFramesAt(long index, int value) { prefersGopRemainingFrames(this.segment(), index, value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param index the index of the struct buffer
    public int requiresGopRemainingFramesAt(long index) { return requiresGopRemainingFrames(this.segment(), index); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFramesAt(long index, int value) { requiresGopRemainingFrames(this.segment(), index, value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stdSyntaxFlagsAt(long index) { return stdSyntaxFlags(this.segment(), index); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlagsAt(long index, int value) { stdSyntaxFlags(this.segment(), index, value); return this; }

}
