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
package overrungl.nfd;
import org.graalvm.nativeimage.hosted.Feature;
import static org.graalvm.nativeimage.hosted.RuntimeForeignAccess.*;
class ForeignRegistrationFeature implements Feature {
    @Override public void duringSetup(DuringSetupAccess access) {
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_FreePathN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_Init);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_Quit);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_OpenDialogN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_OpenDialogN_With_Impl);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_OpenDialogMultipleN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_OpenDialogMultipleN_With_Impl);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_SaveDialogN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_SaveDialogN_With_Impl);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PickFolderN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PickFolderN_With_Impl);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PickFolderMultipleN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PickFolderMultipleN_With_Impl);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_GetError);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_ClearError);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_GetCount);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_GetPathN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_FreePathN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_GetEnum);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_FreeEnum);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_EnumNextN);
        registerForDowncall(overrungl.nfd.NFD.Descriptors.FD_NFD_PathSet_Free);
    }
}
