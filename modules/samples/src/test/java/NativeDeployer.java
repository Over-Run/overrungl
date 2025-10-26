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

import io.github.overrun.platform.Architecture;
import io.github.overrun.platform.Platform;

/// Detects the current platform and architecture and copies files to working directory.
///
/// @since 0.2.0
void main(String[] args) {
    Platform platform = Platform.current();
    if (platform instanceof Platform.Unknown) {
        throw new IllegalStateException("platform is unknown");
    }
    Architecture arch = Architecture.current();
    if (arch == Architecture.UNKNOWN) {
        throw new IllegalStateException("architecture is unknown; platform: " + platform.familyName());
    }
    String dir = platform.familyName() + "-" + arch;
    Path dstDir = Path.of(IO.readln("Please enter the destination directory: "));
    for (String arg : args) {
        String[] split = arg.split(":", 2);
        Path src = Path.of("natives", split[0], dir, platform.sharedLibraryName(split[1]));
        try {
            Files.copy(src, dstDir.resolve(src.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Copied " + src);
    }
}
