// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multisampledRenderToSingleSampled;
/// }
/// ```
public final class VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampled")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_multisampledRenderToSingleSampled = LAYOUT.byteOffset(PathElement.groupElement("multisampledRenderToSingleSampled"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_multisampledRenderToSingleSampled = LAYOUT.select(PathElement.groupElement("multisampledRenderToSingleSampled"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_multisampledRenderToSingleSampled = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multisampledRenderToSingleSampled"));

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT); }
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT copyFrom(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT at(long index, Consumer<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int multisampledRenderToSingleSampledAt(long index) { return (int) VH_multisampledRenderToSingleSampled.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int multisampledRenderToSingleSampled() { return (int) VH_multisampledRenderToSingleSampled.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT multisampledRenderToSingleSampledAt(long index, int value) { VH_multisampledRenderToSingleSampled.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT multisampledRenderToSingleSampled(int value) { VH_multisampledRenderToSingleSampled.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _multisampledRenderToSingleSampledAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_multisampledRenderToSingleSampled, index), LAYOUT_multisampledRenderToSingleSampled); }
    public MemorySegment _multisampledRenderToSingleSampled() { return _multisampledRenderToSingleSampledAt(0L); }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT _multisampledRenderToSingleSampledAt(long index, MemorySegment src) { _multisampledRenderToSingleSampledAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT _multisampledRenderToSingleSampled(MemorySegment src) { return _multisampledRenderToSingleSampledAt(0L, src); }
}
