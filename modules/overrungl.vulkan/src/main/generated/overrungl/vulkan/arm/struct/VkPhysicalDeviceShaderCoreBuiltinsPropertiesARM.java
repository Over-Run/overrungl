// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM {
///     VkStructureType sType;
///     void* pNext;
///     uint64_t shaderCoreMask;
///     uint32_t shaderCoreCount;
///     uint32_t shaderWarpsPerCore;
/// }
/// ```
public final class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("shaderCoreMask"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount"),
        ValueLayout.JAVA_INT.withName("shaderWarpsPerCore")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderCoreMask = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreMask"));
    public static final long OFFSET_shaderCoreCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreCount"));
    public static final long OFFSET_shaderWarpsPerCore = LAYOUT.byteOffset(PathElement.groupElement("shaderWarpsPerCore"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderCoreMask = LAYOUT.select(PathElement.groupElement("shaderCoreMask"));
    public static final MemoryLayout LAYOUT_shaderCoreCount = LAYOUT.select(PathElement.groupElement("shaderCoreCount"));
    public static final MemoryLayout LAYOUT_shaderWarpsPerCore = LAYOUT.select(PathElement.groupElement("shaderWarpsPerCore"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderCoreMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreMask"));
    public static final VarHandle VH_shaderCoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreCount"));
    public static final VarHandle VH_shaderWarpsPerCore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderWarpsPerCore"));

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM); }
    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
        return s;
    }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM copyFrom(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM reinterpret(long count) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM asSlice(long index) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM asSlice(long index, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM at(long index, Consumer<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long shaderCoreMaskAt(long index) { return (long) VH_shaderCoreMask.get(this.segment(), 0L, index); }
    public int shaderCoreCountAt(long index) { return (int) VH_shaderCoreCount.get(this.segment(), 0L, index); }
    public int shaderWarpsPerCoreAt(long index) { return (int) VH_shaderWarpsPerCore.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long shaderCoreMask() { return (long) VH_shaderCoreMask.get(this.segment(), 0L, 0L); }
    public int shaderCoreCount() { return (int) VH_shaderCoreCount.get(this.segment(), 0L, 0L); }
    public int shaderWarpsPerCore() { return (int) VH_shaderWarpsPerCore.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreMaskAt(long index, long value) { VH_shaderCoreMask.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreCountAt(long index, int value) { VH_shaderCoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderWarpsPerCoreAt(long index, int value) { VH_shaderWarpsPerCore.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreMask(long value) { VH_shaderCoreMask.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderCoreCount(int value) { VH_shaderCoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM shaderWarpsPerCore(int value) { VH_shaderWarpsPerCore.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderCoreMaskAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCoreMask, index), LAYOUT_shaderCoreMask); }
    public MemorySegment _shaderCoreMask() { return _shaderCoreMaskAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _shaderCoreMaskAt(long index, MemorySegment src) { _shaderCoreMaskAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _shaderCoreMask(MemorySegment src) { return _shaderCoreMaskAt(0L, src); }
    public MemorySegment _shaderCoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCoreCount, index), LAYOUT_shaderCoreCount); }
    public MemorySegment _shaderCoreCount() { return _shaderCoreCountAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _shaderCoreCountAt(long index, MemorySegment src) { _shaderCoreCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _shaderCoreCount(MemorySegment src) { return _shaderCoreCountAt(0L, src); }
    public MemorySegment _shaderWarpsPerCoreAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderWarpsPerCore, index), LAYOUT_shaderWarpsPerCore); }
    public MemorySegment _shaderWarpsPerCore() { return _shaderWarpsPerCoreAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _shaderWarpsPerCoreAt(long index, MemorySegment src) { _shaderWarpsPerCoreAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM _shaderWarpsPerCore(MemorySegment src) { return _shaderWarpsPerCoreAt(0L, src); }
}
