// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentShaderSampleInterlock;
///     VkBool32 fragmentShaderPixelInterlock;
///     VkBool32 fragmentShaderShadingRateInterlock;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderSampleInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderPixelInterlock"),
        ValueLayout.JAVA_INT.withName("fragmentShaderShadingRateInterlock")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentShaderSampleInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderSampleInterlock"));
    public static final long OFFSET_fragmentShaderPixelInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderPixelInterlock"));
    public static final long OFFSET_fragmentShaderShadingRateInterlock = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderShadingRateInterlock"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentShaderSampleInterlock = LAYOUT.select(PathElement.groupElement("fragmentShaderSampleInterlock"));
    public static final MemoryLayout LAYOUT_fragmentShaderPixelInterlock = LAYOUT.select(PathElement.groupElement("fragmentShaderPixelInterlock"));
    public static final MemoryLayout LAYOUT_fragmentShaderShadingRateInterlock = LAYOUT.select(PathElement.groupElement("fragmentShaderShadingRateInterlock"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentShaderSampleInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderSampleInterlock"));
    public static final VarHandle VH_fragmentShaderPixelInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderPixelInterlock"));
    public static final VarHandle VH_fragmentShaderShadingRateInterlock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderShadingRateInterlock"));

    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTFragmentShaderInterlock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT); }
    public static VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTFragmentShaderInterlock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_INTERLOCK_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT copyFrom(VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT at(long index, Consumer<VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentShaderSampleInterlockAt(long index) { return (int) VH_fragmentShaderSampleInterlock.get(this.segment(), 0L, index); }
    public int fragmentShaderPixelInterlockAt(long index) { return (int) VH_fragmentShaderPixelInterlock.get(this.segment(), 0L, index); }
    public int fragmentShaderShadingRateInterlockAt(long index) { return (int) VH_fragmentShaderShadingRateInterlock.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentShaderSampleInterlock() { return (int) VH_fragmentShaderSampleInterlock.get(this.segment(), 0L, 0L); }
    public int fragmentShaderPixelInterlock() { return (int) VH_fragmentShaderPixelInterlock.get(this.segment(), 0L, 0L); }
    public int fragmentShaderShadingRateInterlock() { return (int) VH_fragmentShaderShadingRateInterlock.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlockAt(long index, int value) { VH_fragmentShaderSampleInterlock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlockAt(long index, int value) { VH_fragmentShaderPixelInterlock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlockAt(long index, int value) { VH_fragmentShaderShadingRateInterlock.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderSampleInterlock(int value) { VH_fragmentShaderSampleInterlock.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderPixelInterlock(int value) { VH_fragmentShaderPixelInterlock.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT fragmentShaderShadingRateInterlock(int value) { VH_fragmentShaderShadingRateInterlock.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentShaderSampleInterlockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShaderSampleInterlock, index), LAYOUT_fragmentShaderSampleInterlock); }
    public MemorySegment _fragmentShaderSampleInterlock() { return _fragmentShaderSampleInterlockAt(0L); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _fragmentShaderSampleInterlockAt(long index, MemorySegment src) { _fragmentShaderSampleInterlockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _fragmentShaderSampleInterlock(MemorySegment src) { return _fragmentShaderSampleInterlockAt(0L, src); }
    public MemorySegment _fragmentShaderPixelInterlockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShaderPixelInterlock, index), LAYOUT_fragmentShaderPixelInterlock); }
    public MemorySegment _fragmentShaderPixelInterlock() { return _fragmentShaderPixelInterlockAt(0L); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _fragmentShaderPixelInterlockAt(long index, MemorySegment src) { _fragmentShaderPixelInterlockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _fragmentShaderPixelInterlock(MemorySegment src) { return _fragmentShaderPixelInterlockAt(0L, src); }
    public MemorySegment _fragmentShaderShadingRateInterlockAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShaderShadingRateInterlock, index), LAYOUT_fragmentShaderShadingRateInterlock); }
    public MemorySegment _fragmentShaderShadingRateInterlock() { return _fragmentShaderShadingRateInterlockAt(0L); }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _fragmentShaderShadingRateInterlockAt(long index, MemorySegment src) { _fragmentShaderShadingRateInterlockAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT _fragmentShaderShadingRateInterlock(MemorySegment src) { return _fragmentShaderShadingRateInterlockAt(0L, src); }
}
