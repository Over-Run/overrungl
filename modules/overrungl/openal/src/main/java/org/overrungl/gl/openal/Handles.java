/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrungl.gl.openal;

import org.overrun.gl.FunctionDescriptors;
import org.overrun.gl.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static org.overrun.gl.FunctionDescriptors.*;

/**
 * The OpenAL method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    private static boolean initialized;
    static SymbolLookup lookup;
    /**
     * AL
     */
    static MethodHandle
        alEnable, alDisable, alIsEnabled, alDopplerFactor, alDopplerVelocity, alSpeedOfSound, alDistanceModel, alGetString,
        alGetBooleanv, alGetIntegerv, alGetFloatv, alGetDoublev, alGetBoolean, alGetInteger, alGetFloat, alGetDouble, alGetError,
        alIsExtensionPresent, alGetProcAddress, alGetEnumValue, alListenerf, alListener3f, alListenerfv, alListeneri, alListener3i,
        alListeneriv, alGetListenerf, alGetListener3f, alGetListenerfv, alGetListeneri, alGetListener3i, alGetListeneriv,
        alGenSources, alDeleteSources, alIsSource, alSourcef, alSource3f, alSourcefv, alSourcei, alSource3i, alSourceiv,
        alGetSourcef, alGetSource3f, alGetSourcefv, alGetSourcei, alGetSource3i, alGetSourceiv, alSourcePlay, alSourceStop,
        alSourceRewind, alSourcePause, alSourcePlayv, alSourceStopv, alSourceRewindv, alSourcePausev, alSourceQueueBuffers,
        alSourceUnqueueBuffers, alGenBuffers, alDeleteBuffers, alIsBuffer, alBufferData, alBufferf, alBuffer3f, alBufferfv,
        alBufferi, alBuffer3i, alBufferiv, alGetBufferf, alGetBuffer3f, alGetBufferfv, alGetBufferi, alGetBuffer3i, alGetBufferiv;
    /**
     * ALC
     */
    static MethodHandle
        alcCreateContext, alcMakeContextCurrent, alcProcessContext, alcSuspendContext, alcDestroyContext, alcGetCurrentContext,
        alcGetContextsDevice, alcOpenDevice, alcCloseDevice, alcGetError, alcIsExtensionPresent, alcGetProcAddress, alcGetEnumValue,
        alcGetString, alcGetIntegerv, alcCaptureOpenDevice, alcCaptureCloseDevice, alcCaptureStart, alcCaptureStop, alcCaptureSamples;

    private static MethodHandle downcall(String name,
                                         FunctionDescriptor function) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function);
    }

    private static MethodHandle downcall(String name,
                                         FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function);
    }

    private static void createAL() {
        alEnable = downcall("alEnable", IV);
        alDisable = downcall("alDisable", IV);
        alIsEnabled = downcall("alIsEnabled", IZ);
        alDopplerFactor = downcall("alDopplerFactor", FV);
        alDopplerVelocity = downcall("alDopplerVelocity", FV);
        alSpeedOfSound = downcall("alSpeedOfSound", FV);
        alDistanceModel = downcall("alDistanceModel", IV);
        alGetString = downcall("alGetString", Ip);
        alGetBooleanv = downcall("alGetBooleanv", IPV);
        alGetIntegerv = downcall("alGetIntegerv", IPV);
        alGetFloatv = downcall("alGetFloatv", IPV);
        alGetDoublev = downcall("alGetDoublev", IPV);
        alGetBoolean = downcall("alGetBoolean", IZ);
        alGetInteger = downcall("alGetInteger", II);
        alGetFloat = downcall("alGetFloat", IF);
        alGetDouble = downcall("alGetDouble", ID);
        alGetError = downcall("alGetError", I);
        alIsExtensionPresent = downcall("alIsExtensionPresent", PZ);
        alGetProcAddress = downcall("alGetProcAddress", PP);
        alGetEnumValue = downcall("alGetEnumValue", fd_PI);
        alListenerf = downcall("alListenerf", IFV);
        alListener3f = downcall("alListener3f", IFFFV);
        alListenerfv = downcall("alListenerfv", IPV);
        alListeneri = downcall("alListeneri", IIV);
        alListener3i = downcall("alListener3i", IIIIV);
        alListeneriv = downcall("alListeneriv", IPV);
        alGetListenerf = downcall("alGetListenerf", IPV);
        alGetListener3f = downcall("alGetListener3f", IPPPV);
        alGetListenerfv = downcall("alGetListenerfv", IPV);
        alGetListeneri = downcall("alGetListeneri", IPV);
        alGetListener3i = downcall("alGetListener3i", IPPPV);
        alGetListeneriv = downcall("alGetListeneriv", IPV);
        alGenSources = downcall("alGenSources", IPV);
        alDeleteSources = downcall("alDeleteSources", IPV);
        alIsSource = downcall("alIsSource", IZ);
        alSourcef = downcall("alSourcef", IIFV);
        alSource3f = downcall("alSource3f", IIFFFV);
        alSourcefv = downcall("alSourcefv", IIPV);
        alSourcei = downcall("alSourcei", IIIV);
        alSource3i = downcall("alSource3i", IIIIIV);
        alSourceiv = downcall("alSourceiv", IIPV);
        alGetSourcef = downcall("alGetSourcef", IIPV);
        alGetSource3f = downcall("alGetSource3f", IIPPPV);
        alGetSourcefv = downcall("alGetSourcefv", IIPV);
        alGetSourcei = downcall("alGetSourcei", IIPV);
        alGetSource3i = downcall("alGetSource3i", IIPPPV);
        alGetSourceiv = downcall("alGetSourceiv", IIPV);
        alSourcePlay = downcall("alSourcePlay", IV);
        alSourceStop = downcall("alSourceStop", IV);
        alSourceRewind = downcall("alSourceRewind", IV);
        alSourcePause = downcall("alSourcePause", IV);
        alSourcePlayv = downcall("alSourcePlayv", IPV);
        alSourceStopv = downcall("alSourceStopv", IPV);
        alSourceRewindv = downcall("alSourceRewindv", IPV);
        alSourcePausev = downcall("alSourcePausev", IPV);
        alSourceQueueBuffers = downcall("alSourceQueueBuffers", IIPV);
        alSourceUnqueueBuffers = downcall("alSourceUnqueueBuffers", IIPV);
        alGenBuffers = downcall("alGenBuffers", IPV);
        alDeleteBuffers = downcall("alDeleteBuffers", IPV);
        alIsBuffer = downcall("alIsBuffer", IZ);
        alBufferData = downcall("alBufferData", IIPIIV);
        alBufferf = downcall("alBufferf", IIFV);
        alBuffer3f = downcall("alBuffer3f", IIFFFV);
        alBufferfv = downcall("alBufferfv", IIPV);
        alBufferi = downcall("alBufferi", IIIV);
        alBuffer3i = downcall("alBuffer3i", IIIIIV);
        alBufferiv = downcall("alBufferiv", IIPV);
        alGetBufferf = downcall("alGetBufferf", IIPV);
        alGetBuffer3f = downcall("alGetBuffer3f", IIPPPV);
        alGetBufferfv = downcall("alGetBufferfv", IIPV);
        alGetBufferi = downcall("alGetBufferi", IIPV);
        alGetBuffer3i = downcall("alGetBuffer3i", IIPPPV);
        alGetBufferiv = downcall("alGetBufferiv", IIPV);
    }

    private static void createALC() {
        alcCreateContext = downcall("alcCreateContext", PPP);
        alcMakeContextCurrent = downcall("alcMakeContextCurrent", PZ);
        alcProcessContext = downcall("alcProcessContext", PV);
        alcSuspendContext = downcall("alcSuspendContext", PV);
        alcDestroyContext = downcall("alcDestroyContext", PV);
        alcGetCurrentContext = downcall("alcGetCurrentContext", P);
        alcGetContextsDevice = downcall("alcGetContextsDevice", PP);
        alcOpenDevice = downcall("alcOpenDevice", PP);
        alcCloseDevice = downcall("alcCloseDevice", PZ);
        alcGetError = downcall("alcGetError", fd_PI);
        alcIsExtensionPresent = downcall("alcIsExtensionPresent", PPZ);
        alcGetProcAddress = downcall("alcGetProcAddress", PPP);
        alcGetEnumValue = downcall("alcGetEnumValue", PPI);
        alcGetString = downcall("alcGetString", PIp);
        alcGetIntegerv = downcall("alcGetIntegerv", PIIPV);
        alcCaptureOpenDevice = downcall("alcCaptureOpenDevice", PIIIP);
        alcCaptureCloseDevice = downcall("alcCaptureCloseDevice", PZ);
        alcCaptureStart = downcall("alcCaptureStart", PV);
        alcCaptureStop = downcall("alcCaptureStop", PV);
        alcCaptureSamples = downcall("alcCaptureSamples", PPIV);
    }

    static void create() {
        if (initialized) return;
        initialized = true;

        lookup = RuntimeHelper.load("openal", "openal", RuntimeHelper.VERSION);
        createAL();
        createALC();
    }
}
