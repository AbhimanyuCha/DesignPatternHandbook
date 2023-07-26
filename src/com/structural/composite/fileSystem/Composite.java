package com.structural.composite.fileSystem;

import java.util.ArrayList;
import java.util.List;

import static com.structural.composite.fileSystem.PrintUtil.printPath;

public class Composite implements Component {

    private String directoryName;
    private List<Component> componentList;

    public Composite(String dirName){
        this.directoryName = dirName;
        componentList = new ArrayList<>();
    }

    public void add(Component c){
        componentList.add(c);
    }
    @Override
    public void ls(int lvl){
        printPath("Folder : " + directoryName, lvl);
        for(Component c : componentList){
            c.ls(lvl + 1);
        }
    }


}
