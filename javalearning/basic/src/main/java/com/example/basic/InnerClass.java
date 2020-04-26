package com.example.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class InnerClass implements Serializable {
   public ArrayList<data> details;
    public static class data implements  Serializable{
        String  name;
        Integer age;
        public data(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

}
