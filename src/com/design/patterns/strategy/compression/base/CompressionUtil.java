package com.design.patterns.strategy.compression.base;

import java.nio.file.Files;
import java.util.List;

/**
 * Created by himu on 2/23/2018.
 */
public class CompressionUtil {

CompressionStrategy compressionStrategy;

    public CompressionUtil(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void performCompression(List<Files> files){
        compressionStrategy.compress(files);
    }
}
