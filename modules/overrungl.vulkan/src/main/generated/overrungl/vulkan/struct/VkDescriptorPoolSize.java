// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDescriptorPoolSize`.
/// ## Layout
/// ```
/// struct VkDescriptorPoolSize {
///     VkDescriptorType type;
///     uint32_t descriptorCount;
/// }
/// ```
public final class VkDescriptorPoolSize extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_descriptorCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_descriptorCount = LAYOUT.select(PathElement.groupElement("descriptorCount"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_descriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorCount"));

    public VkDescriptorPoolSize(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDescriptorPoolSize of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolSize(segment, estimateCount(segment, LAYOUT)); }
    public static VkDescriptorPoolSize ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolSize(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDescriptorPoolSize ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDescriptorPoolSize(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDescriptorPoolSize alloc(SegmentAllocator allocator) { return new VkDescriptorPoolSize(allocator.allocate(LAYOUT), 1); }
    public static VkDescriptorPoolSize alloc(SegmentAllocator allocator, long count) { return new VkDescriptorPoolSize(allocator.allocate(LAYOUT, count), count); }
    public VkDescriptorPoolSize copyFrom(VkDescriptorPoolSize src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDescriptorPoolSize reinterpret(long count) { return new VkDescriptorPoolSize(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDescriptorPoolSize asSlice(long index) { return new VkDescriptorPoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDescriptorPoolSize asSlice(long index, long count) { return new VkDescriptorPoolSize(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDescriptorPoolSize at(long index, Consumer<VkDescriptorPoolSize> func) { func.accept(asSlice(index)); return this; }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int descriptorCountAt(long index) { return (int) VH_descriptorCount.get(this.segment(), 0L, index); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int descriptorCount() { return (int) VH_descriptorCount.get(this.segment(), 0L, 0L); }
    public VkDescriptorPoolSize typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolSize descriptorCountAt(long index, int value) { VH_descriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkDescriptorPoolSize type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkDescriptorPoolSize descriptorCount(int value) { VH_descriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkDescriptorPoolSize _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolSize _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _descriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorCount, index), LAYOUT_descriptorCount); }
    public MemorySegment _descriptorCount() { return _descriptorCountAt(0L); }
    public VkDescriptorPoolSize _descriptorCountAt(long index, MemorySegment src) { _descriptorCountAt(index).copyFrom(src); return this; }
    public VkDescriptorPoolSize _descriptorCount(MemorySegment src) { return _descriptorCountAt(0L, src); }
}
