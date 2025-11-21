// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderCoreBuiltins;
/// }
/// ```
public final class VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreBuiltins")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderCoreBuiltins = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreBuiltins"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderCoreBuiltins = LAYOUT.select(PathElement.groupElement("shaderCoreBuiltins"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderCoreBuiltins = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreBuiltins"));

    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM); }
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM);
        return s;
    }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM copyFrom(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM asSlice(long index) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM at(long index, Consumer<VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderCoreBuiltinsAt(long index) { return (int) VH_shaderCoreBuiltins.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderCoreBuiltins() { return (int) VH_shaderCoreBuiltins.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM shaderCoreBuiltinsAt(long index, int value) { VH_shaderCoreBuiltins.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM shaderCoreBuiltins(int value) { VH_shaderCoreBuiltins.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderCoreBuiltinsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCoreBuiltins, index), LAYOUT_shaderCoreBuiltins); }
    public MemorySegment _shaderCoreBuiltins() { return _shaderCoreBuiltinsAt(0L); }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM _shaderCoreBuiltinsAt(long index, MemorySegment src) { _shaderCoreBuiltinsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM _shaderCoreBuiltins(MemorySegment src) { return _shaderCoreBuiltinsAt(0L, src); }
}
