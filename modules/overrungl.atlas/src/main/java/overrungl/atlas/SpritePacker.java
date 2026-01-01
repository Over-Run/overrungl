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

import org.jspecify.annotations.Nullable;

import java.util.Objects;
import java.util.SequencedCollection;

/// A simple sprite packer that packs [AtlasSprite].
///
/// This sprite packer is based on binary tree.
///
/// ## Example
///
/// This example allows storing userdata, which is useful for creating a texture atlas.
///
/// ```java
/// class MySprite extends AtlasSprite {
///     public final int id;
///     public MySprite(int width, int height, int padding, int id) {
///         super(width, height, padding);
///         this.id = id;
///     }
/// }
///
/// List<MySprite> sprites = new ArrayList<>();
/// sprites.add(new MySprite(16, 16, 0, 0));
/// sprites.add(new MySprite(32, 32, 0, 1));
/// // must sort to achieve the best result
/// sprites.sort(null);
///
/// var packer = new SpritePacker();
/// packer.fit(sprites);
///
/// for (var sprite : sprites) {
///     System.out.printf("%d: %d, %d", sprite.id, sprite.contentWidth(), sprite.contentHeight());
/// }
/// ```
///
/// @since 0.1.0
public class SpritePacker {
    private @Nullable Node root;

    /// Constructs a [SpritePacker].
    public SpritePacker() {
    }

    /// Resets this packer and packs the given sprites.
    ///
    /// The position of the sprites will be modified.
    ///
    /// If `sprites` is empty, then the size of this packer will be 0.
    ///
    /// @param sprites the sprites
    /// @param <T>     the type of the sprite
    public <T extends AtlasSprite> void fit(SequencedCollection<T> sprites) {
        int w = sprites.isEmpty() ? 0 : sprites.getFirst().width();
        int h = sprites.isEmpty() ? 0 : sprites.getFirst().height();
        this.root = new Node(0, 0, w, h);

        Node node;
        for (AtlasSprite sprite : sprites) {
            int width = sprite.width();
            int height = sprite.height();
            if ((node = findNode(Objects.requireNonNull(root), width, height)) != null) {
                Node splitNode = splitNode(node, width, height);
                sprite.x = splitNode.x;
                sprite.y = splitNode.y;
            } else {
                Node growNode = growNode(width, height);
                sprite.x = growNode != null ? growNode.x : -1;
                sprite.y = growNode != null ? growNode.y : -1;
            }
        }
    }

    private @Nullable Node findNode(Node root, int w, int h) {
        if (root.used) {
            Node findRight = findNode(Objects.requireNonNull(root.right), w, h);
            return findRight != null ? findRight : findNode(Objects.requireNonNull(root.down), w, h);
        }
        if ((w <= root.w) && (h <= root.h)) {
            return root;
        }
        return null;
    }

    private Node splitNode(Node node, int w, int h) {
        node.used = true;
        node.down = new Node(node.x, node.y + h, node.w, node.h - h);
        node.right = new Node(node.x + w, node.y, node.w - w, h);
        return node;
    }

    private @Nullable Node growNode(int w, int h) {
        Objects.requireNonNull(root);
        boolean canGrowDown = w <= root.w;
        boolean canGrowRight = h <= root.h;
        boolean shouldGrowRight = canGrowRight && root.h >= root.w + w;
        boolean shouldGrowDown = canGrowDown && root.w >= root.h + h;

        if (shouldGrowRight) {
            return growRight(w, h);
        }
        if (shouldGrowDown) {
            return growDown(w, h);
        }
        if (canGrowRight) {
            return growRight(w, h);
        }
        if (canGrowDown) {
            return growDown(w, h);
        }
        return null;
    }

    private @Nullable Node growRight(int w, int h) {
        Objects.requireNonNull(root);
        this.root = new Node(
            true,
            0,
            0,
            root.w + w,
            root.h,
            root,
            new Node(root.w, 0, w, root.h)
        );
        Node node;
        if ((node = findNode(root, w, h)) != null) {
            return splitNode(node, w, h);
        }
        return null;
    }

    private @Nullable Node growDown(int w, int h) {
        Objects.requireNonNull(root);
        this.root = new Node(
            true,
            0,
            0,
            root.w,
            root.h + h,
            new Node(0, root.h, root.w, h),
            root
        );
        Node node;
        if ((node = findNode(root, w, h)) != null) {
            return splitNode(node, w, h);
        }
        return null;
    }

    private Node checkRoot() {
        return Objects.requireNonNull(root, "Call SpritePacker::fit first");
    }

    /// {@return the width of the packer}
    ///
    /// @throws NullPointerException if no sprite is fitted
    public int width() {
        return checkRoot().w;
    }

    /// {@return the height of the packer}
    ///
    /// @throws NullPointerException if no sprite is fitted
    public int height() {
        return checkRoot().h;
    }
}
