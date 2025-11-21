// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceImageProcessing2FeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageProcessing2FeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 textureBlockMatch2;
/// }
/// ```
public final class VkPhysicalDeviceImageProcessing2FeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch2")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_textureBlockMatch2 = LAYOUT.byteOffset(PathElement.groupElement("textureBlockMatch2"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_textureBlockMatch2 = LAYOUT.select(PathElement.groupElement("textureBlockMatch2"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_textureBlockMatch2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("textureBlockMatch2"));

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM); }
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM copyFrom(VkPhysicalDeviceImageProcessing2FeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM at(long index, Consumer<VkPhysicalDeviceImageProcessing2FeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int textureBlockMatch2At(long index) { return (int) VH_textureBlockMatch2.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int textureBlockMatch2() { return (int) VH_textureBlockMatch2.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM textureBlockMatch2At(long index, int value) { VH_textureBlockMatch2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM textureBlockMatch2(int value) { VH_textureBlockMatch2.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _textureBlockMatch2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_textureBlockMatch2, index), LAYOUT_textureBlockMatch2); }
    public MemorySegment _textureBlockMatch2() { return _textureBlockMatch2At(0L); }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM _textureBlockMatch2At(long index, MemorySegment src) { _textureBlockMatch2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM _textureBlockMatch2(MemorySegment src) { return _textureBlockMatch2At(0L, src); }
}
