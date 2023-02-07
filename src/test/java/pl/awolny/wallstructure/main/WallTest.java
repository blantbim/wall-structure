package pl.awolny.wallstructure.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WallTest {
    static private Wall wall;
    @BeforeAll
    static void initBlocks() {
        BlockImpl block = new BlockImpl("grey", "stone");
        BlockImpl block2 = new BlockImpl("brown", "wood");
        BlockImpl block3 = new BlockImpl("dark grey", "concrete");
        BlockImpl block4 = new BlockImpl("black", "stone");
        List<Block> blocks = new ArrayList<>();
        blocks.add(block);
        blocks.add(block2);
        blocks.add(block3);
        blocks.add(block4);
        wall = new Wall(blocks);
    }

    @Test
    void assertExistingBlockIsFound() {
        Assertions.assertTrue(wall.findBlockByColor("brown").isPresent());
    }
    @Test
    void assertNonExistingBlockIsNotFound() {
        Assertions.assertTrue(wall.findBlockByColor("green").isEmpty());
    }

    @Test
    void testFindBlocksByMaterial() {
        Assertions.assertEquals(2, wall.findBlocksByMaterial("stone").size());
    }

    @Test
    void testCount() {
        Assertions.assertEquals(4, wall.count());
    }
}