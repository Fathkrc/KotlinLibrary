package lesson2;

public class Employees {
        private String name;
        private int id;

        public Employees(String name, int id) {
            this.name = name;
            this.id = id;
        }
        public boolean equals(Object o){
            if (o==null) {
                return false;
            }
            if (o==this) {
                return true;
            }
            if (o instanceof Employees) {
                return name.equals(((Employees)o).name)&&
                        id==((Employees)o).id;
            }
            return false;
        }
    }


