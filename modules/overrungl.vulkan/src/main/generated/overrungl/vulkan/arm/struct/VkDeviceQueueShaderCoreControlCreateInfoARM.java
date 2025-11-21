// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.arm.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceQueueShaderCoreControlCreateInfoARM`.
/// ## Layout
/// ```
/// struct VkDeviceQueueShaderCoreControlCreateInfoARM {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderCoreCount;
/// }
/// ```
public final class VkDeviceQueueShaderCoreControlCreateInfoARM extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCoreCount")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderCoreCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCoreCount"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderCoreCount = LAYOUT.select(PathElement.groupElement("shaderCoreCount"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderCoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCoreCount"));

    public VkDeviceQueueShaderCoreControlCreateInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueShaderCoreControlCreateInfoARM(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueShaderCoreControlCreateInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceQueueShaderCoreControlCreateInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM alloc(SegmentAllocator allocator) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM alloc(SegmentAllocator allocator, long count) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(allocator.allocate(LAYOUT, count), count); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.arm.VKARMSchedulingControls.VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM); }
    public static VkDeviceQueueShaderCoreControlCreateInfoARM allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.arm.VKARMSchedulingControls.VK_STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM);
        return s;
    }
    public VkDeviceQueueShaderCoreControlCreateInfoARM copyFrom(VkDeviceQueueShaderCoreControlCreateInfoARM src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM reinterpret(long count) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM asSlice(long index) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM asSlice(long index, long count) { return new VkDeviceQueueShaderCoreControlCreateInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM at(long index, Consumer<VkDeviceQueueShaderCoreControlCreateInfoARM> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderCoreCountAt(long index) { return (int) VH_shaderCoreCount.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderCoreCount() { return (int) VH_shaderCoreCount.get(this.segment(), 0L, 0L); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM shaderCoreCountAt(long index, int value) { VH_shaderCoreCount.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM shaderCoreCount(int value) { VH_shaderCoreCount.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderCoreCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCoreCount, index), LAYOUT_shaderCoreCount); }
    public MemorySegment _shaderCoreCount() { return _shaderCoreCountAt(0L); }
    public VkDeviceQueueShaderCoreControlCreateInfoARM _shaderCoreCountAt(long index, MemorySegment src) { _shaderCoreCountAt(index).copyFrom(src); return this; }
    public VkDeviceQueueShaderCoreControlCreateInfoARM _shaderCoreCount(MemorySegment src) { return _shaderCoreCountAt(0L, src); }
}
