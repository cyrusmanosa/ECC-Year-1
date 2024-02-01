package J2Kad04;

public class Cards {
    private static int[] cards={ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };
    private static int rest = cards.length;

    int getNumber(){ return cards[ rest ]; }

    Cards(){
        int rand = ( int )( Math.random() * rest );
        int swap = cards[ rand ];
        cards[ rand ] = cards[ rest - 1 ];
        cards[ rest - 1 ] = swap;
        rest--;
    }
}
