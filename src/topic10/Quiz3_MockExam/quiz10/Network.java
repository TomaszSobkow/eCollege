package topic10.Quiz3_MockExam.quiz10;

public class Network {
    int id =12;

    Network(int x, Network n){
        id = x;
        p = this;
        if(n != null) {
            p = n;
            System.out.println("not null n"+ getClass());
        }else System.out.println("null object");
    }

    Network p;

    public static void main(String[] args) {
        Network n1 = new Network(1,null);
        System.out.println(n1.p.id);
        n1.go(n1);
    }

    public void go(Network n1){
        Network n2 = new Network(2,n1);
        Network n3 = new Network(3,n2);
        System.out.println(n3.p.p.id);
    }
}
