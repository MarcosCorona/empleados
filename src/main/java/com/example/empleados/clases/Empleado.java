package com.example.empleados.clases;

public class Empleado {
    private final String name;
    private final int age;
    private final String department;

    public Empleado(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static class Builder{
        private String name;
        private int age;
        private String department;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Empleado build(){
            return new Empleado(name, age, department);
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "name='" + name  +
                    ", age=" + age +
                    ", department='" + department +
                    '}';
        }
    }
}
