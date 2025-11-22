// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoCapabilitiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoCapabilityFlagsKHR flags;
///     VkDeviceSize minBitstreamBufferOffsetAlignment;
///     VkDeviceSize minBitstreamBufferSizeAlignment;
///     VkExtent2D pictureAccessGranularity;
///     VkExtent2D minCodedExtent;
///     VkExtent2D maxCodedExtent;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     VkExtensionProperties stdHeaderVersion;
/// }
/// ```
public final class VkVideoCapabilitiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("minBitstreamBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minBitstreamBufferSizeAlignment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("pictureAccessGranularity"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minCodedExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxCodedExtent"),
        ValueLayout.JAVA_INT.withName("maxDpbSlots"),
        ValueLayout.JAVA_INT.withName("maxActiveReferencePictures"),
        overrungl.vulkan.struct.VkExtensionProperties.LAYOUT.withName("stdHeaderVersion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_minBitstreamBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    public static final long OFFSET_minBitstreamBufferSizeAlignment = LAYOUT.byteOffset(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    public static final long OFFSET_pictureAccessGranularity = LAYOUT.byteOffset(PathElement.groupElement("pictureAccessGranularity"));
    public static final long OFFSET_minCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("minCodedExtent"));
    public static final long OFFSET_maxCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
    public static final long OFFSET_maxDpbSlots = LAYOUT.byteOffset(PathElement.groupElement("maxDpbSlots"));
    public static final long OFFSET_maxActiveReferencePictures = LAYOUT.byteOffset(PathElement.groupElement("maxActiveReferencePictures"));
    public static final long OFFSET_stdHeaderVersion = LAYOUT.byteOffset(PathElement.groupElement("stdHeaderVersion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_minBitstreamBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_minBitstreamBufferSizeAlignment = LAYOUT.select(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    public static final MemoryLayout LAYOUT_pictureAccessGranularity = LAYOUT.select(PathElement.groupElement("pictureAccessGranularity"));
    public static final MemoryLayout LAYOUT_minCodedExtent = LAYOUT.select(PathElement.groupElement("minCodedExtent"));
    public static final MemoryLayout LAYOUT_maxCodedExtent = LAYOUT.select(PathElement.groupElement("maxCodedExtent"));
    public static final MemoryLayout LAYOUT_maxDpbSlots = LAYOUT.select(PathElement.groupElement("maxDpbSlots"));
    public static final MemoryLayout LAYOUT_maxActiveReferencePictures = LAYOUT.select(PathElement.groupElement("maxActiveReferencePictures"));
    public static final MemoryLayout LAYOUT_stdHeaderVersion = LAYOUT.select(PathElement.groupElement("stdHeaderVersion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_minBitstreamBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBitstreamBufferOffsetAlignment"));
    public static final VarHandle VH_minBitstreamBufferSizeAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minBitstreamBufferSizeAlignment"));
    public static final VarHandle VH_pictureAccessGranularity$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pictureAccessGranularity"), PathElement.groupElement("width"));
    public static final VarHandle VH_pictureAccessGranularity$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pictureAccessGranularity"), PathElement.groupElement("height"));
    public static final VarHandle VH_minCodedExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minCodedExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_minCodedExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minCodedExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxCodedExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCodedExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxCodedExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCodedExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_maxDpbSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDpbSlots"));
    public static final VarHandle VH_maxActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxActiveReferencePictures"));
    public static final VarHandle VH_stdHeaderVersion$extensionName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdHeaderVersion"), PathElement.groupElement("extensionName"), PathElement.sequenceElement());
    public static final VarHandle VH_stdHeaderVersion$specVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdHeaderVersion"), PathElement.groupElement("specVersion"));

    public VkVideoCapabilitiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoCapabilitiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoCapabilitiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoCapabilitiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoCapabilitiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoCapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoCapabilitiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR); }
    public static VkVideoCapabilitiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR);
        return s;
    }
    public VkVideoCapabilitiesKHR copyFrom(VkVideoCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoCapabilitiesKHR reinterpret(long count) { return new VkVideoCapabilitiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoCapabilitiesKHR asSlice(long index) { return new VkVideoCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoCapabilitiesKHR asSlice(long index, long count) { return new VkVideoCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoCapabilitiesKHR at(long index, Consumer<VkVideoCapabilitiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long minBitstreamBufferOffsetAlignmentAt(long index) { return (long) VH_minBitstreamBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long minBitstreamBufferSizeAlignmentAt(long index) { return (long) VH_minBitstreamBufferSizeAlignment.get(this.segment(), 0L, index); }
    public int pictureAccessGranularity$widthAt(long index) { return (int) VH_pictureAccessGranularity$width.get(this.segment(), 0L, index); }
    public int pictureAccessGranularity$heightAt(long index) { return (int) VH_pictureAccessGranularity$height.get(this.segment(), 0L, index); }
    public int minCodedExtent$widthAt(long index) { return (int) VH_minCodedExtent$width.get(this.segment(), 0L, index); }
    public int minCodedExtent$heightAt(long index) { return (int) VH_minCodedExtent$height.get(this.segment(), 0L, index); }
    public int maxCodedExtent$widthAt(long index) { return (int) VH_maxCodedExtent$width.get(this.segment(), 0L, index); }
    public int maxCodedExtent$heightAt(long index) { return (int) VH_maxCodedExtent$height.get(this.segment(), 0L, index); }
    public int maxDpbSlotsAt(long index) { return (int) VH_maxDpbSlots.get(this.segment(), 0L, index); }
    public int maxActiveReferencePicturesAt(long index) { return (int) VH_maxActiveReferencePictures.get(this.segment(), 0L, index); }
    public byte stdHeaderVersion$extensionNameAt(long index, long index0) { return (byte) VH_stdHeaderVersion$extensionName.get(this.segment(), 0L, index, index0); }
    public int stdHeaderVersion$specVersionAt(long index) { return (int) VH_stdHeaderVersion$specVersion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long minBitstreamBufferOffsetAlignment() { return (long) VH_minBitstreamBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long minBitstreamBufferSizeAlignment() { return (long) VH_minBitstreamBufferSizeAlignment.get(this.segment(), 0L, 0L); }
    public int pictureAccessGranularity$width() { return (int) VH_pictureAccessGranularity$width.get(this.segment(), 0L, 0L); }
    public int pictureAccessGranularity$height() { return (int) VH_pictureAccessGranularity$height.get(this.segment(), 0L, 0L); }
    public int minCodedExtent$width() { return (int) VH_minCodedExtent$width.get(this.segment(), 0L, 0L); }
    public int minCodedExtent$height() { return (int) VH_minCodedExtent$height.get(this.segment(), 0L, 0L); }
    public int maxCodedExtent$width() { return (int) VH_maxCodedExtent$width.get(this.segment(), 0L, 0L); }
    public int maxCodedExtent$height() { return (int) VH_maxCodedExtent$height.get(this.segment(), 0L, 0L); }
    public int maxDpbSlots() { return (int) VH_maxDpbSlots.get(this.segment(), 0L, 0L); }
    public int maxActiveReferencePictures() { return (int) VH_maxActiveReferencePictures.get(this.segment(), 0L, 0L); }
    public byte stdHeaderVersion$extensionName(long index0) { return (byte) VH_stdHeaderVersion$extensionName.get(this.segment(), 0L, 0L, index0); }
    public int stdHeaderVersion$specVersion() { return (int) VH_stdHeaderVersion$specVersion.get(this.segment(), 0L, 0L); }
    public VkVideoCapabilitiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR minBitstreamBufferOffsetAlignmentAt(long index, long value) { VH_minBitstreamBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR minBitstreamBufferSizeAlignmentAt(long index, long value) { VH_minBitstreamBufferSizeAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR pictureAccessGranularity$widthAt(long index, int value) { VH_pictureAccessGranularity$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR pictureAccessGranularity$heightAt(long index, int value) { VH_pictureAccessGranularity$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR minCodedExtent$widthAt(long index, int value) { VH_minCodedExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR minCodedExtent$heightAt(long index, int value) { VH_minCodedExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR maxCodedExtent$widthAt(long index, int value) { VH_maxCodedExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR maxCodedExtent$heightAt(long index, int value) { VH_maxCodedExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR maxDpbSlotsAt(long index, int value) { VH_maxDpbSlots.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR maxActiveReferencePicturesAt(long index, int value) { VH_maxActiveReferencePictures.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR stdHeaderVersion$extensionNameAt(long index, long index0, byte value) { VH_stdHeaderVersion$extensionName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkVideoCapabilitiesKHR stdHeaderVersion$specVersionAt(long index, int value) { VH_stdHeaderVersion$specVersion.set(this.segment(), 0L, index, value); return this; }
    public VkVideoCapabilitiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR minBitstreamBufferOffsetAlignment(long value) { VH_minBitstreamBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR minBitstreamBufferSizeAlignment(long value) { VH_minBitstreamBufferSizeAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR pictureAccessGranularity$width(int value) { VH_pictureAccessGranularity$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR pictureAccessGranularity$height(int value) { VH_pictureAccessGranularity$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR minCodedExtent$width(int value) { VH_minCodedExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR minCodedExtent$height(int value) { VH_minCodedExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR maxCodedExtent$width(int value) { VH_maxCodedExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR maxCodedExtent$height(int value) { VH_maxCodedExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR maxDpbSlots(int value) { VH_maxDpbSlots.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR maxActiveReferencePictures(int value) { VH_maxActiveReferencePictures.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoCapabilitiesKHR stdHeaderVersion$extensionName(long index0, byte value) { VH_stdHeaderVersion$extensionName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkVideoCapabilitiesKHR stdHeaderVersion$specVersion(int value) { VH_stdHeaderVersion$specVersion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoCapabilitiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoCapabilitiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoCapabilitiesKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _minBitstreamBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minBitstreamBufferOffsetAlignment, index), LAYOUT_minBitstreamBufferOffsetAlignment); }
    public MemorySegment _minBitstreamBufferOffsetAlignment() { return _minBitstreamBufferOffsetAlignmentAt(0L); }
    public VkVideoCapabilitiesKHR _minBitstreamBufferOffsetAlignmentAt(long index, MemorySegment src) { _minBitstreamBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _minBitstreamBufferOffsetAlignment(MemorySegment src) { return _minBitstreamBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _minBitstreamBufferSizeAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minBitstreamBufferSizeAlignment, index), LAYOUT_minBitstreamBufferSizeAlignment); }
    public MemorySegment _minBitstreamBufferSizeAlignment() { return _minBitstreamBufferSizeAlignmentAt(0L); }
    public VkVideoCapabilitiesKHR _minBitstreamBufferSizeAlignmentAt(long index, MemorySegment src) { _minBitstreamBufferSizeAlignmentAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _minBitstreamBufferSizeAlignment(MemorySegment src) { return _minBitstreamBufferSizeAlignmentAt(0L, src); }
    public MemorySegment _pictureAccessGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pictureAccessGranularity, index), LAYOUT_pictureAccessGranularity); }
    public MemorySegment _pictureAccessGranularity() { return _pictureAccessGranularityAt(0L); }
    public VkVideoCapabilitiesKHR _pictureAccessGranularityAt(long index, MemorySegment src) { _pictureAccessGranularityAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _pictureAccessGranularity(MemorySegment src) { return _pictureAccessGranularityAt(0L, src); }
    public MemorySegment _minCodedExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minCodedExtent, index), LAYOUT_minCodedExtent); }
    public MemorySegment _minCodedExtent() { return _minCodedExtentAt(0L); }
    public VkVideoCapabilitiesKHR _minCodedExtentAt(long index, MemorySegment src) { _minCodedExtentAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _minCodedExtent(MemorySegment src) { return _minCodedExtentAt(0L, src); }
    public MemorySegment _maxCodedExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCodedExtent, index), LAYOUT_maxCodedExtent); }
    public MemorySegment _maxCodedExtent() { return _maxCodedExtentAt(0L); }
    public VkVideoCapabilitiesKHR _maxCodedExtentAt(long index, MemorySegment src) { _maxCodedExtentAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _maxCodedExtent(MemorySegment src) { return _maxCodedExtentAt(0L, src); }
    public MemorySegment _maxDpbSlotsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDpbSlots, index), LAYOUT_maxDpbSlots); }
    public MemorySegment _maxDpbSlots() { return _maxDpbSlotsAt(0L); }
    public VkVideoCapabilitiesKHR _maxDpbSlotsAt(long index, MemorySegment src) { _maxDpbSlotsAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _maxDpbSlots(MemorySegment src) { return _maxDpbSlotsAt(0L, src); }
    public MemorySegment _maxActiveReferencePicturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxActiveReferencePictures, index), LAYOUT_maxActiveReferencePictures); }
    public MemorySegment _maxActiveReferencePictures() { return _maxActiveReferencePicturesAt(0L); }
    public VkVideoCapabilitiesKHR _maxActiveReferencePicturesAt(long index, MemorySegment src) { _maxActiveReferencePicturesAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _maxActiveReferencePictures(MemorySegment src) { return _maxActiveReferencePicturesAt(0L, src); }
    public MemorySegment _stdHeaderVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stdHeaderVersion, index), LAYOUT_stdHeaderVersion); }
    public MemorySegment _stdHeaderVersion() { return _stdHeaderVersionAt(0L); }
    public VkVideoCapabilitiesKHR _stdHeaderVersionAt(long index, MemorySegment src) { _stdHeaderVersionAt(index).copyFrom(src); return this; }
    public VkVideoCapabilitiesKHR _stdHeaderVersion(MemorySegment src) { return _stdHeaderVersionAt(0L, src); }
}
