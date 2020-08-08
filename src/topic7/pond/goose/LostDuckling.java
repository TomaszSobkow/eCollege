package topic7.pond.goose;

import topic7.pond.duck.DuckTeacher;

public class LostDuckling {

    public void swim(){
        DuckTeacher duckTeacher = new DuckTeacher();
        duckTeacher.swim();
        System.out.println("Thank You "+duckTeacher.duckTeacherName);
    }
	
	public static void main(String[] args){
		new LostDuckling().swim();
		
	}
	


}
