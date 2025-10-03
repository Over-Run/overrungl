// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_pixel_data_range`
public final class GLNVPixelDataRange {
    public static final int GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878;
    public static final int GL_READ_PIXEL_DATA_RANGE_NV = 0x8879;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A;
    public static final int GL_READ_PIXEL_DATA_RANGE_LENGTH_NV = 0x887B;
    public static final int GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C;
    public static final int GL_READ_PIXEL_DATA_RANGE_POINTER_NV = 0x887D;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glPixelDataRangeNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glFlushPixelDataRangeNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT)));
        public final MemorySegment PFN_glPixelDataRangeNV;
        public final MemorySegment PFN_glFlushPixelDataRangeNV;
        private Handles(GLLoadFunc func) {
            PFN_glPixelDataRangeNV = func.invoke("glPixelDataRangeNV");
            PFN_glFlushPixelDataRangeNV = func.invoke("glFlushPixelDataRangeNV");
        }
    }

    public GLNVPixelDataRange(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPixelDataRangeNV`.
    /// ```
    /// void glPixelDataRangeNV((unsigned int) GLenum target, (int) GLsizei length, const void* pointer);
    /// ```
    public void PixelDataRangeNV(int target, int length, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelDataRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glPixelDataRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelDataRangeNV", target, length, pointer); }
        Handles.MH_glPixelDataRangeNV.get().invokeExact(handles.PFN_glPixelDataRangeNV, target, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in PixelDataRangeNV", e); }
    }

    /// Invokes `glFlushPixelDataRangeNV`.
    /// ```
    /// void glFlushPixelDataRangeNV((unsigned int) GLenum target);
    /// ```
    public void FlushPixelDataRangeNV(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushPixelDataRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glFlushPixelDataRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushPixelDataRangeNV", target); }
        Handles.MH_glFlushPixelDataRangeNV.get().invokeExact(handles.PFN_glFlushPixelDataRangeNV, target); }
        catch (Throwable e) { throw new RuntimeException("error in FlushPixelDataRangeNV", e); }
    }

}
