package ru.java.education.dz3.arrows;

public class Main {
    public static void main(String[] args) {
        String str = "><<>>-<<>->->><-<<>>->>><<><>--><-><<<>>-->>-><<-<>-<<<<-<<>>->>->><><-><>-><>>>-<><<-<<->>->><<";
        int left_count = GetSubstringCount(str, "<-<<");
        System.out.println("left_count: " + left_count);

        int right_count = GetSubstringCount(str, ">>->");
        System.out.println("right_count: " + right_count);
    }

    public static int GetSubstringCount(String original, String searched_str)
    {
        int ind_begin = 0;
        int ind_end = original.length();

        int count = 0;

        while(ind_begin != ind_end && ind_end >= 0)
        {
            int ind = original.substring(ind_begin, ind_end).lastIndexOf(searched_str);

            if(ind >= 0)
            {
                count++;
                ind_end = ind;
            }
            else break;
        }

        return count;
    }
}