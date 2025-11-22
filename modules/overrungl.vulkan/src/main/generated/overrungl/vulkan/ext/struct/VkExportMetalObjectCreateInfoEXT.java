// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExportMetalObjectCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkExportMetalObjectCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkExportMetalObjectTypeFlagBitsEXT exportObjectType;
/// }
/// ```
public final class VkExportMetalObjectCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportObjectType")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_exportObjectType = LAYOUT.byteOffset(PathElement.groupElement("exportObjectType"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_exportObjectType = LAYOUT.select(PathElement.groupElement("exportObjectType"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_exportObjectType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportObjectType"));

    public VkExportMetalObjectCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExportMetalObjectCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalObjectCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkExportMetalObjectCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalObjectCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExportMetalObjectCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExportMetalObjectCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExportMetalObjectCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkExportMetalObjectCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkExportMetalObjectCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkExportMetalObjectCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkExportMetalObjectCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT); }
    public static VkExportMetalObjectCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT);
        return s;
    }
    public VkExportMetalObjectCreateInfoEXT copyFrom(VkExportMetalObjectCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExportMetalObjectCreateInfoEXT reinterpret(long count) { return new VkExportMetalObjectCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExportMetalObjectCreateInfoEXT asSlice(long index) { return new VkExportMetalObjectCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExportMetalObjectCreateInfoEXT asSlice(long index, long count) { return new VkExportMetalObjectCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExportMetalObjectCreateInfoEXT at(long index, Consumer<VkExportMetalObjectCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int exportObjectTypeAt(long index) { return (int) VH_exportObjectType.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int exportObjectType() { return (int) VH_exportObjectType.get(this.segment(), 0L, 0L); }
    public VkExportMetalObjectCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalObjectCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalObjectCreateInfoEXT exportObjectTypeAt(long index, int value) { VH_exportObjectType.set(this.segment(), 0L, index, value); return this; }
    public VkExportMetalObjectCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalObjectCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExportMetalObjectCreateInfoEXT exportObjectType(int value) { VH_exportObjectType.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExportMetalObjectCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalObjectCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExportMetalObjectCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExportMetalObjectCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _exportObjectTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exportObjectType, index), LAYOUT_exportObjectType); }
    public MemorySegment _exportObjectType() { return _exportObjectTypeAt(0L); }
    public VkExportMetalObjectCreateInfoEXT _exportObjectTypeAt(long index, MemorySegment src) { _exportObjectTypeAt(index).copyFrom(src); return this; }
    public VkExportMetalObjectCreateInfoEXT _exportObjectType(MemorySegment src) { return _exportObjectTypeAt(0L, src); }
}
