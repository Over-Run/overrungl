// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 texelBufferAlignment;
/// }
/// ```
public final class VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("texelBufferAlignment")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_texelBufferAlignment = LAYOUT.byteOffset(PathElement.groupElement("texelBufferAlignment"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_texelBufferAlignment = LAYOUT.select(PathElement.groupElement("texelBufferAlignment"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_texelBufferAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("texelBufferAlignment"));

    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTTexelBufferAlignment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT); }
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTTexelBufferAlignment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT);
        return s;
    }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT copyFrom(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT reinterpret(long count) { return new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT asSlice(long index) { return new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT asSlice(long index, long count) { return new VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT at(long index, Consumer<VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int texelBufferAlignmentAt(long index) { return (int) VH_texelBufferAlignment.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int texelBufferAlignment() { return (int) VH_texelBufferAlignment.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT texelBufferAlignmentAt(long index, int value) { VH_texelBufferAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT texelBufferAlignment(int value) { VH_texelBufferAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _texelBufferAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_texelBufferAlignment, index), LAYOUT_texelBufferAlignment); }
    public MemorySegment _texelBufferAlignment() { return _texelBufferAlignmentAt(0L); }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT _texelBufferAlignmentAt(long index, MemorySegment src) { _texelBufferAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT _texelBufferAlignment(MemorySegment src) { return _texelBufferAlignmentAt(0L, src); }
}
