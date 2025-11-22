// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t shaderModuleIdentifierAlgorithmUUID[VK_UUID_SIZE];
/// }
/// ```
public final class VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("shaderModuleIdentifierAlgorithmUUID")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderModuleIdentifierAlgorithmUUID = LAYOUT.byteOffset(PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderModuleIdentifierAlgorithmUUID = LAYOUT.select(PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderModuleIdentifierAlgorithmUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderModuleIdentifierAlgorithmUUID"), PathElement.sequenceElement());

    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT); }
    public static VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT);
        return s;
    }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT copyFrom(VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT reinterpret(long count) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT asSlice(long index, long count) { return new VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT at(long index, Consumer<VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public byte shaderModuleIdentifierAlgorithmUUIDAt(long index, long index0) { return (byte) VH_shaderModuleIdentifierAlgorithmUUID.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public byte shaderModuleIdentifierAlgorithmUUID(long index0) { return (byte) VH_shaderModuleIdentifierAlgorithmUUID.get(this.segment(), 0L, 0L, index0); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT shaderModuleIdentifierAlgorithmUUIDAt(long index, long index0, byte value) { VH_shaderModuleIdentifierAlgorithmUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT shaderModuleIdentifierAlgorithmUUID(long index0, byte value) { VH_shaderModuleIdentifierAlgorithmUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderModuleIdentifierAlgorithmUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderModuleIdentifierAlgorithmUUID, index), LAYOUT_shaderModuleIdentifierAlgorithmUUID); }
    public MemorySegment _shaderModuleIdentifierAlgorithmUUID() { return _shaderModuleIdentifierAlgorithmUUIDAt(0L); }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT _shaderModuleIdentifierAlgorithmUUIDAt(long index, MemorySegment src) { _shaderModuleIdentifierAlgorithmUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT _shaderModuleIdentifierAlgorithmUUID(MemorySegment src) { return _shaderModuleIdentifierAlgorithmUUIDAt(0L, src); }
}
