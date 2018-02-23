package com.design.patterns.strategy.compression.impl;

import com.design.patterns.strategy.compression.base.CompressionUtil;
import com.design.patterns.strategy.compression.base.RarCompressionStrategy;

import java.util.ArrayList;

/**
 * Created by himu on 2/23/2018.
 */
public class CompressionClient {



    public static void main(String[] args) {
        CompressionUtil compressionUtil = new CompressionUtil(new RarCompressionStrategy());
        compressionUtil.performCompression(new ArrayList<>());
    }
}
