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

package overrungl.file;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/// @since 0.1.0
public class FileTest {
    @Test
    void readTest() throws IOException {
        assertFalse(FileProvider.localFile("build.gradle.kts").readText().isEmpty());

        assertEquals("Hello world\n", FileProvider.classpathFile("example.txt").readText());
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = FileProvider.classpathFile("example-bin").readBinary(arena);
            assertEquals(4, segment.byteSize());
            assertEquals((byte) 0xCA, segment.get(ValueLayout.JAVA_BYTE, 0));
            assertEquals((byte) 0xFE, segment.get(ValueLayout.JAVA_BYTE, 1));
            assertEquals((byte) 0xBA, segment.get(ValueLayout.JAVA_BYTE, 2));
            assertEquals((byte) 0xBE, segment.get(ValueLayout.JAVA_BYTE, 3));
        }
    }
}
