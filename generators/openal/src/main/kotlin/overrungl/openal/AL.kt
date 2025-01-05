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
        ALenum("AL_NONE" to "0", "No distance model or no buffer")
        ALenum("AL_FALSE" to "0", "Boolean False.")
        ALenum("AL_TRUE" to "1", "Boolean True.")

        ALenum(
            "AL_SOURCE_RELATIVE" to "0x202",
            """
                Relative source.
                - Type:    ALboolean
                - Range:   \[AL_FALSE, AL_TRUE\]
                - Default: AL_FALSE

                Specifies if the source uses relative coordinates.
            """.trimIndent()
        )
        ALenum(
            "AL_CONE_INNER_ANGLE" to "0x1001",
            """
                Inner cone angle, in degrees.
                - Type:    ALint, ALfloat
                - Range:   \[0 - 360\]
                - Default: 360

                The angle covered by the inner cone, the area within which the source will
                not be attenuated by direction.
            """.trimIndent()
        )
        ALenum(
            "AL_CONE_OUTER_ANGLE" to "0x1002",
            """
                Outer cone angle, in degrees.
                - Range:   \[0 - 360\]
                - Default: 360

                The angle covered by the outer cone, the area outside of which the source
                will be fully attenuated by direction.
            """.trimIndent()
        )
        ALenum(
            "AL_PITCH" to "0x1003",
            """
                Source pitch.
                - Type:    ALfloat
                - Range:   \[0.5 - 2.0\]
                - Default: 1.0

                A multiplier for the sample rate of the source's buffer.
            """.trimIndent()
        )
        ALenum(
            "AL_POSITION" to "0x1004",
            """
                Source or listener position.
                - Type:    ALfloat\[3\], ALint\[3\]
                - Default: {0, 0, 0}

                The source or listener location in three dimensional space.

                OpenAL uses a right handed coordinate system, like OpenGL, where with a
                default view, X points right (thumb), Y points up (index finger), and Z
                points towards the viewer/camera (middle finger).

                To change from or to a left handed coordinate system, negate the Z
                component.
            """.trimIndent()
        )
        ALenum(
            "AL_DIRECTION" to "0x1005",
            """
                Source direction.
                - Type:    ALfloat\[3\], ALint\[3\]
                - Default: {0, 0, 0}

                Specifies the current direction in local space. A zero-length vector
                specifies an omni-directional source (cone is ignored).

                To change from or to a left handed coordinate system, negate the Z
                component.
            """.trimIndent()
        )
        ALenum(
            "AL_VELOCITY" to "0x1006",
            """
                Source or listener velocity.
                - Type:    ALfloat\[3\], ALint\[3]\
                - Default: {0, 0, 0}

                Specifies the current velocity, relative to the position.

                To change from or to a left handed coordinate system, negate the Z
                component.
            """.trimIndent()
        )
        ALenum(
            "AL_LOOPING" to "0x1007",
            """
                Source looping.
                - Type:    ALboolean
                - Range:   \[AL_FALSE, AL_TRUE\]
                - Default: AL_FALSE

                Specifies whether source playback loops.
            """.trimIndent()
        )
        ALenum(
            "AL_BUFFER" to "0x1009",
            """
                Source buffer.
                - Type:    ALuint
                - Range:   any valid Buffer ID
                - Default: AL_NONE

                Specifies the buffer to provide sound samples for a source.
            """.trimIndent()
        )
        ALenum(
            "AL_GAIN" to "0x100A",
            """
                Source or listener gain.
                - Type:  ALfloat
                - Range: \[0.0 - \]

                For sources, an initial linear gain value (before attenuation is applied).
                For the listener, an output linear gain adjustment.

                A value of 1.0 means unattenuated. Each division by 2 equals an attenuation
                of about -6dB. Each multiplication by 2 equals an amplification of about
                +6dB.
            """.trimIndent()
        )
        ALenum(
            "AL_MIN_GAIN" to "0x100D",
            """
                Minimum source gain.
                - Type:  ALfloat
                - Range: \[0.0 - 1.0\]

                The minimum gain allowed for a source, after distance and cone attenuation
                are applied (if applicable).
            """.trimIndent()
        )
        ALenum(
            "AL_MAX_GAIN" to "0x100E",
            """
                Maximum source gain.
                - Type:  ALfloat
                - Range: \[0.0 - 1.0\]

                The maximum gain allowed for a source, after distance and cone attenuation
                are applied (if applicable).
            """.trimIndent()
        )
        ALenum(
            "AL_ORIENTATION" to "0x100F",
            """
                Listener orientation.
                - Type:    ALfloat\[6\]
                - Default: {0.0, 0.0, -1.0, 0.0, 1.0, 0.0}

                Effectively two three dimensional vectors. The first vector is the front (or
                "at") and the second is the top (or "up"). Both vectors are relative to the
                listener position.

                To change from or to a left handed coordinate system, negate the Z
                component of both vectors.
            """.trimIndent()
        )
        ALenum(
            "AL_SOURCE_STATE" to "0x1010",
            """
                Source state (query only).
                - Type:  ALenum
                - Range: \[AL_INITIAL, AL_PLAYING, AL_PAUSED, AL_STOPPED\]
            """.trimIndent()
        )

        ALenum("Source state values.") {
            "AL_INITIAL"("0x1011")
            "AL_PLAYING"("0x1012")
            "AL_PAUSED"("0x1013")
            "AL_STOPPED"("0x1014")
        }

        ALenum(
            "AL_BUFFERS_QUEUED" to "0x1015",
            """
                Source Buffer Queue size (query only).
                - Type: ALint

                The number of buffers queued using alSourceQueueBuffers, minus the buffers
                removed with alSourceUnqueueBuffers.
            """.trimIndent()
        )
        ALenum(
            "AL_BUFFERS_PROCESSED" to "0x1016",
            """
                Source Buffer Queue processed count (query only).
                - Type: ALint

                The number of queued buffers that have been fully processed, and can be
                removed with alSourceUnqueueBuffers.

                Looping sources will never fully process buffers because they will be set to
                play again for when the source loops.
            """.trimIndent()
        )
        ALenum(
            "AL_REFERENCE_DISTANCE" to "0x1020",
            """
                Source reference distance.
                - Type:    ALfloat
                - Range:   \[0.0 - \]
                - Default: 1.0

                The distance in units that no distance attenuation occurs.

                At 0.0, no distance attenuation occurs with non-linear attenuation models.
            """.trimIndent()
        )
        ALenum(
            "AL_ROLLOFF_FACTOR" to "0x1021",
            """
                Source rolloff factor.
                - Type:    ALfloat
                - Range:   \[0.0 - \]
                - Default: 1.0

                Multiplier to exaggerate or diminish distance attenuation.

                At 0.0, no distance attenuation ever occurs.
            """.trimIndent()
        )
        ALenum(
            "AL_CONE_OUTER_GAIN" to "0x1022",
            """
               Outer cone gain.
               - Type:    ALfloat
               - Range:   \[0.0 - 1.0\]
               - Default: 0.0

               The gain attenuation applied when the listener is outside of the source's
               outer cone angle.
            """.trimIndent()
        )
        ALenum(
            "AL_MAX_DISTANCE" to "0x1023",
            """
                Source maximum distance.
                - Type:    ALfloat
                - Range:   \[0.0 - \]
                - Default: FLT_MAX

                The distance above which the source is not attenuated any further with a
                clamped distance model, or where attenuation reaches 0.0 gain for linear
                distance models with a default rolloff factor.
            """.trimIndent()
        )

        ALenum("AL_SEC_OFFSET" to "0x1024", "Source buffer offset, in seconds")
        ALenum("AL_SAMPLE_OFFSET" to "0x1025", "Source buffer offset, in sample frames")
        ALenum("AL_BYTE_OFFSET" to "0x1026", "Source buffer offset, in bytes")

        ALenum(
            "AL_SOURCE_TYPE" to "0x1027",
            """
                Source type (query only).
                - Type:  ALenum
                - Range: \[AL_STATIC, AL_STREAMING, AL_UNDETERMINED\]

                A Source is Static if a Buffer has been attached using AL_BUFFER.

                A Source is Streaming if one or more Buffers have been attached using
                alSourceQueueBuffers.

                A Source is Undetermined when it has the NULL buffer attached using
                AL_BUFFER.
            """.trimIndent()
        )

        ALenum("Source type values.") {
            "AL_STATIC"("0x1028")
            "AL_STREAMING"("0x1029")
            "AL_UNDETERMINED"("0x1030")
        }

        ALenum("AL_FORMAT_MONO8" to "0x1100", "Unsigned 8-bit mono buffer format.")
        ALenum("AL_FORMAT_MONO16" to "0x1101", "Signed 16-bit mono buffer format.")
        ALenum("AL_FORMAT_STEREO8" to "0x1102", "Unsigned 8-bit stereo buffer format.")
        ALenum("AL_FORMAT_STEREO16" to "0x1103", "Signed 16-bit stereo buffer format.")

        ALenum("AL_FREQUENCY" to "0x2001", "Buffer frequency/sample rate (query only).")
        ALenum("AL_BITS" to "0x2002", "Buffer bits per sample (query only).")
        ALenum("AL_CHANNELS" to "0x2003", "Buffer channel count (query only).")
        ALenum("AL_SIZE" to "0x2004", "Buffer data size in bytes (query only).")

        ALenum("Buffer state. Not for public use.") {
            "AL_UNUSED"("0x2010")
            "AL_PENDING"("0x2011")
            "AL_PROCESSED"("0x2012")
        }

        ALenum("AL_NO_ERROR" to "0", "No error.")
        ALenum("AL_INVALID_NAME" to "0xA001", "Invalid name (ID) passed to an AL call.")
        ALenum("AL_INVALID_ENUM" to "0xA002", "Invalid enumeration passed to AL call.")
        ALenum("AL_INVALID_VALUE" to "0xA003", "Invalid value passed to AL call.")
        ALenum("AL_INVALID_OPERATION" to "0xA004", "Illegal AL call.")
        ALenum("AL_OUT_OF_MEMORY" to "0xA005", "Not enough memory to execute the AL call.")

        ALenum("AL_VENDOR" to "0xB001", "Context string: Vendor name.")
        ALenum("AL_VERSION" to "0xB002", "Context string: Version.")
        ALenum("AL_RENDERER" to "0xB003", "Context string: Renderer name.")
        ALenum("AL_EXTENSIONS" to "0xB004", "Context string: Space-separated extension list.")

        ALenum(
            "AL_DOPPLER_FACTOR" to "0xC000",
            """
                Doppler scale.
                - Type:    ALfloat
                - Range:   \[0.0 - \]
                - Default: 1.0

                Scale for source and listener velocities.
            """.trimIndent()
        )
        ALenum(
            "AL_DOPPLER_VELOCITY" to "0xC001",
            """
                Doppler velocity (deprecated).

                A multiplier applied to the Speed of Sound.
            """.trimIndent()
        )
        ALenum(
            "AL_SPEED_OF_SOUND" to "0xC003",
            """
                Speed of Sound, in units per second.
                - Type:    ALfloat
                - Range:   \[0.0001 - \]
                - Default: 343.3

                The speed at which sound waves are assumed to travel, when calculating the
                doppler effect from source and listener velocities.
            """.trimIndent()
        )

        ALenum(
            "AL_DISTANCE_MODEL" to "0xD000",
            """
                Distance attenuation model.
                - Type:    ALenum
                - Range:   \[AL_NONE, AL_INVERSE_DISTANCE, AL_INVERSE_DISTANCE_CLAMPED,
                          AL_LINEAR_DISTANCE, AL_LINEAR_DISTANCE_CLAMPED,
                          AL_EXPONENT_DISTANCE, AL_EXPONENT_DISTANCE_CLAMPED\]
                - Default: AL_INVERSE_DISTANCE_CLAMPED

                The model by which sources attenuate with distance.

                - None     - No distance attenuation.
                - Inverse  - Doubling the distance halves the source gain.
                - Linear   - Linear gain scaling between the reference and max distances.
                - Exponent - Exponential gain dropoff.

                Clamped variations work like the non-clamped counterparts, except the
                distance calculated is clamped between the reference and max distances.
            """.trimIndent()
        )

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
            entrypoint = "alGetError",
            javadoc = """
                Obtain the first error generated in the AL context since the last call to
                this function.
            """.trimIndent()
        )

        +"alIsExtensionPresent"(
            ALboolean,
            const_ALchar_ptr("extname"),
            entrypoint = "alIsExtensionPresent",
            javadoc = "Query for the presence of an extension on the AL context."
        ).overload()

        +"alGetProcAddress"(
            void_ptr,
            const_ALchar_ptr("fname"),
            entrypoint = "alGetProcAddress",
            javadoc = """
                Retrieve the address of a function. The returned function may be context-
                specific.
            """.trimIndent()
        ).overload()

        +"alGetEnumValue"(
            ALenum,
            const_ALchar_ptr("ename"),
            entrypoint = "alGetEnumValue",
            javadoc = "Retrieve the value of an enum. The returned value may be context-specific."
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
            entrypoint = "alGenSources",
            javadoc = "Create source objects."
        )
        "alDeleteSources"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alDeleteSources",
            javadoc = "Delete source objects."
        )
        "alIsSource"(
            ALboolean,
            ALuint("source"),
            entrypoint = "alIsSource",
            javadoc = "Verify an ID is for a valid source."
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
            entrypoint = "alSourcePlay",
            javadoc = "Play, restart, or resume a source, setting its state to AL_PLAYING."
        )
        "alSourceStop"(
            void,
            ALuint("source"),
            entrypoint = "alSourceStop",
            javadoc = "Stop a source, setting its state to AL_STOPPED if playing or paused."
        )
        "alSourceRewind"(
            void,
            ALuint("source"),
            entrypoint = "alSourceRewind",
            javadoc = "Rewind a source, setting its state to AL_INITIAL."
        )
        "alSourcePause"(
            void,
            ALuint("source"),
            entrypoint = "alSourcePause",
            javadoc = "Pause a source, setting its state to AL_PAUSED if playing."
        )

        "alSourcePlayv"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourcePlayv",
            javadoc = "Play, restart, or resume a list of sources atomically."
        )
        "alSourceStopv"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourceStopv",
            javadoc = "Stop a list of sources atomically."
        )
        "alSourceRewindv"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourceRewindv",
            javadoc = "Rewind a list of sources atomically."
        )
        "alSourcePausev"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("sources"),
            entrypoint = "alSourcePausev",
            javadoc = "Pause a list of sources atomically."
        )

        "alSourceQueueBuffers"(
            void,
            ALuint("source"),
            ALsizei("nb"),
            const_ALuint_ptr("buffers"),
            entrypoint = "alSourceQueueBuffers",
            javadoc = "Queue buffers onto a source"
        )
        "alSourceUnqueueBuffers"(
            void,
            ALuint("source"),
            ALsizei("nb"),
            ALuint_ptr("buffers").ref(),
            entrypoint = "alSourceUnqueueBuffers",
            javadoc = "Unqueue processed buffers from a source"
        )

        "alGenBuffers"(
            void,
            ALsizei("n"),
            ALuint_ptr("buffers").ref(),
            entrypoint = "alGenBuffers",
            javadoc = "Create buffer objects"
        )
        "alDeleteBuffers"(
            void,
            ALsizei("n"),
            const_ALuint_ptr("buffers"),
            entrypoint = "alDeleteBuffers",
            javadoc = "Delete buffer objects"
        )
        "alIsBuffer"(
            ALboolean,
            ALuint("source"),
            entrypoint = "alIsBuffer",
            javadoc = "Verify an ID is a valid buffer (including the NULL buffer)"
        )

        "alBufferData"(
            void,
            ALuint("buffer"),
            ALenum("format"),
            const_ALvoid_ptr("data"),
            ALsizei("size"),
            ALsizei("samplerate"),
            entrypoint = "alBufferData",
            javadoc = """
                Copies data into the buffer, interpreting it using the specified format and
                samplerate.
            """.trimIndent()
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
