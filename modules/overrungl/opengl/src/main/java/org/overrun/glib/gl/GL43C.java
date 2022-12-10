/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SegmentScope;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 4.3 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL43C extends GL42C permits GL44C {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBindVertexBuffer, caps.glClearBufferData, caps.glClearBufferSubData, caps.glCopyImageSubData, caps.glDebugMessageCallback, caps.glDebugMessageControl,
            caps.glDebugMessageInsert, caps.glDispatchCompute, caps.glDispatchComputeIndirect, caps.glFramebufferParameteri, caps.glGetDebugMessageLog, caps.glGetFramebufferParameteriv,
            caps.glGetInternalformati64v, caps.glGetObjectLabel, caps.glGetObjectPtrLabel, caps.glGetPointerv, caps.glGetProgramInterfaceiv, caps.glGetProgramResourceIndex,
            caps.glGetProgramResourceLocation, caps.glGetProgramResourceLocationIndex, caps.glGetProgramResourceName, caps.glGetProgramResourceiv, caps.glInvalidateBufferData, caps.glInvalidateBufferSubData,
            caps.glInvalidateFramebuffer, caps.glInvalidateSubFramebuffer, caps.glInvalidateTexImage, caps.glInvalidateTexSubImage, caps.glMultiDrawArraysIndirect, caps.glMultiDrawElementsIndirect,
            caps.glObjectLabel, caps.glObjectPtrLabel, caps.glPopDebugGroup, caps.glPushDebugGroup, caps.glShaderStorageBlockBinding, caps.glTexBufferRange,
            caps.glTexStorage2DMultisample, caps.glTexStorage3DMultisample, caps.glTextureView, caps.glVertexAttribBinding, caps.glVertexAttribFormat, caps.glVertexAttribIFormat,
            caps.glVertexAttribLFormat, caps.glVertexBindingDivisor);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindVertexBuffer = load.invoke("glBindVertexBuffer", IIJIV);
        caps.glClearBufferData = load.invoke("glClearBufferData", IIIIPV);
        caps.glClearBufferSubData = load.invoke("glClearBufferSubData", IIJJIIPV);
        caps.glCopyImageSubData = load.invoke("glCopyImageSubData", IIIIIIIIIIIIIIIV);
        caps.glDebugMessageCallback = load.invoke("glDebugMessageCallback", PPV);
        caps.glDebugMessageControl = load.invoke("glDebugMessageControl", IIIIPZV);
        caps.glDebugMessageInsert = load.invoke("glDebugMessageInsert", IIIIIPV);
        caps.glDispatchCompute = load.invoke("glDispatchCompute", IIIV);
        caps.glDispatchComputeIndirect = load.invoke("glDispatchComputeIndirect", JV);
        caps.glFramebufferParameteri = load.invoke("glFramebufferParameteri", IIIV);
        caps.glGetDebugMessageLog = load.invoke("glGetDebugMessageLog", IIPPPPPPI);
        caps.glGetFramebufferParameteriv = load.invoke("glGetFramebufferParameteriv", IIPV);
        caps.glGetInternalformati64v = load.invoke("glGetInternalformati64v", IIIIPV);
        caps.glGetObjectLabel = load.invoke("glGetObjectLabel", IIIPPV);
        caps.glGetObjectPtrLabel = load.invoke("glGetObjectPtrLabel", PIPPV);
        caps.glGetPointerv = load.invoke("glGetPointerv", IPV);
        caps.glGetProgramInterfaceiv = load.invoke("glGetProgramInterfaceiv", IIIPV);
        caps.glGetProgramResourceIndex = load.invoke("glGetProgramResourceIndex", IIPI);
        caps.glGetProgramResourceLocation = load.invoke("glGetProgramResourceLocation", IIPI);
        caps.glGetProgramResourceLocationIndex = load.invoke("glGetProgramResourceLocationIndex", IIPI);
        caps.glGetProgramResourceName = load.invoke("glGetProgramResourceName", IIIIPPV);
        caps.glGetProgramResourceiv = load.invoke("glGetProgramResourceiv", IIIIPIPPV);
        caps.glInvalidateBufferData = load.invoke("glInvalidateBufferData", IV);
        caps.glInvalidateBufferSubData = load.invoke("glInvalidateBufferSubData", IJJV);
        caps.glInvalidateFramebuffer = load.invoke("glInvalidateFramebuffer", IIPV);
        caps.glInvalidateSubFramebuffer = load.invoke("glInvalidateSubFramebuffer", IIPIIIIV);
        caps.glInvalidateTexImage = load.invoke("glInvalidateTexImage", IIV);
        caps.glInvalidateTexSubImage = load.invoke("glInvalidateTexSubImage", IIIIIIIIV);
        caps.glMultiDrawArraysIndirect = load.invoke("glMultiDrawArraysIndirect", IPIIV);
        caps.glMultiDrawElementsIndirect = load.invoke("glMultiDrawElementsIndirect", IIPIIV);
        caps.glObjectLabel = load.invoke("glObjectLabel", IIIPV);
        caps.glObjectPtrLabel = load.invoke("glObjectPtrLabel", PIPV);
        caps.glPopDebugGroup = load.invoke("glPopDebugGroup", V);
        caps.glPushDebugGroup = load.invoke("glPushDebugGroup", IIIPV);
        caps.glShaderStorageBlockBinding = load.invoke("glShaderStorageBlockBinding", IIIV);
        caps.glTexBufferRange = load.invoke("glTexBufferRange", IIIJJV);
        caps.glTexStorage2DMultisample = load.invoke("glTexStorage2DMultisample", IIIIIZV);
        caps.glTexStorage3DMultisample = load.invoke("glTexStorage3DMultisample", IIIIIIZV);
        caps.glTextureView = load.invoke("glTextureView", IIIIIIIIV);
        caps.glVertexAttribBinding = load.invoke("glVertexAttribBinding", IIV);
        caps.glVertexAttribFormat = load.invoke("glVertexAttribFormat", IIIZIV);
        caps.glVertexAttribIFormat = load.invoke("glVertexAttribIFormat", IIIIV);
        caps.glVertexAttribLFormat = load.invoke("glVertexAttribLFormat", IIIIV);
        caps.glVertexBindingDivisor = load.invoke("glVertexBindingDivisor", IIV);
    }

    public static void bindVertexBuffer(int bindingIndex, int buffer, long offset, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glBindVertexBuffer).invokeExact(bindingIndex, buffer, offset, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferData(int target, int internalFormat, int format, int type, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferData).invokeExact(target, internalFormat, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferSubData(int target, int internalFormat, long offset, long size, int format, int type, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferSubData).invokeExact(target, internalFormat, offset, size, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyImageSubData).invokeExact(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageCallback(MemorySegment callback, MemorySegment userParam) {
        var caps = getCapabilities();
        try {
            check(caps.glDebugMessageCallback).invokeExact(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageCallback(SegmentScope scope, GLDebugProc callback, MemorySegment userParam) {
        debugMessageCallback(callback.address(scope), userParam);
    }

    public static void debugMessageControl(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        var caps = getCapabilities();
        try {
            check(caps.glDebugMessageControl).invokeExact(source, type, severity, count, ids, enabled);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageControl(SegmentAllocator allocator, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        debugMessageControl(source, type, severity, count, allocator.allocateArray(JAVA_INT, ids), enabled);
    }

    public static void debugMessageInsert(int source, int type, int id, int severity, int length, MemorySegment buf) {
        var caps = getCapabilities();
        try {
            check(caps.glDebugMessageInsert).invokeExact(source, type, id, severity, length, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageInsert(SegmentAllocator allocator, int source, int type, int id, int severity, String buf) {
        debugMessageInsert(source, type, id, severity, -1, allocator.allocateUtf8String(buf));
    }

    public static void dispatchCompute(int numGroupsX, int numGroupsY, int numGroupsZ) {
        var caps = getCapabilities();
        try {
            check(caps.glDispatchCompute).invokeExact(numGroupsX, numGroupsY, numGroupsZ);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void dispatchComputeIndirect(long indirect) {
        var caps = getCapabilities();
        try {
            check(caps.glDispatchComputeIndirect).invokeExact(indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferParameteri(int target, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferParameteri).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getDebugMessageLog(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetDebugMessageLog).invokeExact(count, bufSize, sources, types, ids, severities, lengths, messageLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getDebugMessageLog(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, (int) messageLog.byteSize(), sources, types, ids, severities, lengths, messageLog);
    }

    public static int getDebugMessageLog(SegmentAllocator allocator, int count, int bufSize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, String[] messageLog) {
        var pSrc = allocator.allocateArray(JAVA_INT, sources.length);
        var pTypes = allocator.allocateArray(JAVA_INT, types.length);
        var pIds = allocator.allocateArray(JAVA_INT, ids.length);
        var pSvr = allocator.allocateArray(JAVA_INT, severities.length);
        var pLen = allocator.allocateArray(JAVA_INT, lengths.length);
        var pLog = allocator.allocateArray(JAVA_BYTE, bufSize);
        int num = getDebugMessageLog(count, bufSize, pSrc, pTypes, pIds, pSvr, pLen, pLog);
        RuntimeHelper.toArray(pSrc, sources);
        RuntimeHelper.toArray(pTypes, types);
        RuntimeHelper.toArray(pIds, ids);
        RuntimeHelper.toArray(pSvr, severities);
        RuntimeHelper.toArray(pLen, lengths);
        messageLog[0] = pLog.getUtf8String(0);
        return num;
    }

    public static void getFramebufferParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFramebufferParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFramebufferParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getFramebufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInternalformati64v(int target, int internalFormat, int pname, int count, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetInternalformati64v).invokeExact(target, internalFormat, pname, count, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInternalformati64v(SegmentAllocator allocator, int target, int internalFormat, int pname, long[] params) {
        var seg = allocator.allocateArray(JAVA_LONG, params.length);
        getInternalformati64v(target, internalFormat, pname, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static long getInternalformati64(int target, int internalFormat, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getInternalformati64v(target, internalFormat, pname, 1, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getObjectLabel(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glGetObjectLabel).invokeExact(identifier, name, bufSize, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getObjectLabel(int identifier, int name, MemorySegment length, MemorySegment label) {
        getObjectLabel(identifier, name, (int) label.byteSize(), length, label);
    }

    public static String getObjectLabel(SegmentAllocator allocator, int identifier, int name, int bufSize, int @Nullable [] length) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getObjectLabel(identifier, name, bufSize, seg, pLen);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getObjectLabel(SegmentAllocator allocator, int identifier, int name, int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, 1024, length);
    }

    public static void getObjectPtrLabel(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glGetObjectPtrLabel).invokeExact(ptr, bufSize, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getObjectPtrLabel(MemorySegment ptr, MemorySegment length, MemorySegment label) {
        getObjectPtrLabel(ptr, (int) label.byteSize(), length, label);
    }

    public static String getObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int bufSize, int @Nullable [] length) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getObjectPtrLabel(ptr, bufSize, seg, pLen);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, 1024, length);
    }

    public static void getProgramInterfaceiv(int program, int programInterface, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramInterfaceiv).invokeExact(program, programInterface, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramInterfacei(int program, int programInterface, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getProgramInterfaceiv(program, programInterface, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getProgramResourceIndex(int program, int programInterface, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetProgramResourceIndex).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceIndex(SegmentAllocator allocator, int program, int programInterface, String name) {
        return getProgramResourceIndex(program, programInterface, allocator.allocateUtf8String(name));
    }

    public static int getProgramResourceLocation(int program, int programInterface, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetProgramResourceLocation).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceLocation(SegmentAllocator allocator, int program, int programInterface, String name) {
        return getProgramResourceLocation(program, programInterface, allocator.allocateUtf8String(name));
    }

    public static int getProgramResourceLocationIndex(int program, int programInterface, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetProgramResourceLocationIndex).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceLocationIndex(SegmentAllocator allocator, int program, int programInterface, String name) {
        return getProgramResourceLocationIndex(program, programInterface, allocator.allocateUtf8String(name));
    }

    public static void getProgramResourceName(int program, int programInterface, int index, int bufSize, MemorySegment length, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramResourceName).invokeExact(program, programInterface, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramResourceName(int program, int programInterface, int index, MemorySegment length, MemorySegment name) {
        getProgramResourceName(program, programInterface, index, (int) name.byteSize(), length, name);
    }

    public static String getProgramResourceName(SegmentAllocator allocator, int program, int programInterface, int index, int bufSize, int @Nullable [] length) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getProgramResourceName(program, programInterface, index, bufSize, pLen, seg);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getProgramResourceName(SegmentAllocator allocator, int program, int programInterface, int index, int @Nullable [] length) {
        return getProgramResourceName(allocator, program, programInterface, index, 1024, length);
    }

    public static void getProgramResourceiv(int program, int programInterface, int index, int propCount, MemorySegment props, int count, MemorySegment length, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramResourceiv).invokeExact(program, programInterface, index, propCount, props, count, length, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramResourceiv(int program, int programInterface, int index, MemorySegment props, MemorySegment length, MemorySegment params) {
        getProgramResourceiv(program, programInterface, index, (int) (props.byteSize() >> 2), props, (int) params.byteSize(), length, params);
    }

    public static void getProgramResourceiv(SegmentAllocator allocator, int program, int programInterface, int index, int[] props, int @Nullable [] length, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getProgramResourceiv(program, programInterface, index, props.length, allocator.allocateArray(JAVA_INT, props), params.length, pLen, seg);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        RuntimeHelper.toArray(seg, params);
    }

    public static int getProgramResourceiv(SegmentAllocator allocator, int program, int programInterface, int index, int[] props) {
        var seg = allocator.allocate(JAVA_INT);
        getProgramResourceiv(program, programInterface, index, props.length, allocator.allocateArray(JAVA_INT, props), 1, MemorySegment.NULL, seg);
        return seg.get(JAVA_INT, 0);
    }

    public static void invalidateBufferData(int buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateBufferData).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateBufferSubData(int buffer, long offset, long length) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateBufferSubData).invokeExact(buffer, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateFramebuffer(int target, int numAttachments, MemorySegment attachments) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateFramebuffer).invokeExact(target, numAttachments, attachments);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateFramebuffer(SegmentAllocator allocator, int target, int[] attachments) {
        invalidateFramebuffer(target, attachments.length, allocator.allocateArray(JAVA_INT, attachments));
    }

    public static void invalidateFramebuffer(int target, int attachment) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, attachment);
            invalidateFramebuffer(target, 1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateSubFramebuffer(int target, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateSubFramebuffer).invokeExact(target, numAttachments, attachments, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateSubFramebuffer(SegmentAllocator allocator, int target, int[] attachments, int x, int y, int width, int height) {
        invalidateSubFramebuffer(target, attachments.length, allocator.allocateArray(JAVA_INT, attachments), x, y, width, height);
    }

    public static void invalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, attachment);
            invalidateSubFramebuffer(target, 1, mem, x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateTexImage(int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateTexImage).invokeExact(texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateTexSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArraysIndirect(int mode, MemorySegment indirect, int drawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawArraysIndirect).invokeExact(mode, indirect, drawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArraysIndirect(int mode, DrawArraysIndirectCommand.Buffer indirect, int drawCount, int stride) {
        multiDrawArraysIndirect(mode, indirect.address(), drawCount, stride);
    }

    public static void multiDrawElementsIndirect(int mode, int type, MemorySegment indirect, int drawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawElementsIndirect).invokeExact(mode, type, indirect, drawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsIndirect(int mode, int type, DrawElementsIndirectCommand.Buffer indirect, int drawCount, int stride) {
        multiDrawElementsIndirect(mode, type, indirect.address(), drawCount, stride);
    }

    public static void objectLabel(int identifier, int name, int length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glObjectLabel).invokeExact(identifier, name, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void objectLabel(SegmentAllocator allocator, int identifier, int name, String label) {
        objectLabel(identifier, name, -1, allocator.allocateUtf8String(label));
    }

    public static void objectPtrLabel(MemorySegment ptr, int length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glObjectPtrLabel).invokeExact(ptr, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void objectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, String label) {
        objectPtrLabel(ptr, -1, allocator.allocateUtf8String(label));
    }

    public static void popDebugGroup() {
        var caps = getCapabilities();
        try {
            check(caps.glPopDebugGroup).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushDebugGroup(int source, int id, int length, MemorySegment message) {
        var caps = getCapabilities();
        try {
            check(caps.glPushDebugGroup).invokeExact(source, id, length, message);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushDebugGroup(SegmentAllocator allocator, int source, int id, String message) {
        pushDebugGroup(source, id, -1, allocator.allocateUtf8String(message));
    }

    public static void shaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        var caps = getCapabilities();
        try {
            check(caps.glShaderStorageBlockBinding).invokeExact(program, storageBlockIndex, storageBlockBinding);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texBufferRange(int target, int internalFormat, int buffer, long offset, long size) {
        var caps = getCapabilities();
        try {
            check(caps.glTexBufferRange).invokeExact(target, internalFormat, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage2DMultisample).invokeExact(target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage3DMultisample).invokeExact(target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureView(int texture, int target, int origTexture, int internalFormat, int minLevel, int numLevels, int minLayer, int numLayers) {
        var caps = getCapabilities();
        try {
            check(caps.glTextureView).invokeExact(texture, target, origTexture, internalFormat, minLevel, numLevels, minLayer, numLayers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribBinding(int attribIndex, int bindingIndex) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribBinding).invokeExact(attribIndex, bindingIndex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribFormat(int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribFormat).invokeExact(attribIndex, size, type, normalized, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribIFormat(int attribIndex, int size, int type, int relativeOffset) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribIFormat).invokeExact(attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribLFormat(int attribIndex, int size, int type, int relativeOffset) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribLFormat).invokeExact(attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexBindingDivisor(int bindingIndex, int divisor) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexBindingDivisor).invokeExact(bindingIndex, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
