// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCuModuleTexturingModeCreateInfoNVX`.
/// ## Layout
/// ```
/// struct VkCuModuleTexturingModeCreateInfoNVX {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 use64bitTexturing;
/// }
/// ```
public final class VkCuModuleTexturingModeCreateInfoNVX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("use64bitTexturing")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_use64bitTexturing = LAYOUT.byteOffset(PathElement.groupElement("use64bitTexturing"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_use64bitTexturing = LAYOUT.select(PathElement.groupElement("use64bitTexturing"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_use64bitTexturing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("use64bitTexturing"));

    public VkCuModuleTexturingModeCreateInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCuModuleTexturingModeCreateInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleTexturingModeCreateInfoNVX(segment, estimateCount(segment, LAYOUT)); }
    public static VkCuModuleTexturingModeCreateInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleTexturingModeCreateInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCuModuleTexturingModeCreateInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuModuleTexturingModeCreateInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCuModuleTexturingModeCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuModuleTexturingModeCreateInfoNVX(allocator.allocate(LAYOUT), 1); }
    public static VkCuModuleTexturingModeCreateInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkCuModuleTexturingModeCreateInfoNVX(allocator.allocate(LAYOUT, count), count); }
    public static VkCuModuleTexturingModeCreateInfoNVX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nvx.VKNVXBinaryImport.VK_STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX); }
    public static VkCuModuleTexturingModeCreateInfoNVX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nvx.VKNVXBinaryImport.VK_STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX);
        return s;
    }
    public VkCuModuleTexturingModeCreateInfoNVX copyFrom(VkCuModuleTexturingModeCreateInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX reinterpret(long count) { return new VkCuModuleTexturingModeCreateInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCuModuleTexturingModeCreateInfoNVX asSlice(long index) { return new VkCuModuleTexturingModeCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCuModuleTexturingModeCreateInfoNVX asSlice(long index, long count) { return new VkCuModuleTexturingModeCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCuModuleTexturingModeCreateInfoNVX at(long index, Consumer<VkCuModuleTexturingModeCreateInfoNVX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int use64bitTexturingAt(long index) { return (int) VH_use64bitTexturing.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int use64bitTexturing() { return (int) VH_use64bitTexturing.get(this.segment(), 0L, 0L); }
    public VkCuModuleTexturingModeCreateInfoNVX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX use64bitTexturingAt(long index, int value) { VH_use64bitTexturing.set(this.segment(), 0L, index, value); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX use64bitTexturing(int value) { VH_use64bitTexturing.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCuModuleTexturingModeCreateInfoNVX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCuModuleTexturingModeCreateInfoNVX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _use64bitTexturingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_use64bitTexturing, index), LAYOUT_use64bitTexturing); }
    public MemorySegment _use64bitTexturing() { return _use64bitTexturingAt(0L); }
    public VkCuModuleTexturingModeCreateInfoNVX _use64bitTexturingAt(long index, MemorySegment src) { _use64bitTexturingAt(index).copyFrom(src); return this; }
    public VkCuModuleTexturingModeCreateInfoNVX _use64bitTexturing(MemorySegment src) { return _use64bitTexturingAt(0L, src); }
}
