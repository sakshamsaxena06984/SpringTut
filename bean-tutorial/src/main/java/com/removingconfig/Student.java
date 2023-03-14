package com.removingconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
    private Sam sam;

    public Student(Sam sam) {
        this.sam = sam;
    }

    public Sam getSam() {
        return sam;
    }

    public void setSam(Sam sam) {
        this.sam = sam;
    }


    public void study(){
        System.out.println("study");
        sam.display();

    }
}
