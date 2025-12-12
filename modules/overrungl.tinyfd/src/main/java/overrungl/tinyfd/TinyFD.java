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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.tinyfd;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemorySegment;

/// [tinyfiledialogs.h](https://sourceforge.net/p/tinyfiledialogs/code/ci/master/tree/tinyfiledialogs.h)
///
/// @since 0.2.0
public final class TinyFD {
    public static final String
        tinyfd_version = "tinyfd_version",
        tinyfd_needs = "tinyfd_needs",
        tinyfd_response = "tinyfd_response",
        tinyfd_verbose = "tinyfd_verbose",
        tinyfd_silent = "tinyfd_silent",
        tinyfd_allowCursesDialogs = "tinyfd_allowCursesDialogs",
        tinyfd_forceConsole = "tinyfd_forceConsole",
        tinyfd_winUtf8 = "tinyfd_winUtf8";

    //@formatter:off

    /// Invokes `tinyfd_getGlobalChar`.
    /// ```
    /// char const * tinyfd_getGlobalChar(char const * aCharVariableName);
    /// ```
    public static @NonNull MemorySegment tinyfd_getGlobalChar(@NonNull MemorySegment aCharVariableName) {
        return MemorySegment.ofAddress(TinyFileDialogs.ntinyfd_getGlobalChar(aCharVariableName.address()));
    }

    /// Invokes `tinyfd_getGlobalInt`.
    /// ```
    /// int tinyfd_getGlobalInt(char const * aIntVariableName);
    /// ```
    public static int tinyfd_getGlobalInt(@NonNull MemorySegment aIntVariableName) {
        return TinyFileDialogs.ntinyfd_getGlobalInt(aIntVariableName.address());
    }

    /// Invokes `tinyfd_setGlobalInt`.
    /// ```
    /// int tinyfd_setGlobalInt(char const * aIntVariableName, int aValue);
    /// ```
    public static int tinyfd_setGlobalInt(@NonNull MemorySegment aIntVariableName, int aValue) {
        return TinyFileDialogs.ntinyfd_setGlobalInt(aIntVariableName.address(), aValue);
    }

    /// Invokes `tinyfd_beep`.
    /// ```
    /// void tinyfd_beep();
    /// ```
    public static void tinyfd_beep() {
        TinyFileDialogs.tinyfd_beep();
    }

    /// Invokes `tinyfd_notifyPopup`.
    /// ```
    /// int tinyfd_notifyPopup(char const * aTitle, char const * aMessage, char const * aIconType);
    /// ```
    public static int tinyfd_notifyPopup(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aIconType) {
        return TinyFileDialogs.ntinyfd_notifyPopup(aTitle.address(), aMessage.address(), aIconType.address());
    }

    /// Invokes `tinyfd_messageBox`.
    /// ```
    /// int tinyfd_messageBox(char const * aTitle, char const * aMessage, char const * aDialogType, char const * aIconType, int aDefaultButton);
    /// ```
    public static int tinyfd_messageBox(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aDialogType, @NonNull MemorySegment aIconType, int aDefaultButton) {
        return TinyFileDialogs.ntinyfd_messageBox(aTitle.address(), aMessage.address(), aDialogType.address(), aIconType.address(), aDefaultButton);
    }

    /// Invokes `tinyfd_inputBox`.
    /// ```
    /// char* tinyfd_inputBox(char const * aTitle, char const * aMessage, char const * aDefaultInput);
    /// ```
    public static @NonNull MemorySegment tinyfd_inputBox(@NonNull MemorySegment aTitle, @NonNull MemorySegment aMessage, @NonNull MemorySegment aDefaultInput) {
        return MemorySegment.ofAddress(TinyFileDialogs.ntinyfd_inputBox(aTitle.address(), aMessage.address(), aDefaultInput.address()));
    }

    /// Invokes `tinyfd_saveFileDialog`.
    /// ```
    /// char* tinyfd_saveFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription);
    /// ```
    public static @NonNull MemorySegment tinyfd_saveFileDialog(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPathAndOrFile, int aNumOfFilterPatterns, @NonNull MemorySegment aFilterPatterns, @NonNull MemorySegment aSingleFilterDescription) {
        return MemorySegment.ofAddress(TinyFileDialogs.ntinyfd_saveFileDialog(aTitle.address(), aDefaultPathAndOrFile.address(), aNumOfFilterPatterns, aFilterPatterns.address(), aSingleFilterDescription.address()));
    }

    /// Invokes `tinyfd_openFileDialog`.
    /// ```
    /// char* tinyfd_openFileDialog(char const * aTitle, char const * aDefaultPathAndOrFile, int aNumOfFilterPatterns, char const * const * aFilterPatterns, char const * aSingleFilterDescription, int aAllowMultipleSelects);
    /// ```
    public static @NonNull MemorySegment tinyfd_openFileDialog(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPathAndOrFile, int aNumOfFilterPatterns, @NonNull MemorySegment aFilterPatterns, @NonNull MemorySegment aSingleFilterDescription, int aAllowMultipleSelects) {
        return MemorySegment.ofAddress(TinyFileDialogs.ntinyfd_openFileDialog(aTitle.address(), aDefaultPathAndOrFile.address(), aNumOfFilterPatterns, aFilterPatterns.address(), aSingleFilterDescription.address(), aAllowMultipleSelects));
    }

