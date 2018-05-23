package ch11;

/* Write a method contains3 that accepts a list of strings as a parameter and returns true
if any single string occurs at least 3 times in the list, and false otherwise. Use a map as auxiliary storage. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class opg12
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<>();
        myList.add("min ven");
        myList.add("ble");
        myList.add("min ven");
        myList.add("min ven");
        myList.add("forstoppelse");
        myList.add("vandflaske");
        myList.add("spaghetti med kødsovs");

        System.out.println(contains3(myList));

    }

    public static boolean contains3 (List<String> listen )
    {
        Map<String, Integer> temporyMap = new HashMap<>();

        for (String string : listen)

        {
            temporyMap.put(string, 0);
        }

        for (String string : listen)

        {
            temporyMap.put(string, temporyMap.get(string)+1);
        }

        ArrayList<Integer> temporyArrayList = new ArrayList<>();
        temporyArrayList.addAll(temporyMap.values());

        for (Integer checkIt : temporyArrayList)

        {
            if (checkIt >= 3)
            {
                return true;
            }
        }

        return false;
    }
}
