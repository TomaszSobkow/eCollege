package topic9.assignment6_1.behaviors;


import topic9.assignment6_1.interfaces.PeelingMethods;

public class PeelingMethodsUnknown implements PeelingMethods {
    @Override
    public String peeling() {
       return "Unknown peeling method...";
    }
}
