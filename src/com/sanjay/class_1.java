package com.sanjay;

class class_1 {
    class MyEmployee{
        int id;
        String name;
        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
        public void setId(int i){
            id = i;
        }
        public int getId(){
            return id;
        }

    }
    public void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        harry.setName("Codewith");
        System.out.println(harry.getName());
    }
}
