// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_half_float`
public final class GLNVHalfFloat {
    public static final int GL_HALF_FLOAT_NV = 0x140B;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glVertex2hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertex2hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertex3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertex3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertex4hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertex4hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glNormal3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glNormal3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glColor3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glColor3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glColor4hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glColor4hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord1hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glTexCoord1hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord2hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glTexCoord2hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glTexCoord3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord4hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glTexCoord4hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord1hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord1hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord2hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord2hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord4hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glMultiTexCoord4hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib1hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib2hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexAttrib4hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs1hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs2hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexAttribs4hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glFogCoordhNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glFogCoordhvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3hNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3hvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glVertexWeighthNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glVertexWeighthvNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glVertex2hNV;
        public final MemorySegment PFN_glVertex2hvNV;
        public final MemorySegment PFN_glVertex3hNV;
        public final MemorySegment PFN_glVertex3hvNV;
        public final MemorySegment PFN_glVertex4hNV;
        public final MemorySegment PFN_glVertex4hvNV;
        public final MemorySegment PFN_glNormal3hNV;
        public final MemorySegment PFN_glNormal3hvNV;
        public final MemorySegment PFN_glColor3hNV;
        public final MemorySegment PFN_glColor3hvNV;
        public final MemorySegment PFN_glColor4hNV;
        public final MemorySegment PFN_glColor4hvNV;
        public final MemorySegment PFN_glTexCoord1hNV;
        public final MemorySegment PFN_glTexCoord1hvNV;
        public final MemorySegment PFN_glTexCoord2hNV;
        public final MemorySegment PFN_glTexCoord2hvNV;
        public final MemorySegment PFN_glTexCoord3hNV;
        public final MemorySegment PFN_glTexCoord3hvNV;
        public final MemorySegment PFN_glTexCoord4hNV;
        public final MemorySegment PFN_glTexCoord4hvNV;
        public final MemorySegment PFN_glMultiTexCoord1hNV;
        public final MemorySegment PFN_glMultiTexCoord1hvNV;
        public final MemorySegment PFN_glMultiTexCoord2hNV;
        public final MemorySegment PFN_glMultiTexCoord2hvNV;
        public final MemorySegment PFN_glMultiTexCoord3hNV;
        public final MemorySegment PFN_glMultiTexCoord3hvNV;
        public final MemorySegment PFN_glMultiTexCoord4hNV;
        public final MemorySegment PFN_glMultiTexCoord4hvNV;
        public final MemorySegment PFN_glVertexAttrib1hNV;
        public final MemorySegment PFN_glVertexAttrib1hvNV;
        public final MemorySegment PFN_glVertexAttrib2hNV;
        public final MemorySegment PFN_glVertexAttrib2hvNV;
        public final MemorySegment PFN_glVertexAttrib3hNV;
        public final MemorySegment PFN_glVertexAttrib3hvNV;
        public final MemorySegment PFN_glVertexAttrib4hNV;
        public final MemorySegment PFN_glVertexAttrib4hvNV;
        public final MemorySegment PFN_glVertexAttribs1hvNV;
        public final MemorySegment PFN_glVertexAttribs2hvNV;
        public final MemorySegment PFN_glVertexAttribs3hvNV;
        public final MemorySegment PFN_glVertexAttribs4hvNV;
        public final MemorySegment PFN_glFogCoordhNV;
        public final MemorySegment PFN_glFogCoordhvNV;
        public final MemorySegment PFN_glSecondaryColor3hNV;
        public final MemorySegment PFN_glSecondaryColor3hvNV;
        public final MemorySegment PFN_glVertexWeighthNV;
        public final MemorySegment PFN_glVertexWeighthvNV;
        private Handles(GLLoadFunc func) {
            PFN_glVertex2hNV = func.invoke("glVertex2hNV");
            PFN_glVertex2hvNV = func.invoke("glVertex2hvNV");
            PFN_glVertex3hNV = func.invoke("glVertex3hNV");
            PFN_glVertex3hvNV = func.invoke("glVertex3hvNV");
            PFN_glVertex4hNV = func.invoke("glVertex4hNV");
            PFN_glVertex4hvNV = func.invoke("glVertex4hvNV");
            PFN_glNormal3hNV = func.invoke("glNormal3hNV");
            PFN_glNormal3hvNV = func.invoke("glNormal3hvNV");
            PFN_glColor3hNV = func.invoke("glColor3hNV");
            PFN_glColor3hvNV = func.invoke("glColor3hvNV");
            PFN_glColor4hNV = func.invoke("glColor4hNV");
            PFN_glColor4hvNV = func.invoke("glColor4hvNV");
            PFN_glTexCoord1hNV = func.invoke("glTexCoord1hNV");
            PFN_glTexCoord1hvNV = func.invoke("glTexCoord1hvNV");
            PFN_glTexCoord2hNV = func.invoke("glTexCoord2hNV");
            PFN_glTexCoord2hvNV = func.invoke("glTexCoord2hvNV");
            PFN_glTexCoord3hNV = func.invoke("glTexCoord3hNV");
            PFN_glTexCoord3hvNV = func.invoke("glTexCoord3hvNV");
            PFN_glTexCoord4hNV = func.invoke("glTexCoord4hNV");
            PFN_glTexCoord4hvNV = func.invoke("glTexCoord4hvNV");
            PFN_glMultiTexCoord1hNV = func.invoke("glMultiTexCoord1hNV");
            PFN_glMultiTexCoord1hvNV = func.invoke("glMultiTexCoord1hvNV");
            PFN_glMultiTexCoord2hNV = func.invoke("glMultiTexCoord2hNV");
            PFN_glMultiTexCoord2hvNV = func.invoke("glMultiTexCoord2hvNV");
            PFN_glMultiTexCoord3hNV = func.invoke("glMultiTexCoord3hNV");
            PFN_glMultiTexCoord3hvNV = func.invoke("glMultiTexCoord3hvNV");
            PFN_glMultiTexCoord4hNV = func.invoke("glMultiTexCoord4hNV");
            PFN_glMultiTexCoord4hvNV = func.invoke("glMultiTexCoord4hvNV");
            PFN_glVertexAttrib1hNV = func.invoke("glVertexAttrib1hNV");
            PFN_glVertexAttrib1hvNV = func.invoke("glVertexAttrib1hvNV");
            PFN_glVertexAttrib2hNV = func.invoke("glVertexAttrib2hNV");
            PFN_glVertexAttrib2hvNV = func.invoke("glVertexAttrib2hvNV");
            PFN_glVertexAttrib3hNV = func.invoke("glVertexAttrib3hNV");
            PFN_glVertexAttrib3hvNV = func.invoke("glVertexAttrib3hvNV");
            PFN_glVertexAttrib4hNV = func.invoke("glVertexAttrib4hNV");
            PFN_glVertexAttrib4hvNV = func.invoke("glVertexAttrib4hvNV");
            PFN_glVertexAttribs1hvNV = func.invoke("glVertexAttribs1hvNV");
            PFN_glVertexAttribs2hvNV = func.invoke("glVertexAttribs2hvNV");
            PFN_glVertexAttribs3hvNV = func.invoke("glVertexAttribs3hvNV");
            PFN_glVertexAttribs4hvNV = func.invoke("glVertexAttribs4hvNV");PFN_glFogCoordhNV = func.invoke("glFogCoordhNV");
            PFN_glFogCoordhvNV = func.invoke("glFogCoordhvNV");PFN_glSecondaryColor3hNV = func.invoke("glSecondaryColor3hNV");
            PFN_glSecondaryColor3hvNV = func.invoke("glSecondaryColor3hvNV");PFN_glVertexWeighthNV = func.invoke("glVertexWeighthNV");
            PFN_glVertexWeighthvNV = func.invoke("glVertexWeighthvNV");
        }
    }

    public GLNVHalfFloat(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertex2hNV`.
    /// ```
    /// void glVertex2hNV((unsigned short) GLhalfNV x, (unsigned short) GLhalfNV y);
    /// ```
    public void Vertex2hNV(short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertex2hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex2hNV", x, y); }
        Handles.MH_glVertex2hNV.get().invokeExact(handles.PFN_glVertex2hNV, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2hNV", e); }
    }

    /// Invokes `glVertex2hvNV`.
    /// ```
    /// void glVertex2hvNV(const GLhalfNV* v);
    /// ```
    public void Vertex2hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertex2hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex2hvNV", v); }
        Handles.MH_glVertex2hvNV.get().invokeExact(handles.PFN_glVertex2hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2hvNV", e); }
    }

    /// Invokes `glVertex3hNV`.
    /// ```
    /// void glVertex3hNV((unsigned short) GLhalfNV x, (unsigned short) GLhalfNV y, (unsigned short) GLhalfNV z);
    /// ```
    public void Vertex3hNV(short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertex3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex3hNV", x, y, z); }
        Handles.MH_glVertex3hNV.get().invokeExact(handles.PFN_glVertex3hNV, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3hNV", e); }
    }

    /// Invokes `glVertex3hvNV`.
    /// ```
    /// void glVertex3hvNV(const GLhalfNV* v);
    /// ```
    public void Vertex3hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertex3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex3hvNV", v); }
        Handles.MH_glVertex3hvNV.get().invokeExact(handles.PFN_glVertex3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3hvNV", e); }
    }

    /// Invokes `glVertex4hNV`.
    /// ```
    /// void glVertex4hNV((unsigned short) GLhalfNV x, (unsigned short) GLhalfNV y, (unsigned short) GLhalfNV z, (unsigned short) GLhalfNV w);
    /// ```
    public void Vertex4hNV(short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertex4hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex4hNV", x, y, z, w); }
        Handles.MH_glVertex4hNV.get().invokeExact(handles.PFN_glVertex4hNV, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4hNV", e); }
    }

    /// Invokes `glVertex4hvNV`.
    /// ```
    /// void glVertex4hvNV(const GLhalfNV* v);
    /// ```
    public void Vertex4hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertex4hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex4hvNV", v); }
        Handles.MH_glVertex4hvNV.get().invokeExact(handles.PFN_glVertex4hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4hvNV", e); }
    }

    /// Invokes `glNormal3hNV`.
    /// ```
    /// void glNormal3hNV((unsigned short) GLhalfNV nx, (unsigned short) GLhalfNV ny, (unsigned short) GLhalfNV nz);
    /// ```
    public void Normal3hNV(short nx, short ny, short nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormal3hNV", nx, ny, nz); }
        Handles.MH_glNormal3hNV.get().invokeExact(handles.PFN_glNormal3hNV, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3hNV", e); }
    }

    /// Invokes `glNormal3hvNV`.
    /// ```
    /// void glNormal3hvNV(const GLhalfNV* v);
    /// ```
    public void Normal3hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormal3hvNV", v); }
        Handles.MH_glNormal3hvNV.get().invokeExact(handles.PFN_glNormal3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3hvNV", e); }
    }

    /// Invokes `glColor3hNV`.
    /// ```
    /// void glColor3hNV((unsigned short) GLhalfNV red, (unsigned short) GLhalfNV green, (unsigned short) GLhalfNV blue);
    /// ```
    public void Color3hNV(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glColor3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor3hNV", red, green, blue); }
        Handles.MH_glColor3hNV.get().invokeExact(handles.PFN_glColor3hNV, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in Color3hNV", e); }
    }

    /// Invokes `glColor3hvNV`.
    /// ```
    /// void glColor3hvNV(const GLhalfNV* v);
    /// ```
    public void Color3hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glColor3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor3hvNV", v); }
        Handles.MH_glColor3hvNV.get().invokeExact(handles.PFN_glColor3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color3hvNV", e); }
    }

    /// Invokes `glColor4hNV`.
    /// ```
    /// void glColor4hNV((unsigned short) GLhalfNV red, (unsigned short) GLhalfNV green, (unsigned short) GLhalfNV blue, (unsigned short) GLhalfNV alpha);
    /// ```
    public void Color4hNV(short red, short green, short blue, short alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4hNV)) throw new GLSymbolNotFoundError("Symbol not found: glColor4hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4hNV", red, green, blue, alpha); }
        Handles.MH_glColor4hNV.get().invokeExact(handles.PFN_glColor4hNV, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in Color4hNV", e); }
    }

    /// Invokes `glColor4hvNV`.
    /// ```
    /// void glColor4hvNV(const GLhalfNV* v);
    /// ```
    public void Color4hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glColor4hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4hvNV", v); }
        Handles.MH_glColor4hvNV.get().invokeExact(handles.PFN_glColor4hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4hvNV", e); }
    }

    /// Invokes `glTexCoord1hNV`.
    /// ```
    /// void glTexCoord1hNV((unsigned short) GLhalfNV s);
    /// ```
    public void TexCoord1hNV(short s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1hNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord1hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord1hNV", s); }
        Handles.MH_glTexCoord1hNV.get().invokeExact(handles.PFN_glTexCoord1hNV, s); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1hNV", e); }
    }

    /// Invokes `glTexCoord1hvNV`.
    /// ```
    /// void glTexCoord1hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord1hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord1hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord1hvNV", v); }
        Handles.MH_glTexCoord1hvNV.get().invokeExact(handles.PFN_glTexCoord1hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1hvNV", e); }
    }

    /// Invokes `glTexCoord2hNV`.
    /// ```
    /// void glTexCoord2hNV((unsigned short) GLhalfNV s, (unsigned short) GLhalfNV t);
    /// ```
    public void TexCoord2hNV(short s, short t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2hNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2hNV", s, t); }
        Handles.MH_glTexCoord2hNV.get().invokeExact(handles.PFN_glTexCoord2hNV, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2hNV", e); }
    }

    /// Invokes `glTexCoord2hvNV`.
    /// ```
    /// void glTexCoord2hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord2hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2hvNV", v); }
        Handles.MH_glTexCoord2hvNV.get().invokeExact(handles.PFN_glTexCoord2hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2hvNV", e); }
    }

    /// Invokes `glTexCoord3hNV`.
    /// ```
    /// void glTexCoord3hNV((unsigned short) GLhalfNV s, (unsigned short) GLhalfNV t, (unsigned short) GLhalfNV r);
    /// ```
    public void TexCoord3hNV(short s, short t, short r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord3hNV", s, t, r); }
        Handles.MH_glTexCoord3hNV.get().invokeExact(handles.PFN_glTexCoord3hNV, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3hNV", e); }
    }

    /// Invokes `glTexCoord3hvNV`.
    /// ```
    /// void glTexCoord3hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord3hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord3hvNV", v); }
        Handles.MH_glTexCoord3hvNV.get().invokeExact(handles.PFN_glTexCoord3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3hvNV", e); }
    }

    /// Invokes `glTexCoord4hNV`.
    /// ```
    /// void glTexCoord4hNV((unsigned short) GLhalfNV s, (unsigned short) GLhalfNV t, (unsigned short) GLhalfNV r, (unsigned short) GLhalfNV q);
    /// ```
    public void TexCoord4hNV(short s, short t, short r, short q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4hNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4hNV", s, t, r, q); }
        Handles.MH_glTexCoord4hNV.get().invokeExact(handles.PFN_glTexCoord4hNV, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4hNV", e); }
    }

    /// Invokes `glTexCoord4hvNV`.
    /// ```
    /// void glTexCoord4hvNV(const GLhalfNV* v);
    /// ```
    public void TexCoord4hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4hvNV", v); }
        Handles.MH_glTexCoord4hvNV.get().invokeExact(handles.PFN_glTexCoord4hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4hvNV", e); }
    }

    /// Invokes `glMultiTexCoord1hNV`.
    /// ```
    /// void glMultiTexCoord1hNV((unsigned int) GLenum target, (unsigned short) GLhalfNV s);
    /// ```
    public void MultiTexCoord1hNV(int target, short s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1hNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1hNV", target, s); }
        Handles.MH_glMultiTexCoord1hNV.get().invokeExact(handles.PFN_glMultiTexCoord1hNV, target, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1hNV", e); }
    }

    /// Invokes `glMultiTexCoord1hvNV`.
    /// ```
    /// void glMultiTexCoord1hvNV((unsigned int) GLenum target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord1hvNV(int target, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1hvNV", target, v); }
        Handles.MH_glMultiTexCoord1hvNV.get().invokeExact(handles.PFN_glMultiTexCoord1hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1hvNV", e); }
    }

    /// Invokes `glMultiTexCoord2hNV`.
    /// ```
    /// void glMultiTexCoord2hNV((unsigned int) GLenum target, (unsigned short) GLhalfNV s, (unsigned short) GLhalfNV t);
    /// ```
    public void MultiTexCoord2hNV(int target, short s, short t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2hNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2hNV", target, s, t); }
        Handles.MH_glMultiTexCoord2hNV.get().invokeExact(handles.PFN_glMultiTexCoord2hNV, target, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2hNV", e); }
    }

    /// Invokes `glMultiTexCoord2hvNV`.
    /// ```
    /// void glMultiTexCoord2hvNV((unsigned int) GLenum target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord2hvNV(int target, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2hvNV", target, v); }
        Handles.MH_glMultiTexCoord2hvNV.get().invokeExact(handles.PFN_glMultiTexCoord2hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2hvNV", e); }
    }

    /// Invokes `glMultiTexCoord3hNV`.
    /// ```
    /// void glMultiTexCoord3hNV((unsigned int) GLenum target, (unsigned short) GLhalfNV s, (unsigned short) GLhalfNV t, (unsigned short) GLhalfNV r);
    /// ```
    public void MultiTexCoord3hNV(int target, short s, short t, short r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3hNV", target, s, t, r); }
        Handles.MH_glMultiTexCoord3hNV.get().invokeExact(handles.PFN_glMultiTexCoord3hNV, target, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3hNV", e); }
    }

    /// Invokes `glMultiTexCoord3hvNV`.
    /// ```
    /// void glMultiTexCoord3hvNV((unsigned int) GLenum target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord3hvNV(int target, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3hvNV", target, v); }
        Handles.MH_glMultiTexCoord3hvNV.get().invokeExact(handles.PFN_glMultiTexCoord3hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3hvNV", e); }
    }

    /// Invokes `glMultiTexCoord4hNV`.
    /// ```
    /// void glMultiTexCoord4hNV((unsigned int) GLenum target, (unsigned short) GLhalfNV s, (unsigned short) GLhalfNV t, (unsigned short) GLhalfNV r, (unsigned short) GLhalfNV q);
    /// ```
    public void MultiTexCoord4hNV(int target, short s, short t, short r, short q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4hNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4hNV", target, s, t, r, q); }
        Handles.MH_glMultiTexCoord4hNV.get().invokeExact(handles.PFN_glMultiTexCoord4hNV, target, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4hNV", e); }
    }

    /// Invokes `glMultiTexCoord4hvNV`.
    /// ```
    /// void glMultiTexCoord4hvNV((unsigned int) GLenum target, const GLhalfNV* v);
    /// ```
    public void MultiTexCoord4hvNV(int target, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4hvNV", target, v); }
        Handles.MH_glMultiTexCoord4hvNV.get().invokeExact(handles.PFN_glMultiTexCoord4hvNV, target, v); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4hvNV", e); }
    }

    /// Invokes `glVertexAttrib1hNV`.
    /// ```
    /// void glVertexAttrib1hNV((unsigned int) GLuint index, (unsigned short) GLhalfNV x);
    /// ```
    public void VertexAttrib1hNV(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1hNV", index, x); }
        Handles.MH_glVertexAttrib1hNV.get().invokeExact(handles.PFN_glVertexAttrib1hNV, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1hNV", e); }
    }

    /// Invokes `glVertexAttrib1hvNV`.
    /// ```
    /// void glVertexAttrib1hvNV((unsigned int) GLuint index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib1hvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1hvNV", index, v); }
        Handles.MH_glVertexAttrib1hvNV.get().invokeExact(handles.PFN_glVertexAttrib1hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1hvNV", e); }
    }

    /// Invokes `glVertexAttrib2hNV`.
    /// ```
    /// void glVertexAttrib2hNV((unsigned int) GLuint index, (unsigned short) GLhalfNV x, (unsigned short) GLhalfNV y);
    /// ```
    public void VertexAttrib2hNV(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2hNV", index, x, y); }
        Handles.MH_glVertexAttrib2hNV.get().invokeExact(handles.PFN_glVertexAttrib2hNV, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2hNV", e); }
    }

    /// Invokes `glVertexAttrib2hvNV`.
    /// ```
    /// void glVertexAttrib2hvNV((unsigned int) GLuint index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib2hvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2hvNV", index, v); }
        Handles.MH_glVertexAttrib2hvNV.get().invokeExact(handles.PFN_glVertexAttrib2hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2hvNV", e); }
    }

    /// Invokes `glVertexAttrib3hNV`.
    /// ```
    /// void glVertexAttrib3hNV((unsigned int) GLuint index, (unsigned short) GLhalfNV x, (unsigned short) GLhalfNV y, (unsigned short) GLhalfNV z);
    /// ```
    public void VertexAttrib3hNV(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3hNV", index, x, y, z); }
        Handles.MH_glVertexAttrib3hNV.get().invokeExact(handles.PFN_glVertexAttrib3hNV, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3hNV", e); }
    }

    /// Invokes `glVertexAttrib3hvNV`.
    /// ```
    /// void glVertexAttrib3hvNV((unsigned int) GLuint index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib3hvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3hvNV", index, v); }
        Handles.MH_glVertexAttrib3hvNV.get().invokeExact(handles.PFN_glVertexAttrib3hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3hvNV", e); }
    }

    /// Invokes `glVertexAttrib4hNV`.
    /// ```
    /// void glVertexAttrib4hNV((unsigned int) GLuint index, (unsigned short) GLhalfNV x, (unsigned short) GLhalfNV y, (unsigned short) GLhalfNV z, (unsigned short) GLhalfNV w);
    /// ```
    public void VertexAttrib4hNV(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4hNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4hNV", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4hNV.get().invokeExact(handles.PFN_glVertexAttrib4hNV, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4hNV", e); }
    }

    /// Invokes `glVertexAttrib4hvNV`.
    /// ```
    /// void glVertexAttrib4hvNV((unsigned int) GLuint index, const GLhalfNV* v);
    /// ```
    public void VertexAttrib4hvNV(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4hvNV", index, v); }
        Handles.MH_glVertexAttrib4hvNV.get().invokeExact(handles.PFN_glVertexAttrib4hvNV, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4hvNV", e); }
    }

    /// Invokes `glVertexAttribs1hvNV`.
    /// ```
    /// void glVertexAttribs1hvNV((unsigned int) GLuint index, (int) GLsizei n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs1hvNV(int index, int n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs1hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs1hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs1hvNV", index, n, v); }
        Handles.MH_glVertexAttribs1hvNV.get().invokeExact(handles.PFN_glVertexAttribs1hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs1hvNV", e); }
    }

    /// Invokes `glVertexAttribs2hvNV`.
    /// ```
    /// void glVertexAttribs2hvNV((unsigned int) GLuint index, (int) GLsizei n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs2hvNV(int index, int n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs2hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs2hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs2hvNV", index, n, v); }
        Handles.MH_glVertexAttribs2hvNV.get().invokeExact(handles.PFN_glVertexAttribs2hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs2hvNV", e); }
    }

    /// Invokes `glVertexAttribs3hvNV`.
    /// ```
    /// void glVertexAttribs3hvNV((unsigned int) GLuint index, (int) GLsizei n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs3hvNV(int index, int n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs3hvNV", index, n, v); }
        Handles.MH_glVertexAttribs3hvNV.get().invokeExact(handles.PFN_glVertexAttribs3hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs3hvNV", e); }
    }

    /// Invokes `glVertexAttribs4hvNV`.
    /// ```
    /// void glVertexAttribs4hvNV((unsigned int) GLuint index, (int) GLsizei n, const GLhalfNV* v);
    /// ```
    public void VertexAttribs4hvNV(int index, int n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribs4hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribs4hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribs4hvNV", index, n, v); }
        Handles.MH_glVertexAttribs4hvNV.get().invokeExact(handles.PFN_glVertexAttribs4hvNV, index, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribs4hvNV", e); }
    }

    /// Invokes `glFogCoordhNV`.
    /// ```
    /// void glFogCoordhNV((unsigned short) GLhalfNV fog);
    /// ```
    public void FogCoordhNV(short fog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordhNV)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordhNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordhNV", fog); }
        Handles.MH_glFogCoordhNV.get().invokeExact(handles.PFN_glFogCoordhNV, fog); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordhNV", e); }
    }

    /// Invokes `glFogCoordhvNV`.
    /// ```
    /// void glFogCoordhvNV(const GLhalfNV* fog);
    /// ```
    public void FogCoordhvNV(@NonNull MemorySegment fog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordhvNV)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordhvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordhvNV", fog); }
        Handles.MH_glFogCoordhvNV.get().invokeExact(handles.PFN_glFogCoordhvNV, fog); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordhvNV", e); }
    }

    /// Invokes `glSecondaryColor3hNV`.
    /// ```
    /// void glSecondaryColor3hNV((unsigned short) GLhalfNV red, (unsigned short) GLhalfNV green, (unsigned short) GLhalfNV blue);
    /// ```
    public void SecondaryColor3hNV(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3hNV)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3hNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3hNV", red, green, blue); }
        Handles.MH_glSecondaryColor3hNV.get().invokeExact(handles.PFN_glSecondaryColor3hNV, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3hNV", e); }
    }

    /// Invokes `glSecondaryColor3hvNV`.
    /// ```
    /// void glSecondaryColor3hvNV(const GLhalfNV* v);
    /// ```
    public void SecondaryColor3hvNV(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3hvNV)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3hvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3hvNV", v); }
        Handles.MH_glSecondaryColor3hvNV.get().invokeExact(handles.PFN_glSecondaryColor3hvNV, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3hvNV", e); }
    }

    /// Invokes `glVertexWeighthNV`.
    /// ```
    /// void glVertexWeighthNV((unsigned short) GLhalfNV weight);
    /// ```
    public void VertexWeighthNV(short weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeighthNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexWeighthNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexWeighthNV", weight); }
        Handles.MH_glVertexWeighthNV.get().invokeExact(handles.PFN_glVertexWeighthNV, weight); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeighthNV", e); }
    }

    /// Invokes `glVertexWeighthvNV`.
    /// ```
    /// void glVertexWeighthvNV(const GLhalfNV* weight);
    /// ```
    public void VertexWeighthvNV(@NonNull MemorySegment weight) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexWeighthvNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexWeighthvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexWeighthvNV", weight); }
        Handles.MH_glVertexWeighthvNV.get().invokeExact(handles.PFN_glVertexWeighthvNV, weight); }
        catch (Throwable e) { throw new RuntimeException("error in VertexWeighthvNV", e); }
    }

}
