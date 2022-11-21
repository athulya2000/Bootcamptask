import java.util.Scanner;

public class MenuDriven2 {
    public static void main(String[] args) {
        System.out.println("MEANU \n 1.Largest among 3 numbers \n 2.Smallest among 3 number \n 3.Prime or not \n 4.Even or not \n 5.Reverse of a number \n 6.Exit");
        System.out.println("Please choose your option");
        Scanner s = new Scanner(System.in);
        int menu = s.nextInt();
        if (menu == 6) {
            System.out.println("You are exited");
        } else {
            switch (menu){
                case 1:
                    System.out.println("Enter a 3 number");
                    int a=s.nextInt();
                    int b=s.nextInt();
                    int c=s.nextInt();
                    int ans=a>b?(a>c?a:c):(b>c?b:c);
                    System.out.println("Largest among 3 number is \t"+ans);
                    break;

                case 2:
                    System.out.println("Enter a 3 number");
                    int n1=s.nextInt();
                    int n2=s.nextInt();
                    int n3=s.nextInt();
                    int smallest=n1<n2?(n1<n3?n1:n3):(n2<n3?n2:n3);
                    System.out.println("Smallest among 3 number is \t"+smallest);
                    break;

                case 3:
                    System.out.println("Enter a number");
                    int p=s.nextInt();
                    int flag=0;
                    if(p<=1){
                        System.out.println(p+" is not prime number");
                    }
                    else{
                        for(int i=2;i<=p/2;i++){
                            if(i%2==0){
                                System.out.println(p+" is not prime number");
                                flag=1;
                                break;
                            }
                        }
                        if(flag==0){
                            System.out.println(p+"  is a prime number");
                        }

                    }

            }


        }
    }
}
