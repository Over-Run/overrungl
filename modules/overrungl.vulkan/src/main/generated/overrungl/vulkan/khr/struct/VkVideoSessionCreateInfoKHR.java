// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoSessionCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoSessionCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t queueFamilyIndex;
///     VkVideoSessionCreateFlagsKHR flags;
///     const VkVideoProfileInfoKHR* pVideoProfile;
///     VkFormat pictureFormat;
///     VkExtent2D maxCodedExtent;
///     VkFormat referencePictureFormat;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     const VkExtensionProperties* pStdHeaderVersion;
/// }
/// ```
public final class VkVideoSessionCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("pictureFormat"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxCodedExtent"),
        ValueLayout.JAVA_INT.withName("referencePictureFormat"),
        ValueLayout.JAVA_INT.withName("maxDpbSlots"),
        ValueLayout.JAVA_INT.withName("maxActiveReferencePictures"),
        ValueLayout.ADDRESS.withName("pStdHeaderVersion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_queueFamilyIndex = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndex"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_pVideoProfile = LAYOUT.byteOffset(PathElement.groupElement("pVideoProfile"));
    public static final long OFFSET_pictureFormat = LAYOUT.byteOffset(PathElement.groupElement("pictureFormat"));
    public static final long OFFSET_maxCodedExtent = LAYOUT.byteOffset(PathElement.groupElement("maxCodedExtent"));
    public static final long OFFSET_referencePictureFormat = LAYOUT.byteOffset(PathElement.groupElement("referencePictureFormat"));
    public static final long OFFSET_maxDpbSlots = LAYOUT.byteOffset(PathElement.groupElement("maxDpbSlots"));
    public static final long OFFSET_maxActiveReferencePictures = LAYOUT.byteOffset(PathElement.groupElement("maxActiveReferencePictures"));
    public static final long OFFSET_pStdHeaderVersion = LAYOUT.byteOffset(PathElement.groupElement("pStdHeaderVersion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_queueFamilyIndex = LAYOUT.select(PathElement.groupElement("queueFamilyIndex"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_pVideoProfile = LAYOUT.select(PathElement.groupElement("pVideoProfile"));
    public static final MemoryLayout LAYOUT_pictureFormat = LAYOUT.select(PathElement.groupElement("pictureFormat"));
    public static final MemoryLayout LAYOUT_maxCodedExtent = LAYOUT.select(PathElement.groupElement("maxCodedExtent"));
    public static final MemoryLayout LAYOUT_referencePictureFormat = LAYOUT.select(PathElement.groupElement("referencePictureFormat"));
    public static final MemoryLayout LAYOUT_maxDpbSlots = LAYOUT.select(PathElement.groupElement("maxDpbSlots"));
    public static final MemoryLayout LAYOUT_maxActiveReferencePictures = LAYOUT.select(PathElement.groupElement("maxActiveReferencePictures"));
    public static final MemoryLayout LAYOUT_pStdHeaderVersion = LAYOUT.select(PathElement.groupElement("pStdHeaderVersion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_queueFamilyIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndex"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_pVideoProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVideoProfile"));
    public static final VarHandle VH_pictureFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pictureFormat"));
    public static final VarHandle VH_maxCodedExtent$width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCodedExtent"), PathElement.groupElement("width"));
    public static final VarHandle VH_maxCodedExtent$height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCodedExtent"), PathElement.groupElement("height"));
    public static final VarHandle VH_referencePictureFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referencePictureFormat"));
    public static final VarHandle VH_maxDpbSlots = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDpbSlots"));
    public static final VarHandle VH_maxActiveReferencePictures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxActiveReferencePictures"));
    public static final VarHandle VH_pStdHeaderVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdHeaderVersion"));

    public VkVideoSessionCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkVideoSessionCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkVideoSessionCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkVideoSessionCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkVideoSessionCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkVideoSessionCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkVideoSessionCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR); }
    public static VkVideoSessionCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR);
        return s;
    }
    public VkVideoSessionCreateInfoKHR copyFrom(VkVideoSessionCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkVideoSessionCreateInfoKHR reinterpret(long count) { return new VkVideoSessionCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkVideoSessionCreateInfoKHR asSlice(long index) { return new VkVideoSessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkVideoSessionCreateInfoKHR asSlice(long index, long count) { return new VkVideoSessionCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkVideoSessionCreateInfoKHR at(long index, Consumer<VkVideoSessionCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int queueFamilyIndexAt(long index) { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public MemorySegment pVideoProfileAt(long index) { return (MemorySegment) VH_pVideoProfile.get(this.segment(), 0L, index); }
    public int pictureFormatAt(long index) { return (int) VH_pictureFormat.get(this.segment(), 0L, index); }
    public int maxCodedExtent$widthAt(long index) { return (int) VH_maxCodedExtent$width.get(this.segment(), 0L, index); }
    public int maxCodedExtent$heightAt(long index) { return (int) VH_maxCodedExtent$height.get(this.segment(), 0L, index); }
    public int referencePictureFormatAt(long index) { return (int) VH_referencePictureFormat.get(this.segment(), 0L, index); }
    public int maxDpbSlotsAt(long index) { return (int) VH_maxDpbSlots.get(this.segment(), 0L, index); }
    public int maxActiveReferencePicturesAt(long index) { return (int) VH_maxActiveReferencePictures.get(this.segment(), 0L, index); }
    public MemorySegment pStdHeaderVersionAt(long index) { return (MemorySegment) VH_pStdHeaderVersion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int queueFamilyIndex() { return (int) VH_queueFamilyIndex.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public MemorySegment pVideoProfile() { return (MemorySegment) VH_pVideoProfile.get(this.segment(), 0L, 0L); }
    public int pictureFormat() { return (int) VH_pictureFormat.get(this.segment(), 0L, 0L); }
    public int maxCodedExtent$width() { return (int) VH_maxCodedExtent$width.get(this.segment(), 0L, 0L); }
    public int maxCodedExtent$height() { return (int) VH_maxCodedExtent$height.get(this.segment(), 0L, 0L); }
    public int referencePictureFormat() { return (int) VH_referencePictureFormat.get(this.segment(), 0L, 0L); }
    public int maxDpbSlots() { return (int) VH_maxDpbSlots.get(this.segment(), 0L, 0L); }
    public int maxActiveReferencePictures() { return (int) VH_maxActiveReferencePictures.get(this.segment(), 0L, 0L); }
    public MemorySegment pStdHeaderVersion() { return (MemorySegment) VH_pStdHeaderVersion.get(this.segment(), 0L, 0L); }
    public VkVideoSessionCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR queueFamilyIndexAt(long index, int value) { VH_queueFamilyIndex.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR pVideoProfileAt(long index, MemorySegment value) { VH_pVideoProfile.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR pictureFormatAt(long index, int value) { VH_pictureFormat.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR maxCodedExtent$widthAt(long index, int value) { VH_maxCodedExtent$width.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR maxCodedExtent$heightAt(long index, int value) { VH_maxCodedExtent$height.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR referencePictureFormatAt(long index, int value) { VH_referencePictureFormat.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR maxDpbSlotsAt(long index, int value) { VH_maxDpbSlots.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR maxActiveReferencePicturesAt(long index, int value) { VH_maxActiveReferencePictures.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR pStdHeaderVersionAt(long index, MemorySegment value) { VH_pStdHeaderVersion.set(this.segment(), 0L, index, value); return this; }
    public VkVideoSessionCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR queueFamilyIndex(int value) { VH_queueFamilyIndex.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR pVideoProfile(MemorySegment value) { VH_pVideoProfile.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR pictureFormat(int value) { VH_pictureFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR maxCodedExtent$width(int value) { VH_maxCodedExtent$width.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR maxCodedExtent$height(int value) { VH_maxCodedExtent$height.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR referencePictureFormat(int value) { VH_referencePictureFormat.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR maxDpbSlots(int value) { VH_maxDpbSlots.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(int value) { VH_maxActiveReferencePictures.set(this.segment(), 0L, 0L, value); return this; }
    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(MemorySegment value) { VH_pStdHeaderVersion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkVideoSessionCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkVideoSessionCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _queueFamilyIndexAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_queueFamilyIndex, index), LAYOUT_queueFamilyIndex); }
    public MemorySegment _queueFamilyIndex() { return _queueFamilyIndexAt(0L); }
    public VkVideoSessionCreateInfoKHR _queueFamilyIndexAt(long index, MemorySegment src) { _queueFamilyIndexAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _queueFamilyIndex(MemorySegment src) { return _queueFamilyIndexAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkVideoSessionCreateInfoKHR _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _pVideoProfileAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pVideoProfile, index), LAYOUT_pVideoProfile); }
    public MemorySegment _pVideoProfile() { return _pVideoProfileAt(0L); }
    public VkVideoSessionCreateInfoKHR _pVideoProfileAt(long index, MemorySegment src) { _pVideoProfileAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _pVideoProfile(MemorySegment src) { return _pVideoProfileAt(0L, src); }
    public MemorySegment _pictureFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pictureFormat, index), LAYOUT_pictureFormat); }
    public MemorySegment _pictureFormat() { return _pictureFormatAt(0L); }
    public VkVideoSessionCreateInfoKHR _pictureFormatAt(long index, MemorySegment src) { _pictureFormatAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _pictureFormat(MemorySegment src) { return _pictureFormatAt(0L, src); }
    public MemorySegment _maxCodedExtentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCodedExtent, index), LAYOUT_maxCodedExtent); }
    public MemorySegment _maxCodedExtent() { return _maxCodedExtentAt(0L); }
    public VkVideoSessionCreateInfoKHR _maxCodedExtentAt(long index, MemorySegment src) { _maxCodedExtentAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _maxCodedExtent(MemorySegment src) { return _maxCodedExtentAt(0L, src); }
    public MemorySegment _referencePictureFormatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_referencePictureFormat, index), LAYOUT_referencePictureFormat); }
    public MemorySegment _referencePictureFormat() { return _referencePictureFormatAt(0L); }
    public VkVideoSessionCreateInfoKHR _referencePictureFormatAt(long index, MemorySegment src) { _referencePictureFormatAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _referencePictureFormat(MemorySegment src) { return _referencePictureFormatAt(0L, src); }
    public MemorySegment _maxDpbSlotsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDpbSlots, index), LAYOUT_maxDpbSlots); }
    public MemorySegment _maxDpbSlots() { return _maxDpbSlotsAt(0L); }
    public VkVideoSessionCreateInfoKHR _maxDpbSlotsAt(long index, MemorySegment src) { _maxDpbSlotsAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _maxDpbSlots(MemorySegment src) { return _maxDpbSlotsAt(0L, src); }
    public MemorySegment _maxActiveReferencePicturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxActiveReferencePictures, index), LAYOUT_maxActiveReferencePictures); }
    public MemorySegment _maxActiveReferencePictures() { return _maxActiveReferencePicturesAt(0L); }
    public VkVideoSessionCreateInfoKHR _maxActiveReferencePicturesAt(long index, MemorySegment src) { _maxActiveReferencePicturesAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _maxActiveReferencePictures(MemorySegment src) { return _maxActiveReferencePicturesAt(0L, src); }
    public MemorySegment _pStdHeaderVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pStdHeaderVersion, index), LAYOUT_pStdHeaderVersion); }
    public MemorySegment _pStdHeaderVersion() { return _pStdHeaderVersionAt(0L); }
    public VkVideoSessionCreateInfoKHR _pStdHeaderVersionAt(long index, MemorySegment src) { _pStdHeaderVersionAt(index).copyFrom(src); return this; }
    public VkVideoSessionCreateInfoKHR _pStdHeaderVersion(MemorySegment src) { return _pStdHeaderVersionAt(0L, src); }
}
