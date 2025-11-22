// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkGeneratedCommandsShaderInfoEXT`.
/// ## Layout
/// ```
/// struct VkGeneratedCommandsShaderInfoEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderCount;
///     const VkShaderEXT* pShaders;
/// }
/// ```
public final class VkGeneratedCommandsShaderInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderCount"),
        ValueLayout.ADDRESS.withName("pShaders")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_shaderCount = LAYOUT.byteOffset(PathElement.groupElement("shaderCount"));
    public static final long OFFSET_pShaders = LAYOUT.byteOffset(PathElement.groupElement("pShaders"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_shaderCount = LAYOUT.select(PathElement.groupElement("shaderCount"));
    public static final MemoryLayout LAYOUT_pShaders = LAYOUT.select(PathElement.groupElement("pShaders"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_shaderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderCount"));
    public static final VarHandle VH_pShaders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaders"));

    public VkGeneratedCommandsShaderInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkGeneratedCommandsShaderInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkGeneratedCommandsShaderInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkGeneratedCommandsShaderInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkGeneratedCommandsShaderInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkGeneratedCommandsShaderInfoEXT alloc(SegmentAllocator allocator) { return new VkGeneratedCommandsShaderInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkGeneratedCommandsShaderInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkGeneratedCommandsShaderInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkGeneratedCommandsShaderInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT); }
    public static VkGeneratedCommandsShaderInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT);
        return s;
    }
    public VkGeneratedCommandsShaderInfoEXT copyFrom(VkGeneratedCommandsShaderInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkGeneratedCommandsShaderInfoEXT reinterpret(long count) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkGeneratedCommandsShaderInfoEXT asSlice(long index) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkGeneratedCommandsShaderInfoEXT asSlice(long index, long count) { return new VkGeneratedCommandsShaderInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkGeneratedCommandsShaderInfoEXT at(long index, Consumer<VkGeneratedCommandsShaderInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int shaderCountAt(long index) { return (int) VH_shaderCount.get(this.segment(), 0L, index); }
    public MemorySegment pShadersAt(long index) { return (MemorySegment) VH_pShaders.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int shaderCount() { return (int) VH_shaderCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pShaders() { return (MemorySegment) VH_pShaders.get(this.segment(), 0L, 0L); }
    public VkGeneratedCommandsShaderInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT shaderCountAt(long index, int value) { VH_shaderCount.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT pShadersAt(long index, MemorySegment value) { VH_pShaders.set(this.segment(), 0L, index, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT shaderCount(int value) { VH_shaderCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkGeneratedCommandsShaderInfoEXT pShaders(MemorySegment value) { VH_pShaders.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkGeneratedCommandsShaderInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsShaderInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkGeneratedCommandsShaderInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsShaderInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _shaderCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_shaderCount, index), LAYOUT_shaderCount); }
    public MemorySegment _shaderCount() { return _shaderCountAt(0L); }
    public VkGeneratedCommandsShaderInfoEXT _shaderCountAt(long index, MemorySegment src) { _shaderCountAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsShaderInfoEXT _shaderCount(MemorySegment src) { return _shaderCountAt(0L, src); }
    public MemorySegment _pShadersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pShaders, index), LAYOUT_pShaders); }
    public MemorySegment _pShaders() { return _pShadersAt(0L); }
    public VkGeneratedCommandsShaderInfoEXT _pShadersAt(long index, MemorySegment src) { _pShadersAt(index).copyFrom(src); return this; }
    public VkGeneratedCommandsShaderInfoEXT _pShaders(MemorySegment src) { return _pShadersAt(0L, src); }
}
