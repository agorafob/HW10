public class IteratorArr {
    private int size;
    private String[] arr;
    private int cursor = -1;


    IteratorArr(int size) {
        this.size = size;
        arr = new String[this.size];
    }

    public void add(String str) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == null) {
                this.arr[i] = str;
                break;
            }
        }
    }

    private boolean hasNext() {
        return arr[cursor + 1] != null;
    }

    private void next() {
        System.out.println(arr[cursor + 1]);
    }

    public void iterator() {
        while (hasNext()) {
            next();
            cursor++;
        }
    }
}


class Main {

    public static void main(String[] args) {
        IteratorArr iter = new IteratorArr(10);
        iter.add("111");
        iter.add("222");
        iter.add("333");
        iter.iterator();

    }

}
