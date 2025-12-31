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

package overrungl.atlas;

/// @since 0.1.0
public class AtlasSprite implements Comparable<AtlasSprite> {
    private final int width;
    private final int height;
    private final int padding;
    protected int x = -1;
    protected int y = -1;

    public AtlasSprite(int width, int height, int padding) {
        if (width < 0) throw new IllegalArgumentException("width < 0");
        if (height < 0) throw new IllegalArgumentException("height < 0");
        if (padding < 0) throw new IllegalArgumentException("padding < 0");
        this.width = width;
        this.height = height;
        this.padding = padding;
    }

    public int contentWidth() {
        return width;
    }

    public int contentHeight() {
        return height;
    }

    public int padding() {
        return padding;
    }

    public int width() {
        return contentWidth() + 2 * padding();
    }

    public int height() {
        return contentHeight() + 2 * padding();
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public int contentX() {
        return x() + padding();
    }

    public int contentY() {
        return y() + padding();
    }

    public boolean isFit() {
        return x >= 0 && y >= 0;
    }

    @Override
    public int compareTo(AtlasSprite o) {
        return Integer.compare(Math.max(o.contentWidth(), o.contentHeight()), Math.max(contentWidth(), contentHeight()));
    }
}
