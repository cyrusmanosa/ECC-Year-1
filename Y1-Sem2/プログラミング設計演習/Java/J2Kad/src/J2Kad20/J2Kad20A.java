package J2Kad20;

/*
	�ۑ薼�FJ2Kad20A�u�����_���̏ȗ��`�v
	�쐬���F2022/12/08
	�쐬�ҁF�c�����Y
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
