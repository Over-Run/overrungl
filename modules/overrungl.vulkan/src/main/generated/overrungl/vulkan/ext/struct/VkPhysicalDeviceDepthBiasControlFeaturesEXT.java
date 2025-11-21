// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDepthBiasControlFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDepthBiasControlFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 depthBiasControl;
///     VkBool32 leastRepresentableValueForceUnormRepresentation;
///     VkBool32 floatRepresentation;
///     VkBool32 depthBiasExact;
/// }
/// ```
public final class VkPhysicalDeviceDepthBiasControlFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasControl"),
        ValueLayout.JAVA_INT.withName("leastRepresentableValueForceUnormRepresentation"),
        ValueLayout.JAVA_INT.withName("floatRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthBiasControl = LAYOUT.byteOffset(PathElement.groupElement("depthBiasControl"));
    public static final long OFFSET_leastRepresentableValueForceUnormRepresentation = LAYOUT.byteOffset(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    public static final long OFFSET_floatRepresentation = LAYOUT.byteOffset(PathElement.groupElement("floatRepresentation"));
    public static final long OFFSET_depthBiasExact = LAYOUT.byteOffset(PathElement.groupElement("depthBiasExact"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthBiasControl = LAYOUT.select(PathElement.groupElement("depthBiasControl"));
    public static final MemoryLayout LAYOUT_leastRepresentableValueForceUnormRepresentation = LAYOUT.select(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    public static final MemoryLayout LAYOUT_floatRepresentation = LAYOUT.select(PathElement.groupElement("floatRepresentation"));
    public static final MemoryLayout LAYOUT_depthBiasExact = LAYOUT.select(PathElement.groupElement("depthBiasExact"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthBiasControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasControl"));
    public static final VarHandle VH_leastRepresentableValueForceUnormRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("leastRepresentableValueForceUnormRepresentation"));
    public static final VarHandle VH_floatRepresentation = LAYOUT.arrayElementVarHandle(PathElement.groupElement("floatRepresentation"));
    public static final VarHandle VH_depthBiasExact = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthBiasExact"));

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthBiasControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT); }
    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthBiasControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT copyFrom(VkPhysicalDeviceDepthBiasControlFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDepthBiasControlFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthBiasControlAt(long index) { return (int) VH_depthBiasControl.get(this.segment(), 0L, index); }
    public int leastRepresentableValueForceUnormRepresentationAt(long index) { return (int) VH_leastRepresentableValueForceUnormRepresentation.get(this.segment(), 0L, index); }
    public int floatRepresentationAt(long index) { return (int) VH_floatRepresentation.get(this.segment(), 0L, index); }
    public int depthBiasExactAt(long index) { return (int) VH_depthBiasExact.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthBiasControl() { return (int) VH_depthBiasControl.get(this.segment(), 0L, 0L); }
    public int leastRepresentableValueForceUnormRepresentation() { return (int) VH_leastRepresentableValueForceUnormRepresentation.get(this.segment(), 0L, 0L); }
    public int floatRepresentation() { return (int) VH_floatRepresentation.get(this.segment(), 0L, 0L); }
    public int depthBiasExact() { return (int) VH_depthBiasExact.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControlAt(long index, int value) { VH_depthBiasControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentationAt(long index, int value) { VH_leastRepresentableValueForceUnormRepresentation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentationAt(long index, int value) { VH_floatRepresentation.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExactAt(long index, int value) { VH_depthBiasExact.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControl(int value) { VH_depthBiasControl.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentation(int value) { VH_leastRepresentableValueForceUnormRepresentation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentation(int value) { VH_floatRepresentation.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExact(int value) { VH_depthBiasExact.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthBiasControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasControl, index), LAYOUT_depthBiasControl); }
    public MemorySegment _depthBiasControl() { return _depthBiasControlAt(0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _depthBiasControlAt(long index, MemorySegment src) { _depthBiasControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _depthBiasControl(MemorySegment src) { return _depthBiasControlAt(0L, src); }
    public MemorySegment _leastRepresentableValueForceUnormRepresentationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_leastRepresentableValueForceUnormRepresentation, index), LAYOUT_leastRepresentableValueForceUnormRepresentation); }
    public MemorySegment _leastRepresentableValueForceUnormRepresentation() { return _leastRepresentableValueForceUnormRepresentationAt(0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _leastRepresentableValueForceUnormRepresentationAt(long index, MemorySegment src) { _leastRepresentableValueForceUnormRepresentationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _leastRepresentableValueForceUnormRepresentation(MemorySegment src) { return _leastRepresentableValueForceUnormRepresentationAt(0L, src); }
    public MemorySegment _floatRepresentationAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_floatRepresentation, index), LAYOUT_floatRepresentation); }
    public MemorySegment _floatRepresentation() { return _floatRepresentationAt(0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _floatRepresentationAt(long index, MemorySegment src) { _floatRepresentationAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _floatRepresentation(MemorySegment src) { return _floatRepresentationAt(0L, src); }
    public MemorySegment _depthBiasExactAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthBiasExact, index), LAYOUT_depthBiasExact); }
    public MemorySegment _depthBiasExact() { return _depthBiasExactAt(0L); }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _depthBiasExactAt(long index, MemorySegment src) { _depthBiasExactAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT _depthBiasExact(MemorySegment src) { return _depthBiasExactAt(0L, src); }
}
