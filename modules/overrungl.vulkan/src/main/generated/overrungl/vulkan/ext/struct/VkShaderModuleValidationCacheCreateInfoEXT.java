// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderModuleValidationCacheCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkShaderModuleValidationCacheCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkValidationCacheEXT validationCache;
/// }
/// ```
public final class VkShaderModuleValidationCacheCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("validationCache")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_validationCache = LAYOUT.byteOffset(PathElement.groupElement("validationCache"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_validationCache = LAYOUT.select(PathElement.groupElement("validationCache"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_validationCache = LAYOUT.arrayElementVarHandle(PathElement.groupElement("validationCache"));

    public VkShaderModuleValidationCacheCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShaderModuleValidationCacheCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleValidationCacheCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkShaderModuleValidationCacheCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleValidationCacheCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShaderModuleValidationCacheCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderModuleValidationCacheCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShaderModuleValidationCacheCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkShaderModuleValidationCacheCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkShaderModuleValidationCacheCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkShaderModuleValidationCacheCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkShaderModuleValidationCacheCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTValidationCache.VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT); }
    public static VkShaderModuleValidationCacheCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTValidationCache.VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT);
        return s;
    }
    public VkShaderModuleValidationCacheCreateInfoEXT copyFrom(VkShaderModuleValidationCacheCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT reinterpret(long count) { return new VkShaderModuleValidationCacheCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShaderModuleValidationCacheCreateInfoEXT asSlice(long index) { return new VkShaderModuleValidationCacheCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShaderModuleValidationCacheCreateInfoEXT asSlice(long index, long count) { return new VkShaderModuleValidationCacheCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShaderModuleValidationCacheCreateInfoEXT at(long index, Consumer<VkShaderModuleValidationCacheCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public long validationCacheAt(long index) { return (long) VH_validationCache.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public long validationCache() { return (long) VH_validationCache.get(this.segment(), 0L, 0L); }
    public VkShaderModuleValidationCacheCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT validationCacheAt(long index, long value) { VH_validationCache.set(this.segment(), 0L, index, value); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT validationCache(long value) { VH_validationCache.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkShaderModuleValidationCacheCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkShaderModuleValidationCacheCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _validationCacheAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_validationCache, index), LAYOUT_validationCache); }
    public MemorySegment _validationCache() { return _validationCacheAt(0L); }
    public VkShaderModuleValidationCacheCreateInfoEXT _validationCacheAt(long index, MemorySegment src) { _validationCacheAt(index).copyFrom(src); return this; }
    public VkShaderModuleValidationCacheCreateInfoEXT _validationCache(MemorySegment src) { return _validationCacheAt(0L, src); }
}