    /// Invokes `tinyfd_selectFolderDialog`.
    /// ```
    /// char* tinyfd_selectFolderDialog(char const * aTitle, char const * aDefaultPath);
    /// ```
    public static @NonNull MemorySegment tinyfd_selectFolderDialog(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultPath) {
        return MemorySegment.ofAddress(TinyFileDialogs.ntinyfd_selectFolderDialog(aTitle.address(), aDefaultPath.address()));
    }

    /// Invokes `tinyfd_colorChooser`.
    /// ```
    /// char* tinyfd_colorChooser(char const * aTitle, char const * aDefaultHexRGB, unsigned char aDefaultRGB[3], unsigned char aoResultRGB[3]);
    /// ```
    public static @NonNull MemorySegment tinyfd_colorChooser(@NonNull MemorySegment aTitle, @NonNull MemorySegment aDefaultHexRGB, @NonNull MemorySegment aDefaultRGB, @NonNull MemorySegment aoResultRGB) {
        return MemorySegment.ofAddress(TinyFileDialogs.ntinyfd_colorChooser(aTitle.address(), aDefaultHexRGB.address(), aDefaultRGB.address(), aoResultRGB.address()));
    }

    //@formatter:on

    private TinyFD() {
    }

    // Add overloads for convenience

    /// @param iconType "info" "warning" "error"
    public static int tinyfd_notifyPopup(
        @Nullable String title,
        @Nullable String message,
        @NonNull String iconType
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return tinyfd_notifyPopup(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, message),
                MemoryUtil.allocString(stack, iconType)
            );
        }
    }

    /// @param dialogType    "ok" "okcancel" "yesno" "yesnocancel"
    /// @param iconType      "info" "warning" "error" "question"
    /// @param defaultButton 0 for cancel/no , 1 for ok/yes , 2 for no in yesnocancel
    public static int tinyfd_messageBox(
        @Nullable String title,
        @Nullable String message,
        @NonNull String dialogType,
        @NonNull String iconType,
        int defaultButton
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return tinyfd_messageBox(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, message),
                MemoryUtil.allocString(stack, dialogType),
                MemoryUtil.allocString(stack, iconType),
                defaultButton
            );
        }
    }

    /// @param message      NULL or "" (\n and \t have no effect)
    /// @param defaultInput NULL = passwordBox, "" = inputbox
    /// @return NULL on cancel
    public static @Nullable String tinyfd_inputBox(
        @Nullable String title,
        @Nullable String message,
        @Nullable String defaultInput
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_inputBox(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, message),
                MemoryUtil.allocString(stack, defaultInput)
            ));
        }
    }

    /// @param defaultPathAndOrFile NULL or "" , ends with / to set only a directory
    /// @param filterPatterns       NULL or `String[] lFilterPatterns={"*.txt"}`
    /// @return NULL on cancel
    public static @Nullable String tinyfd_saveFileDialog(
        @Nullable String title,
        @Nullable String defaultPathAndOrFile,
        @NonNull String @Nullable [] filterPatterns,
        @Nullable String singleFilterDescription
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_saveFileDialog(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultPathAndOrFile),
                filterPatterns != null ? filterPatterns.length : 0,
                MemoryUtil.allocArray(stack, filterPatterns),
                MemoryUtil.allocString(stack, singleFilterDescription)
            ));
        }
    }

    /// in case of multiple files, the separator is |
    ///
    /// @param defaultPathAndOrFile NULL or "" , ends with / to set only a directory
    /// @param filterPatterns       NULL or `String[] lFilterPatterns={"*.png","*.jpg"}`
    /// @return NULL on cancel
    public static @Nullable String tinyfd_openFileDialog(
        @Nullable String title,
        @Nullable String defaultPathAndOrFile,
        @NonNull String @Nullable [] filterPatterns,
        @Nullable String singleFilterDescription,
        boolean allowMultipleSelects
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_openFileDialog(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultPathAndOrFile),
                filterPatterns != null ? filterPatterns.length : 0,
                MemoryUtil.allocArray(stack, filterPatterns),
                MemoryUtil.allocString(stack, singleFilterDescription),
                allowMultipleSelects ? 1 : 0
            ));
        }
    }

    /// @return NULL on cancel
    public static @Nullable String tinyfd_selectFolderDialog(
        @Nullable String title,
        @Nullable String defaultPath
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return MemoryUtil.nativeString(tinyfd_selectFolderDialog(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultPath)
            ));
        }
    }

    /// aDefaultRGB is used only if aDefaultHexRGB is absent<br>
    /// aDefaultRGB and aoResultRGB can be the same array<br>
    /// aoResultRGB also contains the result
    ///
    /// @param defaultHexRGB NULL or "" or "#FF0000"
    /// @param defaultRGB    `unsigned char lDefaultRGB[3] = { 0 , 128 , 255 };`
    /// @param resultRGB     `unsigned char lResultRGB[3];`
    /// @return NULL on cancel; or the hexcolor as a string "#FF0000"
    public static @Nullable String tinyfd_colorChooser(
        @Nullable String title,
        @Nullable String defaultHexRGB,
        byte @NonNull [] defaultRGB,
        byte @NonNull [] resultRGB
    ) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment aoResultRGB = MemoryUtil.allocArray(stack, resultRGB);
            String s = MemoryUtil.nativeString(tinyfd_colorChooser(
                MemoryUtil.allocString(stack, title),
                MemoryUtil.allocString(stack, defaultHexRGB),
                MemoryUtil.allocArray(stack, defaultRGB),
                aoResultRGB
            ));
            MemoryUtil.copy(aoResultRGB, resultRGB);
            return s;
        }
    }
}
