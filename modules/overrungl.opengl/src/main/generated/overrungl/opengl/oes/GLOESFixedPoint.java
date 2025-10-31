// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.oes;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_OES_fixed_point`
public final class GLOESFixedPoint {
    public static final int GL_FIXED_OES = 0x140C;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAlphaFuncxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearColorxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearDepthxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClipPlanexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor4xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDepthRangexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFogxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFogxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFrustumxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetClipPlanexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFixedvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexEnvxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLightModelxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLightModelxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLightxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLightxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLineWidthxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLoadMatrixxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMaterialxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMaterialxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultMatrixxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNormal3xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glOrthoxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPointParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPointSizexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPolygonOffsetxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRotatexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glScalexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexEnvxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexEnvxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexParameterxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTranslatexOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glAccumxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBitmapxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBlendColorxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearAccumxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColor3xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColor3xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColor4xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glConvolutionParameterxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glConvolutionParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEvalCoord1xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEvalCoord1xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEvalCoord2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEvalCoord2xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFeedbackBufferxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetConvolutionParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetHistogramParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetLightxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMapxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMaterialxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetPixelMapxv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexGenxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexLevelParameterxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIndexxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIndexxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glLoadTransposeMatrixxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMap1xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMap2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMapGrid1xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMapGrid2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultTransposeMatrixxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord1xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord1xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord2xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoord3xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormal3xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPassThroughxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPixelMapx = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPixelStorex = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPixelTransferxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPixelZoomxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPrioritizeTexturesxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRasterPos2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRasterPos2xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRasterPos3xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRasterPos3xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRasterPos4xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRasterPos4xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRectxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRectxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord1xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoord1xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoord2xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord3xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoord3xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord4xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoord4xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexGenxOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexGenxvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex2xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertex2xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex3xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertex3xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex4xOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertex4xvOES = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glAlphaFuncxOES;
        public final MemorySegment PFN_glClearColorxOES;
        public final MemorySegment PFN_glClearDepthxOES;
        public final MemorySegment PFN_glClipPlanexOES;
        public final MemorySegment PFN_glColor4xOES;
        public final MemorySegment PFN_glDepthRangexOES;
        public final MemorySegment PFN_glFogxOES;
        public final MemorySegment PFN_glFogxvOES;
        public final MemorySegment PFN_glFrustumxOES;
        public final MemorySegment PFN_glGetClipPlanexOES;
        public final MemorySegment PFN_glGetFixedvOES;
        public final MemorySegment PFN_glGetTexEnvxvOES;
        public final MemorySegment PFN_glGetTexParameterxvOES;
        public final MemorySegment PFN_glLightModelxOES;
        public final MemorySegment PFN_glLightModelxvOES;
        public final MemorySegment PFN_glLightxOES;
        public final MemorySegment PFN_glLightxvOES;
        public final MemorySegment PFN_glLineWidthxOES;
        public final MemorySegment PFN_glLoadMatrixxOES;
        public final MemorySegment PFN_glMaterialxOES;
        public final MemorySegment PFN_glMaterialxvOES;
        public final MemorySegment PFN_glMultMatrixxOES;
        public final MemorySegment PFN_glMultiTexCoord4xOES;
        public final MemorySegment PFN_glNormal3xOES;
        public final MemorySegment PFN_glOrthoxOES;
        public final MemorySegment PFN_glPointParameterxvOES;
        public final MemorySegment PFN_glPointSizexOES;
        public final MemorySegment PFN_glPolygonOffsetxOES;
        public final MemorySegment PFN_glRotatexOES;
        public final MemorySegment PFN_glScalexOES;
        public final MemorySegment PFN_glTexEnvxOES;
        public final MemorySegment PFN_glTexEnvxvOES;
        public final MemorySegment PFN_glTexParameterxOES;
        public final MemorySegment PFN_glTexParameterxvOES;
        public final MemorySegment PFN_glTranslatexOES;
        public final MemorySegment PFN_glAccumxOES;
        public final MemorySegment PFN_glBitmapxOES;
        public final MemorySegment PFN_glBlendColorxOES;
        public final MemorySegment PFN_glClearAccumxOES;
        public final MemorySegment PFN_glColor3xOES;
        public final MemorySegment PFN_glColor3xvOES;
        public final MemorySegment PFN_glColor4xvOES;
        public final MemorySegment PFN_glConvolutionParameterxOES;
        public final MemorySegment PFN_glConvolutionParameterxvOES;
        public final MemorySegment PFN_glEvalCoord1xOES;
        public final MemorySegment PFN_glEvalCoord1xvOES;
        public final MemorySegment PFN_glEvalCoord2xOES;
        public final MemorySegment PFN_glEvalCoord2xvOES;
        public final MemorySegment PFN_glFeedbackBufferxOES;
        public final MemorySegment PFN_glGetConvolutionParameterxvOES;
        public final MemorySegment PFN_glGetHistogramParameterxvOES;
        public final MemorySegment PFN_glGetLightxOES;
        public final MemorySegment PFN_glGetMapxvOES;
        public final MemorySegment PFN_glGetMaterialxOES;
        public final MemorySegment PFN_glGetPixelMapxv;
        public final MemorySegment PFN_glGetTexGenxvOES;
        public final MemorySegment PFN_glGetTexLevelParameterxvOES;
        public final MemorySegment PFN_glIndexxOES;
        public final MemorySegment PFN_glIndexxvOES;
        public final MemorySegment PFN_glLoadTransposeMatrixxOES;
        public final MemorySegment PFN_glMap1xOES;
        public final MemorySegment PFN_glMap2xOES;
        public final MemorySegment PFN_glMapGrid1xOES;
        public final MemorySegment PFN_glMapGrid2xOES;
        public final MemorySegment PFN_glMultTransposeMatrixxOES;
        public final MemorySegment PFN_glMultiTexCoord1xOES;
        public final MemorySegment PFN_glMultiTexCoord1xvOES;
        public final MemorySegment PFN_glMultiTexCoord2xOES;
        public final MemorySegment PFN_glMultiTexCoord2xvOES;
        public final MemorySegment PFN_glMultiTexCoord3xOES;
        public final MemorySegment PFN_glMultiTexCoord3xvOES;
        public final MemorySegment PFN_glMultiTexCoord4xvOES;
        public final MemorySegment PFN_glNormal3xvOES;
        public final MemorySegment PFN_glPassThroughxOES;
        public final MemorySegment PFN_glPixelMapx;
        public final MemorySegment PFN_glPixelStorex;
        public final MemorySegment PFN_glPixelTransferxOES;
        public final MemorySegment PFN_glPixelZoomxOES;
        public final MemorySegment PFN_glPrioritizeTexturesxOES;
        public final MemorySegment PFN_glRasterPos2xOES;
        public final MemorySegment PFN_glRasterPos2xvOES;
        public final MemorySegment PFN_glRasterPos3xOES;
        public final MemorySegment PFN_glRasterPos3xvOES;
        public final MemorySegment PFN_glRasterPos4xOES;
        public final MemorySegment PFN_glRasterPos4xvOES;
        public final MemorySegment PFN_glRectxOES;
        public final MemorySegment PFN_glRectxvOES;
        public final MemorySegment PFN_glTexCoord1xOES;
        public final MemorySegment PFN_glTexCoord1xvOES;
        public final MemorySegment PFN_glTexCoord2xOES;
        public final MemorySegment PFN_glTexCoord2xvOES;
        public final MemorySegment PFN_glTexCoord3xOES;
        public final MemorySegment PFN_glTexCoord3xvOES;
        public final MemorySegment PFN_glTexCoord4xOES;
        public final MemorySegment PFN_glTexCoord4xvOES;
        public final MemorySegment PFN_glTexGenxOES;
        public final MemorySegment PFN_glTexGenxvOES;
        public final MemorySegment PFN_glVertex2xOES;
        public final MemorySegment PFN_glVertex2xvOES;
        public final MemorySegment PFN_glVertex3xOES;
        public final MemorySegment PFN_glVertex3xvOES;
        public final MemorySegment PFN_glVertex4xOES;
        public final MemorySegment PFN_glVertex4xvOES;
        private Handles(GLLoadFunc func) {
            PFN_glAlphaFuncxOES = func.invoke("glAlphaFuncxOES");
            PFN_glClearColorxOES = func.invoke("glClearColorxOES");
            PFN_glClearDepthxOES = func.invoke("glClearDepthxOES");
            PFN_glClipPlanexOES = func.invoke("glClipPlanexOES");
            PFN_glColor4xOES = func.invoke("glColor4xOES");
            PFN_glDepthRangexOES = func.invoke("glDepthRangexOES");
            PFN_glFogxOES = func.invoke("glFogxOES");
            PFN_glFogxvOES = func.invoke("glFogxvOES");
            PFN_glFrustumxOES = func.invoke("glFrustumxOES");
            PFN_glGetClipPlanexOES = func.invoke("glGetClipPlanexOES");
            PFN_glGetFixedvOES = func.invoke("glGetFixedvOES");
            PFN_glGetTexEnvxvOES = func.invoke("glGetTexEnvxvOES");
            PFN_glGetTexParameterxvOES = func.invoke("glGetTexParameterxvOES");
            PFN_glLightModelxOES = func.invoke("glLightModelxOES");
            PFN_glLightModelxvOES = func.invoke("glLightModelxvOES");
            PFN_glLightxOES = func.invoke("glLightxOES");
            PFN_glLightxvOES = func.invoke("glLightxvOES");
            PFN_glLineWidthxOES = func.invoke("glLineWidthxOES");
            PFN_glLoadMatrixxOES = func.invoke("glLoadMatrixxOES");
            PFN_glMaterialxOES = func.invoke("glMaterialxOES");
            PFN_glMaterialxvOES = func.invoke("glMaterialxvOES");
            PFN_glMultMatrixxOES = func.invoke("glMultMatrixxOES");
            PFN_glMultiTexCoord4xOES = func.invoke("glMultiTexCoord4xOES");
            PFN_glNormal3xOES = func.invoke("glNormal3xOES");
            PFN_glOrthoxOES = func.invoke("glOrthoxOES");
            PFN_glPointParameterxvOES = func.invoke("glPointParameterxvOES");
            PFN_glPointSizexOES = func.invoke("glPointSizexOES");
            PFN_glPolygonOffsetxOES = func.invoke("glPolygonOffsetxOES");
            PFN_glRotatexOES = func.invoke("glRotatexOES");
            PFN_glScalexOES = func.invoke("glScalexOES");
            PFN_glTexEnvxOES = func.invoke("glTexEnvxOES");
            PFN_glTexEnvxvOES = func.invoke("glTexEnvxvOES");
            PFN_glTexParameterxOES = func.invoke("glTexParameterxOES");
            PFN_glTexParameterxvOES = func.invoke("glTexParameterxvOES");
            PFN_glTranslatexOES = func.invoke("glTranslatexOES");
            PFN_glAccumxOES = func.invoke("glAccumxOES");
            PFN_glBitmapxOES = func.invoke("glBitmapxOES");
            PFN_glBlendColorxOES = func.invoke("glBlendColorxOES");
            PFN_glClearAccumxOES = func.invoke("glClearAccumxOES");
            PFN_glColor3xOES = func.invoke("glColor3xOES");
            PFN_glColor3xvOES = func.invoke("glColor3xvOES");
            PFN_glColor4xvOES = func.invoke("glColor4xvOES");
            PFN_glConvolutionParameterxOES = func.invoke("glConvolutionParameterxOES");
            PFN_glConvolutionParameterxvOES = func.invoke("glConvolutionParameterxvOES");
            PFN_glEvalCoord1xOES = func.invoke("glEvalCoord1xOES");
            PFN_glEvalCoord1xvOES = func.invoke("glEvalCoord1xvOES");
            PFN_glEvalCoord2xOES = func.invoke("glEvalCoord2xOES");
            PFN_glEvalCoord2xvOES = func.invoke("glEvalCoord2xvOES");
            PFN_glFeedbackBufferxOES = func.invoke("glFeedbackBufferxOES");
            PFN_glGetConvolutionParameterxvOES = func.invoke("glGetConvolutionParameterxvOES");
            PFN_glGetHistogramParameterxvOES = func.invoke("glGetHistogramParameterxvOES");
            PFN_glGetLightxOES = func.invoke("glGetLightxOES");
            PFN_glGetMapxvOES = func.invoke("glGetMapxvOES");
            PFN_glGetMaterialxOES = func.invoke("glGetMaterialxOES");
            PFN_glGetPixelMapxv = func.invoke("glGetPixelMapxv");
            PFN_glGetTexGenxvOES = func.invoke("glGetTexGenxvOES");
            PFN_glGetTexLevelParameterxvOES = func.invoke("glGetTexLevelParameterxvOES");
            PFN_glIndexxOES = func.invoke("glIndexxOES");
            PFN_glIndexxvOES = func.invoke("glIndexxvOES");
            PFN_glLoadTransposeMatrixxOES = func.invoke("glLoadTransposeMatrixxOES");
            PFN_glMap1xOES = func.invoke("glMap1xOES");
            PFN_glMap2xOES = func.invoke("glMap2xOES");
            PFN_glMapGrid1xOES = func.invoke("glMapGrid1xOES");
            PFN_glMapGrid2xOES = func.invoke("glMapGrid2xOES");
            PFN_glMultTransposeMatrixxOES = func.invoke("glMultTransposeMatrixxOES");
            PFN_glMultiTexCoord1xOES = func.invoke("glMultiTexCoord1xOES");
            PFN_glMultiTexCoord1xvOES = func.invoke("glMultiTexCoord1xvOES");
            PFN_glMultiTexCoord2xOES = func.invoke("glMultiTexCoord2xOES");
            PFN_glMultiTexCoord2xvOES = func.invoke("glMultiTexCoord2xvOES");
            PFN_glMultiTexCoord3xOES = func.invoke("glMultiTexCoord3xOES");
            PFN_glMultiTexCoord3xvOES = func.invoke("glMultiTexCoord3xvOES");
            PFN_glMultiTexCoord4xvOES = func.invoke("glMultiTexCoord4xvOES");
            PFN_glNormal3xvOES = func.invoke("glNormal3xvOES");
            PFN_glPassThroughxOES = func.invoke("glPassThroughxOES");
            PFN_glPixelMapx = func.invoke("glPixelMapx");
            PFN_glPixelStorex = func.invoke("glPixelStorex");
            PFN_glPixelTransferxOES = func.invoke("glPixelTransferxOES");
            PFN_glPixelZoomxOES = func.invoke("glPixelZoomxOES");
            PFN_glPrioritizeTexturesxOES = func.invoke("glPrioritizeTexturesxOES");
            PFN_glRasterPos2xOES = func.invoke("glRasterPos2xOES");
            PFN_glRasterPos2xvOES = func.invoke("glRasterPos2xvOES");
            PFN_glRasterPos3xOES = func.invoke("glRasterPos3xOES");
            PFN_glRasterPos3xvOES = func.invoke("glRasterPos3xvOES");
            PFN_glRasterPos4xOES = func.invoke("glRasterPos4xOES");
            PFN_glRasterPos4xvOES = func.invoke("glRasterPos4xvOES");
            PFN_glRectxOES = func.invoke("glRectxOES");
            PFN_glRectxvOES = func.invoke("glRectxvOES");
            PFN_glTexCoord1xOES = func.invoke("glTexCoord1xOES");
            PFN_glTexCoord1xvOES = func.invoke("glTexCoord1xvOES");
            PFN_glTexCoord2xOES = func.invoke("glTexCoord2xOES");
            PFN_glTexCoord2xvOES = func.invoke("glTexCoord2xvOES");
            PFN_glTexCoord3xOES = func.invoke("glTexCoord3xOES");
            PFN_glTexCoord3xvOES = func.invoke("glTexCoord3xvOES");
            PFN_glTexCoord4xOES = func.invoke("glTexCoord4xOES");
            PFN_glTexCoord4xvOES = func.invoke("glTexCoord4xvOES");
            PFN_glTexGenxOES = func.invoke("glTexGenxOES");
            PFN_glTexGenxvOES = func.invoke("glTexGenxvOES");
            PFN_glVertex2xOES = func.invoke("glVertex2xOES");
            PFN_glVertex2xvOES = func.invoke("glVertex2xvOES");
            PFN_glVertex3xOES = func.invoke("glVertex3xOES");
            PFN_glVertex3xvOES = func.invoke("glVertex3xvOES");
            PFN_glVertex4xOES = func.invoke("glVertex4xOES");
            PFN_glVertex4xvOES = func.invoke("glVertex4xvOES");
        }
    }

    public GLOESFixedPoint(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glAlphaFuncxOES`.
    /// ```
    /// void glAlphaFuncxOES((unsigned int) GLenum func, ((int32_t) khronos_int32_t) GLfixed ref);
    /// ```
    public void AlphaFuncxOES(int func, int ref) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAlphaFuncxOES)) throw new GLSymbolNotFoundError("Symbol not found: glAlphaFuncxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAlphaFuncxOES", func, ref); }
        Handles.MH_glAlphaFuncxOES.invokeExact(handles.PFN_glAlphaFuncxOES, func, ref); }
        catch (Throwable e) { throw new RuntimeException("error in AlphaFuncxOES", e); }
    }

    /// Invokes `glClearColorxOES`.
    /// ```
    /// void glClearColorxOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void ClearColorxOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearColorxOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearColorxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearColorxOES", red, green, blue, alpha); }
        Handles.MH_glClearColorxOES.invokeExact(handles.PFN_glClearColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in ClearColorxOES", e); }
    }

    /// Invokes `glClearDepthxOES`.
    /// ```
    /// void glClearDepthxOES(((int32_t) khronos_int32_t) GLfixed depth);
    /// ```
    public void ClearDepthxOES(int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthxOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearDepthxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearDepthxOES", depth); }
        Handles.MH_glClearDepthxOES.invokeExact(handles.PFN_glClearDepthxOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthxOES", e); }
    }

    /// Invokes `glClipPlanexOES`.
    /// ```
    /// void glClipPlanexOES((unsigned int) GLenum plane, const GLfixed* equation);
    /// ```
    public void ClipPlanexOES(int plane, @NonNull MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClipPlanexOES)) throw new GLSymbolNotFoundError("Symbol not found: glClipPlanexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClipPlanexOES", plane, equation); }
        Handles.MH_glClipPlanexOES.invokeExact(handles.PFN_glClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in ClipPlanexOES", e); }
    }

    /// Invokes `glColor4xOES`.
    /// ```
    /// void glColor4xOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void Color4xOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor4xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4xOES", red, green, blue, alpha); }
        Handles.MH_glColor4xOES.invokeExact(handles.PFN_glColor4xOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in Color4xOES", e); }
    }

    /// Invokes `glDepthRangexOES`.
    /// ```
    /// void glDepthRangexOES(((int32_t) khronos_int32_t) GLfixed n, ((int32_t) khronos_int32_t) GLfixed f);
    /// ```
    public void DepthRangexOES(int n, int f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangexOES)) throw new GLSymbolNotFoundError("Symbol not found: glDepthRangexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDepthRangexOES", n, f); }
        Handles.MH_glDepthRangexOES.invokeExact(handles.PFN_glDepthRangexOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangexOES", e); }
    }

    /// Invokes `glFogxOES`.
    /// ```
    /// void glFogxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void FogxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogxOES)) throw new GLSymbolNotFoundError("Symbol not found: glFogxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogxOES", pname, param); }
        Handles.MH_glFogxOES.invokeExact(handles.PFN_glFogxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FogxOES", e); }
    }

    /// Invokes `glFogxvOES`.
    /// ```
    /// void glFogxvOES((unsigned int) GLenum pname, const GLfixed* param);
    /// ```
    public void FogxvOES(int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glFogxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogxvOES", pname, param); }
        Handles.MH_glFogxvOES.invokeExact(handles.PFN_glFogxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FogxvOES", e); }
    }

    /// Invokes `glFrustumxOES`.
    /// ```
    /// void glFrustumxOES(((int32_t) khronos_int32_t) GLfixed l, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed b, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed n, ((int32_t) khronos_int32_t) GLfixed f);
    /// ```
    public void FrustumxOES(int l, int r, int b, int t, int n, int f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFrustumxOES)) throw new GLSymbolNotFoundError("Symbol not found: glFrustumxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFrustumxOES", l, r, b, t, n, f); }
        Handles.MH_glFrustumxOES.invokeExact(handles.PFN_glFrustumxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in FrustumxOES", e); }
    }

    /// Invokes `glGetClipPlanexOES`.
    /// ```
    /// void glGetClipPlanexOES((unsigned int) GLenum plane, GLfixed* equation);
    /// ```
    public void GetClipPlanexOES(int plane, @NonNull MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetClipPlanexOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetClipPlanexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetClipPlanexOES", plane, equation); }
        Handles.MH_glGetClipPlanexOES.invokeExact(handles.PFN_glGetClipPlanexOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in GetClipPlanexOES", e); }
    }

    /// Invokes `glGetFixedvOES`.
    /// ```
    /// void glGetFixedvOES((unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetFixedvOES(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFixedvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetFixedvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFixedvOES", pname, params); }
        Handles.MH_glGetFixedvOES.invokeExact(handles.PFN_glGetFixedvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFixedvOES", e); }
    }

    /// Invokes `glGetTexEnvxvOES`.
    /// ```
    /// void glGetTexEnvxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexEnvxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexEnvxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexEnvxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexEnvxvOES", target, pname, params); }
        Handles.MH_glGetTexEnvxvOES.invokeExact(handles.PFN_glGetTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexEnvxvOES", e); }
    }

    /// Invokes `glGetTexParameterxvOES`.
    /// ```
    /// void glGetTexParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexParameterxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexParameterxvOES", target, pname, params); }
        Handles.MH_glGetTexParameterxvOES.invokeExact(handles.PFN_glGetTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterxvOES", e); }
    }

    /// Invokes `glLightModelxOES`.
    /// ```
    /// void glLightModelxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void LightModelxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightModelxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightModelxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLightModelxOES", pname, param); }
        Handles.MH_glLightModelxOES.invokeExact(handles.PFN_glLightModelxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightModelxOES", e); }
    }

    /// Invokes `glLightModelxvOES`.
    /// ```
    /// void glLightModelxvOES((unsigned int) GLenum pname, const GLfixed* param);
    /// ```
    public void LightModelxvOES(int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightModelxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightModelxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLightModelxvOES", pname, param); }
        Handles.MH_glLightModelxvOES.invokeExact(handles.PFN_glLightModelxvOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightModelxvOES", e); }
    }

    /// Invokes `glLightxOES`.
    /// ```
    /// void glLightxOES((unsigned int) GLenum light, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void LightxOES(int light, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLightxOES", light, pname, param); }
        Handles.MH_glLightxOES.invokeExact(handles.PFN_glLightxOES, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightxOES", e); }
    }

    /// Invokes `glLightxvOES`.
    /// ```
    /// void glLightxvOES((unsigned int) GLenum light, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void LightxvOES(int light, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glLightxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLightxvOES", light, pname, params); }
        Handles.MH_glLightxvOES.invokeExact(handles.PFN_glLightxvOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in LightxvOES", e); }
    }

    /// Invokes `glLineWidthxOES`.
    /// ```
    /// void glLineWidthxOES(((int32_t) khronos_int32_t) GLfixed width);
    /// ```
    public void LineWidthxOES(int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLineWidthxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLineWidthxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLineWidthxOES", width); }
        Handles.MH_glLineWidthxOES.invokeExact(handles.PFN_glLineWidthxOES, width); }
        catch (Throwable e) { throw new RuntimeException("error in LineWidthxOES", e); }
    }

    /// Invokes `glLoadMatrixxOES`.
    /// ```
    /// void glLoadMatrixxOES(const GLfixed* m);
    /// ```
    public void LoadMatrixxOES(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLoadMatrixxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadMatrixxOES", m); }
        Handles.MH_glLoadMatrixxOES.invokeExact(handles.PFN_glLoadMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadMatrixxOES", e); }
    }

    /// Invokes `glMaterialxOES`.
    /// ```
    /// void glMaterialxOES((unsigned int) GLenum face, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void MaterialxOES(int face, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMaterialxOES)) throw new GLSymbolNotFoundError("Symbol not found: glMaterialxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMaterialxOES", face, pname, param); }
        Handles.MH_glMaterialxOES.invokeExact(handles.PFN_glMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MaterialxOES", e); }
    }

    /// Invokes `glMaterialxvOES`.
    /// ```
    /// void glMaterialxvOES((unsigned int) GLenum face, (unsigned int) GLenum pname, const GLfixed* param);
    /// ```
    public void MaterialxvOES(int face, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMaterialxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMaterialxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMaterialxvOES", face, pname, param); }
        Handles.MH_glMaterialxvOES.invokeExact(handles.PFN_glMaterialxvOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MaterialxvOES", e); }
    }

    /// Invokes `glMultMatrixxOES`.
    /// ```
    /// void glMultMatrixxOES(const GLfixed* m);
    /// ```
    public void MultMatrixxOES(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultMatrixxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultMatrixxOES", m); }
        Handles.MH_glMultMatrixxOES.invokeExact(handles.PFN_glMultMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultMatrixxOES", e); }
    }

    /// Invokes `glMultiTexCoord4xOES`.
    /// ```
    /// void glMultiTexCoord4xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed q);
    /// ```
    public void MultiTexCoord4xOES(int texture, int s, int t, int r, int q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4xOES", texture, s, t, r, q); }
        Handles.MH_glMultiTexCoord4xOES.invokeExact(handles.PFN_glMultiTexCoord4xOES, texture, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4xOES", e); }
    }

    /// Invokes `glNormal3xOES`.
    /// ```
    /// void glNormal3xOES(((int32_t) khronos_int32_t) GLfixed nx, ((int32_t) khronos_int32_t) GLfixed ny, ((int32_t) khronos_int32_t) GLfixed nz);
    /// ```
    public void Normal3xOES(int nx, int ny, int nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormal3xOES", nx, ny, nz); }
        Handles.MH_glNormal3xOES.invokeExact(handles.PFN_glNormal3xOES, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3xOES", e); }
    }

    /// Invokes `glOrthoxOES`.
    /// ```
    /// void glOrthoxOES(((int32_t) khronos_int32_t) GLfixed l, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed b, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed n, ((int32_t) khronos_int32_t) GLfixed f);
    /// ```
    public void OrthoxOES(int l, int r, int b, int t, int n, int f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glOrthoxOES)) throw new GLSymbolNotFoundError("Symbol not found: glOrthoxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glOrthoxOES", l, r, b, t, n, f); }
        Handles.MH_glOrthoxOES.invokeExact(handles.PFN_glOrthoxOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in OrthoxOES", e); }
    }

    /// Invokes `glPointParameterxvOES`.
    /// ```
    /// void glPointParameterxvOES((unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void PointParameterxvOES(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterxvOES", pname, params); }
        Handles.MH_glPointParameterxvOES.invokeExact(handles.PFN_glPointParameterxvOES, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterxvOES", e); }
    }

    /// Invokes `glPointSizexOES`.
    /// ```
    /// void glPointSizexOES(((int32_t) khronos_int32_t) GLfixed size);
    /// ```
    public void PointSizexOES(int size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointSizexOES)) throw new GLSymbolNotFoundError("Symbol not found: glPointSizexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointSizexOES", size); }
        Handles.MH_glPointSizexOES.invokeExact(handles.PFN_glPointSizexOES, size); }
        catch (Throwable e) { throw new RuntimeException("error in PointSizexOES", e); }
    }

    /// Invokes `glPolygonOffsetxOES`.
    /// ```
    /// void glPolygonOffsetxOES(((int32_t) khronos_int32_t) GLfixed factor, ((int32_t) khronos_int32_t) GLfixed units);
    /// ```
    public void PolygonOffsetxOES(int factor, int units) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPolygonOffsetxOES", factor, units); }
        Handles.MH_glPolygonOffsetxOES.invokeExact(handles.PFN_glPolygonOffsetxOES, factor, units); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetxOES", e); }
    }

    /// Invokes `glRotatexOES`.
    /// ```
    /// void glRotatexOES(((int32_t) khronos_int32_t) GLfixed angle, ((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void RotatexOES(int angle, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRotatexOES)) throw new GLSymbolNotFoundError("Symbol not found: glRotatexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRotatexOES", angle, x, y, z); }
        Handles.MH_glRotatexOES.invokeExact(handles.PFN_glRotatexOES, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in RotatexOES", e); }
    }

    /// Invokes `glScalexOES`.
    /// ```
    /// void glScalexOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void ScalexOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScalexOES)) throw new GLSymbolNotFoundError("Symbol not found: glScalexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glScalexOES", x, y, z); }
        Handles.MH_glScalexOES.invokeExact(handles.PFN_glScalexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ScalexOES", e); }
    }

    /// Invokes `glTexEnvxOES`.
    /// ```
    /// void glTexEnvxOES((unsigned int) GLenum target, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void TexEnvxOES(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexEnvxOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexEnvxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexEnvxOES", target, pname, param); }
        Handles.MH_glTexEnvxOES.invokeExact(handles.PFN_glTexEnvxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexEnvxOES", e); }
    }

    /// Invokes `glTexEnvxvOES`.
    /// ```
    /// void glTexEnvxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void TexEnvxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexEnvxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexEnvxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexEnvxvOES", target, pname, params); }
        Handles.MH_glTexEnvxvOES.invokeExact(handles.PFN_glTexEnvxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexEnvxvOES", e); }
    }

    /// Invokes `glTexParameterxOES`.
    /// ```
    /// void glTexParameterxOES((unsigned int) GLenum target, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void TexParameterxOES(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterxOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexParameterxOES", target, pname, param); }
        Handles.MH_glTexParameterxOES.invokeExact(handles.PFN_glTexParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterxOES", e); }
    }

    /// Invokes `glTexParameterxvOES`.
    /// ```
    /// void glTexParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void TexParameterxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexParameterxvOES", target, pname, params); }
        Handles.MH_glTexParameterxvOES.invokeExact(handles.PFN_glTexParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterxvOES", e); }
    }

    /// Invokes `glTranslatexOES`.
    /// ```
    /// void glTranslatexOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void TranslatexOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTranslatexOES)) throw new GLSymbolNotFoundError("Symbol not found: glTranslatexOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTranslatexOES", x, y, z); }
        Handles.MH_glTranslatexOES.invokeExact(handles.PFN_glTranslatexOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in TranslatexOES", e); }
    }

    /// Invokes `glAccumxOES`.
    /// ```
    /// void glAccumxOES((unsigned int) GLenum op, ((int32_t) khronos_int32_t) GLfixed value);
    /// ```
    public void AccumxOES(int op, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAccumxOES)) throw new GLSymbolNotFoundError("Symbol not found: glAccumxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAccumxOES", op, value); }
        Handles.MH_glAccumxOES.invokeExact(handles.PFN_glAccumxOES, op, value); }
        catch (Throwable e) { throw new RuntimeException("error in AccumxOES", e); }
    }

    /// Invokes `glBitmapxOES`.
    /// ```
    /// void glBitmapxOES((int) GLsizei width, (int) GLsizei height, ((int32_t) khronos_int32_t) GLfixed xorig, ((int32_t) khronos_int32_t) GLfixed yorig, ((int32_t) khronos_int32_t) GLfixed xmove, ((int32_t) khronos_int32_t) GLfixed ymove, const GLubyte* bitmap);
    /// ```
    public void BitmapxOES(int width, int height, int xorig, int yorig, int xmove, int ymove, @NonNull MemorySegment bitmap) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBitmapxOES)) throw new GLSymbolNotFoundError("Symbol not found: glBitmapxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBitmapxOES", width, height, xorig, yorig, xmove, ymove, bitmap); }
        Handles.MH_glBitmapxOES.invokeExact(handles.PFN_glBitmapxOES, width, height, xorig, yorig, xmove, ymove, bitmap); }
        catch (Throwable e) { throw new RuntimeException("error in BitmapxOES", e); }
    }

    /// Invokes `glBlendColorxOES`.
    /// ```
    /// void glBlendColorxOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void BlendColorxOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendColorxOES)) throw new GLSymbolNotFoundError("Symbol not found: glBlendColorxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendColorxOES", red, green, blue, alpha); }
        Handles.MH_glBlendColorxOES.invokeExact(handles.PFN_glBlendColorxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendColorxOES", e); }
    }

    /// Invokes `glClearAccumxOES`.
    /// ```
    /// void glClearAccumxOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue, ((int32_t) khronos_int32_t) GLfixed alpha);
    /// ```
    public void ClearAccumxOES(int red, int green, int blue, int alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearAccumxOES)) throw new GLSymbolNotFoundError("Symbol not found: glClearAccumxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearAccumxOES", red, green, blue, alpha); }
        Handles.MH_glClearAccumxOES.invokeExact(handles.PFN_glClearAccumxOES, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in ClearAccumxOES", e); }
    }

    /// Invokes `glColor3xOES`.
    /// ```
    /// void glColor3xOES(((int32_t) khronos_int32_t) GLfixed red, ((int32_t) khronos_int32_t) GLfixed green, ((int32_t) khronos_int32_t) GLfixed blue);
    /// ```
    public void Color3xOES(int red, int green, int blue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor3xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor3xOES", red, green, blue); }
        Handles.MH_glColor3xOES.invokeExact(handles.PFN_glColor3xOES, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in Color3xOES", e); }
    }

    /// Invokes `glColor3xvOES`.
    /// ```
    /// void glColor3xvOES(const GLfixed* components);
    /// ```
    public void Color3xvOES(@NonNull MemorySegment components) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor3xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor3xvOES", components); }
        Handles.MH_glColor3xvOES.invokeExact(handles.PFN_glColor3xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in Color3xvOES", e); }
    }

    /// Invokes `glColor4xvOES`.
    /// ```
    /// void glColor4xvOES(const GLfixed* components);
    /// ```
    public void Color4xvOES(@NonNull MemorySegment components) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColor4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glColor4xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColor4xvOES", components); }
        Handles.MH_glColor4xvOES.invokeExact(handles.PFN_glColor4xvOES, components); }
        catch (Throwable e) { throw new RuntimeException("error in Color4xvOES", e); }
    }

    /// Invokes `glConvolutionParameterxOES`.
    /// ```
    /// void glConvolutionParameterxOES((unsigned int) GLenum target, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void ConvolutionParameterxOES(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameterxOES)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameterxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionParameterxOES", target, pname, param); }
        Handles.MH_glConvolutionParameterxOES.invokeExact(handles.PFN_glConvolutionParameterxOES, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameterxOES", e); }
    }

    /// Invokes `glConvolutionParameterxvOES`.
    /// ```
    /// void glConvolutionParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void ConvolutionParameterxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glConvolutionParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glConvolutionParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glConvolutionParameterxvOES", target, pname, params); }
        Handles.MH_glConvolutionParameterxvOES.invokeExact(handles.PFN_glConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ConvolutionParameterxvOES", e); }
    }

    /// Invokes `glEvalCoord1xOES`.
    /// ```
    /// void glEvalCoord1xOES(((int32_t) khronos_int32_t) GLfixed u);
    /// ```
    public void EvalCoord1xOES(int u) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord1xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEvalCoord1xOES", u); }
        Handles.MH_glEvalCoord1xOES.invokeExact(handles.PFN_glEvalCoord1xOES, u); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord1xOES", e); }
    }

    /// Invokes `glEvalCoord1xvOES`.
    /// ```
    /// void glEvalCoord1xvOES(const GLfixed* coords);
    /// ```
    public void EvalCoord1xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord1xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord1xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEvalCoord1xvOES", coords); }
        Handles.MH_glEvalCoord1xvOES.invokeExact(handles.PFN_glEvalCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord1xvOES", e); }
    }

    /// Invokes `glEvalCoord2xOES`.
    /// ```
    /// void glEvalCoord2xOES(((int32_t) khronos_int32_t) GLfixed u, ((int32_t) khronos_int32_t) GLfixed v);
    /// ```
    public void EvalCoord2xOES(int u, int v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEvalCoord2xOES", u, v); }
        Handles.MH_glEvalCoord2xOES.invokeExact(handles.PFN_glEvalCoord2xOES, u, v); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord2xOES", e); }
    }

    /// Invokes `glEvalCoord2xvOES`.
    /// ```
    /// void glEvalCoord2xvOES(const GLfixed* coords);
    /// ```
    public void EvalCoord2xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalCoord2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glEvalCoord2xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEvalCoord2xvOES", coords); }
        Handles.MH_glEvalCoord2xvOES.invokeExact(handles.PFN_glEvalCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in EvalCoord2xvOES", e); }
    }

    /// Invokes `glFeedbackBufferxOES`.
    /// ```
    /// void glFeedbackBufferxOES((int) GLsizei n, (unsigned int) GLenum type, const GLfixed* buffer);
    /// ```
    public void FeedbackBufferxOES(int n, int type, @NonNull MemorySegment buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFeedbackBufferxOES)) throw new GLSymbolNotFoundError("Symbol not found: glFeedbackBufferxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFeedbackBufferxOES", n, type, buffer); }
        Handles.MH_glFeedbackBufferxOES.invokeExact(handles.PFN_glFeedbackBufferxOES, n, type, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in FeedbackBufferxOES", e); }
    }

    /// Invokes `glGetConvolutionParameterxvOES`.
    /// ```
    /// void glGetConvolutionParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetConvolutionParameterxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetConvolutionParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetConvolutionParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetConvolutionParameterxvOES", target, pname, params); }
        Handles.MH_glGetConvolutionParameterxvOES.invokeExact(handles.PFN_glGetConvolutionParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetConvolutionParameterxvOES", e); }
    }

    /// Invokes `glGetHistogramParameterxvOES`.
    /// ```
    /// void glGetHistogramParameterxvOES((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetHistogramParameterxvOES(int target, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetHistogramParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHistogramParameterxvOES", target, pname, params); }
        Handles.MH_glGetHistogramParameterxvOES.invokeExact(handles.PFN_glGetHistogramParameterxvOES, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterxvOES", e); }
    }

    /// Invokes `glGetLightxOES`.
    /// ```
    /// void glGetLightxOES((unsigned int) GLenum light, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetLightxOES(int light, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetLightxOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetLightxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetLightxOES", light, pname, params); }
        Handles.MH_glGetLightxOES.invokeExact(handles.PFN_glGetLightxOES, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetLightxOES", e); }
    }

    /// Invokes `glGetMapxvOES`.
    /// ```
    /// void glGetMapxvOES((unsigned int) GLenum target, (unsigned int) GLenum query, GLfixed* v);
    /// ```
    public void GetMapxvOES(int target, int query, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMapxvOES", target, query, v); }
        Handles.MH_glGetMapxvOES.invokeExact(handles.PFN_glGetMapxvOES, target, query, v); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapxvOES", e); }
    }

    /// Invokes `glGetMaterialxOES`.
    /// ```
    /// void glGetMaterialxOES((unsigned int) GLenum face, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void GetMaterialxOES(int face, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMaterialxOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetMaterialxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMaterialxOES", face, pname, param); }
        Handles.MH_glGetMaterialxOES.invokeExact(handles.PFN_glGetMaterialxOES, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetMaterialxOES", e); }
    }

    /// Invokes `glGetPixelMapxv`.
    /// ```
    /// void glGetPixelMapxv((unsigned int) GLenum map, (int) GLint size, GLfixed* values);
    /// ```
    public void GetPixelMapxv(int map, int size, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelMapxv)) throw new GLSymbolNotFoundError("Symbol not found: glGetPixelMapxv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPixelMapxv", map, size, values); }
        Handles.MH_glGetPixelMapxv.invokeExact(handles.PFN_glGetPixelMapxv, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelMapxv", e); }
    }

    /// Invokes `glGetTexGenxvOES`.
    /// ```
    /// void glGetTexGenxvOES((unsigned int) GLenum coord, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexGenxvOES(int coord, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexGenxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexGenxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexGenxvOES", coord, pname, params); }
        Handles.MH_glGetTexGenxvOES.invokeExact(handles.PFN_glGetTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexGenxvOES", e); }
    }

    /// Invokes `glGetTexLevelParameterxvOES`.
    /// ```
    /// void glGetTexLevelParameterxvOES((unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum pname, GLfixed* params);
    /// ```
    public void GetTexLevelParameterxvOES(int target, int level, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexLevelParameterxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexLevelParameterxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexLevelParameterxvOES", target, level, pname, params); }
        Handles.MH_glGetTexLevelParameterxvOES.invokeExact(handles.PFN_glGetTexLevelParameterxvOES, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexLevelParameterxvOES", e); }
    }

    /// Invokes `glIndexxOES`.
    /// ```
    /// void glIndexxOES(((int32_t) khronos_int32_t) GLfixed component);
    /// ```
    public void IndexxOES(int component) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexxOES)) throw new GLSymbolNotFoundError("Symbol not found: glIndexxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexxOES", component); }
        Handles.MH_glIndexxOES.invokeExact(handles.PFN_glIndexxOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in IndexxOES", e); }
    }

    /// Invokes `glIndexxvOES`.
    /// ```
    /// void glIndexxvOES(const GLfixed* component);
    /// ```
    public void IndexxvOES(@NonNull MemorySegment component) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glIndexxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexxvOES", component); }
        Handles.MH_glIndexxvOES.invokeExact(handles.PFN_glIndexxvOES, component); }
        catch (Throwable e) { throw new RuntimeException("error in IndexxvOES", e); }
    }

    /// Invokes `glLoadTransposeMatrixxOES`.
    /// ```
    /// void glLoadTransposeMatrixxOES(const GLfixed* m);
    /// ```
    public void LoadTransposeMatrixxOES(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLoadTransposeMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glLoadTransposeMatrixxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLoadTransposeMatrixxOES", m); }
        Handles.MH_glLoadTransposeMatrixxOES.invokeExact(handles.PFN_glLoadTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in LoadTransposeMatrixxOES", e); }
    }

    /// Invokes `glMap1xOES`.
    /// ```
    /// void glMap1xOES((unsigned int) GLenum target, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2, (int) GLint stride, (int) GLint order, ((int32_t) khronos_int32_t) GLfixed points);
    /// ```
    public void Map1xOES(int target, int u1, int u2, int stride, int order, int points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMap1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMap1xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMap1xOES", target, u1, u2, stride, order, points); }
        Handles.MH_glMap1xOES.invokeExact(handles.PFN_glMap1xOES, target, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in Map1xOES", e); }
    }

    /// Invokes `glMap2xOES`.
    /// ```
    /// void glMap2xOES((unsigned int) GLenum target, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2, (int) GLint ustride, (int) GLint uorder, ((int32_t) khronos_int32_t) GLfixed v1, ((int32_t) khronos_int32_t) GLfixed v2, (int) GLint vstride, (int) GLint vorder, ((int32_t) khronos_int32_t) GLfixed points);
    /// ```
    public void Map2xOES(int target, int u1, int u2, int ustride, int uorder, int v1, int v2, int vstride, int vorder, int points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMap2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMap2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMap2xOES", target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        Handles.MH_glMap2xOES.invokeExact(handles.PFN_glMap2xOES, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in Map2xOES", e); }
    }

    /// Invokes `glMapGrid1xOES`.
    /// ```
    /// void glMapGrid1xOES((int) GLint n, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2);
    /// ```
    public void MapGrid1xOES(int n, int u1, int u2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapGrid1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMapGrid1xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapGrid1xOES", n, u1, u2); }
        Handles.MH_glMapGrid1xOES.invokeExact(handles.PFN_glMapGrid1xOES, n, u1, u2); }
        catch (Throwable e) { throw new RuntimeException("error in MapGrid1xOES", e); }
    }

    /// Invokes `glMapGrid2xOES`.
    /// ```
    /// void glMapGrid2xOES((int) GLint n, ((int32_t) khronos_int32_t) GLfixed u1, ((int32_t) khronos_int32_t) GLfixed u2, ((int32_t) khronos_int32_t) GLfixed v1, ((int32_t) khronos_int32_t) GLfixed v2);
    /// ```
    public void MapGrid2xOES(int n, int u1, int u2, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapGrid2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMapGrid2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapGrid2xOES", n, u1, u2, v1, v2); }
        Handles.MH_glMapGrid2xOES.invokeExact(handles.PFN_glMapGrid2xOES, n, u1, u2, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in MapGrid2xOES", e); }
    }

    /// Invokes `glMultTransposeMatrixxOES`.
    /// ```
    /// void glMultTransposeMatrixxOES(const GLfixed* m);
    /// ```
    public void MultTransposeMatrixxOES(@NonNull MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultTransposeMatrixxOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultTransposeMatrixxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultTransposeMatrixxOES", m); }
        Handles.MH_glMultTransposeMatrixxOES.invokeExact(handles.PFN_glMultTransposeMatrixxOES, m); }
        catch (Throwable e) { throw new RuntimeException("error in MultTransposeMatrixxOES", e); }
    }

    /// Invokes `glMultiTexCoord1xOES`.
    /// ```
    /// void glMultiTexCoord1xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s);
    /// ```
    public void MultiTexCoord1xOES(int texture, int s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1xOES", texture, s); }
        Handles.MH_glMultiTexCoord1xOES.invokeExact(handles.PFN_glMultiTexCoord1xOES, texture, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1xOES", e); }
    }

    /// Invokes `glMultiTexCoord1xvOES`.
    /// ```
    /// void glMultiTexCoord1xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord1xvOES(int texture, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord1xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord1xvOES", texture, coords); }
        Handles.MH_glMultiTexCoord1xvOES.invokeExact(handles.PFN_glMultiTexCoord1xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1xvOES", e); }
    }

    /// Invokes `glMultiTexCoord2xOES`.
    /// ```
    /// void glMultiTexCoord2xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t);
    /// ```
    public void MultiTexCoord2xOES(int texture, int s, int t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2xOES", texture, s, t); }
        Handles.MH_glMultiTexCoord2xOES.invokeExact(handles.PFN_glMultiTexCoord2xOES, texture, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2xOES", e); }
    }

    /// Invokes `glMultiTexCoord2xvOES`.
    /// ```
    /// void glMultiTexCoord2xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord2xvOES(int texture, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord2xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord2xvOES", texture, coords); }
        Handles.MH_glMultiTexCoord2xvOES.invokeExact(handles.PFN_glMultiTexCoord2xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2xvOES", e); }
    }

    /// Invokes `glMultiTexCoord3xOES`.
    /// ```
    /// void glMultiTexCoord3xOES((unsigned int) GLenum texture, ((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r);
    /// ```
    public void MultiTexCoord3xOES(int texture, int s, int t, int r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3xOES", texture, s, t, r); }
        Handles.MH_glMultiTexCoord3xOES.invokeExact(handles.PFN_glMultiTexCoord3xOES, texture, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3xOES", e); }
    }

    /// Invokes `glMultiTexCoord3xvOES`.
    /// ```
    /// void glMultiTexCoord3xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord3xvOES(int texture, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord3xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord3xvOES", texture, coords); }
        Handles.MH_glMultiTexCoord3xvOES.invokeExact(handles.PFN_glMultiTexCoord3xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3xvOES", e); }
    }

    /// Invokes `glMultiTexCoord4xvOES`.
    /// ```
    /// void glMultiTexCoord4xvOES((unsigned int) GLenum texture, const GLfixed* coords);
    /// ```
    public void MultiTexCoord4xvOES(int texture, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoord4xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoord4xvOES", texture, coords); }
        Handles.MH_glMultiTexCoord4xvOES.invokeExact(handles.PFN_glMultiTexCoord4xvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4xvOES", e); }
    }

    /// Invokes `glNormal3xvOES`.
    /// ```
    /// void glNormal3xvOES(const GLfixed* coords);
    /// ```
    public void Normal3xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormal3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glNormal3xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormal3xvOES", coords); }
        Handles.MH_glNormal3xvOES.invokeExact(handles.PFN_glNormal3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Normal3xvOES", e); }
    }

    /// Invokes `glPassThroughxOES`.
    /// ```
    /// void glPassThroughxOES(((int32_t) khronos_int32_t) GLfixed token);
    /// ```
    public void PassThroughxOES(int token) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPassThroughxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPassThroughxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPassThroughxOES", token); }
        Handles.MH_glPassThroughxOES.invokeExact(handles.PFN_glPassThroughxOES, token); }
        catch (Throwable e) { throw new RuntimeException("error in PassThroughxOES", e); }
    }

    /// Invokes `glPixelMapx`.
    /// ```
    /// void glPixelMapx((unsigned int) GLenum map, (int) GLint size, const GLfixed* values);
    /// ```
    public void PixelMapx(int map, int size, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelMapx)) throw new GLSymbolNotFoundError("Symbol not found: glPixelMapx");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelMapx", map, size, values); }
        Handles.MH_glPixelMapx.invokeExact(handles.PFN_glPixelMapx, map, size, values); }
        catch (Throwable e) { throw new RuntimeException("error in PixelMapx", e); }
    }

    /// Invokes `glPixelStorex`.
    /// ```
    /// void glPixelStorex((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void PixelStorex(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelStorex)) throw new GLSymbolNotFoundError("Symbol not found: glPixelStorex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelStorex", pname, param); }
        Handles.MH_glPixelStorex.invokeExact(handles.PFN_glPixelStorex, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelStorex", e); }
    }

    /// Invokes `glPixelTransferxOES`.
    /// ```
    /// void glPixelTransferxOES((unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void PixelTransferxOES(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTransferxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPixelTransferxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelTransferxOES", pname, param); }
        Handles.MH_glPixelTransferxOES.invokeExact(handles.PFN_glPixelTransferxOES, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTransferxOES", e); }
    }

    /// Invokes `glPixelZoomxOES`.
    /// ```
    /// void glPixelZoomxOES(((int32_t) khronos_int32_t) GLfixed xfactor, ((int32_t) khronos_int32_t) GLfixed yfactor);
    /// ```
    public void PixelZoomxOES(int xfactor, int yfactor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelZoomxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPixelZoomxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPixelZoomxOES", xfactor, yfactor); }
        Handles.MH_glPixelZoomxOES.invokeExact(handles.PFN_glPixelZoomxOES, xfactor, yfactor); }
        catch (Throwable e) { throw new RuntimeException("error in PixelZoomxOES", e); }
    }

    /// Invokes `glPrioritizeTexturesxOES`.
    /// ```
    /// void glPrioritizeTexturesxOES((int) GLsizei n, const GLuint* textures, const GLfixed* priorities);
    /// ```
    public void PrioritizeTexturesxOES(int n, @NonNull MemorySegment textures, @NonNull MemorySegment priorities) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPrioritizeTexturesxOES)) throw new GLSymbolNotFoundError("Symbol not found: glPrioritizeTexturesxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPrioritizeTexturesxOES", n, textures, priorities); }
        Handles.MH_glPrioritizeTexturesxOES.invokeExact(handles.PFN_glPrioritizeTexturesxOES, n, textures, priorities); }
        catch (Throwable e) { throw new RuntimeException("error in PrioritizeTexturesxOES", e); }
    }

    /// Invokes `glRasterPos2xOES`.
    /// ```
    /// void glRasterPos2xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y);
    /// ```
    public void RasterPos2xOES(int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterPos2xOES", x, y); }
        Handles.MH_glRasterPos2xOES.invokeExact(handles.PFN_glRasterPos2xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos2xOES", e); }
    }

    /// Invokes `glRasterPos2xvOES`.
    /// ```
    /// void glRasterPos2xvOES(const GLfixed* coords);
    /// ```
    public void RasterPos2xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos2xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterPos2xvOES", coords); }
        Handles.MH_glRasterPos2xvOES.invokeExact(handles.PFN_glRasterPos2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos2xvOES", e); }
    }

    /// Invokes `glRasterPos3xOES`.
    /// ```
    /// void glRasterPos3xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void RasterPos3xOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos3xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterPos3xOES", x, y, z); }
        Handles.MH_glRasterPos3xOES.invokeExact(handles.PFN_glRasterPos3xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos3xOES", e); }
    }

    /// Invokes `glRasterPos3xvOES`.
    /// ```
    /// void glRasterPos3xvOES(const GLfixed* coords);
    /// ```
    public void RasterPos3xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos3xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterPos3xvOES", coords); }
        Handles.MH_glRasterPos3xvOES.invokeExact(handles.PFN_glRasterPos3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos3xvOES", e); }
    }

    /// Invokes `glRasterPos4xOES`.
    /// ```
    /// void glRasterPos4xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z, ((int32_t) khronos_int32_t) GLfixed w);
    /// ```
    public void RasterPos4xOES(int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos4xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterPos4xOES", x, y, z, w); }
        Handles.MH_glRasterPos4xOES.invokeExact(handles.PFN_glRasterPos4xOES, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos4xOES", e); }
    }

    /// Invokes `glRasterPos4xvOES`.
    /// ```
    /// void glRasterPos4xvOES(const GLfixed* coords);
    /// ```
    public void RasterPos4xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRasterPos4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRasterPos4xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRasterPos4xvOES", coords); }
        Handles.MH_glRasterPos4xvOES.invokeExact(handles.PFN_glRasterPos4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in RasterPos4xvOES", e); }
    }

    /// Invokes `glRectxOES`.
    /// ```
    /// void glRectxOES(((int32_t) khronos_int32_t) GLfixed x1, ((int32_t) khronos_int32_t) GLfixed y1, ((int32_t) khronos_int32_t) GLfixed x2, ((int32_t) khronos_int32_t) GLfixed y2);
    /// ```
    public void RectxOES(int x1, int y1, int x2, int y2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRectxOES)) throw new GLSymbolNotFoundError("Symbol not found: glRectxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRectxOES", x1, y1, x2, y2); }
        Handles.MH_glRectxOES.invokeExact(handles.PFN_glRectxOES, x1, y1, x2, y2); }
        catch (Throwable e) { throw new RuntimeException("error in RectxOES", e); }
    }

    /// Invokes `glRectxvOES`.
    /// ```
    /// void glRectxvOES(const GLfixed* v1, const GLfixed* v2);
    /// ```
    public void RectxvOES(@NonNull MemorySegment v1, @NonNull MemorySegment v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRectxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glRectxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRectxvOES", v1, v2); }
        Handles.MH_glRectxvOES.invokeExact(handles.PFN_glRectxvOES, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in RectxvOES", e); }
    }

    /// Invokes `glTexCoord1xOES`.
    /// ```
    /// void glTexCoord1xOES(((int32_t) khronos_int32_t) GLfixed s);
    /// ```
    public void TexCoord1xOES(int s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord1xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord1xOES", s); }
        Handles.MH_glTexCoord1xOES.invokeExact(handles.PFN_glTexCoord1xOES, s); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1xOES", e); }
    }

    /// Invokes `glTexCoord1xvOES`.
    /// ```
    /// void glTexCoord1xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord1xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord1xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord1xvOES", coords); }
        Handles.MH_glTexCoord1xvOES.invokeExact(handles.PFN_glTexCoord1xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1xvOES", e); }
    }

    /// Invokes `glTexCoord2xOES`.
    /// ```
    /// void glTexCoord2xOES(((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t);
    /// ```
    public void TexCoord2xOES(int s, int t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2xOES", s, t); }
        Handles.MH_glTexCoord2xOES.invokeExact(handles.PFN_glTexCoord2xOES, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2xOES", e); }
    }

    /// Invokes `glTexCoord2xvOES`.
    /// ```
    /// void glTexCoord2xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord2xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord2xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord2xvOES", coords); }
        Handles.MH_glTexCoord2xvOES.invokeExact(handles.PFN_glTexCoord2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2xvOES", e); }
    }

    /// Invokes `glTexCoord3xOES`.
    /// ```
    /// void glTexCoord3xOES(((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r);
    /// ```
    public void TexCoord3xOES(int s, int t, int r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord3xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord3xOES", s, t, r); }
        Handles.MH_glTexCoord3xOES.invokeExact(handles.PFN_glTexCoord3xOES, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3xOES", e); }
    }

    /// Invokes `glTexCoord3xvOES`.
    /// ```
    /// void glTexCoord3xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord3xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord3xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord3xvOES", coords); }
        Handles.MH_glTexCoord3xvOES.invokeExact(handles.PFN_glTexCoord3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3xvOES", e); }
    }

    /// Invokes `glTexCoord4xOES`.
    /// ```
    /// void glTexCoord4xOES(((int32_t) khronos_int32_t) GLfixed s, ((int32_t) khronos_int32_t) GLfixed t, ((int32_t) khronos_int32_t) GLfixed r, ((int32_t) khronos_int32_t) GLfixed q);
    /// ```
    public void TexCoord4xOES(int s, int t, int r, int q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4xOES", s, t, r, q); }
        Handles.MH_glTexCoord4xOES.invokeExact(handles.PFN_glTexCoord4xOES, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4xOES", e); }
    }

    /// Invokes `glTexCoord4xvOES`.
    /// ```
    /// void glTexCoord4xvOES(const GLfixed* coords);
    /// ```
    public void TexCoord4xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoord4xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoord4xvOES", coords); }
        Handles.MH_glTexCoord4xvOES.invokeExact(handles.PFN_glTexCoord4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4xvOES", e); }
    }

    /// Invokes `glTexGenxOES`.
    /// ```
    /// void glTexGenxOES((unsigned int) GLenum coord, (unsigned int) GLenum pname, ((int32_t) khronos_int32_t) GLfixed param);
    /// ```
    public void TexGenxOES(int coord, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexGenxOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexGenxOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexGenxOES", coord, pname, param); }
        Handles.MH_glTexGenxOES.invokeExact(handles.PFN_glTexGenxOES, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexGenxOES", e); }
    }

    /// Invokes `glTexGenxvOES`.
    /// ```
    /// void glTexGenxvOES((unsigned int) GLenum coord, (unsigned int) GLenum pname, const GLfixed* params);
    /// ```
    public void TexGenxvOES(int coord, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexGenxvOES)) throw new GLSymbolNotFoundError("Symbol not found: glTexGenxvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexGenxvOES", coord, pname, params); }
        Handles.MH_glTexGenxvOES.invokeExact(handles.PFN_glTexGenxvOES, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexGenxvOES", e); }
    }

    /// Invokes `glVertex2xOES`.
    /// ```
    /// void glVertex2xOES(((int32_t) khronos_int32_t) GLfixed x);
    /// ```
    public void Vertex2xOES(int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2xOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex2xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex2xOES", x); }
        Handles.MH_glVertex2xOES.invokeExact(handles.PFN_glVertex2xOES, x); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2xOES", e); }
    }

    /// Invokes `glVertex2xvOES`.
    /// ```
    /// void glVertex2xvOES(const GLfixed* coords);
    /// ```
    public void Vertex2xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex2xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex2xvOES", coords); }
        Handles.MH_glVertex2xvOES.invokeExact(handles.PFN_glVertex2xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2xvOES", e); }
    }

    /// Invokes `glVertex3xOES`.
    /// ```
    /// void glVertex3xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y);
    /// ```
    public void Vertex3xOES(int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3xOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex3xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex3xOES", x, y); }
        Handles.MH_glVertex3xOES.invokeExact(handles.PFN_glVertex3xOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3xOES", e); }
    }

    /// Invokes `glVertex3xvOES`.
    /// ```
    /// void glVertex3xvOES(const GLfixed* coords);
    /// ```
    public void Vertex3xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex3xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex3xvOES", coords); }
        Handles.MH_glVertex3xvOES.invokeExact(handles.PFN_glVertex3xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3xvOES", e); }
    }

    /// Invokes `glVertex4xOES`.
    /// ```
    /// void glVertex4xOES(((int32_t) khronos_int32_t) GLfixed x, ((int32_t) khronos_int32_t) GLfixed y, ((int32_t) khronos_int32_t) GLfixed z);
    /// ```
    public void Vertex4xOES(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4xOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex4xOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex4xOES", x, y, z); }
        Handles.MH_glVertex4xOES.invokeExact(handles.PFN_glVertex4xOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4xOES", e); }
    }

    /// Invokes `glVertex4xvOES`.
    /// ```
    /// void glVertex4xvOES(const GLfixed* coords);
    /// ```
    public void Vertex4xvOES(@NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4xvOES)) throw new GLSymbolNotFoundError("Symbol not found: glVertex4xvOES");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertex4xvOES", coords); }
        Handles.MH_glVertex4xvOES.invokeExact(handles.PFN_glVertex4xvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4xvOES", e); }
    }

}
