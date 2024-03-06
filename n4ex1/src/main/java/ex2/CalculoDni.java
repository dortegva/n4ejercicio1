package ex2;



public class CalculoDni {

    public static char assignalletra (int numDNI){
        int resto=numDNI%23;
        String letra="TRWAGMYFPDXBNJZSQVHLCKE";
        return letra.charAt(resto) ;


    }


}
