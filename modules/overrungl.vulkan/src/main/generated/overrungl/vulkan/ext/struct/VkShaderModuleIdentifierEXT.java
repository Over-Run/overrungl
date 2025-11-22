// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderModuleIdentifierEXT`.
/// ## Layout
/// ```
/// struct VkShaderModuleIdentifierEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t identifierSize;
///     uint8_t identifier[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT];
/// }
/// ```
public final class VkShaderModuleIdentifierEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("identifierSize"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT, ValueLayout.JAVA_BYTE).withName("identifier")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_identifierSize = LAYOUT.byteOffset(PathElement.groupElement("identifierSize"));
    public static final long OFFSET_identifier = LAYOUT.byteOffset(PathElement.groupElement("identifier"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_identifierSize = LAYOUT.select(PathElement.groupElement("identifierSize"));
    public static final MemoryLayout LAYOUT_identifier = LAYOUT.select(PathElement.groupElement("identifier"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_identifierSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifierSize"));
    public static final VarHandle VH_identifier = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identifier"), PathElement.sequenceElement());

    public VkShaderModuleIdentifierEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShaderModuleIdentifierEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkShaderModuleIdentifierEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShaderModuleIdentifierEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleIdentifierEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShaderModuleIdentifierEXT alloc(SegmentAllocator allocator) { return new VkShaderModuleIdentifierEXT(allocator.allocate(LAYOUT), 1); }
    public static VkShaderModuleIdentifierEXT alloc(SegmentAllocator allocator, long count) { return new VkShaderModuleIdentifierEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT); }
    public static VkShaderModuleIdentifierEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT);
        return s;
    }
    public VkShaderModuleIdentifierEXT copyFrom(VkShaderModuleIdentifierEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShaderModuleIdentifierEXT reinterpret(long count) { return new VkShaderModuleIdentifierEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShaderModuleIdentifierEXT asSlice(long index) { return new VkShaderModuleIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShaderModuleIdentifierEXT asSlice(long index, long count) { return new VkShaderModuleIdentifierEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShaderModuleIdentifierEXT at(long index, Consumer<VkShaderModuleIdentifierEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int identifierSizeAt(long index) { return (int) VH_identifierSize.get(this.segment(), 0L, index); }
    public byte identifierAt(long index, long index0) { return (byte) VH_identifier.get(this.segment(), 0L, index, index0); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int identifierSize() { return (int) VH_identifierSize.get(this.segment(), 0L, 0L); }
    public byte identifier(long index0) { return (byte) VH_identifier.get(this.segment(), 0L, 0L, index0); }
    public VkShaderModuleIdentifierEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleIdentifierEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleIdentifierEXT identifierSizeAt(long index, int value) { VH_identifierSize.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleIdentifierEXT identifierAt(long index, long index0, byte value) { VH_identifier.set(this.segment(), 0L, index, index0, value); return this; }
    public VkShaderModuleIdentifierEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleIdentifierEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleIdentifierEXT identifierSize(int value) { VH_identifierSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleIdentifierEXT identifier(long index0, byte value) { VH_identifier.set(this.segment(), 0L, 0L, index0, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkShaderModuleIdentifierEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkShaderModuleIdentifierEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkShaderModuleIdentifierEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkShaderModuleIdentifierEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _identifierSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identifierSize, index), LAYOUT_identifierSize); }
    public MemorySegment _identifierSize() { return _identifierSizeAt(0L); }
    public VkShaderModuleIdentifierEXT _identifierSizeAt(long index, MemorySegment src) { _identifierSizeAt(index).copyFrom(src); return this; }
    public VkShaderModuleIdentifierEXT _identifierSize(MemorySegment src) { return _identifierSizeAt(0L, src); }
    public MemorySegment _identifierAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identifier, index), LAYOUT_identifier); }
    public MemorySegment _identifier() { return _identifierAt(0L); }
    public VkShaderModuleIdentifierEXT _identifierAt(long index, MemorySegment src) { _identifierAt(index).copyFrom(src); return this; }
    public VkShaderModuleIdentifierEXT _identifier(MemorySegment src) { return _identifierAt(0L, src); }
}
