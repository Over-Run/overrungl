// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.qcom.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceYcbcrDegammaFeaturesQCOM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceYcbcrDegammaFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 ycbcrDegamma;
/// }
/// ```
public final class VkPhysicalDeviceYcbcrDegammaFeaturesQCOM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcrDegamma")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_ycbcrDegamma = LAYOUT.byteOffset(PathElement.groupElement("ycbcrDegamma"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_ycbcrDegamma = LAYOUT.select(PathElement.groupElement("ycbcrDegamma"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_ycbcrDegamma = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycbcrDegamma"));

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.qcom.VKQCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM); }
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.qcom.VKQCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM);
        return s;
    }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM copyFrom(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM reinterpret(long count) { return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM at(long index, Consumer<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int ycbcrDegammaAt(long index) { return (int) VH_ycbcrDegamma.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int ycbcrDegamma() { return (int) VH_ycbcrDegamma.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ycbcrDegammaAt(long index, int value) { VH_ycbcrDegamma.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ycbcrDegamma(int value) { VH_ycbcrDegamma.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _ycbcrDegammaAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_ycbcrDegamma, index), LAYOUT_ycbcrDegamma); }
    public MemorySegment _ycbcrDegamma() { return _ycbcrDegammaAt(0L); }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM _ycbcrDegammaAt(long index, MemorySegment src) { _ycbcrDegammaAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM _ycbcrDegamma(MemorySegment src) { return _ycbcrDegammaAt(0L, src); }
}
