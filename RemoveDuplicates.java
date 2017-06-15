package removeduplicates;

import javax.swing.*;

public class RemoveDuplicates
{

    static int[] intArr = new int[100];
    static int size = 0;

    public static void main(String[] args)
    {
        generateNums();
        display("Original array");
        removeDups();
        display("Array without duplicates");
    }

    static void generateNums()
    {
        size = Integer.parseInt(JOptionPane.showInputDialog("How many integers (<100)?"));

        for (int i = 0; i < size; i++)
        {
            intArr[i] = (int) (Math.random() * 20);
        }

    }

    static void removeDups()
    {
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (intArr[i] == intArr[j])
                {
                    shiftLeft(j);
                }

            }
        }
    }

    static void shiftLeft(int position)
    {
        for (int i = position; i < size - 1; i++)
        {
            intArr[i] = intArr[i + 1];

        }
        size--;
    }

    static void display(String head)
    {
        System.out.println();
        System.out.println(head);
        for (int i = 0; i < size; i++)
        {
            System.out.print(intArr[i] + " ");
        }
    }

}
