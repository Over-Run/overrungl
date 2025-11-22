// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSMBuiltinsPropertiesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderSMCount;
///     uint32_t shaderWarpsPerSM;
/// }
/// ```
public final class VkPhysicalDeviceShaderSMBuiltinsPropertiesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSMCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerSM")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderSMCount = LAYOUT.byteOffset(PathElement.groupElement("shaderSMCount"));
    public static final long OFFSET_shaderWarpsPerSM = LAYOUT.byteOffset(PathElement.groupElement("shaderWarpsPerSM"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderSMCount = LAYOUT.select(PathElement.groupElement("shaderSMCount"));
    public static final MemoryLayout LAYOUT_shaderWarpsPerSM = LAYOUT.select(PathElement.groupElement("shaderWarpsPerSM"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderSMCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSMCount"));
    public static final VarHandle VH_shaderWarpsPerSM = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderWarpsPerSM"));

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV); }
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV);
        return s;
    }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV copyFrom(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV asSlice(long index) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV at(long index, Consumer<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSMCountAt(long index) { return (int) VH_shaderSMCount.get(this.segment(), 0L, index); }
    public int shaderWarpsPerSMAt(long index) { return (int) VH_shaderWarpsPerSM.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSMCount() { return (int) VH_shaderSMCount.get(this.segment(), 0L, 0L); }
    public int shaderWarpsPerSM() { return (int) VH_shaderWarpsPerSM.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderSMCountAt(long index, int value) { VH_shaderSMCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderWarpsPerSMAt(long index, int value) { VH_shaderWarpsPerSM.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderSMCount(int value) { VH_shaderSMCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV shaderWarpsPerSM(int value) { VH_shaderWarpsPerSM.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSMCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSMCount, index), LAYOUT_shaderSMCount); }
    public MemorySegment _shaderSMCount() { return _shaderSMCountAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _shaderSMCountAt(long index, MemorySegment src) { _shaderSMCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _shaderSMCount(MemorySegment src) { return _shaderSMCountAt(0L, src); }
    public MemorySegment _shaderWarpsPerSMAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderWarpsPerSM, index), LAYOUT_shaderWarpsPerSM); }
    public MemorySegment _shaderWarpsPerSM() { return _shaderWarpsPerSMAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _shaderWarpsPerSMAt(long index, MemorySegment src) { _shaderWarpsPerSMAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV _shaderWarpsPerSM(MemorySegment src) { return _shaderWarpsPerSMAt(0L, src); }
}
