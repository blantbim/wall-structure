package pl.awolny.wallstructure.main;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.color().equals(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.material().equals(material))
                .toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }
}