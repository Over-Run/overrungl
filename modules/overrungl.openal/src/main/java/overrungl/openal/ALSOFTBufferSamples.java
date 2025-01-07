/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.openal;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.*;
import overrungl.util.*;
public final class ALSOFTBufferSamples {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int AL_MONO_SOFT = 0x1500;
    public static final int AL_STEREO_SOFT = 0x1501;
    public static final int AL_REAR_SOFT = 0x1502;
    public static final int AL_QUAD_SOFT = 0x1503;
    public static final int AL_5POINT1_SOFT = 0x1504;
    public static final int AL_6POINT1_SOFT = 0x1505;
    public static final int AL_7POINT1_SOFT = 0x1506;
    public static final int AL_BYTE_SOFT = 0x1400;
    public static final int AL_UNSIGNED_BYTE_SOFT = 0x1401;
    public static final int AL_SHORT_SOFT = 0x1402;
    public static final int AL_UNSIGNED_SHORT_SOFT = 0x1403;
    public static final int AL_INT_SOFT = 0x1404;
    public static final int AL_UNSIGNED_INT_SOFT = 0x1405;
    public static final int AL_FLOAT_SOFT = 0x1406;
    public static final int AL_DOUBLE_SOFT = 0x1407;
    public static final int AL_BYTE3_SOFT = 0x1408;
    public static final int AL_UNSIGNED_BYTE3_SOFT = 0x1409;
    public static final int AL_MONO8_SOFT = 0x1100;
    public static final int AL_MONO16_SOFT = 0x1101;
    public static final int AL_MONO32F_SOFT = 0x10010;
    public static final int AL_STEREO8_SOFT = 0x1102;
    public static final int AL_STEREO16_SOFT = 0x1103;
    public static final int AL_STEREO32F_SOFT = 0x10011;
    public static final int AL_QUAD8_SOFT = 0x1204;
    public static final int AL_QUAD16_SOFT = 0x1205;
    public static final int AL_QUAD32F_SOFT = 0x1206;
    public static final int AL_REAR8_SOFT = 0x1207;
    public static final int AL_REAR16_SOFT = 0x1208;
    public static final int AL_REAR32F_SOFT = 0x1209;
    public static final int AL_5POINT1_8_SOFT = 0x120A;
    public static final int AL_5POINT1_16_SOFT = 0x120B;
    public static final int AL_5POINT1_32F_SOFT = 0x120C;
    public static final int AL_6POINT1_8_SOFT = 0x120D;
    public static final int AL_6POINT1_16_SOFT = 0x120E;
    public static final int AL_6POINT1_32F_SOFT = 0x120F;
    public static final int AL_7POINT1_8_SOFT = 0x1210;
    public static final int AL_7POINT1_16_SOFT = 0x1211;
    public static final int AL_7POINT1_32F_SOFT = 0x1212;
    public static final int AL_INTERNAL_FORMAT_SOFT = 0x2008;
    public static final int AL_BYTE_LENGTH_SOFT = 0x2009;
    public static final int AL_SAMPLE_LENGTH_SOFT = 0x200A;
    public static final int AL_SEC_LENGTH_SOFT = 0x200B;
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `alBufferSamplesSOFT`.
        public static final MethodHandle MH_alBufferSamplesSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferSamplesSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alBufferSubSamplesSOFT`.
        public static final MethodHandle MH_alBufferSubSamplesSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alBufferSubSamplesSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alGetBufferSamplesSOFT`.
        public static final MethodHandle MH_alGetBufferSamplesSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alGetBufferSamplesSOFT", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        /// The method handle of `alIsBufferFormatSupportedSOFT`.
        public static final MethodHandle MH_alIsBufferFormatSupportedSOFT = RuntimeHelper.downcallOrNull(ALInternal.lookup(), "alIsBufferFormatSupportedSOFT", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    }
    //endregion

    public static void alBufferSamplesSOFT(@CType("ALuint") int buffer, @CType("ALuint") int samplerate, @CType("ALenum") int internalformat, @CType("ALsizei") int samples, @CType("ALenum") int channels, @CType("ALenum") int type, @CType("const ALvoid *") java.lang.foreign.MemorySegment data) {
        if (Handles.MH_alBufferSamplesSOFT != null) {
        try {
            Handles.MH_alBufferSamplesSOFT.invokeExact(buffer, samplerate, internalformat, samples, channels, type, data);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferSamplesSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alBufferSamplesSOFT"); }
    }

    public static void alBufferSubSamplesSOFT(@CType("ALuint") int buffer, @CType("ALsizei") int offset, @CType("ALsizei") int samples, @CType("ALenum") int channels, @CType("ALenum") int type, @CType("const ALvoid *") java.lang.foreign.MemorySegment data) {
        if (Handles.MH_alBufferSubSamplesSOFT != null) {
        try {
            Handles.MH_alBufferSubSamplesSOFT.invokeExact(buffer, offset, samples, channels, type, data);
        } catch (Throwable e) { throw new RuntimeException("error in alBufferSubSamplesSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alBufferSubSamplesSOFT"); }
    }

    public static void alGetBufferSamplesSOFT(@CType("ALuint") int buffer, @CType("ALsizei") int offset, @CType("ALsizei") int samples, @CType("ALenum") int channels, @CType("ALenum") int type, @CType("ALvoid *") java.lang.foreign.MemorySegment data) {
        if (Handles.MH_alGetBufferSamplesSOFT != null) {
        try {
            Handles.MH_alGetBufferSamplesSOFT.invokeExact(buffer, offset, samples, channels, type, data);
        } catch (Throwable e) { throw new RuntimeException("error in alGetBufferSamplesSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alGetBufferSamplesSOFT"); }
    }

    public static @CType("ALboolean") boolean alIsBufferFormatSupportedSOFT(@CType("ALenum") int format) {
        if (Handles.MH_alIsBufferFormatSupportedSOFT != null) {
        try {
            return (boolean) Handles.MH_alIsBufferFormatSupportedSOFT.invokeExact(format);
        } catch (Throwable e) { throw new RuntimeException("error in alIsBufferFormatSupportedSOFT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: alIsBufferFormatSupportedSOFT"); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private ALSOFTBufferSamples() {
    }
}
