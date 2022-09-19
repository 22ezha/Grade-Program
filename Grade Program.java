/******************************************************************************
Eric Zhang
Comp Sci 3
10 /1 /2020
Grade Program
*******************************************************************************/


import java.io.*;
public class Main
{
        public static void main(String[] args) throws IOException
        {
            DataInputStream reader = new DataInputStream(System.in);


            String name[];
            int stuCount;
            String userInput;
            double grade [][];
            double avg;
            int i;
            int j;
            int count;
            int maxstu=10;
            int lowstu=-1;
            double highest = -10000.0;
            double lowest = 1000000.0;
            System.out.print("How many students are in the class?: ");
            userInput= reader.readLine();
            stuCount = Integer.parseInt(userInput);
            
            name = new String [stuCount + 1];
            grade = new double [stuCount + 1][7];
            for (i=1; i<=stuCount; i++)
            {
                System.out.print("\n\nEnter the student #"+ i +"'s name: ");
                name[i] = reader.readLine();
            }
            for (count=1;count<=stuCount;count++)
            {
                    avg = 0.00;
                    
                for(j = 1; j <= 5; j++)
                {
                    System.out.print("\n\nEnter " + name[count] + "'s test #"+ j +" score: ");
                    userInput = reader.readLine();
                    grade[count][j] = Integer.parseInt(userInput);
                    avg = avg + grade [count][j];
                }
                
                avg = avg/5;
                grade [count][6] = avg;
            }
            for (count=1; count<=stuCount;count++)
            {
                System.out.print("\n\n"+name[count] + "'s average was a " + grade[count][6] +"%.");
            } 
            for (i=1; i<= stuCount; i++)
            {
                if (highest < grade[i][6])
                {
                   highest = grade[i][6];
                   maxstu = i;
                }
                if (lowest > grade[i][6])
                {
                    lowest = grade[i][6];
                    lowstu = i;
                }
            }
            System.out.print("\n\n" + name[maxstu] +" had the highest average with a " + highest + "%.");
            System.out.print("\n\n" + name[lowstu] +" had the lowest average with a " + lowest + "%.");
        }
}