package org.example;
import ui.LoginForm;

import auth.AuthService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new LoginForm();
        AuthService authService = new AuthService();

        System.out.println("1. Register");
        System.out.println("2. Login");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (choice == 1) {
            if (AuthService.register(username, password)) {
                System.out.println("User registered successfully.");
            } else {
                System.out.println("Registration failed.");
            }
        } else if (choice == 2) {
            if (AuthService.login(username, password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login failed.");
            }
        }

        scanner.close();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
