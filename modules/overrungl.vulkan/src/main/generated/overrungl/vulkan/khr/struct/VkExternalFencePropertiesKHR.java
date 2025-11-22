// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalFencePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkExternalFencePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExternalFenceHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalFenceHandleTypeFlags compatibleHandleTypes;
///     VkExternalFenceFeatureFlags externalFenceFeatures;
/// }
/// ```
public final class VkExternalFencePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalFenceFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    public static final long OFFSET_externalFenceFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalFenceFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    public static final MemoryLayout LAYOUT_externalFenceFeatures = LAYOUT.select(PathElement.groupElement("externalFenceFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));
    public static final VarHandle VH_externalFenceFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFenceFeatures"));

    public VkExternalFencePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalFencePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFencePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalFencePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFencePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalFencePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalFencePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalFencePropertiesKHR alloc(SegmentAllocator allocator) { return new VkExternalFencePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkExternalFencePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkExternalFencePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalFencePropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES); }
    public static VkExternalFencePropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES);
        return s;
    }
    public VkExternalFencePropertiesKHR copyFrom(VkExternalFencePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalFencePropertiesKHR reinterpret(long count) { return new VkExternalFencePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalFencePropertiesKHR asSlice(long index) { return new VkExternalFencePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalFencePropertiesKHR asSlice(long index, long count) { return new VkExternalFencePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalFencePropertiesKHR at(long index, Consumer<VkExternalFencePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int exportFromImportedHandleTypesAt(long index) { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, index); }
    public int compatibleHandleTypesAt(long index) { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, index); }
    public int externalFenceFeaturesAt(long index) { return (int) VH_externalFenceFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int exportFromImportedHandleTypes() { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, 0L); }
    public int compatibleHandleTypes() { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, 0L); }
    public int externalFenceFeatures() { return (int) VH_externalFenceFeatures.get(this.segment(), 0L, 0L); }
    public VkExternalFencePropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFencePropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFencePropertiesKHR exportFromImportedHandleTypesAt(long index, int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFencePropertiesKHR compatibleHandleTypesAt(long index, int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFencePropertiesKHR externalFenceFeaturesAt(long index, int value) { VH_externalFenceFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkExternalFencePropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFencePropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFencePropertiesKHR exportFromImportedHandleTypes(int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFencePropertiesKHR compatibleHandleTypes(int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalFencePropertiesKHR externalFenceFeatures(int value) { VH_externalFenceFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalFencePropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalFencePropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalFencePropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalFencePropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _exportFromImportedHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exportFromImportedHandleTypes, index), LAYOUT_exportFromImportedHandleTypes); }
    public MemorySegment _exportFromImportedHandleTypes() { return _exportFromImportedHandleTypesAt(0L); }
    public VkExternalFencePropertiesKHR _exportFromImportedHandleTypesAt(long index, MemorySegment src) { _exportFromImportedHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalFencePropertiesKHR _exportFromImportedHandleTypes(MemorySegment src) { return _exportFromImportedHandleTypesAt(0L, src); }
    public MemorySegment _compatibleHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compatibleHandleTypes, index), LAYOUT_compatibleHandleTypes); }
    public MemorySegment _compatibleHandleTypes() { return _compatibleHandleTypesAt(0L); }
    public VkExternalFencePropertiesKHR _compatibleHandleTypesAt(long index, MemorySegment src) { _compatibleHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalFencePropertiesKHR _compatibleHandleTypes(MemorySegment src) { return _compatibleHandleTypesAt(0L, src); }
    public MemorySegment _externalFenceFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalFenceFeatures, index), LAYOUT_externalFenceFeatures); }
    public MemorySegment _externalFenceFeatures() { return _externalFenceFeaturesAt(0L); }
    public VkExternalFencePropertiesKHR _externalFenceFeaturesAt(long index, MemorySegment src) { _externalFenceFeaturesAt(index).copyFrom(src); return this; }
    public VkExternalFencePropertiesKHR _externalFenceFeatures(MemorySegment src) { return _externalFenceFeaturesAt(0L, src); }
}
