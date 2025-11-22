// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShader64BitIndexingFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShader64BitIndexingFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shader64BitIndexing;
/// }
/// ```
public final class VkPhysicalDeviceShader64BitIndexingFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shader64BitIndexing")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shader64BitIndexing = LAYOUT.byteOffset(PathElement.groupElement("shader64BitIndexing"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shader64BitIndexing = LAYOUT.select(PathElement.groupElement("shader64BitIndexing"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shader64BitIndexing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shader64BitIndexing"));

    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShader64bitIndexing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_64_BIT_INDEXING_FEATURES_EXT); }
    public static VkPhysicalDeviceShader64BitIndexingFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShader64bitIndexing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_64_BIT_INDEXING_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT copyFrom(VkPhysicalDeviceShader64BitIndexingFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShader64BitIndexingFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT at(long index, Consumer<VkPhysicalDeviceShader64BitIndexingFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shader64BitIndexingAt(long index) { return (int) VH_shader64BitIndexing.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shader64BitIndexing() { return (int) VH_shader64BitIndexing.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT shader64BitIndexingAt(long index, int value) { VH_shader64BitIndexing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT shader64BitIndexing(int value) { VH_shader64BitIndexing.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shader64BitIndexingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shader64BitIndexing, index), LAYOUT_shader64BitIndexing); }
    public MemorySegment _shader64BitIndexing() { return _shader64BitIndexingAt(0L); }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT _shader64BitIndexingAt(long index, MemorySegment src) { _shader64BitIndexingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShader64BitIndexingFeaturesEXT _shader64BitIndexing(MemorySegment src) { return _shader64BitIndexingAt(0L, src); }
}
