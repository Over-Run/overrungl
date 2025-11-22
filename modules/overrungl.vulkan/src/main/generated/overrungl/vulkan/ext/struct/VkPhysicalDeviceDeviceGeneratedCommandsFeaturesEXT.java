// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceGeneratedCommands;
///     VkBool32 dynamicGeneratedPipelineLayout;
/// }
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommands"),
        ValueLayout.JAVA_INT.withName("dynamicGeneratedPipelineLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceGeneratedCommands = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommands"));
    public static final long OFFSET_dynamicGeneratedPipelineLayout = LAYOUT.byteOffset(PathElement.groupElement("dynamicGeneratedPipelineLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceGeneratedCommands = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommands"));
    public static final MemoryLayout LAYOUT_dynamicGeneratedPipelineLayout = LAYOUT.select(PathElement.groupElement("dynamicGeneratedPipelineLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceGeneratedCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommands"));
    public static final VarHandle VH_dynamicGeneratedPipelineLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicGeneratedPipelineLayout"));

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceGeneratedCommandsAt(long index) { return (int) VH_deviceGeneratedCommands.get(this.segment(), 0L, index); }
    public int dynamicGeneratedPipelineLayoutAt(long index) { return (int) VH_dynamicGeneratedPipelineLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedCommands() { return (int) VH_deviceGeneratedCommands.get(this.segment(), 0L, 0L); }
    public int dynamicGeneratedPipelineLayout() { return (int) VH_dynamicGeneratedPipelineLayout.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommandsAt(long index, int value) { VH_deviceGeneratedCommands.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayoutAt(long index, int value) { VH_dynamicGeneratedPipelineLayout.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommands(int value) { VH_deviceGeneratedCommands.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayout(int value) { VH_dynamicGeneratedPipelineLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceGeneratedCommandsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedCommands, index), LAYOUT_deviceGeneratedCommands); }
    public MemorySegment _deviceGeneratedCommands() { return _deviceGeneratedCommandsAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _deviceGeneratedCommandsAt(long index, MemorySegment src) { _deviceGeneratedCommandsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _deviceGeneratedCommands(MemorySegment src) { return _deviceGeneratedCommandsAt(0L, src); }
    public MemorySegment _dynamicGeneratedPipelineLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicGeneratedPipelineLayout, index), LAYOUT_dynamicGeneratedPipelineLayout); }
    public MemorySegment _dynamicGeneratedPipelineLayout() { return _dynamicGeneratedPipelineLayoutAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _dynamicGeneratedPipelineLayoutAt(long index, MemorySegment src) { _dynamicGeneratedPipelineLayoutAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT _dynamicGeneratedPipelineLayout(MemorySegment src) { return _dynamicGeneratedPipelineLayoutAt(0L, src); }
}
