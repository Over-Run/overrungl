// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceGeneratedCommands;
/// }
/// ```
public final class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCommands")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_deviceGeneratedCommands = LAYOUT.byteOffset(PathElement.groupElement("deviceGeneratedCommands"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_deviceGeneratedCommands = LAYOUT.select(PathElement.groupElement("deviceGeneratedCommands"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_deviceGeneratedCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceGeneratedCommands"));

    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV); }
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV copyFrom(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV at(long index, Consumer<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int deviceGeneratedCommandsAt(long index) { return (int) VH_deviceGeneratedCommands.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int deviceGeneratedCommands() { return (int) VH_deviceGeneratedCommands.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV deviceGeneratedCommandsAt(long index, int value) { VH_deviceGeneratedCommands.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV deviceGeneratedCommands(int value) { VH_deviceGeneratedCommands.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _deviceGeneratedCommandsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceGeneratedCommands, index), LAYOUT_deviceGeneratedCommands); }
    public MemorySegment _deviceGeneratedCommands() { return _deviceGeneratedCommandsAt(0L); }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV _deviceGeneratedCommandsAt(long index, MemorySegment src) { _deviceGeneratedCommandsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV _deviceGeneratedCommands(MemorySegment src) { return _deviceGeneratedCommandsAt(0L, src); }
}
