package J2Kad20;

/*
	課題名：J2Kad20A「ラムダ式の省略形」
	作成日：2022/12/08
	作成者：田中太郎
*/

interface SimpleInterface { int dS( int n ); }

public class J2Kad20A {
    static void printout( SimpleInterface i ) {
        System.out.println( i.dS (2) );
    }

    public static void main(String[] args) {
        printout( ( int n ) -> { return n + 1; });
        printout( ( n ) -> { return n + 1; });
        printout( n -> { return n + 1; });
        printout( n -> n + 1 );
    }
}
