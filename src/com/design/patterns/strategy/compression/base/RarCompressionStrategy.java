package com.design.patterns.strategy.compression.base;

import java.nio.file.Files;
import java.util.List;

/**
 * Created by himu on 2/23/2018.
 */
public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(List<Files> files) {
        System.out.println("Compressing using RAR strategy");
    }
}
