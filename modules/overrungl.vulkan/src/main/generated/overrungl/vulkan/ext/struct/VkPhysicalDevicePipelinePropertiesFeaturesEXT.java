// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDevicePipelinePropertiesFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDevicePipelinePropertiesFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 pipelinePropertiesIdentifier;
/// }
/// ```
public final class VkPhysicalDevicePipelinePropertiesFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelinePropertiesIdentifier")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_pipelinePropertiesIdentifier = LAYOUT.byteOffset(PathElement.groupElement("pipelinePropertiesIdentifier"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_pipelinePropertiesIdentifier = LAYOUT.select(PathElement.groupElement("pipelinePropertiesIdentifier"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_pipelinePropertiesIdentifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelinePropertiesIdentifier"));

    public VkPhysicalDevicePipelinePropertiesFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPipelineProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT); }
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPipelineProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT copyFrom(VkPhysicalDevicePipelinePropertiesFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT reinterpret(long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT asSlice(long index) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT at(long index, Consumer<VkPhysicalDevicePipelinePropertiesFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int pipelinePropertiesIdentifierAt(long index) { return (int) VH_pipelinePropertiesIdentifier.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int pipelinePropertiesIdentifier() { return (int) VH_pipelinePropertiesIdentifier.get(this.segment(), 0L, 0L); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifierAt(long index, int value) { VH_pipelinePropertiesIdentifier.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifier(int value) { VH_pipelinePropertiesIdentifier.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _pipelinePropertiesIdentifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelinePropertiesIdentifier, index), LAYOUT_pipelinePropertiesIdentifier); }
    public MemorySegment _pipelinePropertiesIdentifier() { return _pipelinePropertiesIdentifierAt(0L); }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT _pipelinePropertiesIdentifierAt(long index, MemorySegment src) { _pipelinePropertiesIdentifierAt(index).copyFrom(src); return this; }
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT _pipelinePropertiesIdentifier(MemorySegment src) { return _pipelinePropertiesIdentifierAt(0L, src); }
}
