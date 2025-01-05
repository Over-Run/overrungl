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

fun ALC() {
    StaticDowncall(alPackage, "ALC", alLookup) {
        //region fields
        ALCenum("ALC_FALSE" to "0", "Boolean False.")
        ALCenum("ALC_TRUE" to "1", "Boolean True.")

        ALCenum("ALC_FREQUENCY" to "0x1007", "Context attribute: &lt;int&gt; Hz.")
        ALCenum("ALC_REFRESH" to "0x1008", "Context attribute: &lt;int&gt; Hz.")
        ALCenum("ALC_SYNC" to "0x1009", "Context attribute: AL_TRUE or AL_FALSE synchronous context?")
        ALCenum("ALC_MONO_SOURCES" to "0x1010", "Context attribute: &lt;int&gt; requested Mono (3D) Sources.")
        ALCenum("ALC_STEREO_SOURCES" to "0x1011", "Context attribute: &lt;int&gt; requested Stereo Sources.")

        ALCenum("ALC_NO_ERROR" to "0", "No error.")
        ALCenum("ALC_INVALID_DEVICE" to "0xA001", "Invalid device handle.")
        ALCenum("ALC_INVALID_CONTEXT" to "0xA002", "Invalid context handle.")
        ALCenum("ALC_INVALID_ENUM" to "0xA003", "Invalid enumeration passed to an ALC call.")
        ALCenum("ALC_INVALID_VALUE" to "0xA004", "Invalid value passed to an ALC call.")
        ALCenum("ALC_OUT_OF_MEMORY" to "0xA005", "Out of memory.")

        ALCenum("ALC_MAJOR_VERSION" to "0x1000", "Runtime ALC major version.")
        ALCenum("ALC_MINOR_VERSION" to "0x1001", "Runtime ALC minor version.")

        ALCenum("ALC_ATTRIBUTES_SIZE" to "0x1002", "Context attribute list size.")
        ALCenum("ALC_ALL_ATTRIBUTES" to "0x1003", "Context attribute list properties.")
        ALCenum("ALC_DEFAULT_DEVICE_SPECIFIER" to "0x1004", "String for the default device specifier.")
        ALCenum(
            "ALC_DEVICE_SPECIFIER" to "0x1005",
            """
                Device specifier string.

                If device handle is NULL, it is instead a null-character separated list of
                strings of known device specifiers (list ends with an empty string).
            """.trimIndent()
        )
        ALCenum("ALC_EXTENSIONS" to "0x1006", "String for space-separated list of ALC extensions.")

        ALCenum("ALC_EXT_CAPTURE" to "1", "Capture extension")
        ALCenum(
            "ALC_CAPTURE_DEVICE_SPECIFIER" to "0x310",
            """
                Capture device specifier string.

                If device handle is NULL, it is instead a null-character separated list of
                strings of known capture device specifiers (list ends with an empty string).
            """.trimIndent()
        )
        ALCenum("ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER" to "0x311", "String for the default capture device specifier.")
        ALCenum("ALC_CAPTURE_SAMPLES" to "0x312", "Number of sample frames available for capture.")

        ALCenum("ALC_ENUMERATE_ALL_EXT" to "1", "Enumerate All extension")
        ALCenum("ALC_DEFAULT_ALL_DEVICES_SPECIFIER" to "0x1012", "String for the default extended device specifier.")
        ALCenum(
            "ALC_ALL_DEVICES_SPECIFIER" to "0x1013",
            """
                Device's extended specifier string.

                If device handle is NULL, it is instead a null-character separated list of
                strings of known extended device specifiers (list ends with an empty string).
            """.trimIndent()
        )
        //endregion

        //region functions
        "alcCreateContext"(
            ALCcontext_ptr,
            ALCdevice_ptr("device"),
            const_ALCint_ptr("attrlist"),
            entrypoint = "alcCreateContext",
            javadoc = "Create and attach a context to the given device."
        )
        "alcMakeContextCurrent"(
            ALCboolean,
            ALCcontext_ptr("context"),
            entrypoint = "alcMakeContextCurrent",
            javadoc = """
                Makes the given context the active process-wide context. Passing NULL clears
                the active context.
            """.trimIndent()
        )
        "alcProcessContext"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alcProcessContext",
            javadoc = "Resumes processing updates for the given context."
        )
        "alcSuspendContext"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alcSuspendContext",
            javadoc = "Suspends updates for the given context."
        )
        "alcDestroyContext"(
            void,
            ALCcontext_ptr("context"),
            entrypoint = "alcDestroyContext",
            javadoc = "Remove a context from its device and destroys it."
        )
        "alcGetCurrentContext"(
            ALCcontext_ptr,
            entrypoint = "alcGetCurrentContext",
            javadoc = "Returns the currently active context."
        )
        "alcGetContextsDevice"(
            ALCdevice_ptr,
            ALCcontext_ptr("context"),
            entrypoint = "alcGetContextsDevice",
            javadoc = "Returns the device that a particular context is attached to."
        )

        +"alcOpenDevice"(
            ALCdevice_ptr,
            const_ALCchar_ptr("devicename"),
            entrypoint = "alcOpenDevice",
            javadoc = "Opens the named playback device."
        ).overload()
        "alcCloseDevice"(
            ALCboolean,
            ALCdevice_ptr("device"),
            entrypoint = "alcCloseDevice",
            javadoc = "Closes the given playback device."
        )

        "alcGetError"(
            ALCenum,
            ALCdevice_ptr("device"),
            entrypoint = "alcGetError",
            javadoc = "Obtain the most recent Device error."
        )

        +"alcIsExtensionPresent"(
            ALCboolean,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("extname"),
            entrypoint = "alcIsExtensionPresent",
            javadoc = """
                Query for the presence of an extension on the device. Pass a NULL device to
                query a device-inspecific extension.
            """.trimIndent()
        ).overload()
        +"alcGetProcAddress"(
            ALCvoid_ptr,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("funcname"),
            entrypoint = "alcGetProcAddress",
            javadoc = """
                Retrieve the address of a function. Given a non-NULL device, the returned
                function may be device-specific.
            """.trimIndent()
        ).overload()
        +"alcGetEnumValue"(
            ALCenum,
            ALCdevice_ptr("device"),
            const_ALCchar_ptr("enumname"),
            entrypoint = "alcGetEnumValue",
            javadoc = """
                Retrieve the value of an enum. Given a non-NULL device, the returned value
                may be device-specific.
            """.trimIndent()
        ).overload()

        +"alcGetString_"(
            const_ALCchar_ptr,
            ALCdevice_ptr("device"),
            ALCenum("param"),
            entrypoint = "alcGetString",
            javadoc = """
                Returns information about the device, and error strings.
            """.trimIndent()
        ).overload(name = "alcGetString")
        "alcGetIntegerv"(
            void,
            ALCdevice_ptr("device"),
            ALCenum("param"),
            ALCsizei("size"),
            ALCint_ptr("values"),
            entrypoint = "alcGetIntegerv",
            javadoc = """
                Returns information about the device and the version of OpenAL.
            """.trimIndent()
        )

        +"alcCaptureOpenDevice"(
            ALCdevice_ptr,
            const_ALCchar_ptr("devicename"),
            ALCuint("frequency"),
            ALCenum("format"),
            ALCsizei("buffersize"),
            entrypoint = "alcCaptureOpenDevice",
            javadoc = """
                Opens the named capture device with the given frequency, format, and buffer
                size.
            """.trimIndent()
        ).overload()
        "alcCaptureCloseDevice"(
            ALCboolean,
            ALCdevice_ptr("device"),
            entrypoint = "alcCaptureCloseDevice",
            javadoc = "Closes the given capture device."
        )
        "alcCaptureStart"(
            void,
            ALCdevice_ptr("device"),
            entrypoint = "alcCaptureStart",
            javadoc = "Starts capturing samples into the device buffer."
        )
        "alcCaptureStop"(
            void,
            ALCdevice_ptr("device"),
            entrypoint = "alcCaptureStop",
            javadoc = "Stops capturing samples. Samples in the device buffer remain available."
        )
        "alcCaptureSamples"(
            void,
            ALCdevice_ptr("device"),
            ALCvoid_ptr("buffer"),
            ALCsizei("samples"),
            entrypoint = "alcCaptureSamples",
            javadoc = "Reads samples from the device buffer."
        )
        //endregion
    }
}
