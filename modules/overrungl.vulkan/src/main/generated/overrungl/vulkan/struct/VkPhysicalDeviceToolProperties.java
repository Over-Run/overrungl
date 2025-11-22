// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceToolProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceToolProperties {
///     VkStructureType sType;
///     void* pNext;
///     char name[VK_MAX_EXTENSION_NAME_SIZE];
///     char version[VK_MAX_EXTENSION_NAME_SIZE];
///     VkToolPurposeFlags purposes;
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     char layer[VK_MAX_EXTENSION_NAME_SIZE];
/// }
/// ```
public final class VkPhysicalDeviceToolProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("version"),
        ValueLayout.JAVA_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layer")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_name = LAYOUT.byteOffset(PathElement.groupElement("name"));
    public static final long OFFSET_version = LAYOUT.byteOffset(PathElement.groupElement("version"));
    public static final long OFFSET_purposes = LAYOUT.byteOffset(PathElement.groupElement("purposes"));
    public static final long OFFSET_description = LAYOUT.byteOffset(PathElement.groupElement("description"));
    public static final long OFFSET_layer = LAYOUT.byteOffset(PathElement.groupElement("layer"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_name = LAYOUT.select(PathElement.groupElement("name"));
    public static final MemoryLayout LAYOUT_version = LAYOUT.select(PathElement.groupElement("version"));
    public static final MemoryLayout LAYOUT_purposes = LAYOUT.select(PathElement.groupElement("purposes"));
    public static final MemoryLayout LAYOUT_description = LAYOUT.select(PathElement.groupElement("description"));
    public static final MemoryLayout LAYOUT_layer = LAYOUT.select(PathElement.groupElement("layer"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_name = LAYOUT.arrayElementVarHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
    public static final VarHandle VH_version = LAYOUT.arrayElementVarHandle(PathElement.groupElement("version"), PathElement.sequenceElement());
    public static final VarHandle VH_purposes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("purposes"));
    public static final VarHandle VH_description = LAYOUT.arrayElementVarHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
    public static final VarHandle VH_layer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layer"), PathElement.sequenceElement());

    public VkPhysicalDeviceToolProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceToolProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceToolProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceToolProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceToolProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceToolProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceToolProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceToolProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceToolProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceToolProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceToolProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceToolProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES); }
    public static VkPhysicalDeviceToolProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceToolProperties copyFrom(VkPhysicalDeviceToolProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceToolProperties reinterpret(long count) { return new VkPhysicalDeviceToolProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceToolProperties asSlice(long index) { return new VkPhysicalDeviceToolProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceToolProperties asSlice(long index, long count) { return new VkPhysicalDeviceToolProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceToolProperties at(long index, Consumer<VkPhysicalDeviceToolProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte nameAt(long index, long index0) { return (byte) VH_name.get(this.segment(), 0L, index, index0); }
    public byte versionAt(long index, long index0) { return (byte) VH_version.get(this.segment(), 0L, index, index0); }
    public int purposesAt(long index) { return (int) VH_purposes.get(this.segment(), 0L, index); }
    public byte descriptionAt(long index, long index0) { return (byte) VH_description.get(this.segment(), 0L, index, index0); }
    public byte layerAt(long index, long index0) { return (byte) VH_layer.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte name(long index0) { return (byte) VH_name.get(this.segment(), 0L, 0L, index0); }
    public byte version(long index0) { return (byte) VH_version.get(this.segment(), 0L, 0L, index0); }
    public int purposes() { return (int) VH_purposes.get(this.segment(), 0L, 0L); }
    public byte description(long index0) { return (byte) VH_description.get(this.segment(), 0L, 0L, index0); }
    public byte layer(long index0) { return (byte) VH_layer.get(this.segment(), 0L, 0L, index0); }
    public VkPhysicalDeviceToolProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceToolProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceToolProperties nameAt(long index, long index0, byte value) { VH_name.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceToolProperties versionAt(long index, long index0, byte value) { VH_version.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceToolProperties purposesAt(long index, int value) { VH_purposes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceToolProperties descriptionAt(long index, long index0, byte value) { VH_description.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceToolProperties layerAt(long index, long index0, byte value) { VH_layer.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceToolProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceToolProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceToolProperties name(long index0, byte value) { VH_name.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceToolProperties version(long index0, byte value) { VH_version.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceToolProperties purposes(int value) { VH_purposes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceToolProperties description(long index0, byte value) { VH_description.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceToolProperties layer(long index0, byte value) { VH_layer.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceToolProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceToolProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _nameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_name, index), LAYOUT_name); }
    public MemorySegment _name() { return _nameAt(0L); }
    public VkPhysicalDeviceToolProperties _nameAt(long index, MemorySegment src) { _nameAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _name(MemorySegment src) { return _nameAt(0L, src); }
    public MemorySegment _versionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_version, index), LAYOUT_version); }
    public MemorySegment _version() { return _versionAt(0L); }
    public VkPhysicalDeviceToolProperties _versionAt(long index, MemorySegment src) { _versionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _version(MemorySegment src) { return _versionAt(0L, src); }
    public MemorySegment _purposesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_purposes, index), LAYOUT_purposes); }
    public MemorySegment _purposes() { return _purposesAt(0L); }
    public VkPhysicalDeviceToolProperties _purposesAt(long index, MemorySegment src) { _purposesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _purposes(MemorySegment src) { return _purposesAt(0L, src); }
    public MemorySegment _descriptionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_description, index), LAYOUT_description); }
    public MemorySegment _description() { return _descriptionAt(0L); }
    public VkPhysicalDeviceToolProperties _descriptionAt(long index, MemorySegment src) { _descriptionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _description(MemorySegment src) { return _descriptionAt(0L, src); }
    public MemorySegment _layerAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_layer, index), LAYOUT_layer); }
    public MemorySegment _layer() { return _layerAt(0L); }
    public VkPhysicalDeviceToolProperties _layerAt(long index, MemorySegment src) { _layerAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceToolProperties _layer(MemorySegment src) { return _layerAt(0L, src); }
}
