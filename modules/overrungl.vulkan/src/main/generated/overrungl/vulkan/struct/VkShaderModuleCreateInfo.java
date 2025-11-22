// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderModuleCreateInfo`.
/// ## Layout
/// ```
/// struct VkShaderModuleCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderModuleCreateFlags flags;
///     size_t codeSize;
///     const uint32_t* pCode;
/// }
/// ```
public final class VkShaderModuleCreateInfo extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        CanonicalTypes.SIZE_T.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_codeSize = LAYOUT.byteOffset(PathElement.groupElement("codeSize"));
    public static final long OFFSET_pCode = LAYOUT.byteOffset(PathElement.groupElement("pCode"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_codeSize = LAYOUT.select(PathElement.groupElement("codeSize"));
    public static final MemoryLayout LAYOUT_pCode = LAYOUT.select(PathElement.groupElement("pCode"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    public static final VarHandle VH_pCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCode"));

    public VkShaderModuleCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShaderModuleCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment, estimateCount(segment, LAYOUT)); }
    public static VkShaderModuleCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShaderModuleCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShaderModuleCreateInfo alloc(SegmentAllocator allocator) { return new VkShaderModuleCreateInfo(allocator.allocate(LAYOUT), 1); }
    public static VkShaderModuleCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkShaderModuleCreateInfo(allocator.allocate(LAYOUT, count), count); }
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO); }
    public static VkShaderModuleCreateInfo allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK10.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO);
        return s;
    }
    public VkShaderModuleCreateInfo copyFrom(VkShaderModuleCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShaderModuleCreateInfo reinterpret(long count) { return new VkShaderModuleCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShaderModuleCreateInfo asSlice(long index) { return new VkShaderModuleCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShaderModuleCreateInfo asSlice(long index, long count) { return new VkShaderModuleCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShaderModuleCreateInfo at(long index, Consumer<VkShaderModuleCreateInfo> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public long codeSizeAt(long index) { return (long) VH_codeSize.get(this.segment(), 0L, index); }
    public MemorySegment pCodeAt(long index) { return (MemorySegment) VH_pCode.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public long codeSize() { return (long) VH_codeSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pCode() { return (MemorySegment) VH_pCode.get(this.segment(), 0L, 0L); }
    public VkShaderModuleCreateInfo sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleCreateInfo pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleCreateInfo flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleCreateInfo codeSizeAt(long index, long value) { VH_codeSize.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleCreateInfo pCodeAt(long index, MemorySegment value) { VH_pCode.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleCreateInfo sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleCreateInfo pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleCreateInfo flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleCreateInfo codeSize(long value) { VH_codeSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleCreateInfo pCode(MemorySegment value) { VH_pCode.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkShaderModuleCreateInfo _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkShaderModuleCreateInfo _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkShaderModuleCreateInfo _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkShaderModuleCreateInfo _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkShaderModuleCreateInfo _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkShaderModuleCreateInfo _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _codeSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_codeSize, index), LAYOUT_codeSize); }
    public MemorySegment _codeSize() { return _codeSizeAt(0L); }
    public VkShaderModuleCreateInfo _codeSizeAt(long index, MemorySegment src) { _codeSizeAt(index).copyFrom(src); return this; }
    public VkShaderModuleCreateInfo _codeSize(MemorySegment src) { return _codeSizeAt(0L, src); }
    public MemorySegment _pCodeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCode, index), LAYOUT_pCode); }
    public MemorySegment _pCode() { return _pCodeAt(0L); }
    public VkShaderModuleCreateInfo _pCodeAt(long index, MemorySegment src) { _pCodeAt(index).copyFrom(src); return this; }
    public VkShaderModuleCreateInfo _pCode(MemorySegment src) { return _pCodeAt(0L, src); }
}
