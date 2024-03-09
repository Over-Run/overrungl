/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.opengl;

import overrun.marshal.Unmarshal;

import java.lang.foreign.MemorySegment;
import java.util.HashMap;
import java.util.Map;

/**
 * The OpenGL function alias resolver
 *
 * @author squid233
 * @since 0.1.0
 */
final class GLAliasResolver {
    private static final Map<String, String[]> nameTable;

    static {
        final Map<String, String[]> map = HashMap.newHashMap(1200);
        map.put("glActiveTexture", alias("glActiveTextureARB"));
        map.put("glArrayElement", alias("glArrayElementEXT"));
        map.put("glAttachObjectARB", alias("glAttachShader"));
        map.put("glBeginConditionalRender", alias("glBeginConditionalRenderNV"));
        map.put("glBeginQuery", alias("glBeginQueryARB"));
        map.put("glBeginTransformFeedback", alias("glBeginTransformFeedbackEXT", "glBeginTransformFeedbackNV"));
        map.put("glBindAttribLocation", alias("glBindAttribLocationARB"));
        map.put("glBindBuffer", alias("glBindBufferARB"));
        map.put("glBindBufferBase", alias("glBindBufferBaseEXT", "glBindBufferBaseNV"));
        map.put("glBindBufferOffsetEXT", alias("glBindBufferOffsetNV"));
        map.put("glBindBufferRange", alias("glBindBufferRangeEXT", "glBindBufferRangeNV"));
        map.put("glBindFragDataLocation", alias("glBindFragDataLocationEXT"));
        map.put("glBindProgramARB", alias("glBindProgramNV"));
        map.put("glBindTexture", alias("glBindTextureEXT"));
        map.put("glBlendColor", alias("glBlendColorEXT"));
        map.put("glBlendEquation", alias("glBlendEquationEXT"));
        map.put("glBlendEquationi", alias("glBlendEquationIndexedAMD", "glBlendEquationiARB"));
        map.put("glBlendEquationSeparate", alias("glBlendEquationSeparateEXT"));
        map.put("glBlendEquationSeparatei", alias("glBlendEquationSeparateIndexedAMD", "glBlendEquationSeparateiARB"));
        map.put("glBlendFunci", alias("glBlendFuncIndexedAMD", "glBlendFunciARB"));
        map.put("glBlendFuncSeparate", alias("glBlendFuncSeparateEXT", "glBlendFuncSeparateINGR"));
        map.put("glBlendFuncSeparatei", alias("glBlendFuncSeparateIndexedAMD", "glBlendFuncSeparateiARB"));
        map.put("glBlitFramebuffer", alias("glBlitFramebufferEXT"));
        map.put("glBufferData", alias("glBufferDataARB"));
        map.put("glBufferSubData", alias("glBufferSubDataARB"));
        map.put("glCheckFramebufferStatus", alias("glCheckFramebufferStatusEXT"));
        map.put("glClampColor", alias("glClampColorARB"));
        map.put("glClearDepthf", alias("glClearDepthfOES"));
        map.put("glClientActiveTexture", alias("glClientActiveTextureARB"));
        map.put("glColorMaski", alias("glColorMaskIndexedEXT"));
        map.put("glColorSubTable", alias("glColorSubTableEXT"));
        map.put("glColorTable", alias("glColorTableEXT", "glColorTableSGI"));
        map.put("glColorTableParameterfv", alias("glColorTableParameterfvSGI"));
        map.put("glColorTableParameteriv", alias("glColorTableParameterivSGI"));
        map.put("glCompileShader", alias("glCompileShaderARB"));
        map.put("glCompressedTexImage1D", alias("glCompressedTexImage1DARB"));
        map.put("glCompressedTexImage2D", alias("glCompressedTexImage2DARB"));
        map.put("glCompressedTexImage3D", alias("glCompressedTexImage3DARB"));
        map.put("glCompressedTexSubImage1D", alias("glCompressedTexSubImage1DARB"));
        map.put("glCompressedTexSubImage2D", alias("glCompressedTexSubImage2DARB"));
        map.put("glCompressedTexSubImage3D", alias("glCompressedTexSubImage3DARB"));
        map.put("glConvolutionFilter1D", alias("glConvolutionFilter1DEXT"));
        map.put("glConvolutionFilter2D", alias("glConvolutionFilter2DEXT"));
        map.put("glConvolutionParameterf", alias("glConvolutionParameterfEXT"));
        map.put("glConvolutionParameterfv", alias("glConvolutionParameterfvEXT"));
        map.put("glConvolutionParameteri", alias("glConvolutionParameteriEXT"));
        map.put("glConvolutionParameteriv", alias("glConvolutionParameterivEXT"));
        map.put("glCopyColorSubTable", alias("glCopyColorSubTableEXT"));
        map.put("glCopyColorTable", alias("glCopyColorTableSGI"));
        map.put("glCopyConvolutionFilter1D", alias("glCopyConvolutionFilter1DEXT"));
        map.put("glCopyConvolutionFilter2D", alias("glCopyConvolutionFilter2DEXT"));
        map.put("glCopyTexImage1D", alias("glCopyTexImage1DEXT"));
        map.put("glCopyTexImage2D", alias("glCopyTexImage2DEXT"));
        map.put("glCopyTexSubImage1D", alias("glCopyTexSubImage1DEXT"));
        map.put("glCopyTexSubImage2D", alias("glCopyTexSubImage2DEXT"));
        map.put("glCopyTexSubImage3D", alias("glCopyTexSubImage3DEXT"));
        map.put("glCreateProgram", alias("glCreateProgramObjectARB"));
        map.put("glCreateShader", alias("glCreateShaderObjectARB"));
        map.put("glDebugMessageCallback", alias("glDebugMessageCallbackARB"));
        map.put("glDebugMessageControl", alias("glDebugMessageControlARB"));
        map.put("glDebugMessageInsert", alias("glDebugMessageInsertARB"));
        map.put("glDeleteBuffers", alias("glDeleteBuffersARB"));
        map.put("glDeleteFramebuffers", alias("glDeleteFramebuffersEXT"));
        map.put("glDeleteProgramsARB", alias("glDeleteProgramsNV"));
        map.put("glDeleteQueries", alias("glDeleteQueriesARB"));
        map.put("glDeleteRenderbuffers", alias("glDeleteRenderbuffersEXT"));
        map.put("glDeleteTransformFeedbacks", alias("glDeleteTransformFeedbacksNV"));
        map.put("glDeleteVertexArrays", alias("glDeleteVertexArraysAPPLE"));
        map.put("glDepthRangef", alias("glDepthRangefOES"));
        map.put("glDetachObjectARB", alias("glDetachShader"));
        map.put("glDisablei", alias("glDisableIndexedEXT"));
        map.put("glDisableVertexAttribArray", alias("glDisableVertexAttribArrayARB"));
        map.put("glDrawArrays", alias("glDrawArraysEXT"));
        map.put("glDrawArraysInstanced", alias("glDrawArraysInstancedARB", "glDrawArraysInstancedEXT"));
        map.put("glDrawBuffers", alias("glDrawBuffersARB", "glDrawBuffersATI"));
        map.put("glDrawElementsInstanced", alias("glDrawElementsInstancedARB", "glDrawElementsInstancedEXT"));
        map.put("glDrawRangeElements", alias("glDrawRangeElementsEXT"));
        map.put("glDrawTransformFeedback", alias("glDrawTransformFeedbackNV"));
        map.put("glEnablei", alias("glEnableIndexedEXT"));
        map.put("glEnableVertexAttribArray", alias("glEnableVertexAttribArrayARB"));
        map.put("glEndConditionalRender", alias("glEndConditionalRenderNV", "glEndConditionalRenderNVX"));
        map.put("glEndQuery", alias("glEndQueryARB"));
        map.put("glEndTransformFeedback", alias("glEndTransformFeedbackEXT", "glEndTransformFeedbackNV"));
        map.put("glFlushMappedBufferRange", alias("glFlushMappedBufferRangeAPPLE"));
        map.put("glFogCoordd", alias("glFogCoorddEXT"));
        map.put("glFogCoorddv", alias("glFogCoorddvEXT"));
        map.put("glFogCoordf", alias("glFogCoordfEXT"));
        map.put("glFogCoordfv", alias("glFogCoordfvEXT"));
        map.put("glFogCoordPointer", alias("glFogCoordPointerEXT"));
        map.put("glFramebufferRenderbuffer", alias("glFramebufferRenderbufferEXT"));
        map.put("glFramebufferTexture", alias("glFramebufferTextureARB", "glFramebufferTextureEXT"));
        map.put("glFramebufferTexture1D", alias("glFramebufferTexture1DEXT"));
        map.put("glFramebufferTexture2D", alias("glFramebufferTexture2DEXT"));
        map.put("glFramebufferTexture3D", alias("glFramebufferTexture3DEXT"));
        map.put("glFramebufferTextureFaceARB", alias("glFramebufferTextureFaceEXT"));
        map.put("glFramebufferTextureLayer", alias("glFramebufferTextureLayerARB", "glFramebufferTextureLayerEXT"));
        map.put("glGenBuffers", alias("glGenBuffersARB"));
        map.put("glGenerateMipmap", alias("glGenerateMipmapEXT"));
        map.put("glGenFramebuffers", alias("glGenFramebuffersEXT"));
        map.put("glGenProgramsARB", alias("glGenProgramsNV"));
        map.put("glGenQueries", alias("glGenQueriesARB"));
        map.put("glGenRenderbuffers", alias("glGenRenderbuffersEXT"));
        map.put("glGenTransformFeedbacks", alias("glGenTransformFeedbacksNV"));
        map.put("glGenVertexArrays", alias("glGenVertexArraysAPPLE"));
        map.put("glGetActiveAttrib", alias("glGetActiveAttribARB"));
        map.put("glGetActiveUniform", alias("glGetActiveUniformARB"));
        map.put("glGetAttribLocation", alias("glGetAttribLocationARB"));
        map.put("glGetBooleani_v", alias("glGetBooleanIndexedvEXT"));
        map.put("glGetBufferParameteriv", alias("glGetBufferParameterivARB"));
        map.put("glGetBufferPointerv", alias("glGetBufferPointervARB"));
        map.put("glGetBufferSubData", alias("glGetBufferSubDataARB"));
        map.put("glGetColorTable", alias("glGetColorTableEXT"));
        map.put("glGetColorTableParameterfv", alias("glGetColorTableParameterfvEXT"));
        map.put("glGetColorTableParameteriv", alias("glGetColorTableParameterivEXT"));
        map.put("glGetCompressedTexImage", alias("glGetCompressedTexImageARB"));
        map.put("glGetDebugMessageLog", alias("glGetDebugMessageLogARB"));
        map.put("glGetDoublei_v", alias("glGetDoubleIndexedvEXT", "glGetDoublei_vEXT"));
        map.put("glGetFloati_v", alias("glGetFloatIndexedvEXT", "glGetFloati_vEXT"));
        map.put("glGetFragDataLocation", alias("glGetFragDataLocationEXT"));
        map.put("glGetFramebufferAttachmentParameteriv", alias("glGetFramebufferAttachmentParameterivEXT"));
        map.put("glGetIntegeri_v", alias("glGetIntegerIndexedvEXT"));
        map.put("glGetMultisamplefv", alias("glGetMultisamplefvNV"));
        map.put("glGetPointerv", alias("glGetPointervEXT"));
        map.put("glGetQueryiv", alias("glGetQueryivARB"));
        map.put("glGetQueryObjecti64v", alias("glGetQueryObjecti64vEXT"));
        map.put("glGetQueryObjectiv", alias("glGetQueryObjectivARB"));
        map.put("glGetQueryObjectui64v", alias("glGetQueryObjectui64vEXT"));
        map.put("glGetQueryObjectuiv", alias("glGetQueryObjectuivARB"));
        map.put("glGetRenderbufferParameteriv", alias("glGetRenderbufferParameterivEXT"));
        map.put("glGetShaderSource", alias("glGetShaderSourceARB"));
        map.put("glGetTexParameterIiv", alias("glGetTexParameterIivEXT"));
        map.put("glGetTexParameterIuiv", alias("glGetTexParameterIuivEXT"));
        map.put("glGetTransformFeedbackVarying", alias("glGetTransformFeedbackVaryingEXT"));
        map.put("glGetUniformfv", alias("glGetUniformfvARB"));
        map.put("glGetUniformiv", alias("glGetUniformivARB"));
        map.put("glGetUniformLocation", alias("glGetUniformLocationARB"));
        map.put("glGetUniformuiv", alias("glGetUniformuivEXT"));
        map.put("glGetVertexAttribdv", alias("glGetVertexAttribdvARB", "glGetVertexAttribdvNV"));
        map.put("glGetVertexAttribfv", alias("glGetVertexAttribfvARB", "glGetVertexAttribfvNV"));
        map.put("glGetVertexAttribIiv", alias("glGetVertexAttribIivEXT"));
        map.put("glGetVertexAttribIuiv", alias("glGetVertexAttribIuivEXT"));
        map.put("glGetVertexAttribiv", alias("glGetVertexAttribivARB", "glGetVertexAttribivNV"));
        map.put("glGetVertexAttribLdv", alias("glGetVertexAttribLdvEXT"));
        map.put("glGetVertexAttribPointerv", alias("glGetVertexAttribPointervARB", "glGetVertexAttribPointervNV"));
        map.put("glHistogram", alias("glHistogramEXT"));
        map.put("glIsBuffer", alias("glIsBufferARB"));
        map.put("glIsEnabledi", alias("glIsEnabledIndexedEXT"));
        map.put("glIsFramebuffer", alias("glIsFramebufferEXT"));
        map.put("glIsProgramARB", alias("glIsProgramNV"));
        map.put("glIsQuery", alias("glIsQueryARB"));
        map.put("glIsRenderbuffer", alias("glIsRenderbufferEXT"));
        map.put("glIsTransformFeedback", alias("glIsTransformFeedbackNV"));
        map.put("glIsVertexArray", alias("glIsVertexArrayAPPLE"));
        map.put("glLinkProgram", alias("glLinkProgramARB"));
        map.put("glLoadTransposeMatrixd", alias("glLoadTransposeMatrixdARB"));
        map.put("glLoadTransposeMatrixf", alias("glLoadTransposeMatrixfARB"));
        map.put("glMapBuffer", alias("glMapBufferARB"));
        map.put("glMaxShaderCompilerThreadsARB", alias("glMaxShaderCompilerThreadsKHR"));
        map.put("glMemoryBarrier", alias("glMemoryBarrierEXT"));
        map.put("glMinmax", alias("glMinmaxEXT"));
        map.put("glMinSampleShading", alias("glMinSampleShadingARB"));
        map.put("glMultiDrawArrays", alias("glMultiDrawArraysEXT"));
        map.put("glMultiDrawArraysIndirect", alias("glMultiDrawArraysIndirectAMD"));
        map.put("glMultiDrawArraysIndirectCount", alias("glMultiDrawArraysIndirectCountARB"));
        map.put("glMultiDrawElements", alias("glMultiDrawElementsEXT"));
        map.put("glMultiDrawElementsIndirect", alias("glMultiDrawElementsIndirectAMD"));
        map.put("glMultiDrawElementsIndirectCount", alias("glMultiDrawElementsIndirectCountARB"));
        map.put("glMultiTexCoord1d", alias("glMultiTexCoord1dARB"));
        map.put("glMultiTexCoord1dv", alias("glMultiTexCoord1dvARB"));
        map.put("glMultiTexCoord1f", alias("glMultiTexCoord1fARB"));
        map.put("glMultiTexCoord1fv", alias("glMultiTexCoord1fvARB"));
        map.put("glMultiTexCoord1i", alias("glMultiTexCoord1iARB"));
        map.put("glMultiTexCoord1iv", alias("glMultiTexCoord1ivARB"));
        map.put("glMultiTexCoord1s", alias("glMultiTexCoord1sARB"));
        map.put("glMultiTexCoord1sv", alias("glMultiTexCoord1svARB"));
        map.put("glMultiTexCoord2d", alias("glMultiTexCoord2dARB"));
        map.put("glMultiTexCoord2dv", alias("glMultiTexCoord2dvARB"));
        map.put("glMultiTexCoord2f", alias("glMultiTexCoord2fARB"));
        map.put("glMultiTexCoord2fv", alias("glMultiTexCoord2fvARB"));
        map.put("glMultiTexCoord2i", alias("glMultiTexCoord2iARB"));
        map.put("glMultiTexCoord2iv", alias("glMultiTexCoord2ivARB"));
        map.put("glMultiTexCoord2s", alias("glMultiTexCoord2sARB"));
        map.put("glMultiTexCoord2sv", alias("glMultiTexCoord2svARB"));
        map.put("glMultiTexCoord3d", alias("glMultiTexCoord3dARB"));
        map.put("glMultiTexCoord3dv", alias("glMultiTexCoord3dvARB"));
        map.put("glMultiTexCoord3f", alias("glMultiTexCoord3fARB"));
        map.put("glMultiTexCoord3fv", alias("glMultiTexCoord3fvARB"));
        map.put("glMultiTexCoord3i", alias("glMultiTexCoord3iARB"));
        map.put("glMultiTexCoord3iv", alias("glMultiTexCoord3ivARB"));
        map.put("glMultiTexCoord3s", alias("glMultiTexCoord3sARB"));
        map.put("glMultiTexCoord3sv", alias("glMultiTexCoord3svARB"));
        map.put("glMultiTexCoord4d", alias("glMultiTexCoord4dARB"));
        map.put("glMultiTexCoord4dv", alias("glMultiTexCoord4dvARB"));
        map.put("glMultiTexCoord4f", alias("glMultiTexCoord4fARB"));
        map.put("glMultiTexCoord4fv", alias("glMultiTexCoord4fvARB"));
        map.put("glMultiTexCoord4i", alias("glMultiTexCoord4iARB"));
        map.put("glMultiTexCoord4iv", alias("glMultiTexCoord4ivARB"));
        map.put("glMultiTexCoord4s", alias("glMultiTexCoord4sARB"));
        map.put("glMultiTexCoord4sv", alias("glMultiTexCoord4svARB"));
        map.put("glMultTransposeMatrixd", alias("glMultTransposeMatrixdARB"));
        map.put("glMultTransposeMatrixf", alias("glMultTransposeMatrixfARB"));
        map.put("glNamedBufferStorage", alias("glNamedBufferStorageEXT"));
        map.put("glNamedBufferSubData", alias("glNamedBufferSubDataEXT"));
        map.put("glPauseTransformFeedback", alias("glPauseTransformFeedbackNV"));
        map.put("glPointParameterf", alias("glPointParameterfARB", "glPointParameterfEXT", "glPointParameterfSGIS"));
        map.put("glPointParameterfv", alias("glPointParameterfvARB", "glPointParameterfvEXT", "glPointParameterfvSGIS"));
        map.put("glPointParameteri", alias("glPointParameteriNV"));
        map.put("glPointParameteriv", alias("glPointParameterivNV"));
        map.put("glPolygonOffsetClamp", alias("glPolygonOffsetClampEXT"));
        map.put("glPrioritizeTextures", alias("glPrioritizeTexturesEXT"));
        map.put("glProgramParameteri", alias("glProgramParameteriARB", "glProgramParameteriEXT"));
        map.put("glProgramUniform1f", alias("glProgramUniform1fEXT"));
        map.put("glProgramUniform1fv", alias("glProgramUniform1fvEXT"));
        map.put("glProgramUniform1i", alias("glProgramUniform1iEXT"));
        map.put("glProgramUniform1iv", alias("glProgramUniform1ivEXT"));
        map.put("glProgramUniform1ui", alias("glProgramUniform1uiEXT"));
        map.put("glProgramUniform1uiv", alias("glProgramUniform1uivEXT"));
        map.put("glProgramUniform2f", alias("glProgramUniform2fEXT"));
        map.put("glProgramUniform2fv", alias("glProgramUniform2fvEXT"));
        map.put("glProgramUniform2i", alias("glProgramUniform2iEXT"));
        map.put("glProgramUniform2iv", alias("glProgramUniform2ivEXT"));
        map.put("glProgramUniform2ui", alias("glProgramUniform2uiEXT"));
        map.put("glProgramUniform2uiv", alias("glProgramUniform2uivEXT"));
        map.put("glProgramUniform3f", alias("glProgramUniform3fEXT"));
        map.put("glProgramUniform3fv", alias("glProgramUniform3fvEXT"));
        map.put("glProgramUniform3i", alias("glProgramUniform3iEXT"));
        map.put("glProgramUniform3iv", alias("glProgramUniform3ivEXT"));
        map.put("glProgramUniform3ui", alias("glProgramUniform3uiEXT"));
        map.put("glProgramUniform3uiv", alias("glProgramUniform3uivEXT"));
        map.put("glProgramUniform4f", alias("glProgramUniform4fEXT"));
        map.put("glProgramUniform4fv", alias("glProgramUniform4fvEXT"));
        map.put("glProgramUniform4i", alias("glProgramUniform4iEXT"));
        map.put("glProgramUniform4iv", alias("glProgramUniform4ivEXT"));
        map.put("glProgramUniform4ui", alias("glProgramUniform4uiEXT"));
        map.put("glProgramUniform4uiv", alias("glProgramUniform4uivEXT"));
        map.put("glProgramUniformMatrix2fv", alias("glProgramUniformMatrix2fvEXT"));
        map.put("glProgramUniformMatrix2x3fv", alias("glProgramUniformMatrix2x3fvEXT"));
        map.put("glProgramUniformMatrix2x4fv", alias("glProgramUniformMatrix2x4fvEXT"));
        map.put("glProgramUniformMatrix3fv", alias("glProgramUniformMatrix3fvEXT"));
        map.put("glProgramUniformMatrix3x2fv", alias("glProgramUniformMatrix3x2fvEXT"));
        map.put("glProgramUniformMatrix3x4fv", alias("glProgramUniformMatrix3x4fvEXT"));
        map.put("glProgramUniformMatrix4fv", alias("glProgramUniformMatrix4fvEXT"));
        map.put("glProgramUniformMatrix4x2fv", alias("glProgramUniformMatrix4x2fvEXT"));
        map.put("glProgramUniformMatrix4x3fv", alias("glProgramUniformMatrix4x3fvEXT"));
        map.put("glProvokingVertex", alias("glProvokingVertexEXT"));
        map.put("glReadnPixels", alias("glReadnPixelsARB"));
        map.put("glRenderbufferStorage", alias("glRenderbufferStorageEXT"));
        map.put("glRenderbufferStorageMultisample", alias("glRenderbufferStorageMultisampleEXT"));
        map.put("glResetHistogram", alias("glResetHistogramEXT"));
        map.put("glResetMinmax", alias("glResetMinmaxEXT"));
        map.put("glResumeTransformFeedback", alias("glResumeTransformFeedbackNV"));
        map.put("glSampleCoverage", alias("glSampleCoverageARB"));
        map.put("glSampleMaskEXT", alias("glSampleMaskSGIS"));
        map.put("glSamplePatternEXT", alias("glSamplePatternSGIS"));
        map.put("glSecondaryColor3b", alias("glSecondaryColor3bEXT"));
        map.put("glSecondaryColor3bv", alias("glSecondaryColor3bvEXT"));
        map.put("glSecondaryColor3d", alias("glSecondaryColor3dEXT"));
        map.put("glSecondaryColor3dv", alias("glSecondaryColor3dvEXT"));
        map.put("glSecondaryColor3f", alias("glSecondaryColor3fEXT"));
        map.put("glSecondaryColor3fv", alias("glSecondaryColor3fvEXT"));
        map.put("glSecondaryColor3i", alias("glSecondaryColor3iEXT"));
        map.put("glSecondaryColor3iv", alias("glSecondaryColor3ivEXT"));
        map.put("glSecondaryColor3s", alias("glSecondaryColor3sEXT"));
        map.put("glSecondaryColor3sv", alias("glSecondaryColor3svEXT"));
        map.put("glSecondaryColor3ub", alias("glSecondaryColor3ubEXT"));
        map.put("glSecondaryColor3ubv", alias("glSecondaryColor3ubvEXT"));
        map.put("glSecondaryColor3ui", alias("glSecondaryColor3uiEXT"));
        map.put("glSecondaryColor3uiv", alias("glSecondaryColor3uivEXT"));
        map.put("glSecondaryColor3us", alias("glSecondaryColor3usEXT"));
        map.put("glSecondaryColor3usv", alias("glSecondaryColor3usvEXT"));
        map.put("glSecondaryColorPointer", alias("glSecondaryColorPointerEXT"));
        map.put("glSeparableFilter2D", alias("glSeparableFilter2DEXT"));
        map.put("glShaderSource", alias("glShaderSourceARB"));
        map.put("glSpecializeShader", alias("glSpecializeShaderARB"));
        map.put("glStencilOpSeparate", alias("glStencilOpSeparateATI"));
        map.put("glTexBuffer", alias("glTexBufferARB", "glTexBufferEXT"));
        map.put("glTexImage3D", alias("glTexImage3DEXT"));
        map.put("glTexParameterIiv", alias("glTexParameterIivEXT"));
        map.put("glTexParameterIuiv", alias("glTexParameterIuivEXT"));
        map.put("glTexStorage1D", alias("glTexStorage1DEXT"));
        map.put("glTexStorage2D", alias("glTexStorage2DEXT"));
        map.put("glTexStorage3D", alias("glTexStorage3DEXT"));
        map.put("glTexSubImage1D", alias("glTexSubImage1DEXT"));
        map.put("glTexSubImage2D", alias("glTexSubImage2DEXT"));
        map.put("glTexSubImage3D", alias("glTexSubImage3DEXT"));
        map.put("glTransformFeedbackVaryings", alias("glTransformFeedbackVaryingsEXT"));
        map.put("glUniform1f", alias("glUniform1fARB"));
        map.put("glUniform1fv", alias("glUniform1fvARB"));
        map.put("glUniform1i", alias("glUniform1iARB"));
        map.put("glUniform1iv", alias("glUniform1ivARB"));
        map.put("glUniform1ui", alias("glUniform1uiEXT"));
        map.put("glUniform1uiv", alias("glUniform1uivEXT"));
        map.put("glUniform2f", alias("glUniform2fARB"));
        map.put("glUniform2fv", alias("glUniform2fvARB"));
        map.put("glUniform2i", alias("glUniform2iARB"));
        map.put("glUniform2iv", alias("glUniform2ivARB"));
        map.put("glUniform2ui", alias("glUniform2uiEXT"));
        map.put("glUniform2uiv", alias("glUniform2uivEXT"));
        map.put("glUniform3f", alias("glUniform3fARB"));
        map.put("glUniform3fv", alias("glUniform3fvARB"));
        map.put("glUniform3i", alias("glUniform3iARB"));
        map.put("glUniform3iv", alias("glUniform3ivARB"));
        map.put("glUniform3ui", alias("glUniform3uiEXT"));
        map.put("glUniform3uiv", alias("glUniform3uivEXT"));
        map.put("glUniform4f", alias("glUniform4fARB"));
        map.put("glUniform4fv", alias("glUniform4fvARB"));
        map.put("glUniform4i", alias("glUniform4iARB"));
        map.put("glUniform4iv", alias("glUniform4ivARB"));
        map.put("glUniform4ui", alias("glUniform4uiEXT"));
        map.put("glUniform4uiv", alias("glUniform4uivEXT"));
        map.put("glUniformMatrix2fv", alias("glUniformMatrix2fvARB"));
        map.put("glUniformMatrix3fv", alias("glUniformMatrix3fvARB"));
        map.put("glUniformMatrix4fv", alias("glUniformMatrix4fvARB"));
        map.put("glUnmapBuffer", alias("glUnmapBufferARB"));
        map.put("glUseProgram", alias("glUseProgramObjectARB"));
        map.put("glValidateProgram", alias("glValidateProgramARB"));
        map.put("glVertexAttrib1d", alias("glVertexAttrib1dARB", "glVertexAttrib1dNV"));
        map.put("glVertexAttrib1dv", alias("glVertexAttrib1dvARB", "glVertexAttrib1dvNV"));
        map.put("glVertexAttrib1f", alias("glVertexAttrib1fARB", "glVertexAttrib1fNV"));
        map.put("glVertexAttrib1fv", alias("glVertexAttrib1fvARB", "glVertexAttrib1fvNV"));
        map.put("glVertexAttrib1s", alias("glVertexAttrib1sARB", "glVertexAttrib1sNV"));
        map.put("glVertexAttrib1sv", alias("glVertexAttrib1svARB", "glVertexAttrib1svNV"));
        map.put("glVertexAttrib2d", alias("glVertexAttrib2dARB", "glVertexAttrib2dNV"));
        map.put("glVertexAttrib2dv", alias("glVertexAttrib2dvARB", "glVertexAttrib2dvNV"));
        map.put("glVertexAttrib2f", alias("glVertexAttrib2fARB", "glVertexAttrib2fNV"));
        map.put("glVertexAttrib2fv", alias("glVertexAttrib2fvARB", "glVertexAttrib2fvNV"));
        map.put("glVertexAttrib2s", alias("glVertexAttrib2sARB", "glVertexAttrib2sNV"));
        map.put("glVertexAttrib2sv", alias("glVertexAttrib2svARB", "glVertexAttrib2svNV"));
        map.put("glVertexAttrib3d", alias("glVertexAttrib3dARB", "glVertexAttrib3dNV"));
        map.put("glVertexAttrib3dv", alias("glVertexAttrib3dvARB", "glVertexAttrib3dvNV"));
        map.put("glVertexAttrib3f", alias("glVertexAttrib3fARB", "glVertexAttrib3fNV"));
        map.put("glVertexAttrib3fv", alias("glVertexAttrib3fvARB", "glVertexAttrib3fvNV"));
        map.put("glVertexAttrib3s", alias("glVertexAttrib3sARB", "glVertexAttrib3sNV"));
        map.put("glVertexAttrib3sv", alias("glVertexAttrib3svARB", "glVertexAttrib3svNV"));
        map.put("glVertexAttrib4bv", alias("glVertexAttrib4bvARB"));
        map.put("glVertexAttrib4d", alias("glVertexAttrib4dARB", "glVertexAttrib4dNV"));
        map.put("glVertexAttrib4dv", alias("glVertexAttrib4dvARB", "glVertexAttrib4dvNV"));
        map.put("glVertexAttrib4f", alias("glVertexAttrib4fARB", "glVertexAttrib4fNV"));
        map.put("glVertexAttrib4fv", alias("glVertexAttrib4fvARB", "glVertexAttrib4fvNV"));
        map.put("glVertexAttrib4iv", alias("glVertexAttrib4ivARB"));
        map.put("glVertexAttrib4Nbv", alias("glVertexAttrib4NbvARB"));
        map.put("glVertexAttrib4Niv", alias("glVertexAttrib4NivARB"));
        map.put("glVertexAttrib4Nsv", alias("glVertexAttrib4NsvARB"));
        map.put("glVertexAttrib4Nub", alias("glVertexAttrib4NubARB", "glVertexAttrib4ubNV"));
        map.put("glVertexAttrib4Nubv", alias("glVertexAttrib4NubvARB", "glVertexAttrib4ubvNV"));
        map.put("glVertexAttrib4Nuiv", alias("glVertexAttrib4NuivARB"));
        map.put("glVertexAttrib4Nusv", alias("glVertexAttrib4NusvARB"));
        map.put("glVertexAttrib4s", alias("glVertexAttrib4sARB", "glVertexAttrib4sNV"));
        map.put("glVertexAttrib4sv", alias("glVertexAttrib4svARB", "glVertexAttrib4svNV"));
        map.put("glVertexAttrib4ubv", alias("glVertexAttrib4ubvARB"));
        map.put("glVertexAttrib4uiv", alias("glVertexAttrib4uivARB"));
        map.put("glVertexAttrib4usv", alias("glVertexAttrib4usvARB"));
        map.put("glVertexAttribDivisor", alias("glVertexAttribDivisorARB"));
        map.put("glVertexAttribI1i", alias("glVertexAttribI1iEXT"));
        map.put("glVertexAttribI1iv", alias("glVertexAttribI1ivEXT"));
        map.put("glVertexAttribI1ui", alias("glVertexAttribI1uiEXT"));
        map.put("glVertexAttribI1uiv", alias("glVertexAttribI1uivEXT"));
        map.put("glVertexAttribI2i", alias("glVertexAttribI2iEXT"));
        map.put("glVertexAttribI2iv", alias("glVertexAttribI2ivEXT"));
        map.put("glVertexAttribI2ui", alias("glVertexAttribI2uiEXT"));
        map.put("glVertexAttribI2uiv", alias("glVertexAttribI2uivEXT"));
        map.put("glVertexAttribI3i", alias("glVertexAttribI3iEXT"));
        map.put("glVertexAttribI3iv", alias("glVertexAttribI3ivEXT"));
        map.put("glVertexAttribI3ui", alias("glVertexAttribI3uiEXT"));
        map.put("glVertexAttribI3uiv", alias("glVertexAttribI3uivEXT"));
        map.put("glVertexAttribI4bv", alias("glVertexAttribI4bvEXT"));
        map.put("glVertexAttribI4i", alias("glVertexAttribI4iEXT"));
        map.put("glVertexAttribI4iv", alias("glVertexAttribI4ivEXT"));
        map.put("glVertexAttribI4sv", alias("glVertexAttribI4svEXT"));
        map.put("glVertexAttribI4ubv", alias("glVertexAttribI4ubvEXT"));
        map.put("glVertexAttribI4ui", alias("glVertexAttribI4uiEXT"));
        map.put("glVertexAttribI4uiv", alias("glVertexAttribI4uivEXT"));
        map.put("glVertexAttribI4usv", alias("glVertexAttribI4usvEXT"));
        map.put("glVertexAttribIPointer", alias("glVertexAttribIPointerEXT"));
        map.put("glVertexAttribL1d", alias("glVertexAttribL1dEXT"));
        map.put("glVertexAttribL1dv", alias("glVertexAttribL1dvEXT"));
        map.put("glVertexAttribL2d", alias("glVertexAttribL2dEXT"));
        map.put("glVertexAttribL2dv", alias("glVertexAttribL2dvEXT"));
        map.put("glVertexAttribL3d", alias("glVertexAttribL3dEXT"));
        map.put("glVertexAttribL3dv", alias("glVertexAttribL3dvEXT"));
        map.put("glVertexAttribL4d", alias("glVertexAttribL4dEXT"));
        map.put("glVertexAttribL4dv", alias("glVertexAttribL4dvEXT"));
        map.put("glVertexAttribLPointer", alias("glVertexAttribLPointerEXT"));
        map.put("glVertexAttribPointer", alias("glVertexAttribPointerARB"));
        map.put("glWindowPos2d", alias("glWindowPos2dARB", "glWindowPos2dMESA"));
        map.put("glWindowPos2dv", alias("glWindowPos2dvARB", "glWindowPos2dvMESA"));
        map.put("glWindowPos2f", alias("glWindowPos2fARB", "glWindowPos2fMESA"));
        map.put("glWindowPos2fv", alias("glWindowPos2fvARB", "glWindowPos2fvMESA"));
        map.put("glWindowPos2i", alias("glWindowPos2iARB", "glWindowPos2iMESA"));
        map.put("glWindowPos2iv", alias("glWindowPos2ivARB", "glWindowPos2ivMESA"));
        map.put("glWindowPos2s", alias("glWindowPos2sARB", "glWindowPos2sMESA"));
        map.put("glWindowPos2sv", alias("glWindowPos2svARB", "glWindowPos2svMESA"));
        map.put("glWindowPos3d", alias("glWindowPos3dARB", "glWindowPos3dMESA"));
        map.put("glWindowPos3dv", alias("glWindowPos3dvARB", "glWindowPos3dvMESA"));
        map.put("glWindowPos3f", alias("glWindowPos3fARB", "glWindowPos3fMESA"));
        map.put("glWindowPos3fv", alias("glWindowPos3fvARB", "glWindowPos3fvMESA"));
        map.put("glWindowPos3i", alias("glWindowPos3iARB", "glWindowPos3iMESA"));
        map.put("glWindowPos3iv", alias("glWindowPos3ivARB", "glWindowPos3ivMESA"));
        map.put("glWindowPos3s", alias("glWindowPos3sARB", "glWindowPos3sMESA"));
        map.put("glWindowPos3sv", alias("glWindowPos3svARB", "glWindowPos3svMESA"));
        map.forEach((k, v) -> {
            for (int i = 0; i < v.length; i++) {
                final String[] strings = new String[v.length];
                strings[0] = k;
                for (int j = 1; j < strings.length; j++) {
                    final int i1 = j - 1;
                    if (i1 != i) {
                        strings[j] = v[i1];
                    }
                }
                map.put(v[i], strings);
            }
        });
        nameTable = map;
    }

    private static String[] alias(String... names) {
        return names;
    }

    private static String[] findAliases(String name) {
        return nameTable.get(name);
    }

    static MemorySegment resolve(GLLoadFunc load, String name) {
        // load by name
        final MemorySegment segment = load.invoke(name);
        if (!Unmarshal.isNullPointer(segment)) {
            return segment;
        }
        // load by alias
        final String[] aliases = findAliases(name);
        if (aliases == null) {
            return MemorySegment.NULL;
        }
        for (String alias : aliases) {
            final MemorySegment aliasSeg = load.invoke(alias);
            if (!Unmarshal.isNullPointer(aliasSeg)) {
                return aliasSeg;
            }
        }
        return MemorySegment.NULL;
    }
}
