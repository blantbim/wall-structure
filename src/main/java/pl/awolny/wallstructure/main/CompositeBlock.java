package pl.awolny.wallstructure.main;

import java.util.List;

interface CompositeBlock extends Block {
    List<Block> getBlocks();
}