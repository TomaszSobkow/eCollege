package topic9.exceptions.exceptionMain;

import topic5.ArraysAndList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImplement  {

    List<Employee> empInArray = new ArrayList();

    public void add(Employee emp) throws InvalidOperationException{
            //empInArray.add(0,null);
        if(empInArray.get(emp.getID()) != empInArray.get(emp.getID())){
            throw  new InvalidOperationException("Error adding employee. Employee "+ emp.getName()+" Exist");
        }
        try {

                empInArray.add(emp);
                System.out.println("New employee "+ emp.getName() + " has been added");
             }catch (IndexOutOfBoundsException e){
                throw new InvalidOperationException("Unknown exception!!");
        }
        System.out.println("emplArra = size "+ empInArray.size());
    }

    public void delete(int id) throws  InvalidOperationException{
            for(Employee emp : empInArray){
                if(emp.getID() == id ){
                    empInArray.remove(id);
            }else throw new InvalidOperationException("Error delete employee. Not found employee ID "+ id);
        }
        }

        public void getAllEmployee(){


        }
    }

