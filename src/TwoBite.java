import java.util.ArrayList;

public class TwoBite {
    public int[] ten_to_two(int number) {
        int[] result = new int[8];
        int result_lenght = result.length;
        for (int i = 0; i < result_lenght; i++) {
            result[i] = number % 2;
            number /= 2;
        }
        int temp;
        for (int i = 0; i < result_lenght / 2; i++) {
            temp = result[i];
            result[i] = result[result_lenght - 1 - i];
            result[result_lenght - 1 - i] = temp;

        }
        return result;
    }

    public ArrayList<int[]> ip_adreeas_toTwoBite(int[] input_data) {
        ArrayList<int[]> result = new ArrayList<int[]>();
        int[] temp_arr = new int[8];
        for (int i : input_data) {
            temp_arr = ten_to_two(i);
            result.add(temp_arr);
        }
        return result;
    }

    public void print_ip(ArrayList<int[]> a) {
        for (int q = 0; q < a.size(); q++) {
            for (int i : a.get(q)) {
                System.out.print(i);
            }
            if (q != (a.size() - 1)) {
                System.out.print(".");
            }
        }
        System.out.println("");
    }

    public ArrayList<int[]> operator_and(ArrayList<int[]> a, ArrayList<int[]> b) {
        ArrayList<int[]> result = new ArrayList<int[]>();
        int[] temp_arr_a;
        int[] temp_arr_b;
        for (int i = 0; i < a.size(); i++) {
            int[] temp_arr = new int[8];
            temp_arr_a = a.get(i);
            temp_arr_b = b.get(i);
            for (int j = 0; j < temp_arr.length; j++) {
                if (temp_arr_a[j] == 1 && temp_arr_b[j] == 1) {
                    temp_arr[j] = 1;
                } else {
                    temp_arr[j] = 0;
                }
            }
            result.add(temp_arr);
        }
        return result;
    }
//
    public int[] twoBite_to_ten(ArrayList<int[]> input_data) {
        int[] result = new int[input_data.size()];
        int temp = 0;
        int[] temp_array;
        for (int i = 0; i < input_data.size(); i++) {
            temp_array = input_data.get(i);
            for (int j = 0; j < temp_array.length; j++) {
                if (temp_array[j] == 1) {
                    temp += Math.pow(2,temp_array.length-j-1);
                }
            }
            result[i] = temp;
            temp = 0;
        }
        return result;

    }

}
