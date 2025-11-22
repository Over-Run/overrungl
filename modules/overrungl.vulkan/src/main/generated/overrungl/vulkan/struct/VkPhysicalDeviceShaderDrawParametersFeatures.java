// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceShaderDrawParametersFeatures`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceShaderDrawParametersFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderDrawParameters;
/// }
/// ```
public final class VkPhysicalDeviceShaderDrawParametersFeatures extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderDrawParameters")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderDrawParameters = LAYOUT.byteOffset(PathElement.groupElement("shaderDrawParameters"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderDrawParameters = LAYOUT.select(PathElement.groupElement("shaderDrawParameters"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderDrawParameters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDrawParameters"));

    public VkPhysicalDeviceShaderDrawParametersFeatures(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDrawParametersFeatures(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDrawParametersFeatures(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderDrawParametersFeatures(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderDrawParametersFeatures(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderDrawParametersFeatures(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES); }
    public static VkPhysicalDeviceShaderDrawParametersFeatures allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES);
        return s;
    }
    public VkPhysicalDeviceShaderDrawParametersFeatures copyFrom(VkPhysicalDeviceShaderDrawParametersFeatures src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures reinterpret(long count) { return new VkPhysicalDeviceShaderDrawParametersFeatures(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceShaderDrawParametersFeatures asSlice(long index) { return new VkPhysicalDeviceShaderDrawParametersFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceShaderDrawParametersFeatures asSlice(long index, long count) { return new VkPhysicalDeviceShaderDrawParametersFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceShaderDrawParametersFeatures at(long index, Consumer<VkPhysicalDeviceShaderDrawParametersFeatures> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderDrawParametersAt(long index) { return (int) VH_shaderDrawParameters.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderDrawParameters() { return (int) VH_shaderDrawParameters.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceShaderDrawParametersFeatures sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParametersAt(long index, int value) { VH_shaderDrawParameters.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParameters(int value) { VH_shaderDrawParameters.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceShaderDrawParametersFeatures _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceShaderDrawParametersFeatures _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderDrawParametersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderDrawParameters, index), LAYOUT_shaderDrawParameters); }
    public MemorySegment _shaderDrawParameters() { return _shaderDrawParametersAt(0L); }
    public VkPhysicalDeviceShaderDrawParametersFeatures _shaderDrawParametersAt(long index, MemorySegment src) { _shaderDrawParametersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceShaderDrawParametersFeatures _shaderDrawParameters(MemorySegment src) { return _shaderDrawParametersAt(0L, src); }
}
