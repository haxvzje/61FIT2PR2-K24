package week1;

public class Interest {
    public static void main(String[] args) {
        /* Declare the variables. */
        int principal;
        double rate;
        double interest;

        /* Do the computations. */
        principal = (int) 17000.0;
        rate = 0.07;
        interest = principal * rate;
        principal = (int) (principal + interest);

        /* Output the results. */
        System.out.print("The interest earned is ");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is ");
        System.out.println(principal);
    }
}

//a . Chuong trinh van chay duoc vi float van nam trong pham vi gia tri cua double
//b.  Chuong trinh khong chay vi float nam ngoai pham vi cua int va khong dung dinh dang
//        - de fix thi chi can ep kieu float ve int la duoc