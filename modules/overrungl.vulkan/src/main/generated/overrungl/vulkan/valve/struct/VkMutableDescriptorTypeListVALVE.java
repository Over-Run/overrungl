// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.valve.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkMutableDescriptorTypeListVALVE`.
/// ## Layout
/// ```
/// struct VkMutableDescriptorTypeListVALVE {
///     uint32_t descriptorTypeCount;
///     const VkDescriptorType* pDescriptorTypes;
/// }
/// ```
public final class VkMutableDescriptorTypeListVALVE extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("descriptorTypeCount"),
        ValueLayout.ADDRESS.withName("pDescriptorTypes")
    );
    public static final long OFFSET_descriptorTypeCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorTypeCount"));
    public static final long OFFSET_pDescriptorTypes = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorTypes"));
    public static final MemoryLayout LAYOUT_descriptorTypeCount = LAYOUT.select(PathElement.groupElement("descriptorTypeCount"));
    public static final MemoryLayout LAYOUT_pDescriptorTypes = LAYOUT.select(PathElement.groupElement("pDescriptorTypes"));
    public static final VarHandle VH_descriptorTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorTypeCount"));
    public static final VarHandle VH_pDescriptorTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorTypes"));

    public VkMutableDescriptorTypeListVALVE(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkMutableDescriptorTypeListVALVE of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListVALVE(segment, estimateCount(segment, LAYOUT)); }
    public static VkMutableDescriptorTypeListVALVE ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListVALVE(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkMutableDescriptorTypeListVALVE ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListVALVE(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkMutableDescriptorTypeListVALVE alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeListVALVE(allocator.allocate(LAYOUT), 1); }
    public static VkMutableDescriptorTypeListVALVE alloc(SegmentAllocator allocator, long count) { return new VkMutableDescriptorTypeListVALVE(allocator.allocate(LAYOUT, count), count); }
    public VkMutableDescriptorTypeListVALVE copyFrom(VkMutableDescriptorTypeListVALVE src) { this.segment().copyFrom(src.segment()); return this; }
    public VkMutableDescriptorTypeListVALVE reinterpret(long count) { return new VkMutableDescriptorTypeListVALVE(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkMutableDescriptorTypeListVALVE asSlice(long index) { return new VkMutableDescriptorTypeListVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkMutableDescriptorTypeListVALVE asSlice(long index, long count) { return new VkMutableDescriptorTypeListVALVE(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkMutableDescriptorTypeListVALVE at(long index, Consumer<VkMutableDescriptorTypeListVALVE> func) { func.accept(asSlice(index)); return this; }
    public int descriptorTypeCountAt(long index) { return (int) VH_descriptorTypeCount.get(this.segment(), 0L, index); }
    public MemorySegment pDescriptorTypesAt(long index) { return (MemorySegment) VH_pDescriptorTypes.get(this.segment(), 0L, index); }
    public int descriptorTypeCount() { return (int) VH_descriptorTypeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pDescriptorTypes() { return (MemorySegment) VH_pDescriptorTypes.get(this.segment(), 0L, 0L); }
    public VkMutableDescriptorTypeListVALVE descriptorTypeCountAt(long index, int value) { VH_descriptorTypeCount.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeListVALVE pDescriptorTypesAt(long index, MemorySegment value) { VH_pDescriptorTypes.set(this.segment(), 0L, index, value); return this; }
    public VkMutableDescriptorTypeListVALVE descriptorTypeCount(int value) { VH_descriptorTypeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkMutableDescriptorTypeListVALVE pDescriptorTypes(MemorySegment value) { VH_pDescriptorTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _descriptorTypeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_descriptorTypeCount, index), LAYOUT_descriptorTypeCount); }
    public MemorySegment _descriptorTypeCount() { return _descriptorTypeCountAt(0L); }
    public VkMutableDescriptorTypeListVALVE _descriptorTypeCountAt(long index, MemorySegment src) { _descriptorTypeCountAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeListVALVE _descriptorTypeCount(MemorySegment src) { return _descriptorTypeCountAt(0L, src); }
    public MemorySegment _pDescriptorTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pDescriptorTypes, index), LAYOUT_pDescriptorTypes); }
    public MemorySegment _pDescriptorTypes() { return _pDescriptorTypesAt(0L); }
    public VkMutableDescriptorTypeListVALVE _pDescriptorTypesAt(long index, MemorySegment src) { _pDescriptorTypesAt(index).copyFrom(src); return this; }
    public VkMutableDescriptorTypeListVALVE _pDescriptorTypes(MemorySegment src) { return _pDescriptorTypesAt(0L, src); }
}
