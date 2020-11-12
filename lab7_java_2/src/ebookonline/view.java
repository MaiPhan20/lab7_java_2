package ebookonline;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Controller objController = new Controller();
        objController.loadingUsers();
        objController.loadingBooks();
        objController.loadingCustomer();
        int choice = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("=====================================");
            System.out.println("1. SIGN UP FOR FREE ");
            System.out.println("2. ALREADY HAVE ACCOUNT, SIGN IN !");
            System.out.println("0. EXIT ");
            System.out.println("=====================================");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    if (objController.SignUp(objController.PreSignUp())){
                        System.out.println("Sign up successfully ! Please Sign in !");
                    } else {
                        System.out.println("Try Again!!!");
                    }
                    break;
                case 2:
                    Users objUser = objController.SignIn();
                    objController.checkUser(objUser);
                    break;
                case 0 :
                    System.out.println("Good Bye!!!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (choice != 0);
    }
}
