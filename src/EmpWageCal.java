import java.util.Random;
class Attendance
{
    public static final int IS_FULL_TIME = 1;

    public void empCheck()
    {
        int empCheck = (int)Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee Is Present");
        }
        else
        {
            System.out.println("Employee Is Absent");
        }
    }
}
public class EmpWageCal
{
    public static void main(String[] args)
    {
        Attendance attendance = new Attendance();
        attendance.empCheck();
    }
}

