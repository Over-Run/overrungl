// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderSMBuiltinsFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderSMBuiltinsFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSMBuiltins;
/// }
/// ```
public final class VkPhysicalDeviceShaderSMBuiltinsFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSMBuiltins")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderSMBuiltins = LAYOUT.byteOffset(PathElement.groupElement("shaderSMBuiltins"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderSMBuiltins = LAYOUT.select(PathElement.groupElement("shaderSMBuiltins"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderSMBuiltins = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSMBuiltins"));

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV); }
    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV copyFrom(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV asSlice(long index) { return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV at(long index, Consumer<VkPhysicalDeviceShaderSMBuiltinsFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderSMBuiltinsAt(long index) { return (int) VH_shaderSMBuiltins.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderSMBuiltins() { return (int) VH_shaderSMBuiltins.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV shaderSMBuiltinsAt(long index, int value) { VH_shaderSMBuiltins.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV shaderSMBuiltins(int value) { VH_shaderSMBuiltins.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderSMBuiltinsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderSMBuiltins, index), LAYOUT_shaderSMBuiltins); }
    public MemorySegment _shaderSMBuiltins() { return _shaderSMBuiltinsAt(0L); }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV _shaderSMBuiltinsAt(long index, MemorySegment src) { _shaderSMBuiltinsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV _shaderSMBuiltins(MemorySegment src) { return _shaderSMBuiltinsAt(0L, src); }
}
