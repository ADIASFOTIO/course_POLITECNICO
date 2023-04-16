package org.polito;

import java.util.function.IntBinaryOperator;

public class EsempioFunctional {
    public static void main(String[] args){
       int[] ary = {1,2,3,4,5};
    //   IntBinaryOperator max = new IntBinaryOperator() {
     //      @Override
     //      public int applyAsInt(int left, int right) {
     //       if (left>right) return left;
      //         return right;
     //      }
     //  };
        // lambda expression
        IntBinaryOperator max = (left,right) -> {
            if (left>right) return left;
                return right;
        };

       System.out.println("Max: " + aggrega(ary ,max));
    }
    public static int aggrega(int[] a, IntBinaryOperator aggregatore){
        int risultato = a[0];
        for (int i=1; i<a.length; i++){
            risultato = aggregatore.applyAsInt(risultato, a[i]);
        }
        return risultato;
    }
}
