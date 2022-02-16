package main.java;

public class Results
{
    private int n, compares, moves, time;
    private String listType, sort;

    public Results()
    {
        n = compares = moves = time = 0;
        listType = sort = "";
    }

    public Results(int elements, String dataType, String sortType)
    {
        n = elements;
        listType = dataType;
        sort = sortType;
        compares = moves = time = 0;
    }

    public Results(int elements, int comparisons, int movements, int ms, String dataType, String sortType)
    {
        n = elements;
        compares = comparisons;
        moves = movements;
        time = ms;
        listType = dataType;
        sort = sortType;
    }

    public void setElements(int elements)
    {
        n = elements;
    }

    public void setCompares(int comparisons)
    {
        compares = comparisons;
    }

    public void setMovements(int movements)
    {
        moves = movements;
    }

    public void setTime(int ms)
    {
        time = ms;
    }

    public void setdataType(String dataType)
    {
        listType = dataType;
    }

    public void setSortType(String sortType)
    {
        sort = sortType;
    }

    public String toString()
    {
        return  "N: " + n + "\n" +
                "DataType: " + listType + "\n" +
                "Sort: " + sort + "\n" +
                "Comparisons: " + compares + "\n" +
                "Movements: " + moves + "\n" +
                "Total Time: " + time + "\n";
    }
}