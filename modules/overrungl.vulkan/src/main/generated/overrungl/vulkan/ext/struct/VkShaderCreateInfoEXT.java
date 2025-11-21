// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkShaderCreateInfoEXT`.
/// ## Layout
/// ```
/// struct VkShaderCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkShaderCreateFlagsEXT flags;
///     VkShaderStageFlagBits stage;
///     VkShaderStageFlags nextStage;
///     VkShaderCodeTypeEXT codeType;
///     size_t codeSize;
///     const void* pCode;
///     const char* pName;
///     uint32_t setLayoutCount;
///     const VkDescriptorSetLayout* pSetLayouts;
///     uint32_t pushConstantRangeCount;
///     const VkPushConstantRange* pPushConstantRanges;
///     const VkSpecializationInfo* pSpecializationInfo;
/// }
/// ```
public final class VkShaderCreateInfoEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_INT.withName("nextStage"),
        ValueLayout.JAVA_INT.withName("codeType"),
        CanonicalTypes.SIZE_T.withName("codeSize"),
        ValueLayout.ADDRESS.withName("pCode"),
        ValueLayout.ADDRESS.withName("pName"),
        ValueLayout.JAVA_INT.withName("setLayoutCount"),
        ValueLayout.ADDRESS.withName("pSetLayouts"),
        ValueLayout.JAVA_INT.withName("pushConstantRangeCount"),
        ValueLayout.ADDRESS.withName("pPushConstantRanges"),
        ValueLayout.ADDRESS.withName("pSpecializationInfo")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    public static final long OFFSET_nextStage = LAYOUT.byteOffset(PathElement.groupElement("nextStage"));
    public static final long OFFSET_codeType = LAYOUT.byteOffset(PathElement.groupElement("codeType"));
    public static final long OFFSET_codeSize = LAYOUT.byteOffset(PathElement.groupElement("codeSize"));
    public static final long OFFSET_pCode = LAYOUT.byteOffset(PathElement.groupElement("pCode"));
    public static final long OFFSET_pName = LAYOUT.byteOffset(PathElement.groupElement("pName"));
    public static final long OFFSET_setLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("setLayoutCount"));
    public static final long OFFSET_pSetLayouts = LAYOUT.byteOffset(PathElement.groupElement("pSetLayouts"));
    public static final long OFFSET_pushConstantRangeCount = LAYOUT.byteOffset(PathElement.groupElement("pushConstantRangeCount"));
    public static final long OFFSET_pPushConstantRanges = LAYOUT.byteOffset(PathElement.groupElement("pPushConstantRanges"));
    public static final long OFFSET_pSpecializationInfo = LAYOUT.byteOffset(PathElement.groupElement("pSpecializationInfo"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    public static final MemoryLayout LAYOUT_nextStage = LAYOUT.select(PathElement.groupElement("nextStage"));
    public static final MemoryLayout LAYOUT_codeType = LAYOUT.select(PathElement.groupElement("codeType"));
    public static final MemoryLayout LAYOUT_codeSize = LAYOUT.select(PathElement.groupElement("codeSize"));
    public static final MemoryLayout LAYOUT_pCode = LAYOUT.select(PathElement.groupElement("pCode"));
    public static final MemoryLayout LAYOUT_pName = LAYOUT.select(PathElement.groupElement("pName"));
    public static final MemoryLayout LAYOUT_setLayoutCount = LAYOUT.select(PathElement.groupElement("setLayoutCount"));
    public static final MemoryLayout LAYOUT_pSetLayouts = LAYOUT.select(PathElement.groupElement("pSetLayouts"));
    public static final MemoryLayout LAYOUT_pushConstantRangeCount = LAYOUT.select(PathElement.groupElement("pushConstantRangeCount"));
    public static final MemoryLayout LAYOUT_pPushConstantRanges = LAYOUT.select(PathElement.groupElement("pPushConstantRanges"));
    public static final MemoryLayout LAYOUT_pSpecializationInfo = LAYOUT.select(PathElement.groupElement("pSpecializationInfo"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    public static final VarHandle VH_nextStage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nextStage"));
    public static final VarHandle VH_codeType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeType"));
    public static final VarHandle VH_codeSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("codeSize"));
    public static final VarHandle VH_pCode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCode"));
    public static final VarHandle VH_pName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pName"));
    public static final VarHandle VH_setLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("setLayoutCount"));
    public static final VarHandle VH_pSetLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSetLayouts"));
    public static final VarHandle VH_pushConstantRangeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pushConstantRangeCount"));
    public static final VarHandle VH_pPushConstantRanges = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPushConstantRanges"));
    public static final VarHandle VH_pSpecializationInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSpecializationInfo"));

    public VkShaderCreateInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkShaderCreateInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkShaderCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkShaderCreateInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkShaderCreateInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkShaderCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkShaderCreateInfoEXT(allocator.allocate(LAYOUT), 1); }
    public static VkShaderCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkShaderCreateInfoEXT(allocator.allocate(LAYOUT, count), count); }
    public static VkShaderCreateInfoEXT allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT); }
    public static VkShaderCreateInfoEXT allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.ext.VKEXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT);
        return s;
    }
    public VkShaderCreateInfoEXT copyFrom(VkShaderCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkShaderCreateInfoEXT reinterpret(long count) { return new VkShaderCreateInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkShaderCreateInfoEXT asSlice(long index) { return new VkShaderCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkShaderCreateInfoEXT asSlice(long index, long count) { return new VkShaderCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkShaderCreateInfoEXT at(long index, Consumer<VkShaderCreateInfoEXT> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int flagsAt(long index) { return (int) VH_flags.get(this.segment(), 0L, index); }
    public int stageAt(long index) { return (int) VH_stage.get(this.segment(), 0L, index); }
    public int nextStageAt(long index) { return (int) VH_nextStage.get(this.segment(), 0L, index); }
    public int codeTypeAt(long index) { return (int) VH_codeType.get(this.segment(), 0L, index); }
    public long codeSizeAt(long index) { return (long) VH_codeSize.get(this.segment(), 0L, index); }
    public MemorySegment pCodeAt(long index) { return (MemorySegment) VH_pCode.get(this.segment(), 0L, index); }
    public MemorySegment pNameAt(long index) { return (MemorySegment) VH_pName.get(this.segment(), 0L, index); }
    public int setLayoutCountAt(long index) { return (int) VH_setLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pSetLayoutsAt(long index) { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, index); }
    public int pushConstantRangeCountAt(long index) { return (int) VH_pushConstantRangeCount.get(this.segment(), 0L, index); }
    public MemorySegment pPushConstantRangesAt(long index) { return (MemorySegment) VH_pPushConstantRanges.get(this.segment(), 0L, index); }
    public MemorySegment pSpecializationInfoAt(long index) { return (MemorySegment) VH_pSpecializationInfo.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int flags() { return (int) VH_flags.get(this.segment(), 0L, 0L); }
    public int stage() { return (int) VH_stage.get(this.segment(), 0L, 0L); }
    public int nextStage() { return (int) VH_nextStage.get(this.segment(), 0L, 0L); }
    public int codeType() { return (int) VH_codeType.get(this.segment(), 0L, 0L); }
    public long codeSize() { return (long) VH_codeSize.get(this.segment(), 0L, 0L); }
    public MemorySegment pCode() { return (MemorySegment) VH_pCode.get(this.segment(), 0L, 0L); }
    public MemorySegment pName() { return (MemorySegment) VH_pName.get(this.segment(), 0L, 0L); }
    public int setLayoutCount() { return (int) VH_setLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pSetLayouts() { return (MemorySegment) VH_pSetLayouts.get(this.segment(), 0L, 0L); }
    public int pushConstantRangeCount() { return (int) VH_pushConstantRangeCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pPushConstantRanges() { return (MemorySegment) VH_pPushConstantRanges.get(this.segment(), 0L, 0L); }
    public MemorySegment pSpecializationInfo() { return (MemorySegment) VH_pSpecializationInfo.get(this.segment(), 0L, 0L); }
    public VkShaderCreateInfoEXT sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT flagsAt(long index, int value) { VH_flags.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT stageAt(long index, int value) { VH_stage.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT nextStageAt(long index, int value) { VH_nextStage.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT codeTypeAt(long index, int value) { VH_codeType.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT codeSizeAt(long index, long value) { VH_codeSize.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pCodeAt(long index, MemorySegment value) { VH_pCode.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pNameAt(long index, MemorySegment value) { VH_pName.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT setLayoutCountAt(long index, int value) { VH_setLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pSetLayoutsAt(long index, MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pushConstantRangeCountAt(long index, int value) { VH_pushConstantRangeCount.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pPushConstantRangesAt(long index, MemorySegment value) { VH_pPushConstantRanges.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT pSpecializationInfoAt(long index, MemorySegment value) { VH_pSpecializationInfo.set(this.segment(), 0L, index, value); return this; }
    public VkShaderCreateInfoEXT sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT flags(int value) { VH_flags.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT stage(int value) { VH_stage.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT nextStage(int value) { VH_nextStage.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT codeType(int value) { VH_codeType.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT codeSize(long value) { VH_codeSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pCode(MemorySegment value) { VH_pCode.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pName(MemorySegment value) { VH_pName.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT setLayoutCount(int value) { VH_setLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pSetLayouts(MemorySegment value) { VH_pSetLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pushConstantRangeCount(int value) { VH_pushConstantRangeCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pPushConstantRanges(MemorySegment value) { VH_pPushConstantRanges.set(this.segment(), 0L, 0L, value); return this; }
    public VkShaderCreateInfoEXT pSpecializationInfo(MemorySegment value) { VH_pSpecializationInfo.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkShaderCreateInfoEXT _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkShaderCreateInfoEXT _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _flagsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_flags, index), LAYOUT_flags); }
    public MemorySegment _flags() { return _flagsAt(0L); }
    public VkShaderCreateInfoEXT _flagsAt(long index, MemorySegment src) { _flagsAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _flags(MemorySegment src) { return _flagsAt(0L, src); }
    public MemorySegment _stageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_stage, index), LAYOUT_stage); }
    public MemorySegment _stage() { return _stageAt(0L); }
    public VkShaderCreateInfoEXT _stageAt(long index, MemorySegment src) { _stageAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _stage(MemorySegment src) { return _stageAt(0L, src); }
    public MemorySegment _nextStageAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nextStage, index), LAYOUT_nextStage); }
    public MemorySegment _nextStage() { return _nextStageAt(0L); }
    public VkShaderCreateInfoEXT _nextStageAt(long index, MemorySegment src) { _nextStageAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _nextStage(MemorySegment src) { return _nextStageAt(0L, src); }
    public MemorySegment _codeTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_codeType, index), LAYOUT_codeType); }
    public MemorySegment _codeType() { return _codeTypeAt(0L); }
    public VkShaderCreateInfoEXT _codeTypeAt(long index, MemorySegment src) { _codeTypeAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _codeType(MemorySegment src) { return _codeTypeAt(0L, src); }
    public MemorySegment _codeSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_codeSize, index), LAYOUT_codeSize); }
    public MemorySegment _codeSize() { return _codeSizeAt(0L); }
    public VkShaderCreateInfoEXT _codeSizeAt(long index, MemorySegment src) { _codeSizeAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _codeSize(MemorySegment src) { return _codeSizeAt(0L, src); }
    public MemorySegment _pCodeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCode, index), LAYOUT_pCode); }
    public MemorySegment _pCode() { return _pCodeAt(0L); }
    public VkShaderCreateInfoEXT _pCodeAt(long index, MemorySegment src) { _pCodeAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pCode(MemorySegment src) { return _pCodeAt(0L, src); }
    public MemorySegment _pNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pName, index), LAYOUT_pName); }
    public MemorySegment _pName() { return _pNameAt(0L); }
    public VkShaderCreateInfoEXT _pNameAt(long index, MemorySegment src) { _pNameAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pName(MemorySegment src) { return _pNameAt(0L, src); }
    public MemorySegment _setLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_setLayoutCount, index), LAYOUT_setLayoutCount); }
    public MemorySegment _setLayoutCount() { return _setLayoutCountAt(0L); }
    public VkShaderCreateInfoEXT _setLayoutCountAt(long index, MemorySegment src) { _setLayoutCountAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _setLayoutCount(MemorySegment src) { return _setLayoutCountAt(0L, src); }
    public MemorySegment _pSetLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSetLayouts, index), LAYOUT_pSetLayouts); }
    public MemorySegment _pSetLayouts() { return _pSetLayoutsAt(0L); }
    public VkShaderCreateInfoEXT _pSetLayoutsAt(long index, MemorySegment src) { _pSetLayoutsAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pSetLayouts(MemorySegment src) { return _pSetLayoutsAt(0L, src); }
    public MemorySegment _pushConstantRangeCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pushConstantRangeCount, index), LAYOUT_pushConstantRangeCount); }
    public MemorySegment _pushConstantRangeCount() { return _pushConstantRangeCountAt(0L); }
    public VkShaderCreateInfoEXT _pushConstantRangeCountAt(long index, MemorySegment src) { _pushConstantRangeCountAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pushConstantRangeCount(MemorySegment src) { return _pushConstantRangeCountAt(0L, src); }
    public MemorySegment _pPushConstantRangesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pPushConstantRanges, index), LAYOUT_pPushConstantRanges); }
    public MemorySegment _pPushConstantRanges() { return _pPushConstantRangesAt(0L); }
    public VkShaderCreateInfoEXT _pPushConstantRangesAt(long index, MemorySegment src) { _pPushConstantRangesAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pPushConstantRanges(MemorySegment src) { return _pPushConstantRangesAt(0L, src); }
    public MemorySegment _pSpecializationInfoAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pSpecializationInfo, index), LAYOUT_pSpecializationInfo); }
    public MemorySegment _pSpecializationInfo() { return _pSpecializationInfoAt(0L); }
    public VkShaderCreateInfoEXT _pSpecializationInfoAt(long index, MemorySegment src) { _pSpecializationInfoAt(index).copyFrom(src); return this; }
    public VkShaderCreateInfoEXT _pSpecializationInfo(MemorySegment src) { return _pSpecializationInfoAt(0L, src); }
}
