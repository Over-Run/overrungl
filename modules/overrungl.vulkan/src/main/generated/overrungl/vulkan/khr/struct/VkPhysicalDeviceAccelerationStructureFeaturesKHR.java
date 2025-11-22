// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceAccelerationStructureFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 accelerationStructure;
///     VkBool32 accelerationStructureCaptureReplay;
///     VkBool32 accelerationStructureIndirectBuild;
///     VkBool32 accelerationStructureHostCommands;
///     VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
/// }
/// ```
public final class VkPhysicalDeviceAccelerationStructureFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructure"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay"),
        ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild"),
        ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands"),
        ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_accelerationStructure = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
    public static final long OFFSET_accelerationStructureCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCaptureReplay"));
    public static final long OFFSET_accelerationStructureIndirectBuild = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureIndirectBuild"));
    public static final long OFFSET_accelerationStructureHostCommands = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureHostCommands"));
    public static final long OFFSET_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_accelerationStructure = LAYOUT.select(PathElement.groupElement("accelerationStructure"));
    public static final MemoryLayout LAYOUT_accelerationStructureCaptureReplay = LAYOUT.select(PathElement.groupElement("accelerationStructureCaptureReplay"));
    public static final MemoryLayout LAYOUT_accelerationStructureIndirectBuild = LAYOUT.select(PathElement.groupElement("accelerationStructureIndirectBuild"));
    public static final MemoryLayout LAYOUT_accelerationStructureHostCommands = LAYOUT.select(PathElement.groupElement("accelerationStructureHostCommands"));
    public static final MemoryLayout LAYOUT_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.select(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_accelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructure"));
    public static final VarHandle VH_accelerationStructureCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureCaptureReplay"));
    public static final VarHandle VH_accelerationStructureIndirectBuild = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureIndirectBuild"));
    public static final VarHandle VH_accelerationStructureHostCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureHostCommands"));
    public static final VarHandle VH_descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind"));

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR); }
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR copyFrom(VkPhysicalDeviceAccelerationStructureFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR at(long index, Consumer<VkPhysicalDeviceAccelerationStructureFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int accelerationStructureAt(long index) { return (int) VH_accelerationStructure.get(this.segment(), 0L, index); }
    public int accelerationStructureCaptureReplayAt(long index) { return (int) VH_accelerationStructureCaptureReplay.get(this.segment(), 0L, index); }
    public int accelerationStructureIndirectBuildAt(long index) { return (int) VH_accelerationStructureIndirectBuild.get(this.segment(), 0L, index); }
    public int accelerationStructureHostCommandsAt(long index) { return (int) VH_accelerationStructureHostCommands.get(this.segment(), 0L, index); }
    public int descriptorBindingAccelerationStructureUpdateAfterBindAt(long index) { return (int) VH_descriptorBindingAccelerationStructureUpdateAfterBind.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int accelerationStructure() { return (int) VH_accelerationStructure.get(this.segment(), 0L, 0L); }
    public int accelerationStructureCaptureReplay() { return (int) VH_accelerationStructureCaptureReplay.get(this.segment(), 0L, 0L); }
    public int accelerationStructureIndirectBuild() { return (int) VH_accelerationStructureIndirectBuild.get(this.segment(), 0L, 0L); }
    public int accelerationStructureHostCommands() { return (int) VH_accelerationStructureHostCommands.get(this.segment(), 0L, 0L); }
    public int descriptorBindingAccelerationStructureUpdateAfterBind() { return (int) VH_descriptorBindingAccelerationStructureUpdateAfterBind.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureAt(long index, int value) { VH_accelerationStructure.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplayAt(long index, int value) { VH_accelerationStructureCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuildAt(long index, int value) { VH_accelerationStructureIndirectBuild.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommandsAt(long index, int value) { VH_accelerationStructureHostCommands.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBindAt(long index, int value) { VH_descriptorBindingAccelerationStructureUpdateAfterBind.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(int value) { VH_accelerationStructure.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(int value) { VH_accelerationStructureCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(int value) { VH_accelerationStructureIndirectBuild.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(int value) { VH_accelerationStructureHostCommands.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBind(int value) { VH_descriptorBindingAccelerationStructureUpdateAfterBind.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _accelerationStructureAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructure, index), LAYOUT_accelerationStructure); }
    public MemorySegment _accelerationStructure() { return _accelerationStructureAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureAt(long index, MemorySegment src) { _accelerationStructureAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructure(MemorySegment src) { return _accelerationStructureAt(0L, src); }
    public MemorySegment _accelerationStructureCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureCaptureReplay, index), LAYOUT_accelerationStructureCaptureReplay); }
    public MemorySegment _accelerationStructureCaptureReplay() { return _accelerationStructureCaptureReplayAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureCaptureReplayAt(long index, MemorySegment src) { _accelerationStructureCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureCaptureReplay(MemorySegment src) { return _accelerationStructureCaptureReplayAt(0L, src); }
    public MemorySegment _accelerationStructureIndirectBuildAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureIndirectBuild, index), LAYOUT_accelerationStructureIndirectBuild); }
    public MemorySegment _accelerationStructureIndirectBuild() { return _accelerationStructureIndirectBuildAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureIndirectBuildAt(long index, MemorySegment src) { _accelerationStructureIndirectBuildAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureIndirectBuild(MemorySegment src) { return _accelerationStructureIndirectBuildAt(0L, src); }
    public MemorySegment _accelerationStructureHostCommandsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_accelerationStructureHostCommands, index), LAYOUT_accelerationStructureHostCommands); }
    public MemorySegment _accelerationStructureHostCommands() { return _accelerationStructureHostCommandsAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureHostCommandsAt(long index, MemorySegment src) { _accelerationStructureHostCommandsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _accelerationStructureHostCommands(MemorySegment src) { return _accelerationStructureHostCommandsAt(0L, src); }
    public MemorySegment _descriptorBindingAccelerationStructureUpdateAfterBindAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorBindingAccelerationStructureUpdateAfterBind, index), LAYOUT_descriptorBindingAccelerationStructureUpdateAfterBind); }
    public MemorySegment _descriptorBindingAccelerationStructureUpdateAfterBind() { return _descriptorBindingAccelerationStructureUpdateAfterBindAt(0L); }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _descriptorBindingAccelerationStructureUpdateAfterBindAt(long index, MemorySegment src) { _descriptorBindingAccelerationStructureUpdateAfterBindAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR _descriptorBindingAccelerationStructureUpdateAfterBind(MemorySegment src) { return _descriptorBindingAccelerationStructureUpdateAfterBindAt(0L, src); }
}
