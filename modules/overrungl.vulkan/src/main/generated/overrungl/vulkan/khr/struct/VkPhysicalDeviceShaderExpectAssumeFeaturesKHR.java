// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderExpectAssumeFeaturesKHR`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderExpectAssumeFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderExpectAssume;
/// }
/// ```
public final class VkPhysicalDeviceShaderExpectAssumeFeaturesKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderExpectAssume")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderExpectAssume = LAYOUT.byteOffset(PathElement.groupElement("shaderExpectAssume"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderExpectAssume = LAYOUT.select(PathElement.groupElement("shaderExpectAssume"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderExpectAssume = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderExpectAssume"));

    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES); }
    public static VkPhysicalDeviceShaderExpectAssumeFeaturesKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR copyFrom(VkPhysicalDeviceShaderExpectAssumeFeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR reinterpret(long count) { return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceShaderExpectAssumeFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR at(long index, Consumer<VkPhysicalDeviceShaderExpectAssumeFeaturesKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderExpectAssumeAt(long index) { return (int) VH_shaderExpectAssume.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderExpectAssume() { return (int) VH_shaderExpectAssume.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR shaderExpectAssumeAt(long index, int value) { VH_shaderExpectAssume.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR shaderExpectAssume(int value) { VH_shaderExpectAssume.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderExpectAssumeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderExpectAssume, index), LAYOUT_shaderExpectAssume); }
    public MemorySegment _shaderExpectAssume() { return _shaderExpectAssumeAt(0L); }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR _shaderExpectAssumeAt(long index, MemorySegment src) { _shaderExpectAssumeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderExpectAssumeFeaturesKHR _shaderExpectAssume(MemorySegment src) { return _shaderExpectAssumeAt(0L, src); }
}
