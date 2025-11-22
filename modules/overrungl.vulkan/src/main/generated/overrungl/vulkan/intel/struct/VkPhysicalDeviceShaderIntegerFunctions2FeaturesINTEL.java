// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.intel.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderIntegerFunctions2;
/// }
/// ```
public final class VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderIntegerFunctions2")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderIntegerFunctions2 = LAYOUT.byteOffset(PathElement.groupElement("shaderIntegerFunctions2"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderIntegerFunctions2 = LAYOUT.select(PathElement.groupElement("shaderIntegerFunctions2"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderIntegerFunctions2 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderIntegerFunctions2"));

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.intel.VKINTELShaderIntegerFunctions2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL); }
    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.intel.VKINTELShaderIntegerFunctions2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL);
        return s;
    }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL copyFrom(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL reinterpret(long count) { return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL asSlice(long index) { return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL asSlice(long index, long count) { return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL at(long index, Consumer<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderIntegerFunctions2At(long index) { return (int) VH_shaderIntegerFunctions2.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderIntegerFunctions2() { return (int) VH_shaderIntegerFunctions2.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL shaderIntegerFunctions2At(long index, int value) { VH_shaderIntegerFunctions2.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL shaderIntegerFunctions2(int value) { VH_shaderIntegerFunctions2.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderIntegerFunctions2At(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderIntegerFunctions2, index), LAYOUT_shaderIntegerFunctions2); }
    public MemorySegment _shaderIntegerFunctions2() { return _shaderIntegerFunctions2At(0L); }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL _shaderIntegerFunctions2At(long index, MemorySegment src) { _shaderIntegerFunctions2At(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL _shaderIntegerFunctions2(MemorySegment src) { return _shaderIntegerFunctions2At(0L, src); }
}
