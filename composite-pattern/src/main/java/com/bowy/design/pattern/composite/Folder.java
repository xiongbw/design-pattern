package com.bowy.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 *
 * @author xiongbw
 * @implNote 容器节点
 */
public class Folder extends FileSystemNode {

    /**
     * 名称
     */
    private String name;

    /**
     * 子节点
     */
    private List<FileSystemNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    public void remove(FileSystemNode node) {
        children.remove(node);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemNode child : children) {
            child.display(indent + "  ");
        }
    }

}
