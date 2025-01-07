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

import overrungl.gen.*

val ALboolean = jboolean c "ALboolean"
val ALchar = char c "ALchar"
val ALbyte = char c "ALbyte"
val ALubyte = uchar c "ALubyte"
val ALshort = short c "ALshort"
val ALushort = ushort c "ALushort"
val ALint = int c "ALint"
val ALuint = uint c "ALuint"
val ALsizei = int c "ALsizei"
val ALenum = int c "ALenum"
val ALfloat = float c "ALfloat"
val ALdouble = double c "ALdouble"

val ALvoid_ptr = address c "ALvoid *"
val ALvoid_ptr_ptr = address c "ALvoid **"
val ALboolean_ptr = address c "ALboolean *"
val ALchar_ptr = string_u8 c "ALchar*"
val ALint_ptr = jint_array c "ALint *"
val ALuint_ptr = jint_array c "ALuint *"
val ALsizei_ptr = jint_array c "ALsizei *"
val ALenum_ptr = jint_array c "ALenum *"
val ALfloat_ptr = jfloat_array c "ALfloat *"
val ALdouble_ptr = jdouble_array c "ALdouble *"

val const_ALuint = uint c "const ALuint"

val const_ALvoid_ptr = address c "const ALvoid *"
val const_ALchar_ptr = string_u8 c "const ALchar*"
val const_ALint_ptr = address c "const ALint *"
val const_ALuint_ptr = address c "const ALuint *"
val const_ALenum_ptr = address c "const ALenum *"
val const_ALfloat_ptr = address c "const ALfloat *"
val const_ALdouble_ptr = address c "const ALdouble *"


val ALCdevice_ptr = address c "ALCdevice *"
val ALCcontext_ptr = address c "ALCcontext *"

val ALCboolean = jboolean c "ALCboolean"
val ALCchar = char c "ALCchar"
val ALCbyte = char c "ALCbyte"
val ALCubyte = uchar c "ALCubyte"
val ALCshort = short c "ALCshort"
val ALCushort = ushort c "ALCushort"
val ALCint = int c "ALCint"
val ALCuint = uint c "ALCuint"
val ALCsizei = int c "ALCsizei"
val ALCenum = int c "ALCenum"
val ALCfloat = float c "ALCfloat"
val ALCdouble = double c "ALCdouble"

val ALCvoid_ptr = address c "ALCvoid *"
val ALCint_ptr = jint_array c "ALCint *"

val const_ALCvoid_ptr = address c "const ALCvoid *"
val const_ALCchar_ptr = string_u8 c "const ALCchar*"
val const_ALCint_ptr = address c "const ALCint *"
val const_ALCenum_ptr = address c "const ALCenum *"

val ALint64SOFT = jlong c "ALint64SOFT"
val ALuint64SOFT = jlong c "ALuint64SOFT"
val ALint64SOFT_ptr = address c "ALint64SOFT *"
val ALuint64SOFT_ptr = address c "ALuint64SOFT *"
val const_ALint64SOFT_ptr = address c "const ALint64SOFT *"
val const_ALuint64SOFT_ptr = address c "const ALuint64SOFT *"

val ALCint64SOFT = jlong c "ALCint64SOFT"
val ALCuint64SOFT = jlong c "ALCuint64SOFT"
val ALCint64SOFT_ptr = address c "ALCint64SOFT *"
val ALCuint64SOFT_ptr = address c "ALCuint64SOFT *"
val const_ALCint64SOFT_ptr = address c "const ALCint64SOFT *"
val const_ALCuint64SOFT_ptr = address c "const ALCuint64SOFT *"


const val alPackage = "overrungl.openal"
const val alLookup = "ALInternal.lookup()"

fun main() {
    AL()
    ALC()
    alext()
    efx()
}
