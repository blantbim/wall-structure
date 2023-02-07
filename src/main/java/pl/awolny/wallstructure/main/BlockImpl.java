package pl.awolny.wallstructure.main;

import java.util.List;

public class BlockImpl implements CompositeBlock{

    private final String color;
    private final String material;
    private List<Block> blocks;

    public BlockImpl(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return null;
    }
}