/*
 * MIT License
 *
 * Copyright (c) 2025-2026 Overrun Organization
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

/// An atlas sprite that holds a position and a size.
///
/// This class might be extended to store userdata.
///
/// @since 0.1.0
public class AtlasSprite implements Comparable<AtlasSprite> {
    private final int width;
    private final int height;
    private final int padding;
    /// The x position of this sprite.
    protected int x = -1;
    /// The y position of this sprite.
    protected int y = -1;

    /// Constructs an [AtlasSprite] with the given size and padding.
    ///
    /// @param width   the content width of the sprite
    /// @param height  the content height of the sprite
    /// @param padding the padding of the sprite
    /// @throws IllegalArgumentException if `width < 0`, `height < 0` or `padding < 0`
    public AtlasSprite(int width, int height, int padding) {
        if (width < 0) throw new IllegalArgumentException("width < 0");
        if (height < 0) throw new IllegalArgumentException("height < 0");
        if (padding < 0) throw new IllegalArgumentException("padding < 0");
        this.width = width;
        this.height = height;
        this.padding = padding;
    }

    /// {@return the content width of this sprite}
    public int contentWidth() {
        return width;
    }

    /// {@return the content height of this sprite}
    public int contentHeight() {
        return height;
    }

    /// {@return the padding of this sprite}
    public int padding() {
        return padding;
    }

    /// {@return the width with padding of this sprite}
    public int width() {
        return contentWidth() + 2 * padding();
    }

    /// {@return the height with padding of this sprite}
    public int height() {
        return contentHeight() + 2 * padding();
    }

    /// {@return the x position of this sprite; or -1 if this sprite is not fitted into sprite packer}
    public int x() {
        return x;
    }

    /// {@return the y position of this sprite; or -1 if this sprite is not fitted into sprite packer}
    public int y() {
        return y;
    }

    /// {@return the x position of the content}
    public int contentX() {
        return x() + padding();
    }

    /// {@return the y position of the content}
    public int contentY() {
        return y() + padding();
    }

    /// {@return `true` if this sprite is fitted into the sprite packer}
    public boolean isFit() {
        return x >= 0 && y >= 0;
    }

    /// Compares this object with the specified object for order.
    ///
    /// Note: this class has a natural ordering that is inconsistent with equals.
    ///
    /// @param o the other sprite to be compared
    /// @return a negative integer, zero, or a positive integer
    /// as the max side of this object is less than, equal to, or greater than the one of the specified object.
    @Override
    public int compareTo(AtlasSprite o) {
        return Integer.compare(Math.max(o.contentWidth(), o.contentHeight()), Math.max(contentWidth(), contentHeight()));
    }
}
