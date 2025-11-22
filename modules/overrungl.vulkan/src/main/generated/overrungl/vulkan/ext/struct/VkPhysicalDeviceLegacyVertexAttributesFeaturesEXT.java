// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 legacyVertexAttributes;
/// }
/// ```
public final class VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("legacyVertexAttributes")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_legacyVertexAttributes = LAYOUT.byteOffset(PathElement.groupElement("legacyVertexAttributes"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_legacyVertexAttributes = LAYOUT.select(PathElement.groupElement("legacyVertexAttributes"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_legacyVertexAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("legacyVertexAttributes"));

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT); }
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTLegacyVertexAttributes.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT copyFrom(VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT at(long index, Consumer<VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int legacyVertexAttributesAt(long index) { return (int) VH_legacyVertexAttributes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int legacyVertexAttributes() { return (int) VH_legacyVertexAttributes.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT legacyVertexAttributesAt(long index, int value) { VH_legacyVertexAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT legacyVertexAttributes(int value) { VH_legacyVertexAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _legacyVertexAttributesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_legacyVertexAttributes, index), LAYOUT_legacyVertexAttributes); }
    public MemorySegment _legacyVertexAttributes() { return _legacyVertexAttributesAt(0L); }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT _legacyVertexAttributesAt(long index, MemorySegment src) { _legacyVertexAttributesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT _legacyVertexAttributes(MemorySegment src) { return _legacyVertexAttributesAt(0L, src); }
}
