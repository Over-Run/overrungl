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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/// @since 0.1.0
public class SpritePackerTest {
    private SpritePacker spritePacker;

    @BeforeEach
    void setUp() {
        spritePacker = new SpritePacker();
    }

    @Test
    void fit_EmptySprites() {
        List<AtlasSprite> sprites = new ArrayList<>();
        spritePacker.fit(sprites);

        assertEquals(0, spritePacker.width());
        assertEquals(0, spritePacker.height());
    }

    @Test
    void fit_SingleSprite() {
        AtlasSprite sprite = new AtlasSprite(50, 50, 2);
        List<AtlasSprite> sprites = List.of(sprite);

        spritePacker.fit(sprites);

        assertTrue(sprite.isFit());
        assertEquals(0, sprite.x());
        assertEquals(0, sprite.y());
        // 50 + 2 * 2
        assertEquals(54, spritePacker.width());
        assertEquals(54, spritePacker.height());
    }

    @Test
    void fit_MultipleSprites() {
        List<AtlasSprite> sprites = Arrays.asList(
            new AtlasSprite(20, 30, 1), // max: 30
            new AtlasSprite(40, 20, 1), // 40
            new AtlasSprite(15, 15, 0)  // 15
        );

        Collections.sort(sprites);

        assertEquals(40, Math.max(sprites.get(0).contentWidth(), sprites.get(0).contentHeight()));
        assertEquals(30, Math.max(sprites.get(1).contentWidth(), sprites.get(1).contentHeight()));
        assertEquals(15, Math.max(sprites.get(2).contentWidth(), sprites.get(2).contentHeight()));

        spritePacker.fit(sprites);

        for (AtlasSprite sprite : sprites) {
            assertTrue(sprite.isFit(), "Sprite should be placed");
            assertTrue(sprite.x() >= 0);
            assertTrue(sprite.y() >= 0);
        }

        // check if overlapped
        for (int i = 0; i < sprites.size(); i++) {
            for (int j = i + 1; j < sprites.size(); j++) {
                AtlasSprite s1 = sprites.get(i);
                AtlasSprite s2 = sprites.get(j);

                boolean noOverlap =
                    (s1.x() + s1.width() <= s2.x()) ||
                        (s2.x() + s2.width() <= s1.x()) ||
                        (s1.y() + s1.height() <= s2.y()) ||
                        (s2.y() + s2.height() <= s1.y());

                assertTrue(noOverlap, "Sprites should not overlap");
            }
        }
    }

    @Test
    void fit_NeedsGrowth() {
        List<AtlasSprite> sprites = new ArrayList<>();

        sprites.add(new AtlasSprite(100, 100, 2)); // max: 100
        sprites.add(new AtlasSprite(150, 50, 2));  // 150
        sprites.add(new AtlasSprite(50, 150, 2));  // 150

        Collections.sort(sprites);

        spritePacker.fit(sprites);

        for (AtlasSprite sprite : sprites) {
            assertTrue(sprite.isFit());
        }

        // packer size should be >= total sprite size
        int totalArea = sprites.stream()
            .mapToInt(s -> s.width() * s.height())
            .sum();
        assertTrue(spritePacker.width() * spritePacker.height() >= totalArea);
    }

    @Test
    void atlasSprite_NegativeDimensions() {
        assertThrows(IllegalArgumentException.class, () ->
            new AtlasSprite(-1, 10, 1));

        assertThrows(IllegalArgumentException.class, () ->
            new AtlasSprite(10, -1, 1));

        assertThrows(IllegalArgumentException.class, () ->
            new AtlasSprite(10, 10, -1));
    }

    @Test
    void dimensions_BeforeFit() {
        SpritePacker newPacker = new SpritePacker();
        assertThrows(NullPointerException.class, newPacker::width);
        assertThrows(NullPointerException.class, newPacker::height);
    }

    @Test
    void spritePaddingMethods() {
        AtlasSprite sprite = new AtlasSprite(30, 40, 3);

        assertEquals(30, sprite.contentWidth());
        assertEquals(40, sprite.contentHeight());
        assertEquals(3, sprite.padding());
        assertEquals(36, sprite.width());  // 30 + 2 * 3
        assertEquals(46, sprite.height()); // 40 + 2 * 3

        assertFalse(sprite.isFit());
        assertEquals(-1, sprite.x());
        assertEquals(-1, sprite.y());
    }

