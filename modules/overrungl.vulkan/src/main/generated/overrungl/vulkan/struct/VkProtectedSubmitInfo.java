// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkProtectedSubmitInfo`.
/// ## Layout
/// ```
/// struct VkProtectedSubmitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 protectedSubmit;
/// }
/// ```
public final class VkProtectedSubmitInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("protectedSubmit")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_protectedSubmit = LAYOUT.byteOffset(PathElement.groupElement("protectedSubmit"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_protectedSubmit = LAYOUT.select(PathElement.groupElement("protectedSubmit"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_protectedSubmit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("protectedSubmit"));

    public VkProtectedSubmitInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkProtectedSubmitInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkProtectedSubmitInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkProtectedSubmitInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkProtectedSubmitInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkProtectedSubmitInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkProtectedSubmitInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkProtectedSubmitInfo alloc(SegmentAllocator allocator) { return new VkProtectedSubmitInfo(allocator.allocate(LAYOUT), 1); }
    public static VkProtectedSubmitInfo alloc(SegmentAllocator allocator, long count) { return new VkProtectedSubmitInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkProtectedSubmitInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO); }
    public static VkProtectedSubmitInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO);
        return s;
    }
    public VkProtectedSubmitInfo copyFrom(VkProtectedSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkProtectedSubmitInfo reinterpret(long count) { return new VkProtectedSubmitInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkProtectedSubmitInfo asSlice(long index) { return new VkProtectedSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkProtectedSubmitInfo asSlice(long index, long count) { return new VkProtectedSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkProtectedSubmitInfo at(long index, Consumer<VkProtectedSubmitInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int protectedSubmitAt(long index) { return (int) VH_protectedSubmit.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int protectedSubmit() { return (int) VH_protectedSubmit.get(this.segment(), 0L, 0L); }
    public VkProtectedSubmitInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkProtectedSubmitInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkProtectedSubmitInfo protectedSubmitAt(long index, int value) { VH_protectedSubmit.set(this.segment(), 0L, index, value); return this; }
    public VkProtectedSubmitInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkProtectedSubmitInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkProtectedSubmitInfo protectedSubmit(int value) { VH_protectedSubmit.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkProtectedSubmitInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkProtectedSubmitInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkProtectedSubmitInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkProtectedSubmitInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _protectedSubmitAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_protectedSubmit, index), LAYOUT_protectedSubmit); }
    public MemorySegment _protectedSubmit() { return _protectedSubmitAt(0L); }
    public VkProtectedSubmitInfo _protectedSubmitAt(long index, MemorySegment src) { _protectedSubmitAt(index).copyFrom(src); return this; }
    public VkProtectedSubmitInfo _protectedSubmit(MemorySegment src) { return _protectedSubmitAt(0L, src); }
}
