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

package overrungl.demo.tinyfd;

import overrungl.util.MemoryUtil;

import static overrungl.tinyfd.TinyFD.*;

/// @since 0.2.0
public class TinyFDDemo {
    static void main() {
        tinyfd_notifyPopup("tinyfd_notifyPopup", """
            Message 1
            Message 2""", "info");
        int tinyfd_query = tinyfd_notifyPopup("tinyfd_query", null, "info");
        switch (tinyfd_query) {
            case 0 -> IO.println("console mode");
            case 1 -> IO.println("graphic mode");
        }
        IO.println("tinyfd_response: " + MemoryUtil.nativeString(tinyfd_response()));
        separate();

        int button = tinyfd_messageBox("tinyfd_messageBox", """
            Message 1
            Message 2""", "okcancel", "info", 0);
        switch (button) {
            case 0 -> IO.println("tinyfd_messageBox: cancel");
            case 1 -> IO.println("tinyfd_messageBox: ok");
        }
        button = tinyfd_messageBox("Warning", """
            Are you sure want to delete the files?""", "yesno", "warning", 0);
        switch (button) {
            case 0 -> IO.println("tinyfd_messageBox: no");
            case 1 -> IO.println("tinyfd_messageBox: yes");
        }
        separate();

        IO.println("tinyfd_inputBox: " + tinyfd_inputBox("tinyfd_inputBox", "Message", "Default input"));
        IO.println("Password: " + tinyfd_inputBox("Authenticator", "Please enter the password", null));
        separate();

        IO.println("Saved: " + tinyfd_saveFileDialog("tinyfd_saveFileDialog", null, new String[]{"*.txt"}, null));
        separate();

        String open = tinyfd_openFileDialog("tinyfd_openFileDialog", null, null, null, true);
        if (open != null) {
            for (String s : open.split("\\|")) {
                IO.println("Opened: " + s);
            }
        }
        separate();

        IO.println("Selected: " + tinyfd_selectFolderDialog("tinyfd_selectFolderDialog", null));
        separate();

        byte[] resultRGB = new byte[3];
        String tinyfd_colorChooser = tinyfd_colorChooser("tinyfd_colorChooser", null, new byte[]{0, (byte) 128, (byte) 255}, resultRGB);
        IO.println("tinyfd_colorChooser: " + tinyfd_colorChooser);
        IO.print("resultRGB: [");
        for (int i = 0; i < resultRGB.length; i++) {
            if (i > 0) {
                IO.print(", ");
            }
            byte b = resultRGB[i];
            IO.print(Byte.toUnsignedInt(b));
        }
        IO.println("]");
    }

    static void separate() {
        IO.println("----------");
    }
}
