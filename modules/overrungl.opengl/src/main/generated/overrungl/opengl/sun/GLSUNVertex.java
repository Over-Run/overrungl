// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sun;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SUN_vertex`
public final class GLSUNVertex {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glColor4ubVertex2fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glColor4ubVertex2fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glColor4ubVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glColor4ubVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glColor3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glColor3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glColor4fNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glColor4fNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord4fVertex4fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord4fVertex4fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fColor4ubVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fColor4ubVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fColor3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fColor3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fColor4fNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord2fColor4fNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexCoord4fColor4fNormal3fVertex4fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glTexCoord4fColor4fNormal3fVertex4fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiColor4ubVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiColor4ubVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiColor3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiColor3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiTexCoord2fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiTexCoord2fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glColor4ubVertex2fSUN;
        public final MemorySegment PFN_glColor4ubVertex2fvSUN;
        public final MemorySegment PFN_glColor4ubVertex3fSUN;
        public final MemorySegment PFN_glColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glColor3fVertex3fSUN;
        public final MemorySegment PFN_glColor3fVertex3fvSUN;
        public final MemorySegment PFN_glNormal3fVertex3fSUN;
        public final MemorySegment PFN_glNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord4fVertex4fSUN;
        public final MemorySegment PFN_glTexCoord4fVertex4fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fSUN;
        public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN;
        private Handles(GLLoadFunc func) {
            PFN_glColor4ubVertex2fSUN = func.invoke("glColor4ubVertex2fSUN");
            PFN_glColor4ubVertex2fvSUN = func.invoke("glColor4ubVertex2fvSUN");
            PFN_glColor4ubVertex3fSUN = func.invoke("glColor4ubVertex3fSUN");
            PFN_glColor4ubVertex3fvSUN = func.invoke("glColor4ubVertex3fvSUN");
            PFN_glColor3fVertex3fSUN = func.invoke("glColor3fVertex3fSUN");
            PFN_glColor3fVertex3fvSUN = func.invoke("glColor3fVertex3fvSUN");
            PFN_glNormal3fVertex3fSUN = func.invoke("glNormal3fVertex3fSUN");
            PFN_glNormal3fVertex3fvSUN = func.invoke("glNormal3fVertex3fvSUN");
            PFN_glColor4fNormal3fVertex3fSUN = func.invoke("glColor4fNormal3fVertex3fSUN");
            PFN_glColor4fNormal3fVertex3fvSUN = func.invoke("glColor4fNormal3fVertex3fvSUN");
            PFN_glTexCoord2fVertex3fSUN = func.invoke("glTexCoord2fVertex3fSUN");
            PFN_glTexCoord2fVertex3fvSUN = func.invoke("glTexCoord2fVertex3fvSUN");
            PFN_glTexCoord4fVertex4fSUN = func.invoke("glTexCoord4fVertex4fSUN");
            PFN_glTexCoord4fVertex4fvSUN = func.invoke("glTexCoord4fVertex4fvSUN");
            PFN_glTexCoord2fColor4ubVertex3fSUN = func.invoke("glTexCoord2fColor4ubVertex3fSUN");
            PFN_glTexCoord2fColor4ubVertex3fvSUN = func.invoke("glTexCoord2fColor4ubVertex3fvSUN");
            PFN_glTexCoord2fColor3fVertex3fSUN = func.invoke("glTexCoord2fColor3fVertex3fSUN");
            PFN_glTexCoord2fColor3fVertex3fvSUN = func.invoke("glTexCoord2fColor3fVertex3fvSUN");
            PFN_glTexCoord2fNormal3fVertex3fSUN = func.invoke("glTexCoord2fNormal3fVertex3fSUN");
            PFN_glTexCoord2fNormal3fVertex3fvSUN = func.invoke("glTexCoord2fNormal3fVertex3fvSUN");
            PFN_glTexCoord2fColor4fNormal3fVertex3fSUN = func.invoke("glTexCoord2fColor4fNormal3fVertex3fSUN");
            PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN = func.invoke("glTexCoord2fColor4fNormal3fVertex3fvSUN");
            PFN_glTexCoord4fColor4fNormal3fVertex4fSUN = func.invoke("glTexCoord4fColor4fNormal3fVertex4fSUN");
            PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN = func.invoke("glTexCoord4fColor4fNormal3fVertex4fvSUN");
            PFN_glReplacementCodeuiVertex3fSUN = func.invoke("glReplacementCodeuiVertex3fSUN");
            PFN_glReplacementCodeuiVertex3fvSUN = func.invoke("glReplacementCodeuiVertex3fvSUN");
            PFN_glReplacementCodeuiColor4ubVertex3fSUN = func.invoke("glReplacementCodeuiColor4ubVertex3fSUN");
            PFN_glReplacementCodeuiColor4ubVertex3fvSUN = func.invoke("glReplacementCodeuiColor4ubVertex3fvSUN");
            PFN_glReplacementCodeuiColor3fVertex3fSUN = func.invoke("glReplacementCodeuiColor3fVertex3fSUN");
            PFN_glReplacementCodeuiColor3fVertex3fvSUN = func.invoke("glReplacementCodeuiColor3fVertex3fvSUN");
            PFN_glReplacementCodeuiNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiColor4fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiColor4fNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN");
        }
    }

    public GLSUNVertex(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glColor4ubVertex2fSUN`.
    /// ```
    /// void glColor4ubVertex2fSUN(((unsigned char) khronos_uint8_t) GLubyte r, ((unsigned char) khronos_uint8_t) GLubyte g, ((unsigned char) khronos_uint8_t) GLubyte b, ((unsigned char) khronos_uint8_t) GLubyte a, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void Color4ubVertex2fSUN(byte r, byte g, byte b, byte a, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex2fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor4ubVertex2fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4ubVertex2fSUN", r, g, b, a, x, y); }
        Handles.MH_glColor4ubVertex2fSUN.get().invokeExact(handles.PFN_glColor4ubVertex2fSUN, r, g, b, a, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex2fSUN", e); }
    }

    /// Invokes `glColor4ubVertex2fvSUN`.
    /// ```
    /// void glColor4ubVertex2fvSUN(const GLubyte* c, const GLfloat* v);
    /// ```
    public void Color4ubVertex2fvSUN(@NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex2fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor4ubVertex2fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4ubVertex2fvSUN", c, v); }
        Handles.MH_glColor4ubVertex2fvSUN.get().invokeExact(handles.PFN_glColor4ubVertex2fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex2fvSUN", e); }
    }

    /// Invokes `glColor4ubVertex3fSUN`.
    /// ```
    /// void glColor4ubVertex3fSUN(((unsigned char) khronos_uint8_t) GLubyte r, ((unsigned char) khronos_uint8_t) GLubyte g, ((unsigned char) khronos_uint8_t) GLubyte b, ((unsigned char) khronos_uint8_t) GLubyte a, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void Color4ubVertex3fSUN(byte r, byte g, byte b, byte a, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor4ubVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4ubVertex3fSUN", r, g, b, a, x, y, z); }
        Handles.MH_glColor4ubVertex3fSUN.get().invokeExact(handles.PFN_glColor4ubVertex3fSUN, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex3fSUN", e); }
    }

    /// Invokes `glColor4ubVertex3fvSUN`.
    /// ```
    /// void glColor4ubVertex3fvSUN(const GLubyte* c, const GLfloat* v);
    /// ```
    public void Color4ubVertex3fvSUN(@NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4ubVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor4ubVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4ubVertex3fvSUN", c, v); }
        Handles.MH_glColor4ubVertex3fvSUN.get().invokeExact(handles.PFN_glColor4ubVertex3fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4ubVertex3fvSUN", e); }
    }

    /// Invokes `glColor3fVertex3fSUN`.
    /// ```
    /// void glColor3fVertex3fSUN(((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void Color3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor3fVertex3fSUN", r, g, b, x, y, z); }
        Handles.MH_glColor3fVertex3fSUN.get().invokeExact(handles.PFN_glColor3fVertex3fSUN, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Color3fVertex3fSUN", e); }
    }

    /// Invokes `glColor3fVertex3fvSUN`.
    /// ```
    /// void glColor3fVertex3fvSUN(const GLfloat* c, const GLfloat* v);
    /// ```
    public void Color3fVertex3fvSUN(@NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor3fVertex3fvSUN", c, v); }
        Handles.MH_glColor3fVertex3fvSUN.get().invokeExact(handles.PFN_glColor3fVertex3fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color3fVertex3fvSUN", e); }
    }

    /// Invokes `glNormal3fVertex3fSUN`.
    /// ```
    /// void glNormal3fVertex3fSUN(((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void Normal3fVertex3fSUN(float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormal3fVertex3fSUN", nx, ny, nz, x, y, z); }
        Handles.MH_glNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glNormal3fVertex3fSUN, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3fVertex3fSUN", e); }
    }

    /// Invokes `glNormal3fVertex3fvSUN`.
    /// ```
    /// void glNormal3fVertex3fvSUN(const GLfloat* n, const GLfloat* v);
    /// ```
    public void Normal3fVertex3fvSUN(@NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormal3fVertex3fvSUN", n, v); }
        Handles.MH_glNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glNormal3fVertex3fvSUN, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3fVertex3fvSUN", e); }
    }

    /// Invokes `glColor4fNormal3fVertex3fSUN`.
    /// ```
    /// void glColor4fNormal3fVertex3fSUN(((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat a, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void Color4fNormal3fVertex3fSUN(float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4fNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4fNormal3fVertex3fSUN", r, g, b, a, nx, ny, nz, x, y, z); }
        Handles.MH_glColor4fNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glColor4fNormal3fVertex3fSUN, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Color4fNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glColor4fNormal3fVertex3fvSUN`.
    /// ```
    /// void glColor4fNormal3fVertex3fvSUN(const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void Color4fNormal3fVertex3fvSUN(@NonNull MemorySegment c, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4fNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4fNormal3fVertex3fvSUN", c, n, v); }
        Handles.MH_glColor4fNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glColor4fNormal3fVertex3fvSUN, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in Color4fNormal3fVertex3fvSUN", e); }
    }

    /// Invokes `glTexCoord2fVertex3fSUN`.
    /// ```
    /// void glTexCoord2fVertex3fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void TexCoord2fVertex3fSUN(float s, float t, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fVertex3fSUN", s, t, x, y, z); }
        Handles.MH_glTexCoord2fVertex3fSUN.get().invokeExact(handles.PFN_glTexCoord2fVertex3fSUN, s, t, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fVertex3fSUN", e); }
    }

    /// Invokes `glTexCoord2fVertex3fvSUN`.
    /// ```
    /// void glTexCoord2fVertex3fvSUN(const GLfloat* tc, const GLfloat* v);
    /// ```
    public void TexCoord2fVertex3fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fVertex3fvSUN", tc, v); }
        Handles.MH_glTexCoord2fVertex3fvSUN.get().invokeExact(handles.PFN_glTexCoord2fVertex3fvSUN, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fVertex3fvSUN", e); }
    }

    /// Invokes `glTexCoord4fVertex4fSUN`.
    /// ```
    /// void glTexCoord4fVertex4fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat p, ((float) khronos_float_t) GLfloat q, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void TexCoord4fVertex4fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fVertex4fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4fVertex4fSUN", s, t, p, q, x, y, z, w); }
        Handles.MH_glTexCoord4fVertex4fSUN.get().invokeExact(handles.PFN_glTexCoord4fVertex4fSUN, s, t, p, q, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fVertex4fSUN", e); }
    }

    /// Invokes `glTexCoord4fVertex4fvSUN`.
    /// ```
    /// void glTexCoord4fVertex4fvSUN(const GLfloat* tc, const GLfloat* v);
    /// ```
    public void TexCoord4fVertex4fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fVertex4fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4fVertex4fvSUN", tc, v); }
        Handles.MH_glTexCoord4fVertex4fvSUN.get().invokeExact(handles.PFN_glTexCoord4fVertex4fvSUN, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fVertex4fvSUN", e); }
    }

    /// Invokes `glTexCoord2fColor4ubVertex3fSUN`.
    /// ```
    /// void glTexCoord2fColor4ubVertex3fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((unsigned char) khronos_uint8_t) GLubyte r, ((unsigned char) khronos_uint8_t) GLubyte g, ((unsigned char) khronos_uint8_t) GLubyte b, ((unsigned char) khronos_uint8_t) GLubyte a, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void TexCoord2fColor4ubVertex3fSUN(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4ubVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fColor4ubVertex3fSUN", s, t, r, g, b, a, x, y, z); }
        Handles.MH_glTexCoord2fColor4ubVertex3fSUN.get().invokeExact(handles.PFN_glTexCoord2fColor4ubVertex3fSUN, s, t, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4ubVertex3fSUN", e); }
    }

    /// Invokes `glTexCoord2fColor4ubVertex3fvSUN`.
    /// ```
    /// void glTexCoord2fColor4ubVertex3fvSUN(const GLfloat* tc, const GLubyte* c, const GLfloat* v);
    /// ```
    public void TexCoord2fColor4ubVertex3fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4ubVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fColor4ubVertex3fvSUN", tc, c, v); }
        Handles.MH_glTexCoord2fColor4ubVertex3fvSUN.get().invokeExact(handles.PFN_glTexCoord2fColor4ubVertex3fvSUN, tc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4ubVertex3fvSUN", e); }
    }

    /// Invokes `glTexCoord2fColor3fVertex3fSUN`.
    /// ```
    /// void glTexCoord2fColor3fVertex3fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void TexCoord2fColor3fVertex3fSUN(float s, float t, float r, float g, float b, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fColor3fVertex3fSUN", s, t, r, g, b, x, y, z); }
        Handles.MH_glTexCoord2fColor3fVertex3fSUN.get().invokeExact(handles.PFN_glTexCoord2fColor3fVertex3fSUN, s, t, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor3fVertex3fSUN", e); }
    }

    /// Invokes `glTexCoord2fColor3fVertex3fvSUN`.
    /// ```
    /// void glTexCoord2fColor3fVertex3fvSUN(const GLfloat* tc, const GLfloat* c, const GLfloat* v);
    /// ```
    public void TexCoord2fColor3fVertex3fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fColor3fVertex3fvSUN", tc, c, v); }
        Handles.MH_glTexCoord2fColor3fVertex3fvSUN.get().invokeExact(handles.PFN_glTexCoord2fColor3fVertex3fvSUN, tc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor3fVertex3fvSUN", e); }
    }

    /// Invokes `glTexCoord2fNormal3fVertex3fSUN`.
    /// ```
    /// void glTexCoord2fNormal3fVertex3fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void TexCoord2fNormal3fVertex3fSUN(float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fNormal3fVertex3fSUN", s, t, nx, ny, nz, x, y, z); }
        Handles.MH_glTexCoord2fNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glTexCoord2fNormal3fVertex3fSUN, s, t, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glTexCoord2fNormal3fVertex3fvSUN`.
    /// ```
    /// void glTexCoord2fNormal3fVertex3fvSUN(const GLfloat* tc, const GLfloat* n, const GLfloat* v);
    /// ```
    public void TexCoord2fNormal3fVertex3fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fNormal3fVertex3fvSUN", tc, n, v); }
        Handles.MH_glTexCoord2fNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glTexCoord2fNormal3fVertex3fvSUN, tc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fNormal3fVertex3fvSUN", e); }
    }

    /// Invokes `glTexCoord2fColor4fNormal3fVertex3fSUN`.
    /// ```
    /// void glTexCoord2fColor4fNormal3fVertex3fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat a, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void TexCoord2fColor4fNormal3fVertex3fSUN(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fColor4fNormal3fVertex3fSUN", s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        Handles.MH_glTexCoord2fColor4fNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fSUN, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4fNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glTexCoord2fColor4fNormal3fVertex3fvSUN`.
    /// ```
    /// void glTexCoord2fColor4fNormal3fVertex3fvSUN(const GLfloat* tc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void TexCoord2fColor4fNormal3fVertex3fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment c, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2fColor4fNormal3fVertex3fvSUN", tc, c, n, v); }
        Handles.MH_glTexCoord2fColor4fNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2fColor4fNormal3fVertex3fvSUN", e); }
    }

    /// Invokes `glTexCoord4fColor4fNormal3fVertex4fSUN`.
    /// ```
    /// void glTexCoord4fColor4fNormal3fVertex4fSUN(((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat p, ((float) khronos_float_t) GLfloat q, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat a, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void TexCoord4fColor4fNormal3fVertex4fSUN(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4fColor4fNormal3fVertex4fSUN", s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w); }
        Handles.MH_glTexCoord4fColor4fNormal3fVertex4fSUN.get().invokeExact(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fSUN, s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fColor4fNormal3fVertex4fSUN", e); }
    }

    /// Invokes `glTexCoord4fColor4fNormal3fVertex4fvSUN`.
    /// ```
    /// void glTexCoord4fColor4fNormal3fVertex4fvSUN(const GLfloat* tc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void TexCoord4fColor4fNormal3fVertex4fvSUN(@NonNull MemorySegment tc, @NonNull MemorySegment c, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4fColor4fNormal3fVertex4fvSUN", tc, c, n, v); }
        Handles.MH_glTexCoord4fColor4fNormal3fVertex4fvSUN.get().invokeExact(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4fColor4fNormal3fVertex4fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiVertex3fSUN(int rc, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiVertex3fSUN", rc, x, y, z); }
        Handles.MH_glReplacementCodeuiVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiVertex3fSUN, rc, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiVertex3fvSUN(const GLuint* rc, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiVertex3fvSUN", rc, v); }
        Handles.MH_glReplacementCodeuiVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiVertex3fvSUN, rc, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiColor4ubVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiColor4ubVertex3fSUN((unsigned int) GLuint rc, ((unsigned char) khronos_uint8_t) GLubyte r, ((unsigned char) khronos_uint8_t) GLubyte g, ((unsigned char) khronos_uint8_t) GLubyte b, ((unsigned char) khronos_uint8_t) GLubyte a, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiColor4ubVertex3fSUN(int rc, byte r, byte g, byte b, byte a, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4ubVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiColor4ubVertex3fSUN", rc, r, g, b, a, x, y, z); }
        Handles.MH_glReplacementCodeuiColor4ubVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiColor4ubVertex3fSUN, rc, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4ubVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiColor4ubVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiColor4ubVertex3fvSUN(const GLuint* rc, const GLubyte* c, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiColor4ubVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4ubVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiColor4ubVertex3fvSUN", rc, c, v); }
        Handles.MH_glReplacementCodeuiColor4ubVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiColor4ubVertex3fvSUN, rc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4ubVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiColor3fVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiColor3fVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiColor3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiColor3fVertex3fSUN", rc, r, g, b, x, y, z); }
        Handles.MH_glReplacementCodeuiColor3fVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiColor3fVertex3fSUN, rc, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor3fVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiColor3fVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiColor3fVertex3fvSUN(const GLuint* rc, const GLfloat* c, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiColor3fVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment c, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiColor3fVertex3fvSUN", rc, c, v); }
        Handles.MH_glReplacementCodeuiColor3fVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiColor3fVertex3fvSUN, rc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor3fVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiNormal3fVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiNormal3fVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiNormal3fVertex3fSUN(int rc, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiNormal3fVertex3fSUN", rc, nx, ny, nz, x, y, z); }
        Handles.MH_glReplacementCodeuiNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiNormal3fVertex3fSUN, rc, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiNormal3fVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiNormal3fVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiNormal3fVertex3fvSUN", rc, n, v); }
        Handles.MH_glReplacementCodeuiNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiNormal3fVertex3fvSUN, rc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiNormal3fVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiColor4fNormal3fVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiColor4fNormal3fVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat a, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiColor4fNormal3fVertex3fSUN(int rc, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiColor4fNormal3fVertex3fSUN", rc, r, g, b, a, nx, ny, nz, x, y, z); }
        Handles.MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN, rc, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4fNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiColor4fNormal3fVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiColor4fNormal3fVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment c, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiColor4fNormal3fVertex3fvSUN", rc, c, n, v); }
        Handles.MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN, rc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiColor4fNormal3fVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiTexCoord2fVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiTexCoord2fVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiTexCoord2fVertex3fSUN(int rc, float s, float t, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiTexCoord2fVertex3fSUN", rc, s, t, x, y, z); }
        Handles.MH_glReplacementCodeuiTexCoord2fVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fSUN, rc, s, t, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiTexCoord2fVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiTexCoord2fVertex3fvSUN(const GLuint* rc, const GLfloat* tc, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiTexCoord2fVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment tc, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiTexCoord2fVertex3fvSUN", rc, tc, v); }
        Handles.MH_glReplacementCodeuiTexCoord2fVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN, rc, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(int rc, float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", rc, s, t, nx, ny, nz, x, y, z); }
        Handles.MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, rc, s, t, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* tc, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment tc, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", rc, tc, n, v); }
        Handles.MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN, rc, tc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", e); }
    }

    /// Invokes `glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN`.
    /// ```
    /// void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN((unsigned int) GLuint rc, ((float) khronos_float_t) GLfloat s, ((float) khronos_float_t) GLfloat t, ((float) khronos_float_t) GLfloat r, ((float) khronos_float_t) GLfloat g, ((float) khronos_float_t) GLfloat b, ((float) khronos_float_t) GLfloat a, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(int rc, float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", rc, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        Handles.MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN.get().invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, rc, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", e); }
    }

    /// Invokes `glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN`.
    /// ```
    /// void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(const GLuint* rc, const GLfloat* tc, const GLfloat* c, const GLfloat* n, const GLfloat* v);
    /// ```
    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(@NonNull MemorySegment rc, @NonNull MemorySegment tc, @NonNull MemorySegment c, @NonNull MemorySegment n, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", rc, tc, c, n, v); }
        Handles.MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN.get().invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN, rc, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", e); }
    }

}
