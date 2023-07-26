package com.structural.composite.fileSystem;

public class PrintUtil {
    public static void printPath(String name, int lvl){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < lvl ; i++)
            sb.append(" ");
        sb.append(name);
        System.out.println(sb.toString());
    }
}
