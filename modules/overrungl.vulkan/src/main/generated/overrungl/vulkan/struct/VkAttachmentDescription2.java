// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkAttachmentDescription2`.
/// ## Layout
/// ```
/// struct VkAttachmentDescription2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkAttachmentDescriptionFlags flags;
///     VkFormat format;
///     VkSampleCountFlagBits samples;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkAttachmentLoadOp stencilLoadOp;
///     VkAttachmentStoreOp stencilStoreOp;
///     VkImageLayout initialLayout;
///     VkImageLayout finalLayout;
/// }
/// ```
public final class VkAttachmentDescription2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        ValueLayout.JAVA_INT.withName("stencilLoadOp"),
        ValueLayout.JAVA_INT.withName("stencilStoreOp"),
        ValueLayout.JAVA_INT.withName("initialLayout"),
        ValueLayout.JAVA_INT.withName("finalLayout")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    public static final long OFFSET_samples = LAYOUT.byteOffset(PathElement.groupElement("samples"));
    public static final long OFFSET_loadOp = LAYOUT.byteOffset(PathElement.groupElement("loadOp"));
    public static final long OFFSET_storeOp = LAYOUT.byteOffset(PathElement.groupElement("storeOp"));
    public static final long OFFSET_stencilLoadOp = LAYOUT.byteOffset(PathElement.groupElement("stencilLoadOp"));
    public static final long OFFSET_stencilStoreOp = LAYOUT.byteOffset(PathElement.groupElement("stencilStoreOp"));
    public static final long OFFSET_initialLayout = LAYOUT.byteOffset(PathElement.groupElement("initialLayout"));
    public static final long OFFSET_finalLayout = LAYOUT.byteOffset(PathElement.groupElement("finalLayout"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    public static final MemoryLayout LAYOUT_samples = LAYOUT.select(PathElement.groupElement("samples"));
    public static final MemoryLayout LAYOUT_loadOp = LAYOUT.select(PathElement.groupElement("loadOp"));
    public static final MemoryLayout LAYOUT_storeOp = LAYOUT.select(PathElement.groupElement("storeOp"));
    public static final MemoryLayout LAYOUT_stencilLoadOp = LAYOUT.select(PathElement.groupElement("stencilLoadOp"));
    public static final MemoryLayout LAYOUT_stencilStoreOp = LAYOUT.select(PathElement.groupElement("stencilStoreOp"));
    public static final MemoryLayout LAYOUT_initialLayout = LAYOUT.select(PathElement.groupElement("initialLayout"));
    public static final MemoryLayout LAYOUT_finalLayout = LAYOUT.select(PathElement.groupElement("finalLayout"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    public static final VarHandle VH_loadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("loadOp"));
    public static final VarHandle VH_storeOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storeOp"));
    public static final VarHandle VH_stencilLoadOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilLoadOp"));
    public static final VarHandle VH_stencilStoreOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stencilStoreOp"));
    public static final VarHandle VH_initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialLayout"));
    public static final VarHandle VH_finalLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("finalLayout"));

    public VkAttachmentDescription2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkAttachmentDescription2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment, estimateCount(segment, LAYOUT)); }
    public static VkAttachmentDescription2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkAttachmentDescription2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAttachmentDescription2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkAttachmentDescription2 alloc(SegmentAllocator allocator) { return new VkAttachmentDescription2(allocator.allocate(LAYOUT), 1); }
    public static VkAttachmentDescription2 alloc(SegmentAllocator allocator, long count) { return new VkAttachmentDescription2(allocator.allocate(LAYOUT, count), count); }
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2); }
    public static VkAttachmentDescription2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK12.VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2);
        return s;
    }
    public VkAttachmentDescription2 copyFrom(VkAttachmentDescription2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkAttachmentDescription2 reinterpret(long count) { return new VkAttachmentDescription2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkAttachmentDescription2 asSlice(long index) { return new VkAttachmentDescription2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkAttachmentDescription2 asSlice(long index, long count) { return new VkAttachmentDescription2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkAttachmentDescription2 at(long index, Consumer<VkAttachmentDescription2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int formatAt(long index) { return (int) VH_format.get(this.segment(), 0L, index); }
    public int samplesAt(long index) { return (int) VH_samples.get(this.segment(), 0L, index); }
    public int loadOpAt(long index) { return (int) VH_loadOp.get(this.segment(), 0L, index); }
    public int storeOpAt(long index) { return (int) VH_storeOp.get(this.segment(), 0L, index); }
    public int stencilLoadOpAt(long index) { return (int) VH_stencilLoadOp.get(this.segment(), 0L, index); }
    public int stencilStoreOpAt(long index) { return (int) VH_stencilStoreOp.get(this.segment(), 0L, index); }
    public int initialLayoutAt(long index) { return (int) VH_initialLayout.get(this.segment(), 0L, index); }
    public int finalLayoutAt(long index) { return (int) VH_finalLayout.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int format() { return (int) VH_format.get(this.segment(), 0L, 0L); }
    public int samples() { return (int) VH_samples.get(this.segment(), 0L, 0L); }
    public int loadOp() { return (int) VH_loadOp.get(this.segment(), 0L, 0L); }
    public int storeOp() { return (int) VH_storeOp.get(this.segment(), 0L, 0L); }
    public int stencilLoadOp() { return (int) VH_stencilLoadOp.get(this.segment(), 0L, 0L); }
    public int stencilStoreOp() { return (int) VH_stencilStoreOp.get(this.segment(), 0L, 0L); }
    public int initialLayout() { return (int) VH_initialLayout.get(this.segment(), 0L, 0L); }
    public int finalLayout() { return (int) VH_finalLayout.get(this.segment(), 0L, 0L); }
    public VkAttachmentDescription2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 formatAt(long index, int value) { VH_format.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 samplesAt(long index, int value) { VH_samples.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 loadOpAt(long index, int value) { VH_loadOp.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 storeOpAt(long index, int value) { VH_storeOp.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 stencilLoadOpAt(long index, int value) { VH_stencilLoadOp.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 stencilStoreOpAt(long index, int value) { VH_stencilStoreOp.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 initialLayoutAt(long index, int value) { VH_initialLayout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 finalLayoutAt(long index, int value) { VH_finalLayout.set(this.segment(), 0L, index, value); return this; }
    public VkAttachmentDescription2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 format(int value) { VH_format.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 samples(int value) { VH_samples.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 loadOp(int value) { VH_loadOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 storeOp(int value) { VH_storeOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 stencilLoadOp(int value) { VH_stencilLoadOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 stencilStoreOp(int value) { VH_stencilStoreOp.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 initialLayout(int value) { VH_initialLayout.set(this.segment(), 0L, 0L, value); return this; }
    public VkAttachmentDescription2 finalLayout(int value) { VH_finalLayout.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkAttachmentDescription2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkAttachmentDescription2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkAttachmentDescription2 _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _formatAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_format, index), LAYOUT_format); }
    public MemorySegment _format() { return _formatAt(0L); }
    public VkAttachmentDescription2 _formatAt(long index, MemorySegment src) { _formatAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _format(MemorySegment src) { return _formatAt(0L, src); }
    public MemorySegment _samplesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_samples, index), LAYOUT_samples); }
    public MemorySegment _samples() { return _samplesAt(0L); }
    public VkAttachmentDescription2 _samplesAt(long index, MemorySegment src) { _samplesAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _samples(MemorySegment src) { return _samplesAt(0L, src); }
    public MemorySegment _loadOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_loadOp, index), LAYOUT_loadOp); }
    public MemorySegment _loadOp() { return _loadOpAt(0L); }
    public VkAttachmentDescription2 _loadOpAt(long index, MemorySegment src) { _loadOpAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _loadOp(MemorySegment src) { return _loadOpAt(0L, src); }
    public MemorySegment _storeOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storeOp, index), LAYOUT_storeOp); }
    public MemorySegment _storeOp() { return _storeOpAt(0L); }
    public VkAttachmentDescription2 _storeOpAt(long index, MemorySegment src) { _storeOpAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _storeOp(MemorySegment src) { return _storeOpAt(0L, src); }
    public MemorySegment _stencilLoadOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilLoadOp, index), LAYOUT_stencilLoadOp); }
    public MemorySegment _stencilLoadOp() { return _stencilLoadOpAt(0L); }
    public VkAttachmentDescription2 _stencilLoadOpAt(long index, MemorySegment src) { _stencilLoadOpAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _stencilLoadOp(MemorySegment src) { return _stencilLoadOpAt(0L, src); }
    public MemorySegment _stencilStoreOpAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stencilStoreOp, index), LAYOUT_stencilStoreOp); }
    public MemorySegment _stencilStoreOp() { return _stencilStoreOpAt(0L); }
    public VkAttachmentDescription2 _stencilStoreOpAt(long index, MemorySegment src) { _stencilStoreOpAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _stencilStoreOp(MemorySegment src) { return _stencilStoreOpAt(0L, src); }
    public MemorySegment _initialLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_initialLayout, index), LAYOUT_initialLayout); }
    public MemorySegment _initialLayout() { return _initialLayoutAt(0L); }
    public VkAttachmentDescription2 _initialLayoutAt(long index, MemorySegment src) { _initialLayoutAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _initialLayout(MemorySegment src) { return _initialLayoutAt(0L, src); }
    public MemorySegment _finalLayoutAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_finalLayout, index), LAYOUT_finalLayout); }
    public MemorySegment _finalLayout() { return _finalLayoutAt(0L); }
    public VkAttachmentDescription2 _finalLayoutAt(long index, MemorySegment src) { _finalLayoutAt(index).copyFrom(src); return this; }
    public VkAttachmentDescription2 _finalLayout(MemorySegment src) { return _finalLayoutAt(0L, src); }
}
