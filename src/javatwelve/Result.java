package javatwelve;

import java.util.List;

public class Result {
    private Long count;
    private List<Integer> filtered;

    public Result(Long count, List<Integer> filtered) {
        this.count = count;
        this.filtered = filtered;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Integer> getFiltered() {
        return this.filtered;
    }

    public void setFiltered(List<Integer> filtered) {
        this.filtered = filtered;
    }

    @Override
    public String toString() {
        String output = String.format("[Count=%d, Filtered=%s]", count, filtered);
        return output;
    }
}
