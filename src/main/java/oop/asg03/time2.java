package asg03;

public class time2 {
    private int secondsaftermidnight;  
	private int hour;
	private int minute;
	private int second;
    public time2() { 
        this( 0, 0, 0 ); 
   }

    public time2( int h ) { 
        this( h, 0, 0 ); 
   }
   
    public time2( int h, int m ) { 
        this( h, m, 0 ); 
   }
  
    public time2( int h, int m, int s ) { 
        settime( h, m, s ); 
   }
   
    public time2( time2 time ) {
        this( time.gethour(), time.getminute(), time.getsecond() ); 
   }

    public void settime( int h, int m, int s ) {
        if ( (( h >= 0) && (h < 24 )) ) {
            secondsaftermidnight = h * 60 * 60;
        } else {
            secondsaftermidnight = 0;
        }
       
        if ( (( m >= 0) && (m < 60 )) ) {
            secondsaftermidnight += m * 60;
        }
       
        if ( (( s >= 0) && (s < 60 )) ) {
            secondsaftermidnight += s;
        }
   }
   
    public int gethour () {
        return secondsaftermidnight / 3600;
   }
    public int getminute () {
        return secondsaftermidnight % 3600 / 60;
   }
    public int getsecond () {
        return secondsaftermidnight % 60;
   }

   
    public String touniversalstring() {
        return String.format( 
         "%02d:%02d:%02d", gethour(), getminute(), getsecond() );
   } 

   
    public String tostring() {
        return String.format( "%d:%02d:%02d %s", 
         ( (gethour() == 0 || gethour() == 12) ? 12 : gethour() % 12 ),
         getminute(), getsecond(), ( gethour() < 12 ? "AM" : "PM" ) );
   } 
} 