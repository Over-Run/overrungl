// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cooperativeMatrixWorkgroupScope;
///     VkBool32 cooperativeMatrixFlexibleDimensions;
///     VkBool32 cooperativeMatrixReductions;
///     VkBool32 cooperativeMatrixConversions;
///     VkBool32 cooperativeMatrixPerElementOperations;
///     VkBool32 cooperativeMatrixTensorAddressing;
///     VkBool32 cooperativeMatrixBlockLoads;
/// }
/// ```
public final class VkPhysicalDeviceCooperativeMatrix2FeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScope"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixReductions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixConversions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixPerElementOperations"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixTensorAddressing"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixBlockLoads")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_cooperativeMatrixWorkgroupScope = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    public static final long OFFSET_cooperativeMatrixFlexibleDimensions = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    public static final long OFFSET_cooperativeMatrixReductions = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixReductions"));
    public static final long OFFSET_cooperativeMatrixConversions = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixConversions"));
    public static final long OFFSET_cooperativeMatrixPerElementOperations = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    public static final long OFFSET_cooperativeMatrixTensorAddressing = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    public static final long OFFSET_cooperativeMatrixBlockLoads = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixBlockLoads"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixWorkgroupScope = LAYOUT.select(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixFlexibleDimensions = LAYOUT.select(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixReductions = LAYOUT.select(PathElement.groupElement("cooperativeMatrixReductions"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixConversions = LAYOUT.select(PathElement.groupElement("cooperativeMatrixConversions"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixPerElementOperations = LAYOUT.select(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixTensorAddressing = LAYOUT.select(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    public static final MemoryLayout LAYOUT_cooperativeMatrixBlockLoads = LAYOUT.select(PathElement.groupElement("cooperativeMatrixBlockLoads"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_cooperativeMatrixWorkgroupScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    public static final VarHandle VH_cooperativeMatrixFlexibleDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    public static final VarHandle VH_cooperativeMatrixReductions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixReductions"));
    public static final VarHandle VH_cooperativeMatrixConversions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixConversions"));
    public static final VarHandle VH_cooperativeMatrixPerElementOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    public static final VarHandle VH_cooperativeMatrixTensorAddressing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    public static final VarHandle VH_cooperativeMatrixBlockLoads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixBlockLoads"));

    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV); }
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV copyFrom(VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV at(long index, Consumer<VkPhysicalDeviceCooperativeMatrix2FeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int cooperativeMatrixWorkgroupScopeAt(long index) { return (int) VH_cooperativeMatrixWorkgroupScope.get(this.segment(), 0L, index); }
    public int cooperativeMatrixFlexibleDimensionsAt(long index) { return (int) VH_cooperativeMatrixFlexibleDimensions.get(this.segment(), 0L, index); }
    public int cooperativeMatrixReductionsAt(long index) { return (int) VH_cooperativeMatrixReductions.get(this.segment(), 0L, index); }
    public int cooperativeMatrixConversionsAt(long index) { return (int) VH_cooperativeMatrixConversions.get(this.segment(), 0L, index); }
    public int cooperativeMatrixPerElementOperationsAt(long index) { return (int) VH_cooperativeMatrixPerElementOperations.get(this.segment(), 0L, index); }
    public int cooperativeMatrixTensorAddressingAt(long index) { return (int) VH_cooperativeMatrixTensorAddressing.get(this.segment(), 0L, index); }
    public int cooperativeMatrixBlockLoadsAt(long index) { return (int) VH_cooperativeMatrixBlockLoads.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixWorkgroupScope() { return (int) VH_cooperativeMatrixWorkgroupScope.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixFlexibleDimensions() { return (int) VH_cooperativeMatrixFlexibleDimensions.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixReductions() { return (int) VH_cooperativeMatrixReductions.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixConversions() { return (int) VH_cooperativeMatrixConversions.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixPerElementOperations() { return (int) VH_cooperativeMatrixPerElementOperations.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixTensorAddressing() { return (int) VH_cooperativeMatrixTensorAddressing.get(this.segment(), 0L, 0L); }
    public int cooperativeMatrixBlockLoads() { return (int) VH_cooperativeMatrixBlockLoads.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScopeAt(long index, int value) { VH_cooperativeMatrixWorkgroupScope.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensionsAt(long index, int value) { VH_cooperativeMatrixFlexibleDimensions.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductionsAt(long index, int value) { VH_cooperativeMatrixReductions.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversionsAt(long index, int value) { VH_cooperativeMatrixConversions.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperationsAt(long index, int value) { VH_cooperativeMatrixPerElementOperations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressingAt(long index, int value) { VH_cooperativeMatrixTensorAddressing.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoadsAt(long index, int value) { VH_cooperativeMatrixBlockLoads.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScope(int value) { VH_cooperativeMatrixWorkgroupScope.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensions(int value) { VH_cooperativeMatrixFlexibleDimensions.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductions(int value) { VH_cooperativeMatrixReductions.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversions(int value) { VH_cooperativeMatrixConversions.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperations(int value) { VH_cooperativeMatrixPerElementOperations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressing(int value) { VH_cooperativeMatrixTensorAddressing.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoads(int value) { VH_cooperativeMatrixBlockLoads.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _cooperativeMatrixWorkgroupScopeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixWorkgroupScope, index), LAYOUT_cooperativeMatrixWorkgroupScope); }
    public MemorySegment _cooperativeMatrixWorkgroupScope() { return _cooperativeMatrixWorkgroupScopeAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixWorkgroupScopeAt(long index, MemorySegment src) { _cooperativeMatrixWorkgroupScopeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixWorkgroupScope(MemorySegment src) { return _cooperativeMatrixWorkgroupScopeAt(0L, src); }
    public MemorySegment _cooperativeMatrixFlexibleDimensionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixFlexibleDimensions, index), LAYOUT_cooperativeMatrixFlexibleDimensions); }
    public MemorySegment _cooperativeMatrixFlexibleDimensions() { return _cooperativeMatrixFlexibleDimensionsAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixFlexibleDimensionsAt(long index, MemorySegment src) { _cooperativeMatrixFlexibleDimensionsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixFlexibleDimensions(MemorySegment src) { return _cooperativeMatrixFlexibleDimensionsAt(0L, src); }
    public MemorySegment _cooperativeMatrixReductionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixReductions, index), LAYOUT_cooperativeMatrixReductions); }
    public MemorySegment _cooperativeMatrixReductions() { return _cooperativeMatrixReductionsAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixReductionsAt(long index, MemorySegment src) { _cooperativeMatrixReductionsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixReductions(MemorySegment src) { return _cooperativeMatrixReductionsAt(0L, src); }
    public MemorySegment _cooperativeMatrixConversionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixConversions, index), LAYOUT_cooperativeMatrixConversions); }
    public MemorySegment _cooperativeMatrixConversions() { return _cooperativeMatrixConversionsAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixConversionsAt(long index, MemorySegment src) { _cooperativeMatrixConversionsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixConversions(MemorySegment src) { return _cooperativeMatrixConversionsAt(0L, src); }
    public MemorySegment _cooperativeMatrixPerElementOperationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixPerElementOperations, index), LAYOUT_cooperativeMatrixPerElementOperations); }
    public MemorySegment _cooperativeMatrixPerElementOperations() { return _cooperativeMatrixPerElementOperationsAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixPerElementOperationsAt(long index, MemorySegment src) { _cooperativeMatrixPerElementOperationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixPerElementOperations(MemorySegment src) { return _cooperativeMatrixPerElementOperationsAt(0L, src); }
    public MemorySegment _cooperativeMatrixTensorAddressingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixTensorAddressing, index), LAYOUT_cooperativeMatrixTensorAddressing); }
    public MemorySegment _cooperativeMatrixTensorAddressing() { return _cooperativeMatrixTensorAddressingAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixTensorAddressingAt(long index, MemorySegment src) { _cooperativeMatrixTensorAddressingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixTensorAddressing(MemorySegment src) { return _cooperativeMatrixTensorAddressingAt(0L, src); }
    public MemorySegment _cooperativeMatrixBlockLoadsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_cooperativeMatrixBlockLoads, index), LAYOUT_cooperativeMatrixBlockLoads); }
    public MemorySegment _cooperativeMatrixBlockLoads() { return _cooperativeMatrixBlockLoadsAt(0L); }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixBlockLoadsAt(long index, MemorySegment src) { _cooperativeMatrixBlockLoadsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV _cooperativeMatrixBlockLoads(MemorySegment src) { return _cooperativeMatrixBlockLoadsAt(0L, src); }
}
