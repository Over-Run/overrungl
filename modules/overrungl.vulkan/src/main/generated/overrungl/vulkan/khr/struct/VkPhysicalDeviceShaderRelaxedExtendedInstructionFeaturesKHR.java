// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderRelaxedExtendedInstruction;
/// }
/// ```
public final class VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderRelaxedExtendedInstruction")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderRelaxedExtendedInstruction = LAYOUT.byteOffset(PathElement.groupElement("shaderRelaxedExtendedInstruction"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderRelaxedExtendedInstruction = LAYOUT.select(PathElement.groupElement("shaderRelaxedExtendedInstruction"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderRelaxedExtendedInstruction = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderRelaxedExtendedInstruction"));

    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRShaderRelaxedExtendedInstruction.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR); }
    public static VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRShaderRelaxedExtendedInstruction.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR);
        return s;
    }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR copyFrom(VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderRelaxedExtendedInstructionAt(long index) { return (int) VH_shaderRelaxedExtendedInstruction.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderRelaxedExtendedInstruction() { return (int) VH_shaderRelaxedExtendedInstruction.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR shaderRelaxedExtendedInstructionAt(long index, int value) { VH_shaderRelaxedExtendedInstruction.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR shaderRelaxedExtendedInstruction(int value) { VH_shaderRelaxedExtendedInstruction.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderRelaxedExtendedInstructionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderRelaxedExtendedInstruction, index), LAYOUT_shaderRelaxedExtendedInstruction); }
    public MemorySegment _shaderRelaxedExtendedInstruction() { return _shaderRelaxedExtendedInstructionAt(0L); }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR _shaderRelaxedExtendedInstructionAt(long index, MemorySegment src) { _shaderRelaxedExtendedInstructionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderRelaxedExtendedInstructionFeaturesKHR _shaderRelaxedExtendedInstruction(MemorySegment src) { return _shaderRelaxedExtendedInstructionAt(0L, src); }
}
