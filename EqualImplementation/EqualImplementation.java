public class EqualImplementation{
    public static void main(String[] args) {

        Employee emp1 = new Employee("1","EMP001","Kamala","999999999V","Kandy");
        Employee emp2 = new Employee("2","EMP005","Nilavan","955555422V","Colombo");
        Employee emp3 = new Employee("1","EMP001","Kamala","999999999V","Kandy");


        System.out.println("Employee-01's Details");
        System.out.println("ID : " + emp1.getId());
        System.out.println("Code :" + emp1.getCode());
        System.out.println("Name : " + emp1.getName());
        System.out.println("NIC : " + emp1.getNic());
        System.out.println("Address : " + emp1.getAddress());

        System.out.println("\n");

        System.out.println("Employee-02's Details");
        System.out.println("ID : " + emp2.getId());
        System.out.println("Code :" + emp2.getCode());
        System.out.println("Name : " + emp2.getName());
        System.out.println("NIC : " + emp2.getNic());
        System.out.println("Address : " + emp2.getAddress());

        System.out.println("\n");
        
        System.out.println("Employee-03's Details");
        System.out.println("ID : " + emp3.getId());
        System.out.println("Code :" + emp3.getCode());
        System.out.println("Name : " + emp3.getName());
        System.out.println("NIC : " + emp3.getNic());
        System.out.println("Address : " + emp3.getAddress());

        System.out.println("\n");

//Check emp1 with emp2
        //check the memory address emp1 ID & emp2 ID are same in the heap
        System.out.println(emp1.getId() == emp2.getId());
        //check the value of emp1 ID & emp2 ID are same in the heap
        System.out.println(emp1.getId().equals(emp2.getId()));
        //check the memory address emp1 code & emp2 code are same in the heap
        System.out.println(emp1.getCode()==emp2.getCode());
        //check the value of emp1 code & emp2 code are same in the heap
        System.out.println(emp1.getCode().equals(emp2.getCode()));

        System.out.println("\n");

//Check emp1 with emp3
        //check the memory address emp1 ID & emp3 ID are same in the heap
        System.out.println(emp1.getId() == emp3.getId());
        //check the value of emp2 ID & emp3 ID are same in the heap
        System.out.println(emp1.getId().equals(emp3.getId()));
         //check the memory address emp2 code & emp3 code are same in the heap
        System.out.println(emp1.getCode()==emp3.getCode());
         //check the value of emp2 code & emp3 code are same in the heap
        System.out.println(emp1.getCode().equals(emp3.getCode()));

        System.out.println("\n");

//Check emp2 with emp3
        //check the memory address emp2 ID & emp3 ID are same in the heap
        System.out.println(emp2.getId() == emp3.getId());
        //check the value of emp2 ID & emp3 ID are same in the heap
        System.out.println(emp2.getId().equals(emp3.getId()));
         //check the memory address emp2 code & emp3 code are same in the heap
        System.out.println(emp2.getCode()==emp3.getCode());
         //check the value of emp2 code & emp3 code are same in the heap
        System.out.println(emp2.getCode().equals(emp3.getCode()));

        System.out.println("\n");

        



    }     
    
}