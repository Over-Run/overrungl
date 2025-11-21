// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nvx.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkCuFunctionCreateInfoNVX`.
/// ## Layout
/// ```
/// struct VkCuFunctionCreateInfoNVX {
///     VkStructureType sType;
///     const void* pNext;
///     VkCuModuleNVX module;
///     const char* pName;
/// }
/// ```
public final class VkCuFunctionCreateInfoNVX extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("module"),
        ValueLayout.ADDRESS.withName("pName")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_module = LAYOUT.byteOffset(PathElement.groupElement("module"));
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_module = LAYOUT.select(PathElement.groupElement("module"));
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_module = LAYOUT.arrayElementVarHandle(PathElement.groupElement("module"));
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));

    public VkCuFunctionCreateInfoNVX(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkCuFunctionCreateInfoNVX of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment, estimateCount(segment, LAYOUT)); }
    public static VkCuFunctionCreateInfoNVX ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkCuFunctionCreateInfoNVX ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCuFunctionCreateInfoNVX(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkCuFunctionCreateInfoNVX alloc(SegmentAllocator allocator) { return new VkCuFunctionCreateInfoNVX(allocator.allocate(LAYOUT), 1); }
    public static VkCuFunctionCreateInfoNVX alloc(SegmentAllocator allocator, long count) { return new VkCuFunctionCreateInfoNVX(allocator.allocate(LAYOUT, count), count); }
    public static VkCuFunctionCreateInfoNVX allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.nvx.VKNVXBinaryImport.VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX); }
    public static VkCuFunctionCreateInfoNVX allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.nvx.VKNVXBinaryImport.VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX);
        return s;
    }
    public VkCuFunctionCreateInfoNVX copyFrom(VkCuFunctionCreateInfoNVX src) { this.segment().copyFrom(src.segment()); return this; }
    public VkCuFunctionCreateInfoNVX reinterpret(long count) { return new VkCuFunctionCreateInfoNVX(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkCuFunctionCreateInfoNVX asSlice(long index) { return new VkCuFunctionCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkCuFunctionCreateInfoNVX asSlice(long index, long count) { return new VkCuFunctionCreateInfoNVX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkCuFunctionCreateInfoNVX at(long index, Consumer<VkCuFunctionCreateInfoNVX> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long moduleAt(long index) { return (long) VH_module.get(this.segment(), 0L, index); }
    public MemorySegment pNameAt(long index) { return (MemorySegment) VH_pName.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long module() { return (long) VH_module.get(this.segment(), 0L, 0L); }
    public MemorySegment pName() { return (MemorySegment) VH_pName.get(this.segment(), 0L, 0L); }
    public VkCuFunctionCreateInfoNVX sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkCuFunctionCreateInfoNVX pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkCuFunctionCreateInfoNVX moduleAt(long index, long value) { VH_module.set(this.segment(), 0L, index, value); return this; }
    public VkCuFunctionCreateInfoNVX pNameAt(long index, MemorySegment value) { VH_pName.set(this.segment(), 0L, index, value); return this; }
    public VkCuFunctionCreateInfoNVX sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkCuFunctionCreateInfoNVX pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkCuFunctionCreateInfoNVX module(long value) { VH_module.set(this.segment(), 0L, 0L, value); return this; }
    public VkCuFunctionCreateInfoNVX pName(MemorySegment value) { VH_pName.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkCuFunctionCreateInfoNVX _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkCuFunctionCreateInfoNVX _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkCuFunctionCreateInfoNVX _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkCuFunctionCreateInfoNVX _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _moduleAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_module, index), LAYOUT_module); }
    public MemorySegment _module() { return _moduleAt(0L); }
    public VkCuFunctionCreateInfoNVX _moduleAt(long index, MemorySegment src) { _moduleAt(index).copyFrom(src); return this; }
    public VkCuFunctionCreateInfoNVX _module(MemorySegment src) { return _moduleAt(0L, src); }
    public MemorySegment _pNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pName, index), LAYOUT_pName); }
    public MemorySegment _pName() { return _pNameAt(0L); }
    public VkCuFunctionCreateInfoNVX _pNameAt(long index, MemorySegment src) { _pNameAt(index).copyFrom(src); return this; }
    public VkCuFunctionCreateInfoNVX _pName(MemorySegment src) { return _pNameAt(0L, src); }
}
