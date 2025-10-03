// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_sprite`
public final class GLSGIXSprite {
    public static final int GL_SPRITE_SGIX = 0x8148;
    public static final int GL_SPRITE_MODE_SGIX = 0x8149;
    public static final int GL_SPRITE_AXIS_SGIX = 0x814A;
    public static final int GL_SPRITE_TRANSLATION_SGIX = 0x814B;
    public static final int GL_SPRITE_AXIAL_SGIX = 0x814C;
    public static final int GL_SPRITE_OBJECT_ALIGNED_SGIX = 0x814D;
    public static final int GL_SPRITE_EYE_ALIGNED_SGIX = 0x814E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSpriteParameterfSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glSpriteParameterfvSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSpriteParameteriSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSpriteParameterivSGIX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glSpriteParameterfSGIX;
        public final MemorySegment PFN_glSpriteParameterfvSGIX;
        public final MemorySegment PFN_glSpriteParameteriSGIX;
        public final MemorySegment PFN_glSpriteParameterivSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glSpriteParameterfSGIX = func.invoke("glSpriteParameterfSGIX");
            PFN_glSpriteParameterfvSGIX = func.invoke("glSpriteParameterfvSGIX");
            PFN_glSpriteParameteriSGIX = func.invoke("glSpriteParameteriSGIX");
            PFN_glSpriteParameterivSGIX = func.invoke("glSpriteParameterivSGIX");
        }
    }

    public GLSGIXSprite(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glSpriteParameterfSGIX`.
    /// ```
    /// void glSpriteParameterfSGIX((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void SpriteParameterfSGIX(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpriteParameterfSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glSpriteParameterfSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSpriteParameterfSGIX", pname, param); }
        Handles.MH_glSpriteParameterfSGIX.invokeExact(handles.PFN_glSpriteParameterfSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SpriteParameterfSGIX", e); }
    }

    /// Invokes `glSpriteParameterfvSGIX`.
    /// ```
    /// void glSpriteParameterfvSGIX((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void SpriteParameterfvSGIX(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpriteParameterfvSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glSpriteParameterfvSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSpriteParameterfvSGIX", pname, params); }
        Handles.MH_glSpriteParameterfvSGIX.invokeExact(handles.PFN_glSpriteParameterfvSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in SpriteParameterfvSGIX", e); }
    }

    /// Invokes `glSpriteParameteriSGIX`.
    /// ```
    /// void glSpriteParameteriSGIX((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void SpriteParameteriSGIX(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpriteParameteriSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glSpriteParameteriSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSpriteParameteriSGIX", pname, param); }
        Handles.MH_glSpriteParameteriSGIX.invokeExact(handles.PFN_glSpriteParameteriSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in SpriteParameteriSGIX", e); }
    }

    /// Invokes `glSpriteParameterivSGIX`.
    /// ```
    /// void glSpriteParameterivSGIX((unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void SpriteParameterivSGIX(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpriteParameterivSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glSpriteParameterivSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSpriteParameterivSGIX", pname, params); }
        Handles.MH_glSpriteParameterivSGIX.invokeExact(handles.PFN_glSpriteParameterivSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in SpriteParameterivSGIX", e); }
    }

}
