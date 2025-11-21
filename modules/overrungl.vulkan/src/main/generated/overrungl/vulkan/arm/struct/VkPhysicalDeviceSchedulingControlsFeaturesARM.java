// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSchedulingControlsFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSchedulingControlsFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 schedulingControls;
/// }
/// ```
public final class VkPhysicalDeviceSchedulingControlsFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("schedulingControls")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_schedulingControls = LAYOUT.byteOffset(PathElement.groupElement("schedulingControls"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_schedulingControls = LAYOUT.select(PathElement.groupElement("schedulingControls"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_schedulingControls = LAYOUT.arrayElementVarHandle(PathElement.groupElement("schedulingControls"));

    public VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM); }
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM copyFrom(VkPhysicalDeviceSchedulingControlsFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM asSlice(long index) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM at(long index, Consumer<VkPhysicalDeviceSchedulingControlsFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int schedulingControlsAt(long index) { return (int) VH_schedulingControls.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int schedulingControls() { return (int) VH_schedulingControls.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControlsAt(long index, int value) { VH_schedulingControls.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControls(int value) { VH_schedulingControls.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _schedulingControlsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_schedulingControls, index), LAYOUT_schedulingControls); }
    public MemorySegment _schedulingControls() { return _schedulingControlsAt(0L); }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM _schedulingControlsAt(long index, MemorySegment src) { _schedulingControlsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceSchedulingControlsFeaturesARM _schedulingControls(MemorySegment src) { return _schedulingControlsAt(0L, src); }
}
