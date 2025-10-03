// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_secondary_color`
public final class GLEXTSecondaryColor {
    public static final int GL_COLOR_SUM_EXT = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glSecondaryColor3bEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3bvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3dEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3dvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3fEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3fvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3iEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3ivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3sEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3svEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3ubEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3ubvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3uiEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3uivEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3usEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glSecondaryColor3usvEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glSecondaryColorPointerEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glSecondaryColor3bEXT;
        public final MemorySegment PFN_glSecondaryColor3bvEXT;
        public final MemorySegment PFN_glSecondaryColor3dEXT;
        public final MemorySegment PFN_glSecondaryColor3dvEXT;
        public final MemorySegment PFN_glSecondaryColor3fEXT;
        public final MemorySegment PFN_glSecondaryColor3fvEXT;
        public final MemorySegment PFN_glSecondaryColor3iEXT;
        public final MemorySegment PFN_glSecondaryColor3ivEXT;
        public final MemorySegment PFN_glSecondaryColor3sEXT;
        public final MemorySegment PFN_glSecondaryColor3svEXT;
        public final MemorySegment PFN_glSecondaryColor3ubEXT;
        public final MemorySegment PFN_glSecondaryColor3ubvEXT;
        public final MemorySegment PFN_glSecondaryColor3uiEXT;
        public final MemorySegment PFN_glSecondaryColor3uivEXT;
        public final MemorySegment PFN_glSecondaryColor3usEXT;
        public final MemorySegment PFN_glSecondaryColor3usvEXT;
        public final MemorySegment PFN_glSecondaryColorPointerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glSecondaryColor3bEXT = func.invoke("glSecondaryColor3bEXT", "glSecondaryColor3b");
            PFN_glSecondaryColor3bvEXT = func.invoke("glSecondaryColor3bvEXT", "glSecondaryColor3bv");
            PFN_glSecondaryColor3dEXT = func.invoke("glSecondaryColor3dEXT", "glSecondaryColor3d");
            PFN_glSecondaryColor3dvEXT = func.invoke("glSecondaryColor3dvEXT", "glSecondaryColor3dv");
            PFN_glSecondaryColor3fEXT = func.invoke("glSecondaryColor3fEXT", "glSecondaryColor3f");
            PFN_glSecondaryColor3fvEXT = func.invoke("glSecondaryColor3fvEXT", "glSecondaryColor3fv");
            PFN_glSecondaryColor3iEXT = func.invoke("glSecondaryColor3iEXT", "glSecondaryColor3i");
            PFN_glSecondaryColor3ivEXT = func.invoke("glSecondaryColor3ivEXT", "glSecondaryColor3iv");
            PFN_glSecondaryColor3sEXT = func.invoke("glSecondaryColor3sEXT", "glSecondaryColor3s");
            PFN_glSecondaryColor3svEXT = func.invoke("glSecondaryColor3svEXT", "glSecondaryColor3sv");
            PFN_glSecondaryColor3ubEXT = func.invoke("glSecondaryColor3ubEXT", "glSecondaryColor3ub");
            PFN_glSecondaryColor3ubvEXT = func.invoke("glSecondaryColor3ubvEXT", "glSecondaryColor3ubv");
            PFN_glSecondaryColor3uiEXT = func.invoke("glSecondaryColor3uiEXT", "glSecondaryColor3ui");
            PFN_glSecondaryColor3uivEXT = func.invoke("glSecondaryColor3uivEXT", "glSecondaryColor3uiv");
            PFN_glSecondaryColor3usEXT = func.invoke("glSecondaryColor3usEXT", "glSecondaryColor3us");
            PFN_glSecondaryColor3usvEXT = func.invoke("glSecondaryColor3usvEXT", "glSecondaryColor3usv");
            PFN_glSecondaryColorPointerEXT = func.invoke("glSecondaryColorPointerEXT", "glSecondaryColorPointer");
        }
    }

    public GLEXTSecondaryColor(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSecondaryColor3bEXT`.
    /// ```
    /// void glSecondaryColor3bEXT(((signed char) khronos_int8_t) GLbyte red, ((signed char) khronos_int8_t) GLbyte green, ((signed char) khronos_int8_t) GLbyte blue);
    /// ```
    public void SecondaryColor3bEXT(byte red, byte green, byte blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3bEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3bEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3bEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3bEXT.get().invokeExact(handles.PFN_glSecondaryColor3bEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3bEXT", e); }
    }

    /// Invokes `glSecondaryColor3bvEXT`.
    /// ```
    /// void glSecondaryColor3bvEXT(const GLbyte* v);
    /// ```
    public void SecondaryColor3bvEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3bvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3bvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3bvEXT", v); }
        Handles.MH_glSecondaryColor3bvEXT.get().invokeExact(handles.PFN_glSecondaryColor3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3bvEXT", e); }
    }

    /// Invokes `glSecondaryColor3dEXT`.
    /// ```
    /// void glSecondaryColor3dEXT((double) GLdouble red, (double) GLdouble green, (double) GLdouble blue);
    /// ```
    public void SecondaryColor3dEXT(double red, double green, double blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3dEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3dEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3dEXT.get().invokeExact(handles.PFN_glSecondaryColor3dEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3dEXT", e); }
    }

    /// Invokes `glSecondaryColor3dvEXT`.
    /// ```
    /// void glSecondaryColor3dvEXT(const GLdouble* v);
    /// ```
    public void SecondaryColor3dvEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3dvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3dvEXT", v); }
        Handles.MH_glSecondaryColor3dvEXT.get().invokeExact(handles.PFN_glSecondaryColor3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3dvEXT", e); }
    }

    /// Invokes `glSecondaryColor3fEXT`.
    /// ```
    /// void glSecondaryColor3fEXT(((float) khronos_float_t) GLfloat red, ((float) khronos_float_t) GLfloat green, ((float) khronos_float_t) GLfloat blue);
    /// ```
    public void SecondaryColor3fEXT(float red, float green, float blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3fEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3fEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3fEXT.get().invokeExact(handles.PFN_glSecondaryColor3fEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3fEXT", e); }
    }

    /// Invokes `glSecondaryColor3fvEXT`.
    /// ```
    /// void glSecondaryColor3fvEXT(const GLfloat* v);
    /// ```
    public void SecondaryColor3fvEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3fvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3fvEXT", v); }
        Handles.MH_glSecondaryColor3fvEXT.get().invokeExact(handles.PFN_glSecondaryColor3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3fvEXT", e); }
    }

    /// Invokes `glSecondaryColor3iEXT`.
    /// ```
    /// void glSecondaryColor3iEXT((int) GLint red, (int) GLint green, (int) GLint blue);
    /// ```
    public void SecondaryColor3iEXT(int red, int green, int blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3iEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3iEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3iEXT.get().invokeExact(handles.PFN_glSecondaryColor3iEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3iEXT", e); }
    }

    /// Invokes `glSecondaryColor3ivEXT`.
    /// ```
    /// void glSecondaryColor3ivEXT(const GLint* v);
    /// ```
    public void SecondaryColor3ivEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3ivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3ivEXT", v); }
        Handles.MH_glSecondaryColor3ivEXT.get().invokeExact(handles.PFN_glSecondaryColor3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3ivEXT", e); }
    }

    /// Invokes `glSecondaryColor3sEXT`.
    /// ```
    /// void glSecondaryColor3sEXT(((signed short) khronos_int16_t) GLshort red, ((signed short) khronos_int16_t) GLshort green, ((signed short) khronos_int16_t) GLshort blue);
    /// ```
    public void SecondaryColor3sEXT(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3sEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3sEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3sEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3sEXT.get().invokeExact(handles.PFN_glSecondaryColor3sEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3sEXT", e); }
    }

    /// Invokes `glSecondaryColor3svEXT`.
    /// ```
    /// void glSecondaryColor3svEXT(const GLshort* v);
    /// ```
    public void SecondaryColor3svEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3svEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3svEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3svEXT", v); }
        Handles.MH_glSecondaryColor3svEXT.get().invokeExact(handles.PFN_glSecondaryColor3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3svEXT", e); }
    }

    /// Invokes `glSecondaryColor3ubEXT`.
    /// ```
    /// void glSecondaryColor3ubEXT(((unsigned char) khronos_uint8_t) GLubyte red, ((unsigned char) khronos_uint8_t) GLubyte green, ((unsigned char) khronos_uint8_t) GLubyte blue);
    /// ```
    public void SecondaryColor3ubEXT(byte red, byte green, byte blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3ubEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3ubEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3ubEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3ubEXT.get().invokeExact(handles.PFN_glSecondaryColor3ubEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3ubEXT", e); }
    }

    /// Invokes `glSecondaryColor3ubvEXT`.
    /// ```
    /// void glSecondaryColor3ubvEXT(const GLubyte* v);
    /// ```
    public void SecondaryColor3ubvEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3ubvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3ubvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3ubvEXT", v); }
        Handles.MH_glSecondaryColor3ubvEXT.get().invokeExact(handles.PFN_glSecondaryColor3ubvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3ubvEXT", e); }
    }

    /// Invokes `glSecondaryColor3uiEXT`.
    /// ```
    /// void glSecondaryColor3uiEXT((unsigned int) GLuint red, (unsigned int) GLuint green, (unsigned int) GLuint blue);
    /// ```
    public void SecondaryColor3uiEXT(int red, int green, int blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3uiEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3uiEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3uiEXT.get().invokeExact(handles.PFN_glSecondaryColor3uiEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3uiEXT", e); }
    }

    /// Invokes `glSecondaryColor3uivEXT`.
    /// ```
    /// void glSecondaryColor3uivEXT(const GLuint* v);
    /// ```
    public void SecondaryColor3uivEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3uivEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3uivEXT", v); }
        Handles.MH_glSecondaryColor3uivEXT.get().invokeExact(handles.PFN_glSecondaryColor3uivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3uivEXT", e); }
    }

    /// Invokes `glSecondaryColor3usEXT`.
    /// ```
    /// void glSecondaryColor3usEXT(((unsigned short) khronos_uint16_t) GLushort red, ((unsigned short) khronos_uint16_t) GLushort green, ((unsigned short) khronos_uint16_t) GLushort blue);
    /// ```
    public void SecondaryColor3usEXT(short red, short green, short blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3usEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3usEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3usEXT", red, green, blue); }
        Handles.MH_glSecondaryColor3usEXT.get().invokeExact(handles.PFN_glSecondaryColor3usEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3usEXT", e); }
    }

    /// Invokes `glSecondaryColor3usvEXT`.
    /// ```
    /// void glSecondaryColor3usvEXT(const GLushort* v);
    /// ```
    public void SecondaryColor3usvEXT(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColor3usvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColor3usvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColor3usvEXT", v); }
        Handles.MH_glSecondaryColor3usvEXT.get().invokeExact(handles.PFN_glSecondaryColor3usvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColor3usvEXT", e); }
    }

    /// Invokes `glSecondaryColorPointerEXT`.
    /// ```
    /// void glSecondaryColorPointerEXT((int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void SecondaryColorPointerEXT(int size, int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColorPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColorPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColorPointerEXT", size, type, stride, pointer); }
        Handles.MH_glSecondaryColorPointerEXT.get().invokeExact(handles.PFN_glSecondaryColorPointerEXT, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColorPointerEXT", e); }
    }

}
