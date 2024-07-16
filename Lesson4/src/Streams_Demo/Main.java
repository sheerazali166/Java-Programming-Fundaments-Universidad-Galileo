package Streams_Demo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public List<Integer> generateRandomList() {

      List<Integer> listInteger = new ArrayList<>();
      Random randomGenerator = new Random();

      for (int i = 0; i < 20; i++) {
          listInteger.add(randomGenerator.nextInt(255));
      }
    return listInteger;
  }

  public void oldSort() {

      List<Integer> listIntegerUnsorted = generateRandomList();
      System.out.println("Old way");
      System.out.println(listIntegerUnsorted);

      Collections.sort(listIntegerUnsorted, new Comparator<Integer>() {

          @Override
          public int compare(Integer integerOne, Integer integerTwo) {
              return integerOne.compareTo(integerTwo);
          }
      });

      System.out.println(listIntegerUnsorted);

  }

  public void lambdaSort() {

      List<Integer> listInteger = generateRandomList();
      System.out.println("Lambda way");
      System.out.println(listInteger);
      listInteger.sort((x, y) -> x.compareTo(y));
      System.out.println(listInteger);

  }

  public void oldFilter() {

      List<Integer> listIntegerUnfiltered = generateRandomList();
      System.out.println("Old way");
      List<Integer> listIntegerfiltered = new ArrayList<>();

      for (Integer integerNumber: listIntegerUnfiltered) {
          if (integerNumber > 50) {
              listIntegerfiltered.add(integerNumber);
          }
      }

      System.out.println(listIntegerfiltered);
  }

  public void lambdaFilter() {

      System.out.println("Lambda way");
      List<Integer> listIntegerUnfiltered = generateRandomList();
      List<Integer> listIntegerFiltered = listIntegerUnfiltered
              .stream().filter(x -> x > 50).collect(Collectors.toList());
      System.out.println(listIntegerFiltered);
  }

    public static void main(String[] args) {

      // Sorting Demo
      Main main = new Main();
      main.oldSort();
      main.lambdaSort();

      // Filtering Demo
      main.oldFilter();
      main.lambdaFilter();

    }
}
