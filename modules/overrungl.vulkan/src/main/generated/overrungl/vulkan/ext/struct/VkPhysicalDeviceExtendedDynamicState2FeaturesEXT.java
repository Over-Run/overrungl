// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceExtendedDynamicState2FeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 extendedDynamicState2;
///     VkBool32 extendedDynamicState2LogicOp;
///     VkBool32 extendedDynamicState2PatchControlPoints;
/// }
/// ```
public final class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_extendedDynamicState2 = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2"));
    public static final long OFFSET_extendedDynamicState2LogicOp = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2LogicOp"));
    public static final long OFFSET_extendedDynamicState2PatchControlPoints = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_extendedDynamicState2 = LAYOUT.select(PathElement.groupElement("extendedDynamicState2"));
    public static final MemoryLayout LAYOUT_extendedDynamicState2LogicOp = LAYOUT.select(PathElement.groupElement("extendedDynamicState2LogicOp"));
    public static final MemoryLayout LAYOUT_extendedDynamicState2PatchControlPoints = LAYOUT.select(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_extendedDynamicState2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2"));
    public static final VarHandle VH_extendedDynamicState2LogicOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2LogicOp"));
    public static final VarHandle VH_extendedDynamicState2PatchControlPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extendedDynamicState2PatchControlPoints"));

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTExtendedDynamicState2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT); }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTExtendedDynamicState2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT copyFrom(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT asSlice(long index) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT at(long index, Consumer<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int extendedDynamicState2At(long index) { return (int) VH_extendedDynamicState2.get(this.segment(), 0L, index); }
    public int extendedDynamicState2LogicOpAt(long index) { return (int) VH_extendedDynamicState2LogicOp.get(this.segment(), 0L, index); }
    public int extendedDynamicState2PatchControlPointsAt(long index) { return (int) VH_extendedDynamicState2PatchControlPoints.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState2() { return (int) VH_extendedDynamicState2.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState2LogicOp() { return (int) VH_extendedDynamicState2LogicOp.get(this.segment(), 0L, 0L); }
    public int extendedDynamicState2PatchControlPoints() { return (int) VH_extendedDynamicState2PatchControlPoints.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2At(long index, int value) { VH_extendedDynamicState2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOpAt(long index, int value) { VH_extendedDynamicState2LogicOp.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPointsAt(long index, int value) { VH_extendedDynamicState2PatchControlPoints.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(int value) { VH_extendedDynamicState2.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(int value) { VH_extendedDynamicState2LogicOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(int value) { VH_extendedDynamicState2PatchControlPoints.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _extendedDynamicState2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState2, index), LAYOUT_extendedDynamicState2); }
    public MemorySegment _extendedDynamicState2() { return _extendedDynamicState2At(0L); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _extendedDynamicState2At(long index, MemorySegment src) { _extendedDynamicState2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _extendedDynamicState2(MemorySegment src) { return _extendedDynamicState2At(0L, src); }
    public MemorySegment _extendedDynamicState2LogicOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState2LogicOp, index), LAYOUT_extendedDynamicState2LogicOp); }
    public MemorySegment _extendedDynamicState2LogicOp() { return _extendedDynamicState2LogicOpAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _extendedDynamicState2LogicOpAt(long index, MemorySegment src) { _extendedDynamicState2LogicOpAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _extendedDynamicState2LogicOp(MemorySegment src) { return _extendedDynamicState2LogicOpAt(0L, src); }
    public MemorySegment _extendedDynamicState2PatchControlPointsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_extendedDynamicState2PatchControlPoints, index), LAYOUT_extendedDynamicState2PatchControlPoints); }
    public MemorySegment _extendedDynamicState2PatchControlPoints() { return _extendedDynamicState2PatchControlPointsAt(0L); }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _extendedDynamicState2PatchControlPointsAt(long index, MemorySegment src) { _extendedDynamicState2PatchControlPointsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT _extendedDynamicState2PatchControlPoints(MemorySegment src) { return _extendedDynamicState2PatchControlPointsAt(0L, src); }
}
