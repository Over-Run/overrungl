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

/// Represents `VkVideoEncodeAV1CapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1CapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeAV1CapabilityFlagsKHR flags;
///     (int) StdVideoAV1Level maxLevel;
///     (struct VkExtent2D) VkExtent2D codedPictureAlignment;
///     (struct VkExtent2D) VkExtent2D maxTiles;
///     (struct VkExtent2D) VkExtent2D minTileSize;
///     (struct VkExtent2D) VkExtent2D maxTileSize;
///     ((uint32_t) VkFlags) VkVideoEncodeAV1SuperblockSizeFlagsKHR superblockSizes;
///     uint32_t maxSingleReferenceCount;
///     uint32_t singleReferenceNameMask;
///     uint32_t maxUnidirectionalCompoundReferenceCount;
///     uint32_t maxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t unidirectionalCompoundReferenceNameMask;
///     uint32_t maxBidirectionalCompoundReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t bidirectionalCompoundReferenceNameMask;
///     uint32_t maxTemporalLayerCount;
///     uint32_t maxSpatialLayerCount;
///     uint32_t maxOperatingPoints;
///     uint32_t minQIndex;
///     uint32_t maxQIndex;
///     (uint32_t) VkBool32 prefersGopRemainingFrames;
///     (uint32_t) VkBool32 requiresGopRemainingFrames;
///     ((uint32_t) VkFlags) VkVideoEncodeAV1StdFlagsKHR stdSyntaxFlags;
/// };
/// ```
public final class VkVideoEncodeAV1CapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevel"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("codedPictureAlignment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTiles"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minTileSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTileSize"),
        ValueLayout.JAVA_INT.withName("superblockSizes"),
        ValueLayout.JAVA_INT.withName("maxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("singleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("unidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("bidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("maxSpatialLayerCount"),
        ValueLayout.JAVA_INT.withName("maxOperatingPoints"),
        ValueLayout.JAVA_INT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_flags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags")));
    /// The byte offset of `maxLevel`.
    public static final long OFFSET_maxLevel = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
    /// The memory layout of `maxLevel`.
    public static final MemoryLayout LAYOUT_maxLevel = LAYOUT.select(PathElement.groupElement("maxLevel"));
    /// The [VarHandle] of `maxLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel")));
    /// The byte offset of `codedPictureAlignment`.
    public static final long OFFSET_codedPictureAlignment = LAYOUT.byteOffset(PathElement.groupElement("codedPictureAlignment"));
    /// The memory layout of `codedPictureAlignment`.
    public static final MemoryLayout LAYOUT_codedPictureAlignment = LAYOUT.select(PathElement.groupElement("codedPictureAlignment"));
    /// The byte offset of `maxTiles`.
    public static final long OFFSET_maxTiles = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
    /// The memory layout of `maxTiles`.
    public static final MemoryLayout LAYOUT_maxTiles = LAYOUT.select(PathElement.groupElement("maxTiles"));
    /// The byte offset of `minTileSize`.
    public static final long OFFSET_minTileSize = LAYOUT.byteOffset(PathElement.groupElement("minTileSize"));
    /// The memory layout of `minTileSize`.
    public static final MemoryLayout LAYOUT_minTileSize = LAYOUT.select(PathElement.groupElement("minTileSize"));
    /// The byte offset of `maxTileSize`.
    public static final long OFFSET_maxTileSize = LAYOUT.byteOffset(PathElement.groupElement("maxTileSize"));
    /// The memory layout of `maxTileSize`.
    public static final MemoryLayout LAYOUT_maxTileSize = LAYOUT.select(PathElement.groupElement("maxTileSize"));
    /// The byte offset of `superblockSizes`.
    public static final long OFFSET_superblockSizes = LAYOUT.byteOffset(PathElement.groupElement("superblockSizes"));
    /// The memory layout of `superblockSizes`.
    public static final MemoryLayout LAYOUT_superblockSizes = LAYOUT.select(PathElement.groupElement("superblockSizes"));
    /// The [VarHandle] of `superblockSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_superblockSizes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("superblockSizes")));
    /// The byte offset of `maxSingleReferenceCount`.
    public static final long OFFSET_maxSingleReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxSingleReferenceCount"));
    /// The memory layout of `maxSingleReferenceCount`.
    public static final MemoryLayout LAYOUT_maxSingleReferenceCount = LAYOUT.select(PathElement.groupElement("maxSingleReferenceCount"));
    /// The [VarHandle] of `maxSingleReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSingleReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSingleReferenceCount")));
    /// The byte offset of `singleReferenceNameMask`.
    public static final long OFFSET_singleReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("singleReferenceNameMask"));
    /// The memory layout of `singleReferenceNameMask`.
    public static final MemoryLayout LAYOUT_singleReferenceNameMask = LAYOUT.select(PathElement.groupElement("singleReferenceNameMask"));
    /// The [VarHandle] of `singleReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_singleReferenceNameMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("singleReferenceNameMask")));
    /// The byte offset of `maxUnidirectionalCompoundReferenceCount`.
    public static final long OFFSET_maxUnidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
    /// The memory layout of `maxUnidirectionalCompoundReferenceCount`.
    public static final MemoryLayout LAYOUT_maxUnidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `maxUnidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxUnidirectionalCompoundReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount")));
    /// The byte offset of `maxUnidirectionalCompoundGroup1ReferenceCount`.
    public static final long OFFSET_maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
    /// The memory layout of `maxUnidirectionalCompoundGroup1ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `maxUnidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxUnidirectionalCompoundGroup1ReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount")));
    /// The byte offset of `unidirectionalCompoundReferenceNameMask`.
    public static final long OFFSET_unidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
    /// The memory layout of `unidirectionalCompoundReferenceNameMask`.
    public static final MemoryLayout LAYOUT_unidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `unidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_unidirectionalCompoundReferenceNameMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("unidirectionalCompoundReferenceNameMask")));
    /// The byte offset of `maxBidirectionalCompoundReferenceCount`.
    public static final long OFFSET_maxBidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
    /// The memory layout of `maxBidirectionalCompoundReferenceCount`.
    public static final MemoryLayout LAYOUT_maxBidirectionalCompoundReferenceCount = LAYOUT.select(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `maxBidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxBidirectionalCompoundReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundReferenceCount")));
    /// The byte offset of `maxBidirectionalCompoundGroup1ReferenceCount`.
    public static final long OFFSET_maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
    /// The memory layout of `maxBidirectionalCompoundGroup1ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `maxBidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxBidirectionalCompoundGroup1ReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount")));
    /// The byte offset of `maxBidirectionalCompoundGroup2ReferenceCount`.
    public static final long OFFSET_maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
    /// The memory layout of `maxBidirectionalCompoundGroup2ReferenceCount`.
    public static final MemoryLayout LAYOUT_maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.select(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
    /// The [VarHandle] of `maxBidirectionalCompoundGroup2ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxBidirectionalCompoundGroup2ReferenceCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount")));
    /// The byte offset of `bidirectionalCompoundReferenceNameMask`.
    public static final long OFFSET_bidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
    /// The memory layout of `bidirectionalCompoundReferenceNameMask`.
    public static final MemoryLayout LAYOUT_bidirectionalCompoundReferenceNameMask = LAYOUT.select(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `bidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_bidirectionalCompoundReferenceNameMask = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("bidirectionalCompoundReferenceNameMask")));
    /// The byte offset of `maxTemporalLayerCount`.
    public static final long OFFSET_maxTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxTemporalLayerCount"));
    /// The memory layout of `maxTemporalLayerCount`.
    public static final MemoryLayout LAYOUT_maxTemporalLayerCount = LAYOUT.select(PathElement.groupElement("maxTemporalLayerCount"));
    /// The [VarHandle] of `maxTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTemporalLayerCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTemporalLayerCount")));
    /// The byte offset of `maxSpatialLayerCount`.
    public static final long OFFSET_maxSpatialLayerCount = LAYOUT.byteOffset(PathElement.groupElement("maxSpatialLayerCount"));
    /// The memory layout of `maxSpatialLayerCount`.
    public static final MemoryLayout LAYOUT_maxSpatialLayerCount = LAYOUT.select(PathElement.groupElement("maxSpatialLayerCount"));
    /// The [VarHandle] of `maxSpatialLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSpatialLayerCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSpatialLayerCount")));
    /// The byte offset of `maxOperatingPoints`.
    public static final long OFFSET_maxOperatingPoints = LAYOUT.byteOffset(PathElement.groupElement("maxOperatingPoints"));
    /// The memory layout of `maxOperatingPoints`.
    public static final MemoryLayout LAYOUT_maxOperatingPoints = LAYOUT.select(PathElement.groupElement("maxOperatingPoints"));
    /// The [VarHandle] of `maxOperatingPoints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxOperatingPoints = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOperatingPoints")));
    /// The byte offset of `minQIndex`.
    public static final long OFFSET_minQIndex = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
    /// The memory layout of `minQIndex`.
    public static final MemoryLayout LAYOUT_minQIndex = LAYOUT.select(PathElement.groupElement("minQIndex"));
    /// The [VarHandle] of `minQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minQIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndex")));
    /// The byte offset of `maxQIndex`.
    public static final long OFFSET_maxQIndex = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
    /// The memory layout of `maxQIndex`.
    public static final MemoryLayout LAYOUT_maxQIndex = LAYOUT.select(PathElement.groupElement("maxQIndex"));
    /// The [VarHandle] of `maxQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxQIndex = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndex")));
    /// The byte offset of `prefersGopRemainingFrames`.
    public static final long OFFSET_prefersGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The memory layout of `prefersGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_prefersGopRemainingFrames = LAYOUT.select(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The [VarHandle] of `prefersGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_prefersGopRemainingFrames = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames")));
    /// The byte offset of `requiresGopRemainingFrames`.
    public static final long OFFSET_requiresGopRemainingFrames = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The memory layout of `requiresGopRemainingFrames`.
    public static final MemoryLayout LAYOUT_requiresGopRemainingFrames = LAYOUT.select(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The [VarHandle] of `requiresGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_requiresGopRemainingFrames = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames")));
    /// The byte offset of `stdSyntaxFlags`.
    public static final long OFFSET_stdSyntaxFlags = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
    /// The memory layout of `stdSyntaxFlags`.
    public static final MemoryLayout LAYOUT_stdSyntaxFlags = LAYOUT.select(PathElement.groupElement("stdSyntaxFlags"));
    /// The [VarHandle] of `stdSyntaxFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_stdSyntaxFlags = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags")));

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1CapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1CapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1CapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1CapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1CapabilitiesKHR`
    public static VkVideoEncodeAV1CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1CapabilitiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1CapabilitiesKHR`
    public static VkVideoEncodeAV1CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1CapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR copyFrom(VkVideoEncodeAV1CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1CapabilitiesKHR reinterpret(long count) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeAV1CapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1CapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1CapabilitiesKHR flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `maxLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLevel(MemorySegment segment, long index) { return (int) VH_maxLevel.get().get(segment, 0L, index); }
    /// {@return `maxLevel`}
    public int maxLevel() { return maxLevel(this.segment(), 0L); }
    /// Sets `maxLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLevel(MemorySegment segment, long index, int value) { VH_maxLevel.get().set(segment, 0L, index, value); }
    /// Sets `maxLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxLevel(int value) { maxLevel(this.segment(), 0L, value); return this; }

    /// {@return `codedPictureAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment codedPictureAlignment(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_codedPictureAlignment, index), LAYOUT_codedPictureAlignment); }
    /// {@return `codedPictureAlignment`}
    public MemorySegment codedPictureAlignment() { return codedPictureAlignment(this.segment(), 0L); }
    /// Sets `codedPictureAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void codedPictureAlignment(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_codedPictureAlignment, index), LAYOUT_codedPictureAlignment.byteSize()); }
    /// Sets `codedPictureAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment(MemorySegment value) { codedPictureAlignment(this.segment(), 0L, value); return this; }
    /// Accepts `codedPictureAlignment` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(codedPictureAlignment())); return this; }

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
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles(MemorySegment value) { maxTiles(this.segment(), 0L, value); return this; }
    /// Accepts `maxTiles` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTiles())); return this; }

    /// {@return `minTileSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minTileSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minTileSize, index), LAYOUT_minTileSize); }
    /// {@return `minTileSize`}
    public MemorySegment minTileSize() { return minTileSize(this.segment(), 0L); }
    /// Sets `minTileSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minTileSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minTileSize, index), LAYOUT_minTileSize.byteSize()); }
    /// Sets `minTileSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize(MemorySegment value) { minTileSize(this.segment(), 0L, value); return this; }
    /// Accepts `minTileSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minTileSize())); return this; }

    /// {@return `maxTileSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxTileSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTileSize, index), LAYOUT_maxTileSize); }
    /// {@return `maxTileSize`}
    public MemorySegment maxTileSize() { return maxTileSize(this.segment(), 0L); }
    /// Sets `maxTileSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTileSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTileSize, index), LAYOUT_maxTileSize.byteSize()); }
    /// Sets `maxTileSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize(MemorySegment value) { maxTileSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxTileSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTileSize())); return this; }

    /// {@return `superblockSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int superblockSizes(MemorySegment segment, long index) { return (int) VH_superblockSizes.get().get(segment, 0L, index); }
    /// {@return `superblockSizes`}
    public int superblockSizes() { return superblockSizes(this.segment(), 0L); }
    /// Sets `superblockSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void superblockSizes(MemorySegment segment, long index, int value) { VH_superblockSizes.get().set(segment, 0L, index, value); }
    /// Sets `superblockSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR superblockSizes(int value) { superblockSizes(this.segment(), 0L, value); return this; }

    /// {@return `maxSingleReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSingleReferenceCount(MemorySegment segment, long index) { return (int) VH_maxSingleReferenceCount.get().get(segment, 0L, index); }
    /// {@return `maxSingleReferenceCount`}
    public int maxSingleReferenceCount() { return maxSingleReferenceCount(this.segment(), 0L); }
    /// Sets `maxSingleReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSingleReferenceCount(MemorySegment segment, long index, int value) { VH_maxSingleReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `maxSingleReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxSingleReferenceCount(int value) { maxSingleReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `singleReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int singleReferenceNameMask(MemorySegment segment, long index) { return (int) VH_singleReferenceNameMask.get().get(segment, 0L, index); }
    /// {@return `singleReferenceNameMask`}
    public int singleReferenceNameMask() { return singleReferenceNameMask(this.segment(), 0L); }
    /// Sets `singleReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void singleReferenceNameMask(MemorySegment segment, long index, int value) { VH_singleReferenceNameMask.get().set(segment, 0L, index, value); }
    /// Sets `singleReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR singleReferenceNameMask(int value) { singleReferenceNameMask(this.segment(), 0L, value); return this; }

    /// {@return `maxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_maxUnidirectionalCompoundReferenceCount.get().get(segment, 0L, index); }
    /// {@return `maxUnidirectionalCompoundReferenceCount`}
    public int maxUnidirectionalCompoundReferenceCount() { return maxUnidirectionalCompoundReferenceCount(this.segment(), 0L); }
    /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index, int value) { VH_maxUnidirectionalCompoundReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundReferenceCount(int value) { maxUnidirectionalCompoundReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxUnidirectionalCompoundGroup1ReferenceCount.get().get(segment, 0L, index); }
    /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount`}
    public int maxUnidirectionalCompoundGroup1ReferenceCount() { return maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L); }
    /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, int value) { VH_maxUnidirectionalCompoundGroup1ReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundGroup1ReferenceCount(int value) { maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `unidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int unidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_unidirectionalCompoundReferenceNameMask.get().get(segment, 0L, index); }
    /// {@return `unidirectionalCompoundReferenceNameMask`}
    public int unidirectionalCompoundReferenceNameMask() { return unidirectionalCompoundReferenceNameMask(this.segment(), 0L); }
    /// Sets `unidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void unidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, int value) { VH_unidirectionalCompoundReferenceNameMask.get().set(segment, 0L, index, value); }
    /// Sets `unidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR unidirectionalCompoundReferenceNameMask(int value) { unidirectionalCompoundReferenceNameMask(this.segment(), 0L, value); return this; }

    /// {@return `maxBidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBidirectionalCompoundReferenceCount.get().get(segment, 0L, index); }
    /// {@return `maxBidirectionalCompoundReferenceCount`}
    public int maxBidirectionalCompoundReferenceCount() { return maxBidirectionalCompoundReferenceCount(this.segment(), 0L); }
    /// Sets `maxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBidirectionalCompoundReferenceCount(MemorySegment segment, long index, int value) { VH_maxBidirectionalCompoundReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `maxBidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundReferenceCount(int value) { maxBidirectionalCompoundReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBidirectionalCompoundGroup1ReferenceCount.get().get(segment, 0L, index); }
    /// {@return `maxBidirectionalCompoundGroup1ReferenceCount`}
    public int maxBidirectionalCompoundGroup1ReferenceCount() { return maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L); }
    /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, int value) { VH_maxBidirectionalCompoundGroup1ReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup1ReferenceCount(int value) { maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `maxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBidirectionalCompoundGroup2ReferenceCount.get().get(segment, 0L, index); }
    /// {@return `maxBidirectionalCompoundGroup2ReferenceCount`}
    public int maxBidirectionalCompoundGroup2ReferenceCount() { return maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), 0L); }
    /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index, int value) { VH_maxBidirectionalCompoundGroup2ReferenceCount.get().set(segment, 0L, index, value); }
    /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup2ReferenceCount(int value) { maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `bidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_bidirectionalCompoundReferenceNameMask.get().get(segment, 0L, index); }
    /// {@return `bidirectionalCompoundReferenceNameMask`}
    public int bidirectionalCompoundReferenceNameMask() { return bidirectionalCompoundReferenceNameMask(this.segment(), 0L); }
    /// Sets `bidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, int value) { VH_bidirectionalCompoundReferenceNameMask.get().set(segment, 0L, index, value); }
    /// Sets `bidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR bidirectionalCompoundReferenceNameMask(int value) { bidirectionalCompoundReferenceNameMask(this.segment(), 0L, value); return this; }

    /// {@return `maxTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_maxTemporalLayerCount.get().get(segment, 0L, index); }
    /// {@return `maxTemporalLayerCount`}
    public int maxTemporalLayerCount() { return maxTemporalLayerCount(this.segment(), 0L); }
    /// Sets `maxTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTemporalLayerCount(MemorySegment segment, long index, int value) { VH_maxTemporalLayerCount.get().set(segment, 0L, index, value); }
    /// Sets `maxTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTemporalLayerCount(int value) { maxTemporalLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `maxSpatialLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSpatialLayerCount(MemorySegment segment, long index) { return (int) VH_maxSpatialLayerCount.get().get(segment, 0L, index); }
    /// {@return `maxSpatialLayerCount`}
    public int maxSpatialLayerCount() { return maxSpatialLayerCount(this.segment(), 0L); }
    /// Sets `maxSpatialLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSpatialLayerCount(MemorySegment segment, long index, int value) { VH_maxSpatialLayerCount.get().set(segment, 0L, index, value); }
    /// Sets `maxSpatialLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxSpatialLayerCount(int value) { maxSpatialLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `maxOperatingPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxOperatingPoints(MemorySegment segment, long index) { return (int) VH_maxOperatingPoints.get().get(segment, 0L, index); }
    /// {@return `maxOperatingPoints`}
    public int maxOperatingPoints() { return maxOperatingPoints(this.segment(), 0L); }
    /// Sets `maxOperatingPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxOperatingPoints(MemorySegment segment, long index, int value) { VH_maxOperatingPoints.get().set(segment, 0L, index, value); }
    /// Sets `maxOperatingPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxOperatingPoints(int value) { maxOperatingPoints(this.segment(), 0L, value); return this; }

    /// {@return `minQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minQIndex(MemorySegment segment, long index) { return (int) VH_minQIndex.get().get(segment, 0L, index); }
    /// {@return `minQIndex`}
    public int minQIndex() { return minQIndex(this.segment(), 0L); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQIndex(MemorySegment segment, long index, int value) { VH_minQIndex.get().set(segment, 0L, index, value); }
    /// Sets `minQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minQIndex(int value) { minQIndex(this.segment(), 0L, value); return this; }

    /// {@return `maxQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQIndex(MemorySegment segment, long index) { return (int) VH_maxQIndex.get().get(segment, 0L, index); }
    /// {@return `maxQIndex`}
    public int maxQIndex() { return maxQIndex(this.segment(), 0L); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQIndex(MemorySegment segment, long index, int value) { VH_maxQIndex.get().set(segment, 0L, index, value); }
    /// Sets `maxQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxQIndex(int value) { maxQIndex(this.segment(), 0L, value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int prefersGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_prefersGopRemainingFrames.get().get(segment, 0L, index); }
    /// {@return `prefersGopRemainingFrames`}
    public int prefersGopRemainingFrames() { return prefersGopRemainingFrames(this.segment(), 0L); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void prefersGopRemainingFrames(MemorySegment segment, long index, int value) { VH_prefersGopRemainingFrames.get().set(segment, 0L, index, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR prefersGopRemainingFrames(int value) { prefersGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int requiresGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_requiresGopRemainingFrames.get().get(segment, 0L, index); }
    /// {@return `requiresGopRemainingFrames`}
    public int requiresGopRemainingFrames() { return requiresGopRemainingFrames(this.segment(), 0L); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void requiresGopRemainingFrames(MemorySegment segment, long index, int value) { VH_requiresGopRemainingFrames.get().set(segment, 0L, index, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR requiresGopRemainingFrames(int value) { requiresGopRemainingFrames(this.segment(), 0L, value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSyntaxFlags(MemorySegment segment, long index) { return (int) VH_stdSyntaxFlags.get().get(segment, 0L, index); }
    /// {@return `stdSyntaxFlags`}
    public int stdSyntaxFlags() { return stdSyntaxFlags(this.segment(), 0L); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSyntaxFlags(MemorySegment segment, long index, int value) { VH_stdSyntaxFlags.get().set(segment, 0L, index, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR stdSyntaxFlags(int value) { stdSyntaxFlags(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeAV1CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1CapabilitiesKHR`
    public VkVideoEncodeAV1CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1CapabilitiesKHR`
    public VkVideoEncodeAV1CapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1CapabilitiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR at(long index, Consumer<VkVideoEncodeAV1CapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `maxLevel` at the given index}
    /// @param index the index of the struct buffer
    public int maxLevelAt(long index) { return maxLevel(this.segment(), index); }
    /// Sets `maxLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxLevelAt(long index, int value) { maxLevel(this.segment(), index, value); return this; }

    /// {@return `codedPictureAlignment` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment codedPictureAlignmentAt(long index) { return codedPictureAlignment(this.segment(), index); }
    /// Sets `codedPictureAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignmentAt(long index, MemorySegment value) { codedPictureAlignment(this.segment(), index, value); return this; }
    /// Accepts `codedPictureAlignment` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignmentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(codedPictureAlignmentAt(index))); return this; }

    /// {@return `maxTiles` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxTilesAt(long index) { return maxTiles(this.segment(), index); }
    /// Sets `maxTiles` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTilesAt(long index, MemorySegment value) { maxTiles(this.segment(), index, value); return this; }
    /// Accepts `maxTiles` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTilesAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTilesAt(index))); return this; }

    /// {@return `minTileSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minTileSizeAt(long index) { return minTileSize(this.segment(), index); }
    /// Sets `minTileSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minTileSizeAt(long index, MemorySegment value) { minTileSize(this.segment(), index, value); return this; }
    /// Accepts `minTileSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minTileSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minTileSizeAt(index))); return this; }

    /// {@return `maxTileSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxTileSizeAt(long index) { return maxTileSize(this.segment(), index); }
    /// Sets `maxTileSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSizeAt(long index, MemorySegment value) { maxTileSize(this.segment(), index, value); return this; }
    /// Accepts `maxTileSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSizeAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxTileSizeAt(index))); return this; }

    /// {@return `superblockSizes` at the given index}
    /// @param index the index of the struct buffer
    public int superblockSizesAt(long index) { return superblockSizes(this.segment(), index); }
    /// Sets `superblockSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR superblockSizesAt(long index, int value) { superblockSizes(this.segment(), index, value); return this; }

    /// {@return `maxSingleReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSingleReferenceCountAt(long index) { return maxSingleReferenceCount(this.segment(), index); }
    /// Sets `maxSingleReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxSingleReferenceCountAt(long index, int value) { maxSingleReferenceCount(this.segment(), index, value); return this; }

    /// {@return `singleReferenceNameMask` at the given index}
    /// @param index the index of the struct buffer
    public int singleReferenceNameMaskAt(long index) { return singleReferenceNameMask(this.segment(), index); }
    /// Sets `singleReferenceNameMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR singleReferenceNameMaskAt(long index, int value) { singleReferenceNameMask(this.segment(), index, value); return this; }

    /// {@return `maxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxUnidirectionalCompoundReferenceCountAt(long index) { return maxUnidirectionalCompoundReferenceCount(this.segment(), index); }
    /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundReferenceCountAt(long index, int value) { maxUnidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }

    /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
    /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `unidirectionalCompoundReferenceNameMask` at the given index}
    /// @param index the index of the struct buffer
    public int unidirectionalCompoundReferenceNameMaskAt(long index) { return unidirectionalCompoundReferenceNameMask(this.segment(), index); }
    /// Sets `unidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR unidirectionalCompoundReferenceNameMaskAt(long index, int value) { unidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }

    /// {@return `maxBidirectionalCompoundReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxBidirectionalCompoundReferenceCountAt(long index) { return maxBidirectionalCompoundReferenceCount(this.segment(), index); }
    /// Sets `maxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundReferenceCountAt(long index, int value) { maxBidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }

    /// {@return `maxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
    /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup1ReferenceCountAt(long index, int value) { maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `maxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index); }
    /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup2ReferenceCountAt(long index, int value) { maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `bidirectionalCompoundReferenceNameMask` at the given index}
    /// @param index the index of the struct buffer
    public int bidirectionalCompoundReferenceNameMaskAt(long index) { return bidirectionalCompoundReferenceNameMask(this.segment(), index); }
    /// Sets `bidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR bidirectionalCompoundReferenceNameMaskAt(long index, int value) { bidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }

    /// {@return `maxTemporalLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxTemporalLayerCountAt(long index) { return maxTemporalLayerCount(this.segment(), index); }
    /// Sets `maxTemporalLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTemporalLayerCountAt(long index, int value) { maxTemporalLayerCount(this.segment(), index, value); return this; }

    /// {@return `maxSpatialLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSpatialLayerCountAt(long index) { return maxSpatialLayerCount(this.segment(), index); }
    /// Sets `maxSpatialLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxSpatialLayerCountAt(long index, int value) { maxSpatialLayerCount(this.segment(), index, value); return this; }

    /// {@return `maxOperatingPoints` at the given index}
    /// @param index the index of the struct buffer
    public int maxOperatingPointsAt(long index) { return maxOperatingPoints(this.segment(), index); }
    /// Sets `maxOperatingPoints` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxOperatingPointsAt(long index, int value) { maxOperatingPoints(this.segment(), index, value); return this; }

    /// {@return `minQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int minQIndexAt(long index) { return minQIndex(this.segment(), index); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minQIndexAt(long index, int value) { minQIndex(this.segment(), index, value); return this; }

    /// {@return `maxQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int maxQIndexAt(long index) { return maxQIndex(this.segment(), index); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxQIndexAt(long index, int value) { maxQIndex(this.segment(), index, value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param index the index of the struct buffer
    public int prefersGopRemainingFramesAt(long index) { return prefersGopRemainingFrames(this.segment(), index); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR prefersGopRemainingFramesAt(long index, int value) { prefersGopRemainingFrames(this.segment(), index, value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param index the index of the struct buffer
    public int requiresGopRemainingFramesAt(long index) { return requiresGopRemainingFrames(this.segment(), index); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR requiresGopRemainingFramesAt(long index, int value) { requiresGopRemainingFrames(this.segment(), index, value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param index the index of the struct buffer
    public int stdSyntaxFlagsAt(long index) { return stdSyntaxFlags(this.segment(), index); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR stdSyntaxFlagsAt(long index, int value) { stdSyntaxFlags(this.segment(), index, value); return this; }

}
