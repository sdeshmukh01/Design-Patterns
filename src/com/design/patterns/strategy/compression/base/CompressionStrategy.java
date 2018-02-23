package com.design.patterns.strategy.compression.base;

import java.nio.file.Files;
import java.util.List;

/**
 * Created by himu on 2/23/2018.
 */
public interface CompressionStrategy {

    public void compress(List<Files> files);
}
