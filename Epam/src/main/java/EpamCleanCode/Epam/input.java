package EpamCleanCode.Epam;

import java.util.Scanner;

class input
{
  String materialStandard;
  int totalArea;
  input()
  {
      materialStandard=null;
      totalArea=0;
  }

  void readInput()
  {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the  Material Standard");
      this.materialStandard=sc.nextLine();
      System.out.println("Enter the Total Area in Square feet");
      this.totalArea=sc.nextInt();
  }
  String getStandard()
  {
        return  this.materialStandard;
  }
  int getTotalArea()
  {
      return this.totalArea;
  }



}