package com.structural.composite.fileSystem;

import static com.structural.composite.fileSystem.PrintUtil.printPath;

public class Leaf implements Component{
    String fileName;

    public Leaf(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void ls(int lvl){
        printPath("File : " + fileName, lvl);
    }
}
