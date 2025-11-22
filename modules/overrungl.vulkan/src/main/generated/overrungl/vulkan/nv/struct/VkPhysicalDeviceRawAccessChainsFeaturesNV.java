// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceRawAccessChainsFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceRawAccessChainsFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderRawAccessChains;
/// }
/// ```
public final class VkPhysicalDeviceRawAccessChainsFeaturesNV extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderRawAccessChains")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderRawAccessChains = LAYOUT.byteOffset(PathElement.groupElement("shaderRawAccessChains"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderRawAccessChains = LAYOUT.select(PathElement.groupElement("shaderRawAccessChains"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderRawAccessChains = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRawAccessChains"));

    public VkPhysicalDeviceRawAccessChainsFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRawAccessChainsFeaturesNV(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRawAccessChainsFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceRawAccessChainsFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceRawAccessChainsFeaturesNV(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceRawAccessChainsFeaturesNV(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nv.VKNVRawAccessChains.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV); }
    public static VkPhysicalDeviceRawAccessChainsFeaturesNV allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nv.VKNVRawAccessChains.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV);
        return s;
    }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV copyFrom(VkPhysicalDeviceRawAccessChainsFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceRawAccessChainsFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV asSlice(long index) { return new VkPhysicalDeviceRawAccessChainsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceRawAccessChainsFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV at(long index, Consumer<VkPhysicalDeviceRawAccessChainsFeaturesNV> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderRawAccessChainsAt(long index) { return (int) VH_shaderRawAccessChains.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderRawAccessChains() { return (int) VH_shaderRawAccessChains.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV shaderRawAccessChainsAt(long index, int value) { VH_shaderRawAccessChains.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV shaderRawAccessChains(int value) { VH_shaderRawAccessChains.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderRawAccessChainsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRawAccessChains, index), LAYOUT_shaderRawAccessChains); }
    public MemorySegment _shaderRawAccessChains() { return _shaderRawAccessChainsAt(0L); }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV _shaderRawAccessChainsAt(long index, MemorySegment src) { _shaderRawAccessChainsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceRawAccessChainsFeaturesNV _shaderRawAccessChains(MemorySegment src) { return _shaderRawAccessChainsAt(0L, src); }
}
