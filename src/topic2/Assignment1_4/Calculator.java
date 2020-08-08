package topic2.Assignment1_4;

public class Calculator {

    private float no1;
    private float no2;
    private String operator;

    public float performCalculation(){
        switch(operator){
            case "*": return getNo1() * getNo2();
            case "/": return getNo1() / getNo2();
            case "-": return getNo1() - getNo2();
            case "+": return getNo1() + getNo2();
            case "%": return getNo1() % getNo2();
            default:
                System.out.println("Wrong operator from Calculator class");
                return 0;
        }
    }

    public void setNo1(float no1){ this.no1 = no1; }
    public void setNo2(float no2) { this.no2 = no2; }
    public void setOperator(String operator){ this.operator = operator; }

    public String getOperator() {return operator;}
    public float getNo1()       {return no1; }
    public float getNo2()       {return no2;}

}

