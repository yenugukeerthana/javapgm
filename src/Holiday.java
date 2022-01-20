public class Holiday
{
    private String name;
    private int day;
    private String month;

    public Holiday(String n,int d,String m)
    {
        name = n;
        day = d;
        month = m;
    }
    public boolean inSameMonth(Holiday holiday){
        return this.month.equals(holiday.month);
    }
    public static double avgDate(Holiday[] holiday) {
        int sum = 0;
        for(int i = 0; i < holiday.length; i++) {
            sum +=holiday[i].day;
        }
        double r=sum/holiday.length;
        return r;
    }
    public static void main(String[] args){
        Holiday holiday = new Holiday("Independence Day", 4, "July");
        Holiday holiday2 = new Holiday("new year Day", 1, "Jan");
        System.out.println(holiday.inSameMonth(holiday2));
        Holiday holiday3 = new Holiday("repDay", 4, "July");
        Holiday[] hh=new Holiday[3];
        hh[0]=new Holiday("Independence Day", 4, "July");
        hh[1]=new Holiday("new year Day", 1, "Jan");
        hh[2]=new Holiday("repDay", 4, "July");
        System.out.println(avgDate(hh));
    }
}

