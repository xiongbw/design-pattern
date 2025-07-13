package com.bowy.design.pattern.composite;

/**
 * 文件
 *
 * @author xiongbw
 * @implNote 叶子节点
 */
public class File extends FileSystemNode {

    /**
     * 名称
     */
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name);
    }

}
