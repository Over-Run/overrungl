// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDepthClampControlFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDepthClampControlFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 depthClampControl;
/// }
/// ```
public final class VkPhysicalDeviceDepthClampControlFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClampControl")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthClampControl = LAYOUT.byteOffset(PathElement.groupElement("depthClampControl"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthClampControl = LAYOUT.select(PathElement.groupElement("depthClampControl"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthClampControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClampControl"));

    public VkPhysicalDeviceDepthClampControlFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClampControlFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClampControlFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClampControlFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthClampControlFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthClampControlFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthClampControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT); }
    public static VkPhysicalDeviceDepthClampControlFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthClampControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_CONTROL_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT copyFrom(VkPhysicalDeviceDepthClampControlFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDepthClampControlFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDepthClampControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDepthClampControlFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDepthClampControlFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthClampControlAt(long index) { return (int) VH_depthClampControl.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthClampControl() { return (int) VH_depthClampControl.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT depthClampControlAt(long index, int value) { VH_depthClampControl.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT depthClampControl(int value) { VH_depthClampControl.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthClampControlAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClampControl, index), LAYOUT_depthClampControl); }
    public MemorySegment _depthClampControl() { return _depthClampControlAt(0L); }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT _depthClampControlAt(long index, MemorySegment src) { _depthClampControlAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClampControlFeaturesEXT _depthClampControl(MemorySegment src) { return _depthClampControlAt(0L, src); }
}
