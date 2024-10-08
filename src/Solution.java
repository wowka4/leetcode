package src;

public class Solution {

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}