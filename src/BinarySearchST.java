public class BinarySearchST<Key extends Comparable<Key>, Value> {

    private Key[] keys;
    private Value[] values;
    private int size;

    public void put(Key key, Value val) {

        if(size > 0 && key.compareTo(keys[size - 1]) > 0) {
            keys[size] = key;
            values[size] = val;
            size++;
            return;
        }

        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            values[i] = val;
        }
        for (int j = size; j > i; j--) {
            keys[j] = keys[j - 1];
            values[j] = values[j - 1];

        }
        keys[i] = key;
        values[i] = val;
        size++;
    }

    private int rank(Key key) {

        int lo = 0, hi = size - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0) {
                hi = mid - 1;
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }
}
