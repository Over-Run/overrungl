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

package overrungl.internal;

import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeForeignAccess;

import static overrungl.util.MemoryUtil.Descriptors.*;

/**
 * @author squid233
 * @since 0.1.0
 */
class ForeignRegistrationFeature implements Feature {
    @Override
    public void duringSetup(DuringSetupAccess access) {
        RuntimeForeignAccess.registerForDowncall(FD_malloc);
        RuntimeForeignAccess.registerForDowncall(FD_calloc);
        RuntimeForeignAccess.registerForDowncall(FD_realloc);
        RuntimeForeignAccess.registerForDowncall(FD_free);
        RuntimeForeignAccess.registerForDowncall(FD_memcpy);
        RuntimeForeignAccess.registerForDowncall(FD_memmove);
        RuntimeForeignAccess.registerForDowncall(FD_memset);
    }
}
