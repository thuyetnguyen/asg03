package asg03;

import static org.junit.Assert.*;
import org.junit.Test;

public class time2test {
    public static void main( String args[] ) {
        time2 tg1 = new time2();             // 00:00:00
        time2 tg2 = new time2( 6 );          // 06:00:00
        time2 tg3 = new time2( 23, 45 );     // 23:45:00
        time2 tg4 = new time2( 12, 34, 56 ); // 12:34:56
        time2 tg5 = new time2( 25, 65, 95 ); // 00:00:00
        time2 tg6 = new time2( t4 );         // 12:25:42

        
        System.out.println( "tg1 ;tat ca doi so mac dinh" );
        System.out.printf( "   %s\n", tg1.touniversalstring() );
        System.out.printf( "   %s\n", tg1.tostring() );

        System.out.println( "tg2 ; giay phut mac dinh" );
        System.out.printf( "   %s\n", tg2.touniversalstring() );
        System.out.printf( "   %s\n", tg2.tostring() );

        System.out.println( "tg3 ; giay mac dinh" );
        System.out.printf( "   %s\n", tg3.touniversalstring() );
        System.out.printf( "   %s\n", tg3.tostring() );

        System.out.println( "tg4 ; gioi phut giay xac dinh" );
        System.out.printf( "   %s\n", tg4.touniversalstring() );
        System.out.printf( "   %s\n", tg4.tostring() );

        System.out.println( "tg5 ; tat ca xac dinh" );
        System.out.printf( "   %s\n", tg5.touniversalstring() );
        System.out.printf( "   %s\n", tg5.tostring() );

        System.out.println( "tg6: Time2 đối tượng quy định t4" );
        System.out.printf( "   %s\n", tg6.touniversalstring() );
        System.out.printf( "   %s\n", tg6.tostring() );
    } 
} 