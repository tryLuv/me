package com.example.demo;
/**
 ***
 * @author X01Y
 * @date 2024/5/8
 ****
 ***
 **/
public class LoginUser {
    private static int visitCount = 0;
    public static void addVisitCount() {
        LoginUser.visitCount++;
    }

    public static int getVisitCount() {
        return LoginUser.visitCount;
    }
}
