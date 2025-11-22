// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkRayTracingShaderGroupCreateInfoKHR`.
/// ## Layout
/// ```
/// struct VkRayTracingShaderGroupCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkRayTracingShaderGroupTypeKHR type;
///     uint32_t generalShader;
///     uint32_t closestHitShader;
///     uint32_t anyHitShader;
///     uint32_t intersectionShader;
///     const void* pShaderGroupCaptureReplayHandle;
/// }
/// ```
public final class VkRayTracingShaderGroupCreateInfoKHR extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader"),
        ValueLayout.ADDRESS.withName("pShaderGroupCaptureReplayHandle")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    public static final long OFFSET_generalShader = LAYOUT.byteOffset(PathElement.groupElement("generalShader"));
    public static final long OFFSET_closestHitShader = LAYOUT.byteOffset(PathElement.groupElement("closestHitShader"));
    public static final long OFFSET_anyHitShader = LAYOUT.byteOffset(PathElement.groupElement("anyHitShader"));
    public static final long OFFSET_intersectionShader = LAYOUT.byteOffset(PathElement.groupElement("intersectionShader"));
    public static final long OFFSET_pShaderGroupCaptureReplayHandle = LAYOUT.byteOffset(PathElement.groupElement("pShaderGroupCaptureReplayHandle"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    public static final MemoryLayout LAYOUT_generalShader = LAYOUT.select(PathElement.groupElement("generalShader"));
    public static final MemoryLayout LAYOUT_closestHitShader = LAYOUT.select(PathElement.groupElement("closestHitShader"));
    public static final MemoryLayout LAYOUT_anyHitShader = LAYOUT.select(PathElement.groupElement("anyHitShader"));
    public static final MemoryLayout LAYOUT_intersectionShader = LAYOUT.select(PathElement.groupElement("intersectionShader"));
    public static final MemoryLayout LAYOUT_pShaderGroupCaptureReplayHandle = LAYOUT.select(PathElement.groupElement("pShaderGroupCaptureReplayHandle"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    public static final VarHandle VH_generalShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generalShader"));
    public static final VarHandle VH_closestHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("closestHitShader"));
    public static final VarHandle VH_anyHitShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("anyHitShader"));
    public static final VarHandle VH_intersectionShader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intersectionShader"));
    public static final VarHandle VH_pShaderGroupCaptureReplayHandle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pShaderGroupCaptureReplayHandle"));

    public VkRayTracingShaderGroupCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkRayTracingShaderGroupCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }
    public static VkRayTracingShaderGroupCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkRayTracingShaderGroupCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkRayTracingShaderGroupCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkRayTracingShaderGroupCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkRayTracingShaderGroupCreateInfoKHR(allocator.allocate(LAYOUT), 1); }
    public static VkRayTracingShaderGroupCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkRayTracingShaderGroupCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }
    public static VkRayTracingShaderGroupCreateInfoKHR allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR); }
    public static VkRayTracingShaderGroupCreateInfoKHR allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.khr.VKKHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
        return s;
    }
    public VkRayTracingShaderGroupCreateInfoKHR copyFrom(VkRayTracingShaderGroupCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR reinterpret(long count) { return new VkRayTracingShaderGroupCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkRayTracingShaderGroupCreateInfoKHR asSlice(long index) { return new VkRayTracingShaderGroupCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkRayTracingShaderGroupCreateInfoKHR asSlice(long index, long count) { return new VkRayTracingShaderGroupCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkRayTracingShaderGroupCreateInfoKHR at(long index, Consumer<VkRayTracingShaderGroupCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int typeAt(long index) { return (int) VH_type.get(this.segment(), 0L, index); }
    public int generalShaderAt(long index) { return (int) VH_generalShader.get(this.segment(), 0L, index); }
    public int closestHitShaderAt(long index) { return (int) VH_closestHitShader.get(this.segment(), 0L, index); }
    public int anyHitShaderAt(long index) { return (int) VH_anyHitShader.get(this.segment(), 0L, index); }
    public int intersectionShaderAt(long index) { return (int) VH_intersectionShader.get(this.segment(), 0L, index); }
    public MemorySegment pShaderGroupCaptureReplayHandleAt(long index) { return (MemorySegment) VH_pShaderGroupCaptureReplayHandle.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int type() { return (int) VH_type.get(this.segment(), 0L, 0L); }
    public int generalShader() { return (int) VH_generalShader.get(this.segment(), 0L, 0L); }
    public int closestHitShader() { return (int) VH_closestHitShader.get(this.segment(), 0L, 0L); }
    public int anyHitShader() { return (int) VH_anyHitShader.get(this.segment(), 0L, 0L); }
    public int intersectionShader() { return (int) VH_intersectionShader.get(this.segment(), 0L, 0L); }
    public MemorySegment pShaderGroupCaptureReplayHandle() { return (MemorySegment) VH_pShaderGroupCaptureReplayHandle.get(this.segment(), 0L, 0L); }
    public VkRayTracingShaderGroupCreateInfoKHR sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR typeAt(long index, int value) { VH_type.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR generalShaderAt(long index, int value) { VH_generalShader.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShaderAt(long index, int value) { VH_closestHitShader.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShaderAt(long index, int value) { VH_anyHitShader.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShaderAt(long index, int value) { VH_intersectionShader.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandleAt(long index, MemorySegment value) { VH_pShaderGroupCaptureReplayHandle.set(this.segment(), 0L, index, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR type(int value) { VH_type.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR generalShader(int value) { VH_generalShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR closestHitShader(int value) { VH_closestHitShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR anyHitShader(int value) { VH_anyHitShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR intersectionShader(int value) { VH_intersectionShader.set(this.segment(), 0L, 0L, value); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(MemorySegment value) { VH_pShaderGroupCaptureReplayHandle.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _typeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_type, index), LAYOUT_type); }
    public MemorySegment _type() { return _typeAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _typeAt(long index, MemorySegment src) { _typeAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _type(MemorySegment src) { return _typeAt(0L, src); }
    public MemorySegment _generalShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_generalShader, index), LAYOUT_generalShader); }
    public MemorySegment _generalShader() { return _generalShaderAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _generalShaderAt(long index, MemorySegment src) { _generalShaderAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _generalShader(MemorySegment src) { return _generalShaderAt(0L, src); }
    public MemorySegment _closestHitShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_closestHitShader, index), LAYOUT_closestHitShader); }
    public MemorySegment _closestHitShader() { return _closestHitShaderAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _closestHitShaderAt(long index, MemorySegment src) { _closestHitShaderAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _closestHitShader(MemorySegment src) { return _closestHitShaderAt(0L, src); }
    public MemorySegment _anyHitShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_anyHitShader, index), LAYOUT_anyHitShader); }
    public MemorySegment _anyHitShader() { return _anyHitShaderAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _anyHitShaderAt(long index, MemorySegment src) { _anyHitShaderAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _anyHitShader(MemorySegment src) { return _anyHitShaderAt(0L, src); }
    public MemorySegment _intersectionShaderAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_intersectionShader, index), LAYOUT_intersectionShader); }
    public MemorySegment _intersectionShader() { return _intersectionShaderAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _intersectionShaderAt(long index, MemorySegment src) { _intersectionShaderAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _intersectionShader(MemorySegment src) { return _intersectionShaderAt(0L, src); }
    public MemorySegment _pShaderGroupCaptureReplayHandleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pShaderGroupCaptureReplayHandle, index), LAYOUT_pShaderGroupCaptureReplayHandle); }
    public MemorySegment _pShaderGroupCaptureReplayHandle() { return _pShaderGroupCaptureReplayHandleAt(0L); }
    public VkRayTracingShaderGroupCreateInfoKHR _pShaderGroupCaptureReplayHandleAt(long index, MemorySegment src) { _pShaderGroupCaptureReplayHandleAt(index).copyFrom(src); return this; }
    public VkRayTracingShaderGroupCreateInfoKHR _pShaderGroupCaptureReplayHandle(MemorySegment src) { return _pShaderGroupCaptureReplayHandleAt(0L, src); }
}
