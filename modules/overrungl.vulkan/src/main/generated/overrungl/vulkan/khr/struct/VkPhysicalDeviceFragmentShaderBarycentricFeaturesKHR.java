// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 fragmentShaderBarycentric;
/// }
/// ```
public final class VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderBarycentric")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_fragmentShaderBarycentric = LAYOUT.byteOffset(PathElement.groupElement("fragmentShaderBarycentric"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_fragmentShaderBarycentric = LAYOUT.select(PathElement.groupElement("fragmentShaderBarycentric"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_fragmentShaderBarycentric = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShaderBarycentric"));

    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR copyFrom(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR at(long index, Consumer<VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int fragmentShaderBarycentricAt(long index) { return (int) VH_fragmentShaderBarycentric.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int fragmentShaderBarycentric() { return (int) VH_fragmentShaderBarycentric.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR fragmentShaderBarycentricAt(long index, int value) { VH_fragmentShaderBarycentric.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR fragmentShaderBarycentric(int value) { VH_fragmentShaderBarycentric.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _fragmentShaderBarycentricAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShaderBarycentric, index), LAYOUT_fragmentShaderBarycentric); }
    public MemorySegment _fragmentShaderBarycentric() { return _fragmentShaderBarycentricAt(0L); }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR _fragmentShaderBarycentricAt(long index, MemorySegment src) { _fragmentShaderBarycentricAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR _fragmentShaderBarycentric(MemorySegment src) { return _fragmentShaderBarycentricAt(0L, src); }
}
