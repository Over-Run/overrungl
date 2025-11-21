// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceOpacityMicromapFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 micromap;
///     VkBool32 micromapCaptureReplay;
///     VkBool32 micromapHostCommands;
/// }
/// ```
public final class VkPhysicalDeviceOpacityMicromapFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("micromap"),
        ValueLayout.JAVA_INT.withName("micromapCaptureReplay"),
        ValueLayout.JAVA_INT.withName("micromapHostCommands")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_micromap = LAYOUT.byteOffset(PathElement.groupElement("micromap"));
    public static final long OFFSET_micromapCaptureReplay = LAYOUT.byteOffset(PathElement.groupElement("micromapCaptureReplay"));
    public static final long OFFSET_micromapHostCommands = LAYOUT.byteOffset(PathElement.groupElement("micromapHostCommands"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_micromap = LAYOUT.select(PathElement.groupElement("micromap"));
    public static final MemoryLayout LAYOUT_micromapCaptureReplay = LAYOUT.select(PathElement.groupElement("micromapCaptureReplay"));
    public static final MemoryLayout LAYOUT_micromapHostCommands = LAYOUT.select(PathElement.groupElement("micromapHostCommands"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_micromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromap"));
    public static final VarHandle VH_micromapCaptureReplay = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapCaptureReplay"));
    public static final VarHandle VH_micromapHostCommands = LAYOUT.arrayElementVarHandle(PathElement.groupElement("micromapHostCommands"));

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT); }
    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT copyFrom(VkPhysicalDeviceOpacityMicromapFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT at(long index, Consumer<VkPhysicalDeviceOpacityMicromapFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int micromapAt(long index) { return (int) VH_micromap.get(this.segment(), 0L, index); }
    public int micromapCaptureReplayAt(long index) { return (int) VH_micromapCaptureReplay.get(this.segment(), 0L, index); }
    public int micromapHostCommandsAt(long index) { return (int) VH_micromapHostCommands.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int micromap() { return (int) VH_micromap.get(this.segment(), 0L, 0L); }
    public int micromapCaptureReplay() { return (int) VH_micromapCaptureReplay.get(this.segment(), 0L, 0L); }
    public int micromapHostCommands() { return (int) VH_micromapHostCommands.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapAt(long index, int value) { VH_micromap.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplayAt(long index, int value) { VH_micromapCaptureReplay.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommandsAt(long index, int value) { VH_micromapHostCommands.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromap(int value) { VH_micromap.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplay(int value) { VH_micromapCaptureReplay.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommands(int value) { VH_micromapHostCommands.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _micromapAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_micromap, index), LAYOUT_micromap); }
    public MemorySegment _micromap() { return _micromapAt(0L); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _micromapAt(long index, MemorySegment src) { _micromapAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _micromap(MemorySegment src) { return _micromapAt(0L, src); }
    public MemorySegment _micromapCaptureReplayAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_micromapCaptureReplay, index), LAYOUT_micromapCaptureReplay); }
    public MemorySegment _micromapCaptureReplay() { return _micromapCaptureReplayAt(0L); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _micromapCaptureReplayAt(long index, MemorySegment src) { _micromapCaptureReplayAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _micromapCaptureReplay(MemorySegment src) { return _micromapCaptureReplayAt(0L, src); }
    public MemorySegment _micromapHostCommandsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_micromapHostCommands, index), LAYOUT_micromapHostCommands); }
    public MemorySegment _micromapHostCommands() { return _micromapHostCommandsAt(0L); }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _micromapHostCommandsAt(long index, MemorySegment src) { _micromapHostCommandsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT _micromapHostCommands(MemorySegment src) { return _micromapHostCommandsAt(0L, src); }
}
