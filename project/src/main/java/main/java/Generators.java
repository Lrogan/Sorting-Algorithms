package main.java;

import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;

public class Generators
{
    private final int size = 50;
    private final int maxInt = Integer.MAX_VALUE-1;

    void testGenerators()
    {
        int[][] lists = {
                generateAscendingList(),
                generateDescendingList(),
                generatePartialSortedList(),
                generateRandomList()
        };
        for(int r = 0; r < lists.length; r++)
        {
            switch(r)
            {
                case 0: System.out.println("\\\\Printing Ascending List//");
                case 1: System.out.println("\\\\Printing Descending List//");
                case 2: System.out.println("\\\\Printing Partially Sorted List//");
                case 3: System.out.println("\\\\Printing Random List//");
                default: System.out.println("\\\\Printing a List//");
            }
            for(int c = 0; c < lists[0].length; c++)
            {
                System.out.println(lists[r][c]);
            }
        }
    }

    private int[] generateAscendingList()
    {
        System.out.println("------Generating Ascending List------");
        int[] ascendingList = generateRandomList();
        ArraySorter.sort(ascendingList);
        return ascendingList;
    }

    private int[] generateDescendingList()
    {
        System.out.println("------Generating Descending List------");
        int[] descendingList = generateRandomList();
        ArraySorter.sort(descendingList);
        ArrayUtils.reverse(descendingList);
        return descendingList;
    }

    private int[] generatePartialSortedList()
    {
        System.out.println("------Generating Paritally Sorted List------");
        int[] partialSortList = generateRandomList();
        ArraySorter.sort(partialSortList);
        for(int i = 0; i < size/5; i++)
        {
            int item1 = RandomUtils.nextInt(0, size-1);
            int item2 = RandomUtils.nextInt(0, size-1);
            while(item1 == item2)
                item2 = RandomUtils.nextInt(0, size-1);

            int temp = partialSortList[item1];
            partialSortList[item1] = partialSortList[item2];
            partialSortList[item2] = temp;
        }
        return partialSortList;
    }

    private int[] generateRandomList()
    {
        System.out.println("------Generating Random List------");
        int[] randomList = new int[size];
        for(int i = 0; i < size; i++)
        {
            randomList[i] = RandomUtils.nextInt(0,maxInt);
        }
        return randomList;
    }
}
