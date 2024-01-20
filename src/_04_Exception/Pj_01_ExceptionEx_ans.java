package _04_Exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pj_01_ExceptionEx_ans {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("실행하려는 실습의 번호를 입력하세요 (1,2,3 종료하려면 0): ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice == 2) {
                try {
                    System.out.println("배열의 크기를 입력하세요: ");
                    int size = Integer.parseInt(scanner.nextLine());

                    if (size <= 0) {
                        throw new IllegalArgumentException(" 배열 크기는 1 이상이어야 합니다 " ) ;
                    }

                    int[] array = new int[size];
                    System.out.println(size + "개의 요소를 띄어쓰기로 구분하여 입력하세요: ");
                    String[] input = scanner.nextLine().split(" ");

                    int sum = 0;
                    for (int i = 0; i < input.length; i++) {
                        array[i] = Integer.parseInt(input[i]);
                        sum += array[i];
                    }

                    System.out.println("배열 요소의 평균값은 " + (double) sum / size + "입니다.\n");

                } catch (NumberFormatException e) {
                    System.out.println("정수로 입력해주세요.\n" + e.toString());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("배열의 크기를 초과하였습니다. 배열의 크기와 입력한 요소의 개수를 확인해주세요.\n" + e.toString());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (choice == 3) {
                try {
                    System.out.println("배열의 크기를 입력하세요: ");
                    int size = Integer.parseInt(scanner.nextLine());

                    if (size <= 0) {
                        throw new IllegalArgumentException(" 배열 크기는 1 이상이어야 합니다 " ) ;
                    }

                    int[] arr = new int[size];
                    ArrayList<Integer> arrList = new ArrayList<>();
                    HashMap<Integer, ArrayList<Integer>> duplicates = new HashMap<>();
                    System.out.println(size + "개 요소를 띄어쓰기로 구분하여 입력하세요: ");
                    String[] input = scanner.nextLine().split(" ");

                    for (int i = 0; i < input.length; i++) {
                        int num = Integer.parseInt(input[i]);
                        arr[i] = num;  // If a user inputs more elements than the size, it will throw ArrayIndexOutOfBoundsException.
                        arrList.add(num);
                        if (!duplicates.containsKey(num)) {
                            duplicates.put(num, new ArrayList<>());
                        }
                        duplicates.get(num).add(num);
                    }

                    StringBuilder sb = new StringBuilder();
                    for (ArrayList<Integer> dupArr : duplicates.values()) {
                        if (dupArr.size() > 1) {
                            sb.append(dupArr).append(" ");
                        }
                    }
                    System.out.println("중복된 요소와 그 갯수를 포함한 서브 배열: " + sb.toString().trim());
                } catch (NumberFormatException e) {
                    System.out.println("정수를 입력해주세요." + e.toString());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("입력한 배열의 크기와 입력한 요소의 개수가 일치하지 않습니다." + e.toString());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }  else if (choice == 1) {
                int[] originArray = {1, 2, 3, 4};
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("인덱스" + i + ":" + originArray[i]);
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("배열 인덱싱 중 에러 발생 >>" + e.toString());
                }
            }
            else {
                System.out.println("올바른 번호를 입력해주세요.");
            }

        }
        scanner.close();
    }
}

// IntelliJ IDEA에서 Ctrl+Alt+L은 코드 서식 다시 지정, 자동 포매팅, 디버그를 위한 단축키입니다.
// Mac에서는 command(⌘) + option(⌥) + L을 눌러도 동일한 기능을 사용할 수 있습니다.

