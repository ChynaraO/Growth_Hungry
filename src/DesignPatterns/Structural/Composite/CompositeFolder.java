package DesignPatterns.Structural.Composite;

//Treats groups of objects the same as individual objects (tree structures).

import java.util.ArrayList;
import java.util.List;

public class CompositeFolder implements FileSystemItem{
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    CompositeFolder(String name){
        this.name = name;
    }
    void add(FileSystemItem item){
        items.add(item);
    }
    void remove(FileSystemItem item){
        items.remove(item);
    }

    @Override
    public void showDetail() {
        System.out.println("Folder: " + name);
        for(FileSystemItem item : items){
            item.showDetail();
        }
    }
}
