// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalSemaphorePropertiesKHR`.
/// ## Layout
/// ```
/// struct VkExternalSemaphorePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
///     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
/// }
/// ```
public final class VkExternalSemaphorePropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_exportFromImportedHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final long OFFSET_compatibleHandleTypes = LAYOUT.byteOffset(PathElement.groupElement("compatibleHandleTypes"));
    public static final long OFFSET_externalSemaphoreFeatures = LAYOUT.byteOffset(PathElement.groupElement("externalSemaphoreFeatures"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_exportFromImportedHandleTypes = LAYOUT.select(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final MemoryLayout LAYOUT_compatibleHandleTypes = LAYOUT.select(PathElement.groupElement("compatibleHandleTypes"));
    public static final MemoryLayout LAYOUT_externalSemaphoreFeatures = LAYOUT.select(PathElement.groupElement("externalSemaphoreFeatures"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final VarHandle VH_compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleHandleTypes"));
    public static final VarHandle VH_externalSemaphoreFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalSemaphoreFeatures"));

    public VkExternalSemaphorePropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalSemaphorePropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphorePropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalSemaphorePropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphorePropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalSemaphorePropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalSemaphorePropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalSemaphorePropertiesKHR alloc(SegmentAllocator allocator) { return new VkExternalSemaphorePropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkExternalSemaphorePropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkExternalSemaphorePropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalSemaphorePropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES); }
    public static VkExternalSemaphorePropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES);
        return s;
    }
    public VkExternalSemaphorePropertiesKHR copyFrom(VkExternalSemaphorePropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalSemaphorePropertiesKHR reinterpret(long count) { return new VkExternalSemaphorePropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalSemaphorePropertiesKHR asSlice(long index) { return new VkExternalSemaphorePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalSemaphorePropertiesKHR asSlice(long index, long count) { return new VkExternalSemaphorePropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalSemaphorePropertiesKHR at(long index, Consumer<VkExternalSemaphorePropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int exportFromImportedHandleTypesAt(long index) { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, index); }
    public int compatibleHandleTypesAt(long index) { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, index); }
    public int externalSemaphoreFeaturesAt(long index) { return (int) VH_externalSemaphoreFeatures.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int exportFromImportedHandleTypes() { return (int) VH_exportFromImportedHandleTypes.get(this.segment(), 0L, 0L); }
    public int compatibleHandleTypes() { return (int) VH_compatibleHandleTypes.get(this.segment(), 0L, 0L); }
    public int externalSemaphoreFeatures() { return (int) VH_externalSemaphoreFeatures.get(this.segment(), 0L, 0L); }
    public VkExternalSemaphorePropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalSemaphorePropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalSemaphorePropertiesKHR exportFromImportedHandleTypesAt(long index, int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalSemaphorePropertiesKHR compatibleHandleTypesAt(long index, int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalSemaphorePropertiesKHR externalSemaphoreFeaturesAt(long index, int value) { VH_externalSemaphoreFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkExternalSemaphorePropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalSemaphorePropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalSemaphorePropertiesKHR exportFromImportedHandleTypes(int value) { VH_exportFromImportedHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalSemaphorePropertiesKHR compatibleHandleTypes(int value) { VH_compatibleHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalSemaphorePropertiesKHR externalSemaphoreFeatures(int value) { VH_externalSemaphoreFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalSemaphorePropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalSemaphorePropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalSemaphorePropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalSemaphorePropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _exportFromImportedHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_exportFromImportedHandleTypes, index), LAYOUT_exportFromImportedHandleTypes); }
    public MemorySegment _exportFromImportedHandleTypes() { return _exportFromImportedHandleTypesAt(0L); }
    public VkExternalSemaphorePropertiesKHR _exportFromImportedHandleTypesAt(long index, MemorySegment src) { _exportFromImportedHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalSemaphorePropertiesKHR _exportFromImportedHandleTypes(MemorySegment src) { return _exportFromImportedHandleTypesAt(0L, src); }
    public MemorySegment _compatibleHandleTypesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_compatibleHandleTypes, index), LAYOUT_compatibleHandleTypes); }
    public MemorySegment _compatibleHandleTypes() { return _compatibleHandleTypesAt(0L); }
    public VkExternalSemaphorePropertiesKHR _compatibleHandleTypesAt(long index, MemorySegment src) { _compatibleHandleTypesAt(index).copyFrom(src); return this; }
    public VkExternalSemaphorePropertiesKHR _compatibleHandleTypes(MemorySegment src) { return _compatibleHandleTypesAt(0L, src); }
    public MemorySegment _externalSemaphoreFeaturesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalSemaphoreFeatures, index), LAYOUT_externalSemaphoreFeatures); }
    public MemorySegment _externalSemaphoreFeatures() { return _externalSemaphoreFeaturesAt(0L); }
    public VkExternalSemaphorePropertiesKHR _externalSemaphoreFeaturesAt(long index, MemorySegment src) { _externalSemaphoreFeaturesAt(index).copyFrom(src); return this; }
    public VkExternalSemaphorePropertiesKHR _externalSemaphoreFeatures(MemorySegment src) { return _externalSemaphoreFeaturesAt(0L, src); }
}
