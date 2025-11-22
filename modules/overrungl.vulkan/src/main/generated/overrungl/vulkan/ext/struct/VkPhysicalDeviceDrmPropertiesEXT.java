// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDrmPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDrmPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 hasPrimary;
///     VkBool32 hasRender;
///     int64_t primaryMajor;
///     int64_t primaryMinor;
///     int64_t renderMajor;
///     int64_t renderMinor;
/// }
/// ```
public final class VkPhysicalDeviceDrmPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasPrimary"),
        ValueLayout.JAVA_INT.withName("hasRender"),
        ValueLayout.JAVA_LONG.withName("primaryMajor"),
        ValueLayout.JAVA_LONG.withName("primaryMinor"),
        ValueLayout.JAVA_LONG.withName("renderMajor"),
        ValueLayout.JAVA_LONG.withName("renderMinor")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_hasPrimary = LAYOUT.byteOffset(PathElement.groupElement("hasPrimary"));
    public static final long OFFSET_hasRender = LAYOUT.byteOffset(PathElement.groupElement("hasRender"));
    public static final long OFFSET_primaryMajor = LAYOUT.byteOffset(PathElement.groupElement("primaryMajor"));
    public static final long OFFSET_primaryMinor = LAYOUT.byteOffset(PathElement.groupElement("primaryMinor"));
    public static final long OFFSET_renderMajor = LAYOUT.byteOffset(PathElement.groupElement("renderMajor"));
    public static final long OFFSET_renderMinor = LAYOUT.byteOffset(PathElement.groupElement("renderMinor"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_hasPrimary = LAYOUT.select(PathElement.groupElement("hasPrimary"));
    public static final MemoryLayout LAYOUT_hasRender = LAYOUT.select(PathElement.groupElement("hasRender"));
    public static final MemoryLayout LAYOUT_primaryMajor = LAYOUT.select(PathElement.groupElement("primaryMajor"));
    public static final MemoryLayout LAYOUT_primaryMinor = LAYOUT.select(PathElement.groupElement("primaryMinor"));
    public static final MemoryLayout LAYOUT_renderMajor = LAYOUT.select(PathElement.groupElement("renderMajor"));
    public static final MemoryLayout LAYOUT_renderMinor = LAYOUT.select(PathElement.groupElement("renderMinor"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_hasPrimary = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasPrimary"));
    public static final VarHandle VH_hasRender = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasRender"));
    public static final VarHandle VH_primaryMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryMajor"));
    public static final VarHandle VH_primaryMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryMinor"));
    public static final VarHandle VH_renderMajor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderMajor"));
    public static final VarHandle VH_renderMinor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderMinor"));

    public VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDrmPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDrmPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDrmPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDrmPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDrmPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDrmPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDrmPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDrmPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDrmPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDrmPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDrmPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTPhysicalDeviceDrm.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT); }
    public static VkPhysicalDeviceDrmPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTPhysicalDeviceDrm.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceDrmPropertiesEXT copyFrom(VkPhysicalDeviceDrmPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceDrmPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDrmPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceDrmPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDrmPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceDrmPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDrmPropertiesEXT at(long index, Consumer<VkPhysicalDeviceDrmPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int hasPrimaryAt(long index) { return (int) VH_hasPrimary.get(this.segment(), 0L, index); }
    public int hasRenderAt(long index) { return (int) VH_hasRender.get(this.segment(), 0L, index); }
    public long primaryMajorAt(long index) { return (long) VH_primaryMajor.get(this.segment(), 0L, index); }
    public long primaryMinorAt(long index) { return (long) VH_primaryMinor.get(this.segment(), 0L, index); }
    public long renderMajorAt(long index) { return (long) VH_renderMajor.get(this.segment(), 0L, index); }
    public long renderMinorAt(long index) { return (long) VH_renderMinor.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int hasPrimary() { return (int) VH_hasPrimary.get(this.segment(), 0L, 0L); }
    public int hasRender() { return (int) VH_hasRender.get(this.segment(), 0L, 0L); }
    public long primaryMajor() { return (long) VH_primaryMajor.get(this.segment(), 0L, 0L); }
    public long primaryMinor() { return (long) VH_primaryMinor.get(this.segment(), 0L, 0L); }
    public long renderMajor() { return (long) VH_renderMajor.get(this.segment(), 0L, 0L); }
    public long renderMinor() { return (long) VH_renderMinor.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDrmPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT hasPrimaryAt(long index, int value) { VH_hasPrimary.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT hasRenderAt(long index, int value) { VH_hasRender.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT primaryMajorAt(long index, long value) { VH_primaryMajor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT primaryMinorAt(long index, long value) { VH_primaryMinor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT renderMajorAt(long index, long value) { VH_renderMajor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT renderMinorAt(long index, long value) { VH_renderMinor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT hasPrimary(int value) { VH_hasPrimary.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT hasRender(int value) { VH_hasRender.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT primaryMajor(long value) { VH_primaryMajor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT primaryMinor(long value) { VH_primaryMinor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT renderMajor(long value) { VH_renderMajor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT renderMinor(long value) { VH_renderMinor.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _hasPrimaryAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hasPrimary, index), LAYOUT_hasPrimary); }
    public MemorySegment _hasPrimary() { return _hasPrimaryAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _hasPrimaryAt(long index, MemorySegment src) { _hasPrimaryAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _hasPrimary(MemorySegment src) { return _hasPrimaryAt(0L, src); }
    public MemorySegment _hasRenderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_hasRender, index), LAYOUT_hasRender); }
    public MemorySegment _hasRender() { return _hasRenderAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _hasRenderAt(long index, MemorySegment src) { _hasRenderAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _hasRender(MemorySegment src) { return _hasRenderAt(0L, src); }
    public MemorySegment _primaryMajorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primaryMajor, index), LAYOUT_primaryMajor); }
    public MemorySegment _primaryMajor() { return _primaryMajorAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _primaryMajorAt(long index, MemorySegment src) { _primaryMajorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _primaryMajor(MemorySegment src) { return _primaryMajorAt(0L, src); }
    public MemorySegment _primaryMinorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_primaryMinor, index), LAYOUT_primaryMinor); }
    public MemorySegment _primaryMinor() { return _primaryMinorAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _primaryMinorAt(long index, MemorySegment src) { _primaryMinorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _primaryMinor(MemorySegment src) { return _primaryMinorAt(0L, src); }
    public MemorySegment _renderMajorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderMajor, index), LAYOUT_renderMajor); }
    public MemorySegment _renderMajor() { return _renderMajorAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _renderMajorAt(long index, MemorySegment src) { _renderMajorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _renderMajor(MemorySegment src) { return _renderMajorAt(0L, src); }
    public MemorySegment _renderMinorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_renderMinor, index), LAYOUT_renderMinor); }
    public MemorySegment _renderMinor() { return _renderMinorAt(0L); }
    public VkPhysicalDeviceDrmPropertiesEXT _renderMinorAt(long index, MemorySegment src) { _renderMinorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDrmPropertiesEXT _renderMinor(MemorySegment src) { return _renderMinorAt(0L, src); }
}
