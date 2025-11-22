// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDrmFormatModifierPropertiesList2EXT`.
/// ## Layout
/// ```
/// struct VkDrmFormatModifierPropertiesList2EXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t drmFormatModifierCount;
///     VkDrmFormatModifierProperties2EXT* pDrmFormatModifierProperties;
/// }
/// ```
public final class VkDrmFormatModifierPropertiesList2EXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierCount"),
        ValueLayout.ADDRESS.withName("pDrmFormatModifierProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_drmFormatModifierCount = LAYOUT.byteOffset(PathElement.groupElement("drmFormatModifierCount"));
    public static final long OFFSET_pDrmFormatModifierProperties = LAYOUT.byteOffset(PathElement.groupElement("pDrmFormatModifierProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_drmFormatModifierCount = LAYOUT.select(PathElement.groupElement("drmFormatModifierCount"));
    public static final MemoryLayout LAYOUT_pDrmFormatModifierProperties = LAYOUT.select(PathElement.groupElement("pDrmFormatModifierProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_drmFormatModifierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("drmFormatModifierCount"));
    public static final VarHandle VH_pDrmFormatModifierProperties = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrmFormatModifierProperties"));

    public VkDrmFormatModifierPropertiesList2EXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDrmFormatModifierPropertiesList2EXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesList2EXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDrmFormatModifierPropertiesList2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesList2EXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDrmFormatModifierPropertiesList2EXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDrmFormatModifierPropertiesList2EXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDrmFormatModifierPropertiesList2EXT alloc(SegmentAllocator allocator) { return new VkDrmFormatModifierPropertiesList2EXT(allocator.allocate(LAYOUT), 1); }
    public static VkDrmFormatModifierPropertiesList2EXT alloc(SegmentAllocator allocator, long count) { return new VkDrmFormatModifierPropertiesList2EXT(allocator.allocate(LAYOUT, count), count); }
    public static VkDrmFormatModifierPropertiesList2EXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT); }
    public static VkDrmFormatModifierPropertiesList2EXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT);
        return s;
    }
    public VkDrmFormatModifierPropertiesList2EXT copyFrom(VkDrmFormatModifierPropertiesList2EXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDrmFormatModifierPropertiesList2EXT reinterpret(long count) { return new VkDrmFormatModifierPropertiesList2EXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDrmFormatModifierPropertiesList2EXT asSlice(long index) { return new VkDrmFormatModifierPropertiesList2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDrmFormatModifierPropertiesList2EXT asSlice(long index, long count) { return new VkDrmFormatModifierPropertiesList2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDrmFormatModifierPropertiesList2EXT at(long index, Consumer<VkDrmFormatModifierPropertiesList2EXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int drmFormatModifierCountAt(long index) { return (int) VH_drmFormatModifierCount.get(this.segment(), 0L, index); }
    public MemorySegment pDrmFormatModifierPropertiesAt(long index) { return (MemorySegment) VH_pDrmFormatModifierProperties.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int drmFormatModifierCount() { return (int) VH_drmFormatModifierCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDrmFormatModifierProperties() { return (MemorySegment) VH_pDrmFormatModifierProperties.get(this.segment(), 0L, 0L); }
    public VkDrmFormatModifierPropertiesList2EXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT drmFormatModifierCountAt(long index, int value) { VH_drmFormatModifierCount.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT pDrmFormatModifierPropertiesAt(long index, MemorySegment value) { VH_pDrmFormatModifierProperties.set(this.segment(), 0L, index, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT drmFormatModifierCount(int value) { VH_drmFormatModifierCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkDrmFormatModifierPropertiesList2EXT pDrmFormatModifierProperties(MemorySegment value) { VH_pDrmFormatModifierProperties.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDrmFormatModifierPropertiesList2EXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesList2EXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDrmFormatModifierPropertiesList2EXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesList2EXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _drmFormatModifierCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_drmFormatModifierCount, index), LAYOUT_drmFormatModifierCount); }
    public MemorySegment _drmFormatModifierCount() { return _drmFormatModifierCountAt(0L); }
    public VkDrmFormatModifierPropertiesList2EXT _drmFormatModifierCountAt(long index, MemorySegment src) { _drmFormatModifierCountAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesList2EXT _drmFormatModifierCount(MemorySegment src) { return _drmFormatModifierCountAt(0L, src); }
    public MemorySegment _pDrmFormatModifierPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDrmFormatModifierProperties, index), LAYOUT_pDrmFormatModifierProperties); }
    public MemorySegment _pDrmFormatModifierProperties() { return _pDrmFormatModifierPropertiesAt(0L); }
    public VkDrmFormatModifierPropertiesList2EXT _pDrmFormatModifierPropertiesAt(long index, MemorySegment src) { _pDrmFormatModifierPropertiesAt(index).copyFrom(src); return this; }
    public VkDrmFormatModifierPropertiesList2EXT _pDrmFormatModifierProperties(MemorySegment src) { return _pDrmFormatModifierPropertiesAt(0L, src); }
}
