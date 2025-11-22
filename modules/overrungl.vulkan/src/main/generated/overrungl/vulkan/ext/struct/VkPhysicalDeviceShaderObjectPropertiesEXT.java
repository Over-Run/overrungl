// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderObjectPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderObjectPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t shaderBinaryUUID[VK_UUID_SIZE];
///     uint32_t shaderBinaryVersion;
/// }
/// ```
public final class VkPhysicalDeviceShaderObjectPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderBinaryUUID"),
        ValueLayout.JAVA_INT.withName("shaderBinaryVersion")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderBinaryUUID = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryUUID"));
    public static final long OFFSET_shaderBinaryVersion = LAYOUT.byteOffset(PathElement.groupElement("shaderBinaryVersion"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderBinaryUUID = LAYOUT.select(PathElement.groupElement("shaderBinaryUUID"));
    public static final MemoryLayout LAYOUT_shaderBinaryVersion = LAYOUT.select(PathElement.groupElement("shaderBinaryVersion"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderBinaryUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBinaryUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_shaderBinaryVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderBinaryVersion"));

    public VkPhysicalDeviceShaderObjectPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderObjectPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT); }
    public static VkPhysicalDeviceShaderObjectPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderObjectPropertiesEXT copyFrom(VkPhysicalDeviceShaderObjectPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderObjectPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT at(long index, Consumer<VkPhysicalDeviceShaderObjectPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte shaderBinaryUUIDAt(long index, long index0) { return (byte) VH_shaderBinaryUUID.get(this.segment(), 0L, index, index0); }
    public int shaderBinaryVersionAt(long index) { return (int) VH_shaderBinaryVersion.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte shaderBinaryUUID(long index0) { return (byte) VH_shaderBinaryUUID.get(this.segment(), 0L, 0L, index0); }
    public int shaderBinaryVersion() { return (int) VH_shaderBinaryVersion.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUIDAt(long index, long index0, byte value) { VH_shaderBinaryUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersionAt(long index, int value) { VH_shaderBinaryVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryUUID(long index0, byte value) { VH_shaderBinaryUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT shaderBinaryVersion(int value) { VH_shaderBinaryVersion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderBinaryUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBinaryUUID, index), LAYOUT_shaderBinaryUUID); }
    public MemorySegment _shaderBinaryUUID() { return _shaderBinaryUUIDAt(0L); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _shaderBinaryUUIDAt(long index, MemorySegment src) { _shaderBinaryUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _shaderBinaryUUID(MemorySegment src) { return _shaderBinaryUUIDAt(0L, src); }
    public MemorySegment _shaderBinaryVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderBinaryVersion, index), LAYOUT_shaderBinaryVersion); }
    public MemorySegment _shaderBinaryVersion() { return _shaderBinaryVersionAt(0L); }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _shaderBinaryVersionAt(long index, MemorySegment src) { _shaderBinaryVersionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderObjectPropertiesEXT _shaderBinaryVersion(MemorySegment src) { return _shaderBinaryVersionAt(0L, src); }
}
