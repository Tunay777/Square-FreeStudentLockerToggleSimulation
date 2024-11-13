public class Main {
    public static void main(String[] args) {
        boolean [] locker=new boolean[100];
        int [] students=new int[100];
        int index=0;
        for (int i=0;i<100;i++){
            if(isSquareFree(i)&& i%2==0){
                students[index]=i;
                index++;
            }
        }
        for (int i=0;i<100;i++){
            if (students[i]!=0){
                for (int j=0;j<100;j++) {
                    if (j % students[i] == 0) {
                        if (locker[j])
                            locker[j] = false;
                        else
                            locker[j] = true;
                    }
                }
            }
        }
        for (int i=0;i<100;i++){
            if (locker[i])
                System.out.println(i);
        }
        }

    public static boolean isSquareFree(int num) {
        for (int div = 2; num != 1; div++) {
            int count = 0;
            while (num % div == 0) {
                num = num / div;
                count++;
                if (count == 2)
                    return false;
            }
        }
        return true;
    }
    }
