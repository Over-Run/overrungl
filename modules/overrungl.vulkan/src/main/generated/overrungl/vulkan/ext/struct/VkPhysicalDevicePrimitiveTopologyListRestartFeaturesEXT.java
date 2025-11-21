// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 primitiveTopologyListRestart;
///     VkBool32 primitiveTopologyPatchListRestart;
/// }
/// ```
public final class VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyListRestart"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyPatchListRestart")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_primitiveTopologyListRestart = LAYOUT.byteOffset(PathElement.groupElement("primitiveTopologyListRestart"));
    public static final long OFFSET_primitiveTopologyPatchListRestart = LAYOUT.byteOffset(PathElement.groupElement("primitiveTopologyPatchListRestart"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_primitiveTopologyListRestart = LAYOUT.select(PathElement.groupElement("primitiveTopologyListRestart"));
    public static final MemoryLayout LAYOUT_primitiveTopologyPatchListRestart = LAYOUT.select(PathElement.groupElement("primitiveTopologyPatchListRestart"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_primitiveTopologyListRestart = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveTopologyListRestart"));
    public static final VarHandle VH_primitiveTopologyPatchListRestart = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primitiveTopologyPatchListRestart"));

    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPrimitiveTopologyListRestart.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT); }
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPrimitiveTopologyListRestart.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT copyFrom(VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT at(long index, Consumer<VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int primitiveTopologyListRestartAt(long index) { return (int) VH_primitiveTopologyListRestart.get(this.segment(), 0L, index); }
    public int primitiveTopologyPatchListRestartAt(long index) { return (int) VH_primitiveTopologyPatchListRestart.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int primitiveTopologyListRestart() { return (int) VH_primitiveTopologyListRestart.get(this.segment(), 0L, 0L); }
    public int primitiveTopologyPatchListRestart() { return (int) VH_primitiveTopologyPatchListRestart.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyListRestartAt(long index, int value) { VH_primitiveTopologyListRestart.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyPatchListRestartAt(long index, int value) { VH_primitiveTopologyPatchListRestart.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyListRestart(int value) { VH_primitiveTopologyListRestart.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT primitiveTopologyPatchListRestart(int value) { VH_primitiveTopologyPatchListRestart.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _primitiveTopologyListRestartAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveTopologyListRestart, index), LAYOUT_primitiveTopologyListRestart); }
    public MemorySegment _primitiveTopologyListRestart() { return _primitiveTopologyListRestartAt(0L); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _primitiveTopologyListRestartAt(long index, MemorySegment src) { _primitiveTopologyListRestartAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _primitiveTopologyListRestart(MemorySegment src) { return _primitiveTopologyListRestartAt(0L, src); }
    public MemorySegment _primitiveTopologyPatchListRestartAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primitiveTopologyPatchListRestart, index), LAYOUT_primitiveTopologyPatchListRestart); }
    public MemorySegment _primitiveTopologyPatchListRestart() { return _primitiveTopologyPatchListRestartAt(0L); }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _primitiveTopologyPatchListRestartAt(long index, MemorySegment src) { _primitiveTopologyPatchListRestartAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT _primitiveTopologyPatchListRestart(MemorySegment src) { return _primitiveTopologyPatchListRestartAt(0L, src); }
}
