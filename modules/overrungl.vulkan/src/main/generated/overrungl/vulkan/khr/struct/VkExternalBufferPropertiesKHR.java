// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalBufferPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkExternalBufferPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkExternalMemoryProperties externalMemoryProperties;
/// }
/// ```
public final class VkExternalBufferPropertiesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExternalMemoryProperties.LAYOUT.withName("externalMemoryProperties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_externalMemoryProperties = LAYOUT.byteOffset(PathElement.groupElement("externalMemoryProperties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_externalMemoryProperties = LAYOUT.select(PathElement.groupElement("externalMemoryProperties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_externalMemoryProperties$externalMemoryFeatures = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryProperties"), PathElement.groupElement("externalMemoryFeatures"));
    public static final VarHandle VH_externalMemoryProperties$exportFromImportedHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryProperties"), PathElement.groupElement("exportFromImportedHandleTypes"));
    public static final VarHandle VH_externalMemoryProperties$compatibleHandleTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalMemoryProperties"), PathElement.groupElement("compatibleHandleTypes"));

    public VkExternalBufferPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalBufferPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalBufferPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalBufferPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalBufferPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalBufferPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalBufferPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalBufferPropertiesKHR alloc(SegmentAllocator allocator) { return new VkExternalBufferPropertiesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkExternalBufferPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkExternalBufferPropertiesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalBufferPropertiesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES); }
    public static VkExternalBufferPropertiesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES);
        return s;
    }
    public VkExternalBufferPropertiesKHR copyFrom(VkExternalBufferPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalBufferPropertiesKHR reinterpret(long count) { return new VkExternalBufferPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalBufferPropertiesKHR asSlice(long index) { return new VkExternalBufferPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalBufferPropertiesKHR asSlice(long index, long count) { return new VkExternalBufferPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalBufferPropertiesKHR at(long index, Consumer<VkExternalBufferPropertiesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int externalMemoryProperties$externalMemoryFeaturesAt(long index) { return (int) VH_externalMemoryProperties$externalMemoryFeatures.get(this.segment(), 0L, index); }
    public int externalMemoryProperties$exportFromImportedHandleTypesAt(long index) { return (int) VH_externalMemoryProperties$exportFromImportedHandleTypes.get(this.segment(), 0L, index); }
    public int externalMemoryProperties$compatibleHandleTypesAt(long index) { return (int) VH_externalMemoryProperties$compatibleHandleTypes.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int externalMemoryProperties$externalMemoryFeatures() { return (int) VH_externalMemoryProperties$externalMemoryFeatures.get(this.segment(), 0L, 0L); }
    public int externalMemoryProperties$exportFromImportedHandleTypes() { return (int) VH_externalMemoryProperties$exportFromImportedHandleTypes.get(this.segment(), 0L, 0L); }
    public int externalMemoryProperties$compatibleHandleTypes() { return (int) VH_externalMemoryProperties$compatibleHandleTypes.get(this.segment(), 0L, 0L); }
    public VkExternalBufferPropertiesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferPropertiesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferPropertiesKHR externalMemoryProperties$externalMemoryFeaturesAt(long index, int value) { VH_externalMemoryProperties$externalMemoryFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferPropertiesKHR externalMemoryProperties$exportFromImportedHandleTypesAt(long index, int value) { VH_externalMemoryProperties$exportFromImportedHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferPropertiesKHR externalMemoryProperties$compatibleHandleTypesAt(long index, int value) { VH_externalMemoryProperties$compatibleHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferPropertiesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferPropertiesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferPropertiesKHR externalMemoryProperties$externalMemoryFeatures(int value) { VH_externalMemoryProperties$externalMemoryFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferPropertiesKHR externalMemoryProperties$exportFromImportedHandleTypes(int value) { VH_externalMemoryProperties$exportFromImportedHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferPropertiesKHR externalMemoryProperties$compatibleHandleTypes(int value) { VH_externalMemoryProperties$compatibleHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalBufferPropertiesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalBufferPropertiesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalBufferPropertiesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalBufferPropertiesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalMemoryPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalMemoryProperties, index), LAYOUT_externalMemoryProperties); }
    public MemorySegment _externalMemoryProperties() { return _externalMemoryPropertiesAt(0L); }
    public VkExternalBufferPropertiesKHR _externalMemoryPropertiesAt(long index, MemorySegment src) { _externalMemoryPropertiesAt(index).copyFrom(src); return this; }
    public VkExternalBufferPropertiesKHR _externalMemoryProperties(MemorySegment src) { return _externalMemoryPropertiesAt(0L, src); }
}
