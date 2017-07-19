import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String[] WeekArray={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        LocalDate localDate=LocalDate.now();//获取当前日期
        int month=localDate.getMonthValue();//获得当前月份
        int day=localDate.getDayOfMonth();//当前天数
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        LocalDate firstDay=localDate.minusDays(day-1);//月初
        LocalDate temDate=firstDay;
        for(int i=0;i<7;i++){
            System.out.print(WeekArray[i]+" ");
        }
        System.out.println();

        for(int i=1;i<firstDay.getDayOfWeek().getValue();i++){
            System.out.print("    ");
        }
        while(temDate.getMonthValue()==month){
            if(temDate.getDayOfWeek().getValue()<7){
                System.out.printf("%3d",temDate.getDayOfMonth());
                System.out.print(" ");

                temDate=temDate.plusDays(1);
            }else{
                System.out.printf("%3d",temDate.getDayOfMonth());
                System.out.println();

                temDate=temDate.plusDays(1);
            }

        }



    }
}
