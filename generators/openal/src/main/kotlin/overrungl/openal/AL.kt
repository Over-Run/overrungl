/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.openal

import overrungl.gen.StaticDowncall
import overrungl.gen.void
import overrungl.gen.void_ptr

fun AL() {
    StaticDowncall(alPackage, "AL", alLookup) {
        //region fields
        ALenum("AL_NONE" to "0")
        ALenum("AL_FALSE" to "0")
        ALenum("AL_TRUE" to "1")

        ALenum("AL_SOURCE_RELATIVE" to "0x202")
        ALenum("AL_CONE_INNER_ANGLE" to "0x1001")
        ALenum("AL_CONE_OUTER_ANGLE" to "0x1002")
        ALenum("AL_PITCH" to "0x1003")
        ALenum("AL_POSITION" to "0x1004")
        ALenum("AL_DIRECTION" to "0x1005")
        ALenum("AL_VELOCITY" to "0x1006")
        ALenum("AL_LOOPING" to "0x1007")
        ALenum("AL_BUFFER" to "0x1009")
        ALenum("AL_GAIN" to "0x100A")
        ALenum("AL_MIN_GAIN" to "0x100D")
        ALenum("AL_MAX_GAIN" to "0x100E")
        ALenum("AL_ORIENTATION" to "0x100F")
        ALenum("AL_SOURCE_STATE" to "0x1010")

        ALenum {
            "AL_INITIAL"("0x1011")
            "AL_PLAYING"("0x1012")
            "AL_PAUSED"("0x1013")
            "AL_STOPPED"("0x1014")
        }

        ALenum("AL_BUFFERS_QUEUED" to "0x1015")
        ALenum("AL_BUFFERS_PROCESSED" to "0x1016")
        ALenum("AL_REFERENCE_DISTANCE" to "0x1020")
        ALenum("AL_ROLLOFF_FACTOR" to "0x1021")
        ALenum("AL_CONE_OUTER_GAIN" to "0x1022")
        ALenum("AL_MAX_DISTANCE" to "0x1023")

        ALenum("AL_SEC_OFFSET" to "0x1024")
        ALenum("AL_SAMPLE_OFFSET" to "0x1025")
        ALenum("AL_BYTE_OFFSET" to "0x1026")

        ALenum("AL_SOURCE_TYPE" to "0x1027")

        ALenum {
            "AL_STATIC"("0x1028")
            "AL_STREAMING"("0x1029")
            "AL_UNDETERMINED"("0x1030")
        }

        ALenum("AL_FORMAT_MONO8" to "0x1100")
        ALenum("AL_FORMAT_MONO16" to "0x1101")
        ALenum("AL_FORMAT_STEREO8" to "0x1102")
        ALenum("AL_FORMAT_STEREO16" to "0x1103")

        ALenum("AL_FREQUENCY" to "0x2001")
        ALenum("AL_BITS" to "0x2002")
        ALenum("AL_CHANNELS" to "0x2003")
        ALenum("AL_SIZE" to "0x2004")

        ALenum {
            "AL_UNUSED"("0x2010")
            "AL_PENDING"("0x2011")
            "AL_PROCESSED"("0x2012")
        }

        ALenum("AL_NO_ERROR" to "0")
        ALenum("AL_INVALID_NAME" to "0xA001")
        ALenum("AL_INVALID_ENUM" to "0xA002")
        ALenum("AL_INVALID_VALUE" to "0xA003")
        ALenum("AL_INVALID_OPERATION" to "0xA004")
        ALenum("AL_OUT_OF_MEMORY" to "0xA005")

        ALenum("AL_VENDOR" to "0xB001")
        ALenum("AL_VERSION" to "0xB002")
        ALenum("AL_RENDERER" to "0xB003")
        ALenum("AL_EXTENSIONS" to "0xB004")

        ALenum("AL_DOPPLER_FACTOR" to "0xC000")
        ALenum("AL_DOPPLER_VELOCITY" to "0xC001")
        ALenum("AL_SPEED_OF_SOUND" to "0xC003")

        ALenum("AL_DISTANCE_MODEL" to "0xD000")

        ALenum("Distance model values.") {
            "AL_INVERSE_DISTANCE"("0xD001")
            "AL_INVERSE_DISTANCE_CLAMPED"("0xD002")
            "AL_LINEAR_DISTANCE"("0xD003")
            "AL_LINEAR_DISTANCE_CLAMPED"("0xD004")
            "AL_EXPONENT_DISTANCE"("0xD005")
            "AL_EXPONENT_DISTANCE_CLAMPED"("0xD006")
        }
        //endregion

        //region functions
        "alEnable"(void, ALenum("capability"), entrypoint = "alEnable")
        "alDisable"(void, ALenum("capability"), entrypoint = "alDisable")
        "alIsEnabled"(ALboolean, ALenum("capability"), entrypoint = "alIsEnabled")

        "alDopplerFactor"(void, ALfloat("value"), entrypoint = "alDopplerFactor")
        "alDopplerVelocity"(void, ALfloat("value"), entrypoint = "alDopplerVelocity")
        "alSpeedOfSound"(void, ALfloat("value"), entrypoint = "alSpeedOfSound")
        "alDistanceModel"(void, ALenum("distanceModel"), entrypoint = "alDistanceModel")

        +"alGetString_"(const_ALchar_ptr, ALenum("param"), entrypoint = "alGetString").overload(name = "alGetString")
        "alGetBooleanv"(void, ALenum("param"), ALboolean_ptr("values").ref(), entrypoint = "alGetBooleanv")
        +"alGetIntegerv"(void, ALenum("param"), ALint_ptr("values").ref(), entrypoint = "alGetIntegerv").overload()
        +"alGetFloatv"(void, ALenum("param"), ALfloat_ptr("values").ref(), entrypoint = "alGetFloatv").overload()
        +"alGetDoublev"(void, ALenum("param"), ALdouble_ptr("values").ref(), entrypoint = "alGetDoublev").overload()
        "alGetBoolean"(ALboolean, ALenum("param"), entrypoint = "alGetBoolean")
        "alGetInteger"(ALint, ALenum("param"), entrypoint = "alGetInteger")
        "alGetFloat"(ALfloat, ALenum("param"), entrypoint = "alGetFloat")
        "alGetDouble"(ALdouble, ALenum("param"), entrypoint = "alGetDouble")

        "alGetError"(
            ALenum,
            entrypoint = "alGetError"
        )

        +"alIsExtensionPresent"(
            ALboolean,
            const_ALchar_ptr("extname"),
            entrypoint = "alIsExtensionPresent"
        ).overload()

        +"alGetProcAddress"(
            void_ptr,
            const_ALchar_ptr("fname"),
            entrypoint = "alGetProcAddress"
        ).overload()

        +"alGetEnumValue"(
            ALenum,
            const_ALchar_ptr("ename"),
            entrypoint = "alGetEnumValue"
        ).overload()

        "alListenerf"(void, ALenum("param"), ALfloat("value"), entrypoint = "alListenerf")
        "alListener3f"(
            void,
            ALenum("param"),
            ALfloat("value1"),
            ALfloat("value2"),
            ALfloat("value3"),
            entrypoint = "alListener3f"
        )
        "alListenerfv"(void, ALenum("param"), const_ALfloat_ptr("values"), entrypoint = "alListenerfv")
        "alListeneri"(void, ALenum("param"), ALint("value"), entrypoint = "alListeneri")
        "alListener3i"(
            void,
            ALenum("param"),
            ALint("value1"),
            ALint("value2"),
            ALint("value3"),
            entrypoint = "alListener3i"
        )
        "alListeneriv"(void, ALenum("param"), const_ALint_ptr("values"), entrypoint = "alListeneriv")

        +"alGetListenerf"(void, ALenum("param"), ALfloat_ptr("value").ref(), entrypoint = "alGetListenerf").overload()
        +"alGetListener3f"(
            void,
            ALenum("param"),
            ALfloat_ptr("value1").ref(),
            ALfloat_ptr("value2").ref(),
            ALfloat_ptr("value3").ref(),
            entrypoint = "alGetListener3f"
        ).overload()
        +"alGetListenerfv"(
            void,
            ALenum("param"),
            ALfloat_ptr("values").ref(),
            entrypoint = "alGetListenerfv"
        ).overload()
        +"alGetListeneri"(void, ALenum("param"), ALint_ptr("value").ref(), entrypoint = "alGetListeneri").overload()
        +"alGetListener3i"(
            void,
            ALenum("param"),
            ALint_ptr("value1").ref(),
            ALint_ptr("value2").ref(),
            ALint_ptr("value3").ref(),
            entrypoint = "alGetListener3i"
        ).overload()
        +"alGetListeneriv"(void, ALenum("param"), ALint_ptr("values").ref(), entrypoint = "alGetListeneriv").overload()

        "alGenSources"(
            void,
            ALsizei("n"),
            ALuint_ptr("sources").ref(),
            entrypoint = "alGenSources"
        )
        "alDeleteSources"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alDeleteSources"
        )
        "alIsSource"(
            ALboolean,
            ALuint("source"),
            entrypoint = "alIsSource"
        )

        "alSourcef"(void, ALuint("source"), ALenum("param"), ALfloat("value"), entrypoint = "alSourcef")
        "alSource3f"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALfloat("value1"),
            ALfloat("value2"),
            ALfloat("value3"),
            entrypoint = "alSource3f"
        )
        "alSourcefv"(void, ALuint("source"), ALenum("param"), const_ALfloat_ptr("values"), entrypoint = "alSourcefv")
        "alSourcei"(void, ALuint("source"), ALenum("param"), ALint("value"), entrypoint = "alSourcei")
        "alSource3i"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint("value1"),
            ALint("value2"),
            ALint("value3"),
            entrypoint = "alSource3i"
        )
        "alSourceiv"(void, ALuint("source"), ALenum("param"), const_ALint_ptr("values"), entrypoint = "alSourceiv")

        +"alGetSourcef"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALfloat_ptr("value").ref(),
            entrypoint = "alGetSourcef"
        ).overload()
        +"alGetSource3f"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALfloat_ptr("value1").ref(),
            ALfloat_ptr("value2").ref(),
            ALfloat_ptr("value3").ref(),
            entrypoint = "alGetSource3f"
        ).overload()
        +"alGetSourcefv"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALfloat_ptr("values").ref(),
            entrypoint = "alGetSourcefv"
        ).overload()
        +"alGetSourcei"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint_ptr("value").ref(),
            entrypoint = "alGetSourcei"
        ).overload()
        +"alGetSource3i"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint_ptr("value1").ref(),
            ALint_ptr("value2").ref(),
            ALint_ptr("value3").ref(),
            entrypoint = "alGetSource3i"
        ).overload()
        +"alGetSourceiv"(
            void,
            ALuint("source"),
            ALenum("param"),
            ALint_ptr("values").ref(),
            entrypoint = "alGetSourceiv"
        ).overload()

        "alSourcePlay"(
            void,
            ALuint("source"),
            entrypoint = "alSourcePlay"
        )
        "alSourceStop"(
            void,
            ALuint("source"),
            entrypoint = "alSourceStop"
        )
        "alSourceRewind"(
            void,
            ALuint("source"),
            entrypoint = "alSourceRewind"
        )
        "alSourcePause"(
            void,
            ALuint("source"),
            entrypoint = "alSourcePause"
        )

        "alSourcePlayv"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourcePlayv"
        )
        "alSourceStopv"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourceStopv"
        )
        "alSourceRewindv"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourceRewindv"
        )
        "alSourcePausev"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourcePausev"
        )

        "alSourceQueueBuffers"(
            void,
            ALuint("source"),
            ALsizei("nb"),
            const_ALuint_ptr("buffers"),
            entrypoint = "alSourceQueueBuffers"
        )
        "alSourceUnqueueBuffers"(
            void,
            ALuint("source"),
            ALsizei("nb"),
            ALuint_ptr("buffers").ref(),
            entrypoint = "alSourceUnqueueBuffers"
        )

        "alGenBuffers"(
            void,
            ALsizei("n"),
            ALuint_ptr("buffers").ref(),
            entrypoint = "alGenBuffers"
        )
        "alDeleteBuffers"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("buffers"),
            entrypoint = "alDeleteBuffers"
        )
        "alIsBuffer"(
            ALboolean,
            ALuint("source"),
            entrypoint = "alIsBuffer"
        )

        "alBufferData"(
            void,
            ALuint("buffer"),
            ALenum("format"),
            const_ALvoid_ptr("data"),
            ALsizei("size"),
            ALsizei("samplerate"),
            entrypoint = "alBufferData"
        )

        "alBufferf"(void, ALuint("buffer"), ALenum("param"), ALfloat("value"), entrypoint = "alBufferf")
        "alBuffer3f"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALfloat("value1"),
            ALfloat("value2"),
            ALfloat("value3"),
            entrypoint = "alBuffer3f"
        )
        "alBufferfv"(void, ALuint("buffer"), ALenum("param"), const_ALfloat_ptr("values"), entrypoint = "alBufferfv")
        "alBufferi"(void, ALuint("buffer"), ALenum("param"), ALint("value"), entrypoint = "alBufferi")
        "alBuffer3i"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALint("value1"),
            ALint("value2"),
            ALint("value3"),
            entrypoint = "alBuffer3i"
        )
        "alBufferiv"(void, ALuint("buffer"), ALenum("param"), const_ALint_ptr("values"), entrypoint = "alBufferiv")

        +"alGetBufferf"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALfloat_ptr("value").ref(),
            entrypoint = "alGetBufferf"
        ).overload()
        +"alGetBuffer3f"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALfloat_ptr("value1").ref(),
            ALfloat_ptr("value2").ref(),
            ALfloat_ptr("value3").ref(),
            entrypoint = "alGetBuffer3f"
        ).overload()
        +"alGetBufferfv"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALfloat_ptr("values").ref(),
            entrypoint = "alGetBufferfv"
        ).overload()
        +"alGetBufferi"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALint_ptr("value").ref(),
            entrypoint = "alGetBufferi"
        ).overload()
        +"alGetBuffer3i"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALint_ptr("value1").ref(),
            ALint_ptr("value2").ref(),
            ALint_ptr("value3").ref(),
            entrypoint = "alGetBuffer3i"
        ).overload()
        +"alGetBufferiv"(
            void,
            ALuint("buffer"),
            ALenum("param"),
            ALint_ptr("values").ref(),
            entrypoint = "alGetBufferiv"
        ).overload()
        //endregion
    }
}
