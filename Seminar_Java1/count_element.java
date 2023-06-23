public class count_element {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,1,1,1,0,1,1,1,1,0};
        int cont = 0;
        int maxCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 1) {
                cont++;
            } else {
                if(maxCount<cont) maxCount = cont;
                cont = 0;
            }
        }
        if(maxCount<cont) maxCount = cont;
        System.out.println(maxCount);

        for (int i : array) {
            if(i == 1) {
                cont++;
            } else {
                if(maxCount<cont) maxCount = cont;
                cont = 0;
            }
        }
        if(maxCount<cont) maxCount = cont;
        System.out.println(maxCount);
    }
}