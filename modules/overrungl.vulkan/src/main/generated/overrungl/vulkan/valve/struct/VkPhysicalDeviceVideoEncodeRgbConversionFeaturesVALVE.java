// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 videoEncodeRgbConversion;
/// }
/// ```
public final class VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoEncodeRgbConversion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_videoEncodeRgbConversion = LAYOUT.byteOffset(PathElement.groupElement("videoEncodeRgbConversion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_videoEncodeRgbConversion = LAYOUT.select(PathElement.groupElement("videoEncodeRgbConversion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_videoEncodeRgbConversion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoEncodeRgbConversion"));

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_RGB_CONVERSION_FEATURES_VALVE); }
    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.valve.VKVALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_RGB_CONVERSION_FEATURES_VALVE);
        return s;
    }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE copyFrom(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE reinterpret(long count) { return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE asSlice(long index) { return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE asSlice(long index, long count) { return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE at(long index, Consumer<VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int videoEncodeRgbConversionAt(long index) { return (int) VH_videoEncodeRgbConversion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int videoEncodeRgbConversion() { return (int) VH_videoEncodeRgbConversion.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE videoEncodeRgbConversionAt(long index, int value) { VH_videoEncodeRgbConversion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE videoEncodeRgbConversion(int value) { VH_videoEncodeRgbConversion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _videoEncodeRgbConversionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_videoEncodeRgbConversion, index), LAYOUT_videoEncodeRgbConversion); }
    public MemorySegment _videoEncodeRgbConversion() { return _videoEncodeRgbConversionAt(0L); }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE _videoEncodeRgbConversionAt(long index, MemorySegment src) { _videoEncodeRgbConversionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE _videoEncodeRgbConversion(MemorySegment src) { return _videoEncodeRgbConversionAt(0L, src); }
}
