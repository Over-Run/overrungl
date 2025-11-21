// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceDepthStencilResolveProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceDepthStencilResolveProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkResolveModeFlags supportedDepthResolveModes;
///     VkResolveModeFlags supportedStencilResolveModes;
///     VkBool32 independentResolveNone;
///     VkBool32 independentResolve;
/// }
/// ```
public final class VkPhysicalDeviceDepthStencilResolveProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedDepthResolveModes"),
        ValueLayout.JAVA_INT.withName("supportedStencilResolveModes"),
        ValueLayout.JAVA_INT.withName("independentResolveNone"),
        ValueLayout.JAVA_INT.withName("independentResolve")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_supportedDepthResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedDepthResolveModes"));
    public static final long OFFSET_supportedStencilResolveModes = LAYOUT.byteOffset(PathElement.groupElement("supportedStencilResolveModes"));
    public static final long OFFSET_independentResolveNone = LAYOUT.byteOffset(PathElement.groupElement("independentResolveNone"));
    public static final long OFFSET_independentResolve = LAYOUT.byteOffset(PathElement.groupElement("independentResolve"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_supportedDepthResolveModes = LAYOUT.select(PathElement.groupElement("supportedDepthResolveModes"));
    public static final MemoryLayout LAYOUT_supportedStencilResolveModes = LAYOUT.select(PathElement.groupElement("supportedStencilResolveModes"));
    public static final MemoryLayout LAYOUT_independentResolveNone = LAYOUT.select(PathElement.groupElement("independentResolveNone"));
    public static final MemoryLayout LAYOUT_independentResolve = LAYOUT.select(PathElement.groupElement("independentResolve"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_supportedDepthResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedDepthResolveModes"));
    public static final VarHandle VH_supportedStencilResolveModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedStencilResolveModes"));
    public static final VarHandle VH_independentResolveNone = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolveNone"));
    public static final VarHandle VH_independentResolve = LAYOUT.arrayElementVarHandle(PathElement.groupElement("independentResolve"));

    public VkPhysicalDeviceDepthStencilResolveProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceDepthStencilResolveProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceDepthStencilResolveProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceDepthStencilResolveProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceDepthStencilResolveProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceDepthStencilResolveProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDepthStencilResolveProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceDepthStencilResolveProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDepthStencilResolveProperties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceDepthStencilResolveProperties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES); }
    public static VkPhysicalDeviceDepthStencilResolveProperties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceDepthStencilResolveProperties copyFrom(VkPhysicalDeviceDepthStencilResolveProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties reinterpret(long count) { return new VkPhysicalDeviceDepthStencilResolveProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceDepthStencilResolveProperties asSlice(long index) { return new VkPhysicalDeviceDepthStencilResolveProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceDepthStencilResolveProperties asSlice(long index, long count) { return new VkPhysicalDeviceDepthStencilResolveProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceDepthStencilResolveProperties at(long index, Consumer<VkPhysicalDeviceDepthStencilResolveProperties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int supportedDepthResolveModesAt(long index) { return (int) VH_supportedDepthResolveModes.get(this.segment(), 0L, index); }
    public int supportedStencilResolveModesAt(long index) { return (int) VH_supportedStencilResolveModes.get(this.segment(), 0L, index); }
    public int independentResolveNoneAt(long index) { return (int) VH_independentResolveNone.get(this.segment(), 0L, index); }
    public int independentResolveAt(long index) { return (int) VH_independentResolve.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int supportedDepthResolveModes() { return (int) VH_supportedDepthResolveModes.get(this.segment(), 0L, 0L); }
    public int supportedStencilResolveModes() { return (int) VH_supportedStencilResolveModes.get(this.segment(), 0L, 0L); }
    public int independentResolveNone() { return (int) VH_independentResolveNone.get(this.segment(), 0L, 0L); }
    public int independentResolve() { return (int) VH_independentResolve.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties supportedDepthResolveModesAt(long index, int value) { VH_supportedDepthResolveModes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties supportedStencilResolveModesAt(long index, int value) { VH_supportedStencilResolveModes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveNoneAt(long index, int value) { VH_independentResolveNone.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveAt(long index, int value) { VH_independentResolve.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties supportedDepthResolveModes(int value) { VH_supportedDepthResolveModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties supportedStencilResolveModes(int value) { VH_supportedStencilResolveModes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolveNone(int value) { VH_independentResolveNone.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties independentResolve(int value) { VH_independentResolve.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _supportedDepthResolveModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedDepthResolveModes, index), LAYOUT_supportedDepthResolveModes); }
    public MemorySegment _supportedDepthResolveModes() { return _supportedDepthResolveModesAt(0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties _supportedDepthResolveModesAt(long index, MemorySegment src) { _supportedDepthResolveModesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties _supportedDepthResolveModes(MemorySegment src) { return _supportedDepthResolveModesAt(0L, src); }
    public MemorySegment _supportedStencilResolveModesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportedStencilResolveModes, index), LAYOUT_supportedStencilResolveModes); }
    public MemorySegment _supportedStencilResolveModes() { return _supportedStencilResolveModesAt(0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties _supportedStencilResolveModesAt(long index, MemorySegment src) { _supportedStencilResolveModesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties _supportedStencilResolveModes(MemorySegment src) { return _supportedStencilResolveModesAt(0L, src); }
    public MemorySegment _independentResolveNoneAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_independentResolveNone, index), LAYOUT_independentResolveNone); }
    public MemorySegment _independentResolveNone() { return _independentResolveNoneAt(0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties _independentResolveNoneAt(long index, MemorySegment src) { _independentResolveNoneAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties _independentResolveNone(MemorySegment src) { return _independentResolveNoneAt(0L, src); }
    public MemorySegment _independentResolveAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_independentResolve, index), LAYOUT_independentResolve); }
    public MemorySegment _independentResolve() { return _independentResolveAt(0L); }
    public VkPhysicalDeviceDepthStencilResolveProperties _independentResolveAt(long index, MemorySegment src) { _independentResolveAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceDepthStencilResolveProperties _independentResolve(MemorySegment src) { return _independentResolveAt(0L, src); }
}
