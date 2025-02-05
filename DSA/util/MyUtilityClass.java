package util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyUtilityClass {
    private MyUtilityClass() {}

    // GCD using recursion
    public static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    public static void desmosPointsGenerator(List<Integer> arr) {
        List<String> coordinates = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            coordinates.add("(" + i + ", " + arr.get(i) + ")");
        }
        System.out.println("l = " + coordinates);
        // Use below statements to show only array values as labels on the graph
        System.out.println("Label\n${n}");
        System.out.println("n = f(" + arr + ")");
    }

    public static void print2DArray(int[][] arr) {
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void visualizeArrays() {
        // continue later;
    }
    public static void print2DArr(int[][] arr) {
        int rows = arr.length, cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int productOfInclusiveRange(int a, int b) {
        int product = 1;
        System.out.print("Product of range ["+a+", "+b+"] (inclusive): ");
        for (int i = a; i <= b; i++) {
            product *= i;
        }
        return product;
    }

    public static void printBinaryRepresentation(int p) {
        // Print base 10 & binary representation of range [1, 2^p - 1]
        double end = Math.pow(2, p) - 1;
        for (int i = 1; i <= end; i++) {
            if (i < 10) {
                System.out.print("0"+i+": ");
            } else {
                System.out.print(i+": ");
            }
            String binaryValue = Integer.toBinaryString(i);
            if (binaryValue.length() < p) {
                System.out.println(StringUtils.leftPad(binaryValue, p, "0"));
            } else {
                System.out.println(binaryValue);
            }
        }
    }

    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode generateLinkedListReturnListNode(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp = node;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        System.out.println("\nStart of Linked List");
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("End of Linked List\n");
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            // explicit constructor invocation :)
            this(val, null, null);
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public static class Pair<T1, T2> {
        private int i;
        private int j;
        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return i == pair.i && j == pair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}

