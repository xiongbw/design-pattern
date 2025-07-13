package com.bowy.design.pattern.composite;

/**
 * 文件系统节点
 *
 * @author xiongbw
 * @implSpec 统一接口
 */
public abstract class FileSystemNode {

    /**
     * 展示
     *
     * @param indent 缩进符
     */
    public abstract void display(String indent);

}
