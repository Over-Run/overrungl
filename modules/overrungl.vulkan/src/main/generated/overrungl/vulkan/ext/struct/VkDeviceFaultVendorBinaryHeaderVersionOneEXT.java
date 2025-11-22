// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkDeviceFaultVendorBinaryHeaderVersionOneEXT`.
/// ## Layout
/// ```
/// struct VkDeviceFaultVendorBinaryHeaderVersionOneEXT {
///     uint32_t headerSize;
///     VkDeviceFaultVendorBinaryHeaderVersionEXT headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint32_t driverVersion;
///     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
///     uint32_t applicationNameOffset;
///     uint32_t applicationVersion;
///     uint32_t engineNameOffset;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// }
/// ```
public final class VkDeviceFaultVendorBinaryHeaderVersionOneEXT extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        ValueLayout.JAVA_INT.withName("applicationNameOffset"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.JAVA_INT.withName("engineNameOffset"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    public static final long OFFSET_headerSize = LAYOUT.byteOffset(PathElement.groupElement("headerSize"));
    public static final long OFFSET_headerVersion = LAYOUT.byteOffset(PathElement.groupElement("headerVersion"));
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    public static final long OFFSET_driverVersion = LAYOUT.byteOffset(PathElement.groupElement("driverVersion"));
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    public static final long OFFSET_applicationNameOffset = LAYOUT.byteOffset(PathElement.groupElement("applicationNameOffset"));
    public static final long OFFSET_applicationVersion = LAYOUT.byteOffset(PathElement.groupElement("applicationVersion"));
    public static final long OFFSET_engineNameOffset = LAYOUT.byteOffset(PathElement.groupElement("engineNameOffset"));
    public static final long OFFSET_engineVersion = LAYOUT.byteOffset(PathElement.groupElement("engineVersion"));
    public static final long OFFSET_apiVersion = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
    public static final MemoryLayout LAYOUT_headerSize = LAYOUT.select(PathElement.groupElement("headerSize"));
    public static final MemoryLayout LAYOUT_headerVersion = LAYOUT.select(PathElement.groupElement("headerVersion"));
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    public static final MemoryLayout LAYOUT_driverVersion = LAYOUT.select(PathElement.groupElement("driverVersion"));
    public static final MemoryLayout LAYOUT_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    public static final MemoryLayout LAYOUT_applicationNameOffset = LAYOUT.select(PathElement.groupElement("applicationNameOffset"));
    public static final MemoryLayout LAYOUT_applicationVersion = LAYOUT.select(PathElement.groupElement("applicationVersion"));
    public static final MemoryLayout LAYOUT_engineNameOffset = LAYOUT.select(PathElement.groupElement("engineNameOffset"));
    public static final MemoryLayout LAYOUT_engineVersion = LAYOUT.select(PathElement.groupElement("engineVersion"));
    public static final MemoryLayout LAYOUT_apiVersion = LAYOUT.select(PathElement.groupElement("apiVersion"));
    public static final VarHandle VH_headerSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerSize"));
    public static final VarHandle VH_headerVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("headerVersion"));
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    public static final VarHandle VH_driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverVersion"));
    public static final VarHandle VH_pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_applicationNameOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationNameOffset"));
    public static final VarHandle VH_applicationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("applicationVersion"));
    public static final VarHandle VH_engineNameOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineNameOffset"));
    public static final VarHandle VH_engineVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("engineVersion"));
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment, estimateCount(segment, LAYOUT)); }
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT alloc(SegmentAllocator allocator) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(allocator.allocate(LAYOUT), 1); }
    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT alloc(SegmentAllocator allocator, long count) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(allocator.allocate(LAYOUT, count), count); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT copyFrom(VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) { this.segment().copyFrom(src.segment()); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT reinterpret(long count) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT asSlice(long index) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT asSlice(long index, long count) { return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT at(long index, Consumer<VkDeviceFaultVendorBinaryHeaderVersionOneEXT> func) { func.accept(asSlice(index)); return this; }
    public int headerSizeAt(long index) { return (int) VH_headerSize.get(this.segment(), 0L, index); }
    public int headerVersionAt(long index) { return (int) VH_headerVersion.get(this.segment(), 0L, index); }
    public int vendorIDAt(long index) { return (int) VH_vendorID.get(this.segment(), 0L, index); }
    public int deviceIDAt(long index) { return (int) VH_deviceID.get(this.segment(), 0L, index); }
    public int driverVersionAt(long index) { return (int) VH_driverVersion.get(this.segment(), 0L, index); }
    public byte pipelineCacheUUIDAt(long index, long index0) { return (byte) VH_pipelineCacheUUID.get(this.segment(), 0L, index, index0); }
    public int applicationNameOffsetAt(long index) { return (int) VH_applicationNameOffset.get(this.segment(), 0L, index); }
    public int applicationVersionAt(long index) { return (int) VH_applicationVersion.get(this.segment(), 0L, index); }
    public int engineNameOffsetAt(long index) { return (int) VH_engineNameOffset.get(this.segment(), 0L, index); }
    public int engineVersionAt(long index) { return (int) VH_engineVersion.get(this.segment(), 0L, index); }
    public int apiVersionAt(long index) { return (int) VH_apiVersion.get(this.segment(), 0L, index); }
    public int headerSize() { return (int) VH_headerSize.get(this.segment(), 0L, 0L); }
    public int headerVersion() { return (int) VH_headerVersion.get(this.segment(), 0L, 0L); }
    public int vendorID() { return (int) VH_vendorID.get(this.segment(), 0L, 0L); }
    public int deviceID() { return (int) VH_deviceID.get(this.segment(), 0L, 0L); }
    public int driverVersion() { return (int) VH_driverVersion.get(this.segment(), 0L, 0L); }
    public byte pipelineCacheUUID(long index0) { return (byte) VH_pipelineCacheUUID.get(this.segment(), 0L, 0L, index0); }
    public int applicationNameOffset() { return (int) VH_applicationNameOffset.get(this.segment(), 0L, 0L); }
    public int applicationVersion() { return (int) VH_applicationVersion.get(this.segment(), 0L, 0L); }
    public int engineNameOffset() { return (int) VH_engineNameOffset.get(this.segment(), 0L, 0L); }
    public int engineVersion() { return (int) VH_engineVersion.get(this.segment(), 0L, 0L); }
    public int apiVersion() { return (int) VH_apiVersion.get(this.segment(), 0L, 0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSizeAt(long index, int value) { VH_headerSize.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersionAt(long index, int value) { VH_headerVersion.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorIDAt(long index, int value) { VH_vendorID.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceIDAt(long index, int value) { VH_deviceID.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersionAt(long index, int value) { VH_driverVersion.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUIDAt(long index, long index0, byte value) { VH_pipelineCacheUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffsetAt(long index, int value) { VH_applicationNameOffset.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersionAt(long index, int value) { VH_applicationVersion.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffsetAt(long index, int value) { VH_engineNameOffset.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersionAt(long index, int value) { VH_engineVersion.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersionAt(long index, int value) { VH_apiVersion.set(this.segment(), 0L, index, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSize(int value) { VH_headerSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersion(int value) { VH_headerVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorID(int value) { VH_vendorID.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceID(int value) { VH_deviceID.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersion(int value) { VH_driverVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(long index0, byte value) { VH_pipelineCacheUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffset(int value) { VH_applicationNameOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersion(int value) { VH_applicationVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffset(int value) { VH_engineNameOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersion(int value) { VH_engineVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersion(int value) { VH_apiVersion.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _headerSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_headerSize, index), LAYOUT_headerSize); }
    public MemorySegment _headerSize() { return _headerSizeAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _headerSizeAt(long index, MemorySegment src) { _headerSizeAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _headerSize(MemorySegment src) { return _headerSizeAt(0L, src); }
    public MemorySegment _headerVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_headerVersion, index), LAYOUT_headerVersion); }
    public MemorySegment _headerVersion() { return _headerVersionAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _headerVersionAt(long index, MemorySegment src) { _headerVersionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _headerVersion(MemorySegment src) { return _headerVersionAt(0L, src); }
    public MemorySegment _vendorIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorID, index), LAYOUT_vendorID); }
    public MemorySegment _vendorID() { return _vendorIDAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _vendorIDAt(long index, MemorySegment src) { _vendorIDAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _vendorID(MemorySegment src) { return _vendorIDAt(0L, src); }
    public MemorySegment _deviceIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceID, index), LAYOUT_deviceID); }
    public MemorySegment _deviceID() { return _deviceIDAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _deviceIDAt(long index, MemorySegment src) { _deviceIDAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _deviceID(MemorySegment src) { return _deviceIDAt(0L, src); }
    public MemorySegment _driverVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverVersion, index), LAYOUT_driverVersion); }
    public MemorySegment _driverVersion() { return _driverVersionAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _driverVersionAt(long index, MemorySegment src) { _driverVersionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _driverVersion(MemorySegment src) { return _driverVersionAt(0L, src); }
    public MemorySegment _pipelineCacheUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), LAYOUT_pipelineCacheUUID); }
    public MemorySegment _pipelineCacheUUID() { return _pipelineCacheUUIDAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _pipelineCacheUUIDAt(long index, MemorySegment src) { _pipelineCacheUUIDAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _pipelineCacheUUID(MemorySegment src) { return _pipelineCacheUUIDAt(0L, src); }
    public MemorySegment _applicationNameOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_applicationNameOffset, index), LAYOUT_applicationNameOffset); }
    public MemorySegment _applicationNameOffset() { return _applicationNameOffsetAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _applicationNameOffsetAt(long index, MemorySegment src) { _applicationNameOffsetAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _applicationNameOffset(MemorySegment src) { return _applicationNameOffsetAt(0L, src); }
    public MemorySegment _applicationVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_applicationVersion, index), LAYOUT_applicationVersion); }
    public MemorySegment _applicationVersion() { return _applicationVersionAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _applicationVersionAt(long index, MemorySegment src) { _applicationVersionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _applicationVersion(MemorySegment src) { return _applicationVersionAt(0L, src); }
    public MemorySegment _engineNameOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_engineNameOffset, index), LAYOUT_engineNameOffset); }
    public MemorySegment _engineNameOffset() { return _engineNameOffsetAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _engineNameOffsetAt(long index, MemorySegment src) { _engineNameOffsetAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _engineNameOffset(MemorySegment src) { return _engineNameOffsetAt(0L, src); }
    public MemorySegment _engineVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_engineVersion, index), LAYOUT_engineVersion); }
    public MemorySegment _engineVersion() { return _engineVersionAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _engineVersionAt(long index, MemorySegment src) { _engineVersionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _engineVersion(MemorySegment src) { return _engineVersionAt(0L, src); }
    public MemorySegment _apiVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_apiVersion, index), LAYOUT_apiVersion); }
    public MemorySegment _apiVersion() { return _apiVersionAt(0L); }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _apiVersionAt(long index, MemorySegment src) { _apiVersionAt(index).copyFrom(src); return this; }
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT _apiVersion(MemorySegment src) { return _apiVersionAt(0L, src); }
}
