package topic3;

public class Assignmnent2_10 {
    public static void main(String[] args) {
    Tree t = new Tree();
    Oak o = new Oak();
    Camera c = new Camera();
    DisposableCamera d = new DisposableCamera();
    Camera e = new DisposableCamera();

        // System.out.println(o instanceof t);
        System.out.println((c instanceof Object) + " --> true");
        System.out.println((c instanceof Zoomable) + " --> true");
        System.out.println((t instanceof Zoomable)+ " --> false");
       // System.out.println((o instanceof Camera)+" --> ");
        System.out.println((d instanceof Zoomable)+" --> true");
        System.out.println((e instanceof Camera)+" --> true");
    }

}
class Tree{}
class Oak extends Tree{}
class Camera implements Zoomable{}
interface Zoomable{}
class DisposableCamera extends Camera{}

