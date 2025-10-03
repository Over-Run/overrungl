// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_vdpau_interop`
public final class GLNVVdpauInterop {
    public static final int GL_SURFACE_STATE_NV = 0x86EB;
    public static final int GL_SURFACE_REGISTERED_NV = 0x86FD;
    public static final int GL_SURFACE_MAPPED_NV = 0x8700;
    public static final int GL_WRITE_DISCARD_NV = 0x88BE;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVDPAUInitNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUFiniNV = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glVDPAURegisterVideoSurfaceNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAURegisterOutputSurfaceNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUIsSurfaceNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVDPAUUnregisterSurfaceNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVDPAUGetSurfaceivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUSurfaceAccessNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVDPAUMapSurfacesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVDPAUUnmapSurfacesNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVDPAUInitNV;
        public final MemorySegment PFN_glVDPAUFiniNV;
        public final MemorySegment PFN_glVDPAURegisterVideoSurfaceNV;
        public final MemorySegment PFN_glVDPAURegisterOutputSurfaceNV;
        public final MemorySegment PFN_glVDPAUIsSurfaceNV;
        public final MemorySegment PFN_glVDPAUUnregisterSurfaceNV;
        public final MemorySegment PFN_glVDPAUGetSurfaceivNV;
        public final MemorySegment PFN_glVDPAUSurfaceAccessNV;
        public final MemorySegment PFN_glVDPAUMapSurfacesNV;
        public final MemorySegment PFN_glVDPAUUnmapSurfacesNV;
        private Handles(GLLoadFunc func) {
            PFN_glVDPAUInitNV = func.invoke("glVDPAUInitNV");
            PFN_glVDPAUFiniNV = func.invoke("glVDPAUFiniNV");
            PFN_glVDPAURegisterVideoSurfaceNV = func.invoke("glVDPAURegisterVideoSurfaceNV");
            PFN_glVDPAURegisterOutputSurfaceNV = func.invoke("glVDPAURegisterOutputSurfaceNV");
            PFN_glVDPAUIsSurfaceNV = func.invoke("glVDPAUIsSurfaceNV");
            PFN_glVDPAUUnregisterSurfaceNV = func.invoke("glVDPAUUnregisterSurfaceNV");
            PFN_glVDPAUGetSurfaceivNV = func.invoke("glVDPAUGetSurfaceivNV");
            PFN_glVDPAUSurfaceAccessNV = func.invoke("glVDPAUSurfaceAccessNV");
            PFN_glVDPAUMapSurfacesNV = func.invoke("glVDPAUMapSurfacesNV");
            PFN_glVDPAUUnmapSurfacesNV = func.invoke("glVDPAUUnmapSurfacesNV");
        }
    }

    public GLNVVdpauInterop(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVDPAUInitNV`.
    /// ```
    /// void glVDPAUInitNV(const void* vdpDevice, const void* getProcAddress);
    /// ```
    public void VDPAUInitNV(@NonNull MemorySegment vdpDevice, @NonNull MemorySegment getProcAddress) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUInitNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUInitNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUInitNV", vdpDevice, getProcAddress); }
        Handles.MH_glVDPAUInitNV.invokeExact(handles.PFN_glVDPAUInitNV, vdpDevice, getProcAddress); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUInitNV", e); }
    }

    /// Invokes `glVDPAUFiniNV`.
    /// ```
    /// void glVDPAUFiniNV();
    /// ```
    public void VDPAUFiniNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUFiniNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUFiniNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUFiniNV"); }
        Handles.MH_glVDPAUFiniNV.invokeExact(handles.PFN_glVDPAUFiniNV); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUFiniNV", e); }
    }

    /// Invokes `glVDPAURegisterVideoSurfaceNV`.
    /// ```
    /// (((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV glVDPAURegisterVideoSurfaceNV(const void* vdpSurface, (unsigned int) GLenum target, (int) GLsizei numTextureNames, const GLuint* textureNames);
    /// ```
    public long VDPAURegisterVideoSurfaceNV(@NonNull MemorySegment vdpSurface, int target, int numTextureNames, @NonNull MemorySegment textureNames) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAURegisterVideoSurfaceNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAURegisterVideoSurfaceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAURegisterVideoSurfaceNV", vdpSurface, target, numTextureNames, textureNames); }
        return (long) Handles.MH_glVDPAURegisterVideoSurfaceNV.invokeExact(handles.PFN_glVDPAURegisterVideoSurfaceNV, vdpSurface, target, numTextureNames, textureNames); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAURegisterVideoSurfaceNV", e); }
    }

    /// Invokes `glVDPAURegisterOutputSurfaceNV`.
    /// ```
    /// (((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV glVDPAURegisterOutputSurfaceNV(const void* vdpSurface, (unsigned int) GLenum target, (int) GLsizei numTextureNames, const GLuint* textureNames);
    /// ```
    public long VDPAURegisterOutputSurfaceNV(@NonNull MemorySegment vdpSurface, int target, int numTextureNames, @NonNull MemorySegment textureNames) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAURegisterOutputSurfaceNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAURegisterOutputSurfaceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAURegisterOutputSurfaceNV", vdpSurface, target, numTextureNames, textureNames); }
        return (long) Handles.MH_glVDPAURegisterOutputSurfaceNV.invokeExact(handles.PFN_glVDPAURegisterOutputSurfaceNV, vdpSurface, target, numTextureNames, textureNames); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAURegisterOutputSurfaceNV", e); }
    }

    /// Invokes `glVDPAUIsSurfaceNV`.
    /// ```
    /// GLboolean glVDPAUIsSurfaceNV((((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV surface);
    /// ```
    public boolean VDPAUIsSurfaceNV(long surface) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUIsSurfaceNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUIsSurfaceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUIsSurfaceNV", surface); }
        return (((byte) Handles.MH_glVDPAUIsSurfaceNV.invokeExact(handles.PFN_glVDPAUIsSurfaceNV, surface)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUIsSurfaceNV", e); }
    }

    /// Invokes `glVDPAUUnregisterSurfaceNV`.
    /// ```
    /// void glVDPAUUnregisterSurfaceNV((((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV surface);
    /// ```
    public void VDPAUUnregisterSurfaceNV(long surface) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUUnregisterSurfaceNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUUnregisterSurfaceNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUUnregisterSurfaceNV", surface); }
        Handles.MH_glVDPAUUnregisterSurfaceNV.invokeExact(handles.PFN_glVDPAUUnregisterSurfaceNV, surface); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUUnregisterSurfaceNV", e); }
    }

    /// Invokes `glVDPAUGetSurfaceivNV`.
    /// ```
    /// void glVDPAUGetSurfaceivNV((((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV surface, (unsigned int) GLenum pname, (int) GLsizei count, GLsizei* length, GLint* values);
    /// ```
    public void VDPAUGetSurfaceivNV(long surface, int pname, int count, @NonNull MemorySegment length, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUGetSurfaceivNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUGetSurfaceivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUGetSurfaceivNV", surface, pname, count, length, values); }
        Handles.MH_glVDPAUGetSurfaceivNV.invokeExact(handles.PFN_glVDPAUGetSurfaceivNV, surface, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUGetSurfaceivNV", e); }
    }

    /// Invokes `glVDPAUSurfaceAccessNV`.
    /// ```
    /// void glVDPAUSurfaceAccessNV((((signed long long) khronos_intptr_t) GLintptr) GLvdpauSurfaceNV surface, (unsigned int) GLenum access);
    /// ```
    public void VDPAUSurfaceAccessNV(long surface, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUSurfaceAccessNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUSurfaceAccessNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUSurfaceAccessNV", surface, access); }
        Handles.MH_glVDPAUSurfaceAccessNV.invokeExact(handles.PFN_glVDPAUSurfaceAccessNV, surface, access); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUSurfaceAccessNV", e); }
    }

    /// Invokes `glVDPAUMapSurfacesNV`.
    /// ```
    /// void glVDPAUMapSurfacesNV((int) GLsizei numSurfaces, const GLvdpauSurfaceNV* surfaces);
    /// ```
    public void VDPAUMapSurfacesNV(int numSurfaces, @NonNull MemorySegment surfaces) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUMapSurfacesNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUMapSurfacesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUMapSurfacesNV", numSurfaces, surfaces); }
        Handles.MH_glVDPAUMapSurfacesNV.invokeExact(handles.PFN_glVDPAUMapSurfacesNV, numSurfaces, surfaces); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUMapSurfacesNV", e); }
    }

    /// Invokes `glVDPAUUnmapSurfacesNV`.
    /// ```
    /// void glVDPAUUnmapSurfacesNV((int) GLsizei numSurface, const GLvdpauSurfaceNV* surfaces);
    /// ```
    public void VDPAUUnmapSurfacesNV(int numSurface, @NonNull MemorySegment surfaces) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVDPAUUnmapSurfacesNV)) throw new GLSymbolNotFoundError("Symbol not found: glVDPAUUnmapSurfacesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVDPAUUnmapSurfacesNV", numSurface, surfaces); }
        Handles.MH_glVDPAUUnmapSurfacesNV.invokeExact(handles.PFN_glVDPAUUnmapSurfacesNV, numSurface, surfaces); }
        catch (Throwable e) { throw new RuntimeException("error in VDPAUUnmapSurfacesNV", e); }
    }

}