    @Test
    void spriteWithPaddingCoordinates() {
        AtlasSprite sprite = new AtlasSprite(20, 30, 2);
        sprite.x = 10;
        sprite.y = 20;

        assertEquals(12, sprite.contentX());  // 10 + 2
        assertEquals(22, sprite.contentY());  // 20 + 2
    }

    @Test
    void atlasSprite_Comparable() {
        AtlasSprite sprite1 = new AtlasSprite(30, 40, 0);  // max: 40
        AtlasSprite sprite2 = new AtlasSprite(50, 30, 0);  // 50
        AtlasSprite sprite3 = new AtlasSprite(25, 25, 0);  // 25

        // 40 < 50
        assertTrue(sprite1.compareTo(sprite2) > 0);
        // 50 > 40
        assertTrue(sprite2.compareTo(sprite1) < 0);
        // 40 > 25
        assertTrue(sprite1.compareTo(sprite3) < 0);
        // 25 < 40
        assertTrue(sprite3.compareTo(sprite1) > 0);
        assertEquals(0, sprite1.compareTo(sprite1));

        List<AtlasSprite> sprites = new ArrayList<>();
        sprites.add(sprite1);
        sprites.add(sprite2);
        sprites.add(sprite3);

        Collections.sort(sprites);

        assertEquals(sprite2, sprites.get(0));
        assertEquals(sprite1, sprites.get(1));
        assertEquals(sprite3, sprites.get(2));
    }

    @Test
    void nodeConstructors() {
        Node node1 = new Node(5, 10, 20, 30);
        assertFalse(node1.used);
        assertEquals(5, node1.x);
        assertEquals(10, node1.y);
        assertEquals(20, node1.w);
        assertEquals(30, node1.h);
        assertNull(node1.down);
        assertNull(node1.right);

        Node child1 = new Node(0, 0, 10, 10);
        Node child2 = new Node(0, 0, 10, 10);
        Node node2 = new Node(true, 1, 2, 3, 4, child1, child2);
        assertTrue(node2.used);
        assertEquals(1, node2.x);
        assertEquals(2, node2.y);
        assertEquals(3, node2.w);
        assertEquals(4, node2.h);
        assertSame(child1, node2.down);
        assertSame(child2, node2.right);
    }

    @ParameterizedTest
    @MethodSource("provideSpriteSizes")
    void fit_VariousSpriteSizes(int width, int height, int padding) {
        AtlasSprite sprite = new AtlasSprite(width, height, padding);
        List<AtlasSprite> sprites = List.of(sprite);

        spritePacker.fit(sprites);

        assertTrue(sprite.isFit());
        assertEquals(width + 2 * padding, spritePacker.width());
        assertEquals(height + 2 * padding, spritePacker.height());
    }

    private static Stream<Arguments> provideSpriteSizes() {
        return Stream.of(
            Arguments.of(1, 1, 0),
            Arguments.of(10, 10, 1),
            Arguments.of(100, 100, 5),
            Arguments.of(50, 100, 2),
            Arguments.of(100, 50, 3)
        );
    }

    @Test
    void fit_VeryLargeSprite() {
        AtlasSprite sprite = new AtlasSprite(1000, 1000, 10);
        List<AtlasSprite> sprites = List.of(sprite);

        spritePacker.fit(sprites);

        assertTrue(sprite.isFit());
        assertEquals(1020, spritePacker.width());
        assertEquals(1020, spritePacker.height());
    }

    @Test
    void fit_WithLinkedList() {
        LinkedList<AtlasSprite> sprites = new LinkedList<>();
        sprites.add(new AtlasSprite(20, 30, 1));
        sprites.add(new AtlasSprite(40, 20, 1));
        sprites.add(new AtlasSprite(15, 15, 0));

        Collections.sort(sprites);

        spritePacker.fit(sprites);

        for (AtlasSprite sprite : sprites) {
            assertTrue(sprite.isFit());
        }
    }

