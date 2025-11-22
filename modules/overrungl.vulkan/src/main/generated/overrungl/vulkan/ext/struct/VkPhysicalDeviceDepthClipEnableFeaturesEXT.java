// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDepthClipEnableFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDepthClipEnableFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 depthClipEnable;
/// }
/// ```
public final class VkPhysicalDeviceDepthClipEnableFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClipEnable")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_depthClipEnable = LAYOUT.byteOffset(PathElement.groupElement("depthClipEnable"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_depthClipEnable = LAYOUT.select(PathElement.groupElement("depthClipEnable"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_depthClipEnable = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthClipEnable"));

    public VkPhysicalDeviceDepthClipEnableFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClipEnableFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClipEnableFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthClipEnableFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthClipEnableFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthClipEnableFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDepthClipEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT); }
    public static VkPhysicalDeviceDepthClipEnableFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDepthClipEnable.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT copyFrom(VkPhysicalDeviceDepthClipEnableFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDepthClipEnableFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDepthClipEnableFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDepthClipEnableFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDepthClipEnableFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int depthClipEnableAt(long index) { return (int) VH_depthClipEnable.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int depthClipEnable() { return (int) VH_depthClipEnable.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT depthClipEnableAt(long index, int value) { VH_depthClipEnable.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT depthClipEnable(int value) { VH_depthClipEnable.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _depthClipEnableAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthClipEnable, index), LAYOUT_depthClipEnable); }
    public MemorySegment _depthClipEnable() { return _depthClipEnableAt(0L); }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT _depthClipEnableAt(long index, MemorySegment src) { _depthClipEnableAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT _depthClipEnable(MemorySegment src) { return _depthClipEnableAt(0L, src); }
}
