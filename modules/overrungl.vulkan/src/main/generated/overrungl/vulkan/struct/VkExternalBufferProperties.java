// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkExternalBufferProperties`.
/// ## Layout
/// ```
/// struct VkExternalBufferProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkExternalMemoryProperties externalMemoryProperties;
/// }
/// ```
public final class VkExternalBufferProperties extends GroupType {
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

    public VkExternalBufferProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkExternalBufferProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalBufferProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkExternalBufferProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalBufferProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkExternalBufferProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkExternalBufferProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkExternalBufferProperties alloc(SegmentAllocator allocator) { return new VkExternalBufferProperties(allocator.allocate(LAYOUT), 1); }
    public static VkExternalBufferProperties alloc(SegmentAllocator allocator, long count) { return new VkExternalBufferProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkExternalBufferProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES); }
    public static VkExternalBufferProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES);
        return s;
    }
    public VkExternalBufferProperties copyFrom(VkExternalBufferProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkExternalBufferProperties reinterpret(long count) { return new VkExternalBufferProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkExternalBufferProperties asSlice(long index) { return new VkExternalBufferProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkExternalBufferProperties asSlice(long index, long count) { return new VkExternalBufferProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkExternalBufferProperties at(long index, Consumer<VkExternalBufferProperties> func) { func.accept(asSlice(index)); return this; }
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
    public VkExternalBufferProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferProperties externalMemoryProperties$externalMemoryFeaturesAt(long index, int value) { VH_externalMemoryProperties$externalMemoryFeatures.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferProperties externalMemoryProperties$exportFromImportedHandleTypesAt(long index, int value) { VH_externalMemoryProperties$exportFromImportedHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferProperties externalMemoryProperties$compatibleHandleTypesAt(long index, int value) { VH_externalMemoryProperties$compatibleHandleTypes.set(this.segment(), 0L, index, value); return this; }
    public VkExternalBufferProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferProperties externalMemoryProperties$externalMemoryFeatures(int value) { VH_externalMemoryProperties$externalMemoryFeatures.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferProperties externalMemoryProperties$exportFromImportedHandleTypes(int value) { VH_externalMemoryProperties$exportFromImportedHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public VkExternalBufferProperties externalMemoryProperties$compatibleHandleTypes(int value) { VH_externalMemoryProperties$compatibleHandleTypes.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkExternalBufferProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkExternalBufferProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkExternalBufferProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkExternalBufferProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _externalMemoryPropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_externalMemoryProperties, index), LAYOUT_externalMemoryProperties); }
    public MemorySegment _externalMemoryProperties() { return _externalMemoryPropertiesAt(0L); }
    public VkExternalBufferProperties _externalMemoryPropertiesAt(long index, MemorySegment src) { _externalMemoryPropertiesAt(index).copyFrom(src); return this; }
    public VkExternalBufferProperties _externalMemoryProperties(MemorySegment src) { return _externalMemoryPropertiesAt(0L, src); }
}