    @Test
    void fit_MultipleCalls() {
        List<AtlasSprite> sprites1 = List.of(
            new AtlasSprite(50, 50, 2)
        );
        spritePacker.fit(sprites1);

        // 50 + 2 * 2
        assertEquals(54, spritePacker.width());
        assertEquals(54, spritePacker.height());
        assertTrue(sprites1.getFirst().isFit());

        List<AtlasSprite> sprites2 = List.of(
            new AtlasSprite(30, 30, 1)
        );
        spritePacker.fit(sprites2);

        // 30 + 2 * 1
        assertEquals(32, spritePacker.width());
        assertEquals(32, spritePacker.height());
        assertTrue(sprites2.getFirst().isFit());
    }

    @Test
    void sprite_PlacementArea() {
        AtlasSprite sprite = new AtlasSprite(30, 40, 2);
        List<AtlasSprite> sprites = List.of(sprite);

        spritePacker.fit(sprites);

        int contentX = sprite.contentX();
        int contentY = sprite.contentY();
        int contentWidth = sprite.contentWidth();
        int contentHeight = sprite.contentHeight();

        // check if sprite is inside packer
        assertTrue(sprite.x() >= 0);
        assertTrue(sprite.y() >= 0);
        assertTrue(sprite.x() + sprite.width() <= spritePacker.width());
        assertTrue(sprite.y() + sprite.height() <= spritePacker.height());

        // check if content is inside sprite
        assertTrue(contentX >= sprite.x());
        assertTrue(contentY >= sprite.y());
        assertTrue(contentX + contentWidth <= sprite.x() + sprite.width());
        assertTrue(contentY + contentHeight <= sprite.y() + sprite.height());
    }

    @Test
    void comparable_EdgeCases() {
        // same max side
        AtlasSprite sprite1 = new AtlasSprite(30, 40, 0);
        AtlasSprite sprite2 = new AtlasSprite(40, 30, 0);

        assertEquals(0, sprite1.compareTo(sprite2));

        AtlasSprite square1 = new AtlasSprite(50, 50, 0);
        AtlasSprite square2 = new AtlasSprite(30, 30, 0);
        // 50 > 30
        assertTrue(square1.compareTo(square2) < 0);
        // 30 < 50
        assertTrue(square2.compareTo(square1) > 0);

        AtlasSprite minSprite = new AtlasSprite(0, 0, 0);
        AtlasSprite smallSprite = new AtlasSprite(1, 1, 0);
        // 0 < 1
        assertTrue(minSprite.compareTo(smallSprite) > 0);
        // 1 > 0
        assertTrue(smallSprite.compareTo(minSprite) < 0);
    }

    @Test
    void sortedSet_Ordering() {
        SortedSet<AtlasSprite> spriteSet = new TreeSet<>();

        spriteSet.add(new AtlasSprite(20, 30, 0));
        spriteSet.add(new AtlasSprite(40, 20, 0));
        spriteSet.add(new AtlasSprite(15, 15, 0));
        spriteSet.add(new AtlasSprite(35, 35, 0));

        List<AtlasSprite> sortedList = new ArrayList<>(spriteSet);

        assertEquals(40, Math.max(sortedList.get(0).contentWidth(), sortedList.get(0).contentHeight()));
        assertEquals(35, Math.max(sortedList.get(1).contentWidth(), sortedList.get(1).contentHeight()));
        assertEquals(30, Math.max(sortedList.get(2).contentWidth(), sortedList.get(2).contentHeight()));
        assertEquals(15, Math.max(sortedList.get(3).contentWidth(), sortedList.get(3).contentHeight()));
    }

    @Test
    void comparable_Symmetry() {
        AtlasSprite sprite1 = new AtlasSprite(20, 30, 0);
        AtlasSprite sprite2 = new AtlasSprite(40, 10, 0);

        int result1 = sprite1.compareTo(sprite2);
        int result2 = sprite2.compareTo(sprite1);
        assertTrue(result1 > 0 && result2 < 0 || result1 < 0 && result2 > 0 || result1 == 0 && result2 == 0);
    }
}
